package com.meituan.msc.common.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.support.annotation.NonNull;
import com.meituan.msc.modules.container.MSCActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7581221bcd450d070ee8c8fb85da6ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7581221bcd450d070ee8c8fb85da6ae")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(com.tencent.mapsdk.internal.y.a);
            }
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            com.meituan.msc.modules.reporter.g.a(e);
            return false;
        }
    }

    public static com.meituan.msc.common.report.b a(final Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c683f1401c77ba62c1c2ab2ba256c7f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.report.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c683f1401c77ba62c1c2ab2ba256c7f") : new com.meituan.msc.common.report.b() { // from class: com.meituan.msc.common.utils.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.report.b
            public final Object a() {
                ComponentName callingActivity;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cce40a7ceb234c842bfaa8b062f1070", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cce40a7ceb234c842bfaa8b062f1070");
                }
                if (activity == null || (callingActivity = activity.getCallingActivity()) == null) {
                    return Boolean.FALSE;
                }
                try {
                    return Boolean.valueOf(MSCActivity.class.isAssignableFrom(Class.forName(callingActivity.getClassName())));
                } catch (ClassNotFoundException unused) {
                    return Boolean.FALSE;
                }
            }
        };
    }

    public static boolean b(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa50aa320f5ec769ac963734030509ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa50aa320f5ec769ac963734030509ab")).booleanValue();
        }
        if (activity.getTaskId() == -1) {
            com.meituan.msc.modules.reporter.g.a(activity.getClass().getName(), "illegal task id, quit to avoid crash");
            com.sankuai.meituan.takeoutnew.util.aop.k.b(Process.myPid());
            return true;
        }
        return false;
    }

    public static IBinder c(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8040018b247ef7c4c863d46ef067a4a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBinder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8040018b247ef7c4c863d46ef067a4a2");
        }
        try {
            return activity.getWindow().getDecorView().getWindowToken();
        } catch (Exception unused) {
            return null;
        }
    }
}
