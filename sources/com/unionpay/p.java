package com.unionpay;

import android.app.AlertDialog;
import android.content.DialogInterface;
/* loaded from: classes6.dex */
public final class p implements DialogInterface.OnClickListener {
    final /* synthetic */ n a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(n nVar) {
        this.a = nVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AlertDialog alertDialog;
        alertDialog = this.a.a.d;
        alertDialog.dismiss();
    }
}
