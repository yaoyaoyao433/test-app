package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.support.v4.text.TextUtilsCompat;
import com.meituan.android.cipstorage.q;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private static a a;
    private static q b;

    private a() {
    }

    public static a a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public final boolean b(Context context) {
        return a(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    private static boolean b() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static boolean a(Context context, String str, boolean z) {
        return c(context).b(str, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, String str, boolean z) {
        c(context).a(str, z);
    }

    private static q c(Context context) {
        if (b == null) {
            b = q.a(context.getApplicationContext(), "com.facebook.react.modules.i18nmanager.I18nUtil", 1);
        }
        return b;
    }

    public final boolean a(Context context) {
        if (a(context, "RCTI18nUtil_forceRTL", false)) {
            return true;
        }
        return a(context, "RCTI18nUtil_allowRTL", true) && b();
    }
}
