package org.example.UI;

import org.example.Presenter;

public interface View {
    void setPresenter(Presenter presenter);
    void start();
    void print(String text);
}