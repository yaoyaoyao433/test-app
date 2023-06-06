package com.sankuai.xm.imui.common.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IBannerAdapter {
    boolean isOverlay();

    View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    void onDestroy();
}
