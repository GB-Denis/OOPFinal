package org.example.UI.comand;

import org.example.UI.Console;

public class AddNote extends Comand {

    public AddNote(Console console) {
        super(console);
    }
    @Override
    public String description() {
        return "Добавить Запись";
    }

    @Override
    public void execute() {
        getConsole().setAddOrDell(true);
        getConsole().addOrDellContact();
    }
}