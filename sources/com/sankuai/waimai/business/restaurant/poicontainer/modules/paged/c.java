package com.sankuai.waimai.business.restaurant.poicontainer.modules.paged;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.framework.viewpager.design.PGABlockPagerAdapter;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.PoiCommentSP;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.b;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.h;
import com.sankuai.waimai.business.restaurant.poicontainer.utils.f;
import com.sankuai.waimai.business.restaurant.poicontainer.views.SafeViewPager;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    SafeViewPager e;
    com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.a f;
    PGABlockPagerAdapter g;
    boolean h;
    com.sankuai.waimai.business.restaurant.poicontainer.helper.b i;
    g j;
    Activity k;
    final g.a l;
    List<com.meituan.android.cube.pga.block.a> m;
    a n;
    int o;
    private final String p;
    private View q;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a extends com.sankuai.waimai.business.restaurant.base.interfaces.b {
        void M();

        void b(int i);

        void c(boolean z);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_restaurant_layout_content_tab;
    }

    public c(Activity activity, g gVar, a aVar) {
        super(activity);
        Object[] objArr = {activity, gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a2f844c4182657a848756548b541596", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a2f844c4182657a848756548b541596");
            return;
        }
        this.p = "ShopContentBlock";
        this.h = true;
        this.i = new com.sankuai.waimai.business.restaurant.poicontainer.helper.b();
        this.m = new ArrayList();
        this.k = activity;
        this.j = gVar;
        this.l = gVar.a(this.k);
        this.n = aVar;
        this.i.a(new b.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.c.1
        });
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acb49c2fe9f64ae44b618338d30487b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acb49c2fe9f64ae44b618338d30487b7");
            return;
        }
        g();
        PGABlockPagerAdapter pGABlockPagerAdapter = this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = PGABlockPagerAdapter.a;
        if (PatchProxy.isSupport(objArr2, pGABlockPagerAdapter, changeQuickRedirect2, false, "520afc8d534b3f7bca7fa26af601ae1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pGABlockPagerAdapter, changeQuickRedirect2, false, "520afc8d534b3f7bca7fa26af601ae1c");
            return;
        }
        for (com.meituan.android.cube.pga.block.a aVar : pGABlockPagerAdapter.b) {
            aVar.y();
        }
    }

    public final void f() {
        int b2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8737bc223e82bbe4a5d96bf2f1624f64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8737bc223e82bbe4a5d96bf2f1624f64");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        this.f = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32f2f46f1882d54edc239cfaa2b9166b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32f2f46f1882d54edc239cfaa2b9166b") : new com.sankuai.waimai.business.restaurant.poicontainer.modules.tab.b(this.k, this.j, this.j.a(this.k), this.i);
        this.e = (SafeViewPager) this.b.findViewById(R.id.pager_container);
        this.e.setOffscreenPageLimit(2);
        this.q = this.f.a(this.b, R.id.tab_container);
        this.e.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.ShopContentBlockView$2
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                boolean z;
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5970d04f725022c28980c9dd5ec0a188", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5970d04f725022c28980c9dd5ec0a188");
                    return;
                }
                c cVar = c.this;
                Object[] objArr4 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = c.d;
                if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "e03d58ac8d3d46b620656d2015335f57", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "e03d58ac8d3d46b620656d2015335f57");
                    z = false;
                } else {
                    String f = cVar.j.f();
                    int s = cVar.j.s();
                    if (i == cVar.l.b()) {
                        Activity activity = cVar.k;
                        Object[] objArr5 = {f, Integer.valueOf(s), activity};
                        ChangeQuickRedirect changeQuickRedirect5 = f.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "410c32cdec45ef73bf3934ab38eaa745", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "410c32cdec45ef73bf3934ab38eaa745");
                        } else {
                            JudasManualManager.a a2 = JudasManualManager.a("b_Qq92p").a("poi_id", f).a(KernelConfig.KEY_CONTAINER_TYPE, s).a("c_CijEL");
                            a2.b = AppUtil.generatePageInfoKey(activity);
                            a2.a();
                        }
                    } else if (i == cVar.l.c()) {
                        long A = cVar.j.A();
                        long commentNumber = cVar.j.g.getCommentNumber();
                        Activity activity2 = cVar.k;
                        Object[] objArr6 = {f, new Long(A), Integer.valueOf(s), new Long(commentNumber), activity2};
                        ChangeQuickRedirect changeQuickRedirect6 = f.a;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "2375289d2a286da9a5e4b3a0abecc162", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "2375289d2a286da9a5e4b3a0abecc162");
                        } else {
                            JudasManualManager.a a3 = JudasManualManager.a("b_SHvZg").a("c_CijEL");
                            a3.b = AppUtil.generatePageInfoKey(activity2);
                            a3.a("poi_id", f).a("brand_id", A).a(KernelConfig.KEY_CONTAINER_TYPE, s).a("is_showfriend_icon", 0).a("comment_count", commentNumber).a();
                        }
                    } else if (i == cVar.l.d()) {
                        long A2 = cVar.j.A();
                        Activity activity3 = cVar.k;
                        Object[] objArr7 = {f, new Long(A2), Integer.valueOf(s), activity3};
                        ChangeQuickRedirect changeQuickRedirect7 = f.a;
                        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "adfd5acd940b923b2fadfa3975220078", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "adfd5acd940b923b2fadfa3975220078");
                        } else {
                            JudasManualManager.a a4 = JudasManualManager.a("b_eqjRl").a("c_CijEL");
                            a4.b = AppUtil.generatePageInfoKey(activity3);
                            a4.a("poi_id", f).a(KernelConfig.KEY_CONTAINER_TYPE, s).a("brand_id", A2).a();
                        }
                    } else if (i == cVar.l.a()) {
                        Activity activity4 = cVar.k;
                        Object[] objArr8 = {f, activity4};
                        ChangeQuickRedirect changeQuickRedirect8 = f.a;
                        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "fe5f3e2278ed1cfca7667c3d4a307e98", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "fe5f3e2278ed1cfca7667c3d4a307e98");
                        } else {
                            JudasManualManager.a a5 = JudasManualManager.a("b_waimai_vcqv9s68_mc").a("poi_id", f).a("c_CijEL");
                            a5.b = AppUtil.generatePageInfoKey(activity4);
                            a5.a();
                        }
                    }
                    int c = cVar.l.c();
                    Activity activity5 = cVar.k;
                    Object[] objArr9 = {f, Integer.valueOf(i), Integer.valueOf(c), activity5};
                    ChangeQuickRedirect changeQuickRedirect9 = f.a;
                    if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "2902efaf3a6d7eeb79c9877a9e735cc3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "2902efaf3a6d7eeb79c9877a9e735cc3");
                    } else {
                        int a6 = PoiCommentSP.a();
                        if (a6 != c && i == c) {
                            PoiCommentSP.c();
                        } else if (a6 == c && i != c) {
                            f.a(f, c, false, activity5);
                        }
                        PoiCommentSP.a(i);
                    }
                    if (i == cVar.l.d() && h.a(cVar.k, cVar.j.g)) {
                        Activity activity6 = cVar.k;
                        Poi poi = cVar.j.g;
                        Object[] objArr10 = {activity6, poi};
                        ChangeQuickRedirect changeQuickRedirect10 = h.a;
                        if (PatchProxy.isSupport(objArr10, null, changeQuickRedirect10, true, "b762c08975543b571fff08df38d15671", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, null, changeQuickRedirect10, true, "b762c08975543b571fff08df38d15671");
                        } else if (poi != null) {
                            String poiIDStr = poi.getPoiIDStr();
                            z = false;
                            Object[] objArr11 = {activity6, "key_poi_story_icon", poiIDStr};
                            ChangeQuickRedirect changeQuickRedirect11 = h.a;
                            if (PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "cfe9bde4bd316484bb4a5cd053612084", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "cfe9bde4bd316484bb4a5cd053612084");
                            } else {
                                Set a7 = com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) activity6, "key_poi_story_icon", (Set<String>) null);
                                if (a7 == null) {
                                    a7 = new HashSet();
                                }
                                if (!a7.contains(poiIDStr)) {
                                    a7.add(poiIDStr);
                                    com.sankuai.waimai.platform.capacity.persistent.sp.a.b(activity6, "key_poi_story_icon", a7);
                                }
                            }
                            cVar.f.b();
                        }
                        z = false;
                        cVar.f.b();
                    } else {
                        z = false;
                    }
                    cVar.n.b(i);
                    com.sankuai.waimai.ai.uat.b.a().a("TAB_SELECT_KEY", Integer.valueOf(i));
                }
                c cVar2 = c.this;
                if (i == cVar2.l.b()) {
                    z = true;
                }
                cVar2.a(z);
                c.this.g();
                c.this.o = i;
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7093aa1bba94776a41ce2862f77984c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7093aa1bba94776a41ce2862f77984c5");
                } else if (i == 0) {
                    c.this.e();
                }
            }
        });
        g gVar = this.j;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = g.a;
        if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "3355e5f41c576ad1dddc6c7eb1adb67c", RobustBitConfig.DEFAULT_VALUE)) {
            b2 = ((Integer) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "3355e5f41c576ad1dddc6c7eb1adb67c")).intValue();
        } else if (gVar.x == null) {
            b2 = 0;
        } else {
            int a2 = gVar.I == 1 ? gVar.x.a() : gVar.x.b();
            b2 = a2 < 0 ? gVar.x.b() : a2;
        }
        this.o = b2;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = d;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "024f13749e72bc73622be596cdb6dbea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "024f13749e72bc73622be596cdb6dbea");
        } else {
            this.q.setOnTouchListener(new b());
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb176bdd1fc1d5d9f4588b442ac53734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb176bdd1fc1d5d9f4588b442ac53734");
            return;
        }
        if (this.n != null && this.h != z) {
            this.n.c(z);
        }
        this.h = z;
    }

    private boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79e6fd17e32f35425ba08b565090d32c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79e6fd17e32f35425ba08b565090d32c")).booleanValue() : this.e.getCurrentItem() == this.l.b();
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbbe8e1c70b4a7857c22973a246a63d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbbe8e1c70b4a7857c22973a246a63d1");
        } else if (this.n.aE_() && h()) {
            this.f.c();
        } else {
            this.f.d();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b implements View.OnTouchListener {
        public static ChangeQuickRedirect a;
        private GestureDetector c;

        private b() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2901c7c7711c0a4524793a3ecd0ce1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2901c7c7711c0a4524793a3ecd0ce1");
            } else {
                this.c = new GestureDetector(c.this.k, new GestureDetector.SimpleOnGestureListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.c.b.1
                    public static ChangeQuickRedirect a;
                    private int c;
                    private int d;

                    {
                        this.c = com.sankuai.waimai.foundation.utils.g.a(c.this.k, 0.0f);
                        this.d = -com.sankuai.waimai.foundation.utils.g.a(c.this.k, 0.0f);
                    }

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final boolean onDown(MotionEvent motionEvent) {
                        Object[] objArr2 = {motionEvent};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73ff22ca84db82d7a3ce9cb53e8ed44a", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73ff22ca84db82d7a3ce9cb53e8ed44a")).booleanValue();
                        }
                        com.sankuai.waimai.foundation.utils.log.a.b("ShopContentBlock", "onDown ", new Object[0]);
                        return true;
                    }

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                        Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2db844a387c86a1c100161ddb4d30fad", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2db844a387c86a1c100161ddb4d30fad")).booleanValue();
                        }
                        com.sankuai.waimai.foundation.utils.log.a.b("ShopContentBlock", "onScroll ", new Object[0]);
                        if (f2 > 0.0f && Math.abs(f2) > Math.abs(f)) {
                            com.sankuai.waimai.foundation.utils.log.a.b("ShopContentBlock", "distanceY " + f2 + "  distanceX  " + f, new Object[0]);
                            c.this.n.a(true);
                        }
                        return true;
                    }

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final boolean onSingleTapUp(MotionEvent motionEvent) {
                        Object[] objArr2 = {motionEvent};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "082b0e50d9e97324a1fa3b0beb8e4a7e", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "082b0e50d9e97324a1fa3b0beb8e4a7e")).booleanValue();
                        }
                        com.sankuai.waimai.foundation.utils.log.a.b("ShopContentBlock", "onSingleTapUp ", new Object[0]);
                        return true;
                    }

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                        Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6de85b41a9c6cc4892c77730b16c6cad", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6de85b41a9c6cc4892c77730b16c6cad")).booleanValue();
                        }
                        StringBuilder sb = new StringBuilder("velocityY < mVelocity  ");
                        sb.append(f2 < ((float) this.d));
                        com.sankuai.waimai.foundation.utils.log.a.b("ShopContentBlock", sb.toString(), new Object[0]);
                        try {
                            if (f2 < this.d) {
                                float abs = Math.abs(motionEvent.getY() - motionEvent2.getY());
                                float abs2 = Math.abs(motionEvent.getX() - motionEvent2.getX());
                                if (abs > this.c && abs > abs2) {
                                    c.this.n.a(true);
                                    return true;
                                }
                            }
                        } catch (Throwable th) {
                            com.sankuai.waimai.foundation.utils.log.a.a(th);
                        }
                        return super.onFling(motionEvent, motionEvent2, f, f2);
                    }
                });
            }
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Object[] objArr = {view, motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e3ad2536fd5f42086ba0e5a4dc898d0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e3ad2536fd5f42086ba0e5a4dc898d0")).booleanValue() : this.c.onTouchEvent(motionEvent);
        }
    }
}
