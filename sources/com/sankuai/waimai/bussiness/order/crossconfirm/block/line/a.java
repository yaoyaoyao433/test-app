package com.sankuai.waimai.bussiness.order.crossconfirm.block.line;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, c, com.meituan.android.cube.pga.type.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e4f42d9fa5ec616e8f8cc440d2a4ad3", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e4f42d9fa5ec616e8f8cc440d2a4ad3") : new c();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b334d3127294688eb53e72c6431a460", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b334d3127294688eb53e72c6431a460") : new b(m());
    }

    public a(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c512af0f8c707cf9301415e8b37450d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c512af0f8c707cf9301415e8b37450d");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "917e9e6d8b55d4b0d1db5de4aa2bca27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "917e9e6d8b55d4b0d1db5de4aa2bca27");
        } else {
            super.c(obj);
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0885e1ddf18403bcc63561c1560b8145", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0885e1ddf18403bcc63561c1560b8145");
        } else {
            super.I();
        }
    }
}
