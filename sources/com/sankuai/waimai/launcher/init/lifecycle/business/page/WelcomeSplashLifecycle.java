package com.sankuai.waimai.launcher.init.lifecycle.business.page;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import com.sankuai.waimai.foundation.router.interfaces.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WelcomeSplashLifecycle extends Lifecycle implements com.sankuai.waimai.foundation.core.lifecycle.a {
    private static final int BACKGROUND_TIME_TO_SHOW_AD = 21600000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private long mGotoBgTime;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "WelcomeSplashLifecycle";
    }

    public WelcomeSplashLifecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6042ce144ca7b53cfc23d322afb72f46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6042ce144ca7b53cfc23d322afb72f46");
        } else {
            this.mGotoBgTime = 0L;
        }
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public void onAppToForeground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5fbf56b317a94314c2bf948dd9f74a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5fbf56b317a94314c2bf948dd9f74a6");
            return;
        }
        long timestamp = timestamp();
        if (this.mGotoBgTime > 0 && timestamp - this.mGotoBgTime > 21600000) {
            new Bundle().putBoolean("mIsGotoMainPage", false);
            com.sankuai.waimai.foundation.router.a.a(activity, c.a);
        }
        this.mGotoBgTime = 0L;
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public void onAppToBackground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0db1a8d85cc861d97521e88af381f3ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0db1a8d85cc861d97521e88af381f3ee");
        } else {
            this.mGotoBgTime = timestamp();
        }
    }

    private long timestamp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21f27a4bf19f14d40cc0bd5a69bbc9e4", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21f27a4bf19f14d40cc0bd5a69bbc9e4")).longValue() : SystemClock.uptimeMillis();
    }
}
