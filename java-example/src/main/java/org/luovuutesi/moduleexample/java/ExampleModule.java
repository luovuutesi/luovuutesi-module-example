package org.luovuutesi.moduleexample.java;

import org.jetbrains.annotations.NotNull;
import org.luovuutesi.api.Module;

public class ExampleModule implements Module {
    @NotNull
    @Override
    public String getModuleId() {
        return "example-module-java";
    }

    @Override
    public void start() {
        System.out.println("Started Java Example Module!");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Java Example Module!");
    }
}
