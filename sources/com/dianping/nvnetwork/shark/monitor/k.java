package com.dianping.nvnetwork.shark.monitor;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k {
    public static ChangeQuickRedirect a;
    int b;
    private SparseArray<LinkedList<l>> c;

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3153a52ffd4ed6ad435e4d85c3d65fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3153a52ffd4ed6ad435e4d85c3d65fd");
        } else {
            this.c = new SparseArray<>(8);
        }
    }

    public final void a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b72d43e0c67f85633bcd1d1f4e55296f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b72d43e0c67f85633bcd1d1f4e55296f");
            return;
        }
        LinkedList<l> linkedList = this.c.get(lVar.d);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.c.put(lVar.d, linkedList);
        }
        if (linkedList.size() >= 16) {
            linkedList.removeLast();
            this.b--;
        }
        linkedList.addFirst(lVar);
        this.b++;
    }

    public final double a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "597d008180448eff325de91a95e8de2b", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "597d008180448eff325de91a95e8de2b")).doubleValue();
        }
        LinkedList<l> linkedList = this.c.get(i);
        if (linkedList == null || linkedList.isEmpty()) {
            return 0.0d;
        }
        Iterator<l> it = linkedList.iterator();
        double d = 0.0d;
        double d2 = 0.0d;
        while (it.hasNext()) {
            l next = it.next();
            int i2 = (int) ((j - next.b) / 1000);
            if (i2 > 5 || i2 < 0) {
                break;
            }
            double pow = 1.0d / Math.pow(2.0d, i2);
            d += pow;
            d2 += next.c * pow;
        }
        if (d != 0.0d) {
            return d2 / d;
        }
        return 0.0d;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be5cea2b96202fc48a0847200e38b0fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be5cea2b96202fc48a0847200e38b0fe");
        } else {
            this.c.clear();
        }
    }
}
