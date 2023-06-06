package com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.meituan.android.cube.pga.viewmodel.a<PoiOrderPreviewResult> {
    public static ChangeQuickRedirect o;
    f p;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "becaa24d6d5ec0211482c9209c0296a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "becaa24d6d5ec0211482c9209c0296a9");
        } else {
            this.p = new f();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b700bfc5f140075589042e7ce79020e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b700bfc5f140075589042e7ce79020e");
            return;
        }
        super.d();
        this.p.b = true;
        if (this.c != 0) {
            this.p.c = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiId : -1L;
            this.p.d = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiIdStr : "";
            this.p.g = ((PoiOrderPreviewResult) this.c).flowerCakeField;
            this.p.f = ((PoiOrderPreviewResult) this.c).phoneField;
            this.p.e = ((PoiOrderPreviewResult) this.c).templateType;
            this.p.f.mPhoneCodeOptions = ((PoiOrderPreviewResult) this.c).phoneField.mPhoneCodeOptions;
            return;
        }
        this.p.c = -1L;
        this.p.d = "";
        this.p.g = null;
        this.p.f = null;
        this.p.e = 0;
    }
}
