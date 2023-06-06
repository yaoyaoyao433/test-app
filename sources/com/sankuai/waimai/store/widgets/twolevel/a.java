package com.sankuai.waimai.store.widgets.twolevel;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.CountDownTimer;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.e;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.RequestListener;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    SGRefreshHeaderHelper.d.a A;
    public int B;
    public SGRefreshHeaderHelper.b C;
    public SGRefreshHeaderHelper.d D;
    public SGRefreshHeaderHelper.a E;
    private final int F;
    private FrameLayout G;
    private TextView H;
    public Fragment b;
    public SGRefreshHeaderHelper c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public FrameLayout j;
    public FrameLayout k;
    ImageView l;
    ImageView m;
    public LinearLayout n;
    public CountDownTimer o;
    public int p;
    public SGTwoLevelPullRefreshHeader q;
    protected PoiPageViewModel r;
    boolean s;
    public b t;
    boolean u;
    boolean v;
    boolean w;
    PoiVerticalityDataResponse.SecondFloor x;
    c y;
    int z;

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "227fd8a75c985e3ce0c320328143beee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "227fd8a75c985e3ce0c320328143beee");
            return;
        }
        if (aVar.A != null) {
            aVar.A.a();
        }
        aVar.a();
    }

    public static /* synthetic */ void b(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "062c8fdf00c3e0ba7e7641108cc94a08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "062c8fdf00c3e0ba7e7641108cc94a08");
            return;
        }
        u.b(aVar.l);
        u.a(aVar.m);
    }

    public a(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "220d28e4c05838354cf8f3ecdddb8878", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "220d28e4c05838354cf8f3ecdddb8878");
            return;
        }
        this.d = 0;
        this.g = g.a(com.meituan.android.singleton.b.a);
        this.h = 0;
        this.F = g.b(com.meituan.android.singleton.b.a);
        this.i = 0;
        this.s = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.y = null;
        this.z = 1;
        this.B = 0;
        this.C = new SGRefreshHeaderHelper.b() { // from class: com.sankuai.waimai.store.widgets.twolevel.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void c() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void d() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4058e3b8600d29dd3aca7d3c5850c20b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4058e3b8600d29dd3aca7d3c5850c20b");
                    return;
                }
                a aVar = a.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c8ad73a2c54c25b7853a31d5049ba952", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c8ad73a2c54c25b7853a31d5049ba952");
                } else if (aVar.b == null || f.a(aVar.b.getActivity()) || aVar.c == null || aVar.s || aVar.y == null || aVar.y.a == null || aVar.y.b == null || t.a(aVar.y.a.activityPic)) {
                } else {
                    RequestCreator b = Picasso.g(aVar.b.getActivity()).d(aVar.y.a.activityPic).b();
                    b.k = DiskCacheStrategy.SOURCE;
                    b.a(aVar.m);
                    aVar.s = true;
                }
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb99c39e6a4811820ff26af08fa5a712", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb99c39e6a4811820ff26af08fa5a712");
                    return;
                }
                a aVar = a.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "65039664b7fb172c0d76f67e0e168f91", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "65039664b7fb172c0d76f67e0e168f91");
                } else if (aVar.b == null || aVar.b.getView() == null || aVar.b.getActivity() == null || aVar.b.getActivity().isFinishing()) {
                } else {
                    if (aVar.s) {
                        if (aVar.m != null) {
                            Picasso.g(aVar.b.getActivity()).a((Object) null).a(aVar.m);
                        }
                        aVar.s = false;
                    }
                    if (aVar.l != null) {
                        Picasso.g(aVar.b.getActivity()).a((Object) null).a(aVar.l);
                    }
                    aVar.a(false, "");
                }
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "302357cc53408bcef349d72243ed28c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "302357cc53408bcef349d72243ed28c3");
                } else if (a.this.y == null || a.this.y.a == null || a.this.y.b == null || t.a(a.this.y.a.activityPic)) {
                } else {
                    switch (i) {
                        case 0:
                            a.this.u = false;
                            a.this.v = false;
                            a.this.w = false;
                            return;
                        case 1:
                            a.this.a(true, a.this.y.a.beginText);
                            if (a.this.u || a.this.t == null || a.this.x == null) {
                                return;
                            }
                            b bVar = a.this.t;
                            PoiVerticalityDataResponse.SecondFloor secondFloor = a.this.x;
                            Object[] objArr3 = {secondFloor};
                            ChangeQuickRedirect changeQuickRedirect3 = b.a;
                            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "62beb4baa899b7dfd3edf7608e6c7ed9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "62beb4baa899b7dfd3edf7608e6c7ed9");
                            } else {
                                bVar.a("b_waimai_01uv0heq_mv", bVar.c, bVar.b, bVar.a(secondFloor));
                            }
                            a.this.u = true;
                            return;
                        case 2:
                            if (!a.this.v && a.this.t != null && a.this.x != null) {
                                b bVar2 = a.this.t;
                                PoiVerticalityDataResponse.SecondFloor secondFloor2 = a.this.x;
                                Object[] objArr4 = {secondFloor2};
                                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                                if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "13d393a99f772ff1610d2ba0f08a0fe9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "13d393a99f772ff1610d2ba0f08a0fe9");
                                } else {
                                    bVar2.a("b_waimai_2go783vp_mv", bVar2.c, bVar2.b, bVar2.a(secondFloor2));
                                }
                                a.this.v = true;
                            }
                            a.this.a(false, a.this.y.a.middleText);
                            return;
                        case 3:
                            if (!a.this.w && a.this.t != null && a.this.x != null) {
                                b bVar3 = a.this.t;
                                PoiVerticalityDataResponse.SecondFloor secondFloor3 = a.this.x;
                                Object[] objArr5 = {secondFloor3};
                                ChangeQuickRedirect changeQuickRedirect5 = b.a;
                                if (PatchProxy.isSupport(objArr5, bVar3, changeQuickRedirect5, false, "c92eb96adb70c60a23c814898720eed9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, bVar3, changeQuickRedirect5, false, "c92eb96adb70c60a23c814898720eed9");
                                } else {
                                    bVar3.a("b_waimai_ounas0lx_mv", bVar3.c, bVar3.b, bVar3.a(secondFloor3));
                                }
                                a.this.w = true;
                            }
                            a.this.a(false, a.this.y.a.endText);
                            return;
                        case 4:
                        default:
                            return;
                        case 5:
                            if (a.this.t != null && a.this.x != null) {
                                b bVar4 = a.this.t;
                                PoiVerticalityDataResponse.SecondFloor secondFloor4 = a.this.x;
                                Object[] objArr6 = {secondFloor4};
                                ChangeQuickRedirect changeQuickRedirect6 = b.a;
                                if (PatchProxy.isSupport(objArr6, bVar4, changeQuickRedirect6, false, "08c6dd473c1138c7b72961d4c2dde69f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, bVar4, changeQuickRedirect6, false, "08c6dd473c1138c7b72961d4c2dde69f");
                                } else {
                                    bVar4.a("b_waimai_7cxsekya_mv", bVar4.c, bVar4.b, bVar4.a(secondFloor4));
                                }
                                b bVar5 = a.this.t;
                                PoiVerticalityDataResponse.SecondFloor secondFloor5 = a.this.x;
                                Object[] objArr7 = {secondFloor5};
                                ChangeQuickRedirect changeQuickRedirect7 = b.a;
                                if (PatchProxy.isSupport(objArr7, bVar5, changeQuickRedirect7, false, "3fc757ae932998dcfaa24be52adf3577", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, bVar5, changeQuickRedirect7, false, "3fc757ae932998dcfaa24be52adf3577");
                                } else {
                                    bVar5.a("b_waimai_sj5422c5_mv", bVar5.c, bVar5.b, bVar5.a(secondFloor5));
                                }
                            }
                            a.this.a(false, "");
                            return;
                        case 6:
                            a.this.a(false, "");
                            return;
                    }
                }
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a(int i, float f, int i2, int i3, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f800179b0da2c6238a3558abee6ba30f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f800179b0da2c6238a3558abee6ba30f");
                } else {
                    a.this.a(i, f, i2);
                }
            }
        };
        this.D = new SGRefreshHeaderHelper.d() { // from class: com.sankuai.waimai.store.widgets.twolevel.a.3
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r6v1, types: [com.sankuai.waimai.store.widgets.twolevel.a$3$1] */
            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.d
            public final void a(SGRefreshHeaderHelper.d.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cdba223e485e8fb15ddf9edf1b901ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cdba223e485e8fb15ddf9edf1b901ab");
                    return;
                }
                a.this.A = aVar;
                a.this.n.setVisibility(0);
                if (a.this.o != null) {
                    a.this.o.cancel();
                    a.this.o = null;
                }
                a.this.o = new CountDownTimer(a.this.z * 1000, 1000L) { // from class: com.sankuai.waimai.store.widgets.twolevel.a.3.1
                    public static ChangeQuickRedirect a;

                    @Override // android.os.CountDownTimer
                    public final void onTick(long j) {
                    }

                    @Override // android.os.CountDownTimer
                    public final void onFinish() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a27ca9ebc40fb68be9bc8b30fb349faf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a27ca9ebc40fb68be9bc8b30fb349faf");
                        } else {
                            a.a(a.this);
                        }
                    }
                }.start();
            }
        };
        this.E = new SGRefreshHeaderHelper.a() { // from class: com.sankuai.waimai.store.widgets.twolevel.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "723cc0daf607dab58680382b4e29c228", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "723cc0daf607dab58680382b4e29c228");
                    return;
                }
                a aVar = a.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "089e8d22456868cc7674bc58b8bc46dd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "089e8d22456868cc7674bc58b8bc46dd");
                    return;
                }
                u.b(aVar.m);
                u.a(aVar.l);
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f560609fdc92ec4f852b31cb6f8300ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f560609fdc92ec4f852b31cb6f8300ff");
                    return;
                }
                a.b(a.this);
                a.this.a(false, "");
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf2ba3fdf688eed110543116e961d099", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf2ba3fdf688eed110543116e961d099");
                } else {
                    a.b(a.this);
                }
            }
        };
        this.b = fragment;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af99a2bacf926d9337ddd172f5f987f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af99a2bacf926d9337ddd172f5f987f2");
            return;
        }
        if (this.A != null) {
            this.A = null;
        }
        if (this.o != null) {
            this.o.cancel();
            this.o = null;
        }
    }

    public void a(int i, float f, int i2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c39e750c3fc792ea4f74e4c27c41418c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c39e750c3fc792ea4f74e4c27c41418c");
        } else if (this.j == null || this.m == null) {
        } else {
            int i3 = ((-this.e) - this.i) + i;
            if (i2 == 4) {
                i3 = (-this.e) + this.h + i;
            }
            this.j.setY(i3);
            this.j.setAlpha(f);
            this.m.setY((-i3) - ((this.B / 2) - (i / 2)));
        }
    }

    void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b8b3ef98ffe0c7e87c88bf5176c345", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b8b3ef98ffe0c7e87c88bf5176c345");
            return;
        }
        if (z) {
            u.a(this.H);
        } else {
            u.b(this.H);
        }
        if (t.a(str)) {
            u.b(this.H);
        } else {
            u.a(this.H, str);
        }
    }

    public final void a(final SGRefreshHeaderHelper.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26388aef1c732c4f014d96f352ce255", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26388aef1c732c4f014d96f352ce255");
        } else if (this.b == null || f.a(this.b.getActivity()) || this.c == null) {
        } else {
            c a2 = (this.r == null || this.r.j == null) ? null : this.r.j.a();
            if (a2 == null || a2.a == null || a2.b == null || t.a(a2.a.activityPic)) {
                return;
            }
            this.p = this.F;
            this.l.setY(this.e / 2);
            RequestCreator b = Picasso.g(this.b.getActivity()).d(a2.a.activityPic).b();
            b.k = DiskCacheStrategy.SOURCE;
            b.s = new RequestListener() { // from class: com.sankuai.waimai.store.widgets.twolevel.a.5
                @Override // com.squareup.picasso.RequestListener
                public final boolean a(Exception exc, Object obj, boolean z) {
                    return false;
                }

                @Override // com.squareup.picasso.RequestListener
                public final boolean a(Object obj, Object obj2, boolean z, boolean z2) {
                    return false;
                }
            };
            b.a(this.l);
            a(true, a2.a.tips);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6546c3e135f246047060212c0c0e1eb0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6546c3e135f246047060212c0c0e1eb0");
            } else if (this.m != null) {
                this.m.setOnClickListener(null);
            }
            Object[] objArr3 = {1300L, cVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ed84500c2476159202befa01551ffb01", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ed84500c2476159202befa01551ffb01");
                return;
            }
            final SGRefreshHeaderHelper sGRefreshHeaderHelper = this.c;
            Object[] objArr4 = {cVar, new Long(1300L)};
            ChangeQuickRedirect changeQuickRedirect4 = SGRefreshHeaderHelper.a;
            if (PatchProxy.isSupport(objArr4, sGRefreshHeaderHelper, changeQuickRedirect4, false, "045da04033e42d4e4ed9f268ae29f91c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, sGRefreshHeaderHelper, changeQuickRedirect4, false, "045da04033e42d4e4ed9f268ae29f91c");
            } else if (sGRefreshHeaderHelper.r == 0 && sGRefreshHeaderHelper.c() && sGRefreshHeaderHelper.l > 0) {
                if (sGRefreshHeaderHelper.u != null && sGRefreshHeaderHelper.u.isRunning()) {
                    sGRefreshHeaderHelper.u.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofInt(0, sGRefreshHeaderHelper.l).setDuration(SGRefreshHeaderHelper.o);
                ValueAnimator duration2 = ValueAnimator.ofInt(sGRefreshHeaderHelper.l, 0).setDuration(SGRefreshHeaderHelper.o);
                duration.addUpdateListener(sGRefreshHeaderHelper.C);
                duration2.addUpdateListener(sGRefreshHeaderHelper.C);
                duration2.setStartDelay(1300 - SGRefreshHeaderHelper.o);
                duration.addListener(new com.sankuai.waimai.store.newwidgets.twolevel.a() { // from class: com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.8
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.newwidgets.twolevel.a, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        Object[] objArr5 = {animator};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0df2d20c831599cd4c622fae489533f9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0df2d20c831599cd4c622fae489533f9");
                            return;
                        }
                        if (sGRefreshHeaderHelper.A != null) {
                            sGRefreshHeaderHelper.A.a();
                        }
                        sGRefreshHeaderHelper.I = true;
                        sGRefreshHeaderHelper.r = 9;
                        sGRefreshHeaderHelper.b(sGRefreshHeaderHelper.r);
                    }
                });
                duration2.addListener(new com.sankuai.waimai.store.newwidgets.twolevel.a() { // from class: com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.9
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.newwidgets.twolevel.a, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        Object[] objArr5 = {animator};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b0f01f28d764a5dbf64d18f90a60c893", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b0f01f28d764a5dbf64d18f90a60c893");
                        } else {
                            sGRefreshHeaderHelper.I = false;
                        }
                    }

                    @Override // com.sankuai.waimai.store.newwidgets.twolevel.a, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        Object[] objArr5 = {animator};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "32f24954a7594fd01c2c6a21b29144dc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "32f24954a7594fd01c2c6a21b29144dc");
                            return;
                        }
                        if (sGRefreshHeaderHelper.A != null) {
                            sGRefreshHeaderHelper.A.b();
                        }
                        sGRefreshHeaderHelper.d();
                    }

                    @Override // com.sankuai.waimai.store.newwidgets.twolevel.a, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        Object[] objArr5 = {animator};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ff55763710682429d5d274b00446bc19", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ff55763710682429d5d274b00446bc19");
                        } else {
                            sGRefreshHeaderHelper.d();
                        }
                    }
                });
                sGRefreshHeaderHelper.u = new AnimatorSet();
                sGRefreshHeaderHelper.u.play(duration2).after(duration);
                sGRefreshHeaderHelper.u.start();
                if (cVar != null) {
                    cVar.a();
                }
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f0c50d35620d85fcf325e0dc9811579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f0c50d35620d85fcf325e0dc9811579");
            return;
        }
        if (this.c != null) {
            this.c.b();
        }
        if (this.r != null) {
            this.r.a(null);
        }
        if (this.o != null) {
            this.o.cancel();
            this.o = null;
        }
    }

    public final void a(View view, PoiPageViewModel poiPageViewModel) {
        Object[] objArr = {view, poiPageViewModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9114fe0516dec0fd02d2c099901676a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9114fe0516dec0fd02d2c099901676a2");
            return;
        }
        this.f = g.e(com.meituan.android.singleton.b.a);
        this.j = (FrameLayout) view.findViewById(R.id.fl_sg_two_level);
        this.k = (FrameLayout) view.findViewById(R.id.fl_sc_two_level_container);
        this.H = (TextView) view.findViewById(R.id.tv_sc_refresh_des);
        this.l = (ImageView) view.findViewById(R.id.sg_second_floor_guide_img);
        this.m = (ImageView) view.findViewById(R.id.sc_second_floor_bg_img);
        this.n = (LinearLayout) view.findViewById(R.id.sc_second_floor_skip_rl);
        this.q = (SGTwoLevelPullRefreshHeader) view.findViewById(R.id.sg_two_level_pull_fresh_header);
        this.G = (FrameLayout) view.findViewById(R.id.ll_sc_two_bottom_hint);
        this.G.setBackground(e.b(view.getContext(), new int[]{R.color.wm_st_common_00000000, R.color.wm_st_common_80000000}, (int) R.dimen.wm_sc_common_dimen_0));
        this.n.setBackground(e.b(view.getContext(), (int) R.color.wm_st_common_33000000, (int) R.dimen.wm_sc_common_dimen_12));
        this.r = poiPageViewModel;
        if (this.r == null || this.r.j == null) {
            return;
        }
        this.y = this.r.j.a();
        if (this.y != null) {
            this.x = this.y.a;
            this.z = this.y.c;
        }
    }
}
