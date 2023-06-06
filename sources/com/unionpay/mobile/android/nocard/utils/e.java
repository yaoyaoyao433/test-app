package com.unionpay.mobile.android.nocard.utils;

import android.content.Context;
/* loaded from: classes6.dex */
public final class e implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Context c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, String str2, Context context) {
        this.a = str;
        this.b = str2;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new com.unionpay.mobile.android.net.c(new com.unionpay.mobile.android.net.d(1, this.a, this.b.getBytes()), this.c).a();
    }
}
