package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GeneralMessage extends IMMessage {
    public static final int TYPE_CALL_1V1 = 1;
    public static final int TYPE_CALL_MEETING = 2;
    public static final int TYPE_GROUP_VOTE = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    private byte[] mData;
    private String mSummary;
    private int mType;

    public GeneralMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c5b4a51b3226424d4a8f22f6444fcda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c5b4a51b3226424d4a8f22f6444fcda");
        } else {
            setMsgType(17);
        }
    }

    public byte[] getData() {
        return this.mData;
    }

    public GeneralMessage setData(byte[] bArr) {
        this.mData = bArr;
        return this;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public int getType() {
        return this.mType;
    }

    public String getSummary() {
        return this.mSummary;
    }

    public void setSummary(String str) {
        this.mSummary = str;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d043a3951c3b868e2ce3adea37d3c34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d043a3951c3b868e2ce3adea37d3c34");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof GeneralMessage) {
            GeneralMessage generalMessage = (GeneralMessage) iMMessage;
            generalMessage.mData = this.mData;
            generalMessage.mType = this.mType;
            generalMessage.mSummary = this.mSummary;
        }
    }
}
