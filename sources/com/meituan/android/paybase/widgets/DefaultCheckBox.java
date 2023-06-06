package com.meituan.android.paybase.widgets;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DefaultCheckBox extends AppCompatCheckBox {
    public DefaultCheckBox(Context context) {
        super(context);
        setButtonDrawable(getResources().getDrawable(R.color.transparent));
        setBackgroundResource(R.drawable.mtpaysdk__toggle_checkbox);
    }

    public DefaultCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setButtonDrawable(getResources().getDrawable(R.color.transparent));
        setBackgroundResource(R.drawable.mtpaysdk__toggle_checkbox);
    }

    public DefaultCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setButtonDrawable(getResources().getDrawable(R.color.transparent));
        setBackgroundResource(R.drawable.mtpaysdk__toggle_checkbox);
    }
}
