package com.sankuai.titans.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class TitansWebPageContext implements ITitansWebPageContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ITitansContainerContext containerContext;
    private final String originalUrl;
    private final long pageStartedTime;
    private final String referrer;
    private String ua;
    private String url;

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setUA(String str) {
        this.ua = str;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansWebPageContext
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansWebPageContext
    public final String getUrl() {
        return this.url;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansWebPageContext
    public final String getUA() {
        return this.ua;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansWebPageContext
    public final String getReferrer() {
        return this.referrer;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansWebPageContext
    public final long getPageStartedTime() {
        return this.pageStartedTime;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansWebPageContext
    public final ITitansContainerContext getContainerContext() {
        return this.containerContext;
    }

    public TitansWebPageContext(String str, String str2, long j, ITitansContainerContext iTitansContainerContext) {
        Object[] objArr = {str, str2, new Long(j), iTitansContainerContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d181711b758a3e1a034ed89b3443e223", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d181711b758a3e1a034ed89b3443e223");
            return;
        }
        this.originalUrl = str;
        this.referrer = str2;
        this.pageStartedTime = j;
        this.containerContext = iTitansContainerContext;
    }
}
