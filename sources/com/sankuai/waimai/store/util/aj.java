package com.sankuai.waimai.store.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.pm.ShortcutInfoCompat;
import android.support.v4.content.pm.ShortcutManagerCompat;
import android.support.v4.graphics.drawable.IconCompat;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class aj {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    private Bitmap d;

    public static aj a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af4e5678a07d57e6dc6a57bf654135dd", RobustBitConfig.DEFAULT_VALUE) ? (aj) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af4e5678a07d57e6dc6a57bf654135dd") : new aj();
    }

    public final aj a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87637609245263ab91c13b32cd955ec9", RobustBitConfig.DEFAULT_VALUE)) {
            return (aj) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87637609245263ab91c13b32cd955ec9");
        }
        if (bitmap == null) {
            this.d = null;
            return this;
        }
        int min = Math.min(Math.min(bitmap.getHeight(), bitmap.getWidth()), 120);
        try {
            this.d = com.sankuai.shangou.stone.util.b.a(bitmap, min, min);
        } catch (OutOfMemoryError e) {
            this.d = null;
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        return this;
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e0847795dbc718a6157fe72f69af582", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e0847795dbc718a6157fe72f69af582");
        } else if (context == null || TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c) || this.d == null) {
        } else {
            String b = b();
            if (TextUtils.isEmpty(b)) {
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setComponent(new ComponentName(context.getPackageName(), b));
            intent.setData(Uri.parse(this.b));
            intent.putExtra("redirectUrl", this.b);
            if (Build.VERSION.SDK_INT < 26) {
                if (ShortcutManagerCompat.isRequestPinShortcutSupported(context)) {
                    try {
                        ShortcutManagerCompat.requestPinShortcut(context, new ShortcutInfoCompat.Builder(context, this.b).setShortLabel(this.c).setIcon(IconCompat.createWithBitmap(this.d)).setIntent(intent).build(), null);
                        return;
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                        return;
                    }
                }
                return;
            }
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService("shortcut");
            if (shortcutManager == null || !shortcutManager.isRequestPinShortcutSupported()) {
                return;
            }
            try {
                shortcutManager.requestPinShortcut(new ShortcutInfo.Builder(context, this.b).setShortLabel(this.c).setIcon(Icon.createWithBitmap(this.d)).setIntent(intent).build(), null);
            } catch (Exception e2) {
                com.sankuai.waimai.store.base.log.a.a(e2);
            }
        }
    }

    private static String b() {
        return v.b ? "com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity" : "com.meituan.android.pt.homepage.activity.MainActivity";
    }
}
