package com.meituan.android.customerservice.retrofit.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FloatingInfoBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int budget;
    private String chatId;
    private int expireTime;
    private boolean isNeedRequest;
    private boolean isShow;
    private String messageId;
    private String pageName;
    private long timestamp;
    private String type;
    private String url;
    private String visitId;

    public int getBudget() {
        return this.budget;
    }

    public void setBudget(int i) {
        this.budget = i;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getVisitId() {
        return this.visitId;
    }

    public void setVisitId(String str) {
        this.visitId = str;
    }

    public boolean getIsShow() {
        return this.isShow;
    }

    public void setIsShow(boolean z) {
        this.isShow = z;
    }

    public int getExpireTime() {
        return this.expireTime;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setExpireTime(int i) {
        this.expireTime = i;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public boolean getIsNeedRequest() {
        return this.isNeedRequest;
    }

    public void setIsNeedRequest(boolean z) {
        this.isNeedRequest = z;
    }

    public void setTimestamp(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78082f6d9d44ef156cbd0cae3e0f1ff2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78082f6d9d44ef156cbd0cae3e0f1ff2");
        } else {
            this.timestamp = j;
        }
    }

    public String getPageName() {
        return this.pageName;
    }

    public void setPageName(String str) {
        this.pageName = str;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2997e50596c1fc53d3f3371eed50816", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2997e50596c1fc53d3f3371eed50816");
        }
        return "isShow=" + this.isShow + ",budget=" + this.budget + ",chatId=" + this.chatId + ",visitId=" + this.visitId + ",url=" + this.url + ",expireTime=" + this.expireTime + ",messageId=" + this.messageId + ",timestamp=" + this.timestamp + ",pageName=" + this.pageName + ",type=" + this.type;
    }
}
