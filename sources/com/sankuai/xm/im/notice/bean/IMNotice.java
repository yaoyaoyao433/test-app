package com.sankuai.xm.im.notice.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class IMNotice {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mCategory;
    private short mChannel;
    private long mChatId;
    private long mCts;
    private String mData;
    private int mType;

    public long getChatId() {
        return this.mChatId;
    }

    public void setChatId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd9d33012348a189671a435ce7836c1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd9d33012348a189671a435ce7836c1b");
        } else {
            this.mChatId = j;
        }
    }

    public int getCategory() {
        return this.mCategory;
    }

    public void setCategory(int i) {
        this.mCategory = i;
    }

    public int getType() {
        return this.mType;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public long getCts() {
        return this.mCts;
    }

    public void setCts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fb3caca855f6fa1a2b70908d94a75ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fb3caca855f6fa1a2b70908d94a75ee");
        } else {
            this.mCts = j;
        }
    }

    public String getData() {
        return this.mData;
    }

    public void setData(String str) {
        this.mData = str;
    }

    public short getChannel() {
        return this.mChannel;
    }

    public void setChannel(short s) {
        this.mChannel = s;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45681fd90eb1beed6d6700ea082d02a1", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45681fd90eb1beed6d6700ea082d02a1");
        }
        return "IMNotice{chatId=" + this.mChatId + ", category=" + this.mCategory + ", type=" + this.mType + ", cts=" + this.mCts + ", data='" + this.mData + ", channel='" + ((int) this.mChannel) + "'}";
    }
}
