package com.coloros.ocs.base.common.api;

import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public class i extends com.coloros.ocs.base.common.b {
    f a;
    e b;
    private final String c;
    private h d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Looper looper, h hVar) {
        super(looper);
        this.c = i.class.getSimpleName();
        this.d = hVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        com.coloros.ocs.base.a.a.b(this.c, "business handler what ".concat(String.valueOf(i)));
        switch (i) {
            case 100:
                if (this.a != null) {
                    this.a.onConnectionSucceed();
                }
                Message obtain = Message.obtain();
                obtain.what = 5;
                this.d.sendMessage(obtain);
                return;
            case 101:
                int i2 = message.arg1;
                if (this.b != null) {
                    new com.coloros.ocs.base.common.a(i2);
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = 5;
                this.d.sendMessage(obtain2);
                return;
            default:
                return;
        }
    }
}
