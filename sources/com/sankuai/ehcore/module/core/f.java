package com.sankuai.ehcore.module.core;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static Map<String, WeakReference<a>> b = new HashMap();

    public static a a(Context context, View view, WebView webView, com.sankuai.ehcore.tools.b bVar, int i) {
        Object[] objArr = {context, view, webView, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0e2ec2b9423c5366eda00aaaf854f51", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0e2ec2b9423c5366eda00aaaf854f51");
        }
        a aVar = new a(context, view, webView, bVar, i);
        if (context instanceof Activity) {
            b.put(com.sankuai.ehcore.util.b.a(context), new WeakReference<>(aVar));
        } else {
            b.put(com.sankuai.ehcore.util.b.a(webView), new WeakReference<>(aVar));
        }
        return aVar;
    }

    public static a a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc27dafa6af73731510103d53245778e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc27dafa6af73731510103d53245778e");
        }
        WeakReference<a> weakReference = b.get(com.sankuai.ehcore.util.b.a(activity));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static a a(WebView webView) {
        Object[] objArr = {webView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f485db544d877aaec18de6bd99f3750d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f485db544d877aaec18de6bd99f3750d");
        }
        WeakReference<a> weakReference = b.get(com.sankuai.ehcore.util.b.a(webView));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void a(Activity activity, WebView webView) {
        Object[] objArr = {activity, webView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acf762a12ca482d997a08d7fe019743a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acf762a12ca482d997a08d7fe019743a");
            return;
        }
        b.remove(com.sankuai.ehcore.util.b.a(activity));
        b.remove(com.sankuai.ehcore.util.b.a(webView));
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed4ff8d121960664300cd17a1dcf02df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed4ff8d121960664300cd17a1dcf02df");
            return;
        }
        if (aVar.d == 105) {
            b.remove(com.sankuai.ehcore.util.b.a(aVar.e));
        }
        b.remove(com.sankuai.ehcore.util.b.a(aVar.f));
    }
}
