package com.unionpay.mobile.android.nocard.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class i implements View.OnClickListener {
    final /* synthetic */ g a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(g gVar) {
        this.a = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.unionpay.mobile.android.upviews.a aVar;
        com.unionpay.mobile.android.upwidget.a aVar2;
        com.unionpay.mobile.android.upwidget.a aVar3;
        aVar = this.a.v;
        aVar.d();
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.q);
        sb.append("_open_user_protocol");
        g gVar = this.a;
        aVar2 = this.a.t;
        String d = aVar2.d();
        aVar3 = this.a.t;
        gVar.a(d, aVar3.c());
    }
}
