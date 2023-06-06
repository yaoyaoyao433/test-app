package com.meizu.cloud.pushsdk.notification.a;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.c.a.b;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MessageV4;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.c.e;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.io.File;
import java.io.FileFilter;
/* loaded from: classes3.dex */
public final class d extends c {
    public d(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public final void a(Notification.Builder builder, MessageV3 messageV3) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
            bigTextStyle.setBigContentTitle(messageV3.getTitle());
            bigTextStyle.bigText(messageV3.getNotificationStyle().getExpandableText());
            builder.setStyle(bigTextStyle);
        }
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public final void a(Notification notification, MessageV3 messageV3) {
        super.a(notification, messageV3);
        MessageV4 parse = MessageV4.parse(messageV3);
        if (parse.getActVideoSetting() == null || (parse.getActVideoSetting().isWifiDisplay() && !com.meizu.cloud.pushsdk.util.a.a(this.a))) {
            DebugLogger.e("AbstractPushNotification", "only wifi can download act");
            return;
        }
        final String str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/pushSdkAct/" + messageV3.getUploadDataPackageName();
        String valueOf = String.valueOf(System.currentTimeMillis());
        String actUrl = parse.getActVideoSetting().getActUrl();
        if (!TextUtils.isEmpty(actUrl) && com.meizu.cloud.pushsdk.c.e.c.a(new com.meizu.cloud.pushsdk.c.a.b(new b.a(actUrl, str, valueOf))).a()) {
            DebugLogger.i("AbstractPushNotification", "down load " + actUrl + " success");
            String str2 = str + File.separator + "ACT-" + valueOf;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append(valueOf);
            boolean z = new e(sb.toString(), str2).a() > 0;
            DebugLogger.i("AbstractPushNotification", "zip file " + z);
            if (z) {
                Bundle bundle = new Bundle();
                bundle.putString("path", str2);
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("big", bundle);
                if (MinSdkChecker.isSupportVideoNotification()) {
                    notification.extras.putBundle("flyme.active", bundle2);
                }
            }
        }
        com.meizu.cloud.pushsdk.d.b.a.b.a(new Runnable() { // from class: com.meizu.cloud.pushsdk.notification.a.d.1
            @Override // java.lang.Runnable
            public final void run() {
                String str3 = str;
                final String valueOf2 = String.valueOf(System.currentTimeMillis() - 86400000);
                File file = new File(str3);
                File[] fileArr = new File[0];
                if (file.isDirectory()) {
                    fileArr = file.listFiles(new FileFilter() { // from class: com.meizu.cloud.pushsdk.notification.c.a.1
                        @Override // java.io.FileFilter
                        public final boolean accept(File file2) {
                            try {
                                return Long.valueOf(valueOf2).longValue() > Long.valueOf(file2.getName().split(CommonConstant.Symbol.MINUS)[1]).longValue();
                            } catch (Exception e) {
                                DebugLogger.e("FileUtil", "filters file error " + e.getMessage());
                                return true;
                            }
                        }
                    });
                }
                for (File file2 : fileArr) {
                    com.meizu.cloud.pushsdk.notification.c.a.a(file2.getPath());
                    DebugLogger.i("AbstractPushNotification", "Delete file directory " + file2.getName() + "\n");
                }
            }
        });
    }
}
