package com.sankuai.xm.network.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public Map<String, String> b;
    public String c;
    public String d;
    public int e;
    public long f;
    public long g;
    public boolean h;
    public String i;
    public Map<String, String> j;

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13774b1e88e452eb726e889b0aba1214", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13774b1e88e452eb726e889b0aba1214");
        } else {
            this.f = j;
        }
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbda89a819fc4c2ab2742aa4731a15d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbda89a819fc4c2ab2742aa4731a15d1");
        } else {
            this.g = j;
        }
    }
}
