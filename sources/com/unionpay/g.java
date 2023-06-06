package com.unionpay;

import android.content.Context;
import android.content.DialogInterface;
/* loaded from: classes6.dex */
public final class g implements DialogInterface.OnClickListener {
    final /* synthetic */ Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context) {
        this.a = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UPPayAssistEx.b(this.a);
    }
}
