package com.alipay.sdk.app;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class H5AuthActivity extends H5PayActivity {
    @Override // com.alipay.sdk.app.H5PayActivity
    public final void a() {
        Object obj = AuthTask.c;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }
}
