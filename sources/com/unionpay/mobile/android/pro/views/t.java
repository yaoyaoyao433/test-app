package com.unionpay.mobile.android.pro.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class t implements View.OnClickListener {
    final /* synthetic */ k a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(k kVar) {
        this.a = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.unionpay.mobile.android.model.b bVar;
        this.a.i();
        bVar = this.a.a;
        bVar.I.f = "cancel";
        this.a.j();
    }
}
