package com.unionpay.mobile.android.pro.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class ab implements View.OnClickListener {
    final /* synthetic */ y a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab(y yVar) {
        this.a = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = (String) view.getTag();
        this.a.B = str;
        y.m(this.a);
        this.a.d(str, "");
    }
}
