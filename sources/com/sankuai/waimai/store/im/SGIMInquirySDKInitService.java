package com.sankuai.waimai.store.im;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.imbase.init.IMSdkInitService;
import com.sankuai.waimai.store.im.base.SGIMBaseGeneralMsgAdapter;
import com.sankuai.waimai.store.im.inquiry.model.PatientInfoAndImgsData;
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
public class SGIMInquirySDKInitService implements IMSdkInitService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.sankuai.waimai.store.im.inquiry.base.b mDigestAdapter;

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public void onInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "580d8710dba382fc12214e507ff363b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "580d8710dba382fc12214e507ff363b7");
            return;
        }
        com.sankuai.waimai.imbase.configuration.a.a().a((short) 1031, R.style.wm_sc_im_theme);
        com.sankuai.xm.ui.a.a().a((short) 1031, (com.sankuai.xm.im.desensitization.c) new com.sankuai.waimai.store.im.inquiry.base.a());
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.a createReceiveConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f820f07f68f92faca9405106b5619290", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f820f07f68f92faca9405106b5619290") : new com.sankuai.waimai.store.im.inquiry.base.c();
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.b createSessionConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99d07447d4c4392d92617bb8564a0afa", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99d07447d4c4392d92617bb8564a0afa") : new com.sankuai.waimai.imbase.init.model.b((short) 1031, new com.sankuai.waimai.imbase.listener.b() { // from class: com.sankuai.waimai.store.im.SGIMInquirySDKInitService.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.listener.b
            public final com.sankuai.waimai.imbase.listener.model.b a(com.sankuai.xm.im.session.entry.a aVar) {
                String a2;
                String str;
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "462c2de74df36281454ae26a27876ad6", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.imbase.listener.model.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "462c2de74df36281454ae26a27876ad6");
                }
                try {
                    String str2 = "";
                    String str3 = "";
                    if (!t.a(aVar.b.getExtension())) {
                        IMMessage iMMessage = aVar.b;
                        JSONObject jSONObject = new JSONObject(iMMessage.getExtension());
                        str2 = jSONObject.optString("poi_nickname", iMMessage.getFromName());
                        str3 = jSONObject.optString("poi_logo_url");
                    }
                    String str4 = str2;
                    String str5 = str3;
                    if (SGIMInquirySDKInitService.this.mDigestAdapter == null) {
                        SGIMInquirySDKInitService.this.mDigestAdapter = new com.sankuai.waimai.store.im.inquiry.base.b();
                    }
                    com.sankuai.waimai.store.im.inquiry.base.b bVar = SGIMInquirySDKInitService.this.mDigestAdapter;
                    IMMessage iMMessage2 = aVar.b;
                    Object[] objArr3 = {iMMessage2};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.im.inquiry.base.b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect4, false, "eab1d34184ec1fe335661dff64aff137", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (String) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect4, false, "eab1d34184ec1fe335661dff64aff137");
                    } else if (iMMessage2 instanceof TextMessage) {
                        a2 = ((TextMessage) iMMessage2).getText();
                    } else if (iMMessage2 instanceof EventMessage) {
                        a2 = ((EventMessage) iMMessage2).getText();
                    } else if (iMMessage2 instanceof AudioMessage) {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_voice);
                    } else if (iMMessage2 instanceof ImageMessage) {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_pic);
                    } else if (iMMessage2 instanceof GeneralMessage) {
                        GeneralMessage generalMessage = (GeneralMessage) iMMessage2;
                        int a3 = SGIMBaseGeneralMsgAdapter.a(generalMessage);
                        String a4 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_custom_msg);
                        switch (a3) {
                            case 100:
                            case 101:
                                PatientInfoAndImgsData patientInfoAndImgsData = (PatientInfoAndImgsData) com.sankuai.waimai.store.im.util.b.a(generalMessage, PatientInfoAndImgsData.class);
                                if (patientInfoAndImgsData != null) {
                                    if (patientInfoAndImgsData.patientInfoStr != null) {
                                        a2 = patientInfoAndImgsData.patientInfoStr;
                                        break;
                                    } else {
                                        a2 = "";
                                        break;
                                    }
                                }
                                str = a4;
                                break;
                            case 102:
                                a2 = "[图片消息]";
                                break;
                            default:
                                str = a4;
                                break;
                        }
                        com.sankuai.waimai.imbase.listener.model.b bVar2 = new com.sankuai.waimai.imbase.listener.model.b(str4, str, aVar.d, str5, com.sankuai.waimai.imbase.register.b.WM_POI, new HashMap());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("chat_list_scheme", com.sankuai.waimai.store.router.a.a(false, "flashbuy-doctors-chatlist", "flashbuy-doctors-online"));
                        bVar2.h = jSONObject2;
                        return bVar2;
                    } else {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_unknown_msg);
                    }
                    str = a2;
                    com.sankuai.waimai.imbase.listener.model.b bVar22 = new com.sankuai.waimai.imbase.listener.model.b(str4, str, aVar.d, str5, com.sankuai.waimai.imbase.register.b.WM_POI, new HashMap());
                    JSONObject jSONObject22 = new JSONObject();
                    jSONObject22.put("chat_list_scheme", com.sankuai.waimai.store.router.a.a(false, "flashbuy-doctors-chatlist", "flashbuy-doctors-online"));
                    bVar22.h = jSONObject22;
                    return bVar22;
                } catch (JSONException e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                    return null;
                }
            }
        });
    }
}
