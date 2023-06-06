package com.unionpay.mobile.android.pro.pboc.engine;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes6.dex */
public final class e implements com.unionpay.mobile.android.pboctransaction.b {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(b bVar) {
        this.a = bVar;
    }

    @Override // com.unionpay.mobile.android.pboctransaction.b
    public final void a() {
        this.a.b(4);
    }

    @Override // com.unionpay.mobile.android.pboctransaction.b
    public final void b() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        handler = this.a.h;
        if (handler != null) {
            handler2 = this.a.h;
            Message obtainMessage = handler2.obtainMessage(4, null);
            handler3 = this.a.h;
            handler3.sendMessage(obtainMessage);
        }
    }
}
