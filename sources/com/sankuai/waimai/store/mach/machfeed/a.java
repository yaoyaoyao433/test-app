package com.sankuai.waimai.store.mach.machfeed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a<K, V> {
    public static ChangeQuickRedirect a;
    private int b;
    private LinkedHashMap<K, V> c;

    public a(int i) {
        Object[] objArr = {10};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e65b53c79d917797974e2f72b82c59f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e65b53c79d917797974e2f72b82c59f3");
            return;
        }
        this.b = 10;
        this.c = new LinkedHashMap<>();
    }

    public final V a(K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e116d1ce063200c3d2089d803a9841", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e116d1ce063200c3d2089d803a9841");
        }
        V v = this.c.get(k);
        if (v == null) {
            return null;
        }
        a(k, v);
        return v;
    }

    public final void a(K k, V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1878d7b19d99f3baa190c8210050732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1878d7b19d99f3baa190c8210050732");
            return;
        }
        if (this.c.containsKey(k)) {
            this.c.remove(k);
        } else if (this.c.size() == this.b) {
            Iterator<K> it = this.c.keySet().iterator();
            it.next();
            it.remove();
        }
        this.c.put(k, v);
    }
}
