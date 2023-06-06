package com.unionpay.mobile.android.widgets;

import android.view.View;
/* loaded from: classes6.dex */
public final class s implements View.OnClickListener {
    final /* synthetic */ p a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(p pVar) {
        this.a = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p.b(this.a).show();
    }
}
