package org.example.UI;

import org.example.UI.comand.AddNote;
import org.example.UI.comand.DellNote;
import org.example.UI.comand.End;
import org.example.UI.comand.Option;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private List<Option> commands;

    public Menu(Option ...options){
        commands = new ArrayList<>(Arrays.asList(options));
    }

    public boolean execute(int num){
        if (num < commands.size() && num >= 0){
            commands.get(num).execute();
            return true;
        }
        return false;
    }
    public String printMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i).append(": ");
            stringBuilder.append(commands.get(i).description()).append("\n");
        }
        return stringBuilder.toString();
    }

}