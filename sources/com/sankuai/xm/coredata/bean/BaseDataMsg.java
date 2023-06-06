package com.sankuai.xm.coredata.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class BaseDataMsg {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected long mCts;
    protected byte[] mData;
    protected long mMsgId;
    protected String mMsgUuid;

    public BaseDataMsg() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fa93821af29041ae7f88df9e776a01c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fa93821af29041ae7f88df9e776a01c");
            return;
        }
        this.mMsgUuid = "";
        this.mCts = 0L;
        this.mMsgId = 0L;
        this.mData = null;
    }

    public String getMsgUuid() {
        return this.mMsgUuid;
    }

    public void setMsgUuid(String str) {
        this.mMsgUuid = str;
    }

    public long getCts() {
        return this.mCts;
    }

    public void setCts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2b8a467f565ee48a6848e40b4434d51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2b8a467f565ee48a6848e40b4434d51");
        } else {
            this.mCts = j;
        }
    }

    public long getMsgId() {
        return this.mMsgId;
    }

    public void setMsgId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0eb0be71a66b14d99c3ea4fece4be2cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0eb0be71a66b14d99c3ea4fece4be2cd");
        } else {
            this.mMsgId = j;
        }
    }

    public byte[] getData() {
        return this.mData;
    }

    public void setData(byte[] bArr) {
        this.mData = bArr;
    }
}
