package com.sankuai.waimai.store.order.detail.block;

import android.text.TextUtils;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
import org.json.JSONObject;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"wm_order_detail_sg_drug_consultation_template"}, viewModel = C1251a.class)
/* loaded from: classes5.dex */
public class a extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.store.order.detail.blockview.a, C1251a, com.sankuai.waimai.business.order.api.detail.block.b> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "712f728ddf8fa845484256badab22732", RobustBitConfig.DEFAULT_VALUE) ? (C1251a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "712f728ddf8fa845484256badab22732") : new C1251a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.store.order.detail.blockview.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2ba0f12e86dcbc4af98afcc9b3ce631", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.detail.blockview.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2ba0f12e86dcbc4af98afcc9b3ce631") : new com.sankuai.waimai.store.order.detail.blockview.a(m());
    }

    public a(com.sankuai.waimai.business.order.api.detail.block.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a959ae14edd62b6ceec2a6737ec71ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a959ae14edd62b6ceec2a6737ec71ee");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "704906452a804681e2525a5df4a97c4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "704906452a804681e2525a5df4a97c4c");
            return;
        }
        super.I();
        a(0, 0, 0, com.sankuai.waimai.foundation.utils.g.a(m(), 167.0f));
        Long a = ((com.sankuai.waimai.business.order.api.detail.block.b) F()).j().a();
        com.sankuai.waimai.store.order.detail.blockview.a r2 = r();
        String e = ((C1251a) this.n).e();
        Object[] objArr2 = {e, a};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.order.detail.blockview.a.d;
        if (PatchProxy.isSupport(objArr2, r2, changeQuickRedirect2, false, "559d88cff554d2d4a5a2f8c430a798fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, r2, changeQuickRedirect2, false, "559d88cff554d2d4a5a2f8c430a798fc");
            return;
        }
        try {
            r2.e.a((DrugImEntranceEntity) com.sankuai.waimai.store.util.i.a(new JSONObject(e).optString("pharmacist_consultation_entrance"), DrugImEntranceEntity.class), 50, a.longValue(), "");
        } catch (Exception unused) {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.order.detail.block.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1251a extends com.meituan.android.cube.pga.viewmodel.a<String> {
        public static ChangeQuickRedirect o;

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final Boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "466922b6420931517035f96e6d8b91d8", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "466922b6420931517035f96e6d8b91d8") : Boolean.valueOf(!TextUtils.isEmpty((CharSequence) this.c));
        }
    }
}
