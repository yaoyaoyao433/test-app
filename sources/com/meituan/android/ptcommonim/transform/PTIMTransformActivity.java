package com.meituan.android.ptcommonim.transform;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import com.google.gson.JsonObject;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.ptcommonim.PTIMMgeBean;
import com.meituan.android.ptcommonim.base.network.BaseApiRetrofitService;
import com.meituan.android.ptcommonim.base.network.model.BaseDataEntity;
import com.meituan.android.ptcommonim.model.PTSessionInfo;
import com.meituan.android.ptcommonim.model.PTTransformBean;
import com.meituan.android.ptcommonim.pageadapter.widget.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.SessionProvider;
import com.sankuai.xm.imui.session.entity.SessionParams;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTIMTransformActivity extends AppCompatActivity {
    public static ChangeQuickRedirect a;
    private final a b;

    public PTIMTransformActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a340d36e12cf98d3a2dad023dfc409e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a340d36e12cf98d3a2dad023dfc409e3");
        } else {
            this.b = new a();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        final PTTransformBean pTTransformBean;
        Map<String, Object> hashMap;
        Map<String, Object> hashMap2;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99b284420c5d75233db1c1ea035151a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99b284420c5d75233db1c1ea035151a0");
            return;
        }
        super.onCreate(bundle);
        final a aVar = this.b;
        Object[] objArr2 = {this, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "64eb847fc4f7270590ce431a57bff99a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "64eb847fc4f7270590ce431a57bff99a");
            return;
        }
        setContentView(R.layout.ptim_transparent_loading_layout);
        com.meituan.android.ptcommonim.a.a().a(getApplicationContext());
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "1a63d13c5426add7da9174ac5b65338d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "1a63d13c5426add7da9174ac5b65338d");
        } else {
            rx.d.a(new Object()).b(rx.schedulers.a.e()).a(c.a(), d.a());
        }
        Object[] objArr4 = {this};
        ChangeQuickRedirect changeQuickRedirect4 = a.a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "a0dfef75a726f05f2d6d3aa975895825", RobustBitConfig.DEFAULT_VALUE)) {
            pTTransformBean = (PTTransformBean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "a0dfef75a726f05f2d6d3aa975895825");
        } else {
            pTTransformBean = new PTTransformBean();
            Uri data = getIntent().getData();
            if (data != null) {
                short parseInt = (short) NumberUtils.parseInt(data.getLastPathSegment(), -1);
                if (parseInt < 0) {
                    pTTransformBean.channel = getIntent().getShortExtra("pt-im-channel", (short) -1);
                } else {
                    pTTransformBean.channel = parseInt;
                }
                pTTransformBean.chatID = NumberUtils.parseLong(data.getQueryParameter("chatID"), -1L);
                pTTransformBean.peerUid = NumberUtils.parseLong(data.getQueryParameter(Message.PEER_UID), 0L);
                pTTransformBean.category = NumberUtils.parseInt(data.getQueryParameter("category"), -1);
                pTTransformBean.peerAppId = (short) NumberUtils.parseInt(data.getQueryParameter(Message.PEER_APPID), 0);
                pTTransformBean.sid = aVar.a(data, Message.SID);
                pTTransformBean.merchantIdStr = aVar.a(data, "merchantIdStr");
                pTTransformBean.entranceSource = aVar.a(data, "entranceSource");
                pTTransformBean.orderId = aVar.a(data, Constants.EventConstants.KEY_ORDER_ID);
                pTTransformBean.productId = aVar.a(data, "productId");
                pTTransformBean.skuId = aVar.a(data, "skuId");
            }
        }
        if (!pTTransformBean.isValid()) {
            aVar.a((Activity) this);
            return;
        }
        com.meituan.android.ptcommonim.base.network.a a2 = com.meituan.android.ptcommonim.base.network.a.a();
        Object[] objArr5 = {pTTransformBean};
        ChangeQuickRedirect changeQuickRedirect5 = a.a;
        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "1ea63d41d699349f280da3f2f5da701b", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "1ea63d41d699349f280da3f2f5da701b");
        } else {
            hashMap = new HashMap<>(8);
            hashMap.put("appId", com.meituan.android.ptcommonim.protocol.env.a.b);
            hashMap.put("entranceSource", pTTransformBean.entranceSource);
        }
        Object[] objArr6 = {pTTransformBean};
        ChangeQuickRedirect changeQuickRedirect6 = a.a;
        if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "b89f07de52f141835cf85b4ec02bc318", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap2 = (Map) PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "b89f07de52f141835cf85b4ec02bc318");
        } else {
            hashMap2 = new HashMap<>(16);
            HashMap hashMap3 = new HashMap(8);
            hashMap3.put("channel", Short.valueOf(pTTransformBean.channel));
            if (pTTransformBean.chatID > 0) {
                hashMap3.put("chatID", Long.valueOf(pTTransformBean.chatID));
            }
            hashMap2.put("dxSessionInfo", hashMap3);
            hashMap2.put("merchantIdStr", pTTransformBean.merchantIdStr);
        }
        Object[] objArr7 = {hashMap, hashMap2};
        ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.ptcommonim.base.network.a.a;
        aVar.c = PatchProxy.isSupport(objArr7, a2, changeQuickRedirect7, false, "8285931678a30bd0746630a9b29f3a18", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect7, false, "8285931678a30bd0746630a9b29f3a18") : ((BaseApiRetrofitService) a2.b.a(BaseApiRetrofitService.class)).getPTSessionInfo(a2.b(hashMap), hashMap2, a2.b());
        aVar.c.a(new f<BaseDataEntity<PTSessionInfo>>() { // from class: com.meituan.android.ptcommonim.transform.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<BaseDataEntity<PTSessionInfo>> call, Response<BaseDataEntity<PTSessionInfo>> response) {
                Object[] objArr8 = {call, response};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "86ebc0fa1631da4c31de1c11db2b1b23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "86ebc0fa1631da4c31de1c11db2b1b23");
                } else if (response == null || !response.f() || response.e() == null || response.e().data == null) {
                    aVar.a(this);
                } else {
                    PTSessionInfo pTSessionInfo = response.e().data;
                    if (pTSessionInfo.dxSessionInfo == null || !pTSessionInfo.dxSessionInfo.isValid()) {
                        aVar.a(this);
                        return;
                    }
                    SessionId a3 = SessionId.a(pTSessionInfo.dxSessionInfo.chatID, pTTransformBean.peerUid, pTSessionInfo.dxSessionInfo.category, pTTransformBean.peerAppId, pTSessionInfo.dxSessionInfo.channel);
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("entranceSource", pTTransformBean.entranceSource);
                    PTIMMgeBean pTIMMgeBean = new PTIMMgeBean();
                    pTIMMgeBean.b = pTSessionInfo.bizInfo != null ? pTSessionInfo.bizInfo.buId : "-999";
                    pTIMMgeBean.d = jsonObject.toString();
                    pTIMMgeBean.c = pTSessionInfo.merchantInfo != null ? pTSessionInfo.merchantInfo.merchantIdStr : "-999";
                    final com.meituan.android.ptcommonim.a a4 = com.meituan.android.ptcommonim.a.a();
                    Activity activity = this;
                    PTTransformBean pTTransformBean2 = pTTransformBean;
                    Object[] objArr9 = {activity, a3, pTIMMgeBean, pTSessionInfo, pTTransformBean2};
                    ChangeQuickRedirect changeQuickRedirect9 = com.meituan.android.ptcommonim.a.a;
                    if (PatchProxy.isSupport(objArr9, a4, changeQuickRedirect9, false, "6b4fc55cff96ae68510a4599db283b6d", RobustBitConfig.DEFAULT_VALUE)) {
                        ((Integer) PatchProxy.accessDispatch(objArr9, a4, changeQuickRedirect9, false, "6b4fc55cff96ae68510a4599db283b6d")).intValue();
                    } else {
                        com.sankuai.xm.ui.a.a().a(a3 != null ? a3.d() : (short) 0, R.style.pt_im_page_theme);
                        SessionParams sessionParams = new SessionParams();
                        sessionParams.a(e.class);
                        sessionParams.a().putParcelable("pt_im_info", pTIMMgeBean);
                        sessionParams.a().putString(PTSessionInfo.PT_SESSION_INFO, JsonHelper.toJsonString(pTSessionInfo));
                        sessionParams.a().putString(PTTransformBean.PT_TRANSFORM_INFO, JsonHelper.toJsonString(pTTransformBean2));
                        IMUIManager.a().a(activity, a3, new SessionProvider() { // from class: com.meituan.android.ptcommonim.a.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.xm.imui.session.SessionProvider
                            public final SessionFragment createSessionFragment() {
                                Object[] objArr10 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                return PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "de2e49e591b15c63796317f4631be499", RobustBitConfig.DEFAULT_VALUE) ? (SessionFragment) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "de2e49e591b15c63796317f4631be499") : new PTSessionFragmentV2();
                            }
                        }, sessionParams);
                    }
                    this.finish();
                }
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<BaseDataEntity<PTSessionInfo>> call, Throwable th) {
                Object[] objArr8 = {call, th};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "46eeb22b438a8a5ff2da57a55e6abf0e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "46eeb22b438a8a5ff2da57a55e6abf0e");
                } else {
                    aVar.a(this);
                }
            }
        });
    }
}
