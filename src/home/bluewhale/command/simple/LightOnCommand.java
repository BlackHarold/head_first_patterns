package home.bluewhale.command.simple;

import home.bluewhale.command.Command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();

    }
}
