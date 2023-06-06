package com.unionpay.mobile.android.pro.views;

import android.os.Bundle;
import android.os.Handler;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class g implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ HashMap b;
    final /* synthetic */ a c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(a aVar, String str, HashMap hashMap) {
        this.c = aVar;
        this.a = str;
        this.b = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        com.unionpay.mobile.android.model.b unused;
        a aVar = this.c;
        String str = this.a;
        unused = this.c.a;
        Bundle a = aVar.a(str, this.b);
        handler = this.c.z;
        handler2 = this.c.z;
        if (a == null) {
            a = null;
        }
        handler.sendMessage(handler2.obtainMessage(0, a));
    }
}
