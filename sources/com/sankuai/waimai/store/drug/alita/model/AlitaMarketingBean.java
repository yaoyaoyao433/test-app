package com.sankuai.waimai.store.drug.alita.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AlitaMarketingBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data_type")
    public int dataType;
    @SerializedName("json_data")
    public Map<String, Object> jsonData;
    @SerializedName("layout_type")
    public String layoutType;
    @SerializedName("layout_info")
    public a mLayoutInfo;
    @SerializedName("module_list")
    public List<AlitaMarketingBean> mModuleList;
    @SerializedName("render_mode")
    public String renderMode;
    @SerializedName("string_data")
    public String stringData;
    @SerializedName("template_id")
    public String templateId;
    @SerializedName("view_type")
    public String viewType;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("custom")
        public String b;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e77dded5509e6105ae38f2e1ce1b7060", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e77dded5509e6105ae38f2e1ce1b7060");
            }
            return "LayoutInfo{popInfo='" + this.b + "'}";
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c823061ec9a6e8b4748cbea2212b9eff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c823061ec9a6e8b4748cbea2212b9eff");
        }
        return "AlitaMarketingBean{layoutType='" + this.layoutType + "', viewType='" + this.viewType + "', renderMode='" + this.renderMode + "', stringData='" + this.stringData + "', mLayoutInfo=" + this.mLayoutInfo + ", templateId='" + this.templateId + "', mModuleList=" + this.mModuleList + '}';
    }
}
