package com.xiaomi.push;

import android.os.IBinder;
import com.xiaomi.push.ad;
/* loaded from: classes6.dex */
public final class af implements Runnable {
    final /* synthetic */ IBinder a;
    final /* synthetic */ ad.b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public af(ad.b bVar, IBinder iBinder) {
        this.b = bVar;
        this.a = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String packageName = ad.this.a.getPackageName();
            String c = ad.this.c();
            ad.a aVar = new ad.a();
            aVar.a = ad.c.a(this.a, packageName, c, "GUID");
            aVar.b = ad.c.a(this.a, packageName, c, "OUID");
            aVar.c = ad.c.a(this.a, packageName, c, "DUID");
            aVar.d = ad.c.a(this.a, packageName, c, "AUID");
            ad.this.c = aVar;
            ad.a(ad.this);
            ad.this.b = 2;
            synchronized (ad.this.d) {
                try {
                    ad.this.d.notifyAll();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            ad.a(ad.this);
            ad.this.b = 2;
            synchronized (ad.this.d) {
                try {
                    ad.this.d.notifyAll();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            ad.a(ad.this);
            ad.this.b = 2;
            synchronized (ad.this.d) {
                try {
                    ad.this.d.notifyAll();
                } catch (Exception unused4) {
                }
                throw th;
            }
        }
    }
}
