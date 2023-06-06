package com.sankuai.waimai.store.im.inquiry.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.upload.ImageInfo;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PatientInfoAndImgsData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("pictures")
    public List<ImageInfo> patientImgs;
    @SerializedName("text")
    public String patientInfoStr;
    @SerializedName("title")
    public String title;

    public void copy(PatientInfoAndImgsData patientInfoAndImgsData) {
        Object[] objArr = {patientInfoAndImgsData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82b0e5588e7490bf1f0239657c9ba732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82b0e5588e7490bf1f0239657c9ba732");
        } else if (patientInfoAndImgsData != null) {
            this.patientInfoStr = patientInfoAndImgsData.patientInfoStr;
            this.patientImgs = patientInfoAndImgsData.patientImgs;
        } else {
            this.patientInfoStr = "";
            this.patientImgs = null;
        }
    }

    public void clear() {
        this.patientInfoStr = "";
        this.patientImgs = null;
    }
}
