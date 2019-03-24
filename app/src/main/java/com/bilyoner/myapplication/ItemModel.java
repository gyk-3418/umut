package com.bilyoner.myapplication;

import androidx.annotation.DrawableRes;

public class ItemModel {
    String text;
    @DrawableRes int imageResouce;
    int nextActivity;

    int firstButtonColor;
    int secondButtonColor;


    public ItemModel(String text, int imageResouce, int nextActivity) {
        this.text = text;
        this.imageResouce = imageResouce;
        this.nextActivity = nextActivity;
    }

    public ItemModel(int firstButtonColor, int secondButtonColor) {
        this.firstButtonColor = firstButtonColor;
        this.secondButtonColor = secondButtonColor;
    }
}
