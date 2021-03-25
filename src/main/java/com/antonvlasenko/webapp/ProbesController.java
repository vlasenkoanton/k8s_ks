package com.antonvlasenko.webapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/probes")
public class ProbesController {

    private final Map<ProbeType, Boolean> probeState = new ConcurrentHashMap<>();

    @GetMapping("readiness")
    public ResponseEntity<String> readiness() {
        return getProbeState(ProbeType.READINESS)
                ? ResponseEntity.ok("ok")
                : ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("unavailable");
    }

    @GetMapping("switch")
    public void switchProbeState(@RequestParam ProbeType type) {
        Boolean currentState = getProbeState(type);
        probeState.put(type, !currentState);
    }

    private Boolean getProbeState(ProbeType type) {
        return probeState.getOrDefault(type, true);
    }

    private enum ProbeType {
        READINESS, LIVENESS
    }
}
