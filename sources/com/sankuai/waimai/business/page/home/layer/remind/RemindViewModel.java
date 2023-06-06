package com.sankuai.waimai.business.page.home.layer.remind;

import android.arch.lifecycle.k;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
import com.sankuai.waimai.business.page.home.model.HomePagePoiListResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RemindViewModel extends PageViewModel {
    public static ChangeQuickRedirect a;
    public k<Pair<HomePagePoiListResponse, Boolean>> b;

    public RemindViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5d28632c4bbca285c17c58800e4f837", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5d28632c4bbca285c17c58800e4f837");
        } else {
            this.b = new k<>();
        }
    }
}
