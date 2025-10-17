package com.nageshdevadiga.vyuha.agent;
import java.lang.instrument.Instrumentation;
public class AgentMain {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("Agent Initialized ....");
        Thread collector = new Thread(new MetricsCollector());
        collector.setDaemon(true);
        collector.start();
        System.out.println("Metrics Collector Started ....");
    }
}
