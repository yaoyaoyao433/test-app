package com.meituan.android.legwork.mrn.view.mapAnchor;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OnceAnimImageView extends AppCompatImageView {
    public OnceAnimImageView(Context context) {
        this(context, null);
    }

    private OnceAnimImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public OnceAnimImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
