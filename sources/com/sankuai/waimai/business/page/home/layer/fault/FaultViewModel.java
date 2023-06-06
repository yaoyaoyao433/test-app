package com.sankuai.waimai.business.page.home.layer.fault;

import android.arch.lifecycle.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
import com.sankuai.waimai.business.page.home.model.HomePagePoiListResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FaultViewModel extends PageViewModel {
    public static ChangeQuickRedirect a;
    public k<HomePagePoiListResponse> b;
    public k<Boolean> c;

    public FaultViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f78b3f2e017ee1bdb55c46e7e911b46c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f78b3f2e017ee1bdb55c46e7e911b46c");
            return;
        }
        this.b = new k<>();
        this.c = new k<>();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f395dce1da309bda3161daeebefabc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f395dce1da309bda3161daeebefabc6");
        } else {
            this.c.b((k<Boolean>) Boolean.valueOf(z));
        }
    }
}
