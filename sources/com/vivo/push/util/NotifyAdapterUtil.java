package com.vivo.push.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.sankuai.common.utils.Utils;
import com.vivo.push.d.r;
import com.vivo.push.model.InsideNotificationItem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class NotifyAdapterUtil {
    private static final int HIDE_TITLE = 1;
    public static final int NOTIFY_MULTITERM_STYLE = 1;
    public static final int NOTIFY_SINGLE_STYLE = 0;
    public static final String PRIMARY_CHANNEL = "vivo_push_channel";
    private static final String PUSH_EN = "PUSH";
    private static final String PUSH_ID = "pushId";
    private static final String PUSH_ZH = "推送通知";
    private static final String TAG = "NotifyManager";
    private static NotificationManager sNotificationManager = null;
    private static int sNotifyId = 20000000;

    public static void pushNotification(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j, int i, r.a aVar) {
        p.d(TAG, "pushNotification");
        initAdapter(context);
        int notifyMode = NotifyUtil.getNotifyDataAdapter(context).getNotifyMode(insideNotificationItem);
        if (!TextUtils.isEmpty(insideNotificationItem.getPurePicUrl()) && list != null && list.size() > 1 && list.get(1) != null) {
            notifyMode = 1;
        }
        if (notifyMode == 2) {
            pushNotificationBySystem(context, list, insideNotificationItem, j, i, aVar);
        } else if (notifyMode == 1) {
            pushNotificationByCustom(context, list, insideNotificationItem, j, aVar);
        }
    }

    private static synchronized void initAdapter(Context context) {
        synchronized (NotifyAdapterUtil.class) {
            if (sNotificationManager == null) {
                sNotificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
            }
            if (Build.VERSION.SDK_INT >= 26 && sNotificationManager != null) {
                NotificationChannel notificationChannel = sNotificationManager.getNotificationChannel("default");
                if (notificationChannel != null) {
                    CharSequence name = notificationChannel.getName();
                    if (PUSH_ZH.equals(name) || PUSH_EN.equals(name)) {
                        sNotificationManager.deleteNotificationChannel("default");
                    }
                }
                NotificationChannel notificationChannel2 = new NotificationChannel(PRIMARY_CHANNEL, isZh(context) ? PUSH_ZH : PUSH_EN, 4);
                notificationChannel2.setLightColor(-16711936);
                notificationChannel2.enableVibration(true);
                notificationChannel2.setLockscreenVisibility(1);
                sNotificationManager.createNotificationChannel(notificationChannel2);
            }
        }
    }

    private static void pushNotificationByCustom(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j, r.a aVar) {
        Notification notification;
        Bitmap bitmap;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        String title = insideNotificationItem.getTitle();
        int defaultNotifyIcon = NotifyUtil.getNotifyDataAdapter(context).getDefaultNotifyIcon();
        int i = context.getApplicationInfo().icon;
        Bundle bundle = new Bundle();
        bundle.putLong("pushId", j);
        if (Build.VERSION.SDK_INT >= 26) {
            Notification.Builder builder = new Notification.Builder(context, PRIMARY_CHANNEL);
            if (defaultNotifyIcon > 0) {
                bundle.putInt("vivo.summaryIconRes", defaultNotifyIcon);
            }
            builder.setExtras(bundle);
            notification = builder.build();
        } else if (Build.VERSION.SDK_INT >= 19) {
            Notification.Builder builder2 = new Notification.Builder(context);
            builder2.setExtras(bundle);
            notification = builder2.build();
        } else {
            notification = new Notification();
        }
        notification.priority = 2;
        notification.flags = 16;
        notification.tickerText = title;
        int defaultSmallIconId = NotifyUtil.getNotifyDataAdapter(context).getDefaultSmallIconId();
        if (defaultSmallIconId <= 0) {
            defaultSmallIconId = i;
        }
        notification.icon = defaultSmallIconId;
        RemoteViews remoteViews = new RemoteViews(packageName, NotifyUtil.getNotifyLayoutAdapter(context).getNotificationLayout());
        remoteViews.setTextViewText(resources.getIdentifier("notify_title", "id", packageName), title);
        remoteViews.setTextColor(resources.getIdentifier("notify_title", "id", packageName), NotifyUtil.getNotifyLayoutAdapter(context).getTitleColor());
        remoteViews.setTextViewText(resources.getIdentifier("notify_msg", "id", packageName), insideNotificationItem.getContent());
        if (insideNotificationItem.isShowTime()) {
            remoteViews.setTextViewText(resources.getIdentifier("notify_when", "id", packageName), new SimpleDateFormat(Utils.SHORT_DATE_FORMAT, Locale.CHINA).format(new Date()));
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 0);
        } else {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 8);
        }
        int suitIconId = NotifyUtil.getNotifyLayoutAdapter(context).getSuitIconId();
        remoteViews.setViewVisibility(suitIconId, 0);
        if (list != null && !list.isEmpty() && (bitmap = list.get(0)) != null) {
            remoteViews.setImageViewBitmap(suitIconId, bitmap);
        } else {
            if (defaultNotifyIcon <= 0) {
                defaultNotifyIcon = i;
            }
            remoteViews.setImageViewResource(suitIconId, defaultNotifyIcon);
        }
        Bitmap bitmap2 = null;
        if (list != null && list.size() > 1) {
            bitmap2 = list.get(1);
        }
        if (bitmap2 != null) {
            if (!TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
                remoteViews.setViewVisibility(resources.getIdentifier("notify_content", "id", packageName), 8);
                remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
                remoteViews.setViewVisibility(resources.getIdentifier("notify_pure_cover", "id", packageName), 0);
                remoteViews.setImageViewBitmap(resources.getIdentifier("notify_pure_cover", "id", packageName), bitmap2);
            } else {
                remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 0);
                remoteViews.setImageViewBitmap(resources.getIdentifier("notify_cover", "id", packageName), bitmap2);
            }
        } else {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
        }
        notification.contentView = remoteViews;
        if (Build.VERSION.SDK_INT >= 16 && TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
            notification.bigContentView = remoteViews;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int ringerMode = audioManager.getRingerMode();
        int vibrateSetting = audioManager.getVibrateSetting(0);
        p.d(TAG, "ringMode=" + ringerMode + " callVibrateSetting=" + vibrateSetting);
        switch (insideNotificationItem.getNotifyType()) {
            case 2:
                if (ringerMode == 2) {
                    notification.defaults = 1;
                    break;
                }
                break;
            case 3:
                if (vibrateSetting == 1) {
                    notification.defaults = 2;
                    notification.vibrate = new long[]{0, 100, 200, 300};
                    break;
                }
                break;
            case 4:
                if (ringerMode == 2) {
                    notification.defaults = 1;
                }
                if (vibrateSetting == 1) {
                    notification.defaults |= 2;
                    notification.vibrate = new long[]{0, 100, 200, 300};
                    break;
                }
                break;
        }
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
        intent.putExtra("command_type", "reflect_receiver");
        try {
            intent.putExtra("security_avoid_pull", a.a(context).a("com.vivo.pushservice"));
            if (Build.VERSION.SDK_INT >= 18) {
                intent.putExtra("security_avoid_pull_rsa", com.vivo.push.c.d.a(context).a().a("com.vivo.pushservice"));
                intent.putExtra("security_avoid_rsa_public_key", u.a(com.vivo.push.c.d.a(context).a().a()));
            }
        } catch (Exception e) {
            p.a(TAG, "pushNotificationByCustom encrypt ：" + e.getMessage());
        }
        new com.vivo.push.b.p(packageName, j, insideNotificationItem).b(intent);
        notification.contentIntent = PendingIntent.getService(context, (int) SystemClock.uptimeMillis(), intent, com.tencent.mapsdk.internal.y.a);
        if (sNotificationManager != null) {
            int k = com.vivo.push.e.a().k();
            try {
                if (k == 0) {
                    sNotificationManager.notify(sNotifyId, notification);
                    if (aVar != null) {
                        aVar.a();
                    }
                } else if (k == 1) {
                    sNotificationManager.notify((int) j, notification);
                    if (aVar != null) {
                        aVar.a();
                    }
                } else {
                    p.a(TAG, "unknow notify style ".concat(String.valueOf(k)));
                }
            } catch (Exception e2) {
                p.a(TAG, e2);
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    private static void pushNotificationBySystem(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j, int i, r.a aVar) {
        Bitmap bitmap;
        Notification.Builder builder;
        int i2;
        Bitmap bitmap2;
        Bitmap a;
        String packageName = context.getPackageName();
        String title = insideNotificationItem.getTitle();
        String content = insideNotificationItem.getContent();
        int i3 = context.getApplicationInfo().icon;
        boolean isShowTime = insideNotificationItem.isShowTime();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int defaultNotifyIcon = NotifyUtil.getNotifyDataAdapter(context).getDefaultNotifyIcon();
        if (list == null || list.isEmpty()) {
            bitmap = null;
        } else {
            Bitmap bitmap3 = list.get(0);
            if (bitmap3 == null || defaultNotifyIcon <= 0 || (a = com.sankuai.waimai.launcher.util.image.a.a(context.getResources(), defaultNotifyIcon)) == null) {
                bitmap = bitmap3;
            } else {
                int width = a.getWidth();
                int height = a.getHeight();
                a.recycle();
                bitmap = c.a(bitmap3, width, height);
            }
        }
        Bundle bundle = new Bundle();
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(context, PRIMARY_CHANNEL);
            if (defaultNotifyIcon > 0) {
                bundle.putInt("vivo.summaryIconRes", defaultNotifyIcon);
            }
            if (bitmap != null) {
                builder.setLargeIcon(bitmap);
            }
        } else {
            builder = new Notification.Builder(context);
            if (bitmap != null) {
                builder.setLargeIcon(bitmap);
            } else if (Build.VERSION.SDK_INT <= 22) {
                builder.setLargeIcon(com.sankuai.waimai.launcher.util.image.a.a(context.getResources(), i3));
            }
        }
        if (Build.VERSION.SDK_INT >= 19) {
            bundle.putLong("pushId", j);
            builder.setExtras(bundle);
        }
        int defaultSmallIconId = NotifyUtil.getNotifyDataAdapter(context).getDefaultSmallIconId();
        if (defaultSmallIconId <= 0) {
            defaultSmallIconId = i3;
        }
        builder.setSmallIcon(defaultSmallIconId);
        if (insideNotificationItem.getCompatibleType() != 1) {
            builder.setContentTitle(title);
        }
        builder.setPriority(2);
        builder.setContentText(content);
        builder.setWhen(isShowTime ? System.currentTimeMillis() : 0L);
        builder.setShowWhen(isShowTime);
        builder.setTicker(title);
        int ringerMode = audioManager.getRingerMode();
        switch (insideNotificationItem.getNotifyType()) {
            case 2:
                if (ringerMode == 2) {
                    builder.setDefaults(1);
                    break;
                }
                break;
            case 3:
                if (ringerMode == 2) {
                    builder.setDefaults(2);
                    builder.setVibrate(new long[]{0, 100, 200, 300});
                    break;
                }
                break;
            case 4:
                if (ringerMode != 2) {
                    if (ringerMode == 1) {
                        builder.setDefaults(2);
                        builder.setVibrate(new long[]{0, 100, 200, 300});
                        break;
                    }
                } else {
                    builder.setDefaults(3);
                    builder.setVibrate(new long[]{0, 100, 200, 300});
                    break;
                }
                break;
        }
        if (list == null || list.size() <= 1) {
            i2 = i;
            bitmap2 = null;
        } else {
            bitmap2 = list.get(1);
            i2 = i;
        }
        if (i2 != 1) {
            Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
            bigTextStyle.setBigContentTitle(title);
            bigTextStyle.bigText(content);
            builder.setStyle(bigTextStyle);
        }
        if (bitmap2 != null) {
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            bigPictureStyle.setBigContentTitle(title);
            bigPictureStyle.setSummaryText(content);
            bigPictureStyle.bigPicture(bitmap2);
            builder.setStyle(bigPictureStyle);
        }
        builder.setAutoCancel(true);
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
        intent.putExtra("command_type", "reflect_receiver");
        try {
            intent.putExtra("security_avoid_pull", a.a(context).a("com.vivo.pushservice"));
            if (Build.VERSION.SDK_INT >= 18) {
                intent.putExtra("security_avoid_pull_rsa", com.vivo.push.c.d.a(context).a().a("com.vivo.pushservice"));
                intent.putExtra("security_avoid_rsa_public_key", u.a(com.vivo.push.c.d.a(context).a().a()));
            }
        } catch (Exception e) {
            p.a(TAG, "pushNotificationBySystem encrypt ：" + e.getMessage());
        }
        new com.vivo.push.b.p(packageName, j, insideNotificationItem).b(intent);
        builder.setContentIntent(PendingIntent.getService(context, (int) SystemClock.uptimeMillis(), intent, com.tencent.mapsdk.internal.y.a));
        Notification build = builder.build();
        int k = com.vivo.push.e.a().k();
        if (sNotificationManager != null) {
            try {
                if (k == 0) {
                    sNotificationManager.notify(sNotifyId, build);
                    if (aVar != null) {
                        aVar.a();
                    }
                } else if (k == 1) {
                    sNotificationManager.notify((int) j, build);
                    if (aVar != null) {
                        aVar.a();
                    }
                } else {
                    p.a(TAG, "unknow notify style ".concat(String.valueOf(k)));
                }
            } catch (Exception e2) {
                p.a(TAG, e2);
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    public static boolean repealNotifyById(Context context, long j) {
        int k = com.vivo.push.e.a().k();
        if (k != 0) {
            if (k == 1) {
                return cancelNotify(context, (int) j);
            }
            p.a(TAG, "unknow cancle notify style ".concat(String.valueOf(k)));
            return false;
        }
        long b = w.b().b("com.vivo.push.notify_key", -1L);
        if (b == j) {
            p.d(TAG, "undo showed message ".concat(String.valueOf(j)));
            p.a(context, "回收已展示的通知： ".concat(String.valueOf(j)));
            return cancelNotify(context, sNotifyId);
        }
        p.d(TAG, "current showing message id " + b + " not match " + j);
        p.a(context, "与已展示的通知" + b + "与待回收的通知" + j + "不匹配");
        return false;
    }

    private static boolean cancelNotify(Context context, int i) {
        initAdapter(context);
        if (sNotificationManager != null) {
            sNotificationManager.cancel(i);
            return true;
        }
        return false;
    }

    public static void cancelNotify(Context context) {
        cancelNotify(context, sNotifyId);
    }

    public static void setNotifyId(int i) {
        sNotifyId = i;
    }

    private static boolean isZh(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().endsWith("zh");
    }
}
