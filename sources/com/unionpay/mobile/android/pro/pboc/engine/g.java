package com.unionpay.mobile.android.pro.pboc.engine;

import android.os.Handler;
import android.os.Message;
import com.unionpay.mobile.android.utils.k;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public final class g implements Runnable {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unionpay.mobile.android.pboctransaction.d dVar;
        Handler handler;
        Handler handler2;
        Handler handler3;
        k.c("UPCardEngine", " sd_return : 1");
        dVar = this.a.n;
        ArrayList<com.unionpay.mobile.android.model.c> b = dVar.b();
        handler = this.a.h;
        if (handler != null) {
            handler2 = this.a.h;
            Message obtainMessage = handler2.obtainMessage(1, b);
            handler3 = this.a.h;
            handler3.sendMessage(obtainMessage);
        }
    }
}
