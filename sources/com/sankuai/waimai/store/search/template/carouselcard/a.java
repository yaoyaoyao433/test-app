package com.sankuai.waimai.store.search.template.carouselcard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.adapterdelegates.b;
import com.sankuai.waimai.store.search.model.PicElement;
import com.sankuai.waimai.store.search.model.SearchResultBanner;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.view.banner.BannerPagerAdapter;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b<SearchResultBanner, C1300a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1300a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90e24c9cb0f068617bfff60746725fb3", RobustBitConfig.DEFAULT_VALUE) ? (C1300a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90e24c9cb0f068617bfff60746725fb3") : new C1300a(layoutInflater.inflate(R.layout.wm_sc_nox_search_list_item_carousel_card_banner, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull SearchResultBanner searchResultBanner, @NonNull C1300a c1300a, int i) {
        final SearchResultBanner searchResultBanner2 = searchResultBanner;
        final C1300a c1300a2 = c1300a;
        Object[] objArr = {searchResultBanner2, c1300a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26a2c4437381e17b3f0dec6803397d3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26a2c4437381e17b3f0dec6803397d3f");
            return;
        }
        Object[] objArr2 = {searchResultBanner2};
        ChangeQuickRedirect changeQuickRedirect2 = C1300a.a;
        if (PatchProxy.isSupport(objArr2, c1300a2, changeQuickRedirect2, false, "a54f8404111570d26f86e24758671258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c1300a2, changeQuickRedirect2, false, "a54f8404111570d26f86e24758671258");
        } else if (searchResultBanner2 != null) {
            if (com.sankuai.shangou.stone.util.a.a((List) searchResultBanner2.picElementList) > 5) {
                searchResultBanner2.picElementList = searchResultBanner2.picElementList.subList(0, 5);
            }
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) searchResultBanner2.picElementList)) {
                final SearchAutoScrollPagerView searchAutoScrollPagerView = c1300a2.m;
                List<PicElement> list = searchResultBanner2.picElementList;
                CarouselCardBannerAdapter carouselCardBannerAdapter = new CarouselCardBannerAdapter(c1300a2.b, searchResultBanner2.picElementList, new BannerPagerAdapter.a() { // from class: com.sankuai.waimai.store.search.template.carouselcard.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.view.banner.BannerPagerAdapter.a
                    public final int a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3777891b6271a70bec786eae4a1ad35b", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3777891b6271a70bec786eae4a1ad35b")).intValue();
                        }
                        C1300a c1300a3 = C1300a.this;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = C1300a.a;
                        return PatchProxy.isSupport(objArr4, c1300a3, changeQuickRedirect4, false, "4b9c3ecefd375d869afe63bf985e06d9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, c1300a3, changeQuickRedirect4, false, "4b9c3ecefd375d869afe63bf985e06d9")).intValue() : h.a(c1300a3.b, 4.0f);
                    }

                    @Override // com.sankuai.waimai.store.view.banner.BannerPagerAdapter.a
                    @NonNull
                    public final ImageView.ScaleType b() {
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                }, c1300a2.n);
                Object[] objArr3 = {list, null, carouselCardBannerAdapter};
                ChangeQuickRedirect changeQuickRedirect3 = SearchAutoScrollPagerView.a;
                if (PatchProxy.isSupport(objArr3, searchAutoScrollPagerView, changeQuickRedirect3, false, "69b38b654b81caad8eecad601d9fcb39", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, searchAutoScrollPagerView, changeQuickRedirect3, false, "69b38b654b81caad8eecad601d9fcb39");
                } else if (searchAutoScrollPagerView.c()) {
                    searchAutoScrollPagerView.d.a(list, list.size(), searchAutoScrollPagerView.b.getCurrentItem());
                    searchAutoScrollPagerView.f.clear();
                    searchAutoScrollPagerView.g = null;
                    searchAutoScrollPagerView.c = carouselCardBannerAdapter;
                    searchAutoScrollPagerView.e = list.size();
                    searchAutoScrollPagerView.b.setAdapter(searchAutoScrollPagerView.c);
                    int i2 = searchAutoScrollPagerView.e * 100;
                    searchAutoScrollPagerView.b.setCurrentItem(i2);
                    searchAutoScrollPagerView.d.setCheckedPosition(i2);
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = SearchAutoScrollPagerView.a;
                    if (PatchProxy.isSupport(objArr4, searchAutoScrollPagerView, changeQuickRedirect4, false, "94ec0f7d460518df5babb1b545568db5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, searchAutoScrollPagerView, changeQuickRedirect4, false, "94ec0f7d460518df5babb1b545568db5");
                    } else {
                        searchAutoScrollPagerView.b.addOnPageChangeListener(searchAutoScrollPagerView.d);
                        searchAutoScrollPagerView.b.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.store.search.template.carouselcard.SearchAutoScrollPagerView.2
                            public static ChangeQuickRedirect a;

                            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                            public void onPageScrollStateChanged(int i3) {
                            }

                            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                            public void onPageScrolled(int i3, float f, int i4) {
                            }

                            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                            public void onPageSelected(int i3) {
                                Object[] objArr5 = {Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d0ab7d26e8ae4f74f2abbd76a4a7ff50", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d0ab7d26e8ae4f74f2abbd76a4a7ff50");
                                    return;
                                }
                                try {
                                    if (searchAutoScrollPagerView.c != null) {
                                        int a2 = i3 % searchAutoScrollPagerView.c.a();
                                        if (searchAutoScrollPagerView.f.get(a2) == null && u.a(searchAutoScrollPagerView)) {
                                            if (searchAutoScrollPagerView.g != null) {
                                                b unused = searchAutoScrollPagerView.g;
                                            }
                                            searchAutoScrollPagerView.f.put(a2, Integer.valueOf(a2));
                                        }
                                    }
                                } catch (Exception e) {
                                    com.sankuai.shangou.stone.util.log.a.a(e);
                                }
                            }
                        });
                        searchAutoScrollPagerView.b.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.search.template.carouselcard.SearchAutoScrollPagerView.3
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                Object[] objArr5 = {view, motionEvent};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "108b380d52078603ab95c9db3ef68c8e", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "108b380d52078603ab95c9db3ef68c8e")).booleanValue();
                                }
                                if (motionEvent.getAction() == 2) {
                                    searchAutoScrollPagerView.b();
                                } else if (motionEvent.getAction() == 1) {
                                    searchAutoScrollPagerView.a();
                                }
                                return false;
                            }
                        });
                    }
                }
            } else {
                ViewGroup.LayoutParams layoutParams = c1300a2.c.getLayoutParams();
                layoutParams.height = 0;
                c1300a2.c.setLayoutParams(layoutParams);
            }
            c1300a2.n.put("cat_id", Integer.valueOf(c1300a2.o.z));
            c1300a2.n.put("search_log_id", c1300a2.o.b(searchResultBanner2));
            c1300a2.n.put("stid", g.f(c1300a2.o));
            c1300a2.n.put("template_type", Integer.valueOf(c1300a2.o.D));
            c1300a2.n.put("index", Integer.valueOf(searchResultBanner2.getStatisticsIndex()));
            c1300a2.n.put("keyword", c1300a2.o.h);
            c1300a2.n.put("search_source", Integer.valueOf(c1300a2.o.aw));
            c1300a2.n.put("search_global_id", c1300a2.o.r);
            if (searchResultBanner2.searchPlatformStid != null) {
                c1300a2.n.put("content_id", TextUtils.isEmpty(searchResultBanner2.searchPlatformStid.contentId) ? "-999" : searchResultBanner2.searchPlatformStid.contentId);
                c1300a2.n.put(NetLogConstants.Details.CONTENT_TYPE, Integer.valueOf(searchResultBanner2.searchPlatformStid.contentType != 0 ? searchResultBanner2.searchPlatformStid.contentType : 2));
                c1300a2.n.put("content_tag", TextUtils.isEmpty(searchResultBanner2.searchPlatformStid.contentTag) ? "-999" : searchResultBanner2.searchPlatformStid.contentTag);
                c1300a2.n.put("template_id", Integer.valueOf(searchResultBanner2.searchPlatformStid.templateId));
            } else {
                c1300a2.n.put("content_id", "-999");
                c1300a2.n.put(NetLogConstants.Details.CONTENT_TYPE, "-999");
                c1300a2.n.put("content_tag", "-999");
            }
            if (!searchResultBanner2.isExposed) {
                com.sankuai.waimai.store.manager.judas.b.b("c_nfqbfvw", "b_waimai_sg_rnjibpln_mv").b(c1300a2.n).a();
                searchResultBanner2.isExposed = true;
            }
            if (TextUtils.isEmpty(searchResultBanner2.channelIconUrl)) {
                c1300a2.d.setVisibility(8);
                c1300a2.e.setVisibility(8);
            } else {
                c1300a2.d.setVisibility(0);
                c1300a2.e.setVisibility(0);
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = c1300a2.b;
                a2.c = searchResultBanner2.channelIconUrl;
                a2.h = new b.c() { // from class: com.sankuai.waimai.store.search.template.carouselcard.a.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5cc6ff5557700d00094553f98718e4f5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5cc6ff5557700d00094553f98718e4f5");
                        } else {
                            u.a(C1300a.this.e);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void b() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "27b8c2f964bab09dfa9c077f131aff7a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "27b8c2f964bab09dfa9c077f131aff7a");
                        } else {
                            u.c(C1300a.this.e);
                        }
                    }
                };
                a2.a(c1300a2.e);
            }
            c1300a2.f.setVisibility(TextUtils.isEmpty(searchResultBanner2.channelName) ? 8 : 0);
            c1300a2.f.setText(searchResultBanner2.channelName);
            c1300a2.g.setVisibility((TextUtils.isEmpty(searchResultBanner2.channelSchemeDesc) || TextUtils.isEmpty(searchResultBanner2.channelScheme)) ? 8 : 0);
            c1300a2.g.setText(searchResultBanner2.channelSchemeDesc);
            c1300a2.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.carouselcard.a.a.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0a8774f3da635043738c3017796fb4d5", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0a8774f3da635043738c3017796fb4d5");
                        return;
                    }
                    if (!TextUtils.isEmpty(searchResultBanner2.channelScheme)) {
                        d.a(C1300a.this.b, searchResultBanner2.channelScheme);
                    }
                    com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", "b_waimai_sg_rnjibpln_mc").b(C1300a.this.n).a();
                }
            });
            if (TextUtils.isEmpty(searchResultBanner2.cardTypeIcon)) {
                c1300a2.h.setVisibility(8);
            } else {
                c1300a2.h.setVisibility(0);
                b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a3.b = c1300a2.b;
                a3.c = searchResultBanner2.cardTypeIcon;
                a3.h = new b.c() { // from class: com.sankuai.waimai.store.search.template.carouselcard.a.a.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "648c3eeda318e0dcf0ea91c77fa1dfd4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "648c3eeda318e0dcf0ea91c77fa1dfd4");
                        } else {
                            u.a(C1300a.this.h);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void b() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "24922bd35fd69c0fe5af7008466e2fb2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "24922bd35fd69c0fe5af7008466e2fb2");
                        } else {
                            u.c(C1300a.this.h);
                        }
                    }
                };
                a3.a(c1300a2.h);
            }
            if (searchResultBanner2.couponComponent != null && !TextUtils.isEmpty(searchResultBanner2.couponComponent.ticketSalary) && !TextUtils.isEmpty(searchResultBanner2.couponComponent.scheme)) {
                c1300a2.i.setVisibility(0);
                c1300a2.j.setText(searchResultBanner2.couponComponent.ticketSalary);
                if (!TextUtils.isEmpty(searchResultBanner2.couponComponent.text)) {
                    c1300a2.k.setVisibility(0);
                    c1300a2.k.setText(searchResultBanner2.couponComponent.text);
                } else {
                    c1300a2.k.setVisibility(8);
                }
                c1300a2.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.carouselcard.a.a.5
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "989d7d8ac41ecbeb0df8c4d049e2db0d", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "989d7d8ac41ecbeb0df8c4d049e2db0d");
                            return;
                        }
                        d.a(C1300a.this.b, searchResultBanner2.channelScheme);
                        com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", "b_waimai_sg_rnjibpln_mc").b(C1300a.this.n).a();
                    }
                });
            } else {
                c1300a2.i.setVisibility(8);
            }
            if (TextUtils.isEmpty(searchResultBanner2.subscriptIcon)) {
                c1300a2.l.setVisibility(8);
                return;
            }
            c1300a2.l.setVisibility(0);
            c1300a2.l.setText(searchResultBanner2.subscriptIcon);
            c1300a2.l.setBackground(new e.a().c(ContextCompat.getColor(c1300a2.b, R.color.wm_sc_nox_search_color_20000000)).b(1).a(0.0f, c1300a2.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4), 0.0f, c1300a2.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4)).a());
        }
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27fd02a286233953e3643190b54ad739", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27fd02a286233953e3643190b54ad739");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34297f4bef4bb96ce65bb402cc6d501e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34297f4bef4bb96ce65bb402cc6d501e")).booleanValue() : str.equals("sg_search_carousel_card_business_directcard");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.carouselcard.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1300a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        Context b;
        View c;
        View d;
        ImageView e;
        TextView f;
        TextView g;
        ImageView h;
        View i;
        TextView j;
        TextView k;
        TextView l;
        SearchAutoScrollPagerView m;
        Map<String, Object> n;
        SearchShareData o;
        private View p;

        public C1300a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0120cd10c867733d46daa424b37ad929", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0120cd10c867733d46daa424b37ad929");
                return;
            }
            this.n = new HashMap();
            this.p = view;
            this.b = this.p.getContext();
            this.c = view.findViewById(R.id.search_banner_fl_main);
            this.e = (ImageView) view.findViewById(R.id.search_banner_channel_icon);
            this.f = (TextView) view.findViewById(R.id.search_banner_channel_name);
            this.g = (TextView) view.findViewById(R.id.search_banner_channel_link);
            this.d = view.findViewById(R.id.rl_search_banner_channel_icon);
            this.h = (ImageView) view.findViewById(R.id.search_banner_brand_icon);
            this.i = view.findViewById(R.id.ll_course_card_coupons_rootview);
            this.j = (TextView) view.findViewById(R.id.tv_course_card_coupons_amount);
            this.k = (TextView) view.findViewById(R.id.tv_course_card_coupons_desc);
            this.l = (TextView) view.findViewById(R.id.search_banner_iv_ad);
            this.m = (SearchAutoScrollPagerView) view.findViewById(R.id.auto_scroll_pager_view);
            this.o = SearchShareData.a(this.b);
        }
    }
}
