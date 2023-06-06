package com.sankuai.waimai.shell.deeplink;

import android.app.Activity;
import android.app.Fragment;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.UserHandle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.arbiter.hook.MTInstrumentation;
import com.sankuai.meituan.takeoutnew.AppApplication;
import com.sankuai.meituan.takeoutnew.app.config.WaimaiSP;
import com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.foundation.utils.ai;
import com.sankuai.waimai.platform.capacity.deeplink.b;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends MTInstrumentation {
    public static ChangeQuickRedirect a;
    private static boolean b;
    private static boolean c;
    private static Boolean d;
    private static Intent e;
    private static final ai<Activity> f = new ai<>();

    public static Activity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "753547b9520d589945c4ade423ccbcfd", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "753547b9520d589945c4ade423ccbcfd") : f.a();
    }

    private Intent a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3abdff0c6ea063981a371ed71ca91821", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3abdff0c6ea063981a371ed71ca91821");
        }
        intent.putExtra("_dl_cold_", com.sankuai.waimai.platform.capacity.deeplink.a.a());
        intent.putExtra("_dl_internal_", true);
        if (!c && d != null) {
            if (e != null && f.a(e, "_dl_landing_page_", false)) {
                intent.putExtra("_dl_landing_page_", true);
            }
            e = intent;
        }
        if (b.a() && WaimaiSP.f() && !c && !b && intent.getComponent() != null && MainActivity.class.getName().equals(intent.getComponent().getClassName())) {
            intent.addFlags(32768);
        }
        return intent;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b3efbb1f9e3b2dfc40430017f1243fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b3efbb1f9e3b2dfc40430017f1243fa");
            return;
        }
        f.a(activity);
        super.callActivityOnCreate(activity, bundle);
        if (activity instanceof WelcomeActivity) {
            if (!b) {
                b = true;
            }
        } else if (activity instanceof MainActivity) {
            if (!c) {
                c = true;
            }
            AppApplication.a(false);
            AppApplication.b = true;
        } else if (!c && !com.sankuai.waimai.platform.capacity.deeplink.a.a(activity)) {
            if (e != null && f.a(e, "_dl_landing_page_", false)) {
                Intent intent = activity.getIntent();
                intent.putExtra("_dl_landing_page_", true);
                activity.setIntent(intent);
            }
            e = null;
        }
        if (b.b() || d != null || com.sankuai.waimai.platform.capacity.deeplink.a.a(activity)) {
            return;
        }
        Intent intent2 = activity.getIntent();
        boolean z = f.a(intent2, "_wm_dm_", 0) == 1;
        d = Boolean.valueOf(z);
        if (z) {
            intent2.putExtra("_dl_landing_page_", true);
            AppApplication.a(false);
            AppApplication.b = true;
            activity.setIntent(intent2);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public final void callActivityOnDestroy(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "197f8a60fc8d33179f7b5a50a14d6006", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "197f8a60fc8d33179f7b5a50a14d6006");
            return;
        }
        super.callActivityOnDestroy(activity);
        if (WaimaiSP.f() && !b.b() && com.sankuai.waimai.foundation.utils.activity.a.a().c() == null && e == null && f.a(activity.getIntent(), "_dl_landing_page_", false) && !AppApplication.a()) {
            AppApplication.a((Activity) null);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public final void callActivityOnResume(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efedf00e5e2e572de7fcbdb905fa1e77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efedf00e5e2e572de7fcbdb905fa1e77");
            return;
        }
        com.sankuai.waimai.platform.capacity.deeplink.a.b();
        super.callActivityOnResume(activity);
        if (activity instanceof MainActivity) {
            AppApplication.a(false);
            AppApplication.b = true;
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public final void callActivityOnPause(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c50b135f65b90f093f07078b6a40c97f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c50b135f65b90f093f07078b6a40c97f");
        } else if (!activity.isFinishing()) {
            super.callActivityOnPause(activity);
        } else {
            try {
                if (WaimaiSP.f()) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8be4927a4ee048ab9112080cc06dbaf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8be4927a4ee048ab9112080cc06dbaf");
                    } else if (!b && !c && d != null && d.booleanValue() && !com.sankuai.waimai.platform.capacity.deeplink.a.a(activity) && f.a(activity.getIntent(), "_dl_landing_page_", false)) {
                        String a2 = f.a(activity.getIntent(), "_wm_rta_");
                        if (TextUtils.isEmpty(a2)) {
                            a2 = "main";
                        }
                        if ("main".equals(a2)) {
                            if (e != null) {
                                e.putExtra("_dl_landing_page_", true);
                            } else {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.addFlags(y.a);
                                intent.setPackage(activity.getPackageName());
                                intent.setClassName(activity.getApplicationContext(), MainActivity.class.getName());
                                intent.putExtra("_return_from_dl_", true);
                                activity.startActivity(intent);
                                activity.overridePendingTransition(0, 0);
                            }
                        } else if ("noop".equals(a2)) {
                            new StringBuilder("backToMainIfNeeded: ").append(a2);
                        }
                        d = Boolean.FALSE;
                    }
                }
            } catch (Exception e2) {
                com.sankuai.waimai.foundation.utils.log.a.b(e2);
            }
            super.callActivityOnPause(activity);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public final Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3549a0e7d1e13f26b6af65dd814516e3", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3549a0e7d1e13f26b6af65dd814516e3") : super.execStartActivity(context, iBinder, iBinder2, activity, a(intent), i);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public final Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dcde56647302d86860ef3998933f99e", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dcde56647302d86860ef3998933f99e") : super.execStartActivity(context, iBinder, iBinder2, fragment, a(intent), i);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public final Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f401aef1815660ee1b5ed26d8bdafc59", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f401aef1815660ee1b5ed26d8bdafc59") : super.execStartActivity(context, iBinder, iBinder2, activity, a(intent), i, bundle);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public final Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47d46e0e808461e920764b1310233f2a", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47d46e0e808461e920764b1310233f2a") : super.execStartActivity(context, iBinder, iBinder2, fragment, a(intent), i, bundle);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public final Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "288eb2310c7d9ee03c4a85448bf19ef2", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "288eb2310c7d9ee03c4a85448bf19ef2") : super.execStartActivity(context, iBinder, iBinder2, activity, a(intent), i, bundle, userHandle);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public final Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e8f3f441ef8108b29f728e9aa8d43e5", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e8f3f441ef8108b29f728e9aa8d43e5") : super.execStartActivity(context, iBinder, iBinder2, str, a(intent), i, bundle, userHandle);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public final Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dc384ce0bfe192c592aef594b4539cd", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dc384ce0bfe192c592aef594b4539cd") : super.execStartActivity(context, iBinder, iBinder2, str, a(intent), i, bundle);
    }
}
