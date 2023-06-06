package com.sankuai.waimai.business.page.home.widget.twolevel;

import android.arch.lifecycle.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
import com.sankuai.waimai.business.page.home.model.HomeSecondFloorResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SecondFloorViewModel extends PageViewModel {
    public static ChangeQuickRedirect a;
    public HomeSecondFloorResponse b;
    public k<HomeSecondFloorResponse> c;

    public SecondFloorViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98c9ca2db811719f9fc37fac2fee4f79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98c9ca2db811719f9fc37fac2fee4f79");
        } else {
            this.c = new k<>();
        }
    }

    public final void a(HomeSecondFloorResponse homeSecondFloorResponse) {
        Object[] objArr = {homeSecondFloorResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2229862b6104fd89682654ef8b9d1be3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2229862b6104fd89682654ef8b9d1be3");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "SecondFloorViewModel    接收到数据： " + homeSecondFloorResponse, new Object[0]);
        this.b = homeSecondFloorResponse;
        this.c.b((k<HomeSecondFloorResponse>) homeSecondFloorResponse);
    }
}
