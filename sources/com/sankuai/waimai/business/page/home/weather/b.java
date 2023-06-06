package com.sankuai.waimai.business.page.home.weather;

import android.annotation.SuppressLint;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.actionbar.market.HeaderFloatViewModel;
import com.sankuai.waimai.business.page.home.head.promotion.PromotionBgViewModel;
import com.sankuai.waimai.business.page.home.head.promotionbg.d;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.business.page.common.arch.a {
    public static ChangeQuickRedirect v;
    public BroadcastReceiver A;
    private final TextView B;
    private final TextView C;
    private final View D;
    private int E;
    @SuppressLint({"IconDuplicates"})
    private int[] F;
    private int[] G;
    private com.sankuai.waimai.business.page.homepage.response.b H;
    public final ImageView w;
    public final View x;
    public final PageFragment y;
    public int z;

    public static /* synthetic */ void a(b bVar, boolean z, com.sankuai.waimai.business.page.homepage.response.b bVar2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar2};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "4117f87a3bbf971f40255a23cae12589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "4117f87a3bbf971f40255a23cae12589");
        } else if (!z) {
            com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "Weather, data == null , set gone , notify market ", new Object[0]);
            bVar.D.setVisibility(8);
            ((HeaderFloatViewModel) q.a(bVar.y).a(HeaderFloatViewModel.class)).b(false);
        } else if (bVar2 != null) {
            Object[] objArr2 = {bVar2};
            ChangeQuickRedirect changeQuickRedirect2 = v;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "f6f0d28e70a5416ce3952c8c6a9d482c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "f6f0d28e70a5416ce3952c8c6a9d482c");
            } else if (bVar2 != null) {
                bVar.H = bVar2;
                if (!bVar.Q()) {
                    JudasManualManager.b("b_dtxfpl83").a("c_m84bv26").a(bVar.y).a("title_left", bVar2.c).a();
                    bVar.D.setVisibility(0);
                    bVar.C.setText(String.format("%s°", bVar2.d));
                    bVar.B.setText(bVar2.c);
                    if (bVar2.f != null) {
                        if (TextUtils.isEmpty(Uri.parse(bVar2.f).getScheme())) {
                            bVar.E = bVar2.b;
                            int b = bVar.b(bVar2.b);
                            if (b != 0) {
                                bVar.a(bVar.w, bVar.y.getActivity().getResources().getDrawable(b));
                            }
                        } else {
                            b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                            a.b = bVar.y.getActivity();
                            a.e = 1;
                            a.c = bVar2.f;
                            a.a(bVar.w);
                        }
                    }
                }
            }
            bVar.a(((PromotionBgViewModel) q.a(bVar.y).a(PromotionBgViewModel.class)).e.a() == Boolean.TRUE);
        } else {
            bVar.D.setVisibility(8);
        }
    }

    public b(PageFragment pageFragment, View view, final c cVar) {
        Object[] objArr = {pageFragment, view, cVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fbb93e00d0a36daf340df729dcc8a5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fbb93e00d0a36daf340df729dcc8a5b");
            return;
        }
        this.z = 0;
        this.F = new int[]{R.drawable.wm_page_weather_tips_icon_rain_white, R.drawable.wm_page_weather_tips_icon_thunder_white, R.drawable.wm_page_weather_tips_icon_hail_white, R.drawable.wm_page_weather_tips_icon_snow_white, R.drawable.wm_page_weather_tips_icon_fog_white, R.drawable.wm_page_weather_tips_icon_dust_white, R.drawable.wm_page_weather_tips_icon_hot_white, R.drawable.wm_page_weather_tips_icon_cold_white, R.drawable.wm_page_weather_tips_icon_wind_white, R.drawable.wm_page_weather_tips_icon_hot_white, R.drawable.wm_page_weather_tips_icon_cloudy_white};
        this.G = new int[]{R.drawable.wm_page_weather_tips_icon_rain_black, R.drawable.wm_page_weather_tips_icon_thunder_black, R.drawable.wm_page_weather_tips_icon_hail_black, R.drawable.wm_page_weather_tips_icon_snow_black, R.drawable.wm_page_weather_tips_icon_fog_black, R.drawable.wm_page_weather_tips_icon_dust_black, R.drawable.wm_page_weather_tips_icon_hot_black, R.drawable.wm_page_weather_tips_icon_cold_black, R.drawable.wm_page_weather_tips_icon_wind_black, R.drawable.wm_page_weather_tips_icon_hot_black, R.drawable.wm_page_weather_tips_icon_cloudy_black};
        this.A = new BroadcastReceiver() { // from class: com.sankuai.waimai.business.page.home.weather.WeatherStatusBlock$2
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3b9cb22aeeb3758d5eee44595cf5e91", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3b9cb22aeeb3758d5eee44595cf5e91");
                } else if (TextUtils.equals(intent.getAction(), "com.sankuai.waimai.business.page.action.showWeather")) {
                    com.sankuai.waimai.business.page.homepage.response.b bVar = com.sankuai.waimai.business.page.homepage.controller.c.a().b;
                    com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "Weather, receive data :  " + bVar, new Object[0]);
                    b.a(b.this, bVar != null, bVar);
                }
            }
        };
        this.y = pageFragment;
        this.x = view;
        this.w = (ImageView) view.findViewById(R.id.weather_icon);
        this.B = (TextView) view.findViewById(R.id.weather_title);
        this.C = (TextView) view.findViewById(R.id.weather_temp);
        this.D = this.x.findViewById(R.id.weather_layout_main);
        this.D.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.weather.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35ee48ff47d0fc3a18a632bb7bdfcdb3", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35ee48ff47d0fc3a18a632bb7bdfcdb3");
                } else if (b.this.H == null || TextUtils.isEmpty(b.this.H.g)) {
                } else {
                    cVar.a(b.this.H.g);
                    JudasManualManager.a("b_ekcy6m0n").a(b.this.y).a("c_m84bv26").a("title_left", b.this.H.c).a();
                }
            }
        });
        a(pageFragment);
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f6c2c11ceeda8911bb6dd8b8df1a04a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f6c2c11ceeda8911bb6dd8b8df1a04a");
            return;
        }
        P();
        ((HeaderFloatViewModel) q.a(this.y).a(HeaderFloatViewModel.class)).d.a(pageFragment, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.weather.b.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b20e46b0d2b5a4b9f8e835273b34dc3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b20e46b0d2b5a4b9f8e835273b34dc3");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "weather  receive notify: " + bool2, new Object[0]);
                if (bool2 == null || b.this.D == null) {
                    return;
                }
                if (bool2.booleanValue() && b.this.D.getVisibility() == 0) {
                    com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "float show , hide weather", new Object[0]);
                    b.this.D.setVisibility(8);
                }
                com.sankuai.waimai.business.page.homepage.response.b bVar = com.sankuai.waimai.business.page.homepage.controller.c.a().b;
                if (bool2.booleanValue() || b.this.D.getVisibility() != 8 || bVar == null) {
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "float hide , show weather", new Object[0]);
                b.a(b.this, bVar != null, bVar);
            }
        });
    }

    private void P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a63199da77d52e74b041a5db452eba23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a63199da77d52e74b041a5db452eba23");
            return;
        }
        LocalBroadcastManager.getInstance(this.y.getActivity()).registerReceiver(this.A, new IntentFilter("com.sankuai.waimai.business.page.action.showWeather"));
    }

    private boolean Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d54f3de1e6a3c27c55414258873a97a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d54f3de1e6a3c27c55414258873a97a5")).booleanValue();
        }
        if (this.H == null) {
            this.D.setVisibility(8);
            return true;
        }
        if (((HeaderFloatViewModel) q.a(this.y).a(HeaderFloatViewModel.class)).f) {
            if (com.sankuai.waimai.business.page.home.actionbar.market.b.a()) {
                com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "Weather , market showing ,  AB test  marketFirst  ,  hide  weather", new Object[0]);
                this.D.setVisibility(8);
                return true;
            }
            com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "Weather , market showing ,  AB test  weatherFist  , show weather", new Object[0]);
        }
        return false;
    }

    private void a(ImageView imageView, Drawable drawable) {
        Object[] objArr = {imageView, drawable};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "956ec901d2270006a6d28ec052077880", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "956ec901d2270006a6d28ec052077880");
        } else if (imageView == null || drawable == null) {
        } else {
            imageView.setImageDrawable(drawable);
            if (drawable instanceof AnimationDrawable) {
                ((AnimationDrawable) drawable).start();
            }
        }
    }

    public final void a(boolean z) {
        int b;
        int i;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69a952cdbaaff76c82bb4b4cf9d0871f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69a952cdbaaff76c82bb4b4cf9d0871f");
        } else if (Q()) {
        } else {
            if (this.D.getVisibility() != 0) {
                this.D.setVisibility(0);
            }
            int a = d.a(com.meituan.android.singleton.b.a).a();
            int i2 = -1;
            if (z) {
                if (a == 2) {
                    b = c(this.E);
                    i = -1;
                } else {
                    b = b(this.E);
                    i2 = Color.parseColor("#33312D");
                    i = i2;
                }
            } else if (this.z == 2) {
                b = c(this.E);
                i = -1;
            } else {
                b = b(this.E);
                i2 = Color.parseColor("#33312D");
                i = i2;
            }
            if (b > 0) {
                a(this.w, this.y.getActivity().getResources().getDrawable(b));
                com.sankuai.waimai.foundation.utils.log.a.b("HomeMarket", "Weather, data valid ,set  visible   notify market", new Object[0]);
                ((HeaderFloatViewModel) q.a(this.y).a(HeaderFloatViewModel.class)).b(true);
            } else {
                this.D.setVisibility(8);
            }
            this.C.setTextColor(i2);
            this.B.setTextColor(i);
        }
    }

    private int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4649ad03c9287a10038a842301c463de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4649ad03c9287a10038a842301c463de")).intValue();
        }
        if (i <= 0 || i > this.G.length) {
            return 0;
        }
        return this.G[i - 1];
    }

    private int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3c9f6575a9d5ea5e87c8bfcdb4ee44f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3c9f6575a9d5ea5e87c8bfcdb4ee44f")).intValue();
        }
        if (i <= 0 || i > this.F.length) {
            return 0;
        }
        return this.F[i - 1];
    }
}
