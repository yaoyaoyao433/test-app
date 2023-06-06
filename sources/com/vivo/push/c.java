package com.vivo.push;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.common.CommonConstant;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c implements Handler.Callback {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b bVar) {
        this.a = bVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        if (message == null) {
            com.vivo.push.util.p.a("AidlManager", "handleMessage error : msg is null");
            return false;
        }
        switch (message.what) {
            case 1:
                com.vivo.push.util.p.a("AidlManager", "In connect, bind core service time out");
                atomicInteger = this.a.f;
                if (atomicInteger.get() == 2) {
                    this.a.a(1);
                    return true;
                }
                return true;
            case 2:
                atomicInteger2 = this.a.f;
                if (atomicInteger2.get() == 4) {
                    this.a.f();
                }
                this.a.a(1);
                return true;
            default:
                com.vivo.push.util.p.b("AidlManager", "unknow msg what [" + message.what + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                return true;
        }
    }
}
