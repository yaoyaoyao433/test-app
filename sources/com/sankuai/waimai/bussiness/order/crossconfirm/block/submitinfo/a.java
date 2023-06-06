package com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo;

import android.support.constraint.R;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<c, e, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0518197d420e43873aea2fba93d8cc8b", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0518197d420e43873aea2fba93d8cc8b") : new e();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c4abe64f9cc856ef8c3828912131f30", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c4abe64f9cc856ef8c3828912131f30") : new c(m(), this.h, (com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f40ab6a1927fd46dc5d0c5aa8c47da3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f40ab6a1927fd46dc5d0c5aa8c47da3");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2480e558da7c24c83b9da7cbe4d65450", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2480e558da7c24c83b9da7cbe4d65450");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).ab.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3544539c55fb1a2042379c650251996a", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3544539c55fb1a2042379c650251996a") : ((c) a.this.g).e;
            }
        };
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).ac.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1dc40f691505fcf590c17e1cae8d3357", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1dc40f691505fcf590c17e1cae8d3357");
                }
                c cVar = (c) a.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "e4c68be770e9f4ab9978ac90fad70ffb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "e4c68be770e9f4ab9978ac90fad70ffb");
                    return null;
                }
                cVar.f.setText(R.string.wm_order_confirm_submit);
                return null;
            }
        };
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).ad.a(new com.meituan.android.cube.pga.action.b<String>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.a.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(String str) {
                String str2 = str;
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b0b76098b62d518bb4aef7627ed3406", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b0b76098b62d518bb4aef7627ed3406");
                    return;
                }
                c cVar = (c) a.this.g;
                Object[] objArr3 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "de50243383cf42b9bb95f68ba57b8232", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "de50243383cf42b9bb95f68ba57b8232");
                } else {
                    cVar.f.setText(str2);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).ae.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.a.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85384e18015ea5a028c7b9fff73c70f9", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85384e18015ea5a028c7b9fff73c70f9") : a.this.i();
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c75d4a86c1733145be5762a329be915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c75d4a86c1733145be5762a329be915");
            return;
        }
        super.I();
        c cVar = (c) this.g;
        d dVar = ((e) this.n).p;
        int c = ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).T.a().c();
        Object[] objArr2 = {dVar, Integer.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "e193e5be41096bdaecb28f152abfcb31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "e193e5be41096bdaecb28f152abfcb31");
        } else {
            cVar.a(dVar, c);
        }
    }
}
