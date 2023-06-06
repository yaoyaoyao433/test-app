package com.sankuai.waimai.business.search.alita;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.intention.AlitaIntention;
import com.sankuai.waimai.alita.core.intention.b;
import com.sankuai.waimai.alita.core.intention.c;
import com.sankuai.waimai.alita.core.intention.d;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final SearchShareData b;
    public d c;
    private final String d;
    private final String e;
    private final String f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.search.alita.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0859a {
        public String a;
    }

    public a(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fee19d9e5a18942d6b6b54006e5ffa4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fee19d9e5a18942d6b6b54006e5ffa4");
            return;
        }
        this.d = "alita_waimai_search_guide_page_guess";
        this.e = "is_request";
        this.f = "1";
        this.b = searchShareData;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c40b121f2e4bd93f05cce448ac2a0a9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c40b121f2e4bd93f05cce448ac2a0a9f");
        } else {
            this.c = c.a().a("waimai").a("alita_waimai_search_guide_page_guess", new b.a() { // from class: com.sankuai.waimai.business.search.alita.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.intention.b.a
                public final void a(@Nullable AlitaIntention alitaIntention, @Nullable AlitaIntention alitaIntention2) {
                    Object[] objArr3 = {alitaIntention, alitaIntention2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8cf1248649fcd8c688e8f86bb9487d2c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8cf1248649fcd8c688e8f86bb9487d2c");
                    } else if (alitaIntention == null || alitaIntention.h == null || alitaIntention.h.isEmpty()) {
                    } else {
                        String str = (String) alitaIntention.i.get("exp_key");
                        if (TextUtils.equals((String) alitaIntention.h.get("is_request"), "1")) {
                            C0859a c0859a = new C0859a();
                            c0859a.a = str;
                            a.this.b.aq = c0859a;
                        }
                    }
                }
            });
        }
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac568feea8cb337af0a50cddeca83206", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac568feea8cb337af0a50cddeca83206");
        }
        com.sankuai.waimai.alita.core.feature.b a2 = com.sankuai.waimai.alita.core.feature.c.a().a("waimai");
        if (a2 != null) {
            ArrayList arrayList = new ArrayList();
            com.sankuai.waimai.alita.core.feature.d dVar = new com.sankuai.waimai.alita.core.feature.d();
            dVar.b = "waimai";
            dVar.c = "lx_search_data_guess";
            dVar.d = "*";
            arrayList.add(dVar);
            JSONObject optJSONObject = a2.a(arrayList).optJSONObject("lx_search_data_guess");
            return optJSONObject != null ? optJSONObject.toString() : "";
        }
        return "";
    }
}
