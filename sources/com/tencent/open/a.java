package com.tencent.open;

import android.net.Uri;
import android.webkit.WebView;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.tencent.open.log.SLog;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    protected HashMap<String, b> a = new HashMap<>();

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.open.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1488a {
        protected WeakReference<WebView> a;
        protected long b;
        protected String c;

        public C1488a(WebView webView, long j, String str) {
            this.a = new WeakReference<>(webView);
            this.b = j;
            this.c = str;
        }

        public void a(Object obj) {
            WebView webView = this.a.get();
            if (webView == null) {
                return;
            }
            String str = "'undefined'";
            if (obj instanceof String) {
                String replace = ((String) obj).replace(CommonConstant.Symbol.SLASH_RIGHT, "\\\\").replace(CommonConstant.Symbol.SINGLE_QUOTES, "\\'");
                str = CommonConstant.Symbol.SINGLE_QUOTES + ((Object) replace) + CommonConstant.Symbol.SINGLE_QUOTES;
            } else if ((obj instanceof Number) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float)) {
                str = obj.toString();
            } else if (obj instanceof Boolean) {
                str = obj.toString();
            }
            webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.b + ",{'r':0,'result':" + str + "});");
        }

        public void a() {
            WebView webView = this.a.get();
            if (webView == null) {
                return;
            }
            webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.b + ",{'r':1,'result':'no such method'})");
        }

        public void a(String str) {
            WebView webView = this.a.get();
            if (webView != null) {
                webView.loadUrl(TitansConstants.JAVASCRIPT_PREFIX + str);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b {
        public boolean customCallback() {
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0132, code lost:
            r12.a((java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0135, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void call(java.lang.String r10, java.util.List<java.lang.String> r11, com.tencent.open.a.C1488a r12) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.a.b.call(java.lang.String, java.util.List, com.tencent.open.a$a):void");
        }
    }

    public void a(b bVar, String str) {
        this.a.put(str, bVar);
    }

    public void a(String str, String str2, List<String> list, C1488a c1488a) {
        SLog.v("openSDK_LOG.JsBridge", "getResult---objName = " + str + " methodName = " + str2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.set(i, URLDecoder.decode(list.get(i), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        b bVar = this.a.get(str);
        if (bVar != null) {
            SLog.d("openSDK_LOG.JsBridge", "call----");
            bVar.call(str2, list, c1488a);
            return;
        }
        SLog.d("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
        if (c1488a != null) {
            c1488a.a();
        }
    }

    public boolean a(WebView webView, String str) {
        SLog.v("openSDK_LOG.JsBridge", "-->canHandleUrl---url = " + str);
        if (str != null && Uri.parse(str).getScheme().equals("jsbridge")) {
            ArrayList arrayList = new ArrayList(Arrays.asList((str + "/#").split("/")));
            if (arrayList.size() < 6) {
                return false;
            }
            List<String> subList = arrayList.subList(4, arrayList.size() - 1);
            C1488a c1488a = new C1488a(webView, 4L, str);
            webView.getUrl();
            a((String) arrayList.get(2), (String) arrayList.get(3), subList, c1488a);
            return true;
        }
        return false;
    }
}
