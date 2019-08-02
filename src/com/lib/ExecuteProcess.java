package com.lib;

import java.io.IOException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public final class ExecuteProcess extends RecursiveAction {
    private final String[] command;

    public ExecuteProcess(String... command) {
        this.command = command;
    }

    @Override
    protected void compute() {
        System.out.println("compute");
        try {
//            StringBuilder commandString = new StringBuilder();

//            for (String string : command)
//                commandString.append(string);

//            System.out.println(" - process ID - " + commandString);
            System.out.println("process");

            var process = new ProcessBuilder(command).start();

            process.waitFor();

            process.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void execute() {
        System.out.println("Working");
        ForkJoinPool.commonPool().execute(this);
    }
}
