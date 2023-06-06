package com.sankuai.waimai.business.im.prepare;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper;
import com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter;
import com.sankuai.waimai.business.im.common.adapter.WmRiderSendPanelAdapter;
import com.sankuai.waimai.business.im.common.api.WmImCommonService;
import com.sankuai.waimai.business.im.common.message.IMMessageAdapter;
import com.sankuai.waimai.business.im.common.view.OrderStatusBannerView;
import com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment;
import com.sankuai.waimai.business.im.message.LocationMessageAdapter;
import com.sankuai.waimai.business.im.model.RiderImInfo;
import com.sankuai.waimai.business.im.model.TipMessageData;
import com.sankuai.waimai.business.im.model.g;
import com.sankuai.waimai.business.im.model.o;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.CustomEmotionMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class BaseRiderChatPageDelegate extends a implements com.sankuai.waimai.business.order.api.submit.a {
    public static ChangeQuickRedirect b;
    private com.sankuai.xm.base.callback.c<com.sankuai.xm.imui.session.event.a> A;
    private com.sankuai.xm.imui.session.entity.b<GeneralMessage> B;
    private int C;
    protected long i;
    protected int j;
    protected RiderImInfo k;
    protected String l;
    protected boolean m;
    private String n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private OrderStatusBannerView u;
    private com.sankuai.waimai.business.im.common.view.a v;
    private WmRiderSendPanelAdapter w;
    private boolean x;
    private com.sankuai.waimai.business.im.common.plugin.smartreply.c y;
    private OrderStatusBannerView.a z;

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void a(long j) {
    }

    public abstract void c(long j);

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public int p() {
        return 1;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public String s() {
        return null;
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public final int y() {
        return 1;
    }

    public static /* synthetic */ void a(BaseRiderChatPageDelegate baseRiderChatPageDelegate, Activity activity, final int i, int i2, Intent intent) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, baseRiderChatPageDelegate, changeQuickRedirect, false, "104db6a482abe8b49184e2971dd750aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, baseRiderChatPageDelegate, changeQuickRedirect, false, "104db6a482abe8b49184e2971dd750aa");
        } else {
            com.sankuai.waimai.business.im.common.rxbus.d.a(activity, i, i2, intent, String.valueOf(baseRiderChatPageDelegate.i), 1, new com.sankuai.xm.im.f<IMMessage>() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.f
                public final /* synthetic */ void a(IMMessage iMMessage) {
                    IMMessage iMMessage2 = iMMessage;
                    Object[] objArr2 = {iMMessage2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fb4cc464f57b37d3e6f2c3a3734f736", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0fb4cc464f57b37d3e6f2c3a3734f736");
                    } else if (i == 117) {
                        BaseRiderChatPageDelegate.a(BaseRiderChatPageDelegate.this, true);
                        if (BaseRiderChatPageDelegate.this.B != null) {
                            IMUIManager.a().a(BaseRiderChatPageDelegate.this.B.b);
                        }
                    } else {
                        EventMessage b2 = com.sankuai.xm.imui.common.util.c.b("该地址仅作为聊天消息，是否可配送请与骑手沟通确认");
                        b2.setCts(iMMessage2.getSts() + 1);
                        BaseRiderChatPageDelegate.this.b(b2);
                        com.sankuai.waimai.imbase.utils.f.b(b2, false);
                    }
                }

                @Override // com.sankuai.xm.im.f
                public final void a(int i3, String str) {
                    Object[] objArr2 = {Integer.valueOf(i3), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5cd831c5ddd7c3a18bc8a7501ace3fbf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5cd831c5ddd7c3a18bc8a7501ace3fbf");
                        return;
                    }
                    if ("FAIL".equals(str)) {
                        ae.a(BaseRiderChatPageDelegate.this.e, BaseRiderChatPageDelegate.this.k.locationToast);
                    }
                    if (i == 117) {
                        BaseRiderChatPageDelegate.a(BaseRiderChatPageDelegate.this, false);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void a(BaseRiderChatPageDelegate baseRiderChatPageDelegate, com.sankuai.xm.im.session.entry.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, baseRiderChatPageDelegate, changeQuickRedirect, false, "88bced3bb70c7f4920760036ddf42d38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, baseRiderChatPageDelegate, changeQuickRedirect, false, "88bced3bb70c7f4920760036ddf42d38");
        } else if (baseRiderChatPageDelegate.k.sessionStatus != 0 || baseRiderChatPageDelegate.q) {
        } else {
            if (aVar == null || aVar.b == null || TextUtils.isEmpty(aVar.b.getExtension())) {
                baseRiderChatPageDelegate.a(baseRiderChatPageDelegate.k.tipMessage, true);
                baseRiderChatPageDelegate.q = true;
                return;
            }
            try {
                if (new JSONObject(aVar.b.getExtension()).optString("chatfid").equals(String.valueOf(baseRiderChatPageDelegate.i))) {
                    return;
                }
                baseRiderChatPageDelegate.a(baseRiderChatPageDelegate.k.tipMessage, true);
                baseRiderChatPageDelegate.q = true;
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate r12, java.util.List r13) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.b
            java.lang.String r11 = "e5c5250ea685648180eed5d98d90ce57"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            int r1 = r12.C
            if (r1 > 0) goto L90
            r1 = 0
            java.util.Iterator r13 = r13.iterator()
        L24:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r13.next()
            com.sankuai.waimai.business.im.model.g$a r2 = (com.sankuai.waimai.business.im.model.g.a) r2
            int r3 = r2.b
            r4 = 3
            if (r3 == r4) goto L3a
            int r3 = r2.b
            r4 = 4
            if (r3 != r4) goto L24
        L3a:
            r1 = r2
        L3b:
            if (r1 == 0) goto L90
            java.lang.String r13 = r1.d
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L90
            com.google.gson.Gson r13 = com.sankuai.waimai.mach.utils.b.a()
            java.lang.String r1 = r1.d
            java.lang.Class<com.sankuai.waimai.business.im.model.f> r2 = com.sankuai.waimai.business.im.model.f.class
            java.lang.Object r13 = r13.fromJson(r1, r2)
            com.sankuai.waimai.business.im.model.f r13 = (com.sankuai.waimai.business.im.model.f) r13
            r1 = 4001(0xfa1, float:5.607E-42)
            byte[] r1 = r13.a(r1)
            if (r1 == 0) goto L90
            java.lang.String r2 = ""
            com.sankuai.xm.im.message.bean.GeneralMessage r1 = com.sankuai.xm.imui.common.util.c.a(r1, r9, r2)
            r12.a(r1, r9)
            com.sankuai.xm.imui.session.SessionFragment r1 = r12.f
            if (r1 == 0) goto L6d
            com.sankuai.xm.imui.session.SessionFragment r1 = r12.f
            r1.y()
        L6d:
            r12.C = r0
            android.app.Activity r1 = r12.e
            java.lang.String r2 = "_modify_address_"
            com.sankuai.waimai.business.im.common.utils.d.a(r1, r2, r0)
            java.lang.String r0 = "b_waimai_pdkctt2p_mv"
            java.lang.String r1 = com.sankuai.waimai.business.im.utils.d.a
            android.app.Activity r12 = r12.e
            java.lang.String r12 = com.meituan.android.common.statistics.utils.AppUtil.generatePageInfoKey(r12)
            com.sankuai.waimai.log.judas.JudasManualManager$a r12 = com.sankuai.waimai.log.judas.JudasManualManager.b(r0, r1, r12)
            java.lang.String r0 = "receive_user_type"
            int r13 = r13.f
            com.sankuai.waimai.log.judas.JudasManualManager$a r12 = r12.a(r0, r13)
            r12.a()
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.a(com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, java.util.List):void");
    }

    public static /* synthetic */ void a(BaseRiderChatPageDelegate baseRiderChatPageDelegate, boolean z) {
        int size;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, baseRiderChatPageDelegate, changeQuickRedirect, false, "fa176f58f08b893421c0b4a243c5b901", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, baseRiderChatPageDelegate, changeQuickRedirect, false, "fa176f58f08b893421c0b4a243c5b901");
        } else if (!z || (size = baseRiderChatPageDelegate.k.buttonInfos.size()) <= 0) {
        } else {
            baseRiderChatPageDelegate.k.buttonInfos.remove(size - 1);
            baseRiderChatPageDelegate.w.c();
        }
    }

    public static /* synthetic */ void b(BaseRiderChatPageDelegate baseRiderChatPageDelegate) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, baseRiderChatPageDelegate, changeQuickRedirect, false, "c1c289fdfad410f8525367e3d2ae0887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, baseRiderChatPageDelegate, changeQuickRedirect, false, "c1c289fdfad410f8525367e3d2ae0887");
        } else if (baseRiderChatPageDelegate.s) {
            d.a aVar = new d.a();
            baseRiderChatPageDelegate.a(aVar);
            Statistics.getChannel("waimai").writePageView(AppUtil.generatePageInfoKey(baseRiderChatPageDelegate.e), com.sankuai.waimai.business.im.utils.d.a, aVar.a());
        }
    }

    public static /* synthetic */ void e(BaseRiderChatPageDelegate baseRiderChatPageDelegate) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, baseRiderChatPageDelegate, changeQuickRedirect, false, "e526502db7bc9445ea6c81eccfa1535f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, baseRiderChatPageDelegate, changeQuickRedirect, false, "e526502db7bc9445ea6c81eccfa1535f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("orderViewId", String.valueOf(baseRiderChatPageDelegate.i));
        hashMap.put("wmPoiId", baseRiderChatPageDelegate.r());
        hashMap.put("userName", baseRiderChatPageDelegate.k.recipient_name);
        hashMap.put("userPhone", baseRiderChatPageDelegate.k.recipientPhone);
        hashMap.put("userLatitude", Long.valueOf(baseRiderChatPageDelegate.k.address_latitude));
        hashMap.put("userLongitude", Long.valueOf(baseRiderChatPageDelegate.k.address_longitude));
        hashMap.put("poiIDStr", baseRiderChatPageDelegate.k.poiIdStr);
        StringBuilder sb = new StringBuilder();
        sb.append(baseRiderChatPageDelegate.k.lockdownAoi);
        hashMap.put("isReversoAOI", sb.toString());
        hashMap.put("userType", "0");
        com.sankuai.waimai.business.im.common.rxbus.d.b(baseRiderChatPageDelegate.e, hashMap);
    }

    public BaseRiderChatPageDelegate(SessionFragment sessionFragment, SessionParams sessionParams) {
        super(sessionFragment, sessionParams);
        Object[] objArr = {sessionFragment, sessionParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb8179357057a01f261eddd091f494f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb8179357057a01f261eddd091f494f8");
            return;
        }
        this.n = getClass().getSimpleName();
        this.r = false;
        this.s = false;
        this.t = 0;
        this.x = false;
        this.A = new com.sankuai.xm.base.callback.c<com.sankuai.xm.imui.session.event.a>() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.c
            public final /* synthetic */ boolean a(com.sankuai.xm.imui.session.event.a aVar) {
                com.sankuai.xm.imui.session.event.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "810cbae35ad6342efb1817f0622f6803", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "810cbae35ad6342efb1817f0622f6803")).booleanValue();
                }
                if (aVar2 != null) {
                    BaseRiderChatPageDelegate.a(BaseRiderChatPageDelegate.this, BaseRiderChatPageDelegate.this.e, aVar2.b, aVar2.c, aVar2.d);
                }
                return false;
            }
        };
        this.C = 0;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a
    public long i() {
        if (this.k == null || this.k.remindSeconds <= 0) {
            return 2147483647L;
        }
        return this.k.remindSeconds * 1000;
    }

    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df86ce97b247fb5ad37302d1c759a94c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df86ce97b247fb5ad37302d1c759a94c");
            return;
        }
        this.m = bundle.getBoolean("param_isBackendPush");
        this.i = bundle.getLong("param_orderId");
        this.j = bundle.getInt("param_from");
        this.k = (RiderImInfo) com.sankuai.waimai.platform.utils.f.a(bundle, "param_riderMessageInfo");
        this.l = bundle.getString("param_riderReAssignMessage");
        this.o = bundle.getInt("show_emotion", 0);
        this.p = bundle.getInt("ref", 0);
        this.s = bundle.getInt("isPinHaoFan", 0) == 1;
        this.t = bundle.getInt("pinSource", 0);
        Intent intent = this.e.getIntent();
        int i = this.j;
        Object[] objArr2 = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a.c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b1be441c408add5efd2deeb183dc8f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b1be441c408add5efd2deeb183dc8f2");
        } else if (intent != null) {
            Uri data = intent.getData();
            intent.setData((data == null ? new Uri.Builder() : data.buildUpon()).appendQueryParameter("source", String.valueOf(i)).build());
        }
        this.C = com.sankuai.waimai.business.im.common.utils.d.a(this.e, "_modify_address_");
        this.y = new com.sankuai.waimai.business.im.common.plugin.smartreply.c() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.im.common.plugin.smartreply.c
            public final void a(d.a aVar) {
                Object[] objArr3 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0a85f58eabb833b45877d743bf9141ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0a85f58eabb833b45877d743bf9141ca");
                } else if (!BaseRiderChatPageDelegate.this.s || aVar == null) {
                } else {
                    aVar.a("biz_type", 2);
                    aVar.a("order_id_phf", Long.valueOf(BaseRiderChatPageDelegate.this.i));
                    aVar.a("chat_id", Long.valueOf(com.sankuai.xm.imui.b.a().d()));
                }
            }
        };
        this.z = new OrderStatusBannerView.a() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.im.common.view.OrderStatusBannerView.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37b134c62798d13ecd32e763856f6e4d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37b134c62798d13ecd32e763856f6e4d");
                } else {
                    BaseRiderChatPageDelegate.b(BaseRiderChatPageDelegate.this);
                }
            }
        };
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ad90b2fbe20d5b8b74534c3cdd9255", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ad90b2fbe20d5b8b74534c3cdd9255");
        } else if (!this.s || aVar == null) {
        } else {
            aVar.a("receive_user_type", Integer.valueOf(com.sankuai.waimai.business.im.utils.c.a(1)));
            aVar.a("biz_type", 2);
            aVar.a("i_source", Integer.valueOf(this.t));
            aVar.a("status", Integer.valueOf(this.k.sessionStatus));
            if (this.u != null) {
                aVar.a("order_status", Integer.valueOf(this.u.getOrderStatus()));
            }
            aVar.a("order_id_phf", Long.valueOf(this.i));
            aVar.a("chat_id", Long.valueOf(com.sankuai.xm.imui.b.a().d()));
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "191bf806e535d76c81ade7bddcd1c00e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "191bf806e535d76c81ade7bddcd1c00e")).booleanValue();
        }
        if (this.s && this.u != null) {
            this.u.setRequestCallback(this.z);
            return false;
        }
        if (this.u != null) {
            this.u.setRequestCallback(null);
        }
        return super.n();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b5c33ed1d855d6967d24ac2d727320", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b5c33ed1d855d6967d24ac2d727320");
            return;
        }
        super.a();
        com.sankuai.xm.imui.session.b b2 = com.sankuai.xm.imui.session.b.b(this.e);
        if (b2 != null) {
            b2.a(com.sankuai.xm.imui.session.event.a.class, this.A, true);
        }
        com.meituan.android.bus.a.a().a(this);
        com.sankuai.waimai.imbase.utils.e.a().a(new Runnable() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.8
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "940d831146bcf5254a4c9cd9230c7cb1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "940d831146bcf5254a4c9cd9230c7cb1");
                } else {
                    com.sankuai.waimai.business.im.utils.b.a();
                }
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onModifyLocationClick(com.sankuai.waimai.business.im.common.rxbus.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f398961c54d0aecd941054c49123b71e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f398961c54d0aecd941054c49123b71e");
        } else if (this.e == null || this.e.isFinishing() || cVar == null) {
        } else {
            String valueOf = !TextUtils.isEmpty(cVar.e) ? cVar.e : String.valueOf(this.i);
            a(valueOf);
            JudasManualManager.a("b_waimai_l020kwq3_mc").a(com.sankuai.waimai.business.im.utils.d.a).a("receive_user_type", 1).a("order_id", valueOf).a();
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e078d509051aee1adca489c321a9ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e078d509051aee1adca489c321a9ba");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("im_order_id", str);
        hashMap.put("wmPoiId", r());
        hashMap.put("poiIDStr", "");
        hashMap.put("im_source", com.sankuai.waimai.foundation.core.a.d() ? "C_WM" : "C_MT");
        hashMap.put("im_addr_location_type", "SEND");
        hashMap.put("im_lat", Long.valueOf(this.k.address_latitude));
        hashMap.put("im_lng", Long.valueOf(this.k.address_longitude));
        hashMap.put("isReversoAOI", Integer.valueOf(this.k.lockdownAoi));
        com.sankuai.waimai.business.im.common.rxbus.d.a(this.e, hashMap);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33539e542fb701efc5860322ca11c1f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33539e542fb701efc5860322ca11c1f0");
            return;
        }
        super.b();
        com.sankuai.waimai.imbase.manager.b.a().a(SessionId.a(this.k.riderDxId, 0L, 1, this.k.appId, (short) 1001), new com.sankuai.xm.im.d<com.sankuai.xm.im.session.entry.a>() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.10
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.d
            public final /* synthetic */ void b_(com.sankuai.xm.im.session.entry.a aVar) {
                com.sankuai.xm.im.session.entry.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e100ec43689c3f7b3f344404ec842ef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e100ec43689c3f7b3f344404ec842ef");
                } else {
                    BaseRiderChatPageDelegate.a(BaseRiderChatPageDelegate.this, aVar2);
                }
            }
        });
        if (this.k != null && this.k.inputFieldStatus == 3) {
            ISendPanelAdapter sendPanelAdapter = this.f.v.getSendPanelAdapter();
            if (sendPanelAdapter instanceof DefaultSendPanelAdapter) {
                ((DefaultSendPanelAdapter) sendPanelAdapter).a(true, this.k.inputFieldMessage);
            }
        } else if (!TextUtils.isEmpty(this.l)) {
            ISendPanelAdapter sendPanelAdapter2 = this.f.v.getSendPanelAdapter();
            if (sendPanelAdapter2 instanceof DefaultSendPanelAdapter) {
                ((DefaultSendPanelAdapter) sendPanelAdapter2).a(true, this.l);
            }
        }
        if (!this.x && this.k != null && this.k.sessionStatus == 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad095409ab88e53918212057d6e97152", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad095409ab88e53918212057d6e97152");
            } else if (com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.e.getApplicationContext(), "wm_im_is_new_rider_", true) && this.k != null && !TextUtils.isEmpty(this.k.guideContent)) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.e.getApplicationContext(), "wm_im_is_new_rider_", false);
                byte[] data = new TipMessageData(this.k.guideTitle, this.k.guideContent).toData(2);
                if (data != null) {
                    a((IMMessage) com.sankuai.xm.imui.common.util.c.a(data, 0, "[" + this.k.guideTitle + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + this.k.guideContent), false);
                }
            }
            this.x = true;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "adf5904ccef6ad089821066196330ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "adf5904ccef6ad089821066196330ef0");
        } else if (this.k != null && this.k.commonDialogData != null && !this.r) {
            this.r = true;
            byte[] a = new com.sankuai.waimai.business.im.model.h(this.k.commonDialogData).a(200);
            if (a != null) {
                String str = "";
                if (!com.sankuai.waimai.imbase.utils.a.a(this.k.commonDialogData.c)) {
                    str = "，点击" + this.k.commonDialogData.c.get(0).b;
                }
                a((IMMessage) com.sankuai.xm.imui.common.util.c.a(a, 0, "[" + this.k.commonDialogData.a + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + this.k.commonDialogData.b + str), true);
            }
        }
        com.sankuai.waimai.business.order.api.submit.c.a().registerOrderStatusObserver(this);
        if (this.u != null) {
            this.u.a();
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void bs_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c886911fdd7b377165a16b7cef8315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c886911fdd7b377165a16b7cef8315");
            return;
        }
        com.sankuai.waimai.business.order.api.submit.c.a().unregisterOrderStatusObserver(this);
        if (this.u != null) {
            this.u.b();
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a378985957bd7cdc2cd4feb4e1b30ae9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a378985957bd7cdc2cd4feb4e1b30ae9");
        } else {
            b(iMMessage);
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void a(int i, IMMessage iMMessage) {
        Object[] objArr = {Integer.valueOf(i), iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e0c88a98bdb23384a809d3b55db23ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e0c88a98bdb23384a809d3b55db23ca");
            return;
        }
        super.a(i, iMMessage);
        a(i == 0, iMMessage.getMsgType());
        switch (i) {
            case 948:
                String string = this.e.getApplicationContext().getString(R.string.wm_im_rider_order_complete_tip);
                ISendPanelAdapter sendPanelAdapter = this.f.v.getSendPanelAdapter();
                if (sendPanelAdapter instanceof DefaultSendPanelAdapter) {
                    ((DefaultSendPanelAdapter) sendPanelAdapter).a(true, string);
                }
                a(this.e, string);
                break;
            case 949:
                String string2 = this.e.getApplicationContext().getString(R.string.wm_im_rider_order_cancel_tip);
                ISendPanelAdapter sendPanelAdapter2 = this.f.v.getSendPanelAdapter();
                if (sendPanelAdapter2 instanceof DefaultSendPanelAdapter) {
                    ((DefaultSendPanelAdapter) sendPanelAdapter2).a(true, string2);
                }
                a(this.e, string2);
                break;
            case 950:
                a(this.e.getApplicationContext().getString(R.string.wm_im_rider_change_tip), this.i);
                break;
        }
        if (i == 0 && (iMMessage instanceof TextMessage)) {
            TextMessage textMessage = (TextMessage) iMMessage;
            if (!TextUtils.isEmpty(textMessage.getText()) && this.u.c()) {
                this.w.a(textMessage.getText(), 2);
            }
        }
        if (iMMessage instanceof CustomEmotionMessage) {
            HashMap hashMap = new HashMap();
            hashMap.put("stid", ((CustomEmotionMessage) iMMessage).getId());
            JudasManualManager.a("b_waimai_739ap29f_mc").a("c_waimai_wgiu7lrd").a((Map<String, Object>) hashMap).a();
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.common.contract.a
    public void b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "521b7e97c9cbd4c20fca51ed812ae981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "521b7e97c9cbd4c20fca51ed812ae981");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("chatfid", String.valueOf(this.i));
        hashMap.put("poiID", String.valueOf(this.k.poiId));
        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.k.poiIdStr);
        hashMap.put("customerPhone", this.k.recipientPhone);
        hashMap.put("version", com.sankuai.waimai.platform.b.A().i());
        hashMap.put("source", "Android");
        hashMap.put("ref", Integer.valueOf(this.p));
        com.sankuai.waimai.business.im.utils.b.a(hashMap);
        com.sankuai.waimai.business.im.utils.b.a(iMMessage, hashMap);
        iMMessage.appendExtension(hashMap);
    }

    @Override // com.sankuai.waimai.business.order.api.submit.a
    public void a(String str, Uri uri) {
        Object[] objArr = {str, uri};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3c920014096105f62b89b74efae9fb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3c920014096105f62b89b74efae9fb5");
        } else if (!Constants.VIA_REPORT_TYPE_MAKE_FRIEND.equals(str) || uri == null) {
        } else {
            String queryParameter = uri.getQueryParameter("reassignmsg");
            String queryParameter2 = uri.getQueryParameter("hash_id");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            long a = com.sankuai.waimai.imbase.utils.g.a(queryParameter2);
            if (this.i == a) {
                a(queryParameter, a);
            }
        }
    }

    private void a(String str, final long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d6e6bb39c83df96fa6876819f47469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d6e6bb39c83df96fa6876819f47469");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            new CustomDialog.a(this.e).b(str).a(false).a(R.string.wm_im_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.11
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "978f50528dd09c35aeb0c2c0d096c37d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "978f50528dd09c35aeb0c2c0d096c37d");
                    } else {
                        BaseRiderChatPageDelegate.this.c(j);
                    }
                }
            }).b();
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public ISendPanelAdapter bq_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24d77df197d222b4be3ef83c0b833f99", RobustBitConfig.DEFAULT_VALUE)) {
            return (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24d77df197d222b4be3ef83c0b833f99");
        }
        super.bq_();
        HashMap hashMap = null;
        if (this.k != null && this.k.buttonList != null && this.k.buttonList.size() > 0) {
            hashMap = new HashMap();
            for (com.sankuai.waimai.business.im.model.i iVar : this.k.buttonList) {
                hashMap.put(Integer.valueOf(iVar.a), iVar);
            }
        }
        this.w = new WmRiderSendPanelAdapter(z(), hashMap, false, this.k != null && this.k.inputFieldStatus == 3, this.o, new com.sankuai.waimai.business.im.callback.a() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.13
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.im.callback.a
            public final void a(List<g.a> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23b72dfbab401c06a50a0edf17feb357", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23b72dfbab401c06a50a0edf17feb357");
                } else {
                    BaseRiderChatPageDelegate.a(BaseRiderChatPageDelegate.this, list);
                }
            }

            @Override // com.sankuai.waimai.business.im.callback.a
            public final void a(RiderImInfo.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f78d506e0ecd78f560234e109c396aa3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f78d506e0ecd78f560234e109c396aa3");
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("receive_user_type", 0);
                JudasManualManager.a("b_waimai_i7ex1dmf_mc", "c_waimai_wgiu7lrd", AppUtil.generatePageInfoKey(BaseRiderChatPageDelegate.this.e)).a((Map<String, Object>) hashMap2).a();
                BaseRiderChatPageDelegate.this.a(new WmBaseGroupChatFragment.a() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.13.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.a
                    public final void a(com.sankuai.waimai.business.im.common.model.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dc432584f24c41df7d48d870442a9621", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dc432584f24c41df7d48d870442a9621");
                            return;
                        }
                        String string = BaseRiderChatPageDelegate.this.e.getResources().getString(R.string.wm_im_can_not_modify_address);
                        if (bVar != null && !TextUtils.isEmpty(bVar.b)) {
                            string = bVar.b;
                        }
                        ae.a(BaseRiderChatPageDelegate.this.e, string);
                        int size = BaseRiderChatPageDelegate.this.k.buttonInfos.size();
                        if (size > 0) {
                            BaseRiderChatPageDelegate.this.k.buttonInfos.remove(size - 1);
                            BaseRiderChatPageDelegate.this.w.c();
                        }
                    }

                    @Override // com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.a
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d68f5a22a41dd2f68a9907ac919ef6dc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d68f5a22a41dd2f68a9907ac919ef6dc");
                        } else {
                            BaseRiderChatPageDelegate.e(BaseRiderChatPageDelegate.this);
                        }
                    }
                });
            }

            @Override // com.sankuai.waimai.business.im.callback.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6df9dbe1b9b45fbbf509b732cb478dbb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6df9dbe1b9b45fbbf509b732cb478dbb");
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("receive_user_type", 0);
                JudasManualManager.b("b_waimai_wssddcqy_mv", "c_waimai_wgiu7lrd", AppUtil.generatePageInfoKey(BaseRiderChatPageDelegate.this.e)).a((Map<String, Object>) hashMap2).a();
            }

            @Override // com.sankuai.waimai.business.im.callback.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d05d128a625d047f7d195d2246408db", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d05d128a625d047f7d195d2246408db");
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("receive_user_type", 0);
                JudasManualManager.a("b_waimai_wssddcqy_mc", "c_waimai_wgiu7lrd", AppUtil.generatePageInfoKey(BaseRiderChatPageDelegate.this.e)).a((Map<String, Object>) hashMap2).a();
                BaseRiderChatPageDelegate.e(BaseRiderChatPageDelegate.this);
            }
        }, this.k.buttonInfos, this.k.modifyAddress == 1, this.i);
        return this.w;
    }

    public void a(final WmBaseGroupChatFragment.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eadd1b628b938c61fcd651c70838ec94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eadd1b628b938c61fcd651c70838ec94");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImCommonService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImCommonService.class)).checkModifyAddress(this.i), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.common.model.b>>() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.15
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6515f83f8c3995a82a63d388efd8e0b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6515f83f8c3995a82a63d388efd8e0b9");
                    } else if (baseResponse == null || !baseResponse.isSuccess()) {
                        ae.a(BaseRiderChatPageDelegate.this.e, BaseRiderChatPageDelegate.this.e.getResources().getString(R.string.wm_im_net_error_retry_later));
                    } else {
                        com.sankuai.waimai.business.im.common.model.b bVar = (com.sankuai.waimai.business.im.common.model.b) baseResponse.data;
                        if (bVar != null && bVar.a == 1) {
                            aVar.a();
                        } else {
                            aVar.a(bVar);
                        }
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5db14ce7ae50ce840cc5aae26830a63", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5db14ce7ae50ce840cc5aae26830a63");
                    } else {
                        ae.a(BaseRiderChatPageDelegate.this.e, BaseRiderChatPageDelegate.this.e.getResources().getString(R.string.wm_im_net_error_retry_later));
                    }
                }
            }, this.n);
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public void a(com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, Map<String, Object> map) {
        Object[] objArr = {bVar, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d416980a675c41513ec98caaab0a841", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d416980a675c41513ec98caaab0a841");
        } else if (map != null && "imAddressLocation".equals(String.valueOf(map.get("page")))) {
            a(String.valueOf(this.i));
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public void b(final com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, Map<String, Object> map) {
        Object[] objArr = {bVar, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c9be2176b628a7b691fb21b8a025049", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c9be2176b628a7b691fb21b8a025049");
        } else if (this.k.modifyAddress == 1) {
            a(new WmBaseGroupChatFragment.a() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.a
                public final void a(com.sankuai.waimai.business.im.common.model.b bVar2) {
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c0158f4b4467817080d0258671bac99", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c0158f4b4467817080d0258671bac99");
                        return;
                    }
                    BaseRiderChatPageDelegate.this.k.modifyAddress = 0;
                    String string = BaseRiderChatPageDelegate.this.e.getResources().getString(R.string.wm_im_can_not_modify_address);
                    if (bVar2 != null && !TextUtils.isEmpty(bVar2.b)) {
                        string = bVar2.b;
                    }
                    ae.a(BaseRiderChatPageDelegate.this.e, string);
                    if (bVar != null) {
                        IMUIManager.a().a(bVar.b);
                    }
                }

                @Override // com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75eab422a6fa060a2933de29bf01f52b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75eab422a6fa060a2933de29bf01f52b");
                        return;
                    }
                    BaseRiderChatPageDelegate.this.B = bVar;
                    BaseRiderChatPageDelegate.e(BaseRiderChatPageDelegate.this);
                }
            });
        } else {
            ae.a(this.e, this.e.getResources().getString(R.string.wm_im_can_not_modify_address));
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public TitleBarAdapter g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e27c1983dbee5ab23e2018ee0828e2a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e27c1983dbee5ab23e2018ee0828e2a9");
        }
        final WMIMTitleBarAdapter wMIMTitleBarAdapter = new WMIMTitleBarAdapter(new WMIMTitleBarAdapter.a() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter.a
            public final void b() {
            }

            @Override // com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d38e71a6ed23db6f291d9b3ea733671", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d38e71a6ed23db6f291d9b3ea733671");
                } else {
                    BaseRiderChatPageDelegate.this.a(1);
                }
            }
        }) { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.12
            public static ChangeQuickRedirect p;

            @Override // com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter
            public final void a(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = p;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b47873dfcd718c581128fee84d7ca05d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b47873dfcd718c581128fee84d7ca05d");
                    return;
                }
                super.a(view);
                BaseRiderChatPageDelegate.this.v = new com.sankuai.waimai.business.im.common.view.a(BaseRiderChatPageDelegate.this.e, BaseRiderChatPageDelegate.this.e.getString(R.string.wm_im_move_rider_phone_to_here_tips));
                BaseRiderChatPageDelegate.this.v.a(this.f);
            }
        };
        if (TextUtils.isEmpty(this.k.riderName)) {
            com.sankuai.xm.ui.a.a().a(com.sankuai.xm.im.vcard.d.a(this.k.riderDxId, 1, (short) 1001), new com.sankuai.xm.im.d<com.sankuai.xm.im.vcard.entity.a>() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.d
                public final /* synthetic */ void b_(com.sankuai.xm.im.vcard.entity.a aVar) {
                    com.sankuai.xm.im.vcard.entity.a aVar2 = aVar;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3716c327b3df8ea298da0af8e502d36d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3716c327b3df8ea298da0af8e502d36d");
                    } else if (aVar2 != null) {
                        wMIMTitleBarAdapter.b = aVar2.d;
                    }
                }
            });
        } else {
            wMIMTitleBarAdapter.b = "骑手 " + this.k.riderName;
        }
        if (!TextUtils.isEmpty(this.k.riderPhoneNum)) {
            wMIMTitleBarAdapter.j = true;
        }
        return wMIMTitleBarAdapter;
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public final IExtraAdapter a(int i, g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd484f5cf42472523c666b18e9ef16dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (IExtraAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd484f5cf42472523c666b18e9ef16dc");
        }
        if (i == 16) {
            return new IMMessageAdapter(this.h, this, com.sankuai.waimai.business.im.utils.d.a, gVar) { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.14
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.business.im.common.message.IMMessageAdapter
                public final void a(Map<Integer, com.sankuai.waimai.business.im.common.message.d> map) {
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0bb4667c29d8e2f0e001805f2dd98af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0bb4667c29d8e2f0e001805f2dd98af");
                        return;
                    }
                    RiderImInfo riderImInfo = BaseRiderChatPageDelegate.this.k;
                    Object[] objArr3 = {map, riderImInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.im.prepare.compat.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "00b73ff0af16650396ca09dc1e9e5f15", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "00b73ff0af16650396ca09dc1e9e5f15");
                    } else {
                        map.put(5, new com.sankuai.waimai.business.im.common.message.h(riderImInfo.orient != null));
                    }
                    super.a(map);
                }
            };
        }
        if (i == 8) {
            return new LocationMessageAdapter();
        }
        return super.a(i, gVar);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public ICommonAdapter w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0768fc92f6b3fb9bf7017f91e0271166", RobustBitConfig.DEFAULT_VALUE) ? (ICommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0768fc92f6b3fb9bf7017f91e0271166") : new IMCommonAdapterWrapper(super.w());
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public final com.sankuai.waimai.business.im.common.plugin.smartreply.d z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62afade3346401e38fa2afd8945f6fa7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.im.common.plugin.smartreply.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62afade3346401e38fa2afd8945f6fa7");
        }
        com.sankuai.waimai.business.im.common.plugin.smartreply.d dVar = new com.sankuai.waimai.business.im.common.plugin.smartreply.d();
        dVar.e = 1;
        dVar.a = this.k.inputFieldStatus == 1;
        dVar.b = this.k.inputFieldStatus == 0;
        dVar.c = this.k.defaultMessages;
        dVar.d = this.k.customPhrases;
        dVar.h = this.k.customReplyHint;
        dVar.f = this.k.maxCustomMsgNumber;
        dVar.i = this.y;
        return dVar;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aa8c6b664f19d2453d296ba13a1bf1a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aa8c6b664f19d2453d296ba13a1bf1a") : String.valueOf(this.k.poiId);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa3684a21f114dcedfa260a2bc48b1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa3684a21f114dcedfa260a2bc48b1a");
        }
        this.u = (OrderStatusBannerView) layoutInflater.inflate(R.layout.wm_im_layout_order_status, (ViewGroup) null);
        this.u.a(this.e, 2L, this.i);
        this.u.b = this.y;
        this.u.setIsPhf(this.s);
        return this.u;
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public final void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d352c02cac4c7eeecaafbc72fb14aedc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d352c02cac4c7eeecaafbc72fb14aedc");
        } else {
            a(2);
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public final String t() {
        return this.k.wmCommonData;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public Map<String, Object> a(String str, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26052e6397f4917af8ce2f1c0c5de69c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26052e6397f4917af8ce2f1c0c5de69c");
        }
        char c = 65535;
        if (str.hashCode() == -1540748623 && str.equals("im_send_location")) {
            c = 0;
        }
        if (c != 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("show_button", Integer.valueOf(this.k.getButtons(1) != null ? 1 : 0));
        return hashMap;
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public final void A() {
        byte[] a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1892dd1a98ca9a137c97dc0f137900cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1892dd1a98ca9a137c97dc0f137900cb");
        } else if (this.k == null || TextUtils.isEmpty(this.k.remingMsg) || TextUtils.isEmpty(this.k.riderPhoneNum) || (a = new o(this.k.remingMsg).a(4)) == null) {
        } else {
            a((IMMessage) com.sankuai.xm.imui.common.util.c.a(a), true);
        }
    }

    private void a(IMMessage iMMessage, boolean z) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8bbf935ff8663a2c20ab4ba2a84ba21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8bbf935ff8663a2c20ab4ba2a84ba21");
        } else if (iMMessage == null) {
        } else {
            b(iMMessage);
            iMMessage.setChatId(com.sankuai.xm.imui.b.a().d());
            iMMessage.setCategory(com.sankuai.xm.imui.b.a().e());
            iMMessage.setPeerUid(com.sankuai.xm.imui.b.a().f().c);
            iMMessage.setToUid(com.sankuai.xm.imui.b.a().d());
            iMMessage.setToAppId(com.sankuai.xm.imui.b.a().g());
            iMMessage.setPeerAppId(com.sankuai.xm.imui.b.a().g());
            iMMessage.setMsgStatus(9);
            iMMessage.setChannel(com.sankuai.xm.imui.b.a().f().g);
            if (z) {
                IMUIManager.a().c(iMMessage);
            } else {
                com.sankuai.waimai.imbase.configuration.a.a().a(iMMessage, false, (IMClient.g<Integer>) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f073afd2a7bf53b2da9a8af83793f14b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f073afd2a7bf53b2da9a8af83793f14b");
            return;
        }
        if (i == 1) {
            d.a aVar = new d.a();
            if (this.y != null) {
                this.y.a(aVar);
            }
            JudasManualManager.a(com.sankuai.waimai.business.im.utils.d.b).a(com.sankuai.waimai.business.im.utils.d.a).a(aVar.a()).a();
        }
        if (this.k != null) {
            if (this.k.usePrivacy == 1) {
                com.sankuai.waimai.platform.widget.dial.injection.a.a(this.e).a(String.valueOf(this.i), this.k.riderPhoneNum, TextUtils.isEmpty(this.k.bookPhone) ? this.k.recipientPhone : this.k.bookPhone, 0);
            } else {
                new CustomDialog.a(this.e).b(this.k.riderPhoneNum).a(R.string.wm_im_dialog_call, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate.5
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a782bf4f272fd48eaa9ef5b69ee47fa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a782bf4f272fd48eaa9ef5b69ee47fa");
                            return;
                        }
                        if (i == 1) {
                            d.a aVar2 = new d.a();
                            BaseRiderChatPageDelegate baseRiderChatPageDelegate = BaseRiderChatPageDelegate.this;
                            aVar2.a("receive_user_type", Integer.valueOf(com.sankuai.waimai.business.im.utils.c.a(1)));
                            JudasManualManager.a(com.sankuai.waimai.business.im.utils.d.c).a(aVar2.a()).a(com.sankuai.waimai.business.im.utils.d.a).a();
                        }
                        z.a(BaseRiderChatPageDelegate.this.e, BaseRiderChatPageDelegate.this.k.riderPhoneNum);
                    }
                }).b(R.string.wm_im_cancel, (DialogInterface.OnClickListener) null).a(false).b();
            }
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void k() {
        com.sankuai.xm.imui.session.b b2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca381fd4a04404ab5ff62bb5bc7c124b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca381fd4a04404ab5ff62bb5bc7c124b");
            return;
        }
        super.k();
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.n);
        if (this.e != null && (b2 = com.sankuai.xm.imui.session.b.b(this.e)) != null) {
            b2.a(com.sankuai.xm.imui.session.event.a.class, this.A);
        }
        if (this.v != null) {
            this.v.a();
        }
        if (this.w != null) {
            this.w.b();
        }
    }
}
