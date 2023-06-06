package com.unionpay.mobile.android.pro.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class o implements View.OnClickListener {
    final /* synthetic */ k a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(k kVar) {
        this.a = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = (String) view.getTag();
        this.a.P = str;
        k.k(this.a);
        this.a.d(str, "");
    }
}
