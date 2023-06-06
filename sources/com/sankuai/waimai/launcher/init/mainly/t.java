package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.account.AccountEventReceiver;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class t extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "PassportInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a51c47bbfbd7c7626bf1ef3a92f88f29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a51c47bbfbd7c7626bf1ef3a92f88f29");
            return;
        }
        com.sankuai.waimai.launcher.manager.user.a.b();
        com.sankuai.waimai.launcher.manager.user.a.a(application);
        com.sankuai.waimai.launcher.manager.user.a.a();
        LocalBroadcastManager.getInstance(com.meituan.android.singleton.b.a).registerReceiver(new AccountEventReceiver(), new IntentFilter("KNB.Channel.Account.AccountCancelSuccess"));
    }
}
