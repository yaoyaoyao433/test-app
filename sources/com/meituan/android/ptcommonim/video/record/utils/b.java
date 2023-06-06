package com.meituan.android.ptcommonim.video.record.utils;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b implements View.OnClickListener {
    public static ChangeQuickRedirect c;
    private long a;
    private long b;

    public abstract void a(View view);

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aff723541c5eb99ebb6d99c6ac8227f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aff723541c5eb99ebb6d99c6ac8227f");
        } else {
            this.b = 500L;
        }
    }

    public b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2a07633eb1af2d5cb6402a76fe5b608", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2a07633eb1af2d5cb6402a76fe5b608");
            return;
        }
        this.b = 500L;
        this.b = j;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67ee9f1caff115edcdd7afb21f4539a2", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67ee9f1caff115edcdd7afb21f4539a2");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.a > this.b) {
            a(view);
            this.a = currentTimeMillis;
        }
    }
}
