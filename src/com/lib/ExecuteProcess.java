package com.lib;

import java.io.IOException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public final class ExecuteProcess extends RecursiveAction {
    private final String command;

    public ExecuteProcess(String command) {
        this.command = command;
    }

    @Override
    protected void compute() {
        try {
            var process = new ProcessBuilder(
                    "cmd.exe", "/c",
                    command
            ).start();

            process.waitFor();

            process.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void execute() {
        ForkJoinPool.commonPool().execute(this);
    }
}
