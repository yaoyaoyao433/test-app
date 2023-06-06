package com.bumptech.glide.request.target;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.huawei.hms.push.constant.RemoteMessageConst;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class g extends i<Bitmap> {
    private final RemoteViews a;
    private final Context b;
    private final int c;
    private final Notification d;
    private final int e;

    @Override // com.bumptech.glide.request.target.l
    public /* bridge */ /* synthetic */ void a(Object obj, com.bumptech.glide.request.animation.e eVar) {
        a((Bitmap) obj, (com.bumptech.glide.request.animation.e<? super Bitmap>) eVar);
    }

    public void a(Bitmap bitmap, com.bumptech.glide.request.animation.e<? super Bitmap> eVar) {
        this.a.setImageViewBitmap(this.e, bitmap);
        ((NotificationManager) this.b.getSystemService(RemoteMessageConst.NOTIFICATION)).notify(this.c, this.d);
    }
}
