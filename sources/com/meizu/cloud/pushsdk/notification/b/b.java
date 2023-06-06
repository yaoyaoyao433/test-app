package com.meizu.cloud.pushsdk.notification.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.c.d;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
/* loaded from: classes3.dex */
public final class b extends c {
    public b(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public final void a(Notification notification, MessageV3 messageV3, PendingIntent pendingIntent) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            String packageName = this.a.getPackageName();
            Context context = this.a;
            d.a(context);
            RemoteViews remoteViews = new RemoteViews(packageName, d.a(context, "push_expandable_big_text_notification", "layout"));
            remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.c.c.c(this.a), messageV3.getTitle());
            remoteViews.setLong(com.meizu.cloud.pushsdk.notification.c.c.e(this.a), "setTime", System.currentTimeMillis());
            a(remoteViews, messageV3);
            if (messageV3.getNotificationStyle() != null && !TextUtils.isEmpty(messageV3.getNotificationStyle().getExpandableText())) {
                remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.c.c.g(this.a), 0);
                remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.c.c.g(this.a), messageV3.getNotificationStyle().getExpandableText());
            }
            notification.bigContentView = remoteViews;
        }
    }
}
