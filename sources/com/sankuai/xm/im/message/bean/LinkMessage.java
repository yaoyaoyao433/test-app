package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class LinkMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mContent;
    private String mImage;
    private String mLink;
    private String mTitle;

    public LinkMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8f3320a80f2776d11422d281ef10345", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8f3320a80f2776d11422d281ef10345");
            return;
        }
        this.mTitle = "";
        this.mImage = "";
        this.mContent = "";
        this.mLink = "";
        setMsgType(6);
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String getImage() {
        return this.mImage;
    }

    public void setImage(String str) {
        this.mImage = str;
    }

    public String getContent() {
        return this.mContent;
    }

    public void setContent(String str) {
        this.mContent = str;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2324f85f2a49d60f8060a2aefd51a5f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2324f85f2a49d60f8060a2aefd51a5f0");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof LinkMessage) {
            LinkMessage linkMessage = (LinkMessage) iMMessage;
            linkMessage.mTitle = this.mTitle;
            linkMessage.mImage = this.mImage;
            linkMessage.mContent = this.mContent;
            linkMessage.mLink = this.mLink;
        }
    }
}
