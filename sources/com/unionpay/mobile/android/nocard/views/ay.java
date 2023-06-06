package com.unionpay.mobile.android.nocard.views;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* loaded from: classes6.dex */
public final class ay implements View.OnClickListener {
    final /* synthetic */ at a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ay(at atVar) {
        this.a = atVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.unionpay.mobile.android.upviews.a aVar;
        com.unionpay.mobile.android.upwidget.a aVar2;
        com.unionpay.mobile.android.upwidget.a aVar3;
        aVar = this.a.B;
        aVar.d();
        ((InputMethodManager) this.a.d.getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.q);
        sb.append("_open_user_protocol");
        at atVar = this.a;
        aVar2 = this.a.y;
        String d = aVar2.d();
        aVar3 = this.a.y;
        atVar.a(d, aVar3.c());
    }
}
