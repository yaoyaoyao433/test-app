package com.sankuai.waimai.drug.im.b2c;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.knb.GetAllSessionListHandler;
import com.sankuai.waimai.imbase.knb.ISessionsInfo;
import com.sankuai.xm.im.vcard.h;
import com.sankuai.xm.ui.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MedWmMsgCenterAllSessionImpl implements ISessionsInfo {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.imbase.knb.ISessionsInfo
    public d<List<GetAllSessionListHandler.a>> resolveSessionInfo(final JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99131c71f6f063f096ed184a1da80fbb", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99131c71f6f063f096ed184a1da80fbb") : d.a((d.a) new d.a<List<GetAllSessionListHandler.a>>() { // from class: com.sankuai.waimai.drug.im.b2c.MedWmMsgCenterAllSessionImpl.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                final j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e067076ab611427e535f7e2d530277be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e067076ab611427e535f7e2d530277be");
                } else if (!com.sankuai.waimai.store.config.d.h().a("im/open_msg_center", true)) {
                    jVar.onNext(new ArrayList());
                } else if (jSONArray.length() <= 0) {
                    jVar.onNext(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
                        String optString = jSONObject.optString("avatar");
                        String optString2 = jSONObject.optString("title");
                        long optLong = jSONObject.optLong("peer_id");
                        int optInt = jSONObject.optInt("channel_id");
                        if (optInt == 1057 && (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2))) {
                            arrayList.add(Long.valueOf(optLong));
                        }
                        if (optInt == 1057) {
                            arrayList2.add(Integer.valueOf(i));
                        }
                    }
                    if (com.sankuai.waimai.store.config.d.h().a("im/show_msg_center", false)) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            jSONArray.remove(((Integer) arrayList2.get(i2)).intValue());
                        }
                        jVar.onCompleted();
                        return;
                    }
                    a a2 = a.a();
                    com.sankuai.xm.im.vcard.d a3 = com.sankuai.xm.im.vcard.d.a(arrayList, 3, (short) 1057, 0L);
                    com.sankuai.xm.im.d<com.sankuai.xm.base.entity.a<com.sankuai.xm.im.vcard.entity.a, Long>> dVar = new com.sankuai.xm.im.d<com.sankuai.xm.base.entity.a<com.sankuai.xm.im.vcard.entity.a, Long>>() { // from class: com.sankuai.waimai.drug.im.b2c.MedWmMsgCenterAllSessionImpl.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.im.d
                        public final /* synthetic */ void b_(com.sankuai.xm.base.entity.a<com.sankuai.xm.im.vcard.entity.a, Long> aVar) {
                            com.sankuai.xm.base.entity.a<com.sankuai.xm.im.vcard.entity.a, Long> aVar2 = aVar;
                            Object[] objArr3 = {aVar2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cb28d55f2ec9df164d0c810f33b8bd61", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cb28d55f2ec9df164d0c810f33b8bd61");
                                return;
                            }
                            MedWmMsgCenterAllSessionImpl.this.resolveBatchQueryVcard(aVar2, jSONArray);
                            jVar.onCompleted();
                        }
                    };
                    Object[] objArr3 = {a3, dVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "e86234d8ddb0bb68e8ae97d4eeb449bd", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "e86234d8ddb0bb68e8ae97d4eeb449bd");
                    } else if (!a2.p()) {
                        com.sankuai.xm.base.callback.a.a(dVar, 10023, "not init");
                    } else {
                        h.a().b(a3, dVar);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolveBatchQueryVcard(com.sankuai.xm.base.entity.a<com.sankuai.xm.im.vcard.entity.a, Long> aVar, JSONArray jSONArray) {
        Object[] objArr = {aVar, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d0dc638195bcca6b75acf4fbccc94a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d0dc638195bcca6b75acf4fbccc94a9");
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
                Collection<com.sankuai.xm.im.vcard.entity.a> a = aVar.a();
                if (!com.sankuai.shangou.stone.util.a.b(a)) {
                    for (com.sankuai.xm.im.vcard.entity.a aVar2 : a) {
                        if (aVar2 != null && aVar2.e == jSONObject.optLong("peer_id")) {
                            jSONObject.put("avatar", aVar2.b);
                            jSONObject.put("title", aVar2.d);
                        }
                    }
                }
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
                return;
            }
        }
    }
}
