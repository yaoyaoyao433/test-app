package com.sankuai.xm.network.http;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.InputStream;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public int b;
    public Map<String, String> c;
    public InputStream d;
    public int e;
    public Throwable f;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e037c608f4867b26c9b5a2c55d5f622c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e037c608f4867b26c9b5a2c55d5f622c");
            return;
        }
        this.b = -1;
        this.e = -1;
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b49890a72a9e5ca9a8a9e273c852c4", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b49890a72a9e5ca9a8a9e273c852c4");
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "561c99aa9a54015a13ac9b7c63e7312f", 6917529027641081856L)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "561c99aa9a54015a13ac9b7c63e7312f");
            } else {
                str = "";
                Map<String, String> map = this.c;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        str = str + entry.getKey() + CommonConstant.Symbol.COLON + entry.getValue() + StringUtil.SPACE;
                    }
                }
            }
            return "Request{  code= " + this.b + " header= " + str + " contentLength= " + this.e + " }";
        } catch (Exception unused) {
            return super.toString();
        }
    }
}
