package com.sankuai.waimai.store.order.detail.block;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.detail.model.LogisticsInfo;
import java.io.Serializable;
/* compiled from: ProGuard */
@DynamicBinder(modelType = b.class, nativeId = {"supermarket_order_order_status_logistics_entrance_style_1"}, viewModel = c.class)
/* loaded from: classes5.dex */
public class h extends com.meituan.android.cube.pga.block.a<a, c, com.sankuai.waimai.business.order.api.detail.block.b> {
    public static ChangeQuickRedirect r;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements Serializable {
        @SerializedName("logistics_info")
        public LogisticsInfo a;
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ec6b929630bfe737af0c7e8e21fd514", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ec6b929630bfe737af0c7e8e21fd514") : new c();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b6a7353a122997f0e3c8aefbc5caf88", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b6a7353a122997f0e3c8aefbc5caf88") : new a(m());
    }

    public h(com.sankuai.waimai.business.order.api.detail.block.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65c3074b9c1defe94815770e37f27ff6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65c3074b9c1defe94815770e37f27ff6");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8432551247beaa60e8698c6b988f286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8432551247beaa60e8698c6b988f286");
            return;
        }
        super.I();
        Long a2 = ((com.sankuai.waimai.business.order.api.detail.block.b) F()).j().a();
        com.sankuai.waimai.business.order.api.detail.model.a a3 = ((com.sankuai.waimai.business.order.api.detail.block.b) F()).l() == null ? null : ((com.sankuai.waimai.business.order.api.detail.block.b) F()).l().a();
        r().a(((c) this.n).e().a, a2, ((com.sankuai.waimai.business.order.api.detail.block.b) F()).i().a(), a3 != null ? true ^ a3.b() : true);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.store.order.detail.blockview.d {
        public static ChangeQuickRedirect d;

        @Override // com.sankuai.waimai.store.order.detail.blockview.d
        public final boolean e() {
            return false;
        }

        public a(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51da90501d5c279fa193ba77ebca6ddf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51da90501d5c279fa193ba77ebca6ddf");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c extends com.meituan.android.cube.pga.viewmodel.a<b> {
        public static ChangeQuickRedirect o;

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final Boolean c() {
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4e1b353c9f0047120a41faba547a776", RobustBitConfig.DEFAULT_VALUE)) {
                return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4e1b353c9f0047120a41faba547a776");
            }
            if (this.c != 0 && ((b) this.c).a != null && ((b) this.c).a.desc != null) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }
}
