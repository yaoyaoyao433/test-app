package com.meituan.android.paybase.fingerprint.soter;

import android.content.Context;
import com.meituan.android.paybase.asynctask.b;
import com.meituan.android.paybase.fingerprint.soter.soterexternal.d;
import com.meituan.android.paybase.fingerprint.soter.soterexternal.e;
import com.meituan.android.paybase.fingerprint.soter.soterexternal.f;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static ConcurrentHashMap<String, Integer> b = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, com.meituan.android.paybase.fingerprint.soter.soterexternal.c> c = new ConcurrentHashMap<>();
    private static ConcurrentLinkedQueue<f> d = new ConcurrentLinkedQueue<>();

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5f24dea13eb5c187ff8ed74aad62cf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5f24dea13eb5c187ff8ed74aad62cf6");
            return;
        }
        int i = b.get(str);
        if (i == null) {
            i = 0;
        }
        if (i.intValue() == 0) {
            e.b(context, str);
            b.put(str, 1);
            com.meituan.android.paybase.fingerprint.soter.soterexternal.b bVar = new com.meituan.android.paybase.fingerprint.soter.soterexternal.b(context.getApplicationContext(), str);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.paybase.fingerprint.soter.soterexternal.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "59715d3d322e6d5384f6162edb1adb20", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "59715d3d322e6d5384f6162edb1adb20");
            } else if (bVar.l == b.c.PENDING) {
                t.a("SoterGenerateKeyAsyncTask", "start");
                bVar.b = new d(bVar.c);
                bVar.b(new Object[0]);
            }
        }
    }

    public static void a(com.meituan.android.paybase.fingerprint.soter.soterexternal.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ec183c072227061ad4f767d7d427da6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ec183c072227061ad4f767d7d427da6");
            return;
        }
        b.put(cVar.c, 2);
        c.put(cVar.c, cVar);
        if (i.a(d)) {
            return;
        }
        Iterator<f> it = d.iterator();
        while (it.hasNext()) {
            it.next().a(cVar);
        }
    }

    public static void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95b8257953978c5645ad7c212cc4c783", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95b8257953978c5645ad7c212cc4c783");
        } else {
            d.add(fVar);
        }
    }

    public static void b(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "494cf6cfc84bd841645d3f03b5086ef3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "494cf6cfc84bd841645d3f03b5086ef3");
        } else {
            d.remove(fVar);
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "021433a56062ab37186725fa13e10674", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "021433a56062ab37186725fa13e10674")).booleanValue() : e(str) == 1;
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aca276c79f3a5b7bc57e91d0cced78a4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aca276c79f3a5b7bc57e91d0cced78a4")).booleanValue() : e(str) == 0;
    }

    public static com.meituan.android.paybase.fingerprint.soter.soterexternal.c c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5ded0aecf038446803a8601226e8eb6", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.paybase.fingerprint.soter.soterexternal.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5ded0aecf038446803a8601226e8eb6") : (com.meituan.android.paybase.fingerprint.soter.soterexternal.c) a(c, str, new com.meituan.android.paybase.fingerprint.soter.soterexternal.c(1, str));
    }

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d41e3335ce010c4a11760cb1bf8dad49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d41e3335ce010c4a11760cb1bf8dad49");
        } else {
            b.remove(str);
        }
    }

    private static <K, V> V a(Map<K, V> map, K k, V v) {
        Object[] objArr = {map, k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab2181923452ac3d3ea4a60b2a0c9ae0", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab2181923452ac3d3ea4a60b2a0c9ae0") : map.get(k) == null ? v : map.get(k);
    }

    private static int e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35e058a140def6ebff380eea7bab5cfd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35e058a140def6ebff380eea7bab5cfd")).intValue() : ((Integer) a(b, str, 0)).intValue();
    }
}
