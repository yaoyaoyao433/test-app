package com.sankuai.waimai.bussiness.order.crossconfirm;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v4.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.android.cube.pga.common.g;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.common.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.AdditionalBargain;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodParams;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.OrderCouponRequestParams;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.root.d;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.root.h;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.a;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderCouponParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderParam;
import com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.core.a implements b, com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b, com.sankuai.waimai.bussiness.order.crossconfirm.block.crossorder.b, com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo.b, com.sankuai.waimai.bussiness.order.crossconfirm.block.paymentmode.b, com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.b, com.sankuai.waimai.bussiness.order.crossconfirm.block.root.b, d, h, com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.b, com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.b, com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.a {
    public static ChangeQuickRedirect s;
    public g<AddressItem> A;
    public g<Integer> B;
    g<AddressItem> C;
    public g<Integer> D;
    public g<String> E;
    public com.meituan.android.cube.pga.common.b<c> F;
    com.meituan.android.cube.pga.common.b<i.c<Integer, Integer>> G;
    public g<Boolean> H;
    com.meituan.android.cube.pga.common.h I;
    g<Boolean> J;
    g<Boolean> K;
    com.meituan.android.cube.pga.common.h L;
    g<Boolean> M;
    public g<ObservableScrollView> N;
    public g<View> O;
    public g<RelativeLayout> P;
    public com.meituan.android.cube.pga.common.b<Integer> Q;
    public com.meituan.android.cube.pga.common.b<Integer> R;
    public j<Integer> S;
    public g<Integer> T;
    public com.meituan.android.cube.pga.common.b<i.c<Long, Integer>> U;
    public com.meituan.android.cube.pga.common.b<i.c<Float, Float>> V;
    public com.meituan.android.cube.pga.common.b<Float> W;
    public g<e> X;
    public com.meituan.android.cube.pga.common.a<CollectOrderFoodParams, Boolean> Y;
    public g<Boolean> Z;
    public g<Boolean> aa;
    public g<View> ab;
    public g<Void> ac;
    public com.meituan.android.cube.pga.common.b<String> ad;
    public g<LinearLayout> ae;
    public g<String> af;
    public com.meituan.android.cube.pga.common.b<b.a> ag;
    public com.meituan.android.cube.pga.common.b<Void> ah;
    public com.meituan.android.cube.pga.common.b<i.c<Long, String>> ai;
    public com.meituan.android.cube.pga.common.b<a.C0908a> aj;
    public com.meituan.android.cube.pga.common.b<b.a> ak;
    public com.meituan.android.cube.pga.common.b<i.c<Long, List<OrderedFood>>> al;
    @NonNull
    private final f am;
    private g<Integer> an;
    private g<String> ao;
    private g<Integer> ap;
    public g<List<PoiOrderParam>> t;
    public g<LongSparseArray<PoiOrderCouponParam>> u;
    public g<Boolean> v;
    public g<List<Map<String, Object>>> w;
    public com.meituan.android.cube.pga.common.b<i.c<Long, OrderCouponRequestParams>> x;
    public com.meituan.android.cube.pga.common.b<i.c<Long, PoiOrderParam>> y;
    public com.meituan.android.cube.pga.common.b<i.c<Long, PoiOrderCouponParam>> z;

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void a(Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void b(Map<String, Object> map) {
    }

    public a(@NonNull Context context, @NonNull f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dbd02581bf214e960e3e1db5069b36d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dbd02581bf214e960e3e1db5069b36d");
            return;
        }
        this.t = new g<>();
        this.u = new g<>();
        this.v = new g<>();
        this.w = new g<>();
        this.x = new com.meituan.android.cube.pga.common.b<>();
        this.y = new com.meituan.android.cube.pga.common.b<>();
        this.z = new com.meituan.android.cube.pga.common.b<>();
        this.A = new g<>();
        this.B = new g<>();
        this.C = new g<>();
        this.D = new g<>();
        this.E = new g<>();
        this.F = new com.meituan.android.cube.pga.common.b<>();
        this.an = new g<>();
        this.ao = new g<>();
        this.G = new com.meituan.android.cube.pga.common.b<>();
        this.H = new g<>();
        this.I = new com.meituan.android.cube.pga.common.h();
        this.J = new g<>();
        this.K = new g<>();
        this.L = new com.meituan.android.cube.pga.common.h();
        this.M = new g<>();
        this.N = new g<>();
        this.O = new g<>();
        this.P = new g<>();
        this.Q = new com.meituan.android.cube.pga.common.b<>();
        this.R = new com.meituan.android.cube.pga.common.b<>();
        this.S = new j<>(0);
        this.T = new g<>();
        this.U = new com.meituan.android.cube.pga.common.b<>();
        this.V = new com.meituan.android.cube.pga.common.b<>();
        this.W = new com.meituan.android.cube.pga.common.b<>();
        this.ap = new g<>();
        this.X = new g<>();
        this.Y = new com.meituan.android.cube.pga.common.a<>();
        this.Z = new g<>();
        this.aa = new g<>();
        this.ab = new g<>();
        this.ac = new g<>();
        this.ad = new com.meituan.android.cube.pga.common.b<>();
        this.ae = new g<>();
        this.af = new g<>();
        this.ag = new com.meituan.android.cube.pga.common.b<>();
        this.ah = new com.meituan.android.cube.pga.common.b<>();
        this.ai = new com.meituan.android.cube.pga.common.b<>();
        this.aj = new com.meituan.android.cube.pga.common.b<>();
        this.ak = new com.meituan.android.cube.pga.common.b<>();
        this.al = new com.meituan.android.cube.pga.common.b<>();
        this.am = fVar;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final long aH_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "762f5865ee484288b56ce36bf47cfabb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "762f5865ee484288b56ce36bf47cfabb")).longValue();
        }
        throw new RuntimeException("跨店不能使用OrderConfirmInterface.getPoiId()获取poi参数");
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final String aI_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0652718ebc9b9bba9ccdc2dfbecf6451", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0652718ebc9b9bba9ccdc2dfbecf6451");
        }
        throw new RuntimeException("跨店不能使用OrderConfirmInterface.getPoiIdStr()获取poi参数");
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final boolean aJ_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcac5478676423953a45edde5d37e7cb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcac5478676423953a45edde5d37e7cb")).booleanValue() : this.am.aJ_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final int aK_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3caa832fd7dccc539488acdaba4fe8e8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3caa832fd7dccc539488acdaba4fe8e8")).intValue() : this.am.aK_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee33b600b239570c1a1207f04239c73a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee33b600b239570c1a1207f04239c73a");
        } else {
            this.am.a(i);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a440dd02cfc7716000b5f96125d2427f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a440dd02cfc7716000b5f96125d2427f");
        } else {
            this.am.a(i, z);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void a(int i, ArrayList<AdditionalBargain.AdditionalBargainDetail> arrayList) {
        Object[] objArr = {Integer.valueOf(i), arrayList};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71e5d6be23a89001e37489d23e313b1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71e5d6be23a89001e37489d23e313b1f");
        } else {
            this.am.a(i, arrayList);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final int aL_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aae895232a912710700293652d5bab5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aae895232a912710700293652d5bab5")).intValue() : this.am.aL_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final boolean aM_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d253100949f105ed2f340cdf5c7a55e9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d253100949f105ed2f340cdf5c7a55e9")).booleanValue() : this.am.aM_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final Typeface aN_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35dc959d0c35fb66e6a37a4478116dc2", RobustBitConfig.DEFAULT_VALUE) ? (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35dc959d0c35fb66e6a37a4478116dc2") : this.am.aN_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final boolean aO_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b379f98956e46d168bf04d3be7d744b0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b379f98956e46d168bf04d3be7d744b0")).booleanValue() : this.am.aO_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2879a982f7f447fef3425047b7bfa07e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2879a982f7f447fef3425047b7bfa07e");
        } else {
            this.am.b(i);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f81cb5cb3dfe4d80ca7e3df01f89c0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f81cb5cb3dfe4d80ca7e3df01f89c0b");
        } else {
            this.am.a(view);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final g<AddressItem> i() {
        return this.A;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final g<Integer> j() {
        return this.B;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final g<AddressItem> k() {
        return this.C;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final g<Integer> l() {
        return this.D;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final g<String> m() {
        return this.E;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final com.meituan.android.cube.pga.common.b<c> n() {
        return this.F;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final g<String> o() {
        return this.ao;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final com.meituan.android.cube.pga.common.b<i.c<Integer, Integer>> p() {
        return this.G;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final g<Boolean> q() {
        return this.H;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final com.meituan.android.cube.pga.common.h r() {
        return this.I;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final g<Boolean> s() {
        return this.J;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final g<Boolean> t() {
        return this.K;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final com.meituan.android.cube.pga.common.h u() {
        return this.L;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.b
    public final g<Boolean> v() {
        return this.M;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.root.h
    public final com.meituan.android.cube.pga.common.b<Integer> w() {
        return this.Q;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.root.h
    public final j<Integer> y() {
        return this.S;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.b
    public final com.meituan.android.cube.pga.common.b<i.c<Long, Integer>> x() {
        return this.U;
    }
}
