package com.sankuai.waimai.irmo.mach.effect;

import android.content.Context;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.mach.c;
import com.sankuai.waimai.irmo.mach.vap.g;
import com.sankuai.waimai.mach.widget.MachViewGroup;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<MachViewGroup> {
    public static ChangeQuickRedirect a;
    public b b;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(MachViewGroup machViewGroup) {
        MachViewGroup machViewGroup2 = machViewGroup;
        Object[] objArr = {machViewGroup2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c29072787ef0a1449b2eae857f05f62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c29072787ef0a1449b2eae857f05f62");
            return;
        }
        super.a((a) machViewGroup2);
        if (this.b != null) {
            this.b.a((ViewGroup) machViewGroup2);
            b bVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (!PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "b92c6feabd6282242c9e726afc9fcee8", RobustBitConfig.DEFAULT_VALUE)) {
                switch (bVar.c) {
                    case 0:
                        bVar.b();
                        break;
                    case 1:
                        bVar.a();
                        break;
                    case 2:
                        bVar.c();
                        break;
                    case 3:
                        bVar.d();
                        break;
                }
            } else {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "b92c6feabd6282242c9e726afc9fcee8");
            }
        }
        Object[] objArr3 = {"EffectRenderStart", 1};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "db930d2c25cc5e9388b162c2e87e2233", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "db930d2c25cc5e9388b162c2e87e2233");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("EffectRenderStart", 1);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("effectType", ErrorCode.ERROR_CODE_OKHTTP_EXCEPTION);
        hashMap2.put("templateId", g.a().b);
        c.a(hashMap, hashMap2);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ MachViewGroup b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31efa2086444f190f8d1ea588fd6a614", RobustBitConfig.DEFAULT_VALUE) ? (MachViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31efa2086444f190f8d1ea588fd6a614") : new MachViewGroup(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0775f343c155beb34a7af82d0f660894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0775f343c155beb34a7af82d0f660894");
            return;
        }
        this.b = new b(k());
        this.b.a((com.sankuai.waimai.mach.node.a<ViewGroup>) this.n);
        g.a().a(this);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52e5f5f4ef749001defa940816693bca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52e5f5f4ef749001defa940816693bca");
            return;
        }
        super.b();
        if (this.b != null) {
            this.b.e();
        }
    }
}
