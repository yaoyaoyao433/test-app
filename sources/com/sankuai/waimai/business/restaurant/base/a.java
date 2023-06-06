package com.sankuai.waimai.business.restaurant.base;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.b;
import com.sankuai.waimai.platform.domain.core.goods.e;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.core.j;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        int i = 2;
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb91278988476a928fbdd2e53f8ed211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb91278988476a928fbdd2e53f8ed211");
            return;
        }
        try {
            Uri uri = jVar.d;
            String queryParameter = uri.getQueryParameter("from");
            if (!aa.a(queryParameter)) {
                String queryParameter2 = uri.getQueryParameter("theme");
                int parseInt = aa.a(queryParameter2) ? -1 : Integer.parseInt(queryParameter2);
                int parseInt2 = Integer.parseInt(queryParameter);
                if (parseInt2 == 2 || parseInt2 == 3 || parseInt == 0) {
                    String queryParameter3 = uri.getQueryParameter("media_data");
                    if (aa.a(queryParameter3)) {
                        gVar.a();
                        return;
                    }
                    String queryParameter4 = uri.getQueryParameter("index");
                    int parseInt3 = aa.a(queryParameter4) ? 0 : Integer.parseInt(queryParameter4);
                    String queryParameter5 = uri.getQueryParameter("lab");
                    JSONArray jSONArray = new JSONArray(queryParameter3);
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            e eVar = new e();
                            eVar.b = optJSONObject.optInt("type");
                            eVar.c = optJSONObject.optString("url");
                            eVar.d = optJSONObject.optString("video_cover_url");
                            arrayList.add(eVar);
                        }
                    }
                    if (b.a(arrayList)) {
                        Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        i = (parseInt2 == 3 || parseInt2 == 7) ? 3 : 3;
                        bundle.putBoolean("intent_media_include_boolean", true);
                        bundle.putInt("from", parseInt2);
                        bundle.putInt("current_img_path", parseInt3);
                        bundle.putInt("intent_float_layer_type", i);
                        bundle.putString("lab", queryParameter5);
                        bundle.putInt("theme", parseInt);
                        bundle.putSerializable("intent_media_infos", arrayList);
                        jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle);
                    }
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        gVar.a();
    }
}
