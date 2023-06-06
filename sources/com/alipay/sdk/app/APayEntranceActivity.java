package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class APayEntranceActivity extends Activity {
    public static final ConcurrentHashMap<String, a> a = new ConcurrentHashMap<>();
    public String b;
    public String c;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    @Override // android.app.Activity
    public void finish() {
        a remove;
        String str = this.c;
        if (TextUtils.isEmpty(this.b)) {
            this.b = d.a();
        }
        if (str != null && (remove = a.remove(str)) != null) {
            remove.a(this.b);
        }
        try {
            super.finish();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (i == 1000) {
            try {
                if (intent != null) {
                    this.b = com.sankuai.waimai.platform.utils.f.a(intent, "result");
                } else {
                    this.b = d.a();
                }
            } catch (Throwable unused) {
                this.b = d.a();
            }
            finish();
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString("ap_order_info");
            String string2 = extras.getString("ap_target_packagename");
            this.c = extras.getString("ap_session");
            String string3 = extras.getString("ap_local_info", "{}");
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable unused) {
                finish();
            }
        } catch (Throwable unused2) {
            finish();
        }
    }
}
