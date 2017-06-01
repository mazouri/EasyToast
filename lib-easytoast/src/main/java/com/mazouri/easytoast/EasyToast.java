package com.mazouri.easytoast;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.DimenRes;
import android.support.annotation.StringRes;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by wangdongdong on 17-6-1.
 */

public class EasyToast {

    public static Toast makeText(Context context, CharSequence text, int duration, int gravity, @ColorInt int textColor, @DimenRes int textSize) {
        Toast result = new Toast(context);

        LayoutInflater inflate = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflate.inflate(R.layout.layout_easy_toast, null);
        TextView tv = (TextView)v.findViewById(android.R.id.message);
        tv.setText(text);

        if (textColor != 0) {
            tv.setTextColor(textColor);
        }

        if (textSize != 0) {
            tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, textSize);
        }

        //gravity
        if (gravity == Gravity.TOP) {
            result.setGravity(Gravity.TOP, 0, 0);
            result.setMargin(0, -0.1f);
        } else if (gravity == Gravity.CENTER){
            result.setGravity(Gravity.CENTER, 0, 0);
        } else {
            result.setGravity(Gravity.BOTTOM, 0, 0);
            result.setMargin(0, 0.1f);
        }

        result.setView(v);
        result.setDuration(duration);

        return result;
    }

    public static Toast makeText(Context context, CharSequence text, int duration, int gravity, @ColorInt int textColor) {
        return makeText(context, text, duration, gravity, textColor, 0);
    }

    public static Toast makeText(Context context, CharSequence text, int duration, int gravity) {
        return makeText(context, text, duration, gravity, 0);
    }

    public static Toast makeText(Context context, @StringRes int resId, int duration, int gravity) {
        return makeText(context, context.getResources().getText(resId), duration, gravity);
    }

    public static Toast makeText(Context context, CharSequence text, int duration) {
        return makeText(context, text, duration, Gravity.BOTTOM);
    }

    public static Toast makeText(Context context, @StringRes int resId, int duration) {
        return makeText(context, context.getResources().getText(resId), duration);
    }
}
