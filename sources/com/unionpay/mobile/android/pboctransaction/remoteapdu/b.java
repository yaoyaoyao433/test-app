package com.unionpay.mobile.android.pboctransaction.remoteapdu;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes6.dex */
public final class b implements Handler.Callback {
    final /* synthetic */ a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.a = aVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 3000 && this.a.a != null) {
            this.a.a.b();
            return false;
        }
        return false;
    }
}
