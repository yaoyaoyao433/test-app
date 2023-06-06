package com.sankuai.xm.network.http;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public Map<String, String> b;
    public String c;
    public f d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a7705fd9e765f41498d0443ffc1107", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a7705fd9e765f41498d0443ffc1107");
            return;
        }
        this.b = new HashMap();
        this.h = false;
        this.i = true;
        this.j = -1;
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6382d228c2e734dfbb10b74782249b1", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6382d228c2e734dfbb10b74782249b1");
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba23435e8dedf7ad3fc84993e990a16c", 6917529027641081856L)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba23435e8dedf7ad3fc84993e990a16c");
            } else {
                str = "";
                Map<String, String> map = this.b;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        str = str + entry.getKey() + CommonConstant.Symbol.COLON + entry.getValue() + StringUtil.SPACE;
                    }
                }
            }
            return "Request {  url= " + this.c + " header= " + str + " }";
        } catch (Exception unused) {
            return super.toString();
        }
    }
}
