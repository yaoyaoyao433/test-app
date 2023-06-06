package com.unionpay.mobile.android.hce;

import android.os.Bundle;
import android.os.Handler;
/* loaded from: classes6.dex */
public final class j implements Runnable {
    final /* synthetic */ f a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(f fVar) {
        this.a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle d;
        Handler handler;
        Handler handler2;
        Handler handler3;
        int unused;
        int unused2;
        f fVar = this.a;
        str = this.a.l;
        unused = this.a.f;
        unused2 = this.a.h;
        d = fVar.d(str);
        f.k(this.a);
        handler = this.a.y;
        if (handler != null) {
            handler2 = this.a.y;
            handler3 = this.a.y;
            if (d == null) {
                d = null;
            }
            handler2.sendMessage(handler3.obtainMessage(2001, d));
        }
    }
}
