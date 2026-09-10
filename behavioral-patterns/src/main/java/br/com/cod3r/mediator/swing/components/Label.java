package br.com.cod3r.mediator.swing.components;

import javax.swing.*;

public class Label extends JLabel {
    private static final long serialVersionUID = -6170178595314483794L;

    private final State state;

    public Label(State state) {
        super("Times Clicked: 0");
        this.state = state;
    }

    public void refresh() {
        this.setText("Times Clicked: " + state.getCounter());
    }
}
