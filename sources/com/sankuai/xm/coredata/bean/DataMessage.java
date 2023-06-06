package com.sankuai.xm.coredata.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DataMessage extends BaseDataMsg {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected short mChannel;
    protected int mType;

    public DataMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9713bdf62003bc89e58e136ad6ffebbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9713bdf62003bc89e58e136ad6ffebbe");
            return;
        }
        this.mType = 0;
        this.mChannel = (short) 0;
    }

    public short getChannel() {
        return this.mChannel;
    }

    public void setChannel(short s) {
        this.mChannel = s;
    }

    public int getType() {
        return this.mType;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "667e0a035693428b363b3925dce1cf6e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "667e0a035693428b363b3925dce1cf6e")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        DataMessage dataMessage = (DataMessage) obj;
        return this.mMsgUuid != null ? this.mMsgUuid.equals(dataMessage.mMsgUuid) : dataMessage.mMsgUuid == null;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "813cd9e5af94bef593525d651235190e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "813cd9e5af94bef593525d651235190e");
        }
        return "DataMessage {  mMsgId=" + this.mMsgId + "  mMsgUuid=" + this.mMsgUuid + ", mType=" + this.mType + ", mChannel=" + ((int) this.mChannel) + ", mCts=" + this.mCts + '}';
    }
}
