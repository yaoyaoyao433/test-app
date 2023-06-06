package com.sankuai.waimai.store.im;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements com.sankuai.xm.im.desensitization.c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.im.desensitization.b
    public final /* synthetic */ void a(com.sankuai.xm.im.vcard.entity.a aVar, com.sankuai.xm.im.vcard.d dVar, com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a> aVar2) {
        IMMessage a2;
        com.sankuai.xm.im.vcard.entity.a aVar3 = aVar;
        com.sankuai.xm.im.vcard.d dVar2 = dVar;
        Object[] objArr = {aVar3, dVar2, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc79bc78cdb1299bff8ea074130796ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc79bc78cdb1299bff8ea074130796ea");
            return;
        }
        if (aVar3 != null && dVar2 != null) {
            String str = dVar2.f;
            if (!t.a(str) && (a2 = IMClient.a().a(dVar2.g, str, true)) != null && a2.getDirection() != 1 && !t.a(a2.getExtension())) {
                try {
                    JSONObject jSONObject = new JSONObject(a2.getExtension());
                    String optString = jSONObject.optString("poi_nickname_for_c");
                    String optString2 = jSONObject.optString("avatar_url_for_c");
                    if (!t.a(optString)) {
                        aVar3.d = optString;
                    }
                    if (!t.a(optString2)) {
                        aVar3.b = optString2;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (aVar2 != null) {
            aVar2.onSuccess(aVar3);
        }
    }
}
