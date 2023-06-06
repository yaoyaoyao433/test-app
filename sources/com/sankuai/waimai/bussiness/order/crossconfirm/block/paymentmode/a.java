package com.sankuai.waimai.bussiness.order.crossconfirm.block.paymentmode;

import android.os.Bundle;
import android.support.constraint.R;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.foundation.utils.ah;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<c, e, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72fb08e372f31134525bb0466c8faf70", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72fb08e372f31134525bb0466c8faf70") : new e();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e6261072434870f8cfa1d7f7f90166a", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e6261072434870f8cfa1d7f7f90166a") : new c(m(), (f) F());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25dfb8986763d98df265bfa729359834", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25dfb8986763d98df265bfa729359834");
        } else {
            ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).T.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.paymentmode.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.d
                public final Object a() {
                    int i;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7033cfbb7fdd61645ad3432dffa6daf", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7033cfbb7fdd61645ad3432dffa6daf");
                    }
                    c cVar = (c) a.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.d;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "7552ac5f731f9682bfa2d6e6481e9228", RobustBitConfig.DEFAULT_VALUE)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "7552ac5f731f9682bfa2d6e6481e9228")).intValue();
                    } else {
                        if (cVar.j != 2) {
                            cVar.j = 1;
                        }
                        i = cVar.j;
                    }
                    return Integer.valueOf(i);
                }
            };
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd65748e43c6a6275f8089ecb5da596a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd65748e43c6a6275f8089ecb5da596a");
            return;
        }
        super.I();
        c cVar = (c) this.g;
        d dVar = ((e) this.n).p;
        Object[] objArr2 = {dVar, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "547c022467648f3deb111478e856533f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "547c022467648f3deb111478e856533f");
            return;
        }
        Object[] objArr3 = {dVar};
        ChangeQuickRedirect changeQuickRedirect3 = c.d;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "a90cf9254b134c5e3cf8063165255672", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "a90cf9254b134c5e3cf8063165255672");
            return;
        }
        cVar.i = dVar.a;
        cVar.j = dVar.b;
        if (cVar.i != null && cVar.i.size() > 0) {
            if (cVar.i.size() == 1) {
                cVar.j = cVar.i.get(0).payType;
                cVar.f.setVisibility(8);
            } else {
                cVar.f.setVisibility(0);
            }
            int i = cVar.j;
            TextView textView = cVar.h;
            Object[] objArr4 = {Integer.valueOf(i), textView};
            ChangeQuickRedirect changeQuickRedirect4 = c.d;
            if (!PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "01e33bec14d85157fad816cba5feec2e", RobustBitConfig.DEFAULT_VALUE)) {
                switch (i) {
                    case 1:
                        textView.setText(R.string.wm_order_base_confirm_pay_offline);
                        break;
                    case 2:
                        textView.setText(R.string.wm_order_base_confirm_pay_online);
                        break;
                    default:
                        textView.setText((CharSequence) null);
                        break;
                }
            } else {
                ((Boolean) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "01e33bec14d85157fad816cba5feec2e")).booleanValue();
            }
            ah.a(cVar.g, dVar.c);
            cVar.e.setVisibility(0);
            return;
        }
        cVar.e.setVisibility(8);
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdaeb0953de306b70c910e1a3210e692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdaeb0953de306b70c910e1a3210e692");
            return;
        }
        super.b(bundle);
        c cVar = (c) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "5522a0bcd4ad80a0c2db95c1e06c2c05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "5522a0bcd4ad80a0c2db95c1e06c2c05");
        } else {
            bundle.putInt("mOrderPayType", cVar.j);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1094925848fe72e1bccca73fd4ed9f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1094925848fe72e1bccca73fd4ed9f7");
            return;
        }
        super.c(bundle);
        c cVar = (c) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "3ec12f21c74e0d411f45833a31b69d1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "3ec12f21c74e0d411f45833a31b69d1e");
        } else {
            cVar.j = bundle.getInt("mOrderPayType");
        }
    }
}
