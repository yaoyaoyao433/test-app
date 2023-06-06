package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OasisModule implements Cloneable {
    public static final int TEMPLATE_TYPE_MACH = 1;
    public static final int TEMPLATE_TYPE_NATIVE = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    @Expose(deserialize = false, serialize = false)
    public Serializable data;
    @SerializedName("default_template_id")
    public String defaultTemplateId;
    @SerializedName("layout_info")
    public SearchLayoutInfo layoutInfo;
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
    @SerializedName(Constants.Environment.KEY_UNION_ID)
    public String unionId;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SearchLayoutInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("template_style")
        public int templateStyle;
    }

    public Object clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fb87ee8b670c390b65492ebc73dedb4", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fb87ee8b670c390b65492ebc73dedb4");
        }
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }
}
