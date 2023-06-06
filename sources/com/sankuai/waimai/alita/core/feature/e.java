package com.sankuai.waimai.alita.core.feature;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    @SerializedName("bizName")
    public String b;
    @SerializedName("tableKey")
    public String c;
    @SerializedName("features")
    public JSONObject d;

    @Nullable
    public static e a(String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d0b15ff14085c868d7a9793e8cdaebe", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d0b15ff14085c868d7a9793e8cdaebe");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        e eVar = new e();
        eVar.b = str;
        eVar.c = str2;
        eVar.d = jSONObject;
        return eVar;
    }
}
