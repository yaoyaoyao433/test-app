package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AudioMessage extends MediaMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private short mCodec;
    private short mDuration;

    public AudioMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85abd8a0f5d29d0795d07ddf3bf39608", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85abd8a0f5d29d0795d07ddf3bf39608");
            return;
        }
        this.mCodec = (short) 0;
        this.mDuration = (short) 0;
        setMsgType(2);
    }

    public static AudioMessage obtain(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1e7b06af94d361c6ef5f24be64783f0", 6917529027641081856L)) {
            return (AudioMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1e7b06af94d361c6ef5f24be64783f0");
        }
        AudioMessage audioMessage = new AudioMessage();
        audioMessage.setPath(str);
        audioMessage.setMsgType(2);
        return audioMessage;
    }

    public short getCodec() {
        return this.mCodec;
    }

    public void setCodec(short s) {
        this.mCodec = s;
    }

    public short getDuration() {
        return this.mDuration;
    }

    public void setDuration(short s) {
        this.mDuration = s;
    }

    @Override // com.sankuai.xm.im.message.bean.MediaMessage, com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f96193268910febf53f7d8313b679a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f96193268910febf53f7d8313b679a3");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof AudioMessage) {
            AudioMessage audioMessage = (AudioMessage) iMMessage;
            audioMessage.mCodec = this.mCodec;
            audioMessage.mDuration = this.mDuration;
        }
    }
}
