package com.sankuai.waimai.launcher.model;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static C0993a b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.launcher.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0993a {
        public static ChangeQuickRedirect a;
        public String b;
        public ComponentName c;
        public String d;

        @NotNull
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d899cc6e5ffe2c51cc348c4c75baddf", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d899cc6e5ffe2c51cc348c4c75baddf");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append('{');
            sb.append(this.c == null ? CommonConstant.Symbol.MINUS : this.c.getClassName());
            sb.append('}');
            return sb.toString();
        }
    }

    public static C0993a a() {
        Intent intent;
        ComponentName componentName;
        ComponentName componentName2;
        C0993a c0993a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cca13c72c0a452f2983d076c9acf7b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0993a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cca13c72c0a452f2983d076c9acf7b4");
        }
        if (b != null) {
            return b;
        }
        try {
            Context context = b.a;
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager != null) {
                Object[] objArr2 = {context, activityManager};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "81fbd9968b051000405f6222c962dcef", RobustBitConfig.DEFAULT_VALUE)) {
                    c0993a = (C0993a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "81fbd9968b051000405f6222c962dcef");
                } else {
                    C0993a c0993a2 = new C0993a();
                    Object[] objArr3 = {activityManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "9de5932d4eb2a419ea37b84c6d0760a5", RobustBitConfig.DEFAULT_VALUE)) {
                        intent = (Intent) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "9de5932d4eb2a419ea37b84c6d0760a5");
                    } else {
                        List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
                        intent = (appTasks == null || appTasks.size() <= 0) ? null : appTasks.get(0).getTaskInfo().baseIntent;
                    }
                    if (intent != null) {
                        c0993a2.c = intent.getComponent();
                        c0993a2.d = intent.getDataString();
                        c0993a2.b = "Activity";
                    } else {
                        Object[] objArr4 = {activityManager, context};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "ef1d66e8ad15429e435befc74deb448d", RobustBitConfig.DEFAULT_VALUE)) {
                            componentName = (ComponentName) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "ef1d66e8ad15429e435befc74deb448d");
                        } else {
                            List<ActivityManager.RunningServiceInfo> b2 = Privacy.createActivityManager(context, "com.sankuai.waimai:launcher").b(200);
                            if (b2 != null && b2.size() > 0) {
                                for (ActivityManager.RunningServiceInfo runningServiceInfo : b2) {
                                    if (com.dianping.util.a.a(context).equals(runningServiceInfo.process)) {
                                        componentName = runningServiceInfo.service;
                                        break;
                                    }
                                }
                            }
                            componentName = null;
                        }
                        if (componentName != null) {
                            c0993a2.c = componentName;
                            c0993a2.b = "Service";
                        } else {
                            Object[] objArr5 = {activityManager, context};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "45eaa6b4cd6c80718b9f825c3ffca385", RobustBitConfig.DEFAULT_VALUE)) {
                                componentName2 = (ComponentName) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "45eaa6b4cd6c80718b9f825c3ffca385");
                            } else {
                                List<ActivityManager.RunningAppProcessInfo> a2 = Privacy.createActivityManager(context, "com.sankuai.waimai:launcher").a();
                                if (a2 != null) {
                                    Iterator<ActivityManager.RunningAppProcessInfo> it = a2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        ActivityManager.RunningAppProcessInfo next = it.next();
                                        if (com.dianping.util.a.a(context).equals(next.processName)) {
                                            if (next.importanceReasonCode == 1) {
                                                componentName2 = next.importanceReasonComponent;
                                            }
                                        }
                                    }
                                }
                                componentName2 = null;
                            }
                            if (componentName2 != null) {
                                c0993a2.c = componentName2;
                                c0993a2.b = "Provider";
                            } else {
                                c0993a2.b = "Receiver";
                            }
                        }
                    }
                    c0993a = c0993a2;
                }
                b = c0993a;
                return c0993a;
            }
            return null;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
            b = new C0993a();
            return null;
        }
    }
}
