package com.sankuai.xm.im.cache;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final ConcurrentHashMap<Integer, Integer> b = new ConcurrentHashMap<>();
    private static volatile long c;
    private static Map<String, Object> d;

    public static void a(long j, short s, Context context) {
        int i;
        Object[] objArr = {new Long(j), Short.valueOf(s), context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9180ca98f5e3fdcadc098373c006ac4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9180ca98f5e3fdcadc098373c006ac4");
        } else if (j == 0 || c == j) {
        } else {
            b.clear();
            com.sankuai.xm.im.utils.b.a().a(context, j, s);
            c = j;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d0c4cb617120b8607dd51faf07ba7526", 6917529027641081856L)) {
                ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d0c4cb617120b8607dd51faf07ba7526")).intValue();
                return;
            }
            if (com.sankuai.xm.im.c.a(c.b.PEER_CHAT)) {
                com.sankuai.xm.im.utils.b a2 = com.sankuai.xm.im.utils.b.a();
                int i2 = a2.getInt("SP_MSG_COUNT_" + j + "_1", 0);
                b.put(1, Integer.valueOf(i2 > 0 ? i2 : 0));
                i = i2 + 0;
            } else {
                i = 0;
            }
            if (com.sankuai.xm.im.c.a(c.b.GROUP_CHAT)) {
                com.sankuai.xm.im.utils.b a3 = com.sankuai.xm.im.utils.b.a();
                int i3 = a3.getInt("SP_MSG_COUNT_" + j + "_2", 0);
                b.put(2, Integer.valueOf(i3 > 0 ? i3 : 0));
                i += i3;
            }
            if (com.sankuai.xm.im.c.a(c.b.PUB_CHAT)) {
                com.sankuai.xm.im.utils.b a4 = com.sankuai.xm.im.utils.b.a();
                int i4 = a4.getInt("SP_MSG_COUNT_" + j + "_3", 0);
                b.put(3, Integer.valueOf(i4 > 0 ? i4 : 0));
                i += i4;
            }
            com.sankuai.xm.im.utils.a.b("DBStatisticsContext::loadLocal: uid = " + j + ",count=" + i, new Object[0]);
        }
    }

    public static void a(long j) {
        boolean z = true;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92d0a9326dbafd02de1a9f26d7c07314", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92d0a9326dbafd02de1a9f26d7c07314");
        } else if (j == 0) {
        } else {
            com.sankuai.xm.base.init.b.b();
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("uid", Long.valueOf(j));
            Map<String, Object> map = d;
            com.sankuai.xm.base.lifecycle.d d2 = com.sankuai.xm.base.lifecycle.d.d();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.base.lifecycle.d.a;
            if (PatchProxy.isSupport(objArr2, d2, changeQuickRedirect2, false, "8983f4387b561a43a171e3c6186b7928", 6917529027641081856L)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, d2, changeQuickRedirect2, false, "8983f4387b561a43a171e3c6186b7928")).booleanValue();
            } else if (d2.b != 0) {
                d2.c();
                if (d2.b != 0) {
                    z = false;
                }
            }
            map.put("appstate", Boolean.valueOf(z));
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            com.sankuai.xm.monitor.c.a("db_init", sb.toString());
        }
    }

    public static void a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "996a6f2fa7c8ca90561d504a25e2e8f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "996a6f2fa7c8ca90561d504a25e2e8f4");
        } else if (d != null) {
            d.put(str, Long.valueOf(j));
        }
    }

    public static void a(long j, boolean z, int i) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4bfabd14d549cb0ebe8f230cbe38dc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4bfabd14d549cb0ebe8f230cbe38dc8");
            return;
        }
        Object obj = d.get("appstate");
        if (z && obj != null && ((Boolean) obj).booleanValue()) {
            d.remove("appstate");
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            com.sankuai.xm.monitor.c.a("db_init", sb.toString(), d);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j);
            com.sankuai.xm.monitor.c.b("db_init", sb2.toString());
        }
        d.clear();
        com.sankuai.xm.base.init.b.a(i != 0 ? 8 : 1);
        com.sankuai.xm.base.init.b.c();
    }

    public static void a(String str, long j, int i, int i2) {
        Object[] objArr = {str, new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "894428b9a697253c59b8589e2cc5ec2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "894428b9a697253c59b8589e2cc5ec2d");
        } else {
            a(str, j, i, i2, null);
        }
    }

    public static void a(String str, long j, int i, int i2, Map<String, Object> map) {
        int i3 = 0;
        Object[] objArr = {str, new Long(j), Integer.valueOf(i), Integer.valueOf(i2), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d094e08b9b80ab193d3d8a6809dac47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d094e08b9b80ab193d3d8a6809dac47");
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("action", str);
        hashMap.put("time", Long.valueOf(j));
        hashMap.put("count", Integer.valueOf(i));
        if (i2 == -1) {
            for (Map.Entry<Integer, Integer> entry : b.entrySet()) {
                i3 += entry.getValue().intValue();
            }
            hashMap.put("msg_num", Integer.valueOf(i3));
        } else {
            Integer num = b.get(Integer.valueOf(i2));
            if (num != null && num.intValue() >= 0) {
                hashMap.put("msg_num", num);
            }
        }
        com.sankuai.xm.monitor.c.a("db_key_action", hashMap);
    }

    public static void a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf35c29aacf408ac7bbc1041c867d1b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf35c29aacf408ac7bbc1041c867d1b7");
            return;
        }
        try {
            com.sankuai.xm.base.db.g a2 = com.sankuai.xm.base.db.g.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.base.db.g.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "c5a322dbbdeb6fc8fec77f46fc2694c2", 6917529027641081856L)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "c5a322dbbdeb6fc8fec77f46fc2694c2")).booleanValue();
            } else if (a2.b.size() > 0) {
                z = true;
            }
            if (z) {
                HashMap hashMap = new HashMap();
                hashMap.put("result", com.sankuai.xm.base.db.g.a().a("db_migrate_result"));
                hashMap.put("time", com.sankuai.xm.base.db.g.a().a("db_migrate_time"));
                hashMap.put("socket_time", com.sankuai.xm.base.db.g.a().a("db_crypt_time"));
                hashMap.put("exchange_time", com.sankuai.xm.base.db.g.a().a("db_upgrade_time"));
                hashMap.put("message", com.sankuai.xm.base.db.g.a().a("message_db.db"));
                hashMap.put("func", com.sankuai.xm.base.db.g.a().a("imkit_personal_db.db"));
                hashMap.put("path", com.sankuai.xm.base.db.g.a().a("imkit_db.db"));
                hashMap.put("msg", com.sankuai.xm.base.db.g.a().a("dx_sdk_statistics_report.db"));
                com.sankuai.xm.monitor.c.a("db_migrate", hashMap);
            }
        } catch (Exception e) {
            com.sankuai.xm.im.utils.a.a(e);
        }
    }

    public static void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        SharedPreferences.Editor editor = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1ce432f2458605ce9f2668c57f3224f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1ce432f2458605ce9f2668c57f3224f");
            return;
        }
        b.put(Integer.valueOf(i2), Integer.valueOf(i));
        com.sankuai.xm.im.utils.b a2 = com.sankuai.xm.im.utils.b.a();
        String str = "SP_MSG_COUNT_" + IMClient.a().k() + CommonConstant.Symbol.UNDERLINE + i2;
        Object[] objArr2 = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.utils.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "5b1f4852567fef52a762f7575beee022", 6917529027641081856L)) {
            editor = (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "5b1f4852567fef52a762f7575beee022");
        } else if (a2.b != null) {
            editor = a2.b.edit().putInt(str, i);
        }
        com.sankuai.xm.im.utils.b.a(editor);
    }

    public static void a(long j, boolean z, boolean z2) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b867e793076a69e0b0957dca6c6b1a51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b867e793076a69e0b0957dca6c6b1a51");
            return;
        }
        com.sankuai.xm.im.utils.a.b("dbUpgrade12Report time:" + j + " total:" + z + " reachMax:true", new Object[0]);
    }
}
