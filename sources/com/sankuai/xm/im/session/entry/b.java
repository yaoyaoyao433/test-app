package com.sankuai.xm.im.session.entry;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.session.SessionId;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static AtomicLong d = new AtomicLong(0);
    public SessionId b;
    public long c;
    private long e;

    public b(SessionId sessionId, long j) {
        Object[] objArr = {sessionId, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84198b3b0f72e02d19b2f0e0cdd09335", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84198b3b0f72e02d19b2f0e0cdd09335");
            return;
        }
        this.b = sessionId;
        this.c = j;
        this.e = d.incrementAndGet();
    }
}
