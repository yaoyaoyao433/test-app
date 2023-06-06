package com.meituan.crashreporter.container;

import com.meituan.android.common.metricx.helpers.UserActionsProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.meituan.snare.a {
    public static ChangeQuickRedirect a;
    private static a b = new a();

    @Override // com.meituan.snare.a
    public final void a(String str, boolean z, boolean z2) {
    }

    public static a a() {
        return b;
    }

    @Override // com.meituan.snare.a
    public final Map<String, String> a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df28046db3241232fd3e6125aab4f915", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df28046db3241232fd3e6125aab4f915");
        }
        JSONArray jSONArray = new JSONArray();
        for (c cVar : d.b().a()) {
            jSONArray.put(cVar.d());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("containerInfo", jSONArray.toString());
        hashMap.put("aliveActivitis", UserActionsProvider.getInstance().getAliveActivityInfo());
        return hashMap;
    }
}
