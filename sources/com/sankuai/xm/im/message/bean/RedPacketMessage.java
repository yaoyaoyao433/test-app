package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RedPacketMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mGreetings;
    private long mID;
    private short mType;

    public RedPacketMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "212bb06072bc00e6432faf0aaf8c7f7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "212bb06072bc00e6432faf0aaf8c7f7a");
            return;
        }
        this.mID = 0L;
        this.mType = (short) 0;
        this.mGreetings = "";
        setMsgType(16);
    }

    public long getID() {
        return this.mID;
    }

    public RedPacketMessage setID(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "896b0bd50d6a13be96bb09c57615494b", 6917529027641081856L)) {
            return (RedPacketMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "896b0bd50d6a13be96bb09c57615494b");
        }
        this.mID = j;
        return this;
    }

    public short getType() {
        return this.mType;
    }

    public RedPacketMessage setType(short s) {
        this.mType = s;
        return this;
    }

    public String getGreetings() {
        return this.mGreetings;
    }

    public RedPacketMessage setGreetings(String str) {
        this.mGreetings = str;
        return this;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f18ce66abd0e0045d05346ecf8531fb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f18ce66abd0e0045d05346ecf8531fb5");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof RedPacketMessage) {
            RedPacketMessage redPacketMessage = (RedPacketMessage) iMMessage;
            redPacketMessage.mID = this.mID;
            redPacketMessage.mType = this.mType;
            redPacketMessage.mGreetings = this.mGreetings;
        }
    }
}
