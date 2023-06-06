package com.sankuai.waimai.rocks.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class RocksServerModel implements Cloneable {
    public static final int DATA_TYPE_JSON = 0;
    public static final int DATA_TYPE_STRING = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("action")
    public String action;
    @SerializedName("ad_click_info")
    public String adClickInfo;
    @SerializedName("ad_view_info")
    public String adViewInfo;
    @SerializedName("data_id")
    public String dataId;
    @SerializedName("data_type")
    public int dataType;
    public boolean isCache;
    @SerializedName("is_loading")
    public String isLoading;
    @SerializedName("is_Main_url")
    public String isMainUrl;
    @SerializedName("json_data")
    public Map<String, Object> jsonData;
    @SerializedName("layout_info")
    public String layoutInfo;
    @SerializedName("layout_slot")
    public String layoutSlot;
    @SerializedName("layout_type")
    public String layoutType;
    @SerializedName("lx_click_info")
    public String lxClickInfo;
    @SerializedName("lx_view_info")
    public String lxViewInfo;
    @SerializedName("module_header")
    public RocksServerModel moduleHeader;
    @SerializedName("module_id")
    public String moduleId;
    @SerializedName("module_list")
    public List<RocksServerModel> moduleList;
    @SerializedName("module_list_header")
    public RocksServerModel module_list_header;
    @SerializedName("module_tab")
    public RocksServerModel module_tab;
    @SerializedName("module_tabs")
    public RocksServerModel module_tabs;
    @SerializedName("params")
    public String params;
    @SerializedName("render_mode")
    public String renderMode;
    @SerializedName("string_data")
    public String stringData;
    @SerializedName("template_id")
    public String templateId;
    @SerializedName("template_ph_id")
    public String templatePhId;
    @SerializedName("url")
    public String url;
    @SerializedName("view_type")
    public String viewType;

    public Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be9840f7e72c1bbd2e69c9f64a3a6598", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be9840f7e72c1bbd2e69c9f64a3a6598") : super.clone();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1febe3e18be86c8cf3a65a804a49ef39", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1febe3e18be86c8cf3a65a804a49ef39");
        }
        return "RocksServerModel{renderMode='" + this.renderMode + "', viewType='" + this.viewType + "', moduleId='" + this.moduleId + "', url='" + this.url + "', params='" + this.params + "', layoutInfo='" + this.layoutInfo + "', dataType=" + this.dataType + ", jsonData=" + this.jsonData + ", stringData='" + this.stringData + "', layoutType='" + this.layoutType + "', moduleHeader=" + this.moduleHeader + ", moduleList=" + this.moduleList + ", module_tabs=" + this.module_tabs + ", isMainUrl='" + this.isMainUrl + "', isLoading='" + this.isLoading + "', layoutSlot='" + this.layoutSlot + "', templateId='" + this.templateId + "', templatePhId='" + this.templatePhId + "', dataId='" + this.dataId + "', lxViewInfo='" + this.lxViewInfo + "', lxClickInfo='" + this.lxClickInfo + "', adViewInfo='" + this.adViewInfo + "', adClickInfo='" + this.adClickInfo + "', action='" + this.action + "'}";
    }
}
