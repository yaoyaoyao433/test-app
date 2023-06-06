package com.meituan.android.cashier.base.view.revision;

import android.os.CountDownTimer;
import com.meituan.android.cashier.base.view.revision.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i<T extends g> extends CountDownTimer {
    public static ChangeQuickRedirect a;
    private WeakReference<T> b;
    private a c;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public i(T t, long j, long j2, a aVar) {
        super(j, 1000L);
        Object[] objArr = {t, new Long(j), 1000L, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "070c048913ca6d9b22ec13d976511df2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "070c048913ca6d9b22ec13d976511df2");
            return;
        }
        this.b = new WeakReference<>(t);
        this.c = aVar;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a55492bc52e59ab5279d46ce59eafc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a55492bc52e59ab5279d46ce59eafc9");
            return;
        }
        T t = this.b.get();
        if (t != null) {
            t.a(j);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "badc832fee7358ef3fa9b349fbd50d61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "badc832fee7358ef3fa9b349fbd50d61");
            return;
        }
        T t = this.b.get();
        if (t != null) {
            t.a();
        }
        if (this.c != null) {
            this.c.a();
        }
    }
}
