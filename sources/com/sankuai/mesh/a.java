package com.sankuai.mesh;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mesh.core.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends WebViewClient {
    public static ChangeQuickRedirect a;
    private WebViewClient b;
    private WeakReference<Context> c;

    public a(WebViewClient webViewClient, Context context) {
        Object[] objArr = {webViewClient, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7882a3847200f1303a45a6e0a4954d5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7882a3847200f1303a45a6e0a4954d5b");
            return;
        }
        this.b = webViewClient;
        this.c = new WeakReference<>(context);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Context context;
        HashMap<String, String> hashMap;
        JsHost a2;
        boolean z = false;
        Object[] objArr = {webView, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad145dfd0a0c11715f5f7112de1bb580", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad145dfd0a0c11715f5f7112de1bb580");
            return;
        }
        Object[] objArr2 = {str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b547ee1e5bd9993ed561395a4223498", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b547ee1e5bd9993ed561395a4223498")).booleanValue();
        } else if (!TextUtils.isEmpty(str2) && (context = this.c.get()) != null && (hashMap = b.b.get(context)) != null) {
            int indexOf = str2.indexOf(CommonConstant.Symbol.QUESTION_MARK);
            String str3 = hashMap.get(indexOf > 0 ? str2.substring(0, indexOf) : str2);
            if (str3 != null && (a2 = b.a(context)) != null) {
                a2.loadUrl(str3);
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.b.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d81b84b0fe0ebb5f6b11df2bc78835f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d81b84b0fe0ebb5f6b11df2bc78835f");
        } else {
            this.b.onPageFinished(webView, str);
        }
    }
}
