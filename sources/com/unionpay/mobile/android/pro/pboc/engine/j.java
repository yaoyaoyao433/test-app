package com.unionpay.mobile.android.pro.pboc.engine;

import android.os.Handler;
import android.os.Message;
import com.unionpay.mobile.android.utils.k;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public final class j implements Runnable {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unionpay.mobile.android.pboctransaction.d dVar;
        com.unionpay.mobile.android.pboctransaction.d dVar2;
        boolean a;
        Handler handler;
        Handler handler2;
        Message obtainMessage;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        synchronized (this.a) {
            k.c("UPCardEngine", " se_return : 8");
            if (com.unionpay.mobile.android.model.b.bm) {
                handler4 = this.a.h;
                if (handler4 != null) {
                    handler5 = this.a.h;
                    obtainMessage = handler5.obtainMessage(8, new ArrayList());
                    handler3 = this.a.h;
                    handler3.sendMessage(obtainMessage);
                }
            } else {
                dVar = this.a.w;
                if (dVar != null) {
                    dVar2 = this.a.w;
                    ArrayList<com.unionpay.mobile.android.model.c> b = dVar2.b();
                    a = this.a.a("com.unionpay.tsmservice", 18);
                    if (!a) {
                        handler = this.a.h;
                        if (handler != null) {
                            handler2 = this.a.h;
                            obtainMessage = handler2.obtainMessage(8, b);
                            handler3 = this.a.h;
                            handler3.sendMessage(obtainMessage);
                        }
                    }
                }
            }
        }
    }
}
