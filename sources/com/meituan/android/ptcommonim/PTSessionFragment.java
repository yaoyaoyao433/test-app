package com.meituan.android.ptcommonim;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.ptcommonim.pageadapter.message.PTMsgViewAdapter;
import com.meituan.android.ptcommonim.pageadapter.sendpanel.PTSendPanelAdapter;
import com.meituan.android.ptcommonim.pageadapter.titlebar.PTTitleBarAdapter;
import com.meituan.android.ptcommonim.protocol.PTProtocolSessionFragment;
import com.meituan.android.ptcommonim.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.n;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTSessionFragment extends PTProtocolSessionFragment {
    public static ChangeQuickRedirect a;
    protected com.sankuai.xm.imui.session.b b;
    protected com.meituan.android.ptcommonim.model.b c;
    protected SessionId d;

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final /* synthetic */ TitleBarAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58ee44318fb2f2b3fe5cac44bb2be936", RobustBitConfig.DEFAULT_VALUE) ? (PTTitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58ee44318fb2f2b3fe5cac44bb2be936") : e();
    }

    public PTSessionFragment() {
        n.a();
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final IMsgViewAdapter d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ccf855d9be1084bc70339c419dafa0", RobustBitConfig.DEFAULT_VALUE) ? (IMsgViewAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ccf855d9be1084bc70339c419dafa0") : f();
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final ISendPanelAdapter bo_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87ed988722c852cdd8fd80264457ef48", RobustBitConfig.DEFAULT_VALUE) ? (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87ed988722c852cdd8fd80264457ef48") : g();
    }

    @Override // com.meituan.android.ptcommonim.protocol.PTProtocolSessionFragment, com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fff71daae49921afcd13ef6ec91487e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fff71daae49921afcd13ef6ec91487e5");
            return;
        }
        super.onCreate(bundle);
        com.meituan.android.ptcommonim.base.util.a.a(getContext());
        a.a().a(getContext());
        this.b = com.sankuai.xm.imui.session.b.b(getContext());
        if (this.b != null) {
            this.d = this.b.a();
            if (this.d != null && this.h != null) {
                com.meituan.android.ptcommonim.cardrender.c.a().a(String.valueOf((int) this.d.d()), this.h.b);
            }
            this.c = new com.meituan.android.ptcommonim.model.b(this.d, this.h);
        }
    }

    @Override // com.meituan.android.ptcommonim.protocol.PTProtocolSessionFragment, com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6338d3285e94abab6584555cf3962683", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6338d3285e94abab6584555cf3962683") : super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Map] */
    @Override // com.meituan.android.ptcommonim.protocol.PTProtocolSessionFragment, com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onResume() {
        Map<String, Object> hashMap;
        com.meituan.android.ptcommonim.model.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1fd4b5652450ac810051cab638c54a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1fd4b5652450ac810051cab638c54a4");
            return;
        }
        super.onResume();
        Context context = getContext();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        HashMap hashMap2 = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3d8c4857dfdac3f9f9ae8c9550aa081f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3d8c4857dfdac3f9f9ae8c9550aa081f");
            return;
        }
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = f.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "596cb8995ef00a464e835b241aaf288e", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "596cb8995ef00a464e835b241aaf288e");
        } else {
            if (context != null) {
                SessionFragment a2 = com.sankuai.xm.imui.session.b.a(context);
                if ((a2 instanceof PTSessionFragment) && (bVar = ((PTSessionFragment) a2).c) != null) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.ptcommonim.model.b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "0b4515e2a68cc12d71468c5cb3830d65", RobustBitConfig.DEFAULT_VALUE)) {
                        hashMap2 = (Map) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "0b4515e2a68cc12d71468c5cb3830d65");
                    } else {
                        HashMap hashMap3 = new HashMap(4);
                        HashMap hashMap4 = new HashMap(16);
                        if (bVar.c != null) {
                            Map<String, Object> a3 = bVar.c.a(false);
                            hashMap3.putAll(a3);
                            hashMap4.putAll(a3);
                        }
                        hashMap4.put("channel_id", bVar.b != null ? Short.valueOf(bVar.b.d()) : "-999");
                        hashMap4.put("chat_type", bVar.a());
                        hashMap4.put("message_body_id", bVar.b != null ? Long.valueOf(bVar.b.b()) : "-999");
                        hashMap4.put("peer_uid", bVar.b != null ? Long.valueOf(bVar.b.c()) : "-999");
                        hashMap4.put(Message.SID, (bVar.b == null || TextUtils.isEmpty(bVar.b.g())) ? "-999" : bVar.b.g());
                        hashMap3.put("custom", hashMap4);
                        hashMap2 = hashMap3;
                    }
                }
            }
            hashMap = hashMap2 == null ? new HashMap<>() : hashMap2;
        }
        Statistics.getChannel("group").writePageView("pt_common_im_page", "c_group_hjkzttqg", hashMap);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.c.b
    public final boolean b(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abd38151c6b8cd112c1e0a63243db3f5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abd38151c6b8cd112c1e0a63243db3f5")).booleanValue() : super.b(bVar);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.c.b
    public final void b(int i, com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d3e8cbc6de59c9de933b3c626c0857", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d3e8cbc6de59c9de933b3c626c0857");
        } else {
            super.b(i, bVar);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.c.b
    public final void a(List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b9f7bcb1a3134a73d206eb4aeb4843d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b9f7bcb1a3134a73d206eb4aeb4843d");
        } else {
            super.a(list);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.c.b
    public final void b(List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc860c349410cc5657f8d30ee2e8e5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc860c349410cc5657f8d30ee2e8e5f");
        } else {
            super.b(list);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.c.b
    public final void a(int i, String str, List<com.sankuai.xm.imui.session.entity.b> list, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, list, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "575492814d2279014886c7cd7000a735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "575492814d2279014886c7cd7000a735");
        } else {
            super.a(i, str, list, i2, z);
        }
    }

    public PTTitleBarAdapter e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afa6d5fb257cf8109a90f709573ebea5", RobustBitConfig.DEFAULT_VALUE) ? (PTTitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afa6d5fb257cf8109a90f709573ebea5") : new PTTitleBarAdapter();
    }

    public PTMsgViewAdapter f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4413ffcbea75b654334c6f8b2fde46bd", RobustBitConfig.DEFAULT_VALUE) ? (PTMsgViewAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4413ffcbea75b654334c6f8b2fde46bd") : new PTMsgViewAdapter();
    }

    public PTSendPanelAdapter g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16e91199043c6091dcd4177ecd93abd4", RobustBitConfig.DEFAULT_VALUE) ? (PTSendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16e91199043c6091dcd4177ecd93abd4") : new PTSendPanelAdapter();
    }

    public final com.meituan.android.ptcommonim.model.b h() {
        return this.c;
    }

    public final SessionId i() {
        return this.d;
    }
}
