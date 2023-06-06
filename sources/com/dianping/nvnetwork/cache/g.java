package com.dianping.nvnetwork.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends f {
    public static ChangeQuickRedirect c;

    public g(d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "202c1b0a7844f0a4cc95e5cc10a789c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "202c1b0a7844f0a4cc95e5cc10a789c9");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r2 <= 300000) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r2 <= com.meituan.met.mercury.load.bean.DDLoadConstants.TIME_HOURS_MILLIS) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
        if (r14.c >= r0) goto L21;
     */
    @Override // com.dianping.nvnetwork.cache.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.dianping.nvnetwork.q a(com.dianping.nvnetwork.Request r13, com.dianping.nvnetwork.cache.a r14) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.cache.g.a(com.dianping.nvnetwork.Request, com.dianping.nvnetwork.cache.a):com.dianping.nvnetwork.q");
    }
}
