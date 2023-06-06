package com.dianping.shield.layoutcontrol;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface IZViewContainer {
    void addView(View view, ViewGroup.LayoutParams layoutParams, int i);

    void forceMeasure();

    void setDrawViewForeground(IDrawChildViewForeground iDrawChildViewForeground);

    void setPrivateHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener);

    void updateView(View view, int i);
}
