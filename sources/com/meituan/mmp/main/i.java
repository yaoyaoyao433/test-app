package com.meituan.mmp.main;

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
public abstract class i extends MTInstrumentation {
    public static ChangeQuickRedirect a;
    protected Context b;

    public abstract boolean a(Context context, Intent intent, boolean z);

    public i(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f2fb157b770c9d9277e33008b6cc7e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f2fb157b770c9d9277e33008b6cc7e4");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89288f7c841cd4ce0c152b385fd098a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89288f7c841cd4ce0c152b385fd098a6");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27c6e2ff4b65d883489a1cb503fce34", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27c6e2ff4b65d883489a1cb503fce34");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0af8248716b5b31a54fdfec5fa3330d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0af8248716b5b31a54fdfec5fa3330d");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e211470b84e5a978b218654899200f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e211470b84e5a978b218654899200f2");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba5e7591a4224adff078bb26d5a0aff4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba5e7591a4224adff078bb26d5a0aff4");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53f80c0d7999c2efd04d2372e5a037d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53f80c0d7999c2efd04d2372e5a037d5");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "734dcaee15c185d2e7551084fbbdfadc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "734dcaee15c185d2e7551084fbbdfadc");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cab2ef748d5b9f62a1640026ede5fe91", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cab2ef748d5b9f62a1640026ede5fe91");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3535223c9919476c19fe9305b5d32deb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3535223c9919476c19fe9305b5d32deb");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "748f992f8dcda94e436cd1759cb1f8ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "748f992f8dcda94e436cd1759cb1f8ad");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7249944b7155e433cf0f39e67c44e8c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7249944b7155e433cf0f39e67c44e8c")).booleanValue() : b(context, intent, true);
    }

    private boolean b(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a86582c84d9a01f88f55e15ea9b87fbb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a86582c84d9a01f88f55e15ea9b87fbb")).booleanValue() : b(context, intent, false);
    }

    private boolean b(Context context, Intent intent, boolean z) {
        boolean z2;
        Object[] objArr = {context, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d3966c8b747ff0d30d6b64b9e505fd8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d3966c8b747ff0d30d6b64b9e505fd8")).booleanValue();
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.processIntent");
        if (!intent.hasExtra("MMPIntentInstrumentation_intent_processed")) {
            z2 = a(context, intent, z);
            if (z2) {
                intent.putExtra("MMPIntentInstrumentation_intent_processed", true);
            }
        } else {
            intent.removeExtra("MMPIntentInstrumentation_intent_processed");
            z2 = true;
        }
        Utils.debugExecTimeEnd("IntentInstrumentation.processIntent");
        return z2;
    }
}
