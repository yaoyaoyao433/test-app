package com.sankuai.waimai.business.im.prepare;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.chatpage.BaseChatFragment;
import com.sankuai.waimai.business.im.common.adapter.IMAudioMsgAdapter;
import com.sankuai.waimai.business.im.common.adapter.IMCommonAdapter;
import com.sankuai.waimai.business.im.common.adapter.IMImageMsgAdapter;
import com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter;
import com.sankuai.waimai.business.im.common.message.IMMessageAdapter;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.c;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a extends com.sankuai.waimai.business.im.chatpage.a implements com.sankuai.waimai.business.im.common.contract.a, IMClient.i {
    public static ChangeQuickRedirect c;
    private boolean b;
    protected SessionParams d;
    public Activity e;
    public SessionFragment f;
    protected boolean g;
    protected WMCommonDataInfo h;
    private volatile Map<String, Object> i;
    private volatile Map<String, Object> j;
    private com.sankuai.waimai.business.im.common.presenter.a k;
    private com.sankuai.waimai.business.im.delegate.b l;
    private Bundle m;
    private SessionId n;
    private volatile boolean o;
    private volatile boolean p;
    private boolean q;
    private boolean r;
    private Dialog s;
    private g t;
    private com.sankuai.waimai.business.im.common.utils.c u;

    public abstract void A();

    @Nullable
    public String C() {
        return null;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void a(com.sankuai.waimai.business.im.group.model.i iVar) {
    }

    public void a(com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void b(long j) {
    }

    public void b(com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void b(Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void b(boolean z) {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void b_(Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void o() {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public String q() {
        return null;
    }

    public abstract String t();

    public abstract void x();

    public abstract int y();

    @Nullable
    public com.sankuai.waimai.business.im.common.plugin.smartreply.d z() {
        return null;
    }

    public static /* synthetic */ boolean b(a aVar, IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "c014a8ce54eac8ea38cde6d5210317a9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "c014a8ce54eac8ea38cde6d5210317a9")).booleanValue() : System.currentTimeMillis() - iMMessage.getCts() > aVar.i();
    }

    public a(SessionFragment sessionFragment, SessionParams sessionParams) {
        Object[] objArr = {sessionFragment, sessionParams};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb7a807645a9846244cee13fc40d0921", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb7a807645a9846244cee13fc40d0921");
            return;
        }
        this.b = false;
        this.g = false;
        this.i = new HashMap();
        this.j = new HashMap();
        this.n = null;
        this.t = new g() { // from class: com.sankuai.waimai.business.im.prepare.a.2
        };
        this.u = null;
        this.e = sessionFragment.getActivity();
        this.f = sessionFragment;
        this.d = sessionParams;
        this.m = sessionFragment.getArguments();
        this.n = (SessionId) this.m.getParcelable("SessionId");
        this.l = new com.sankuai.waimai.business.im.delegate.b();
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2ecb2ad3b77fda08a2000a85c8e1f44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2ecb2ad3b77fda08a2000a85c8e1f44");
            return;
        }
        super.a();
        com.sankuai.waimai.platform.utils.g.a(this.e);
        IMClient.a().a((short) 1001, (IMClient.i) this);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1d34ab0c1adabcf5201bdcc0879ea18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1d34ab0c1adabcf5201bdcc0879ea18");
            return;
        }
        this.b = true;
        bp_();
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04c304e929e6e209ada35ddeffa76ba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04c304e929e6e209ada35ddeffa76ba1");
            return;
        }
        super.k();
        IMClient.a().b((short) 1001, (IMClient.i) this);
        if (this.k != null) {
            this.k.b();
        }
    }

    public void bp_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33e6bb85c16bc4053de88354baafc8a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33e6bb85c16bc4053de88354baafc8a4");
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a(((BaseChatFragment) this.f).b, new IMClient.g<com.sankuai.xm.im.session.entry.a>() { // from class: com.sankuai.waimai.business.im.prepare.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.g
                public final /* synthetic */ void a(com.sankuai.xm.im.session.entry.a aVar) {
                    IMMessage iMMessage;
                    com.sankuai.xm.im.session.entry.a aVar2 = aVar;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efb5854a31286821ae7252c43e5c96c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efb5854a31286821ae7252c43e5c96c0");
                    } else if (aVar2 == null || (iMMessage = aVar2.b) == null || a.this.c(iMMessage)) {
                    } else {
                        if (a.b(a.this, iMMessage)) {
                            a.this.am_();
                        } else {
                            a.this.a_(a.this.i() - (System.currentTimeMillis() - iMMessage.getCts()));
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(@NonNull IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66a7c29f00610f7df6ecb3d4fb6d6423", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66a7c29f00610f7df6ecb3d4fb6d6423")).booleanValue() : iMMessage.getFromUid() != IMUIManager.a().e();
    }

    private boolean d(@NonNull IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ba32788ff68d333bebf53d1bb93489e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ba32788ff68d333bebf53d1bb93489e")).booleanValue();
        }
        try {
            return iMMessage.getChatId() == com.sankuai.xm.imui.b.a().f().b;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return false;
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public boolean d() {
        return this.b;
    }

    public final void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd630fda307b72ab9bc5d7732b1fbb8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd630fda307b72ab9bc5d7732b1fbb8e");
        } else {
            ae.a(activity, str);
        }
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "520ac0eef6fabf462e5b99b075177f33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "520ac0eef6fabf462e5b99b075177f33");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            EventMessage b = com.sankuai.xm.imui.common.util.c.b(str);
            b(b);
            com.sankuai.waimai.imbase.utils.f.b(b, true);
        }
    }

    public ICommonAdapter w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a158857434a613a2075fbf8fca48fc", RobustBitConfig.DEFAULT_VALUE) ? (ICommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a158857434a613a2075fbf8fca48fc") : new IMCommonAdapter();
    }

    public IExtraAdapter a(int i, g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27c87eadc27a89bced0f7758698128b", RobustBitConfig.DEFAULT_VALUE)) {
            return (IExtraAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27c87eadc27a89bced0f7758698128b");
        }
        if (i == 16) {
            return new IMMessageAdapter(gVar);
        }
        if (i == 1) {
            return new IMAudioMsgAdapter();
        }
        if (i == 3) {
            return new IMImageMsgAdapter();
        }
        return null;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public final IMsgViewAdapter e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f8634675ea177cda37062b62ef71242", RobustBitConfig.DEFAULT_VALUE) ? (IMsgViewAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f8634675ea177cda37062b62ef71242") : new MsgViewAdapter() { // from class: com.sankuai.waimai.business.im.prepare.BaseChatPageDelegate$2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
            public ICommonAdapter getCommonAdapter() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ece21abb01ebc8082ad24d122424008", RobustBitConfig.DEFAULT_VALUE) ? (ICommonAdapter) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ece21abb01ebc8082ad24d122424008") : a.this.w();
            }

            @Override // com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
            public IExtraAdapter getExtraAdapter(int i) {
                g gVar;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92d74ecf8fcaf9ba222fb54f96557134", RobustBitConfig.DEFAULT_VALUE)) {
                    return (IExtraAdapter) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92d74ecf8fcaf9ba222fb54f96557134");
                }
                a aVar = a.this;
                gVar = aVar.t;
                IExtraAdapter a2 = aVar.a(i, gVar);
                return a2 != null ? a2 : super.getExtraAdapter(i);
            }
        };
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public ISendPanelAdapter bq_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e37a3efc6f253f4a94ef462523575c85", RobustBitConfig.DEFAULT_VALUE)) {
            return (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e37a3efc6f253f4a94ef462523575c85");
        }
        try {
            this.h = (WMCommonDataInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(t(), (Class<Object>) WMCommonDataInfo.class);
            if (this.h != null && this.h.a) {
                String str = this.h.b;
                this.h.c = (List) com.sankuai.waimai.mach.utils.b.a().fromJson(str, new TypeToken<List<WMCommonDataInfo.IMDynamicCard>>() { // from class: com.sankuai.waimai.business.im.prepare.a.3
                }.getType());
                this.k = new com.sankuai.waimai.business.im.common.presenter.a(this.n, this.e, this.h, this);
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return new IMSendPanelAdapter(z());
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void a(int i, IMMessage iMMessage) {
        if (i == 0) {
            this.g = false;
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a
    public final void am_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e77f772023ae9bc92dcfaf7bf6500989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e77f772023ae9bc92dcfaf7bf6500989");
        } else if (this.g) {
        } else {
            this.g = true;
            A();
        }
    }

    public final void a(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fafc98d2fa1a515d5d9952c9062597c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fafc98d2fa1a515d5d9952c9062597c9");
            return;
        }
        String str = "";
        if (i == 2) {
            str = com.sankuai.waimai.business.im.utils.d.f;
        } else if (i == 4) {
            str = com.sankuai.waimai.business.im.utils.d.e;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d.a aVar = new d.a();
        aVar.a("receive_user_type", Integer.valueOf(com.sankuai.waimai.business.im.utils.c.a(y()))).a("msg_send_result", Integer.valueOf(z ? 1 : 0));
        JudasManualManager.a(str).a(aVar.a()).a(com.sankuai.waimai.business.im.utils.d.a).a();
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void a_(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27003b69ee2b9d06b9c1f129961df25e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27003b69ee2b9d06b9c1f129961df25e");
            return;
        }
        if (j <= 0) {
            j = i();
        }
        if (this.u == null) {
            this.u = new com.sankuai.waimai.business.im.common.utils.c(j) { // from class: com.sankuai.waimai.business.im.prepare.a.4
                public static ChangeQuickRedirect d;

                @Override // com.sankuai.waimai.business.im.common.utils.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = d;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2824f2958db5190e76d6d24a888c34e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2824f2958db5190e76d6d24a888c34e6");
                    } else {
                        a.this.am_();
                    }
                }
            };
        } else {
            this.u.a(j);
            this.u.cancel();
        }
        this.u.a();
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void al_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4e31f6c54b65cb1cfa70927d5f64403", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4e31f6c54b65cb1cfa70927d5f64403");
        } else if (this.u != null) {
            this.u.cancel();
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb8aae94dbef0def1b1de52942e2272f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb8aae94dbef0def1b1de52942e2272f")).booleanValue();
        }
        if (this.k != null && bVar != null && bVar.b != 0 && bVar.b.getMsgType() == 17) {
            this.k.a(bVar.b);
        }
        return super.a(bVar);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void a(int i, String str, List<com.sankuai.xm.imui.session.entity.b> list, int i2, boolean z) {
        c.a aVar;
        View B;
        Object[] objArr = {Integer.valueOf(i), str, list, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4c7c192ec30b95a700f5e5a7793a492", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4c7c192ec30b95a700f5e5a7793a492");
            return;
        }
        if (this.h != null && this.h.a) {
            if (i2 == 1 && (B = B()) != null) {
                B.setVisibility(0);
            }
            if ((i2 == 1 || i2 == 2 || i2 == 4) && (aVar = this.f.u) != null) {
                int c2 = com.sankuai.waimai.foundation.utils.b.c(aVar.c());
                if (this.k != null && this.k.a(c2)) {
                    this.k.a();
                }
            }
        }
        super.a(i, str, list, i2, z);
    }

    @Override // com.sankuai.xm.im.IMClient.i
    public void a(List<IMMessage> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35f70ee0c1a1927a398a605f3c333639", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35f70ee0c1a1927a398a605f3c333639");
            return;
        }
        for (IMMessage iMMessage : list) {
            if (iMMessage != null && d(iMMessage) && c(iMMessage)) {
                al_();
            }
        }
        if (!com.sankuai.waimai.foundation.utils.b.a(list) || this.k == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (IMMessage iMMessage2 : list) {
            if (iMMessage2 != null && iMMessage2.getMsgType() == 17 && this.n != null && iMMessage2.getChatId() == this.n.b) {
                arrayList.add(iMMessage2);
            }
        }
        this.k.a(arrayList);
    }

    public View B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0f743da629afc74260dc3f06d3cb23f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0f743da629afc74260dc3f06d3cb23f");
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

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void a(com.sankuai.waimai.business.im.delegate.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "869bd50f3a603215c11981afdd4e32b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "869bd50f3a603215c11981afdd4e32b6");
        } else if (this.l != null) {
            this.l.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @NonNull
    public Map<String, Object> h() {
        return this.i;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public Map<String, Object> ak_() {
        return this.j;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public WMCommonDataInfo j() {
        return this.h;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void aj_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f1542d66957e1e82c83ddf66bac1866", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f1542d66957e1e82c83ddf66bac1866");
            return;
        }
        View B = B();
        if (this.f != null && B != null && !this.o) {
            this.f.A();
            this.f.y();
            this.o = true;
        }
        if (B != null) {
            B.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b286c6db0bbb489584a58339e1353878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b286c6db0bbb489584a58339e1353878");
            return;
        }
        View view = this.f.getView();
        if (view == null || !this.r) {
            return;
        }
        this.s = com.sankuai.waimai.platform.widget.dialog.a.a(this.e);
        view.setVisibility(4);
        this.r = false;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void ai_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b2448500a6e55776ddec653884440f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b2448500a6e55776ddec653884440f9");
            return;
        }
        View view = this.f.getView();
        if (view == null || !this.q) {
            return;
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.s);
        view.setVisibility(0);
        this.q = false;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void ah_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6962f47fdaca635bf02518c413d98d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6962f47fdaca635bf02518c413d98d");
        } else if (this.f == null || this.f.getHost() == null || this.p) {
        } else {
            this.f.y();
            this.p = true;
        }
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void c(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfa31a511f793e11ade1c420a7edcecb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfa31a511f793e11ade1c420a7edcecb");
        } else {
            x();
        }
    }
}
