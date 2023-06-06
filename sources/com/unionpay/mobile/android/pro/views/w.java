package com.unionpay.mobile.android.pro.views;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes6.dex */
public final class w implements Handler.Callback {
    final /* synthetic */ v a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(v vVar) {
        this.a = vVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        com.unionpay.mobile.android.model.b bVar;
        com.unionpay.mobile.android.model.b bVar2;
        com.unionpay.mobile.android.model.b bVar3;
        switch (message.what) {
            case 2000:
                if (message.obj == null) {
                    v vVar = this.a;
                    bVar = this.a.a;
                    vVar.a(bVar.ap, false);
                    return true;
                }
                com.unionpay.mobile.android.model.a aVar = (com.unionpay.mobile.android.model.a) message.obj;
                if (aVar != null) {
                    this.a.a(aVar);
                    return true;
                }
                return true;
            case 2001:
                if ("1003100020".equalsIgnoreCase((String) message.obj)) {
                    if (com.unionpay.mobile.android.model.b.bm) {
                        this.a.s();
                        return true;
                    }
                    return true;
                } else if (com.unionpay.mobile.android.model.b.bm) {
                    v vVar2 = this.a;
                    bVar3 = this.a.a;
                    vVar2.e(bVar3.ap, "fail");
                    return true;
                } else {
                    v vVar3 = this.a;
                    bVar2 = this.a.a;
                    vVar3.a(bVar2.ap, false);
                    return true;
                }
            default:
                return true;
        }
    }
}
