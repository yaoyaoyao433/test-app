package com.unionpay.mobile.android.pro.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class ag implements View.OnClickListener {
    final /* synthetic */ y a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ag(y yVar) {
        this.a = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.unionpay.mobile.android.widgets.m mVar;
        this.a.i();
        mVar = this.a.b;
        mVar.a(com.unionpay.mobile.android.languages.c.bD.U);
        y.f(this.a, y.C(this.a));
    }
}
