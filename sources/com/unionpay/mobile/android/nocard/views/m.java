package com.unionpay.mobile.android.nocard.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class m implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ l b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(l lVar, String str) {
        this.b = lVar;
        this.a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.c(this.a);
    }
}
