package com.sankuai.xm.monitor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    public static ChangeQuickRedirect b;
    private static HashMap<String, ArrayList<Long>> a = new HashMap<>();
    private static HashMap<String, ArrayList<Long>> c = new HashMap<>();

    public static synchronized void a(String str, String str2) {
        synchronized (d.class) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b919f6018b62ca4aac8a19867f12b110", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b919f6018b62ca4aac8a19867f12b110");
                return;
            }
            String str3 = str + str2;
            if (TextUtils.isEmpty(str3)) {
                com.sankuai.xm.log.c.b(d.class, "MonitorUtils::asyncLogEventStart:: key is empty", new Object[0]);
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!a.containsKey(str3)) {
                ArrayList<Long> arrayList = new ArrayList<>();
                arrayList.add(Long.valueOf(uptimeMillis));
                a.put(str3, arrayList);
                return;
            }
            a.get(str3).add(Long.valueOf(uptimeMillis));
        }
    }

    public static synchronized void b(String str, String str2, Map<String, Object> map) {
        synchronized (d.class) {
            Object[] objArr = {str, str2, map};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1051c087f272ce508faace95932a6cda", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1051c087f272ce508faace95932a6cda");
                return;
            }
            String str3 = str + str2;
            if (TextUtils.isEmpty(str3)) {
                com.sankuai.xm.log.c.b(d.class, "MonitorUtils::asyncLogEventEnd:: key is empty", new Object[0]);
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (a.containsKey(str3)) {
                ArrayList<Long> arrayList = a.get(str3);
                long longValue = arrayList.remove(0).longValue();
                if (longValue <= 0) {
                    com.sankuai.xm.log.c.d(d.class, "MonitorUtils::asyncLogEventEnd:: " + str + " 日志统计时间异常,起始时间为0!", new Object[0]);
                } else {
                    long j = uptimeMillis - longValue;
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    map.put("time", Long.valueOf(j));
                    b(str, map);
                }
                if (arrayList.isEmpty()) {
                    a.remove(str3);
                }
            }
        }
    }

    public static synchronized void b(String str, String str2) {
        synchronized (d.class) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5af60aed86ef7ceb2e324dd44e52952", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5af60aed86ef7ceb2e324dd44e52952");
                return;
            }
            String str3 = str + str2;
            if (TextUtils.isEmpty(str3)) {
                com.sankuai.xm.log.c.b(d.class, "MonitorUtils::asyncLogEventCancel:: key is empty", new Object[0]);
            } else if (a.containsKey(str3)) {
                a.remove(str3);
            } else {
                c.remove(str3);
            }
        }
    }

    public static void b(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b655d22955b5a1fe78a8dd6955a5023a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b655d22955b5a1fe78a8dd6955a5023a");
            return;
        }
        try {
            b.c().a(str, map);
        } catch (Exception e) {
            com.sankuai.xm.log.c.c(d.class, e.toString(), new Object[0]);
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a560d29cf9dde46add680da0f48686a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a560d29cf9dde46add680da0f48686a1");
        } else {
            b.a(str);
        }
    }

    public static void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f754ebb155c00a56dcbcf36247f1da9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f754ebb155c00a56dcbcf36247f1da9");
            return;
        }
        try {
            b c2 = b.c();
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "37d80022526c51a3ce642082243e0df9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "37d80022526c51a3ce642082243e0df9");
            } else if (b.b().c != j) {
                a b2 = b.b();
                Object[] objArr3 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, b2, changeQuickRedirect3, false, "05c307995ee7b87748ee41151e4fe20e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, b2, changeQuickRedirect3, false, "05c307995ee7b87748ee41151e4fe20e");
                } else {
                    b2.c = j;
                }
            }
        } catch (Exception e) {
            com.sankuai.xm.log.c.c(d.class, e.toString(), new Object[0]);
        }
    }
}
