package com.unionpay.b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.unionpay.UPSEInfoResp;
import com.unionpay.utils.j;
/* loaded from: classes6.dex */
public final class c implements Handler.Callback {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b bVar) {
        this.a = bVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Handler handler;
        Handler handler2;
        int i = message.what;
        if (i == 1) {
            handler = this.a.i;
            handler.removeMessages(4);
            j.b("uppay", "msg error");
            b.a(this.a, message.arg1, (String) message.obj);
            return false;
        } else if (i == 4) {
            j.b("uppay", "timeout");
            b.a(this.a, message.arg1, UPSEInfoResp.ERROR_TIMEOUT);
            b.b(this.a);
            return false;
        } else if (i != 4000) {
            return false;
        } else {
            handler2 = this.a.i;
            handler2.removeMessages(4);
            b.a(this.a, (Bundle) message.obj);
            return false;
        }
    }
}
