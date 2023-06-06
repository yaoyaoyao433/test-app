package com.meituan.android.customerservice.channel.retrofit.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CaseUploadVoucherSyncRequest implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String uploadContent;
    private List<UploadFileResultEntity> uploadFileInfos;
    private String uploadType;

    public List<UploadFileResultEntity> getUploadFileInfos() {
        return this.uploadFileInfos;
    }

    public void setUploadFileInfos(List<UploadFileResultEntity> list) {
        this.uploadFileInfos = list;
    }

    public String getUploadContent() {
        return this.uploadContent;
    }

    public void setUploadContent(String str) {
        this.uploadContent = str;
    }

    public String getUploadType() {
        return this.uploadType;
    }

    public void setUploadType(String str) {
        this.uploadType = str;
    }
}
