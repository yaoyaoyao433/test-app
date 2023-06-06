package com.huawei.hms.push;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class q {
    public static String a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.i("PushSelfShowLog", "get the app name of package:" + str + " failed.");
            return null;
        }
    }

    public static Intent b(Context context, String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Exception unused) {
            HMSLog.w("PushSelfShowLog", str + " not have launch activity");
            return null;
        }
    }

    public static boolean c(Context context, String str) {
        if (context != null && str != null && !"".equals(str)) {
            try {
                if (context.getPackageManager().getApplicationInfo(str, 8192) == null) {
                    return false;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" is installed");
                HMSLog.d("PushSelfShowLog", sb.toString());
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean d(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        context.getPackageManager().getPreferredActivities(arrayList, arrayList2, str);
        return arrayList2.size() > 0;
    }

    public static void e(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            HMSLog.i("PushSelfShowLog", "url is null.");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(402653184);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                str2 = it.next().activityInfo.packageName;
                if (d(context, str2)) {
                    break;
                }
            }
            if (str2 == null) {
                Iterator<ResolveInfo> it2 = queryIntentActivities.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str3 = it2.next().activityInfo.packageName;
                    if ("com.android.browser".equalsIgnoreCase(str3)) {
                        str2 = str3;
                        break;
                    }
                }
            }
            if (str2 != null) {
                intent.setPackage(str2);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "start browser activity failed, exception:" + e.getMessage());
        }
    }

    public static Boolean a(Context context, String str, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                int size = queryIntentActivities.size();
                for (int i = 0; i < size; i++) {
                    if (queryIntentActivities.get(i).activityInfo != null && str.equals(queryIntentActivities.get(i).activityInfo.applicationInfo.packageName)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", e.toString(), e);
        }
        return Boolean.FALSE;
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 11;
    }

    public static long a(String str) {
        if (str == null) {
            str = "";
        }
        try {
            Date date = new Date();
            int hours = (date.getHours() * 2) + (date.getMinutes() / 30);
            String concat = str.concat(str);
            StringBuilder sb = new StringBuilder();
            sb.append("startIndex is ");
            sb.append(hours);
            sb.append(",ap is:");
            sb.append(concat);
            sb.append(",length is:");
            sb.append(concat.length());
            HMSLog.i("PushSelfShowLog", sb.toString());
            int length = concat.length();
            for (int i = hours; i < length; i++) {
                if (concat.charAt(i) != '0') {
                    long minutes = (((i - hours) * 30) - (date.getMinutes() % 30)) * LocationStrategy.LOCATION_TIMEOUT;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("startIndex is:");
                    sb2.append(hours);
                    sb2.append(" i is:");
                    sb2.append(i);
                    sb2.append(" delay:");
                    sb2.append(minutes);
                    HMSLog.d("PushSelfShowLog", sb2.toString());
                    if (minutes < 0) {
                        return 0L;
                    }
                    return minutes;
                }
            }
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "error ", e);
        }
        return 0L;
    }

    public static void a(Context context, Intent intent, long j) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("enter setAPDelayAlarm(intent:");
            sb.append(intent.toURI());
            sb.append(" interval:");
            sb.append(j);
            sb.append("ms, context:");
            sb.append(context);
            HMSLog.d("PushSelfShowLog", sb.toString());
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (alarmManager != null) {
                alarmManager.set(0, System.currentTimeMillis() + j, PendingIntent.getBroadcast(context, (int) (System.currentTimeMillis() / 1000), intent, 0));
            }
        } catch (Exception e) {
            HMSLog.w("PushSelfShowLog", "set DelayAlarm error" + e.toString());
        }
    }

    public static boolean a(Context context) {
        return "com.huawei.hwid".equals(context.getPackageName());
    }

    public static void a(Context context, int i) {
        if (context == null) {
            HMSLog.e("PushSelfShowLog", MonitorManager.CONTEXT_IS_NULL_MSG);
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
            if (notificationManager != null) {
                notificationManager.cancel(i);
            }
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "removeNotifiCationById err:" + e.toString());
        }
    }

    public static void a(Context context, Intent intent) {
        try {
            int a = com.sankuai.waimai.platform.utils.f.a(intent, "selfshow_auto_clear_id", 0);
            StringBuilder sb = new StringBuilder();
            sb.append("setDelayAlarm(cancel) alarmNotityId ");
            sb.append(a);
            HMSLog.d("PushSelfShowLog", sb.toString());
            if (a == 0) {
                return;
            }
            Intent intent2 = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
            intent2.setPackage(context.getPackageName()).setFlags(32);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, a, intent2, 536870912);
            if (broadcast != null && alarmManager != null) {
                HMSLog.d("PushSelfShowLog", "alarm cancel");
                alarmManager.cancel(broadcast);
                return;
            }
            HMSLog.d("PushSelfShowLog", "alarm not exist");
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "cancelAlarm err:" + e.toString());
        }
    }
}
