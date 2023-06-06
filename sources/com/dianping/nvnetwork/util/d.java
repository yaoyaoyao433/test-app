package com.dianping.nvnetwork.util;

import android.os.HandlerThread;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static AtomicBoolean b = new AtomicBoolean(true);
    private static AtomicReference<HandlerThread> c = new AtomicReference<>();

    public static synchronized void a() {
        synchronized (d.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9e0d6d47dc4aa5ab75b010072c3cc03", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9e0d6d47dc4aa5ab75b010072c3cc03");
                return;
            }
            if (c.get() == null) {
                HandlerThread handlerThread = new HandlerThread("daemon");
                if (b.get()) {
                    b.set(false);
                    handlerThread.start();
                    c.set(handlerThread);
                }
            }
        }
    }

    public static Looper b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22bd797d651d9952b1cab7ce7cfebad3", 6917529027641081856L)) {
            return (Looper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22bd797d651d9952b1cab7ce7cfebad3");
        }
        if (c.get() == null) {
            a();
        }
        HandlerThread handlerThread = c.get();
        return handlerThread == null ? Looper.getMainLooper() : handlerThread.getLooper();
    }
}
