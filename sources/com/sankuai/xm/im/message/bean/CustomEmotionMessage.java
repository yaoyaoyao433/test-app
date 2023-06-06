package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CustomEmotionMessage extends EmotionMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mEmotionFileType;
    private String mId;
    private String mPackageId;
    private String mPackageName;
    private String mParams;

    public CustomEmotionMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4aeb946ded2379524422231ebf480977", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4aeb946ded2379524422231ebf480977");
            return;
        }
        this.mEmotionFileType = 0;
        setMsgType(19);
    }

    public String getPackageId() {
        return this.mPackageId;
    }

    public void setPackageId(String str) {
        this.mPackageId = str;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public void setPackageName(String str) {
        this.mPackageName = str;
    }

    public String getId() {
        return this.mId;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public String getParams() {
        return this.mParams;
    }

    public void setParams(String str) {
        this.mParams = str;
    }

    public String getEmotionFileStringType() {
        switch (this.mEmotionFileType) {
            case 1:
                return "BIG";
            case 2:
                return "STATIC";
            default:
                return "THUMB";
        }
    }

    public void setEmotionFileType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6f2b12afcc3e51e31f487d6e3f59971", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6f2b12afcc3e51e31f487d6e3f59971");
        } else if ("STATIC".equals(str)) {
            this.mEmotionFileType = 2;
        } else if ("BIG".equals(str)) {
            this.mEmotionFileType = 1;
        } else {
            this.mEmotionFileType = 0;
        }
    }

    public void setEmotionFileType(int i) {
        this.mEmotionFileType = i;
    }

    public int getEmotionFileType() {
        return this.mEmotionFileType;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    final class EmotionType {
        public static final int BIG = 1;
        public static final int STATIC = 2;
        public static final int THUMB = 0;
        public static ChangeQuickRedirect changeQuickRedirect;

        public EmotionType() {
        }
    }

    @Override // com.sankuai.xm.im.message.bean.EmotionMessage, com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04e4f6b3788574a370f62620bd6f8787", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04e4f6b3788574a370f62620bd6f8787");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof CustomEmotionMessage) {
            CustomEmotionMessage customEmotionMessage = (CustomEmotionMessage) iMMessage;
            customEmotionMessage.mPackageId = this.mPackageId;
            customEmotionMessage.mPackageName = this.mPackageName;
            customEmotionMessage.mId = this.mId;
            customEmotionMessage.mParams = this.mParams;
            customEmotionMessage.mEmotionFileType = this.mEmotionFileType;
        }
    }
}
