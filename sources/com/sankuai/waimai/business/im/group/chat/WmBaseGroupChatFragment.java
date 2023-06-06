package com.sankuai.waimai.business.im.group.chat;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment;
import com.sankuai.waimai.business.im.common.api.WmImCommonService;
import com.sankuai.waimai.business.im.common.message.IMMessageAdapter;
import com.sankuai.waimai.business.im.common.message.c;
import com.sankuai.waimai.business.im.common.rxbus.d;
import com.sankuai.waimai.business.im.group.View.WmGroupChatPhoneView;
import com.sankuai.waimai.business.im.group.adapter.WmBaseGroupBannerAdapter;
import com.sankuai.waimai.business.im.group.adapter.WmBaseGroupSendPanelAdapter;
import com.sankuai.waimai.business.im.group.adapter.WmGroupBannerAdapter;
import com.sankuai.waimai.business.im.group.adapter.WmGroupMsgViewAdapter;
import com.sankuai.waimai.business.im.group.adapter.WmGroupTitleBarAdapter;
import com.sankuai.waimai.business.im.group.api.WmImGroupService;
import com.sankuai.waimai.business.im.group.model.WmGroupShareData;
import com.sankuai.waimai.business.im.group.model.c;
import com.sankuai.waimai.business.im.model.RiderImInfo;
import com.sankuai.waimai.business.im.model.TipMessageData;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.model.g;
import com.sankuai.waimai.business.im.model.o;
import com.sankuai.waimai.business.im.prepare.g;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.xm.base.service.n;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.f;
import com.sankuai.xm.im.message.bean.CustomEmotionMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.base.BaseActivity;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.controller.group.b;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.MsgViewType;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class WmBaseGroupChatFragment extends BaseMachChatFragment implements c, IMClient.i, BaseActivity.a, b {
    public static ChangeQuickRedirect k = null;
    private static final String y = "com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment";
    private com.sankuai.waimai.business.im.group.controller.a A;
    private WmGroupChatPhoneView B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private int G;
    private WmGroupBannerAdapter H;
    private WmBaseGroupSendPanelAdapter I;
    private com.sankuai.xm.base.callback.c<com.sankuai.xm.imui.session.event.a> J;
    private com.sankuai.xm.imui.session.entity.b<GeneralMessage> K;
    private int L;
    private com.sankuai.waimai.business.im.common.utils.c M;
    protected WmGroupShareData l;
    private SessionParams m;
    private g z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(com.sankuai.waimai.business.im.common.model.b bVar);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment
    public final int e() {
        return 3;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final int p() {
        return 3;
    }

    public WmBaseGroupChatFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ac516c8a59c6f3b497d529b39d4283", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ac516c8a59c6f3b497d529b39d4283");
            return;
        }
        this.z = new g() { // from class: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.1
        };
        this.C = false;
        this.D = false;
        this.E = false;
        this.J = new com.sankuai.xm.base.callback.c<com.sankuai.xm.imui.session.event.a>() { // from class: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.c
            public final /* synthetic */ boolean a(com.sankuai.xm.imui.session.event.a aVar) {
                com.sankuai.xm.imui.session.event.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4785808dee2eb7ae2ace122c86b441c3", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4785808dee2eb7ae2ace122c86b441c3")).booleanValue();
                }
                if (aVar2 != null) {
                    WmBaseGroupChatFragment.a(WmBaseGroupChatFragment.this, WmBaseGroupChatFragment.this.getActivity(), aVar2.b, aVar2.c, aVar2.d);
                }
                return false;
            }
        };
        this.L = 0;
        this.M = null;
    }

    public static /* synthetic */ void a(WmBaseGroupChatFragment wmBaseGroupChatFragment, Activity activity, final int i, int i2, Intent intent) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, wmBaseGroupChatFragment, changeQuickRedirect, false, "b4d4c8ed04724546506a5dd9b800a5e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wmBaseGroupChatFragment, changeQuickRedirect, false, "b4d4c8ed04724546506a5dd9b800a5e4");
        } else {
            d.a(activity, i, i2, intent, String.valueOf(wmBaseGroupChatFragment.l.d), 2, new f<IMMessage>() { // from class: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.f
                public final /* synthetic */ void a(IMMessage iMMessage) {
                    IMMessage iMMessage2 = iMMessage;
                    Object[] objArr2 = {iMMessage2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14bde45e2f3b4d0f8660ab2a80e3d49f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14bde45e2f3b4d0f8660ab2a80e3d49f");
                    } else if (i == 117) {
                        WmBaseGroupChatFragment.a(WmBaseGroupChatFragment.this, true);
                        if (WmBaseGroupChatFragment.this.K != null) {
                            IMUIManager.a().a(WmBaseGroupChatFragment.this.K.b);
                        }
                    } else {
                        EventMessage b = com.sankuai.xm.imui.common.util.c.b("该地址仅作为聊天消息，是否可配送请与骑手沟通确认");
                        b.setCts(iMMessage2.getSts() + 1);
                        WmBaseGroupChatFragment.this.b((IMMessage) b);
                        com.sankuai.waimai.imbase.utils.f.b(b, false);
                    }
                }

                @Override // com.sankuai.xm.im.f
                public final void a(int i3, String str) {
                    Object[] objArr2 = {Integer.valueOf(i3), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2c58d180335413ca6777d0ff1d03873", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2c58d180335413ca6777d0ff1d03873");
                        return;
                    }
                    if ("FAIL".equals(str)) {
                        ae.a((Activity) WmBaseGroupChatFragment.this.getActivity(), WmBaseGroupChatFragment.this.l.e.d.r);
                    }
                    if (i == 117) {
                        WmBaseGroupChatFragment.a(WmBaseGroupChatFragment.this, false);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment r12, java.util.List r13) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.k
            java.lang.String r11 = "a18215b4987b13cfed7b7f0e7a5c0944"
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
            int r1 = r12.L
            if (r1 > 0) goto L8e
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
            if (r1 == 0) goto L8e
            java.lang.String r13 = r1.d
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L8e
            com.google.gson.Gson r13 = com.sankuai.waimai.mach.utils.b.a()
            java.lang.String r1 = r1.d
            java.lang.Class<com.sankuai.waimai.business.im.model.f> r2 = com.sankuai.waimai.business.im.model.f.class
            java.lang.Object r13 = r13.fromJson(r1, r2)
            com.sankuai.waimai.business.im.model.f r13 = (com.sankuai.waimai.business.im.model.f) r13
            r1 = 4001(0xfa1, float:5.607E-42)
            byte[] r1 = r13.a(r1)
            if (r1 == 0) goto L8e
            java.lang.String r2 = ""
            com.sankuai.xm.im.message.bean.GeneralMessage r1 = com.sankuai.xm.imui.common.util.c.a(r1, r9, r2)
            r12.a(r1, r9)
            r12.y()
            r12.L = r0
            android.support.v4.app.FragmentActivity r1 = r12.getActivity()
            java.lang.String r2 = "_modify_address_"
            com.sankuai.waimai.business.im.common.utils.d.a(r1, r2, r0)
            java.lang.String r0 = "b_waimai_pdkctt2p_mv"
            java.lang.String r1 = com.sankuai.waimai.business.im.utils.d.a
            android.support.v4.app.FragmentActivity r12 = r12.getActivity()
            java.lang.String r12 = com.meituan.android.common.statistics.utils.AppUtil.generatePageInfoKey(r12)
            com.sankuai.waimai.log.judas.JudasManualManager$a r12 = com.sankuai.waimai.log.judas.JudasManualManager.b(r0, r1, r12)
            java.lang.String r0 = "receive_user_type"
            int r13 = r13.f
            com.sankuai.waimai.log.judas.JudasManualManager$a r12 = r12.a(r0, r13)
            r12.a()
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.a(com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment, java.util.List):void");
    }

    public static /* synthetic */ void a(WmBaseGroupChatFragment wmBaseGroupChatFragment, boolean z) {
        int size;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, wmBaseGroupChatFragment, changeQuickRedirect, false, "70fb94edf79133908f250fffe2049669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wmBaseGroupChatFragment, changeQuickRedirect, false, "70fb94edf79133908f250fffe2049669");
        } else if (!z || wmBaseGroupChatFragment.l == null || wmBaseGroupChatFragment.l.e == null || (size = wmBaseGroupChatFragment.l.e.d.w.size()) <= 0) {
        } else {
            wmBaseGroupChatFragment.l.e.d.w.remove(size - 1);
            wmBaseGroupChatFragment.I.c();
        }
    }

    public static /* synthetic */ boolean b(WmBaseGroupChatFragment wmBaseGroupChatFragment, IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, wmBaseGroupChatFragment, changeQuickRedirect, false, "7864b42789ffd107a0f405004bb5f5d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, wmBaseGroupChatFragment, changeQuickRedirect, false, "7864b42789ffd107a0f405004bb5f5d6")).booleanValue() : System.currentTimeMillis() - iMMessage.getCts() > ((long) wmBaseGroupChatFragment.C());
    }

    public static /* synthetic */ void c(WmBaseGroupChatFragment wmBaseGroupChatFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, wmBaseGroupChatFragment, changeQuickRedirect, false, "ed4e209ec3998f81deb0b33e1734e559", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wmBaseGroupChatFragment, changeQuickRedirect, false, "ed4e209ec3998f81deb0b33e1734e559");
        } else if (wmBaseGroupChatFragment.l == null) {
            ae.a((Activity) wmBaseGroupChatFragment.getActivity(), wmBaseGroupChatFragment.getActivity().getResources().getString(R.string.wm_im_can_not_modify_address));
        } else {
            com.sankuai.waimai.business.im.group.model.c cVar = wmBaseGroupChatFragment.l.e;
            if (cVar == null || cVar.c == null || cVar.d == null || cVar.a == null) {
                ae.a((Activity) wmBaseGroupChatFragment.getActivity(), wmBaseGroupChatFragment.getActivity().getResources().getString(R.string.wm_im_can_not_modify_address));
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("orderViewId", String.valueOf(wmBaseGroupChatFragment.l.d));
            hashMap.put("wmPoiId", wmBaseGroupChatFragment.r());
            hashMap.put("userName", cVar.c.c);
            hashMap.put("userPhone", cVar.c.a);
            hashMap.put("userLatitude", Long.valueOf(cVar.c.f));
            hashMap.put("userLongitude", Long.valueOf(cVar.c.e));
            hashMap.put("poiIDStr", cVar.a.g);
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.d.v);
            hashMap.put("isReversoAOI", sb.toString());
            hashMap.put("userType", "2");
            d.b(wmBaseGroupChatFragment.getActivity(), hashMap);
        }
    }

    public static /* synthetic */ void d(WmBaseGroupChatFragment wmBaseGroupChatFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, wmBaseGroupChatFragment, changeQuickRedirect, false, "00639402c3fd3f4a5f213c88490284a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wmBaseGroupChatFragment, changeQuickRedirect, false, "00639402c3fd3f4a5f213c88490284a8");
        } else if (wmBaseGroupChatFragment.C || wmBaseGroupChatFragment.l.e == null || wmBaseGroupChatFragment.l.e.d == null || TextUtils.isEmpty(wmBaseGroupChatFragment.l.e.d.e)) {
        } else {
            wmBaseGroupChatFragment.C = true;
            byte[] a2 = new o(wmBaseGroupChatFragment.l.e.d.e).a(4);
            if (a2 != null) {
                wmBaseGroupChatFragment.a(com.sankuai.xm.imui.common.util.c.a(a2), true);
            }
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final IMsgViewAdapter d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d34ca6173e6b5edfca7979869a4b0b78", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMsgViewAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d34ca6173e6b5edfca7979869a4b0b78");
        }
        if (this.b != null && this.b.a) {
            try {
                this.b.c = (List) com.sankuai.waimai.mach.utils.b.a().fromJson(this.b.b, new TypeToken<List<WMCommonDataInfo.IMDynamicCard>>() { // from class: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.6
                }.getType());
                this.c = new com.sankuai.waimai.business.im.common.presenter.a(this.e, getActivity(), this.b, this);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        return new WmGroupMsgViewAdapter(this.z, this.b, this, this.l.e.d.s != null);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final ISendPanelAdapter bo_() {
        com.sankuai.waimai.business.im.common.plugin.smartreply.d dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4230b515a4521a8a553542de7cb1388e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4230b515a4521a8a553542de7cb1388e");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce74f2b92ee794493e92731014101588", RobustBitConfig.DEFAULT_VALUE)) {
            dVar = (com.sankuai.waimai.business.im.common.plugin.smartreply.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce74f2b92ee794493e92731014101588");
        } else if (this.l == null) {
            dVar = null;
        } else {
            dVar = new com.sankuai.waimai.business.im.common.plugin.smartreply.d();
            dVar.e = 3;
            com.sankuai.waimai.business.im.group.model.c cVar = this.l.e;
            if (cVar.d != null) {
                c.a aVar = cVar.d;
                dVar.a = aVar.h == 1;
                dVar.b = aVar.h == 0;
                dVar.c = aVar.g;
                dVar.d = aVar.p;
                dVar.h = aVar.i;
                dVar.f = aVar.j;
            }
        }
        this.I = new WmBaseGroupSendPanelAdapter(dVar, this.l.e.d.s, this.G, this.l.e.d.w, this.l.e.d.u == 1, this.l.d, new com.sankuai.waimai.business.im.callback.a() { // from class: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.im.callback.a
            public final void a(List<g.a> list) {
                Object[] objArr3 = {list};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "af874f86d0566d457dec9b2968c6cb0a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "af874f86d0566d457dec9b2968c6cb0a");
                } else {
                    WmBaseGroupChatFragment.a(WmBaseGroupChatFragment.this, (List) list);
                }
            }

            @Override // com.sankuai.waimai.business.im.callback.a
            public final void a(RiderImInfo.a aVar2) {
                Object[] objArr3 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "885b8d5c8b123e831300099b3a737d68", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "885b8d5c8b123e831300099b3a737d68");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("receive_user_type", 2);
                JudasManualManager.a("b_waimai_i7ex1dmf_mc", "c_waimai_wgiu7lrd", AppUtil.generatePageInfoKey(WmBaseGroupChatFragment.this.getActivity())).a((Map<String, Object>) hashMap).a();
                WmBaseGroupChatFragment.this.a(new a() { // from class: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.7.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.a
                    public final void a(com.sankuai.waimai.business.im.common.model.b bVar) {
                        Object[] objArr4 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "76172cadd3f9815163b809d739fbaa41", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "76172cadd3f9815163b809d739fbaa41");
                            return;
                        }
                        String string = WmBaseGroupChatFragment.this.getActivity().getResources().getString(R.string.wm_im_can_not_modify_address);
                        if (bVar != null && !TextUtils.isEmpty(bVar.b)) {
                            string = bVar.b;
                        }
                        ae.a((Activity) WmBaseGroupChatFragment.this.getActivity(), string);
                        int size = WmBaseGroupChatFragment.this.l.e.d.w.size();
                        if (size > 0) {
                            WmBaseGroupChatFragment.this.l.e.d.w.remove(size - 1);
                            WmBaseGroupChatFragment.this.I.c();
                        }
                    }

                    @Override // com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2ca44bb7641711ed9c7c1f5c702a8d2b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2ca44bb7641711ed9c7c1f5c702a8d2b");
                        } else {
                            WmBaseGroupChatFragment.c(WmBaseGroupChatFragment.this);
                        }
                    }
                });
            }

            @Override // com.sankuai.waimai.business.im.callback.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "62627a8c4a9dd7c0f55e0de6c88931ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "62627a8c4a9dd7c0f55e0de6c88931ad");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("receive_user_type", 2);
                JudasManualManager.b("b_waimai_wssddcqy_mv", "c_waimai_wgiu7lrd", AppUtil.generatePageInfoKey(WmBaseGroupChatFragment.this.getActivity())).a((Map<String, Object>) hashMap).a();
            }

            @Override // com.sankuai.waimai.business.im.callback.a
            public final void b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e5f17e3fde242ce5d54875e081f0e229", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e5f17e3fde242ce5d54875e081f0e229");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("receive_user_type", 2);
                JudasManualManager.a("b_waimai_wssddcqy_mc", "c_waimai_wgiu7lrd", AppUtil.generatePageInfoKey(WmBaseGroupChatFragment.this.getActivity())).a((Map<String, Object>) hashMap).a();
                WmBaseGroupChatFragment.c(WmBaseGroupChatFragment.this);
            }
        });
        return this.I;
    }

    public final void a(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ec3c2ab0c109d72ec89799e70172b62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ec3c2ab0c109d72ec89799e70172b62");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImCommonService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImCommonService.class)).checkModifyAddress(this.l.d), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.common.model.b>>() { // from class: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.8
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc506c8f0d52c194eb5ebadc2b77a72a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc506c8f0d52c194eb5ebadc2b77a72a");
                    } else if (baseResponse == null || !baseResponse.isSuccess()) {
                        ae.a((Activity) WmBaseGroupChatFragment.this.getActivity(), WmBaseGroupChatFragment.this.getActivity().getResources().getString(R.string.wm_im_net_error_retry_later));
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "324082df6f014e31a4de5cc8dfdd1fbb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "324082df6f014e31a4de5cc8dfdd1fbb");
                    } else {
                        ae.a((Activity) WmBaseGroupChatFragment.this.getActivity(), WmBaseGroupChatFragment.this.getActivity().getResources().getString(R.string.wm_im_net_error_retry_later));
                    }
                }
            }, y);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final TitleBarAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0317ba56ca8ba68303212a8eed04856", RobustBitConfig.DEFAULT_VALUE) ? (TitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0317ba56ca8ba68303212a8eed04856") : new WmGroupTitleBarAdapter(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.9
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "200811e5fc6adbad873a6bcf773c9d52", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "200811e5fc6adbad873a6bcf773c9d52");
                } else {
                    WmBaseGroupChatFragment.this.D();
                }
            }
        });
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.a
    public final IBannerAdapter b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abdbe72d3f06ba0d5340a4c0cd5d7e16", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBannerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abdbe72d3f06ba0d5340a4c0cd5d7e16");
        }
        if (this.H == null) {
            this.H = new WmGroupBannerAdapter(getActivity());
        }
        return this.H;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.chatpage.BasePvChatFragment, com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        FragmentActivity activity;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f365d013f5eb81f5314e33a3617fa83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f365d013f5eb81f5314e33a3617fa83");
            return;
        }
        super.onCreate(bundle);
        com.meituan.android.bus.a.a().a(this);
        com.sankuai.xm.imui.session.b b = com.sankuai.xm.imui.session.b.b(getActivity());
        if (b != null) {
            b.a(com.sankuai.xm.imui.session.event.a.class, this.J, true);
        }
        this.l = WmGroupShareData.a(getActivity());
        try {
            ((com.sankuai.xm.group.b) com.sankuai.xm.ui.a.a().a(com.sankuai.xm.group.b.class)).a((short) 1025, (com.sankuai.xm.imui.controller.group.b) this);
        } catch (n e) {
            e.printStackTrace();
        }
        IMClient.a().a((short) 1025, (IMClient.i) this);
        this.m = this.t;
        if (this.m != null) {
            Bundle bundle2 = this.m.u;
            if (bundle2 != null) {
                this.l.e = (com.sankuai.waimai.business.im.group.model.c) com.sankuai.waimai.platform.utils.f.a(bundle2, "group_im_info");
                this.l.f = (com.sankuai.waimai.business.im.group.model.d) com.sankuai.waimai.platform.utils.f.a(bundle2, "group_member_info");
                this.l.d = bundle2.getLong("order_view_id");
                this.l.b = bundle2.getLong("poi_id");
                this.l.c = bundle2.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
                this.F = bundle2.getBoolean("is_rider_changed", false);
                this.G = bundle2.getInt("show_emotion", 0);
                this.j = bundle2.getInt("ref", 0);
                try {
                    this.b = (WMCommonDataInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(this.l.e.e, (Class<Object>) WMCommonDataInfo.class);
                } catch (Exception e2) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e2);
                }
                Intent intent = getActivity().getIntent();
                int i = bundle2.getInt("param_from", 10);
                Object[] objArr2 = {intent, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = k;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5aa007271e0e6e3266353f7563f1eb7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5aa007271e0e6e3266353f7563f1eb7");
                } else if (intent != null) {
                    Uri data = intent.getData();
                    intent.setData((data == null ? new Uri.Builder() : data.buildUpon()).appendQueryParameter("source", String.valueOf(i)).build());
                }
            }
            com.sankuai.waimai.imbase.manager.b.a().f();
        }
        if (this.l.e == null && (activity = getActivity()) != null && !activity.isFinishing()) {
            activity.finish();
            return;
        }
        this.L = com.sankuai.waimai.business.im.common.utils.d.a(getActivity(), "_modify_address_");
        HashMap hashMap = new HashMap(2);
        hashMap.put("__ffpdp", "001");
        hashMap.put("wm_im_type", String.valueOf(com.sankuai.waimai.business.im.utils.c.a(3)));
        com.sankuai.waimai.business.im.utils.c.a(hashMap);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbdec137a2af9663df28a0ede38362c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbdec137a2af9663df28a0ede38362c2");
            return;
        }
        super.onStart();
        boolean z = this.l.e == null || this.l.e.d == null || this.l.e.d.c == 0;
        if (z && !this.D) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = k;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18dbc1eb7db03d939a2f1e6f0f79a794", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18dbc1eb7db03d939a2f1e6f0f79a794");
            } else {
                a(this.l.e.d.b, true);
            }
            this.D = true;
        }
        if (!this.E) {
            if (z) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = k;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5cc25846810e2e4b690cff342c44655f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5cc25846810e2e4b690cff342c44655f");
                } else {
                    Context context = getContext();
                    boolean b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "wm_im_is_new_group_" + com.sankuai.xm.imui.b.a().f().f(), true);
                    Context context2 = getContext();
                    if (!com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context2, "wm_im_scene_msg_" + this.l.d, false) && b && this.l.e != null && this.l.e.d != null && !TextUtils.isEmpty(this.l.e.d.l)) {
                        Context context3 = getContext();
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context3, "wm_im_is_new_group_" + com.sankuai.xm.imui.b.a().f().f(), false);
                        byte[] data = new TipMessageData(this.l.e.d.k, this.l.e.d.l).toData(2);
                        if (data != null) {
                            a(com.sankuai.xm.imui.common.util.c.a(data, 0, "[" + this.l.e.d.k + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + this.l.e.d.l), false);
                        }
                    }
                }
            }
            if (this.F) {
                B();
            }
            this.E = true;
        }
        if (z) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = k;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f43390fea3653fc0e1c99fd7e0293e6b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f43390fea3653fc0e1c99fd7e0293e6b");
            } else {
                com.sankuai.waimai.imbase.manager.b.a().a(com.sankuai.xm.imui.b.a().f(), new IMClient.g<com.sankuai.xm.im.session.entry.a>() { // from class: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.10
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.im.IMClient.g
                    public final /* synthetic */ void a(com.sankuai.xm.im.session.entry.a aVar) {
                        IMMessage iMMessage;
                        com.sankuai.xm.im.session.entry.a aVar2 = aVar;
                        Object[] objArr5 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4a45446fff7d2511f2d2d0493a88f553", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4a45446fff7d2511f2d2d0493a88f553");
                        } else if (aVar2 == null || (iMMessage = aVar2.b) == null || WmBaseGroupChatFragment.this.a(iMMessage)) {
                        } else {
                            if (!WmBaseGroupChatFragment.b(WmBaseGroupChatFragment.this, iMMessage)) {
                                WmBaseGroupChatFragment.this.d(WmBaseGroupChatFragment.this.C() - (System.currentTimeMillis() - iMMessage.getCts()));
                            } else {
                                WmBaseGroupChatFragment.d(WmBaseGroupChatFragment.this);
                            }
                        }
                    }
                });
            }
        }
        if (this.l.e != null && this.l.e.d != null && this.l.e.d.h == 3) {
            ISendPanelAdapter sendPanelAdapter = this.v.getSendPanelAdapter();
            if (sendPanelAdapter instanceof WmBaseGroupSendPanelAdapter) {
                ((WmBaseGroupSendPanelAdapter) sendPanelAdapter).a(true, this.l.e.d.f);
            }
        }
        if (this.H != null) {
            WmGroupBannerAdapter wmGroupBannerAdapter = this.H;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = WmBaseGroupBannerAdapter.a;
            if (PatchProxy.isSupport(objArr5, wmGroupBannerAdapter, changeQuickRedirect5, false, "cb29aaf1d2da37bfc863118f04dd5522", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, wmGroupBannerAdapter, changeQuickRedirect5, false, "cb29aaf1d2da37bfc863118f04dd5522");
            } else if (wmGroupBannerAdapter.b != null) {
                wmGroupBannerAdapter.b.a();
            }
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86dc190679e35f411ee1ecbcb2b0a9fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86dc190679e35f411ee1ecbcb2b0a9fc");
            return;
        }
        super.onStop();
        if (this.H != null) {
            WmGroupBannerAdapter wmGroupBannerAdapter = this.H;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = WmBaseGroupBannerAdapter.a;
            if (PatchProxy.isSupport(objArr2, wmGroupBannerAdapter, changeQuickRedirect2, false, "f2ff893120a3d12d52d6f8525d9eed1e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, wmGroupBannerAdapter, changeQuickRedirect2, false, "f2ff893120a3d12d52d6f8525d9eed1e");
            } else if (wmGroupBannerAdapter.b != null) {
                wmGroupBannerAdapter.b.b();
            }
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment
    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be6b606244e3d29d7b3de70f9ea365aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be6b606244e3d29d7b3de70f9ea365aa");
        } else {
            super.a(aVar);
        }
    }

    private void a(GeneralMessage generalMessage, boolean z) {
        Object[] objArr = {generalMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "244015fcc4dac6862256550e1cca00c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "244015fcc4dac6862256550e1cca00c3");
            return;
        }
        b((IMMessage) generalMessage);
        com.sankuai.waimai.imbase.utils.f.a(generalMessage, z);
    }

    private void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1fb136865b12fc99179cb7423a9abfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1fb136865b12fc99179cb7423a9abfe");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            EventMessage b = com.sankuai.xm.imui.common.util.c.b(str);
            b((IMMessage) b);
            com.sankuai.waimai.imbase.utils.f.b(b, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6d20d453fd9378e0e49a215dd7e2c56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6d20d453fd9378e0e49a215dd7e2c56");
        } else {
            a(this.l.e.d.o, false);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(int i, com.sankuai.xm.imui.session.entity.b bVar) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5043297cd8d10983f9c6d8c08a64825e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5043297cd8d10983f9c6d8c08a64825e")).booleanValue();
        }
        Object[] objArr2 = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc0bebf2ddcbd8139292ca7100d00430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc0bebf2ddcbd8139292ca7100d00430");
        } else if (i == 0) {
            com.sankuai.waimai.business.im.common.log.b.a("send_message", String.valueOf(i));
        } else {
            HashMap hashMap = new HashMap();
            if (bVar != null && bVar.b != 0) {
                hashMap.put("channel", String.valueOf((int) bVar.b.getChannel()));
                hashMap.put("id", String.valueOf(bVar.b.getMsgId()));
                hashMap.put("time", String.valueOf(bVar.i()));
                hashMap.put("category", String.valueOf(bVar.b.getCategory()));
                if (16 == MsgViewType.a(bVar.b)) {
                    hashMap.put("type", String.valueOf(IMMessageAdapter.a((GeneralMessage) bVar.b)));
                }
            }
            com.sankuai.waimai.business.im.common.log.b.a("send_message", String.valueOf(i), "发送消息失败", hashMap);
        }
        if (bVar != null && (bVar.b instanceof CustomEmotionMessage)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("stid", ((CustomEmotionMessage) bVar.b).getId());
            JudasManualManager.a("b_waimai_739ap29f_mc").a("c_waimai_wgiu7lrd").a((Map<String, Object>) hashMap2).a();
        }
        if (i == 0) {
            this.C = false;
            d(0L);
        }
        M m = bVar.b;
        if (m instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) m;
            if (!TextUtils.isEmpty(textMessage.getText())) {
                WmGroupBannerAdapter wmGroupBannerAdapter = this.H;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = WmBaseGroupBannerAdapter.a;
                if (PatchProxy.isSupport(objArr3, wmGroupBannerAdapter, changeQuickRedirect3, false, "5eb3a49a90eae22a5a3fd898ed063427", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, wmGroupBannerAdapter, changeQuickRedirect3, false, "5eb3a49a90eae22a5a3fd898ed063427")).booleanValue();
                } else if (wmGroupBannerAdapter.b != null) {
                    z = wmGroupBannerAdapter.b.c();
                }
                if (z) {
                    this.I.a(textMessage.getText(), 2);
                }
            }
        }
        if (i == 10100) {
            return true;
        }
        if (i == 10007) {
            com.sankuai.waimai.imbase.manager.b.a().a(getActivity());
        }
        return super.a(i, bVar);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final void b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47875af14cc5a17997b98f4385dbd2a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47875af14cc5a17997b98f4385dbd2a9");
        } else if (iMMessage != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("im_role", 2);
            hashMap.put("order_id", String.valueOf(this.l.d));
            hashMap.put("poi_id", String.valueOf(this.l.b));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.l.c);
            hashMap.put("conversation_type", 0);
            User user = getActivity() != null ? UserCenter.getInstance(getActivity()).getUser() : null;
            hashMap.put("role_name", user != null ? user.username : "");
            hashMap.put("role_logo_url", user != null ? user.avatarurl : "");
            hashMap.put("role_phone_number", (this.l.e == null || this.l.e.c == null) ? "" : this.l.e.c.a);
            hashMap.put("version", com.sankuai.waimai.platform.b.A().i());
            hashMap.put("source", "Android");
            if (this.j != 0) {
                hashMap.put("ref", Integer.valueOf(this.j));
            }
            iMMessage.appendExtension(hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9582307914033a18bb70013b558e5545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9582307914033a18bb70013b558e5545");
            return;
        }
        if (j <= 0) {
            j = C();
        }
        if (this.M == null) {
            this.M = new com.sankuai.waimai.business.im.common.utils.c(j) { // from class: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.11
                public static ChangeQuickRedirect d;

                @Override // com.sankuai.waimai.business.im.common.utils.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = d;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03cea45521f0908368f218c08a6adba6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03cea45521f0908368f218c08a6adba6");
                    } else {
                        WmBaseGroupChatFragment.d(WmBaseGroupChatFragment.this);
                    }
                }
            };
        } else {
            this.M.a(j);
            this.M.cancel();
        }
        this.M.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C() {
        if (this.l.e == null || this.l.e.d == null) {
            return Integer.MAX_VALUE;
        }
        return this.l.e.d.d * 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(@NonNull IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50ba79517ada1422952e6ad1502d80d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50ba79517ada1422952e6ad1502d80d6")).booleanValue() : iMMessage.getFromUid() != IMClient.a().k();
    }

    @Override // com.sankuai.xm.imui.controller.group.b
    public final void c(final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e6d43c79b063068f5f00ffec59237c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e6d43c79b063068f5f00ffec59237c2");
            return;
        }
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4436588d9bdeba46a581e771cb1ba821", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4436588d9bdeba46a581e771cb1ba821");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImGroupService.class)).getGroupMemberInfo(this.l.e.d.a), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.group.model.d>>() { // from class: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.12
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onError(Throwable th) {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr3 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "337fdbf39bc6aac65b2a9f0f5697d5f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "337fdbf39bc6aac65b2a9f0f5697d5f2");
                    } else if (baseResponse == null || baseResponse.code != 0) {
                    } else {
                        com.sankuai.waimai.business.im.group.model.d dVar = (com.sankuai.waimai.business.im.group.model.d) baseResponse.data;
                        long a2 = com.sankuai.waimai.business.im.group.cache.a.a().a(j);
                        com.sankuai.waimai.business.im.group.cache.a.a().a(j, (dVar == null || dVar.c == null || dVar.c.a == null || dVar.c.a.length == 0) ? 0L : dVar.c.a[0]);
                        com.sankuai.waimai.business.im.group.rxbus.c cVar = new com.sankuai.waimai.business.im.group.rxbus.c();
                        if (a2 == 0) {
                            if (dVar == null || dVar.c == null || dVar.c.a == null || dVar.c.a.length == 0) {
                                cVar.a = false;
                            } else {
                                cVar.a = true;
                            }
                        } else if (dVar == null || dVar.c == null || dVar.c.a == null || dVar.c.a.length == 0 || dVar.c.a[0] != a2) {
                            WmBaseGroupChatFragment.this.B();
                            cVar.a = true;
                        } else {
                            cVar.a = false;
                        }
                        WmBaseGroupChatFragment.this.l.f = dVar;
                        com.meituan.android.bus.a.a().c(cVar);
                    }
                }
            }, y);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final void F_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efb45b222dfc906cc027a77b5efeec98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efb45b222dfc906cc027a77b5efeec98");
        } else if (com.sankuai.waimai.imbase.manager.b.a().e()) {
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a(getContext());
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.xm.im.IMClient.i
    public final void a(List<IMMessage> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "626fc19066188dc00a9cf62bae107ad3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "626fc19066188dc00a9cf62bae107ad3");
            return;
        }
        Iterator<IMMessage> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IMMessage next = it.next();
            if (next != null && c(next) && a(next) && this.M != null) {
                this.M.cancel();
                break;
            }
        }
        super.a(list, z);
    }

    private boolean c(@NonNull IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a96f30397d5f4ad2cf3eb886b852dd9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a96f30397d5f4ad2cf3eb886b852dd9")).booleanValue();
        }
        try {
            return iMMessage.getChatId() == com.sankuai.xm.imui.b.a().f().b;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bbd8264463705b1a6bee8460fe04afd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bbd8264463705b1a6bee8460fe04afd");
            return;
        }
        if (this.B == null) {
            this.B = (WmGroupChatPhoneView) LayoutInflater.from(getContext()).inflate(R.layout.wm_im_group_phone_listview, (ViewGroup) null);
            this.B.setOnCancelClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ea672764ad6aa0c32b417604010bc8b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ea672764ad6aa0c32b417604010bc8b");
                    } else {
                        WmBaseGroupChatFragment.this.E();
                    }
                }
            });
        }
        final WmGroupChatPhoneView wmGroupChatPhoneView = this.B;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = WmGroupChatPhoneView.a;
        if (PatchProxy.isSupport(objArr2, wmGroupChatPhoneView, changeQuickRedirect2, false, "3777de4e77892ab451e659251b4c4cd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, wmGroupChatPhoneView, changeQuickRedirect2, false, "3777de4e77892ab451e659251b4c4cd3");
        } else {
            final String str = "";
            if (wmGroupChatPhoneView.f.e != null && wmGroupChatPhoneView.f.e.a != null) {
                str = wmGroupChatPhoneView.f.e.a.c;
            }
            final String str2 = "";
            if (wmGroupChatPhoneView.f.e != null && wmGroupChatPhoneView.f.e.b != null) {
                str2 = wmGroupChatPhoneView.f.e.b.a;
            }
            if (TextUtils.isEmpty(str)) {
                wmGroupChatPhoneView.b.setVisibility(8);
            } else {
                wmGroupChatPhoneView.b.setVisibility(0);
            }
            if (TextUtils.isEmpty(str2)) {
                wmGroupChatPhoneView.c.setVisibility(8);
            } else {
                wmGroupChatPhoneView.c.setVisibility(0);
            }
            final boolean z = (wmGroupChatPhoneView.f.e == null || wmGroupChatPhoneView.f.e.c == null || wmGroupChatPhoneView.f.e.c.b != 1 || TextUtils.isEmpty(wmGroupChatPhoneView.f.e.c.a)) ? false : true;
            if (z) {
                SpannableString spannableString = new SpannableString("拨打电话（隐私保护中）");
                spannableString.setSpan(new RelativeSizeSpan(0.66f), 4, spannableString.length(), 18);
                wmGroupChatPhoneView.d.setAdapter((ListAdapter) new ArrayAdapter(wmGroupChatPhoneView.getContext(), (int) R.layout.wm_im_group_chat_phone_item, Collections.singletonList(spannableString)));
                wmGroupChatPhoneView.e.setAdapter((ListAdapter) new ArrayAdapter(wmGroupChatPhoneView.getContext(), (int) R.layout.wm_im_group_chat_phone_item, Collections.singletonList(spannableString)));
            } else {
                wmGroupChatPhoneView.d.setAdapter((ListAdapter) new ArrayAdapter(wmGroupChatPhoneView.getContext(), (int) R.layout.wm_im_group_chat_phone_item, str.split("/")));
                wmGroupChatPhoneView.e.setAdapter((ListAdapter) new ArrayAdapter(wmGroupChatPhoneView.getContext(), (int) R.layout.wm_im_group_chat_phone_item, str2.split("/")));
            }
            wmGroupChatPhoneView.d.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.business.im.group.View.WmGroupChatPhoneView.1
                public static ChangeQuickRedirect a;

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    Object[] objArr3 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "41b0f89cee614791f063a0f05d964d8f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "41b0f89cee614791f063a0f05d964d8f");
                        return;
                    }
                    WmGroupChatPhoneView.a(wmGroupChatPhoneView, 1, wmGroupChatPhoneView.f.d, z, str.split("/"), z ? wmGroupChatPhoneView.f.e.c.a : "", i);
                    if (wmGroupChatPhoneView.h != null) {
                        wmGroupChatPhoneView.h.onClick(view);
                    }
                }
            });
            wmGroupChatPhoneView.e.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.business.im.group.View.WmGroupChatPhoneView.2
                public static ChangeQuickRedirect a;

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    Object[] objArr3 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "de1d521682441996f0e04f8d828390fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "de1d521682441996f0e04f8d828390fe");
                        return;
                    }
                    WmGroupChatPhoneView.a(wmGroupChatPhoneView, 0, wmGroupChatPhoneView.f.d, z, str2.split("/"), z ? wmGroupChatPhoneView.f.e.c.a : "", i);
                    if (wmGroupChatPhoneView.h != null) {
                        wmGroupChatPhoneView.h.onClick(view);
                    }
                }
            });
        }
        if (this.A == null) {
            this.A = new com.sankuai.waimai.business.im.group.controller.a(getActivity());
            com.sankuai.waimai.business.im.group.controller.a aVar = this.A;
            WmGroupChatPhoneView wmGroupChatPhoneView2 = this.B;
            int a2 = com.sankuai.waimai.foundation.utils.g.a(getContext());
            Object[] objArr3 = {wmGroupChatPhoneView2, Integer.valueOf(a2), -2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.im.group.controller.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "3b2b78f5b9ec377d7e818e8263ece263", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "3b2b78f5b9ec377d7e818e8263ece263");
            } else {
                aVar.c = wmGroupChatPhoneView2;
                aVar.e = a2;
                aVar.d = -2;
                aVar.b.setContentView(aVar.c);
            }
        }
        final com.sankuai.waimai.business.im.group.controller.a aVar2 = this.A;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.im.group.controller.a.a;
        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "e3d826e91ff247a101e9681195d5e08e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "e3d826e91ff247a101e9681195d5e08e");
            return;
        }
        if (aVar2.c.getLayoutParams() != null) {
            aVar2.c.getLayoutParams().width = aVar2.e;
            aVar2.c.getLayoutParams().height = aVar2.d;
            aVar2.c.requestLayout();
        }
        Window window = aVar2.b.getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        aVar2.b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.business.im.group.controller.a.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object[] objArr5 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d4237518fe5a95062f468a6405775ce2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d4237518fe5a95062f468a6405775ce2");
                }
            }
        });
        aVar2.b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.sankuai.waimai.business.im.group.controller.a.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Object[] objArr5 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "864a431805649c1cd112acb93b27f660", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "864a431805649c1cd112acb93b27f660");
                }
            }
        });
        aVar2.b.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcde62e041e9fd9edf7712b8c5d1bb6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcde62e041e9fd9edf7712b8c5d1bb6d");
        } else if (this.A != null) {
            com.sankuai.waimai.business.im.group.controller.a aVar = this.A;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.im.group.controller.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "27ccec9608d1da3668453a09196c321e", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "27ccec9608d1da3668453a09196c321e")).booleanValue();
            } else {
                z = aVar.b != null && aVar.b.isShowing();
            }
            if (z) {
                com.sankuai.waimai.business.im.group.controller.a aVar2 = this.A;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.im.group.controller.a.a;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "18000e0b791b4714ca5c55ba9fbde2c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "18000e0b791b4714ca5c55ba9fbde2c3");
                } else {
                    aVar2.b.dismiss();
                }
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onGroupImInfoChanged(com.sankuai.waimai.business.im.group.rxbus.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0173e5de7dea3194054c748f56f1564", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0173e5de7dea3194054c748f56f1564");
        } else if (getActivity() == null || getActivity().isFinishing() || bVar == null || bVar.b == null) {
        } else {
            this.l.e = bVar.b;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onModifyLocationClick(com.sankuai.waimai.business.im.common.rxbus.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f511ce67648640a4b7491d321731d6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f511ce67648640a4b7491d321731d6b");
        } else if (getActivity() == null || getActivity().isFinishing() || cVar == null) {
        } else {
            String valueOf = !TextUtils.isEmpty(cVar.e) ? cVar.e : String.valueOf(this.l.d);
            a(valueOf);
            JudasManualManager.a("b_waimai_l020kwq3_mc").a(com.sankuai.waimai.business.im.utils.d.a).a("receive_user_type", 2).a("order_id", valueOf).a();
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3001a8de4d722a3ac3aada3454667062", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3001a8de4d722a3ac3aada3454667062");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("im_order_id", str);
        hashMap.put("wmPoiId", r());
        hashMap.put("poiIDStr", "");
        hashMap.put("im_source", com.sankuai.waimai.foundation.core.a.d() ? "C_WM" : "C_MT");
        hashMap.put("im_addr_location_type", "SEND");
        hashMap.put("im_lat", Long.valueOf(this.l.e.c.f));
        hashMap.put("im_lng", Long.valueOf(this.l.e.c.e));
        hashMap.put("isReversoAOI", Integer.valueOf(this.l.e.d.v));
        com.sankuai.waimai.business.im.common.rxbus.d.a(getActivity(), hashMap);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5dcb4bdf996f9f2d3a9185b86074060", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5dcb4bdf996f9f2d3a9185b86074060");
            return;
        }
        if (this.M != null) {
            this.M.cancel();
        }
        super.onDestroyView();
        E();
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        com.sankuai.xm.imui.session.b b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b7ce9f162fb588eaf950166131c735a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b7ce9f162fb588eaf950166131c735a");
            return;
        }
        super.onDestroy();
        try {
            ((com.sankuai.xm.group.b) com.sankuai.xm.ui.a.a().a(com.sankuai.xm.group.b.class)).b((short) 1025, (com.sankuai.xm.imui.controller.group.b) this);
        } catch (n e) {
            e.printStackTrace();
        }
        IMClient.a().b((short) 1025, (IMClient.i) this);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(y);
        com.meituan.android.bus.a.a().b(this);
        if (getActivity() != null && (b = com.sankuai.xm.imui.session.b.b(getActivity())) != null) {
            b.a(com.sankuai.xm.imui.session.event.a.class, this.J);
        }
        if (this.B != null) {
            this.B = null;
        }
        if (this.A != null) {
            this.A = null;
        }
        if (this.I != null) {
            this.I.b();
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final Map<String, Object> a(String str, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa6fcd563c1a1166b82a86494fb7f445", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa6fcd563c1a1166b82a86494fb7f445");
        }
        char c = 65535;
        if (str.hashCode() == -1540748623 && str.equals("im_send_location")) {
            c = 0;
        }
        if (c != 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("show_button", Integer.valueOf(this.l.e.d.s != null ? 1 : 0));
        return hashMap;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final String q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f489be9f6f73fb3e833535dc2721b1fd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f489be9f6f73fb3e833535dc2721b1fd") : String.valueOf(this.l.e.d.a);
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a8d9ef7e72f3df6e97b5f151be043a5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a8d9ef7e72f3df6e97b5f151be043a5") : String.valueOf(this.l.b);
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final String s() {
        return this.l.c;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final void c(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25dc7b7e338bf19c24de337197e50624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25dc7b7e338bf19c24de337197e50624");
        } else {
            D();
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final void a(com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, Map<String, Object> map) {
        Object[] objArr = {bVar, map};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05378506a8054e54c8787fce9dd44608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05378506a8054e54c8787fce9dd44608");
        } else if (map != null && "imAddressLocation".equals(String.valueOf(map.get("page")))) {
            a(String.valueOf(this.l.d));
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final void b(final com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, Map<String, Object> map) {
        Object[] objArr = {bVar, map};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91ae0aa89ad6ffbfbc13a27af9403d59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91ae0aa89ad6ffbfbc13a27af9403d59");
        } else if (this.l != null && this.l.e != null && this.l.e.d != null && this.l.e.d.u == 1) {
            a(new a() { // from class: com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.a
                public final void a(com.sankuai.waimai.business.im.common.model.b bVar2) {
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65e70054042ebcdeb1dc8f1c839d3102", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65e70054042ebcdeb1dc8f1c839d3102");
                        return;
                    }
                    WmBaseGroupChatFragment.this.l.e.d.u = 0;
                    String string = WmBaseGroupChatFragment.this.getActivity().getResources().getString(R.string.wm_im_can_not_modify_address);
                    if (bVar2 != null && !TextUtils.isEmpty(bVar2.b)) {
                        string = bVar2.b;
                    }
                    ae.a((Activity) WmBaseGroupChatFragment.this.getActivity(), string);
                    if (bVar != null) {
                        IMUIManager.a().a(bVar.b);
                    }
                }

                @Override // com.sankuai.waimai.business.im.group.chat.WmBaseGroupChatFragment.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59a1d6eee1c642ea67224b5715441740", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59a1d6eee1c642ea67224b5715441740");
                        return;
                    }
                    WmBaseGroupChatFragment.this.K = bVar;
                    WmBaseGroupChatFragment.c(WmBaseGroupChatFragment.this);
                }
            });
        } else {
            ae.a((Activity) getActivity(), getActivity().getResources().getString(R.string.wm_im_can_not_modify_address));
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f882828500f9b814f86b6d4a12e77b15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f882828500f9b814f86b6d4a12e77b15")).booleanValue();
        }
        if (bVar.b != 0) {
            b(bVar.b);
        }
        return super.a(bVar);
    }
}
