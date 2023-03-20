package org.example.UI.comand.comandSaveAs;

import org.example.SaveFormat;
import org.example.UI.Console;
import org.example.UI.comand.Comand;

public class SaveJson extends Comand {
    public SaveJson(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сохранить в json.";
    }

    @Override
    public void execute() {
        getConsole().save(SaveFormat.JSON);
    }
}