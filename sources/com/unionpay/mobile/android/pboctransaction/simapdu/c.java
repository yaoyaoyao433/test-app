package com.unionpay.mobile.android.pboctransaction.simapdu;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes6.dex */
public final class c implements Handler.Callback {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b bVar) {
        this.a = bVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        com.unionpay.mobile.android.pboctransaction.b bVar;
        com.unionpay.mobile.android.pboctransaction.b bVar2;
        com.unionpay.mobile.android.pboctransaction.b bVar3;
        com.unionpay.mobile.android.pboctransaction.b bVar4;
        switch (message.what) {
            case 1:
                bVar = this.a.c;
                if (bVar != null) {
                    bVar2 = this.a.c;
                    bVar2.a();
                    break;
                } else {
                    return true;
                }
            case 2:
                bVar3 = this.a.c;
                if (bVar3 != null) {
                    bVar4 = this.a.c;
                    bVar4.b();
                    break;
                } else {
                    return true;
                }
            default:
                return true;
        }
        b.b(this.a);
        return true;
    }
}
