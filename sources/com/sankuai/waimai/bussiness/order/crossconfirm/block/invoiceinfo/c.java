package com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.Invoice;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public long b;
    public String c;
    public boolean d;
    public boolean e;
    public String f;
    public int g;
    public int h;
    public double i;
    public double j;
    public int k;
    public int l;
    public String m;
    public String n;
    public String o;
    public int p;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b94d3826bd1ef4f420416b99f38779", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b94d3826bd1ef4f420416b99f38779");
            return;
        }
        this.c = "";
        this.k = 0;
    }

    public final boolean a() {
        return this.h == 1;
    }

    public final Invoice b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3886b8c40d9e684dd181dfab0faf1a1a", RobustBitConfig.DEFAULT_VALUE) ? (Invoice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3886b8c40d9e684dd181dfab0faf1a1a") : new Invoice(this.n, this.m, this.l);
    }
}
