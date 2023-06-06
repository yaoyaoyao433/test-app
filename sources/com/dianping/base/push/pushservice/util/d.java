package com.dianping.base.push.pushservice.util;

import android.app.ActivityManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Closeable;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> list;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f27a0228bc43b102797ad96d05931f46", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f27a0228bc43b102797ad96d05931f46")).booleanValue();
        }
        if (context == null || context.getApplicationContext() == null || (activityManager = (ActivityManager) context.getApplicationContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME)) == null) {
            return false;
        }
        String packageName = context.getApplicationContext().getPackageName();
        try {
            list = activityManager.getRunningAppProcesses();
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("PushUtils", e.toString());
            list = null;
        }
        if (list == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static synchronized void a(Context context, int i) {
        synchronized (d.class) {
            Object[] objArr = {context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e6afecfd4176bc7bce3e87c9cdad9ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e6afecfd4176bc7bce3e87c9cdad9ee");
                return;
            }
            if (com.dianping.base.push.pushservice.f.g && context != null) {
                Intent intent = new Intent("com.dianping.dpmtpush.RECEIVE_STATUS");
                intent.putExtra("status", i);
                try {
                    intent.setPackage(context.getPackageName());
                    com.sankuai.meituan.takeoutnew.util.aop.b.a(context, intent);
                } catch (Exception e) {
                    com.dianping.base.push.pushservice.c.b("PushUtils : " + e.toString());
                }
            }
        }
    }

    public static synchronized void b(Context context) {
        synchronized (d.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bb39d4c5e38828980f7a5e52b326148", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bb39d4c5e38828980f7a5e52b326148");
            } else if (context == null) {
            } else {
                Intent intent = new Intent("com.dianping.dpmtpush.RECEIVE_TOKEN");
                try {
                    intent.setPackage(context.getPackageName());
                    com.sankuai.meituan.takeoutnew.util.aop.b.a(context, intent);
                } catch (Exception e) {
                    com.dianping.base.push.pushservice.c.b("PushUtils : " + e.toString());
                }
            }
        }
    }

    public static void a(Context context, Class<? extends BroadcastReceiver> cls) {
        Object[] objArr = {context, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b83a362fa6c4ff140312552688143c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b83a362fa6c4ff140312552688143c6");
        } else {
            b(context, cls, 1);
        }
    }

    public static void b(Context context, Class<? extends Service> cls) {
        Object[] objArr = {context, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1b0ae851139dfd1435c37b9fc47a81a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1b0ae851139dfd1435c37b9fc47a81a");
        } else {
            b(context, cls, 1);
        }
    }

    public static void a(final Context context, final Class<?> cls, int i) {
        Object[] objArr = {context, cls, 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a69c843efa460657c75c89b29c426eda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a69c843efa460657c75c89b29c426eda");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(h.a(), new Runnable() { // from class: com.dianping.base.push.pushservice.util.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7efdb737f2620e7e00fe96b3bbed975f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7efdb737f2620e7e00fe96b3bbed975f");
                    } else {
                        d.b(context, cls, r3);
                    }
                }
            });
        }
    }

    public static void b(Context context, Class<?> cls, int i) {
        Object[] objArr = {context, cls, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "043548371a71a469b2a8be17442acc67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "043548371a71a469b2a8be17442acc67");
            return;
        }
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), i, 1);
        } catch (Throwable th) {
            com.dianping.base.push.pushservice.c.d("PushUtils", th.toString());
        }
    }

    public static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9522d624e50a9775e33af56fba52f6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9522d624e50a9775e33af56fba52f6f");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                com.dianping.base.push.pushservice.c.d("PushUtils", e.toString());
            }
        }
    }

    public static boolean a(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3357865f1d1767c5b8dce6322dfad8e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3357865f1d1767c5b8dce6322dfad8e6")).booleanValue();
        }
        if (jSONObject == null || context == null) {
            return false;
        }
        String jSONObject2 = jSONObject.toString();
        if (TextUtils.isEmpty(jSONObject2)) {
            return false;
        }
        String optString = jSONObject.optString("passthroughcmd", "");
        Intent intent = new Intent("com.dianping.dpmtpush.RECEIVE_PASS_THROUGH_MESSAGE" + optString);
        intent.setFlags(32);
        intent.putExtra("message", jSONObject2);
        intent.setPackage(context.getPackageName());
        try {
            com.sankuai.meituan.takeoutnew.util.aop.b.a(context, intent);
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("PushUtils", e.toString());
        }
        return true;
    }

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a54134b3d85d19eaaf6fcea0f6bc7741", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a54134b3d85d19eaaf6fcea0f6bc7741")).booleanValue();
        }
        try {
            List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningServices(Integer.MAX_VALUE);
            int myUid = Process.myUid();
            for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (runningServiceInfo.uid == myUid && runningServiceInfo.service.getClassName().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.dianping.base.push.pushservice.c.a("PushUtils", "isServiceExisted error : " + th.getMessage());
            return false;
        }
    }
}
