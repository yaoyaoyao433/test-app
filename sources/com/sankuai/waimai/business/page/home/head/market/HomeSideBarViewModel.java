package com.sankuai.waimai.business.page.home.head.market;

import android.arch.lifecycle.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
import com.sankuai.waimai.business.page.home.model.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HomeSideBarViewModel extends PageViewModel {
    public static ChangeQuickRedirect a;
    k<e> b;
    public k<Boolean> c;

    public HomeSideBarViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86441d1315813c4de5970922d5d2cec7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86441d1315813c4de5970922d5d2cec7");
            return;
        }
        this.b = new k<>();
        this.c = new k<>();
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f07c6ece6e03dd2450dad2da98ff8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f07c6ece6e03dd2450dad2da98ff8d");
        } else {
            this.b.b((k<e>) eVar);
        }
    }
}
