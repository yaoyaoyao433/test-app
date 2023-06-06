package com.sankuai.waimai.platform.utils.time;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements Handler.Callback {
    public static ChangeQuickRedirect f;
    private final long a;
    private final long b;
    private long c;
    private boolean d;
    private f e;

    public abstract void a();

    public abstract void a(long j);

    public a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed5c7608d418ee95e8de909958641e2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed5c7608d418ee95e8de909958641e2c");
            return;
        }
        this.d = false;
        this.e = new f(this);
        this.a = j;
        this.b = j2;
    }

    public final synchronized void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa14a3471026a1edb461985731f996b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa14a3471026a1edb461985731f996b1");
            return;
        }
        this.d = true;
        f fVar = this.e;
        Object[] objArr2 = {1};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "01c2cdcd27034834d8ade22813e9f904", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "01c2cdcd27034834d8ade22813e9f904");
        } else {
            fVar.b.removeMessages(1);
        }
    }

    public final synchronized a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "636e2b4e4524bac980fd5e18887e935b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "636e2b4e4524bac980fd5e18887e935b");
        }
        this.d = false;
        if (this.a <= 0) {
            a();
            return this;
        }
        this.c = SystemClock.elapsedRealtime() + this.a;
        f fVar = this.e;
        Object[] objArr2 = {1};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "e4ce059c169f174adf135a71c901c133", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "e4ce059c169f174adf135a71c901c133")).booleanValue();
        } else {
            fVar.b.sendEmptyMessage(1);
        }
        return this;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7a4f8bab43fe11fc20d83c9f41c948c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7a4f8bab43fe11fc20d83c9f41c948c")).booleanValue();
        }
        synchronized (this) {
            if (this.d) {
                return true;
            }
            long elapsedRealtime = this.c - SystemClock.elapsedRealtime();
            if (elapsedRealtime <= 0) {
                a();
            } else if (elapsedRealtime < this.b) {
                this.e.a(1, elapsedRealtime);
            } else {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                a(elapsedRealtime);
                long elapsedRealtime3 = (elapsedRealtime2 + this.b) - SystemClock.elapsedRealtime();
                while (elapsedRealtime3 < 0) {
                    elapsedRealtime3 += this.b;
                }
                this.e.a(1, elapsedRealtime3);
            }
            return true;
        }
    }
}
