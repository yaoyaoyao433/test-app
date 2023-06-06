package com.sankuai.waimai.store.widgets;

import android.os.SystemClock;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private static long b;
    private View.OnClickListener c;

    public a(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8166cd65d0b5f84d33e047b7558b8745", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8166cd65d0b5f84d33e047b7558b8745");
        } else {
            this.c = onClickListener;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4a09b6f64402abc56572d09ca2ab6d0", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4a09b6f64402abc56572d09ca2ab6d0");
        } else if (this.c == null) {
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - b > 1000) {
                this.c.onClick(view);
            }
            b = elapsedRealtime;
        }
    }
}
