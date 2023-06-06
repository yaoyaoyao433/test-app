package com.meizu.cloud.pushsdk.notification;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.dianping.picasso.PicassoUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.c.a.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public abstract class a implements c {
    protected final Context a;
    protected final PushNotificationBuilder b;
    private final NotificationManager c;
    private final Handler d;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, PushNotificationBuilder pushNotificationBuilder) {
        this.b = pushNotificationBuilder;
        this.a = context;
        this.d = new Handler(context.getMainLooper());
        this.c = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    private PendingIntent a(MessageV3 messageV3, String str) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE);
        intent.setClassName(str, MzSystemUtils.findReceiver(this.a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, str));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        intent.setFlags(32);
        return PendingIntent.getBroadcast(this.a, 0, intent, 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Bitmap a(Context context, String str) {
        BitmapDrawable bitmapDrawable;
        try {
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(str);
            Bitmap bitmap = null;
            if (Build.VERSION.SDK_INT < 26 || (applicationIcon instanceof BitmapDrawable)) {
                bitmapDrawable = (BitmapDrawable) applicationIcon;
            } else if (applicationIcon instanceof AdaptiveIconDrawable) {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                bitmapDrawable = null;
                bitmap = createBitmap;
            } else {
                bitmapDrawable = null;
            }
            return bitmap == null ? bitmapDrawable.getBitmap() : bitmap;
        } catch (Exception e) {
            DebugLogger.i("AbstractPushNotification", "get app icon error " + e.getMessage());
            return ((BitmapDrawable) context.getApplicationInfo().loadIcon(context.getPackageManager())).getBitmap();
        }
    }

    @TargetApi(23)
    private Icon b(String str) {
        try {
            int identifier = this.a.getPackageManager().getResourcesForApplication(str).getIdentifier(PushConstants.MZ_PUSH_NOTIFICATION_SMALL_ICON, PicassoUtils.DEF_TYPE, str);
            if (identifier != 0) {
                DebugLogger.i("AbstractPushNotification", "get " + str + " smallIcon success resId " + identifier);
                return Icon.createWithResource(str, identifier);
            }
            return null;
        } catch (Exception e) {
            DebugLogger.e("AbstractPushNotification", "cannot load smallIcon form package " + str + " Error message " + e.getMessage());
            return null;
        }
    }

    private static String b(Context context, String str) {
        CharSequence applicationLabel;
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo == null || (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) == null) {
                return null;
            }
            return (String) applicationLabel;
        } catch (PackageManager.NameNotFoundException unused) {
            DebugLogger.e("AbstractPushNotification", "can not find " + str + " application info");
            return null;
        }
    }

    private PendingIntent c(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_DELETE);
        intent.setClassName(messageV3.getPackageName(), MzSystemUtils.findReceiver(this.a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        return PendingIntent.getBroadcast(this.a, 0, intent, 1073741824);
    }

    private PendingIntent d(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_CLOSE);
        intent.setClassName(messageV3.getPackageName(), MzSystemUtils.findReceiver(this.a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        return PendingIntent.getBroadcast(this.a, 0, intent, 1073741824);
    }

    private static String e(MessageV3 messageV3) {
        String str = null;
        try {
            if (!TextUtils.isEmpty(messageV3.getNotificationMessage())) {
                str = new JSONObject(messageV3.getNotificationMessage()).getJSONObject("data").getJSONObject("extra").getString("fns");
            }
        } catch (Exception e) {
            DebugLogger.e("AbstractPushNotification", "parse flyme notification setting error " + e.getMessage());
        }
        DebugLogger.i("AbstractPushNotification", "current FlymeGreen notification setting is " + str);
        return str;
    }

    protected void a(Notification.Builder builder, MessageV3 messageV3) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Notification notification, MessageV3 messageV3) {
    }

    protected void a(Notification notification, MessageV3 messageV3, PendingIntent pendingIntent) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a() {
        return Thread.currentThread() == this.a.getMainLooper().getThread();
    }

    protected void b(Notification.Builder builder, MessageV3 messageV3) {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x039f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.app.Notification a(com.meizu.cloud.pushsdk.handler.MessageV3 r12, android.app.PendingIntent r13, android.app.PendingIntent r14, android.app.PendingIntent r15) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.notification.a.a(com.meizu.cloud.pushsdk.handler.MessageV3, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent):android.app.Notification");
    }

    private PendingIntent b(MessageV3 messageV3) {
        boolean z = true;
        if ((messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) && (!messageV3.getWhiteList() || MzSystemUtils.isExistReceiver(this.a, messageV3.getUploadDataPackageName(), PushConstants.MZ_PUSH_ON_MESSAGE_ACTION))) {
            z = false;
        }
        return a(messageV3, z ? messageV3.getPackageName() : messageV3.getUploadDataPackageName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Bitmap a(String str) {
        com.meizu.cloud.pushsdk.c.a.b a = com.meizu.cloud.pushsdk.c.a.a(str).a();
        a.c = e.e;
        com.meizu.cloud.pushsdk.c.a.c a2 = com.meizu.cloud.pushsdk.c.e.c.a(a);
        if (!a2.a() || a2.a == 0) {
            DebugLogger.i("AbstractPushNotification", "ANRequest On other Thread down load largeIcon " + str + "image fail");
            return null;
        }
        StringBuilder sb = new StringBuilder("ANRequest On other Thread down load largeIcon ");
        sb.append(str);
        sb.append("image ");
        sb.append(a2.a != 0 ? "success" : "fail");
        DebugLogger.i("AbstractPushNotification", sb.toString());
        return (Bitmap) a2.a;
    }

    @Override // com.meizu.cloud.pushsdk.notification.c
    @SuppressLint({"NewApi"})
    public final void a(MessageV3 messageV3) {
        String str;
        if (messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage()) || messageV3 == null || messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            str = null;
        } else {
            str = messageV3.getUploadDataPackageName();
            String adPackage = messageV3.getAdvertisementOption().getAdPackage();
            DebugLogger.e("AbstractPushNotification", "again show old ad and replace package, uploadDataPackageName:" + str + ", adPackageName:" + adPackage);
            com.meizu.cloud.pushsdk.handler.a.a.a aVar = com.meizu.cloud.pushsdk.b.a(this.a).c;
            if (aVar != null) {
                aVar.a();
            }
            messageV3.setUploadDataPackageName(adPackage);
        }
        Notification a = a(messageV3, b(messageV3), c(messageV3), d(messageV3));
        int abs = Math.abs((int) System.currentTimeMillis());
        com.meizu.cloud.pushsdk.notification.model.a a2 = com.meizu.cloud.pushsdk.notification.model.a.a(messageV3);
        if (a2 != null && a2.a != 0) {
            abs = a2.a;
            DebugLogger.e("AbstractPushNotification", "server notify id " + abs);
            if (!TextUtils.isEmpty(a2.b)) {
                int d = com.meizu.cloud.pushsdk.util.b.d(this.a, messageV3.getUploadDataPackageName(), a2.b);
                DebugLogger.e("AbstractPushNotification", "notifyKey " + a2.b + " preference notifyId is " + d);
                if (d != 0) {
                    DebugLogger.e("AbstractPushNotification", "use preference notifyId " + d + " and cancel it");
                    this.c.cancel(d);
                }
                DebugLogger.e("AbstractPushNotification", "store new notifyId " + abs + " by notifyKey " + a2.b);
                com.meizu.cloud.pushsdk.util.b.a(this.a, "mz_push_preference", messageV3.getUploadDataPackageName() + CommonConstant.Symbol.DOT + a2.b, abs);
            }
        }
        DebugLogger.e("AbstractPushNotification", "current notify id " + abs);
        if (messageV3.isDiscard()) {
            if (com.meizu.cloud.pushsdk.util.b.c(this.a, messageV3.getPackageName()) == 0) {
                com.meizu.cloud.pushsdk.util.b.a(this.a, messageV3.getPackageName(), abs);
                DebugLogger.i("AbstractPushNotification", "no notification show so put notification id " + abs);
            }
            if (!TextUtils.isEmpty(messageV3.getTaskId())) {
                if (com.meizu.cloud.pushsdk.util.b.d(this.a, messageV3.getPackageName()) == 0) {
                    com.meizu.cloud.pushsdk.util.b.b(this.a, messageV3.getPackageName(), Integer.valueOf(messageV3.getTaskId()).intValue());
                } else if (Integer.valueOf(messageV3.getTaskId()).intValue() < com.meizu.cloud.pushsdk.util.b.d(this.a, messageV3.getPackageName())) {
                    DebugLogger.i("AbstractPushNotification", "current package " + messageV3.getPackageName() + " task id " + messageV3.getTaskId() + " don't show notification");
                    return;
                } else {
                    com.meizu.cloud.pushsdk.util.b.b(this.a, messageV3.getPackageName(), Integer.valueOf(messageV3.getTaskId()).intValue());
                    abs = com.meizu.cloud.pushsdk.util.b.c(this.a, messageV3.getPackageName());
                }
            }
            DebugLogger.i("AbstractPushNotification", "current package " + messageV3.getPackageName() + " notificationId=" + abs + " taskId=" + messageV3.getTaskId());
        }
        if (messageV3.getAdvertisementOption() != null && !TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage()) && messageV3 != null && messageV3.getAdvertisementOption() != null && !TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            DebugLogger.e("AbstractPushNotification", "save ad and recovery package, uploadDataPackageName:" + str);
            com.meizu.cloud.pushsdk.handler.a.a.a aVar2 = com.meizu.cloud.pushsdk.b.a(this.a).c;
            if (aVar2 != null) {
                int priorityValidTime = messageV3.getAdvertisementOption().getPriorityValidTime();
                AdvanceSetting advanceSetting = messageV3.getAdvanceSetting();
                if (advanceSetting != null) {
                    advanceSetting.getNotifyType().setSound(false);
                    advanceSetting.getNotifyType().setLights(false);
                    advanceSetting.getNotifyType().setVibrate(false);
                }
                AdvanceSettingEx advanceSettingEx = messageV3.getAdvanceSettingEx();
                if (advanceSettingEx != null) {
                    advanceSettingEx.setSoundTitle(null);
                    if (Build.VERSION.SDK_INT < 29 || advanceSetting == null || !advanceSetting.isHeadUpNotification()) {
                        advanceSettingEx.setPriorityDisplay(0);
                    } else {
                        advanceSettingEx.setPriorityDisplay(1);
                    }
                }
                aVar2.a(abs, a(messageV3, b(messageV3), c(messageV3), d(messageV3)), priorityValidTime);
            }
            messageV3.setUploadDataPackageName(str);
        }
        this.c.notify(abs, a);
    }
}
