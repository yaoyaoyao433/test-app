package com.meituan.android.identifycardrecognizer.adapter;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.meituan.android.identifycardrecognizer.adapter.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final b.c b;

    private d(b.c cVar) {
        this.b = cVar;
    }

    public static Runnable a(b.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf004dffc4749c02d3f23a9fa4ea427e", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf004dffc4749c02d3f23a9fa4ea427e") : new d(cVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "925d11ed1c9adcb3dbbb9b5ef4423edb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "925d11ed1c9adcb3dbbb9b5ef4423edb");
            return;
        }
        b.c cVar = this.b;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a0748d759cd3cfa20b53d2fccf25492d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a0748d759cd3cfa20b53d2fccf25492d");
        } else if (View.class.isInstance(cVar.c.getParent())) {
            Rect rect = new Rect();
            cVar.c.getHitRect(rect);
            rect.top -= 30;
            rect.bottom += 30;
            rect.left -= 30;
            rect.right += 30;
            ((View) cVar.c.getParent()).setTouchDelegate(new TouchDelegate(rect, cVar.c));
        }
    }
}
