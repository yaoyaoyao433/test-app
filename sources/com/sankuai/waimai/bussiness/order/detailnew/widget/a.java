package com.sankuai.waimai.bussiness.order.detailnew.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements View.OnClickListener {
    public static ChangeQuickRedirect c;
    private long a;
    private int b;

    public abstract void a(View view);

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15ab38445bf8da9013d7e0c8c5284f5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15ab38445bf8da9013d7e0c8c5284f5a");
        } else {
            this.b = 750;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a01b651b4b8578798b7baf41443d310", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a01b651b4b8578798b7baf41443d310");
        } else if (System.currentTimeMillis() - this.a > this.b) {
            a(view);
            this.a = System.currentTimeMillis();
        }
    }
}
