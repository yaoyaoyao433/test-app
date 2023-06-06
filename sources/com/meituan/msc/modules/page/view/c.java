package com.meituan.msc.modules.page.view;

import android.view.ViewPropertyAnimator;
import android.widget.Scroller;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public Scroller b;
    public ViewPropertyAnimator c;
    public int d;
    public MsiContext e;

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92d041ef211087e9f34101f2acf3eed5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92d041ef211087e9f34101f2acf3eed5");
            return;
        }
        if (this.e != null) {
            this.e.onError("cancel");
            this.e = null;
        }
        if (this.b != null) {
            this.b.forceFinished(true);
            this.b = null;
        }
        if (this.c != null) {
            this.c.cancel();
            this.c = null;
        }
    }

    public final int a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "062ff89f7fbd314eacf0355d52865dca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "062ff89f7fbd314eacf0355d52865dca")).intValue();
        }
        if (dVar == null || dVar.getRenderer() == null || dVar.getRenderer().o() == null) {
            return 0;
        }
        return dVar.getRenderer().o().getContentScrollY();
    }

    public final void a(d dVar, int i) {
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "851fb05721995ae4104588809c3cff15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "851fb05721995ae4104588809c3cff15");
        } else if (dVar == null || dVar.getRenderer() == null || dVar.getRenderer().o() == null) {
        } else {
            dVar.getRenderer().o().a(i);
        }
    }
}
