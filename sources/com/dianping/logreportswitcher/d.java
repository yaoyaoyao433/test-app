package com.dianping.logreportswitcher;

import android.util.Log;
import com.dianping.logreportswitcher.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62aac52a1ff36d634cee362af273866b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62aac52a1ff36d634cee362af273866b");
        } else if (c.b.a.a()) {
            Log.e(str, str2);
        }
    }

    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "743471facdccf8b95191512c3036e367", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "743471facdccf8b95191512c3036e367");
        } else if (c.b.a.a()) {
            Log.e(str, Log.getStackTraceString(th));
        }
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "306ef56501fdc24244bee62bfab56539", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "306ef56501fdc24244bee62bfab56539");
        } else {
            c.b.a.a();
        }
    }
}
