package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i implements BaseNotifyLayoutAdapter {
    private Resources a;
    private String b;

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final void init(Context context) {
        this.b = context.getPackageName();
        this.a = context.getResources();
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getNotificationLayout() {
        return this.a.getIdentifier("push_notify", "layout", this.b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getSuitIconId() {
        Resources resources;
        String str;
        if (j.g) {
            resources = this.a;
            str = "notify_icon_rom30";
        } else if (j.f) {
            resources = this.a;
            str = "notify_icon_rom20";
        } else {
            resources = this.a;
            str = "notify_icon";
        }
        return resources.getIdentifier(str, "id", this.b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getTitleColor() {
        int i;
        try {
            i = ((Integer) z.a("com.android.internal.R$color", "vivo_notification_title_text_color")).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        if (i > 0) {
            return this.a.getColor(i);
        }
        if (j.g) {
            return -1;
        }
        if (j.f) {
            if (j.g) {
                return Color.parseColor("#ff999999");
            }
            return -1;
        }
        return -16777216;
    }
}
