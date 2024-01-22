package com.example.cardviewday_20;

public class Item {

    int itemImg;

    String itemName;

    public Item(int itemImg, String itemName){
        this.itemImg = itemImg;
        this.itemName = itemName;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
