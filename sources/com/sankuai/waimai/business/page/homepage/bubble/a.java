package com.sankuai.waimai.business.page.homepage.bubble;

import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface a {
    void a();

    void a(CharSequence charSequence);

    void a(int[] iArr, View view);

    void addOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener);

    void b();

    int getBigBubbleMeasuredHeight();

    int getBubbleWidth();

    int getBubbledHeight();

    View getView();

    void removeOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener);
}
