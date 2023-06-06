package com.sankuai.waimai.business.im.group.chat;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.time.c;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment;
import com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter;
import com.sankuai.waimai.business.im.common.api.WmImFoodSafetyGroupService;
import com.sankuai.waimai.business.im.common.message.i;
import com.sankuai.waimai.business.im.common.model.a;
import com.sankuai.waimai.business.im.common.model.g;
import com.sankuai.waimai.business.im.common.view.WMIMRedPacketDialog;
import com.sankuai.waimai.business.im.group.adapter.FoodSafetyGroupChatBannerAdapter;
import com.sankuai.waimai.business.im.group.adapter.FoodSafetyGroupChatMsgViewAdapter;
import com.sankuai.waimai.business.im.group.adapter.FoodSafetyGroupChatSendPanelAdapter;
import com.sankuai.waimai.business.im.model.IMRedPacketData;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.LinkTextView;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMFoodSafetyGroupChatFragment extends BaseMachChatFragment {
    public static ChangeQuickRedirect k;
    private String A;
    private a l;
    private SessionParams m;
    private int y;
    private int z;

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final Map<String, Object> a(String str, b<GeneralMessage> bVar) {
        return null;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment
    public final int e() {
        return 301;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final int p() {
        return 301;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.chatpage.BasePvChatFragment, com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae16dfedf6704f979cbebfce1a4b1403", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae16dfedf6704f979cbebfce1a4b1403");
            return;
        }
        super.onCreate(bundle);
        if (UserCenter.getInstance(getActivity()).getUser() == null) {
            getActivity().finish();
            return;
        }
        c.a(getContext());
        this.m = this.t;
        if (this.m != null && (bundle2 = this.m.u) != null) {
            this.l = (a) f.a(bundle2, "chat_param_data");
            this.y = bundle2.getInt("chat_param_from");
            this.z = bundle2.getInt("show_emotion", 0);
            this.j = bundle2.getInt("ref", 0);
            try {
                this.b = (WMCommonDataInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(this.l.c, (Class<Object>) WMCommonDataInfo.class);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        Intent intent = getActivity().getIntent();
        int i = this.y;
        Object[] objArr2 = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8634c0bb14fd72f27f579fe07a28d65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8634c0bb14fd72f27f579fe07a28d65");
        } else if (intent != null) {
            Uri data = intent.getData();
            intent.setData((data == null ? new Uri.Builder() : data.buildUpon()).appendQueryParameter("source", String.valueOf(i)).build());
        }
        FragmentActivity activity = getActivity();
        if (this.l == null) {
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
                return;
            }
        } else {
            com.sankuai.waimai.imbase.manager.b.a().f();
            if (this.l.b.j == 3) {
                this.A = this.l.b.k;
            } else if (this.l.b.a()) {
                this.A = "抱歉，聊天已结束";
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = k;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "93900eaf438b77cea21b4180b6a98479", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "93900eaf438b77cea21b4180b6a98479");
        } else {
            com.meituan.roodesign.resfetcher.runtime.c.a(getActivity(), "waimai_c_waimai_c_im_safe_food_poi_red_packet_bg", new com.meituan.roodesign.resfetcher.runtime.b() { // from class: com.sankuai.waimai.business.im.group.chat.WMFoodSafetyGroupChatFragment.1
                @Override // com.meituan.roodesign.resfetcher.runtime.b
                public final void a(Drawable drawable, boolean z) {
                }
            });
            com.meituan.roodesign.resfetcher.runtime.c.a(getActivity(), "waimai_c_waimai_c_im_safe_food_poi_red_packet_icon", new com.meituan.roodesign.resfetcher.runtime.b() { // from class: com.sankuai.waimai.business.im.group.chat.WMFoodSafetyGroupChatFragment.2
                @Override // com.meituan.roodesign.resfetcher.runtime.b
                public final void a(Drawable drawable, boolean z) {
                }
            });
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("__ffpdp", "001");
        hashMap.put("wm_im_type", String.valueOf(com.sankuai.waimai.business.im.utils.c.a(301)));
        com.sankuai.waimai.business.im.utils.c.a(hashMap);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment
    public final void a(d.a aVar) {
        int i = 1;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33fbed2e03727c55f78fe8a3fc93fcbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33fbed2e03727c55f78fe8a3fc93fcbf");
            return;
        }
        super.a(aVar);
        if (this.y == 12) {
            aVar.a("i_source", 3);
        }
        Object[] objArr2 = {this.l};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5360d52509d4b39f5322edf49ffb9215", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5360d52509d4b39f5322edf49ffb9215")).intValue();
        } else if (this.l.b.c != 1) {
            i = 0;
        }
        aVar.a("status", Integer.valueOf(i));
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment, com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fca22338d7276e521390429aeb5dd4f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fca22338d7276e521390429aeb5dd4f2");
            return;
        }
        super.onResume();
        if (TextUtils.isEmpty(this.A)) {
            return;
        }
        a(this.A);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final ISendPanelAdapter bo_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e208ab8421efb37b10abfd16a115160f", RobustBitConfig.DEFAULT_VALUE) ? (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e208ab8421efb37b10abfd16a115160f") : new FoodSafetyGroupChatSendPanelAdapter(null, this.z);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c76eb6855e94a60a489752cacc1aa3a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c76eb6855e94a60a489752cacc1aa3a8");
        } else {
            super.onDestroy();
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final TitleBarAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c8f8a4c9dd0bde502324dffc1811d13", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c8f8a4c9dd0bde502324dffc1811d13");
        }
        WMIMTitleBarAdapter wMIMTitleBarAdapter = new WMIMTitleBarAdapter(new WMIMTitleBarAdapter.a() { // from class: com.sankuai.waimai.business.im.group.chat.WMFoodSafetyGroupChatFragment.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter.a
            public final void a() {
            }

            @Override // com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6c9a685de56ff6f22647d2d035f1857", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6c9a685de56ff6f22647d2d035f1857");
                } else if (WMFoodSafetyGroupChatFragment.this.getActivity() == null || WMFoodSafetyGroupChatFragment.this.getActivity().isFinishing()) {
                } else {
                    com.sankuai.waimai.foundation.router.a.a(WMFoodSafetyGroupChatFragment.this.getActivity(), WMFoodSafetyGroupChatFragment.this.l.b.n);
                }
            }
        });
        String str = "商家";
        if (this.l != null && this.l.a != null) {
            str = "商家-" + this.l.a.a;
        }
        wMIMTitleBarAdapter.b = str;
        wMIMTitleBarAdapter.c = "售后";
        wMIMTitleBarAdapter.n = R.drawable.wm_food_safety_tag_bg;
        wMIMTitleBarAdapter.k = true;
        return wMIMTitleBarAdapter;
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.a
    public final IBannerAdapter b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "627659f2aa577897a94c417818a06c82", RobustBitConfig.DEFAULT_VALUE) ? (IBannerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "627659f2aa577897a94c417818a06c82") : new FoodSafetyGroupChatBannerAdapter(this.l);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final IMsgViewAdapter d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "082aaa62fbe888e9375d7ebfcf562591", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMsgViewAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "082aaa62fbe888e9375d7ebfcf562591");
        }
        if (this.b != null && this.b.a) {
            try {
                String str = this.b.b;
                this.b.c = (List) com.sankuai.waimai.mach.utils.b.a().fromJson(str, new TypeToken<List<WMCommonDataInfo.IMDynamicCard>>() { // from class: com.sankuai.waimai.business.im.group.chat.WMFoodSafetyGroupChatFragment.4
                }.getType());
                this.c = new com.sankuai.waimai.business.im.common.presenter.a(this.e, getActivity(), this.b, this);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        return new FoodSafetyGroupChatMsgViewAdapter(this.b, this);
    }

    private void a(com.sankuai.waimai.business.im.group.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d12e3543c09240bb0f3327c4f1b63863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d12e3543c09240bb0f3327c4f1b63863");
            return;
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9e50b121772a30d8ca5952bebf3f3b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9e50b121772a30d8ca5952bebf3f3b7");
        } else {
            this.A = aVar.b;
            a(this.A);
            String str = aVar.a;
            Object[] objArr3 = {str, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect3 = k;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "02c4ead0f5fabe4d65b1a3d146cacf93", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "02c4ead0f5fabe4d65b1a3d146cacf93");
            } else if (!TextUtils.isEmpty(str)) {
                EventMessage b = com.sankuai.xm.imui.common.util.c.b(str);
                b((IMMessage) b);
                com.sankuai.waimai.imbase.utils.f.b(b, true);
            }
        }
        com.sankuai.waimai.business.im.group.knb.a.a(this.l.b.a);
        com.sankuai.waimai.imbase.manager.b.a().f();
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final void b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24416b057657c865216551ce463c1f66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24416b057657c865216551ce463c1f66");
        } else if (iMMessage != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("version", com.sankuai.waimai.platform.b.A().i());
            hashMap.put("source", "android");
            hashMap.put("role_type", "3");
            iMMessage.appendExtension(hashMap);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(int i, b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23b98147d43a83fe985ac9279d5e5613", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23b98147d43a83fe985ac9279d5e5613")).booleanValue();
        }
        if (i == 10100) {
            return true;
        }
        if (i == 10007) {
            com.sankuai.waimai.imbase.manager.b.a().a(getActivity());
        }
        if (i == 20001) {
            a(new com.sankuai.waimai.business.im.group.model.a("商家因违规，聊天已被终止", "聊天已结束"));
        }
        if (i == 20002 || i == 20005 || i == 20003 || i == 20004) {
            a(new com.sankuai.waimai.business.im.group.model.a("", "聊天已结束"));
        }
        return super.a(i, bVar);
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final String q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37338e4e4afe681fe60b3fc96a37806e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37338e4e4afe681fe60b3fc96a37806e") : String.valueOf(this.l.b.a);
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb94f80517cc3f256066a1ab4ccf595f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb94f80517cc3f256066a1ab4ccf595f") : String.valueOf(this.l.a.f);
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @Nullable
    public final String s() {
        return this.l.a.g;
    }

    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final void b_(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40032522189bbd12a371ce8a47450b80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40032522189bbd12a371ce8a47450b80");
            return;
        }
        try {
            int a = r.a(String.valueOf(map.get("isExpired")), 0);
            final IMRedPacketData iMRedPacketData = (IMRedPacketData) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(map.get("item")), (Class<Object>) IMRedPacketData.class);
            final i iVar = new i();
            iMRedPacketData.poi_id_str = this.l.a.g;
            final FragmentActivity activity = getActivity();
            ?? r1 = a == 1 ? 1 : 0;
            Object[] objArr2 = {activity, null, iMRedPacketData, Byte.valueOf((byte) r1)};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "a09c92d2ff615f3f4167c491ecb521a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "a09c92d2ff615f3f4167c491ecb521a5");
            } else if (activity != null) {
                iVar.b = new WMIMRedPacketDialog(activity);
                iVar.b.getWindow().setBackgroundDrawableResource(R.color.transparent);
                iVar.b.d = new WMIMRedPacketDialog.a() { // from class: com.sankuai.waimai.business.im.common.message.i.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.im.common.view.WMIMRedPacketDialog.a
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b1f0ca4cba1d08849f393720ca50f056", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b1f0ca4cba1d08849f393720ca50f056");
                            return;
                        }
                        final i iVar2 = iVar;
                        final Context context = activity;
                        final IMRedPacketData iMRedPacketData2 = iMRedPacketData;
                        Object[] objArr4 = {context, iMRedPacketData2};
                        ChangeQuickRedirect changeQuickRedirect4 = i.a;
                        if (PatchProxy.isSupport(objArr4, iVar2, changeQuickRedirect4, false, "0dd3969a8251d3bd1f1eb211e94b0631", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, iVar2, changeQuickRedirect4, false, "0dd3969a8251d3bd1f1eb211e94b0631");
                            return;
                        }
                        final Dialog a2 = com.sankuai.waimai.foundation.core.utils.d.a(context);
                        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImFoodSafetyGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImFoodSafetyGroupService.class)).takeRedPacket(r.a(iMRedPacketData2.poi_id, 0L), iMRedPacketData2.poi_id_str, r.a(iMRedPacketData2.group_id, 0L), r.a(iMRedPacketData2.poi_wallet_id, 0L), r.a(iMRedPacketData2.out_id, 0L)), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.common.model.g>>() { // from class: com.sankuai.waimai.business.im.common.message.i.2
                            public static ChangeQuickRedirect a;

                            @Override // rx.e
                            public final /* synthetic */ void onNext(Object obj) {
                                BaseResponse baseResponse = (BaseResponse) obj;
                                Object[] objArr5 = {baseResponse};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "14b8455a955111af3df849cead8d576d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "14b8455a955111af3df849cead8d576d");
                                    return;
                                }
                                com.sankuai.waimai.foundation.core.utils.d.a(a2);
                                if (baseResponse.isSuccess()) {
                                    com.sankuai.waimai.business.im.common.model.g gVar = (com.sankuai.waimai.business.im.common.model.g) baseResponse.data;
                                    if (gVar != null) {
                                        if (gVar.b == 0) {
                                            com.sankuai.waimai.foundation.core.utils.d.a(iVar2.b);
                                            iVar2.a(context, gVar, iMRedPacketData2);
                                            return;
                                        } else if (gVar.b == 1) {
                                            if (iVar2.b == null || !iVar2.b.isShowing()) {
                                                return;
                                            }
                                            WMIMRedPacketDialog wMIMRedPacketDialog = iVar2.b;
                                            wMIMRedPacketDialog.c = true;
                                            wMIMRedPacketDialog.a(iMRedPacketData2);
                                            return;
                                        } else if (gVar.b == 2) {
                                            com.sankuai.waimai.foundation.core.utils.d.a(iVar2.b);
                                            iVar2.a(context, gVar, iMRedPacketData2);
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                } else if (context == null) {
                                    return;
                                }
                                ae.b(context, baseResponse.msg);
                            }

                            @Override // rx.e
                            public final void onError(Throwable th) {
                                Object[] objArr5 = {th};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2c055fe489a9644d08b96d948693d064", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2c055fe489a9644d08b96d948693d064");
                                    return;
                                }
                                com.sankuai.waimai.foundation.core.utils.d.a(a2);
                                ae.b(context, context.getResources().getString(R.string.wm_im_red_packet_fail_response));
                            }
                        }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
                    }
                };
                WMIMRedPacketDialog wMIMRedPacketDialog = iVar.b;
                wMIMRedPacketDialog.c = r1;
                wMIMRedPacketDialog.b = iMRedPacketData;
                wMIMRedPacketDialog.show();
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94e1763a27955b0273f04d663707017e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94e1763a27955b0273f04d663707017e");
            return;
        }
        try {
            new i().a(getActivity(), (g) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(map.get("resp")), (Class<Object>) g.class), (IMRedPacketData) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(map.get("item")), (Class<Object>) IMRedPacketData.class));
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6d17e437718fabb88f991fd439a729c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6d17e437718fabb88f991fd439a729c")).booleanValue();
        }
        if (bVar != null) {
            b(bVar.b);
        }
        return super.a(bVar);
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a06a2ffe84b9b1a42cbe900dd511177c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a06a2ffe84b9b1a42cbe900dd511177c");
            return;
        }
        ISendPanelAdapter sendPanelAdapter = this.v.getSendPanelAdapter();
        if (sendPanelAdapter instanceof FoodSafetyGroupChatSendPanelAdapter) {
            FoodSafetyGroupChatSendPanelAdapter foodSafetyGroupChatSendPanelAdapter = (FoodSafetyGroupChatSendPanelAdapter) sendPanelAdapter;
            foodSafetyGroupChatSendPanelAdapter.a(true, str);
            foodSafetyGroupChatSendPanelAdapter.a(getActivity(), str, new LinkTextView.b() { // from class: com.sankuai.waimai.business.im.group.chat.WMFoodSafetyGroupChatFragment.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.imui.common.view.LinkTextView.b
                public final boolean a(String str2) {
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e722afa2cc66b71c82b60191b8ea4ac", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e722afa2cc66b71c82b60191b8ea4ac")).booleanValue();
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("tag_type", 4);
                    JudasManualManager.a("b_waimai_ol3y9nts_mc").a("c_waimai_wgiu7lrd").a((Map<String, Object>) hashMap).a();
                    if (!TextUtils.isEmpty(str2)) {
                        com.sankuai.waimai.foundation.router.a.a(WMFoodSafetyGroupChatFragment.this.getActivity(), str2);
                    }
                    return true;
                }
            });
        }
    }
}
