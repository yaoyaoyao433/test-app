package com.unionpay.mobile.android.nocard.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class bk implements View.OnClickListener {
    final /* synthetic */ bi a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bk(bi biVar) {
        this.a = biVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.i();
        this.a.a.I.f = "cancel";
        this.a.j();
    }
}
