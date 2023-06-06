package com.unionpay.mobile.android.pro.pboc.engine;

import android.os.Handler;
import android.os.Message;
import com.unionpay.mobile.android.utils.k;
/* loaded from: classes6.dex */
public final class f implements com.unionpay.mobile.android.pboctransaction.b {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(b bVar) {
        this.a = bVar;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.b
    public final void a() {
        com.unionpay.mobile.android.pboctransaction.samsung.f fVar;
        com.unionpay.mobile.android.pboctransaction.samsung.f fVar2;
        k.c("uppay-spay", "tsmservice  init success");
        com.unionpay.mobile.android.model.b.bn = false;
        fVar = this.a.y;
        if (fVar == null) {
            this.a.b(8);
            return;
        }
        fVar2 = this.a.y;
        if (fVar2.e()) {
            return;
        }
        com.unionpay.mobile.android.model.b.aB = false;
        this.a.b(8);
    }

    @Override // com.unionpay.mobile.android.pboctransaction.b
    public final void b() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        k.c("UPCardEngine", "mSE init failed");
        k.c("uppay-spay", "tsmservice  init fail");
        handler = this.a.h;
        if (handler != null) {
            handler2 = this.a.h;
            Message obtainMessage = handler2.obtainMessage(8, null);
            handler3 = this.a.h;
            handler3.sendMessage(obtainMessage);
        }
    }
}
