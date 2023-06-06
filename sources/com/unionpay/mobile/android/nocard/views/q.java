package com.unionpay.mobile.android.nocard.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class q implements View.OnClickListener {
    final /* synthetic */ o a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(o oVar) {
        this.a = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.unionpay.mobile.android.upwidget.a aVar;
        com.unionpay.mobile.android.upwidget.a aVar2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.q);
        sb.append("_open_user_protocol");
        o oVar = this.a;
        aVar = this.a.C;
        String d = aVar.d();
        aVar2 = this.a.C;
        oVar.a(d, aVar2.c());
    }
}
