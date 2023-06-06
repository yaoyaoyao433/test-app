package com.dianping.agentsdk.framework;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface af {
    int getRowCount(int i);

    int getSectionCount();

    int getViewType(int i, int i2);

    View onCreateView(ViewGroup viewGroup, int i);

    void updateView(View view, int i, int i2, ViewGroup viewGroup);
}
