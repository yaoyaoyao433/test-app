package com.sankuai.waimai.bussiness.order.confirm.pgablock.collectfood;

import android.view.ViewStub;
import com.meituan.android.cube.pga.action.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodParams;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.confirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d70799cf8ddbd3a8b8590cfe680ed75", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d70799cf8ddbd3a8b8590cfe680ed75") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "709680ec5ce3fc97e644711f2eca4abc", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "709680ec5ce3fc97e644711f2eca4abc") : new b(m(), this.h, (f) F(), ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aC.a().b);
    }

    public a(com.sankuai.waimai.bussiness.order.confirm.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "634cefb13730e8e9544e4ef0df77828d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "634cefb13730e8e9544e4ef0df77828d");
            return;
        }
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aD.b = new c<CollectOrderFoodParams, Boolean>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.collectfood.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ Boolean a(CollectOrderFoodParams collectOrderFoodParams) {
                CollectOrderFoodParams collectOrderFoodParams2 = collectOrderFoodParams;
                Object[] objArr2 = {collectOrderFoodParams2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45cc8c0f760360889a3eb3d8f1515eb9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45cc8c0f760360889a3eb3d8f1515eb9");
                }
                ((b) a.this.g).a(collectOrderFoodParams2);
                return Boolean.TRUE;
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aE.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.collectfood.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75ae5f2e3d2d5c8fdd838005fe9ee989", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75ae5f2e3d2d5c8fdd838005fe9ee989");
                }
                ((b) a.this.g).f();
                return Boolean.TRUE;
            }
        };
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aF.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.collectfood.a.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99454b88c05befc88f700ecba99b4b50", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99454b88c05befc88f700ecba99b4b50") : Boolean.valueOf(((b) a.this.g).e());
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb4b9ba6d18a633967f79add754bbd03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb4b9ba6d18a633967f79add754bbd03");
        } else {
            super.I();
        }
    }
}
