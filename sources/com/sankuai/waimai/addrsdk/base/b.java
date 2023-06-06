package com.sankuai.waimai.addrsdk.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public int d;
    public int e;
    public String f;
    public Map<String, String> g;
    public String h;
    public String i;
    public String j;
    public String k;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a41e359787f4d542c9123846c7efa36c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a41e359787f4d542c9123846c7efa36c");
            return;
        }
        this.c = "";
        this.d = 0;
        this.e = 1;
    }

    public final void a(int i) {
        this.e = this.e;
    }
}
