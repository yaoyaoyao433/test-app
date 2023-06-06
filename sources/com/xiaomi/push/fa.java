package com.xiaomi.push;

import android.os.SystemClock;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.ew;
import com.xiaomi.push.ey;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ag;
import java.net.UnknownHostException;
import java.util.Hashtable;
/* loaded from: classes6.dex */
public final class fa {
    private static final int a = eq.PING_RTT.af;
    private static long b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class a {
        static Hashtable<Integer, Long> a = new Hashtable<>();
    }

    public static void a() {
        if (b == 0 || SystemClock.elapsedRealtime() - b > 7200000) {
            b = SystemClock.elapsedRealtime();
            a(0, a);
        }
    }

    public static synchronized void a(int i, int i2) {
        synchronized (fa.class) {
            if (i2 >= 16777215) {
                com.xiaomi.channel.commonutils.logger.c.d("stats key should less than 16777215");
                return;
            }
            a.a.put(Integer.valueOf(i2 | 0), Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void b() {
        a(0, a, null, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Throwable] */
    public static void a(String str, Exception exc) {
        eq eqVar;
        er c;
        Throwable cause;
        try {
            ew.a(exc);
            boolean z = exc instanceof fy;
            Exception exc2 = exc;
            if (z) {
                Throwable th = ((fy) exc).a;
                exc2 = exc;
                if (th != null) {
                    exc2 = ((fy) exc).a;
                }
            }
            ew.a aVar = new ew.a();
            String message = exc2.getMessage();
            if (exc2.getCause() != null) {
                message = exc2.getCause().getMessage();
            }
            int a2 = fp.a(exc2);
            String str2 = exc2.getClass().getSimpleName() + CommonConstant.Symbol.COLON + message;
            if (a2 != 0) {
                aVar.a = eq.a(eq.CONN_SUCCESS.af + a2);
                if (aVar.a == eq.CONN_BOSH_ERR && (cause = exc2.getCause()) != null && (cause instanceof UnknownHostException)) {
                    eqVar = eq.CONN_BOSH_UNKNOWNHOST;
                }
                if (aVar.a != eq.CONN_TCP_ERR_OTHER || aVar.a == eq.CONN_XMPP_ERR || aVar.a == eq.CONN_BOSH_ERR) {
                    aVar.b = str2;
                }
                c = ey.a.a.c();
                c.a(aVar.a.af);
                c.g = aVar.b;
                c.e = str;
                if (ey.a() != null && ey.a().a != null) {
                    c.c(al.b(ey.a().a) ? 1 : 0);
                }
                ey.a.a.a(c);
            }
            eqVar = eq.CONN_XMPP_ERR;
            aVar.a = eqVar;
            if (aVar.a != eq.CONN_TCP_ERR_OTHER) {
            }
            aVar.b = str2;
            c = ey.a.a.c();
            c.a(aVar.a.af);
            c.g = aVar.b;
            c.e = str;
            if (ey.a() != null) {
                c.c(al.b(ey.a().a) ? 1 : 0);
            }
            ey.a.a.a(c);
        } catch (NullPointerException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Throwable] */
    public static void b(String str, Exception exc) {
        eq eqVar;
        er c;
        try {
            ew.a(exc);
            boolean z = exc instanceof fy;
            Exception exc2 = exc;
            if (z) {
                Throwable th = ((fy) exc).a;
                exc2 = exc;
                if (th != null) {
                    exc2 = ((fy) exc).a;
                }
            }
            ew.a aVar = new ew.a();
            String message = exc2.getMessage();
            int a2 = fp.a(exc2);
            String str2 = exc2.getClass().getSimpleName() + CommonConstant.Symbol.COLON + message;
            if (a2 == 105) {
                eqVar = eq.CHANNEL_TCP_READTIMEOUT;
            } else if (a2 == 199) {
                eqVar = eq.CHANNEL_TCP_ERR;
            } else if (a2 == 499) {
                aVar.a = eq.CHANNEL_BOSH_EXCEPTION;
                if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                    eqVar = eq.CHANNEL_BOSH_ITEMNOTFIND;
                }
                if (aVar.a != eq.CHANNEL_TCP_ERR || aVar.a == eq.CHANNEL_XMPPEXCEPTION || aVar.a == eq.CHANNEL_BOSH_EXCEPTION) {
                    aVar.b = str2;
                }
                c = ey.a.a.c();
                c.a(aVar.a.af);
                c.g = aVar.b;
                c.e = str;
                if (ey.a() != null && ey.a().a != null) {
                    c.c(al.b(ey.a().a) ? 1 : 0);
                }
                ey.a.a.a(c);
            } else {
                switch (a2) {
                    case 109:
                        eqVar = eq.CHANNEL_TCP_CONNRESET;
                        break;
                    case 110:
                        eqVar = eq.CHANNEL_TCP_BROKEN_PIPE;
                        break;
                    default:
                        eqVar = eq.CHANNEL_XMPPEXCEPTION;
                        break;
                }
            }
            aVar.a = eqVar;
            if (aVar.a != eq.CHANNEL_TCP_ERR) {
            }
            aVar.b = str2;
            c = ey.a.a.c();
            c.a(aVar.a.af);
            c.g = aVar.b;
            c.e = str;
            if (ey.a() != null) {
                c.c(al.b(ey.a().a) ? 1 : 0);
            }
            ey.a.a.a(c);
        } catch (NullPointerException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Throwable] */
    public static void a(String str, int i, Exception exc) {
        er c = ey.a.a.c();
        if (ey.a() != null && ey.a().a != null) {
            c.c(al.b(ey.a().a) ? 1 : 0);
        }
        if (i > 0) {
            c.a(eq.GSLB_REQUEST_SUCCESS.af);
            c.e = str;
            c.b(i);
            ey.a.a.a(c);
            return;
        }
        try {
            ew.a(exc);
            boolean z = exc instanceof fy;
            Exception exc2 = exc;
            if (z) {
                Throwable th = ((fy) exc).a;
                exc2 = exc;
                if (th != null) {
                    exc2 = ((fy) exc).a;
                }
            }
            ew.a aVar = new ew.a();
            String message = exc2.getMessage();
            if (exc2.getCause() != null) {
                message = exc2.getCause().getMessage();
            }
            String str2 = exc2.getClass().getSimpleName() + CommonConstant.Symbol.COLON + message;
            int a2 = fp.a(exc2);
            if (a2 != 0) {
                aVar.a = eq.a(eq.GSLB_REQUEST_SUCCESS.af + a2);
            }
            if (aVar.a == null) {
                aVar.a = eq.GSLB_TCP_ERR_OTHER;
            }
            if (aVar.a == eq.GSLB_TCP_ERR_OTHER) {
                aVar.b = str2;
            }
            c.a(aVar.a.af);
            c.g = aVar.b;
            c.e = str;
            ey.a.a.a(c);
        } catch (NullPointerException unused) {
        }
    }

    public static void a(XMPushService xMPushService, ag.b bVar) {
        et etVar = new et(xMPushService, bVar);
        etVar.b.a(etVar);
        etVar.c = etVar.a.c;
    }

    public static synchronized void a(int i, int i2, String str, int i3) {
        synchronized (fa.class) {
            long currentTimeMillis = System.currentTimeMillis();
            int i4 = i2 | 0;
            if (!a.a.containsKey(Integer.valueOf(i4))) {
                com.xiaomi.channel.commonutils.logger.c.d("stats key not found");
                return;
            }
            er c = ey.a.a.c();
            c.a(i2);
            c.b((int) (currentTimeMillis - a.a.get(Integer.valueOf(i4)).longValue()));
            c.e = str;
            if (i3 >= 0) {
                c.c(i3);
            }
            ey.a.a.a(c);
            a.a.remove(Integer.valueOf(i2));
        }
    }

    public static void a(int i, int i2, int i3, String str, int i4) {
        er c = ey.a.a.c();
        c.a((byte) 0);
        c.a(i2);
        c.b(i3);
        c.e = str;
        c.c(i4);
        ey.a.a.a(c);
    }

    public static void a(int i) {
        er c = ey.a.a.c();
        c.a(eq.CHANNEL_STATS_COUNTER.af);
        c.c(i);
        ey.a.a.a(c);
    }

    public static byte[] c() {
        es b2 = ey.a.a.b();
        if (b2 != null) {
            return ik.a(b2);
        }
        return null;
    }
}
