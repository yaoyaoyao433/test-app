package com.sankuai.waimai.restaurant.shopcart.ui;

import android.app.Activity;
import android.os.Message;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import com.facebook.react.i;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.RoundedFrameLayout;
import com.sankuai.waimai.restaurant.shopcart.popup.MRNPopupFragment;
import com.sankuai.waimai.restaurant.shopcart.viewHolder.d;
import com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c {
    public static ChangeQuickRedirect a;
    FrameLayout b;
    final com.sankuai.waimai.business.restaurant.base.manager.order.g c;
    final Activity d;
    final com.sankuai.waimai.restaurant.shopcart.config.a e;
    View f;
    DragSortListView g;
    com.sankuai.waimai.restaurant.shopcart.adapter.a h;
    View i;
    View j;
    com.sankuai.waimai.restaurant.shopcart.viewHolder.d k;
    public List<r> l;
    d.a m;
    private com.sankuai.waimai.restaurant.shopcart.popup.b n;
    private boolean o;

    public abstract void a(boolean z);

    public abstract void g();

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "d182990a94339d87688f004d335e1e1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "d182990a94339d87688f004d335e1e1c");
        } else {
            cVar.i.setVisibility(8);
        }
    }

    public c(Activity activity, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar) {
        Object[] objArr = {activity, gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dc0e64252e80382e1637fe7d57e19ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dc0e64252e80382e1637fe7d57e19ee");
            return;
        }
        this.m = new d.a() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.restaurant.shopcart.viewHolder.d.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a99af9b11088fce16f7ee0c9b5e897e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a99af9b11088fce16f7ee0c9b5e897e4");
                } else if (i < 0 || i >= c.this.h.getCount()) {
                } else {
                    com.sankuai.waimai.business.restaurant.base.manager.order.k.a().a(c.this.c.f(), c.this.h.getItem(i).f);
                }
            }
        };
        this.d = activity;
        this.c = gVar;
        this.e = aVar;
        this.l = new ArrayList();
    }

    private boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "682ef8ccb50a8eceb8ef9b41b67f9085", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "682ef8ccb50a8eceb8ef9b41b67f9085")).booleanValue() : com.sankuai.waimai.business.restaurant.poicontainer.b.P();
    }

    void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "272484d4214ac8131749d74ea43fdf22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "272484d4214ac8131749d74ea43fdf22");
            return;
        }
        List<com.sankuai.waimai.business.restaurant.base.shopcart.g> c = c();
        if (!com.sankuai.waimai.foundation.utils.b.a(c) || i >= c.size() || i < 0) {
            return;
        }
        int c2 = c(i);
        this.k.a(c.get(c2), c2, c);
    }

    private int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f16ba073348a343bc825063f30a0dc4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f16ba073348a343bc825063f30a0dc4")).intValue();
        }
        List<com.sankuai.waimai.business.restaurant.base.shopcart.g> c = c();
        if (com.sankuai.waimai.foundation.utils.b.a(c) && i < c.size() && i >= 0) {
            com.sankuai.waimai.business.restaurant.base.shopcart.g gVar = c.get(i);
            for (int i2 = 0; i2 < c.size(); i2++) {
                if (c.get(i2).f == gVar.f) {
                    return i2;
                }
            }
        }
        return 0;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd8aa4275285d019ccc7f87f1fb714e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd8aa4275285d019ccc7f87f1fb714e9");
            return;
        }
        if (j() && !this.o) {
            Activity activity = this.d;
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a2e45b667a36733a676df7849956043", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a2e45b667a36733a676df7849956043");
            } else if (j() && !this.o) {
                this.n = new com.sankuai.waimai.restaurant.shopcart.popup.b();
                final com.sankuai.waimai.restaurant.shopcart.popup.b bVar = this.n;
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                Object[] objArr3 = {fragmentActivity};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.restaurant.shopcart.popup.a.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "22a01214286b9f3cbb157f5c55096bab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "22a01214286b9f3cbb157f5c55096bab");
                } else {
                    Object[] objArr4 = {fragmentActivity};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.restaurant.shopcart.popup.a.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "21aba76886d10600828dfd8405c8d57c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "21aba76886d10600828dfd8405c8d57c");
                    } else {
                        bVar.c = LayoutInflater.from(fragmentActivity).inflate(R.layout.wm_common_mrn_popup_container, (ViewGroup) null);
                        bVar.d = (RoundedFrameLayout) bVar.c.findViewById(R.id.mrn_popup_fragment_container);
                    }
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.restaurant.shopcart.popup.a.a;
                    if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "0c735338daf455f69a262e6a0ab99ebd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "0c735338daf455f69a262e6a0ab99ebd");
                    } else {
                        bVar.e = bVar.e();
                        bVar.f = bVar.f();
                        bVar.h = bVar.h();
                        bVar.i = 0;
                        bVar.j = -870177754;
                        bVar.g = bVar.g();
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.restaurant.shopcart.popup.a.a;
                        if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "41a4495a1f5273278c3fd137ffcc0ccf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "41a4495a1f5273278c3fd137ffcc0ccf");
                        } else {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.d.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -2);
                            }
                            if (bVar.h == com.sankuai.waimai.restaurant.shopcart.popup.c.BOTTOM_UP) {
                                layoutParams.gravity = 80;
                            } else if (bVar.h == com.sankuai.waimai.restaurant.shopcart.popup.c.TOP_DOWN) {
                                layoutParams.gravity = 48;
                            } else if (bVar.h == com.sankuai.waimai.restaurant.shopcart.popup.c.MIDDLE) {
                                layoutParams.gravity = 17;
                            }
                            layoutParams.leftMargin = bVar.g[1];
                            layoutParams.rightMargin = bVar.g[3];
                            if (bVar.h == com.sankuai.waimai.restaurant.shopcart.popup.c.MIDDLE) {
                                layoutParams.topMargin = bVar.g[0];
                                layoutParams.bottomMargin = bVar.g[2];
                                bVar.d.setMinimumHeight(bVar.f);
                            } else if (bVar.f >= bVar.e) {
                                layoutParams.height = bVar.f;
                            } else {
                                layoutParams.topMargin = com.sankuai.waimai.foundation.utils.g.b(com.meituan.android.singleton.b.a) - bVar.e;
                                bVar.d.setMinimumHeight(bVar.f);
                            }
                            bVar.d.setLayoutParams(layoutParams);
                        }
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.restaurant.shopcart.popup.a.a;
                        if (PatchProxy.isSupport(objArr7, bVar, changeQuickRedirect7, false, "d091484652476a5109c147989542494f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, bVar, changeQuickRedirect7, false, "d091484652476a5109c147989542494f");
                        } else {
                            if (bVar.c != null) {
                                bVar.c.setBackgroundColor(bVar.j);
                            }
                            if (bVar.d != null) {
                                bVar.d.setBackgroundColor(0);
                            }
                        }
                        Object[] objArr8 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.restaurant.shopcart.popup.a.a;
                        if (PatchProxy.isSupport(objArr8, bVar, changeQuickRedirect8, false, "a95aa29222bb1f5f5f902e5d019a1535", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, bVar, changeQuickRedirect8, false, "a95aa29222bb1f5f5f902e5d019a1535");
                        } else {
                            bVar.d.b(bVar.i, bVar.i, 0, 0);
                        }
                        Object[] objArr9 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.restaurant.shopcart.popup.a.a;
                        if (PatchProxy.isSupport(objArr9, bVar, changeQuickRedirect9, false, "1bcac78e41a128f5149b964f112d9366", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, bVar, changeQuickRedirect9, false, "1bcac78e41a128f5149b964f112d9366");
                        } else {
                            bVar.k = bVar.j();
                            bVar.l = bVar.k();
                            bVar.m = bVar.l();
                        }
                        Object[] objArr10 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.restaurant.shopcart.popup.a.a;
                        if (PatchProxy.isSupport(objArr10, bVar, changeQuickRedirect10, false, "4ee9e562902cacd408cbee433ba1afb8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, bVar, changeQuickRedirect10, false, "4ee9e562902cacd408cbee433ba1afb8");
                        } else if (bVar.c != null) {
                            bVar.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.popup.a.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr11 = {view};
                                    ChangeQuickRedirect changeQuickRedirect11 = a;
                                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "8a23b60ffab201aabc24504c334168fd", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "8a23b60ffab201aabc24504c334168fd");
                                        return;
                                    }
                                    a aVar = bVar;
                                    Object[] objArr12 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect12 = a.a;
                                    if (PatchProxy.isSupport(objArr12, aVar, changeQuickRedirect12, false, "d212e8b44214bc93b6e38063b7f40887", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr12, aVar, changeQuickRedirect12, false, "d212e8b44214bc93b6e38063b7f40887");
                                    } else if (aVar.d == null || aVar.q) {
                                    } else {
                                        aVar.d.startAnimation(aVar.p);
                                    }
                                }
                            });
                        }
                        Object[] objArr11 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.restaurant.shopcart.popup.a.a;
                        if (PatchProxy.isSupport(objArr11, bVar, changeQuickRedirect11, false, "edc363719ea479aaa736a06ba9201ed1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr11, bVar, changeQuickRedirect11, false, "edc363719ea479aaa736a06ba9201ed1");
                        } else {
                            Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: com.sankuai.waimai.restaurant.shopcart.popup.a.2
                                public static ChangeQuickRedirect a;

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationRepeat(Animation animation) {
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationStart(Animation animation) {
                                    Object[] objArr12 = {animation};
                                    ChangeQuickRedirect changeQuickRedirect12 = a;
                                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "734ab880b7f1fcb44964a270ac842023", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "734ab880b7f1fcb44964a270ac842023");
                                    } else {
                                        bVar.q = true;
                                    }
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationEnd(Animation animation) {
                                    Object[] objArr12 = {animation};
                                    ChangeQuickRedirect changeQuickRedirect12 = a;
                                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "0c9d989d8b0043b222b7bfe74ea3002a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "0c9d989d8b0043b222b7bfe74ea3002a");
                                        return;
                                    }
                                    bVar.q = false;
                                    bVar.b();
                                }
                            };
                            Animation.AnimationListener animationListener2 = new Animation.AnimationListener() { // from class: com.sankuai.waimai.restaurant.shopcart.popup.a.3
                                public static ChangeQuickRedirect a;

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationRepeat(Animation animation) {
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationStart(Animation animation) {
                                    Object[] objArr12 = {animation};
                                    ChangeQuickRedirect changeQuickRedirect12 = a;
                                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "69c220e7652a4225ff745c469eeddfe1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "69c220e7652a4225ff745c469eeddfe1");
                                    } else {
                                        bVar.q = true;
                                    }
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationEnd(Animation animation) {
                                    Object[] objArr12 = {animation};
                                    ChangeQuickRedirect changeQuickRedirect12 = a;
                                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "849196910d53ee100fad9d315397da67", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "849196910d53ee100fad9d315397da67");
                                    } else {
                                        bVar.q = false;
                                    }
                                }
                            };
                            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                            translateAnimation.setDuration(300L);
                            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                            translateAnimation2.setDuration(300L);
                            if (bVar.h == com.sankuai.waimai.restaurant.shopcart.popup.c.BOTTOM_UP) {
                                bVar.o = translateAnimation;
                            } else if (bVar.h == com.sankuai.waimai.restaurant.shopcart.popup.c.TOP_DOWN) {
                                bVar.o = translateAnimation2;
                            } else if (bVar.h == com.sankuai.waimai.restaurant.shopcart.popup.c.MIDDLE) {
                                bVar.o = AnimationUtils.loadAnimation(bVar.d.getContext(), R.anim.wm_goods_sku_enter);
                            }
                            if (bVar.h == com.sankuai.waimai.restaurant.shopcart.popup.c.BOTTOM_UP) {
                                bVar.p = translateAnimation2;
                            } else if (bVar.h == com.sankuai.waimai.restaurant.shopcart.popup.c.TOP_DOWN) {
                                bVar.p = translateAnimation;
                            } else if (bVar.h == com.sankuai.waimai.restaurant.shopcart.popup.c.MIDDLE) {
                                bVar.p = AnimationUtils.loadAnimation(bVar.d.getContext(), R.anim.wm_goods_sku_out);
                            }
                            bVar.p.setAnimationListener(animationListener);
                            bVar.o.setAnimationListener(animationListener2);
                        }
                    }
                    bVar.b = fragmentActivity.getSupportFragmentManager();
                }
                this.n.s = this.c.i;
                this.o = true;
            }
        }
        if (this.c.u() && !this.c.a()) {
            b();
        } else {
            this.f.setVisibility(8);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e73f2f68a588b851a051046a2bc166f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e73f2f68a588b851a051046a2bc166f");
            return;
        }
        a(com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.c.f()));
        if (l()) {
            f();
        }
    }

    public final List<com.sankuai.waimai.business.restaurant.base.shopcart.g> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c62882b9b32c45beca37b92ddc6ca005", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c62882b9b32c45beca37b92ddc6ca005") : Collections.unmodifiableList(this.h.a());
    }

    public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82b077ea23d6e95e4c1ce39e6f900c70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82b077ea23d6e95e4c1ce39e6f900c70");
        } else if (j()) {
        } else {
            this.h.a(com.sankuai.waimai.restaurant.shopcart.utils.h.a(bVar, this.c));
            a(this.g.getFirstVisiblePosition());
        }
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52b306292ce2ecc46e8fccd596f282a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52b306292ce2ecc46e8fccd596f282a0")).booleanValue();
        }
        if (!j() || this.n == null) {
            return this.f.getVisibility() == 0;
        }
        return this.n.d();
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "878a69f81abca7babd9d328e1071eb38", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "878a69f81abca7babd9d328e1071eb38")).booleanValue();
        }
        if (k()) {
            if (j() && this.n != null) {
                if (this.n.d()) {
                    return false;
                }
                final com.sankuai.waimai.restaurant.shopcart.popup.b bVar = this.n;
                FrameLayout frameLayout = this.b;
                Object[] objArr2 = {frameLayout};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.restaurant.shopcart.popup.a.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ff23e60d5f326b3089dbce8a923ee2f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ff23e60d5f326b3089dbce8a923ee2f2");
                } else if (bVar.c != null && frameLayout != null && !bVar.d() && !bVar.q) {
                    bVar.c();
                    bVar.n = frameLayout;
                    bVar.a(0);
                    frameLayout.addView(bVar.c, new ViewGroup.LayoutParams(-1, -1));
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.restaurant.shopcart.popup.a.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "a0f5324139f8e6b4c2451e1aa7242459", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "a0f5324139f8e6b4c2451e1aa7242459");
                    } else if (bVar.b != null) {
                        FragmentTransaction beginTransaction = bVar.b.beginTransaction();
                        MRNPopupFragment a2 = MRNPopupFragment.a(bVar.k, bVar.l, bVar.m, bVar.i());
                        a2.b = new MRNPopupFragment.a() { // from class: com.sankuai.waimai.restaurant.shopcart.popup.a.4
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNPopupFragment.a
                            public final void a() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2fa54a9d2967f252a179d542a46b876b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2fa54a9d2967f252a179d542a46b876b");
                                } else if (bVar.d != null) {
                                    bVar.d.startAnimation(bVar.o);
                                }
                            }
                        };
                        a2.c = new MRNPopupFragment.b() { // from class: com.sankuai.waimai.restaurant.shopcart.popup.a.5
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNPopupFragment.b
                            public final List<i> a() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "efb5bdd84c33dc3ee1bb4548e34f52f4", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "efb5bdd84c33dc3ee1bb4548e34f52f4") : bVar.n();
                            }
                        };
                        try {
                            beginTransaction.replace(R.id.mrn_popup_fragment_container, a2, bVar.m());
                            beginTransaction.commitNowAllowingStateLoss();
                        } catch (Exception e) {
                            com.sankuai.waimai.foundation.utils.log.a.b(e);
                        }
                    }
                }
                return true;
            } else if (d()) {
                return false;
            } else {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "130dda56460bc3a2331bbc7170cf6a0e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "130dda56460bc3a2331bbc7170cf6a0e");
                } else {
                    com.sankuai.waimai.restaurant.shopcart.utils.a.a().b = false;
                }
                if (this.d instanceof WMRestaurantActivity) {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2fcd9806a295a8979054721e45cce35a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2fcd9806a295a8979054721e45cce35a");
                    } else if (!com.sankuai.waimai.business.restaurant.composeorder.a.b && !com.sankuai.waimai.restaurant.shopcart.utils.b.a(c()) && this.g != null) {
                        this.g.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.c.7
                            public static ChangeQuickRedirect a;

                            @Override // android.widget.AbsListView.OnScrollListener
                            public final void onScrollStateChanged(AbsListView absListView, int i) {
                            }

                            @Override // android.widget.AbsListView.OnScrollListener
                            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                                Object[] objArr6 = {absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a688eac53f03627ec2126ff6e55a037a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a688eac53f03627ec2126ff6e55a037a");
                                } else if (com.sankuai.waimai.business.restaurant.composeorder.a.b || com.sankuai.waimai.restaurant.shopcart.utils.b.a(c.this.c()) || com.sankuai.waimai.foundation.utils.f.a(c.this.d) || c.this.g == null) {
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    c.this.g.findViewsWithText(arrayList, c.this.d.getString(R.string.wm_restaurant_cart_change_pocket_tip), 1);
                                    if (com.sankuai.waimai.restaurant.shopcart.utils.b.a(arrayList)) {
                                        return;
                                    }
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        if (ah.b((View) it.next())) {
                                            JudasManualManager.a a3 = JudasManualManager.b("b_waimai_0mczfp0x_mv").a("c_CijEL");
                                            a3.b = AppUtil.generatePageInfoKey(c.this.d);
                                            a3.a();
                                            c.this.g.setOnScrollListener(null);
                                            return;
                                        }
                                    }
                                }
                            }
                        });
                    }
                }
                this.f.setVisibility(0);
                Message obtain = Message.obtain();
                obtain.what = 2000;
                obtain.arg1 = 2001;
                com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(obtain);
                b(true);
                a(true);
                return true;
            }
        }
        return false;
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d0fd8e6b608db3059ad314d33331ec7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d0fd8e6b608db3059ad314d33331ec7");
            return;
        }
        for (r rVar : this.l) {
            if (rVar != null) {
                rVar.a(z);
            }
        }
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba39224fbde25df6e65b0828dd5bf572", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba39224fbde25df6e65b0828dd5bf572")).booleanValue();
        }
        if (j() && this.n != null) {
            if (this.n.d()) {
                this.n.a();
                return true;
            }
            return false;
        } else if (d()) {
            this.f.setVisibility(8);
            Message obtain = Message.obtain();
            obtain.what = 2000;
            obtain.arg1 = 2002;
            com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(obtain);
            b(false);
            a(false);
            return true;
        } else {
            return false;
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eec5c3f58dba1ba629b4abfc2089e964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eec5c3f58dba1ba629b4abfc2089e964");
        } else if (d()) {
            f();
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8a4ac9a4d6360c640badc3d6d229d50", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8a4ac9a4d6360c640badc3d6d229d50");
            } else if (h()) {
                JudasManualManager.a a2 = JudasManualManager.a("b_6yMpF").a("c_CijEL");
                a2.b = AppUtil.generatePageInfoKey(this.d);
                a2.a("business_type", this.c.o).a("poi_id", this.c.f()).a(KernelConfig.KEY_CONTAINER_TYPE, this.c.s()).a("shopcart_status", "0").a("index", i).a("brand_id", this.c.A()).a();
            } else if (m()) {
                JudasManualManager.a a3 = JudasManualManager.a("b_ysVZq").a("c_u4fk4kw");
                a3.b = AppUtil.generatePageInfoKey(this.d);
                a3.a("poi_id", this.c.f()).a("spu_id", com.sankuai.waimai.platform.domain.manager.goods.a.a().b()).a("is_show", "0").a("index", i).a();
            }
        } else if (k()) {
            e();
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bc1d3d09406f7ce875870dbc599008e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bc1d3d09406f7ce875870dbc599008e7");
            } else if (h()) {
                JudasManualManager.a a4 = JudasManualManager.a("b_6yMpF").a("c_CijEL");
                a4.b = AppUtil.generatePageInfoKey(this.d);
                a4.a("business_type", this.c.o).a("poi_id", this.c.f()).a(KernelConfig.KEY_CONTAINER_TYPE, this.c.s()).a("shopcart_status", "1").a("index", i).a("brand_id", this.c.A()).a();
            } else if (m()) {
                JudasManualManager.a a5 = JudasManualManager.a("b_ysVZq").a("c_u4fk4kw");
                a5.b = AppUtil.generatePageInfoKey(this.d);
                a5.a("poi_id", this.c.f()).a("spu_id", com.sankuai.waimai.platform.domain.manager.goods.a.a().b()).a("is_show", "1").a("index", i).a();
            }
        }
    }

    private boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f40cf6284a3141318b3a23ad1a1b77b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f40cf6284a3141318b3a23ad1a1b77b")).booleanValue() : this.c.u() && !l();
    }

    private boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d20b4f94cf8591a30f00c6a1b7754a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d20b4f94cf8591a30f00c6a1b7754a")).booleanValue() : !com.sankuai.waimai.business.restaurant.base.manager.order.k.a().g(this.c.f());
    }

    boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e3430a75d7975f7c59e5fb8d8f873f3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e3430a75d7975f7c59e5fb8d8f873f3")).booleanValue() : this.e.a();
    }

    private boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d57916233b417321910d6db78285489d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d57916233b417321910d6db78285489d")).booleanValue() : this.e.b();
    }

    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a90339183e0318feda5acfb059819545", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a90339183e0318feda5acfb059819545")).booleanValue();
        }
        if (d()) {
            f();
            return true;
        }
        return false;
    }
}
