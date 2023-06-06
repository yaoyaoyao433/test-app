package com.meizu.cloud.pushsdk.notification.a;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
/* loaded from: classes3.dex */
public class c extends com.meizu.cloud.pushsdk.notification.a {
    public c(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public final void b(Notification.Builder builder, MessageV3 messageV3) {
        AppIconSetting appIconSetting;
        Bitmap a;
        String str;
        String str2;
        if ((!MzSystemUtils.isInternational() || MzSystemUtils.isMeizuAndFlyme()) && (appIconSetting = messageV3.getAppIconSetting()) != null) {
            if (!appIconSetting.isDefaultLargeIcon()) {
                if (Thread.currentThread() != this.a.getMainLooper().getThread()) {
                    Bitmap a2 = a(appIconSetting.getLargeIconUrl());
                    if (a2 == null) {
                        builder.setLargeIcon(a(this.a, messageV3.getUploadDataPackageName()));
                        return;
                    }
                    DebugLogger.i("AbstractPushNotification", "On other Thread down load largeIcon image success");
                    builder.setLargeIcon(a2);
                    return;
                }
                return;
            }
            if (this.b != null && this.b.getLargeIcon() != 0) {
                a = com.sankuai.waimai.launcher.util.image.a.a(this.a.getResources(), this.b.getLargeIcon());
                str = "AbstractPushNotification";
                str2 = "set largeIcon by resource id";
            } else if (this.b == null || this.b.getAppLargeIcon() == null) {
                a = a(this.a, messageV3.getUploadDataPackageName());
                str = "AbstractPushNotification";
                str2 = "set largeIcon by package default large icon";
            } else {
                a = this.b.getAppLargeIcon();
                str = "AbstractPushNotification";
                str2 = "set largeIcon by bitmap provided by user setting";
            }
            DebugLogger.i(str, str2);
            builder.setLargeIcon(a);
        }
    }
}
