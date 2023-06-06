package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.push.p;
/* loaded from: classes6.dex */
public final class q extends Handler {
    final /* synthetic */ p a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, Looper looper) {
        super(looper);
        this.a = pVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        p.b bVar = (p.b) message.obj;
        if (message.what != 0 && message.what == 1) {
            bVar.b();
        }
        super.handleMessage(message);
    }
}
