package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class bi {

    /* loaded from: classes6.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes6.dex */
    public static class b {
        public String a;
        public boolean b = true;
        public boolean c;
        public String d;

        public b(String str, boolean z, boolean z2, String str2) {
            this.a = str;
            this.c = z2;
            this.d = str2;
        }
    }

    private static ActivityInfo a(PackageManager packageManager, Intent intent, Class<?> cls) {
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent, 16384)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && cls.getCanonicalName().equals(activityInfo.name)) {
                return activityInfo;
            }
        }
        return null;
    }

    private static void a(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(str);
        intent.setPackage(packageName);
        boolean z = false;
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent, 16384)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo == null || TextUtils.isEmpty(activityInfo.name) || !activityInfo.name.equals(str2)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (!z) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", str2));
        }
    }

    private static void a(ActivityInfo activityInfo, Boolean[] boolArr) {
        if (boolArr[0].booleanValue() != activityInfo.enabled) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", activityInfo.name, boolArr[0]));
        }
        if (boolArr[1].booleanValue() != activityInfo.exported) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", activityInfo.name, boolArr[1]));
        }
    }

    private static boolean a(PackageInfo packageInfo, String[] strArr) {
        boolean z;
        for (ServiceInfo serviceInfo : packageInfo.services) {
            String str = serviceInfo.name;
            if (strArr != null && str != null) {
                for (String str2 : strArr) {
                    if (TextUtils.equals(str2, str)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1 A[EDGE_INSN: B:45:0x00a1->B:31:0x00a1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(android.content.Context r8) {
        /*
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r1 = r8.getPackageName()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = com.xiaomi.push.service.ak.q
            r2.<init>(r3)
            r2.setPackage(r1)
            r3 = 1
            r4 = 0
            java.lang.String r5 = "com.xiaomi.push.service.receivers.PingReceiver"
            java.lang.Class r5 = com.xiaomi.push.jr.a(r8, r5)     // Catch: java.lang.ClassNotFoundException -> L54
            android.content.pm.ActivityInfo r2 = a(r0, r2, r5)     // Catch: java.lang.ClassNotFoundException -> L54
            boolean r5 = com.xiaomi.mipush.sdk.g.a(r8)     // Catch: java.lang.ClassNotFoundException -> L54
            r6 = 2
            if (r5 != 0) goto L47
            if (r2 == 0) goto L35
            java.lang.Boolean[] r5 = new java.lang.Boolean[r6]     // Catch: java.lang.ClassNotFoundException -> L54
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.ClassNotFoundException -> L54
            r5[r4] = r6     // Catch: java.lang.ClassNotFoundException -> L54
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.ClassNotFoundException -> L54
            r5[r3] = r6     // Catch: java.lang.ClassNotFoundException -> L54
        L31:
            a(r2, r5)     // Catch: java.lang.ClassNotFoundException -> L54
            goto L58
        L35:
            com.xiaomi.mipush.sdk.bi$a r2 = new com.xiaomi.mipush.sdk.bi$a     // Catch: java.lang.ClassNotFoundException -> L54
            java.lang.String r5 = "<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest."
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.ClassNotFoundException -> L54
            java.lang.String r7 = "com.xiaomi.push.service.receivers.PingReceiver"
            r6[r4] = r7     // Catch: java.lang.ClassNotFoundException -> L54
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch: java.lang.ClassNotFoundException -> L54
            r2.<init>(r5)     // Catch: java.lang.ClassNotFoundException -> L54
            throw r2     // Catch: java.lang.ClassNotFoundException -> L54
        L47:
            if (r2 == 0) goto L58
            java.lang.Boolean[] r5 = new java.lang.Boolean[r6]     // Catch: java.lang.ClassNotFoundException -> L54
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.ClassNotFoundException -> L54
            r5[r4] = r6     // Catch: java.lang.ClassNotFoundException -> L54
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.ClassNotFoundException -> L54
            r5[r3] = r6     // Catch: java.lang.ClassNotFoundException -> L54
            goto L31
        L54:
            r2 = move-exception
            com.xiaomi.channel.commonutils.logger.c.a(r2)
        L58:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r5 = "com.xiaomi.mipush.RECEIVE_MESSAGE"
            r2.<init>(r5)
            r2.setPackage(r1)
            r1 = 16384(0x4000, float:2.2959E-41)
            java.util.List r0 = r0.queryBroadcastReceivers(r2, r1)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L6d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La1
            java.lang.Object r2 = r0.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            if (r2 == 0) goto L9e
            java.lang.String r5 = r2.name     // Catch: java.lang.ClassNotFoundException -> L99
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.ClassNotFoundException -> L99
            if (r5 != 0) goto L9e
            java.lang.Class<com.xiaomi.mipush.sdk.PushMessageReceiver> r5 = com.xiaomi.mipush.sdk.PushMessageReceiver.class
            java.lang.String r6 = r2.name     // Catch: java.lang.ClassNotFoundException -> L99
            java.lang.Class r6 = com.xiaomi.push.jr.a(r8, r6)     // Catch: java.lang.ClassNotFoundException -> L99
            boolean r5 = r5.isAssignableFrom(r6)     // Catch: java.lang.ClassNotFoundException -> L99
            if (r5 == 0) goto L9e
            boolean r2 = r2.enabled     // Catch: java.lang.ClassNotFoundException -> L99
            if (r2 == 0) goto L9e
            r1 = 1
            goto L9f
        L99:
            r2 = move-exception
            com.xiaomi.channel.commonutils.logger.c.a(r2)
            goto L6d
        L9e:
            r1 = 0
        L9f:
            if (r1 == 0) goto L6d
        La1:
            if (r1 == 0) goto Lc5
            boolean r0 = com.xiaomi.mipush.sdk.g.p(r8)
            if (r0 == 0) goto Lb7
            java.lang.String r0 = "com.huawei.android.push.intent.RECEIVE"
            java.lang.String r1 = "com.xiaomi.assemble.control.HmsPushReceiver"
            a(r8, r0, r1)
            java.lang.String r0 = "com.huawei.intent.action.PUSH"
            java.lang.String r1 = "com.huawei.hms.support.api.push.PushEventReceiver"
            a(r8, r0, r1)
        Lb7:
            boolean r0 = com.xiaomi.mipush.sdk.g.s(r8)
            if (r0 == 0) goto Lc4
            java.lang.String r0 = "com.vivo.pushclient.action.RECEIVE"
            java.lang.String r1 = "com.xiaomi.assemble.control.FTOSPushMessageReceiver"
            a(r8, r0, r1)
        Lc4:
            return
        Lc5:
            com.xiaomi.mipush.sdk.bi$a r8 = new com.xiaomi.mipush.sdk.bi$a
            java.lang.String r0 = "Receiver: none of the subclasses of PushMessageReceiver is enabled or defined."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.bi.a(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(PushMessageHandler.class.getCanonicalName(), new b(PushMessageHandler.class.getCanonicalName(), true, true, ""));
        hashMap2.put(MessageHandleService.class.getCanonicalName(), new b(MessageHandleService.class.getCanonicalName(), true, false, ""));
        if (!g.a(context) || a(packageInfo, new String[]{"com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"})) {
            hashMap2.put("com.xiaomi.push.service.XMJobService", new b("com.xiaomi.push.service.XMJobService", true, false, "android.permission.BIND_JOB_SERVICE"));
            hashMap2.put("com.xiaomi.push.service.XMPushService", new b("com.xiaomi.push.service.XMPushService", true, false, ""));
        }
        if (g.q(context)) {
            hashMap2.put("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", new b("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", true, false, ""));
            hashMap2.put("com.xiaomi.assemble.control.MiFirebaseMessagingService", new b("com.xiaomi.assemble.control.MiFirebaseMessagingService", true, false, ""));
        }
        if (g.r(context)) {
            hashMap2.put("com.xiaomi.assemble.control.COSPushMessageService", new b("com.xiaomi.assemble.control.COSPushMessageService", true, true, "com.coloros.mcs.permission.SEND_MCS_MESSAGE"));
        }
        if (packageInfo.services != null) {
            for (ServiceInfo serviceInfo : packageInfo.services) {
                if (!TextUtils.isEmpty(serviceInfo.name) && hashMap2.containsKey(serviceInfo.name)) {
                    b bVar = (b) hashMap2.remove(serviceInfo.name);
                    boolean z = bVar.b;
                    boolean z2 = bVar.c;
                    String str = bVar.d;
                    if (z != serviceInfo.enabled) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", serviceInfo.name, Boolean.valueOf(z)));
                    }
                    if (z2 != serviceInfo.exported) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", serviceInfo.name, Boolean.valueOf(z2)));
                    }
                    if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, serviceInfo.permission)) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong permission attribute, which should be android:permission=\"%2$s\".", serviceInfo.name, str));
                    }
                    hashMap.put(serviceInfo.name, serviceInfo.processName);
                    if (hashMap2.isEmpty()) {
                        break;
                    }
                }
            }
        }
        if (!hashMap2.isEmpty()) {
            throw new a(String.format("<service android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", hashMap2.keySet().iterator().next()));
        }
        if (!TextUtils.equals((CharSequence) hashMap.get(PushMessageHandler.class.getCanonicalName()), (CharSequence) hashMap.get(MessageHandleService.class.getCanonicalName()))) {
            throw new a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", PushMessageHandler.class.getCanonicalName(), MessageHandleService.class.getCanonicalName()));
        }
        if (hashMap.containsKey("com.xiaomi.push.service.XMJobService") && hashMap.containsKey("com.xiaomi.push.service.XMPushService") && !TextUtils.equals((CharSequence) hashMap.get("com.xiaomi.push.service.XMJobService"), (CharSequence) hashMap.get("com.xiaomi.push.service.XMPushService"))) {
            throw new a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", "com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"));
        }
    }
}
