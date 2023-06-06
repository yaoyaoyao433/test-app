package com.dianping.networklog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public String b;
    public boolean c;
    public long d;
    public String e;
    public long f;
    public long g;
    public int h;
    public String[] i;

    public l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00a94d7b352371fae1508cf62e9fd380", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00a94d7b352371fae1508cf62e9fd380");
        } else {
            this.e = "";
        }
    }
}
