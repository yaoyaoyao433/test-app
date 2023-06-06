package com.unionpay;

import android.content.DialogInterface;
/* loaded from: classes6.dex */
public final class o implements DialogInterface.OnClickListener {
    final /* synthetic */ n a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(n nVar) {
        this.a = nVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UPPayWapActivity.a(this.a.a, "cancel", (String) null);
    }
}
