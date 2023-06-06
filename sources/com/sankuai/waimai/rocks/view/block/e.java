package com.sankuai.waimai.rocks.view.block;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.view.block.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends d {
    public static ChangeQuickRedirect t;

    @Override // com.sankuai.waimai.rocks.view.block.d
    public final void a(com.sankuai.waimai.rocks.view.viewmodel.a aVar) {
    }

    public e(com.sankuai.waimai.rocks.view.mach.a aVar, c cVar, d.b bVar, d.a aVar2) {
        super(aVar, cVar, bVar, aVar2);
        Object[] objArr = {aVar, cVar, bVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af3cfc4d42e8e67a65313ce73c8df9dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af3cfc4d42e8e67a65313ce73c8df9dd");
        }
    }

    @Override // com.sankuai.waimai.rocks.view.block.d, com.meituan.android.cube.pga.block.a
    /* renamed from: P */
    public final com.sankuai.waimai.rocks.view.mach.e z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3defe28e15d89d114a0c4b3b7e7d4fd6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.rocks.view.mach.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3defe28e15d89d114a0c4b3b7e7d4fd6");
        }
        if (this.h == null) {
            return new com.sankuai.waimai.rocks.view.mach.e(m());
        }
        return new com.sankuai.waimai.rocks.view.mach.e(m(), this.h);
    }
}
