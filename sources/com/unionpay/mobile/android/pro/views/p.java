package com.unionpay.mobile.android.pro.views;

import android.content.Context;
import android.view.View;
/* loaded from: classes6.dex */
public final class p implements View.OnClickListener {
    final /* synthetic */ k a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(k kVar) {
        this.a = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        com.unionpay.mobile.android.model.b bVar;
        com.unionpay.mobile.android.model.b bVar2;
        com.unionpay.mobile.android.model.b bVar3;
        com.unionpay.mobile.android.model.b bVar4;
        context = this.a.d;
        bVar = this.a.a;
        if (com.unionpay.mobile.android.nocard.utils.c.a(context, bVar) == com.unionpay.mobile.android.views.order.l.c.intValue()) {
            this.a.m();
            this.a.m();
            return;
        }
        this.a.m();
        bVar2 = this.a.a;
        if (bVar2.J) {
            this.a.m();
            bVar4 = this.a.a;
            bVar4.J = false;
        }
        bVar3 = this.a.a;
        bVar3.aP = com.unionpay.mobile.android.views.order.l.c.intValue();
        this.a.d(2);
    }
}
