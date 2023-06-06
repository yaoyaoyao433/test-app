package com.sankuai.waimai.rocks.view.block;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b<T> extends com.meituan.android.cube.pga.block.a {
    public static ChangeQuickRedirect s;
    public Context t;
    public View u;
    public T v;

    @Override // com.meituan.android.cube.pga.block.a
    public View a(ViewGroup viewGroup) {
        return viewGroup;
    }

    public void d(T t) {
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        return null;
    }

    public b() {
    }

    public b(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a505ff3e9261e9210dbb6fd5a524905b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a505ff3e9261e9210dbb6fd5a524905b");
        } else {
            this.t = aVar.a();
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public void a(com.meituan.android.cube.pga.viewmodel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b7673b145c56152be9f459c06d4c26f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b7673b145c56152be9f459c06d4c26f");
            return;
        }
        super.a((b<T>) aVar);
        if (aVar != null) {
            this.v = (T) aVar.f();
            d((b<T>) this.v);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.core.f
    public final View i() {
        return this.u;
    }

    public final View b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e561d6a521228b38ade6d70599ad29", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e561d6a521228b38ade6d70599ad29");
        }
        if (this.u == null) {
            this.u = a(viewGroup);
        }
        return this.u;
    }
}
