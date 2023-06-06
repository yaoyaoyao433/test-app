package com.meituan.android.customerservice.channel.retrofit.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UploadFileResultEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String etag;
    private String fileSize;
    private String fileType;
    private String filename;
    private String key;
    private int partNumber;
    private String uploadPath;

    public String getUploadPath() {
        return this.uploadPath;
    }

    public void setUploadPath(String str) {
        this.uploadPath = str;
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }

    public String getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(String str) {
        this.fileSize = str;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public void setPartNumber(int i) {
        this.partNumber = i;
    }

    public String getEtag() {
        return this.etag;
    }

    public void setEtag(String str) {
        this.etag = str;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "679c12e9c30ae0b42bb2f2dd39bb1d91", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "679c12e9c30ae0b42bb2f2dd39bb1d91");
        }
        return "uploadPath=" + this.uploadPath + " ,filename=" + this.filename + " ,fileType=" + this.fileType + " ,fileSize=" + this.fileSize + " ,partNumber=" + this.partNumber + " ,eTag=" + this.etag + " ,key=" + this.key;
    }
}
