package com.unionpay.mobile.android.widgets;

import android.view.View;
/* loaded from: classes6.dex */
public final class j implements View.OnClickListener {
    final /* synthetic */ g a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(g gVar) {
        this.a = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g.a(this.a, view);
    }
}
