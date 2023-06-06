package com.unionpay.mobile.android.pro.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class d implements View.OnClickListener {
    final /* synthetic */ a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = (String) view.getTag();
        this.a.E = str;
        a.i(this.a);
        this.a.e(str, "");
    }
}
