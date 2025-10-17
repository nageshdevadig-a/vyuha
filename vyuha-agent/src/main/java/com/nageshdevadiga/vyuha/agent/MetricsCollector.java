
package com.nageshdevadiga.vyuha.agent;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
public class MetricsCollector implements Runnable {
    @Override
    public void run() {
        SystemInfo systemInfo = new SystemInfo();
        CentralProcessor processor = systemInfo.getHardware().getProcessor();
        GlobalMemory memory = systemInfo.getHardware().getMemory();
        long[] prevTicks = processor.getSystemCpuLoadTicks();
        while (true) {
            try {
                double cpuLoad = processor.getSystemCpuLoadBetweenTicks(prevTicks) * 100;
                prevTicks = processor.getSystemCpuLoadTicks();
                long totalMemory = memory.getTotal();
                long availableMemory = memory.getAvailable();
                long usedMemory = totalMemory - availableMemory;

                System.out.printf("CPU Load: %.2f%%, Used Memory: %d MB, Available Memory: %d MB%n",
                        cpuLoad, usedMemory / (1024 * 1024), availableMemory / (1024 * 1024));

                Thread.sleep(5000); // Collect metrics every 5 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
