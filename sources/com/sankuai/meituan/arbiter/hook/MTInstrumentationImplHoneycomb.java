package com.sankuai.meituan.arbiter.hook;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.UserHandle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTInstrumentationImplHoneycomb extends MTInstrumentationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Method mMethodExecStartActivityFragment;
    protected Method mMethodExecStartActivityUserHandle;

    public MTInstrumentationImplHoneycomb(Context context, Instrumentation instrumentation) {
        super(context, instrumentation);
        Object[] objArr = {context, instrumentation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baae58c6743e0ea315b637bfb987d571", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baae58c6743e0ea315b637bfb987d571");
            return;
        }
        initMethodExecStartActivityFragment(this.mBase.getClass());
        if (Build.VERSION.SDK_INT >= 17) {
            initMethodExecStartActivityUserHandle(this.mBase.getClass());
        }
    }

    public void initMethodExecStartActivityFragment(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22ec4ca822b16d03869c70d6a5f2d545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22ec4ca822b16d03869c70d6a5f2d545");
            return;
        }
        Utils.debugExecTimeBegin("MTInstrumentationImplHoneycomb.initMethodExecStartActivityFragment");
        try {
            try {
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        this.mMethodExecStartActivityFragment = cls.getDeclaredMethod("execStartActivity", Context.class, IBinder.class, IBinder.class, Fragment.class, Intent.class, Integer.TYPE, Bundle.class);
                        this.mMethodExecStartActivityFragment.setAccessible(true);
                    } else {
                        this.mMethodExecStartActivityFragment = cls.getDeclaredMethod("execStartActivity", Context.class, IBinder.class, IBinder.class, Fragment.class, Intent.class, Integer.TYPE);
                        this.mMethodExecStartActivityFragment.setAccessible(true);
                    }
                } catch (NoSuchMethodException e) {
                    if (Instrumentation.class.isAssignableFrom(cls.getSuperclass())) {
                        initMethodExecStartActivityFragment(cls.getSuperclass());
                    } else {
                        DebugLogUtil.e("initMethodExecStartActivityFragment NoSuchMethodException, Class : " + cls.getName(), e);
                        ArbiterHook.reportError("NoSuchMethodException", new RuntimeException("initMethodExecStartActivityFragment NoSuchMethodException, Class : " + cls.getName(), e));
                    }
                }
            } catch (Exception e2) {
                DebugLogUtil.e("initMethodExecStartActivityFragment Exception, Class : " + cls.getName(), e2);
                ArbiterHook.reportError("initMethodExecStartActivityFragment_exception", new RuntimeException("initMethodExecStartActivityFragment Exception, Class : " + cls.getName(), e2));
            }
        } finally {
            Utils.debugExecTimeEnd("MTInstrumentationImplHoneycomb.initMethodExecStartActivityFragment");
        }
    }

    @TargetApi(17)
    public void initMethodExecStartActivityUserHandle(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "645e6604bed46344e778df6af3c0f31c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "645e6604bed46344e778df6af3c0f31c");
            return;
        }
        Utils.debugExecTimeBegin("MTInstrumentationImplHoneycomb.initMethodExecStartActivityUserHandle");
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
            Utils.debugExecTimeEnd("MTInstrumentationImplHoneycomb.initMethodExecStartActivityUserHandle");
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentationImpl
    public boolean isReady() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e53268584c38ca1a5914c870c4f1a68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e53268584c38ca1a5914c870c4f1a68")).booleanValue();
        }
        boolean z = super.isReady() && this.mMethodExecStartActivityFragment != null;
        return (!z || Build.VERSION.SDK_INT < 17) ? z : this.mMethodExecStartActivityUserHandle != null;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    @TargetApi(14)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "976592063fede5a8f97d9a4e03a4cec5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "976592063fede5a8f97d9a4e03a4cec5");
        }
        Utils.debugExecTimeBegin("MTInstrumentationImplHoneycomb.execStartActivity");
        DebugLogUtil.d("execStartActivity(Context who, IBinder contextThread, IBinder token, Fragment fragment, Intent intent, int requestCode)");
        Instrumentation.ActivityResult execStartActivityInternal = execStartActivityInternal(context, iBinder, iBinder2, fragment, intent, i, (Bundle) null);
        Utils.debugExecTimeEnd("MTInstrumentationImplHoneycomb.execStartActivity");
        return execStartActivityInternal;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    @TargetApi(16)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57ae73cb7665b57c59e6536f9cecd515", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57ae73cb7665b57c59e6536f9cecd515");
        }
        Utils.debugExecTimeBegin("MTInstrumentationImplHoneycomb.execStartActivity");
        DebugLogUtil.d("execStartActivity(Context who, IBinder contextThread, IBinder token, Fragment fragment, Intent intent, int requestCode)");
        Instrumentation.ActivityResult execStartActivityInternal = execStartActivityInternal(context, iBinder, iBinder2, fragment, intent, i, bundle);
        Utils.debugExecTimeEnd("MTInstrumentationImplHoneycomb.execStartActivity");
        return execStartActivityInternal;
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    @TargetApi(17)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56d9519cf2c095fade723477c8cb29ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56d9519cf2c095fade723477c8cb29ac");
        }
        Utils.debugExecTimeBegin("MTInstrumentationImplHoneycomb.execStartActivity");
        DebugLogUtil.d("execStartActivity(Context who, IBinder contextThread, IBinder token,  Activity target, Intent intent, int requestCode, UserHandle user)");
        Instrumentation.ActivityResult execStartActivityInternal = execStartActivityInternal(context, iBinder, iBinder2, activity, intent, i, bundle, userHandle);
        Utils.debugExecTimeEnd("MTInstrumentationImplHoneycomb.execStartActivity");
        return execStartActivityInternal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
    private android.app.Instrumentation.ActivityResult execStartActivityInternal(android.content.Context r23, android.os.IBinder r24, android.os.IBinder r25, android.app.Fragment r26, android.content.Intent r27, int r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.arbiter.hook.MTInstrumentationImplHoneycomb.execStartActivityInternal(android.content.Context, android.os.IBinder, android.os.IBinder, android.app.Fragment, android.content.Intent, int, android.os.Bundle):android.app.Instrumentation$ActivityResult");
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
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.arbiter.hook.MTInstrumentationImplHoneycomb.execStartActivityInternal(android.content.Context, android.os.IBinder, android.os.IBinder, android.app.Activity, android.content.Intent, int, android.os.Bundle, android.os.UserHandle):android.app.Instrumentation$ActivityResult");
    }
}
