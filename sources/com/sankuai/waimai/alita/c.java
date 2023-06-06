package com.sankuai.waimai.alita;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.feature.f;
import com.sankuai.waimai.alita.core.feature.h;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements h {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.alita.base.b b;

    @Override // com.sankuai.waimai.alita.core.feature.h
    @Nullable
    public final List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ae054820ce43824c3165a741f6d398e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ae054820ce43824c3165a741f6d398e");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("ENV");
        return arrayList;
    }

    @Override // com.sankuai.waimai.alita.core.feature.h
    public final void a(@NonNull String str, List<JSONObject> list, @Nullable f fVar) {
        Object[] objArr = {str, list, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91bb1fa58ebfb89b0d66551e1e1e5730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91bb1fa58ebfb89b0d66551e1e1e5730");
        } else {
            com.sankuai.waimai.alita.core.base.util.a.a(fVar, a(str));
        }
    }

    @Override // com.sankuai.waimai.alita.core.feature.h
    public final JSONObject a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db085551a3be7bbb444ebb7101a2917d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db085551a3be7bbb444ebb7101a2917d");
        }
        com.sankuai.waimai.alita.base.b bVar = this.b;
        if (bVar == null || !"ENV".equals(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("APP_NAME", bVar.b).putOpt("APP_VERSION_CODE", bVar.d).putOpt("APP_VERSION_NAME", bVar.c).putOpt("channel", bVar.e).putOpt("UUID", bVar.f).putOpt("union_Id", bVar.h).putOpt("dpId", bVar.g).putOpt("user_Id", bVar.i).putOpt("user_Name", bVar.j);
            return jSONObject;
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.e("GlobalFeatureProducer", e.getMessage(), new Object[0]);
            return null;
        }
    }
}
