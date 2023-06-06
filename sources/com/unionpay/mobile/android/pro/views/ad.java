package com.unionpay.mobile.android.pro.views;

import android.os.Bundle;
import android.os.Handler;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class ad implements Runnable {
    final /* synthetic */ com.unionpay.mobile.android.pro.pboc.engine.b a;
    final /* synthetic */ com.unionpay.mobile.android.model.c b;
    final /* synthetic */ String c;
    final /* synthetic */ HashMap d;
    final /* synthetic */ y e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ad(y yVar, com.unionpay.mobile.android.pro.pboc.engine.b bVar, com.unionpay.mobile.android.model.c cVar, String str, HashMap hashMap) {
        this.e = yVar;
        this.a = bVar;
        this.b = cVar;
        this.c = str;
        this.d = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unionpay.mobile.android.model.b bVar;
        com.unionpay.mobile.android.model.b bVar2;
        Handler handler;
        Handler handler2;
        com.unionpay.mobile.android.pro.pboc.engine.b bVar3 = this.a;
        com.unionpay.mobile.android.model.c cVar = this.b;
        String str = this.c;
        bVar = this.e.a;
        HashMap<String, String> hashMap = bVar.p;
        HashMap<String, String> hashMap2 = this.d;
        bVar2 = this.e.a;
        Bundle a = bVar3.a(cVar, str, hashMap, hashMap2, bVar2.m);
        handler = this.e.D;
        handler2 = this.e.D;
        if (a == null) {
            a = null;
        }
        handler.sendMessage(handler2.obtainMessage(0, a));
    }
}
