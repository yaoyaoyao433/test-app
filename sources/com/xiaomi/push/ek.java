package com.xiaomi.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.huawei.hms.push.constant.RemoteMessageConst;
/* loaded from: classes6.dex */
public final class ek extends el {
    private int h;
    private Bitmap i;
    private CharSequence j;
    private PendingIntent k;
    private int l;
    private int m;

    public ek(Context context, int i, String str) {
        super(context, i, str);
        this.h = 16777216;
        this.l = 16777216;
        this.m = 16777216;
    }

    private static Drawable a(int i, int i2, int i3, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setIntrinsicWidth(i2);
        shapeDrawable.setIntrinsicHeight(i3);
        return shapeDrawable;
    }

    private void a(RemoteViews remoteViews, int i, int i2, int i3, boolean z) {
        int a = a(6.0f);
        remoteViews.setViewPadding(i, a, 0, a, 0);
        int i4 = z ? -1 : -16777216;
        remoteViews.setTextColor(i2, i4);
        remoteViews.setTextColor(i3, i4);
    }

    @Override // com.xiaomi.push.el
    protected final String a() {
        return "notification_colorful";
    }

    @Override // com.xiaomi.push.el
    protected final String b() {
        return "notification_colorful_copy";
    }

    @Override // com.xiaomi.push.el
    protected final boolean c() {
        if (jj.a()) {
            Resources resources = this.a.getResources();
            String packageName = this.a.getPackageName();
            return (a(resources, RemoteMessageConst.Notification.ICON, "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || a(resources, "content", "id", packageName) == 0) ? false : true;
        }
        return false;
    }

    public final ek a(CharSequence charSequence, PendingIntent pendingIntent) {
        if (this.c) {
            super.addAction(0, charSequence, pendingIntent);
            this.j = charSequence;
            this.k = pendingIntent;
        }
        return this;
    }

    public final ek c(String str) {
        if (this.c && !TextUtils.isEmpty(str)) {
            try {
                this.l = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.c.a("parse colorful notification button bg color error");
            }
        }
        return this;
    }

    public final ek d(String str) {
        if (this.c && !TextUtils.isEmpty(str)) {
            try {
                this.h = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.c.a("parse colorful notification bg color error");
            }
        }
        return this;
    }

    public final ek a(Bitmap bitmap) {
        if (this.c && bitmap != null) {
            if (bitmap.getWidth() != 984 || bitmap.getHeight() < 177 || bitmap.getHeight() > 207) {
                com.xiaomi.channel.commonutils.logger.c.a("colorful notification bg image resolution error, must [984*177, 984*207]");
            } else {
                this.i = bitmap;
            }
        }
        return this;
    }

    private ek e(String str) {
        if (this.c && !TextUtils.isEmpty(str)) {
            try {
                this.m = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.c.a("parse colorful notification image text color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.el, com.xiaomi.push.ej
    public final void d() {
        if (!this.c) {
            e();
            return;
        }
        super.d();
        Resources resources = this.a.getResources();
        String packageName = this.a.getPackageName();
        int a = a(resources, RemoteMessageConst.Notification.ICON, "id", packageName);
        if (this.d == null) {
            a(a);
        } else {
            this.b.setImageViewBitmap(a, this.d);
        }
        int a2 = a(resources, "title", "id", packageName);
        int a3 = a(resources, "content", "id", packageName);
        this.b.setTextViewText(a2, this.e);
        this.b.setTextViewText(a3, this.f);
        if (!TextUtils.isEmpty(this.j)) {
            int a4 = a(resources, "buttonContainer", "id", packageName);
            int a5 = a(resources, "button", "id", packageName);
            int a6 = a(resources, "buttonBg", "id", packageName);
            this.b.setViewVisibility(a4, 0);
            this.b.setTextViewText(a5, this.j);
            this.b.setOnClickPendingIntent(a4, this.k);
            if (this.l != 16777216) {
                int a7 = a(70.0f);
                int a8 = a(29.0f);
                this.b.setImageViewBitmap(a6, com.xiaomi.push.service.l.a(a(this.l, a7, a8, a8 / 2.0f)));
                this.b.setTextColor(a5, b(this.l) ? -1 : -16777216);
            }
        }
        int a9 = a(resources, "bg", "id", packageName);
        int a10 = a(resources, "container", "id", packageName);
        if (this.h != 16777216) {
            if (jj.b(this.a) >= 10) {
                this.b.setImageViewBitmap(a9, com.xiaomi.push.service.l.a(a(this.h, 984, 192, 30.0f)));
            } else {
                this.b.setImageViewBitmap(a9, com.xiaomi.push.service.l.a(a(this.h, 984, 192, 0.0f)));
            }
            a(this.b, a10, a2, a3, b(this.h));
        } else if (this.i != null) {
            if (jj.b(this.a) >= 10) {
                this.b.setImageViewBitmap(a9, a(this.i, 30.0f));
            } else {
                this.b.setImageViewBitmap(a9, this.i);
            }
            if (this.g != null && this.m == 16777216) {
                e(this.g.get("notification_image_text_color"));
            }
            a(this.b, a10, a2, a3, this.m == 16777216 || !b(this.m));
        } else if (Build.VERSION.SDK_INT >= 24) {
            this.b.setViewVisibility(a, 8);
            this.b.setViewVisibility(a9, 8);
            try {
                am.a((Object) this, "setStyle", jr.a(this.a, "android.app.Notification$DecoratedCustomViewStyle").getConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.c.a("load class DecoratedCustomViewStyle failed");
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
        setCustomContentView(this.b);
    }
}
