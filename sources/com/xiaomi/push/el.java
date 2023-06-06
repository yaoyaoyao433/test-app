package com.xiaomi.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public abstract class el extends ej {
    RemoteViews b;
    boolean c;
    protected Bitmap d;
    protected CharSequence e;
    protected CharSequence f;
    protected Map<String, String> g;
    private int h;
    private String i;
    private boolean j;
    private ArrayList<Notification.Action> k;
    private int l;

    public el(Context context, String str) {
        this(context, 0, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Bitmap a(Bitmap bitmap, float f) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawRoundRect(new RectF(rect), 30.0f, 30.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public el addAction(Notification.Action action) {
        if (action != null) {
            this.k.add(action);
        }
        this.l++;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean b(int i) {
        return ((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d) < 192.0d;
    }

    private boolean f() {
        return (TextUtils.isEmpty(b()) || TextUtils.isEmpty(this.i)) ? false : true;
    }

    @Override // com.xiaomi.push.ej
    public final ej a(Map<String, String> map) {
        this.g = map;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public final el addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        addAction(new Notification.Action(i, charSequence, pendingIntent));
        return this;
    }

    protected abstract String a();

    protected abstract String b();

    @Override // android.app.Notification.Builder
    /* renamed from: c */
    public el setLargeIcon(Bitmap bitmap) {
        this.d = bitmap;
        return this;
    }

    protected abstract boolean c();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        super.setContentTitle(this.e);
        super.setContentText(this.f);
        if (this.d != null) {
            super.setLargeIcon(this.d);
        }
    }

    public el(Context context, int i, String str) {
        super(context);
        this.k = new ArrayList<>();
        boolean z = false;
        this.l = 0;
        this.i = str;
        this.h = i;
        Resources resources = this.a.getResources();
        if (f() && g()) {
            z = true;
        }
        this.j = z;
        int a = a(resources, this.j ? b() : a(), "layout", this.a.getPackageName());
        if (a == 0) {
            com.xiaomi.channel.commonutils.logger.c.a("create RemoteViews failed, no such layout resource was found");
            return;
        }
        this.b = new RemoteViews(this.a.getPackageName(), a);
        this.c = c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.push.ej
    public void d() {
        super.d();
        Bundle bundle = new Bundle();
        boolean z = false;
        if (f()) {
            bundle.putBoolean("mipush.customCopyLayout", this.j);
        } else {
            bundle.putBoolean("mipush.customCopyLayout", false);
        }
        bundle.putBoolean("miui.customHeight", false);
        bundle.putBoolean("mipush.customNotification", true);
        bundle.putInt("mipush.customLargeIconId", a("large_icon"));
        if (this.k.size() > 0) {
            Notification.Action[] actionArr = new Notification.Action[this.k.size()];
            this.k.toArray(actionArr);
            bundle.putParcelableArray("mipush.customActions", actionArr);
        }
        if (this.g != null && Boolean.parseBoolean(this.g.get("custom_builder_set_title"))) {
            z = true;
        }
        if (z || !com.xiaomi.push.service.x.a(this.a.getContentResolver())) {
            super.setContentTitle(this.e);
            super.setContentText(this.f);
        } else {
            bundle.putCharSequence("mipush.customTitle", this.e);
            bundle.putCharSequence("mipush.customContent", this.f);
        }
        addExtras(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i) {
        Bitmap a = com.xiaomi.push.service.l.a(fd.g(this.a, this.i));
        if (a != null) {
            this.b.setImageViewBitmap(i, a);
            return;
        }
        int f = fd.f(this.a, this.i);
        if (f != 0) {
            this.b.setImageViewResource(i, f);
        }
    }

    private boolean g() {
        List<StatusBarNotification> c;
        if (Build.VERSION.SDK_INT >= 20 && (c = com.xiaomi.push.service.w.a(this.a, this.i).c()) != null && !c.isEmpty()) {
            Iterator<StatusBarNotification> it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                StatusBarNotification next = it.next();
                if (next.getId() == this.h) {
                    Notification notification = next.getNotification();
                    if (notification != null && !notification.extras.getBoolean("mipush.customCopyLayout", true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int a(float f) {
        return (int) ((f * this.a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.app.Notification.Builder
    public /* synthetic */ Notification.Builder setContentText(CharSequence charSequence) {
        this.f = charSequence;
        return this;
    }

    @Override // android.app.Notification.Builder
    public /* synthetic */ Notification.Builder setContentTitle(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }
}
