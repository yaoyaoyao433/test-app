package com.sankuai.waimai.platform.restaurant.membercoupon;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.android.recce.props.gens.MinHeight;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.restaurant.membercoupon.WMRNFloatingRedpacketModule;
import com.sankuai.waimai.platform.restaurant.membercoupon.i;
import com.sankuai.waimai.platform.restaurant.membercoupon.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RNFloatCouponMemberFragment extends MRNBaseFragment implements WMRNFloatingRedpacketModule.a {
    public static ChangeQuickRedirect a;
    static WMRNFloatingRedpacketModule j;
    public boolean b;
    public boolean c;
    public a g;
    public f h;
    public c i;
    public int k;
    private Dialog l;
    private d m;
    private i n;
    private j o;
    private h p;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(String str);
    }

    public RNFloatCouponMemberFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "137ad7e1fafdd6f20b1fb1992c98ab8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "137ad7e1fafdd6f20b1fb1992c98ab8b");
        } else {
            this.k = 0;
        }
    }

    public static /* synthetic */ void a(RNFloatCouponMemberFragment rNFloatCouponMemberFragment, k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, rNFloatCouponMemberFragment, changeQuickRedirect, false, "b8b2b97330ca4b0a2a9381666ca1e74b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, rNFloatCouponMemberFragment, changeQuickRedirect, false, "b8b2b97330ca4b0a2a9381666ca1e74b");
        } else if (kVar == null || !(rNFloatCouponMemberFragment.getContext() instanceof Activity)) {
        } else {
            com.sankuai.waimai.platform.capacity.pay.a.a((Activity) rNFloatCouponMemberFragment.getContext(), 1001, kVar.c, kVar.b);
        }
    }

    public static /* synthetic */ void a(RNFloatCouponMemberFragment rNFloatCouponMemberFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, rNFloatCouponMemberFragment, changeQuickRedirect, false, "1a396887dc02ec6e80b0a2a44d8e24df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, rNFloatCouponMemberFragment, changeQuickRedirect, false, "1a396887dc02ec6e80b0a2a44d8e24df");
        } else if (rNFloatCouponMemberFragment.g != null) {
            rNFloatCouponMemberFragment.g.a(str);
        } else {
            FragmentActivity activity = rNFloatCouponMemberFragment.getActivity();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            ae.a((Activity) activity, str);
        }
    }

    public static /* synthetic */ void c(RNFloatCouponMemberFragment rNFloatCouponMemberFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, rNFloatCouponMemberFragment, changeQuickRedirect, false, "551afa1a3cb2613941357aa7e45ad9d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, rNFloatCouponMemberFragment, changeQuickRedirect, false, "551afa1a3cb2613941357aa7e45ad9d1");
            return;
        }
        if (rNFloatCouponMemberFragment.l != null) {
            rNFloatCouponMemberFragment.r();
        }
        rNFloatCouponMemberFragment.l = com.sankuai.waimai.platform.widget.dialog.a.a(rNFloatCouponMemberFragment.getContext());
    }

    public static /* synthetic */ i e(RNFloatCouponMemberFragment rNFloatCouponMemberFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, rNFloatCouponMemberFragment, changeQuickRedirect, false, "09b8ce171fc38b02d88be95f8efb9e0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, rNFloatCouponMemberFragment, changeQuickRedirect, false, "09b8ce171fc38b02d88be95f8efb9e0d");
        }
        if (rNFloatCouponMemberFragment.n == null) {
            rNFloatCouponMemberFragment.n = new i(rNFloatCouponMemberFragment.m);
        }
        return rNFloatCouponMemberFragment.n;
    }

    public static /* synthetic */ j g(RNFloatCouponMemberFragment rNFloatCouponMemberFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, rNFloatCouponMemberFragment, changeQuickRedirect, false, "4a5a342636a6e763d0a726bffedd424a", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, rNFloatCouponMemberFragment, changeQuickRedirect, false, "4a5a342636a6e763d0a726bffedd424a");
        }
        if (rNFloatCouponMemberFragment.o == null) {
            rNFloatCouponMemberFragment.o = new j((Activity) rNFloatCouponMemberFragment.getContext(), rNFloatCouponMemberFragment.m.d, rNFloatCouponMemberFragment.m.a, rNFloatCouponMemberFragment.m.b, rNFloatCouponMemberFragment.m.c, new j.a() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.restaurant.membercoupon.j.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f665c9cfc2cd49fffbc3dfef34286a16", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f665c9cfc2cd49fffbc3dfef34286a16");
                    } else {
                        RNFloatCouponMemberFragment.a(RNFloatCouponMemberFragment.this, str);
                    }
                }
            });
        }
        return rNFloatCouponMemberFragment.o;
    }

    public static /* synthetic */ h h(RNFloatCouponMemberFragment rNFloatCouponMemberFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, rNFloatCouponMemberFragment, changeQuickRedirect, false, "c410666e0a73bf1c58cea2360e36d229", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, rNFloatCouponMemberFragment, changeQuickRedirect, false, "c410666e0a73bf1c58cea2360e36d229");
        }
        if (rNFloatCouponMemberFragment.p == null) {
            rNFloatCouponMemberFragment.p = new h((Activity) rNFloatCouponMemberFragment.getContext(), rNFloatCouponMemberFragment.m.d, rNFloatCouponMemberFragment.m.a, rNFloatCouponMemberFragment.m.b, rNFloatCouponMemberFragment.m.c);
        }
        return rNFloatCouponMemberFragment.p;
    }

    public final void a(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d98b47976c3b3a0425d830c35853ca4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d98b47976c3b3a0425d830c35853ca4");
            return;
        }
        this.m = dVar;
        q();
    }

    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0921bfd762edf06baa6488dd6867cbaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0921bfd762edf06baa6488dd6867cbaf");
        } else if (j != null) {
            j.setModuleEventListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d97af94bd5df411ee1e26fd388f2b91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d97af94bd5df411ee1e26fd388f2b91");
            return;
        }
        Context context = getContext();
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.l);
        this.l = null;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final Uri m() {
        long j2;
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "080ef087ec2a7530122da0a187ff4611", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "080ef087ec2a7530122da0a187ff4611");
        }
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("mrn_biz", "waimai").appendQueryParameter("mrn_entry", "member-redpacket-popup").appendQueryParameter("mrn_component", "member-redpacket-popup");
        Bundle arguments = getArguments();
        String str = "";
        int i2 = this.m.e;
        if (arguments != null) {
            i = arguments.getInt("coupon_type");
            j2 = arguments.getLong("poi_id");
            str = arguments.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
        } else {
            j2 = 0;
            i = 0;
        }
        builder.appendQueryParameter("couponType", String.valueOf(i));
        builder.appendQueryParameter("poiId", String.valueOf(j2));
        builder.appendQueryParameter("poiIdStr", str);
        builder.appendQueryParameter("bizType", String.valueOf(this.m.f));
        if (i2 != 0) {
            builder.appendQueryParameter(MinHeight.LOWER_CASE_NAME, String.valueOf(this.m.e));
        }
        com.sankuai.waimai.foundation.utils.log.a.b("MRN_MEMBER_FLOAT", "RNFloatCouponMemberFragment, getFragmentUri(),  couponType:" + i + " poiId: " + j2, new Object[0]);
        return builder.build();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final List<com.facebook.react.i> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9047fb0b8d3a3563f1eb1613ec736dd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9047fb0b8d3a3563f1eb1613ec736dd0");
        }
        List<com.facebook.react.i> d = super.d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(this));
        if (com.sankuai.waimai.foundation.utils.b.a(d)) {
            arrayList.addAll(d);
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.WMRNFloatingRedpacketModule.a
    public final void a(final String str, final String str2, final String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d971a8e4748295419612c3b81541726d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d971a8e4748295419612c3b81541726d");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da030ee7f9b18720201481e8edcd96e1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da030ee7f9b18720201481e8edcd96e1");
                        return;
                    }
                    if (RNFloatCouponMemberFragment.this.h != null && RNFloatCouponMemberFragment.this.m != null && RNFloatCouponMemberFragment.this.m.f == 0) {
                        RNFloatCouponMemberFragment.this.h.i();
                    }
                    RNFloatCouponMemberFragment.c(RNFloatCouponMemberFragment.this);
                    RNFloatCouponMemberFragment.e(RNFloatCouponMemberFragment.this).a(str, str2, str3, new i.a() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.restaurant.membercoupon.i.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "386c637e167c9f6a47f9c6bc50cb7d5f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "386c637e167c9f6a47f9c6bc50cb7d5f");
                                return;
                            }
                            RNFloatCouponMemberFragment.this.r();
                            RNFloatCouponMemberFragment.a(RNFloatCouponMemberFragment.this, "支付请求失败，请稍后重试");
                            if (RNFloatCouponMemberFragment.this.h == null || RNFloatCouponMemberFragment.this.m == null || RNFloatCouponMemberFragment.this.m.f != 1) {
                                return;
                            }
                            RNFloatCouponMemberFragment.this.h.i();
                        }

                        @Override // com.sankuai.waimai.platform.restaurant.membercoupon.i.a
                        public final void a(k kVar) {
                            Object[] objArr3 = {kVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c7a4fdbca0e27a36e1ca1f10993687d1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c7a4fdbca0e27a36e1ca1f10993687d1");
                                return;
                            }
                            RNFloatCouponMemberFragment.this.r();
                            RNFloatCouponMemberFragment.a(RNFloatCouponMemberFragment.this, kVar);
                            if (RNFloatCouponMemberFragment.this.h == null || RNFloatCouponMemberFragment.this.m == null || RNFloatCouponMemberFragment.this.m.f != 1) {
                                return;
                            }
                            RNFloatCouponMemberFragment.this.h.i();
                        }
                    });
                }
            });
        }
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.WMRNFloatingRedpacketModule.a
    public final void a(final int i, final String str, final Callback callback) {
        Object[] objArr = {Integer.valueOf(i), str, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dfb364c42080ca825bd48f1db151b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dfb364c42080ca825bd48f1db151b25");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91e0c047fbbaab5d0587c039676aee6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91e0c047fbbaab5d0587c039676aee6b");
                        return;
                    }
                    if (RNFloatCouponMemberFragment.this.h != null) {
                        RNFloatCouponMemberFragment.this.h.h();
                    }
                    final j g = RNFloatCouponMemberFragment.g(RNFloatCouponMemberFragment.this);
                    final int i2 = i;
                    final String str2 = str;
                    final Callback callback2 = callback;
                    final c cVar = RNFloatCouponMemberFragment.this.i;
                    Object[] objArr3 = {Integer.valueOf(i2), str2, callback2, cVar};
                    ChangeQuickRedirect changeQuickRedirect3 = j.a;
                    if (PatchProxy.isSupport(objArr3, g, changeQuickRedirect3, false, "04f0b5eaf35a4518a0e5906fe33e16bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, g, changeQuickRedirect3, false, "04f0b5eaf35a4518a0e5906fe33e16bf");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.c("member_log", "[MemberExchangeHelper-exchangeCoupon] poiIdStr：" + g.e, new Object[0]);
                    if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                        IExchangeCouponDialogNew iExchangeCouponDialogNew = (IExchangeCouponDialogNew) com.sankuai.waimai.router.a.a(IExchangeCouponDialogNew.class, "/showexchangecoupondialog_new");
                        if (iExchangeCouponDialogNew != null) {
                            iExchangeCouponDialogNew.showExchangeCouponDialog(g.c, g.f, new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.j.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str3;
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f097f34f55294a869cbc894e43769b88", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f097f34f55294a869cbc894e43769b88");
                                        return;
                                    }
                                    callback2.invoke(0);
                                    if (cVar == null || !cVar.a(g.d, g.e, i2, str2)) {
                                        com.sankuai.waimai.platform.domain.manager.poi.a.a().a(g.e);
                                    }
                                    JudasManualManager.a b = JudasManualManager.b("b_pk6ebp1m");
                                    b.b = AppUtil.generatePageInfoKey(g.c);
                                    JudasManualManager.a a2 = b.a(g.g);
                                    if (TextUtils.isEmpty(g.e)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(g.d);
                                        str3 = sb.toString();
                                    } else {
                                        str3 = g.e;
                                    }
                                    a2.a("poi_id", str3).a();
                                }
                            }, new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.j.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str3;
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "00004240e9adb0848d3ebad0f96c07e8", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "00004240e9adb0848d3ebad0f96c07e8");
                                        return;
                                    }
                                    callback2.invoke(1);
                                    JudasManualManager.a b = JudasManualManager.b("b_ab6yt8ef");
                                    b.b = AppUtil.generatePageInfoKey(g.c);
                                    JudasManualManager.a a2 = b.a(g.g);
                                    if (TextUtils.isEmpty(g.e)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(g.d);
                                        str3 = sb.toString();
                                    } else {
                                        str3 = g.e;
                                    }
                                    a2.a("poi_id", str3).a();
                                }
                            }, new kotlin.jvm.functions.b<String, Void>() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.j.3
                                public static ChangeQuickRedirect a;

                                @Override // kotlin.jvm.functions.b
                                public final /* synthetic */ Void invoke(String str3) {
                                    String str4 = str3;
                                    Object[] objArr4 = {str4};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6c956f13e76105c916dd81e2829dd084", RobustBitConfig.DEFAULT_VALUE)) {
                                        return (Void) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6c956f13e76105c916dd81e2829dd084");
                                    }
                                    if (g.b != null) {
                                        g.b.a(str4);
                                        return null;
                                    }
                                    return null;
                                }
                            }, g.d, g.e, i2, "", 1, str2);
                            return;
                        }
                        return;
                    }
                    com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_COUPON;
                    if (g.c != null) {
                        com.sankuai.waimai.platform.domain.manager.user.a.a(g.c, new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.j.4
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fc8c5446308d800bf034219f925e4810", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fc8c5446308d800bf034219f925e4810");
                                } else {
                                    com.sankuai.waimai.platform.domain.manager.poi.a.a().a(g.e);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.WMRNFloatingRedpacketModule.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4700829e5c4bc97ec45a4fa18f1f5b63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4700829e5c4bc97ec45a4fa18f1f5b63");
        } else {
            a(str, (Callback) null);
        }
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.WMRNFloatingRedpacketModule.a
    public final void a(final String str, final Callback callback) {
        Object[] objArr = {str, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59768a334fb97965c620026f0cdf49ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59768a334fb97965c620026f0cdf49ad");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("RNFloatCouponMemberFrag", "expandMagicCouponNew couponViewId: " + str + ", jsCallback: " + callback, new Object[0]);
        ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf706323b10330ee315cf40f93712135", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf706323b10330ee315cf40f93712135");
                    return;
                }
                final h h = RNFloatCouponMemberFragment.h(RNFloatCouponMemberFragment.this);
                String str2 = str;
                final Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment.4.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b8b9b4d94fc99731451af5fa90c405ad", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b8b9b4d94fc99731451af5fa90c405ad");
                        } else if (callback != null) {
                            callback.invoke(0);
                        }
                    }
                };
                Object[] objArr3 = {str2, runnable};
                ChangeQuickRedirect changeQuickRedirect3 = h.a;
                if (PatchProxy.isSupport(objArr3, h, changeQuickRedirect3, false, "0518f3be1633d1178a88cd44f62149cb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, h, changeQuickRedirect3, false, "0518f3be1633d1178a88cd44f62149cb");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.c("member_log", "[MagicCouponExpandHelper-showMagiCouponExpandDialog] poiIdStr：" + h.d, new Object[0]);
                if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                    IMagicCouponDialog iMagicCouponDialog = (IMagicCouponDialog) com.sankuai.waimai.router.a.a(IMagicCouponDialog.class, "/showMagicCouponDialog");
                    if (iMagicCouponDialog != null) {
                        iMagicCouponDialog.showMagicCouponDialog(h.b, h.e, h.c, h.d, str2, 1, new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.h.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a940d925c5161c6a6bbdf4094ce079b3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a940d925c5161c6a6bbdf4094ce079b3");
                                    return;
                                }
                                if (runnable != null) {
                                    runnable.run();
                                }
                                com.sankuai.waimai.platform.domain.manager.poi.a.a().a(h.d);
                            }
                        });
                        return;
                    }
                    return;
                }
                com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_COUPON;
                if (h.b != null) {
                    com.sankuai.waimai.platform.domain.manager.user.a.a(h.b, new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.h.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3a7a7a2677b35a613c0935ca62234501", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3a7a7a2677b35a613c0935ca62234501");
                            } else {
                                com.sankuai.waimai.platform.domain.manager.poi.a.a().a(h.d);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.WMRNFloatingRedpacketModule.a
    public final void a(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924a8c67a7cf83a42950311f5b0d9e4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924a8c67a7cf83a42950311f5b0d9e4c");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fe9329b78450b234dfec1f84a8daf1c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fe9329b78450b234dfec1f84a8daf1c");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.c("RNFloatCouponMemberFrag", "fetchDataSuccess data: " + readableMap, new Object[0]);
                    boolean z = readableMap.getBoolean("isMember");
                    String string = readableMap.getString("title");
                    com.sankuai.waimai.foundation.utils.log.a.c("RNFloatCouponMemberFrag", "fetchDataSuccess isMember: " + z + ", title: " + string, new Object[0]);
                    RNFloatCouponMemberFragment.this.b = z ^ true;
                    if (RNFloatCouponMemberFragment.this.h != null) {
                        RNFloatCouponMemberFragment.this.h.b(string);
                        RNFloatCouponMemberFragment.this.h.a(null);
                    }
                    RNFloatCouponMemberFragment.this.c = true;
                }
            });
        }
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.WMRNFloatingRedpacketModule.a
    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cc57d93dacf1d593069bb75d833a382", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cc57d93dacf1d593069bb75d833a382");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfd09dbcaaf53caf24b0cde97aac3898", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfd09dbcaaf53caf24b0cde97aac3898");
                    } else if (RNFloatCouponMemberFragment.this.m != null) {
                        if (RNFloatCouponMemberFragment.this.i == null || !RNFloatCouponMemberFragment.this.i.a(RNFloatCouponMemberFragment.this.m.a, RNFloatCouponMemberFragment.this.m.b)) {
                            com.sankuai.waimai.platform.domain.manager.poi.a.a().a(RNFloatCouponMemberFragment.this.m.b);
                        }
                    }
                }
            });
        }
    }
}
