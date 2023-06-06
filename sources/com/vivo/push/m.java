package com.vivo.push;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class m {
    private static final Handler a = new Handler(Looper.getMainLooper());
    private static final HandlerThread b;
    private static final Handler c;

    static {
        HandlerThread handlerThread = new HandlerThread("push_client_thread");
        b = handlerThread;
        handlerThread.start();
        c = new n(b.getLooper());
    }

    public static void a(l lVar) {
        if (lVar == null) {
            com.vivo.push.util.p.a("PushClientThread", "client thread error, task is null!");
            return;
        }
        int a2 = lVar.a();
        Message message = new Message();
        message.what = a2;
        message.obj = lVar;
        c.sendMessageDelayed(message, 0L);
    }

    public static void a(Runnable runnable) {
        c.removeCallbacks(runnable);
        c.postDelayed(runnable, 15000L);
    }

    public static void b(Runnable runnable) {
        a.post(runnable);
    }

    public static void c(Runnable runnable) {
        if (c != null) {
            c.post(runnable);
        }
    }
}
