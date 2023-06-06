package com.sankuai.waimai.store.convenient.landing;

import android.arch.lifecycle.l;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.base.preload.f;
import com.sankuai.waimai.store.convenient.model.SGBaseTileResponse;
import com.sankuai.waimai.store.convenient.model.SGConvenientLandingResponse;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer;
import com.sankuai.waimai.store.poi.list.newp.home.callback.c;
import com.sankuai.waimai.store.poi.list.newp.home.card.PoiFloatCard;
import com.sankuai.waimai.store.poi.list.newp.home.d;
import com.sankuai.waimai.store.poi.list.newp.home.e;
import com.sankuai.waimai.store.poi.list.newp.home.model.SGHomeTileResponse;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.aa;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.monitor.monitor.SGBlankPageMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGConvenientLandingBlockContainer extends BaseBlockContainer implements com.sankuai.waimai.store.i.user.a {
    public static ChangeQuickRedirect i;
    private int E;
    private List<BaseModuleDesc> F;
    private SGConvenientLandingActionBarView G;
    private boolean H;
    private String I;
    private String J;
    private int K;
    private Set<String> L;
    private String M;
    private int N;
    private int O;
    private BaseModuleDesc P;
    private com.sankuai.waimai.store.param.a Q;

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
    }

    public static /* synthetic */ void a(SGConvenientLandingBlockContainer sGConvenientLandingBlockContainer, int i2, BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {0, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = BaseBlockContainer.j;
        if (PatchProxy.isSupport(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "b522b8ccd11742cf52574fd905541ac8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "b522b8ccd11742cf52574fd905541ac8");
            return;
        }
        e d = sGConvenientLandingBlockContainer.d(0);
        if (d != null) {
            Object[] objArr2 = {baseModuleDesc};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "bc4733b23b526e36ad28be4be653d9d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "bc4733b23b526e36ad28be4be653d9d6");
                return;
            }
            if (baseModuleDesc != null) {
                d.p = baseModuleDesc;
            }
            if (d.o != null) {
                d.o.setVisibility(0);
            }
            if (d.c != null) {
                d.c.setVisibility(8);
            }
        }
    }

    public static /* synthetic */ void a(SGConvenientLandingBlockContainer sGConvenientLandingBlockContainer, SGConvenientLandingResponse sGConvenientLandingResponse) {
        Object[] objArr = {sGConvenientLandingResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "3df512fb7e2c955d7214960bfcd42d79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "3df512fb7e2c955d7214960bfcd42d79");
            return;
        }
        ImageView imageView = new ImageView(sGConvenientLandingBlockContainer.l());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, h.a(sGConvenientLandingBlockContainer.l(), 103.0f));
        layoutParams.height = (sGConvenientLandingBlockContainer.l().getWindowManager().getDefaultDisplay().getWidth() * 103) / 375;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setLayoutParams(layoutParams);
        if (!TextUtils.isEmpty(sGConvenientLandingResponse.pageBgPic)) {
            b.C0608b a = m.a(sGConvenientLandingResponse.pageBgPic, h.a(sGConvenientLandingBlockContainer.m()), ImageQualityUtil.a());
            a.g = false;
            a.k = 4;
            a.a(imageView);
        }
        sGConvenientLandingBlockContainer.c(imageView);
    }

    public static /* synthetic */ void b(SGConvenientLandingBlockContainer sGConvenientLandingBlockContainer, int i2) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = BaseBlockContainer.j;
        if (PatchProxy.isSupport(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "64bedee32b5ac099968b0d3479855388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "64bedee32b5ac099968b0d3479855388");
            return;
        }
        e d = sGConvenientLandingBlockContainer.d(0);
        if (d != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "ad950a5968a952fdbf45787393083790", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "ad950a5968a952fdbf45787393083790");
            } else if (d.c != null) {
                d.c.setBackgroundColor(0);
            }
        }
    }

    public static /* synthetic */ void c(SGConvenientLandingBlockContainer sGConvenientLandingBlockContainer) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "12103836bca9000acd5b9530d3e6477a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "12103836bca9000acd5b9530d3e6477a");
        } else if (sGConvenientLandingBlockContainer.E == 0) {
            sGConvenientLandingBlockContainer.l().s().recordStep("convenient_landing_api_end");
        }
    }

    public static /* synthetic */ void c(SGConvenientLandingBlockContainer sGConvenientLandingBlockContainer, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = BaseBlockContainer.j;
        if (PatchProxy.isSupport(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "efc5722e34dcf8996530173ec174edd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "efc5722e34dcf8996530173ec174edd8");
            return;
        }
        sGConvenientLandingBlockContainer.z();
        sGConvenientLandingBlockContainer.a(2, str);
        sGConvenientLandingBlockContainer.d(true);
    }

    public static /* synthetic */ void d(SGConvenientLandingBlockContainer sGConvenientLandingBlockContainer, List list, int i2) {
        Object[] objArr = {list, 0};
        ChangeQuickRedirect changeQuickRedirect = BaseBlockContainer.j;
        if (PatchProxy.isSupport(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "b2b7aec3e688abdd78706b16088dce32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "b2b7aec3e688abdd78706b16088dce32");
            return;
        }
        final e d = sGConvenientLandingBlockContainer.d(0);
        if (d != null) {
            Object[] objArr2 = {list, null};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "1ac10b0b4c9467de1e633a337111caba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "1ac10b0b4c9467de1e633a337111caba");
            } else if (com.sankuai.shangou.stone.util.a.b(list)) {
                if (d.s != null) {
                    d.s.a();
                }
            } else {
                new d().a(list, d.f, d.getClass().getName(), d.d != null ? d.d.a() : 0, d.m, new com.sankuai.waimai.store.poi.list.newp.home.callback.a() { // from class: com.sankuai.waimai.store.poi.list.newp.home.e.7
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.poi.list.newp.home.callback.a
                    public final void a(List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list2) {
                        Object[] objArr3 = {list2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9ede72432bc1710725c41aeff388a6f8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9ede72432bc1710725c41aeff388a6f8");
                        } else if (list2 == null) {
                        } else {
                            if (d.d != null) {
                                c cVar = d.d;
                                Object[] objArr4 = {list2};
                                ChangeQuickRedirect changeQuickRedirect4 = c.a;
                                if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "55d5b4a6403c3187f74396a0baa220d9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "55d5b4a6403c3187f74396a0baa220d9");
                                } else if (list2 != null && cVar.b != null) {
                                    int size = cVar.b.size();
                                    cVar.b.addAll(list2);
                                    if (cVar.b.size() > size) {
                                        cVar.c(size, cVar.b.size() - size);
                                    }
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = c.a;
                                    if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "1be5bf6a33e7dbe46744d9e617389ef1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "1be5bf6a33e7dbe46744d9e617389ef1");
                                    } else if (cVar.b != null) {
                                        cVar.b(cVar.b.size(), cVar.i());
                                    }
                                }
                            }
                            if (d.s != null) {
                                d.s.a();
                            }
                            if (!d.j || d.s == null) {
                                return;
                            }
                            d.s.b();
                        }
                    }
                });
            }
        }
    }

    public static /* synthetic */ void e(SGConvenientLandingBlockContainer sGConvenientLandingBlockContainer) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = BaseBlockContainer.j;
        if (PatchProxy.isSupport(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "fef0db2510b1abc30c06c367f0df9e21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "fef0db2510b1abc30c06c367f0df9e21");
            return;
        }
        sGConvenientLandingBlockContainer.z();
        sGConvenientLandingBlockContainer.a(4, "");
        sGConvenientLandingBlockContainer.d(true);
    }

    public static /* synthetic */ void f(SGConvenientLandingBlockContainer sGConvenientLandingBlockContainer) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "8fc7dc852d0d281d07103cc0dda5f31d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "8fc7dc852d0d281d07103cc0dda5f31d");
        } else {
            sGConvenientLandingBlockContainer.w.q.a(sGConvenientLandingBlockContainer.l(), com.sankuai.waimai.store.poi.list.refactor.event.d.class, new l<com.sankuai.waimai.store.poi.list.refactor.event.d>() { // from class: com.sankuai.waimai.store.convenient.landing.SGConvenientLandingBlockContainer.1
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.poi.list.refactor.event.d dVar) {
                    Object[] objArr2 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f81808410c9c10f0c46f62d5fd0685b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f81808410c9c10f0c46f62d5fd0685b5");
                    } else {
                        SGConvenientLandingBlockContainer.this.e(0);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void f(SGConvenientLandingBlockContainer sGConvenientLandingBlockContainer, int i2) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = BaseBlockContainer.j;
        if (PatchProxy.isSupport(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "7464157f1735f3935f02ce9b07d11ef1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "7464157f1735f3935f02ce9b07d11ef1");
            return;
        }
        e d = sGConvenientLandingBlockContainer.d(0);
        if (d != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "df681b595913827c5671f7517df6176f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "df681b595913827c5671f7517df6176f");
                return;
            }
            if (d.o != null) {
                d.o.setVisibility(8);
            }
            if (d.c != null) {
                d.c.setVisibility(0);
            }
        }
    }

    public static /* synthetic */ void g(SGConvenientLandingBlockContainer sGConvenientLandingBlockContainer, int i2) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = BaseBlockContainer.j;
        if (PatchProxy.isSupport(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "bb1009d2e608cb84594a49f13524e60d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "bb1009d2e608cb84594a49f13524e60d");
            return;
        }
        e d = sGConvenientLandingBlockContainer.d(0);
        if (d != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "00f6060259d7b529a14f66c756e55aec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "00f6060259d7b529a14f66c756e55aec");
                return;
            }
            d.j = false;
            d.k = false;
            if (d.h != null) {
                d.h.c();
            }
        }
    }

    public static /* synthetic */ void h(SGConvenientLandingBlockContainer sGConvenientLandingBlockContainer) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "b4b9e4813739c76fe481f2e2c15c550e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "b4b9e4813739c76fe481f2e2c15c550e");
        } else if (sGConvenientLandingBlockContainer.H) {
            SGBaseTileResponse.SubNaviInfo subNaviInfo = new SGBaseTileResponse.SubNaviInfo();
            subNaviInfo.categoryInfos = new ArrayList();
            subNaviInfo.categoryInfos.add(new CategoryInfo());
            sGConvenientLandingBlockContainer.a(subNaviInfo);
            sGConvenientLandingBlockContainer.H = false;
        }
    }

    public static /* synthetic */ void o(SGConvenientLandingBlockContainer sGConvenientLandingBlockContainer) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "875e1037a5152705f4eb252c8161e137", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "875e1037a5152705f4eb252c8161e137");
        } else if (sGConvenientLandingBlockContainer.E == 0) {
            com.sankuai.meituan.takeoutnew.util.aop.h.a(sGConvenientLandingBlockContainer.l().s().recordStep("convenient_landing_data_ready"));
        }
    }

    public static /* synthetic */ void q(SGConvenientLandingBlockContainer sGConvenientLandingBlockContainer) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "276db4d8ff22465a2ab4be40a9b363f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGConvenientLandingBlockContainer, changeQuickRedirect, false, "276db4d8ff22465a2ab4be40a9b363f5");
        } else if (sGConvenientLandingBlockContainer.E == 0) {
            com.sankuai.meituan.takeoutnew.util.aop.h.a(sGConvenientLandingBlockContainer.l().s().recordStep("convenient_landing_data_failure"));
        }
    }

    public SGConvenientLandingBlockContainer(Fragment fragment, com.sankuai.waimai.store.param.a aVar) {
        super(fragment, aVar);
        Object[] objArr = {fragment, aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e055947133e329283466287de0be8b51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e055947133e329283466287de0be8b51");
            return;
        }
        this.E = 0;
        this.F = new ArrayList();
        this.H = true;
        this.I = "";
        this.J = "";
        this.K = 0;
        this.L = new HashSet();
        this.M = "";
        this.N = -99;
        this.O = 0;
        this.Q = aVar;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer, com.meituan.android.cube.core.f
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8cb01903305052ce246ab70376cc8ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8cb01903305052ce246ab70376cc8ef");
            return;
        }
        super.a(bundle);
        this.G = new SGConvenientLandingActionBarView(l(), this.Q);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer, com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4039f6261c4e8778635e759bc8fc366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4039f6261c4e8778635e759bc8fc366");
        } else {
            super.a_(view);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer
    public final void a(com.sankuai.waimai.store.poi.list.newp.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0756dfc35f773967c1aa1384a9f6f2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0756dfc35f773967c1aa1384a9f6f2f");
            return;
        }
        aVar.a = false;
        aVar.c = true;
        aVar.b = false;
        aVar.d = false;
        aVar.g = 1;
        aVar.f = "c_waimai_zxw1seru";
        aVar.p = "convenient_landing_page_fps";
        aVar.o = R.layout.wm_sc_convenient_landing_list_view_item;
        aVar.r = "Convenient_Shelf";
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer
    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "837aff6c4b7323a661373edc65a545bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "837aff6c4b7323a661373edc65a545bb");
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("category_type", Long.valueOf(this.Q.c));
        com.sankuai.waimai.store.base.net.sg.a.a((Object) l().w()).a(hashMap, (j<SGHomeTileResponse>) new k<SGHomeTileResponse>() { // from class: com.sankuai.waimai.store.convenient.landing.SGConvenientLandingBlockContainer.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                SGHomeTileResponse sGHomeTileResponse = (SGHomeTileResponse) obj;
                Object[] objArr2 = {sGHomeTileResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f23e31dd74a2fe9da4f3b4bcf6d20d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f23e31dd74a2fe9da4f3b4bcf6d20d4");
                    return;
                }
                super.a((AnonymousClass2) sGHomeTileResponse);
                String str = (sGHomeTileResponse.blocks == null || sGHomeTileResponse.blocks.navigationBlock == null || sGHomeTileResponse.blocks.navigationBlock.data == null || sGHomeTileResponse.blocks.navigationBlock.data.searchExtendInfo == null) ? "" : sGHomeTileResponse.blocks.navigationBlock.data.searchExtendInfo.a;
                SGConvenientLandingBlockContainer.this.Q.a(SGConvenientLandingBlockContainer.this.m(), str);
                SGConvenientLandingBlockContainer.this.Q.x = str;
                SGConvenientLandingBlockContainer.this.G.setTileResponse(sGHomeTileResponse);
                for (BaseCard baseCard : new com.sankuai.waimai.store.poi.list.newp.home.card.a(SGConvenientLandingBlockContainer.this.Q).a(sGHomeTileResponse, SGConvenientLandingBlockContainer.this.l(), SGConvenientLandingBlockContainer.this.l())) {
                    SGConvenientLandingBlockContainer.this.a(baseCard, true);
                    if (baseCard instanceof PoiFloatCard) {
                        PoiFloatCard poiFloatCard = (PoiFloatCard) baseCard;
                        Object[] objArr3 = {sGHomeTileResponse};
                        ChangeQuickRedirect changeQuickRedirect3 = PoiFloatCard.h;
                        if (PatchProxy.isSupport(objArr3, poiFloatCard, changeQuickRedirect3, false, "9cb0b689fdda9f8d46290ffe7dd06eea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, poiFloatCard, changeQuickRedirect3, false, "9cb0b689fdda9f8d46290ffe7dd06eea");
                        } else {
                            if (sGHomeTileResponse != null) {
                                try {
                                    if (sGHomeTileResponse.blocks != null && sGHomeTileResponse.blocks.floatBlock != null) {
                                        ArrayList arrayList = new ArrayList();
                                        Iterator<BaseTile<SGBaseTileResponse.FloatingData, com.sankuai.waimai.store.repository.model.d>> it = sGHomeTileResponse.blocks.floatBlock.iterator();
                                        while (it.hasNext()) {
                                            BaseTile<SGBaseTileResponse.FloatingData, com.sankuai.waimai.store.repository.model.d> next = it.next();
                                            if (next != null && next.sType != null && next.sType.equals("sm_type_super_store_globalcart")) {
                                                poiFloatCard.i.aJ = next.propsData.b;
                                                poiFloatCard.i.aK = next.propsData.a;
                                                com.sankuai.waimai.store.assembler.component.e eVar = new com.sankuai.waimai.store.assembler.component.e();
                                                eVar.f = next.layoutInfo.bottom;
                                                eVar.e = next.layoutInfo.top;
                                                eVar.d = next.layoutInfo.right;
                                                eVar.c = next.layoutInfo.left;
                                                PoiVerticalityDataResponse.FloatingEntranceItemWithLocation floatingEntranceItemWithLocation = new PoiVerticalityDataResponse.FloatingEntranceItemWithLocation(5, eVar);
                                                floatingEntranceItemWithLocation.tipMsg = next.propsData.c;
                                                arrayList.add(floatingEntranceItemWithLocation);
                                            }
                                            if (next != null && next.sType != null && next.sType.equals("sm_type_super_store_top")) {
                                                com.sankuai.waimai.store.assembler.component.e eVar2 = new com.sankuai.waimai.store.assembler.component.e();
                                                eVar2.f = next.layoutInfo.bottom;
                                                eVar2.e = next.layoutInfo.top;
                                                eVar2.d = next.layoutInfo.right;
                                                eVar2.c = next.layoutInfo.left;
                                                arrayList.add(new PoiVerticalityDataResponse.FloatingEntranceItemWithLocation(2, eVar2));
                                            }
                                        }
                                        poiFloatCard.a((List<PoiVerticalityDataResponse.FloatingEntranceItemWithLocation>) arrayList);
                                    }
                                } catch (Exception unused) {
                                    com.sankuai.waimai.store.poi.list.refactor.cat.a.a(poiFloatCard.i.c, poiFloatCard.getClass().getSimpleName());
                                }
                            }
                            com.sankuai.waimai.store.poi.list.refactor.cat.a.a(poiFloatCard.i.c, poiFloatCard.getClass().getSimpleName());
                        }
                    }
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50896d5b2b16b189f235ddd6040a0b9a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50896d5b2b16b189f235ddd6040a0b9a");
                } else {
                    super.a(bVar);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aaa6dfb2685a39d63fc60c9437494d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aaa6dfb2685a39d63fc60c9437494d1");
        } else {
            t();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer
    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e8fab96d99baba5dabc9245eabcd7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e8fab96d99baba5dabc9245eabcd7b");
            return;
        }
        D();
        B();
        com.sankuai.waimai.store.base.net.sg.a.a((Object) l().w()).a(this.Q.ae, this.E, this.Q.aq, this.Q.ar, this.Q.al, this.Q.am, this.Q.an, this.Q.ao, this.I, this.K, this.M, this.N, this.Q.aj, this.O, new k<SGConvenientLandingResponse>() { // from class: com.sankuai.waimai.store.convenient.landing.SGConvenientLandingBlockContainer.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                SGConvenientLandingResponse sGConvenientLandingResponse = (SGConvenientLandingResponse) obj;
                Object[] objArr2 = {sGConvenientLandingResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62169271d78210542a5114756a50c09e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62169271d78210542a5114756a50c09e");
                    return;
                }
                super.a((AnonymousClass3) sGConvenientLandingResponse);
                SGConvenientLandingBlockContainer.c(SGConvenientLandingBlockContainer.this);
                if (sGConvenientLandingResponse == null || com.sankuai.shangou.stone.util.a.b(sGConvenientLandingResponse.cardInfoList)) {
                    SGConvenientLandingBlockContainer.this.w.s = "BlankDataError";
                    SGConvenientLandingBlockContainer.e(SGConvenientLandingBlockContainer.this);
                    return;
                }
                SGConvenientLandingBlockContainer.f(SGConvenientLandingBlockContainer.this);
                SGConvenientLandingBlockContainer.this.A();
                SGConvenientLandingBlockContainer.h(SGConvenientLandingBlockContainer.this);
                SGConvenientLandingBlockContainer.this.w.s = "Success";
                SGConvenientLandingBlockContainer.b(SGConvenientLandingBlockContainer.this, 0);
                SGConvenientLandingBlockContainer.this.G.a(sGConvenientLandingResponse, SGConvenientLandingBlockContainer.this.N, SGConvenientLandingBlockContainer.this.M);
                SGConvenientLandingBlockContainer.this.b(SGConvenientLandingBlockContainer.this.G);
                SGConvenientLandingBlockContainer.a(SGConvenientLandingBlockContainer.this, sGConvenientLandingResponse);
                if (!TextUtils.isEmpty(sGConvenientLandingResponse.traceId)) {
                    SGConvenientLandingBlockContainer.this.J = sGConvenientLandingResponse.traceId;
                }
                if (!TextUtils.isEmpty(sGConvenientLandingResponse.shelfPageTraceId)) {
                    SGConvenientLandingBlockContainer.this.I = sGConvenientLandingResponse.shelfPageTraceId;
                }
                if (sGConvenientLandingResponse.quickFilter != null) {
                    SGConvenientLandingBlockContainer.this.P = sGConvenientLandingResponse.quickFilter;
                }
                SGConvenientLandingBlockContainer.this.K = sGConvenientLandingResponse.nextPageOffset;
                SGConvenientLandingBlockContainer.this.F.clear();
                for (int i2 = 0; i2 < sGConvenientLandingResponse.cardInfoList.size(); i2++) {
                    PoiCardInfo poiCardInfo = sGConvenientLandingResponse.cardInfoList.get(i2);
                    if (poiCardInfo != null) {
                        if (TextUtils.isEmpty(poiCardInfo.cardID)) {
                            SGConvenientLandingBlockContainer.this.F.add(poiCardInfo.moduleDesc);
                        } else if (!SGConvenientLandingBlockContainer.this.L.contains(poiCardInfo.cardID)) {
                            SGConvenientLandingBlockContainer.this.L.add(poiCardInfo.cardID);
                            SGConvenientLandingBlockContainer.this.F.add(poiCardInfo.moduleDesc);
                        }
                    }
                }
                SGConvenientLandingBlockContainer.this.x();
                SGConvenientLandingBlockContainer.this.a(SGConvenientLandingBlockContainer.this.F, 0);
                if (!sGConvenientLandingResponse.poiHasNextPage) {
                    SGConvenientLandingBlockContainer.this.c(0);
                }
                SGConvenientLandingBlockContainer.o(SGConvenientLandingBlockContainer.this);
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7bb35016c02713b0d16ab6717b5d08fa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7bb35016c02713b0d16ab6717b5d08fa");
                    return;
                }
                super.a(bVar);
                SGConvenientLandingBlockContainer.this.A();
                SGConvenientLandingBlockContainer.c(SGConvenientLandingBlockContainer.this, bVar.getMessage());
                SGConvenientLandingBlockContainer.this.b(SGConvenientLandingBlockContainer.this.G);
                SGConvenientLandingBlockContainer.this.b(0);
                SGConvenientLandingBlockContainer.q(SGConvenientLandingBlockContainer.this);
                bVar.printStackTrace();
            }
        });
    }

    private void C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8f8872a1b6475036644bf42db8286cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8f8872a1b6475036644bf42db8286cb");
            return;
        }
        if (this.E == 0) {
            Object[] objArr2 = {0};
            ChangeQuickRedirect changeQuickRedirect2 = BaseBlockContainer.j;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "844fbcb1e9411defc622520ed3d6b5c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "844fbcb1e9411defc622520ed3d6b5c1");
            } else {
                e d = d(0);
                if (d != null) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = e.a;
                    if (PatchProxy.isSupport(objArr3, d, changeQuickRedirect3, false, "4f3168ac831756019cccfd05e28fd9b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, d, changeQuickRedirect3, false, "4f3168ac831756019cccfd05e28fd9b1");
                    } else if (d.b != null) {
                        d.b.a(2);
                    }
                }
            }
        }
        com.sankuai.waimai.store.base.net.sg.a.a((Object) l().w()).a(this.Q.ae, this.E, this.Q.aq, this.Q.ar, this.Q.al, this.Q.am, this.Q.an, this.Q.ao, this.I, this.K, this.M, this.N, this.Q.aj, this.O, new k<SGConvenientLandingResponse>() { // from class: com.sankuai.waimai.store.convenient.landing.SGConvenientLandingBlockContainer.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                SGConvenientLandingResponse sGConvenientLandingResponse = (SGConvenientLandingResponse) obj;
                Object[] objArr4 = {sGConvenientLandingResponse};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7b652a1488cca23ce7161d38da6ca1eb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7b652a1488cca23ce7161d38da6ca1eb");
                    return;
                }
                super.a((AnonymousClass4) sGConvenientLandingResponse);
                SGConvenientLandingBlockContainer.f(SGConvenientLandingBlockContainer.this, 0);
                SGConvenientLandingBlockContainer.g(SGConvenientLandingBlockContainer.this, 0);
                if (sGConvenientLandingResponse == null || com.sankuai.shangou.stone.util.a.b(sGConvenientLandingResponse.cardInfoList)) {
                    SGConvenientLandingBlockContainer.this.w.s = "BlankDataError";
                    SGConvenientLandingBlockContainer.this.F.clear();
                    SGConvenientLandingBlockContainer.this.a(SGConvenientLandingBlockContainer.this.F, 0);
                    SGConvenientLandingBlockContainer.this.A();
                    if (SGConvenientLandingBlockContainer.this.O == 3) {
                        SGConvenientLandingBlockContainer.a(SGConvenientLandingBlockContainer.this, 0, SGConvenientLandingBlockContainer.this.P);
                    } else {
                        SGConvenientLandingBlockContainer.this.b(0);
                    }
                    if (sGConvenientLandingResponse.poiHasNextPage) {
                        return;
                    }
                    SGConvenientLandingBlockContainer.this.c(0);
                    return;
                }
                SGConvenientLandingBlockContainer.this.w.s = "Success";
                SGConvenientLandingBlockContainer.this.A();
                if (!TextUtils.isEmpty(sGConvenientLandingResponse.traceId)) {
                    SGConvenientLandingBlockContainer.this.J = sGConvenientLandingResponse.traceId;
                }
                if (!TextUtils.isEmpty(sGConvenientLandingResponse.shelfPageTraceId)) {
                    SGConvenientLandingBlockContainer.this.I = sGConvenientLandingResponse.shelfPageTraceId;
                }
                SGConvenientLandingBlockContainer.this.K = sGConvenientLandingResponse.nextPageOffset;
                SGConvenientLandingBlockContainer.this.F.clear();
                if (SGConvenientLandingBlockContainer.this.O == 3) {
                    SGConvenientLandingBlockContainer.this.L.clear();
                }
                for (int i2 = 0; i2 < sGConvenientLandingResponse.cardInfoList.size(); i2++) {
                    PoiCardInfo poiCardInfo = sGConvenientLandingResponse.cardInfoList.get(i2);
                    if (poiCardInfo != null) {
                        if (TextUtils.isEmpty(poiCardInfo.cardID)) {
                            SGConvenientLandingBlockContainer.this.F.add(poiCardInfo.moduleDesc);
                        } else if (!SGConvenientLandingBlockContainer.this.L.contains(poiCardInfo.cardID)) {
                            SGConvenientLandingBlockContainer.this.L.add(poiCardInfo.cardID);
                            SGConvenientLandingBlockContainer.this.F.add(poiCardInfo.moduleDesc);
                        }
                    }
                }
                SGConvenientLandingBlockContainer.this.x();
                if (SGConvenientLandingBlockContainer.this.E == 0) {
                    SGConvenientLandingBlockContainer.this.a(SGConvenientLandingBlockContainer.this.F, 0);
                } else {
                    SGConvenientLandingBlockContainer.d(SGConvenientLandingBlockContainer.this, SGConvenientLandingBlockContainer.this.F, 0);
                }
                if (sGConvenientLandingResponse.poiHasNextPage) {
                    return;
                }
                SGConvenientLandingBlockContainer.this.c(0);
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr4 = {bVar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dd05120b1ace48f37e5173ebdd464d46", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dd05120b1ace48f37e5173ebdd464d46");
                    return;
                }
                super.a(bVar);
                SGConvenientLandingBlockContainer.this.b(0);
                bVar.printStackTrace();
            }
        });
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer
    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da4520dd61e50c956751b59083485b74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da4520dd61e50c956751b59083485b74");
            return;
        }
        this.E++;
        this.O = 4;
        C();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer
    public final Map<String, Object> b(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b3a08fe8027a429e33816ec36b9f0f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b3a08fe8027a429e33816ec36b9f0f5");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("wm_poi_id", Long.valueOf(this.Q.aq));
        hashMap.put("cat_id", Long.valueOf(this.Q.am));
        hashMap.put("spu_sku_id_list", this.Q.al);
        hashMap.put("first_category_code", Long.valueOf(this.Q.am));
        hashMap.put("second_category_code", Long.valueOf(this.Q.an));
        hashMap.put("sub_category_code", Long.valueOf(this.Q.an));
        hashMap.put("rank_trace_id", this.Q.ao);
        hashMap.put("trace_id", this.J);
        hashMap.put("shelf_id", this.Q.ar);
        hashMap.put(BaseModuleDesc.USE_POI_ID_STR, Boolean.valueOf(com.sankuai.waimai.store.platform.domain.manager.poi.a.w()));
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer
    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2101da010e6e378c1304c8349d54737f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2101da010e6e378c1304c8349d54737f");
            return;
        }
        this.y.put("cat_id", Long.valueOf(this.Q.am));
        this.y.put("cate_type", this.Q.ap);
        this.y.put("shelf_id", this.Q.ar);
        this.y.put("poi_id", Long.valueOf(this.Q.aq));
        this.y.put("sub_category_code", Long.valueOf(this.Q.an));
    }

    private void D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "946e0cacb893d446d7b4e0f52d175340", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "946e0cacb893d446d7b4e0f52d175340");
        } else if (this.E == 0) {
            l().s().recordStep("convenient_landing_api_start");
        }
    }

    @Override // com.meituan.android.cube.core.h
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61c90659e5632c475687d4123f273f52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61c90659e5632c475687d4123f273f52");
            return;
        }
        super.q();
        com.sankuai.waimai.store.search.ui.result.mach.h.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc2c8a53da25fc4febdcfafe8bcd456b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc2c8a53da25fc4febdcfafe8bcd456b");
        } else if (o.i()) {
            if ("BlankDataError".equals(this.w.s)) {
                HashMap hashMap = new HashMap();
                hashMap.put("first_category_code", String.valueOf(this.Q.am));
                hashMap.put("second_category_code", String.valueOf(this.Q.an));
                hashMap.put("shelf_id", String.valueOf(this.Q.ar));
                com.sankuai.waimai.store.util.monitor.b.a().a(SGBlankPageMetric.BlankDataError).a(i.a(hashMap)).c("Convenient_Shelf").a("empty_type", "BlankDataError").a();
            }
            if ("RenderError".equals(this.w.s)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("template_id", "supermarket-convenient-landing-recommend-productsupermarket-convenient-landing-recommend-more-poi");
                com.sankuai.waimai.store.util.monitor.b.a().a(SGBlankPageMetric.RenderError).a(i.a(hashMap2)).c("Convenient_Shelf").a("empty_type", "RenderError").a();
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer, com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eea51002a2201aab983ac70cdc375a12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eea51002a2201aab983ac70cdc375a12");
            return;
        }
        super.bE_();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4994970aca4afc41eb6e103c815afa1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4994970aca4afc41eb6e103c815afa1b");
        } else if (l() != null) {
            String a = aa.a(l().getIntent(), "key_pre_request_cache", "");
            com.sankuai.waimai.store.base.preload.e.a().a(a);
            if (!TextUtils.isEmpty(a)) {
                com.sankuai.waimai.store.base.net.c.a(a);
            }
            f.a(a);
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1350d3caf3e47c0004d3bbc003c16b86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1350d3caf3e47c0004d3bbc003c16b86");
        } else if (enumC1205a != null) {
            if ((enumC1205a == a.EnumC1205a.LOGIN || enumC1205a == a.EnumC1205a.LOGOUT) && !com.sankuai.waimai.store.util.b.a(l())) {
                c(true);
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer
    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6af32d6716e42d3a95fcd0abe4b95e09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6af32d6716e42d3a95fcd0abe4b95e09");
        } else {
            l().finish();
        }
    }

    @Subscribe
    public void onConvenientLandingFilterChangeReceive(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2602ee601bebd57d19d154b98902dad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2602ee601bebd57d19d154b98902dad6");
        } else if (aVar == null) {
        } else {
            this.N = aVar.a;
            this.M = aVar.b;
            this.K = 0;
            this.E = 0;
            this.O = 3;
            this.L.clear();
            e(0);
            C();
        }
    }
}
