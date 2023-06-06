package com.sankuai.waimai.store.im;

import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.imbase.init.IMSdkInitService;
import com.sankuai.waimai.store.im.base.SGIMBaseGeneralMsgAdapter;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMSdkInitImpl implements IMSdkInitService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public void onInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9277ea05600928fb5e47197e0dd0cf09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9277ea05600928fb5e47197e0dd0cf09");
        } else {
            com.sankuai.xm.ui.a.a().a((short) 1024, (com.sankuai.xm.im.desensitization.c) new com.sankuai.waimai.store.im.medical.a());
        }
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.a createReceiveConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a94c69204d83bfe3a98a11dc438f983d", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a94c69204d83bfe3a98a11dc438f983d") : new d();
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.b createSessionConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0453db31300c776084920fc23b705142", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0453db31300c776084920fc23b705142") : new com.sankuai.waimai.imbase.init.model.b((short) 1024, new com.sankuai.waimai.imbase.listener.b() { // from class: com.sankuai.waimai.store.im.SGIMSdkInitImpl.1
            public static ChangeQuickRedirect a;

            private int a(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "924480c8af9552fb6047ff142e6abbb7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "924480c8af9552fb6047ff142e6abbb7")).intValue();
                }
                if (obj instanceof GeneralMessage) {
                    try {
                        GeneralMessage generalMessage = (GeneralMessage) obj;
                        if (generalMessage.getData() != null) {
                            return new JSONObject(new String(generalMessage.getData(), "utf-8")).getInt("type");
                        }
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                }
                return 0;
            }

            @Override // com.sankuai.waimai.imbase.listener.b
            public final com.sankuai.waimai.imbase.listener.model.b a(com.sankuai.xm.im.session.entry.a aVar) {
                String str;
                String str2;
                String a2;
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4d825c99ff8271256a24b32340fcf1b3", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.imbase.listener.model.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4d825c99ff8271256a24b32340fcf1b3");
                }
                try {
                    if (t.a(aVar.b.getExtension())) {
                        str = "";
                        str2 = "";
                    } else {
                        JSONObject jSONObject = new JSONObject(aVar.b.getExtension());
                        String optString = jSONObject.optString("poi_nickname");
                        str2 = jSONObject.optString("poi_logo_url");
                        str = optString;
                    }
                    IMMessage iMMessage = aVar.b;
                    Object[] objArr3 = {iMMessage};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "8f8a6887400c7a2e34c43e31f4a9f09c", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "8f8a6887400c7a2e34c43e31f4a9f09c");
                    } else if (iMMessage instanceof TextMessage) {
                        a2 = ((TextMessage) iMMessage).getText();
                    } else if (iMMessage instanceof EventMessage) {
                        a2 = ((EventMessage) iMMessage).getText();
                    } else if (iMMessage instanceof AudioMessage) {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_voice);
                    } else if (iMMessage instanceof ImageMessage) {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_pic);
                    } else if (iMMessage instanceof GeneralMessage) {
                        a2 = SGIMBaseGeneralMsgAdapter.b((GeneralMessage) iMMessage);
                        if (TextUtils.isEmpty(a2)) {
                            a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_custom_msg);
                        }
                    } else {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_unknown_msg);
                    }
                    com.sankuai.waimai.imbase.listener.model.b bVar = new com.sankuai.waimai.imbase.listener.model.b(str, a2, aVar.d, str2, com.sankuai.waimai.imbase.register.b.WM_POI, new HashMap());
                    JSONObject jSONObject2 = new JSONObject();
                    String a3 = com.sankuai.waimai.store.router.a.a("flashbuy-medicine-chatlist");
                    HashMap hashMap = new HashMap();
                    String inquiryId = SGIMSdkInitImpl.this.getInquiryId(aVar.b.getExtension());
                    hashMap.put("biz_type", t.a(inquiryId) ? "0" : "1");
                    jSONObject2.put("chat_list_scheme", com.sankuai.waimai.store.router.a.a(a3, com.sankuai.waimai.store.router.a.a(hashMap)));
                    jSONObject2.put("biz_type", !t.a(inquiryId) ? 1 : 0);
                    jSONObject2.put("general_message_type", a(aVar.b));
                    bVar.h = jSONObject2;
                    return bVar;
                } catch (Exception e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                    return null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getInquiryId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb848be10ccf913a278943af609176ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb848be10ccf913a278943af609176ef");
        }
        if (t.a(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString("inquiryId");
        } catch (JSONException e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return "";
        }
    }
}
