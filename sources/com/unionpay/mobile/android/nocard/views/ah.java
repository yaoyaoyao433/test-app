package com.unionpay.mobile.android.nocard.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class ah implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ af b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ah(af afVar, String str) {
        this.b = afVar;
        this.a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.a(com.unionpay.mobile.android.languages.c.bD.s, this.a);
    }
}
