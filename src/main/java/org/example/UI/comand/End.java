package org.example.UI.comand;

import org.example.UI.Console;

public class End extends Comand{

    public End(Console console) {
        super(console);
    }
    @Override
    public String description() {
        return "Выход";
    }

    @Override
    public void execute() {
        getConsole().end();
    }
}