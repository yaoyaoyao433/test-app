package com.sankuai.waimai.bussiness.order.confirm.pgablock.rock;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static String b;
    public static Map<String, Object> c;
    @NonNull
    public static Map<String, Object> d;
    @NonNull
    public static Map<String, Object> e;
    @NonNull
    public static Map<String, Object> f;
    @NonNull
    public static Map<String, Object> g;
    @NonNull
    public static Map<String, Object> h;
    @NonNull
    public static Map<String, Object> i;
    @NonNull
    public static Map<String, Object> j;
    @NonNull
    public static Map<String, String> k;
    @NonNull
    public static Map<String, Object> l;
    @NonNull
    public static ArrayList<String> m;
    @NonNull
    public static Map<String, Object> n;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e46f72babffdbec2b8ba34879c270a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e46f72babffdbec2b8ba34879c270a7");
            return;
        }
        d.putAll(e);
        g.putAll(f);
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08a9ae6323d851a02cc90d3e7f3eb6a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08a9ae6323d851a02cc90d3e7f3eb6a5");
            return;
        }
        e.clear();
        f.clear();
    }

    public static void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "975cd962698ea617db28e603ce602215", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "975cd962698ea617db28e603ce602215");
        } else if (c != null) {
            if (c.get(str) == null || !c.get(str).equals(obj)) {
                c.put(str, obj);
            }
        }
    }

    public static void b(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77548b8c5f9ec25e0b0c80c8fb1a683f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77548b8c5f9ec25e0b0c80c8fb1a683f");
        } else if (i != null) {
            if (i.get(str) == null || !i.get(str).equals(obj)) {
                i.put(str, obj);
            }
        }
    }

    public static void c(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "352caf767499b680da92da671196ca22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "352caf767499b680da92da671196ca22");
        } else if (h != null) {
            if (h.get(str) == null || !h.get(str).equals(obj)) {
                h.put(str, obj);
            }
        }
    }

    public static void d(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccd054bd5d48fb5ff24df583765c172f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccd054bd5d48fb5ff24df583765c172f");
        } else {
            a(str, obj, false);
        }
    }

    private static void a(String str, Object obj, boolean z) {
        Object[] objArr = {str, obj, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a1ca54b3af74608d4b1ad7d39b7c96b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a1ca54b3af74608d4b1ad7d39b7c96b");
        } else if (j != null) {
            if (j.get(str) == null || !j.get(str).equals(obj)) {
                j.put(str, obj);
            }
        }
    }

    public static void a(boolean z, boolean z2, String str, Object obj) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2aac443525ad1e7bb30cfd9955b22e50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2aac443525ad1e7bb30cfd9955b22e50");
        } else if (z) {
            if (f.get(str) == null || !f.get(str).equals(obj)) {
                f.put(str, obj);
            }
        } else if (z2) {
            if (e.get(str) == null || !e.get(str).equals(obj)) {
                e.put(str, obj);
            }
        } else if (f.get(str) == null || !f.get(str).equals(obj)) {
            f.put(str, obj);
            if (e.get(str) == null || !e.get(str).equals(obj)) {
                e.put(str, obj);
            }
        }
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62304eb0f422e368851025458af95777", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62304eb0f422e368851025458af95777");
        } else {
            n.clear();
        }
    }

    public static void b(boolean z, boolean z2, String str, Object obj) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "966edc4308c5b9731647ffe906b15a48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "966edc4308c5b9731647ffe906b15a48");
        } else {
            a(z, z2, str, obj, false);
        }
    }

    public static void a(boolean z, boolean z2, String str, Object obj, boolean z3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, obj, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3edf45da5b99b9b3a96a9bfca4aebf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3edf45da5b99b9b3a96a9bfca4aebf9");
            return;
        }
        if (z3) {
            l.put(str, obj);
        }
        if (z) {
            if (g.get(str) == null || !g.get(str).equals(obj)) {
                g.put(str, obj);
            }
        } else if (z2) {
            if (d.get(str) == null || !d.get(str).equals(obj)) {
                d.put(str, obj);
            }
        } else if (g.get(str) == null || !g.get(str).equals(obj)) {
            g.put(str, obj);
            if (d.get(str) == null || !d.get(str).equals(obj)) {
                d.put(str, obj);
            }
        }
    }

    public static void a(List<Map<String, Object>> list, Object obj, boolean z, boolean z2) {
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        Object[] objArr = {list, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bdcf4abeea7128c6bf56e347f6b446a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bdcf4abeea7128c6bf56e347f6b446a6");
            return;
        }
        List arrayList = new ArrayList();
        if (obj != null && (obj instanceof List)) {
            arrayList = (List) obj;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            HashMap hashMap = new HashMap();
            if (list.get(i2).containsKey("type")) {
                Object obj2 = list.get(i2).get("type");
                if (obj2 instanceof Double) {
                    intValue4 = ((Double) obj2).intValue();
                } else if (obj2 instanceof Integer) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(obj2);
                    intValue4 = NumberUtils.parseInt(sb.toString(), Integer.MIN_VALUE);
                } else {
                    intValue4 = obj2 instanceof Long ? ((Long) obj2).intValue() : 0;
                }
                hashMap.put("type", Integer.valueOf(intValue4));
            }
            if (list.get(i2).containsKey("product_type")) {
                Object obj3 = list.get(i2).get("product_type");
                if (obj3 instanceof Double) {
                    intValue3 = ((Double) obj3).intValue();
                } else if (obj3 instanceof Integer) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj3);
                    intValue3 = NumberUtils.parseInt(sb2.toString(), Integer.MIN_VALUE);
                } else {
                    intValue3 = obj3 instanceof Long ? ((Long) obj3).intValue() : 0;
                }
                hashMap.put("product_type", Integer.valueOf(intValue3));
            }
            arrayList2.add(hashMap);
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            HashMap hashMap2 = new HashMap();
            if (((Map) arrayList.get(i3)).containsKey("type")) {
                Object obj4 = ((Map) arrayList.get(i3)).get("type");
                if (obj4 instanceof Double) {
                    intValue2 = ((Double) obj4).intValue();
                } else if (obj4 instanceof Integer) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj4);
                    intValue2 = NumberUtils.parseInt(sb3.toString(), Integer.MIN_VALUE);
                } else {
                    intValue2 = obj4 instanceof Long ? ((Long) obj4).intValue() : 0;
                }
                hashMap2.put("type", Integer.valueOf(intValue2));
            }
            if (((Map) arrayList.get(i3)).containsKey("product_type")) {
                Object obj5 = ((Map) arrayList.get(i3)).get("product_type");
                if (obj5 instanceof Double) {
                    intValue = ((Double) obj5).intValue();
                } else if (obj5 instanceof Integer) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(obj5);
                    intValue = NumberUtils.parseInt(sb4.toString(), Integer.MIN_VALUE);
                } else {
                    intValue = obj5 instanceof Long ? ((Long) obj5).intValue() : 0;
                }
                hashMap2.put("product_type", Integer.valueOf(intValue));
            }
            if (!arrayList2.contains(hashMap2)) {
                arrayList3.add(arrayList.get(i3));
            }
        }
        if (list != null && list.size() > 0) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                arrayList3.add(list.get(i4));
            }
        }
        b(z2, z, "ap_params", arrayList3);
    }

    public static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "895a1cae87efe9cb9f48ae1f222a2e6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "895a1cae87efe9cb9f48ae1f222a2e6c");
            return;
        }
        if (l != null && !l.isEmpty()) {
            for (String str : l.keySet()) {
                if (!str.equals("ap_params")) {
                    g.remove(str);
                    d.remove(str);
                }
            }
            l.clear();
        }
        if (m == null || m.size() <= 0) {
            return;
        }
        Iterator<String> it = m.iterator();
        while (it.hasNext()) {
            j.remove(it.next());
        }
        m.clear();
    }

    public static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "049af0c8db1ce2d902fa29029a0b604f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "049af0c8db1ce2d902fa29029a0b604f");
            return;
        }
        if (c != null) {
            c.clear();
        }
        if (d != null) {
            d.clear();
        }
        if (g != null) {
            g.clear();
        }
        if (h != null) {
            h.clear();
        }
        if (j != null) {
            j.clear();
        }
        if (i != null) {
            i.clear();
        }
        if (k != null) {
            k.clear();
        }
        if (n != null) {
            n.clear();
        }
        if (l != null) {
            l.clear();
        }
        if (m != null) {
            m.clear();
        }
    }
}
