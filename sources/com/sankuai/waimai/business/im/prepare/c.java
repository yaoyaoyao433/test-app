package com.sankuai.waimai.business.im.prepare;

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
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper;
import com.sankuai.waimai.business.im.model.PoiImInfo;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.model.o;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ac;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class c extends a {
    public static ChangeQuickRedirect i;
    private boolean b;
    public String j;
    public String k;
    public long l;
    public PoiImInfo m;
    public long n;
    public String o;
    protected int p;
    public int q;
    protected GeneralMessage r;
    private boolean s;
    private String t;

    public abstract void D();

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public abstract void a(Context context, long j, String str, PoiImInfo poiImInfo);

    public abstract void a(SessionParams sessionParams);

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void bs_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a6e283b2cdbeaf2574def9d0d3497e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a6e283b2cdbeaf2574def9d0d3497e4");
        }
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public final int p() {
        return 2;
    }

    public abstract int u();

    @Override // com.sankuai.waimai.business.im.prepare.a
    public final int y() {
        return 2;
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    @Nullable
    public /* bridge */ /* synthetic */ String C() {
        return super.C();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public /* bridge */ /* synthetic */ void a(int i2, String str, List list, int i3, boolean z) {
        super.a(i2, str, list, i3, z);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void a(com.sankuai.waimai.business.im.delegate.a aVar) {
        super.a(aVar);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void a(com.sankuai.waimai.business.im.group.model.i iVar) {
        super.a(iVar);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void a(com.sankuai.xm.imui.session.entity.b bVar, Map map) {
        super.a(bVar, map);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.xm.im.IMClient.i
    public /* bridge */ /* synthetic */ void a(List list, boolean z) {
        super.a(list, z);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public /* bridge */ /* synthetic */ boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        return super.a(bVar);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ void a_(long j) {
        super.a_(j);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public /* bridge */ /* synthetic */ void ah_() {
        super.ah_();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void ai_() {
        super.ai_();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public /* bridge */ /* synthetic */ void aj_() {
        super.aj_();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public /* bridge */ /* synthetic */ Map ak_() {
        return super.ak_();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ void al_() {
        super.al_();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void b(long j) {
        super.b(j);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void b(com.sankuai.xm.imui.session.entity.b bVar, Map map) {
        super.b(bVar, map);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void b(Map map) {
        super.b(map);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void b(boolean z) {
        super.b(z);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void b_(Map map) {
        super.b_(map);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public /* bridge */ /* synthetic */ ISendPanelAdapter bq_() {
        return super.bq_();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void c(Map map) {
        super.c(map);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    @NonNull
    public /* bridge */ /* synthetic */ Map h() {
        return super.h();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ WMCommonDataInfo j() {
        return super.j();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void o() {
        super.o();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final /* bridge */ /* synthetic */ String q() {
        return super.q();
    }

    public c(SessionFragment sessionFragment, SessionParams sessionParams) {
        super(sessionFragment, sessionParams);
        Object[] objArr = {sessionFragment, sessionParams};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c370684e66341f5a1c389249e435aa0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c370684e66341f5a1c389249e435aa0d");
        } else {
            this.b = false;
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a
    public final long i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c900663cd4cb9f508fd912ed416132f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c900663cd4cb9f508fd912ed416132f")).longValue();
        }
        if (this.m == null || com.sankuai.waimai.foundation.utils.b.b(this.m.remindConf) || this.m.remindConf.get(0).a <= 0) {
            return 2147483647L;
        }
        return this.m.remindConf.get(0).a * 1000;
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public void A() {
        byte[] a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e9fce9bf8260b1f489ea4a66cc2f3f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e9fce9bf8260b1f489ea4a66cc2f3f9");
        } else if (this.m == null || com.sankuai.waimai.foundation.utils.b.b(this.m.remindConf) || TextUtils.isEmpty(this.m.remindConf.get(0).b) || (a = new o(this.m.remindConf.get(0).b).a(4)) == null) {
        } else {
            a((IMMessage) com.sankuai.xm.imui.common.util.c.a(a), true);
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void a() {
        c cVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df4dfd7f146027c0bd0bf046a59ba2a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df4dfd7f146027c0bd0bf046a59ba2a1");
            return;
        }
        super.a();
        User b = com.sankuai.waimai.platform.domain.manager.user.a.i().b();
        if (this.d == null || b == null) {
            a(this.e, this.e.getApplicationContext().getString(R.string.wm_im_get_param_failed));
            this.e.finish();
            return;
        }
        this.j = b.username;
        this.k = b.avatarurl;
        Bundle bundle = this.d.u;
        this.l = bundle.getLong("param_poi_order_id");
        this.m = (PoiImInfo) com.sankuai.waimai.platform.utils.f.a(bundle, "param_poi_im_info");
        this.n = bundle.getLong("param_poi_poi_id");
        this.o = bundle.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
        this.p = bundle.getInt("show_emotion", 0);
        this.q = bundle.getInt("ref", 0);
        a(this.d);
        this.s = this.m.usePrivacy == 1;
        this.t = TextUtils.isEmpty(this.m.getBookPhone()) ? this.m.getRecipientPhone() : this.m.getBookPhone();
        PoiImInfo.e eVar = this.m.spuInfo;
        if (eVar == null || eVar.g <= 0 || this.m.poiImStatus == 6) {
            cVar = this;
        } else {
            String str = eVar.b;
            String str2 = eVar.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = PoiImInfo.e.a;
            double doubleValue = PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "4766eaae08109c1560fabf2dd8801e9c", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "4766eaae08109c1560fabf2dd8801e9c")).doubleValue() : com.sankuai.waimai.imbase.utils.g.d(com.sankuai.waimai.foundation.utils.h.a(eVar.d));
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = PoiImInfo.e.a;
            byte[] a = new com.sankuai.waimai.business.im.model.d(str, str2, doubleValue, PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "7ee1a3118154ee5e820756907cdf3eeb", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "7ee1a3118154ee5e820756907cdf3eeb")).doubleValue() : com.sankuai.waimai.imbase.utils.g.d(com.sankuai.waimai.foundation.utils.h.a(eVar.e)), eVar.f, eVar.g).a(1);
            if (a != null) {
                GeneralMessage a2 = com.sankuai.xm.imui.common.util.c.a(a, 0, "[商品]" + eVar.c);
                cVar = this;
                cVar.r = a2;
            } else {
                cVar = this;
            }
        }
        com.sankuai.waimai.imbase.manager.b.a().f();
        com.sankuai.waimai.imbase.utils.e.a().a(new Runnable() { // from class: com.sankuai.waimai.business.im.prepare.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5bedbac5da65d1955a502b732d436c10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5bedbac5da65d1955a502b732d436c10");
                } else {
                    com.sankuai.waimai.business.im.utils.b.a();
                }
            }
        });
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a66b08a05780ee2530c4fe2dc3fc6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a66b08a05780ee2530c4fe2dc3fc6b");
        } else {
            aVar.a("poi_id", com.sankuai.waimai.business.im.utils.a.a(this.n, this.o));
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ce83eb5e219220e2e8a46dcc7d996e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ce83eb5e219220e2e8a46dcc7d996e5");
            return;
        }
        super.b();
        if (this.m != null && this.m.inputFieldStatus == 3) {
            ISendPanelAdapter sendPanelAdapter = this.f.v.getSendPanelAdapter();
            if (sendPanelAdapter instanceof DefaultSendPanelAdapter) {
                ((DefaultSendPanelAdapter) sendPanelAdapter).a(true, this.m.inputFieldMsg);
            }
        }
        D();
        if (this.r == null || this.b) {
            return;
        }
        a((IMMessage) this.r, true);
        this.b = true;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1907db25bfe759fc61fea6d1071ee97d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1907db25bfe759fc61fea6d1071ee97d");
        } else {
            b(iMMessage);
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void a(int i2, IMMessage iMMessage) {
        Object[] objArr = {Integer.valueOf(i2), iMMessage};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd8eef71fb32362fb3e87a02cd28aa22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd8eef71fb32362fb3e87a02cd28aa22");
            return;
        }
        super.a(i2, iMMessage);
        a(i2 == 0, iMMessage.getMsgType());
        if (i2 == 10007) {
            com.sankuai.waimai.imbase.manager.b.a().a(this.e);
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.common.contract.a
    public void b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e10c1d7692b6b08d60ceaf5fa34a7028", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e10c1d7692b6b08d60ceaf5fa34a7028");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", String.valueOf(this.l));
        hashMap.put("c_name", this.j);
        hashMap.put("c_avatar_url", this.k);
        hashMap.put("poi_id", String.valueOf(this.n));
        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.o);
        hashMap.put(AgainManager.EXTRA_POI_NAME, this.m.poiName);
        hashMap.put("poi_logo_url", this.m.poiPicUrl);
        hashMap.put("poiType", Integer.valueOf(u()));
        hashMap.put("version", com.sankuai.waimai.platform.b.A().i());
        hashMap.put("source", "Android");
        hashMap.put("ref", Integer.valueOf(this.q));
        com.sankuai.waimai.business.im.utils.b.a(hashMap);
        com.sankuai.waimai.business.im.utils.b.a(iMMessage, hashMap);
        iMMessage.appendExtension(hashMap);
    }

    public final void a(IMMessage iMMessage, boolean z) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "428f8a155bc393dbff51ee3e9556760c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "428f8a155bc393dbff51ee3e9556760c");
        } else if (iMMessage == null) {
        } else {
            b(iMMessage);
            com.sankuai.waimai.imbase.utils.f.a(iMMessage, z);
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public ICommonAdapter w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f6153f51143be2258ff68d229c9c625", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f6153f51143be2258ff68d229c9c625");
        }
        final ICommonAdapter w = super.w();
        return new IMCommonAdapterWrapper(w) { // from class: com.sankuai.waimai.business.im.prepare.BasePoiChatPageDelegate$2
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
            public void onAvatarClick(View view, com.sankuai.xm.imui.session.entity.b bVar) {
                Object[] objArr2 = {view, bVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a67d82a709248c5e8b34c5123c8b3685", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a67d82a709248c5e8b34c5123c8b3685");
                } else if (bVar.g == 1) {
                    c.this.a(c.this.e, c.this.n, c.this.o, c.this.m);
                }
            }
        };
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public final com.sankuai.waimai.business.im.common.plugin.smartreply.d z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5e82069e034546ea5d590bc414155bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.im.common.plugin.smartreply.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5e82069e034546ea5d590bc414155bf");
        }
        com.sankuai.waimai.business.im.common.plugin.smartreply.d dVar = new com.sankuai.waimai.business.im.common.plugin.smartreply.d();
        dVar.e = 2;
        dVar.a = this.m.inputFieldStatus == 1;
        dVar.b = this.m.inputFieldStatus == 0;
        dVar.c = this.m.defaultMsgArray;
        dVar.d = this.m.customPhrases;
        dVar.h = this.m.customReplyHint;
        dVar.f = this.m.maxCustomMsgNumber;
        return dVar;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab41a1ad442ab056a1195f4233cb464", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab41a1ad442ab056a1195f4233cb464") : String.valueOf(this.n);
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public String s() {
        return this.o;
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public final void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eeed0d00081fb9495beed879df85c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eeed0d00081fb9495beed879df85c64");
        } else if (this.m != null) {
            a(this.e, TextUtils.isEmpty(this.m.getPoiPhone()) ? null : this.m.getPoiPhone().split("/"), 2);
        }
    }

    private void a(final Context context, final String[] strArr, final int i2) {
        Object[] objArr = {context, strArr, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "557c6ebd623b6bcff8590e91421aaff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "557c6ebd623b6bcff8590e91421aaff7");
            return;
        }
        if (i2 == 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", com.sankuai.waimai.business.im.utils.a.a(this.n, this.o));
            JudasManualManager.a(com.sankuai.waimai.business.im.utils.d.j).a(com.sankuai.waimai.business.im.utils.d.a).a((Map<String, Object>) hashMap).a();
        }
        if (context != null) {
            if (!ac.a(context)) {
                ae.a(context, (int) R.string.wm_im_your_phone_can_not_be_connected);
            } else if (strArr == null || strArr.length == 0) {
                ae.a(context, (int) R.string.wm_im_no_available_phone_num);
            } else if (this.s && this.l > 0) {
                ArrayList<String> arrayList = new ArrayList<>();
                for (String str : strArr) {
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
                com.sankuai.waimai.platform.widget.dial.injection.a.a(context).a(String.valueOf(this.l), arrayList, this.t, 1);
            } else {
                new CustomDialog.a(context).c(R.string.wm_im_dial_phone_num).a(strArr, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.im.prepare.c.2
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39709be2279d475716dbcaee56bdda4f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39709be2279d475716dbcaee56bdda4f");
                            return;
                        }
                        if (i2 == 1) {
                            HashMap hashMap2 = new HashMap();
                            c cVar = c.this;
                            hashMap2.put("receive_user_type", Integer.valueOf(com.sankuai.waimai.business.im.utils.c.a(2)));
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("custom", hashMap2);
                            JudasManualManager.a("b_waimai_m3wl69qu_mc").a((Map<String, Object>) hashMap3).a("c_waimai_wgiu7lrd").a();
                        }
                        z.a(context, strArr[i3]);
                    }
                }).b(R.string.wm_im_cancel, (DialogInterface.OnClickListener) null).c();
            }
        }
    }

    public final void E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d5ed2bc78d3668ce197cadf760b561f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d5ed2bc78d3668ce197cadf760b561f");
        } else {
            JudasManualManager.a(com.sankuai.waimai.business.im.utils.d.k).a(com.sankuai.waimai.business.im.utils.d.a).a();
        }
    }

    public final void F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca32204e5aee480d83178cba1f70a4ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca32204e5aee480d83178cba1f70a4ac");
        } else if (this.m != null) {
            a(this.e, TextUtils.isEmpty(this.m.getPoiPhone()) ? null : this.m.getPoiPhone().split("/"), 1);
        }
    }
}
