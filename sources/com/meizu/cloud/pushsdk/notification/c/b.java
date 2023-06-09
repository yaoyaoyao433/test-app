package com.meizu.cloud.pushsdk.notification.c;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes3.dex */
public final class b {
    private static Field a;
    private static Field b;
    private static Field c;
    private static final Object d = new Object();
    private static final Map<String, Set<String>> e = new ConcurrentHashMap();
    private static Map<String, Uri> f;

    static {
        try {
            a = Notification.class.getDeclaredField("mFlymeNotification");
            Field declaredField = Class.forName("android.app.NotificationExt").getDeclaredField("internalApp");
            b = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = Notification.class.getDeclaredField("replyIntent");
            c = declaredField2;
            declaredField2.setAccessible(true);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            DebugLogger.e("NotificationUtils", "init NotificationUtils error " + e3.getMessage());
        }
    }

    public static void a(Notification notification, PendingIntent pendingIntent) {
        if (c != null) {
            try {
                c.set(notification, pendingIntent);
            } catch (IllegalAccessException e2) {
                DebugLogger.e("NotificationUtils", "setReplyIntent error " + e2.getMessage());
            }
        }
    }

    public static void a(Notification notification, boolean z) {
        if (a == null || b == null) {
            return;
        }
        try {
            b.set(a.get(notification), 1);
        } catch (IllegalAccessException e2) {
            DebugLogger.e("NotificationUtils", "setInternalApp error " + e2.getMessage());
        }
    }

    public static void a(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
    }

    public static void a(Context context, String str) {
        Set<String> set;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (notificationManager == null || TextUtils.isEmpty(str) || (set = e.get(str)) == null) {
            return;
        }
        for (String str2 : set) {
            DebugLogger.i("NotificationUtils", "clear notifyId " + str2 + " notification");
            notificationManager.cancel(Integer.parseInt(str2));
        }
        set.clear();
    }

    public static void a(Context context, String str, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (notificationManager != null) {
            DebugLogger.i("NotificationUtils", "clear clearNotification notifyId " + i);
            notificationManager.cancel(i);
            Set<String> set = e.get(str);
            if (set != null) {
                set.remove(String.valueOf(i));
            }
        }
    }

    public static Uri b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || RingtoneManager.getActualDefaultRingtoneUri(context, 2) == null) {
            return null;
        }
        if (f == null) {
            b(context);
        }
        if (f != null && f.size() != 0) {
            return f.get(str.toLowerCase());
        }
        return null;
    }

    private static synchronized void b(Context context) {
        Cursor cursor;
        synchronized (b.class) {
            if (f != null) {
                return;
            }
            Cursor cursor2 = null;
            try {
                try {
                    RingtoneManager ringtoneManager = new RingtoneManager(context);
                    ringtoneManager.setType(2);
                    cursor = ringtoneManager.getCursor();
                } catch (Exception e2) {
                    e = e2;
                }
                if (cursor == null) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return;
                }
                try {
                    f = new HashMap(cursor.getCount());
                    for (boolean moveToFirst = cursor.moveToFirst(); moveToFirst; moveToFirst = cursor.moveToNext()) {
                        String string = cursor.getString(1);
                        Uri withAppendedId = ContentUris.withAppendedId(Uri.parse(cursor.getString(2)), cursor.getLong(0));
                        if (!TextUtils.isEmpty(string) && withAppendedId != null) {
                            f.put(string.toLowerCase(), withAppendedId);
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Exception e3) {
                    e = e3;
                    cursor2 = cursor;
                    DebugLogger.e("NotificationUtils", "get ringtone info error, " + e.getMessage());
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
            }
        }
    }

    public static void b(Context context, String str, int i) {
        Set<String> set = e.get(str);
        DebugLogger.i("NotificationUtils", "store notifyId " + i);
        if (set != null) {
            set.add(String.valueOf(i));
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(String.valueOf(i));
        e.put(str, hashSet);
    }

    public static void c(Context context, String str, int i) {
        Set<String> set = e.get(str);
        if (set != null) {
            set.remove(String.valueOf(i));
            DebugLogger.i("NotificationUtils", "remove notifyId " + i);
        }
    }

    public static boolean a(Context context, String str, String str2) {
        synchronized (d) {
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            int d2 = com.meizu.cloud.pushsdk.util.b.d(context, str, str2);
            DebugLogger.e("NotificationUtils", "removeNotifyKey " + str2 + " notifyId " + d2);
            c(context, str, d2);
            return context.getSharedPreferences("mz_push_preference", 0).edit().remove(str + CommonConstant.Symbol.DOT + str2).commit();
        }
    }
}
