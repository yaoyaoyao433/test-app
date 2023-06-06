package com.unionpay;

import android.app.AlertDialog;
import android.view.View;
/* loaded from: classes6.dex */
public final class n implements View.OnClickListener {
    final /* synthetic */ UPPayWapActivity a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
        this.a.d = builder.create();
        builder.setMessage(com.unionpay.utils.k.a().a);
        builder.setTitle(com.unionpay.utils.k.a().d);
        builder.setPositiveButton(com.unionpay.utils.k.a().b, new o(this));
        builder.setNegativeButton(com.unionpay.utils.k.a().c, new p(this));
        builder.create().show();
    }
}
