package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ApiHotfixParam implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("hot_fix_stid_map")
    public Map<String, Object> hotfixMap;
}
