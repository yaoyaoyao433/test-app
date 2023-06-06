package com.xiaomi.push;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
/* loaded from: classes6.dex */
public final class ei extends el {
    private Bitmap h;
    private Bitmap i;
    private int j;

    public ei(Context context, String str) {
        super(context, str);
        this.j = 16777216;
    }

    @Override // com.xiaomi.push.el
    protected final String a() {
        return "notification_banner";
    }

    @Override // com.xiaomi.push.el
    protected final String b() {
        return null;
    }

    @Override // com.xiaomi.push.el
    public final el c(Bitmap bitmap) {
        return this;
    }

    @Override // com.xiaomi.push.el, android.app.Notification.Builder
    public final /* synthetic */ Notification.Builder setLargeIcon(Bitmap bitmap) {
        return this;
    }

    @Override // com.xiaomi.push.el
    protected final boolean c() {
        if (jj.a()) {
            Resources resources = this.a.getResources();
            String packageName = this.a.getPackageName();
            return (a(this.a.getResources(), "bg", "id", this.a.getPackageName()) == 0 || a(resources, RemoteMessageConst.Notification.ICON, "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || jj.b(this.a) < 9) ? false : true;
        }
        return false;
    }

    public final ei a(Bitmap bitmap) {
        if (this.c && bitmap != null) {
            if (bitmap.getWidth() != 984 || 184 > bitmap.getHeight() || bitmap.getHeight() > 1678) {
                com.xiaomi.channel.commonutils.logger.c.a("colorful notification banner image resolution error, must belong to [984*184, 984*1678]");
            } else {
                this.h = bitmap;
            }
        }
        return this;
    }

    public final ei b(Bitmap bitmap) {
        if (this.c && bitmap != null) {
            this.i = bitmap;
        }
        return this;
    }

    private ei c(String str) {
        if (this.c && !TextUtils.isEmpty(str)) {
            try {
                this.j = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.c.a("parse banner notification image text color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.el, com.xiaomi.push.ej
    public final void d() {
        if (!this.c || this.h == null) {
            e();
            return;
        }
        super.d();
        Resources resources = this.a.getResources();
        String packageName = this.a.getPackageName();
        int a = a(resources, "bg", "id", packageName);
        if (jj.b(this.a) >= 10) {
            this.b.setImageViewBitmap(a, a(this.h, 30.0f));
        } else {
            this.b.setImageViewBitmap(a, this.h);
        }
        int a2 = a(resources, RemoteMessageConst.Notification.ICON, "id", packageName);
        if (this.i != null) {
            this.b.setImageViewBitmap(a2, this.i);
        } else {
            a(a2);
        }
        int a3 = a(resources, "title", "id", packageName);
        this.b.setTextViewText(a3, this.e);
        if (this.g != null && this.j == 16777216) {
            c(this.g.get("notification_image_text_color"));
        }
        this.b.setTextColor(a3, (this.j == 16777216 || !b(this.j)) ? -1 : -16777216);
        setCustomContentView(this.b);
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
    }
}
