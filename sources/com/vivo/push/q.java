package com.vivo.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class q {
    protected Context a;
    protected Handler b;
    private final Object c = new Object();

    public abstract void b(Message message);

    public q() {
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 1);
        handlerThread.start();
        this.b = new a(handlerThread.getLooper());
    }

    public final void a(Context context) {
        this.a = context;
    }

    public final void a(Message message) {
        synchronized (this.c) {
            if (this.b == null) {
                String simpleName = getClass().getSimpleName();
                com.vivo.push.util.p.e(simpleName, ("Dead worker dropping a message: " + message.what) + " (Thread " + Thread.currentThread().getId() + CommonConstant.Symbol.BRACKET_RIGHT);
            } else {
                this.b.sendMessage(message);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            q.this.b(message);
        }
    }
}
