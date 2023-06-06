package com.sankuai.waimai.drug.im.imlight;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.desensitization.c;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.vcard.d;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.im.desensitization.b
    public final /* synthetic */ void a(com.sankuai.xm.im.vcard.entity.a aVar, d dVar, com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a> aVar2) {
        IMMessage a2;
        com.sankuai.xm.im.vcard.entity.a aVar3 = aVar;
        d dVar2 = dVar;
        Object[] objArr = {aVar3, dVar2, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc907ca70a3271a45b9408d593011af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc907ca70a3271a45b9408d593011af");
            return;
        }
        if (aVar3 != null && dVar2 != null) {
            String str = dVar2.f;
            if (!TextUtils.isEmpty(str) && (a2 = IMClient.a().a(dVar2.g, str, true)) != null && a2.getDirection() != 1 && !TextUtils.isEmpty(a2.getExtension())) {
                try {
                    JSONObject jSONObject = new JSONObject(a2.getExtension());
                    String optString = jSONObject.optString("poi_nickname");
                    String optString2 = jSONObject.optString("poi_logo_url");
                    if (!TextUtils.isEmpty(optString)) {
                        aVar3.d = optString;
                    }
                    if (!TextUtils.isEmpty(optString2)) {
                        aVar3.b = optString2;
                    }
                } catch (Exception e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                    com.sankuai.waimai.store.im.base.log.b.a("医药频道获取发送对方消息扩展字段解析失败 message:" + a2.toString());
                }
            }
        }
        if (aVar2 != null) {
            aVar2.onSuccess(aVar3);
        }
    }
}
