package com.unionpay.mobile.android.nocard.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class as implements View.OnClickListener {
    final /* synthetic */ ao a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public as(ao aoVar) {
        this.a = aoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.i();
        if (com.unionpay.mobile.android.model.b.bm) {
            this.a.d(this.a.a.bp, this.a.a.bq);
        }
    }
}
