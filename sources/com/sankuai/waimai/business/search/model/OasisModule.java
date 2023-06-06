package com.sankuai.waimai.business.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OasisModule {
    public static final int OASIS_MODULE_TRACKABLE_TYPE_NOT_DETERMINED = 0;
    public static final int OASIS_MODULE_TRACKABLE_TYPE_NOT_TRACKABLE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("business_id")
    public String bizId;
    @SerializedName("default_template_id")
    public String defaultTemplateId;
    @SerializedName("mach_template_id")
    public String machTemplateId;
    @SerializedName("module_id")
    public String moduleId;
    @SerializedName("native_template_id")
    public String nativeTemplateId;
    @SerializedName("string_data")
    public String stringData;
    @SerializedName("template_type")
    public int templateType;
    @SerializedName("place_holder")
    public int trackableType;
    @SerializedName(Constants.Environment.KEY_UNION_ID)
    public String unionId;
}
