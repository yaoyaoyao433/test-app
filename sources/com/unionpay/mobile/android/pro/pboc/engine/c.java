package com.unionpay.mobile.android.pro.pboc.engine;

import android.os.Handler;
import android.os.Message;
import com.unionpay.mobile.android.utils.k;
/* loaded from: classes6.dex */
public final class c implements com.unionpay.mobile.android.pboctransaction.b {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b bVar) {
        this.a = bVar;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.b
    public final void a() {
        this.a.b(1);
    }

    @Override // com.unionpay.mobile.android.pboctransaction.b
    public final void b() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        handler = this.a.h;
        if (handler != null) {
            k.c("UPCardEngine", "mSDInitCallback.initFailed!!!!");
            handler2 = this.a.h;
            Message obtainMessage = handler2.obtainMessage(1, null);
            handler3 = this.a.h;
            handler3.sendMessage(obtainMessage);
        }
    }
}
