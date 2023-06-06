package com.sankuai.waimai.platform.rocks.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.meituan.android.cube.pga.block.a<c, com.sankuai.waimai.rocks.view.recyclerview.footer.c, com.sankuai.waimai.rocks.view.block.c> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final /* synthetic */ void a(com.meituan.android.cube.pga.viewmodel.a aVar) {
        com.sankuai.waimai.rocks.view.recyclerview.footer.c cVar = (com.sankuai.waimai.rocks.view.recyclerview.footer.c) aVar;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55682c716b4a28ff199d71238a77319f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55682c716b4a28ff199d71238a77319f");
            return;
        }
        super.a((a) cVar);
        ((c) this.g).a(cVar.e() == null ? new com.sankuai.waimai.rocks.view.recyclerview.footer.b(1, "") : cVar.e());
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c892af80e9ae2659855f718e780e20", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c892af80e9ae2659855f718e780e20") : new c(m());
    }

    public a() {
    }

    public a(com.sankuai.waimai.rocks.view.block.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb79a8390b7ade45d930a78f917dc454", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb79a8390b7ade45d930a78f917dc454");
        }
    }
}
