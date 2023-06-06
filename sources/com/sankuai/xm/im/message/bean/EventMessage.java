package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class EventMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mText;
    private String mType;

    public EventMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2b8355b5545ea2864dbe32f8a0a3d61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2b8355b5545ea2864dbe32f8a0a3d61");
            return;
        }
        this.mType = "";
        this.mText = "";
        setMsgType(12);
    }

    public String getType() {
        return this.mType;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public String getText() {
        return this.mText;
    }

    public void setText(String str) {
        this.mText = str;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9bfbd7b5f586405d54db13dcdea6a87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9bfbd7b5f586405d54db13dcdea6a87");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof EventMessage) {
            EventMessage eventMessage = (EventMessage) iMMessage;
            eventMessage.mType = this.mType;
            eventMessage.mText = this.mText;
        }
    }
}
