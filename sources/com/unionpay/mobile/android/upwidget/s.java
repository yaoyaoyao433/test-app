package com.unionpay.mobile.android.upwidget;

import android.view.View;
/* loaded from: classes6.dex */
public final class s implements View.OnClickListener {
    final /* synthetic */ q a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(q qVar) {
        this.a = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q.b(this.a);
    }
}
