package com.dianping.nvtunnelkit.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.dianping.nvtunnelkit.core.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final String d = com.dianping.nvtunnelkit.logger.a.a("HandlerThreadPool");
    public final h<c> b;
    public boolean c;

    private d(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18907611c5e43667b60954298894dd1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18907611c5e43667b60954298894dd1c");
            return;
        }
        this.c = false;
        this.c = z;
        this.b = new h<c>(i) { // from class: com.dianping.nvtunnelkit.core.d.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvtunnelkit.core.h
            public final /* synthetic */ c a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f145970a0484f174701eb7b9555bc1c", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f145970a0484f174701eb7b9555bc1c") : new c("Connection-Work-Thread");
            }
        };
    }

    public final b a(Handler.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02d61e5777a7904b0f63df631fb9794b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02d61e5777a7904b0f63df631fb9794b");
        }
        if (this.c) {
            return new b(this.b.c(), callback);
        }
        return new b(this.b.b(), callback);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c extends HandlerThread implements h.a {
        public static ChangeQuickRedirect a;
        public volatile boolean b;

        private c(String str) {
            super(str);
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ed37e92f1105a327bef3908c0d09c19", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ed37e92f1105a327bef3908c0d09c19");
            }
        }

        @Override // com.dianping.nvtunnelkit.core.h.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65582dfc1467d644c0e1e0655424f071", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65582dfc1467d644c0e1e0655424f071");
            } else {
                start();
            }
        }

        @Override // com.dianping.nvtunnelkit.core.h.a
        public final void a(boolean z) {
            this.b = z;
        }

        @Override // com.dianping.nvtunnelkit.core.h.a
        public final boolean b() {
            return this.b;
        }

        @Override // com.dianping.nvtunnelkit.core.h.a
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54de086fc38731663c174a8f9db73e2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54de086fc38731663c174a8f9db73e2e");
            } else {
                quitSafely();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends Handler {
        public static ChangeQuickRedirect a;
        public final c b;
        public final AtomicBoolean c;

        public static /* synthetic */ void a(b bVar) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "57179808fd9968996c74af72d53f91f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "57179808fd9968996c74af72d53f91f4");
                return;
            }
            bVar.c.set(true);
            bVar.removeCallbacksAndMessages(null);
        }

        private b(c cVar, Handler.Callback callback) {
            super(cVar.getLooper(), callback);
            Object[] objArr = {cVar, callback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f8b402302c2866e547a347a99d159f7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f8b402302c2866e547a347a99d159f7");
                return;
            }
            this.c = new AtomicBoolean(false);
            this.b = cVar;
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            Object[] objArr = {message, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f8ec9a14aae785864038a500e67802e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f8ec9a14aae785864038a500e67802e")).booleanValue();
            }
            if (this.c.get()) {
                return false;
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private static final Map<String, d> b = new HashMap();

        public static synchronized void a(String str, int i) {
            synchronized (a.class) {
                Object[] objArr = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46636940f7470dbdce32feb5c75d79a0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46636940f7470dbdce32feb5c75d79a0");
                } else {
                    a(str, i, false);
                }
            }
        }

        public static synchronized void a(String str, int i, boolean z) {
            synchronized (a.class) {
                Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d53c5e8a3bd098c998156b3debfbb19", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d53c5e8a3bd098c998156b3debfbb19");
                } else if (str == null) {
                    throw new IllegalArgumentException("HandlerThreadPool key can not be null.");
                } else {
                    if (!b.containsKey(str)) {
                        b.put(str, new d(i, z));
                    }
                }
            }
        }

        public static d a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23263c6ad87c77ac4fe5f8b53e4d8fbd", RobustBitConfig.DEFAULT_VALUE)) {
                return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23263c6ad87c77ac4fe5f8b53e4d8fbd");
            }
            if (str == null) {
                return null;
            }
            if (b.get(str) == null) {
                a(str, 2);
            }
            return b.get(str);
        }
    }
}
