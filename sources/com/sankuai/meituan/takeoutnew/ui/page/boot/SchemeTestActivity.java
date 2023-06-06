package com.sankuai.meituan.takeoutnew.ui.page.boot;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.interfaces.b;
import com.sankuai.waimai.foundation.utils.ae;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SchemeTestActivity extends Activity {
    public static ChangeQuickRedirect a;
    private static final String[] b = {b.c + "/welcome", b.c + "/pois", b.c + "/orders", b.c + "/menu?restaurant_id=171899", b.c + "/browser?inner_url=http%3a%2f%2fi.meituan.com%2ffirework%2fuj1490941836%3factivity_id%3d15778%26ys%3d2%26ys_id%3d14319", b.c + "/login", b.c + "/unsupported_scheme", b.c + "/welcome?target_url=" + b.a + "%3a%2f%2f" + b.b + "+%2fpois", b.c + "/welcome?target_url=" + b.a + "+%3a%2f%2f+" + b.b + "%2fbrowser%3finner_url%3dhttp%253a%252f%252fi.meituan.com%252ffirework%252fuj1490941836%253factivity_id%253d15778%2526ys%253d2%2526ys_id%253d14319", b.c + "/welcome?target_url=" + b.a + "%3a%2f%2f" + b.b + "%2funsupported_scheme", "meituanpayment://wallet/launch", "http://www.meituan.com", "http://www.baidu.com", "ftp://www.baidu.com", b.c + "/menu?need_login=1&restaurant_id=171899", b.c + "/browser?need_login=1&inner_url=http%3a%2f%2fi.meituan.com%2ffirework%2fuj1490941836%3factivity_id%3d15778%26ys%3d2%26ys_id%3d14319"};
    private static final String[] c = {"外部", "内部", "发PUSH", "WebView"};
    private int d;
    private Button e;
    private Context f;

    public SchemeTestActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88688837659b38aa5de0be819897476a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88688837659b38aa5de0be819897476a");
        } else {
            this.f = this;
        }
    }

    public static /* synthetic */ void a(SchemeTestActivity schemeTestActivity, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, schemeTestActivity, changeQuickRedirect, false, "81cc940b64189ea60c4e1303772e1f28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, schemeTestActivity, changeQuickRedirect, false, "81cc940b64189ea60c4e1303772e1f28");
            return;
        }
        ((AlarmManager) schemeTestActivity.f.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(1, System.currentTimeMillis() + MetricsAnrManager.ANR_THRESHOLD, PendingIntent.getBroadcast(schemeTestActivity.f, 0, schemeTestActivity.a(str), 0));
        ae.a((Activity) schemeTestActivity, "5s后发广播");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String[] strArr;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fceb7d483b4f5bbcee0221404bdc49bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fceb7d483b4f5bbcee0221404bdc49bd");
            return;
        }
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SchemeTestActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9b5b98285e3df87b1b74a54e125cee1", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9b5b98285e3df87b1b74a54e125cee1");
                    return;
                }
                String charSequence = ((Button) view).getText().toString();
                switch (SchemeTestActivity.this.d) {
                    case 0:
                        try {
                            SchemeTestActivity.this.startActivity(new Intent().setData(Uri.parse(charSequence)));
                            return;
                        } catch (Exception e) {
                            SchemeTestActivity schemeTestActivity = SchemeTestActivity.this;
                            ae.a((Activity) schemeTestActivity, "启动失败 " + e.getClass().getSimpleName());
                            return;
                        }
                    case 1:
                        com.sankuai.waimai.foundation.router.a.a(SchemeTestActivity.this.f, charSequence);
                        return;
                    case 2:
                        SchemeTestActivity.a(SchemeTestActivity.this, charSequence);
                        return;
                    default:
                        return;
                }
            }
        };
        this.e = new Button(this);
        this.e.setAllCaps(false);
        b();
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SchemeTestActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26a4a15f73fc049aa1aceec267fd3dea", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26a4a15f73fc049aa1aceec267fd3dea");
                } else {
                    new AlertDialog.Builder(SchemeTestActivity.this.f).setItems(SchemeTestActivity.c, new DialogInterface.OnClickListener() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SchemeTestActivity.2.1
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "81da8d4fb082e3cc0646d2d3d05910b2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "81da8d4fb082e3cc0646d2d3d05910b2");
                                return;
                            }
                            SchemeTestActivity.this.d = i;
                            SchemeTestActivity.this.b();
                        }
                    }).show();
                }
            }
        });
        linearLayout.addView(this.e);
        for (String str : b) {
            Button button = new Button(this);
            button.setText(str);
            button.setAllCaps(false);
            button.setOnClickListener(onClickListener);
            linearLayout.addView(button);
        }
        ScrollView scrollView = new ScrollView(this);
        scrollView.addView(linearLayout);
        setContentView(scrollView);
    }

    @NonNull
    private Intent a(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "994278cc8e3ee7c49770548abc9fa59b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "994278cc8e3ee7c49770548abc9fa59b");
        }
        Intent intent = new Intent();
        intent.setAction("com.dianping.dpmtpush.RECEIVE_PASS_THROUGH_MESSAGE");
        try {
            String str3 = b.c;
            str2 = new JSONObject().put("appname", this.f.getPackageName()).put("title", "测试标题").put("content", str.startsWith(str3) ? str.substring(str3.length(), str.length()) : str).put("url", str).put("extra", new JSONObject()).toString();
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            str2 = "";
        }
        intent.putExtra("message", str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "559a928c9d96f4f7dba5cfbb56a89dae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "559a928c9d96f4f7dba5cfbb56a89dae");
            return;
        }
        Button button = this.e;
        button.setText("跳转模式：" + c[this.d]);
    }
}
