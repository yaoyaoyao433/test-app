package com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.foundation.utils.ae;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "268200dea25f979df2d2489b8698656f", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "268200dea25f979df2d2489b8698656f") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31c4a6a4cf3c121ff913bab83c006103", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31c4a6a4cf3c121ff913bab83c006103") : new b(m(), (f) F());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4014f87076f5faa1f0bb453a355aec68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4014f87076f5faa1f0bb453a355aec68");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50466cb691d6cb0891594f0ba4462608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50466cb691d6cb0891594f0ba4462608");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).o.a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(b.a aVar) {
                b.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6f0c703604bc0aa1b071d3a63ba6e88", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6f0c703604bc0aa1b071d3a63ba6e88");
                    return;
                }
                b bVar = (b) a.this.g;
                int i = aVar2.a;
                int i2 = aVar2.b;
                Intent intent = aVar2.c;
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
                ChangeQuickRedirect changeQuickRedirect3 = b.d;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "dcb0573d256f351662ed0cdead67d7c5", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Boolean) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "dcb0573d256f351662ed0cdead67d7c5")).booleanValue();
                } else if (i == bVar.k + 10000 && i2 == -1) {
                    String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "intent_remark", "");
                    bVar.g = (ArrayList) com.sankuai.waimai.platform.utils.f.a(intent, "intent_remark_tags", (Serializable) null);
                    bVar.h = a2;
                    bVar.e();
                    if (TextUtils.isEmpty(a2)) {
                        return;
                    }
                    ae.a(bVar.j, bVar.j.getResources().getString(R.string.wm_order_add_remark_success_callback_info));
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab0a114413b8a5a393d462cd5b1b6498", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab0a114413b8a5a393d462cd5b1b6498");
            return;
        }
        super.I();
        b bVar = (b) this.g;
        c cVar = ((d) this.n).r;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ae342bc32775af2e1e4253d7f3cdfa11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ae342bc32775af2e1e4253d7f3cdfa11");
            return;
        }
        Object[] objArr3 = {cVar};
        ChangeQuickRedirect changeQuickRedirect3 = b.d;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "f975ef166a4a958096a8e0cb11e34f8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "f975ef166a4a958096a8e0cb11e34f8c");
        } else {
            bVar.f = cVar;
            if (bVar.f != null && bVar.f.f != null && bVar.f.f.hidden) {
                bVar.a().setVisibility(8);
            } else {
                bVar.a().setVisibility(0);
            }
            Object[] objArr4 = {cVar};
            ChangeQuickRedirect changeQuickRedirect4 = b.d;
            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "34058edd12fcf38f1dcdd2f073ba04c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "34058edd12fcf38f1dcdd2f073ba04c7");
            } else if (!TextUtils.isEmpty(bVar.i)) {
                bVar.e.setText(bVar.i);
            } else if (cVar != null && cVar.f != null && !TextUtils.isEmpty(cVar.f.hint)) {
                bVar.e.setHint(ab.a(cVar.f.hint, 12));
            }
        }
        if (cVar == null || cVar.f == null) {
            return;
        }
        cVar.f.initValues();
        bVar.k = cVar.g;
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb621289b832d9efe2543d370f97f037", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb621289b832d9efe2543d370f97f037");
            return;
        }
        super.b(bundle);
        b bVar = (b) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "38f68f768b8b5b49fb96f53cf57c53b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "38f68f768b8b5b49fb96f53cf57c53b8");
            return;
        }
        bundle.putString("remark", bVar.h);
        if (bVar.i != null) {
            bundle.putString("mOrderInfoStr", bVar.i);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f977f665bc1390a551feb5140dd06994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f977f665bc1390a551feb5140dd06994");
            return;
        }
        super.c(bundle);
        b bVar = (b) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "0ba01fcadda2496a767e85ca947cc504", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "0ba01fcadda2496a767e85ca947cc504");
            return;
        }
        bVar.h = bundle.getString("remark");
        bVar.i = bundle.getString("mOrderInfoStr");
        bVar.e();
    }

    public final String M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b61045e33953243ff4eee330270aa474", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b61045e33953243ff4eee330270aa474") : ((b) this.g).h;
    }
}
