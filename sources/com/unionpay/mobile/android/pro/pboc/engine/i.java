package com.unionpay.mobile.android.pro.pboc.engine;

import android.os.Handler;
import android.os.Message;
import com.unionpay.mobile.android.utils.k;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public final class i implements Runnable {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unionpay.mobile.android.pboctransaction.d dVar;
        Handler handler;
        Handler handler2;
        Handler handler3;
        synchronized (this.a) {
            k.c("UPCardEngine", " ic_return : 4");
            dVar = this.a.t;
            ArrayList<com.unionpay.mobile.android.model.c> b = dVar.b();
            handler = this.a.h;
            if (handler != null) {
                handler2 = this.a.h;
                Message obtainMessage = handler2.obtainMessage(4, b);
                handler3 = this.a.h;
                handler3.sendMessage(obtainMessage);
            }
        }
    }
}
