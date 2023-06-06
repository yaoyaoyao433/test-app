package com.sankuai.waimai.store.order.detail.block;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.store.model.ActivityEntryInfo;
import java.util.List;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"wm_order_detail_order_promotion_template"}, viewModel = a.class)
/* loaded from: classes5.dex */
public class g extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.store.order.detail.blockview.i, a, com.sankuai.waimai.business.order.api.detail.block.d> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abb1652db7d50ccf8a6dd68ef8836da4", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abb1652db7d50ccf8a6dd68ef8836da4") : new a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.store.order.detail.blockview.i z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4efa16b31bde714b1b8a8a57825d1b0", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.detail.blockview.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4efa16b31bde714b1b8a8a57825d1b0") : new com.sankuai.waimai.store.order.detail.blockview.i(m());
    }

    public g(com.sankuai.waimai.business.order.api.detail.block.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9920dc5699ae8649be8c94ac72e1f6ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9920dc5699ae8649be8c94ac72e1f6ae");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a6c6d698ca5fcf16dad325caa9d8d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a6c6d698ca5fcf16dad325caa9d8d3");
            return;
        }
        super.I();
        String a2 = ((com.sankuai.waimai.business.order.api.detail.block.d) F()).i().a();
        com.meituan.android.cube.pga.common.d<Boolean> a3 = ((com.sankuai.waimai.business.order.api.detail.block.d) F()).s().a();
        com.meituan.android.cube.pga.common.d<Integer> a4 = ((com.sankuai.waimai.business.order.api.detail.block.d) F()).t().a();
        r().a((List) com.sankuai.waimai.store.util.i.a(((a) this.n).e(), new TypeToken<List<ActivityEntryInfo>>() { // from class: com.sankuai.waimai.store.order.detail.block.g.1
        }.getType()), String.valueOf(((com.sankuai.waimai.business.order.api.detail.block.d) F()).j().a()), a2, a3.b(), a4.c());
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6767e1848db5fe88cda665b9ee23bc14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6767e1848db5fe88cda665b9ee23bc14");
            return;
        }
        super.s();
        ((com.sankuai.waimai.business.order.api.detail.block.d) F()).d().a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.store.order.detail.block.g.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e19f4645ecdab9c1c9134b3f5edf9c41", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e19f4645ecdab9c1c9134b3f5edf9c41");
                } else if (bool2.booleanValue()) {
                    com.sankuai.waimai.store.order.detail.blockview.i iVar = (com.sankuai.waimai.store.order.detail.blockview.i) g.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.detail.blockview.i.d;
                    if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "35cdcb3558874134038fa1fb55e5e334", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "35cdcb3558874134038fa1fb55e5e334");
                    } else {
                        com.sankuai.waimai.store.expose.v2.b.a().c(iVar);
                    }
                }
            }
        });
        ((com.sankuai.waimai.business.order.api.detail.block.d) F()).c().a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.store.order.detail.block.g.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1262249faa005de9020ba11684016d6e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1262249faa005de9020ba11684016d6e");
                } else if (bool2.booleanValue()) {
                    com.sankuai.waimai.store.order.detail.blockview.i iVar = (com.sankuai.waimai.store.order.detail.blockview.i) g.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.detail.blockview.i.d;
                    if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "5524d336a5f3cbe41a667d286681f694", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "5524d336a5f3cbe41a667d286681f694");
                    } else {
                        com.sankuai.waimai.store.expose.v2.b.a().e(iVar);
                    }
                }
            }
        });
        ((com.sankuai.waimai.business.order.api.detail.block.d) F()).e().a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.store.order.detail.block.g.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe74e4bf4bb832c18a7570477741128c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe74e4bf4bb832c18a7570477741128c");
                } else if (bool2.booleanValue()) {
                    com.sankuai.waimai.store.order.detail.blockview.i iVar = (com.sankuai.waimai.store.order.detail.blockview.i) g.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.detail.blockview.i.d;
                    if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "44cef20619da686b2dc16b2d2ad7445b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "44cef20619da686b2dc16b2d2ad7445b");
                    } else {
                        com.sankuai.waimai.store.expose.v2.b.a().f(iVar);
                    }
                }
            }
        });
        ((com.sankuai.waimai.business.order.api.detail.block.d) F()).q().a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.store.order.detail.block.g.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6fa2bb38f5424b2a06757a5325220493", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6fa2bb38f5424b2a06757a5325220493");
                } else if (num2 == null) {
                } else {
                    com.sankuai.waimai.store.order.detail.blockview.i r2 = g.this.r();
                    int intValue = num2.intValue();
                    Object[] objArr3 = {Integer.valueOf(intValue)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.detail.blockview.i.d;
                    if (PatchProxy.isSupport(objArr3, r2, changeQuickRedirect3, false, "b33b07ec347671f748a3b54afc151552", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, r2, changeQuickRedirect3, false, "b33b07ec347671f748a3b54afc151552");
                    } else {
                        r2.b(intValue);
                    }
                }
            }
        });
        ((com.sankuai.waimai.business.order.api.detail.block.d) F()).r().a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.store.order.detail.block.g.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e1554a049d9971b8c8253ff561f793d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e1554a049d9971b8c8253ff561f793d");
                } else if (num2 == null) {
                } else {
                    g.this.r().a(num2.intValue());
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.meituan.android.cube.pga.viewmodel.a<String> {
        public static ChangeQuickRedirect o;

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final Boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ede21b887a35afb2b3102303a8d115b7", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ede21b887a35afb2b3102303a8d115b7") : Boolean.valueOf(!TextUtils.isEmpty((CharSequence) this.c));
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "591398674e67bab4ab2f70491dfa5755", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "591398674e67bab4ab2f70491dfa5755");
            return;
        }
        super.bE_();
        com.sankuai.waimai.store.order.detail.blockview.i r2 = r();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.order.detail.blockview.i.d;
        if (PatchProxy.isSupport(objArr2, r2, changeQuickRedirect2, false, "5fbd8c7dc542db0e2586633187c88105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, r2, changeQuickRedirect2, false, "5fbd8c7dc542db0e2586633187c88105");
        } else {
            com.sankuai.waimai.store.expose.v2.b.a().b(r2);
        }
    }
}
