package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MultiLinkMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mContent;
    private short mNum;

    public MultiLinkMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cb014930dfca33d8380c6fa9fd6bfc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cb014930dfca33d8380c6fa9fd6bfc7");
            return;
        }
        this.mNum = (short) 0;
        this.mContent = "";
        setMsgType(7);
    }

    public short getNum() {
        return this.mNum;
    }

    public void setNum(short s) {
        this.mNum = s;
    }

    public String getContent() {
        return this.mContent;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85282e001ac67d43909b2aaf3e574f7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85282e001ac67d43909b2aaf3e574f7b");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof MultiLinkMessage) {
            MultiLinkMessage multiLinkMessage = (MultiLinkMessage) iMMessage;
            multiLinkMessage.mNum = this.mNum;
            multiLinkMessage.mContent = this.mContent;
        }
    }
}
