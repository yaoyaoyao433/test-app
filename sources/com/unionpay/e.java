package com.unionpay;

import android.content.Context;
import android.content.DialogInterface;
/* loaded from: classes6.dex */
public final class e implements DialogInterface.OnClickListener {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, String str, String str2, String str3, String str4, String str5) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UPPayAssistEx.a(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
