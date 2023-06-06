package com.sankuai.meituan.riverrunplayer.player;

import android.os.Handler;
import android.os.Looper;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    int b;
    final a c;
    private Handler d;
    private Runnable e;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(String str);

        void b();

        void c();
    }

    public e(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b434e2a222daa6830b20d1a48eca6331", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b434e2a222daa6830b20d1a48eca6331");
            return;
        }
        this.b = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.e = new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.e.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d15ed931181192e1bfdecf91b6746ed9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d15ed931181192e1bfdecf91b6746ed9");
                } else if (e.this.c != null) {
                    e.this.c.a();
                }
            }
        };
        this.c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8222dfe94bc8843c875ae3f2c8a8822d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8222dfe94bc8843c875ae3f2c8a8822d");
        } else if (this.c != null) {
            this.c.a(str);
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c2e9774c8e234fdbce6e53a7f0d9bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c2e9774c8e234fdbce6e53a7f0d9bb")).booleanValue();
        }
        a("ReconnectManager reconnectIfNeed mReconnectTimes: " + this.b);
        if (this.b < 10) {
            this.b++;
            this.d.removeCallbacks(this.e);
            this.d.postDelayed(this.e, PayTask.j);
            return true;
        }
        if (this.b >= 10) {
            if (this.c != null) {
                this.c.b();
            }
            b();
        }
        return false;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1f92752cac06d2d28e76a4ffc1d931e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1f92752cac06d2d28e76a4ffc1d931e");
            return;
        }
        a("ReconnectManager reset");
        this.b = 0;
        this.d.removeCallbacks(this.e);
    }
}
