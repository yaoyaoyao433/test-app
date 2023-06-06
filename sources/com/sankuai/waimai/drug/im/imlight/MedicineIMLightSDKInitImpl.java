package com.sankuai.waimai.drug.im.imlight;

import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.imbase.init.IMSdkInitService;
import com.sankuai.xm.im.desensitization.c;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MedicineIMLightSDKInitImpl implements IMSdkInitService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public void onInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f2345442f9f95a3761cc0dcb8072b3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f2345442f9f95a3761cc0dcb8072b3d");
        } else {
            com.sankuai.xm.ui.a.a().a((short) 1052, (c) new a());
        }
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.a createReceiveConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff2405159cba956e04ee13f2893b595c", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff2405159cba956e04ee13f2893b595c") : new b();
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.b createSessionConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee740bd36cbc2965f0bd926307ae0397", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee740bd36cbc2965f0bd926307ae0397") : new com.sankuai.waimai.imbase.init.model.b((short) 1052, new com.sankuai.waimai.imbase.listener.b() { // from class: com.sankuai.waimai.drug.im.imlight.MedicineIMLightSDKInitImpl.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.listener.b
            public final com.sankuai.waimai.imbase.listener.model.b a(com.sankuai.xm.im.session.entry.a aVar) {
                String a2;
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0550859d39057dc5f21dc01e4bad8772", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.imbase.listener.model.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0550859d39057dc5f21dc01e4bad8772");
                }
                try {
                    String str = "";
                    String str2 = "";
                    if (!t.a(aVar.b.getExtension())) {
                        IMMessage iMMessage = aVar.b;
                        JSONObject jSONObject = new JSONObject(iMMessage.getExtension());
                        str = jSONObject.optString("poi_nickname", iMMessage.getFromName());
                        str2 = jSONObject.optString("poi_logo_url");
                    }
                    String str3 = str;
                    String str4 = str2;
                    IMMessage iMMessage2 = aVar.b;
                    Object[] objArr3 = {iMMessage2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cc562212137221b9a947675ecf2a2d6e", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cc562212137221b9a947675ecf2a2d6e");
                    } else if (iMMessage2 instanceof TextMessage) {
                        a2 = ((TextMessage) iMMessage2).getText();
                    } else if (iMMessage2 instanceof EventMessage) {
                        a2 = ((EventMessage) iMMessage2).getText();
                    } else if (iMMessage2 instanceof AudioMessage) {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_voice);
                    } else if (iMMessage2 instanceof ImageMessage) {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_pic);
                    } else if (iMMessage2 instanceof VideoMessage) {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_video);
                    } else if (iMMessage2 instanceof GeneralMessage) {
                        a2 = ((GeneralMessage) iMMessage2).getSummary();
                        if (TextUtils.isEmpty(a2)) {
                            a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_custom_msg);
                        }
                    } else {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_unknown_msg);
                    }
                    com.sankuai.waimai.imbase.listener.model.b bVar = new com.sankuai.waimai.imbase.listener.model.b(str3, a2, aVar.d, str4, com.sankuai.waimai.imbase.register.b.WM_POI, new HashMap());
                    JSONObject jSONObject2 = new JSONObject();
                    String a3 = com.sankuai.waimai.store.router.a.a(false, "medicine-my-consult", "medicine-my-consult");
                    HashMap hashMap = new HashMap();
                    hashMap.put("selectedIndex", "3");
                    jSONObject2.put("chat_list_scheme", com.sankuai.waimai.store.router.a.a(a3, com.sankuai.waimai.store.router.a.a(hashMap)));
                    bVar.h = jSONObject2;
                    return bVar;
                } catch (JSONException e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                    return null;
                }
            }
        });
    }
}
