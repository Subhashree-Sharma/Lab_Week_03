package com.Inventory;

class InventoryNode {
    //Create attributes for this class
    String itemName;
    int itemId;
    int quantity;
    double price;
    InventoryNode next;

    //Create constructor to set the value for global var
    public InventoryNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}