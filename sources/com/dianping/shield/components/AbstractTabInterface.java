package com.dianping.shield.components;

import android.view.View;
import com.dianping.picassomodule.widget.tab.g;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface AbstractTabInterface {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnTabClickedListener {
        void onTabClicked(int i, View view);
    }

    void setOnTabClickedListener(OnTabClickedListener onTabClickedListener);

    void setSelected(int i, g gVar);

    void setTabs(String[] strArr);

    void setVisibility(int i);
}
