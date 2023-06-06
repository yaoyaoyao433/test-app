package com.sankuai.xm.im.session.listener;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.session.SessionId;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends com.sankuai.xm.base.entity.b<SessionId> {
    public static ChangeQuickRedirect b;

    private a(int i, SessionId sessionId) {
        super(i, sessionId);
        Object[] objArr = {Integer.valueOf(i), sessionId};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c1aed83a9fc73d54c2afec7c76a1dde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c1aed83a9fc73d54c2afec7c76a1dde");
        }
    }

    public static a a(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d11285866252c0bee8bbcd3b80fbbf11", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d11285866252c0bee8bbcd3b80fbbf11") : new a(1, sessionId);
    }

    public static a b(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a29961d2788436cd02f16e8f939fe6d", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a29961d2788436cd02f16e8f939fe6d") : new a(2, sessionId);
    }
}
