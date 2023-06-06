package com.sankuai.waimai.store.poi.list.refactor.card.float_card;

import android.arch.lifecycle.f;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.assembler.component.FloatBaseCard;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.VisibleChangeEvent;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.i;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiResult;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class PoiFloatCard extends FloatBaseCard implements l<PoiResult>, com.sankuai.waimai.business.order.api.submit.a, com.sankuai.waimai.store.assembler.component.a, c.a {
    public static ChangeQuickRedirect i;
    private ViewGroup j;
    private ViewGroup k;
    private ViewGroup l;
    private com.sankuai.waimai.store.param.a m;
    private final long n;
    private int o;
    private View p;
    private boolean q;
    private int r;
    private boolean s;
    private boolean t;
    private Handler u;
    private e v;
    private final com.sankuai.waimai.store.poi.list.newp.block.helper.a w;
    private final Runnable x;

    public static /* synthetic */ boolean a(PoiFloatCard poiFloatCard, boolean z) {
        poiFloatCard.s = false;
        return false;
    }

    public static /* synthetic */ int b(PoiFloatCard poiFloatCard) {
        int i2 = poiFloatCard.o;
        poiFloatCard.o = i2 + 1;
        return i2;
    }

    @Override // android.arch.lifecycle.l
    public final /* synthetic */ void a(@Nullable PoiResult poiResult) {
        PoiResult poiResult2 = poiResult;
        Object[] objArr = {poiResult2};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e3457df7d493a78364458a7b86b9d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e3457df7d493a78364458a7b86b9d0");
        } else if (poiResult2 == null || com.sankuai.waimai.store.util.b.a((SCBaseActivity) this.e)) {
        } else {
            a(poiResult2.response, false);
        }
    }

    public PoiFloatCard(f fVar, FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e0b3ea9dcae1496b8a15051d294c49", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e0b3ea9dcae1496b8a15051d294c49");
            return;
        }
        this.o = 0;
        this.r = 0;
        this.t = false;
        this.u = new Handler();
        this.w = new com.sankuai.waimai.store.poi.list.newp.block.helper.a(false);
        this.x = new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.PoiFloatCard.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d23af00d5f52f548204c075c6039f15b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d23af00d5f52f548204c075c6039f15b");
                    return;
                }
                PoiFloatCard.this.e();
                if (PoiFloatCard.b(PoiFloatCard.this) < 240) {
                    PoiFloatCard.this.u.postDelayed(PoiFloatCard.this.x, PoiFloatCard.this.n);
                }
            }
        };
        if (com.dianping.sharkpush.b.b()) {
            this.n = j.h().a("order/order_refresh_with_push_period", 300000L);
        } else {
            this.n = j.h().a("order/order_refresh_period", LocationStrategy.LOCATION_TIMEOUT);
        }
        this.p = null;
        this.q = true;
        this.r = h.a((SCBaseActivity) this.e, 49.0f) + u.a();
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    @NonNull
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "597bf998ca6c88a7b8713805405b544c", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "597bf998ca6c88a7b8713805405b544c") : LayoutInflater.from(this.e).inflate(R.layout.wm_sc_home_channel_refactor_float_card, viewGroup);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "786c899aaac87fd1887b2dd2ef4e801a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "786c899aaac87fd1887b2dd2ef4e801a");
            return;
        }
        this.t = true;
        com.sankuai.waimai.business.order.api.submit.c.a().registerOrderStatusObserver(this);
        super.a(view);
        PoiPageViewModel poiPageViewModel = (PoiPageViewModel) q.a(this.e).a(PoiPageViewModel.class);
        this.m = poiPageViewModel.d.a();
        this.j = (ViewGroup) a(R.id.poi_anim_container);
        this.k = (ViewGroup) a(R.id.no_anim_container);
        this.l = (ViewGroup) a(R.id.center_bottom_container);
        if (this.m.aS || !this.m.y) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            marginLayoutParams.bottomMargin = com.sankuai.waimai.store.util.b.c((SCBaseActivity) this.e, R.dimen.wm_sc_common_dimen_45);
            this.k.setLayoutParams(marginLayoutParams);
        }
        a(i.class, new l<i>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.PoiFloatCard.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable i iVar) {
                i iVar2 = iVar;
                Object[] objArr2 = {iVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe4d45da5930227d34ae9d040ed79a03", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe4d45da5930227d34ae9d040ed79a03");
                } else if (iVar2 != null) {
                    if (iVar2.a == 1) {
                        PoiFloatCard.this.f();
                    } else if (iVar2.a == 0) {
                        PoiFloatCard.this.g();
                    }
                }
            }
        });
        poiPageViewModel.b.a(this.d, this);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "435be81dc5fa5b1c191a73e5c1eaebc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "435be81dc5fa5b1c191a73e5c1eaebc0");
        } else {
            this.u.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.a
    public final void a(String str, Uri uri) {
        Object[] objArr = {str, uri};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be111ef62d81da8c40a07270dfcddda7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be111ef62d81da8c40a07270dfcddda7");
        } else {
            e();
        }
    }

    private BaseTile<PoiVerticalityDataResponse.FloatingData, com.sankuai.waimai.store.repository.model.d> a(@Nullable PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull String str) {
        Object[] objArr = {poiVerticalityDataResponse, str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5847a3329cc9d3ac8faabaf6eb83af56", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseTile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5847a3329cc9d3ac8faabaf6eb83af56");
        }
        try {
            ArrayList<BaseTile<PoiVerticalityDataResponse.FloatingData, com.sankuai.waimai.store.repository.model.d>> arrayList = poiVerticalityDataResponse.blocks.floatBlock;
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList)) {
                for (BaseTile<PoiVerticalityDataResponse.FloatingData, com.sankuai.waimai.store.repository.model.d> baseTile : arrayList) {
                    if (baseTile != null && TextUtils.equals(str, baseTile.sType)) {
                        return baseTile;
                    }
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        r1 = com.sankuai.shangou.stone.util.a.c(r2.relativesModules);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r8 >= r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        r3 = (com.sankuai.waimai.store.repository.model.GeneralInfo.RelativesModule) com.sankuai.shangou.stone.util.a.a((java.util.List<java.lang.Object>) r2.relativesModules, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r3 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        r0.append(r3.sType);
        r0.append(com.meituan.robust.common.CommonConstant.Symbol.UNDERLINE);
        r0.append(r3.uniqueSymbol);
        r0.append(com.meituan.robust.common.CommonConstant.Symbol.COMMA);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        r8 = r8 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(@android.support.annotation.Nullable com.sankuai.waimai.store.repository.model.BaseTile<com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse.FloatingData, com.sankuai.waimai.store.repository.model.d> r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.poi.list.refactor.card.float_card.PoiFloatCard.i
            java.lang.String r10 = "f3630bde99d4bdec9d2cb86c4377907f"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r12 == 0) goto L80
            com.sankuai.waimai.store.repository.model.GeneralInfo r1 = r12.generalInfo     // Catch: java.lang.Exception -> L6f
            java.util.List<com.sankuai.waimai.store.repository.model.GeneralInfo$ModuleRelative> r1 = r1.moduleRelatives     // Catch: java.lang.Exception -> L6f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L6f
        L2d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L6f
            if (r2 == 0) goto L73
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L6f
            com.sankuai.waimai.store.repository.model.GeneralInfo$ModuleRelative r2 = (com.sankuai.waimai.store.repository.model.GeneralInfo.ModuleRelative) r2     // Catch: java.lang.Exception -> L6f
            int r3 = r2.type     // Catch: java.lang.Exception -> L6f
            r4 = 3
            if (r3 != r4) goto L2d
            java.util.List<com.sankuai.waimai.store.repository.model.GeneralInfo$RelativesModule> r3 = r2.relativesModules     // Catch: java.lang.Exception -> L6f
            boolean r3 = com.sankuai.shangou.stone.util.a.a(r3)     // Catch: java.lang.Exception -> L6f
            if (r3 == 0) goto L2d
            java.util.List<com.sankuai.waimai.store.repository.model.GeneralInfo$RelativesModule> r1 = r2.relativesModules     // Catch: java.lang.Exception -> L6f
            int r1 = com.sankuai.shangou.stone.util.a.c(r1)     // Catch: java.lang.Exception -> L6f
        L4c:
            if (r8 >= r1) goto L73
            java.util.List<com.sankuai.waimai.store.repository.model.GeneralInfo$RelativesModule> r3 = r2.relativesModules     // Catch: java.lang.Exception -> L6f
            java.lang.Object r3 = com.sankuai.shangou.stone.util.a.a(r3, r8)     // Catch: java.lang.Exception -> L6f
            com.sankuai.waimai.store.repository.model.GeneralInfo$RelativesModule r3 = (com.sankuai.waimai.store.repository.model.GeneralInfo.RelativesModule) r3     // Catch: java.lang.Exception -> L6f
            if (r3 == 0) goto L6c
            java.lang.String r4 = r3.sType     // Catch: java.lang.Exception -> L6f
            r0.append(r4)     // Catch: java.lang.Exception -> L6f
            java.lang.String r4 = "_"
            r0.append(r4)     // Catch: java.lang.Exception -> L6f
            java.lang.String r3 = r3.uniqueSymbol     // Catch: java.lang.Exception -> L6f
            r0.append(r3)     // Catch: java.lang.Exception -> L6f
            java.lang.String r3 = ","
            r0.append(r3)     // Catch: java.lang.Exception -> L6f
        L6c:
            int r8 = r8 + 1
            goto L4c
        L6f:
            r1 = move-exception
            com.dianping.judas.util.a.a(r1)
        L73:
            java.lang.String r1 = r12.uniqueSType
            boolean r1 = com.sankuai.shangou.stone.util.t.a(r1)
            if (r1 != 0) goto L80
            java.lang.String r12 = r12.uniqueSType
            r0.append(r12)
        L80:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.refactor.card.float_card.PoiFloatCard.a(com.sankuai.waimai.store.repository.model.BaseTile):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b71063c8017dff306907175528e30cbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b71063c8017dff306907175528e30cbb");
        } else if (this.s || com.sankuai.waimai.store.util.b.a((SCBaseActivity) this.e)) {
        } else {
            String a = a(a(d(), "sm_type_home_float_order_status"));
            if (t.a(a)) {
                return;
            }
            this.s = true;
            String t = this.m.t();
            HashMap hashMap = new HashMap();
            String valueOf = String.valueOf(this.m.c);
            String str = this.m.f;
            long j = this.m.g;
            String session = Statistics.getSession();
            String localOneId = OneIdHandler.getInstance(com.sankuai.waimai.store.util.b.a()).getLocalOneId();
            String str2 = this.m.i;
            String str3 = this.m.m;
            String str4 = this.m.y ? "sg_home" : "sg_channel";
            long j2 = this.m.c;
            if (this.m.w > 0) {
                j2 = this.m.w;
            }
            hashMap.put("unique_s_type", a);
            hashMap.put("category_type", valueOf);
            hashMap.put("second_category_type", str);
            hashMap.put("sort_type", String.valueOf(j));
            hashMap.put("session_id", session);
            hashMap.put(Constants.Environment.KEY_UNION_ID, localOneId);
            hashMap.put("activity_filter_codes", str2);
            hashMap.put("g_source", str3);
            hashMap.put("search_category_type", String.valueOf(j2));
            hashMap.put("page_type", str4);
            hashMap.put("extra", this.m.aj);
            com.sankuai.waimai.store.base.net.sg.a.a((Object) ((SCBaseActivity) this.e).w()).a(t, hashMap, new com.sankuai.waimai.store.base.net.j<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.PoiFloatCard.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9a986775eef5d75068b5782948344ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9a986775eef5d75068b5782948344ea");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
                    PoiVerticalityDataResponse poiVerticalityDataResponse2 = poiVerticalityDataResponse;
                    Object[] objArr2 = {poiVerticalityDataResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e8d3366308a28682983003705508913", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e8d3366308a28682983003705508913");
                    } else {
                        PoiFloatCard.this.a(poiVerticalityDataResponse2, true);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6799a9c0673453814888bb8dac03b521", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6799a9c0673453814888bb8dac03b521");
                    } else {
                        PoiFloatCard.a(PoiFloatCard.this, false);
                    }
                }
            });
        }
    }

    private void b(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09719c2818020beec2145c2f705c2516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09719c2818020beec2145c2f705c2516");
            return;
        }
        if (view.getParent() == null) {
            this.j.addView(view);
        }
        this.w.a((SCBaseActivity) this.e, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03cd  */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.sankuai.waimai.store.base.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(@android.support.annotation.Nullable java.util.List<com.sankuai.waimai.store.repository.model.BaseTile<com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse.FloatingData, com.sankuai.waimai.store.repository.model.d>> r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.refactor.card.float_card.PoiFloatCard.a(java.util.List, boolean):void");
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final com.sankuai.waimai.store.assembler.component.e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06403d7f44bf9300f9a25e8884d5e8ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.assembler.component.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06403d7f44bf9300f9a25e8884d5e8ad");
        }
        com.sankuai.waimai.store.assembler.component.e eVar = new com.sankuai.waimai.store.assembler.component.e();
        eVar.b = 2;
        eVar.a = 4;
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9280dce84d93f5dcadd05c78a30a9116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9280dce84d93f5dcadd05c78a30a9116");
            return;
        }
        this.w.b();
        if (this.v != null) {
            this.v.b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c665663e0732f95f7ecc21262dfdedd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c665663e0732f95f7ecc21262dfdedd6");
            return;
        }
        this.w.c();
        if (this.v != null) {
            this.v.b(false);
        }
    }

    private void a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bbfe3e706b60b0dbcb7aa8c0e0364da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bbfe3e706b60b0dbcb7aa8c0e0364da");
        } else if (!this.m.aS || poiVerticalityDataResponse.getNavigationBlock() == null || poiVerticalityDataResponse.getNavigationBlock().propsData == null || poiVerticalityDataResponse.getNavigationBlock().propsData.schemeSource == null) {
        } else {
            this.m.aL = poiVerticalityDataResponse.blocks.navigationBlock.propsData.schemeSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@Nullable PoiVerticalityDataResponse poiVerticalityDataResponse, boolean z) {
        Object[] objArr = {poiVerticalityDataResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faf87bdb562a1563f88866921a55248f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faf87bdb562a1563f88866921a55248f");
            return;
        }
        if (poiVerticalityDataResponse != null) {
            try {
                if (poiVerticalityDataResponse.blocks != null) {
                    a(poiVerticalityDataResponse);
                    a(poiVerticalityDataResponse.blocks.floatBlock, z);
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.poi.list.refactor.cat.a.a(this.m.c, getClass().getSimpleName(), e);
                return;
            }
        }
        com.sankuai.waimai.store.poi.list.refactor.cat.a.a(this.m.c, getClass().getSimpleName());
    }

    @Override // com.sankuai.waimai.store.assembler.component.a
    public final void a(int i2, int i3, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b045960829a9f77306f1ced62dd6470e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b045960829a9f77306f1ced62dd6470e");
        } else if (z2) {
        } else {
            if (i3 == 0) {
                g();
                com.meituan.android.bus.a.a().c(new VisibleChangeEvent(0, true, this.m.y));
                return;
            }
            f();
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.FloatBaseCard
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e1b3ca0f17ba362b48348b4420694c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e1b3ca0f17ba362b48348b4420694c3");
            return;
        }
        super.a(z);
        if (this.v != null) {
            if (z) {
                e eVar = this.v;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "0a1e5acfca8082a7fd847d912eef18f0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "0a1e5acfca8082a7fd847d912eef18f0");
                    return;
                } else if (eVar.d == null || eVar.d.getVisibility() == 0) {
                    return;
                } else {
                    eVar.a(true);
                    eVar.d.setVisibility(0);
                    return;
                }
            }
            this.v.a();
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a646699db8bbb23e1d2444095bc27065", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a646699db8bbb23e1d2444095bc27065");
        } else {
            super.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e0a4b679edd68c32f01ebd33dff49c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e0a4b679edd68c32f01ebd33dff49c");
            return;
        }
        super.onStart();
        if (this.t || !j.h().a("order/open_force_refresh", false)) {
            return;
        }
        this.u.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.PoiFloatCard.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4608d8d76c3dc00422b8a0afcd237f77", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4608d8d76c3dc00422b8a0afcd237f77");
                } else {
                    PoiFloatCard.this.e();
                }
            }
        }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45740ab59a42b98fa4165612c41443e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45740ab59a42b98fa4165612c41443e3");
            return;
        }
        c();
        super.onStop();
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b38c2979ca48c4543f3802b187a55e9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b38c2979ca48c4543f3802b187a55e9c");
            return;
        }
        com.sankuai.waimai.business.order.api.submit.c.a().unregisterOrderStatusObserver(this);
        super.onDestroy();
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
        if (this.v != null) {
            e eVar = this.v;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "a7b73ee0dde9f3679c7737cd1fce6697", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "a7b73ee0dde9f3679c7737cd1fce6697");
            } else if (eVar.e != null) {
                eVar.e.onDestroy();
            }
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        d dVar;
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eea498cd0db70e41d3d837e04321d1c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eea498cd0db70e41d3d837e04321d1c0");
        } else if (poiCouponItem == null || this.v == null || (dVar = this.v.e) == null) {
        } else {
            Object[] objArr2 = {poiCouponItem};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "4b74fb4f77802d5be4b6bc86d26832f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "4b74fb4f77802d5be4b6bc86d26832f2");
            } else if (poiCouponItem == null || dVar.i == null) {
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("coupon_id", Long.valueOf(poiCouponItem.mCouponId));
                hashMap.put("coupon_status", Integer.valueOf(poiCouponItem.mCouponStatus));
                dVar.i.b("newUsercouponStatusChanged", hashMap);
            }
        }
    }

    private PoiVerticalityDataResponse d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f16d5ca37d54906ee4c6782f6bce0e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiVerticalityDataResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f16d5ca37d54906ee4c6782f6bce0e3");
        }
        try {
            return ((PoiPageViewModel) q.a((FragmentActivity) ((SCBaseActivity) this.e)).a(PoiPageViewModel.class)).b.a().response;
        } catch (Exception unused) {
            return null;
        }
    }
}
