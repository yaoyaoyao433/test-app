package com.sankuai.waimai.business.im.group.chat;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.ColorInt;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.time.c;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment;
import com.sankuai.waimai.business.im.common.message.IMMessageAdapter;
import com.sankuai.waimai.business.im.group.adapter.WMUserGroupChatCommonAdapter;
import com.sankuai.waimai.business.im.group.adapter.WMUserMachGroupBannerBarAdapter;
import com.sankuai.waimai.business.im.group.adapter.WMUserMachGroupSendPanelAdapter;
import com.sankuai.waimai.business.im.group.adapter.WMUserMachGroupTitleBarAdapter;
import com.sankuai.waimai.business.im.group.model.g;
import com.sankuai.waimai.business.im.group.model.i;
import com.sankuai.waimai.business.im.group.view.WMPoiCouponViewDialog;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.model.j;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.d;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.mach.utils.b;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.titlebar.DefaultTitleBarAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.ImageMsgAdapter;
import com.tencent.smtt.sdk.TbsListener;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMUserGroupChatFragment extends BaseMachChatFragment implements IMClient.i {
    public static ChangeQuickRedirect k;
    private SessionParams A;
    private WMUserMachGroupSendPanelAdapter B;
    private WMUserMachGroupTitleBarAdapter C;
    private WMUserMachGroupBannerBarAdapter D;
    private BroadcastReceiver E;
    private String F;
    private boolean G;
    public Handler l;
    public Runnable m;
    private long y;
    private g z;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class CouponData {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("coupon_amount")
        public String couponAmount;
        @SerializedName("coupon_desc")
        public String couponDesc;
        @SerializedName("coupon_id")
        public long couponID;
        @SerializedName("coupon_user_limit")
        public String couponLimit;
        @SerializedName("coupon_name")
        public String couponName;
        @SerializedName("coupon_tag")
        public String couponTag;
        @SerializedName("title")
        public String title;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment
    public final int e() {
        return TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final int p() {
        return TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM;
    }

    public WMUserGroupChatFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dde913c8f9d2191601574690bf482cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dde913c8f9d2191601574690bf482cb");
            return;
        }
        this.l = new Handler(Looper.getMainLooper());
        this.G = false;
        this.m = new Runnable() { // from class: com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f22e0e3e5eb1b244dfe4e69569b908a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f22e0e3e5eb1b244dfe4e69569b908a");
                    return;
                }
                WMUserGroupChatFragment.a(WMUserGroupChatFragment.this, true);
                WMUserGroupChatFragment.this.a(WMUserGroupChatFragment.this.F);
            }
        };
    }

    public static /* synthetic */ void a(WMUserGroupChatFragment wMUserGroupChatFragment, Intent intent) {
        SessionId a2;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, wMUserGroupChatFragment, changeQuickRedirect, false, "eebdb4924a829e4391c9fe860910b312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wMUserGroupChatFragment, changeQuickRedirect, false, "eebdb4924a829e4391c9fe860910b312");
            return;
        }
        String a3 = f.a(intent, "data");
        if (TextUtils.isEmpty(a3)) {
            return;
        }
        try {
            String optString = new JSONObject(a3).optString("groupId", "");
            if (TextUtils.isEmpty(optString) || (a2 = SessionId.a(r.a(optString, 0L), 0L, 2, (short) 0, (short) 1036)) == null) {
                return;
            }
            IMClient.a().a(a2, true, new com.sankuai.xm.im.a<Void>() { // from class: com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    Object[] objArr2 = {(Void) obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57aef0ebd2acb3867456ffcc014e296a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57aef0ebd2acb3867456ffcc014e296a");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.c("WMUserGroupChatFragment", "group exitGroup#onSuccess,退出群聊删除本地会话成功", new Object[0]);
                    if (WMUserGroupChatFragment.this.getActivity() == null || com.sankuai.waimai.foundation.utils.f.a(WMUserGroupChatFragment.this.getActivity())) {
                        return;
                    }
                    WMUserGroupChatFragment.this.getActivity().finish();
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf7eae16b6ab2185a2b91bc6c9396ab6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf7eae16b6ab2185a2b91bc6c9396ab6");
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.c("WMUserGroupChatFragment", "group exitGroup#onFailure,退出群聊删除本地会话失败", new Object[0]);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void a(WMUserGroupChatFragment wMUserGroupChatFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, wMUserGroupChatFragment, changeQuickRedirect, false, "70f665e14b6fdb96da1b8faf2c73c10e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wMUserGroupChatFragment, changeQuickRedirect, false, "70f665e14b6fdb96da1b8faf2c73c10e");
            return;
        }
        wMUserGroupChatFragment.F = str;
        wMUserGroupChatFragment.G = false;
        wMUserGroupChatFragment.l.removeCallbacksAndMessages(null);
        wMUserGroupChatFragment.a(str);
    }

    public static /* synthetic */ boolean a(WMUserGroupChatFragment wMUserGroupChatFragment, boolean z) {
        wMUserGroupChatFragment.G = true;
        return true;
    }

    public static /* synthetic */ void b(WMUserGroupChatFragment wMUserGroupChatFragment, Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, wMUserGroupChatFragment, changeQuickRedirect, false, "083443c4aafdf93ce4d74380a6311b4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wMUserGroupChatFragment, changeQuickRedirect, false, "083443c4aafdf93ce4d74380a6311b4b");
            return;
        }
        String a2 = f.a(intent, "data");
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(a2);
            String optString = jSONObject.optString("groupId", "");
            boolean optBoolean = jSONObject.optBoolean("isOpen", false);
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            com.sankuai.waimai.imbase.manager.f.a().a(optString, optBoolean ? 1 : 0);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final /* synthetic */ TitleBarAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6db8ebf3ca234e6a621b24ec67dae74e", RobustBitConfig.DEFAULT_VALUE)) {
            return (DefaultTitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6db8ebf3ca234e6a621b24ec67dae74e");
        }
        if (this.C == null && this.z != null) {
            this.C = new WMUserMachGroupTitleBarAdapter(this);
        }
        return this.C;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.chatpage.BasePvChatFragment, com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3216ae0f03b4d9f2978b6f4f13b2883c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3216ae0f03b4d9f2978b6f4f13b2883c");
            return;
        }
        super.onCreate(bundle);
        com.meituan.android.bus.a.a().a(this);
        this.f = true;
        this.g = true;
        if (UserCenter.getInstance(getActivity()).getUser() == null) {
            getActivity().finish();
            return;
        }
        c.a(getContext());
        this.A = this.t;
        if (this.A != null) {
            Bundle bundle2 = this.A.u;
            if (bundle2 != null) {
                this.z = (g) f.a(bundle2, "chat_param_data");
                try {
                    this.b = (WMCommonDataInfo) b.a().fromJson(this.z.q, (Class<Object>) WMCommonDataInfo.class);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
                this.y = bundle2.getLong("group_im_id");
                JudasManualManager.b("b_waimai_4e4fk0yv_mv").a("poi_id", com.sankuai.waimai.business.im.utils.a.a(this.z.g, this.z.h)).a("group_id", this.y).a();
            }
            com.sankuai.waimai.imbase.manager.b.a().f();
        }
        a(this.z);
        B();
        JudasManualManager.b("b_waimai_9jb0q406_mv").a("poi_id", com.sankuai.waimai.business.im.utils.a.a(this.z.g, this.z.h)).a("group_id", this.y).a();
        if (!TextUtils.isEmpty(this.z.o)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("role_type", "4");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            TextMessage a2 = com.sankuai.xm.imui.common.util.c.a(this.z.o);
            a2.setFromUid(this.z.f);
            a2.setChatId(com.sankuai.xm.imui.b.a().d());
            a2.setCategory(com.sankuai.xm.imui.b.a().e());
            a2.setPeerUid(com.sankuai.xm.imui.b.a().f().c);
            a2.setToUid(com.sankuai.xm.imui.b.a().d());
            a2.setToAppId(com.sankuai.xm.imui.b.a().g());
            a2.setPeerAppId(com.sankuai.xm.imui.b.a().g());
            a2.setMsgStatus(9);
            a2.setChannel(com.sankuai.xm.imui.b.a().f().g);
            a2.setExtension(jSONObject.toString());
            com.sankuai.waimai.imbase.configuration.a.a().a((IMMessage) a2, false, (IMClient.g<Integer>) null);
        }
        if (this.z.j != null && this.z.j.length() > 0) {
            final WMPoiCouponViewDialog wMPoiCouponViewDialog = new WMPoiCouponViewDialog(getActivity());
            try {
                CouponData couponData = (CouponData) k.a().fromJson(this.z.j, (Class<Object>) CouponData.class);
                wMPoiCouponViewDialog.getWindow().setBackgroundDrawableResource(R.color.transparent);
                wMPoiCouponViewDialog.b = couponData.title;
                wMPoiCouponViewDialog.e = couponData.couponDesc;
                wMPoiCouponViewDialog.c = couponData.couponName;
                wMPoiCouponViewDialog.d = couponData.couponTag;
                wMPoiCouponViewDialog.f = couponData.couponAmount;
                wMPoiCouponViewDialog.g = couponData.couponLimit;
                wMPoiCouponViewDialog.h = new WMPoiCouponViewDialog.a() { // from class: com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.im.group.view.WMPoiCouponViewDialog.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98bde94e0d807e00b73b6c9c2a263184", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98bde94e0d807e00b73b6c9c2a263184");
                        } else {
                            wMPoiCouponViewDialog.dismiss();
                        }
                    }
                };
                wMPoiCouponViewDialog.show();
                com.sankuai.waimai.imbase.utils.f.b(com.sankuai.xm.imui.common.util.c.a(new com.sankuai.waimai.business.im.model.c(String.format("你成功领取了%s元粉丝群专属优惠券", couponData.couponAmount), this.z.i, this.z.n, this.z.g, this.z.h).a(2020), 0, "您成功领取了优惠券 去使用"), false);
            } catch (Exception e3) {
                com.sankuai.waimai.foundation.utils.log.a.a(e3);
            }
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61e1772e2a219a930c9a730ce0050fde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61e1772e2a219a930c9a730ce0050fde");
        } else {
            this.E = new BroadcastReceiver() { // from class: com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.2
                public static ChangeQuickRedirect a;

                /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
                    if (r0.equals("waimai:im_groupInfo_switchDisturb") == false) goto L19;
                 */
                @Override // android.content.BroadcastReceiver
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onReceive(android.content.Context r12, android.content.Intent r13) {
                    /*
                        r11 = this;
                        r0 = 2
                        java.lang.Object[] r0 = new java.lang.Object[r0]
                        r8 = 0
                        r0[r8] = r12
                        r12 = 1
                        r0[r12] = r13
                        com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.AnonymousClass2.a
                        java.lang.String r10 = "9f2c41afbb9eb76be49fa7d7ff492b60"
                        r4 = 0
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r0
                        r2 = r11
                        r3 = r9
                        r5 = r10
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L1e
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
                        return
                    L1e:
                        if (r13 == 0) goto L5a
                        java.lang.String r0 = r13.getAction()
                        r1 = -1
                        int r2 = r0.hashCode()
                        r3 = 49450072(0x2f28c58, float:3.5639257E-37)
                        if (r2 == r3) goto L3e
                        r3 = 688416002(0x29086502, float:3.0285677E-14)
                        if (r2 == r3) goto L34
                        goto L49
                    L34:
                        java.lang.String r2 = "waimai:im_groupInfo_switchDisturb"
                        boolean r0 = r0.equals(r2)
                        if (r0 == 0) goto L49
                        goto L4a
                    L3e:
                        java.lang.String r12 = "waimai:im_groupInfo_exitGroup"
                        boolean r12 = r0.equals(r12)
                        if (r12 == 0) goto L49
                        r12 = 0
                        goto L4a
                    L49:
                        r12 = -1
                    L4a:
                        switch(r12) {
                            case 0: goto L54;
                            case 1: goto L4e;
                            default: goto L4d;
                        }
                    L4d:
                        goto L5a
                    L4e:
                        com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment r12 = com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.this
                        com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.b(r12, r13)
                        goto L5a
                    L54:
                        com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment r12 = com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.this
                        com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.a(r12, r13)
                        return
                    L5a:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.AnonymousClass2.onReceive(android.content.Context, android.content.Intent):void");
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("waimai:im_groupInfo_exitGroup");
            intentFilter.addAction("waimai:im_groupInfo_switchDisturb");
            getActivity().registerReceiver(this.E, intentFilter);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("__ffpdp", "001");
        hashMap.put("wm_im_type", String.valueOf(com.sankuai.waimai.business.im.utils.c.a((int) TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM)));
        com.sankuai.waimai.business.im.utils.c.a(hashMap);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
        List list;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "146de66aeef1ee7ddc1e2edb01d0b75d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "146de66aeef1ee7ddc1e2edb01d0b75d");
            return;
        }
        super.onViewCreated(view, bundle);
        final WMUserMachGroupSendPanelAdapter wMUserMachGroupSendPanelAdapter = this.B;
        g gVar = this.z;
        Object[] objArr2 = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = WMUserMachGroupSendPanelAdapter.f;
        if (PatchProxy.isSupport(objArr2, wMUserMachGroupSendPanelAdapter, changeQuickRedirect2, false, "25caa9ae763cd91dcfdaea00fe7413c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, wMUserMachGroupSendPanelAdapter, changeQuickRedirect2, false, "25caa9ae763cd91dcfdaea00fe7413c5");
        } else if (gVar != null) {
            wMUserMachGroupSendPanelAdapter.i = gVar.p;
            if (wMUserMachGroupSendPanelAdapter.i != null && wMUserMachGroupSendPanelAdapter.i.a != null) {
                for (int i = 0; i < wMUserMachGroupSendPanelAdapter.i.a.size(); i++) {
                    i iVar = wMUserMachGroupSendPanelAdapter.i.a.get(i);
                    if (iVar != null && iVar.d == 1) {
                        try {
                            list = (List) d.a().fromJson(iVar.e, new TypeToken<List<String>>() { // from class: com.sankuai.waimai.business.im.group.adapter.WMUserMachGroupSendPanelAdapter.2
                            }.getType());
                        } catch (Exception unused) {
                            list = null;
                        }
                        if (list != null) {
                            for (int i2 = 0; i2 < list.size(); i2++) {
                                String[] split = ((String) list.get(i2)).split(CommonConstant.Symbol.COLON);
                                if (split != null && split.length >= 2) {
                                    if (wMUserMachGroupSendPanelAdapter.i.b == null) {
                                        wMUserMachGroupSendPanelAdapter.i.b = new LinkedHashMap();
                                    }
                                    wMUserMachGroupSendPanelAdapter.i.b.put(split[1], split[0]);
                                }
                            }
                        }
                    }
                }
            }
            j jVar = new j();
            jVar.b = "waimai_im_im_group_send_style_1";
            jVar.e = b.a(b.a().toJson(gVar));
            jVar.d = "";
            jVar.c = "waimai_im_mach";
            wMUserMachGroupSendPanelAdapter.k = (WMUserMachGroupSendPanelAdapter.a) wMUserMachGroupSendPanelAdapter.h.getTag();
            wMUserMachGroupSendPanelAdapter.k.a.a(jVar, "waimai_im_im_group_send_style_1", "", (WMCommonDataInfo.IMDynamicCard) null);
        }
        a(this.z);
        B();
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e573b1589efd4dcaf166c725d62ac6ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e573b1589efd4dcaf166c725d62ac6ab");
            return;
        }
        super.onStart();
        this.d.b();
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment, com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "902bb460d94ad22d7c172c388f4d2b89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "902bb460d94ad22d7c172c388f4d2b89");
            return;
        }
        super.onResume();
        if (this.z.k.length() > 0) {
            a(false, this.z.k);
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment
    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07f62235374f299ac9b5470a38e08802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07f62235374f299ac9b5470a38e08802");
        } else {
            super.a(aVar);
        }
    }

    private void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39496462208fe94ea6406d6606fe99c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39496462208fe94ea6406d6606fe99c3");
        } else if (this.C != null) {
            this.C.a(gVar);
        }
    }

    private void B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "822e9dd1fe7f68634f51b0c8857a9fd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "822e9dd1fe7f68634f51b0c8857a9fd0");
        } else if (this.D != null) {
            this.D.a(this.z);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final ISendPanelAdapter bo_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7791cc7ffd8fa09f80ccf5981b766a24", RobustBitConfig.DEFAULT_VALUE)) {
            return (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7791cc7ffd8fa09f80ccf5981b766a24");
        }
        this.B = new WMUserMachGroupSendPanelAdapter(this);
        try {
            this.b = (WMCommonDataInfo) b.a().fromJson(this.z.q, (Class<Object>) WMCommonDataInfo.class);
            if (this.b != null && this.b.a) {
                String str = this.b.b;
                this.b.c = (List) b.a().fromJson(str, new TypeToken<List<WMCommonDataInfo.IMDynamicCard>>() { // from class: com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.4
                }.getType());
                this.c = new com.sankuai.waimai.business.im.common.presenter.a(this.e, getActivity(), this.b, this);
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        this.B.j = new a() { // from class: com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.a
            public final void a(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61a141b1db9d9aa723fa17fa50a873ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61a141b1db9d9aa723fa17fa50a873ca");
                } else {
                    WMUserGroupChatFragment.a(WMUserGroupChatFragment.this, str2);
                }
            }
        };
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58567dd3724b757d2bd76c48c3a7e796", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58567dd3724b757d2bd76c48c3a7e796");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            IMMessage iMMessage = new IMMessage();
            iMMessage.setMsgUuid(str);
            b(iMMessage, new com.sankuai.xm.im.a<Integer>() { // from class: com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str2) {
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    Object[] objArr2 = {(Integer) obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d535e44c1c6e927e7713bb0b7b1f89e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d535e44c1c6e927e7713bb0b7b1f89e6");
                    } else if (WMUserGroupChatFragment.this.G) {
                    } else {
                        WMUserGroupChatFragment.this.l.postDelayed(WMUserGroupChatFragment.this.m, 200L);
                    }
                }
            });
        }
    }

    @Subscribe
    public void onExitUserGroup(com.sankuai.waimai.imbase.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1a5fb9a974c3542686a5a001218cb4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1a5fb9a974c3542686a5a001218cb4a");
        } else if (aVar == null || getActivity() == null || com.sankuai.waimai.foundation.utils.f.a(getActivity())) {
        } else {
            getActivity().finish();
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f25212551152dab74580f6175b76944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f25212551152dab74580f6175b76944");
            return;
        }
        this.l.removeCallbacksAndMessages(null);
        super.onDestroy();
        com.meituan.android.bus.a.a().b(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6dcfacf1af56be80579b48e6a740c9b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6dcfacf1af56be80579b48e6a740c9b0");
        } else if (this.E != null) {
            getActivity().unregisterReceiver(this.E);
        }
        if (this.B != null) {
            this.B.b();
        }
        if (this.d != null) {
            this.d.c();
        }
        if (this.c != null) {
            this.c.b();
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.a
    public final IBannerAdapter b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d4e4cd7ecef47f205e12a9157e03f54", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBannerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d4e4cd7ecef47f205e12a9157e03f54");
        }
        if (this.D == null && this.z != null) {
            this.D = new WMUserMachGroupBannerBarAdapter(getContext(), this);
        }
        return this.D;
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final IMsgViewAdapter d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e15bca30ed958bd8d7379be98632b60", RobustBitConfig.DEFAULT_VALUE) ? (IMsgViewAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e15bca30ed958bd8d7379be98632b60") : new IMsgViewAdapter() { // from class: com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
            public ICommonAdapter getCommonAdapter() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "168c560a941153a34ea0a780dffc4be8", RobustBitConfig.DEFAULT_VALUE) ? (ICommonAdapter) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "168c560a941153a34ea0a780dffc4be8") : new WMUserGroupChatCommonAdapter(WMUserGroupChatFragment.this.z, WMUserGroupChatFragment.this.y) { // from class: com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.8.1
                    public static ChangeQuickRedirect c;

                    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
                    public void onAvatarClick(View view, com.sankuai.xm.imui.session.entity.b bVar) {
                        Object[] objArr3 = {view, bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = c;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2c0670786b64f8552ab7e172b700a152", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2c0670786b64f8552ab7e172b700a152");
                        } else if (bVar.b.getFromUid() == WMUserGroupChatFragment.this.z.f) {
                            JudasManualManager.a("b_waimai_eg3im2r7_mc").a("poi_id", com.sankuai.waimai.business.im.utils.a.a(WMUserGroupChatFragment.this.z.g, WMUserGroupChatFragment.this.z.h)).a("group_id", WMUserGroupChatFragment.this.y).a();
                            com.sankuai.waimai.business.im.api.a.a().a((Activity) WMUserGroupChatFragment.this.getActivity(), (SessionId) null, 1, 0L, WMUserGroupChatFragment.this.z.g, WMUserGroupChatFragment.this.z.h, 0L, 10, "", false);
                        }
                    }
                };
            }

            @Override // com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
            public IExtraAdapter getExtraAdapter(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af4d7b8a14ce1ecfe983485fc6715249", RobustBitConfig.DEFAULT_VALUE)) {
                    return (IExtraAdapter) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af4d7b8a14ce1ecfe983485fc6715249");
                }
                if (i != 16) {
                    switch (i) {
                        case 2:
                        case 3:
                            return new ImageMsgAdapter() { // from class: com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment.8.2
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.xm.imui.session.view.adapter.impl.ImageMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IImageMsgAdapter
                                @ColorInt
                                public int getShapeBorderColor(com.sankuai.xm.imui.session.entity.b<ImageMessage> bVar) {
                                    Object[] objArr3 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f985bb2c5cb5071ba1fab91309c1861a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f985bb2c5cb5071ba1fab91309c1861a")).intValue() : this.e.getResources().getColor(R.color.transparent);
                                }
                            };
                        default:
                            return null;
                    }
                }
                return new IMMessageAdapter(WMUserGroupChatFragment.this.b, WMUserGroupChatFragment.this, "c_waimai_reae8s5i");
            }
        };
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "860395fae11462d8b10978ac4fa95b41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "860395fae11462d8b10978ac4fa95b41")).booleanValue();
        }
        try {
            HashMap hashMap = new HashMap();
            User user = UserCenter.getInstance(com.meituan.android.singleton.b.a).getUser();
            hashMap.put("poi_id", Long.valueOf(this.z.g));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.z.h);
            hashMap.put("c_name", user.username);
            hashMap.put("c_avatar_url", user.avatarurl == null ? "" : user.avatarurl);
            hashMap.put("user_id", Long.valueOf(user.id));
            hashMap.put("version", com.sankuai.waimai.platform.b.A().i());
            hashMap.put("source", "android");
            hashMap.put("group_name", this.z.a);
            hashMap.put("role_type", "3");
            hashMap.put("group_id", Long.valueOf(this.y));
            hashMap.put("uuid", com.sankuai.waimai.platform.b.A().c());
            hashMap.put("cx", com.sankuai.waimai.platform.b.A().F());
            hashMap.put("userIP", C());
            WMLocation i = com.sankuai.waimai.foundation.location.v2.g.a().i();
            if (i != null) {
                double latitude = i.getLatitude();
                double longitude = i.getLongitude();
                hashMap.put("gpslatitude", String.valueOf((long) (latitude * 1000000.0d)));
                hashMap.put("gpslongitude", String.valueOf((long) (longitude * 1000000.0d)));
            } else {
                hashMap.put("gpslatitude", "0");
                hashMap.put("gpslongitude", "0");
            }
            bVar.b.appendExtension(hashMap);
        } catch (Exception unused) {
        }
        return super.a(bVar);
    }

    private String C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae54fbcebdfd95e9e851dc67684fc1bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae54fbcebdfd95e9e851dc67684fc1bb");
        }
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                        return inetAddress.getHostAddress();
                    }
                }
            }
            return null;
        } catch (Exception | NoSuchMethodError unused) {
            return null;
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(int i, com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "797988b4e68a0b03d4def5a847baeb9f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "797988b4e68a0b03d4def5a847baeb9f")).booleanValue() : super.a(i, bVar);
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public final String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7279746b923a0bfed35f19086980ab2c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7279746b923a0bfed35f19086980ab2c") : String.valueOf(this.z.g);
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public final String s() {
        return this.z.h;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public final String q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fba59c477726363b407ae4e1594bc244", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fba59c477726363b407ae4e1594bc244") : String.valueOf(this.y);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aedd291a71b7a0ba014f2509815b4224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aedd291a71b7a0ba014f2509815b4224");
            return;
        }
        WMUserMachGroupBannerBarAdapter wMUserMachGroupBannerBarAdapter = this.D;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = WMUserMachGroupBannerBarAdapter.a;
        if (PatchProxy.isSupport(objArr2, wMUserMachGroupBannerBarAdapter, changeQuickRedirect2, false, "483e33632b730f12974995065dd0944d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, wMUserMachGroupBannerBarAdapter, changeQuickRedirect2, false, "483e33632b730f12974995065dd0944d");
        } else if (wMUserMachGroupBannerBarAdapter.b != null) {
            if (z) {
                wMUserMachGroupBannerBarAdapter.b.setVisibility(0);
                HashMap hashMap = new HashMap();
                hashMap.put("index", 1);
                wMUserMachGroupBannerBarAdapter.d.a.d().b("force_first_layout", hashMap);
                return;
            }
            wMUserMachGroupBannerBarAdapter.b.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af6cb9acc2ca01a7e945355ce106c67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af6cb9acc2ca01a7e945355ce106c67");
        } else {
            this.B.a(j);
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment, com.sankuai.waimai.business.im.common.contract.a
    public final void a(i iVar) {
        int i;
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6431ba58e0e9e1e29011c2fe4fc4c1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6431ba58e0e9e1e29011c2fe4fc4c1d");
            return;
        }
        final WMUserMachGroupSendPanelAdapter wMUserMachGroupSendPanelAdapter = this.B;
        Object[] objArr2 = {iVar};
        ChangeQuickRedirect changeQuickRedirect2 = WMUserMachGroupSendPanelAdapter.f;
        if (PatchProxy.isSupport(objArr2, wMUserMachGroupSendPanelAdapter, changeQuickRedirect2, false, "1666263bfa724a1add5157c41de0152c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, wMUserMachGroupSendPanelAdapter, changeQuickRedirect2, false, "1666263bfa724a1add5157c41de0152c");
        } else if (wMUserMachGroupSendPanelAdapter.j != null && wMUserMachGroupSendPanelAdapter.i != null) {
            if (iVar.d == 1) {
                if (wMUserMachGroupSendPanelAdapter.i.a != null) {
                    i = 0;
                    for (int i2 = 0; i2 < wMUserMachGroupSendPanelAdapter.i.a.size(); i2++) {
                        i iVar2 = wMUserMachGroupSendPanelAdapter.i.a.get(i2);
                        if (iVar2 != null && iVar2.d == 1) {
                            i++;
                        }
                    }
                } else {
                    i = 0;
                }
                if (i == 0 || wMUserMachGroupSendPanelAdapter.i.b == null) {
                    return;
                }
                try {
                    wMUserMachGroupSendPanelAdapter.j.a((String) wMUserMachGroupSendPanelAdapter.i.b.values().toArray()[wMUserMachGroupSendPanelAdapter.i.b.size() - 1]);
                } catch (Exception unused) {
                }
            } else if (iVar.d == 2 || iVar.d == 3 || iVar.d == 4) {
                try {
                    List list = (List) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(iVar.e, new TypeToken<List<String>>() { // from class: com.sankuai.waimai.business.im.group.adapter.WMUserMachGroupSendPanelAdapter.1
                    }.getType());
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    String str = (String) list.get(list.size() - 1);
                    String[] split = str.split(CommonConstant.Symbol.COLON);
                    if (split != null && split.length >= 2) {
                        str = split[0];
                    }
                    wMUserMachGroupSendPanelAdapter.j.a(str);
                } catch (Exception unused2) {
                }
            }
        }
    }
}
