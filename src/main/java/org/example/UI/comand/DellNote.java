package org.example.UI.comand;

import org.example.UI.Console;

public class DellNote extends Comand {
    public DellNote(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Удалить запись";
    }

    @Override
    public void execute() {
        getConsole().setAddOrDell(false);
        getConsole().addOrDellContact();
    }
}