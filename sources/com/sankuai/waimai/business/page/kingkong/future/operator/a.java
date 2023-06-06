package com.sankuai.waimai.business.page.kingkong.future.operator;

import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.page.common.list.listfloat.a;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.common.view.listfloat.c;
import com.sankuai.waimai.business.page.common.view.listfloat.e;
import com.sankuai.waimai.business.page.home.list.future.mach.d;
import com.sankuai.waimai.business.page.home.model.MvpCouponAPI;
import com.sankuai.waimai.business.page.kingkong.KingKongActivity;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, com.meituan.android.cube.pga.viewmodel.a, com.sankuai.waimai.business.page.kingkong.a> {
    public static ChangeQuickRedirect r;
    private KingkongInfo s;
    private boolean t;
    private RelativeLayout u;
    private e v;
    private LinearLayout w;
    private c x;
    private com.sankuai.waimai.business.page.common.list.listfloat.a y;
    private KingKongViewModel z;

    public static /* synthetic */ void a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "4b5aa2137d7e78aa58a5bbb41a29019e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "4b5aa2137d7e78aa58a5bbb41a29019e");
        } else if (i == 0) {
            aVar.M();
        } else if (i == 1) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = r;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a527437df86acc29e1ab13644d7132c2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a527437df86acc29e1ab13644d7132c2");
                return;
            }
            if (aVar.x != null) {
                aVar.x.b();
            }
            if (aVar.y != null) {
                com.sankuai.waimai.business.page.common.list.listfloat.a aVar2 = aVar.y;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.common.list.listfloat.a.a;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "97b6000200a8f50e197f5c0488f8fd57", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "97b6000200a8f50e197f5c0488f8fd57");
                } else if (aVar2.c.getVisibility() == 0) {
                    aVar2.e.a();
                }
            }
            if (aVar.v != null) {
                aVar.v.a();
            }
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55279d548bfe06a6aa4c1be3975268b0", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55279d548bfe06a6aa4c1be3975268b0") : new b(m(), this.h);
    }

    public a(com.sankuai.waimai.business.page.kingkong.a aVar, @Nullable ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d85061f9f6e5ee0f8025d1f42c425a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d85061f9f6e5ee0f8025d1f42c425a4");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e54264a4ca18bfc1844f992d5910925", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e54264a4ca18bfc1844f992d5910925");
            return;
        }
        super.s();
        this.s = ((com.sankuai.waimai.business.page.kingkong.a) F()).w.a().b;
        this.t = com.sankuai.waimai.business.page.kingkong.b.a(this.s) == com.sankuai.waimai.business.page.kingkong.b.FOOD;
        ((com.sankuai.waimai.business.page.kingkong.a) F()).k.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.operator.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Object[] objArr2 = {bool};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56b267c3bcdd311ea21cf404c16444dd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56b267c3bcdd311ea21cf404c16444dd");
                    return;
                }
                if (a.this.y != null) {
                    a.this.y.a(true);
                }
                if (a.this.x != null) {
                    a.this.x.a(2, AppUtil.generatePageInfoKey(a.this.l()));
                }
            }
        });
        ((com.sankuai.waimai.business.page.kingkong.a) F()).l.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.operator.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Object[] objArr2 = {bool};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be631cb0fe1e1207a7ac543b915bab37", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be631cb0fe1e1207a7ac543b915bab37");
                } else if (a.this.y != null) {
                    a.this.y.a(false);
                }
            }
        });
        ((com.sankuai.waimai.business.page.kingkong.a) F()).i.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.operator.a.3
            @Override // com.meituan.android.cube.pga.action.b
            public final /* bridge */ /* synthetic */ void a(Boolean bool) {
            }
        });
        ((com.sankuai.waimai.business.page.kingkong.a) F()).aj.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.operator.a.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25979fd9334cfbebde0553b92791a445", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25979fd9334cfbebde0553b92791a445");
                } else if (a.this.u != null) {
                    if (bool2.booleanValue()) {
                        a.this.u.setVisibility(0);
                    } else {
                        a.this.u.setVisibility(8);
                    }
                }
            }
        });
        ((com.sankuai.waimai.business.page.kingkong.a) F()).bJ.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.page.kingkong.future.operator.a.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d19cba1755e416dfd3dcce8f5b5cc394", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d19cba1755e416dfd3dcce8f5b5cc394");
                    return;
                }
                a.a(a.this, num2.intValue());
                d.a().b();
            }
        });
        LinearLayout a = ((b) this.g).a();
        Object[] objArr2 = {a};
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63d87db1cc195ccc86d0f6ab03ce593b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63d87db1cc195ccc86d0f6ab03ce593b");
        } else {
            this.w = (LinearLayout) a.findViewById(R.id.qualification_rule);
            this.w.setVisibility(8);
            Object[] objArr3 = {a};
            ChangeQuickRedirect changeQuickRedirect3 = r;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "13ecdbac428410dc10864d6877b45a0e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "13ecdbac428410dc10864d6877b45a0e");
            } else {
                this.u = (RelativeLayout) a.findViewById(R.id.layout_to_top_img_poiList);
                this.v = new e(this.u, l());
                this.u.setVisibility(8);
                this.u.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.kingkong.future.operator.a.9
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1a977c0d357cb42280204e17d08badc9", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1a977c0d357cb42280204e17d08badc9");
                        } else {
                            ((com.sankuai.waimai.business.page.kingkong.a) a.this.F()).bH.a((com.meituan.android.cube.pga.common.b<Void>) null);
                        }
                    }
                });
            }
            Object[] objArr4 = {a};
            ChangeQuickRedirect changeQuickRedirect4 = r;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e149c6db198e4d221f193deddde1f8a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e149c6db198e4d221f193deddde1f8a8");
            } else {
                this.x = new c(l());
                this.x.a(a);
                this.x.a(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.kingkong.future.operator.a.8
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3f52e05e9156d6d47acba369379d355d", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3f52e05e9156d6d47acba369379d355d");
                            return;
                        }
                        JudasManualManager.a("b_ay8J4").a("tip_icon", 0).a("c_i5kxn8l").a(a.this.l()).a();
                        GlobalCartManager.toGlobalCartActivity(a.this.l());
                    }
                });
            }
            Object[] objArr5 = {a};
            ChangeQuickRedirect changeQuickRedirect5 = r;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4b0620bc6dbfe991f793b2785353c46f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4b0620bc6dbfe991f793b2785353c46f");
            } else {
                this.y = new com.sankuai.waimai.business.page.common.list.listfloat.a(l(), a.findViewById(R.id.layout_floating_icon));
                this.y.h = new a.InterfaceC0762a() { // from class: com.sankuai.waimai.business.page.kingkong.future.operator.a.7
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.page.common.list.listfloat.a.InterfaceC0762a
                    public final void a(View view, @NonNull MvpCouponAPI.a aVar) {
                        Object[] objArr6 = {view, aVar};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4d05c84175b0f8b416e684822c096274", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4d05c84175b0f8b416e684822c096274");
                        } else if (aVar.c != 1 || TextUtils.isEmpty(aVar.d)) {
                        } else {
                            com.sankuai.waimai.foundation.router.a.a(a.this.l(), aVar.d);
                        }
                    }

                    @Override // com.sankuai.waimai.business.page.common.list.listfloat.a.InterfaceC0762a
                    public final void a(@NonNull MvpCouponAPI.a aVar) {
                        com.sankuai.waimai.business.page.common.model.b a2;
                        Object[] objArr6 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "67d340b3969173b89bb8a03066bc063b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "67d340b3969173b89bb8a03066bc063b");
                        } else if (aVar.c != 1 || (a2 = a.this.z.k.a()) == null) {
                        } else {
                            JudasManualManager.a a3 = JudasManualManager.a("b_waimai_fwe6wpsq_mc").a("c_i5kxn8l");
                            a3.b = AppUtil.generatePageInfoKey(this);
                            a3.a("category_code", a2.h).a("fst_cate_id", a2.b).a("sec_cate_id", a2.g).a();
                        }
                    }

                    @Override // com.sankuai.waimai.business.page.common.list.listfloat.a.InterfaceC0762a
                    public final void b(@NonNull MvpCouponAPI.a aVar) {
                        com.sankuai.waimai.business.page.common.model.b a2;
                        Object[] objArr6 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0291ea0e67750ee0a49811915da12308", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0291ea0e67750ee0a49811915da12308");
                        } else if (aVar.c != 1 || (a2 = a.this.z.k.a()) == null) {
                        } else {
                            JudasManualManager.a a3 = JudasManualManager.b("b_waimai_iyd0vfsx_mv").a("c_i5kxn8l");
                            a3.b = AppUtil.generatePageInfoKey(this);
                            a3.a("category_code", a2.h).a("fst_cate_id", a2.b).a("sec_cate_id", a2.g).a();
                        }
                    }

                    @Override // com.sankuai.waimai.business.page.common.list.listfloat.a.InterfaceC0762a
                    public final boolean c(@NonNull MvpCouponAPI.a aVar) {
                        return aVar.c == 1;
                    }

                    @Override // com.sankuai.waimai.business.page.common.list.listfloat.a.InterfaceC0762a
                    public final int d(@NonNull MvpCouponAPI.a aVar) {
                        if (aVar.c == 1) {
                            return R.drawable.wm_page_common_allowance_floating_icon;
                        }
                        return 0;
                    }
                };
                if (this.t) {
                    final com.sankuai.waimai.business.page.common.list.listfloat.a aVar = this.y;
                    Long valueOf = Long.valueOf(this.s.b);
                    Long valueOf2 = Long.valueOf(this.s.g);
                    Long valueOf3 = Long.valueOf(this.s.d);
                    Object[] objArr6 = {valueOf, valueOf2, valueOf3};
                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.common.list.listfloat.a.a;
                    if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "d66b1d8d676f4a0c655b0ecc4734b178", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "d66b1d8d676f4a0c655b0ecc4734b178");
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.b("FloatingIcon", "updateServerConfig", new Object[0]);
                        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((MvpCouponAPI) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) MvpCouponAPI.class)).getValidResponse(valueOf, valueOf2, valueOf3), new b.AbstractC1042b<BaseResponse<MvpCouponAPI.a>>() { // from class: com.sankuai.waimai.business.page.common.list.listfloat.a.3
                            public static ChangeQuickRedirect a;

                            @Override // rx.e
                            public final /* synthetic */ void onNext(Object obj) {
                                BaseResponse baseResponse = (BaseResponse) obj;
                                Object[] objArr7 = {baseResponse};
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "d0b4b96345aa52601e5f0b123606f695", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "d0b4b96345aa52601e5f0b123606f695");
                                } else if (baseResponse == null || baseResponse.code != 0) {
                                } else {
                                    a aVar2 = aVar;
                                    MvpCouponAPI.a aVar3 = (MvpCouponAPI.a) baseResponse.data;
                                    Object[] objArr8 = {aVar3};
                                    ChangeQuickRedirect changeQuickRedirect8 = a.a;
                                    if (PatchProxy.isSupport(objArr8, aVar2, changeQuickRedirect8, false, "94ad2cb09f0e42d29b7943b1eaf4a439", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr8, aVar2, changeQuickRedirect8, false, "94ad2cb09f0e42d29b7943b1eaf4a439");
                                    } else if (aVar3 == null || (aVar2.h != null && !aVar2.h.c(aVar3))) {
                                        aVar2.b(false);
                                    } else {
                                        aVar2.f = aVar3;
                                        if (!TextUtils.isEmpty(aVar3.b) && aVar3.a == 1) {
                                            aVar2.b(true);
                                            aVar2.a();
                                            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                                            a2.b = aVar2.b;
                                            a2.c = aVar3.b;
                                            a2.i = aVar2.h == null ? 0 : aVar2.h.d(aVar3);
                                            a2.a(aVar2.d);
                                        } else {
                                            aVar2.b(false);
                                        }
                                    }
                                    com.sankuai.waimai.foundation.utils.log.a.b("FloatingIcon", "perform valid api success", new Object[0]);
                                }
                            }

                            @Override // rx.e
                            public final void onError(Throwable th) {
                                Object[] objArr7 = {th};
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "1f9ac80fb011431575da4b29a2d33d0a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "1f9ac80fb011431575da4b29a2d33d0a");
                                    return;
                                }
                                com.sankuai.waimai.foundation.utils.log.a.b("FloatingIcon", "e:" + th.getMessage(), new Object[0]);
                            }
                        }, null);
                    }
                }
            }
            M();
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = r;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "6e82bac01d028d8530c73fcf03c4ccf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "6e82bac01d028d8530c73fcf03c4ccf8");
        } else if (this.x != null) {
            this.x.a();
        }
        this.z = (KingKongViewModel) q.a(l()).a(KingKongViewModel.class);
        this.z.f.a((KingKongActivity) l(), new l<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.operator.a.6
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr8 = {bool2};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "fc09d5e7ae2bed5a6c7b39400f3c38d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "fc09d5e7ae2bed5a6c7b39400f3c38d3");
                } else if (bool2 == null || !bool2.booleanValue()) {
                    a.this.M();
                    ((b) a.this.g).a().setVisibility(0);
                } else {
                    ((b) a.this.g).a().setVisibility(8);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb736936b26e9252e4c18c60c3cdd912", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb736936b26e9252e4c18c60c3cdd912");
            return;
        }
        if (this.x != null) {
            this.x.c();
        }
        if (this.y != null) {
            this.y.b();
        }
        if (this.v != null) {
            this.v.b();
        }
    }
}
