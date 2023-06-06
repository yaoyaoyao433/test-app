package com.dianping.base.push.pushservice;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.media.utils.SelectPhotoUtil;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class i {
    public static ChangeQuickRedirect a = null;
    private static final String b = "i";
    private static i c;
    private NotificationManager d;
    private Context e;
    private Bitmap f;

    @TargetApi(11)
    private i(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47ba351c762360d4c850ab690aecd817", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47ba351c762360d4c850ab690aecd817");
            return;
        }
        this.d = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        this.e = context.getApplicationContext();
    }

    public static i a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03c9418759ba948d6ab6c430714a0916", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03c9418759ba948d6ab6c430714a0916");
        }
        if (c == null) {
            c = new i(context);
        }
        return c;
    }

    public final void a(JSONObject jSONObject) {
        NotificationCompat.Builder autoCancel;
        int i = 0;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71ee33dde65e5bc9117583cf8fd0fe36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71ee33dde65e5bc9117583cf8fd0fe36");
        } else if (Build.VERSION.SDK_INT >= 26) {
            Object[] objArr2 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "919e51253f1dff795c8b06a8f6074546", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "919e51253f1dff795c8b06a8f6074546");
                return;
            }
            try {
                String string = jSONObject.getString("pushmsgid");
                String optString = jSONObject.optString("title", f.e.d());
                String string2 = jSONObject.getString("content");
                String optString2 = jSONObject.optString("url", f.e.e());
                JSONObject optJSONObject = jSONObject.optJSONObject("extra");
                String optString3 = optJSONObject != null ? optJSONObject.optString("category") : "";
                if (TextUtils.isEmpty(optString2)) {
                    optString2 = f.e.e();
                }
                int optInt = jSONObject.optInt("channel");
                if (optInt == 0) {
                    optInt = jSONObject.getString("pushmsgid").hashCode();
                }
                NotificationChannel a2 = com.dianping.base.push.pushservice.util.e.a("xiaomi") ? null : f.a(optJSONObject);
                if (a2 == null) {
                    a(jSONObject.optInt(RemoteMessageConst.Notification.SOUND));
                    autoCancel = new NotificationCompat.Builder(this.e, "ps").setTicker(string2).setAutoCancel(true);
                } else {
                    autoCancel = new NotificationCompat.Builder(this.e, a2.getId()).setTicker(string2).setAutoCancel(true);
                }
                if (a() != null) {
                    autoCancel = autoCancel.setLargeIcon(a());
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    autoCancel.setSmallIcon(f.e.h()).setColor(this.e.getResources().getColor(f.e.i()));
                } else {
                    autoCancel.setSmallIcon(f.e.g());
                }
                autoCancel.setContentText(string2).setContentTitle(optString);
                if (Build.VERSION.SDK_INT < 21) {
                    autoCancel.setPriority(2);
                }
                Intent intent = new Intent("com.dianping.dpmtpush.CLICK_NOTIFICATION");
                intent.putExtra("url", optString2);
                intent.putExtra("jsonMsg", jSONObject.toString());
                intent.setPackage(this.e.getPackageName());
                intent.addFlags(335544320);
                PendingIntent activity = PendingIntent.getActivity(this.e, optInt, intent, 134217728);
                if (!TextUtils.isEmpty(optString3)) {
                    h hVar = f.e;
                }
                Intent intent2 = new Intent("com.dianping.dpmtpush.DELETE_NOTIFICATION");
                intent2.putExtra("url", optString2);
                intent2.putExtra("jsonMsg", jSONObject.toString());
                intent2.setPackage(this.e.getPackageName());
                PendingIntent broadcast = PendingIntent.getBroadcast(this.e, optInt, intent2, 134217728);
                Notification build = autoCancel.build();
                build.contentIntent = activity;
                build.deleteIntent = broadcast;
                this.d.cancel(optInt);
                this.d.notify(optInt, build);
                b(string);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append(e.toString());
                sb.append("\n");
                StackTraceElement[] stackTrace = e.getStackTrace();
                int length = stackTrace.length;
                while (i < length) {
                    sb.append(stackTrace[i].toString());
                    sb.append("\n");
                    i++;
                }
                c.d(b, sb.toString());
            }
        } else {
            try {
                String string3 = jSONObject.getString("pushmsgid");
                String optString4 = jSONObject.optString("title", f.e.d());
                String string4 = jSONObject.getString("content");
                String optString5 = jSONObject.optString("url", f.e.e());
                JSONObject optJSONObject2 = jSONObject.optJSONObject("extra");
                String optString6 = optJSONObject2 != null ? optJSONObject2.optString("category") : "";
                if (TextUtils.isEmpty(optString5)) {
                    optString5 = f.e.e();
                }
                int optInt2 = jSONObject.optInt("channel");
                if (optInt2 == 0) {
                    optInt2 = jSONObject.getString("pushmsgid").hashCode();
                }
                NotificationCompat.Builder autoCancel2 = new NotificationCompat.Builder(this.e).setTicker(string4).setAutoCancel(true);
                if (a() != null) {
                    autoCancel2 = autoCancel2.setLargeIcon(a());
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    autoCancel2.setSmallIcon(f.e.h()).setColor(this.e.getResources().getColor(f.e.i()));
                } else {
                    autoCancel2.setSmallIcon(f.e.g());
                }
                autoCancel2.setContentText(string4).setContentTitle(optString4);
                if (Build.VERSION.SDK_INT < 21) {
                    autoCancel2.setPriority(2);
                }
                Intent intent3 = new Intent("com.dianping.dpmtpush.CLICK_NOTIFICATION");
                intent3.setPackage(this.e.getPackageName());
                intent3.putExtra("url", optString5);
                intent3.putExtra("jsonMsg", jSONObject.toString());
                intent3.addFlags(335544320);
                if (!TextUtils.isEmpty(optString6)) {
                    h hVar2 = f.e;
                }
                Intent intent4 = new Intent("com.dianping.dpmtpush.DELETE_NOTIFICATION");
                intent4.putExtra("url", optString5);
                intent4.putExtra("jsonMsg", jSONObject.toString());
                intent4.setPackage(this.e.getPackageName());
                Notification build2 = autoCancel2.build();
                int optInt3 = jSONObject.optInt(RemoteMessageConst.Notification.SOUND);
                if (optInt3 == 1) {
                    build2.sound = RingtoneManager.getDefaultUri(2);
                } else if (optInt3 == 2) {
                    build2.vibrate = new long[]{0, 500};
                } else if (optInt3 == 3) {
                    build2.flags |= 1;
                } else if (optInt3 == 0) {
                    build2.sound = RingtoneManager.getDefaultUri(2);
                    build2.vibrate = new long[]{0, 500};
                    build2.flags |= 1;
                }
                build2.contentIntent = PendingIntent.getActivity(this.e, optInt2, intent3, 134217728);
                build2.deleteIntent = PendingIntent.getBroadcast(this.e, optInt2, intent4, 134217728);
                this.d.cancel(optInt2);
                this.d.notify(optInt2, build2);
                b(string3);
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e2.toString());
                sb2.append("\n");
                StackTraceElement[] stackTrace2 = e2.getStackTrace();
                int length2 = stackTrace2.length;
                while (i < length2) {
                    sb2.append(stackTrace2[i].toString());
                    sb2.append("\n");
                    i++;
                }
                c.d(b, sb2.toString());
            }
        }
    }

    private Bitmap a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10a531a1836d8480368468ea010bb8e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10a531a1836d8480368468ea010bb8e5");
        }
        if (this.f == null) {
            try {
                this.f = com.sankuai.waimai.launcher.util.image.a.a(this.e.getResources(), f.e.f());
            } catch (Throwable th) {
                c.d(b, th.toString());
            }
        }
        return this.f;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f90f5e877266039cbdfefd8aada95fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f90f5e877266039cbdfefd8aada95fb");
        } else if (this.d == null || Build.VERSION.SDK_INT < 26) {
        } else {
            try {
                if (this.d.getNotificationChannel("ps") != null) {
                    if (i == e.a(this.e).a("msg_channel_key", 0)) {
                        return;
                    }
                    this.d.deleteNotificationChannel("ps");
                }
                e.a(this.e).b("msg_channel_key", i);
                NotificationChannel notificationChannel = new NotificationChannel("ps", "消息推送", 3);
                switch (i) {
                    case 0:
                        notificationChannel.setSound(RingtoneManager.getDefaultUri(2), Notification.AUDIO_ATTRIBUTES_DEFAULT);
                        notificationChannel.setVibrationPattern(new long[]{0, 500});
                        notificationChannel.shouldShowLights();
                        break;
                    case 1:
                        notificationChannel.setSound(RingtoneManager.getDefaultUri(2), Notification.AUDIO_ATTRIBUTES_DEFAULT);
                        break;
                    case 2:
                        notificationChannel.setVibrationPattern(new long[]{0, 500});
                        break;
                    case 3:
                        notificationChannel.shouldShowLights();
                        break;
                }
                this.d.createNotificationChannel(notificationChannel);
            } catch (Exception e) {
                c.d(b, e.toString());
            }
        }
    }

    public final void b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06cbeb7b77d1aee7f30c5b782d9bb988", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06cbeb7b77d1aee7f30c5b782d9bb988");
            return;
        }
        try {
            String string = jSONObject.getString("pushmsgid");
            int optInt = jSONObject.optJSONObject("extra").optInt("channel", 0);
            String optString = jSONObject.optJSONObject("extra").optString("pushmsgid");
            if (SelectPhotoUtil.ALL_ID.equals(optString)) {
                this.d.cancelAll();
            } else if (optInt != 0) {
                this.d.cancel(optInt);
            } else if (!TextUtils.isEmpty(optString)) {
                this.d.cancel(optString.hashCode());
            }
            b(string);
        } catch (Exception e) {
            c.d(b, e.toString());
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac9d4af1f52703a8ab956639f45abe05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac9d4af1f52703a8ab956639f45abe05")).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        try {
            str2 = e.a(this.e).a("msgIds", "");
        } catch (Exception e) {
            c.d(b, e.toString());
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.addAll(Arrays.asList(str2.split(";")));
        }
        return arrayList.contains(str);
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf79f5a6060a004825328471d306a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf79f5a6060a004825328471d306a11");
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        try {
            str2 = e.a(this.e).a("msgIds", "");
        } catch (Exception e) {
            c.d(b, e.toString());
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.addAll(Arrays.asList(str2.split(";")));
        }
        while (arrayList.size() >= 100) {
            arrayList.remove(0);
        }
        arrayList.add(str);
        try {
            e.a(this.e).b("msgIds", TextUtils.join(";", arrayList));
        } catch (Exception e2) {
            c.d(b, e2.toString());
        }
    }

    public static Notification a(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef95682fdd6c6bbf75fddb5f8ad499a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Notification) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef95682fdd6c6bbf75fddb5f8ad499a1");
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, str);
        builder.setContentTitle("").setContentText("");
        if (z) {
            if (Build.VERSION.SDK_INT >= 21) {
                builder.setSmallIcon(f.e.h()).setColor(context.getResources().getColor(f.e.i()));
            } else {
                builder.setSmallIcon(f.e.g());
            }
        }
        return builder.build();
    }
}
