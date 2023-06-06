package com.alipay.sdk.app;

import android.content.Intent;
import android.net.Uri;
import com.alipay.sdk.sys.a;
import com.meituan.robust.common.StringUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class H5OpenAuthActivity extends H5PayActivity {
    public boolean a = false;

    @Override // com.alipay.sdk.app.H5PayActivity
    public final void a() {
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onDestroy() {
        if (this.a) {
            try {
                com.alipay.sdk.sys.a a = a.C0029a.a(getIntent());
                if (a != null) {
                    com.alipay.sdk.app.statistic.a.b(this, a, "", a.d);
                }
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        try {
            com.alipay.sdk.sys.a a = a.C0029a.a(intent);
            try {
                super.startActivity(intent);
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || !data.toString().startsWith("alipays://platformapi/startapp")) {
                    return;
                }
                finish();
            } catch (Throwable th) {
                String uri = (intent == null || intent.getData() == null) ? StringUtil.NULL : intent.getData().toString();
                if (a != null) {
                    com.alipay.sdk.app.statistic.a.a(a, "biz", "StartActivityEx", th, uri);
                }
                this.a = true;
                throw th;
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
