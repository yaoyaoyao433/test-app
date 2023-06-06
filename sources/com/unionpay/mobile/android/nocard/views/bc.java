package com.unionpay.mobile.android.nocard.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class bc implements View.OnClickListener {
    final /* synthetic */ at a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bc(at atVar) {
        this.a = atVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String s;
        this.a.i();
        this.a.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        at atVar = this.a;
        s = this.a.s();
        atVar.e(s);
    }
}
