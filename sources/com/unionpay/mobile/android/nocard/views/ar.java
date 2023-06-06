package com.unionpay.mobile.android.nocard.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class ar implements View.OnClickListener {
    final /* synthetic */ ao a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ar(ao aoVar) {
        this.a = aoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.i();
        this.a.a.I.f = "cancel";
        this.a.u();
        this.a.j();
    }
}
