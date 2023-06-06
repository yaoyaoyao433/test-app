package com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected Context b;
    protected String c;
    protected int d;
    protected int e;

    public abstract void a();

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "131c12c673e5bc49994a3eb833f0a227", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "131c12c673e5bc49994a3eb833f0a227");
            return;
        }
        this.d = 1;
        this.b = context;
    }

    public final void a(int i) {
        this.e = i;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void b(int i) {
        this.d = 1;
    }
}
