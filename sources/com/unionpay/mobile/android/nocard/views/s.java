package com.unionpay.mobile.android.nocard.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class s implements View.OnClickListener {
    final /* synthetic */ o a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(o oVar) {
        this.a = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.i();
        this.a.a.I.f = "cancel";
        this.a.j();
    }
}
