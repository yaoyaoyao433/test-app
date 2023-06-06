package com.sankuai.xm.im.message.history;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.history.HistoryController;
import com.sankuai.xm.im.session.SessionId;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements HistoryController.HistoryMessageCallback {
    public static ChangeQuickRedirect a;
    int b;
    private HistoryController.HistoryMessageCallback c;

    public b(HistoryController.HistoryMessageCallback historyMessageCallback, boolean z, boolean z2) {
        Object[] objArr = {historyMessageCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa33c77a913429c6e8a6a6727ef2b3df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa33c77a913429c6e8a6a6727ef2b3df");
            return;
        }
        this.c = historyMessageCallback;
        this.b = z ? 4 : 2;
        if (z2) {
            return;
        }
        this.b = 3;
    }

    @Override // com.sankuai.xm.im.message.history.HistoryController.HistoryMessageCallback
    public final void onFailure(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "407e4342ac6fdb0731795b214fdff53f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "407e4342ac6fdb0731795b214fdff53f");
        } else if (this.c != null) {
            this.c.onFailure(i, str);
        }
    }

    @Override // com.sankuai.xm.im.message.history.HistoryController.HistoryMessageCallback
    public final void onSuccess(SessionId sessionId, List<IMMessage> list, boolean z) {
        Object[] objArr = {sessionId, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "469849081ad0588380f5041b62e0f695", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "469849081ad0588380f5041b62e0f695");
        } else if (this.c != null) {
            this.c.onSuccess(sessionId, list, z);
        }
    }
}
