package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiContentInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8321868805163063009L;
    @SerializedName("content_schema")
    private String contentSchema;

    public String getContentSchema() {
        return this.contentSchema;
    }

    public static PoiContentInfo fromJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9d83bfede5708ca3004f2f036e1393ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiContentInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9d83bfede5708ca3004f2f036e1393ff");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (PoiContentInfo) i.a(str, PoiContentInfo.class);
    }
}
