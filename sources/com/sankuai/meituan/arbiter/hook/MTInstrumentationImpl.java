package com.sankuai.meituan.arbiter.hook;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.UiAutomation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTInstrumentationImpl extends MTInstrumentation {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final String errUriStr = "imeituan://www.meituan.com/arbiter/errinfo";
    private static Object sActivityThread;
    protected Instrumentation mBase;
    protected Context mContext;
    protected Method mMethodExecStartActivity;

    public MTInstrumentationImpl(Context context, Instrumentation instrumentation) {
        Object[] objArr = {context, instrumentation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce3001df2d5312c37f16923104293082", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce3001df2d5312c37f16923104293082");
            return;
        }
        this.mContext = context;
        this.mBase = instrumentation;
        initMethodExecStartActivity(this.mBase.getClass());
    }

    public void initMethodExecStartActivity(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba4ac388f16c554c37494c0652ef9ff8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba4ac388f16c554c37494c0652ef9ff8");
            return;
        }
        Utils.debugExecTimeBegin("MTInstrumentationImpl.initMethodExecStartActivity");
        try {
            try {
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        this.mMethodExecStartActivity = cls.getDeclaredMethod("execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class);
                        this.mMethodExecStartActivity.setAccessible(true);
                    } else {
                        this.mMethodExecStartActivity = cls.getDeclaredMethod("execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE);
                        this.mMethodExecStartActivity.setAccessible(true);
                    }
                } catch (NoSuchMethodException e) {
                    if (Instrumentation.class.isAssignableFrom(cls.getSuperclass())) {
                        initMethodExecStartActivity(cls.getSuperclass());
                    } else {
                        DebugLogUtil.e("initMethodExecStartActivity NoSuchMethodException, Class : " + cls.getName(), e);
                        ArbiterHook.reportError("NoSuchMethodException", new RuntimeException("initMethodExecStartActivity NoSuchMethodException, Class : " + cls.getName(), e));
                    }
                }
            } catch (Exception e2) {
                DebugLogUtil.e("initMethodExecStartActivity Exception, Class : " + cls.getName(), e2);
                ArbiterHook.reportError("initMethodExecStartActivity_exception", new RuntimeException("initMethodExecStartActivity Exception, Class : " + cls.getName(), e2));
            }
        } finally {
            Utils.debugExecTimeEnd("MTInstrumentationImpl.initMethodExecStartActivity");
        }
    }

    public Intent handleStartError(Context context, Intent intent, Throwable th, String str) {
        Uri data;
        String str2;
        Object[] objArr = {context, intent, th, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfad48e8805f8f711f87f255772f2dbd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfad48e8805f8f711f87f255772f2dbd");
        }
        DebugLogUtil.e("StartActivity Error, target: " + intent, th);
        LogCollector.instance().addLogForExecStartActivity("error", str + StringUtil.SPACE + Log.getStackTraceString(th));
        if (ArbiterHook.isDebug()) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(errUriStr));
            if (context != null) {
                intent2.setPackage(context.getPackageName());
            }
            if (!(context instanceof Activity)) {
                intent2.addFlags(y.a);
            }
            intent2.putExtra(Utils.INTENT_KEY_INTENT, intent.toString());
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            Throwable cause = th.getCause();
            if (cause != null) {
                cause.printStackTrace(printWriter);
            } else {
                th.printStackTrace(printWriter);
            }
            printWriter.close();
            intent2.putExtra(Utils.INTENT_KEY_TRACE, stringWriter.toString());
            return intent2;
        }
        if (intent.getData() != null) {
            str2 = data.getScheme() + "://" + data.getAuthority() + data.getPath();
        } else {
            str2 = "default";
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(Utils.INTENT_KEY_INTENT, intent);
        if (TextUtils.isEmpty(str)) {
            str = "Error";
        }
        ArbiterHook.reportError(context, th.getClass().getSimpleName() + CommonConstant.Symbol.MINUS + str2, new RuntimeException(str, th), bundle);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.app.Instrumentation.ActivityResult execStartActivityInternal(android.content.Context r23, android.os.IBinder r24, android.os.IBinder r25, android.app.Activity r26, android.content.Intent r27, int r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.arbiter.hook.MTInstrumentationImpl.execStartActivityInternal(android.content.Context, android.os.IBinder, android.os.IBinder, android.app.Activity, android.content.Intent, int, android.os.Bundle):android.app.Instrumentation$ActivityResult");
    }

    public boolean isReady() {
        return (this.mContext == null || this.mBase == null || this.mMethodExecStartActivity == null) ? false : true;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17162061bc39f73fa1c7a76443630680", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17162061bc39f73fa1c7a76443630680");
        }
        Utils.debugExecTimeBegin("MTInstrumentationImpl.execStartActivity");
        DebugLogUtil.d("execStartActivity(Context who, IBinder contextThread, IBinder token, Activity target, Intent intent, int requestCode)");
        Instrumentation.ActivityResult execStartActivityInternal = execStartActivityInternal(context, iBinder, iBinder2, activity, intent, i, null);
        Utils.debugExecTimeEnd("MTInstrumentationImpl.execStartActivity");
        return execStartActivityInternal;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    @TargetApi(16)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02b36605bfe45c6e28fd1b53b071db09", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02b36605bfe45c6e28fd1b53b071db09");
        }
        Utils.debugExecTimeBegin("MTInstrumentationImpl.execStartActivity");
        DebugLogUtil.d("execStartActivity(Context who, IBinder contextThread, IBinder token, Activity target, Intent intent, int requestCode, Bundle bundle)");
        Instrumentation.ActivityResult execStartActivityInternal = execStartActivityInternal(context, iBinder, iBinder2, activity, intent, i, bundle);
        Utils.debugExecTimeEnd("MTInstrumentationImpl.execStartActivity");
        return execStartActivityInternal;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws InstantiationException, IllegalAccessException {
        Intent intent2;
        Object[] objArr = {cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c622d5a67c39009579df95c428c5b3e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c622d5a67c39009579df95c428c5b3e7");
        }
        Utils.debugExecTimeBegin("MTInstrumentationImpl.newActivity");
        DebugLogUtil.d("newActivity(Class<?> clazz, Context context, IBinder token, Application application, Intent intent, ActivityInfo info, CharSequence title, Activity parent, String id, Object lastNonConfigurationInstance)");
        try {
            intent2 = intent;
            try {
                Activity newActivity = this.mBase.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
                Utils.debugExecTimeEnd("MTInstrumentationImpl.newActivity");
                return newActivity;
            } catch (Throwable th) {
                th = th;
                String name = cls == null ? "..." : cls.getName();
                handleStartError(null, intent2, th, "newActivity " + name + " Error");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            intent2 = intent;
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object[] objArr = {classLoader, str, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc3d3b1151e8770a05dd1a09e0011a7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc3d3b1151e8770a05dd1a09e0011a7a");
        }
        Utils.debugExecTimeBegin("MTInstrumentationImpl.newActivity");
        DebugLogUtil.d("newActivity(ClassLoader cl, String className, Intent intent)");
        try {
            Activity newActivity = this.mBase.newActivity(classLoader, str, intent);
            Utils.debugExecTimeEnd("MTInstrumentationImpl.newActivity");
            return newActivity;
        } catch (Throwable th) {
            handleStartError(null, intent, th, "newActivity " + str + " Error");
            throw th;
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bec1b304e387ba95435464da5fe3474e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bec1b304e387ba95435464da5fe3474e");
        } else {
            this.mBase.onCreate(bundle);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7f1c9c7fcebeed1af50b1e4927da80f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7f1c9c7fcebeed1af50b1e4927da80f");
        } else {
            this.mBase.start();
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84b113ce5a94c12e80ff96fc04494333", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84b113ce5a94c12e80ff96fc04494333");
        } else {
            this.mBase.onStart();
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public boolean onException(Object obj, Throwable th) {
        Object[] objArr = {obj, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c450d7fbc0caffdfc723646a2d1a2876", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c450d7fbc0caffdfc723646a2d1a2876")).booleanValue() : this.mBase.onException(obj, th);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void sendStatus(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c660188ddf088a4930c7cca581b2edb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c660188ddf088a4930c7cca581b2edb0");
        } else {
            this.mBase.sendStatus(i, bundle);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void finish(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "573b7d6bb890f0db8add0a9ec367fe96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "573b7d6bb890f0db8add0a9ec367fe96");
        } else {
            this.mBase.finish(i, bundle);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void setAutomaticPerformanceSnapshots() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bfe940b5e66a62575b63cf1065f215d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bfe940b5e66a62575b63cf1065f215d");
        } else {
            this.mBase.setAutomaticPerformanceSnapshots();
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void startPerformanceSnapshot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f163d9b0662854ee6442fd7900df237", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f163d9b0662854ee6442fd7900df237");
        } else {
            this.mBase.startPerformanceSnapshot();
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void endPerformanceSnapshot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78fcfa9b0a0b47f66c69d492e3020147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78fcfa9b0a0b47f66c69d492e3020147");
        } else {
            this.mBase.endPerformanceSnapshot();
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "010aa37fb5c9f815d5b4bf578f19dbc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "010aa37fb5c9f815d5b4bf578f19dbc9");
        } else {
            this.mBase.onDestroy();
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a0c5b338faf1837275c7530f6980e9f", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a0c5b338faf1837275c7530f6980e9f") : this.mBase.getContext();
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public ComponentName getComponentName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76edf62f487de6e3c6507faae504f674", RobustBitConfig.DEFAULT_VALUE) ? (ComponentName) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76edf62f487de6e3c6507faae504f674") : this.mBase.getComponentName();
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Context getTargetContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb9ec0394446199a05bd83f9a6c29624", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb9ec0394446199a05bd83f9a6c29624") : this.mBase.getTargetContext();
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public boolean isProfiling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e98e302bb6da1cf79177b221305b00d5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e98e302bb6da1cf79177b221305b00d5")).booleanValue() : this.mBase.isProfiling();
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void startProfiling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8642f6716d0314ae699d793d1d4877d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8642f6716d0314ae699d793d1d4877d8");
        } else {
            this.mBase.startProfiling();
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void stopProfiling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b1e3d5f6ee53cee310e24e9063c0488", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b1e3d5f6ee53cee310e24e9063c0488");
        } else {
            this.mBase.stopProfiling();
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void setInTouchMode(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "659a663fad922207be0b114022c16c05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "659a663fad922207be0b114022c16c05");
        } else {
            this.mBase.setInTouchMode(z);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void waitForIdle(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da126a6a0bb662c7200f32c435575aa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da126a6a0bb662c7200f32c435575aa9");
        } else {
            this.mBase.waitForIdle(runnable);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void waitForIdleSync() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9b0e39613135e5d7496ef09e971f734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9b0e39613135e5d7496ef09e971f734");
        } else {
            this.mBase.waitForIdleSync();
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void runOnMainSync(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb59b824ac1061f766049e7aab6df8df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb59b824ac1061f766049e7aab6df8df");
        } else {
            this.mBase.runOnMainSync(runnable);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Activity startActivitySync(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91b8433dda87e51511342147b669aebd", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91b8433dda87e51511342147b669aebd") : this.mBase.startActivitySync(intent);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        Object[] objArr = {activityMonitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e7568fc0e0de0f60065eac48dfe7801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e7568fc0e0de0f60065eac48dfe7801");
        } else {
            this.mBase.addMonitor(activityMonitor);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        Object[] objArr = {intentFilter, activityResult, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d18d4cd2c9a77dcfb74004595ce6e812", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityMonitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d18d4cd2c9a77dcfb74004595ce6e812") : this.mBase.addMonitor(intentFilter, activityResult, z);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z) {
        Object[] objArr = {str, activityResult, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d039c2559ff9736ad8bbd53cd6948706", RobustBitConfig.DEFAULT_VALUE) ? (Instrumentation.ActivityMonitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d039c2559ff9736ad8bbd53cd6948706") : this.mBase.addMonitor(str, activityResult, z);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        Object[] objArr = {activityMonitor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b7a7df6f51a7096f7645ff61a304d3f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b7a7df6f51a7096f7645ff61a304d3f")).booleanValue() : this.mBase.checkMonitorHit(activityMonitor, i);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        Object[] objArr = {activityMonitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f052dad666c70c496ce5b2b407aa120", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f052dad666c70c496ce5b2b407aa120") : this.mBase.waitForMonitor(activityMonitor);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        Object[] objArr = {activityMonitor, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31fbb859456d16b6d116481a025269e2", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31fbb859456d16b6d116481a025269e2") : this.mBase.waitForMonitorWithTimeout(activityMonitor, j);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        Object[] objArr = {activityMonitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d58249339beb2a2632ae3f9a709b7228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d58249339beb2a2632ae3f9a709b7228");
        } else {
            this.mBase.removeMonitor(activityMonitor);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public boolean invokeMenuActionSync(Activity activity, int i, int i2) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90fc868d1fe99dba0c30059d7c8319ed", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90fc868d1fe99dba0c30059d7c8319ed")).booleanValue() : this.mBase.invokeMenuActionSync(activity, i, i2);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public boolean invokeContextMenuAction(Activity activity, int i, int i2) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc85929ffa7259c7d64ab6f1f03a4f99", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc85929ffa7259c7d64ab6f1f03a4f99")).booleanValue() : this.mBase.invokeContextMenuAction(activity, i, i2);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void sendStringSync(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6488184e436b025e9e03850fdba7f1c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6488184e436b025e9e03850fdba7f1c2");
        } else {
            this.mBase.sendStringSync(str);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void sendKeySync(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fae0f69d96ef52e1330c0644424ddd9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fae0f69d96ef52e1330c0644424ddd9b");
        } else {
            this.mBase.sendKeySync(keyEvent);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void sendKeyDownUpSync(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dcb9fc96562789049a787c34b8e4258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dcb9fc96562789049a787c34b8e4258");
        } else {
            this.mBase.sendKeyDownUpSync(i);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void sendCharacterSync(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12009cb53308b81a7e79d713f0a5c80b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12009cb53308b81a7e79d713f0a5c80b");
        } else {
            this.mBase.sendCharacterSync(i);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void sendPointerSync(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0854b0cce2b0a314a0176df882c6a386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0854b0cce2b0a314a0176df882c6a386");
        } else {
            this.mBase.sendPointerSync(motionEvent);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void sendTrackballEventSync(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64f58704a593ce1a06874f322a0e6d66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64f58704a593ce1a06874f322a0e6d66");
        } else {
            this.mBase.sendTrackballEventSync(motionEvent);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object[] objArr = {classLoader, str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97dff9c8cd5b1c6109a89a6c4ad35c76", RobustBitConfig.DEFAULT_VALUE) ? (Application) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97dff9c8cd5b1c6109a89a6c4ad35c76") : this.mBase.newApplication(classLoader, str, context);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4095482543346d8bcf59891d20578e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4095482543346d8bcf59891d20578e1");
        } else {
            this.mBase.callApplicationOnCreate(application);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a85a10fa25c9d370c8f5459be1fc863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a85a10fa25c9d370c8f5459be1fc863");
        } else {
            this.mBase.callActivityOnCreate(activity, bundle);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {activity, bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d29a174d56910674a7ea5b5f233318b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d29a174d56910674a7ea5b5f233318b2");
        } else {
            this.mBase.callActivityOnCreate(activity, bundle, persistableBundle);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ec9882bacfa18550ca9146aed81b1be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ec9882bacfa18550ca9146aed81b1be");
        } else {
            this.mBase.callActivityOnDestroy(activity);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        Bundle bundle2;
        ClassLoader classLoader;
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b499681f6ee4ccfa85886c3cf31706b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b499681f6ee4ccfa85886c3cf31706b");
            return;
        }
        if (Build.VERSION.SDK_INT == 28 && (bundle2 = bundle.getBundle("android:viewHierarchyState")) != null && ((classLoader = bundle2.getClassLoader()) == null || classLoader.getClass().getSimpleName().equals("BootClassLoader"))) {
            bundle2.setClassLoader(activity.getApplicationContext().getClassLoader());
        }
        this.mBase.callActivityOnRestoreInstanceState(activity, bundle);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {activity, bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "859f7a085beeae915273fce036b944e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "859f7a085beeae915273fce036b944e4");
        } else {
            this.mBase.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc0149ff281e7aff3b9ff738e935a933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc0149ff281e7aff3b9ff738e935a933");
        } else {
            this.mBase.callActivityOnPostCreate(activity, bundle);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {activity, bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad8ddd91a96152056edd4cdb2151351a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad8ddd91a96152056edd4cdb2151351a");
        } else {
            this.mBase.callActivityOnPostCreate(activity, bundle, persistableBundle);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        Object[] objArr = {activity, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9174f3a2ec3f399fd968dfa46871f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9174f3a2ec3f399fd968dfa46871f0f");
        } else {
            this.mBase.callActivityOnNewIntent(activity, intent);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnStart(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfb783dc09bb86737fba42df89a5cdfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfb783dc09bb86737fba42df89a5cdfc");
        } else {
            this.mBase.callActivityOnStart(activity);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnRestart(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d22010e9a18fb22aae8d5e33a6d31bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d22010e9a18fb22aae8d5e33a6d31bd");
        } else {
            this.mBase.callActivityOnRestart(activity);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65d2c8340a5261d74eaa5ea629451d75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65d2c8340a5261d74eaa5ea629451d75");
        } else {
            this.mBase.callActivityOnResume(activity);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0951e82c9e494533cffccb2b7f71a3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0951e82c9e494533cffccb2b7f71a3e");
        } else {
            this.mBase.callActivityOnStop(activity);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a0bc83fb9a69e5314390777f3944606", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a0bc83fb9a69e5314390777f3944606");
        } else {
            this.mBase.callActivityOnSaveInstanceState(activity, bundle);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {activity, bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c1724a4abbcac379b4cc09ec0b51589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c1724a4abbcac379b4cc09ec0b51589");
        } else {
            this.mBase.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnPause(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f97f366bd6b62b3c17f573767ea00840", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f97f366bd6b62b3c17f573767ea00840");
        } else {
            this.mBase.callActivityOnPause(activity);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnUserLeaving(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1face6580d8a43bfa01d505ce3ad4a80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1face6580d8a43bfa01d505ce3ad4a80");
        } else {
            this.mBase.callActivityOnUserLeaving(activity);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void startAllocCounting() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e25a39e8e613b530c6626345694fb353", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e25a39e8e613b530c6626345694fb353");
        } else {
            this.mBase.startAllocCounting();
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void stopAllocCounting() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36c499f59217808e7310c267918b9e85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36c499f59217808e7310c267918b9e85");
        } else {
            this.mBase.stopAllocCounting();
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Bundle getAllocCounts() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "074b0d4224c21d93446c67831ea7af20", RobustBitConfig.DEFAULT_VALUE) ? (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "074b0d4224c21d93446c67831ea7af20") : this.mBase.getAllocCounts();
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public Bundle getBinderCounts() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8d7a9519a14dcb8d9050933aed0bc50", RobustBitConfig.DEFAULT_VALUE) ? (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8d7a9519a14dcb8d9050933aed0bc50") : this.mBase.getBinderCounts();
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    @TargetApi(18)
    public UiAutomation getUiAutomation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5226569ac2f83254c94d1a1a1d0332c2", RobustBitConfig.DEFAULT_VALUE) ? (UiAutomation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5226569ac2f83254c94d1a1a1d0332c2") : this.mBase.getUiAutomation();
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    @TargetApi(24)
    public UiAutomation getUiAutomation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b12cd8786b7e3b30b3033434e330553", RobustBitConfig.DEFAULT_VALUE) ? (UiAutomation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b12cd8786b7e3b30b3033434e330553") : this.mBase.getUiAutomation(i);
    }
}
