package org.example.UI.comand;

import org.example.UI.Console;

public abstract class Comand implements org.example.UI.comand.Option {
    private final Console console;

    public Comand(Console console){
        this.console = console;
    }

    protected Console getConsole(){
        return console;
    }
}