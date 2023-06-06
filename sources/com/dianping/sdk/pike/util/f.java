package com.dianping.sdk.pike.util;

import com.dianping.monitor.impl.l;
import com.dianping.sdk.pike.h;
import com.dianping.sdk.pike.i;
import com.dianping.sdk.pike.packet.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static final Map<Character, Integer> b = new HashMap();

    public static void a(String str, int i, int i2, int i3, int i4, String str2, String str3, String str4) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3a9ad027cf72110a79355cda80d0af8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3a9ad027cf72110a79355cda80d0af8");
        } else {
            a(str, i, i2, i3, i4, str2, str3, str4, com.dianping.sdk.pike.f.p);
        }
    }

    public static void a(String str, int i, int i2, int i3, int i4, String str2, String str3, String str4, int i5) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, str3, str4, Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a29430f3dce6f35405d57eee3bbff8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a29430f3dce6f35405d57eee3bbff8e");
        } else if (com.dianping.sdk.pike.f.o && (com.dianping.sdk.pike.f.e() instanceof com.dianping.monitor.impl.a)) {
            ((com.dianping.monitor.impl.a) com.dianping.sdk.pike.f.e()).pvPike(0L, str, 0, 0, i, i2, i3, i4, str2, str3, i5, str4);
        }
    }

    static {
        for (int i = 0; i < 26; i++) {
            b.put(Character.valueOf((char) (i + 97)), Integer.valueOf(i));
            b.put(Character.valueOf((char) (i + 65)), Integer.valueOf(i));
        }
        b.put(Character.valueOf(CommonConstant.Symbol.DOT_CHAR), 26);
        b.put('_', 27);
        b.put('/', 28);
        b.put('-', 29);
    }

    public static void a(String str, ab abVar, boolean z, boolean z2) {
        Object[] objArr = {str, abVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96af7649f2b182b36c652b45a81f0f4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96af7649f2b182b36c652b45a81f0f4c");
            return;
        }
        try {
            if (com.dianping.sdk.pike.f.o) {
                int b2 = b(str);
                if (!z) {
                    b2 = -b2;
                }
                int i = b2;
                String str2 = z2 ? "pike_rrpc_push" : "pike_received_push";
                i.a("PikeMonitorUtils", str2, ", biz: ", str, ", monitor code: ", String.valueOf(i));
                a(str2, i, abVar.h(), 0, 0, "", "", a.a(abVar.h(), 0, 0));
                a(a(com.dianping.sdk.pike.metrics.c.DownLinkMessage, str, abVar.h()));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, boolean z, long j) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d7d2f146b4a96df3b4ecf7c518b9111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d7d2f146b4a96df3b4ecf7c518b9111");
            return;
        }
        try {
            if (com.dianping.sdk.pike.f.o) {
                int b2 = b(str);
                if (!z) {
                    b2 = -b2;
                }
                a("pike_rrpc_session", b2, 0, 0, (int) j, "", "", "");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34adafc0c982d91b9b2200a23f5166e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34adafc0c982d91b9b2200a23f5166e3");
            return;
        }
        try {
            a("pike_register_interval", b(str), 0, 0, i, "", "", "");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, String str2, com.dianping.sdk.pike.metrics.c cVar, int i, String str3) {
        Object[] objArr = {str, str2, cVar, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "836a32815102e37f38f044edd43fe9a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "836a32815102e37f38f044edd43fe9a6");
            return;
        }
        try {
            if (com.dianping.sdk.pike.f.o) {
                c.a(str, str3, System.currentTimeMillis(), cVar == com.dianping.sdk.pike.metrics.c.UpLinkMessage ? 0 : 1, i, str2);
                int c = com.dianping.nvtunnelkit.utils.c.c();
                l a2 = com.dianping.sdk.pike.f.f().a("pike_bizId", str).a("pike_type", String.valueOf(cVar == com.dianping.sdk.pike.metrics.c.UpLinkMessage ? 0 : 1)).a("pike_ip", str2);
                if (c >= 2) {
                    c++;
                }
                a2.a("pike_network", String.valueOf(c)).a("pike_all_metrics", Arrays.asList(Float.valueOf(i))).a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e2997416db1cb443286456dd7109c58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e2997416db1cb443286456dd7109c58");
            return;
        }
        try {
            if (com.dianping.sdk.pike.f.o) {
                com.dianping.sdk.pike.f.f().a("pike_bizId", str).a("pike_subprocess", Arrays.asList(Float.valueOf(1.0f))).a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d27be9d35d0c93b98f229885a1ee96aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d27be9d35d0c93b98f229885a1ee96aa")).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < Math.min(str.length(), 6); i2++) {
            char charAt = str.charAt(i2);
            i |= (b.containsKey(Character.valueOf(charAt)) ? b.get(Character.valueOf(charAt)).intValue() : 31) << ((5 - i2) * 5);
        }
        return i;
    }

    public static com.dianping.sdk.pike.metrics.b a(com.dianping.sdk.pike.metrics.c cVar, String str, int i) {
        Object[] objArr = {cVar, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "110fafdfa75baac022a7365eda554309", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.sdk.pike.metrics.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "110fafdfa75baac022a7365eda554309");
        }
        com.dianping.sdk.pike.metrics.b bVar = new com.dianping.sdk.pike.metrics.b();
        bVar.a = cVar;
        bVar.b = str;
        bVar.c = i;
        return bVar;
    }

    public static void a(final com.dianping.sdk.pike.metrics.b bVar) {
        final com.dianping.sdk.pike.metrics.a a2;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8d72f0c6ccf3c52bdbbb9eaf409aa29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8d72f0c6ccf3c52bdbbb9eaf409aa29");
            return;
        }
        try {
            if (com.dianping.sdk.pike.f.o && (a2 = h.a()) != null) {
                Runnable runnable = new Runnable() { // from class: com.dianping.sdk.pike.util.f.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3d32670dc76173101c7363538c65e55", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3d32670dc76173101c7363538c65e55");
                        }
                    }
                };
                if (a2.a() != null) {
                    a2.a().execute(runnable);
                } else {
                    com.dianping.sdk.pike.service.c.a().a(runnable);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
