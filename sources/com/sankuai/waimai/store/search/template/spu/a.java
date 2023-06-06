package com.sankuai.waimai.store.search.template.spu;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.shop.model.LiveBaseInfo;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import com.sankuai.waimai.store.search.model.DeliverTypeInfoVo;
import com.sankuai.waimai.store.search.model.f;
import com.sankuai.waimai.store.search.ui.result.monitor.SearchMachMonitor;
import com.sankuai.waimai.store.search.util.c;
import com.sankuai.waimai.store.search.util.e;
import com.sankuai.waimai.store.search.view.StoreHandPriceView;
import com.sankuai.waimai.store.util.m;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.search.adapterdelegates.b<f, C1318a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1318a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b96723ff9d6ae825fdae79c6086d956e", RobustBitConfig.DEFAULT_VALUE) ? (C1318a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b96723ff9d6ae825fdae79c6086d956e") : new C1318a(layoutInflater.inflate(R.layout.wm_sc_nox_search_list_item_v750_feed_spu, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull f fVar, @NonNull C1318a c1318a, int i) {
        boolean z;
        String a2;
        int color;
        String str;
        int i2;
        String str2;
        final f fVar2 = fVar;
        C1318a c1318a2 = c1318a;
        Object[] objArr = {fVar2, c1318a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0629f39de8b3a45a0dd058137400b3e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0629f39de8b3a45a0dd058137400b3e8");
            return;
        }
        Object[] objArr2 = {fVar2};
        ChangeQuickRedirect changeQuickRedirect2 = C1318a.a;
        if (PatchProxy.isSupport(objArr2, c1318a2, changeQuickRedirect2, false, "1874e40edc71f713e917ca69cbf66a76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c1318a2, changeQuickRedirect2, false, "1874e40edc71f713e917ca69cbf66a76");
            return;
        }
        final c cVar = c1318a2.b;
        Object[] objArr3 = {fVar2};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "b9618cd43e740628ce8bdb4c0f40bbc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "b9618cd43e740628ce8bdb4c0f40bbc6");
        } else if (fVar2 == null || fVar2.poiInfoItem == null || fVar2.productInfoItem == null) {
        } else {
            if (!fVar2.isExposed) {
                e.a(cVar.c, cVar.b, (BaseProductPoi) fVar2, true);
                fVar2.isExposed = true;
                if (cVar.b.ax && !cVar.b.aG) {
                    com.sankuai.waimai.store.util.monitor.c.a(SearchMachMonitor.NativeReport, "", "spu");
                    cVar.b.aG = true;
                }
            }
            cVar.a(fVar2);
            Object[] objArr4 = {fVar2};
            ChangeQuickRedirect changeQuickRedirect4 = c.a;
            if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "75156a94c078764548bb75d6cbce4cf0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "75156a94c078764548bb75d6cbce4cf0");
            } else {
                final BaseProductPoi.b bVar = fVar2.productInfoItem;
                cVar.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.spu.c.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "87ed365b06cba2723cb65e96e16f435e", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "87ed365b06cba2723cb65e96e16f435e");
                            return;
                        }
                        if (!TextUtils.isEmpty(bVar.k)) {
                            d.a(cVar.c, com.sankuai.waimai.store.search.statistics.e.a(bVar.k, cVar.ah));
                        }
                        e.a(cVar.c, cVar.b, fVar2, 0, true);
                    }
                });
            }
            BaseProductPoi.a aVar = fVar2.poiInfoItem;
            Object[] objArr5 = {aVar};
            ChangeQuickRedirect changeQuickRedirect5 = c.a;
            if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "7fe153ffbf84155a394329c3983d5491", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "7fe153ffbf84155a394329c3983d5491");
            } else if (aVar.v) {
                cVar.ad.a(0.0f, cVar.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4), 0.0f, 0.0f).b(0).c(com.sankuai.shangou.stone.util.d.a("08000000", 134217728)).a(GradientDrawable.Orientation.LEFT_RIGHT, cVar.ae);
                cVar.l.setBackground(cVar.ad.a());
                cVar.l.setVisibility(0);
            } else {
                cVar.l.setVisibility(8);
            }
            Object[] objArr6 = {fVar2};
            ChangeQuickRedirect changeQuickRedirect6 = c.a;
            if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "4982521733910f3ec1f85c1a9697c716", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "4982521733910f3ec1f85c1a9697c716");
            } else {
                BaseProductPoi.b bVar2 = fVar2.productInfoItem;
                b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a3.b = cVar.c;
                a3.c = bVar2.g;
                b.C0608b b = a3.b(cVar.n.getLayoutParams().width);
                b.f = ImageQualityUtil.b();
                b.i = R.drawable.wm_sc_nox_search_feed_default_img;
                b.j = R.drawable.wm_sc_nox_search_feed_default_img;
                b.a(cVar.n);
            }
            BaseProductPoi.b bVar3 = fVar2.productInfoItem;
            Object[] objArr7 = {bVar3};
            ChangeQuickRedirect changeQuickRedirect7 = c.a;
            if (PatchProxy.isSupport(objArr7, cVar, changeQuickRedirect7, false, "a436ffedeeaaf4c7820fbbf8336ba590", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, cVar, changeQuickRedirect7, false, "a436ffedeeaaf4c7820fbbf8336ba590");
            } else {
                u.c(cVar.C, cVar.B, cVar.D);
                LiveBaseInfo liveBaseInfo = bVar3.I;
                if (liveBaseInfo != null && liveBaseInfo.isLive) {
                    cVar.C.setVisibility(0);
                    cVar.C.a(liveBaseInfo);
                } else if (!TextUtils.isEmpty(bVar3.H)) {
                    cVar.B.setVisibility(0);
                    cVar.B.setText(bVar3.H);
                    cVar.B.setBackground(cVar.ad.a(g.a(cVar.c, 8.0f)).b(0).c(com.sankuai.waimai.store.util.b.b(cVar.c, R.color.wm_sc_nox_search_color_40000000)).a(GradientDrawable.Orientation.LEFT_RIGHT, cVar.ae).a());
                } else if (bVar3.M != null && !TextUtils.isEmpty(bVar3.M.url)) {
                    cVar.D.setVisibility(0);
                    m.c(bVar3.M.url, cVar.D.getLayoutParams().width).a(new b.d() { // from class: com.sankuai.waimai.store.search.template.spu.c.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.d
                        public final void a() {
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "98db9ad40302b4f39b5dd7eac2c6300d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "98db9ad40302b4f39b5dd7eac2c6300d");
                            } else {
                                cVar.D.setVisibility(0);
                            }
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.d
                        public final void a(int i3, Exception exc) {
                            Object[] objArr8 = {Integer.valueOf(i3), exc};
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "0f216f23f05e02c0e0930de638ea6e87", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "0f216f23f05e02c0e0930de638ea6e87");
                            } else {
                                cVar.D.setVisibility(8);
                            }
                        }
                    }).a(cVar.D);
                }
            }
            cVar.b(fVar2.recommendSummary);
            BaseProductPoi.b bVar4 = fVar2.productInfoItem;
            Object[] objArr8 = {bVar4};
            ChangeQuickRedirect changeQuickRedirect8 = c.a;
            if (PatchProxy.isSupport(objArr8, cVar, changeQuickRedirect8, false, "bba71833cbcc6545be32b201fb713fd5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, cVar, changeQuickRedirect8, false, "bba71833cbcc6545be32b201fb713fd5");
            } else if (bVar4.z == null) {
                cVar.d.setVisibility(8);
                cVar.e.setVisibility(8);
            } else {
                cVar.d.setVisibility(0);
                cVar.e.setVisibility(0);
                cVar.e.a(bVar4.z);
            }
            BaseProductPoi.b bVar5 = fVar2.productInfoItem;
            Object[] objArr9 = {bVar5};
            ChangeQuickRedirect changeQuickRedirect9 = c.a;
            if (PatchProxy.isSupport(objArr9, cVar, changeQuickRedirect9, false, "32a54fe3897764fcddb3751e3af2b54a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, cVar, changeQuickRedirect9, false, "32a54fe3897764fcddb3751e3af2b54a");
            } else {
                boolean z2 = bVar5.J == 0 && !t.a(bVar5.b);
                boolean z3 = bVar5.R != null && bVar5.R.mPreSaleLabel == 1;
                boolean z4 = bVar5.J == 3;
                if (z2) {
                    com.sankuai.waimai.store.search.util.d.a(bVar5.b, bVar5.P, cVar.o, bVar5.f);
                } else if (z3 || z4) {
                    com.sankuai.waimai.store.search.util.d.a(z3, z4, bVar5.P, cVar.o, bVar5.f);
                } else {
                    u.a(cVar.o, bVar5.f);
                    cVar.o.setTypeface(Typeface.defaultFromStyle(1));
                }
            }
            cVar.c(fVar2.recommendSummary);
            cVar.d(fVar2.recommendSummary);
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect10 = c.a;
            if (PatchProxy.isSupport(objArr10, cVar, changeQuickRedirect10, false, "7f30456bf2000e18542fa3109a8d24fa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, cVar, changeQuickRedirect10, false, "7f30456bf2000e18542fa3109a8d24fa");
            } else if (cVar.q.getVisibility() == 8 && cVar.r.getVisibility() == 8) {
                cVar.p.setVisibility(8);
            } else {
                cVar.p.setVisibility(0);
            }
            Object[] objArr11 = {fVar2};
            ChangeQuickRedirect changeQuickRedirect11 = c.a;
            if (PatchProxy.isSupport(objArr11, cVar, changeQuickRedirect11, false, "9c1388cc933678b9cb3a82d88bfba423", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, cVar, changeQuickRedirect11, false, "9c1388cc933678b9cb3a82d88bfba423");
            } else {
                cVar.f.a(cVar.g, fVar2.recommendSummary, com.sankuai.waimai.store.search.util.c.c, cVar.b);
            }
            BaseProductPoi.b bVar6 = fVar2.productInfoItem;
            Object[] objArr12 = {bVar6};
            ChangeQuickRedirect changeQuickRedirect12 = c.a;
            if (PatchProxy.isSupport(objArr12, cVar, changeQuickRedirect12, false, "b68703eb18d1f8fbe80a143827bc7270", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, cVar, changeQuickRedirect12, false, "b68703eb18d1f8fbe80a143827bc7270");
            } else {
                cVar.A.setText(bVar6.l);
            }
            BaseProductPoi.b bVar7 = fVar2.productInfoItem;
            Object[] objArr13 = {bVar7};
            ChangeQuickRedirect changeQuickRedirect13 = c.a;
            if (PatchProxy.isSupport(objArr13, cVar, changeQuickRedirect13, false, "f0d4d3392c541e68859185b3b9b07968", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr13, cVar, changeQuickRedirect13, false, "f0d4d3392c541e68859185b3b9b07968");
            } else {
                cVar.v.setVisibility(8);
                cVar.w.setVisibility(8);
                cVar.ab.setVisibility(8);
                cVar.x.setVisibility(8);
                cVar.y.setVisibility(8);
                StoreHandPriceView storeHandPriceView = cVar.ab;
                HandPriceInfo handPriceInfo = bVar7.F;
                Object[] objArr14 = {handPriceInfo};
                ChangeQuickRedirect changeQuickRedirect14 = StoreHandPriceView.a;
                if (PatchProxy.isSupport(objArr14, storeHandPriceView, changeQuickRedirect14, false, "2a8209e670d569019a1f0353b3a7b695", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr14, storeHandPriceView, changeQuickRedirect14, false, "2a8209e670d569019a1f0353b3a7b695")).booleanValue();
                } else {
                    if (handPriceInfo == null) {
                        storeHandPriceView.setVisibility(8);
                    } else {
                        String valueOf = String.valueOf(i.a(handPriceInfo.handActivityPrice));
                        if (TextUtils.isEmpty(valueOf) || TextUtils.isEmpty(handPriceInfo.handPriceLabel)) {
                            storeHandPriceView.setVisibility(8);
                        } else {
                            storeHandPriceView.setVisibility(0);
                            storeHandPriceView.b.setText(storeHandPriceView.a(handPriceInfo, valueOf));
                            storeHandPriceView.c.setText(handPriceInfo.handPriceLabel);
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    cVar.u.setPrice(bVar7.h);
                    cVar.u.setPriceTheme(1);
                    cVar.s.post(new Runnable() { // from class: com.sankuai.waimai.store.search.template.spu.c.4
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr15 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect15 = a;
                            if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "c99eefc7ba8978665a1022c668cd9833", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "c99eefc7ba8978665a1022c668cd9833");
                                return;
                            }
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) cVar.t.getLayoutParams();
                            ViewGroup.LayoutParams layoutParams2 = cVar.ab.getLayoutParams();
                            int i3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + 0 : 0;
                            ViewGroup.LayoutParams layoutParams3 = cVar.A.getLayoutParams();
                            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                                i3 += ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin;
                            }
                            if (cVar.t.getMeasuredWidth() + cVar.ab.getMeasuredWidth() + cVar.A.getMeasuredWidth() + i3 >= cVar.s.getMeasuredWidth()) {
                                layoutParams.width = 0;
                                layoutParams.weight = 1.0f;
                            } else {
                                layoutParams.width = -2;
                                layoutParams.weight = 0.0f;
                            }
                            cVar.t.setLayoutParams(layoutParams);
                        }
                    });
                } else {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) cVar.t.getLayoutParams();
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                    cVar.t.setLayoutParams(layoutParams);
                    cVar.u.setPriceTheme(0);
                    String str3 = bVar7.j;
                    if (!TextUtils.isEmpty(str3)) {
                        cVar.u.setPrice(bVar7.h);
                        cVar.u.setUnit(str3);
                    } else if (!TextUtils.isEmpty(bVar7.i)) {
                        cVar.u.a(bVar7.h, bVar7.i);
                    } else {
                        cVar.u.setPrice(bVar7.h);
                    }
                    String str4 = bVar7.t == null ? "" : bVar7.t.recommendReason;
                    if (!TextUtils.isEmpty(str4)) {
                        if (bVar7.t.activityType == 56) {
                            cVar.w.setVisibility(0);
                            cVar.w.setHotSaleText(str4);
                        } else {
                            cVar.v.setVisibility(0);
                            cVar.v.setText(str4);
                        }
                    } else {
                        Double a4 = com.sankuai.waimai.store.util.u.a(bVar7.w, 0.0d);
                        Double a5 = com.sankuai.waimai.store.util.u.a(bVar7.h, 0.0d);
                        if (!TextUtils.isEmpty(bVar7.w) && h.d(a4, Double.valueOf(0.0d)) && h.b(a4, a5)) {
                            cVar.x.setVisibility(0);
                            cVar.x.setText(cVar.c.getString(R.string.wm_sc_nox_search_good_label_price, h.a(a4.doubleValue())));
                        } else if (!TextUtils.isEmpty(bVar7.L)) {
                            cVar.y.setVisibility(0);
                            cVar.y.setText(bVar7.L);
                        }
                    }
                }
            }
            final BaseProductPoi.b bVar8 = fVar2.productInfoItem;
            Object[] objArr15 = {bVar8};
            ChangeQuickRedirect changeQuickRedirect15 = c.a;
            if (PatchProxy.isSupport(objArr15, cVar, changeQuickRedirect15, false, "42127b111e71690c7a14a21913ee8868", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr15, cVar, changeQuickRedirect15, false, "42127b111e71690c7a14a21913ee8868");
            } else {
                cVar.f.a(cVar.h, cVar.i, cVar.j, bVar8.C, bVar8.D, new c.a() { // from class: com.sankuai.waimai.store.search.template.spu.c.5
                    @Override // com.sankuai.waimai.store.search.util.c.a
                    public final void a(boolean z5) {
                        bVar8.D = z5;
                    }
                }, true);
            }
            Object[] objArr16 = {fVar2};
            ChangeQuickRedirect changeQuickRedirect16 = c.a;
            if (PatchProxy.isSupport(objArr16, cVar, changeQuickRedirect16, false, "8b4d9239ed060d0ae96d2de695264b63", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr16, cVar, changeQuickRedirect16, false, "8b4d9239ed060d0ae96d2de695264b63");
            } else {
                final BaseProductPoi.a aVar2 = fVar2.poiInfoItem;
                cVar.K.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.spu.c.6
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr17 = {view};
                        ChangeQuickRedirect changeQuickRedirect17 = a;
                        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "268216f9396047f940100a01f0ae16ed", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "268216f9396047f940100a01f0ae16ed");
                            return;
                        }
                        if (!TextUtils.isEmpty(aVar2.s)) {
                            d.a(cVar.c, com.sankuai.waimai.store.search.statistics.e.a(aVar2.s, cVar.ah));
                        }
                        e.a(cVar.c, cVar.b, fVar2, 1, true);
                    }
                });
            }
            BaseProductPoi.a aVar3 = fVar2.poiInfoItem;
            Object[] objArr17 = {aVar3};
            ChangeQuickRedirect changeQuickRedirect17 = c.a;
            if (PatchProxy.isSupport(objArr17, cVar, changeQuickRedirect17, false, "a5b3a5936803a2dfdf34689b02160120", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr17, cVar, changeQuickRedirect17, false, "a5b3a5936803a2dfdf34689b02160120");
            } else {
                b.C0608b a6 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a6.b = cVar.c;
                a6.c = aVar3.e;
                a6.j = R.drawable.wm_sc_nox_search_feed_default_img;
                a6.i = R.drawable.wm_sc_nox_search_feed_default_img;
                a6.a(cVar.L);
            }
            BaseProductPoi.a aVar4 = fVar2.poiInfoItem;
            Object[] objArr18 = {aVar4};
            ChangeQuickRedirect changeQuickRedirect18 = c.a;
            if (PatchProxy.isSupport(objArr18, cVar, changeQuickRedirect18, false, "a31d2e9e09b6bca4fc1ebb9bb98cc900", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr18, cVar, changeQuickRedirect18, false, "a31d2e9e09b6bca4fc1ebb9bb98cc900");
            } else {
                String str5 = aVar4.f;
                final ImageView imageView = cVar.M;
                Object[] objArr19 = {str5, imageView};
                ChangeQuickRedirect changeQuickRedirect19 = c.a;
                if (PatchProxy.isSupport(objArr19, cVar, changeQuickRedirect19, false, "92fb190f6d48ca8c42cb0fa70dadae35", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr19, cVar, changeQuickRedirect19, false, "92fb190f6d48ca8c42cb0fa70dadae35");
                } else if (TextUtils.isEmpty(str5)) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                    b.C0608b a7 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a7.b = cVar.c;
                    a7.c = str5;
                    a7.a(new b.d() { // from class: com.sankuai.waimai.store.search.template.spu.c.7
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.d
                        public final void a() {
                            Object[] objArr20 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect20 = a;
                            if (PatchProxy.isSupport(objArr20, this, changeQuickRedirect20, false, "cb7ca79d5d71065e3b7a4b3e91100053", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr20, this, changeQuickRedirect20, false, "cb7ca79d5d71065e3b7a4b3e91100053");
                            } else {
                                imageView.setVisibility(0);
                            }
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.d
                        public final void a(int i3, Exception exc) {
                            Object[] objArr20 = {Integer.valueOf(i3), exc};
                            ChangeQuickRedirect changeQuickRedirect20 = a;
                            if (PatchProxy.isSupport(objArr20, this, changeQuickRedirect20, false, "11c0531978f7ba6dab5ee61d11d8cd82", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr20, this, changeQuickRedirect20, false, "11c0531978f7ba6dab5ee61d11d8cd82");
                            } else {
                                imageView.setVisibility(8);
                            }
                        }
                    }).a(imageView);
                }
            }
            BaseProductPoi.a aVar5 = fVar2.poiInfoItem;
            Object[] objArr20 = {aVar5};
            ChangeQuickRedirect changeQuickRedirect20 = c.a;
            if (PatchProxy.isSupport(objArr20, cVar, changeQuickRedirect20, false, "e362c0abfef31f4f4f5900e0a5e59779", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr20, cVar, changeQuickRedirect20, false, "e362c0abfef31f4f4f5900e0a5e59779");
            } else {
                cVar.N.setText(aVar5.d);
            }
            BaseProductPoi.a aVar6 = fVar2.poiInfoItem;
            Object[] objArr21 = {aVar6};
            ChangeQuickRedirect changeQuickRedirect21 = c.a;
            if (PatchProxy.isSupport(objArr21, cVar, changeQuickRedirect21, false, "4338e295e922cadbbaa16f95f92f74a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr21, cVar, changeQuickRedirect21, false, "4338e295e922cadbbaa16f95f92f74a2");
            } else {
                double d = aVar6.h;
                if (h.e(Double.valueOf(d), Double.valueOf(0.0d)) && h.c(Double.valueOf(d), Double.valueOf(5.0d))) {
                    boolean a8 = h.a(Double.valueOf(d), Double.valueOf(0.0d));
                    cVar.Q.setVisibility(0);
                    TextView textView = cVar.Q;
                    if (a8) {
                        a2 = com.sankuai.waimai.store.util.b.a(cVar.c, (int) R.string.wm_sc_search_no_score);
                    } else {
                        a2 = h.a(Double.valueOf(d), 1, 1);
                    }
                    textView.setText(a2);
                    cVar.Q.setCompoundDrawablesWithIntrinsicBounds(a8 ? R.drawable.wm_sc_nox_search_rating_unselect_style2 : R.drawable.wm_sc_nox_search_rating_select_style2, 0, 0, 0);
                    TextView textView2 = cVar.Q;
                    if (a8) {
                        color = cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_999794);
                    } else {
                        color = cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_FFA100);
                    }
                    textView2.setTextColor(color);
                } else {
                    cVar.Q.setVisibility(8);
                }
            }
            Object[] objArr22 = {fVar2};
            ChangeQuickRedirect changeQuickRedirect22 = c.a;
            if (PatchProxy.isSupport(objArr22, cVar, changeQuickRedirect22, false, "0fb2cacdf465cdbec617a7d2efe80a59", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr22, cVar, changeQuickRedirect22, false, "0fb2cacdf465cdbec617a7d2efe80a59");
            } else if (fVar2.nonLbsEntity == null || fVar2.nonLbsEntity.nonLbsId != 1) {
                u.c(cVar.P, cVar.z);
            } else {
                if (TextUtils.isEmpty(fVar2.poiInfoItem.z)) {
                    cVar.P.setVisibility(8);
                } else {
                    cVar.P.setVisibility(0);
                    m.b(fVar2.poiInfoItem.z).a(new b.d() { // from class: com.sankuai.waimai.store.search.template.spu.c.8
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.d
                        public final void a() {
                            Object[] objArr23 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect23 = a;
                            if (PatchProxy.isSupport(objArr23, this, changeQuickRedirect23, false, "1bc7ac794e9df9882ff0b57032e824e5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr23, this, changeQuickRedirect23, false, "1bc7ac794e9df9882ff0b57032e824e5");
                            } else {
                                cVar.P.setVisibility(0);
                            }
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.d
                        public final void a(int i3, Exception exc) {
                            Object[] objArr23 = {Integer.valueOf(i3), exc};
                            ChangeQuickRedirect changeQuickRedirect23 = a;
                            if (PatchProxy.isSupport(objArr23, this, changeQuickRedirect23, false, "8bb25ae316807e311dfc0b813bf29f29", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr23, this, changeQuickRedirect23, false, "8bb25ae316807e311dfc0b813bf29f29");
                            } else {
                                cVar.P.setVisibility(8);
                            }
                        }
                    }).a(cVar.P);
                }
                if (!TextUtils.isEmpty(fVar2.productInfoItem.E)) {
                    cVar.z.setVisibility(0);
                    cVar.z.setText(fVar2.productInfoItem.E);
                } else {
                    cVar.z.setVisibility(8);
                }
            }
            Object[] objArr23 = {fVar2};
            ChangeQuickRedirect changeQuickRedirect23 = c.a;
            if (PatchProxy.isSupport(objArr23, cVar, changeQuickRedirect23, false, "723c7774d6195daaef194bb8a57d0684", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr23, cVar, changeQuickRedirect23, false, "723c7774d6195daaef194bb8a57d0684");
            } else if (fVar2.nonLbsEntity != null && fVar2.nonLbsEntity.nonLbsId == 4) {
                cVar.af = true;
                cVar.U.setVisibility(0);
                cVar.U.setText(fVar2.nonLbsEntity.nonLbsReason);
            } else {
                cVar.af = false;
                cVar.U.setVisibility(8);
            }
            BaseProductPoi.a aVar7 = fVar2.poiInfoItem;
            Object[] objArr24 = {aVar7};
            ChangeQuickRedirect changeQuickRedirect24 = c.a;
            if (PatchProxy.isSupport(objArr24, cVar, changeQuickRedirect24, false, "27f0124fb51a7ee201408d6255a93b45", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr24, cVar, changeQuickRedirect24, false, "27f0124fb51a7ee201408d6255a93b45");
            } else {
                if (!TextUtils.isEmpty(aVar7.B)) {
                    if (TextUtils.equals(aVar7.B, "PREVIEW")) {
                        Object[] objArr25 = {aVar7};
                        ChangeQuickRedirect changeQuickRedirect25 = c.a;
                        if (PatchProxy.isSupport(objArr25, cVar, changeQuickRedirect25, false, "2a6556e2a0cd871eec37f54f7a680d29", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr25, cVar, changeQuickRedirect25, false, "2a6556e2a0cd871eec37f54f7a680d29");
                        } else {
                            int i3 = aVar7.t == null ? 0 : aVar7.t.c;
                            String str6 = aVar7.t == null ? "" : aVar7.t.b;
                            if (TextUtils.isEmpty(str6)) {
                                str6 = aVar7.t == null ? "" : aVar7.t.a;
                            }
                            if (TextUtils.isEmpty(str6)) {
                                cVar.V.setVisibility(8);
                                cVar.ag = false;
                            } else {
                                cVar.ag = true;
                                cVar.V.setVisibility(0);
                                cVar.V.setText(str6);
                                if (i3 == 0) {
                                    cVar.V.setBackground(cVar.ad.a(cVar.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4)).b(0).c(0).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_2BA4FF), cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_378DFC)}).a());
                                } else if (i3 == 1) {
                                    cVar.V.setBackground(cVar.ad.a(cVar.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4)).b(0).c(0).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_FD8F00), cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_F87B00)}).a());
                                } else {
                                    cVar.V.setVisibility(8);
                                }
                            }
                        }
                    } else if (TextUtils.equals(aVar7.B, "PREFIX_CLOSING")) {
                        Object[] objArr26 = {aVar7};
                        ChangeQuickRedirect changeQuickRedirect26 = c.a;
                        if (PatchProxy.isSupport(objArr26, cVar, changeQuickRedirect26, false, "a2e8d2af89151eac4542395cf36e4c28", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr26, cVar, changeQuickRedirect26, false, "a2e8d2af89151eac4542395cf36e4c28");
                        } else if (TextUtils.isEmpty(aVar7.y)) {
                            cVar.V.setVisibility(8);
                        } else {
                            cVar.V.setVisibility(0);
                            cVar.V.setText(aVar7.y);
                            cVar.V.setBackground(cVar.ad.a(cVar.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4)).b(0).c(0).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_4B56AB), cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_3B50A2)}).a());
                        }
                    } else if (TextUtils.equals(aVar7.B, "POI_STATUS")) {
                        Object[] objArr27 = {aVar7};
                        ChangeQuickRedirect changeQuickRedirect27 = c.a;
                        if (PatchProxy.isSupport(objArr27, cVar, changeQuickRedirect27, false, "f3a1fd8a19c8e8fcffca7a8f99523935", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr27, cVar, changeQuickRedirect27, false, "f3a1fd8a19c8e8fcffca7a8f99523935");
                        } else if (TextUtils.isEmpty(aVar7.j)) {
                            cVar.V.setVisibility(8);
                            cVar.ag = false;
                        } else {
                            cVar.V.setText(aVar7.j);
                            cVar.ad.a(cVar.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4)).b(0);
                            switch (aVar7.i) {
                                case 2:
                                    cVar.ag = false;
                                    cVar.V.setVisibility(0);
                                    cVar.ad.c(cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_FF624A)).a(GradientDrawable.Orientation.LEFT_RIGHT, cVar.ae);
                                    break;
                                case 3:
                                    cVar.ag = true;
                                    cVar.V.setVisibility(0);
                                    cVar.ad.c(-16777216).a(GradientDrawable.Orientation.LEFT_RIGHT, cVar.ae);
                                    break;
                                default:
                                    cVar.ag = false;
                                    cVar.V.setVisibility(8);
                                    break;
                            }
                            cVar.V.setBackground(cVar.ad.a());
                        }
                    }
                }
                cVar.V.setVisibility(8);
                cVar.ag = false;
            }
            Object[] objArr28 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect28 = c.a;
            if (PatchProxy.isSupport(objArr28, cVar, changeQuickRedirect28, false, "b0ede4cb74180bcf913aaacaea0c9a29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr28, cVar, changeQuickRedirect28, false, "b0ede4cb74180bcf913aaacaea0c9a29");
            } else {
                if (cVar.af || cVar.ag) {
                    u.c(cVar.R, cVar.S, cVar.T);
                } else {
                    u.a(cVar.R, cVar.S, cVar.T);
                }
                if (cVar.af) {
                    cVar.W.setVisibility(8);
                } else {
                    cVar.W.setVisibility(0);
                }
            }
            Object[] objArr29 = {fVar2};
            ChangeQuickRedirect changeQuickRedirect29 = c.a;
            if (PatchProxy.isSupport(objArr29, cVar, changeQuickRedirect29, false, "eb31c4c1215451109239f71e4eebf645", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr29, cVar, changeQuickRedirect29, false, "eb31c4c1215451109239f71e4eebf645");
            } else {
                BaseProductPoi.a aVar8 = fVar2.poiInfoItem;
                DeliverTypeInfoVo deliverTypeInfoVo = aVar8.F;
                cVar.ad.a(cVar.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4)).b(0);
                switch (deliverTypeInfoVo == null ? -1 : deliverTypeInfoVo.deliverType) {
                    case 7:
                        str = aVar8.n;
                        String str7 = aVar8.g;
                        int color2 = cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_222426);
                        cVar.ad.c(0).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_E3AF5C), cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_F9E1AE)});
                        i2 = color2;
                        str2 = str7;
                        break;
                    case 8:
                        str = aVar8.F == null ? "" : aVar8.F.deliveryTimeTip;
                        str2 = aVar8.G;
                        i2 = cVar.c.getResources().getColor(R.color.wm_sc_nox_search_white);
                        cVar.ad.c(cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_00BD84)).a(GradientDrawable.Orientation.LEFT_RIGHT, cVar.ae);
                        break;
                    default:
                        str = aVar8.n;
                        String str8 = aVar8.g;
                        i2 = cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_222426);
                        cVar.ad.c(cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_FFD161)).a(GradientDrawable.Orientation.LEFT_RIGHT, cVar.ae);
                        str2 = str8;
                        break;
                }
                Map<String, Object> map = fVar2.personalMap;
                Object obj = map == null ? null : map.get("shipping_fee_tip_handle");
                Object obj2 = map != null ? map.get("delivery_time_tip_handle") : null;
                if ((obj instanceof Double) && ((Double) obj).intValue() == 1) {
                    cVar.S.setTextColor(cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_FF8000));
                    cVar.S.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    cVar.S.setTextColor(cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_999794));
                    cVar.S.setTypeface(Typeface.DEFAULT);
                }
                if ((obj2 instanceof Double) && ((Double) obj2).intValue() == 1) {
                    cVar.W.setTextColor(cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_FF8000));
                    cVar.W.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    cVar.W.setTextColor(cVar.c.getResources().getColor(R.color.wm_sc_nox_search_color_33312E));
                    cVar.W.setTypeface(Typeface.DEFAULT);
                }
                cVar.R.setText(aVar8.r);
                cVar.S.setText(aVar8.o);
                cVar.T.setText(aVar8.q);
                cVar.W.setText(str);
                cVar.X.setText(str2);
                if (deliverTypeInfoVo == null || TextUtils.isEmpty(deliverTypeInfoVo.deliverText)) {
                    cVar.O.setVisibility(8);
                } else {
                    cVar.O.setVisibility(0);
                    cVar.O.setText(deliverTypeInfoVo.deliverText);
                    cVar.O.setTextColor(i2);
                    cVar.O.setBackground(cVar.ad.a());
                }
            }
            BaseProductPoi.RecommendSpuCombo recommendSpuCombo = fVar2.productInfoItem.Q;
            String str9 = fVar2.poiInfoItem.s;
            Object[] objArr30 = {recommendSpuCombo, str9};
            ChangeQuickRedirect changeQuickRedirect30 = c.a;
            if (PatchProxy.isSupport(objArr30, cVar, changeQuickRedirect30, false, "3b4dda345884468c2bbb3348b70e69d1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr30, cVar, changeQuickRedirect30, false, "3b4dda345884468c2bbb3348b70e69d1");
            } else if (recommendSpuCombo == null || com.sankuai.shangou.stone.util.a.b(recommendSpuCombo.recommendSpus)) {
                cVar.H.setVisibility(8);
            } else {
                cVar.H.setVisibility(0);
                boolean a9 = cVar.a(recommendSpuCombo.recommendSpuTitle, recommendSpuCombo.recommendSpus);
                List<BaseProductPoi.RecommendSpu> list = recommendSpuCombo.recommendSpus;
                Object[] objArr31 = {list, Byte.valueOf(a9 ? (byte) 1 : (byte) 0), str9};
                ChangeQuickRedirect changeQuickRedirect31 = c.a;
                if (PatchProxy.isSupport(objArr31, cVar, changeQuickRedirect31, false, "ed9006d56de889a640e56d0476a23f65", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr31, cVar, changeQuickRedirect31, false, "ed9006d56de889a640e56d0476a23f65");
                } else {
                    cVar.J.a(list, a9, str9, cVar.ah);
                }
            }
            cVar.a(fVar2.recommendSummary);
            BaseProductPoi.PreSale preSale = fVar2.productInfoItem.R;
            Object[] objArr32 = {preSale};
            ChangeQuickRedirect changeQuickRedirect32 = c.a;
            if (PatchProxy.isSupport(objArr32, cVar, changeQuickRedirect32, false, "3899043a36193e9ca95eebdebfc4f674", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr32, cVar, changeQuickRedirect32, false, "3899043a36193e9ca95eebdebfc4f674");
            } else {
                u.a(cVar.Y, 8);
                if (preSale != null && preSale.mPreSaleTime != null && !t.a(preSale.mPreSaleTime.text)) {
                    u.a(cVar.Y, 0);
                    u.a(cVar.aa, preSale.mPreSaleTime.text);
                    if (!t.a(preSale.mPreSaleTime.icon)) {
                        u.a((View) cVar.Z, 0);
                        b.C0608b a10 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                        a10.b = cVar.c;
                        a10.c = preSale.mPreSaleTime.icon;
                        a10.a(cVar.Z);
                    } else {
                        u.a((View) cVar.Z, 8);
                    }
                }
            }
            Object[] objArr33 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect33 = c.a;
            if (PatchProxy.isSupport(objArr33, cVar, changeQuickRedirect33, false, "a76fe3b4e38193f1df9673ba6e29479a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr33, cVar, changeQuickRedirect33, false, "a76fe3b4e38193f1df9673ba6e29479a");
            } else {
                ViewGroup.LayoutParams layoutParams2 = cVar.G.getLayoutParams();
                if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                    if (cVar.H.getVisibility() == 8) {
                        if (cVar.p.getVisibility() == 0 && cVar.g.getVisibility() == 0 && cVar.Y.getVisibility() == 0) {
                            layoutParams3.topMargin = cVar.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_5);
                            layoutParams3.removeRule(10);
                            layoutParams3.addRule(3, cVar.F.getId());
                            layoutParams3.removeRule(8);
                        } else {
                            layoutParams3.topMargin = cVar.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_82);
                            layoutParams3.addRule(10);
                            layoutParams3.removeRule(3);
                            layoutParams3.removeRule(8);
                        }
                    } else if (cVar.p.getVisibility() == 8 && cVar.g.getVisibility() == 8 && cVar.h.getVisibility() == 8 && cVar.Y.getVisibility() == 8) {
                        layoutParams3.topMargin = 0;
                        layoutParams3.removeRule(10);
                        layoutParams3.removeRule(3);
                        layoutParams3.addRule(8, cVar.m.getId());
                    } else {
                        layoutParams3.topMargin = cVar.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_6);
                        layoutParams3.removeRule(10);
                        layoutParams3.addRule(3, cVar.F.getId());
                        layoutParams3.removeRule(8);
                    }
                    cVar.G.setLayoutParams(layoutParams3);
                }
            }
            Object[] objArr34 = {fVar2};
            ChangeQuickRedirect changeQuickRedirect34 = c.a;
            if (PatchProxy.isSupport(objArr34, cVar, changeQuickRedirect34, false, "4918323e11e70aa139e94705eef0e5b1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr34, cVar, changeQuickRedirect34, false, "4918323e11e70aa139e94705eef0e5b1");
                return;
            }
            int i4 = fVar2.poiInfoItem.i;
            int i5 = fVar2.nonLbsEntity == null ? 0 : fVar2.nonLbsEntity.nonLbsId;
            if (i4 == 3 || i5 == 3 || i5 == 4) {
                cVar.ac.setVisibility(0);
            } else {
                cVar.ac.setVisibility(8);
            }
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull f fVar, @NonNull com.sankuai.waimai.store.search.statistics.f fVar2) {
        f fVar3 = fVar;
        Object[] objArr = {fVar3, fVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc1387a312e8fbc520225fe1c7bcd581", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc1387a312e8fbc520225fe1c7bcd581");
            return;
        }
        super.a((a) fVar3, fVar2);
        if (fVar3.productInfoItem == null || fVar3.productInfoItem.Q == null) {
            return;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) fVar3.productInfoItem.Q.recommendSpus);
        for (int i = 0; i < a2; i++) {
            BaseProductPoi.RecommendSpu recommendSpu = (BaseProductPoi.RecommendSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) fVar3.productInfoItem.Q.recommendSpus, i);
            if (recommendSpu != null) {
                com.sankuai.waimai.store.search.statistics.f a3 = recommendSpu.nodeForRcmdSpu.a();
                a3.b = fVar2;
                a3.c = "b_waimai_ah5gjqtz_mv";
                a3.d = "b_waimai_ah5gjqtz_mc";
                a3.a("search_log_id", this.l.b(fVar3)).a("index", Integer.valueOf(fVar3.getStatisticsIndex())).a("spu_id", Long.valueOf(fVar3.productInfoItem.c)).a("item_spu_id", Long.valueOf(recommendSpu.spuId)).a(DataConstants.INDEX, Integer.valueOf(i)).a("spu_recommend_type", Integer.valueOf(fVar3.productInfoItem.Q.recommendSpuTitle == null ? -999 : fVar3.productInfoItem.Q.recommendSpuTitle.type));
            }
        }
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de5d08cc846bffa08538335323df297e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de5d08cc846bffa08538335323df297e");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16bfbf4b700ee4dbdbf00ef754e12560", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16bfbf4b700ee4dbdbf00ef754e12560")).booleanValue() : str.equals("wm_search_feed_product_750") || str.equals("wm_search_feed_product_template");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.spu.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1318a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        c b;

        public C1318a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94126052768c19ec6b19ff9e0026e2b3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94126052768c19ec6b19ff9e0026e2b3");
            } else {
                this.b = new c(view);
            }
        }
    }
}
