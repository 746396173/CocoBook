package com.thmub.cocobook.model.bean;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

import com.thmub.cocobook.App;

/**
 * Created by zhouas666 on 18-1-23.
 */

public class SectionBean {
    private String name;
    private int drawableId;

    public SectionBean(String name, @DrawableRes int drawableId){
        this.name = name;
        this.drawableId = drawableId;
    }

    public SectionBean(@StringRes int strRes, @DrawableRes int drawableId){
        this.name = App.getContext()
                .getString(strRes);

        this.drawableId = drawableId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }
}
