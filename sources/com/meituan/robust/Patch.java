package com.meituan.robust;

import android.text.TextUtils;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Patch implements Cloneable {
    private String appHash;
    private boolean isAppliedSuccess;
    private String localPath;
    private String md5;
    private String name;
    private String patchesInfoImplClassFullName;
    private String tempPath;
    private String url;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getLocalPath() {
        return this.localPath + ".apk";
    }

    public void setLocalPath(String str) {
        this.localPath = str;
    }

    public String getMd5() {
        return this.md5;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public boolean isAppliedSuccess() {
        return this.isAppliedSuccess;
    }

    public void setAppliedSuccess(boolean z) {
        this.isAppliedSuccess = z;
    }

    public void delete(String str) {
        new File(str).delete();
    }

    void clearTempPath() {
        if (!TextUtils.isEmpty(this.tempPath)) {
            delete(this.tempPath);
        }
        this.tempPath = "";
    }

    public String getPatchesInfoImplClassFullName() {
        return this.patchesInfoImplClassFullName;
    }

    public void setPatchesInfoImplClassFullName(String str) {
        this.patchesInfoImplClassFullName = str;
    }

    public String getAppHash() {
        return this.appHash;
    }

    public void setAppHash(String str) {
        this.appHash = str;
    }

    public String getTempPath() {
        return this.tempPath + "_temp.apk";
    }

    public void setTempPath(String str) {
        this.tempPath = str;
    }

    /* renamed from: clone */
    public Patch m13clone() {
        try {
            return (Patch) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Patch) && !TextUtils.isEmpty(this.md5)) {
            return this.md5.equals(((Patch) obj).getMd5());
        }
        return super.equals(obj);
    }

    public int hashCode() {
        if (TextUtils.isEmpty(this.md5)) {
            return super.hashCode();
        }
        return this.md5.hashCode();
    }

    public String toString() {
        return "md5:" + this.md5 + ";name:" + this.name + ";url:" + this.url + ";apkHash:" + this.appHash + ";isAppliedSuccess:" + this.isAppliedSuccess;
    }
}
