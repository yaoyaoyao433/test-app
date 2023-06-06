package com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks;

import android.support.annotation.NonNull;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.b;
import com.sankuai.waimai.foundation.utils.r;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.a, a, com.sankuai.waimai.bussiness.order.detailnew.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a60b1547e889031675a85fb3a3de417", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a60b1547e889031675a85fb3a3de417") : new a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e03ce761bf71f7a98cc9438b0a71b28", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e03ce761bf71f7a98cc9438b0a71b28") : new com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.a(m(), this.h);
    }

    public e(com.sankuai.waimai.bussiness.order.detailnew.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a29be5c0a8f53a438f3323ada94d1e09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a29be5c0a8f53a438f3323ada94d1e09");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "176e3be3e27c51fcf2752c76aa3143df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "176e3be3e27c51fcf2752c76aa3143df");
            return;
        }
        super.I();
        ((com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.a) this.g).a(((a) this.n).p);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends com.meituan.android.cube.pga.viewmodel.a<Map<String, Object>> {
        public static ChangeQuickRedirect o;
        @NonNull
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.b p;

        public a() {
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b89770bab2364ac383c7adf819466bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b89770bab2364ac383c7adf819466bd");
            } else {
                this.p = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.b();
            }
        }

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final void d() {
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.b bVar;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aae51d77f3aa92dc948fc9b91345ee3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aae51d77f3aa92dc948fc9b91345ee3");
                return;
            }
            super.d();
            if (this.c != 0) {
                Map map = (Map) this.c;
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.b.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "40c372e86c48ed32dab18f59482eeb23", RobustBitConfig.DEFAULT_VALUE)) {
                    bVar = (com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "40c372e86c48ed32dab18f59482eeb23");
                } else {
                    bVar = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.b();
                    bVar.b = String.valueOf(map.get("id"));
                    StringBuilder sb = new StringBuilder();
                    sb.append(map.get("wm_poi_id"));
                    bVar.c = r.a(sb.toString(), 0L);
                    bVar.d = String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
                    bVar.e = (b.a) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(map.get("share_order_info")), (Class<Object>) b.a.class);
                }
                this.p = bVar;
            }
        }
    }
}
