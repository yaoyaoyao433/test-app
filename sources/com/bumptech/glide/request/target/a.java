package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a extends i<Bitmap> {
    private final int[] a;
    private final ComponentName b;
    private final RemoteViews c;
    private final Context d;
    private final int e;

    @Override // com.bumptech.glide.request.target.l
    public /* bridge */ /* synthetic */ void a(Object obj, com.bumptech.glide.request.animation.e eVar) {
        a((Bitmap) obj, (com.bumptech.glide.request.animation.e<? super Bitmap>) eVar);
    }

    public void a(Bitmap bitmap, com.bumptech.glide.request.animation.e<? super Bitmap> eVar) {
        this.c.setImageViewBitmap(this.e, bitmap);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.d);
        if (this.b != null) {
            appWidgetManager.updateAppWidget(this.b, this.c);
        } else {
            appWidgetManager.updateAppWidget(this.a, this.c);
        }
    }
}
