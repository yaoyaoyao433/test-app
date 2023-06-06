package com.sankuai.xm.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public c d;
    public int e;
    private String f;
    private Map<String, String> g;

    public d(String str, int i, String str2, Map<String, String> map, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), str2, map, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad7ce2b6615f90fcc516f8317fdae3ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad7ce2b6615f90fcc516f8317fdae3ab");
            return;
        }
        this.e = -1;
        this.f = str;
        this.b = i;
        this.c = str2;
        this.g = map;
        this.e = i2;
    }

    public final String a() {
        return this.c;
    }

    public final String toString() {
        String y;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0980e209407827dcf1403132d107447", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0980e209407827dcf1403132d107447");
        }
        StringBuilder sb = new StringBuilder("url=");
        sb.append(this.f);
        sb.append(",mtraceid=");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd7a8eb3c00ffb9c436572b571b28b9f", 6917529027641081856L)) {
            y = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd7a8eb3c00ffb9c436572b571b28b9f");
        } else {
            y = this.d == null ? "" : this.d.y();
        }
        sb.append(y);
        sb.append(",code=");
        sb.append(this.b);
        sb.append(",response=");
        sb.append(this.c);
        return sb.toString();
    }
}
