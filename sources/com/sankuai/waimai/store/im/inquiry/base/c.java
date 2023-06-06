package com.sankuai.waimai.store.im.inquiry.base;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.prepare.h;
import com.sankuai.waimai.imbase.listener.model.a;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.imbase.init.model.a {
    public c() {
        super((short) 1031, new com.sankuai.waimai.imbase.listener.a() { // from class: com.sankuai.waimai.store.im.inquiry.base.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.listener.a
            public final com.sankuai.waimai.imbase.listener.model.a a(IMMessage iMMessage, boolean z) {
                String str;
                String str2;
                Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f413160e5da797b6533b029c883001", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.imbase.listener.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f413160e5da797b6533b029c883001");
                }
                String str3 = "";
                String a2 = h.a(iMMessage);
                com.sankuai.waimai.imbase.listener.model.a aVar = new com.sankuai.waimai.imbase.listener.model.a(true);
                HashMap hashMap = new HashMap();
                if (z) {
                    if (com.sankuai.waimai.foundation.utils.activity.a.a().b() != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(iMMessage.getExtension());
                            String optString = jSONObject.optString("poi_nickname", iMMessage.getFromName());
                            try {
                                str = jSONObject.optString("poi_logo_url");
                                str2 = optString;
                            } catch (JSONException e) {
                                e = e;
                                str3 = optString;
                                com.sankuai.waimai.store.base.log.a.a(e);
                                str = "";
                                str2 = str3;
                                hashMap.put("from", "1");
                                aVar.a(new a.C0962a(str2, a2, str, R.drawable.wm_sc_im_kf_portrait, iMMessage.getSts(), hashMap, new a.c() { // from class: com.sankuai.waimai.store.im.inquiry.base.c.1.1
                                    @Override // com.sankuai.waimai.imbase.listener.model.a.c
                                    public final void a() {
                                    }

                                    @Override // com.sankuai.waimai.imbase.listener.model.a.c
                                    public final void b() {
                                    }
                                }));
                                return aVar;
                            }
                        } catch (JSONException e2) {
                            e = e2;
                        }
                        hashMap.put("from", "1");
                        aVar.a(new a.C0962a(str2, a2, str, R.drawable.wm_sc_im_kf_portrait, iMMessage.getSts(), hashMap, new a.c() { // from class: com.sankuai.waimai.store.im.inquiry.base.c.1.1
                            @Override // com.sankuai.waimai.imbase.listener.model.a.c
                            public final void a() {
                            }

                            @Override // com.sankuai.waimai.imbase.listener.model.a.c
                            public final void b() {
                            }
                        }));
                        return aVar;
                    }
                    return null;
                }
                hashMap.put("from", "2");
                Context context = com.meituan.android.singleton.b.a;
                aVar.a(new a.b(context, " : " + a2, hashMap, 1031));
                return null;
            }
        });
    }
}
