package com.sankuai.waimai.business.page.common.list.popuplayer;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.net.request.DislikeApi;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    long b;
    String c;
    int d;
    View e;
    TextView f;
    ImageView g;
    d h;
    boolean i;
    View j;
    int k;
    String l;
    Config m;
    private b n;
    private c o;
    private AnimationSet p;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "872ebcb61e7083c993b936bdd2beafff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "872ebcb61e7083c993b936bdd2beafff");
            return;
        }
        this.b = -1L;
        this.o = new c() { // from class: com.sankuai.waimai.business.page.common.list.popuplayer.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.common.list.popuplayer.c
            public final void a(long j, String str, boolean z) {
                Object[] objArr2 = {new Long(j), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9c1e05181e6141309879fd714fae0b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9c1e05181e6141309879fd714fae0b4");
                } else if ((e.this.b == j || (!TextUtils.isEmpty(str) && TextUtils.equals(e.this.c, str))) && z) {
                    e.this.i = true;
                    if (e.this.f != null) {
                        e.this.f.setText("撤销置底");
                    }
                    if (e.this.g == null || e.this.j == null) {
                        return;
                    }
                    e.this.g.setImageDrawable(ContextCompat.getDrawable(e.this.j.getContext(), R.drawable.wm_page_dislike_cancel));
                }
            }
        };
    }

    public static /* synthetic */ void a(e eVar, String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "f45e96e7eeeba7e27780530dbf984d28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "f45e96e7eeeba7e27780530dbf984d28");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("function_id", str);
        hashMap.put(RaptorUploaderImpl.IS_CACHE, Integer.valueOf(z ? 1 : 0));
        int i = eVar.k;
        int i2 = eVar.k;
        Object[] objArr2 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        String str2 = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dc52d56cffdb83b8d07e9a49698a1aca", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dc52d56cffdb83b8d07e9a49698a1aca");
        } else if (i2 == 0) {
            str2 = "b_waimai_jha1npx9_mc";
        } else if (i2 == 1) {
            str2 = "b_waimai_pcn32m1i_mc";
        }
        f.a(i, str2, eVar.l, hashMap);
    }

    void a(View view, Config config) {
        Object[] objArr = {view, config};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d6fa354bb25975767e98843d1fdba6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d6fa354bb25975767e98843d1fdba6d");
        } else {
            new a().a(view, this.h, config);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "174ea8ed757cf5379a90e640f207d9dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "174ea8ed757cf5379a90e640f207d9dc");
        } else if (this.j != null) {
            this.j.setVisibility(8);
        }
    }

    public static void a(String str, int i, String str2, int i2, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), str2, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4759a2c1ceaca50a9141193f5fc1cb72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4759a2c1ceaca50a9141193f5fc1cb72");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("reason_type", str);
        hashMap.put("card_type_id", Integer.valueOf(i2));
        hashMap.put(RaptorUploaderImpl.IS_CACHE, Integer.valueOf(z ? 1 : 0));
        f.a(i, f.a(i), str2, hashMap);
    }

    public final View a(Config config) {
        GradientDrawable gradientDrawable;
        Object[] objArr = {config};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6ae6a63d1216af802495f38084c510a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6ae6a63d1216af802495f38084c510a");
        }
        String str = null;
        if (config == null || config.b == null) {
            return null;
        }
        this.m = config;
        this.n = config.g;
        this.d = config.e;
        this.b = config.f;
        this.c = config.l;
        this.k = config.h;
        this.l = config.k;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab225d3c397046e60657d09b5c932c09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab225d3c397046e60657d09b5c932c09");
        } else {
            this.p = new AnimationSet(false);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.0f, 0.9f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(280L);
            scaleAnimation.setFillAfter(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(280L);
            alphaAnimation.setFillAfter(true);
            this.p.addAnimation(scaleAnimation);
            this.p.addAnimation(alphaAnimation);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "859bcee3b6b531baa6ebaffe78ed6315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "859bcee3b6b531baa6ebaffe78ed6315");
        } else {
            this.h = new d();
            this.h.c = this.o;
        }
        Object[] objArr4 = {config};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6b4bea5f68018d69423c27898d8412e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6b4bea5f68018d69423c27898d8412e4");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("rank_list_id", config.i);
            hashMap.put("rank_trace_id", config.j);
            hashMap.put("card_type_id", Integer.valueOf(config.e));
            hashMap.put(RaptorUploaderImpl.IS_CACHE, Integer.valueOf(config.m ? 1 : 0));
            int i = this.k;
            int i2 = this.k;
            Object[] objArr5 = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect5 = f.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "70dbba482d0b368799c2a7aea22ff933", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "70dbba482d0b368799c2a7aea22ff933");
            } else if (i2 == 0) {
                str = "b_waimai_a4l65t2v_mc";
            } else if (i2 == 1) {
                str = "b_waimai_dlv6pz07_mc";
            }
            f.a(i, str, this.l, hashMap);
        }
        Object[] objArr6 = {config};
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7ccf7cba0be5b4676a35e7cc74497e50", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7ccf7cba0be5b4676a35e7cc74497e50");
        }
        com.sankuai.waimai.business.page.home.list.future.mach.d.a().b();
        this.j = LayoutInflater.from(config.b.getContext()).inflate(R.layout.wm_page_list_poi_list_item_popup_layer, config.b, false);
        int i3 = config.c;
        Object[] objArr7 = {Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "9d342e628a0b45500e9742a2ee2901c8", RobustBitConfig.DEFAULT_VALUE)) {
            gradientDrawable = (GradientDrawable) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "9d342e628a0b45500e9742a2ee2901c8");
        } else {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(ColorUtils.a("#cc222426", -870177754));
            gradientDrawable.setCornerRadius(i3);
            gradientDrawable.setShape(0);
        }
        this.j.setBackground(gradientDrawable);
        config.b.addView(this.j, config.d);
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.common.list.popuplayer.e.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr8 = {view};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "bcda2aea0aa9a3895e3bb74c75efb4fc", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "bcda2aea0aa9a3895e3bb74c75efb4fc");
                } else {
                    e.this.a();
                }
            }
        });
        com.sankuai.waimai.business.page.home.list.future.mach.d a2 = com.sankuai.waimai.business.page.home.list.future.mach.d.a();
        View view = this.j;
        Object[] objArr8 = {view};
        ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.business.page.home.list.future.mach.d.a;
        if (PatchProxy.isSupport(objArr8, a2, changeQuickRedirect8, false, "51ae1fbb35ccdebb2fe1e365a00d891a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, a2, changeQuickRedirect8, false, "51ae1fbb35ccdebb2fe1e365a00d891a");
        } else {
            a2.b.add(view);
        }
        if (config.e == 5 || config.e == 6) {
            a(this.j, this.m);
        } else {
            final View view2 = this.j;
            Object[] objArr9 = {view2};
            ChangeQuickRedirect changeQuickRedirect9 = a;
            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "4fb6c7b1da9a42f35c120d4498a00e07", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "4fb6c7b1da9a42f35c120d4498a00e07");
            } else {
                this.e = view2.findViewById(R.id.ll_float_tag);
                this.f = (TextView) view2.findViewById(R.id.txt_dislike);
                this.g = (ImageView) view2.findViewById(R.id.iv_dislike);
                this.e.setVisibility(0);
                final View findViewById = view2.findViewById(R.id.ll_similar);
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.common.list.popuplayer.e.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        Object[] objArr10 = {view3};
                        ChangeQuickRedirect changeQuickRedirect10 = a;
                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "fc95afee0df8fe7aba39099c924cfe2e", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "fc95afee0df8fe7aba39099c924cfe2e");
                            return;
                        }
                        e eVar = e.this;
                        View view4 = view2;
                        Object[] objArr11 = {view4};
                        ChangeQuickRedirect changeQuickRedirect11 = e.a;
                        if (PatchProxy.isSupport(objArr11, eVar, changeQuickRedirect11, false, "d67dfb61384825145b842ff6c493a05d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr11, eVar, changeQuickRedirect11, false, "d67dfb61384825145b842ff6c493a05d");
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("poi_id", eVar.b);
                            bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, eVar.c);
                            com.sankuai.waimai.foundation.router.a.a(view4.getContext(), com.sankuai.waimai.foundation.router.interfaces.c.C, bundle);
                        }
                        e.a(e.this, "1", e.this.m.m);
                    }
                });
                findViewById.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.common.list.popuplayer.e.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr10 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect10 = a;
                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "171fea4bf2cb303bf2629e9c5b8d032d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "171fea4bf2cb303bf2629e9c5b8d032d");
                        } else {
                            findViewById.sendAccessibilityEvent(128);
                        }
                    }
                }, 1L);
                view2.findViewById(R.id.ll_dislike).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.common.list.popuplayer.e.5
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        Object[] objArr10 = {view3};
                        ChangeQuickRedirect changeQuickRedirect10 = a;
                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "6c2164361acf866a6ccd45609dbc7fbf", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "6c2164361acf866a6ccd45609dbc7fbf");
                        } else if (!e.this.i || e.this.h == null) {
                            e.this.a(view2, e.this.m);
                            e.this.e.setVisibility(8);
                            e.a(e.this, "3", e.this.m.m);
                        } else {
                            final d dVar = e.this.h;
                            final long j = e.this.b;
                            final String str2 = e.this.c;
                            final Context context = view3.getContext();
                            Object[] objArr11 = {new Long(j), str2, context};
                            ChangeQuickRedirect changeQuickRedirect11 = d.a;
                            if (PatchProxy.isSupport(objArr11, dVar, changeQuickRedirect11, false, "e9f84861937ec8a548390af223b31a78", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr11, dVar, changeQuickRedirect11, false, "e9f84861937ec8a548390af223b31a78");
                            } else if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((DislikeApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) DislikeApi.class)).cancelDislike(j, str2), new b.AbstractC1042b<BaseResponse<Object>>() { // from class: com.sankuai.waimai.business.page.common.list.popuplayer.d.2
                                    public static ChangeQuickRedirect a;

                                    @Override // rx.e
                                    public final /* synthetic */ void onNext(Object obj) {
                                        BaseResponse baseResponse = (BaseResponse) obj;
                                        Object[] objArr12 = {baseResponse};
                                        ChangeQuickRedirect changeQuickRedirect12 = a;
                                        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "03cf7814c94f787f2ea9efd9b5838b4d", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "03cf7814c94f787f2ea9efd9b5838b4d");
                                        } else if (baseResponse.code != 0 || d.this.c == null) {
                                        } else {
                                            ae.a(context, (int) R.string.wm_page_revocation_successful);
                                        }
                                    }

                                    @Override // rx.e
                                    public final void onError(Throwable th) {
                                        Object[] objArr12 = {th};
                                        ChangeQuickRedirect changeQuickRedirect12 = a;
                                        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "f56beb70cf212012a50e0076f1c4cdb2", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "f56beb70cf212012a50e0076f1c4cdb2");
                                        } else {
                                            ae.a(context, (int) R.string.wm_page_network_not_good_retry);
                                        }
                                    }
                                }, dVar.b);
                            }
                            e.this.a();
                            e.a("0", e.this.k, e.this.l, e.this.d, e.this.m.m);
                        }
                    }
                });
            }
            final long j = config.f;
            final String str2 = config.l;
            Object[] objArr10 = {new Long(j), str2};
            ChangeQuickRedirect changeQuickRedirect10 = a;
            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "ccb9c4c03cc165ff74f5d01ee6a161ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "ccb9c4c03cc165ff74f5d01ee6a161ab");
            } else if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                final d dVar = this.h;
                Object[] objArr11 = {new Long(j), str2};
                ChangeQuickRedirect changeQuickRedirect11 = d.a;
                if (PatchProxy.isSupport(objArr11, dVar, changeQuickRedirect11, false, "fe3f6545d10013922d0360ff3ef1f9c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, dVar, changeQuickRedirect11, false, "fe3f6545d10013922d0360ff3ef1f9c6");
                } else {
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((DislikeApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) DislikeApi.class)).checkDislike(j, str2), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.page.common.list.model.a>>() { // from class: com.sankuai.waimai.business.page.common.list.popuplayer.d.1
                        public static ChangeQuickRedirect a;

                        @Override // rx.e
                        public final /* synthetic */ void onNext(Object obj) {
                            BaseResponse baseResponse = (BaseResponse) obj;
                            Object[] objArr12 = {baseResponse};
                            ChangeQuickRedirect changeQuickRedirect12 = a;
                            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "7c814286c68c158ff854f56e335e3130", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "7c814286c68c158ff854f56e335e3130");
                            } else if (d.this.c != null) {
                                if (baseResponse == null || baseResponse.data == 0) {
                                    d.this.c.a(j, str2, false);
                                } else if (((com.sankuai.waimai.business.page.common.list.model.a) baseResponse.data).a == 0) {
                                    d.this.c.a(j, str2, false);
                                } else if (((com.sankuai.waimai.business.page.common.list.model.a) baseResponse.data).a == 1) {
                                    d.this.c.a(j, str2, true);
                                }
                            }
                        }

                        @Override // rx.e
                        public final void onError(Throwable th) {
                            Object[] objArr12 = {th};
                            ChangeQuickRedirect changeQuickRedirect12 = a;
                            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "c5a926a588b439fdf743e7583e4e940c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "c5a926a588b439fdf743e7583e4e940c");
                            } else if (d.this.c != null) {
                                d.this.c.a(j, str2, false);
                            }
                        }
                    }, dVar.b);
                }
            }
        }
        this.j.startAnimation(this.p);
        return this.j;
    }
}
