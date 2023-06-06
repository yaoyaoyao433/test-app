package com.sankuai.waimai.business.page.common.view.listfloat;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends a {
    public static ChangeQuickRedirect e;

    public c(Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53c7b37ba8121769fc6acf6b4466187f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53c7b37ba8121769fc6acf6b4466187f");
        }
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68624f65864319e5dd935077a3c68dfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68624f65864319e5dd935077a3c68dfb");
        } else if (this.d != null && a(this.b)) {
            switch (i) {
                case 1:
                    JudasManualManager.a a = JudasManualManager.b("b_0Mw95").a("c_m84bv26");
                    a.b = str;
                    a.a("tip_icon", 0).a();
                    return;
                case 2:
                case 3:
                    JudasManualManager.a a2 = JudasManualManager.b("b_dCrTp").a("c_i5kxn8l");
                    a2.b = str;
                    a2.a("tip_icon", 0).a();
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.sankuai.waimai.business.page.common.view.listfloat.a
    public final boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a9dea934e456d0fc0127f8f3765a9f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a9dea934e456d0fc0127f8f3765a9f")).booleanValue() : com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "global_shopping_cart_entrance_switch", true);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "effb5e07d3a61b01737b87762c4652ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "effb5e07d3a61b01737b87762c4652ae");
            return;
        }
        JudasManualManager.a a = JudasManualManager.a("b_29myW").a("c_m84bv26");
        a.b = str;
        a.a("tip_icon", 0).a();
        GlobalCartManager.getInstance();
        GlobalCartManager.toGlobalCartActivity(this.b);
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7aaeaba73e619b6049581569e0652cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7aaeaba73e619b6049581569e0652cf");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0104bcd5c841e20a9cefdde56f73902e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0104bcd5c841e20a9cefdde56f73902e");
        } else {
            a();
        }
        a(1, str);
    }
}
