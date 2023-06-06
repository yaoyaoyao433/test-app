package com.unionpay.mobile.android.nocard.views;

import android.view.View;
/* loaded from: classes6.dex */
public final class d implements View.OnClickListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(b bVar, boolean z) {
        this.b = bVar;
        this.a = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.i();
        if (this.a) {
            this.b.j();
        }
    }
}
