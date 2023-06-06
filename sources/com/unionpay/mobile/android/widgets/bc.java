package com.unionpay.mobile.android.widgets;

import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.ScrollView;
/* loaded from: classes6.dex */
public final class bc implements PopupWindow.OnDismissListener {
    final /* synthetic */ bb a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bc(bb bbVar) {
        this.a = bbVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ScrollView scrollView;
        ScrollView scrollView2;
        int i;
        ScrollView scrollView3;
        scrollView = this.a.g;
        if (scrollView != null) {
            scrollView2 = this.a.g;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) scrollView2.getLayoutParams();
            marginLayoutParams.bottomMargin = com.unionpay.mobile.android.global.a.b;
            i = this.a.h;
            marginLayoutParams.height = i;
            scrollView3 = this.a.g;
            scrollView3.setLayoutParams(marginLayoutParams);
        }
    }
}
