package com.meituan.android.common.weaver.impl.natives;

import android.app.Activity;
import android.app.Fragment;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.android.common.weaver.impl.blank.Blanks;
import com.meituan.android.common.weaver.impl.utils.FFPDebugger;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.arbiter.hook.MTInstrumentation;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FFPInstrument extends MTInstrumentation {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ErrorReporter errorReporter;

    public FFPInstrument() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06e0c0e0fc62cc676b66c9a507769cf9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06e0c0e0fc62cc676b66c9a507769cf9");
        } else {
            this.errorReporter = new ErrorReporter("ffpinstrument", 1);
        }
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b93921e7513a261c390b0f06e00de1f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b93921e7513a261c390b0f06e00de1f3");
        }
        execStart(intent);
        return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b5e45e074bff50590543a8eccc84b52", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b5e45e074bff50590543a8eccc84b52");
        }
        execStart(intent);
        return super.execStartActivity(context, iBinder, iBinder2, fragment, intent, i);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e006fd734379c2f22601a58c0fb37b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e006fd734379c2f22601a58c0fb37b9");
        }
        execStart(intent);
        return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dae6011a84da45e9593c2c97fdd1a308", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dae6011a84da45e9593c2c97fdd1a308");
        }
        execStart(intent);
        return super.execStartActivity(context, iBinder, iBinder2, fragment, intent, i, bundle);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87d8ec65f2e48268e2b202f4806e5d7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87d8ec65f2e48268e2b202f4806e5d7a");
        }
        execStart(intent);
        return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle, userHandle);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle, userHandle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52217ae95bbbab6b58e6bb3ad9d68179", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52217ae95bbbab6b58e6bb3ad9d68179");
        }
        execStart(intent);
        return super.execStartActivity(context, iBinder, iBinder2, str, intent, i, bundle, userHandle);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d038c7fad15baf9effae1ccb5e935ae5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d038c7fad15baf9effae1ccb5e935ae5");
        }
        execStart(intent);
        return super.execStartActivity(context, iBinder, iBinder2, str, intent, i, bundle);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f61b9bc95752036c281b8a5d96bb68d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f61b9bc95752036c281b8a5d96bb68d");
            return;
        }
        beforeOnCreate(activity);
        super.callActivityOnCreate(activity, bundle);
        afterOnCreate(activity);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {activity, bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "276a4f67bc56f9971b336db321868543", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "276a4f67bc56f9971b336db321868543");
            return;
        }
        beforeOnCreate(activity);
        super.callActivityOnCreate(activity, bundle, persistableBundle);
        afterOnCreate(activity);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4339dbfd0fc22b18f82d700bb5d1f2cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4339dbfd0fc22b18f82d700bb5d1f2cf");
            return;
        }
        callOnStop(activity);
        super.callActivityOnStop(activity);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "096dbdaff6a06822a0f63055b93de997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "096dbdaff6a06822a0f63055b93de997");
            return;
        }
        callOnDestroy(activity);
        super.callActivityOnDestroy(activity);
    }

    private void beforeOnCreate(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e790e05dc18162480f56eab210859730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e790e05dc18162480f56eab210859730");
        } else {
            Weaver.getWeaver().weave(NativeRouteEvent.of(NativeRouteEvent.TYPE_CREATE, activity, activity.getIntent()));
        }
    }

    private void afterOnCreate(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "329321c2d43e587732c338b70f636bbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "329321c2d43e587732c338b70f636bbe");
            return;
        }
        try {
            Logger.getLogger().d("afterOnCreate");
            NativeEndPointManager.getInstance().nativeStartDetectFFP(activity);
            if (Blanks.sEnable) {
                Blanks.getInstance().onActivityPostCreated(activity);
            }
        } catch (Throwable th) {
            this.errorReporter.report(th);
        }
    }

    private void callOnStop(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25d07b93fcec5fc245082b1d8df89661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25d07b93fcec5fc245082b1d8df89661");
            return;
        }
        try {
            NativeEndPointManager.getInstance().onActivityStop(activity);
            if (Blanks.sEnable) {
                Blanks.getInstance().onActivityStopped(activity);
            }
        } catch (Throwable th) {
            this.errorReporter.report(th);
        }
    }

    private void callOnDestroy(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dd890aefa3eb9273676214d9d856f4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dd890aefa3eb9273676214d9d856f4e");
            return;
        }
        try {
            Weaver.getWeaver().weave(NativeRouteEvent.of(NativeRouteEvent.TYPE_DESTROY, activity, null));
            NativeEndPointManager.getInstance().onActivityDestroy(activity);
            if (Blanks.sEnable) {
                Blanks.getInstance().onActivityDestroyed(activity);
            }
        } catch (Throwable th) {
            this.errorReporter.report(th);
        }
    }

    private void execStart(@Nullable Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c16e9c0171e10ca51658615bc752494a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c16e9c0171e10ca51658615bc752494a");
            return;
        }
        NativeRouteEvent of = NativeRouteEvent.of(NativeRouteEvent.TYPE_START, null, intent);
        FFPDebugger.getFFPDebugger().onStartActivity(of.createMs());
        Weaver.getWeaver().weave(of);
        Weaver.getTracer().traceInstant("ffp.start.native");
    }
}
