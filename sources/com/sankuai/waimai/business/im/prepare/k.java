package com.sankuai.waimai.business.im.prepare;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter;
import com.sankuai.waimai.business.im.common.adapter.WmImCommonAdapter;
import com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k extends BaseRiderChatPageDelegate implements com.sankuai.waimai.business.order.api.submit.a {
    public static ChangeQuickRedirect n;
    private String o;

    @Override // com.sankuai.waimai.business.im.prepare.a
    @Nullable
    public final /* bridge */ /* synthetic */ String C() {
        return super.C();
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return super.a(layoutInflater, viewGroup);
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ Map a(String str, com.sankuai.xm.imui.session.entity.b bVar) {
        return super.a(str, bVar);
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ void a(int i, IMMessage iMMessage) {
        super.a(i, iMMessage);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ void a(int i, String str, List list, int i2, boolean z) {
        super.a(i, str, list, i2, z);
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ void a(long j) {
        super.a(j);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void a(com.sankuai.waimai.business.im.delegate.a aVar) {
        super.a(aVar);
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate
    public final /* bridge */ /* synthetic */ void a(WmBaseGroupChatFragment.a aVar) {
        super.a(aVar);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void a(com.sankuai.waimai.business.im.group.model.i iVar) {
        super.a(iVar);
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ void a(d.a aVar) {
        super.a(aVar);
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ void a(IMMessage iMMessage) {
        super.a(iMMessage);
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void a(com.sankuai.xm.imui.session.entity.b bVar, Map map) {
        super.a(bVar, map);
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.order.api.submit.a
    public final /* bridge */ /* synthetic */ void a(String str, Uri uri) {
        super.a(str, uri);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.xm.im.IMClient.i
    public final /* bridge */ /* synthetic */ void a(List list, boolean z) {
        super.a(list, z);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        return super.a(bVar);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ void a_(long j) {
        super.a_(j);
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void ah_() {
        super.ah_();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void ai_() {
        super.ai_();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void aj_() {
        super.aj_();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ Map ak_() {
        return super.ak_();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ void al_() {
        super.al_();
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void b(long j) {
        super.b(j);
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void b(IMMessage iMMessage) {
        super.b(iMMessage);
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
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

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ ISendPanelAdapter bq_() {
        return super.bq_();
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ void bs_() {
        super.bs_();
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
    public final /* bridge */ /* synthetic */ Map h() {
        return super.h();
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.chatpage.a
    public final /* bridge */ /* synthetic */ long i() {
        return super.i();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ WMCommonDataInfo j() {
        return super.j();
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ void o() {
        super.o();
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.common.contract.a
    public final /* bridge */ /* synthetic */ int p() {
        return super.p();
    }

    @Override // com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final /* bridge */ /* synthetic */ String q() {
        return super.q();
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final /* bridge */ /* synthetic */ String r() {
        return super.r();
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final /* bridge */ /* synthetic */ String s() {
        return super.s();
    }

    public k(SessionFragment sessionFragment, SessionParams sessionParams) {
        super(sessionFragment, sessionParams);
        Object[] objArr = {sessionFragment, sessionParams};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "338d12e9e6985e28dc7488c45aa553af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "338d12e9e6985e28dc7488c45aa553af");
        } else {
            com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-im");
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.prepare.a, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32027ab6a6d10af910ec6ce1f5cac943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32027ab6a6d10af910ec6ce1f5cac943");
            return;
        }
        super.a();
        this.o = getClass().getSimpleName() + System.currentTimeMillis();
        if (this.d == null) {
            a(this.e, this.e.getString(R.string.wm_im_get_param_failed));
            this.e.finish();
            return;
        }
        a(this.d.u);
        com.sankuai.waimai.imbase.manager.b.a().f();
        HashMap hashMap = new HashMap(2);
        hashMap.put("__ffpdp", "001");
        hashMap.put("wm_im_type", String.valueOf(com.sankuai.waimai.business.im.utils.c.a(1)));
        com.sankuai.waimai.business.im.utils.c.a(hashMap);
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final TitleBarAdapter g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "746c999b5e59680e5bedd5fa4b4ca35a", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "746c999b5e59680e5bedd5fa4b4ca35a");
        }
        WMIMTitleBarAdapter wMIMTitleBarAdapter = (WMIMTitleBarAdapter) super.g();
        wMIMTitleBarAdapter.o = new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.prepare.k.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7066f0883d05bd5a4778fe8e87c91214", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7066f0883d05bd5a4778fe8e87c91214");
                    return;
                }
                if (k.this.e != null) {
                    k.this.e.finish();
                }
                if (!k.this.m || k.this.j == 6) {
                    return;
                }
                com.sankuai.waimai.imbase.b.d().a(k.this.e);
            }
        };
        return wMIMTitleBarAdapter;
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate
    public final void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4312d8da4a8b11ccdbcef3fd19de3389", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4312d8da4a8b11ccdbcef3fd19de3389");
        } else {
            com.sankuai.waimai.business.im.api.a.a().a(this.e, (SessionId) null, j, this.o, this.j, this.k.riderDxId, this.m, true);
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.BaseRiderChatPageDelegate, com.sankuai.waimai.business.im.prepare.a
    public final ICommonAdapter w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "935cd987ad8ab4f85fd6de91c2ce70f9", RobustBitConfig.DEFAULT_VALUE) ? (ICommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "935cd987ad8ab4f85fd6de91c2ce70f9") : new WmImCommonAdapter(super.w());
    }
}
