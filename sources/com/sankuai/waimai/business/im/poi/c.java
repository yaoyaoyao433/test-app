package com.sankuai.waimai.business.im.poi;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.waimai.business.im.api.WaimaiIMService;
import com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter;
import com.sankuai.waimai.business.im.common.adapter.WmPoiSendPanelAdapter;
import com.sankuai.waimai.business.im.common.message.IMMessageAdapter;
import com.sankuai.waimai.business.im.common.view.OrderStatusBannerView;
import com.sankuai.waimai.business.im.model.PoiImInfo;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.model.e;
import com.sankuai.waimai.business.im.model.g;
import com.sankuai.waimai.business.im.model.m;
import com.sankuai.waimai.business.im.model.n;
import com.sankuai.waimai.business.im.prepare.i;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.xm.im.message.bean.CustomEmotionMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.processors.LinkProcessor;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends i {
    public static ChangeQuickRedirect b;
    private WmPoiSendPanelAdapter t;
    private String u;
    private String v;
    private OrderStatusBannerView w;
    private com.sankuai.waimai.business.im.common.view.a x;
    private boolean y;

    @Override // com.sankuai.waimai.business.im.prepare.i, com.sankuai.waimai.business.im.prepare.c
    public final int u() {
        return 0;
    }

    public static /* synthetic */ void a(c cVar, PoiImInfo.a aVar) {
        Map hashMap;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "42ee0eb9d7d4e0d3f1f448979c62a5ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "42ee0eb9d7d4e0d3f1f448979c62a5ce");
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("title", aVar.b);
        hashMap2.put("code", Integer.valueOf(aVar.a));
        hashMap2.put("real_cid", d.a);
        hashMap2.put("channel_id", (short) 1001);
        hashMap2.put(Constants.Business.KEY_BU_ID, 1705);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "71df3da694b919603b8077abd7ad9593", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "71df3da694b919603b8077abd7ad9593");
        } else {
            hashMap = new HashMap();
            hashMap.put("order_id", String.valueOf(cVar.l));
            hashMap.put("c_name", cVar.j);
            hashMap.put("c_avatar_url", cVar.k);
            hashMap.put("poi_id", String.valueOf(cVar.n));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, cVar.o);
            hashMap.put(AgainManager.EXTRA_POI_NAME, cVar.m.poiName);
            hashMap.put("poi_logo_url", cVar.m.poiPicUrl);
            hashMap.put("poiType", 0);
            hashMap.put("version", com.sankuai.waimai.platform.b.A().i());
            hashMap.put("source", "Android");
            hashMap.put("ref", Integer.valueOf(cVar.q));
        }
        hashMap2.put("extension", hashMap);
        hashMap2.put("poi_id", com.sankuai.waimai.business.im.utils.a.a(cVar.n, cVar.o));
        b.a(hashMap2);
        Object[] objArr3 = {hashMap2};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a3cf8f85634c0cc64c5890a9e1255bb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a3cf8f85634c0cc64c5890a9e1255bb2");
            return;
        }
        Object[] objArr4 = {hashMap2};
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.ptcommonim.quickbutton.a.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "234dff730ef45bfe037ccdc9ea03c44d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "234dff730ef45bfe037ccdc9ea03c44d");
            return;
        }
        Integer num = (Integer) hashMap2.get("code");
        if (num == null || num.intValue() != 17) {
            return;
        }
        String str = (String) hashMap2.get("title");
        hashMap2.get("url");
        Map map = (Map) hashMap2.get("extension");
        if (map == null) {
            map = new HashMap();
        }
        map.put("invoice_quick", 1);
        Object[] objArr5 = {"开发票", str, map};
        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.ptcommonim.quickbutton.a.a;
        IMMessage a = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "aa58d048892f6f9c4d57237b615ff9e2", RobustBitConfig.DEFAULT_VALUE) ? (IMMessage) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "aa58d048892f6f9c4d57237b615ff9e2") : com.sankuai.xm.imui.common.util.c.a("开发票");
        a.setExtension(JsonHelper.toJsonString(map));
        a.setFromUid(com.sankuai.xm.imui.b.a().d());
        a.setChatId(com.sankuai.xm.imui.b.a().d());
        a.setCategory(com.sankuai.xm.imui.b.a().e());
        a.setPeerUid(com.sankuai.xm.imui.b.a().f().c);
        a.setToUid(com.sankuai.xm.imui.b.a().d());
        a.setToAppId(com.sankuai.xm.imui.b.a().g());
        a.setPeerAppId(com.sankuai.xm.imui.b.a().g());
        a.setMsgStatus(9);
        a.setChannel(com.sankuai.xm.imui.b.a().f().g);
        IMUIManager.a().a(a, false);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("poi_id", hashMap2.get("poi_id"));
        hashMap3.put("real_cid", hashMap2.get("real_cid"));
        hashMap3.put(Constants.Business.KEY_BU_ID, hashMap2.get(Constants.Business.KEY_BU_ID));
        hashMap3.put("user_type", com.meituan.android.ptcommonim.quickbutton.a.a(hashMap2));
        com.sankuai.xm.imui.b a2 = com.sankuai.xm.imui.b.a();
        if (a2 != null && a2.f() != null) {
            SessionId f = a2.f();
            hashMap3.put("channel_id", a2 != null ? Short.valueOf(f.g) : "-999");
            hashMap3.put("chat_type", com.meituan.android.ptcommonim.quickbutton.a.a(f));
            hashMap3.put("message_body_id", f != null ? Long.valueOf(f.b) : "-999");
            hashMap3.put("peer_uid", f != null ? Long.valueOf(f.c) : "-999");
            hashMap3.put(Message.SID, (f == null || TextUtils.isEmpty(f.g())) ? "-999" : f.g());
        }
        Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_re9bj1f4_mc", hashMap3, "c_group_74zpfj6k");
    }

    public static /* synthetic */ void a(c cVar, e eVar, int i, long j) {
        Object[] objArr = {eVar, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "d36fb68615e9a499cdd42f17cf86fdc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "d36fb68615e9a499cdd42f17cf86fdc8");
            return;
        }
        if (eVar.b == 1) {
            e.a a = eVar.a();
            if (a == null) {
                cVar.G();
                return;
            }
            byte[] a2 = new com.sankuai.waimai.business.im.model.a(a.a, a.b, a.c, a.d, a.e, a.f, a.g, TextUtils.isEmpty(eVar.c) ? "商家店铺位置" : eVar.c, eVar.e).a(301, j);
            if (a2 != null) {
                GeneralMessage a3 = com.sankuai.xm.imui.common.util.c.a(a2, 0, "[商家位置]");
                if (i == 1) {
                    cVar.a((IMMessage) a3, false);
                } else {
                    IMUIManager.a().a((IMMessage) a3, false);
                }
            }
        } else if (com.sankuai.waimai.foundation.utils.d.a(eVar.d)) {
            cVar.G();
        } else {
            byte[] a4 = new com.sankuai.waimai.business.im.model.b(eVar.c, eVar.d).a(302, j);
            if (a4 != null) {
                GeneralMessage a5 = com.sankuai.xm.imui.common.util.c.a(a4, 0, "[商家营业时间]");
                if (i == 1) {
                    cVar.a((IMMessage) a5, false);
                    if (cVar.f != null) {
                        cVar.f.y();
                        return;
                    }
                    return;
                }
                IMUIManager.a().a((IMMessage) a5, false);
            }
        }
    }

    public static /* synthetic */ void a(c cVar, g.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "bff1bb96788855716346a893db289188", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "bff1bb96788855716346a893db289188");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiIMService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiIMService.class)).getAutoAnswerInfo(aVar.b, cVar.l, cVar.n, cVar.o), new b.AbstractC1042b<BaseResponse<e>>() { // from class: com.sankuai.waimai.business.im.poi.c.3
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3182e94d56b044ed93fa25d671cb2ccb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3182e94d56b044ed93fa25d671cb2ccb");
                    } else if (baseResponse == null || !baseResponse.isSuccess() || baseResponse.data == 0) {
                        c.this.G();
                    } else {
                        c.a(c.this, (e) baseResponse.data, 1, 0L);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69e64719cd09db1eaeb91ea4dde0bfe2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69e64719cd09db1eaeb91ea4dde0bfe2");
                    } else {
                        c.this.G();
                    }
                }
            }, cVar.u);
        }
    }

    public c(SessionFragment sessionFragment, SessionParams sessionParams) {
        super(sessionFragment, sessionParams);
        Object[] objArr = {sessionFragment, sessionParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aae3477fa7de3e648195f2ce440df3ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aae3477fa7de3e648195f2ce440df3ba");
            return;
        }
        this.u = getClass().getSimpleName() + "_type";
        this.v = getClass().getSimpleName() + "_content";
        this.y = false;
        com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-im");
    }

    @Override // com.sankuai.waimai.business.im.prepare.i, com.sankuai.waimai.business.im.prepare.c
    public final void a(SessionParams sessionParams) {
        Object[] objArr = {sessionParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0034af09cc8b534b4538b4c88fb8869c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0034af09cc8b534b4538b4c88fb8869c");
            return;
        }
        super.a(sessionParams);
        HashMap hashMap = new HashMap(2);
        hashMap.put("__ffpdp", "001");
        hashMap.put("wm_im_type", String.valueOf(com.sankuai.waimai.business.im.utils.c.a(2)));
        com.sankuai.waimai.business.im.utils.c.a(hashMap);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public final IExtraAdapter a(int i, final com.sankuai.waimai.business.im.prepare.g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114181ad1b37936a63e934a008fdfcd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (IExtraAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114181ad1b37936a63e934a008fdfcd1");
        }
        if (i == 16) {
            final WMCommonDataInfo wMCommonDataInfo = this.h;
            final String str = d.a;
            final String a = com.sankuai.waimai.business.im.utils.a.a(this.n, this.o);
            return new IMMessageAdapter(wMCommonDataInfo, this, str, gVar, a) { // from class: com.sankuai.waimai.business.im.poi.WMPoiChatPageDelegate$1
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.business.im.common.message.IMMessageAdapter
                public final Context a() {
                    Activity activity;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "886034a5ca7f81f943b10cdf4f9f88d4", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Context) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "886034a5ca7f81f943b10cdf4f9f88d4");
                    }
                    activity = c.this.e;
                    return activity;
                }
            };
        }
        return super.a(i, gVar);
    }

    @Override // com.sankuai.waimai.business.im.prepare.i, com.sankuai.waimai.business.im.prepare.a
    public final String t() {
        return this.m.wmCommonData;
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final ISendPanelAdapter bq_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4172284d0503bcceb05557fb752ecb61", RobustBitConfig.DEFAULT_VALUE)) {
            return (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4172284d0503bcceb05557fb752ecb61");
        }
        super.bq_();
        this.t = new WmPoiSendPanelAdapter(z(), new WmPoiSendPanelAdapter.a() { // from class: com.sankuai.waimai.business.im.poi.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.im.common.adapter.WmPoiSendPanelAdapter.a
            public final void a(g.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ea356235e843fd5ae51a943c45f4551", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ea356235e843fd5ae51a943c45f4551");
                } else if (aVar == null) {
                } else {
                    JudasManualManager.a("b_waimai_gvjyeep4_mc").a("c_waimai_wgiu7lrd").a("keyword", String.valueOf(aVar.b)).a();
                    c.a(c.this, aVar);
                }
            }
        }, this.m == null ? false : this.m.hasOrder, this.m != null && this.m.inputFieldStatus == 3, this.p, new WmPoiSendPanelAdapter.c() { // from class: com.sankuai.waimai.business.im.poi.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.im.common.adapter.WmPoiSendPanelAdapter.c
            public final void a(PoiImInfo.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a3d6f858fcf7b4e9f1e817517e59ee2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a3d6f858fcf7b4e9f1e817517e59ee2");
                } else if (aVar == null) {
                } else {
                    if (aVar.a == 15) {
                        JudasManualManager.b(d.n).a("poi_id", com.sankuai.waimai.business.im.utils.a.a(c.this.n, c.this.o)).a("is_new_fan", c.this.m.isNewFans).a(d.a).a();
                    } else if (aVar.a == 17) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("title", aVar.b);
                        hashMap.put("code", Integer.valueOf(aVar.a));
                        hashMap.put("real_cid", d.a);
                        hashMap.put("channel_id", (short) 1001);
                        hashMap.put(Constants.Business.KEY_BU_ID, 1705);
                        hashMap.put("poi_id", com.sankuai.waimai.business.im.utils.a.a(c.this.n, c.this.o));
                        b.a(hashMap);
                        Object[] objArr3 = {hashMap};
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a3b5f5b2f5a66dd9105a7b31f6ad5a8d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a3b5f5b2f5a66dd9105a7b31f6ad5a8d");
                            return;
                        }
                        Object[] objArr4 = {hashMap};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.ptcommonim.quickbutton.a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "e9bc924a96f0527ffa04596a14c97975", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "e9bc924a96f0527ffa04596a14c97975");
                        } else if (((Integer) hashMap.get("code")).intValue() == 17) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("poi_id", hashMap.get("poi_id"));
                            hashMap2.put("real_cid", hashMap.get("real_cid"));
                            hashMap2.put(Constants.Business.KEY_BU_ID, hashMap.get(Constants.Business.KEY_BU_ID));
                            hashMap2.put("user_type", com.meituan.android.ptcommonim.quickbutton.a.a(hashMap));
                            com.sankuai.xm.imui.b a2 = com.sankuai.xm.imui.b.a();
                            if (a2 != null && a2.f() != null) {
                                SessionId f = a2.f();
                                hashMap2.put("channel_id", a2 != null ? Short.valueOf(f.g) : "-999");
                                hashMap2.put("chat_type", com.meituan.android.ptcommonim.quickbutton.a.a(f));
                                hashMap2.put("message_body_id", f != null ? Long.valueOf(f.b) : "-999");
                                hashMap2.put("peer_uid", f != null ? Long.valueOf(f.c) : "-999");
                                hashMap2.put(Message.SID, (f == null || TextUtils.isEmpty(f.g())) ? "-999" : f.g());
                            }
                            Statistics.getChannel("group").writeModelView("pt_common_im_page", "b_group_re9bj1f4_mv", hashMap2, "c_group_74zpfj6k");
                        }
                    }
                }
            }

            @Override // com.sankuai.waimai.business.im.common.adapter.WmPoiSendPanelAdapter.c
            public final void b(PoiImInfo.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b1e0f3b0c52c779ad93c4e5806929c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b1e0f3b0c52c779ad93c4e5806929c0");
                } else if (aVar == null) {
                } else {
                    if (aVar.a == 15) {
                        JudasManualManager.a(d.m).a("poi_id", com.sankuai.waimai.business.im.utils.a.a(c.this.n, c.this.o)).a("is_new_fan", c.this.m.isNewFans).a(d.a).a();
                        String str = "";
                        if (com.sankuai.waimai.foundation.core.a.e()) {
                            str = "imeituan://www.meituan.com";
                        } else if (!com.sankuai.waimai.foundation.core.a.f()) {
                            str = "meituanwaimai://waimai.meituan.com";
                        }
                        com.sankuai.waimai.foundation.router.a.a(c.this.e, str + "/im/request/group/join?poiId=" + c.this.n + "&poi_id_str=" + c.this.o + "&orderId=" + c.this.l + "&source=6");
                    } else if (aVar.a == 17) {
                        c.a(c.this, aVar);
                    } else {
                        JudasManualManager.a(d.l).a(d.a).a();
                        byte[] a2 = new m(aVar.b, aVar.d).a(1010);
                        if (a2 != null) {
                            c.this.a((IMMessage) com.sankuai.xm.imui.common.util.c.a(a2, 0, c.this.a(aVar)), false);
                            if (c.this.f != null) {
                                c.this.f.y();
                            }
                        }
                    }
                }
            }
        }, this.m.buttonInfos, this.l);
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(PoiImInfo.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43803b8c8848605e66fa4fbbaad8715d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43803b8c8848605e66fa4fbbaad8715d");
        }
        if (aVar.d == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(aVar.d);
            String string = jSONObject.getString("title");
            String string2 = jSONObject.getString("content");
            com.sankuai.xm.imui.common.processors.d dVar = new com.sankuai.xm.imui.common.processors.d();
            LinkProcessor linkProcessor = new LinkProcessor();
            linkProcessor.c = false;
            dVar.a(linkProcessor);
            String charSequence = dVar.a(string2).toString();
            return "[" + string + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + charSequence;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f355924dcea02d94068412e4af12883", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f355924dcea02d94068412e4af12883");
            return;
        }
        super.b();
        if (this.w != null) {
            this.w.a();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e56d77a4fb192b1af9e64187390be34c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e56d77a4fb192b1af9e64187390be34c");
        } else if (this.y || TextUtils.isEmpty(this.m.orderStatusContent)) {
        } else {
            this.y = true;
            byte[] a = new n(this.m.orderStatusContent).a(6);
            if (a != null) {
                a((IMMessage) com.sankuai.xm.imui.common.util.c.a(a), true);
            }
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void bs_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "506d707721673c9f4b68ba53756f7e60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "506d707721673c9f4b68ba53756f7e60");
            return;
        }
        super.bs_();
        if (this.w != null) {
            this.w.b();
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170d3e0ed915658b30882c906b01f9a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170d3e0ed915658b30882c906b01f9a0");
            return;
        }
        super.k();
        if (this.t != null) {
            this.t.c();
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.u);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.v);
        if (this.x != null) {
            this.x.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcba18d921a719ba3b9eab041570d108", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcba18d921a719ba3b9eab041570d108");
        } else {
            ae.a(this.e, "数据加载失败，稍后再试");
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.i, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final TitleBarAdapter g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33758ef95c599a5e7e0e99ca7931cd0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33758ef95c599a5e7e0e99ca7931cd0b");
        }
        final WMIMTitleBarAdapter.a aVar = new WMIMTitleBarAdapter.a() { // from class: com.sankuai.waimai.business.im.poi.c.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccad83f50ac0252b1a1860ea3489ed54", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccad83f50ac0252b1a1860ea3489ed54");
                } else {
                    c.this.F();
                }
            }

            @Override // com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fce93ddbd682fc1881b74c3797d29c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fce93ddbd682fc1881b74c3797d29c3");
                    return;
                }
                c.this.a(c.this.e, c.this.n, c.this.o, c.this.m);
                c.this.E();
            }
        };
        WMIMTitleBarAdapter wMIMTitleBarAdapter = new WMIMTitleBarAdapter(aVar) { // from class: com.sankuai.waimai.business.im.poi.WMPoiChatPageDelegate$7
            public static ChangeQuickRedirect p;

            @Override // com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter
            public final void a(View view) {
                Activity activity;
                Activity activity2;
                com.sankuai.waimai.business.im.common.view.a aVar2;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = p;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31804af81645b7555bcd34495bbf6b81", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31804af81645b7555bcd34495bbf6b81");
                    return;
                }
                super.a(view);
                c cVar = c.this;
                activity = c.this.e;
                activity2 = c.this.e;
                cVar.x = new com.sankuai.waimai.business.im.common.view.a(activity, activity2.getString(R.string.wm_im_move_poi_phone_to_here_tips));
                aVar2 = c.this.x;
                aVar2.a(this.f);
            }
        };
        wMIMTitleBarAdapter.b = this.m.poiName;
        wMIMTitleBarAdapter.j = true;
        wMIMTitleBarAdapter.k = true;
        return wMIMTitleBarAdapter;
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "806eb235d75f3a0bc162fa3257f746bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "806eb235d75f3a0bc162fa3257f746bb");
        }
        this.w = (OrderStatusBannerView) layoutInflater.inflate(R.layout.wm_im_layout_order_status, (ViewGroup) null);
        this.w.a(this.e, 1L, this.l);
        return this.w;
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void a(int i, IMMessage iMMessage) {
        Object[] objArr = {Integer.valueOf(i), iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d40091d1241ad2fbf6ce5234382bd47b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d40091d1241ad2fbf6ce5234382bd47b");
            return;
        }
        super.a(i, iMMessage);
        if (iMMessage instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) iMMessage;
            if (!TextUtils.isEmpty(textMessage.getText())) {
                String text = textMessage.getText();
                final long msgId = iMMessage.getMsgId();
                Object[] objArr2 = {text, new Long(msgId)};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7998933c0ae3d929d348c5de9f1dd046", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7998933c0ae3d929d348c5de9f1dd046");
                } else {
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.v);
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiIMService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiIMService.class)).getAutoAnswerInfo(text, this.l, this.n, this.o), new b.AbstractC1042b<BaseResponse<e>>() { // from class: com.sankuai.waimai.business.im.poi.c.4
                        public static ChangeQuickRedirect a;

                        @Override // rx.e
                        public final void onError(Throwable th) {
                        }

                        @Override // rx.e
                        public final /* synthetic */ void onNext(Object obj) {
                            BaseResponse baseResponse = (BaseResponse) obj;
                            Object[] objArr3 = {baseResponse};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "748fb3a7273ad94228c9296f8c1507f1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "748fb3a7273ad94228c9296f8c1507f1");
                            } else if (baseResponse == null || !baseResponse.isSuccess() || baseResponse.data == 0) {
                            } else {
                                c.a(c.this, (e) baseResponse.data, 0, msgId);
                            }
                        }
                    }, this.v);
                }
            }
        }
        if (iMMessage instanceof CustomEmotionMessage) {
            HashMap hashMap = new HashMap();
            hashMap.put("stid", ((CustomEmotionMessage) iMMessage).getId());
            JudasManualManager.a("b_waimai_739ap29f_mc").a("c_waimai_wgiu7lrd").a((Map<String, Object>) hashMap).a();
        }
    }
}
