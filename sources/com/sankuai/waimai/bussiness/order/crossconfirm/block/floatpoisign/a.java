package com.sankuai.waimai.bussiness.order.crossconfirm.block.floatpoisign;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.meituan.android.cube.pga.type.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.floatpoisign.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.root.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a<CT extends com.meituan.android.cube.pga.type.a & h> extends com.meituan.android.cube.pga.block.a<b, c, CT> {
    public static ChangeQuickRedirect r;

    public static /* synthetic */ void a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "607af24a46f1f3d91e5c0efe64769490", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "607af24a46f1f3d91e5c0efe64769490");
            return;
        }
        int max = Math.max(0, Math.min(i, ((c) aVar.n).n() - 1));
        ((c) aVar.n).p = max;
        aVar.I();
        ((h) aVar.F()).w().a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(max));
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "082c80203e5c054580fe064384ea3eb2", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "082c80203e5c054580fe064384ea3eb2") : new c();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5501a55eff310af243e3eceafb0cdba4", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5501a55eff310af243e3eceafb0cdba4") : new b(m(), this.h);
    }

    public a(CT ct, ViewStub viewStub) {
        super(ct, viewStub);
        Object[] objArr = {ct, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "119f51a8b176c0b27d6e8bef719c00a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "119f51a8b176c0b27d6e8bef719c00a0");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3245ce840122a4e0ffdfc21024817eb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3245ce840122a4e0ffdfc21024817eb3");
            return;
        }
        super.s();
        ((b) this.g).e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.floatpoisign.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e193f9caa465eee4dc8ca3bed6be28d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e193f9caa465eee4dc8ca3bed6be28d");
                    return;
                }
                a.a(a.this, ((c) a.this.n).p - 1);
                JudasManualManager.b("b_waimai_uxt5aije_mc").a("c_ykhs39e").a(a.this.l()).a();
            }
        });
        ((b) this.g).f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.floatpoisign.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e85eccfe5a31974a28b934418629bce6", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e85eccfe5a31974a28b934418629bce6");
                    return;
                }
                a.a(a.this, ((c) a.this.n).p + 1);
                JudasManualManager.b("b_waimai_uxt5aije_mc").a("c_ykhs39e").a(a.this.l()).a();
            }
        });
        ((h) F()).y().a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.floatpoisign.a.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b2190c613439530cb8f04a33898fa18", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b2190c613439530cb8f04a33898fa18");
                    return;
                }
                ((c) a.this.n).p = num2.intValue();
                a.this.I();
            }
        });
        JudasManualManager.b("b_waimai_uxt5aije_mv").a("c_ykhs39e").a(l()).a();
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bdf70da64d5195110a1929ab7b2a3b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bdf70da64d5195110a1929ab7b2a3b2");
            return;
        }
        super.I();
        b.a aVar = new b.a();
        aVar.a = ((c) this.n).p + 1;
        aVar.b = ((c) this.n).n();
        b bVar = (b) this.g;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "9c7046cdd33fac51026f58fc0e5f3c9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "9c7046cdd33fac51026f58fc0e5f3c9c");
            return;
        }
        bVar.g.setText(String.valueOf(aVar.a));
        TextView textView = bVar.h;
        textView.setText("/" + String.valueOf(aVar.b));
    }
}
