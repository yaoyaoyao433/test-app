package android.support.v7.app;

import android.app.PendingIntent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.media.app.NotificationCompat;
import android.support.v4.media.session.MediaSessionCompat;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes.dex */
public class NotificationCompat extends android.support.v4.app.NotificationCompat {

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes.dex */
    public static class Builder extends NotificationCompat.Builder {
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes.dex */
    public static class DecoratedCustomViewStyle extends NotificationCompat.DecoratedCustomViewStyle {
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes.dex */
    public static class DecoratedMediaCustomViewStyle extends NotificationCompat.DecoratedMediaCustomViewStyle {
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes.dex */
    public static class MediaStyle extends NotificationCompat.MediaStyle {
        @Override // android.support.v4.media.app.NotificationCompat.MediaStyle
        @Deprecated
        public /* bridge */ /* synthetic */ NotificationCompat.MediaStyle setCancelButtonIntent(PendingIntent pendingIntent) {
            return (MediaStyle) super.setCancelButtonIntent(pendingIntent);
        }

        @Override // android.support.v4.media.app.NotificationCompat.MediaStyle
        @Deprecated
        public /* bridge */ /* synthetic */ NotificationCompat.MediaStyle setShowCancelButton(boolean z) {
            return (MediaStyle) super.setShowCancelButton(z);
        }

        @Override // android.support.v4.media.app.NotificationCompat.MediaStyle
        @Deprecated
        public /* bridge */ /* synthetic */ NotificationCompat.MediaStyle setMediaSession(MediaSessionCompat.Token token) {
            return (MediaStyle) super.setMediaSession(token);
        }

        @Override // android.support.v4.media.app.NotificationCompat.MediaStyle
        @Deprecated
        public /* bridge */ /* synthetic */ NotificationCompat.MediaStyle setShowActionsInCompactView(int[] iArr) {
            return (MediaStyle) super.setShowActionsInCompactView(iArr);
        }
    }
}
