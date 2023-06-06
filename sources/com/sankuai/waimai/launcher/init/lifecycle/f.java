package com.sankuai.waimai.launcher.init.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.dianping.base.push.pushservice.n;
import com.dianping.base.push.pushservice.util.d;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.push.HmsMessaging;
import com.huawei.hms.update.provider.UpdateProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends Lifecycle implements Application.ActivityLifecycleCallbacks, com.sankuai.waimai.foundation.core.lifecycle.a {
    public static ChangeQuickRedirect a;
    private boolean b;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "PushLifecycle";
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "871432ce4d8c45e6b686bedfac8207e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "871432ce4d8c45e6b686bedfac8207e0");
        } else {
            this.b = true;
        }
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToForeground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20e37c262da9f83e0a77dd311917b98b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20e37c262da9f83e0a77dd311917b98b");
        } else if (Build.VERSION.SDK_INT >= 26) {
            try {
                com.dianping.base.push.pushservice.f.b(false);
            } catch (NullPointerException e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToBackground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9f498d6fedd58860f5e97ea25d87396", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9f498d6fedd58860f5e97ea25d87396");
        } else if (Build.VERSION.SDK_INT >= 26) {
            try {
                com.dianping.base.push.pushservice.f.b(true);
            } catch (NullPointerException e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e14fb74e1de928cd9f3ed1582aa0a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e14fb74e1de928cd9f3ed1582aa0a2");
        } else if (!this.b || !(activity instanceof MainActivity) || "HWDRA-M".equalsIgnoreCase(Build.DEVICE) || "HWDUA-M".equalsIgnoreCase(Build.DEVICE)) {
        } else {
            this.b = false;
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.huaweipush.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7dad8690c81fdff2f604374cbfd88167", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7dad8690c81fdff2f604374cbfd88167");
            } else if (activity != null && com.dianping.base.push.pushservice.f.b(activity) && com.dianping.huaweipush.a.c(activity)) {
                com.sankuai.waimai.launcher.util.aop.b.a(com.dianping.base.push.pushservice.util.h.a(), new Runnable() { // from class: com.dianping.huaweipush.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1508ce53d6a48e61e55970930acac428", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1508ce53d6a48e61e55970930acac428");
                            return;
                        }
                        try {
                            d.b(activity, DpHmsMessageService.class);
                            Context context = activity;
                            Object[] objArr4 = {context, UpdateProvider.class};
                            ChangeQuickRedirect changeQuickRedirect4 = d.a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a2e5be964e4686cc28d13fcea37d9150", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a2e5be964e4686cc28d13fcea37d9150");
                            } else {
                                d.b(context, UpdateProvider.class, 1);
                            }
                            String token = HmsInstanceId.getInstance(activity).getToken(String.valueOf(a.d(activity)), HmsMessaging.DEFAULT_TOKEN_SCOPE);
                            a.a("HuaweiPush getToken成功 token:" + token);
                            if (TextUtils.isEmpty(token)) {
                                return;
                            }
                            n.a(activity, 4, token);
                        } catch (Exception e) {
                            a.a("HuaweiPush getToken错误 " + e.toString());
                            Context context2 = activity;
                            Object[] objArr5 = {context2, DpHmsMessageService.class};
                            ChangeQuickRedirect changeQuickRedirect5 = d.a;
                            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "773e1d396d0335da87178818b24b7f9c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "773e1d396d0335da87178818b24b7f9c");
                            } else {
                                d.a(context2, DpHmsMessageService.class, 2);
                            }
                            Context context3 = activity;
                            Object[] objArr6 = {context3, UpdateProvider.class};
                            ChangeQuickRedirect changeQuickRedirect6 = d.a;
                            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "0ddb299a9006617cabb6e76f162fb4fb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "0ddb299a9006617cabb6e76f162fb4fb");
                            } else {
                                d.a(context3, UpdateProvider.class, 2);
                            }
                        }
                    }
                });
            }
        }
    }
}
