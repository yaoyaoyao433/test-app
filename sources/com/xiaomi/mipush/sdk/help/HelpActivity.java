package com.xiaomi.mipush.sdk.help;

import android.app.Activity;
import android.os.Bundle;
import com.xiaomi.mipush.sdk.bc;
/* loaded from: classes6.dex */
public class HelpActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bc.a(this, getIntent(), null);
        finish();
    }
}
