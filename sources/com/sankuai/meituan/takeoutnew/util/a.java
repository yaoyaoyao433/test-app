package com.sankuai.meituan.takeoutnew.util;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements Runnable {
    private static final Handler a = new Handler(Looper.getMainLooper());
    public static ChangeQuickRedirect c;
    private final long b;
    private int d;
    private boolean e;

    public abstract void a();

    public abstract void a(int i);

    public a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b2a44f26b3b51bde8be2fa332282da6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b2a44f26b3b51bde8be2fa332282da6");
            return;
        }
        this.b = j;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0238d375b8a26a69db7284fd49c7433b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0238d375b8a26a69db7284fd49c7433b");
        } else if (this.e) {
        } else {
            this.d--;
            if (this.d > 0) {
                a(this.d);
            }
            c();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dee87fb80abe55af51ff1fdd5f6c3f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dee87fb80abe55af51ff1fdd5f6c3f1");
            return;
        }
        this.e = false;
        c();
    }

    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a119f73e9d1f541b9b4209e3a5c5c5de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a119f73e9d1f541b9b4209e3a5c5c5de");
            return;
        }
        this.e = true;
        a.removeCallbacks(this);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6c6be9f013d28cbd83d31e4879b36f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6c6be9f013d28cbd83d31e4879b36f2");
        } else if (this.d > 0) {
            a.postDelayed(this, this.b);
        } else {
            a();
        }
    }
}
