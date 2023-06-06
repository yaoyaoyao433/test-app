package com.sankuai.meituan.arbiter.hook;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Instrumentation;
import android.app.UiAutomation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class InstrumentationProxy extends Instrumentation {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected MTInstrumentation mtInstrumentation;

    public InstrumentationProxy(MTInstrumentation mTInstrumentation) {
        Object[] objArr = {mTInstrumentation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ed7a0e75465f4fda3036046158a9440", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ed7a0e75465f4fda3036046158a9440");
        } else {
            this.mtInstrumentation = mTInstrumentation;
        }
    }

    public void setMtInstrumentation(MTInstrumentation mTInstrumentation) {
        this.mtInstrumentation = mTInstrumentation;
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d61d05c0c06085f9ad93f3ac5c884ac9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d61d05c0c06085f9ad93f3ac5c884ac9");
        }
        Utils.setClassLoader(intent);
        String activityName = HookEventUtil.getActivityName(intent);
        HookEventUtil.methodEventStart(activityName, "execStartActivity_Activity");
        Instrumentation.ActivityResult execStartActivity = this.mtInstrumentation.execStartActivity(context, iBinder, iBinder2, activity, intent, i);
        HookEventUtil.methodEventEnd(activityName, "execStartActivity_Activity");
        return execStartActivity;
    }

    @TargetApi(16)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "748109f22f0704002d2c57725d223eb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "748109f22f0704002d2c57725d223eb0");
        }
        String activityName = HookEventUtil.getActivityName(intent);
        HookEventUtil.methodEventStart(activityName, "execStartActivity_Activity_Bundle");
        Utils.setClassLoader(intent);
        Instrumentation.ActivityResult execStartActivity = this.mtInstrumentation.execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle);
        HookEventUtil.methodEventEnd(activityName, "execStartActivity_Activity_Bundle");
        return execStartActivity;
    }

    @TargetApi(14)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80556fb8c2aa05a011a344fb60bff9f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80556fb8c2aa05a011a344fb60bff9f3");
        }
        String activityName = HookEventUtil.getActivityName(intent);
        HookEventUtil.methodEventStart(activityName, "execStartActivity_Fragment");
        Utils.setClassLoader(intent);
        Instrumentation.ActivityResult execStartActivity = this.mtInstrumentation.execStartActivity(context, iBinder, iBinder2, fragment, intent, i);
        HookEventUtil.methodEventEnd(activityName, "execStartActivity_Fragment");
        return execStartActivity;
    }

    @TargetApi(16)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da59d62aa478a9326f3193dec666cfdd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da59d62aa478a9326f3193dec666cfdd");
        }
        String activityName = HookEventUtil.getActivityName(intent);
        HookEventUtil.methodEventStart(activityName, "execStartActivity_Fragment_Bundle");
        Utils.setClassLoader(intent);
        Instrumentation.ActivityResult execStartActivity = this.mtInstrumentation.execStartActivity(context, iBinder, iBinder2, fragment, intent, i, bundle);
        HookEventUtil.methodEventEnd(activityName, "execStartActivity_Fragment_Bundle");
        return execStartActivity;
    }

    @TargetApi(17)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f4132c8fb974cea93f3332b2c8fb202", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f4132c8fb974cea93f3332b2c8fb202");
        }
        String activityName = HookEventUtil.getActivityName(intent);
        HookEventUtil.methodEventStart(activityName, "execStartActivity_Activity_Bundle_UserHandle");
        Utils.setClassLoader(intent);
        Instrumentation.ActivityResult execStartActivity = this.mtInstrumentation.execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle, userHandle);
        HookEventUtil.methodEventEnd(activityName, "execStartActivity_Activity_Bundle_UserHandle");
        return execStartActivity;
    }

    @TargetApi(17)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36a6541d73fbaebc31afedc459dc41b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36a6541d73fbaebc31afedc459dc41b8");
        }
        String activityName = HookEventUtil.getActivityName(intent);
        HookEventUtil.methodEventStart(activityName, "execStartActivity_String_Bundle_UserHandle");
        Utils.setClassLoader(intent);
        Instrumentation.ActivityResult execStartActivity = this.mtInstrumentation.execStartActivity(context, iBinder, iBinder2, str, intent, i, bundle, userHandle);
        HookEventUtil.methodEventEnd(activityName, "execStartActivity_String_Bundle_UserHandle");
        return execStartActivity;
    }

    @TargetApi(23)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "193f69159de69d2df49d12cf74251054", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "193f69159de69d2df49d12cf74251054");
        }
        String activityName = HookEventUtil.getActivityName(intent);
        HookEventUtil.methodEventStart(activityName, "execStartActivity_String_Bundle");
        Utils.setClassLoader(intent);
        Instrumentation.ActivityResult execStartActivity = this.mtInstrumentation.execStartActivity(context, iBinder, iBinder2, str, intent, i, bundle);
        HookEventUtil.methodEventEnd(activityName, "execStartActivity_String_Bundle");
        return execStartActivity;
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws InstantiationException, IllegalAccessException {
        Object[] objArr = {cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8fcfb8746a3c64fe05a5bb55857708e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8fcfb8746a3c64fe05a5bb55857708e");
        }
        String activityName = HookEventUtil.getActivityName(intent);
        HookEventUtil.methodEventStart(activityName, "newActivity_IBinder_Application");
        Utils.setClassLoader(intent);
        Activity newActivity = this.mtInstrumentation.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        HookEventUtil.methodEventEnd(activityName, "newActivity_IBinder_Application");
        return newActivity;
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Activity processClassNotFoundException;
        Object[] objArr = {classLoader, str, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0050e98bb2fb32a4657081e36279073c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0050e98bb2fb32a4657081e36279073c");
        }
        HookEventUtil.methodEventStart(str, "newActivity_String_Intent");
        Utils.setClassLoader(intent);
        try {
            processClassNotFoundException = this.mtInstrumentation.newActivity(classLoader, str, intent);
        } catch (Exception e) {
            processClassNotFoundException = processClassNotFoundException(classLoader, str, intent, e);
            if (processClassNotFoundException == null) {
                throw e;
            }
        }
        HookEventUtil.methodEventEnd(str, "newActivity_String_Intent");
        return processClassNotFoundException;
    }

    private Activity processClassNotFoundException(ClassLoader classLoader, String str, Intent intent, Exception exc) {
        Object[] objArr = {classLoader, str, intent, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b04636b2639401646b31f79c44322d10", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b04636b2639401646b31f79c44322d10");
        }
        Activity activity = null;
        if (ArbiterHook.isDebug() || ArbiterHook.getContext() == null) {
            return null;
        }
        if (exc.getMessage() != null && exc.getMessage().contains("ClassNotFoundException") && (exc.getMessage().contains("unmarshalling") || exc.getMessage().contains("Serializable"))) {
            Context context = ArbiterHook.getContext();
            Intent intent2 = new Intent();
            intent2.setPackage(context.getPackageName());
            intent2.setAction("android.intent.action.MAIN");
            try {
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent2, 0);
                activity = (resolveActivity == null || resolveActivity.activityInfo == null) ? null : this.mtInstrumentation.newActivity(classLoader, resolveActivity.activityInfo.name, intent2);
            } catch (Exception unused) {
            }
            PrintStream printStream = System.out;
            printStream.println(str + StringUtil.SPACE + Log.getStackTraceString(exc));
            ArbiterHook.reportError("ClassNotFoundException", exc);
        }
        return activity;
    }

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1282dade5cf677ef2a215499cf87ca24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1282dade5cf677ef2a215499cf87ca24");
            return;
        }
        Utils.setClassLoader(bundle);
        this.mtInstrumentation.onCreate(bundle);
    }

    @Override // android.app.Instrumentation
    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d77f595d53e6cba1c3f2f1b093d9fad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d77f595d53e6cba1c3f2f1b093d9fad");
        } else {
            this.mtInstrumentation.start();
        }
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebe4dba49d8678574c2fa9facece1371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebe4dba49d8678574c2fa9facece1371");
        } else {
            this.mtInstrumentation.onStart();
        }
    }

    @Override // android.app.Instrumentation
    public boolean onException(Object obj, Throwable th) {
        Object[] objArr = {obj, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6a5be8acafdc9e7377674420116cc16", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6a5be8acafdc9e7377674420116cc16")).booleanValue() : this.mtInstrumentation.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public void sendStatus(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31d7f62572940f94e623f1a7fa7c8a4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31d7f62572940f94e623f1a7fa7c8a4d");
            return;
        }
        Utils.setClassLoader(bundle);
        this.mtInstrumentation.sendStatus(i, bundle);
    }

    @Override // android.app.Instrumentation
    public void finish(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d83c5dc67f179842a2feb4cf064b6e67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d83c5dc67f179842a2feb4cf064b6e67");
            return;
        }
        Utils.setClassLoader(bundle);
        this.mtInstrumentation.finish(i, bundle);
    }

    @Override // android.app.Instrumentation
    public void setAutomaticPerformanceSnapshots() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef77cf10e4e7ab1cd44bf069c4418d32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef77cf10e4e7ab1cd44bf069c4418d32");
        } else {
            this.mtInstrumentation.setAutomaticPerformanceSnapshots();
        }
    }

    @Override // android.app.Instrumentation
    public void startPerformanceSnapshot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2d417deaf166d8e71133a2da47ebbd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2d417deaf166d8e71133a2da47ebbd5");
        } else {
            this.mtInstrumentation.startPerformanceSnapshot();
        }
    }

    @Override // android.app.Instrumentation
    public void endPerformanceSnapshot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23fecfc6951f32e9442a4f0b18f7470c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23fecfc6951f32e9442a4f0b18f7470c");
        } else {
            this.mtInstrumentation.endPerformanceSnapshot();
        }
    }

    @Override // android.app.Instrumentation
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f2f2dd189149d698c13f8f919dab849", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f2f2dd189149d698c13f8f919dab849");
        } else {
            this.mtInstrumentation.onDestroy();
        }
    }

    @Override // android.app.Instrumentation
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35cb7e50acffbfe26feec4d4d0520824", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35cb7e50acffbfe26feec4d4d0520824") : this.mtInstrumentation.getContext();
    }

    @Override // android.app.Instrumentation
    public ComponentName getComponentName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba10548cc2711e510c676cb482ecc1ec", RobustBitConfig.DEFAULT_VALUE) ? (ComponentName) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba10548cc2711e510c676cb482ecc1ec") : this.mtInstrumentation.getComponentName();
    }

    @Override // android.app.Instrumentation
    public Context getTargetContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0861026b2500dc0c8461c1d9644ce69", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0861026b2500dc0c8461c1d9644ce69") : this.mtInstrumentation.getTargetContext();
    }

    @Override // android.app.Instrumentation
    public boolean isProfiling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bac84f1ea632d3b4b62ea679744f309", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bac84f1ea632d3b4b62ea679744f309")).booleanValue() : this.mtInstrumentation.isProfiling();
    }

    @Override // android.app.Instrumentation
    public void startProfiling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "208f6ff6f9d8f0f90c3ef40e310e937c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "208f6ff6f9d8f0f90c3ef40e310e937c");
        } else {
            this.mtInstrumentation.startProfiling();
        }
    }

    @Override // android.app.Instrumentation
    public void stopProfiling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "965eabdaab3034091c12f404fb3a8036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "965eabdaab3034091c12f404fb3a8036");
        } else {
            this.mtInstrumentation.stopProfiling();
        }
    }

    @Override // android.app.Instrumentation
    public void setInTouchMode(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27f762d0d39e728be61e0629b945adbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27f762d0d39e728be61e0629b945adbb");
        } else {
            this.mtInstrumentation.setInTouchMode(z);
        }
    }

    @Override // android.app.Instrumentation
    public void waitForIdle(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eebe5de5380e0102bac86c3252243b69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eebe5de5380e0102bac86c3252243b69");
        } else {
            this.mtInstrumentation.waitForIdle(runnable);
        }
    }

    @Override // android.app.Instrumentation
    public void waitForIdleSync() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "191d0e8b23afb40b6e891b6981b93325", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "191d0e8b23afb40b6e891b6981b93325");
        } else {
            this.mtInstrumentation.waitForIdleSync();
        }
    }

    @Override // android.app.Instrumentation
    public void runOnMainSync(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0b6732a625e1ce07c00909ff7f1d999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0b6732a625e1ce07c00909ff7f1d999");
        } else {
            this.mtInstrumentation.runOnMainSync(runnable);
        }
    }

    @Override // android.app.Instrumentation
    public Activity startActivitySync(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a06cd89b1d61beda92d3ecf0a6aeec7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a06cd89b1d61beda92d3ecf0a6aeec7b");
        }
        Utils.setClassLoader(intent);
        return this.mtInstrumentation.startActivitySync(intent);
    }

    @Override // android.app.Instrumentation
    public void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        Object[] objArr = {activityMonitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "290f7c6472e0940c854b4d1550f87376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "290f7c6472e0940c854b4d1550f87376");
        } else {
            this.mtInstrumentation.addMonitor(activityMonitor);
        }
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        Object[] objArr = {intentFilter, activityResult, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45bd69120d3753e078e4a83828b2b6b0", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityMonitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45bd69120d3753e078e4a83828b2b6b0") : this.mtInstrumentation.addMonitor(intentFilter, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z) {
        Object[] objArr = {str, activityResult, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09e06b64b27c84cf05a55a84f5da8db6", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityMonitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09e06b64b27c84cf05a55a84f5da8db6") : this.mtInstrumentation.addMonitor(str, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        Object[] objArr = {activityMonitor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0529aced75224cc4f780a0202a98ded9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0529aced75224cc4f780a0202a98ded9")).booleanValue() : this.mtInstrumentation.checkMonitorHit(activityMonitor, i);
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        Object[] objArr = {activityMonitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83e4bf68825ed8ab9aa12387d0f04dc4", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83e4bf68825ed8ab9aa12387d0f04dc4") : this.mtInstrumentation.waitForMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        Object[] objArr = {activityMonitor, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "377d0fcddf23a45b18061149de2c7f8c", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "377d0fcddf23a45b18061149de2c7f8c") : this.mtInstrumentation.waitForMonitorWithTimeout(activityMonitor, j);
    }

    @Override // android.app.Instrumentation
    public void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        Object[] objArr = {activityMonitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fbb7c311f0f95c7b0fbe1d18037922d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fbb7c311f0f95c7b0fbe1d18037922d");
        } else {
            this.mtInstrumentation.removeMonitor(activityMonitor);
        }
    }

    @Override // android.app.Instrumentation
    public boolean invokeMenuActionSync(Activity activity, int i, int i2) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0326283fe5d51403de4d7abf524f3bb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0326283fe5d51403de4d7abf524f3bb")).booleanValue() : this.mtInstrumentation.invokeMenuActionSync(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public boolean invokeContextMenuAction(Activity activity, int i, int i2) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "485f2d87ec6859aab95bc87f29b8c54e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "485f2d87ec6859aab95bc87f29b8c54e")).booleanValue() : this.mtInstrumentation.invokeContextMenuAction(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public void sendStringSync(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9575e317e802b5b8a26ad2b504db126e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9575e317e802b5b8a26ad2b504db126e");
        } else {
            this.mtInstrumentation.sendStringSync(str);
        }
    }

    @Override // android.app.Instrumentation
    public void sendKeySync(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45ee3253707bde266dac0a82bf3b6539", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45ee3253707bde266dac0a82bf3b6539");
        } else {
            this.mtInstrumentation.sendKeySync(keyEvent);
        }
    }

    @Override // android.app.Instrumentation
    public void sendKeyDownUpSync(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "589b4bf02f4293b52d518c7aa2ec1220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "589b4bf02f4293b52d518c7aa2ec1220");
        } else {
            this.mtInstrumentation.sendKeyDownUpSync(i);
        }
    }

    @Override // android.app.Instrumentation
    public void sendCharacterSync(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "023a708b07ec2a17e4033e9ad0fcc48f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "023a708b07ec2a17e4033e9ad0fcc48f");
        } else {
            this.mtInstrumentation.sendCharacterSync(i);
        }
    }

    @Override // android.app.Instrumentation
    public void sendPointerSync(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6bbde2a2830072028b8ada699fa46b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6bbde2a2830072028b8ada699fa46b5");
        } else {
            this.mtInstrumentation.sendPointerSync(motionEvent);
        }
    }

    @Override // android.app.Instrumentation
    public void sendTrackballEventSync(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "644dfdabcd36f4209000ed33cc48c3e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "644dfdabcd36f4209000ed33cc48c3e8");
        } else {
            this.mtInstrumentation.sendTrackballEventSync(motionEvent);
        }
    }

    @Override // android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object[] objArr = {classLoader, str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fce2013bfda22708d2cf8076bec028e", RobustBitConfig.DEFAULT_VALUE) ? (Application) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fce2013bfda22708d2cf8076bec028e") : this.mtInstrumentation.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89212e6dc59b7893a589abb5e1df97f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89212e6dc59b7893a589abb5e1df97f1");
        } else {
            this.mtInstrumentation.callApplicationOnCreate(application);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "709967eaaefa27008310c722f567629a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "709967eaaefa27008310c722f567629a");
            return;
        }
        String name = activity != null ? activity.getClass().getName() : "";
        HookEventUtil.methodEventStart(name, "OnCreate");
        Utils.setClassLoader(bundle);
        this.mtInstrumentation.callActivityOnCreate(activity, bundle);
        HookEventUtil.methodEventEnd(name, "OnCreate");
    }

    @Override // android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {activity, bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2d1eb4bad94a73b3922a393032716a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2d1eb4bad94a73b3922a393032716a9");
            return;
        }
        String name = activity != null ? activity.getClass().getName() : "";
        HookEventUtil.methodEventStart(name, "OnCreate");
        Utils.setClassLoader(bundle, persistableBundle);
        this.mtInstrumentation.callActivityOnCreate(activity, bundle, persistableBundle);
        HookEventUtil.methodEventEnd(name, "OnCreate");
    }

    @Override // android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4800c23d8cf56a598f75965ddef8227b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4800c23d8cf56a598f75965ddef8227b");
            return;
        }
        String name = activity != null ? activity.getClass().getName() : "";
        HookEventUtil.methodEventStart(name, "onDestroy");
        this.mtInstrumentation.callActivityOnDestroy(activity);
        HookEventUtil.methodEventEnd(name, "onDestroy");
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa56732f1e993dc5c5945c6e72b161f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa56732f1e993dc5c5945c6e72b161f8");
            return;
        }
        Utils.setClassLoader(bundle);
        this.mtInstrumentation.callActivityOnRestoreInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {activity, bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21f188f41e2e7a5eccbd030cbb4414f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21f188f41e2e7a5eccbd030cbb4414f3");
            return;
        }
        Utils.setClassLoader(bundle, persistableBundle);
        this.mtInstrumentation.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18665282836d4aed56b2d77826d9b857", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18665282836d4aed56b2d77826d9b857");
            return;
        }
        Utils.setClassLoader(bundle);
        this.mtInstrumentation.callActivityOnPostCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {activity, bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43f8e6fa6e65ecfcf4778ee4149e115e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43f8e6fa6e65ecfcf4778ee4149e115e");
            return;
        }
        Utils.setClassLoader(bundle, persistableBundle);
        this.mtInstrumentation.callActivityOnPostCreate(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        Object[] objArr = {activity, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4faa1eb84f65a3b1a11c0335b5e7440e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4faa1eb84f65a3b1a11c0335b5e7440e");
            return;
        }
        Utils.setClassLoader(intent);
        this.mtInstrumentation.callActivityOnNewIntent(activity, intent);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStart(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70d08165a27c37f890320a7feb96dac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70d08165a27c37f890320a7feb96dac9");
            return;
        }
        String name = activity != null ? activity.getClass().getName() : "";
        HookEventUtil.methodEventStart(name, "OnStart");
        this.mtInstrumentation.callActivityOnStart(activity);
        HookEventUtil.methodEventEnd(name, "OnStart");
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestart(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47b6acc98d593d825c62d9e747d84ee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47b6acc98d593d825c62d9e747d84ee2");
            return;
        }
        String name = activity != null ? activity.getClass().getName() : "";
        HookEventUtil.methodEventStart(name, "OnRestart");
        this.mtInstrumentation.callActivityOnRestart(activity);
        HookEventUtil.methodEventEnd(name, "OnRestart");
    }

    @Override // android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e91f983445987617a3b942265d44b428", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e91f983445987617a3b942265d44b428");
            return;
        }
        String name = activity != null ? activity.getClass().getName() : "";
        HookEventUtil.methodEventStart(name, "OnResume");
        this.mtInstrumentation.callActivityOnResume(activity);
        HookEventUtil.methodEventEnd(name, "OnResume");
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70ce960807d0fec93f93245a45f2c212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70ce960807d0fec93f93245a45f2c212");
            return;
        }
        String name = activity != null ? activity.getClass().getName() : "";
        HookEventUtil.methodEventStart(name, "OnStop");
        this.mtInstrumentation.callActivityOnStop(activity);
        HookEventUtil.methodEventEnd(name, "OnStop");
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d96617c868627f89f0aee16fcdf28af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d96617c868627f89f0aee16fcdf28af");
            return;
        }
        Utils.setClassLoader(bundle);
        this.mtInstrumentation.callActivityOnSaveInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    @SuppressLint({"NewApi"})
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {activity, bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "155b5127bca473ebb16cbdb961deee71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "155b5127bca473ebb16cbdb961deee71");
            return;
        }
        Utils.setClassLoader(bundle, persistableBundle);
        this.mtInstrumentation.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPause(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51c5cc7278da2951eaa8259d1be977d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51c5cc7278da2951eaa8259d1be977d1");
            return;
        }
        String name = activity != null ? activity.getClass().getName() : "";
        HookEventUtil.methodEventStart(name, "OnPause");
        this.mtInstrumentation.callActivityOnPause(activity);
        HookEventUtil.methodEventEnd(name, "OnPause");
    }

    @Override // android.app.Instrumentation
    public void callActivityOnUserLeaving(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f6cb4aeec8d8492d25f59fe32eb8297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f6cb4aeec8d8492d25f59fe32eb8297");
        } else {
            this.mtInstrumentation.callActivityOnUserLeaving(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void startAllocCounting() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a60a7915c1074e64ea6a43e61e43137", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a60a7915c1074e64ea6a43e61e43137");
        } else {
            this.mtInstrumentation.startAllocCounting();
        }
    }

    @Override // android.app.Instrumentation
    public void stopAllocCounting() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13a4f33f691b30aeba2ecefdfc0e1e41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13a4f33f691b30aeba2ecefdfc0e1e41");
        } else {
            this.mtInstrumentation.stopAllocCounting();
        }
    }

    @Override // android.app.Instrumentation
    public Bundle getAllocCounts() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1be2b7541c83d2ae44191a1fb629504", RobustBitConfig.DEFAULT_VALUE) ? (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1be2b7541c83d2ae44191a1fb629504") : this.mtInstrumentation.getAllocCounts();
    }

    @Override // android.app.Instrumentation
    public Bundle getBinderCounts() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eebf7f46e312255a4b64179026ba0ba7", RobustBitConfig.DEFAULT_VALUE) ? (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eebf7f46e312255a4b64179026ba0ba7") : this.mtInstrumentation.getBinderCounts();
    }

    @Override // android.app.Instrumentation
    @TargetApi(18)
    public UiAutomation getUiAutomation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1698e3ca0997c7a2013b8b9f09d1af6f", RobustBitConfig.DEFAULT_VALUE) ? (UiAutomation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1698e3ca0997c7a2013b8b9f09d1af6f") : this.mtInstrumentation.getUiAutomation();
    }

    @Override // android.app.Instrumentation
    @SuppressLint({"NewApi"})
    public UiAutomation getUiAutomation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "510419ff3acd284e5f7a734249984c0e", RobustBitConfig.DEFAULT_VALUE) ? (UiAutomation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "510419ff3acd284e5f7a734249984c0e") : this.mtInstrumentation.getUiAutomation(i);
    }
}
