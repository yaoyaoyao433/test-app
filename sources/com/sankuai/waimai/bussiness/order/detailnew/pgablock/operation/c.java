package com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation;

import android.os.Bundle;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderExtInfo;
import com.sankuai.waimai.platform.utils.l;
import java.text.DecimalFormat;
/* compiled from: ProGuard */
@DynamicBinder(modelType = d.class, nativeId = {"waimai_order_order_status_operation_area_style_1"}, viewModel = f.class)
/* loaded from: classes4.dex */
public class c extends com.meituan.android.cube.pga.block.a<e, f, com.sankuai.waimai.bussiness.order.detailnew.a> {
    public static ChangeQuickRedirect r;
    private String s;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ec13aff2b986a48e77074a79f599998", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ec13aff2b986a48e77074a79f599998") : new f();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ e z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4404133371783669b654d6ca70d729b8", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4404133371783669b654d6ca70d729b8") : new e(m());
    }

    public c(com.sankuai.waimai.bussiness.order.detailnew.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "081f5e1062776713b76c966ec384c436", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "081f5e1062776713b76c966ec384c436");
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16a247f9150c23a79f76fc5fae441d27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16a247f9150c23a79f76fc5fae441d27");
            return;
        }
        super.bE_();
        if (com.sankuai.waimai.foundation.core.a.d()) {
            return;
        }
        l.cancel(this.s);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.s);
        e eVar = (e) this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.d;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "b7e5128e76b5adfe9927727864b1c12c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "b7e5128e76b5adfe9927727864b1c12c");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6d5af2033223348945297e77d819767", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6d5af2033223348945297e77d819767");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).h.a(new com.meituan.android.cube.pga.action.b<Bundle>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Bundle bundle) {
                Object[] objArr2 = {bundle};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47f6fc1811ef4f02b237636ff05cca85", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47f6fc1811ef4f02b237636ff05cca85");
                    return;
                }
                c cVar = c.this;
                cVar.s = getClass().getSimpleName() + System.currentTimeMillis();
                if (com.sankuai.waimai.foundation.core.a.d()) {
                    return;
                }
                e eVar = (e) c.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = e.d;
                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "7dd8c723d7dee0294d079a1f15a18b2d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "7dd8c723d7dee0294d079a1f15a18b2d");
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aA.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.operation.c.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f35ce9aca97518ab79208ac081886be5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f35ce9aca97518ab79208ac081886be5");
                    return;
                }
                com.sankuai.waimai.bussiness.order.detailnew.util.a.a(num2);
                com.meituan.android.cube.pga.view.a unused = c.this.g;
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d204e19ca5444072f1d24258432c1b58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d204e19ca5444072f1d24258432c1b58");
            return;
        }
        super.I();
        d e = ((f) this.n).e();
        if (e != null) {
            b bVar = new b();
            bVar.a = e.b;
            bVar.b = a(e);
            e eVar = (e) this.g;
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = e.d;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "4ca0d5c44b674ef40c8dc74732ad92ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "4ca0d5c44b674ef40c8dc74732ad92ef");
                return;
            }
            eVar.f = bVar.a;
            eVar.e();
        }
    }

    private a a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "358a127a1b086adc898419901093e7b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "358a127a1b086adc898419901093e7b1");
        }
        if (com.sankuai.waimai.foundation.core.a.d()) {
            return null;
        }
        try {
            a aVar = new a();
            aVar.a = com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((com.sankuai.waimai.bussiness.order.detailnew.a) F()).D.a());
            aVar.b = ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).E.a();
            aVar.c = ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).C.a();
            aVar.d = (int) (dVar.c * 100.0d);
            com.sankuai.waimai.business.order.api.detail.model.a a = ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).J.a();
            if (a != null) {
                aVar.e = a.x;
                aVar.j = a.y;
            }
            OrderExtInfo a2 = ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).P.a();
            if (a2 != null) {
                aVar.k = a2.ext;
            }
            aVar.f = dVar.d;
            aVar.g = b(dVar.e.latitude);
            aVar.h = b(dVar.e.longitude);
            aVar.i = dVar.a();
            return aVar;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }

    private String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf58e922362d668a553a8dfce40dcfd9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf58e922362d668a553a8dfce40dcfd9") : new DecimalFormat("0.000000").format(i / 1000000.0d);
    }
}
