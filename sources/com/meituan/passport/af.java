package com.meituan.passport;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class af {
    public static ChangeQuickRedirect a;

    public static void a(final Context context, @NonNull final String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cb3d501f0d817d080cb5bc2ee5a98ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cb3d501f0d817d080cb5bc2ee5a98ac");
        } else {
            com.sankuai.android.jarvis.c.a("notifyLoginResultCancel", new Runnable() { // from class: com.meituan.passport.af.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14a693d78b35203c1898de8b0b735015", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14a693d78b35203c1898de8b0b735015");
                        return;
                    }
                    try {
                        Uri a2 = PassportContentProvider.a(str, 8);
                        if (context != null) {
                            com.meituan.android.privacy.interfaces.t createContentResolver = Privacy.createContentResolver(context, "com.meituan.passport");
                            if (createContentResolver != null) {
                                createContentResolver.a(a2, (ContentValues) null, (String) null, (String[]) null);
                            }
                            com.meituan.passport.utils.n.a("PassportContentProviderUtils.notifyLoginResultCancel.run", "update login result cancel", null);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }).start();
        }
    }

    public static void b(final Context context, @NonNull final String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "244e5b23db238d75ef0c26de4014508c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "244e5b23db238d75ef0c26de4014508c");
        } else {
            com.sankuai.android.jarvis.c.a("notifyLoginResultOk", new Runnable() { // from class: com.meituan.passport.af.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58fb257be63e441e16383edd5116bd00", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58fb257be63e441e16383edd5116bd00");
                        return;
                    }
                    try {
                        Uri a2 = PassportContentProvider.a(str, 9);
                        if (context != null) {
                            com.meituan.android.privacy.interfaces.t createContentResolver = Privacy.createContentResolver(context, "com.meituan.passport");
                            if (createContentResolver != null) {
                                createContentResolver.a(a2, (ContentValues) null, (String) null, (String[]) null);
                            }
                            com.meituan.passport.utils.n.a("PassportContentProviderUtils.notifyLoginResultOk.run", "update login result ok", null);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }).start();
        }
    }
}
