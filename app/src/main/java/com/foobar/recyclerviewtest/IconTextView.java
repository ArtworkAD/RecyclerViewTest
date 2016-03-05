package com.foobar.recyclerviewtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.TextView;

/**
 * TextView that has fontawesome as typeface.
 */
public class IconTextView extends TextView {

    boolean rotate = false;

    public IconTextView(Context context) {
        super(context);
    }

    public IconTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public IconTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * Start rotate animation.
     * @param rotate boolean
     */
    public void setRotate(boolean rotate) {
        this.rotate = rotate;
        if (rotate) {
            rotateInfinite();
        }
    }

    private void rotateInfinite() {
        Animation anim = new RotateAnimation(0.0f, 360.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
                0.5f);
        anim.setDuration(1000);
        anim.setRepeatMode(Animation.INFINITE);
        anim.setRepeatCount(Animation.INFINITE);
        anim.setInterpolator(new LinearInterpolator());
        startAnimation(anim);
    }
}