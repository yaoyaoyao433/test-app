package com.alipay.security.mobile.module.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ b a;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a();
        } catch (Exception e) {
            d.a(e);
        }
    }
}
