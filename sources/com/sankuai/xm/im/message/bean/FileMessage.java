package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class FileMessage extends MediaMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mFileId;
    private String mFormat;
    private String mLinkId;

    public FileMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b465dd6d6d3578a0cd07ebce0ed3f5ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b465dd6d6d3578a0cd07ebce0ed3f5ea");
            return;
        }
        this.mFileId = "";
        this.mFormat = "";
        this.mLinkId = "";
        setMsgType(8);
    }

    public String getFileId() {
        return this.mFileId;
    }

    public void setFileId(String str) {
        this.mFileId = str;
    }

    public String getFormat() {
        return this.mFormat;
    }

    public void setFormat(String str) {
        this.mFormat = str;
    }

    public String getLinkId() {
        return this.mLinkId;
    }

    public void setLinkId(String str) {
        this.mLinkId = str;
    }

    @Override // com.sankuai.xm.im.message.bean.MediaMessage, com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f52896c56f756c1619633fcaf2bd4907", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f52896c56f756c1619633fcaf2bd4907");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof FileMessage) {
            FileMessage fileMessage = (FileMessage) iMMessage;
            fileMessage.mFileId = this.mFileId;
            fileMessage.mFormat = this.mFormat;
            fileMessage.mLinkId = this.mLinkId;
        }
    }
}
