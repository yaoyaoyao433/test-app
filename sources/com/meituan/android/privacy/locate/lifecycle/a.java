package com.meituan.android.privacy.locate.lifecycle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    private final Set<c> b;
    private boolean c;
    private boolean d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f2be5932fe70a83fa080d7286290cba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f2be5932fe70a83fa080d7286290cba");
        } else {
            this.b = Collections.newSetFromMap(new WeakHashMap());
        }
    }

    @Override // com.meituan.android.privacy.locate.lifecycle.b
    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e93ae9c47c60a07ed939337cc2a8b7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e93ae9c47c60a07ed939337cc2a8b7a");
            return;
        }
        this.b.add(cVar);
        if (this.d) {
            cVar.c();
        } else if (this.c) {
            cVar.a();
        } else {
            cVar.b();
        }
    }

    private static <T> List<T> a(Collection<T> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e994b0e7ff8ccff500eb2fed5937242", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e994b0e7ff8ccff500eb2fed5937242");
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c276ceac3441b27b681fab048dba3e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c276ceac3441b27b681fab048dba3e3");
            return;
        }
        this.c = true;
        for (c cVar : a(this.b)) {
            cVar.a();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e874ca7035253103d9a40c0c443439", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e874ca7035253103d9a40c0c443439");
            return;
        }
        this.c = false;
        for (c cVar : a(this.b)) {
            cVar.b();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "498341dcba26049115a44a7e57d7cfd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "498341dcba26049115a44a7e57d7cfd7");
            return;
        }
        this.d = true;
        for (c cVar : a(this.b)) {
            cVar.c();
        }
    }
}
