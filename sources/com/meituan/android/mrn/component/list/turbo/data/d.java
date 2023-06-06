package com.meituan.android.mrn.component.list.turbo.data;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d<V extends View> implements c<V> {
    public static ChangeQuickRedirect a;
    private final List<V> b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a05d9f2db71465d300a8e1f8b36f6c55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a05d9f2db71465d300a8e1f8b36f6c55");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // com.meituan.android.mrn.component.list.turbo.data.c
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25f1044d80b1a142b1abaebe1730e981", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25f1044d80b1a142b1abaebe1730e981")).intValue() : this.b.size();
    }

    public final V a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a7d6d2fd736ef55b5bb607f2ede5ba", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a7d6d2fd736ef55b5bb607f2ede5ba") : this.b.get(i);
    }

    public final void a(V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27739e628adbb1a85eb3a4eb6ecb4ef1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27739e628adbb1a85eb3a4eb6ecb4ef1");
        } else if (this.b.contains(v)) {
        } else {
            this.b.add(v);
        }
    }
}
