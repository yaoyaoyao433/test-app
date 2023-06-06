package com.sankuai.waimai.store.im.poi;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableMap;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.im.common.adapter.IMAudioMsgAdapter;
import com.sankuai.waimai.business.im.model.PoiImInfo;
import com.sankuai.waimai.business.im.prepare.g;
import com.sankuai.waimai.business.im.prepare.i;
import com.sankuai.waimai.foundation.utils.ac;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.im.delegate.b;
import com.sankuai.waimai.store.im.group.join.a;
import com.sankuai.waimai.store.im.group.model.JoinGroupInfo;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
import com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter;
import com.sankuai.waimai.store.im.poi.listener.d;
import com.sankuai.waimai.store.im.poi.model.IMEnterUserGroupData;
import com.sankuai.waimai.store.im.poi.model.ImModifyAddressClickEvent;
import com.sankuai.waimai.store.im.poi.model.ImOrderData;
import com.sankuai.waimai.store.im.poi.model.ImOrderInfo;
import com.sankuai.waimai.store.im.poi.model.ImSGTip;
import com.sankuai.waimai.store.im.poi.model.ImSendSpuCardEvent;
import com.sankuai.waimai.store.im.poi.model.QuickButtonInfo;
import com.sankuai.waimai.store.im.poi.model.SGCommonDataInfo;
import com.sankuai.waimai.store.im.poi.model.SGGeneralMessagData;
import com.sankuai.waimai.store.im.poi.model.SGGeneralTip;
import com.sankuai.waimai.store.im.poi.model.SGModifyAddressAllowed;
import com.sankuai.waimai.store.mach.e;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.util.c;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.c;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGWMPoiChatDelegate extends i implements com.sankuai.waimai.store.expose.v2.a, a, com.sankuai.waimai.store.im.poi.contract.a, com.sankuai.waimai.store.im.poi.listener.a, d {
    public static ChangeQuickRedirect b;
    private int A;
    private Bundle B;
    private com.sankuai.waimai.business.im.chatpage.d C;
    private GeneralMessage D;
    private SessionId E;
    private SGCommonDataInfo F;
    private volatile Map<String, Object> G;
    private volatile Map<String, Object> H;
    private com.sankuai.waimai.store.im.poi.presenter.a I;
    private b J;
    private volatile boolean K;
    private volatile boolean L;
    private boolean M;
    private String N;
    private View.OnClickListener O;
    private final com.sankuai.waimai.store.im.util.a P;
    private WMSGIMCommonAdapter Q;
    public View t;
    private String u;
    private com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a v;
    private com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a w;
    private boolean x;
    private final HashSet<String> y;
    private com.sankuai.waimai.store.im.group.join.a z;

    public static /* synthetic */ int x(SGWMPoiChatDelegate sGWMPoiChatDelegate) {
        return 2;
    }

    @Override // com.sankuai.waimai.business.im.prepare.i, com.sankuai.waimai.business.im.prepare.c
    public final void a(SessionParams sessionParams) {
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final void a_(Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final UserGroupImInfo bu_() {
        return null;
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final String by_() {
        return "c_waimai_4pe066t1";
    }

    @Override // com.sankuai.waimai.business.im.prepare.i, com.sankuai.waimai.business.im.prepare.c
    public final int u() {
        return 1;
    }

    public static /* synthetic */ void a(SGWMPoiChatDelegate sGWMPoiChatDelegate, boolean z, Bundle bundle) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, sGWMPoiChatDelegate, changeQuickRedirect, false, "1d43d17ba49dfff2e5952e25ff75732c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGWMPoiChatDelegate, changeQuickRedirect, false, "1d43d17ba49dfff2e5952e25ff75732c");
            return;
        }
        ImOrderInfo imOrderInfo = new ImOrderInfo();
        imOrderInfo.poiName = sGWMPoiChatDelegate.m.getPoiName();
        imOrderInfo.poiLogo = sGWMPoiChatDelegate.m.getPoiPicUrl();
        imOrderInfo.orderViewID = bundle.getLong("order_view_id", 0L);
        imOrderInfo.orderTime = bundle.getLong("order_time", 0L);
        imOrderInfo.deliveryTime = bundle.getLong("delivery_time", 0L);
        imOrderInfo.status = bundle.getInt("status", 0);
        imOrderInfo.statusDesc = bundle.getString("status_desc", "");
        imOrderInfo.total = bundle.getDouble("total", 0.0d);
        imOrderInfo.foodDesc = bundle.getString("food_desc", "");
        imOrderInfo.addrModifyAllowed = Integer.valueOf(z ? 1 : 0);
        ImOrderData imOrderData = new ImOrderData(imOrderInfo, bundle.getBoolean("show_remind", false), 6);
        imOrderData.isShowModifyAddress = z;
        byte[] data = imOrderData.toData();
        if (data != null) {
            sGWMPoiChatDelegate.D = c.a(data);
        }
        if (sGWMPoiChatDelegate.D != null) {
            sGWMPoiChatDelegate.a((IMMessage) sGWMPoiChatDelegate.D, true);
        }
    }

    public static /* synthetic */ boolean a(SGWMPoiChatDelegate sGWMPoiChatDelegate, boolean z) {
        sGWMPoiChatDelegate.K = true;
        return true;
    }

    public static /* synthetic */ void r(SGWMPoiChatDelegate sGWMPoiChatDelegate) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, sGWMPoiChatDelegate, changeQuickRedirect, false, "15ce15a47a72d79433c60842a40d2760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGWMPoiChatDelegate, changeQuickRedirect, false, "15ce15a47a72d79433c60842a40d2760");
            return;
        }
        try {
            int size = sGWMPoiChatDelegate.F.mPoiPhoneInfoList.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            String[] strArr3 = new String[size];
            for (int i = 0; i < sGWMPoiChatDelegate.F.mPoiPhoneInfoList.size(); i++) {
                SGCommonDataInfo.PoiPhoneInfo poiPhoneInfo = sGWMPoiChatDelegate.F.mPoiPhoneInfoList.get(i);
                if (!p.a(poiPhoneInfo)) {
                    strArr[i] = t.a(poiPhoneInfo.mSGPhoneType) ? "" : poiPhoneInfo.mSGPhoneType;
                    strArr2[i] = t.a(poiPhoneInfo.mSGPhoneNumber) ? "" : poiPhoneInfo.mSGPhoneNumber;
                    strArr3[i] = strArr[i] + ": " + strArr2[i];
                }
            }
            sGWMPoiChatDelegate.a(sGWMPoiChatDelegate.e, strArr3, strArr2, 1);
        } catch (Exception unused) {
            sGWMPoiChatDelegate.F();
        }
    }

    public SGWMPoiChatDelegate(SessionFragment sessionFragment, SessionParams sessionParams) {
        super(sessionFragment, sessionParams);
        boolean z;
        int i;
        Object[] objArr = {sessionFragment, sessionParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7ec1791deaafc531a29afe61b5c74fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7ec1791deaafc531a29afe61b5c74fe");
            return;
        }
        this.u = "SG_WM_CHAT";
        this.y = new HashSet<>();
        this.E = null;
        this.G = new HashMap();
        this.H = new HashMap();
        this.O = new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.SGWMPoiChatDelegate.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c90ae1cd7d0ff45dab2839bc3303195a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c90ae1cd7d0ff45dab2839bc3303195a");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(com.sankuai.waimai.business.im.utils.d.a, "b_waimai_385da0yd_mc").a("poi_id", Long.valueOf(SGWMPoiChatDelegate.this.G())).a();
                SGWMPoiChatDelegate.this.F();
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f50c4aaabf68e6d1f0d0f7c33f5f313c", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f50c4aaabf68e6d1f0d0f7c33f5f313c")).booleanValue();
        } else {
            Bundle bundle = this.d.u;
            if (bundle != null) {
                z = bundle.getInt("from", -1) == 7;
            } else {
                z = false;
            }
        }
        this.x = z;
        this.P = new com.sankuai.waimai.store.im.util.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6621960b435354792f36bdbad79678fc", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6621960b435354792f36bdbad79678fc")).intValue();
        } else {
            Bundle bundle2 = this.d.u;
            i = bundle2 != null ? bundle2.getInt("from", -1) : -1;
        }
        this.A = i;
        this.B = sessionFragment.getArguments();
        List a = com.sankuai.meituan.serviceloader.b.a(com.sankuai.waimai.business.im.chatpage.d.class, "SGWMAIDataDelegateImpl");
        if (!com.sankuai.waimai.foundation.utils.b.b(a)) {
            this.C = (com.sankuai.waimai.business.im.chatpage.d) a.get(0);
        }
        this.J = new b();
    }

    @Override // com.sankuai.waimai.business.im.prepare.i, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1bf7ef371c5dba97c95a6fb2333463c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1bf7ef371c5dba97c95a6fb2333463c");
        } else {
            com.sankuai.waimai.store.im.util.b.a(String.valueOf(j), String.valueOf(this.n), v(), bw_());
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.i, com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a
    public final ICommonAdapter w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26aed5b6b4c9bc2166f579ae0f7925de", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26aed5b6b4c9bc2166f579ae0f7925de");
        }
        WMSGIMCommonAdapter wMSGIMCommonAdapter = new WMSGIMCommonAdapter(super.w());
        String s = s();
        Object[] objArr2 = {s};
        ChangeQuickRedirect changeQuickRedirect2 = WMSGIMCommonAdapter.b;
        if (PatchProxy.isSupport(objArr2, wMSGIMCommonAdapter, changeQuickRedirect2, false, "cff9c405b721dc2ffed072a9cce024e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, wMSGIMCommonAdapter, changeQuickRedirect2, false, "cff9c405b721dc2ffed072a9cce024e0");
        } else if (!t.a(s)) {
            wMSGIMCommonAdapter.c = s;
        }
        this.Q = wMSGIMCommonAdapter;
        return wMSGIMCommonAdapter;
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee728445373ecb3c1e9bc6a9691fe2f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee728445373ecb3c1e9bc6a9691fe2f6");
            return;
        }
        com.sankuai.waimai.store.base.net.c.a(this.u);
        this.J.c();
        if (this.v != null) {
            com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a aVar = this.v;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2b08c6167f225a37a46ccae5886cbb4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2b08c6167f225a37a46ccae5886cbb4c");
            } else {
                com.sankuai.waimai.store.base.net.c.a("SimpleListDialogDelegateImpl");
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "4aff6be8a84483914906c94fc1e6e319", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "4aff6be8a84483914906c94fc1e6e319");
                } else {
                    com.sankuai.waimai.store.util.d.a(aVar.d);
                }
            }
        }
        com.sankuai.waimai.store.im.util.a aVar2 = this.P;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.im.util.a.a;
        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "5d4aed2b6374a8d34517650682c908cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "5d4aed2b6374a8d34517650682c908cc");
        } else {
            al.cancel(com.sankuai.waimai.store.im.util.a.d);
        }
        com.meituan.android.bus.a.a().b(this);
        if (com.sankuai.waimai.store.im.poi.presenter.c.b()) {
            com.sankuai.waimai.store.expose.v2.b.a().b(this);
        }
        if (this.I != null) {
            this.I.b();
        }
        super.k();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public final void bp_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33935240c9f4ead933573d39b2689895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33935240c9f4ead933573d39b2689895");
            return;
        }
        super.bp_();
        if (this.g) {
            return;
        }
        am_();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public final IExtraAdapter a(int i, g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82c9306d0a7844858d4bbfee6a8639ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (IExtraAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82c9306d0a7844858d4bbfee6a8639ab");
        }
        if (i == 16) {
            return new SGIMMessageAdapter(gVar, this, this, this.n, this, this.F, this);
        }
        if (i == 1) {
            return new IMAudioMsgAdapter();
        }
        if (i == 11) {
            return new SGIMEventMessageAdapter();
        }
        return super.a(i, gVar);
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final ISendPanelAdapter bq_() {
        String str;
        long j;
        int i;
        int i2;
        String str2;
        int i3 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca2e97489bbc2f22a85b0bbbab7d4ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca2e97489bbc2f22a85b0bbbab7d4ad");
        }
        if (this.B != null) {
            long j2 = this.B.getLong("order_view_id", 0L);
            this.E = (SessionId) this.B.getParcelable("SessionId");
            str = this.E != null ? String.valueOf(this.E.b) : "-999";
            j = j2;
        } else {
            str = "-999";
            j = 0;
        }
        int i4 = this.A;
        Object[] objArr2 = {Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c4e5525fd07dc8a63ec79ab8f790102", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c4e5525fd07dc8a63ec79ab8f790102")).intValue();
        } else if (i4 == 6) {
            i = 5;
        } else if (i4 != 10) {
            switch (i4) {
                case 1:
                case 2:
                    i = 4;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            if (this.B != null) {
                String string = this.B.getString("sg-dx-im-from");
                if (!TextUtils.isEmpty(string)) {
                    if ("sg-from-Restaurant".equals(string)) {
                        i = 1;
                    } else if ("sg-from-Detail".equals(string)) {
                        i = 2;
                    }
                } else {
                    long j3 = this.B.getLong("order_view_id", 0L);
                    int i5 = this.B.getInt("status", 0);
                    if (j3 > 0 && i5 > 0) {
                        i3 = 3;
                    }
                }
                i = i3;
            }
            i = 0;
        }
        int i6 = i;
        if (this.m == null) {
            str2 = "14060";
            i2 = 2;
        } else {
            int i7 = this.m.bizType;
            String str3 = this.m.bizOrgCode;
            this.F = (SGCommonDataInfo) com.sankuai.waimai.store.util.i.a(this.m.sgCommonData, SGCommonDataInfo.class);
            if (this.F != null && this.F.isUserDynamic) {
                this.F.mIMDynamicCards = (List) com.sankuai.waimai.store.util.i.a(this.F.mIMDynamicCardsString, new TypeToken<List<SGCommonDataInfo.IMDynamicCard>>() { // from class: com.sankuai.waimai.store.im.poi.SGWMPoiChatDelegate.2
                }.getType());
                this.I = new com.sankuai.waimai.store.im.poi.presenter.a(this.E, this.u, bB_(), this.F, this);
            }
            i2 = i7;
            str2 = str3;
        }
        if (this.m == null || com.sankuai.waimai.foundation.utils.b.b(this.m.buttonInfos)) {
            return new WMSGIMSendPanelAdapter(z(), this.n, this.o, this, new ArrayList(), String.valueOf(i6), String.valueOf(j), str, i2, this.m, str2);
        }
        return new WMSGIMSendPanelAdapter(z(), this.n, this.o, this, this.m.buttonInfos, String.valueOf(i6), String.valueOf(j), str, i2, this.m, str2);
    }

    @Override // com.sankuai.waimai.store.im.poi.a
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86612ee56af55354e52bfd6117ad6878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86612ee56af55354e52bfd6117ad6878");
            return;
        }
        String str2 = "";
        String str3 = "";
        if (this.m != null) {
            str2 = this.m.getPoiName();
            str3 = this.m.getPoiPicUrl();
        }
        String str4 = str2;
        String str5 = str3;
        if (i == 10) {
            if (this.v == null) {
                this.v = new com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a(this.e, this, this.n, str, str4, str5);
            }
            com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a aVar = this.v;
            String str6 = this.m.bizOrgCode;
            Object[] objArr2 = {str6, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "264744fbd0dce4a45411930f4acebbfa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "264744fbd0dce4a45411930f4acebbfa");
            } else if (aVar.g >= 0 || !t.a(aVar.h)) {
                aVar.j = true;
                if (TextUtils.equals(str6, "14060")) {
                    aVar.a(aVar.g);
                } else if (TextUtils.equals(str6, "14090")) {
                    aVar.j = false;
                    long j = aVar.g;
                    String str7 = aVar.h;
                    Object[] objArr3 = {new Long(j), str7};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "32e43ca59bcd4fa61e3df6b310af7855", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "32e43ca59bcd4fa61e3df6b310af7855");
                    } else {
                        com.sankuai.waimai.store.im.base.net.a.a("SimpleListDialogDelegateImpl").a(j, str7, aVar.k);
                    }
                }
            }
        } else if (i == 11 || i == 12 || i == 13 || i == 14 || i == 101) {
            if (this.v == null) {
                this.v = new com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a(this.e, this, this.n, str, str4, str5);
            }
            final com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a aVar2 = this.v;
            Object[] objArr4 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.a;
            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "303b3e30a86a1f18126047f28bd10a5f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "303b3e30a86a1f18126047f28bd10a5f");
                return;
            }
            aVar2.i = i;
            final long j2 = aVar2.g;
            final String str8 = aVar2.h;
            final int i2 = aVar2.i;
            Object[] objArr5 = {new Long(j2), str8, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.a;
            if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "b0019d1acfe4d10c4a6ab63b73554da4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "b0019d1acfe4d10c4a6ab63b73554da4");
            } else {
                com.sankuai.waimai.store.im.base.net.b.a("SimpleListDialogDelegateImpl").a(j2, str8, i2, new j<QuickButtonInfo>() { // from class: com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a() {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f4ae469ab6c7edc5a015988da5f4e732", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f4ae469ab6c7edc5a015988da5f4e732");
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void b() {
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(QuickButtonInfo quickButtonInfo) {
                        QuickButtonInfo quickButtonInfo2 = quickButtonInfo;
                        int i3 = 1;
                        Object[] objArr6 = {quickButtonInfo2};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e20e199276070e5a6076ea2253e00754", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e20e199276070e5a6076ea2253e00754");
                            return;
                        }
                        if (i2 == 101 && quickButtonInfo2 != null && quickButtonInfo2.isFirstJoinGroup == 2) {
                            new com.sankuai.waimai.store.im.group.join.a().a("SimpleListDialogDelegateImpl", aVar2.b, j2, str8, null);
                        }
                        a aVar3 = aVar2;
                        int i4 = i2;
                        if (quickButtonInfo2 != null) {
                            if (quickButtonInfo2.isFirstJoinGroup != 1) {
                                if (quickButtonInfo2.isFirstJoinGroup == 2) {
                                    i3 = 0;
                                }
                            }
                            aVar3.a(i4, i3);
                        }
                        i3 = -999;
                        aVar3.a(i4, i3);
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                        Object[] objArr6 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "51047c78370cf8bfd1cd47bcc9eaad78", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "51047c78370cf8bfd1cd47bcc9eaad78");
                            return;
                        }
                        if (!t.a(bVar.getMessage()) && !com.sankuai.waimai.store.util.b.a(aVar2.b)) {
                            am.a(aVar2.b, bVar.getMessage());
                        } else {
                            am.a(aVar2.b, "网络连接异常");
                        }
                        aVar2.a(i2, -999);
                    }
                });
            }
        } else {
            if (this.v == null) {
                this.v = new com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a(this.e, this, this.n, str, str4, str5);
            }
            final com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a aVar3 = this.v;
            Object[] objArr6 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.a;
            if (PatchProxy.isSupport(objArr6, aVar3, changeQuickRedirect6, false, "1b45d919ee0aaa67cba0afe12257f5e1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, aVar3, changeQuickRedirect6, false, "1b45d919ee0aaa67cba0afe12257f5e1");
                return;
            }
            aVar3.i = i;
            long j3 = aVar3.g;
            String str9 = aVar3.h;
            final int i3 = aVar3.i;
            Object[] objArr7 = {new Long(j3), str9, Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.a;
            if (PatchProxy.isSupport(objArr7, aVar3, changeQuickRedirect7, false, "a852e08651ee5890a92a7693bbead281", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, aVar3, changeQuickRedirect7, false, "a852e08651ee5890a92a7693bbead281");
            } else {
                com.sankuai.waimai.store.im.base.net.d.a("SimpleListDialogDelegateImpl").a(j3, str9, i3, new j<com.sankuai.waimai.store.im.poi.ordersimplelist.c>() { // from class: com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a() {
                        Object[] objArr8 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect8 = a;
                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "8d56309c9c624e5fcf42233af4445ec1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "8d56309c9c624e5fcf42233af4445ec1");
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void b() {
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(com.sankuai.waimai.store.im.poi.ordersimplelist.c cVar) {
                        CustomDialog customDialog;
                        com.sankuai.waimai.store.im.poi.ordersimplelist.c cVar2 = cVar;
                        Object[] objArr8 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect8 = a;
                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "63db48517448d09fddd3e4ae4586e370", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "63db48517448d09fddd3e4ae4586e370");
                        } else if (cVar2 != null) {
                            if (com.sankuai.shangou.stone.util.a.b(cVar2.a)) {
                                am.a(aVar3.b, cVar2.c);
                                return;
                            }
                            a aVar4 = aVar3;
                            List<ImOrderInfo> list = cVar2.a;
                            String str10 = aVar3.e;
                            String str11 = aVar3.f;
                            Object[] objArr9 = {list, str10, str11};
                            ChangeQuickRedirect changeQuickRedirect9 = a.a;
                            if (PatchProxy.isSupport(objArr9, aVar4, changeQuickRedirect9, false, "9166014fadebdd446d1a5e34d95299b3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, aVar4, changeQuickRedirect9, false, "9166014fadebdd446d1a5e34d95299b3");
                            } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
                                for (ImOrderInfo imOrderInfo : list) {
                                    imOrderInfo.poiName = str10;
                                    imOrderInfo.poiLogo = str11;
                                }
                            }
                            a aVar5 = aVar3;
                            com.sankuai.waimai.store.im.poi.ordersimplelist.b bVar = aVar3.c;
                            Object[] objArr10 = {cVar2};
                            ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.store.im.poi.ordersimplelist.b.a;
                            if (PatchProxy.isSupport(objArr10, bVar, changeQuickRedirect10, false, "450f046671f4ce5f3eb16f5d6ad97951", RobustBitConfig.DEFAULT_VALUE)) {
                                customDialog = (CustomDialog) PatchProxy.accessDispatch(objArr10, bVar, changeQuickRedirect10, false, "450f046671f4ce5f3eb16f5d6ad97951");
                            } else {
                                Object[] objArr11 = {cVar2};
                                ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.store.im.poi.ordersimplelist.b.a;
                                if (PatchProxy.isSupport(objArr11, bVar, changeQuickRedirect11, false, "b684970995587b2579d694b53da2176d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr11, bVar, changeQuickRedirect11, false, "b684970995587b2579d694b53da2176d");
                                } else if (cVar2 != null) {
                                    com.sankuai.waimai.store.im.poi.adapter.d dVar = bVar.c;
                                    List<ImOrderInfo> list2 = cVar2.a;
                                    Object[] objArr12 = {list2};
                                    ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.store.im.poi.adapter.d.a;
                                    if (PatchProxy.isSupport(objArr12, dVar, changeQuickRedirect12, false, "32dca887aed632f64d9dc209820e72e9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr12, dVar, changeQuickRedirect12, false, "32dca887aed632f64d9dc209820e72e9");
                                    } else {
                                        dVar.b.clear();
                                        dVar.b.addAll(list2);
                                        dVar.notifyDataSetChanged();
                                    }
                                }
                                customDialog = bVar.b;
                            }
                            aVar5.d = customDialog;
                            com.sankuai.waimai.store.util.d.b(aVar3.d);
                            JudasManualManager.b("b_waimai_n4jnb36y_mv").a(com.sankuai.waimai.business.im.utils.d.a).a("poi_id", aVar3.g).a(RaptorConstants.JS_BATCH_NUM, com.sankuai.shangou.stone.util.a.a((List) cVar2.a)).a("type", i3).a();
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.listener.a
    public final void a(ImOrderInfo imOrderInfo, GeneralMessage generalMessage) {
        Object[] objArr = {imOrderInfo, generalMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "810ab2e99d4a7c6059fc49b438a2d6aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "810ab2e99d4a7c6059fc49b438a2d6aa");
            return;
        }
        if (generalMessage != null) {
            IMUIManager.a().a(generalMessage);
        }
        a(imOrderInfo, 102);
    }

    @Override // com.sankuai.waimai.store.im.poi.listener.a
    public final void b(final ImOrderInfo imOrderInfo, @Nullable GeneralMessage generalMessage) {
        Object[] objArr = {imOrderInfo, generalMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd3b3a0ee299096d47d16abcf016e1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd3b3a0ee299096d47d16abcf016e1d");
            return;
        }
        if (generalMessage != null) {
            IMUIManager.a().a(generalMessage);
        }
        Object[] objArr2 = {imOrderInfo, 0};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ed73842563ea8d8ec433c2f09353914", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ed73842563ea8d8ec433c2f09353914");
            return;
        }
        String valueOf = String.valueOf(imOrderInfo.orderViewID);
        if (TextUtils.isEmpty(valueOf)) {
            return;
        }
        final Dialog a = com.sankuai.waimai.store.util.d.a(this.e);
        com.sankuai.waimai.store.im.base.net.d.a(this.u).a(valueOf, "0", 1, new k<com.sankuai.waimai.business.order.api.model.g>() { // from class: com.sankuai.waimai.store.im.poi.SGWMPoiChatDelegate.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                Object[] objArr3 = {(com.sankuai.waimai.business.order.api.model.g) obj};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dc6a7e7e575220c90e9bc3e3477a6400", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dc6a7e7e575220c90e9bc3e3477a6400");
                    return;
                }
                com.sankuai.waimai.store.util.d.a(a);
                if (f.a(SGWMPoiChatDelegate.this.e) || r3 == 1) {
                    return;
                }
                SGWMPoiChatDelegate.this.a(imOrderInfo, 101);
                ae.a(SGWMPoiChatDelegate.this.e, (int) R.string.wm_sc_remind_success_hint);
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca626e30735c127ee1f4df02b065810b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca626e30735c127ee1f4df02b065810b");
                    return;
                }
                com.sankuai.waimai.store.util.d.a(a);
                String str = bVar.b;
                if (!TextUtils.isEmpty(str)) {
                    ae.a(SGWMPoiChatDelegate.this.e, str);
                } else {
                    ae.a(SGWMPoiChatDelegate.this.e, SGWMPoiChatDelegate.this.e.getResources().getString(R.string.wm_sc_common_net_error_info));
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.im.poi.listener.a
    public final long G() {
        return this.n;
    }

    @Override // com.sankuai.waimai.store.im.poi.listener.a
    public final void c(ImOrderInfo imOrderInfo, GeneralMessage generalMessage) {
        Object[] objArr = {imOrderInfo, generalMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44d871efcd7ac0427df241d8384c1bd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44d871efcd7ac0427df241d8384c1bd0");
        } else {
            a(imOrderInfo);
        }
    }

    @Subscribe
    public void onModifyAddressClick(ImModifyAddressClickEvent imModifyAddressClickEvent) {
        Object[] objArr = {imModifyAddressClickEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5cf67e2f7318f4f3f5e018e30b1668a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5cf67e2f7318f4f3f5e018e30b1668a");
        } else if (p.a(imModifyAddressClickEvent) || p.a(imModifyAddressClickEvent.imOrderInfo)) {
        } else {
            a(imModifyAddressClickEvent.imOrderInfo);
        }
    }

    @Subscribe
    public void onSendSpuCard(ImSendSpuCardEvent imSendSpuCardEvent) {
        Object[] objArr = {imSendSpuCardEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af8ded37173acc19cc238388430595df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af8ded37173acc19cc238388430595df");
        } else if (p.a(imSendSpuCardEvent) || p.a(imSendSpuCardEvent.spuInfo)) {
        } else {
            ReadableMap readableMap = imSendSpuCardEvent.spuInfo;
            try {
                if (readableMap.hasKey("name") && readableMap.hasKey("detail_scheme") && readableMap.hasKey("id")) {
                    long j = (long) readableMap.getDouble("id");
                    String string = readableMap.getString("name");
                    String string2 = readableMap.getString("detail_scheme");
                    ArrayList<Object> arrayList = readableMap.getArray("skus").toArrayList();
                    if (!p.a(arrayList) && !p.a(com.sankuai.waimai.foundation.utils.b.a(arrayList, 0))) {
                        Object a = com.sankuai.waimai.foundation.utils.b.a(arrayList, 0);
                        if (!p.a(a) && (a instanceof HashMap)) {
                            Map map = (Map) a;
                            String str = (String) map.get("picture");
                            Double d = (Double) map.get("price");
                            Double d2 = (Double) map.get("origin_price");
                            if (!p.a(d) && !p.a(d2) && !t.a(str)) {
                                byte[] a2 = new com.sankuai.waimai.business.im.model.d(str, string, d.doubleValue(), d2.doubleValue(), string2, j).a(0);
                                if (a2 == null) {
                                    return;
                                }
                                IMUIManager.a().a((IMMessage) c.a(a2), false);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    private void a(final ImOrderInfo imOrderInfo) {
        Object[] objArr = {imOrderInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a9624ea1811a2c0de0fdda4a75917f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a9624ea1811a2c0de0fdda4a75917f");
            return;
        }
        com.sankuai.waimai.store.manager.judas.b.a(com.sankuai.waimai.business.im.utils.d.a, "b_waimai_3cbvji79_mc").a("poi_id", Long.valueOf(this.n)).a("order_id", Long.valueOf(imOrderInfo.orderViewID)).a("i_source", 2).a();
        com.sankuai.waimai.store.im.base.net.b.a(this.u).a(String.valueOf(this.n), this.o, String.valueOf(imOrderInfo.orderViewID), 1, new j<SGModifyAddressAllowed>() { // from class: com.sankuai.waimai.store.im.poi.SGWMPoiChatDelegate.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b7afd2294b5d2cd5ba8d72c33b407c1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b7afd2294b5d2cd5ba8d72c33b407c1");
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(SGModifyAddressAllowed sGModifyAddressAllowed) {
                SGModifyAddressAllowed sGModifyAddressAllowed2 = sGModifyAddressAllowed;
                Object[] objArr2 = {sGModifyAddressAllowed2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a10665d139714daf4c43f562c3857eaa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a10665d139714daf4c43f562c3857eaa");
                } else if (p.a(sGModifyAddressAllowed2) || p.a(sGModifyAddressAllowed2.additionalInfo) || sGModifyAddressAllowed2.additionalInfo.addrModifyDegraded || sGModifyAddressAllowed2.addrModifyAllowed != 1) {
                    if (p.a(sGModifyAddressAllowed2) || t.a(sGModifyAddressAllowed2.toastTip)) {
                        ae.a(SGWMPoiChatDelegate.this.e, (int) R.string.wm_sc_order_modify_address_degree);
                    } else {
                        ae.a(SGWMPoiChatDelegate.this.e, sGModifyAddressAllowed2.toastTip);
                    }
                } else if (imOrderInfo.orderViewID != 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString(Constants.EventConstants.KEY_ORDER_ID, String.valueOf(SGWMPoiChatDelegate.this.l));
                    bundle.putString("poiId", String.valueOf(SGWMPoiChatDelegate.this.G()));
                    bundle.putInt("sgImModifyAddress", 1);
                    com.sankuai.waimai.foundation.router.a.a(SGWMPoiChatDelegate.this.e, com.sankuai.waimai.foundation.router.interfaces.c.ac, bundle);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "641a5b0a79c300956921a19f77f5954f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "641a5b0a79c300956921a19f77f5954f");
                } else {
                    ae.a(SGWMPoiChatDelegate.this.e, (int) R.string.wm_sc_order_modify_address_degree);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ImOrderInfo imOrderInfo, int i) {
        Object[] objArr = {imOrderInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e9fda239589781c1699693c1b78c347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e9fda239589781c1699693c1b78c347");
            return;
        }
        byte[] data = new ImOrderData(imOrderInfo, false, i).toData();
        if (data != null) {
            IMUIManager.a().a((IMMessage) c.a(data), false);
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a
    public final void A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99346e0ddcde4a7ed95416eb7895cb9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99346e0ddcde4a7ed95416eb7895cb9e");
        } else if (this.m == null || this.m.statusInfo == null || this.m.statusInfo.a != 11 || TextUtils.isEmpty(this.m.statusInfo.c)) {
        } else {
            String str = this.m.statusInfo.c;
            Object[] objArr2 = {str, 0};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d83cffba706f2374fa17408dbef02174", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d83cffba706f2374fa17408dbef02174");
            } else if (TextUtils.isEmpty(str)) {
            } else {
                ImSGTip imSGTip = new ImSGTip();
                imSGTip.tipContent = str;
                imSGTip.tipType = 0;
                imSGTip.type = 7;
                byte[] data = imSGTip.toData();
                if (data != null) {
                    a((IMMessage) c.a(data), true);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void a() {
        boolean z;
        boolean z2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92859f8050b9c9913313bf5836decb8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92859f8050b9c9913313bf5836decb8e");
            return;
        }
        super.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c08f3267a7833e5b4d29fc3de017d757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c08f3267a7833e5b4d29fc3de017d757");
        } else {
            com.sankuai.waimai.mach.manager.load.c.a("supermarket", "waimai-im");
        }
        com.meituan.android.ptcommonim.base.manager.a.a().a(bw_(), PTIMCommonBean.UserType.TYPE_C);
        com.meituan.android.bus.a.a().a(this);
        final Bundle arguments = this.f.getArguments();
        this.J.a();
        PoiImInfo poiImInfo = this.m;
        Object[] objArr3 = {arguments, poiImInfo};
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2aa31f5050c32bd66eb90da86a0e61e6", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2aa31f5050c32bd66eb90da86a0e61e6")).booleanValue();
        } else {
            boolean z3 = arguments != null && arguments.getLong("order_view_id", 0L) > 0;
            if (poiImInfo != null) {
                boolean z4 = poiImInfo.orderCard != null && poiImInfo.orderCard.a;
                boolean z5 = poiImInfo.getPoiImStatus() != 6;
                if (z4 && z5) {
                    z = true;
                    z2 = !z3 && z;
                }
            }
            z = false;
            if (z3) {
            }
        }
        if (z2) {
            com.sankuai.waimai.store.im.base.net.b.a(this.u).a(String.valueOf(this.n), this.o, String.valueOf(arguments.getLong("order_view_id", 0L)), 0, new j<SGModifyAddressAllowed>() { // from class: com.sankuai.waimai.store.im.poi.SGWMPoiChatDelegate.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "810b62e8adc76b59e2d5c680ec44bac5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "810b62e8adc76b59e2d5c680ec44bac5");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(SGModifyAddressAllowed sGModifyAddressAllowed) {
                    SGModifyAddressAllowed sGModifyAddressAllowed2 = sGModifyAddressAllowed;
                    Object[] objArr4 = {sGModifyAddressAllowed2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8254eee29b477f3c6b89097eb91751fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8254eee29b477f3c6b89097eb91751fb");
                    } else if (!p.a(sGModifyAddressAllowed2) && !p.a(sGModifyAddressAllowed2.additionalInfo) && !sGModifyAddressAllowed2.additionalInfo.addrModifyDegraded) {
                        SGWMPoiChatDelegate.a(SGWMPoiChatDelegate.this, sGModifyAddressAllowed2.addrModifyAllowed == 1, arguments);
                    } else {
                        SGWMPoiChatDelegate.a(SGWMPoiChatDelegate.this, false, arguments);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr4 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a2ae5892b0e3dcf13cd97fa81b2e01af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a2ae5892b0e3dcf13cd97fa81b2e01af");
                    } else {
                        SGWMPoiChatDelegate.a(SGWMPoiChatDelegate.this, false, arguments);
                    }
                }
            });
        }
        this.M = this.m.getUsePrivacy() == 1;
        this.N = TextUtils.isEmpty(this.m.getBookPhone()) ? this.m.getRecipientPhone() : this.m.getBookPhone();
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [T, com.sankuai.waimai.store.im.poi.model.SGGeneralTip] */
    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efa5d96d8b63b2708f8f99a7a09229a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efa5d96d8b63b2708f8f99a7a09229a1");
            return;
        }
        super.b();
        if (this.m != null && this.m.getSceneContentMap() != null && !this.y.contains("bad_review")) {
            HashMap<String, String> sceneContentMap = this.m.getSceneContentMap();
            if (sceneContentMap.containsKey("bad_review")) {
                String str = sceneContentMap.get("bad_review");
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "642e40de08cecc64c1fe033e15fcee05", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "642e40de08cecc64c1fe033e15fcee05");
                } else if (!TextUtils.isEmpty(str)) {
                    ?? sGGeneralTip = new SGGeneralTip();
                    sGGeneralTip.tipContent = str;
                    SGGeneralMessagData sGGeneralMessagData = new SGGeneralMessagData();
                    sGGeneralMessagData.data = sGGeneralTip;
                    sGGeneralMessagData.type = 105;
                    byte[] data = sGGeneralMessagData.toData();
                    if (data != null) {
                        GeneralMessage a = c.a(data);
                        b(a);
                        IMUIManager.a().a((IMMessage) a, false);
                    }
                }
                this.y.add("bad_review");
            }
        }
        this.J.b();
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.common.contract.a
    public final void b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2e1b29e5386503a62a41cce2e2d32ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2e1b29e5386503a62a41cce2e2d32ab");
            return;
        }
        super.b(iMMessage);
        if (this.x) {
            HashMap hashMap = new HashMap();
            hashMap.put("subType", "1");
            iMMessage.appendExtension(hashMap);
        }
        if (com.sankuai.waimai.store.config.k.c()) {
            e(iMMessage);
        } else if (com.sankuai.waimai.store.config.k.d()) {
            d(iMMessage);
        }
        if (com.sankuai.waimai.store.config.k.a()) {
            c(iMMessage);
        }
        iMMessage.appendExtension(H());
    }

    private HashMap<String, Object> H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d532a0d88afa6aa0330ed56b717aabd", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d532a0d88afa6aa0330ed56b717aabd");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (this.m != null) {
            hashMap.put("sg_order_id", this.m.lastOrderId == 0 ? "-999" : Long.valueOf(this.m.lastOrderId));
        } else {
            hashMap.put("sg_order_id", "-999");
        }
        return hashMap;
    }

    private void c(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77a680b10e45169a3c9c3fcc9c3487b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77a680b10e45169a3c9c3fcc9c3487b4");
        } else if (iMMessage == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("msg_source", "android-c");
            iMMessage.appendExtension(hashMap);
        }
    }

    private void d(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4de53ef14bec998483270fb8c478cc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4de53ef14bec998483270fb8c478cc8");
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        int i = this.A;
        if (i == 1) {
            a(hashMap);
        } else if (i == 10) {
            b(hashMap);
        } else {
            hashMap.put("msgOriginId", "");
        }
        iMMessage.appendExtension(hashMap);
    }

    private void a(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "289843796c2453b00629bcfa43a90caa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "289843796c2453b00629bcfa43a90caa");
        } else if (this.B != null) {
            int i = this.B.getInt("biz_im_from", 0);
            int i2 = this.B.getInt("SG_EXTENSION_IM_FROM", 0);
            if (i > 0) {
                switch (i) {
                    case 1:
                        hashMap.put("msgOriginId", "c_u4fk4kw");
                        return;
                    case 2:
                        hashMap.put("msgOriginId", "c_waimai_qeknbhm9");
                        return;
                    case 3:
                        hashMap.put("msgOriginId", "c_waimai_3kr4ysf1");
                        return;
                    default:
                        hashMap.put("msgOriginId", "");
                        return;
                }
            } else if (i2 == 6) {
                hashMap.put("msgOriginId", "c_6ag7r404");
            } else if (this.C != null) {
                if (11 == this.C.a()) {
                    hashMap.put("msgOriginId", "c_group_htprgnei");
                } else if (12 == this.C.a()) {
                    hashMap.put("msgOriginId", "push_id=372600");
                } else if (13 == this.C.a()) {
                    hashMap.put("msgOriginId", "b_group_xq3whxuj_mc");
                } else {
                    hashMap.put("msgOriginId", "push_id=372600");
                }
            } else {
                hashMap.put("msgOriginId", "b_group_xq3whxuj_mc");
            }
        }
    }

    private void e(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d65eb680e787fcdb28de128bbf66cd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d65eb680e787fcdb28de128bbf66cd9");
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        int i = this.A;
        if (i == 6) {
            c(hashMap);
        } else if (i == 10) {
            b(hashMap);
        } else {
            switch (i) {
                case 1:
                    hashMap.put("msgOriginId", "b_xxL1F");
                    break;
                case 2:
                    hashMap.put("msgOriginId", "b_JXKMl");
                    break;
                default:
                    hashMap.put("msgOriginId", "");
                    break;
            }
        }
        iMMessage.appendExtension(hashMap);
    }

    private void b(@NonNull HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16f564c18066b7a2fe1bc49ba6e61ddb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16f564c18066b7a2fe1bc49ba6e61ddb");
        } else if (this.B != null) {
            String string = this.B.getString("sg-dx-im-from");
            String string2 = this.B.getString("sg-msgOriginId");
            if ("sg-from-Restaurant".equals(string) || "sg-from-Detail".equals(string)) {
                hashMap.put("msgOriginId", string2);
                return;
            }
            long j = this.B.getLong("order_view_id", 0L);
            int i = this.B.getInt("status", 0);
            if (j <= 0 || i <= 0) {
                return;
            }
            hashMap.put("msgOriginId", "c_hgowsqb");
            hashMap.put("orderViewId", Long.valueOf(j));
            hashMap.put("orderStatus", Integer.valueOf(i));
        }
    }

    private void c(@NonNull HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "350f2a244b4267f65b2ba0fa574ced3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "350f2a244b4267f65b2ba0fa574ced3a");
        } else if (this.B != null) {
            switch (this.B.getInt("biz_im_from", 0)) {
                case 1:
                    hashMap.put("msgOriginId", "c_u4fk4kw");
                    return;
                case 2:
                    hashMap.put("msgOriginId", "c_waimai_qeknbhm9");
                    return;
                case 3:
                    hashMap.put("msgOriginId", "c_waimai_3kr4ysf1");
                    return;
                default:
                    hashMap.put("msgOriginId", "c_6ag7r404");
                    return;
            }
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf6ec8ee434d821951ae16d6962c6de", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf6ec8ee434d821951ae16d6962c6de") : super.a(layoutInflater, viewGroup);
    }

    @Override // com.sankuai.waimai.store.im.poi.listener.d
    public final void a(final IMEnterUserGroupData iMEnterUserGroupData) {
        Object[] objArr = {iMEnterUserGroupData};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e126a88e082f555e32b758483a75669d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e126a88e082f555e32b758483a75669d");
            return;
        }
        if (this.z == null) {
            this.z = new com.sankuai.waimai.store.im.group.join.a();
        }
        this.z.a(this.u, this.e, this.n, this.o, new a.InterfaceC1209a() { // from class: com.sankuai.waimai.store.im.poi.SGWMPoiChatDelegate.6
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.sankuai.waimai.store.im.group.join.a.InterfaceC1209a
            public final boolean a(int i, JoinGroupInfo joinGroupInfo) {
                Object[] objArr2 = {Integer.valueOf(i), joinGroupInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c81eaedbf4293d2caf983d66593851a", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c81eaedbf4293d2caf983d66593851a")).booleanValue();
                }
                int i2 = -999;
                i2 = -999;
                if (i == 0 && joinGroupInfo != null) {
                    i2 = joinGroupInfo.newJoin;
                }
                com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.a(com.sankuai.waimai.business.im.utils.d.a, "b_waimai_7lwlfdjy_mc");
                StringBuilder sb = new StringBuilder();
                sb.append(SGWMPoiChatDelegate.this.n);
                a2.a("poi_id", sb.toString()).a("group_source", t.a(iMEnterUserGroupData.source) ? "-1" : iMEnterUserGroupData.source).a("status", Integer.valueOf(i2)).a();
                return false;
            }
        });
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        boolean z;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "565054878eaf3cf77fb36b02fbf7a194", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "565054878eaf3cf77fb36b02fbf7a194")).booleanValue();
        }
        final com.sankuai.waimai.store.im.util.a aVar = this.P;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.im.util.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "6cbf1da791325a55437e12a5139b7484", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "6cbf1da791325a55437e12a5139b7484")).booleanValue();
        } else {
            if (!aVar.e) {
                if (System.currentTimeMillis() - aVar.c >= 1000 || aVar.b < 5) {
                    z = false;
                } else {
                    aVar.e = true;
                    al.a(new Runnable() { // from class: com.sankuai.waimai.store.im.util.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c91a9fc96746d20392167e8c76ca374e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c91a9fc96746d20392167e8c76ca374e");
                            } else {
                                a.a(aVar, false);
                            }
                        }
                    }, 3000, com.sankuai.waimai.store.im.util.a.d);
                }
            }
            z = true;
        }
        if (z) {
            return true;
        }
        if (this.I != null && bVar != null && bVar.b != 0 && bVar.b.getMsgType() == 17) {
            this.I.a(bVar.b);
        }
        com.sankuai.waimai.store.im.util.a aVar2 = this.P;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.im.util.a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "edbe819c24ee6f334091bf41a2e7bb73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "edbe819c24ee6f334091bf41a2e7bb73");
        } else if (System.currentTimeMillis() - aVar2.c > 1000) {
            aVar2.b = 1;
            aVar2.c = System.currentTimeMillis();
        } else {
            aVar2.b++;
        }
        return false;
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void a(int i, IMMessage iMMessage) {
        Object[] objArr = {Integer.valueOf(i), iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2991088ad3bba088fac518acd85c4bcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2991088ad3bba088fac518acd85c4bcd");
            return;
        }
        if (i == 988) {
            EventMessage b2 = c.b(this.e.getResources().getString(R.string.wm_sg_im_send_message_result_failed_tip));
            b(b2);
            com.sankuai.waimai.imbase.utils.f.b(b2, false);
        }
        super.a(i, iMMessage);
    }

    @Override // com.sankuai.waimai.business.im.prepare.i, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    @SuppressLint({"ResourceName"})
    public final TitleBarAdapter g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93d78e9027f9dea3cc452ca9ee9ea498", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93d78e9027f9dea3cc452ca9ee9ea498");
        }
        SGIMTitleBarAdapter sGIMTitleBarAdapter = new SGIMTitleBarAdapter(this.m);
        sGIMTitleBarAdapter.c = new SGIMTitleBarAdapter.a() { // from class: com.sankuai.waimai.store.im.poi.SGWMPoiChatDelegate.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter.a
            public final void c() {
            }

            @Override // com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aef9b455306e4536227699a56e7c3068", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aef9b455306e4536227699a56e7c3068");
                    return;
                }
                SGWMPoiChatDelegate.this.a(SGWMPoiChatDelegate.this.e, SGWMPoiChatDelegate.this.n, SGWMPoiChatDelegate.this.m);
                SGWMPoiChatDelegate.this.E();
            }

            @Override // com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9edd080b224b7d7a29976014551231e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9edd080b224b7d7a29976014551231e1");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(com.sankuai.waimai.business.im.utils.d.a, "b_waimai_385da0yd_mc").a("poi_id", Long.valueOf(SGWMPoiChatDelegate.this.G())).a();
                if (p.a(SGWMPoiChatDelegate.this.F) || com.sankuai.waimai.foundation.utils.b.b(SGWMPoiChatDelegate.this.F.mPoiPhoneInfoList)) {
                    SGWMPoiChatDelegate.this.F();
                } else {
                    SGWMPoiChatDelegate.r(SGWMPoiChatDelegate.this);
                }
            }
        };
        return sGIMTitleBarAdapter;
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.xm.im.IMClient.i
    public final void a(List<IMMessage> list, boolean z) {
        IMMessage iMMessage;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17de339f9942377858254fde5a7a83c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17de339f9942377858254fde5a7a83c6");
            return;
        }
        com.meituan.android.ptcommonim.base.manager.d.a(list, z, PTIMCommonBean.UserType.TYPE_C);
        super.a(list, z);
        if (!z && !com.sankuai.waimai.foundation.utils.b.b(list) && (iMMessage = (IMMessage) com.sankuai.waimai.foundation.utils.b.a(list, com.sankuai.waimai.foundation.utils.b.c(list) - 1)) != null && iMMessage.getMsgType() == 12 && this.E != null && iMMessage.getChatId() == this.E.b && (iMMessage instanceof EventMessage) && TextUtils.equals(((EventMessage) iMMessage).getType(), "sgim.evaluate")) {
            if (this.w == null) {
                this.w = new com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a();
            }
            com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a aVar = this.w;
            Activity activity = this.e;
            long j = this.n;
            Object[] objArr2 = {activity, new Long(j), (byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "535f44f706aa4fd86f2e41664288246c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "535f44f706aa4fd86f2e41664288246c");
            } else {
                aVar.b = activity;
                aVar.j = false;
                if (j >= 0 || !t.a(aVar.h)) {
                    aVar.a(j);
                }
            }
        }
        if (!com.sankuai.waimai.foundation.utils.b.a(list) || this.I == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (IMMessage iMMessage2 : list) {
            if (iMMessage2 != null && iMMessage2.getMsgType() == 17 && this.E != null && iMMessage2.getChatId() == this.E.b) {
                arrayList.add(iMMessage2);
            }
        }
        this.I.a(arrayList);
    }

    @Override // com.sankuai.waimai.store.expose.v2.a
    public final View f() {
        return this.t;
    }

    @Override // com.sankuai.waimai.store.expose.v2.a
    public final Activity bB_() {
        return this.e;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void an_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc546c1d6e02ca173c41a08a526704d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc546c1d6e02ca173c41a08a526704d");
        } else if (com.sankuai.waimai.store.im.poi.presenter.c.b()) {
            com.sankuai.waimai.store.expose.v2.b.a().c(this);
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void br_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93ce5d3de3cae0895687fdbbbeed287d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93ce5d3de3cae0895687fdbbbeed287d");
        } else if (com.sankuai.waimai.store.im.poi.presenter.c.b()) {
            com.sankuai.waimai.store.expose.v2.b.a().e(this);
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void bs_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3630db0390502a728f8a71697c16d060", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3630db0390502a728f8a71697c16d060");
        } else if (com.sankuai.waimai.store.im.poi.presenter.c.b()) {
            com.sankuai.waimai.store.expose.v2.b.a().f(this);
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void a(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4acc3ca2fb40960444452048ef9ad068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4acc3ca2fb40960444452048ef9ad068");
            return;
        }
        super.a(view, bundle);
        this.t = view;
        if (com.sankuai.waimai.store.im.poi.presenter.c.b()) {
            com.sankuai.waimai.store.expose.v2.b.a().a(this);
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final void a(com.sankuai.waimai.store.im.delegate.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33f60e9a989b500e8083d39d836c791c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33f60e9a989b500e8083d39d836c791c");
        } else if (this.J != null) {
            b bVar = this.J;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ecc7705b81ebdfbbcc27c0af9cf5785e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ecc7705b81ebdfbbcc27c0af9cf5785e");
            } else if (bVar.b == null || bVar.b.contains(aVar)) {
            } else {
                bVar.b.add(aVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.sankuai.waimai.store.im.poi.contract.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.store.im.poi.SGWMPoiChatDelegate.b
            java.lang.String r11 = "cc41fd4f5c8df451c5862223f9ff3f45"
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
            if (r13 != 0) goto L1e
            return
        L1e:
            java.lang.String r1 = "data"
            java.lang.Object r1 = r13.get(r1)
            if (r1 == 0) goto L70
            java.lang.String r1 = "is_show_avatar"
            java.lang.Object r1 = r13.get(r1)
            if (r1 == 0) goto L70
            java.lang.String r1 = "is_show_avatar"
            java.lang.Object r1 = r13.get(r1)
            boolean r1 = r1 instanceof java.lang.Boolean
            if (r1 != 0) goto L3b
            goto L70
        L3b:
            java.lang.String r1 = "is_show_avatar"
            java.lang.Object r1 = r13.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "data"
            java.lang.Object r13 = r13.get(r2)
            java.lang.String r13 = com.sankuai.waimai.store.util.i.a(r13)
            r2 = 0
            boolean r3 = android.text.TextUtils.isEmpty(r13)
            if (r3 != 0) goto L64
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L60
            byte[] r13 = r13.getBytes(r3)     // Catch: java.lang.Exception -> L60
            goto L65
        L60:
            r13 = move-exception
            com.sankuai.waimai.foundation.utils.log.a.a(r13)
        L64:
            r13 = r2
        L65:
            if (r13 == 0) goto L6f
            com.sankuai.xm.im.message.bean.GeneralMessage r13 = com.sankuai.xm.imui.common.util.c.a(r13)
            r0 = r0 ^ r1
            r12.a(r13, r0)
        L6f:
            return
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.im.poi.SGWMPoiChatDelegate.a(java.util.Map):void");
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void a(int i, String str, List<com.sankuai.xm.imui.session.entity.b> list, int i2, boolean z) {
        c.a aVar;
        Object[] objArr = {Integer.valueOf(i), str, list, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21831a67d82d43e9dfc22d90a019d43c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21831a67d82d43e9dfc22d90a019d43c");
            return;
        }
        if (this.f != null && this.F != null && this.F.isUserDynamic && ((i2 == 1 || i2 == 2 || i2 == 4) && (aVar = this.f.u) != null)) {
            int c = com.sankuai.waimai.foundation.utils.b.c(aVar.c());
            com.sankuai.waimai.foundation.utils.b.c(list);
            if (this.I != null && this.I.a(c)) {
                View B = B();
                if (B != null) {
                    u.b(B);
                }
                this.I.a();
            }
        }
        super.a(i, str, list, i2, z);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public final View B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ed00d8cd912cfa702b18cc3f83abfab", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ed00d8cd912cfa702b18cc3f83abfab");
        }
        if (this.f == null || this.f.getView() == null) {
            return null;
        }
        try {
            return this.f.getView().findViewById(R.id.xm_sdk_msg_list);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final synchronized Map<String, Object> h() {
        return this.G;
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final synchronized Map<String, Object> ak_() {
        return this.H;
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a
    @Nullable
    public final String C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "950dad7cbfc95728f3d4bb13e333304e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "950dad7cbfc95728f3d4bb13e333304e") : this.B == null ? "0" : String.valueOf(this.B.getLong("order_view_id", 0L));
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a334ad91dddfbc8ab3c8d7e35b13752", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a334ad91dddfbc8ab3c8d7e35b13752") : String.valueOf(this.n);
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.common.contract.a
    public final String s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27edc7dc3230c0eec73bb5bd16f4bcc7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27edc7dc3230c0eec73bb5bd16f4bcc7") : super.s();
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    @Nullable
    public final SGCommonDataInfo m() {
        return this.F;
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final void aj_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6fb9310a8ccce23736865f5549b3c0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6fb9310a8ccce23736865f5549b3c0c");
            return;
        }
        try {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.im.poi.SGWMPoiChatDelegate.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb42cc381d215d061213e73e7dea33a1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb42cc381d215d061213e73e7dea33a1");
                        return;
                    }
                    View B = SGWMPoiChatDelegate.this.B();
                    if (SGWMPoiChatDelegate.this.f != null && B != null && !SGWMPoiChatDelegate.this.K) {
                        SGWMPoiChatDelegate.this.f.A();
                        SGWMPoiChatDelegate.this.f.y();
                        SGWMPoiChatDelegate.a(SGWMPoiChatDelegate.this, true);
                    }
                    if (B != null) {
                        u.a(B);
                    }
                }
            }, this.u);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final void ah_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "021b4961614ebea2b41a3216ae53f5a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "021b4961614ebea2b41a3216ae53f5a0");
        } else if (this.f == null || this.f.getHost() == null || this.L) {
        } else {
            this.f.y();
            this.L = true;
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final String bt_() {
        return this.u;
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final void bv_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54920175007fd3712e512d625c5a19ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54920175007fd3712e512d625c5a19ae");
        } else {
            a(this.e, this.n, this.m);
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final int v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55156c34828e69061f85d88d55ecb2d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55156c34828e69061f85d88d55ecb2d2")).intValue();
        }
        if (this.m != null) {
            String bizOrgCode = this.m.getBizOrgCode();
            return (!TextUtils.equals(bizOrgCode, "14060") && TextUtils.equals(bizOrgCode, "14090")) ? 9 : 0;
        }
        return 0;
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final ICommonAdapter bx_() {
        return this.Q;
    }

    private void a(final Context context, String[] strArr, final String[] strArr2, int i) {
        Object[] objArr = {context, strArr, strArr2, 1};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffbe22b41348e84b993356831dba1286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffbe22b41348e84b993356831dba1286");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", com.sankuai.waimai.business.im.utils.a.a(this.n, this.o));
        JudasManualManager.a(com.sankuai.waimai.business.im.utils.d.j).a(com.sankuai.waimai.business.im.utils.d.a).a((Map<String, Object>) hashMap).a();
        if (context != null) {
            if (!ac.a(context)) {
                ae.a(context, (int) R.string.wm_im_your_phone_can_not_be_connected);
            } else if (strArr2.length == 0) {
                ae.a(context, (int) R.string.wm_im_no_available_phone_num);
            } else if (this.M && this.l > 0) {
                ArrayList<String> arrayList = new ArrayList<>();
                for (String str : strArr2) {
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
                com.sankuai.waimai.platform.widget.dial.injection.a.a(context).a(String.valueOf(this.l), arrayList, this.N, 1);
            } else {
                new CustomDialog.a(context).c(R.string.wm_im_dial_phone_num).a(strArr, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.SGWMPoiChatDelegate.9
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03afc27cf60bada4538243ac861fd841", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03afc27cf60bada4538243ac861fd841");
                            return;
                        }
                        if (r2 == 1) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("receive_user_type", Integer.valueOf(com.sankuai.waimai.business.im.utils.c.a(SGWMPoiChatDelegate.x(SGWMPoiChatDelegate.this))));
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("custom", hashMap2);
                            JudasManualManager.a("b_waimai_m3wl69qu_mc").a((Map<String, Object>) hashMap3).a("c_waimai_wgiu7lrd").a();
                        }
                        if (i2 < strArr2.length) {
                            z.a(context, strArr2[i2]);
                        }
                    }
                }).b(R.string.wm_im_cancel, (DialogInterface.OnClickListener) null).c();
            }
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final Context bw_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49350f1c639d1548e8e74ad428fef4d8", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49350f1c639d1548e8e74ad428fef4d8") : this.e;
    }
}
