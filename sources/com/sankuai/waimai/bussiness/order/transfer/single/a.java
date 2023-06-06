package com.sankuai.waimai.bussiness.order.transfer.single;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.domain.core.multiperson.MultiPersonCart;
import com.sankuai.waimai.platform.utils.n;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements com.sankuai.waimai.bussiness.order.transfer.base.e<b.C0904b> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.bussiness.order.transfer.base.b
    public b.C0904b a(d dVar) {
        boolean equalsIgnoreCase;
        JsonElement a2;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b664cd9c05e52645b32c7946ac783015", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.C0904b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b664cd9c05e52645b32c7946ac783015");
        }
        b.C0904b c0904b = new b.C0904b();
        JsonPrimitive a3 = dVar.a("self_delivery");
        int a4 = c.a(dVar.f, a3 != null ? a3.getAsBoolean() : false);
        c0904b.a = dVar.c;
        c0904b.b = dVar.d;
        c0904b.c = 0;
        c0904b.e = false;
        c0904b.l = a4;
        c0904b.m = 0.0d;
        c0904b.n = null;
        Context context = com.meituan.android.singleton.b.a;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.base.abtest.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ceb8e4dbf772c7ed25e8e1927d7d6a1f", RobustBitConfig.DEFAULT_VALUE)) {
            equalsIgnoreCase = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ceb8e4dbf772c7ed25e8e1927d7d6a1f")).booleanValue();
        } else {
            ABStrategy strategy = ABTestManager.getInstance(context).getStrategy("init_source_type_by_schema", null);
            equalsIgnoreCase = (strategy == null || TextUtils.isEmpty(strategy.expName)) ? true : strategy.expName.equalsIgnoreCase(ErrorCode.ERROR_TYPE_B);
        }
        if (equalsIgnoreCase) {
            SubmitOrderManager.getInstance().setSourceType(dVar.e);
        }
        if (dVar.c("is_from_mt_other_channel") == 1) {
            c0904b.f = dVar.a("is_from_mt_other_channel").getAsBoolean();
        }
        if (dVar.c(KnbConstants.PARAMS_SCENE) == 1) {
            c0904b.c = dVar.a(KnbConstants.PARAMS_SCENE).getAsInt();
            if (c0904b.c == 2) {
                c0904b.e = true;
            } else {
                c0904b.e = false;
            }
        }
        if (dVar.c(OtherVerifyTypeConstants.REQUEST_CODE) == 1) {
            c0904b.g = dVar.a(OtherVerifyTypeConstants.REQUEST_CODE).getAsInt();
        }
        c0904b.i = dVar.g;
        if (dVar.c(AgainManager.EXTRA_POI_NAME) == 1) {
            c0904b.j = dVar.a(AgainManager.EXTRA_POI_NAME).getAsString();
        }
        if (dVar.c("login_from") == 1) {
            c0904b.k = d.a(dVar.a("login_from").getAsInt());
        }
        if (dVar.c("allowance_alliance_scenes") == 2) {
            String asString = dVar.b("allowance_alliance_scenes").getAsString();
            if (!TextUtils.isEmpty(asString)) {
                c0904b.o = asString;
            }
        }
        if (dVar.c("ad_activity_flag") == 2 && (a2 = dVar.a(2, "ad_activity_flag")) != null && a2.isJsonObject()) {
            String jsonObject = ((JsonObject) a2).toString();
            if (!TextUtils.isEmpty(jsonObject)) {
                c0904b.p = jsonObject;
            }
        }
        if (dVar.c("business_scene") == 1) {
            String asString2 = dVar.a("business_scene").getAsString();
            if (!TextUtils.isEmpty(asString2)) {
                c0904b.d = asString2;
            }
        }
        if (dVar.c("tag") == 1) {
            String asString3 = dVar.a("tag").getAsString();
            if (!TextUtils.isEmpty(asString3)) {
                c0904b.h = asString3;
            }
        }
        if (dVar.c("cart") == 1) {
            c0904b.n = (MultiPersonCart) n.a().a(MultiPersonCart.class);
        }
        return c0904b;
    }
}
