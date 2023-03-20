package org.example.UI.comand.comandSaveAs;

import org.example.SaveFormat;
import org.example.UI.Console;
import org.example.UI.comand.Comand;

public class SaveTxt extends Comand {
    public SaveTxt(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сохранить в txt.";
    }

    @Override
    public void execute() {
        getConsole().save(SaveFormat.TXT);
    }
}