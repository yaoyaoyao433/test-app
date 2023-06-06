package com.unionpay.mobile.android.pro.views;

import android.content.Context;
import android.view.View;
/* loaded from: classes6.dex */
public final class e implements View.OnClickListener {
    final /* synthetic */ a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        com.unionpay.mobile.android.model.b bVar;
        com.unionpay.mobile.android.model.b bVar2;
        context = this.a.d;
        bVar = this.a.a;
        int a = com.unionpay.mobile.android.nocard.utils.c.a(context, bVar);
        this.a.m();
        this.a.m();
        if (a != com.unionpay.mobile.android.views.order.l.c.intValue()) {
            bVar2 = this.a.a;
            bVar2.aP = com.unionpay.mobile.android.views.order.l.c.intValue();
            this.a.d(2);
        }
    }
}
