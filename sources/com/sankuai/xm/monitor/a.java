package com.sankuai.xm.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static ChangeQuickRedirect a;
    public short b;
    public long c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    private String n;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ef122b4dc175aa39fd8affb01d746b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ef122b4dc175aa39fd8affb01d746b");
            return;
        }
        this.n = "Android";
        this.j = "xm_sdk_report";
    }
}
