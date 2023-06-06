package com.meizu.cloud.pushsdk.handler.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.a.c.e;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public abstract class a<T> implements com.meizu.cloud.pushsdk.handler.c {
    protected com.meizu.cloud.pushsdk.handler.a a;
    public Context b;
    private SparseArray<String> c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        this.b = context.getApplicationContext();
        this.a = aVar;
        this.c = new SparseArray<>();
        this.c.put(2, "MESSAGE_TYPE_PUSH_SERVICE_V2");
        this.c.put(4, "MESSAGE_TYPE_PUSH_SERVICE_V3");
        this.c.put(16, "MESSAGE_TYPE_REGISTER");
        this.c.put(32, "MESSAGE_TYPE_UNREGISTER");
        this.c.put(8, "MESSAGE_TYPE_THROUGH");
        this.c.put(64, "MESSAGE_TYPE_NOTIFICATION_CLICK");
        this.c.put(128, "MESSAGE_TYPE_NOTIFICATION_DELETE");
        this.c.put(256, "MESSAGE_TYPE_PUSH_SWITCH_STATUS");
        this.c.put(512, "MESSAGE_TYPE_PUSH_REGISTER_STATUS");
        this.c.put(2048, "MESSAGE_TYPE_PUSH_SUBTAGS_STATUS");
        this.c.put(1024, "MESSAGE_TYPE_PUSH_UNREGISTER_STATUS");
        this.c.put(4096, "MESSAGE_TYPE_PUSH_SUBALIAS_STATUS");
        this.c.put(8192, "MESSAGE_TYPE_SCHEDULE_NOTIFICATION");
        this.c.put(16384, "MESSAGE_TYPE_RECEIVE_NOTIFY_MESSAGE");
        this.c.put(32768, "MESSAGE_TYPE_NOTIFICATION_STATE");
        this.c.put(65536, "MESSAGE_TYPE_UPLOAD_FILE_LOG");
        this.c.put(131072, "MESSAGE_TYPE_NOTIFICATION_ARRIVED");
        this.c.put(262144, "MESSAGE_TYPE_NOTIFICATION_WITHDRAW");
        this.c.put(524288, "MESSAGE_TYPE_BRIGHT_NOTIFICATION");
        this.c.put(1048576, "MESSAGE_TYPE_NOTIFICATION_CLOSE");
    }

    private static boolean a(String str, MessageV3 messageV3, String str2) {
        if (TextUtils.isEmpty(str)) {
            DebugLogger.e("AbstractMessageHandler", "security check fail, public key is null");
            return false;
        }
        String a = com.meizu.cloud.pushsdk.util.c.a(str, str2);
        DebugLogger.i("AbstractMessageHandler", "decrypt sign: " + a);
        boolean a2 = com.meizu.cloud.pushsdk.handler.a.c.e.a(a, messageV3);
        DebugLogger.i("AbstractMessageHandler", "check public key result: " + a2);
        return a2;
    }

    public static String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("launcher");
            return (!jSONObject.has("pkg") || TextUtils.isEmpty(jSONObject.getString("pkg"))) ? "" : jSONObject.getString("pkg");
        } catch (Exception unused) {
            DebugLogger.e("AbstractMessageHandler", "parse desk top json error");
            return "";
        }
    }

    private String c() {
        String str = null;
        for (int i = 0; i < 2; i++) {
            str = a();
            if (!TextUtils.isEmpty(str)) {
                break;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String d(Intent intent) {
        String a = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.EXTRA_APP_PUSH_TASK_TIMES_TAMP);
        DebugLogger.i("AbstractMessageHandler", "receive push timestamp from pushservice " + a);
        return TextUtils.isEmpty(a) ? String.valueOf(System.currentTimeMillis() / 1000) : a;
    }

    protected com.meizu.cloud.pushsdk.notification.c a(T t) {
        return null;
    }

    protected abstract T a(Intent intent);

    protected abstract void a(T t, com.meizu.cloud.pushsdk.notification.c cVar);

    protected boolean a(T t, String str) {
        return true;
    }

    protected void b(T t) {
    }

    protected void c(T t) {
    }

    protected int d(T t) {
        return 0;
    }

    protected void e(T t) {
    }

    protected void f(T t) {
    }

    protected boolean g(T t) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.meizu.cloud.pushsdk.handler.MessageV3 r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = com.meizu.cloud.pushsdk.handler.a.c.e.a(r7)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.String r7 = "AbstractMessageHandler"
            java.lang.String r8 = "message does not contain signature field"
            com.meizu.cloud.pushinternal.DebugLogger.i(r7, r8)
            return r2
        L14:
            android.content.Context r1 = r6.b
            java.lang.String r3 = r7.getPackageName()
            java.lang.String r1 = com.meizu.cloud.pushsdk.util.b.i(r1, r3)
            java.lang.String r3 = "AbstractMessageHandler"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "local public key is: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.meizu.cloud.pushinternal.DebugLogger.i(r3, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 1
            if (r3 != 0) goto L43
            java.lang.String r8 = "AbstractMessageHandler"
            java.lang.String r3 = "sa, public key not empty"
        L3e:
            com.meizu.cloud.pushinternal.DebugLogger.i(r8, r3)
            r8 = 0
            goto L6e
        L43:
            java.lang.String r3 = "private"
            boolean r8 = r3.equals(r8)
            if (r8 != 0) goto L52
            java.lang.String r8 = "AbstractMessageHandler"
            java.lang.String r3 = "sa, message not click method"
            goto L3e
        L52:
            android.content.Context r8 = r6.b
            java.lang.String r3 = r7.getPackageName()
            boolean r8 = com.meizu.cloud.pushsdk.util.b.j(r8, r3)
            if (r8 != 0) goto L64
            java.lang.String r8 = "AbstractMessageHandler"
            java.lang.String r3 = "sa, not first request"
            goto L3e
        L64:
            android.content.Context r8 = r6.b
            java.lang.String r3 = r7.getPackageName()
            com.meizu.cloud.pushsdk.util.b.c(r8, r3, r2)
            r8 = 1
        L6e:
            if (r8 == 0) goto L79
            java.lang.String r7 = "AbstractMessageHandler"
            java.lang.String r8 = "message special approval no check"
        L75:
            com.meizu.cloud.pushinternal.DebugLogger.i(r7, r8)
            return r4
        L79:
            boolean r8 = a(r1, r7, r0)
            if (r8 == 0) goto L85
            java.lang.String r7 = "AbstractMessageHandler"
            java.lang.String r8 = "security check passed"
            goto L75
        L85:
            java.lang.String r8 = r6.c()
            java.lang.String r1 = "AbstractMessageHandler"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "network request public key: "
            r3.<init>(r5)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.meizu.cloud.pushinternal.DebugLogger.i(r1, r3)
            boolean r0 = a(r8, r7, r0)
            if (r0 == 0) goto Lb5
            android.content.Context r0 = r6.b
            java.lang.String r7 = r7.getPackageName()
            com.meizu.cloud.pushsdk.util.b.e(r0, r7, r8)
            java.lang.String r7 = "AbstractMessageHandler"
            java.lang.String r8 = "security check passed"
            com.meizu.cloud.pushinternal.DebugLogger.i(r7, r8)
            return r4
        Lb5:
            java.lang.String r7 = "AbstractMessageHandler"
            java.lang.String r8 = "security check fail"
            com.meizu.cloud.pushinternal.DebugLogger.e(r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.handler.a.a.a(com.meizu.cloud.pushsdk.handler.MessageV3, java.lang.String):boolean");
    }

    public static String a() {
        return new e.a((String) com.meizu.cloud.pushsdk.c.a.a(PushConstants.GET_PUBLIC_KEY).a().a().a).c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(Intent intent) {
        String a = intent != null ? com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY) : null;
        if (TextUtils.isEmpty(a)) {
            String a2 = com.meizu.cloud.pushsdk.b.c.a(this.b);
            DebugLogger.e("AbstractMessageHandler", "force get deviceId " + a2);
            return a2;
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(Intent intent) {
        String a = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.EXTRA_APP_PUSH_SERVICE_DEFAULT_PACKAGE_NAME);
        return TextUtils.isEmpty(a) ? this.b.getPackageName() : a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean e(Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z = false;
        if (f(intent)) {
            DebugLogger.i("AbstractMessageHandler", "current message Type " + this.c.get(b()));
            T a = a(intent);
            if (!a((a<T>) a, com.sankuai.waimai.platform.utils.f.a(intent, "method"))) {
                DebugLogger.e("AbstractMessageHandler", "invalid push message");
                return false;
            }
            DebugLogger.i("AbstractMessageHandler", "current Handler message " + a);
            b((a<T>) a);
            boolean z2 = true;
            switch (d((a<T>) a)) {
                case 0:
                    str = "AbstractMessageHandler";
                    str2 = "schedule send message off, send message directly";
                    DebugLogger.i(str, str2);
                    z = true;
                    break;
                case 1:
                    str3 = "AbstractMessageHandler";
                    str4 = "expire notification, don't show message";
                    DebugLogger.i(str3, str4);
                    z2 = false;
                    break;
                case 2:
                    str = "AbstractMessageHandler";
                    str2 = "notification on time ,show message";
                    DebugLogger.i(str, str2);
                    z = true;
                    break;
                case 3:
                    DebugLogger.i("AbstractMessageHandler", "schedule notification");
                    e((a<T>) a);
                    break;
                case 4:
                    DebugLogger.i("AbstractMessageHandler", "bright notification");
                    f((a<T>) a);
                    break;
                case 5:
                    str3 = "AbstractMessageHandler";
                    str4 = "ad cannot show message";
                    DebugLogger.i(str3, str4);
                    z2 = false;
                    break;
                default:
                    z2 = false;
                    break;
            }
            boolean g = g(a);
            DebugLogger.i("AbstractMessageHandler", "can send message " + g);
            if (z2 && z && g) {
                a((a<T>) a, a((a<T>) a));
                c((a<T>) a);
                DebugLogger.i("AbstractMessageHandler", "send message end ");
            }
            return z2;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(String str) {
        try {
            return this.b.getPackageName().equals(new JSONObject(str).getString("appId"));
        } catch (Exception unused) {
            DebugLogger.e("AbstractMessageHandler", "parse notification error");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(int i, String str) {
        boolean z = true;
        if (i == 0) {
            z = com.meizu.cloud.pushsdk.util.b.e(this.b, str);
        } else if (i == 1) {
            z = com.meizu.cloud.pushsdk.util.b.g(this.b, str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i == 0 ? " canNotificationMessage " : " canThroughMessage ");
        sb.append(z);
        DebugLogger.i("AbstractMessageHandler", sb.toString());
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(MessageV3 messageV3) {
        if (messageV3 == null || messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
                this.a.b(this.b, MzPushMessage.fromMessageV3(messageV3));
            } else if (MzSystemUtils.isRunningProcess(this.b, messageV3.getUploadDataPackageName())) {
                DebugLogger.i("AbstractMessageHandler", "send notification arrived message to " + messageV3.getUploadDataPackageName());
                Intent intent = new Intent();
                intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
                intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_ARRIVED);
                MzSystemUtils.sendMessageFromBroadcast(this.b, intent, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getUploadDataPackageName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(MessageV3 messageV3) {
        if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
            c(messageV3);
            return;
        }
        com.meizu.cloud.pushsdk.notification.model.a a = com.meizu.cloud.pushsdk.notification.model.a.a(messageV3);
        if (a != null) {
            DebugLogger.e("AbstractMessageHandler", "delete notifyId " + a.a + " notifyKey " + a.b);
            if (!TextUtils.isEmpty(a.b)) {
                com.meizu.cloud.pushsdk.platform.a.b a2 = com.meizu.cloud.pushsdk.platform.a.b.a(this.b);
                String uploadDataPackageName = messageV3.getUploadDataPackageName();
                String str = a.b;
                com.meizu.cloud.pushsdk.platform.b.a aVar = new com.meizu.cloud.pushsdk.platform.b.a(a2.b, a2.a, a2.h);
                aVar.b = 2;
                aVar.c = str;
                aVar.c(uploadDataPackageName);
                aVar.h();
                return;
            }
            com.meizu.cloud.pushsdk.platform.a.b.a(this.b).a(messageV3.getUploadDataPackageName(), a.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.notification.model.a a = com.meizu.cloud.pushsdk.notification.model.a.a(messageV3);
        if (a != null) {
            DebugLogger.i("AbstractMessageHandler", "delete notifyKey " + a.b + " notifyId " + a.a);
            if (!TextUtils.isEmpty(a.b)) {
                com.meizu.cloud.pushsdk.notification.c.b.a(this.b, messageV3.getUploadDataPackageName(), a.b);
            } else {
                com.meizu.cloud.pushsdk.notification.c.b.c(this.b, messageV3.getUploadDataPackageName(), a.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Context context, MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.handler.a.a.a aVar;
        com.meizu.cloud.pushsdk.notification.model.a a;
        if (messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage()) || (aVar = com.meizu.cloud.pushsdk.b.a(context).c) == null || (a = com.meizu.cloud.pushsdk.notification.model.a.a(messageV3)) == null) {
            return;
        }
        aVar.a(a.a);
    }
}
