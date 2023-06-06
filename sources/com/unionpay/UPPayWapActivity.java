package com.unionpay;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class UPPayWapActivity extends Activity {
    LinearLayout a;
    private WebView b;
    private WebViewJavascriptBridge c;
    private AlertDialog d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(UPPayWapActivity uPPayWapActivity, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("pay_result", str);
        intent.putExtra("result_data", str2);
        uPPayWapActivity.setResult(-1, intent);
        uPPayWapActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject.put("code", str);
            }
            if (str2 != null) {
                jSONObject.put("msg", str2);
            }
            if (str3 != null) {
                jSONObject.put("value", str3);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        View.OnClickListener nVar;
        super.onCreate(bundle);
        try {
            try {
                if (!"949A1CC".equalsIgnoreCase(com.sankuai.waimai.platform.utils.f.a(getIntent(), "magic_data"))) {
                    finish();
                }
                String a = com.sankuai.waimai.platform.utils.f.a(getIntent(), "waptype");
                String str3 = "";
                if (a == null || !a.equals("new_page")) {
                    String a2 = com.sankuai.waimai.platform.utils.f.a(getIntent(), "wapurl");
                    String a3 = com.sankuai.waimai.platform.utils.f.a(getIntent(), "paydata");
                    if (a3 != null) {
                        str3 = a2 + "?s=" + a3;
                    }
                    str = str3;
                    str2 = com.unionpay.utils.k.a().e;
                    nVar = new n(this);
                } else {
                    str = com.sankuai.waimai.platform.utils.f.a(getIntent(), "wapurl");
                    String a4 = com.sankuai.waimai.platform.utils.f.a(getIntent(), "waptitle");
                    if (str == null) {
                        str = "";
                    }
                    str2 = a4 != null ? a4 : "";
                    nVar = new j(this);
                }
                getWindow().requestFeature(1);
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                RelativeLayout relativeLayout = new RelativeLayout(this);
                relativeLayout.setLayoutParams(layoutParams);
                int a5 = com.unionpay.utils.f.a(this, 10.0f);
                int a6 = com.unionpay.utils.f.a(this, 52.0f);
                relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, a6));
                relativeLayout.setBackgroundColor(-10705958);
                this.a = new LinearLayout(this);
                this.a.setPadding(a5, a5, a5, a5);
                this.a.setGravity(16);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(9, -1);
                layoutParams2.addRule(15, -1);
                layoutParams2.leftMargin = a5;
                this.a.setOnClickListener(nVar);
                relativeLayout.addView(this.a, layoutParams2);
                int a7 = com.unionpay.utils.f.a(this, 20.0f);
                int a8 = com.unionpay.utils.f.a(this, 11.0f);
                ImageView imageView = new ImageView(this);
                imageView.setBackgroundDrawable(com.unionpay.utils.g.a(com.unionpay.utils.h.a));
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(a8, a7);
                layoutParams3.addRule(15, -1);
                this.a.addView(imageView, layoutParams3);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(com.unionpay.utils.f.a(this, 320.0f), a6);
                layoutParams4.addRule(13, -1);
                TextView textView = new TextView(this);
                textView.setTextSize(20.0f);
                textView.setTextColor(-1);
                textView.setText(str2);
                textView.setGravity(17);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                relativeLayout.addView(textView, layoutParams4);
                linearLayout.addView(relativeLayout);
                this.b = new WebView(this);
                this.b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                linearLayout.addView(this.b);
                setContentView(linearLayout);
                this.c = new WebViewJavascriptBridge(this, this.b, null);
                this.b.loadUrl(str);
                this.c.registerHandler("getDeviceInfo", new q(this));
                this.c.registerHandler("saveData", new r(this));
                this.c.registerHandler("getData", new s(this));
                this.c.registerHandler("removeData", new t(this));
                this.c.registerHandler("setPageBackEnable", new u(this));
                this.c.registerHandler("payBySDK", new v(this));
                this.c.registerHandler("downloadApp", new w(this));
                this.c.registerHandler("payResult", new k(this));
                this.c.registerHandler("closePage", new l(this));
                this.c.registerHandler("openNewPage", new m(this));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            onPause();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
