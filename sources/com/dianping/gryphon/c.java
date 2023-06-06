package com.dianping.gryphon;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends a {
    public static ChangeQuickRedirect a;
    private com.dianping.cache.a b;
    private b c;
    private long d;
    private String e;

    public c(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "647198140a08c0fe9a5b9457c00db54f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "647198140a08c0fe9a5b9457c00db54f");
            return;
        }
        this.d = 31539599999L;
        this.c = bVar;
        this.e = this.c.f;
        this.b = com.dianping.cache.a.a();
    }

    @Override // com.dianping.gryphon.a
    public final String a(String str) {
        File a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "913071ec76a7d1465519b1bcbe266bd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "913071ec76a7d1465519b1bcbe266bd7");
        }
        com.dianping.cache.a aVar = this.b;
        String str2 = this.e;
        long j = this.d;
        Object[] objArr2 = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.cache.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "aa6aa175a77b586d7268929bc9e75790", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "aa6aa175a77b586d7268929bc9e75790");
        }
        if (!com.dianping.cache.a.b || (a2 = com.dianping.cache.a.a(str, str2, j)) == null) {
            return null;
        }
        return a2.getAbsolutePath();
    }
}
