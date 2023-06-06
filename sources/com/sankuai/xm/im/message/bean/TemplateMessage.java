package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TemplateMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mContent;
    private String mContentTitle;
    private String mLink;
    private String mLinkName;
    private String mTemplateName;

    public TemplateMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b35ff5a129d661001d359404586b63d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b35ff5a129d661001d359404586b63d1");
            return;
        }
        this.mTemplateName = "";
        this.mContentTitle = "";
        this.mContent = "";
        this.mLinkName = "";
        this.mLink = "";
        setMsgType(13);
    }

    public String getTemplateName() {
        return this.mTemplateName;
    }

    public void setTemplateName(String str) {
        this.mTemplateName = str;
    }

    public String getContentTitle() {
        return this.mContentTitle;
    }

    public void setContentTitle(String str) {
        this.mContentTitle = str;
    }

    public String getContent() {
        return this.mContent;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public String getLinkName() {
        return this.mLinkName;
    }

    public void setLinkName(String str) {
        this.mLinkName = str;
    }

    public String getLink() {
        return this.mLink;
    }

    public void setLink(String str) {
        this.mLink = str;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38159eaaafcb705cf34da529f46b6864", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38159eaaafcb705cf34da529f46b6864");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof TemplateMessage) {
            TemplateMessage templateMessage = (TemplateMessage) iMMessage;
            templateMessage.mTemplateName = this.mTemplateName;
            templateMessage.mContentTitle = this.mContentTitle;
            templateMessage.mContent = this.mContent;
            templateMessage.mLinkName = this.mLinkName;
            templateMessage.mLink = this.mLink;
        }
    }
}
