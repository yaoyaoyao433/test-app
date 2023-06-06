package com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood;

import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodParams;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e8e69d8bbeaafe11840deb6295dbb7", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e8e69d8bbeaafe11840deb6295dbb7") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8110ca2f859a05aba8797b52727228f1", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8110ca2f859a05aba8797b52727228f1") : new b(m(), this.h, (f) F(), ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).X.a().b);
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9357ad5eb335a6369b86083accce20d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9357ad5eb335a6369b86083accce20d3");
            return;
        }
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).Y.b = new com.meituan.android.cube.pga.action.c<CollectOrderFoodParams, Boolean>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ Boolean a(CollectOrderFoodParams collectOrderFoodParams) {
                CollectOrderFoodParams collectOrderFoodParams2 = collectOrderFoodParams;
                Object[] objArr2 = {collectOrderFoodParams2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f704771506fbd7b5d87f7dfed352002d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f704771506fbd7b5d87f7dfed352002d");
                }
                ((b) a.this.g).a(collectOrderFoodParams2);
                return Boolean.TRUE;
            }
        };
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).Z.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88795fc600080c9ec625d619b1b095b9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88795fc600080c9ec625d619b1b095b9");
                }
                ((b) a.this.g).f();
                return Boolean.TRUE;
            }
        };
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).aa.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.a.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5663869781724f954580fe086e770bb", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5663869781724f954580fe086e770bb") : Boolean.valueOf(((b) a.this.g).e());
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6e0a80a482e95706a9812230a03df36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6e0a80a482e95706a9812230a03df36");
        } else {
            super.I();
        }
    }
}
