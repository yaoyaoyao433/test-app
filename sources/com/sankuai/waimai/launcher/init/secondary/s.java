package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.content.Context;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.launcher.net.api.LogTypeApi;
import com.sankuai.waimai.platform.capacity.log.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class s extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "RiskControlInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void idleInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e822093791c2873011a0c42258df3e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e822093791c2873011a0c42258df3e3");
            return;
        }
        Object[] objArr2 = {application, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.launcher.provider.risk.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1b99075e218994ec9bcb086b25256947", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1b99075e218994ec9bcb086b25256947");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) application, "has_upload_uuid", false);
            String str = NotificationManagerCompat.from(com.meituan.android.singleton.b.a).areNotificationsEnabled() ? "1" : "2";
            a.AbstractC1040a a2 = new com.sankuai.waimai.launcher.log.a().a("checkPushToken");
            com.sankuai.waimai.platform.capacity.log.i.b(a2.d("RiskControlUtil uploadUserInfo pushToken:" + com.sankuai.waimai.platform.b.A().D()).b());
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((LogTypeApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) LogTypeApi.class)).uploadUserInfo(str), null, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
            if (!TextUtils.isEmpty(com.sankuai.waimai.platform.b.A().c())) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) application, "has_upload_uuid", true);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.launcher.provider.risk.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8505d794994bcb399b89f93342d380aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8505d794994bcb399b89f93342d380aa");
            return;
        }
        String localOneId = OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId();
        if (TextUtils.isEmpty(localOneId)) {
            return;
        }
        Object[] objArr4 = {localOneId};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.launcher.provider.risk.a.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "7351b4e9a4cc3e5bb8a255b361750da3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "7351b4e9a4cc3e5bb8a255b361750da3");
            return;
        }
        a.AbstractC1040a a3 = new com.sankuai.waimai.launcher.log.a().a("checkPushToken");
        com.sankuai.waimai.platform.capacity.log.i.b(a3.d("RiskControlUtil uploadUnionId pushToken:" + com.sankuai.waimai.platform.b.A().D()).b());
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((LogTypeApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) LogTypeApi.class)).uploadUnionId(localOneId), null, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
    }
}
