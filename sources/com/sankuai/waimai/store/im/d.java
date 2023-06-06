package com.sankuai.waimai.store.im;

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
public final class d extends com.sankuai.waimai.imbase.init.model.a {
    public d() {
        super((short) 1024, new a());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a implements com.sankuai.waimai.imbase.listener.a {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.imbase.listener.a
        public final com.sankuai.waimai.imbase.listener.model.a a(IMMessage iMMessage, boolean z) {
            JSONObject jSONObject;
            String optString;
            String optString2;
            Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6a750f52a46b1f2fd0b22b13521b36b", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.imbase.listener.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6a750f52a46b1f2fd0b22b13521b36b");
            }
            String a2 = h.a(iMMessage);
            try {
                jSONObject = new JSONObject(iMMessage.getExtension());
                optString = jSONObject.optString("poi_nickname", "医生");
                optString2 = jSONObject.optString("poi_logo_url");
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
            if (jSONObject.optInt("pushType", 1) == 0) {
                return new com.sankuai.waimai.imbase.listener.model.a(false);
            }
            com.sankuai.waimai.imbase.listener.model.a aVar = new com.sankuai.waimai.imbase.listener.model.a(true);
            HashMap hashMap = new HashMap();
            if (z) {
                if (com.sankuai.waimai.foundation.utils.activity.a.a().b() != null) {
                    hashMap.put("from", "1");
                    aVar.a(new a.C0962a(optString, a2, optString2, R.drawable.wm_sc_im_kf_portrait, iMMessage.getSts(), hashMap, new a.c() { // from class: com.sankuai.waimai.store.im.d.a.1
                        @Override // com.sankuai.waimai.imbase.listener.model.a.c
                        public final void a() {
                        }

                        @Override // com.sankuai.waimai.imbase.listener.model.a.c
                        public final void b() {
                        }
                    }));
                    return aVar;
                }
                return new com.sankuai.waimai.imbase.listener.model.a(false);
            }
            hashMap.put("from", "2");
            Context context = com.meituan.android.singleton.b.a;
            aVar.a(new a.b(context, optString + " : " + a2, hashMap, 1001));
            return aVar;
        }
    }
}
