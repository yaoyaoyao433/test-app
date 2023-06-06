package com.meituan.msc.modules.container;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.UserHandle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.arbiter.hook.MTInstrumentation;
import com.sankuai.meituan.arbiter.hook.Utils;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class t extends MTInstrumentation {
    public static ChangeQuickRedirect a;
    protected Context b;

    public abstract boolean a(Context context, Intent intent, boolean z);

    public t(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ed2cff7a34c0de90eb4afad2ca03fc6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ed2cff7a34c0de90eb4afad2ca03fc6");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07e6a5360706e40e6d39f2216de35551", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07e6a5360706e40e6d39f2216de35551");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        a(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, activity, intent, i);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "857826359c534f7e53fc664f1ca80ffe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "857826359c534f7e53fc664f1ca80ffe");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        a(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, fragment, intent, i);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "995ef329c41cf3536bc72ac254a2966b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "995ef329c41cf3536bc72ac254a2966b");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        a(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, str, intent, i, bundle);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aaed64c90d5d73990e8d56c956684fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aaed64c90d5d73990e8d56c956684fc");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        a(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b3660bbf0f930f17c4cac356cc907da", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b3660bbf0f930f17c4cac356cc907da");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        a(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, fragment, intent, i, bundle);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83f0d4279bb9fa5b3615a93aa22c061b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83f0d4279bb9fa5b3615a93aa22c061b");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        a(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle, userHandle);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c20349633f9ce430964d097f18de29b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c20349633f9ce430964d097f18de29b");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        a(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, str, intent, i, bundle, userHandle);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object[] objArr = {classLoader, str, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a7ff45ae9cabcead390883ad16c851", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a7ff45ae9cabcead390883ad16c851");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.newActivity");
        intent.setExtrasClassLoader(classLoader);
        if (b(this.b, intent)) {
            if (intent.getComponent() != null) {
                str = intent.getComponent().getClassName();
            } else {
                ResolveInfo resolveActivity = this.b.getPackageManager().resolveActivity(intent, 65536);
                if (resolveActivity != null && resolveActivity.activityInfo != null) {
                    str = resolveActivity.activityInfo.name;
                }
            }
        }
        Activity newActivity = super.newActivity(classLoader, str, intent);
        Utils.debugExecTimeEnd("IntentInstrumentation.newActivity");
        return newActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws InstantiationException, IllegalAccessException {
        Object[] objArr = {cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d01ca930d7678e093541f78ae33e469", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d01ca930d7678e093541f78ae33e469");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.newActivity");
        intent.setExtrasClassLoader(cls.getClassLoader());
        b(context, intent);
        Activity newActivity = super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        Utils.debugExecTimeEnd("IntentInstrumentation.newActivity");
        return newActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        Object[] objArr = {activity, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b67d008a5ffd22c3d27a0f5baa5a1202", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b67d008a5ffd22c3d27a0f5baa5a1202");
            return;
        }
        if (intent != null) {
            intent.removeExtra("MMPIntentInstrumentation_intent_processed");
        }
        super.callActivityOnNewIntent(activity, intent);
    }

    private boolean a(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a933f9ce78a1a6ee924d3f20d661e591", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a933f9ce78a1a6ee924d3f20d661e591")).booleanValue() : b(context, intent, true);
    }

    private boolean b(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa196689066188a3da4e3ecc886e34b3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa196689066188a3da4e3ecc886e34b3")).booleanValue() : b(context, intent, false);
    }

    private boolean b(Context context, Intent intent, boolean z) {
        boolean z2;
        Object[] objArr = {context, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7c32d1ebaad979b554a319af29aaa7c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7c32d1ebaad979b554a319af29aaa7c")).booleanValue();
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.processIntent");
        try {
            if (!intent.hasExtra("MMPIntentInstrumentation_intent_processed")) {
                z2 = a(context, intent, z);
                if (z2) {
                    try {
                        intent.putExtra("MMPIntentInstrumentation_intent_processed", true);
                    } catch (Exception e) {
                        e = e;
                        com.meituan.msc.modules.reporter.g.a("IntentInstrumentation", e);
                        Utils.debugExecTimeEnd("IntentInstrumentation.processIntent");
                        return z2;
                    }
                }
            } else {
                intent.removeExtra("MMPIntentInstrumentation_intent_processed");
                z2 = true;
            }
        } catch (Exception e2) {
            e = e2;
            z2 = false;
        }
        Utils.debugExecTimeEnd("IntentInstrumentation.processIntent");
        return z2;
    }
}
