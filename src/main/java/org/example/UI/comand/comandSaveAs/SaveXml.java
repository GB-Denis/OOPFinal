package org.example.UI.comand.comandSaveAs;
import org.example.SaveFormat;
import org.example.UI.Console;
import org.example.UI.comand.Comand;

public class SaveXml extends Comand {
    public SaveXml(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сохранить в xml.";
    }

    @Override
    public void execute() {
        getConsole().save(SaveFormat.XML);
    }
}