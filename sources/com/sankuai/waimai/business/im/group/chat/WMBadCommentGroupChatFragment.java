package com.sankuai.waimai.business.im.group.chat;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.ListView;
import android.widget.TextView;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment;
import com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter;
import com.sankuai.waimai.business.im.common.message.IMMessageAdapter;
import com.sankuai.waimai.business.im.group.adapter.BadCommentGroupChatBannerAdapter;
import com.sankuai.waimai.business.im.group.adapter.BadCommentGroupChatMsgViewAdapter;
import com.sankuai.waimai.business.im.group.adapter.BadCommentGroupChatSendPanelAdapter;
import com.sankuai.waimai.business.im.group.knb.a;
import com.sankuai.waimai.business.im.group.theme.a;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.utils.c;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.imbase.dialog.IMCustomDialog;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.mach.utils.b;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.xm.im.message.bean.CustomEmotionMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.MsgViewType;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMBadCommentGroupChatFragment extends BaseMachChatFragment {
    public static ChangeQuickRedirect k;
    private long A;
    private int B;
    private WMIMTitleBarAdapter C;
    private String D;
    private String E;
    private boolean F;
    private a G;
    private SessionParams l;
    private com.sankuai.waimai.business.im.common.model.a m;
    private int y;
    private String z;

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment
    public final int e() {
        return 101;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final int p() {
        return 101;
    }

    public static /* synthetic */ void a(WMBadCommentGroupChatFragment wMBadCommentGroupChatFragment) {
        TextView textView;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, wMBadCommentGroupChatFragment, changeQuickRedirect, false, "9185394998e8752b2ba90b8c55e656f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wMBadCommentGroupChatFragment, changeQuickRedirect, false, "9185394998e8752b2ba90b8c55e656f1");
        } else if (wMBadCommentGroupChatFragment.getActivity() == null || wMBadCommentGroupChatFragment.getActivity().isFinishing()) {
        } else {
            String str = "结束后，您将不再收到此聊天消息，也不能继续给此商家发送消息";
            if (wMBadCommentGroupChatFragment.m != null && wMBadCommentGroupChatFragment.m.b != null && !TextUtils.isEmpty(wMBadCommentGroupChatFragment.m.b.i)) {
                str = wMBadCommentGroupChatFragment.m.b.i;
            }
            JudasManualManager.a(d.s).a(d.a).a();
            IMCustomDialog a = new IMCustomDialog.a(wMBadCommentGroupChatFragment.getActivity()).b(str).a("结束聊天", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.im.group.chat.WMBadCommentGroupChatFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f89cf31f37667a04b52db129b75d5a3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f89cf31f37667a04b52db129b75d5a3");
                    } else {
                        WMBadCommentGroupChatFragment.b(WMBadCommentGroupChatFragment.this);
                    }
                }
            }).b("再想想", null).a(false).a();
            if (a == null || (textView = a.b) == null) {
                return;
            }
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setTextColor(wMBadCommentGroupChatFragment.getResources().getColorStateList(R.color.wm_im_btn_highlight));
        }
    }

    public static /* synthetic */ void a(WMBadCommentGroupChatFragment wMBadCommentGroupChatFragment, com.sankuai.waimai.business.im.group.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, wMBadCommentGroupChatFragment, changeQuickRedirect, false, "c176211a3e0d1ca5e83c007e6edaae2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wMBadCommentGroupChatFragment, changeQuickRedirect, false, "c176211a3e0d1ca5e83c007e6edaae2e");
        } else {
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.business.im.group.rxbus.a(aVar));
        }
    }

    public static /* synthetic */ void b(WMBadCommentGroupChatFragment wMBadCommentGroupChatFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, wMBadCommentGroupChatFragment, changeQuickRedirect, false, "841d39c0a9b9987a9cff5965e1a5294f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wMBadCommentGroupChatFragment, changeQuickRedirect, false, "841d39c0a9b9987a9cff5965e1a5294f");
        } else if (wMBadCommentGroupChatFragment.getActivity() == null || wMBadCommentGroupChatFragment.getActivity().isFinishing() || wMBadCommentGroupChatFragment.m == null || wMBadCommentGroupChatFragment.m.b == null) {
        } else {
            final Dialog a = com.sankuai.waimai.foundation.core.utils.d.a((Activity) wMBadCommentGroupChatFragment.getActivity());
            com.sankuai.waimai.business.im.group.knb.a.a(wMBadCommentGroupChatFragment.m.b.a, new a.InterfaceC0742a() { // from class: com.sankuai.waimai.business.im.group.chat.WMBadCommentGroupChatFragment.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.im.group.knb.a.InterfaceC0742a
                public final void a(com.sankuai.waimai.business.im.group.model.a aVar, long j) {
                    Object[] objArr2 = {aVar, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "949d2d3cf3d5c49aa0292c648e83ece6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "949d2d3cf3d5c49aa0292c648e83ece6");
                        return;
                    }
                    com.sankuai.waimai.foundation.core.utils.d.a(a);
                    WMBadCommentGroupChatFragment.a(WMBadCommentGroupChatFragment.this, aVar);
                }

                @Override // com.sankuai.waimai.business.im.group.knb.a.InterfaceC0742a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec0fcec122fc00ded8d185196bb01d17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec0fcec122fc00ded8d185196bb01d17");
                        return;
                    }
                    com.sankuai.waimai.foundation.core.utils.d.a(a);
                    WMBadCommentGroupChatFragment.c(WMBadCommentGroupChatFragment.this);
                }
            }, wMBadCommentGroupChatFragment.z);
        }
    }

    public static /* synthetic */ void c(WMBadCommentGroupChatFragment wMBadCommentGroupChatFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, wMBadCommentGroupChatFragment, changeQuickRedirect, false, "db93c845e996be4c1b7b86a38e80e591", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wMBadCommentGroupChatFragment, changeQuickRedirect, false, "db93c845e996be4c1b7b86a38e80e591");
        } else if (wMBadCommentGroupChatFragment.getActivity() == null || wMBadCommentGroupChatFragment.getActivity().isFinishing()) {
        } else {
            ae.a((Activity) wMBadCommentGroupChatFragment.getActivity(), "网络异常，请稍后重试");
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final TitleBarAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86f23be22c4cc19fe740d659d6fe07ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86f23be22c4cc19fe740d659d6fe07ef");
        }
        this.C = new WMIMTitleBarAdapter(new WMIMTitleBarAdapter.a() { // from class: com.sankuai.waimai.business.im.group.chat.WMBadCommentGroupChatFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter.a
            public final void b() {
            }

            @Override // com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "603db167b40d9ff517cf20752a65f0da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "603db167b40d9ff517cf20752a65f0da");
                } else {
                    WMBadCommentGroupChatFragment.a(WMBadCommentGroupChatFragment.this);
                }
            }
        });
        this.C.b = this.m.a.a;
        if (!this.m.b.a()) {
            WMIMTitleBarAdapter wMIMTitleBarAdapter = this.C;
            wMIMTitleBarAdapter.j = true;
            wMIMTitleBarAdapter.l = "结束聊天";
            wMIMTitleBarAdapter.m = R.drawable.wm_im_ic_close;
        }
        return this.C;
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.a
    public final IBannerAdapter b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9be098dd0bf834c604a181ea70fbe79", RobustBitConfig.DEFAULT_VALUE) ? (IBannerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9be098dd0bf834c604a181ea70fbe79") : new BadCommentGroupChatBannerAdapter(this.m);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final IMsgViewAdapter d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2abe23fa8ffd521944aba128d94a526", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMsgViewAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2abe23fa8ffd521944aba128d94a526");
        }
        if (this.b != null && this.b.a) {
            try {
                String str = this.b.b;
                this.b.c = (List) b.a().fromJson(str, new TypeToken<List<WMCommonDataInfo.IMDynamicCard>>() { // from class: com.sankuai.waimai.business.im.group.chat.WMBadCommentGroupChatFragment.4
                }.getType());
                this.c = new com.sankuai.waimai.business.im.common.presenter.a(this.e, getActivity(), this.b, this);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        return new BadCommentGroupChatMsgViewAdapter(this.b, this);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final ISendPanelAdapter bo_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "661200b30c3ed0bf33c0237a123292b6", RobustBitConfig.DEFAULT_VALUE) ? (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "661200b30c3ed0bf33c0237a123292b6") : new BadCommentGroupChatSendPanelAdapter(null, this.B);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.chatpage.BasePvChatFragment, com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e31db068fe6d3ee04aa313a446f68c7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e31db068fe6d3ee04aa313a446f68c7a");
            return;
        }
        super.onCreate(bundle);
        this.z = getClass().getSimpleName() + System.currentTimeMillis();
        com.meituan.android.bus.a.a().a(this);
        this.l = this.t;
        if (this.l != null && (bundle2 = this.l.u) != null) {
            this.m = (com.sankuai.waimai.business.im.common.model.a) f.a(bundle2, "chat_param_data");
            this.y = bundle2.getInt("chat_param_from");
            this.A = bundle2.getLong("chat_param_comment_id");
            this.B = bundle2.getInt("show_emotion", 0);
            this.j = bundle2.getInt("ref", 0);
            try {
                this.b = (WMCommonDataInfo) b.a().fromJson(this.m.c, (Class<Object>) WMCommonDataInfo.class);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        Intent intent = getActivity().getIntent();
        int i = this.y;
        Object[] objArr2 = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9e840366548a18556867f3c6bbe5732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9e840366548a18556867f3c6bbe5732");
        } else if (intent != null) {
            Uri data = intent.getData();
            intent.setData((data == null ? new Uri.Builder() : data.buildUpon()).appendQueryParameter("source", String.valueOf(i)).build());
        }
        FragmentActivity activity = getActivity();
        this.G = new com.sankuai.waimai.business.im.group.theme.a("你的电话、地址已被隐藏", activity);
        if (this.m == null) {
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
                return;
            }
        } else {
            com.sankuai.waimai.imbase.manager.b.a().f();
            if (this.m.b.j == 3) {
                this.D = this.m.b.k;
            } else if (this.m.b.a()) {
                this.D = "聊天已结束";
            }
            this.E = "wm_im_comment_chat_first_open_" + Long.toString(this.m.b.a);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("__ffpdp", "001");
        hashMap.put("wm_im_type", String.valueOf(c.a(101)));
        c.a(hashMap);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment
    public final void a(d.a aVar) {
        int i = 1;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73be1019cba11165d24b9329204ebe4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73be1019cba11165d24b9329204ebe4c");
            return;
        }
        super.a(aVar);
        Object[] objArr2 = {this.m};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05c7e13041c313cdd8279a90e9b7a6f1", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05c7e13041c313cdd8279a90e9b7a6f1")).intValue();
        } else if (this.m.b.c != 1) {
            i = 0;
        }
        aVar.a("status", Integer.valueOf(i));
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, com.sankuai.xm.imui.theme.c.a
    public final void a(com.sankuai.xm.imui.theme.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19484b7e210ff5646d1934ddbae355bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19484b7e210ff5646d1934ddbae355bf");
            return;
        }
        super.a(bVar);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = SessionFragment.q;
        ListView listView = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b9f6c614fe0764d3d1ef280043a691f", 6917529027641081856L) ? (ListView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b9f6c614fe0764d3d1ef280043a691f") : (ListView) this.w.getRefreshableView();
        if (listView != null) {
            listView.setBackground(this.G);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ede8b3b150ce508cc48397b63a6a4c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ede8b3b150ce508cc48397b63a6a4c9");
            return;
        }
        super.onStart();
        if (!TextUtils.isEmpty(this.D)) {
            a(this.D);
        }
        if (com.sankuai.waimai.platform.capacity.persistent.sp.a.b(getContext(), this.E, true)) {
            a(this.m.b.f, false);
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(getContext(), this.E, false);
        }
        if (this.F || !this.m.b.a()) {
            return;
        }
        this.F = true;
        a(this.m.b.h, true);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17e6e3435b939a59bd89ae3c86398329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17e6e3435b939a59bd89ae3c86398329");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.z);
        com.meituan.android.bus.a.a().b(this);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(int i, com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92aeaad7b934df35bf549a483ea91f96", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92aeaad7b934df35bf549a483ea91f96")).booleanValue();
        }
        Object[] objArr2 = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17463148d6eea0057b2f06022d9c2127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17463148d6eea0057b2f06022d9c2127");
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
            String str = "wm_im_comment_chat_replied_" + Long.toString(this.m.b.a);
            if (!com.sankuai.waimai.platform.capacity.persistent.sp.a.b(getContext(), str, false)) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(getContext(), str, true);
            }
        }
        if (i == 10100) {
            return true;
        }
        if (i == 10007) {
            com.sankuai.waimai.imbase.manager.b.a().a(getActivity());
        }
        if (i == 20001) {
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.business.im.group.rxbus.a(new com.sankuai.waimai.business.im.group.model.a("商家因违规，聊天已被终止", "聊天已结束")));
        }
        if (i == 20002 || i == 20005 || i == 20003 || i == 20004) {
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.business.im.group.rxbus.a(new com.sankuai.waimai.business.im.group.model.a("", "聊天已结束")));
        }
        return super.a(i, bVar);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final void F_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671f2bc5ee0354c9802f138d0986606f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671f2bc5ee0354c9802f138d0986606f");
        } else if (com.sankuai.waimai.imbase.manager.b.a().e()) {
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a(getContext());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChatClosed(com.sankuai.waimai.business.im.group.rxbus.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1742aa88c1fe6baaa74e8b52fdaee720", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1742aa88c1fe6baaa74e8b52fdaee720");
            return;
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3f40503c203d68a46eeb2f6f8f341bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3f40503c203d68a46eeb2f6f8f341bb");
        } else {
            this.D = aVar.a.b;
            a(this.D);
            if (this.C != null) {
                this.C.a();
            }
            a(aVar.a.a, true);
        }
        com.sankuai.waimai.business.im.group.knb.a.a(this.m.b.a);
        com.sankuai.waimai.imbase.manager.b.a().f();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onClickCommentCard(com.sankuai.waimai.business.im.common.rxbus.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "068ced9c8172297a93d11d9e26fcd4ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "068ced9c8172297a93d11d9e26fcd4ba");
            return;
        }
        long j = aVar.a;
        long d = com.sankuai.waimai.platform.domain.manager.user.a.i().d();
        FragmentActivity activity = getActivity();
        Object[] objArr2 = {activity, new Long(j), new Long(d)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.im.group.utils.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9415a459dad49dd27e073db72b7d3360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9415a459dad49dd27e073db72b7d3360");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("comment_id", j);
        bundle.putLong("user_id", d);
        com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.p, bundle);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final void b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f5ce2f15f9b59d18190eeff4b1742b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f5ce2f15f9b59d18190eeff4b1742b1");
        } else if (iMMessage != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("im_role", 2);
            hashMap.put("conversation_type", Integer.valueOf(this.m.b.b));
            hashMap.put("comment_id", Long.valueOf(this.A));
            User user = getActivity() != null ? UserCenter.getInstance(getActivity()).getUser() : null;
            hashMap.put("role_name", user != null ? user.username : "");
            hashMap.put("role_logo_url", user != null ? user.avatarurl : "");
            hashMap.put("version", com.sankuai.waimai.platform.b.A().i());
            hashMap.put("source", "Android");
            if (this.j != 0) {
                hashMap.put("ref", Integer.valueOf(this.j));
            }
            iMMessage.appendExtension(hashMap);
        }
    }

    private void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8cdd66180c33d4cad08618a68be36ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8cdd66180c33d4cad08618a68be36ec");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            EventMessage b = com.sankuai.xm.imui.common.util.c.b(str);
            b((IMMessage) b);
            com.sankuai.waimai.imbase.utils.f.b(b, z);
        }
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final String q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1719d9d719587e745d5562d122cf6846", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1719d9d719587e745d5562d122cf6846") : String.valueOf(this.m.b.a);
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1170d449bf603741a802c1cb98e037e1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1170d449bf603741a802c1cb98e037e1") : String.valueOf(this.m.a.f);
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final String s() {
        return this.m.a.g;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75bcec692163e0ba23a36a81dce11e09", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75bcec692163e0ba23a36a81dce11e09")).booleanValue();
        }
        if (bVar.b != 0) {
            b(bVar.b);
        }
        return super.a(bVar);
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c09a1ddcebb4707b8c2590aed133c68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c09a1ddcebb4707b8c2590aed133c68");
            return;
        }
        ISendPanelAdapter sendPanelAdapter = this.v.getSendPanelAdapter();
        if (sendPanelAdapter instanceof BadCommentGroupChatSendPanelAdapter) {
            ((BadCommentGroupChatSendPanelAdapter) sendPanelAdapter).a(true, str);
        }
    }
}
