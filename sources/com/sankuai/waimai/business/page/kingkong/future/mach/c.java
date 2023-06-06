package com.sankuai.waimai.business.page.kingkong.future.mach;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.platform.dynamic.b {
    public static ChangeQuickRedirect a;
    public static Set<Integer> b = new HashSet();

    public c(String str, String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeafaa3f5cbdf97158265027152f44dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeafaa3f5cbdf97158265027152f44dc");
        }
    }

    @Override // com.sankuai.waimai.platform.dynamic.b, com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "578e5dea49eb0d2511949ebde18e384a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "578e5dea49eb0d2511949ebde18e384a");
            return;
        }
        try {
            Object b2 = aVar.b("rocks_adapter_position");
            if (b2 instanceof Integer) {
                ((Integer) b2).intValue();
            }
            JSONObject jSONObject = new JSONObject(map);
            String optString = jSONObject.optString("bid");
            JSONObject optJSONObject = jSONObject.optJSONObject("lab");
            if (optJSONObject != null && TextUtils.equals("b_7enzndvb", optString)) {
                int optInt = optJSONObject.optInt("card_index");
                if (b.contains(Integer.valueOf(optInt))) {
                    return;
                }
                b.add(Integer.valueOf(optInt));
                super.a(str, str2, i, map, aVar);
                return;
            }
            super.a(str, str2, i, map, aVar);
        } catch (Exception unused) {
        }
    }
}
