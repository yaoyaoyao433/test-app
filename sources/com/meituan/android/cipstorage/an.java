package com.meituan.android.cipstorage;

import com.meituan.android.cipstorage.ap;
import com.meituan.android.cipstorage.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class an {
    public static ChangeQuickRedirect a;

    public static void a(af afVar, j.c cVar, ap.b bVar) {
        int[] iArr;
        char c = 0;
        Object[] objArr = {afVar, cVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4a088197ba0326ff3d802609cbca5b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4a088197ba0326ff3d802609cbca5b2");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        for (am amVar : bVar.e) {
            amVar.b();
        }
        int i = 4;
        int[] iArr2 = {4000, 3000, 2000, 1000};
        long f = afVar.f() * 1024 * 1024;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                iArr = iArr2;
                break;
            }
            int i3 = iArr2[i2];
            iArr = iArr2;
            if (bVar.c.g.b < f) {
                break;
            }
            PriorityQueue<am> priorityQueue = bVar.a.get(i3);
            if (priorityQueue != null) {
                Object[] objArr2 = new Object[2];
                objArr2[c] = null;
                objArr2[1] = Integer.valueOf(i3);
                ChangeQuickRedirect changeQuickRedirect2 = am.a;
                a(priorityQueue, currentTimeMillis, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1b23a2748cacd86724b80cff539e0617", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1b23a2748cacd86724b80cff539e0617")).longValue() : i3 != 1000 ? i3 != 2000 ? i3 != 3000 ? i3 != 4000 ? Long.MAX_VALUE : TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC : 259200L : 432000L : 604800L);
            }
            i2++;
            iArr2 = iArr;
            i = 4;
            c = 0;
        }
        cVar.b();
        if (afVar.g()) {
            for (int i4 = 0; i4 < 4; i4++) {
                int i5 = iArr[i4];
                if (bVar.c.g.b < f) {
                    break;
                }
                PriorityQueue<am> priorityQueue2 = bVar.a.get(i5);
                if (priorityQueue2 != null) {
                    Iterator<am> it = priorityQueue2.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                }
            }
            cVar.b();
        }
    }

    private static void a(PriorityQueue<am> priorityQueue, long j, long j2) {
        Object[] objArr = {priorityQueue, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e89d30d67520a5d6cd811095638a277f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e89d30d67520a5d6cd811095638a277f");
            return;
        }
        Iterator<am> it = priorityQueue.iterator();
        while (it.hasNext()) {
            am next = it.next();
            ArrayList<am> arrayList = new ArrayList();
            if (next.f) {
                if (next.j != null) {
                    arrayList.addAll(next.j);
                }
            } else {
                arrayList.add(next);
            }
            for (am amVar : arrayList) {
                if (amVar.g == null || Math.abs(j - amVar.g.b()) > j2) {
                    amVar.b();
                }
            }
        }
    }
}
