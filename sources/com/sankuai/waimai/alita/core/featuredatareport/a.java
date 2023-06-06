package com.sankuai.waimai.alita.core.featuredatareport;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static String b = "AlitaFeatureDataReportConfig";
    String c;
    public int d;

    @Nullable
    public static a a(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76465ffe92e59147da1074848e5f5263", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76465ffe92e59147da1074848e5f5263");
        }
        if (jSONObject != null) {
            a aVar = new a();
            aVar.c = jSONObject.optString("bundleId");
            aVar.d = jSONObject.optInt("sampleRate", 0);
            return aVar;
        }
        return null;
    }
}
