package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SearchMessageResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<IMMessage> messages;
    private boolean more;
    private SearchMessageRequest request;

    public SearchMessageResult(SearchMessageRequest searchMessageRequest) {
        Object[] objArr = {searchMessageRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7531ec55b80f778c3d23695af99ddae6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7531ec55b80f778c3d23695af99ddae6");
        } else {
            this.request = searchMessageRequest;
        }
    }

    public boolean isMore() {
        return this.more;
    }

    public void setMore(boolean z) {
        this.more = z;
    }

    public List<IMMessage> getMessages() {
        return this.messages;
    }

    public void setMessages(List<IMMessage> list) {
        this.messages = list;
    }

    public SearchMessageRequest getRequest() {
        return this.request;
    }
}
