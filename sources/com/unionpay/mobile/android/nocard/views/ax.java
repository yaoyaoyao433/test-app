package com.unionpay.mobile.android.nocard.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class ax implements View.OnClickListener {
    final /* synthetic */ at a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ax(at atVar) {
        this.a = atVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (com.unionpay.mobile.android.nocard.utils.c.a(this.a.d, this.a.a) == com.unionpay.mobile.android.views.order.l.c.intValue()) {
            this.a.m();
            this.a.m();
            return;
        }
        this.a.m();
        if (this.a.a.J) {
            this.a.m();
            this.a.a.J = false;
        }
        this.a.a.aP = com.unionpay.mobile.android.views.order.l.c.intValue();
        this.a.d(2);
    }
}
