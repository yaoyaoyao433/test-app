package com.meituan.android.cipstorage;

import android.util.SparseArray;
import com.meituan.android.cipstorage.ap;
import com.meituan.android.cipstorage.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class o extends j.c {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cipstorage.j.c
    public final String a() {
        return "storageManager";
    }

    @Override // com.meituan.android.cipstorage.j.c
    public final boolean a(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae2629e367f843881a690e0ebcbd3de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae2629e367f843881a690e0ebcbd3de")).booleanValue();
        }
        return false;
    }

    @Override // com.meituan.android.cipstorage.j.c
    public final void b(af afVar) {
        final ap.b bVar;
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2afded852b4674b85cb54179df07363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2afded852b4674b85cb54179df07363");
            return;
        }
        Object[] objArr2 = {afVar, this};
        ChangeQuickRedirect changeQuickRedirect2 = ap.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "55d9bca7dedfabe713031a895b8a46a6", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (ap.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "55d9bca7dedfabe713031a895b8a46a6");
        } else {
            bVar = new ap.b();
            final ar arVar = new ar();
            ArrayList arrayList = new ArrayList();
            Map<String, Integer> a2 = am.a((Map<String, Integer>) null);
            arVar.a(a2.keySet());
            final Map<String, Integer> b = am.b(null);
            List<String> d = afVar.d();
            arVar.a(d);
            ap.a aVar = new ap.a() { // from class: com.meituan.android.cipstorage.ap.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.ap.a
                public final boolean b(am amVar, int i) {
                    Object[] objArr3 = {amVar, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1f916164d61660daa3c71391225f973c", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1f916164d61660daa3c71391225f973c")).booleanValue();
                    }
                    ar arVar2 = arVar;
                    Object[] objArr4 = {amVar};
                    ChangeQuickRedirect changeQuickRedirect4 = ar.a;
                    if (PatchProxy.isSupport(objArr4, arVar2, changeQuickRedirect4, false, "7fbc4faac63a498200bade35c76af9f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, arVar2, changeQuickRedirect4, false, "7fbc4faac63a498200bade35c76af9f3");
                    } else {
                        Set<am> set = arVar2.b.get(amVar.b);
                        if (set != null) {
                            set.add(amVar);
                        }
                        Set<am> set2 = arVar2.b.get(amVar.c);
                        if (set2 != null) {
                            set2.add(amVar);
                        }
                    }
                    if (b.containsKey(amVar.b)) {
                        bVar.b.put(amVar.b, amVar);
                    }
                    return true;
                }
            };
            bVar.c.f = true;
            bVar.b.put("/", bVar.c);
            ap.a(bVar.c, true, aVar);
            b();
            ap.a(bVar.c, false, aVar);
            b();
            for (String str : d) {
                bVar.e.addAll(arVar.a(str));
            }
            SparseArray sparseArray = new SparseArray();
            for (Map.Entry<String, Integer> entry : a2.entrySet()) {
                Set<am> a3 = arVar.a(entry.getKey());
                if (!a3.isEmpty()) {
                    int intValue = entry.getValue().intValue();
                    Set set = (Set) sparseArray.get(intValue);
                    if (set == null) {
                        set = new HashSet();
                        sparseArray.put(intValue, set);
                    }
                    set.addAll(a3);
                }
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                Set set2 = (Set) sparseArray.get(keyAt);
                arrayList.addAll(set2);
                PriorityQueue<am> a4 = am.a();
                a4.addAll(set2);
                bVar.a.put(keyAt, a4);
            }
            bVar.d = ap.a(bVar.c, arrayList);
            PriorityQueue<am> priorityQueue = bVar.a.get(0);
            if (priorityQueue == null) {
                priorityQueue = am.a();
                bVar.a.put(0, priorityQueue);
            }
            priorityQueue.addAll(bVar.d);
        }
        an.a(afVar, this, bVar);
        Object[] objArr3 = {afVar, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = ao.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3ad863e6b1da42a884f8e7f34ecc63ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3ad863e6b1da42a884f8e7f34ecc63ec");
        } else {
            ao.a(afVar, bVar, false, null);
        }
    }
}
