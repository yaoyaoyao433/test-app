package com.meituan.android.ptcommonim.pageadapter.message.item;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect e;
    public boolean f;
    public Runnable g;
    public volatile boolean h;
    public boolean i;

    public abstract View a();

    public abstract void a(View view);

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d669bd8d57fac0f5d76c414b5fd4f702", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d669bd8d57fac0f5d76c414b5fd4f702");
            return;
        }
        this.f = false;
        this.i = false;
    }
}
