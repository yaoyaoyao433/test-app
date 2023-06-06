package com.meituan.mmp.lib;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.mmp.lib.trace.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p {
    public static ChangeQuickRedirect a;
    private static final AtomicBoolean d = new AtomicBoolean(false);
    @NonNull
    private static final ConcurrentHashMap<String, List<a>> e = new ConcurrentHashMap<>();
    @NonNull
    private static final ConcurrentHashMap<String, List<a>> f = new ConcurrentHashMap<>();
    @NonNull
    private static final ConcurrentHashMap<String, Long> g = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Long> h = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> b = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();

    public static void a(@Nullable String str, @Nullable String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee037071fe8c418f82ecaeb3efe1fe01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee037071fe8c418f82ecaeb3efe1fe01");
        } else if (str == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.equals(str2, StringUtil.NULL)) {
            com.meituan.mmp.lib.trace.b.b("JSMemoryHelper", "appId or pageUrl is null");
        } else {
            try {
                String a2 = a(str, str2);
                if (j <= 0) {
                    com.meituan.mmp.lib.trace.b.b("JSMemoryHelper", a2 + ", jsMemSize <= 0");
                    return;
                }
                List<a> list = e.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                    e.put(str, list);
                }
                list.add(new a(a2, j));
                com.meituan.mmp.lib.trace.b.b("JSMemoryHelper", "addPageMemInfo, " + a2 + CommonConstant.Symbol.COLON + j);
                a(str, a2, j, 5);
            } catch (Throwable th) {
                com.meituan.mmp.lib.trace.b.a("JSMemoryHelper", th);
            }
        }
    }

    @NonNull
    private static String a(String str, String str2) {
        String str3;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71b8f6a3f846b0af5a8639123295de1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71b8f6a3f846b0af5a8639123295de1b");
        }
        try {
            if ("mmp_87dffc23944d".equalsIgnoreCase(str) && str2.contains(CommonConstant.Symbol.QUESTION_MARK)) {
                str2 = str2.substring(0, str2.indexOf(CommonConstant.Symbol.QUESTION_MARK));
            }
            str3 = Uri.parse(str2).getPath();
        } catch (Throwable th) {
            com.meituan.mmp.lib.trace.b.d("JSMemoryHelper", "getPagePath " + th.toString());
            str3 = "";
        }
        return str3 == null ? "" : str3;
    }

    private static void a(String str, String str2, long j, int i) {
        Object[] objArr = {str, str2, new Long(j), 5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1500b8d874ea6e7bfba284a60b3ea10f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1500b8d874ea6e7bfba284a60b3ea10f");
            return;
        }
        List<a> list = f.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new a(str2, j));
            f.put(str, arrayList);
            return;
        }
        int size = list.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            } else if (j > list.get(i3).c) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        if (i2 >= 0) {
            list.add(i2, new a(str2, j));
        } else {
            list.add(new a(str2, j));
        }
        int size2 = list.size();
        if (size2 > 5) {
            list.remove(size2 - 1);
        }
    }

    public static void a(@Nullable Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be61d696a4c27b5ba2ec29423d67800b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be61d696a4c27b5ba2ec29423d67800b");
            return;
        }
        try {
            List<a> list = e.get(b());
            if (list != null && !list.isEmpty()) {
                int size = list.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    j += list.get(i).c;
                }
                map.put("mmpPageJSSizeAVG", Long.valueOf(j / size));
            }
        } catch (Throwable th) {
            com.meituan.mmp.lib.trace.b.d("JSMemoryHelper", "setPageAverageJSSize error:" + th.toString());
        }
    }

    public static void a(@Nullable Map<String, Object> map, int i) {
        int i2 = 0;
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "871b60ef4b98e4ab5968529b00f955cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "871b60ef4b98e4ab5968529b00f955cb");
            return;
        }
        try {
            List<a> list = f.get(b());
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (a aVar : list) {
                HashMap hashMap = new HashMap();
                hashMap.put(aVar.b, Long.valueOf(aVar.c));
                i2 += hashMap.toString().length();
                if (i2 > i) {
                    break;
                }
                arrayList.add(hashMap);
            }
            map.put("mmpPageTop", arrayList);
        } catch (Throwable th) {
            com.meituan.mmp.lib.trace.b.d("JSMemoryHelper", "setTop5PageMemInfo error:" + th.toString());
        }
    }

    public static void b(@Nullable Map<String, Object> map, int i) {
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3ee9da6c27d3f1071f7468b9d429d95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3ee9da6c27d3f1071f7468b9d429d95");
            return;
        }
        try {
            List<a> list = e.get(b());
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int size = list.size() - 1; size >= 0; size--) {
                HashMap hashMap = new HashMap();
                a aVar = list.get(size);
                hashMap.put(aVar.b, Long.valueOf(aVar.c));
                if (arrayList.toString().length() + hashMap.toString().length() > i) {
                    break;
                }
                arrayList.add(hashMap);
            }
            map.put("mmpJSDetails", arrayList);
        } catch (Throwable th) {
            com.meituan.mmp.lib.trace.b.d("JSMemoryHelper", "setLastNPageMemInfo error:" + th.toString());
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dff017a9df623af347f922073cf30c75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dff017a9df623af347f922073cf30c75");
        } else {
            com.meituan.crashreporter.c.c().a(new com.meituan.crashreporter.a() { // from class: com.meituan.mmp.lib.p.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.crashreporter.a
                public final Map<String, Object> getCrashInfo(String str, boolean z) {
                    Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0d1db469569317882bf0b95ed1ada48", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0d1db469569317882bf0b95ed1ada48");
                    }
                    b.a.c("JSMemoryHelper", "registerCrashInfoProviders start");
                    if (!p.d.get()) {
                        String b2 = p.b();
                        p.a(b2, p.c.get(b2), p.a(b2));
                        p.d.set(true);
                    }
                    HashMap hashMap = new HashMap();
                    p.b(hashMap);
                    p.a(hashMap);
                    p.a(hashMap, 1000 - hashMap.toString().length());
                    p.b(hashMap, 1000 - hashMap.toString().length());
                    b.a.c("JSMemoryHelper", "registerCrashInfoProviders end");
                    if (DebugHelper.b()) {
                        b.a.c("JSMemoryHelper", "registerCrashInfoProviders result:" + hashMap.toString());
                    }
                    return hashMap;
                }
            });
        }
    }

    public static long a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba6ad2453adb82198b98c35236003b5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba6ad2453adb82198b98c35236003b5d")).longValue();
        }
        if (str == null || TextUtils.isEmpty(str)) {
            com.meituan.mmp.lib.trace.b.d("JSMemoryHelper", "getLastPageTotalJSSize appId is null");
            return 0L;
        }
        Long l = b.get(str);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f7d45c57439109d171bd1dac367ebc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f7d45c57439109d171bd1dac367ebc1");
            return;
        }
        try {
            map.put("lastJSTotalSize", g.get(b()));
        } catch (Throwable th) {
            com.meituan.mmp.lib.trace.b.d("JSMemoryHelper", "setPageAverageJSSize error:" + th.toString());
        }
    }

    public static void b(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b11c8ca43b085485fb07b5d3ab948bd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b11c8ca43b085485fb07b5d3ab948bd3");
        } else if (str == null) {
        } else {
            e.remove(str);
            f.remove(str);
            g.remove(str);
            h.remove(str);
            b.remove(str);
            c.remove(str);
        }
    }

    @NonNull
    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "216c201a2cf5765ae13fba05af73711c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "216c201a2cf5765ae13fba05af73711c");
        }
        String a2 = t.a();
        return a2 == null ? "" : a2;
    }

    public static void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51fe16166812a158c65b0027b16dab60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51fe16166812a158c65b0027b16dab60");
            return;
        }
        String b2 = b();
        if (TextUtils.isEmpty(b2)) {
            return;
        }
        h.put(b2, Long.valueOf(j));
    }

    public static void b(long j) {
        long longValue;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "624d8794e1042848206b6acd43598e66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "624d8794e1042848206b6acd43598e66");
            return;
        }
        String b2 = b();
        if (TextUtils.isEmpty(b2)) {
            return;
        }
        Long valueOf = Long.valueOf(j);
        Object[] objArr2 = {b2, valueOf};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d09cbf03236bed334cf94aff8bfbec7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d09cbf03236bed334cf94aff8bfbec7e");
        } else if (b2 == null || TextUtils.isEmpty(b2)) {
            com.meituan.mmp.lib.trace.b.b("JSMemoryHelper", "appId is null");
        } else {
            g.put(b2, valueOf);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f44ca0e8c1dca85a12805114c1b70064", RobustBitConfig.DEFAULT_VALUE)) {
            longValue = ((Long) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f44ca0e8c1dca85a12805114c1b70064")).longValue();
        } else {
            Long l = h.get(b());
            longValue = l == null ? 0L : l.longValue();
        }
        long j2 = j - longValue;
        if (j2 > 0) {
            b.put(b2, Long.valueOf(j2));
        }
        com.meituan.mmp.lib.trace.b.b("JSMemoryHelper", "current path:" + c() + ",jsMemSize:" + j2);
    }

    public static void c(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "521ded329edf4b2fdb3769a2a1a93152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "521ded329edf4b2fdb3769a2a1a93152");
        } else if (str == null || TextUtils.isEmpty(str)) {
            com.meituan.mmp.lib.trace.b.b("JSMemoryHelper", "cacheCurrentPagePath url is empty");
        } else {
            String b2 = b();
            c.put(b2, a(b2, str));
        }
    }

    @Nullable
    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da42de90c778be7f3f4fe2de863d8db8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da42de90c778be7f3f4fe2de863d8db8") : c.get(b());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @NonNull
        public String b;
        public long c;

        public a(@NonNull String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0fe1963e6270e1482a6cab3d1df1767", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0fe1963e6270e1482a6cab3d1df1767");
                return;
            }
            this.b = str;
            this.c = j;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c081ac9cabeaee4abf6991f7fa5838e", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c081ac9cabeaee4abf6991f7fa5838e");
            }
            return "PageJSMemInfo{pagePath='" + this.b + "', jsMemKB=" + this.c + '}';
        }
    }
}
