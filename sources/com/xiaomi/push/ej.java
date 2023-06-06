package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.Map;
@SuppressLint({"NewApi"})
/* loaded from: classes6.dex */
public class ej extends Notification.Builder {
    Context a;

    public ej(Context context) {
        super(context);
        this.a = context;
    }

    public static int a(Resources resources, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return resources.getIdentifier(str, str2, str3);
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public final ej addExtras(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 20) {
            super.addExtras(bundle);
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public final ej setCustomContentView(RemoteViews remoteViews) {
        if (Build.VERSION.SDK_INT >= 24) {
            super.setCustomContentView(remoteViews);
        } else {
            super.setContent(remoteViews);
        }
        return this;
    }

    public ej a(Map<String, String> map) {
        return this;
    }

    public final ej b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                am.a((Object) this, "setColor", Integer.valueOf(Color.parseColor(str)));
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.d("fail to set color. " + e);
            }
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    public Notification build() {
        d();
        return super.build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
    }

    public final int a(String str) {
        return a(this.a.getResources(), str, "id", this.a.getPackageName());
    }
}
