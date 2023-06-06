package com.sankuai.meituan.arbiter.hook;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.UserHandle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTInstrumentationImplM extends MTInstrumentationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Method mMethodExecStartActivityString;
    protected Method mMethodExecStartActivityUserHandle;

    public MTInstrumentationImplM(Context context, Instrumentation instrumentation) {
        super(context, instrumentation);
        Object[] objArr = {context, instrumentation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "705dd13d93d9b15e99c27a115146046d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "705dd13d93d9b15e99c27a115146046d");
            return;
        }
        initMethodExecStartActivityString(this.mBase.getClass());
        initMethodExecStartActivityUserHandle(this.mBase.getClass());
    }

    public void initMethodExecStartActivityString(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33a73038facced740938ee4b19399771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33a73038facced740938ee4b19399771");
            return;
        }
        Utils.debugExecTimeBegin("MTInstrumentationImplM.initMethodExecStartActivityString");
        try {
            try {
                this.mMethodExecStartActivityString = cls.getDeclaredMethod("execStartActivity", Context.class, IBinder.class, IBinder.class, String.class, Intent.class, Integer.TYPE, Bundle.class);
                this.mMethodExecStartActivityString.setAccessible(true);
            } catch (NoSuchMethodException e) {
                if (Instrumentation.class.isAssignableFrom(cls.getSuperclass())) {
                    initMethodExecStartActivityString(cls.getSuperclass());
                } else {
                    DebugLogUtil.e("initMethodExecStartActivityString NoSuchMethodException, Class : " + cls.getName(), e);
                    ArbiterHook.reportError("NoSuchMethodException", new RuntimeException("initMethodExecStartActivityString NoSuchMethodException, Class : " + cls.getName(), e));
                }
            } catch (Exception e2) {
                DebugLogUtil.e("initMethodExecStartActivityString Exception, Class : " + cls.getName(), e2);
                ArbiterHook.reportError("initMethodExecStartActivityString_exception", new RuntimeException("initMethodExecStartActivityString Exception, Class : " + cls.getName(), e2));
            }
        } finally {
            Utils.debugExecTimeEnd("MTInstrumentationImplM.initMethodExecStartActivityString");
        }
    }

    @TargetApi(17)
    public void initMethodExecStartActivityUserHandle(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c4ef95f585899c9d1c47ad07c1c507e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c4ef95f585899c9d1c47ad07c1c507e");
            return;
        }
        Utils.debugExecTimeBegin("MTInstrumentationImplM.initMethodExecStartActivityUserHandle");
        try {
            try {
                this.mMethodExecStartActivityUserHandle = cls.getDeclaredMethod("execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class, UserHandle.class);
                this.mMethodExecStartActivityUserHandle.setAccessible(true);
            } catch (NoSuchMethodException e) {
                if (Instrumentation.class.isAssignableFrom(cls.getSuperclass())) {
                    initMethodExecStartActivityUserHandle(cls.getSuperclass());
                } else {
                    DebugLogUtil.e("initMethodExecStartActivityUserHandle NoSuchMethodException, Class : " + cls.getName(), e);
                    ArbiterHook.reportError("NoSuchMethodException", new RuntimeException("initMethodExecStartActivityUserHandle NoSuchMethodException, Class : " + cls.getName(), e));
                }
            } catch (Exception e2) {
                DebugLogUtil.e("initMethodExecStartActivityUserHandle Exception, Class : " + cls.getName(), e2);
                ArbiterHook.reportError("initMethodExecStartActivityUserHandle_exception", new RuntimeException("initMethodExecStartActivityUserHandle Exception, Class : " + cls.getName(), e2));
            }
        } finally {
            Utils.debugExecTimeEnd("MTInstrumentationImplM.initMethodExecStartActivityUserHandle");
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentationImpl
    public boolean isReady() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36d650be5d4ad783f722ea42c8c3e138", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36d650be5d4ad783f722ea42c8c3e138")).booleanValue() : (!super.isReady() || this.mMethodExecStartActivityUserHandle == null || this.mMethodExecStartActivityString == null) ? false : true;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    @TargetApi(23)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3996bb5a4ca077ec4a91b757e2ed1efd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3996bb5a4ca077ec4a91b757e2ed1efd");
        }
        Utils.debugExecTimeBegin("MTInstrumentationImplM.execStartActivity");
        DebugLogUtil.d("execStartActivity(Context who, IBinder contextThread, IBinder token, String target, Intent intent, int requestCode)");
        Instrumentation.ActivityResult execStartActivityInternal = execStartActivityInternal(context, iBinder, iBinder2, str, intent, i, bundle);
        Utils.debugExecTimeEnd("MTInstrumentationImplM.execStartActivity");
        return execStartActivityInternal;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    @TargetApi(17)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "779272870c73b2e1b7312809042f32e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "779272870c73b2e1b7312809042f32e3");
        }
        Utils.debugExecTimeBegin("MTInstrumentationImplM.execStartActivity");
        DebugLogUtil.d("execStartActivity(Context who, IBinder contextThread, IBinder token,  Activity target, Intent intent, int requestCode, UserHandle user)");
        Instrumentation.ActivityResult execStartActivityInternal = execStartActivityInternal(context, iBinder, iBinder2, activity, intent, i, bundle, userHandle);
        Utils.debugExecTimeEnd("MTInstrumentationImplM.execStartActivity");
        return execStartActivityInternal;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.app.Instrumentation.ActivityResult execStartActivityInternal(android.content.Context r23, android.os.IBinder r24, android.os.IBinder r25, java.lang.String r26, android.content.Intent r27, int r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.arbiter.hook.MTInstrumentationImplM.execStartActivityInternal(android.content.Context, android.os.IBinder, android.os.IBinder, java.lang.String, android.content.Intent, int, android.os.Bundle):android.app.Instrumentation$ActivityResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.app.Instrumentation.ActivityResult execStartActivityInternal(android.content.Context r25, android.os.IBinder r26, android.os.IBinder r27, android.app.Activity r28, android.content.Intent r29, int r30, android.os.Bundle r31, android.os.UserHandle r32) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.arbiter.hook.MTInstrumentationImplM.execStartActivityInternal(android.content.Context, android.os.IBinder, android.os.IBinder, android.app.Activity, android.content.Intent, int, android.os.Bundle, android.os.UserHandle):android.app.Instrumentation$ActivityResult");
    }
}
