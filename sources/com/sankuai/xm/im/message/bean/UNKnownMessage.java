package com.sankuai.xm.im.message.bean;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class UNKnownMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mData;
    private int mOriginalType;

    public UNKnownMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a22d3c1007ef9ef35b11ded494adcb96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a22d3c1007ef9ef35b11ded494adcb96");
            return;
        }
        this.mData = "";
        this.mOriginalType = 0;
        setMsgType(100);
    }

    public String getStringData() {
        return this.mData;
    }

    public byte[] getData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f14b6d0d1c532aea93bb0a4689ce5ce", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f14b6d0d1c532aea93bb0a4689ce5ce");
        }
        if (TextUtils.isEmpty(this.mData)) {
            return null;
        }
        return Base64.decode(this.mData, 2);
    }

    public void setData(String str) {
        this.mData = str;
    }

    public void setData(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d937cb5ed7021ffd50fb3b9d430acbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d937cb5ed7021ffd50fb3b9d430acbc");
        } else {
            this.mData = new String(Base64.encode(bArr, 2));
        }
    }

    public int getOriginalType() {
        return this.mOriginalType;
    }

    public void setOriginalType(int i) {
        this.mOriginalType = i;
    }

    public UNKnownMessage copyFrom(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acdc4277e19184153854742b550da43e", 6917529027641081856L)) {
            return (UNKnownMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acdc4277e19184153854742b550da43e");
        }
        if (iMMessage != null) {
            iMMessage.copyTo((IMMessage) this);
            setOriginalType(iMMessage.getMsgType());
            setMsgType(100);
        }
        return this;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c0fd67ce0a9bca42be3df729a2b0411", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c0fd67ce0a9bca42be3df729a2b0411");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof UNKnownMessage) {
            UNKnownMessage uNKnownMessage = (UNKnownMessage) iMMessage;
            uNKnownMessage.mData = this.mData;
            uNKnownMessage.mOriginalType = this.mOriginalType;
        }
    }
}
