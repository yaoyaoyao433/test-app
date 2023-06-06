package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.tbs.video.interfaces.IUserStateChangedListener;
/* loaded from: classes6.dex */
public class s {
    private static s e;
    u a;
    Context b;
    com.tencent.tbs.video.interfaces.a c;
    IUserStateChangedListener d;

    private s(Context context) {
        this.a = null;
        this.b = context.getApplicationContext();
        this.a = new u(this.b);
    }

    public static synchronized s a(Context context) {
        s sVar;
        synchronized (s.class) {
            if (e == null) {
                e = new s(context);
            }
            sVar = e;
        }
        return sVar;
    }

    public void a(int i, int i2, Intent intent) {
        if (this.c != null) {
            this.c.a(i, i2, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Activity activity, int i) {
        this.a.a(activity, i);
    }

    public boolean a() {
        this.a.a();
        return this.a.b();
    }

    public boolean a(String str, Bundle bundle, com.tencent.tbs.video.interfaces.a aVar) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("videoUrl", str);
        }
        if (aVar != null) {
            this.a.a();
            if (!this.a.b()) {
                return false;
            }
            this.c = aVar;
            this.d = new IUserStateChangedListener() { // from class: com.tencent.smtt.sdk.s.1
                @Override // com.tencent.tbs.video.interfaces.IUserStateChangedListener
                public void onUserStateChanged() {
                    s.this.a.c();
                }
            };
            this.c.a(this.d);
            bundle.putInt("callMode", 3);
        } else {
            bundle.putInt("callMode", 1);
        }
        this.a.a(bundle, aVar == null ? null : this);
        return true;
    }
}
