package com.sankuai.waimai.business.page.home.head.banner.mach;

import android.arch.lifecycle.k;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AcrossBannerMachViewModel extends PageViewModel {
    public static ChangeQuickRedirect a;
    public k<View> b;

    public AcrossBannerMachViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae8a0794bb0bc69a39461cec6ebc011e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae8a0794bb0bc69a39461cec6ebc011e");
        } else {
            this.b = new k<>();
        }
    }
}
