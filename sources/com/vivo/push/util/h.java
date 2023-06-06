package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.dianping.picasso.PicassoUtils;
import com.vivo.push.model.InsideNotificationItem;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h implements BaseNotifyDataAdapter {
    private static int e;
    private static int f;
    private Resources a;
    private String b;
    private String c;
    private String d;

    private static boolean a(int i) {
        return (i == -1 || i == 0) ? false : true;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final void init(Context context) {
        this.b = context.getPackageName();
        this.a = context.getResources();
        this.c = j.a();
        this.d = Build.VERSION.RELEASE;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultNotifyIcon() {
        if (a(e)) {
            return e;
        }
        String str = this.d;
        int a = !a(str) ? -1 : a(str, "_notifyicon");
        e = a;
        if (a(a)) {
            return e;
        }
        for (String str2 = this.c; !TextUtils.isEmpty(str2); str2 = str2.substring(0, str2.length() - 1)) {
            Resources resources = this.a;
            int identifier = resources.getIdentifier("vivo_push_rom" + str2 + "_notifyicon", PicassoUtils.DEF_TYPE, this.b);
            if (identifier > 0) {
                return identifier;
            }
        }
        return this.a.getIdentifier("vivo_push_notifyicon", PicassoUtils.DEF_TYPE, this.b);
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultSmallIconId() {
        if (a(f)) {
            return f;
        }
        String str = this.d;
        int a = !a(str) ? -1 : a(str, "_icon");
        f = a;
        if (a(a)) {
            return f;
        }
        for (String str2 = this.c; !TextUtils.isEmpty(str2); str2 = str2.substring(0, str2.length() - 1)) {
            Resources resources = this.a;
            int identifier = resources.getIdentifier("vivo_push_rom" + str2 + "_icon", PicassoUtils.DEF_TYPE, this.b);
            if (identifier > 0) {
                return identifier;
            }
        }
        return this.a.getIdentifier("vivo_push_icon", PicassoUtils.DEF_TYPE, this.b);
    }

    private static boolean a(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            p.d("DefaultNotifyDataAdapter", "systemVersion is not suit ");
            return false;
        }
        return true;
    }

    private int a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1;
        }
        String[] split = str.split("\\.");
        if (split != null && split.length > 0) {
            str = split[0];
        }
        try {
            for (int parseInt = Integer.parseInt(str); parseInt > 0; parseInt--) {
                String str3 = "vivo_push_ard" + parseInt + str2;
                p.c("DefaultNotifyDataAdapter", "get notify icon : ".concat(String.valueOf(str3)));
                int identifier = this.a.getIdentifier(str3, PicassoUtils.DEF_TYPE, this.b);
                if (identifier > 0) {
                    p.c("DefaultNotifyDataAdapter", "find notify icon : ".concat(String.valueOf(str3)));
                    return identifier;
                }
            }
        } catch (Exception e2) {
            p.a("DefaultNotifyDataAdapter", e2);
        }
        return -1;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getNotifyMode(InsideNotificationItem insideNotificationItem) {
        return Build.VERSION.SDK_INT >= 21 ? 2 : 1;
    }
}
