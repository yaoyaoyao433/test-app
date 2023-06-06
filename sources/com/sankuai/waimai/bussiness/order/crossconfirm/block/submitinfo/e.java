package com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.MultiPoiOrderPreviewResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.meituan.android.cube.pga.viewmodel.a<MultiPoiOrderPreviewResult> {
    public static ChangeQuickRedirect o;
    final d p;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e235f10b4e140f1994dbb81505704677", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e235f10b4e140f1994dbb81505704677");
        } else {
            this.p = new d();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e68a9ede71e2e71e56d3709b2a1a7eae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e68a9ede71e2e71e56d3709b2a1a7eae");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p.b = null;
            this.p.c = 0.0d;
            this.p.d = ((MultiPoiOrderPreviewResult) this.c).total;
            this.p.e = 0.0d;
            this.p.f = 0.0d;
            this.p.g = ((MultiPoiOrderPreviewResult) this.c).totalDiscountPrice;
            return;
        }
        this.p.b = null;
        this.p.c = 0.0d;
        this.p.d = 0.0d;
        this.p.e = 0.0d;
        this.p.f = 0.0d;
        this.p.g = 0.0d;
    }
}
