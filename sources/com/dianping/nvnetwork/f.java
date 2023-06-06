package com.dianping.nvnetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;
    double b;
    double c;
    double d;
    double e;
    double f;
    double g;
    double h;

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbdd7ec03a257d02f53304e58c4a8cf0", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbdd7ec03a257d02f53304e58c4a8cf0");
        }
        return "NVFullLinkIntervalModel{requestInterval=" + this.b + ", requestCompressInterval=" + this.c + ", requestEncryptInterval=" + this.d + ", responseInterval=" + this.e + ", responseDecompressInterval=" + this.f + ", responseDecryptInterval=" + this.g + ", sharkServerForwardInterval=" + this.h + '}';
    }
}
