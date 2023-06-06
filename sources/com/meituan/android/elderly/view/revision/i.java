package com.meituan.android.elderly.view.revision;

import android.os.CountDownTimer;
import com.meituan.android.elderly.view.revision.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i<T extends h> extends CountDownTimer {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca69837ff7a962064a8b75c69fcc63cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca69837ff7a962064a8b75c69fcc63cc");
            return;
        }
        this.b = new WeakReference<>(t);
        this.c = aVar;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9979b5f333b4abd6a09168c23f19a0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9979b5f333b4abd6a09168c23f19a0a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c52489d288979fb87e5d45488bb1f1b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c52489d288979fb87e5d45488bb1f1b4");
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
