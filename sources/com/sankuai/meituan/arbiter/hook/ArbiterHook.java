package com.sankuai.meituan.arbiter.hook;

import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ArbiterHook {
    private static Field CallbackFieldInHandler = null;
    private static Field MHandlerFieldInActivityThread = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    protected static boolean isDebug = false;
    private static boolean isHookSucceeded = false;
    private static boolean isHookedInstrumentation = false;
    private static Class mActivityClaz = null;
    private static Object mActivityThread = null;
    private static Class mActivityThreadClass = null;
    private static Method mCurrentActivityThreadMethod = null;
    private static OnErrorListener mErrorListener = null;
    private static Field mInstrField = null;
    private static InstrumentationProxy mInstrumentation = null;
    private static Field mInstrumentationField = null;
    private static MTInstrumentation mMTInstrumentation = null;
    private static Context sContext = null;
    private static boolean sGlobalNeedException = false;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnErrorListener {
        void onError(Context context, String str, Throwable th, Bundle bundle);
    }

    public static /* synthetic */ Instrumentation access$300() throws Exception {
        return getInstrumentation();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class EventIntercept implements Handler.Callback {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Handler.Callback originCallback;

        public EventIntercept(Handler.Callback callback) {
            Object[] objArr = {callback};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fb67e87d2325d980ef8c66e1fb3063a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fb67e87d2325d980ef8c66e1fb3063a");
            } else {
                this.originCallback = callback;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "338c679911e37c3f87d135691bca9302", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "338c679911e37c3f87d135691bca9302")).booleanValue();
            }
            try {
                if (!ArbiterHook.isHookSucceeded) {
                    if (ArbiterHook.mInstrumentation != null) {
                        ArbiterHook.setInstrumentation(ArbiterHook.mInstrumentation);
                        boolean unused = ArbiterHook.isHookSucceeded = true;
                    } else {
                        DebugLogUtil.d("Internal instrumentation is null ");
                    }
                } else if (ArbiterHook.access$300() != ArbiterHook.mInstrumentation) {
                    ArbiterHook.setInstrumentation(ArbiterHook.mInstrumentation);
                    DebugLogUtil.d("Exception case happen !!!! ");
                }
            } catch (Throwable th) {
                ArbiterHook.reportError("EventIntercept_fail", new RuntimeException("ArbiterHook Event Intercept error", th));
            }
            if (this.originCallback != null) {
                return this.originCallback.handleMessage(message);
            }
            return false;
        }
    }

    public static Context getContext() {
        return sContext;
    }

    private static boolean defineAndVerify() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a9da20679b7ba61fa7210781aea035d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a9da20679b7ba61fa7210781aea035d")).booleanValue();
        }
        Utils.debugExecTimeBegin("ArbiterHook.defineAndVerify");
        try {
            try {
                mActivityThreadClass = Class.forName("android.app.ActivityThread");
                Class<?> cls = Class.forName("android.app.Activity");
                mActivityClaz = cls;
                Field declaredField = cls.getDeclaredField("mInstrumentation");
                mInstrField = declaredField;
                declaredField.setAccessible(true);
                Method declaredMethod = mActivityThreadClass.getDeclaredMethod("currentActivityThread", new Class[0]);
                mCurrentActivityThreadMethod = declaredMethod;
                declaredMethod.setAccessible(true);
                Field declaredField2 = mActivityThreadClass.getDeclaredField("mInstrumentation");
                mInstrumentationField = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = Handler.class.getDeclaredField("mCallback");
                CallbackFieldInHandler = declaredField3;
                declaredField3.setAccessible(true);
                Field declaredField4 = mActivityThreadClass.getDeclaredField("mH");
                MHandlerFieldInActivityThread = declaredField4;
                declaredField4.setAccessible(true);
                return true;
            } catch (Exception e) {
                reportError("defineAndVerify_fail", new RuntimeException("ArbiterHook defineAndVerify error", e));
                throw e;
            }
        } finally {
            Utils.debugExecTimeEnd("ArbiterHook.defineAndVerify");
        }
    }

    private static void verifyAndInit() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f2387e2fa9fcef6d811c9776ed685d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f2387e2fa9fcef6d811c9776ed685d0");
        } else if (mActivityThreadClass == null || mCurrentActivityThreadMethod == null || mInstrumentationField == null) {
            defineAndVerify();
        }
    }

    public static void injectInstrumentationHook(Context context) throws Exception {
        MTInstrumentationImpl mTInstrumentationImpl;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "387ae626cca408e69f86a8d5aafe8526", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "387ae626cca408e69f86a8d5aafe8526");
            return;
        }
        sContext = context;
        Utils.debugExecTimeBegin("ArbiterHook.injectInstrumentationHook");
        if (!isReady()) {
            verifyAndInit();
            Instrumentation instrumentation = getInstrumentation();
            if (instrumentation != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    mTInstrumentationImpl = new MTInstrumentationImplO(context, instrumentation);
                } else if (Build.VERSION.SDK_INT >= 23) {
                    mTInstrumentationImpl = new MTInstrumentationImplM(context, instrumentation);
                } else if (Build.VERSION.SDK_INT >= 11) {
                    mTInstrumentationImpl = new MTInstrumentationImplHoneycomb(context, instrumentation);
                } else {
                    mTInstrumentationImpl = new MTInstrumentationImpl(context, instrumentation);
                }
                if (mTInstrumentationImpl.isReady()) {
                    mMTInstrumentation = mTInstrumentationImpl;
                    InstrumentationProxy instrumentationProxy = new InstrumentationProxy(mMTInstrumentation);
                    mInstrumentation = instrumentationProxy;
                    setInstrumentation(instrumentationProxy);
                    if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 19) {
                        DebugLogUtil.d("Create event intercepter :" + hookMHandler());
                    }
                    isHookedInstrumentation = true;
                }
            }
        }
        Utils.debugExecTimeEnd("ArbiterHook.injectInstrumentationHook");
    }

    public static synchronized boolean addMTInstrumentation(MTInstrumentation mTInstrumentation) {
        synchronized (ArbiterHook.class) {
            Object[] objArr = {mTInstrumentation};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9e8cedd681b550ba94789e17852f330", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9e8cedd681b550ba94789e17852f330")).booleanValue();
            }
            checkDuplicate(mTInstrumentation);
            if (!isReady() || mTInstrumentation == null) {
                return false;
            }
            mTInstrumentation.setNext(mMTInstrumentation);
            mMTInstrumentation = mTInstrumentation;
            mInstrumentation.setMtInstrumentation(mMTInstrumentation);
            return true;
        }
    }

    private static void checkDuplicate(MTInstrumentation mTInstrumentation) {
        Object[] objArr = {mTInstrumentation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f0656fe242300065f4e876602797518", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f0656fe242300065f4e876602797518");
        } else if (mTInstrumentation != null) {
            for (MTInstrumentation mTInstrumentation2 = mMTInstrumentation; mTInstrumentation2 != null; mTInstrumentation2 = mTInstrumentation2.getNext()) {
                if (mTInstrumentation2.getClass() == mTInstrumentation.getClass()) {
                    throw new RuntimeException("禁止重复添加，" + mTInstrumentation.getClass().getName() + "已经存在");
                }
            }
        }
    }

    public static boolean isExistsInstrumentation(Class cls, boolean z) {
        Object[] objArr = {cls, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "edfc38f5ce43e5d383698ef93c258344", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "edfc38f5ce43e5d383698ef93c258344")).booleanValue();
        }
        if (cls == null) {
            return false;
        }
        for (MTInstrumentation mTInstrumentation = mMTInstrumentation; mTInstrumentation != null; mTInstrumentation = mTInstrumentation.getNext()) {
            if (z) {
                for (Class<?> cls2 = mTInstrumentation.getClass(); cls2 != null; cls2 = cls2.getSuperclass()) {
                    if (cls == cls2) {
                        return true;
                    }
                }
                continue;
            } else if (mTInstrumentation.getClass() == cls) {
                return true;
            }
        }
        return false;
    }

    public static boolean isReady() {
        return (!isHookedInstrumentation || mInstrumentation == null || mMTInstrumentation == null) ? false : true;
    }

    private static Object getActivityThread() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "faef8bf56f09bc4362f675cfc13654e0", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "faef8bf56f09bc4362f675cfc13654e0");
        }
        if (mActivityThread == null) {
            try {
                if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
                    mActivityThread = mCurrentActivityThreadMethod.invoke(null, new Object[0]);
                } else {
                    throw new UnsupportedOperationException("not main thread");
                }
            } catch (Exception e) {
                reportError("getActivityThread_fail", new RuntimeException("ArbiterHook getActivityThread error", e));
                throw e;
            }
        }
        return mActivityThread;
    }

    private static Instrumentation getInstrumentation() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "25a5aa80a028cdf5a04fc5e3d04f21e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "25a5aa80a028cdf5a04fc5e3d04f21e5");
        }
        try {
            return (Instrumentation) mInstrumentationField.get(getActivityThread());
        } catch (Exception e) {
            reportError("getInstrumentation_fail", new RuntimeException("ArbiterHook getInstrumentation error", e));
            throw e;
        }
    }

    private static Handler.Callback hookMHandler() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d0552d0d2fff4f9baa83caa28cd88604", RobustBitConfig.DEFAULT_VALUE)) {
            return (Handler.Callback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d0552d0d2fff4f9baa83caa28cd88604");
        }
        try {
            Handler handler = (Handler) MHandlerFieldInActivityThread.get(getActivityThread());
            CallbackFieldInHandler.set(handler, new EventIntercept((Handler.Callback) CallbackFieldInHandler.get(handler)));
            return (Handler.Callback) CallbackFieldInHandler.get(handler);
        } catch (Throwable th) {
            reportError("hookMHandler_fail", new RuntimeException("ArbiterHook hookMHandler error", th));
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setInstrumentation(Instrumentation instrumentation) throws Exception {
        Object[] objArr = {instrumentation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e0c55b2dc9b304977b2819cde8e47063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e0c55b2dc9b304977b2819cde8e47063");
            return;
        }
        try {
            mInstrumentationField.set(getActivityThread(), instrumentation);
        } catch (Exception e) {
            reportError("setInstrumentation_fail", new RuntimeException("ArbiterHook setInstrumentation error", e));
            throw e;
        }
    }

    public static void setOnErrorListener(OnErrorListener onErrorListener) {
        mErrorListener = onErrorListener;
    }

    public static void reportError(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f31feb47287725ce9a797c062b9788a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f31feb47287725ce9a797c062b9788a");
        } else {
            reportError("fail", th);
        }
    }

    public static void reportError(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c16e98f5fc997d2779283e2b593c45e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c16e98f5fc997d2779283e2b593c45e9");
        } else {
            reportError(str, th, null);
        }
    }

    public static void reportError(String str, Throwable th, Bundle bundle) {
        Object[] objArr = {str, th, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83a86419f26db08fe24ef0870cf17edd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83a86419f26db08fe24ef0870cf17edd");
        } else {
            reportError(null, str, th, bundle);
        }
    }

    public static void reportError(Context context, String str, Throwable th, Bundle bundle) {
        Object[] objArr = {context, str, th, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "22eeec76adbe3754503273083b09221e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "22eeec76adbe3754503273083b09221e");
        } else if (mErrorListener != null) {
            mErrorListener.onError(context, str, th, bundle);
        }
    }

    public static void setDebug(boolean z) {
        isDebug = z;
    }

    public static boolean isDebug() {
        return isDebug;
    }

    public static void setHookEventListener(HookEventListener hookEventListener) {
        HookEventUtil.hookEventListener = hookEventListener;
    }

    public static void setNeedException(boolean z) {
        sGlobalNeedException = z;
    }

    public static boolean needException(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "adb5fee445882376d038987491965ff1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "adb5fee445882376d038987491965ff1")).booleanValue();
        }
        return sGlobalNeedException || f.a(intent, Utils.EXTRA_NEED_EXCEPTION, false);
    }
}
