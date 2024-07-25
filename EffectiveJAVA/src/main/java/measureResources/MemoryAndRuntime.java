package measureResources;

import c2Objects.avoidUnnecessaryObjects.PreferPrimitives;

public class MemoryAndRuntime {

    public static void main(String[] args) {
        // Record the start time
        long startTime = System.nanoTime();

        // Perform some operations
        performOperations();

        // Record the end time
        long endTime = System.nanoTime();

        // Calculate the runtime
        long duration = endTime - startTime;
        System.out.println("Execution time : " + duration+" nanoseconds");
        System.out.println("Execution time : " + (duration / 1_000_000)+" milliseconds");

        // Get the runtime instance
        Runtime runtime = Runtime.getRuntime();

        // Run the garbage collector to get a more accurate measurement
        runtime.gc();

        // Calculate the used memory
        long usedMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Used memory in bytes: " + usedMemory);
        System.out.println("Used memory in kilobytes: " + (usedMemory / 1024));
        System.out.println("Used memory in megabytes: " + (usedMemory / (1024 * 1024)));
    }

    //Enter your operations here
    private static void performOperations() {
        PreferPrimitives object = new PreferPrimitives();
        object.sum();
        }
    }


