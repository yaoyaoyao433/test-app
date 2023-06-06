package com.tencent.open.web.security;

import android.webkit.WebView;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.tencent.open.a;
import com.tencent.open.log.SLog;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends a.C1488a {
    private String d;

    public c(WebView webView, long j, String str, String str2) {
        super(webView, j, str);
        this.d = str2;
    }

    @Override // com.tencent.open.a.C1488a
    public void a(Object obj) {
        SLog.v("openSDK_LOG.SecureJsListener", "-->onComplete, result: " + obj);
    }

    @Override // com.tencent.open.a.C1488a
    public void a() {
        SLog.d("openSDK_LOG.SecureJsListener", "-->onNoMatchMethod...");
    }

    @Override // com.tencent.open.a.C1488a
    public void a(String str) {
        SLog.v("openSDK_LOG.SecureJsListener", "-->onCustomCallback, js: " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", !com.tencent.open.c.c.a ? -4 : 0);
            jSONObject.put(Constants.Environment.KEY_SERIAL_NUMBER, this.b);
            jSONObject.put("data", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        b(jSONObject.toString());
    }

    private void b(String str) {
        WebView webView = this.a.get();
        if (webView != null) {
            StringBuffer stringBuffer = new StringBuffer(TitansConstants.JAVASCRIPT_PREFIX);
            stringBuffer.append("if(!!");
            stringBuffer.append(this.d);
            stringBuffer.append("){");
            stringBuffer.append(this.d);
            stringBuffer.append(CommonConstant.Symbol.BRACKET_LEFT);
            stringBuffer.append(str);
            stringBuffer.append(")}");
            String stringBuffer2 = stringBuffer.toString();
            SLog.v("openSDK_LOG.SecureJsListener", "-->callback, callback: " + stringBuffer2);
            webView.loadUrl(stringBuffer2);
        }
    }
}
