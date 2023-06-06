package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.session.SessionId;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SearchMessageRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String searchKey;
    private SessionId targetSession;

    public SearchMessageRequest(String str, SessionId sessionId) {
        Object[] objArr = {str, sessionId};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d9cf442ca9452befc35b66afd534ea1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d9cf442ca9452befc35b66afd534ea1");
            return;
        }
        this.searchKey = str;
        this.targetSession = sessionId;
    }

    public String getSearchKey() {
        return this.searchKey;
    }

    public SessionId getTargetSession() {
        return this.targetSession;
    }
}
