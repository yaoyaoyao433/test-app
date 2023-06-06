package com.unionpay.mobile.android.nocard.views;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* loaded from: classes6.dex */
public final class am implements View.OnClickListener {
    final /* synthetic */ ak a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public am(ak akVar) {
        this.a = akVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.unionpay.mobile.android.upviews.a aVar;
        com.unionpay.mobile.android.upwidget.a aVar2;
        com.unionpay.mobile.android.upwidget.a aVar3;
        aVar = this.a.v;
        aVar.d();
        ((InputMethodManager) this.a.d.getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.q);
        sb.append("_open_user_protocol");
        ak akVar = this.a;
        aVar2 = this.a.t;
        String d = aVar2.d();
        aVar3 = this.a.t;
        akVar.a(d, aVar3.c());
    }
}
