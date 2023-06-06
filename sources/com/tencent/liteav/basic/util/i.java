package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class i extends Handler {
    private int a;
    private boolean b;
    private a c;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void onTimeout();
    }

    public i(Looper looper, a aVar) {
        super(looper);
        this.b = false;
        this.c = aVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.c != null) {
            this.c.onTimeout();
        }
        if (this.b) {
            sendEmptyMessageDelayed(0, this.a);
        }
    }

    public void a(int i, int i2) {
        a();
        this.a = i2;
        this.b = true;
        sendEmptyMessageDelayed(0, i);
    }

    public void a() {
        while (hasMessages(0)) {
            removeMessages(0);
        }
        this.b = false;
    }
}
