package com.meizu.cloud.pushsdk.handler.a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.NotificationService;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.model.styleenum.BaseStyleModel;
import com.meizu.cloud.pushsdk.notification.model.styleenum.InnerStyleLayout;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class c extends a<MessageV3> {
    public c(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    /* renamed from: g  reason: avoid collision after fix types in other method */
    private static String g2(MessageV3 messageV3) {
        String selfDefineContentString = MzPushMessage.fromMessageV3(messageV3).getSelfDefineContentString();
        if (!TextUtils.isEmpty(selfDefineContentString)) {
            try {
                return new JSONObject(selfDefineContentString).getString("package_name");
            } catch (JSONException unused) {
                DebugLogger.e("AbstractMessageHandler", "no quick json message");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public void a(MessageV3 messageV3, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (cVar != null) {
            cVar.a(messageV3);
            a(messageV3);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int b() {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: g */
    public MessageV3 a(Intent intent) {
        String a = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_SHOW_V3.equals(com.sankuai.waimai.platform.utils.f.a(intent, "method")) ? PushConstants.MZ_PUSH_PRIVATE_MESSAGE : "message");
        String packageName = this.b.getPackageName();
        String c = c(intent);
        String d = d(intent);
        String b = b(intent);
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.EXTRA_APP_PUSH_TASK_ID);
        String a3 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.EXTRA_APP_PUSH_SEQ_ID);
        boolean a4 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.MZ_PUSH_WHITE_LIST, false);
        DebugLogger.i("AbstractMessageHandler", "receive push whiteList from pushservice " + a4);
        long a5 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.MZ_PUSH_DELAYED_REPORT_MILLIS, 0L);
        DebugLogger.i("AbstractMessageHandler", "receive push delayedReportMillis from pushservice " + a5);
        return MessageV3.parse(packageName, c, d, b, a2, a3, a, a4, a5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: f  reason: avoid collision after fix types in other method */
    public int d(MessageV3 messageV3) {
        if (messageV3.getBrightRemindSetting() == null || !messageV3.getBrightRemindSetting().getIsBrightRemind() || MzSystemUtils.isInteractive(this.b)) {
            if (messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdInstallPackage())) {
                if (messageV3.getTimeDisplaySetting() == null || !messageV3.getTimeDisplaySetting().isTimeDisplay()) {
                    return 0;
                }
                if (System.currentTimeMillis() > Long.valueOf(messageV3.getTimeDisplaySetting().getEndShowTime()).longValue()) {
                    com.meizu.cloud.pushsdk.util.d.a(this.b, "schedule notification expire", (int) PushConstants.EXPIRE_NOTIFICATION, messageV3.getTaskId(), messageV3.getDeviceId());
                    return 1;
                } else if (System.currentTimeMillis() > Long.valueOf(messageV3.getTimeDisplaySetting().getStartShowTime()).longValue()) {
                    com.meizu.cloud.pushsdk.util.d.a(this.b, "schedule notification on time", (int) PushConstants.ON_TIME_NOTIFICATION, messageV3.getTaskId(), messageV3.getDeviceId());
                    return 2;
                } else {
                    com.meizu.cloud.pushsdk.util.d.a(this.b, "schedule notification delay", (int) PushConstants.DELAY_NOTIFICATION, messageV3.getTaskId(), messageV3.getDeviceId());
                    return 3;
                }
            }
            Context context = this.b;
            String adPackage = messageV3.getAdvertisementOption().getAdPackage();
            long j = context.getSharedPreferences("mz_push_preference_new", 0).getLong(adPackage + ".ad_last_close_time", 0L);
            StringBuilder sb = new StringBuilder("ad message last click time is: ");
            sb.append(j);
            DebugLogger.i("AbstractMessageHandler", sb.toString());
            if (j == 0 || j + DDLoadConstants.CACHE_INVALID_TIME <= System.currentTimeMillis()) {
                return 0;
            }
            com.meizu.cloud.pushsdk.util.d.a(this.b, true, messageV3.getAdvertisementOption().getAdInstallPackage(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), "acsm", messageV3.getPushTimestamp());
            return 5;
        }
        return 4;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start MessageV3Handler match");
        if (a(0, c(intent))) {
            if (PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_SHOW_V3.equals(com.sankuai.waimai.platform.utils.f.a(intent, "method"))) {
                return true;
            }
            if (TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(intent, "method"))) {
                String a = com.sankuai.waimai.platform.utils.f.a(intent, "message");
                if (!TextUtils.isEmpty(a) && a(a)) {
                    DebugLogger.e("AbstractMessageHandler", "old cloud notification message");
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: d */
    public void b(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.d.b(this.b, messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp(), messageV3.getDelayedReportMillis());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: e */
    public void c(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.d.a(this.b, messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp(), messageV3.getDelayedReportMillis());
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    protected final /* synthetic */ boolean a(MessageV3 messageV3, String str) {
        return a(messageV3, str);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    protected final /* synthetic */ boolean g(MessageV3 messageV3) {
        String uriPackageName = messageV3.getUriPackageName();
        if (TextUtils.isEmpty(uriPackageName)) {
            return true;
        }
        return MzSystemUtils.isPackageInstalled(this.b, uriPackageName);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    protected final /* synthetic */ void f(MessageV3 messageV3) {
        MessageV3 messageV32 = messageV3;
        Intent intent = new Intent(this.b, NotificationService.class);
        intent.setPackage(messageV32.getPackageName());
        intent.addCategory(messageV32.getPackageName());
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra("command_type", "reflect_receiver");
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        intent.putExtra(PushConstants.EXTRA_APP_PUSH_BRIGHT_NOTIFICATION_MESSAGE, messageV32);
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_BRIGHT_NOTIFICATION_MESSAGE);
        com.meizu.cloud.pushsdk.handler.a.f.a aVar = com.meizu.cloud.pushsdk.b.a(this.b).b;
        if (aVar != null) {
            aVar.a(intent, messageV32.getUploadDataPackageName());
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    protected final /* synthetic */ void e(MessageV3 messageV3) {
        MessageV3 messageV32 = messageV3;
        AlarmManager alarmManager = (AlarmManager) this.b.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intent intent = new Intent(this.b, NotificationService.class);
        intent.setPackage(messageV32.getPackageName());
        intent.addCategory(messageV32.getPackageName());
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra("command_type", "reflect_receiver");
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        intent.putExtra(PushConstants.EXTRA_APP_PUSH_SCHEDULE_NOTIFICATION_MESSAGE, messageV32);
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_SCHEDULE_NOTIFICATION);
        PendingIntent service = PendingIntent.getService(this.b, 0, intent, MinSdkChecker.isSupportSetDrawableSmallIcon() ? 67108864 : 1073741824);
        String startShowTime = messageV32.getTimeDisplaySetting().getStartShowTime();
        String format = TextUtils.isEmpty(startShowTime) ? null : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(Long.valueOf(startShowTime).longValue()));
        long longValue = Long.valueOf(startShowTime).longValue() - System.currentTimeMillis();
        DebugLogger.i("AbstractMessageHandler", "after " + (longValue / 1000) + " seconds Notification AlarmManager execute At " + format);
        if (alarmManager != null && Build.VERSION.SDK_INT >= 19) {
            DebugLogger.i("AbstractMessageHandler", "setAlarmManager setExact ELAPSED_REALTIME_WAKEUP");
            alarmManager.setExact(2, SystemClock.elapsedRealtime() + longValue, service);
        } else if (alarmManager != null) {
            DebugLogger.i("AbstractMessageHandler", "setAlarmManager set ELAPSED_REALTIME_WAKEUP");
            alarmManager.set(2, SystemClock.elapsedRealtime() + longValue, service);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    protected final /* synthetic */ com.meizu.cloud.pushsdk.notification.c a(MessageV3 messageV3) {
        MessageV3 messageV32 = messageV3;
        PushNotificationBuilder pushNotificationBuilder = new PushNotificationBuilder(this.b);
        pushNotificationBuilder.setClickPackageName(g2(messageV32));
        this.a.a(pushNotificationBuilder);
        com.meizu.cloud.pushsdk.notification.c cVar = null;
        if (messageV32.getNotificationStyle() != null) {
            int baseStyle = messageV32.getNotificationStyle().getBaseStyle();
            if (BaseStyleModel.FLYME.getCode() == baseStyle) {
                int innerStyle = messageV32.getNotificationStyle().getInnerStyle();
                if (InnerStyleLayout.EXPANDABLE_STANDARD.getCode() == innerStyle) {
                    DebugLogger.i("AbstractMessageHandler", "show Standard Notification with Expandable disable");
                    cVar = new com.meizu.cloud.pushsdk.notification.b.c(this.b, pushNotificationBuilder);
                } else if (InnerStyleLayout.EXPANDABLE_TEXT.getCode() == innerStyle) {
                    DebugLogger.i("AbstractMessageHandler", "show Standard Notification with Expandable Text");
                    cVar = new com.meizu.cloud.pushsdk.notification.b.b(this.b, pushNotificationBuilder);
                } else if (InnerStyleLayout.EXPANDABLE_PIC.getCode() == innerStyle) {
                    DebugLogger.i("AbstractMessageHandler", "show Standard Notification with Expandable Picture");
                    cVar = new com.meizu.cloud.pushsdk.notification.b.a(this.b, pushNotificationBuilder);
                } else if (InnerStyleLayout.EXPANDABLE_VIDEO.getCode() == innerStyle) {
                    DebugLogger.i("AbstractMessageHandler", "show Flyme Video notification");
                    cVar = new com.meizu.cloud.pushsdk.notification.a.d(this.b, pushNotificationBuilder);
                }
            } else if (BaseStyleModel.PURE_PICTURE.getCode() == baseStyle) {
                cVar = new com.meizu.cloud.pushsdk.notification.b(this.b, pushNotificationBuilder);
                DebugLogger.i("AbstractMessageHandler", "show Pure Picture Notification");
            } else if (BaseStyleModel.ANDROID.getCode() == baseStyle) {
                int innerStyle2 = messageV32.getNotificationStyle().getInnerStyle();
                if (InnerStyleLayout.EXPANDABLE_STANDARD.getCode() == innerStyle2) {
                    DebugLogger.i("AbstractMessageHandler", "show Android  Notification with Expandable disable");
                    cVar = new com.meizu.cloud.pushsdk.notification.a.c(this.b, pushNotificationBuilder);
                } else if (InnerStyleLayout.EXPANDABLE_TEXT.getCode() == innerStyle2) {
                    DebugLogger.i("AbstractMessageHandler", "show Android  Notification with Expandable Text");
                    cVar = new com.meizu.cloud.pushsdk.notification.a.b(this.b, pushNotificationBuilder);
                } else if (InnerStyleLayout.EXPANDABLE_PIC.getCode() == innerStyle2) {
                    DebugLogger.i("AbstractMessageHandler", "show Android  Notification with Expandable Picture");
                    cVar = new com.meizu.cloud.pushsdk.notification.a.a(this.b, pushNotificationBuilder);
                } else if (InnerStyleLayout.EXPANDABLE_VIDEO.getCode() == innerStyle2) {
                    DebugLogger.i("AbstractMessageHandler", "show Flyme Video notification");
                    cVar = new com.meizu.cloud.pushsdk.notification.a.d(this.b, pushNotificationBuilder);
                }
            }
        }
        if (cVar == null) {
            DebugLogger.e("AbstractMessageHandler", "use standard v2 notification");
            return new com.meizu.cloud.pushsdk.notification.d(this.b, pushNotificationBuilder);
        }
        return cVar;
    }
}
