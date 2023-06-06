package com.sankuai.waimai.business.address.rn;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.base.b;
import com.sankuai.waimai.addrsdk.constants.AddressScene;
import com.sankuai.waimai.addrsdk.constants.AddressType;
import com.sankuai.waimai.addrsdk.utils.c;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.platform.capacity.abtest.f;
import com.sankuai.waimai.platform.schemereplace.a;
import com.sankuai.waimai.router.core.j;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ModifyAddressSchemeRule extends a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNComponent() {
        return "order-address-modify";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNEntry() {
        return "order-address-modify";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df6d59ce59e9539b3a84be0fcb42a104", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df6d59ce59e9539b3a84be0fcb42a104")).booleanValue() : "/modifyaddress".equals(uri.getPath());
    }

    @Override // com.sankuai.waimai.platform.schemereplace.a, com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Object obj;
        int i = 0;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0307f5868e7b9a0af249d4543ca15bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0307f5868e7b9a0af249d4543ca15bc");
        } else if (!f.a(jVar.c, "order_mmp_modify_address_android")) {
            super.schemeReplace(jVar);
        } else {
            HashMap<String, Object> hashMap = jVar.e;
            String str = "";
            String str2 = "";
            String str3 = "";
            int i2 = -1;
            if (hashMap != null && (obj = hashMap.get("com.sankuai.waimai.router.activity.intent_extra")) != null) {
                Bundle bundle = (Bundle) obj;
                str = bundle.getString(Constants.EventConstants.KEY_ORDER_ID);
                str2 = bundle.getString("poiId");
                str3 = bundle.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
                i = bundle.getInt("sgImModifyAddress");
                Object obj2 = hashMap.get("com.sankuai.waimai.router.activity.request_code");
                if (obj2 != null) {
                    i2 = ((Integer) obj2).intValue();
                }
            }
            b bVar = new b();
            bVar.b = "addressModify";
            bVar.h = "orderDetail";
            Map<String, String> a = com.sankuai.waimai.business.address.b.a(jVar.c);
            Map<String, String> b = com.sankuai.waimai.business.address.b.b(jVar.c);
            Map<String, String> b2 = com.sankuai.waimai.router.set_id.b.a().b();
            if (a != null) {
                a.putAll(b);
                a.putAll(b2);
            } else {
                a = new HashMap<>();
            }
            bVar.g = a;
            bVar.i = "wm";
            if (!com.sankuai.waimai.foundation.core.a.e()) {
                if (com.sankuai.waimai.foundation.core.a.f()) {
                    bVar.i = "dp";
                }
            } else {
                bVar.i = "mt";
            }
            bVar.k = c.a().toJson(com.sankuai.waimai.platform.domain.manager.location.a.a());
            bVar.d = AddressScene.DEFAULT_SCENE.getValue();
            bVar.a(AddressType.LBS_TYPE.getValue());
            bVar.c = "";
            bVar.j = "";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("waimai_address_create", com.sankuai.waimai.platform.capacity.abtest.b.c(jVar.c));
                jSONObject.putOpt(Constants.EventConstants.KEY_ORDER_ID, str);
                jSONObject.putOpt("poiId", str2);
                jSONObject.putOpt("poiIdStr", str3);
                if (i != 0) {
                    jSONObject.putOpt("sgImModifyAddress", Integer.valueOf(i));
                }
            } catch (Exception unused) {
            }
            bVar.f = jSONObject.toString();
            Uri parse = Uri.parse(com.sankuai.waimai.addrsdk.manager.a.a().a(bVar));
            jVar.b(i2);
            jVar.a(parse);
        }
    }
}
