package com.unionpay.mobile.android.pro.views;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* loaded from: classes6.dex */
public final class ae implements View.OnClickListener {
    final /* synthetic */ y a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ae(y yVar) {
        this.a = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.unionpay.mobile.android.upviews.a aVar;
        Context context;
        String str;
        com.unionpay.mobile.android.upwidget.a aVar2;
        com.unionpay.mobile.android.upwidget.a aVar3;
        aVar = this.a.A;
        aVar.d();
        context = this.a.d;
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
        StringBuilder sb = new StringBuilder();
        str = this.a.q;
        sb.append(str);
        sb.append("_open_user_protocol");
        y yVar = this.a;
        aVar2 = this.a.x;
        String d = aVar2.d();
        aVar3 = this.a.x;
        yVar.a(d, aVar3.c());
    }
}
