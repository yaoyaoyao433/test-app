package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class NoticeMessage extends MediaMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mContent;
    private String mImage;
    private String mLink;
    private String mTitle;

    public NoticeMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bef0ff93626775fcef326cd37ba191a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bef0ff93626775fcef326cd37ba191a");
            return;
        }
        this.mTitle = "";
        this.mImage = "";
        this.mContent = "";
        this.mLink = "";
        setMsgType(14);
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

    @Override // com.sankuai.xm.im.message.bean.MediaMessage, com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ada43f9a1ab7ae0b476c7642ecff2ab0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ada43f9a1ab7ae0b476c7642ecff2ab0");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof NoticeMessage) {
            NoticeMessage noticeMessage = (NoticeMessage) iMMessage;
            noticeMessage.mTitle = this.mTitle;
            noticeMessage.mImage = this.mImage;
            noticeMessage.mContent = this.mContent;
            noticeMessage.mLink = this.mLink;
        }
    }
}
