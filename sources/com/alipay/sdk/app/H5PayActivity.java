package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.alipay.sdk.app.f;
import com.alipay.sdk.sys.a;
import com.alipay.sdk.util.l;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class H5PayActivity extends Activity {
    public com.alipay.sdk.widget.c b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public String h;
    public WeakReference<com.alipay.sdk.sys.a> i;

    private void b() {
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(8192);
        } catch (Throwable th) {
            com.alipay.sdk.util.d.a(th);
        }
    }

    public void a() {
        Object obj = PayTask.h;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        a();
        super.finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        f.a aVar;
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (i == 1010) {
            com.alipay.sdk.sys.a aVar2 = (com.alipay.sdk.sys.a) l.a(this.i);
            if (i == 1010 && intent != null && (aVar = f.a) != null) {
                f.a = null;
                if (i2 == -1) {
                    com.alipay.sdk.app.statistic.a.b(aVar2, "biz", "TbOk", intent.toUri(1));
                    aVar.a(true, l.a(intent), "OK");
                } else if (i2 != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    com.alipay.sdk.app.statistic.a.a(aVar2, "biz", "TbUnknown", sb.toString());
                } else {
                    com.alipay.sdk.app.statistic.a.b(aVar2, "biz", "TbCancel", intent != null ? intent.toUri(1) : "");
                    aVar.a(false, null, "CANCELED");
                }
            }
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.alipay.sdk.widget.c cVar = this.b;
        if (cVar == null) {
            finish();
        } else if (cVar.a()) {
            cVar.b();
        } else {
            if (!cVar.b()) {
                super.onBackPressed();
            }
            d.b = d.a();
            finish();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        b();
        super.onCreate(bundle);
        try {
            com.alipay.sdk.sys.a a = a.C0029a.a(getIntent());
            if (a == null) {
                finish();
                return;
            }
            this.i = new WeakReference<>(a);
            if (!com.alipay.sdk.data.a.a().d) {
                setRequestedOrientation(1);
            } else {
                setRequestedOrientation(3);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString("url", null);
                this.c = string;
                if (!l.d(string)) {
                    finish();
                    return;
                }
                this.e = extras.getString("cookie", null);
                this.d = extras.getString("method", null);
                this.f = extras.getString("title", null);
                this.h = extras.getString("version", com.alipay.sdk.widget.c.c);
                this.g = extras.getBoolean("backisexit", false);
                try {
                    com.alipay.sdk.widget.d dVar = new com.alipay.sdk.widget.d(this, a, this.h);
                    setContentView(dVar);
                    dVar.a(this.f, this.d, this.g);
                    dVar.a(this.c, this.e);
                    dVar.a(this.c);
                    this.b = dVar;
                } catch (Throwable th) {
                    com.alipay.sdk.app.statistic.a.a(a, "biz", "GetInstalledAppEx", th);
                    finish();
                }
            } catch (Exception unused) {
                finish();
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.alipay.sdk.widget.c cVar = this.b;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            try {
                com.alipay.sdk.app.statistic.a.a((com.alipay.sdk.sys.a) l.a(this.i), "biz", "H5PayDataAnalysisError", th);
            } catch (Throwable unused) {
            }
        }
    }
}
