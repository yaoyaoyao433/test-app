package com.meituan.met.mercury.load.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class PresetInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("dynamicAppType")
    public String business;
    public String file;
    public String fileType;
    public String id;
    public String name;
    public String originMd5;
    public String type;
    public String version;
    public String xZipMd5;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5abe20f729ca486d280cbc6b1e811461", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5abe20f729ca486d280cbc6b1e811461");
        }
        return "PresetInfo{id='" + this.id + "', name='" + this.name + "', version='" + this.version + "', file='" + this.file + "', fileType='" + this.fileType + "', type='" + this.type + "', originMd5='" + this.originMd5 + "', xZipMd5='" + this.xZipMd5 + "', business='" + this.business + "'}";
    }
}
