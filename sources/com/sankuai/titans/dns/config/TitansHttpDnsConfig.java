package com.sankuai.titans.dns.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.dns.util.GsonUtil;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansHttpDnsConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("enable")
    @Expose
    public boolean enable;
    @SerializedName("whiteList")
    @Expose
    public List<String> whiteList;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1962ddbc721f5ff1ea6f22d9b041bb09", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1962ddbc721f5ff1ea6f22d9b041bb09") : GsonUtil.getExcludeGson().toJson(this);
    }
}
