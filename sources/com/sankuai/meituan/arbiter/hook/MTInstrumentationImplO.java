package com.sankuai.meituan.arbiter.hook;

import android.annotation.TargetApi;
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
public class MTInstrumentationImplO extends MTInstrumentationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Method mMethodExecStartActivityString;
    protected Method mMethodExecStartActivityUserHandle;

    public MTInstrumentationImplO(Context context, Instrumentation instrumentation) {
        super(context, instrumentation);
        Object[] objArr = {context, instrumentation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45ca7e2eabe172e5f343eb9a6a80956b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45ca7e2eabe172e5f343eb9a6a80956b");
            return;
        }
        initMethodExecStartActivityString(this.mBase.getClass());
        initMethodExecStartActivityUserHandle(this.mBase.getClass());
    }

    public void initMethodExecStartActivityString(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e46096fa5b8dad5dd7f0f3649fc5566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e46096fa5b8dad5dd7f0f3649fc5566");
            return;
        }
        Utils.debugExecTimeBegin("MTInstrumentationImplO.initMethodExecStartActivityString");
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
            Utils.debugExecTimeEnd("MTInstrumentationImplO.initMethodExecStartActivityString");
        }
    }

    @TargetApi(17)
    public void initMethodExecStartActivityUserHandle(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89461ed66aa02a81c47b569ee7d4bb15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89461ed66aa02a81c47b569ee7d4bb15");
            return;
        }
        Utils.debugExecTimeBegin("MTInstrumentationImplO.initMethodExecStartActivityUserHandle");
        try {
            try {
                this.mMethodExecStartActivityUserHandle = cls.getDeclaredMethod("execStartActivity", Context.class, IBinder.class, IBinder.class, String.class, Intent.class, Integer.TYPE, Bundle.class, UserHandle.class);
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
            Utils.debugExecTimeEnd("MTInstrumentationImplO.initMethodExecStartActivityUserHandle");
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentationImpl
    public boolean isReady() {
        return (this.mContext == null || this.mBase == null || this.mMethodExecStartActivity == null || this.mMethodExecStartActivityUserHandle == null || this.mMethodExecStartActivityString == null) ? false : true;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    @TargetApi(23)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d37ee4c823147a2f8e0d0b4e9ca74f6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d37ee4c823147a2f8e0d0b4e9ca74f6e");
        }
        Utils.debugExecTimeBegin("MTInstrumentationImplO.execStartActivity");
        DebugLogUtil.d("execStartActivity(Context who, IBinder contextThread, IBinder token, String target, Intent intent, int requestCode)");
        Instrumentation.ActivityResult execStartActivityInternal = execStartActivityInternal(context, iBinder, iBinder2, str, intent, i, bundle);
        Utils.debugExecTimeEnd("MTInstrumentationImplO.execStartActivity");
        return execStartActivityInternal;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    @TargetApi(17)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e84b47e67fef5a5b3495ae44091b618d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e84b47e67fef5a5b3495ae44091b618d");
        }
        Utils.debugExecTimeBegin("MTInstrumentationImplO.execStartActivity");
        DebugLogUtil.d("execStartActivity(Context who, IBinder contextThread, IBinder token,  Activity target, Intent intent, int requestCode, UserHandle user)");
        Instrumentation.ActivityResult execStartActivityInternal = execStartActivityInternal(context, iBinder, iBinder2, str, intent, i, bundle, userHandle);
        Utils.debugExecTimeEnd("MTInstrumentationImplO.execStartActivity");
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
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.arbiter.hook.MTInstrumentationImplO.execStartActivityInternal(android.content.Context, android.os.IBinder, android.os.IBinder, java.lang.String, android.content.Intent, int, android.os.Bundle):android.app.Instrumentation$ActivityResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.app.Instrumentation.ActivityResult execStartActivityInternal(android.content.Context r25, android.os.IBinder r26, android.os.IBinder r27, java.lang.String r28, android.content.Intent r29, int r30, android.os.Bundle r31, android.os.UserHandle r32) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.arbiter.hook.MTInstrumentationImplO.execStartActivityInternal(android.content.Context, android.os.IBinder, android.os.IBinder, java.lang.String, android.content.Intent, int, android.os.Bundle, android.os.UserHandle):android.app.Instrumentation$ActivityResult");
    }
}
