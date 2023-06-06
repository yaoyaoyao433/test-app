package com.meizu.cloud.pushsdk.notification.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
/* loaded from: classes3.dex */
public final class a extends c {
    public a(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public final void a(Notification notification, MessageV3 messageV3, PendingIntent pendingIntent) {
        Bitmap a;
        if (MinSdkChecker.isSupportNotificationBuild()) {
            RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), com.meizu.cloud.pushsdk.notification.c.c.a(this.a));
            remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.c.c.c(this.a), messageV3.getTitle());
            remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.c.c.d(this.a), messageV3.getContent());
            remoteViews.setLong(com.meizu.cloud.pushsdk.notification.c.c.e(this.a), "setTime", System.currentTimeMillis());
            a(remoteViews, messageV3);
            if (messageV3.getNotificationStyle() != null && !a()) {
                if (TextUtils.isEmpty(messageV3.getNotificationStyle().getExpandableImageUrl()) || (a = a(messageV3.getNotificationStyle().getExpandableImageUrl())) == null) {
                    remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.c.c.f(this.a), 8);
                } else {
                    remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.c.c.f(this.a), 0);
                    remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.c.c.f(this.a), a);
                }
            }
            notification.bigContentView = remoteViews;
        }
    }
}
