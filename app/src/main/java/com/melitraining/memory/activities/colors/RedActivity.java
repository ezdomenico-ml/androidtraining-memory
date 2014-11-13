package com.melitraining.memory.activities.colors;

import android.graphics.drawable.Drawable;

import com.melitraining.memory.R;
import com.melitraining.memory.activities.AbstractColorActivity;

/**
 * Created by ngiagnoni on 11/12/14.
 */
public class RedActivity extends AbstractColorActivity{
    @Override
    protected int getBackColor() {
        return getResources().getColor(R.color.red);
    }

    @Override
    protected Drawable getDrawable() {
        return getResources().getDrawable(R.drawable.red);
    }
}
