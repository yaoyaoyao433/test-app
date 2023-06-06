package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class EmotionMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mGroup;
    private String mName;
    private String mType;

    public EmotionMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca245b38eda6cb54a321c75cb56819e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca245b38eda6cb54a321c75cb56819e5");
            return;
        }
        this.mGroup = "";
        this.mType = "";
        this.mName = "";
        setMsgType(11);
    }

    public String getGroup() {
        return this.mGroup;
    }

    public void setGroup(String str) {
        this.mGroup = str;
    }

    public String getType() {
        return this.mType;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String str) {
        this.mName = str;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a5e9309cd933196399fd36a1c259009", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a5e9309cd933196399fd36a1c259009");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof EmotionMessage) {
            EmotionMessage emotionMessage = (EmotionMessage) iMMessage;
            emotionMessage.mGroup = this.mGroup;
            emotionMessage.mType = this.mType;
            emotionMessage.mName = this.mName;
        }
    }
}
