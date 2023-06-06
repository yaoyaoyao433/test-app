package com.meituan.roodesign.widgets.rate;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatRatingBar;
import android.util.AttributeSet;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooRatingBar extends AppCompatRatingBar {
    public RooRatingBar(Context context) {
        this(context, null);
    }

    public RooRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.rooRatingBarStyle);
    }

    public RooRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
