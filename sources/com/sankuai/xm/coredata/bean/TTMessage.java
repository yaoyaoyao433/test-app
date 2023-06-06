package com.sankuai.xm.coredata.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TTMessage extends BaseDataMsg {
    public static ChangeQuickRedirect changeQuickRedirect;
    private short mFromAppId;
    private long mFromUid;
    private int mPushType;
    private int mRetries;
    private short mToAppId;
    private long mToUid;

    public TTMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "461a43ff2958d0df15c59d64596626a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "461a43ff2958d0df15c59d64596626a8");
        } else {
            this.mPushType = 2;
        }
    }

    public long getToUid() {
        return this.mToUid;
    }

    public void setToUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6826bdbb727c8dfaf5c7ce2c136ab239", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6826bdbb727c8dfaf5c7ce2c136ab239");
        } else {
            this.mToUid = j;
        }
    }

    public short getToAppId() {
        return this.mToAppId;
    }

    public void setToAppId(short s) {
        this.mToAppId = s;
    }

    public long getFromUid() {
        return this.mFromUid;
    }

    public void setFromUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "915a412d3a0ec519e5a6a49106881523", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "915a412d3a0ec519e5a6a49106881523");
        } else {
            this.mFromUid = j;
        }
    }

    public short getFromAppId() {
        return this.mFromAppId;
    }

    public void setFromAppId(short s) {
        this.mFromAppId = s;
    }

    public int getRetries() {
        return this.mRetries;
    }

    public void setRetries(int i) {
        this.mRetries = i;
    }

    public int getPushType() {
        return this.mPushType;
    }

    public void setPushType(int i) {
        this.mPushType = i;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af7f2401356fc1f1901a1f8e859bd9d1", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af7f2401356fc1f1901a1f8e859bd9d1")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        TTMessage tTMessage = (TTMessage) obj;
        return this.mMsgUuid != null ? this.mMsgUuid.equals(tTMessage.mMsgUuid) : tTMessage.mMsgUuid == null;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86bfa25fe5d2b399282c9b748c1251ab", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86bfa25fe5d2b399282c9b748c1251ab");
        }
        return "TTMessage{mMsgUuid='" + this.mMsgUuid + "', mToUid=" + this.mToUid + ", mCts=" + this.mCts + ", mMsgId=" + this.mMsgId + ", mToAppId=" + ((int) this.mToAppId) + ", mRetries=" + this.mRetries + ", mPushType=" + this.mPushType + '}';
    }
}
