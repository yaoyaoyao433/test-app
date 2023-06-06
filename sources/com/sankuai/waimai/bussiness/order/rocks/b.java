package com.sankuai.waimai.bussiness.order.rocks;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.OrderFollowAreaInfo;
import com.sankuai.waimai.bussiness.order.detailnew.widget.CustomDragExpandLayout;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends RecyclerView.k implements com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.a, com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.c {
    public static ChangeQuickRedirect a;
    boolean A;
    AnimatorSet B;
    boolean C;
    OrderFollowAreaInfo D;
    com.sankuai.waimai.business.order.api.detail.block.a E;
    Handler F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private int L;
    private float M;
    d b;
    int c;
    RecyclerView d;
    CustomDragExpandLayout e;
    TextView f;
    View g;
    ImageView h;
    Context i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    final int p;
    int q;
    final int r;
    final int s;
    boolean t;
    boolean u;
    boolean v;
    com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.a w;
    com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.c x;
    float y;
    com.sankuai.waimai.platform.utils.time.a z;

    public b(final Activity activity, d dVar) {
        int e;
        int a2;
        Object[] objArr = {activity, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59b8f00cdc49b0015424a70801b1c5df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59b8f00cdc49b0015424a70801b1c5df");
            return;
        }
        this.B = null;
        this.J = false;
        this.K = false;
        this.L = 0;
        this.M = 0.7f;
        this.i = activity.getApplicationContext();
        this.b = dVar;
        this.f = dVar.S.a().b;
        this.g = dVar.R.a().b;
        this.d = dVar.aK.a().b;
        this.e = dVar.W.a().b;
        this.E = dVar.u.a().b;
        this.h = dVar.y.a().b;
        dVar.ab.a(new com.meituan.android.cube.pga.action.b<i.a<Boolean, Integer, Boolean, Integer>>() { // from class: com.sankuai.waimai.bussiness.order.rocks.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.a<Boolean, Integer, Boolean, Integer> aVar) {
                i.a<Boolean, Integer, Boolean, Integer> aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef4b6208906c9a67dbbd059018fc0033", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef4b6208906c9a67dbbd059018fc0033");
                } else if (aVar2 != null) {
                    if (aVar2.a.intValue() == 0) {
                        b bVar = b.this;
                        Activity activity2 = activity;
                        boolean booleanValue = aVar2.c.booleanValue();
                        int intValue = aVar2.d.intValue();
                        boolean booleanValue2 = aVar2.b.booleanValue();
                        Object[] objArr3 = {activity2, Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0), Integer.valueOf(intValue), Byte.valueOf(booleanValue2 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "ae245eafe49598828088bbfb727585a8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "ae245eafe49598828088bbfb727585a8");
                        } else if (bVar.A) {
                        } else {
                            bVar.c = intValue;
                            int i = bVar.q;
                            bVar.u = booleanValue;
                            bVar.e.setCanIntercepter(booleanValue);
                            if (booleanValue) {
                                bVar.e.a(activity2, i, bVar.r, b.b());
                                bVar.e.c(false);
                                if (booleanValue2) {
                                    bVar.d.scrollTo(0, 0);
                                    bVar.a(0.0f, true);
                                    bVar.a(false);
                                    return;
                                }
                                return;
                            }
                            bVar.e.a(activity2, bVar.r, bVar.r, b.b());
                            if (bVar.f != null) {
                                bVar.f.setVisibility(0);
                                bVar.f.setAlpha(1.0f);
                            }
                            if (bVar.g != null) {
                                bVar.g.setVisibility(0);
                                bVar.g.setAlpha(1.0f);
                            }
                            bVar.b.X.a((com.meituan.android.cube.pga.common.b<i.c<Float, Boolean>>) com.meituan.android.cube.pga.common.i.a(Float.valueOf(1.0f), Boolean.FALSE));
                        }
                    } else if (aVar2.a.intValue() == 1) {
                        b bVar2 = b.this;
                        Activity activity3 = activity;
                        boolean booleanValue3 = aVar2.c.booleanValue();
                        int intValue2 = aVar2.d.intValue();
                        Object[] objArr4 = {activity3, Byte.valueOf(booleanValue3 ? (byte) 1 : (byte) 0), Integer.valueOf(intValue2)};
                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                        if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "11d05ca233b32071ae842f88afb31d71", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "11d05ca233b32071ae842f88afb31d71");
                        } else if (bVar2.c == intValue2 || bVar2.A) {
                        } else {
                            bVar2.e.setCanIntercepter(booleanValue3);
                            bVar2.c = intValue2;
                            int i2 = bVar2.q;
                            bVar2.n = (i2 - bVar2.p) - bVar2.k;
                            if (bVar2.e.b()) {
                                if (bVar2.h != null) {
                                    bVar2.a(bVar2.h, bVar2.n);
                                }
                                if (bVar2.e != null) {
                                    bVar2.e.b(activity3, i2, bVar2.r, b.b());
                                    return;
                                }
                                return;
                            }
                            bVar2.e.a(i2);
                        }
                    }
                }
            }
        });
        dVar.ad.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.rocks.b.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c96180eb8e6af47e3b4a50fa4f265db3", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c96180eb8e6af47e3b4a50fa4f265db3");
                }
                b bVar = b.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                return Integer.valueOf(PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "c674c451984bcfc70bed613bf06d01a6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "c674c451984bcfc70bed613bf06d01a6")).intValue() : bVar.q - com.sankuai.waimai.foundation.utils.g.a(bVar.i, 10.0f));
            }
        };
        dVar.Z.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.bussiness.order.rocks.b.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Object[] objArr2 = {num};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a89ce71f28b6d4f34cf7c6045a6f86c1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a89ce71f28b6d4f34cf7c6045a6f86c1");
                } else {
                    b.this.d();
                }
            }
        });
        dVar.am.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.bussiness.order.rocks.b.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f52d7c4467fc7c4303a62eda19d24661", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f52d7c4467fc7c4303a62eda19d24661");
                } else if (num2.intValue() == 1) {
                    b.this.d();
                }
            }
        });
        dVar.ap.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.rocks.b.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4fd26c58eb202aa46b52cf7e5585aaf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4fd26c58eb202aa46b52cf7e5585aaf");
                } else {
                    b.this.v = com.sankuai.waimai.bussiness.order.detailnew.util.a.a(bool2);
                }
            }
        });
        dVar.az.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.bussiness.order.rocks.b.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3b3c4bbc13a221f4b22f2659661701f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3b3c4bbc13a221f4b22f2659661701f");
                } else if (b.this.v || com.sankuai.waimai.bussiness.order.detailnew.util.a.a(num2) != 1) {
                } else {
                    b.this.d();
                }
            }
        });
        if (this.e != null && this.d != null) {
            this.e.setScrollViewManager(new com.sankuai.waimai.bussiness.order.detailnew.widget.b(this.d));
            this.e.setExpandStatusChangeListener(this);
            this.e.setExpandRatioChangeListener(this);
            this.d.addOnScrollListener(this);
        }
        this.l = com.sankuai.waimai.foundation.utils.g.a(this.i, 25.0f);
        this.m = com.sankuai.waimai.foundation.utils.g.a(this.i, 28.0f);
        this.p = com.sankuai.waimai.foundation.utils.g.a(this.i, 2.0f);
        this.w = new com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.a(activity, dVar.Y.a().b);
        int a3 = com.sankuai.waimai.foundation.utils.g.a(activity);
        Object[] objArr2 = {Integer.valueOf(a3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "180f6feb727a8163e774f33e261d9af9", RobustBitConfig.DEFAULT_VALUE)) {
            e = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "180f6feb727a8163e774f33e261d9af9")).intValue();
        } else {
            e = b() ? ((int) (a3 * 0.6f)) + com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a) : (int) (a3 * 0.6f);
        }
        this.q = e;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c53156e1b746a4d0c907353a4ff831e9", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c53156e1b746a4d0c907353a4ff831e9")).intValue();
        } else if (b()) {
            a2 = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 104.0f) + com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a);
        } else {
            a2 = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 104.0f);
        }
        this.r = a2;
        this.s = com.meituan.android.singleton.b.a.getResources().getDimensionPixelSize(R.dimen.actionbar_height);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4519647b753aa1c85f58c048dc15f32b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4519647b753aa1c85f58c048dc15f32b");
            return;
        }
        com.meituan.android.cube.pga.common.g<Integer> gVar = this.b.ax;
        Object[] objArr5 = {this};
        ChangeQuickRedirect changeQuickRedirect5 = c.a;
        gVar.b = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "bead6379c030c351c28f83d050644eb7", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.action.d) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "bead6379c030c351c28f83d050644eb7") : new c(this);
    }

    public final void a(Integer num, boolean z) {
        Object[] objArr = {num, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81fdfbf05e7c36f2f3a1a1a27512ccc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81fdfbf05e7c36f2f3a1a1a27512ccc5");
        } else if (!z) {
            this.J = false;
        } else if (this.K) {
        } else {
            this.K = true;
            if (num.intValue() == 1 || num.intValue() == 2) {
                this.J = true;
            }
            if (num.intValue() == 1) {
                this.e.b(true);
            }
        }
    }

    boolean a() {
        return this.D != null && this.D.showMapFlag == 1;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a730bf98bb456962468bafed6005438", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a730bf98bb456962468bafed6005438");
            return;
        }
        if (!z) {
            if (this.f != null) {
                this.f.setVisibility(8);
            }
            if (this.g != null) {
                this.g.setVisibility(8);
            }
            if (this.h != null && this.j > 0 && this.k > 0) {
                ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
                if (layoutParams.width != this.j) {
                    layoutParams.width = this.j;
                }
                if (layoutParams.height != this.k) {
                    layoutParams.height = this.k;
                }
                this.h.setLayoutParams(layoutParams);
            }
        }
        if (this.x != null) {
            this.x.a(z);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.c
    public final void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db298f053d049829f667460cc4476a19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db298f053d049829f667460cc4476a19");
            return;
        }
        if (!z) {
            if (this.f != null) {
                this.f.setVisibility(8);
            }
            if (this.g != null) {
                this.g.setVisibility(8);
            }
            if (this.h != null && this.j > 0 && this.k > 0) {
                ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
                if (layoutParams.width != this.j) {
                    layoutParams.width = this.j;
                }
                if (layoutParams.height != this.k) {
                    layoutParams.height = this.k;
                }
                this.h.setLayoutParams(layoutParams);
            }
        }
        if (this.x != null) {
            this.x.a(z, str);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.a
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51b9c4c4775f82bd0adc29964617c12d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51b9c4c4775f82bd0adc29964617c12d");
            return;
        }
        this.y = f;
        if (this.f != null) {
            if (this.f.getVisibility() == 8) {
                this.f.setVisibility(0);
            }
            this.f.setAlpha(f);
        }
        if (this.g != null) {
            if (this.g.getVisibility() == 8) {
                this.g.setVisibility(0);
            }
            if (this.J) {
                this.L = 0;
                this.g.setAlpha(this.M * f);
            } else {
                this.g.setAlpha(f);
            }
        }
        a(f, true);
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4fd7b5c33dc50bef5e54347805a4684", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4fd7b5c33dc50bef5e54347805a4684");
        } else {
            this.b.au.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf((int) (this.q * f)));
        }
    }

    @Override // android.support.v7.widget.RecyclerView.k
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aad259dad01280cdd3dbedcb9cacedcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aad259dad01280cdd3dbedcb9cacedcd");
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (this.J) {
            this.L += i2;
            if (this.L > 100) {
                this.L = 100;
            }
            if (this.L >= 0) {
                this.g.setAlpha((float) (this.M + ((this.L / 100.0d) * (1.0d - this.M))));
            }
        }
    }

    void a(float f, boolean z) {
        boolean z2 = false;
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9867fc45153a0b46599a1e8d59163895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9867fc45153a0b46599a1e8d59163895");
            return;
        }
        if (this.h != null) {
            if (Float.compare(f, 0.5f) > 0) {
                ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
                float f2 = (f - 0.5f) * 2.0f;
                layoutParams.width = (int) (this.j - ((this.j - this.l) * f2));
                layoutParams.height = (int) (this.k - (f2 * (this.k - this.m)));
                this.h.setLayoutParams(layoutParams);
            }
            a(this.h, this.n - ((int) ((this.n - this.o) * f)));
        }
        if (!z || (this.h != null && this.h.getVisibility() == 0)) {
            z2 = true;
        }
        this.b.X.a((com.meituan.android.cube.pga.common.b<i.c<Float, Boolean>>) com.meituan.android.cube.pga.common.i.a(Float.valueOf(f), Boolean.valueOf(z2)));
    }

    void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d16ed73e5ab8a97aaa37d115c5cc072", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d16ed73e5ab8a97aaa37d115c5cc072");
        } else if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.requestLayout();
        }
    }

    static boolean b() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abf9a871f4b2834d70eae3ffb470d3fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abf9a871f4b2834d70eae3ffb470d3fd");
        } else if (this.z != null) {
            this.z.cancel();
            this.z = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "462395aae9ece4d5b01f8f66dc8d6d5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "462395aae9ece4d5b01f8f66dc8d6d5c");
            return;
        }
        this.I = com.sankuai.waimai.bussiness.order.detailnew.util.a.a(this.b.aj.a().b);
        this.H = com.sankuai.waimai.bussiness.order.detailnew.util.a.a(this.b.ak.a().b);
        if (a() && this.C && this.I && !this.G && !this.H && com.sankuai.waimai.bussiness.order.base.abtest.a.a()) {
            this.G = true;
            if (this.F == null) {
                this.F = new Handler(Looper.getMainLooper());
            }
            if (this.e != null) {
                this.e.setIgnoreScrollEvent(true);
            }
            this.F.postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.rocks.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    ValueAnimator valueAnimator;
                    ValueAnimator valueAnimator2;
                    ValueAnimator valueAnimator3;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7b8a785689937751393a3e6f54e056e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7b8a785689937751393a3e6f54e056e");
                        return;
                    }
                    b bVar = b.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "7f6ae1e9cc2de273cd72b508e5b3f8ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "7f6ae1e9cc2de273cd72b508e5b3f8ca");
                        return;
                    }
                    ValueAnimator valueAnimator4 = null;
                    if (bVar.e != null) {
                        valueAnimator = bVar.a(true, bVar.e, bVar.q);
                        valueAnimator2 = bVar.a(false, bVar.e, bVar.q);
                    } else {
                        valueAnimator = null;
                        valueAnimator2 = null;
                    }
                    if (bVar.h == null || bVar.h.getVisibility() != 0) {
                        valueAnimator3 = null;
                    } else {
                        valueAnimator4 = bVar.a(true, bVar.h, bVar.n);
                        valueAnimator3 = bVar.a(false, bVar.h, bVar.n);
                    }
                    if (valueAnimator != null && valueAnimator2 != null && valueAnimator4 != null && valueAnimator3 != null) {
                        bVar.B = bVar.b(true);
                        bVar.B.playTogether(valueAnimator, valueAnimator4);
                        bVar.B.play(valueAnimator2).with(valueAnimator3).after(valueAnimator).after(PayTask.j);
                    } else if (valueAnimator != null && valueAnimator2 != null) {
                        bVar.B = bVar.b(false);
                        bVar.B.play(valueAnimator2).after(valueAnimator).after(PayTask.j);
                    }
                    if (bVar.B != null) {
                        bVar.B.start();
                    }
                }
            }, 800L);
        }
    }

    AnimatorSet b(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0bacb7c2cb4c022d5c7e4bb1651f278", RobustBitConfig.DEFAULT_VALUE)) {
            return (AnimatorSet) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0bacb7c2cb4c022d5c7e4bb1651f278");
        }
        final AnimatorSet animatorSet = new AnimatorSet();
        this.e.setCanIntercepter(true);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.bussiness.order.rocks.b.3
            public static ChangeQuickRedirect a;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14d6bd40ef10e32ab3cfb12c7cf2845a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14d6bd40ef10e32ab3cfb12c7cf2845a");
                } else {
                    b.this.A = true;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5491aa3e395ae8f85de1e5a5e475d9b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5491aa3e395ae8f85de1e5a5e475d9b");
                    return;
                }
                b.this.A = false;
                b.this.e.setIgnoreScrollEvent(false);
                animatorSet.removeListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea57908573610d202998b9d0f00b357d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea57908573610d202998b9d0f00b357d");
                    return;
                }
                if (z && b.this.h != null && b.this.h.getVisibility() == 0) {
                    b.this.h.setTranslationY(0.0f);
                }
                if (b.this.e != null) {
                    b.this.e.setTranslationY(0.0f);
                }
            }
        });
        return animatorSet;
    }

    ValueAnimator a(boolean z, final View view, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39a42b0cdc61f6aafddf7d647a6da4c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ValueAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39a42b0cdc61f6aafddf7d647a6da4c0");
        }
        if (view == null) {
            return null;
        }
        final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int a2 = com.sankuai.waimai.foundation.utils.g.a(this.i, 200.0f);
            ValueAnimator ofInt = z ? ValueAnimator.ofInt(i, i - a2) : ValueAnimator.ofInt(i - a2, i);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.bussiness.order.rocks.b.4
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95cff61719da44fa025ecfdd679dc865", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95cff61719da44fa025ecfdd679dc865");
                        return;
                    }
                    marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.setLayoutParams(layoutParams);
                }
            });
            ofInt.setInterpolator(new OvershootInterpolator());
            ofInt.setDuration(700L);
            return ofInt;
        }
        return null;
    }
}
