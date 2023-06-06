package com.sankuai.meituan.android.knb.util;

import android.content.Context;
import com.meituan.crashreporter.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.BuildConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CrashUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0562704428395f84d0180817d9bb2a4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0562704428395f84d0180817d9bb2a4f");
            return;
        }
        c.a("web").a();
        c.a("web").a(BuildConfig.VERSION_NAME);
        WebViewCacheHandler.registerCrashInfoProvider(context);
    }

    public static void recordWebUserAgent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "007a31b7cd03822dea5aeec4538f3f6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "007a31b7cd03822dea5aeec4538f3f6e");
        } else {
            recordExtra("WebView.Version", str);
        }
    }

    public static void pushPage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6d3f3f528915d0d5f8aa26159da414dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6d3f3f528915d0d5f8aa26159da414dc");
        } else {
            c.a("web").c(str);
        }
    }

    public static void recordExtra(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9e9084e40767f800984c27172542d02d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9e9084e40767f800984c27172542d02d");
        } else {
            c.a("web").a(str, str2);
        }
    }
}
