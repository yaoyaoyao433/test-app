package com.sankuai.meituan.arbiter.hook;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.UserHandle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class IntentInstrumentation extends MTInstrumentation {
    private static final String TAG_INTENT_PROCESSED = IntentInstrumentation.class.getSimpleName() + "_intent_processed";
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Context mContext;

    public abstract boolean processIntent(Context context, Intent intent);

    public IntentInstrumentation(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab3a7c314bc36e0c05bb0a74897c7868", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab3a7c314bc36e0c05bb0a74897c7868");
        } else {
            this.mContext = context;
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a25b6beffb9696c4039d21b65b9f6d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a25b6beffb9696c4039d21b65b9f6d7");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        processIntentInternal(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, activity, intent, i);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c38f9239ba7c2495ee4bd53caf9ea1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c38f9239ba7c2495ee4bd53caf9ea1a");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        processIntentInternal(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, fragment, intent, i);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "307bd3d1df6823cf2374325785d7ef11", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "307bd3d1df6823cf2374325785d7ef11");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        processIntentInternal(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, str, intent, i, bundle);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73f6708639c1d68129159b2c61ea5f7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73f6708639c1d68129159b2c61ea5f7e");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        processIntentInternal(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aef21a6b0f786b141966f8a780424a40", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aef21a6b0f786b141966f8a780424a40");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        processIntentInternal(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, fragment, intent, i, bundle);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9b7e267c492ab47ab44a846f9f37f8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9b7e267c492ab47ab44a846f9f37f8c");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        processIntentInternal(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle, userHandle);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8aeedd51fd4f3d2d76c9fade132661a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8aeedd51fd4f3d2d76c9fade132661a4");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.execStartActivity");
        processIntentInternal(context, intent);
        Instrumentation.ActivityResult execStartActivity = super.execStartActivity(context, iBinder, iBinder2, str, intent, i, bundle, userHandle);
        Utils.debugExecTimeEnd("IntentInstrumentation.execStartActivity");
        return execStartActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object[] objArr = {classLoader, str, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7ef1ee6f9b352daa9682280a74675fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7ef1ee6f9b352daa9682280a74675fc");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.newActivity");
        processIntentInternal(this.mContext, intent);
        Activity newActivity = super.newActivity(classLoader, str, intent);
        Utils.debugExecTimeEnd("IntentInstrumentation.newActivity");
        return newActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws InstantiationException, IllegalAccessException {
        Object[] objArr = {cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fc1773c50df6dc65d1e2abce12a5249", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fc1773c50df6dc65d1e2abce12a5249");
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.newActivity");
        processIntentInternal(context, intent);
        Activity newActivity = super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        Utils.debugExecTimeEnd("IntentInstrumentation.newActivity");
        return newActivity;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        Object[] objArr = {activity, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4959f46277622480171ccd6a0f148c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4959f46277622480171ccd6a0f148c2");
            return;
        }
        if (intent != null) {
            intent.removeExtra(TAG_INTENT_PROCESSED);
        }
        super.callActivityOnNewIntent(activity, intent);
    }

    private boolean processIntentInternal(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53a4549628725fc7507187a7b60e12c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53a4549628725fc7507187a7b60e12c0")).booleanValue();
        }
        Utils.debugExecTimeBegin("IntentInstrumentation.processIntent");
        if (!intent.hasExtra(TAG_INTENT_PROCESSED)) {
            intent.putExtra(TAG_INTENT_PROCESSED, true);
            return processIntent(context, intent);
        }
        intent.removeExtra(TAG_INTENT_PROCESSED);
        Utils.debugExecTimeEnd("IntentInstrumentation.processIntent");
        return true;
    }
}
