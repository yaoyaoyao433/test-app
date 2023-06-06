package com.meituan.android.aurora;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import com.meituan.android.aurora.AuroraApplication;
import com.meituan.android.aurora.AuroraHCallbackProxy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.arbiter.hook.ArbiterHook;
import com.sankuai.meituan.arbiter.hook.MTInstrumentation;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AuroraApplication<T extends AuroraApplication> extends Application implements AuroraHCallBack, AuroraHCallbackProxy.ComponentLaunchDispatcher {
    public static final int COMPONENT_ACTIVITY = 0;
    public static final int COMPONENT_BROADCAST = 2;
    public static final int COMPONENT_PROVIDER = 3;
    public static final int COMPONENT_SERVICE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile Application instance;
    private volatile AuroraHCallBack auroraHCallBack;
    private AuroraLifeCycleMonitor mLifeCycleMonitor;
    private boolean shouldNotInit;
    public static final long PROCESS_START_TIME = System.currentTimeMillis();
    public static long sProcessLaunchTime = SystemClock.elapsedRealtime();

    public String[] getLifeCycleIgnoreClassNameArray() {
        return null;
    }

    public void newActivityChecker(String str, Intent intent) {
    }

    @Override // com.meituan.android.aurora.AuroraHCallbackProxy.ComponentLaunchDispatcher
    public void onComponentLaunch(int i, Object obj) {
    }

    public abstract void whenOnCreate();

    public AuroraApplication() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "842f121bd6d26c5fac2faf8a1c4a62fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "842f121bd6d26c5fac2faf8a1c4a62fd");
            return;
        }
        this.mLifeCycleMonitor = new AuroraLifeCycleMonitor(this);
        this.shouldNotInit = false;
        instance = this;
        Aurora.init(this);
    }

    public void setShouldNotInitTrue() {
        this.shouldNotInit = true;
    }

    public boolean getShouldNotInit() {
        return this.shouldNotInit;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40672a03ba3c0394dc028142603f1eb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40672a03ba3c0394dc028142603f1eb3");
            return;
        }
        super.attachBaseContext(context);
        if (this.shouldNotInit) {
            return;
        }
        try {
            ArbiterHook.injectInstrumentationHook(this);
            ArbiterHook.addMTInstrumentation(new ActivityInterceptor());
            AuroraHCallbackProxy.init(this, this);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ad324de9b4b2895cf572dc6457e8f6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ad324de9b4b2895cf572dc6457e8f6d");
            return;
        }
        super.onCreate();
        if (this.shouldNotInit) {
            return;
        }
        whenOnCreate();
    }

    public boolean setAuroraHCallBack(AuroraHCallBack auroraHCallBack) {
        if (this.auroraHCallBack != null) {
            return false;
        }
        this.auroraHCallBack = auroraHCallBack;
        return true;
    }

    @Override // com.meituan.android.aurora.AuroraHCallBack
    public boolean handleMessage(Handler handler, Handler.Callback callback, Message message) {
        Object[] objArr = {handler, callback, message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62137a7d3ba0475511dc116b31b67cd2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62137a7d3ba0475511dc116b31b67cd2")).booleanValue();
        }
        if (this.auroraHCallBack != null) {
            return this.auroraHCallBack.handleMessage(handler, callback, message);
        }
        return false;
    }

    public static Application getInstance() {
        return instance;
    }

    @Override // android.app.Application
    public void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Object[] objArr = {activityLifecycleCallbacks};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc3196a44cf0d5a267a94006c482c6a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc3196a44cf0d5a267a94006c482c6a1");
        } else {
            this.mLifeCycleMonitor.registerLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    @Override // android.app.Application
    public void unregisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Object[] objArr = {activityLifecycleCallbacks};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "574e89c0a369a47e56e83d1e71c949a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "574e89c0a369a47e56e83d1e71c949a8");
        } else {
            this.mLifeCycleMonitor.unregisterLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    @MainThread
    public List<Activity> getActivityStack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f2d587add2de4dd59d7b282927c805e", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f2d587add2de4dd59d7b282927c805e") : this.mLifeCycleMonitor.getActivityStack();
    }

    @MainThread
    @Nullable
    public Activity getTopActivity() {
        return ActivitySwitchMonitor.sTopActivity;
    }

    public void realRegisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Object[] objArr = {activityLifecycleCallbacks};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dbc0c987e6d27c4cfba3f05bc79ce55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dbc0c987e6d27c4cfba3f05bc79ce55");
        } else {
            super.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class ActivityInterceptor extends MTInstrumentation {
        public static ChangeQuickRedirect changeQuickRedirect;

        public ActivityInterceptor() {
            Object[] objArr = {AuroraApplication.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9d59babf2e63a6e361a41ff6282fadd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9d59babf2e63a6e361a41ff6282fadd");
            }
        }

        @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
        public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
            Object[] objArr = {classLoader, str, intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08da98a8dc07e7f441b7f14172d28ff3", RobustBitConfig.DEFAULT_VALUE)) {
                return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08da98a8dc07e7f441b7f14172d28ff3");
            }
            AuroraApplication.this.newActivityChecker(str, intent);
            return super.newActivity(classLoader, str, intent);
        }

        @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
        public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws InstantiationException, IllegalAccessException {
            Object[] objArr = {cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1da74cd09b94336b2fd13c8acaacde0", RobustBitConfig.DEFAULT_VALUE)) {
                return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1da74cd09b94336b2fd13c8acaacde0");
            }
            ComponentName component = intent.getComponent();
            AuroraApplication.this.newActivityChecker(component != null ? component.getClassName() : null, intent);
            return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        }
    }
}
