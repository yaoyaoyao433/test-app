package com.meituan.android.neohybrid.framework.neo.js;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.dianping.titansadapter.TitansWebManager;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;

    @SuppressLint({"SetJavaScriptEnabled"})
    public static void a(WebView webView, WebSettings webSettings) {
        Object[] objArr = {webView, webSettings};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5736814c0d975eed3bd6cacca15678e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5736814c0d975eed3bd6cacca15678e7");
            return;
        }
        webSettings.setTextZoom(100);
        webSettings.setDefaultFontSize(16);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setSupportZoom(false);
        webSettings.setSaveFormData(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);
        try {
            webSettings.setAppCacheEnabled(true);
            webSettings.setAppCachePath(q.a(webView.getContext(), "mtplatform_titans", "webview", u.b).getPath());
        } catch (Throwable unused) {
        }
        webSettings.setCacheMode(-1);
        webSettings.setGeolocationEnabled(KNBWebManager.getEnvironment().geolocationEnable());
        if (Build.VERSION.SDK_INT >= 21) {
            webSettings.setMixedContentMode(0);
        }
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder(webSettings.getUserAgentString());
        if (!sb.toString().contains(TitansWebManager.ua())) {
            sb.append(StringUtil.SPACE);
            sb.append(TitansWebManager.ua());
        }
        String str = StringUtil.SPACE + a(webView.getContext().getApplicationContext());
        if (!sb.toString().contains(str)) {
            sb.append(str);
        }
        webSettings.setUserAgentString(sb.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r1.equals("com.sankuai.movie") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.framework.neo.js.h.a(android.content.Context):java.lang.String");
    }
}
