package com.sankuai.waimai.alita.core.base.util;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.feature.f;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a<T> {
    public static ChangeQuickRedirect a;

    public static void a(f fVar, JSONObject jSONObject) {
        Object[] objArr = {fVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "edc6108765e165fdbbb07e3d9bbd6d9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "edc6108765e165fdbbb07e3d9bbd6d9a");
        } else if (fVar != null) {
            fVar.a(jSONObject);
        }
    }

    public static void a(f fVar, @Nullable Exception exc) {
        Object[] objArr = {fVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9637d7a8531ae0d4fa6fc919b8a1efdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9637d7a8531ae0d4fa6fc919b8a1efdb");
        } else if (fVar != null) {
            fVar.a(exc);
        }
    }
}
