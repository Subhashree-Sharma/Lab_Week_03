package com.UndoRedoFunctionality;

//node class representing a state of the text content
class TextStateNode {
    String content;
    TextStateNode prev;
    TextStateNode next;

    //constructor
    public TextStateNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}