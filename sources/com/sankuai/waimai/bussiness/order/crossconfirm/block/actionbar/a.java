package com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar;

import android.app.Activity;
import android.view.ViewStub;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<c, e, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1de4508adddcd9a3b84298891147205", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1de4508adddcd9a3b84298891147205") : new e();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e38bac2fac6c9dfd29b70dfa34016dd", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e38bac2fac6c9dfd29b70dfa34016dd") : new c(m(), this.h);
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54da655be87ea4a0918d640018474fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54da655be87ea4a0918d640018474fd");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb468a36b228a11b0210d44e83fb7dcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb468a36b228a11b0210d44e83fb7dcf");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).W.a(new com.meituan.android.cube.pga.action.b<Float>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Float f) {
                Float f2 = f;
                Object[] objArr2 = {f2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c17e6391049d012b9671798929319ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c17e6391049d012b9671798929319ba");
                } else {
                    ((c) a.this.g).a(((e) a.this.n).p, f2.floatValue());
                }
            }
        });
        ((c) this.g).e();
        ((c) this.g).a(((e) this.n).p, 0.0f);
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b57dc3f7a18fee55132c02da7e7a2d9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b57dc3f7a18fee55132c02da7e7a2d9c");
            return;
        }
        super.I();
        ((c) this.g).a((CharSequence) ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).E.a().a());
        ((c) this.g).f = new c.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c.a
            public final void a(Activity activity) {
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b1e05c0e0e825e7926285d7a25df2b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b1e05c0e0e825e7926285d7a25df2b5");
                } else {
                    com.sankuai.waimai.bussiness.order.base.a.a((Activity) a.this.m(), ((e) a.this.n).p.b, ((e) a.this.n).p.c, ((e) a.this.n).p.f);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c.a
            public final void a(long j, int i) {
                Object[] objArr2 = {new Long(j), 0};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53496807a77af82924787f33b3eb3993", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53496807a77af82924787f33b3eb3993");
                } else {
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.a) a.this.F()).U.a((com.meituan.android.cube.pga.common.b<i.c<Long, Integer>>) i.a(Long.valueOf(j), 0));
                }
            }
        };
        ((c) this.g).a(((e) this.n).p, ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).O.a().b);
    }
}
