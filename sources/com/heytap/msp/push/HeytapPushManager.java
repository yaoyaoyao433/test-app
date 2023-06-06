package com.heytap.msp.push;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.constraint.R;
import android.text.TextUtils;
import com.heytap.mcssdk.b;
import com.heytap.mcssdk.b.a;
import com.heytap.mcssdk.f.d;
import com.heytap.mcssdk.f.e;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.mode.MessageStat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mcs.aidl.IMcsSdkService;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class HeytapPushManager {
    public static final String EVENT_ID_APP_BLACK_LIST = "app_black_list";
    public static final String EVENT_ID_PUSH_ADD_MESSAGE_NO_DISTURBING = "add_message_no_disturbing";
    public static final String EVENT_ID_PUSH_ADD_MESSAGE_TOP = "add_message_top";
    public static final String EVENT_ID_PUSH_CLICK = "push_click";
    public static final String EVENT_ID_PUSH_DELETE = "push_delete";
    public static final String EVENT_ID_PUSH_EXCEPTION = "push_exception";
    public static final String EVENT_ID_PUSH_MESSAGE_REPEAT = "message_repeat";
    public static final String EVENT_ID_PUSH_NO_IMSI = "imsi_not_exist";
    public static final String EVENT_ID_PUSH_NO_SHOW = "push_no_show";
    public static final String EVENT_ID_PUSH_REVOKE = "push_revoke";
    public static final String EVENT_ID_PUSH_REVOKE_DELETE = "push_revoke_delete";
    public static final String EVENT_ID_PUSH_SHOW = "push_show";
    public static final String EVENT_ID_READ_MESSAGE = "push_read_message";

    public static void clearNotificationType() {
        clearNotificationType(null);
    }

    public static void clearNotificationType(JSONObject jSONObject) {
        b.a().b(jSONObject);
    }

    public static void clearNotifications() {
        clearNotifications(null);
    }

    public static void clearNotifications(JSONObject jSONObject) {
        b.a().b(jSONObject);
    }

    public static String getMcsPackageName() {
        return b.a().b();
    }

    public static void getNotificationStatus() {
        getNotificationStatus(null);
    }

    public static String getReceiveSdkAction() {
        return b.a().c();
    }

    public static void getRegister() {
        getRegister(null);
    }

    public static String getSDKVersion() {
        return b.g();
    }

    public static boolean isSupportPush() {
        return b.a().d();
    }

    public static void openNotificationSettings() {
        openNotificationSettings(null);
    }

    public static void pausePush() {
        pausePush(null);
    }

    public static void register(Context context, String str, String str2, ICallBackResultService iCallBackResultService) {
        register(context, str, str2, null, iCallBackResultService);
    }

    public static void resumePush() {
        resumePush(null);
    }

    public static void setNotificationType(int i) {
        setNotificationType(i, null);
    }

    public static void setPushTime(List<Integer> list, int i, int i2, int i3, int i4) {
        setPushTime(list, i, i2, i3, i4, null);
    }

    public static void statisticMessage(Context context, MessageStat messageStat) {
        b.a(context, messageStat);
    }

    public static void statisticMessage(Context context, List<MessageStat> list) {
        b.a(context, list);
    }

    public static void unRegister() {
        unRegister(null);
    }

    public static void unRegister(JSONObject jSONObject) {
        b.a().a(jSONObject);
    }

    public static void init(Context context, boolean z) {
        b a = b.a();
        a.a = context.getApplicationContext();
        final a aVar = new a();
        final Context context2 = a.a;
        if (Build.VERSION.SDK_INT >= 26) {
            d.a(new Runnable() { // from class: com.heytap.mcssdk.b.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationManager notificationManager;
                    boolean z2;
                    if (context2.getSharedPreferences("shared_msg_sdk", 0).getBoolean("hasDefaultChannelCreated", false)) {
                        return;
                    }
                    String string = context2.getString(R.string.system_default_channel);
                    if (TextUtils.isEmpty(string)) {
                        string = "System Default Channel";
                    }
                    a aVar2 = aVar;
                    Context context3 = context2;
                    if (context3 == null || (notificationManager = (NotificationManager) context3.getSystemService(RemoteMessageConst.NOTIFICATION)) == null) {
                        z2 = false;
                    } else {
                        notificationManager.createNotificationChannel(new NotificationChannel("Heytap PUSH", string, 3));
                        z2 = true;
                    }
                    context2.getSharedPreferences("shared_msg_sdk", 0).edit().putBoolean("hasDefaultChannelCreated", z2).commit();
                }
            });
        }
        com.heytap.mcssdk.f.b.a(z);
    }

    public static void setAppKeySecret(String str, String str2) {
        b a = b.a();
        a.d = str;
        a.e = str2;
    }

    public static String getRegisterID() {
        return b.a().f;
    }

    public static void setRegisterID(String str) {
        b.a().f = str;
    }

    public static ICallBackResultService getPushCallback() {
        return b.a().g;
    }

    public static void setPushCallback(ICallBackResultService iCallBackResultService) {
        b.a().g = iCallBackResultService;
    }

    public static void register(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        b a = b.a();
        if (context == null) {
            if (iCallBackResultService != null) {
                iCallBackResultService.onRegister(-2, null);
                return;
            }
            return;
        }
        b.a(context, new MessageStat(context.getPackageName(), "push_register", null));
        if (!a.d()) {
            if (iCallBackResultService != null) {
                iCallBackResultService.onRegister(-2, null);
                return;
            }
            return;
        }
        a.d = str;
        a.e = str2;
        a.a = context.getApplicationContext();
        a.g = iCallBackResultService;
        a.a(12289, jSONObject);
    }

    public static void unRegister(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        b a = b.a();
        a.d = str;
        a.e = str2;
        a.a = context.getApplicationContext();
        a.g = iCallBackResultService;
        a.a(jSONObject);
    }

    public static void getRegister(JSONObject jSONObject) {
        b a = b.a();
        if (a.e()) {
            a.a(12289, jSONObject);
        } else if (a.g != null) {
            a.g.onRegister(-2, null);
        }
    }

    public static void pausePush(JSONObject jSONObject) {
        b a = b.a();
        if (a.f()) {
            a.a(12299, jSONObject);
        } else {
            com.heytap.mcssdk.f.b.a("mcssdk---", "please call the register first!");
        }
    }

    public static void resumePush(JSONObject jSONObject) {
        b a = b.a();
        if (a.f()) {
            a.a(12300, jSONObject);
        } else {
            com.heytap.mcssdk.f.b.a("mcssdk---", "please call the register first!");
        }
    }

    public static void getNotificationStatus(JSONObject jSONObject) {
        b a = b.a();
        if (a.f()) {
            a.a(12309, jSONObject);
        } else if (a.g != null) {
            a.g.onGetNotificationStatus(-2, 0);
        }
    }

    public static void setNotificationType(int i, JSONObject jSONObject) {
        b a = b.a();
        if (!a.f()) {
            com.heytap.mcssdk.f.b.a("mcssdk---", "please call the register first!");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        a.a(12307, sb.toString(), jSONObject);
    }

    public static void openNotificationSettings(JSONObject jSONObject) {
        b a = b.a();
        if (a.f()) {
            a.a(12310, jSONObject);
        } else {
            com.heytap.mcssdk.f.b.a("mcssdk---", "please call the register first!");
        }
    }

    public static void getPushStatus() {
        b a = b.a();
        if (a.f()) {
            a.a(12306, (JSONObject) null);
        } else if (a.g != null) {
            a.g.onGetPushStatus(-2, 0);
        }
    }

    public static String getPushVersionName() {
        b a = b.a();
        return a.e() ? e.c(a.a, a.b()) : "";
    }

    public static int getPushVersionCode() {
        b a = b.a();
        if (a.e()) {
            return e.b(a.a, a.b());
        }
        return 0;
    }

    public static void setPushTime(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject) {
        b a = b.a();
        if (!a.f()) {
            if (a.g != null) {
                a.g.onSetPushTime(-2, "please call the register first!");
            }
        } else if (list == null || list.size() <= 0 || i < 0 || i2 < 0 || i3 < i || i3 > 23 || i4 < i2 || i4 > 59) {
            throw new IllegalArgumentException("params are not all right,please check params");
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("weekDays", com.heytap.mcssdk.c.a.a(list));
                jSONObject2.put("startHour", i);
                jSONObject2.put("startMin", i2);
                jSONObject2.put("endHour", i3);
                jSONObject2.put("endMin", i4);
                a.a(12298, jSONObject2.toString(), jSONObject);
            } catch (JSONException e) {
                com.heytap.mcssdk.f.b.a("mcssdk---", e.getLocalizedMessage());
            }
        }
    }

    public static void requestNotificationPermission() {
        final b a = b.a();
        if (!a.e()) {
            com.heytap.mcssdk.f.b.a("mcssdk---", "please call the register first!");
            return;
        }
        final Intent b = a.b(12313, "", null);
        a.a.bindService(b, new ServiceConnection() { // from class: com.heytap.mcssdk.b.1
            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Bundle bundle = new Bundle();
                bundle.putAll(b.getExtras());
                try {
                    IMcsSdkService.Stub.asInterface(iBinder).process(bundle);
                } catch (Exception e) {
                    com.heytap.mcssdk.f.b.a("bindMcsService exception:" + e);
                }
                a.a.unbindService(this);
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
            }
        }, 1);
    }
}
