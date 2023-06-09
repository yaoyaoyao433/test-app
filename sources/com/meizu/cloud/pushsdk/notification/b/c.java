package com.meizu.cloud.pushsdk.notification.b;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
/* loaded from: classes3.dex */
public class c extends com.meizu.cloud.pushsdk.notification.a {
    public c(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public final void a(Notification notification, MessageV3 messageV3) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), com.meizu.cloud.pushsdk.notification.c.c.a(this.a));
            remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.c.c.c(this.a), messageV3.getTitle());
            remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.c.c.d(this.a), messageV3.getContent());
            remoteViews.setLong(com.meizu.cloud.pushsdk.notification.c.c.e(this.a), "setTime", System.currentTimeMillis());
            a(remoteViews, messageV3);
            remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.c.c.f(this.a), 8);
            remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.c.c.g(this.a), 8);
            notification.contentView = remoteViews;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(RemoteViews remoteViews, MessageV3 messageV3) {
        Bitmap a;
        if (messageV3.getAppIconSetting() == null || a()) {
            remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.c.c.j(this.a), a(this.a, messageV3.getUploadDataPackageName()));
        } else if (messageV3.getAppIconSetting().isDefaultLargeIcon() || (a = a(messageV3.getAppIconSetting().getLargeIconUrl())) == null) {
            remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.c.c.j(this.a), a(this.a, messageV3.getUploadDataPackageName()));
        } else {
            remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.c.c.j(this.a), a);
        }
    }
}
