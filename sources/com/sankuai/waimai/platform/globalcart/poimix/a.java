package com.sankuai.waimai.platform.globalcart.poimix;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends a.AbstractC1040a {
        @Override // com.sankuai.waimai.platform.capacity.log.a.AbstractC1040a
        public final String a() {
            return "waimai_global_cart";
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.globalcart.poimix.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1052a {
        public static ChangeQuickRedirect a;

        public static void a(String str, String str2, String str3) {
            String str4;
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "473261e16bfc5d59a94e759bb56033db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "473261e16bfc5d59a94e759bb56033db");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("old_poi_id", str2);
                jSONObject.put("new_poi_id", str3);
                str4 = jSONObject.toString();
            } catch (Exception unused) {
                str4 = "";
            }
            i.d(new b().a("poi_id_refresh").b(str).c(str4).b());
        }
    }
}
