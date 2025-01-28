package com.UndoRedoFunctionality;

public class UndoRedoFunctionality {

    //Create main method to control the flow of execution
    public static void main(String[] args) {
        UndoRedoManager manager = new UndoRedoManager(10);

        manager.addState("State 1: Hello");
        manager.addState("State 2: Hello World");
        manager.addState("State 3: Hello World!");

        // Should display "State 3: Hello World!"
        manager.displayCurrentState();

        manager.undo();
        manager.displayCurrentState();

        manager.undo();
        manager.displayCurrentState();

        manager.redo();
        manager.displayCurrentState();

        manager.redo();
        manager.displayCurrentState();

        manager.undo();
        // Adds a new state, discards redo history
        manager.addState("State 4: New Content");
        manager.displayCurrentState();
    }
}
