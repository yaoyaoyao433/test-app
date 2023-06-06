package com.sankuai.waimai.business.im.prepare;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.imbase.init.IMSdkInitService;
import com.sankuai.waimai.imbase.listener.model.a;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMImSdkInitService implements IMSdkInitService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final LongSparseArray<com.sankuai.xm.im.vcard.entity.a> mCache = new LongSparseArray<>();

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.xm.im.vcard.entity.a getRiderUIInfo(final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e7dcc987ba9e6fe017c661a7230f9f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.xm.im.vcard.entity.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e7dcc987ba9e6fe017c661a7230f9f6");
        }
        com.sankuai.xm.im.vcard.entity.a aVar = mCache.get(j);
        if (aVar == null || TextUtils.isEmpty(aVar.d)) {
            com.sankuai.xm.ui.a.a().a(com.sankuai.xm.im.vcard.d.a(j, 1, (short) 1001), new com.sankuai.xm.im.d<com.sankuai.xm.im.vcard.entity.a>() { // from class: com.sankuai.waimai.business.im.prepare.WMImSdkInitService.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.d
                public final /* synthetic */ void b_(com.sankuai.xm.im.vcard.entity.a aVar2) {
                    com.sankuai.xm.im.vcard.entity.a aVar3 = aVar2;
                    Object[] objArr2 = {aVar3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "286fa35128fd07d0d2f58f23e7d7041a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "286fa35128fd07d0d2f58f23e7d7041a");
                    } else if (aVar3 == null) {
                        WMImSdkInitService.mCache.put(j, new com.sankuai.xm.im.vcard.entity.a());
                    } else {
                        WMImSdkInitService.mCache.put(j, aVar3);
                    }
                }
            });
        }
        return aVar == null ? new com.sankuai.xm.im.vcard.entity.a() : aVar;
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public void onInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20064ae1beff6686d4629d62b3f5a589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20064ae1beff6686d4629d62b3f5a589");
        } else {
            com.sankuai.waimai.imbase.configuration.a.a().a((short) 1001, R.style.wm_im_theme);
        }
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.a createReceiveConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d2f009ad2eae220035c03e7f61ea2c0", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d2f009ad2eae220035c03e7f61ea2c0") : new com.sankuai.waimai.imbase.init.model.a((short) 1001, new com.sankuai.waimai.imbase.listener.a() { // from class: com.sankuai.waimai.business.im.prepare.WMImSdkInitService.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.listener.a
            public final com.sankuai.waimai.imbase.listener.model.a a(IMMessage iMMessage, boolean z) {
                Object[] objArr2 = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dc9a1996a411115bc098ef2cd451824a", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.imbase.listener.model.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dc9a1996a411115bc098ef2cd451824a");
                }
                switch (com.sankuai.waimai.business.im.utils.c.a(iMMessage)) {
                    case 1:
                        return b(iMMessage, z);
                    case 2:
                        return c(iMMessage, z);
                    default:
                        return null;
                }
            }

            private com.sankuai.waimai.imbase.listener.model.a b(IMMessage iMMessage, boolean z) {
                String str;
                String str2;
                Object[] objArr2 = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d812db38816c096e826204928afebd09", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.imbase.listener.model.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d812db38816c096e826204928afebd09");
                }
                String fromName = iMMessage.getFromName();
                if (fromName == null) {
                    fromName = "";
                }
                String a2 = h.a(iMMessage);
                long chatId = iMMessage.getChatId();
                final HashMap hashMap = new HashMap();
                hashMap.put("type", 1);
                try {
                    long a3 = com.sankuai.waimai.imbase.utils.g.a(new JSONObject(iMMessage.getExtension()).optString("chatfid"));
                    if (a3 == 0) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("id", String.valueOf(iMMessage.getMsgId()));
                        WMImSdkInitService.this.logFail("rider", hashMap2);
                    }
                    com.sankuai.waimai.imbase.listener.model.a aVar = new com.sankuai.waimai.imbase.listener.model.a(true);
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("prepare_chat_page_im_type", "1");
                    if (z) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(a3);
                        hashMap3.put(Constants.EventConstants.KEY_ORDER_ID, sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(chatId);
                        hashMap3.put("riderId", sb2.toString());
                        hashMap3.put("from", "1");
                        if (TextUtils.isEmpty(fromName)) {
                            str2 = "骑手";
                        } else {
                            str2 = "骑手：" + fromName;
                        }
                        aVar.a(new a.C0962a(str2, a2, WMImSdkInitService.this.getRiderUIInfo(chatId).b, R.drawable.wm_im_rider_default_avatar, iMMessage.getSts(), hashMap3, new a.c() { // from class: com.sankuai.waimai.business.im.prepare.WMImSdkInitService.2.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.imbase.listener.model.a.c
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f059fcd6de96e9f72bc15e934b805c64", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f059fcd6de96e9f72bc15e934b805c64");
                                    return;
                                }
                                JudasManualManager.b("b_2fewqhua").a("messageId", 0).a("category", "").a("type", 1).a();
                                JudasManualManager.b("b_w7mRZ").b(hashMap).a();
                            }

                            @Override // com.sankuai.waimai.imbase.listener.model.a.c
                            public final void b() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5cb72314490010ddcbcc057b9bac28be", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5cb72314490010ddcbcc057b9bac28be");
                                    return;
                                }
                                JudasManualManager.a("b_cvqfb6g1").a("messageId", 0).a("category", "").a("type", 1).a();
                                JudasManualManager.a("b_xxL1F").b(hashMap).a();
                            }
                        }));
                        return aVar;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(a3);
                    hashMap3.put(Constants.EventConstants.KEY_ORDER_ID, sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(chatId);
                    hashMap3.put("riderId", sb4.toString());
                    hashMap3.put("from", "2");
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("im_type", 1);
                    Context context = com.meituan.android.singleton.b.a;
                    StringBuilder sb5 = new StringBuilder();
                    if (TextUtils.isEmpty(fromName)) {
                        str = "骑手";
                    } else {
                        str = "骑手" + fromName;
                    }
                    sb5.append(str);
                    sb5.append(CommonConstant.Symbol.COLON);
                    sb5.append(a2);
                    aVar.a(new a.b(context, sb5.toString(), hashMap3, hashMap4));
                    return aVar;
                } catch (JSONException unused) {
                    return new com.sankuai.waimai.imbase.listener.model.a(false);
                }
            }

            private com.sankuai.waimai.imbase.listener.model.a c(IMMessage iMMessage, boolean z) {
                long a2;
                long a3;
                String optString;
                String optString2;
                String optString3;
                com.sankuai.waimai.imbase.listener.model.a aVar;
                HashMap hashMap;
                Object[] objArr2 = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a5c2bc25f22cb918bef07262b5702228", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.imbase.listener.model.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a5c2bc25f22cb918bef07262b5702228");
                }
                final HashMap hashMap2 = new HashMap();
                hashMap2.put("type", 2);
                String a4 = h.a(iMMessage);
                try {
                    JSONObject jSONObject = new JSONObject(iMMessage.getExtension());
                    a2 = com.sankuai.waimai.imbase.utils.g.a(jSONObject.optString("order_id"));
                    a3 = com.sankuai.waimai.imbase.utils.g.a(jSONObject.optString("poi_id"));
                    optString = jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
                    optString2 = jSONObject.optString(AgainManager.EXTRA_POI_NAME, "商家");
                    optString3 = jSONObject.optString("poi_logo_url");
                    if (aa.a(optString) && a3 == 0) {
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("order_id", String.valueOf(a2));
                        hashMap3.put(AgainManager.EXTRA_POI_NAME, optString2);
                        hashMap3.put("poi_logo_url", optString3);
                        hashMap3.put("id", String.valueOf(iMMessage.getMsgId()));
                        WMImSdkInitService.this.logFail("poi", hashMap3);
                    }
                    aVar = new com.sankuai.waimai.imbase.listener.model.a(true);
                    hashMap = new HashMap();
                    hashMap.put("prepare_chat_page_im_type", "2");
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
                if (z) {
                    if (com.sankuai.waimai.foundation.utils.activity.a.a().b() != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(a3);
                        hashMap.put("poiId", sb.toString());
                        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, optString);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(a2);
                        hashMap.put(Constants.EventConstants.KEY_ORDER_ID, sb2.toString());
                        hashMap.put("from", "1");
                        aVar.a(new a.C0962a(optString2, a4, optString3, R.drawable.wm_im_poi_default_avatar, iMMessage.getSts(), hashMap, new a.c() { // from class: com.sankuai.waimai.business.im.prepare.WMImSdkInitService.2.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.imbase.listener.model.a.c
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "92c075cf6f0caed209416b6300267558", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "92c075cf6f0caed209416b6300267558");
                                    return;
                                }
                                JudasManualManager.b("b_2fewqhua").a("messageId", 0).a("category", "").a("type", 2).a();
                                JudasManualManager.b("b_w7mRZ").b(hashMap2).a();
                            }

                            @Override // com.sankuai.waimai.imbase.listener.model.a.c
                            public final void b() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "221aa64dac2a9bcfa44530568f9c57e6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "221aa64dac2a9bcfa44530568f9c57e6");
                                    return;
                                }
                                JudasManualManager.a("b_cvqfb6g1").a("messageId", 0).a("category", "").a("type", 2).a();
                                JudasManualManager.a("b_xxL1F").b(hashMap2).a();
                            }
                        }));
                        return aVar;
                    }
                    return new com.sankuai.waimai.imbase.listener.model.a(false);
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(a2);
                hashMap.put(Constants.EventConstants.KEY_ORDER_ID, sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(a3);
                hashMap.put("poiId", sb4.toString());
                hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, optString);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
                hashMap.put(DeviceInfo.USER_ID, sb5.toString());
                hashMap.put("from", "2");
                HashMap hashMap4 = new HashMap();
                hashMap4.put("im_type", 2);
                Context context = com.meituan.android.singleton.b.a;
                aVar.a(new a.b(context, optString2 + " : " + a4, hashMap, hashMap4));
                return aVar;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logFail(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9019316a35c3e74ddebfcad65468184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9019316a35c3e74ddebfcad65468184");
        } else {
            com.sankuai.waimai.business.im.common.log.b.a(NetLogConstants.Details.SCHEME, str, "scheme拼接异常", map);
        }
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.b createSessionConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "766e73357869a8fcdace5c7156c9a274", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "766e73357869a8fcdace5c7156c9a274") : new com.sankuai.waimai.imbase.init.model.b((short) 1001, new com.sankuai.waimai.imbase.listener.b() { // from class: com.sankuai.waimai.business.im.prepare.WMImSdkInitService.3
            public static ChangeQuickRedirect a;

            /* JADX WARN: Can't wrap try/catch for region: R(15:6|7|(2:9|(1:11)(2:12|(2:14|(12:16|17|18|(1:21)(1:41)|22|23|24|(2:26|(5:28|(2:30|(1:32))|33|34|35))|38|33|34|35))))|55|17|18|(0)(0)|22|23|24|(0)|38|33|34|35) */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x01f2, code lost:
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x01f3, code lost:
                r0.printStackTrace();
             */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[Catch: JSONException -> 0x01f9, TryCatch #0 {JSONException -> 0x01f9, blocks: (B:6:0x0023, B:8:0x003c, B:10:0x0049, B:11:0x004e, B:13:0x0074, B:17:0x0084, B:18:0x0093, B:34:0x01a7, B:36:0x01ac, B:51:0x01f6, B:50:0x01f3, B:35:0x01aa, B:20:0x009b, B:22:0x00b6, B:24:0x00bc, B:25:0x00dd, B:26:0x0124, B:28:0x0130, B:29:0x014b, B:31:0x018b, B:32:0x0194, B:37:0x01bd, B:39:0x01c1, B:41:0x01c9, B:47:0x01eb), top: B:56:0x0023, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0124 A[Catch: JSONException -> 0x01f9, TryCatch #0 {JSONException -> 0x01f9, blocks: (B:6:0x0023, B:8:0x003c, B:10:0x0049, B:11:0x004e, B:13:0x0074, B:17:0x0084, B:18:0x0093, B:34:0x01a7, B:36:0x01ac, B:51:0x01f6, B:50:0x01f3, B:35:0x01aa, B:20:0x009b, B:22:0x00b6, B:24:0x00bc, B:25:0x00dd, B:26:0x0124, B:28:0x0130, B:29:0x014b, B:31:0x018b, B:32:0x0194, B:37:0x01bd, B:39:0x01c1, B:41:0x01c9, B:47:0x01eb), top: B:56:0x0023, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x01a7 A[Catch: JSONException -> 0x01f9, TryCatch #0 {JSONException -> 0x01f9, blocks: (B:6:0x0023, B:8:0x003c, B:10:0x0049, B:11:0x004e, B:13:0x0074, B:17:0x0084, B:18:0x0093, B:34:0x01a7, B:36:0x01ac, B:51:0x01f6, B:50:0x01f3, B:35:0x01aa, B:20:0x009b, B:22:0x00b6, B:24:0x00bc, B:25:0x00dd, B:26:0x0124, B:28:0x0130, B:29:0x014b, B:31:0x018b, B:32:0x0194, B:37:0x01bd, B:39:0x01c1, B:41:0x01c9, B:47:0x01eb), top: B:56:0x0023, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x01aa A[Catch: JSONException -> 0x01f9, TryCatch #0 {JSONException -> 0x01f9, blocks: (B:6:0x0023, B:8:0x003c, B:10:0x0049, B:11:0x004e, B:13:0x0074, B:17:0x0084, B:18:0x0093, B:34:0x01a7, B:36:0x01ac, B:51:0x01f6, B:50:0x01f3, B:35:0x01aa, B:20:0x009b, B:22:0x00b6, B:24:0x00bc, B:25:0x00dd, B:26:0x0124, B:28:0x0130, B:29:0x014b, B:31:0x018b, B:32:0x0194, B:37:0x01bd, B:39:0x01c1, B:41:0x01c9, B:47:0x01eb), top: B:56:0x0023, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x01c1 A[Catch: Exception -> 0x01f2, TryCatch #1 {Exception -> 0x01f2, blocks: (B:37:0x01bd, B:39:0x01c1, B:41:0x01c9, B:47:0x01eb), top: B:58:0x01bd, outer: #0 }] */
            @Override // com.sankuai.waimai.imbase.listener.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.sankuai.waimai.imbase.listener.model.b a(com.sankuai.xm.im.session.entry.a r20) {
                /*
                    Method dump skipped, instructions count: 520
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.prepare.WMImSdkInitService.AnonymousClass3.a(com.sankuai.xm.im.session.entry.a):com.sankuai.waimai.imbase.listener.model.b");
            }
        });
    }
}
