package com.sankuai.meituan.android.knb.listener;

import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OnLoadingListener {
    AnimationDrawable getLoadingDrawable();

    ImageView getLoadingImageView();

    View getLoadingView(LayoutInflater layoutInflater);
}
