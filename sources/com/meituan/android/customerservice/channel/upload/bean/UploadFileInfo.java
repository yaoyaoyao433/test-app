package com.meituan.android.customerservice.channel.upload.bean;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UploadFileInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String fileName;
    private String fileSize;
    private String fileSuffixes;
    private int fileType;
    private String key;
    private String localPath;
    private String uploadPath;
    private String uploadPhotoToken;
    private VideoData videoData;

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public String getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(String str) {
        this.fileSize = str;
    }

    public int getFileType() {
        return this.fileType;
    }

    public void setFileType(int i) {
        this.fileType = i;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public void setLocalPath(String str) {
        this.localPath = str;
    }

    public String getToken() {
        return this.uploadPhotoToken;
    }

    public void setToken(String str) {
        this.uploadPhotoToken = str;
    }

    public String getUploadPath() {
        return this.uploadPath;
    }

    public void setUploadPath(String str) {
        this.uploadPath = str;
    }

    public VideoData getVideoData() {
        return this.videoData;
    }

    public void setVideoData(VideoData videoData) {
        this.videoData = videoData;
    }

    public String getFileSuffixes() {
        return this.fileSuffixes;
    }

    public void setFileSuffixes(String str) {
        this.fileSuffixes = str;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71d373171ba2470a5efae52ea1ee16f1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71d373171ba2470a5efae52ea1ee16f1")).intValue() : Objects.hash(this.fileName);
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acbef62c66fde7ac2c6f232e9be088a6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acbef62c66fde7ac2c6f232e9be088a6")).booleanValue() : this == obj || TextUtils.equals(((UploadFileInfo) obj).fileName, this.fileName);
    }
}
