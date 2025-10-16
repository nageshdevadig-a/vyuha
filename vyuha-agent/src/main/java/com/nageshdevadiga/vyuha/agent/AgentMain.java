package com.nageshdevadiga.vyuha.agent;
import java.lang.instrument.Instrumentation;
public class AgentMain {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("Agent starting ....");
        MetricsCollector collector = new MetricsCollector();
        collector.setDaemon(true);
        collector.start();
    }
}
