package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
/* loaded from: classes6.dex */
public class VideoActivity extends Activity {
    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        s.a(this).a(i, i2, intent);
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        super.requestWindowFeature(1);
        super.getWindow().setFormat(-3);
        Intent intent = super.getIntent();
        Bundle bundleExtra = intent != null ? intent.getBundleExtra("extraData") : null;
        if (bundleExtra != null) {
            bundleExtra.putInt("callMode", 1);
            s.a(super.getApplicationContext()).a((String) null, bundleExtra, (com.tencent.tbs.video.interfaces.a) null);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        s.a(this).a(this, 4);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        s.a(this).a(this, 3);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        s.a(this).a(this, 2);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        s.a(this).a(this, 1);
    }
}
