package com.meituan.android.cipstorage;

import android.util.SparseArray;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.cipstorage.ap;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ao {
    public static ChangeQuickRedirect a;

    public static void a(af afVar, ap.b bVar, boolean z, ac acVar) {
        Object[] objArr = {afVar, bVar, (byte) 0, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37344168318c9b286b3e01563ef1832a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37344168318c9b286b3e01563ef1832a");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        k a2 = k.a();
        if (Math.abs(currentTimeMillis - a2.a("stm.detail")) < TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC) {
            return;
        }
        if (afVar.e()) {
            a(bVar.d, null);
        }
        long a3 = a(bVar.c, bVar.a, (ac) null);
        Map<String, Integer> b = am.b(null);
        if (a(false, bVar.c, afVar)) {
            for (Map.Entry<String, am> entry : bVar.b.entrySet()) {
                String key = entry.getKey();
                a(bVar.c.g.b, a3, entry.getValue(), key, b.get(key).intValue(), null);
            }
        }
        a2.a("stm.detail", currentTimeMillis);
    }

    private static void a(List<am> list, ac acVar) {
        Object[] objArr = {list, acVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bbd832a1faa1d0e41315e7e173c5603", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bbd832a1faa1d0e41315e7e173c5603");
            return;
        }
        for (am amVar : list) {
            HashMap hashMap = new HashMap();
            hashMap.put("path", amVar.b);
            hashMap.put("record", amVar.d);
            if (acVar == null) {
                v.a("cips.zombie-status", "level.unknown", amVar.g.b, hashMap);
            }
        }
    }

    private static long a(am amVar, SparseArray<PriorityQueue<am>> sparseArray, ac acVar) {
        Object[] objArr = {amVar, sparseArray, acVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec67951b2b2e041800288f10a530ca2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec67951b2b2e041800288f10a530ca2c")).longValue();
        }
        long j = amVar.g.b;
        long j2 = ((j / 1024) / 1024) / 100;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            long j3 = 0;
            Iterator<am> it = sparseArray.valueAt(i).iterator();
            while (it.hasNext()) {
                j3 += it.next().g.b;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("stage", Long.valueOf(j2));
            hashMap.put("category", Integer.valueOf(sparseArray.keyAt(i)));
            hashMap.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, Long.valueOf(j3));
            hashMap.put(GearsLocator.MALL_WEIGHT, Double.valueOf((j3 * 1.0d) / j));
            if (acVar == null) {
                v.a("cips.zombie-status", "usage.app", j, hashMap);
            }
        }
        return j2;
    }

    private static void a(final long j, final long j2, am amVar, final String str, final int i, final ac acVar) {
        Object[] objArr = {new Long(j), new Long(j2), amVar, str, Integer.valueOf(i), acVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52b767210980102466880001ba9f6d33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52b767210980102466880001ba9f6d33");
        } else {
            ap.a(amVar, new ap.a() { // from class: com.meituan.android.cipstorage.ao.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.ap.a
                public final boolean a(am amVar2, int i2) {
                    return i2 <= i;
                }

                @Override // com.meituan.android.cipstorage.ap.a
                public final boolean a(Map<am, List<am>> map, int i2) {
                    Object[] objArr2 = {map, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a812c41004658b19e04c1c6d0ed5002d", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a812c41004658b19e04c1c6d0ed5002d")).booleanValue();
                    }
                    if (i == i2) {
                        for (List<am> list : map.values()) {
                            for (am amVar2 : list) {
                                a(str, j, j2, amVar2, false);
                            }
                        }
                        return false;
                    }
                    for (Map.Entry<am, List<am>> entry : map.entrySet()) {
                        long j3 = 0;
                        for (am amVar3 : entry.getValue()) {
                            if (!amVar3.f) {
                                j3 += amVar3.g.b;
                            }
                        }
                        if (j3 > 0) {
                            am key = entry.getKey();
                            am amVar4 = new am(null, null, 0);
                            amVar4.i = key;
                            amVar4.b = key.b + "/cipsvirtual";
                            amVar4.d.addAll(key.d);
                            amVar4.f = false;
                            amVar4.g = new i(j3, 0L, 0L, 0L);
                            a(str, j, j2, amVar4, true);
                        }
                    }
                    return true;
                }

                private void a(String str2, long j3, long j4, am amVar2, boolean z) {
                    int i2 = 0;
                    Object[] objArr2 = {str2, new Long(j3), new Long(j4), amVar2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd5525b1e917aa21272355580b8b5525", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd5525b1e917aa21272355580b8b5525");
                        return;
                    }
                    long j5 = amVar2.g.b;
                    long j6 = amVar2.i == null ? j5 : amVar2.i.g.b;
                    HashMap hashMap = new HashMap();
                    hashMap.put("path", amVar2.b);
                    hashMap.put("record", amVar2.d);
                    hashMap.put("channel", str2);
                    hashMap.put("stage", Long.valueOf(j4));
                    if (z) {
                        i2 = 2;
                    } else if (amVar2.f) {
                        i2 = 1;
                    }
                    hashMap.put("category", Integer.valueOf(i2));
                    double d = j5 * 1.0d;
                    hashMap.put(GearsLocator.MALL_WEIGHT, Double.valueOf(d / j3));
                    hashMap.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, Double.valueOf(d / j6));
                    hashMap.put("access", Integer.valueOf(i));
                    if (acVar == null) {
                        v.a("cips.zombie", GearsLocator.DETAIL, amVar2.g.b, hashMap);
                    }
                }
            });
        }
    }

    private static boolean a(boolean z, am amVar, af afVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), amVar, afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88671f608096fee1b3429fe7235402d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88671f608096fee1b3429fe7235402d4")).booleanValue();
        }
        if (z) {
            return true;
        }
        long j = amVar.g.b;
        if (j > -1048576) {
            return true;
        }
        return j > 838860800 && new Random().nextDouble() < 0.06666666666666667d;
    }
}
