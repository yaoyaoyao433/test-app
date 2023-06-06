package com.sankuai.waimai.business.ugc.routerservice;

import android.content.Context;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.manager.user.a;
import com.sankuai.waimai.platform.provider.AccountEventProvider;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMUGCAccountEventProvider implements AccountEventProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.provider.AccountEventProvider
    public void logOff() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2ae9d1d68bfb5bcb0e74c0f58613f11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2ae9d1d68bfb5bcb0e74c0f58613f11");
            return;
        }
        a.i();
        long c = a.c();
        StorageUtil.clearShareValue(b.a, "waimai-ugc-note-drafts");
        Context context = b.a;
        StorageUtil.clearShareValue(context, "waimai-ugc-note-drafts-" + c);
    }
}
