package com.unionpay;

import android.content.Context;
import android.content.DialogInterface;
import org.json.JSONArray;
/* loaded from: classes6.dex */
public final class f implements DialogInterface.OnClickListener {
    final /* synthetic */ Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context) {
        this.a = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        JSONArray jSONArray;
        Context context = this.a;
        jSONArray = UPPayAssistEx.W;
        UPPayAssistEx.a(context, jSONArray, UPPayAssistEx.r());
        dialogInterface.dismiss();
    }
}
