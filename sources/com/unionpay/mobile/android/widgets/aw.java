package com.unionpay.mobile.android.widgets;

import android.view.View;
import android.view.ViewTreeObserver;
/* loaded from: classes6.dex */
public final class aw implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ UPWidget a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aw(UPWidget uPWidget) {
        this.a = uPWidget;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View x;
        View x2;
        int i;
        int i2;
        com.unionpay.mobile.android.utils.k.a("uppay", "onGlobalLayout() +++");
        x = this.a.x();
        int height = x.getRootView().getHeight();
        x2 = this.a.x();
        int height2 = height - x2.getHeight();
        i = UPWidget.o;
        if (height2 <= i) {
            i2 = UPWidget.o;
            if (height2 <= i2) {
                this.a.l();
            }
        }
        com.unionpay.mobile.android.utils.k.a("uppay", "onGlobalLayout() ---");
    }
}
