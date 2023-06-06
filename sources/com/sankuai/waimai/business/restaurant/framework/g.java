package com.sankuai.waimai.business.restaurant.framework;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.meituan.android.cube.pga.type.a;
import com.meituan.android.cube.pga.view.a;
import com.meituan.android.cube.pga.viewmodel.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class g<ViewType extends com.meituan.android.cube.pga.view.a, ViewModelType extends com.meituan.android.cube.pga.viewmodel.a, ContextType extends com.meituan.android.cube.pga.type.a> extends com.meituan.android.cube.pga.block.a<ViewType, ViewModelType, ContextType> {
    public static ChangeQuickRedirect s;

    public g(ContextType contexttype) {
        super(contexttype);
        Object[] objArr = {contexttype};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d05818c39e460f2db8175ad57046a13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d05818c39e460f2db8175ad57046a13");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void a(com.meituan.android.cube.pga.block.a aVar, ViewGroup viewGroup) {
        Object[] objArr = {aVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af319eadd00f2ebbc6f56a7a560c4e70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af319eadd00f2ebbc6f56a7a560c4e70");
            return;
        }
        super.a(aVar, viewGroup);
        b((g<ViewType, ViewModelType, ContextType>) aVar);
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void b(com.meituan.android.cube.pga.block.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27298049c9a735b62970bb33b162eded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27298049c9a735b62970bb33b162eded");
            return;
        }
        super.b(bVar);
        b((g<ViewType, ViewModelType, ContextType>) bVar);
    }

    @Override // com.meituan.android.cube.core.f
    public final void a(@NonNull com.meituan.android.cube.core.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74410b050477fe2173184210639714b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74410b050477fe2173184210639714b5");
            return;
        }
        try {
            super.a(bVar, i);
        } catch (Exception unused) {
        }
    }

    @Override // com.meituan.android.cube.core.f
    public void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fc9cf0477d9023afaf4e7c6cb1ac3c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fc9cf0477d9023afaf4e7c6cb1ac3c5");
        } else {
            super.bE_();
        }
    }
}
