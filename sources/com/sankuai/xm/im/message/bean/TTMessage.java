package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes6.dex */
public class TTMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private byte[] mData;
    private int mPushType;

    public TTMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef48c78316f156ac4e5fdc90d6d3d47a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef48c78316f156ac4e5fdc90d6d3d47a");
            return;
        }
        this.mData = null;
        this.mPushType = 0;
        setMsgType(-1);
    }

    public void setPushType(int i) {
        this.mPushType = i;
    }

    public int getPushType() {
        return this.mPushType;
    }

    public byte[] getData() {
        return this.mData;
    }

    public TTMessage setData(byte[] bArr) {
        this.mData = bArr;
        return this;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "389666c45beeba9405622c26ab69ef51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "389666c45beeba9405622c26ab69ef51");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof TTMessage) {
            TTMessage tTMessage = (TTMessage) iMMessage;
            tTMessage.mData = this.mData;
            tTMessage.mPushType = this.mPushType;
        }
    }
}
