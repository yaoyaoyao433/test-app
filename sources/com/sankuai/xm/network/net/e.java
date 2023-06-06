package com.sankuai.xm.network.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public int b;
    public Map<String, String> c;
    public String d;
    public String e;
    public long f;
    public int g;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f23bf65ba38d4c071621052132ddaba6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f23bf65ba38d4c071621052132ddaba6");
        } else {
            this.g = -1;
        }
    }
}
