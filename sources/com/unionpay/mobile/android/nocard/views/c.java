package com.unionpay.mobile.android.nocard.views;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
/* loaded from: classes6.dex */
public final class c implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b bVar) {
        this.a = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        linearLayout = this.a.r;
        linearLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        b bVar = this.a;
        linearLayout2 = this.a.r;
        bVar.u = linearLayout2.getMeasuredHeight();
        b bVar2 = this.a;
        linearLayout3 = this.a.r;
        bVar2.v = linearLayout3.getTop();
        return true;
    }
}
