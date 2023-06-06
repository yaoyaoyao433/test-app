package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VCardMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mAccount;
    private String mName;
    private short mSubType;
    private short mType;
    private long mUid;

    public VCardMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9a88eb6c63a8190c996dd5b1bbb6b99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9a88eb6c63a8190c996dd5b1bbb6b99");
            return;
        }
        this.mUid = 0L;
        this.mName = "";
        this.mAccount = "";
        this.mType = (short) 0;
        this.mSubType = (short) 0;
        setMsgType(10);
    }

    public long getUid() {
        return this.mUid;
    }

    public void setUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52e41a8b641d8d86cae501368f67af8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52e41a8b641d8d86cae501368f67af8a");
        } else {
            this.mUid = j;
        }
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public String getAccount() {
        return this.mAccount;
    }

    public void setAccount(String str) {
        this.mAccount = str;
    }

    public short getType() {
        return this.mType;
    }

    public void setType(short s) {
        this.mType = s;
    }

    public short getSubType() {
        return this.mSubType;
    }

    public void setSubType(short s) {
        this.mSubType = s;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46c0a0f6d681d063011e2ac3952a0826", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46c0a0f6d681d063011e2ac3952a0826");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof VCardMessage) {
            VCardMessage vCardMessage = (VCardMessage) iMMessage;
            vCardMessage.mUid = this.mUid;
            vCardMessage.mName = this.mName;
            vCardMessage.mAccount = this.mAccount;
            vCardMessage.mType = this.mType;
            vCardMessage.mSubType = this.mSubType;
        }
    }
}
