package com.unionpay.mobile.android.hce;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.vivo.push.PushClientConstants;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes6.dex */
public final class g implements Handler.Callback {
    final /* synthetic */ f a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(f fVar) {
        this.a = fVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3;
        ConcurrentHashMap concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5;
        ConcurrentHashMap concurrentHashMap6;
        switch (message.what) {
            case 2001:
                f.a(this.a);
                this.a.b();
                return false;
            case 2002:
                str = (String) message.obj;
                break;
            case 2003:
                Bundle bundle = (Bundle) message.obj;
                if (bundle != null) {
                    String string = bundle.getString(PushClientConstants.TAG_PKG_NAME);
                    boolean z = bundle.getBoolean("success");
                    String string2 = bundle.getString("result");
                    String string3 = bundle.getString("reserved");
                    com.unionpay.mobile.android.utils.k.c("yitong", "result: ".concat(String.valueOf(string2)));
                    concurrentHashMap = this.a.u;
                    d dVar = (d) concurrentHashMap.get(string);
                    if (dVar == null) {
                        dVar = new d(string);
                    }
                    if (z) {
                        dVar.a(string2);
                        dVar.b(string3);
                    }
                    dVar.e();
                    concurrentHashMap2 = this.a.u;
                    concurrentHashMap2.put(string, dVar);
                    f.a(this.a, string);
                    return false;
                }
                return false;
            case 2004:
            default:
                return false;
            case 2006:
                Object obj = message.obj;
            case 2005:
                str = (String) message.obj;
                concurrentHashMap3 = this.a.u;
                d dVar2 = (d) concurrentHashMap3.get(str);
                concurrentHashMap4 = this.a.v;
                l lVar = (l) concurrentHashMap4.get(str);
                dVar2.f();
                concurrentHashMap5 = this.a.u;
                concurrentHashMap5.put(str, dVar2);
                lVar.e();
                concurrentHashMap6 = this.a.v;
                concurrentHashMap6.put(str, lVar);
                break;
        }
        f.a(this.a, str);
        return false;
    }
}
