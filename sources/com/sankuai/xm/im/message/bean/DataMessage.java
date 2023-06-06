package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes6.dex */
public class DataMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int insId;
    private int insType;
    private byte[] message;
    private JSONObject msg;
    private int type;

    public DataMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1bfdc54bfdfc322832329891a1af857", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1bfdc54bfdfc322832329891a1af857");
            return;
        }
        this.type = 0;
        this.message = null;
        this.insId = -1;
        this.insType = -1;
        setMsgType(-2);
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public byte[] getMessage() {
        return this.message;
    }

    public void setMessage(byte[] bArr) {
        this.message = bArr;
    }

    public int getInsId() {
        return this.insId;
    }

    public void setInsId(int i) {
        this.insId = i;
    }

    public int getInsType() {
        return this.insType;
    }

    public void setInsType(int i) {
        this.insType = i;
    }

    public JSONObject getMsg() {
        return this.msg;
    }

    public void setMsg(JSONObject jSONObject) {
        this.msg = jSONObject;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe25e8e1a0f78933350e8d396fe1ef00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe25e8e1a0f78933350e8d396fe1ef00");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof DataMessage) {
            DataMessage dataMessage = (DataMessage) iMMessage;
            dataMessage.type = this.type;
            dataMessage.message = this.message;
            dataMessage.insId = this.insId;
            dataMessage.insType = this.insType;
            dataMessage.msg = this.msg;
        }
    }
}
