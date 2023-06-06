package com.sankuai.waimai.launcher.init;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import com.sankuai.waimai.launcher.init.lifecycle.f;
import com.sankuai.waimai.launcher.init.lifecycle.g;
import com.sankuai.waimai.launcher.init.lifecycle.h;
import com.sankuai.waimai.launcher.init.lifecycle.i;
import com.sankuai.waimai.launcher.provider.push.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.launcher.init.core.c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.launcher.init.core.c
    public final void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8588b8744e471796ac74aa934700af55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8588b8744e471796ac74aa934700af55");
        } else if (com.sankuai.waimai.launcher.init.core.b.a(application)) {
            a("GlobalCartLifecycle");
            a("WeatherLifecycle");
            a("WelcomeSplashLifecycle");
            a("AILifecycle");
            a("AlitaLifeCycle");
            a("SystemCallCache");
            a("NetMonitoredLifeCycle");
            a("MainActivityLifeCycle");
            a("ExternalJumpLifeCycle");
        }
    }

    @Override // com.sankuai.waimai.launcher.init.core.c
    public final void b(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6515c105e36e1334df180ed3d7cac6a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6515c105e36e1334df180ed3d7cac6a8");
            return;
        }
        a((a) new i());
        a((a) new com.sankuai.waimai.launcher.init.lifecycle.d());
        a((a) new com.sankuai.waimai.launcher.init.lifecycle.c());
        a((a) new com.sankuai.waimai.launcher.init.lifecycle.a());
        a((a) new g());
        a((a) new f());
        a((a) new h());
        a((a) new com.sankuai.waimai.launcher.init.lifecycle.business.page.a());
        a((a) new c.a());
        a((a) new com.sankuai.waimai.launcher.init.lifecycle.e());
        if (Build.VERSION.SDK_INT >= 24) {
            a((a) new com.sankuai.waimai.launcher.init.lifecycle.b());
        }
        Object[] objArr2 = {application};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3472b83ea01f7a94c244adf76f70a6c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3472b83ea01f7a94c244adf76f70a6c6");
        } else if (com.sankuai.waimai.launcher.init.core.b.a(application)) {
            for (String str : this.c) {
                if (!TextUtils.isEmpty(str)) {
                    a((a) ((Lifecycle) com.sankuai.waimai.router.a.a(Lifecycle.class, str)));
                }
            }
        }
    }
}
