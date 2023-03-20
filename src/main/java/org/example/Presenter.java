package org.example;

import org.example.Model.Model;
import org.example.UI.View;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View viem) {
        this.model = model;
        this.view = viem;
        viem.setPresenter(this);
        model.setPresenter(this);
    }
    public void start(){
        view.start();
    }

    public void addNote(String[] contact) {
        model.addContact(contact);
    }
    public void dellNote(String[] contact) {
        model.dellContact(contact);
    }
    public void save(SaveFormat saveFormat){
        model.saveAs(saveFormat);
    }
    public void outRes(String text){
        view.print(text);
    }
}