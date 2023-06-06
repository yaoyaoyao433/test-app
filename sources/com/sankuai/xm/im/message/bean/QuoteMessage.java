package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class QuoteMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String mQuotedMessages;
    public String mSearchText;
    public String mSelectedMessage;

    public QuoteMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87f01bfbebbfbb31b7c389ef8cc16dd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87f01bfbebbfbb31b7c389ef8cc16dd1");
            return;
        }
        this.mSelectedMessage = "";
        this.mQuotedMessages = "";
        this.mSearchText = "";
        setMsgType(20);
    }

    public String getSelectedMessage() {
        return this.mSelectedMessage;
    }

    public void setSelectedMessage(String str) {
        this.mSelectedMessage = str;
    }

    public String getQuotedMessage() {
        return this.mQuotedMessages;
    }

    public void setQuotedMessage(String str) {
        this.mQuotedMessages = str;
    }

    public String getSearchText() {
        return this.mSearchText;
    }

    public void setSearchText(String str) {
        this.mSearchText = str;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ea8dd2986c5d79a92f09a1f45d3a36a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ea8dd2986c5d79a92f09a1f45d3a36a");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof QuoteMessage) {
            QuoteMessage quoteMessage = (QuoteMessage) iMMessage;
            quoteMessage.mSelectedMessage = this.mSelectedMessage;
            quoteMessage.mQuotedMessages = this.mQuotedMessages;
            quoteMessage.mSearchText = this.mSearchText;
            quoteMessage.mSearchText = this.mSearchText;
        }
    }

    @Override // com.sankuai.xm.im.message.bean.Message
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ff8fcd954b32563125fb720f76685ca", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ff8fcd954b32563125fb720f76685ca");
        }
        return "QuoteMessage{mSelectedMessage='" + this.mSelectedMessage + "', mQuotedMessages='" + this.mQuotedMessages + "', mSearchText='" + this.mSearchText + "', key = " + super.keyParamToString() + '}';
    }
}
