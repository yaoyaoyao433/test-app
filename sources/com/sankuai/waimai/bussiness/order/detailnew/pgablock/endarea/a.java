package com.sankuai.waimai.bussiness.order.detailnew.pgablock.endarea;

import android.content.Context;
import android.support.constraint.R;
import android.widget.Space;
import android.widget.TextView;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.util.g;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"order_end_area_info"}, viewModel = b.class)
/* loaded from: classes4.dex */
public class a extends com.meituan.android.cube.pga.block.a<C0915a, b, com.sankuai.waimai.bussiness.order.detailnew.a> {
    public static ChangeQuickRedirect r;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b extends com.meituan.android.cube.pga.viewmodel.a {
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bda18e803b9f25a0e9d498786df3ee5b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bda18e803b9f25a0e9d498786df3ee5b") : new b();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ C0915a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a01f9829a4fe9e3e98e14d0cda80fed", RobustBitConfig.DEFAULT_VALUE) ? (C0915a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a01f9829a4fe9e3e98e14d0cda80fed") : new C0915a(m());
    }

    public a(com.sankuai.waimai.bussiness.order.detailnew.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "866979d0e4e3d142dc80e5307340ce1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "866979d0e4e3d142dc80e5307340ce1e");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee29cdd3dfa95add9e9e6d5578e4ba3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee29cdd3dfa95add9e9e6d5578e4ba3e");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).T.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.endarea.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b76480f263139d9e890638d6475fd4c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b76480f263139d9e890638d6475fd4c");
                } else if (bool2 != null) {
                    C0915a r2 = a.this.r();
                    int i = bool2.booleanValue() ? 0 : 8;
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = C0915a.d;
                    if (PatchProxy.isSupport(objArr3, r2, changeQuickRedirect3, false, "6290f95832a913638d488cf667ffaa21", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, r2, changeQuickRedirect3, false, "6290f95832a913638d488cf667ffaa21");
                    } else {
                        r2.e.setVisibility(i);
                    }
                }
            }
        });
        g.a(((C0915a) this.g).a(), 0);
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4748f153015bf23ff728a84be459ec11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4748f153015bf23ff728a84be459ec11");
            return;
        }
        super.I();
        com.sankuai.waimai.business.order.api.detail.model.a a = ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).J.a();
        if (a != null) {
            C0915a c0915a = (C0915a) this.g;
            int i = a.b() ? 0 : 8;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = C0915a.d;
            if (PatchProxy.isSupport(objArr2, c0915a, changeQuickRedirect2, false, "eb8bdb9047b682e0591ccf96187935b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c0915a, changeQuickRedirect2, false, "eb8bdb9047b682e0591ccf96187935b6");
            } else {
                c0915a.f.setVisibility(i);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.detailnew.pgablock.endarea.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0915a extends com.meituan.android.cube.pga.view.a {
        public static ChangeQuickRedirect d;
        TextView e;
        Space f;

        @Override // com.meituan.android.cube.pga.view.a
        public final int d() {
            return R.layout.wm_order_detail_child_end_area_block;
        }

        public C0915a(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bf087091e0b12c4286c40424a4d6d1e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bf087091e0b12c4286c40424a4d6d1e");
            }
        }

        @Override // com.meituan.android.cube.pga.view.a
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f29d9b6383bd9a39127ceabf80d0e99", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f29d9b6383bd9a39127ceabf80d0e99");
                return;
            }
            super.b();
            this.e = (TextView) this.b.findViewById(R.id.end_bottom_text);
            this.f = (Space) this.b.findViewById(R.id.end_bottom_space);
        }
    }
}
