package com.dianping.titans.offline.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PresetConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(Constants.ModelBeanConstants.KEY_BUNDLE_NAME)
    @Expose
    public String bundleName;
    @SerializedName("forbiddenVersion")
    @Expose
    public List<String> forbiddenVersion;
}
