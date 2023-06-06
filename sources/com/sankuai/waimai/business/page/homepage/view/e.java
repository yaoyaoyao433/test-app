package com.sankuai.waimai.business.page.homepage.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.page.homepage.view.b;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends b<com.sankuai.waimai.business.page.homepage.response.b> {
    public static ChangeQuickRedirect m;
    public boolean n;
    private String o;

    public e(Context context, View view) {
        super(context, view);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bdfd51a49dfc3b190275288823ae6c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bdfd51a49dfc3b190275288823ae6c3");
            return;
        }
        this.n = false;
        this.b.setVisibility(8);
        this.c.setVisibility(0);
        this.c.setBackgroundColor(0);
        this.c.setPadding(0, 0, 0, 0);
        this.f.setImageResource(R.drawable.wm_page_weather_status_close);
        this.d.setTextColor(-1);
        this.e.setTextColor(-1);
    }

    @Override // com.sankuai.waimai.business.page.homepage.view.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5463602f4e424e75a1b08750561596f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5463602f4e424e75a1b08750561596f1");
            return;
        }
        if (this.o != null) {
            if (TextUtils.equals(this.o, "b_waimai_k78emg9k_mc") || TextUtils.equals(this.o, "b_ekcy6m0n")) {
                JudasManualManager.a(this.o, "c_m84bv26", AppUtil.generatePageInfoKey(this.i)).a("title_left", ((com.sankuai.waimai.business.page.homepage.response.b) this.j).c).a();
            } else {
                JudasManualManager.a(this.o).a("scene_type", ((com.sankuai.waimai.business.page.homepage.response.b) this.j).b).a();
            }
        }
        if (this.j == 0 || TextUtils.isEmpty(((com.sankuai.waimai.business.page.homepage.response.b) this.j).g)) {
            return;
        }
        com.sankuai.waimai.foundation.router.a.a(this.i, ((com.sankuai.waimai.business.page.homepage.response.b) this.j).g);
    }

    @Override // com.sankuai.waimai.business.page.homepage.view.b
    public final void a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1485c1dbe0e2bfd2983bd76154f1adf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1485c1dbe0e2bfd2983bd76154f1adf7");
            return;
        }
        super.a(aVar);
        com.sankuai.waimai.business.page.homepage.controller.c.a().c = aVar;
    }

    public final void a(com.sankuai.waimai.business.page.homepage.response.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "554e5da48d6ef73adf98eded6b8d5f8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "554e5da48d6ef73adf98eded6b8d5f8c");
        } else if (bVar == 0) {
        } else {
            this.j = bVar;
            this.d.setText(this.d.getContext().getString(R.string.wm_main_temperature, bVar.c, bVar.d));
            this.e.setText(bVar.e);
            ViewGroup viewGroup = this.g;
            Object[] objArr2 = {viewGroup, bVar};
            ChangeQuickRedirect changeQuickRedirect2 = m;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58e8f8e8b5aec91c41cbe540416aebdb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58e8f8e8b5aec91c41cbe540416aebdb");
            } else {
                int i = bVar.h;
                if (i == 1) {
                    switch (bVar.i) {
                        case 5:
                            viewGroup.setBackgroundResource(R.drawable.wm_page_weather_tips_bg_rain_thunder);
                            break;
                        case 6:
                        case 8:
                        case 9:
                        case 19:
                        case 22:
                        case 108:
                            viewGroup.setBackgroundResource(R.drawable.wm_page_weather_tips_bg_rain_heavy);
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 23:
                            viewGroup.setBackgroundResource(R.drawable.wm_page_weather_tips_bg_rain_storm);
                            break;
                        case 15:
                        case 16:
                            viewGroup.setBackgroundResource(R.drawable.wm_page_weather_tips_bg_snow_heavy);
                            break;
                        case 17:
                            viewGroup.setBackgroundResource(R.drawable.wm_page_weather_tips_bg_snow_storm);
                            break;
                        case 20:
                        case 31:
                        case 126:
                            viewGroup.setBackgroundResource(R.drawable.wm_page_weather_tips_bg_frog_sand);
                            break;
                        case 140:
                            viewGroup.setBackgroundResource(R.drawable.wm_page_weather_tips_bg_hail_low_temperature);
                            break;
                        default:
                            viewGroup.setBackgroundResource(R.drawable.wm_page_weather_tips_bg_snow_heavy);
                            break;
                    }
                } else if (i == 2) {
                    viewGroup.setBackgroundResource(R.drawable.wm_page_weather_tips_bg_wind);
                } else if (i == 3) {
                    if (bVar.k == 1) {
                        viewGroup.setBackgroundResource(R.drawable.wm_page_weather_tips_bg_high_temperature);
                    } else {
                        viewGroup.setBackgroundResource(R.drawable.wm_page_weather_tips_bg_hail_low_temperature);
                    }
                }
            }
            b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a.c = bVar.l;
            a.h = new b.c() { // from class: com.sankuai.waimai.business.page.homepage.view.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b461c31064dddd4efbc082551ed8c1c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b461c31064dddd4efbc082551ed8c1c0");
                        return;
                    }
                    e.this.c.setVisibility(0);
                    e.this.g.setPadding(0, g.a(e.this.i, 2.5f), 0, 0);
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c8e907d3d24bea341f4c0bee08885743", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c8e907d3d24bea341f4c0bee08885743");
                        return;
                    }
                    e.this.c.setVisibility(8);
                    e.this.g.setPadding(g.b(e.this.i, 12.0f), g.b(e.this.i, 2.5f), 0, 0);
                }
            };
            a.a(this.c);
        }
    }

    public static boolean b(com.sankuai.waimai.business.page.homepage.response.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = m;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fad75ff1fc61a42bd70ae7f0cac41a96", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fad75ff1fc61a42bd70ae7f0cac41a96")).booleanValue() : bVar != null && bVar.a();
    }

    public final void a(boolean z, String str, String str2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ea1f63990ab5815b7e156b5f0ef811d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ea1f63990ab5815b7e156b5f0ef811d");
            return;
        }
        if (z) {
            b();
        } else {
            c();
        }
        this.o = str2;
        if (this.n) {
            this.n = false;
            if (TextUtils.equals(str, "b_waimai_k78emg9k_mv") || TextUtils.equals(str, "b_dtxfpl83")) {
                JudasManualManager.b(str, "c_m84bv26", AppUtil.generatePageInfoKey(this.i)).a("title_left", ((com.sankuai.waimai.business.page.homepage.response.b) this.j).c).a();
            } else {
                JudasManualManager.b(str).a("c_m84bv26").a("scene_type", ((com.sankuai.waimai.business.page.homepage.response.b) this.j).b).a();
            }
        }
    }
}
