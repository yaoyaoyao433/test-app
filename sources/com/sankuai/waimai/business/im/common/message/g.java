package com.sankuai.waimai.business.im.common.message;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.mach.b;
import com.sankuai.waimai.business.im.method.b;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.model.q;
import com.sankuai.waimai.business.im.model.r;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.IMUIManager;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends f<Map> {
    public static ChangeQuickRedirect e;
    protected com.sankuai.waimai.business.im.common.contract.a f;
    protected String g;
    Dialog h;
    Context i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public com.sankuai.waimai.business.im.mach.c a;
        public FrameLayout b;
    }

    public static /* synthetic */ void a(g gVar, com.sankuai.waimai.business.im.mach.a aVar, com.sankuai.xm.imui.session.entity.b bVar, Map map) {
        r rVar;
        Object[] objArr = {aVar, bVar, map};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "7be23921893725860e3f7e22f8049c4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "7be23921893725860e3f7e22f8049c4a");
            return;
        }
        try {
            String valueOf = String.valueOf(((GeneralMessage) bVar.b).getMsgUuid());
            boolean parseBoolean = Boolean.parseBoolean(String.valueOf(map.get("hasExpand")));
            String str = aVar.o;
            if (gVar.c.ak_().get(str) == null || (rVar = (r) ((Map) gVar.c.ak_().get(str)).get(valueOf)) == null) {
                return;
            }
            rVar.c.put("hasExpand", Boolean.valueOf(parseBoolean));
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.business.im.common.message.l
    public final /* synthetic */ void a(View view, @NonNull @NotNull final com.sankuai.xm.imui.session.entity.b bVar, Object obj) {
        boolean z;
        q qVar;
        Map map = (Map) obj;
        Object[] objArr = {view, bVar, map};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a41c9340822fef4a1bd6a9990c726c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a41c9340822fef4a1bd6a9990c726c6");
        } else if (view == null || view.getTag() == null || !(view.getTag() instanceof a) || map == null || this.b == null) {
        } else {
            com.sankuai.waimai.business.im.model.j jVar = new com.sankuai.waimai.business.im.model.j();
            jVar.a = this.b.msgCode;
            jVar.b = this.b.templateId;
            jVar.c = this.b.moduleId;
            jVar.d = this.b.nativeId;
            jVar.e = map;
            Map<String, Object> a2 = this.c.a(jVar.c, bVar);
            if (a2 != null) {
                jVar.e.putAll(a2);
            }
            final a aVar = (a) view.getTag();
            Map map2 = (Map) this.c.h().get(this.b.templateId);
            String str = jVar.c;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30a1f394149ecc1236b7acb208b38643", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30a1f394149ecc1236b7acb208b38643")).booleanValue();
            } else {
                z = TextUtils.equals("im_send_location", str) || TextUtils.equals("question_tip", str) || TextUtils.equals("im_flash_sale_multi", str) || TextUtils.equals("im_fans_hot_sale", str);
            }
            if (!z && map2 != null && (qVar = (q) map2.get(String.valueOf(((GeneralMessage) bVar.b).getMsgUuid()))) != null) {
                aVar.a.a(qVar.b, qVar.a);
            }
            aVar.a.i = bVar;
            aVar.a.a(jVar, jVar.b, String.valueOf(((GeneralMessage) bVar.b).getMsgUuid()), this.b);
            aVar.a.g = new b.a() { // from class: com.sankuai.waimai.business.im.common.message.g.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.im.mach.b.a
                public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                    Object[] objArr3 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "217c06aece796f2cbdf348058d278079", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "217c06aece796f2cbdf348058d278079");
                    } else if (aVar2 != null) {
                        aVar.a.a(aVar2.s(), aVar2.t());
                    }
                }
            };
            com.sankuai.waimai.business.im.mach.c cVar = aVar.a;
            b.a aVar2 = new b.a() { // from class: com.sankuai.waimai.business.im.common.message.g.2
                public static ChangeQuickRedirect a;

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @Override // com.sankuai.waimai.business.im.method.b.a
                public final void a(@NonNull String str2, @Nullable Map<String, Object> map3) {
                    char c;
                    byte[] a3;
                    Object[] objArr3 = {str2, map3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c64217e3142375d866398f4fbbeee155", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c64217e3142375d866398f4fbbeee155");
                        return;
                    }
                    switch (str2.hashCode()) {
                        case -1491924971:
                            if (str2.equals("show_loading_event")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1397078295:
                            if (str2.equals("jump_red_packet_detail")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1371805194:
                            if (str2.equals("jumpToMMPPage")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -875158302:
                            if (str2.equals("dismiss_loading_event")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -422151062:
                            if (str2.equals("expand_changed_event")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -149865583:
                            if (str2.equals("hiddenKeyBoard")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 386119463:
                            if (str2.equals("send_location_event")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 676205999:
                            if (str2.equals("send_good_event")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 851811567:
                            if (str2.equals("show_red_packet_dialog")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1367128242:
                            if (str2.equals("click_commend_card_event")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1488427242:
                            if (str2.equals("phone_call_event")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1846953275:
                            if (str2.equals("JumpToChangeAddress")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            g gVar = g.this;
                            com.sankuai.xm.imui.session.entity.b bVar2 = bVar;
                            Object[] objArr4 = {bVar2, map3};
                            ChangeQuickRedirect changeQuickRedirect4 = g.e;
                            if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "adc440b180010f0d8adbd0523e955f07", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "adc440b180010f0d8adbd0523e955f07");
                                return;
                            }
                            byte[] data = ((GeneralMessage) bVar2.b).getData();
                            if (data != null) {
                                try {
                                    com.sankuai.waimai.business.im.model.d a4 = com.sankuai.waimai.business.im.model.d.a(new JSONObject(new String(data, "utf-8")).optJSONObject("data"));
                                    if (a4 != null && (a3 = a4.a(0)) != null) {
                                        IMUIManager.a().a((IMMessage) com.sankuai.xm.imui.common.util.c.a(a3, 0, "[商品]" + a4.c), false);
                                        IMUIManager.a().a(bVar2.b);
                                        return;
                                    }
                                    return;
                                } catch (Exception e2) {
                                    com.sankuai.waimai.foundation.utils.log.a.a(e2);
                                    return;
                                }
                            }
                            return;
                        case 1:
                            g gVar2 = g.this;
                            Object[] objArr5 = {bVar, map3};
                            ChangeQuickRedirect changeQuickRedirect5 = g.e;
                            if (PatchProxy.isSupport(objArr5, gVar2, changeQuickRedirect5, false, "522cb2d0e4d6c40d8958867b7f8e7bde", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, gVar2, changeQuickRedirect5, false, "522cb2d0e4d6c40d8958867b7f8e7bde");
                                return;
                            }
                            try {
                                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.business.im.common.rxbus.c(com.sankuai.waimai.business.im.common.rxbus.c.c, String.valueOf(map3.get(Constants.EventConstants.KEY_ORDER_ID))));
                                return;
                            } catch (Exception e3) {
                                com.sankuai.waimai.foundation.utils.log.a.a(e3);
                                return;
                            }
                        case 2:
                            g gVar3 = g.this;
                            Object[] objArr6 = {bVar, map3};
                            ChangeQuickRedirect changeQuickRedirect6 = g.e;
                            if (PatchProxy.isSupport(objArr6, gVar3, changeQuickRedirect6, false, "8f69b5496d751d85bd8dcbea18adff85", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, gVar3, changeQuickRedirect6, false, "8f69b5496d751d85bd8dcbea18adff85");
                                return;
                            }
                            long a5 = com.sankuai.waimai.foundation.utils.r.a(String.valueOf(map3.get("id")), 0L);
                            if (a5 != 0) {
                                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.business.im.common.rxbus.a(a5));
                                return;
                            }
                            return;
                        case 3:
                            g.this.c.b_(map3);
                            return;
                        case 4:
                            g.this.c.b(map3);
                            return;
                        case 5:
                            g.this.c.c(map3);
                            return;
                        case 6:
                            g.a(g.this, aVar.a.d(), bVar, map3);
                            return;
                        case 7:
                            g.this.c.b(bVar, map3);
                            return;
                        case '\b':
                            g.this.c.a(bVar, map3);
                            return;
                        case '\t':
                            g.this.h = com.sankuai.waimai.platform.widget.dialog.a.a(g.this.i);
                            return;
                        case '\n':
                            if (g.this.h == null || !g.this.h.isShowing()) {
                                return;
                            }
                            g.this.h.dismiss();
                            return;
                        case 11:
                            g gVar4 = g.this;
                            FrameLayout frameLayout = aVar.b;
                            Object[] objArr7 = {frameLayout};
                            ChangeQuickRedirect changeQuickRedirect7 = g.e;
                            if (PatchProxy.isSupport(objArr7, gVar4, changeQuickRedirect7, false, "0fb4ffe5618c19b0c8fa0f6bc2ac3b12", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, gVar4, changeQuickRedirect7, false, "0fb4ffe5618c19b0c8fa0f6bc2ac3b12");
                                return;
                            } else if (frameLayout != null) {
                                try {
                                    InputMethodManager inputMethodManager = (InputMethodManager) frameLayout.getContext().getApplicationContext().getSystemService("input_method");
                                    if (inputMethodManager.isActive()) {
                                        inputMethodManager.hideSoftInputFromWindow(frameLayout.getApplicationWindowToken(), 0);
                                        return;
                                    }
                                    return;
                                } catch (Throwable unused) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        default:
                            return;
                    }
                }
            };
            Object[] objArr3 = {aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.im.mach.b.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "89775470e93603323e2fc65d6242779d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "89775470e93603323e2fc65d6242779d");
            } else if (cVar.f != null) {
                cVar.f.c = aVar2;
            }
        }
    }

    public g(WMCommonDataInfo.IMDynamicCard iMDynamicCard, com.sankuai.waimai.business.im.common.contract.a aVar, String str) {
        super(iMDynamicCard, aVar, str);
        Object[] objArr = {iMDynamicCard, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db9c7bb29bb750975e6a5aed11a4061c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db9c7bb29bb750975e6a5aed11a4061c");
            return;
        }
        this.f = aVar;
        this.g = str;
    }

    @Override // com.sankuai.waimai.business.im.common.message.l, com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8ee2d676355181332da79d133f5db62", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8ee2d676355181332da79d133f5db62");
        }
        this.i = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_im_comon_mach_card, viewGroup, false);
        a aVar = new a();
        aVar.b = (FrameLayout) inflate.findViewById(R.id.framelayout);
        com.sankuai.waimai.business.im.mach.c cVar = new com.sankuai.waimai.business.im.mach.c(context, this.f, this.g);
        cVar.a((ViewGroup) inflate.findViewById(R.id.framelayout));
        aVar.a = cVar;
        inflate.setTag(aVar);
        inflate.setTag(R.id.xm_sdk_msg_layout_tag, "XM_SDK_CUSTOM_MAX_WIDTH");
        return inflate;
    }
}
