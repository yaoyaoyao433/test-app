package com.meituan.android.customerservice.callbase.base;

import com.meituan.android.customerservice.callbase.utils.Timer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class e implements Timer.TimeoutCallback {
    public static ChangeQuickRedirect a;
    protected static final int c = (int) TimeUnit.SECONDS.toMillis(5);
    protected static final int d = c * 3;
    protected static final int e = c * 6;
    public Timer b;
    protected String f;
    protected String g;
    private a h;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void onPingTimeout();

        void onWeakNet();
    }

    public abstract void a(String str, String str2);

    public e(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bd67311a8209122f2d193d7330d81cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bd67311a8209122f2d193d7330d81cf");
            return;
        }
        this.h = aVar;
        this.b = new Timer(this);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0493ac67d52237beccff65d8ad38f18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0493ac67d52237beccff65d8ad38f18");
        } else {
            this.b.cancelAll();
        }
    }

    @Override // com.meituan.android.customerservice.callbase.utils.Timer.TimeoutCallback
    public void onTimeout(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d153745007029431e8d808deb664433", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d153745007029431e8d808deb664433");
        } else if (i == 111) {
            this.b.cancel(111);
            if (this.h != null) {
                this.h.onPingTimeout();
            }
        } else if (i == 222) {
            a(this.f, this.g);
        } else if (i != 333) {
        } else {
            this.b.cancel(333);
            this.b.schedule(333, d);
            if (this.h != null) {
                this.h.onWeakNet();
            }
        }
    }
}
