package com.sankuai.xm.im;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static long b;
    private static int c;
    private static long d;
    private static long e;
    private static Map<String, Long> f = new HashMap();

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d23311038460e679eec021f1fa337db6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d23311038460e679eec021f1fa337db6");
            return;
        }
        com.sankuai.xm.base.init.b.b(z);
        d = System.currentTimeMillis();
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acf7cbe21bb7a4ef74052bd19ae2500d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acf7cbe21bb7a4ef74052bd19ae2500d");
            return;
        }
        com.sankuai.xm.base.init.b.e();
        e = System.currentTimeMillis();
        if (d == 0 || e < d) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f5926016f0ca4d15dc9b27dc9a248802", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f5926016f0ca4d15dc9b27dc9a248802");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("totaltime", Long.valueOf(e - d));
            hashMap.put("time", Long.valueOf(b));
            hashMap.put("count", Integer.valueOf(c));
            com.sankuai.xm.monitor.c.a("sync_remote_msg", hashMap);
        }
        f.clear();
        e = 0L;
        d = 0L;
        b = 0L;
        c = 0;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6db14490bca8e202b4efcac8814365d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6db14490bca8e202b4efcac8814365d");
        } else if (f.containsKey(str)) {
        } else {
            f.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b3430d448e4574e971c6fe6756b046c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b3430d448e4574e971c6fe6756b046c");
            return;
        }
        Long remove = f.remove(str);
        if (remove != null) {
            long currentTimeMillis = System.currentTimeMillis() - remove.longValue();
            synchronized (e.class) {
                b += currentTimeMillis;
                c++;
            }
        }
    }

    public static void a(String str, int i, int i2, boolean z, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25c62da89a08c9fb29d32fdb3f413438", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25c62da89a08c9fb29d32fdb3f413438");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "start");
        hashMap.put(MessageStatisticsEntry.PARAM_MSG_TYPE, Integer.valueOf(i));
        hashMap.put("status", Integer.valueOf(i2));
        hashMap.put("seqId", str);
        hashMap.put("msg", str2);
        hashMap.put("net", Integer.valueOf(com.sankuai.xm.base.util.net.d.c(IMClient.a().f())));
        if (z) {
            hashMap.put("type", 1);
        }
        com.sankuai.xm.monitor.c.a("imnewmsg", hashMap);
    }

    public static void a(String str, boolean z, int i, int i2, int i3, long j, int i4, long j2, int i5, boolean z2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j), Integer.valueOf(i4), new Long(j2), Integer.valueOf(i5), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "866d17d8acf7901f9ce073066ad7a4ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "866d17d8acf7901f9ce073066ad7a4ac");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "end");
        hashMap.put("result", Integer.valueOf(!z ? 1 : 0));
        hashMap.put(MessageStatisticsEntry.PARAM_MSG_TYPE, Integer.valueOf(i4));
        hashMap.put("status", Integer.valueOf(i5));
        hashMap.put("totaltime", Long.valueOf(j2));
        hashMap.put("count", Integer.valueOf(i2));
        hashMap.put("next", Integer.valueOf(i));
        hashMap.put("net", Integer.valueOf(com.sankuai.xm.base.util.net.d.c(IMClient.a().f())));
        hashMap.put("time", Long.valueOf(SystemClock.uptimeMillis() - j));
        hashMap.put("total", Integer.valueOf(i3));
        hashMap.put("seqId", str);
        if (z2) {
            hashMap.put("type", 1);
        }
        com.sankuai.xm.monitor.c.a("imnewmsg", hashMap);
    }
}
