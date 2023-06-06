package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DynamicMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mAppData;
    private String mDxData;
    private long mId;
    private String mTitle;

    public DynamicMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a45d5bd04475985627f6f15023afb335", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a45d5bd04475985627f6f15023afb335");
        } else {
            setMsgType(21);
        }
    }

    public long getId() {
        return this.mId;
    }

    public void setId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c48c82ecd867fe7c44acb9a6e6eb91c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c48c82ecd867fe7c44acb9a6e6eb91c6");
        } else {
            this.mId = j;
        }
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String getDxData() {
        return this.mDxData;
    }

    public void setDxData(String str) {
        this.mDxData = str;
    }

    public String getAppData() {
        return this.mAppData;
    }

    public void setAppData(String str) {
        this.mAppData = str;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bbbb3e4b4859a5ddbdb2ad64f820737", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bbbb3e4b4859a5ddbdb2ad64f820737");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof DynamicMessage) {
            DynamicMessage dynamicMessage = (DynamicMessage) iMMessage;
            dynamicMessage.mId = this.mId;
            dynamicMessage.mTitle = this.mTitle;
            dynamicMessage.mDxData = this.mDxData;
            dynamicMessage.mAppData = this.mAppData;
        }
    }
}
