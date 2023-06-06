package com.sankuai.waimai.business.page.home.widget.twolevel;

import android.app.Activity;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.actionbar.HomeActionBarViewModel;
import com.sankuai.waimai.business.page.home.gray.HomeGrayManager;
import com.sankuai.waimai.business.page.home.model.HomeSecondFloorResponse;
import com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.RequestListener;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private int A;
    private int B;
    private FrameLayout C;
    private CurveFrameLayout D;
    private ImageView E;
    private int F;
    private RefreshHeaderPlaceHolder G;
    private int H;
    private int I;
    private int J;
    private int K;
    private final int L;
    private RefreshHeaderHelper.c M;
    private final RefreshHeaderHelper.d N;
    private final com.sankuai.waimai.business.page.home.widget.twolevel.a O;
    boolean b;
    int c;
    public TextView d;
    TextView e;
    RelativeLayout f;
    public CountDownTimer g;
    RefreshHeaderHelper.d.a h;
    ImageView i;
    ImageView j;
    public ImageView k;
    public TextView l;
    public RefreshHeaderHelper m;
    int n;
    int o;
    public SecondFloorViewModel p;
    HomeActionBarViewModel q;
    boolean r;
    public PageFragment s;
    Runnable t;
    boolean u;
    HomeSecondFloorResponse v;
    private int w;
    private int x;
    private final int y;
    private final int z;

    public static /* synthetic */ void a(c cVar) {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "be22dec736114c2c6e2cb85716f44545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "be22dec736114c2c6e2cb85716f44545");
        } else if (cVar.u || cVar.v == null) {
        } else {
            if (cVar.v.shouldDisplayEffectPic() && cVar.j == null) {
                z = true;
            }
            if (z || cVar.i == null || !cVar.v.isResourceReady() || cVar.s == null || cVar.s.getView() == null || cVar.s.getActivity() == null || cVar.s.getActivity().isFinishing()) {
                return;
            }
            if (cVar.v.shouldDisplayEffectPic()) {
                RequestCreator b = Picasso.g(cVar.s.getActivity()).d(cVar.v.homeSecondFloorData.resource.view.getCdnEffectPic()).b();
                b.k = DiskCacheStrategy.SOURCE;
                b.a(cVar.j);
            }
            RequestCreator b2 = Picasso.g(cVar.s.getActivity()).d(cVar.v.homeSecondFloorData.resource.view.getCdnBgPic()).b();
            b2.k = DiskCacheStrategy.SOURCE;
            b2.a(cVar.i);
            cVar.u = true;
        }
    }

    public static /* synthetic */ void a(c cVar, HomeSecondFloorResponse homeSecondFloorResponse) {
        Object[] objArr = {homeSecondFloorResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "a0d071198062a051909a3da59a032e80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "a0d071198062a051909a3da59a032e80");
            return;
        }
        cVar.v = homeSecondFloorResponse;
        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "更新二楼状态 UI:" + homeSecondFloorResponse, new Object[0]);
        if (cVar.s == null || cVar.s.getView() == null || cVar.s.getActivity() == null || cVar.s.getActivity().isFinishing()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = cVar.C.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        cVar.n = cVar.q.c();
        cVar.o = cVar.q.b();
        String str = cVar.q.p;
        cVar.f.setVisibility(4);
        cVar.c();
        if (homeSecondFloorResponse != null && homeSecondFloorResponse.isResourceReady()) {
            cVar.w = 1;
            cVar.D.setVisibility(0);
            cVar.D.setShouldDrawCurve(homeSecondFloorResponse.isShouldDrawCurve() && cVar.r);
            cVar.d.setVisibility(0);
            cVar.d.setText("");
            cVar.E.setVisibility(4);
            cVar.A = cVar.a(cVar.b);
            cVar.A += cVar.b();
            ah.a(cVar.D, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, cVar.A);
            ah.a(cVar.l, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, (cVar.n - cVar.A) + g.a(com.meituan.android.singleton.b.a, 10.0f));
            if (homeSecondFloorResponse.bgPicSize.getWidth() > 0) {
                cVar.H = ((int) (cVar.K * ((homeSecondFloorResponse.bgPicSize.getHeight() * 1.0f) / homeSecondFloorResponse.bgPicSize.getWidth()))) + cVar.A;
            }
            if (homeSecondFloorResponse.shouldDisplayEffectPic()) {
                ViewGroup.LayoutParams layoutParams3 = cVar.j.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                if (homeSecondFloorResponse.effectPicSize.getWidth() > 0) {
                    layoutParams3.width = cVar.K;
                    float height = (homeSecondFloorResponse.effectPicSize.getHeight() * 1.0f) / homeSecondFloorResponse.effectPicSize.getWidth();
                    layoutParams3.height = (int) (cVar.K * height);
                    cVar.j.setLayoutParams(layoutParams3);
                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "调整效果图 EffectView 宽高，  width: " + layoutParams3.width + " height: " + layoutParams3.height + " effect ratio:" + height, new Object[0]);
                }
                cVar.a(0);
            }
            cVar.a(homeSecondFloorResponse);
            if (homeSecondFloorResponse.isMiddleOrBottomShowType()) {
                cVar.f.setVisibility(0);
                cVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.c.5
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff56cb9ed7c70e49125d81398166fceb", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff56cb9ed7c70e49125d81398166fceb");
                        } else {
                            c.b(c.this);
                        }
                    }
                });
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cVar.f.getLayoutParams();
                marginLayoutParams.bottomMargin = (((cVar.L * 9) / 10) - marginLayoutParams.height) + cVar.x;
                cVar.f.setLayoutParams(marginLayoutParams);
            }
        } else {
            cVar.w = 0;
            cVar.D.setShouldDrawCurve(false);
            cVar.D.setVisibility(4);
            cVar.d.setVisibility(4);
            cVar.E.setVisibility(0);
            if (cVar.E.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) cVar.E.getLayoutParams();
                cVar.A = cVar.a(cVar.b);
                cVar.A += cVar.b();
                marginLayoutParams2.bottomMargin = cVar.A;
                cVar.E.setLayoutParams(marginLayoutParams2);
            }
            cVar.H = cVar.L;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "4ede62999c9a28fabcc7aee0e8f4facb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "4ede62999c9a28fabcc7aee0e8f4facb");
            } else if (cVar.E != null && cVar.s != null && cVar.s.getActivity() != null && !TextUtils.isEmpty(str)) {
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = cVar.s;
                a2.c = str;
                a2.i = R.drawable.wm_page_refresh_header_bg;
                a2.f = ImageQualityUtil.a(2);
                a2.a(cVar.E);
            }
        }
        layoutParams2.width = cVar.K;
        layoutParams2.height = cVar.H;
        cVar.C.setLayoutParams(layoutParams2);
        if (cVar.G.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) cVar.G.getLayoutParams();
            marginLayoutParams3.bottomMargin = cVar.n;
            marginLayoutParams3.bottomMargin += cVar.b();
            cVar.G.setLayoutParams(marginLayoutParams3);
        }
        if (cVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) cVar.d.getLayoutParams();
            marginLayoutParams4.bottomMargin = (cVar.n + cVar.G.getHeight()) - cVar.c;
            marginLayoutParams4.bottomMargin += cVar.b();
            cVar.d.setLayoutParams(marginLayoutParams4);
        }
        cVar.J = ((cVar.s == null || cVar.s.getActivity() == null) ? true : com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) cVar.s.getActivity()) ? cVar.I + cVar.o : cVar.o) + cVar.n;
        cVar.a(0, 0.0f);
        int i = cVar.n;
        int i2 = cVar.o;
        Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "a66da18a0cfb6a8b96c295836b79c3d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "a66da18a0cfb6a8b96c295836b79c3d6");
        } else if (cVar.m != null) {
            cVar.m.l = (g.b(com.meituan.android.singleton.b.a) - i2) + cVar.x;
            cVar.m.B = i;
            cVar.m.A = i2;
            cVar.m.z = cVar.I;
            cVar.m.C = cVar.F;
            cVar.m.D = cVar.A;
            RefreshHeaderHelper refreshHeaderHelper = cVar.m;
            int i3 = cVar.w;
            Object[] objArr4 = {Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect4 = RefreshHeaderHelper.a;
            if (PatchProxy.isSupport(objArr4, refreshHeaderHelper, changeQuickRedirect4, false, "b005307a023d5d453f5a097df3822784", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, refreshHeaderHelper, changeQuickRedirect4, false, "b005307a023d5d453f5a097df3822784");
            } else {
                refreshHeaderHelper.j = i3;
                int i4 = refreshHeaderHelper.z + refreshHeaderHelper.A + refreshHeaderHelper.B;
                if (RefreshHeaderHelper.c > i4) {
                    refreshHeaderHelper.g = RefreshHeaderHelper.c - i4;
                    refreshHeaderHelper.h = RefreshHeaderHelper.d - i4;
                    if (i3 == 1) {
                        refreshHeaderHelper.i = RefreshHeaderHelper.e - i4;
                    } else {
                        refreshHeaderHelper.i = RefreshHeaderHelper.d - i4;
                    }
                    refreshHeaderHelper.m = (RefreshHeaderHelper.f - refreshHeaderHelper.z) - refreshHeaderHelper.A;
                    refreshHeaderHelper.n = ((refreshHeaderHelper.C - refreshHeaderHelper.z) - refreshHeaderHelper.A) - (refreshHeaderHelper.B - refreshHeaderHelper.D);
                } else {
                    refreshHeaderHelper.g = g.a(com.meituan.android.singleton.b.a, 60.0f);
                    refreshHeaderHelper.h = g.a(com.meituan.android.singleton.b.a, 140.0f);
                    if (i3 == 1) {
                        refreshHeaderHelper.i = g.a(com.meituan.android.singleton.b.a, 620.0f);
                    } else {
                        refreshHeaderHelper.i = refreshHeaderHelper.h;
                    }
                }
            }
            cVar.m.a(cVar.M);
            if (cVar.G != null) {
                cVar.m.a(cVar.G.getOnSecondLevelListener());
            }
            cVar.m.E = cVar.N;
            cVar.m.I = cVar.O;
        }
    }

    public static /* synthetic */ void b(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "17f5045d0dd5e0abce322de222c64a54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "17f5045d0dd5e0abce322de222c64a54");
            return;
        }
        if (cVar.h != null) {
            cVar.h.a();
        }
        cVar.c();
    }

    public static /* synthetic */ void c(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "e0a5a92af03a38a54dfaebc8e8c4bbdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "e0a5a92af03a38a54dfaebc8e8c4bbdf");
            return;
        }
        if (cVar.d != null) {
            cVar.d.setVisibility(4);
        }
        if (cVar.j != null) {
            cVar.j.setVisibility(4);
        }
        if (cVar.i != null) {
            cVar.i.setVisibility(4);
        }
        if (cVar.k != null) {
            cVar.k.setVisibility(0);
        }
    }

    public static /* synthetic */ void d(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "ff576ccecdbbafe1a19a005102375d28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "ff576ccecdbbafe1a19a005102375d28");
            return;
        }
        if (cVar.d != null) {
            cVar.d.setVisibility(0);
        }
        if (cVar.j != null) {
            cVar.j.setVisibility(0);
        }
        if (cVar.i != null) {
            cVar.i.setVisibility(0);
        }
        if (cVar.k != null) {
            cVar.k.setVisibility(4);
        }
        if (cVar.l != null) {
            cVar.l.setVisibility(4);
        }
    }

    public c(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3591022cebb618ae5b390bebffdf430a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3591022cebb618ae5b390bebffdf430a");
            return;
        }
        this.w = 0;
        this.x = g.a(com.meituan.android.singleton.b.a, 40.0f);
        this.y = g.a(com.meituan.android.singleton.b.a, 10.0f);
        this.z = g.a(com.meituan.android.singleton.b.a, 6.0f);
        this.b = false;
        this.B = g.a(com.meituan.android.singleton.b.a, 90.0f);
        this.c = com.sankuai.waimai.foundation.core.a.d() ? g.a(com.meituan.android.singleton.b.a, 25.0f) : 0;
        this.K = g.a(com.meituan.android.singleton.b.a);
        this.L = g.b(com.meituan.android.singleton.b.a);
        this.M = new RefreshHeaderHelper.a() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void a(int i, float f, int i2, int i3, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bd9567752668452305306e6276cdfe4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bd9567752668452305306e6276cdfe4");
                    return;
                }
                super.a(i, f, i2, i3, z);
                c.this.a(i, f);
                if (c.this.v != null && c.this.v.shouldDisplayEffectPic()) {
                    c.this.a(i);
                }
                if (i == 0) {
                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorBlock", "onScroll offset == 0", new Object[0]);
                }
            }

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f7f597eff13a2e251cb0971533457b0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f7f597eff13a2e251cb0971533457b0");
                    return;
                }
                super.a();
                c.a(c.this);
                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorBlock", "startPull", new Object[0]);
                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor----", "startPull", new Object[0]);
            }

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9ef4277083917460769cab2af0575b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9ef4277083917460769cab2af0575b2");
                    return;
                }
                super.c();
                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorBlock", "reset", new Object[0]);
                if (c.this.t != null) {
                    c.this.t.run();
                    c.this.t = null;
                }
                if (c.this.v != null && c.this.v.shouldDisplayEffectPic()) {
                    c.this.a(0);
                }
                c cVar = c.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "1e23dae28acac83d1686b14a558e9240", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "1e23dae28acac83d1686b14a558e9240");
                } else if (cVar.s == null || cVar.s.getView() == null || cVar.s.getActivity() == null || cVar.s.getActivity().isFinishing() || !cVar.u) {
                } else {
                    if (cVar.j != null) {
                        Picasso.g(cVar.s.getActivity()).a((Object) null).a(cVar.j);
                    }
                    if (cVar.i != null) {
                        Picasso.g(cVar.s.getActivity()).a((Object) null).a(cVar.i);
                    }
                    cVar.u = false;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x009b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(int r12) {
                /*
                    Method dump skipped, instructions count: 240
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.widget.twolevel.c.AnonymousClass1.a(int):void");
            }

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a421c451d1af79e9ec329b4ca701acef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a421c451d1af79e9ec329b4ca701acef");
                } else {
                    super.d();
                }
            }
        };
        this.N = new RefreshHeaderHelper.d() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.c.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r6v1, types: [com.sankuai.waimai.business.page.home.widget.twolevel.c$2$1] */
            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.d
            public final void a(RefreshHeaderHelper.d.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8369481dc28d7250b5790434af6b325d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8369481dc28d7250b5790434af6b325d");
                } else if (c.this.v == null || !c.this.v.isMiddleOrBottomShowType()) {
                    aVar.a();
                    c.this.f.setVisibility(4);
                    c.b(c.this);
                } else {
                    c.this.h = aVar;
                    c.this.f.setVisibility(0);
                    if (c.this.g != null) {
                        c.this.g.cancel();
                        c.this.g = null;
                    }
                    TextView textView = c.this.e;
                    StringBuilder sb = new StringBuilder();
                    sb.append(3);
                    textView.setText(sb.toString());
                    c.this.g = new CountDownTimer(PayTask.j, 1000L) { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.c.2.1
                        public static ChangeQuickRedirect a;

                        {
                            super(PayTask.j, 1000L);
                        }

                        @Override // android.os.CountDownTimer
                        public final void onTick(long j) {
                            Object[] objArr3 = {new Long(j)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5e70fa62285cfb5e061849aefe476180", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5e70fa62285cfb5e061849aefe476180");
                                return;
                            }
                            TextView textView2 = c.this.e;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((j / 1000) + 1);
                            textView2.setText(sb2.toString());
                        }

                        @Override // android.os.CountDownTimer
                        public final void onFinish() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c8bc5c127b1d15cd48eb4a9739c10b99", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c8bc5c127b1d15cd48eb4a9739c10b99");
                                return;
                            }
                            c.this.e.setText("0");
                            c.b(c.this);
                        }
                    }.start();
                }
            }
        };
        this.u = false;
        this.O = new com.sankuai.waimai.business.page.home.widget.twolevel.a() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.c.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "106f632c3044ba8712fa0a397eed26d9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "106f632c3044ba8712fa0a397eed26d9");
                    return;
                }
                c.c(c.this);
                if (c.this.l != null) {
                    c.this.l.setVisibility(8);
                }
            }

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9e69a2cad41d9223261ba8810333a11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9e69a2cad41d9223261ba8810333a11");
                    return;
                }
                c.a(c.this);
                c.c(c.this);
                if (c.this.l != null) {
                    c.this.l.setVisibility(0);
                }
            }

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab8022b3d76053faad09f2ffab324755", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab8022b3d76053faad09f2ffab324755");
                } else {
                    c.d(c.this);
                }
            }

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.a
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e803b315cec0986c477b51be7df89265", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e803b315cec0986c477b51be7df89265");
                } else {
                    c.d(c.this);
                }
            }
        };
        this.s = pageFragment;
        Object[] objArr2 = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba292367fe6edd08d3173eece6ec6b4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba292367fe6edd08d3173eece6ec6b4d");
            return;
        }
        this.p = (SecondFloorViewModel) q.a(pageFragment).a(SecondFloorViewModel.class);
        this.q = (HomeActionBarViewModel) q.a(pageFragment).a(HomeActionBarViewModel.class);
    }

    private int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "628f90798bd682199c0ebad07f73f4f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "628f90798bd682199c0ebad07f73f4f1")).intValue();
        }
        if (this.r) {
            return this.y;
        }
        if (this.b) {
            return this.z;
        }
        return 0;
    }

    private int a(boolean z) {
        if (!z) {
            return this.n - this.x;
        }
        return this.n;
    }

    void a(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb8a21add1ea3ab3895ae96634c859ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb8a21add1ea3ab3895ae96634c859ef");
        } else if (this.C == null || this.i == null) {
        } else {
            int i2 = (-this.H) + this.J + i;
            this.C.setY(i2);
            this.C.setAlpha(f);
            if (this.v == null || !this.v.isResourceReady()) {
                return;
            }
            boolean z = this.v.homeSecondFloorData.resource.view.showType == 2;
            if (z) {
                this.i.setY((-i2) - ((this.H / 2) - ((this.J + i) / 2)));
            } else {
                this.i.setY(0.0f);
            }
            if (!this.v.isMiddleOrBottomShowType() || this.b || i <= this.L / 2) {
                return;
            }
            this.C.setY(i2 - this.x);
            if (z) {
                this.i.setTranslationY(this.i.getY() + (this.x / 2.0f));
            }
        }
    }

    void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32429a7769291b0ba9db826388a57d58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32429a7769291b0ba9db826388a57d58");
        } else if (this.j == null || this.C == null) {
        } else {
            int height = this.j.getHeight();
            int i2 = (((this.I + this.o) + this.n) + i) - this.B;
            int height2 = this.C.getHeight();
            if (i2 > height) {
                this.j.setY(((height2 - ((i2 - height) / 2.0f)) - height) - this.B);
            } else {
                this.j.setY((height2 - height) - this.B);
            }
        }
    }

    public void a(HomeSecondFloorResponse homeSecondFloorResponse) {
        Object[] objArr = {homeSecondFloorResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db1b5542563135e07717ec7cb2d34706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db1b5542563135e07717ec7cb2d34706");
        } else if (this.k == null || homeSecondFloorResponse == null || homeSecondFloorResponse.guidePicSize == null || homeSecondFloorResponse.guidePicSize.getWidth() == 0) {
            com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "setGuideResource 检查未通过", new Object[0]);
        } else {
            ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            layoutParams.width = this.K;
            float height = (homeSecondFloorResponse.guidePicSize.getHeight() * 1.0f) / homeSecondFloorResponse.guidePicSize.getWidth();
            layoutParams.height = (int) (this.K * height);
            this.F = layoutParams.height;
            this.k.setLayoutParams(layoutParams);
            com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "setGuideResource 引导图 View  width" + layoutParams.width + " height: " + layoutParams.height + " ratio:" + height, new Object[0]);
            RequestCreator d = Picasso.g(this.s.getActivity()).d(homeSecondFloorResponse.homeSecondFloorData.resource.view.getCdnGuidePic());
            d.k = DiskCacheStrategy.SOURCE;
            d.s = new RequestListener() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.c.6
                @Override // com.squareup.picasso.RequestListener
                public final boolean a(Exception exc, Object obj, boolean z) {
                    return false;
                }

                @Override // com.squareup.picasso.RequestListener
                public final boolean a(Object obj, Object obj2, boolean z, boolean z2) {
                    return false;
                }
            };
            d.a(this.k);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8169b8b04b4a31c0c0cffe8277354dcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8169b8b04b4a31c0c0cffe8277354dcf");
        } else {
            this.m.g();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53a351f9e754fefb6fbbbb2f6c6c76b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53a351f9e754fefb6fbbbb2f6c6c76b7");
            return;
        }
        if (this.h != null) {
            this.h = null;
        }
        if (this.g != null) {
            this.g.cancel();
            this.g = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        private HomeSecondFloorResponse c;
        private boolean d;

        public a(HomeSecondFloorResponse homeSecondFloorResponse) {
            Object[] objArr = {c.this, homeSecondFloorResponse};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6af794daa5f1d75f5a954f1e4c11bcf5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6af794daa5f1d75f5a954f1e4c11bcf5");
            } else {
                this.c = homeSecondFloorResponse;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aedffebdf17afe885017d66bcc330f36", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aedffebdf17afe885017d66bcc330f36");
            } else if (this.d) {
            } else {
                this.d = true;
                c.a(c.this, this.c);
            }
        }
    }

    public final void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ff66c2d0c556dbb2d4a72d634df2762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ff66c2d0c556dbb2d4a72d634df2762");
            return;
        }
        this.I = g.e(com.meituan.android.singleton.b.a);
        this.C = (FrameLayout) viewGroup.findViewById(R.id.fl_pull_refresh);
        HomeGrayManager.a().a(this.C, 4, 1, "", 0);
        this.D = (CurveFrameLayout) viewGroup.findViewById(R.id.second_floor_container);
        this.i = (ImageView) viewGroup.findViewById(R.id.second_floor_bg_img);
        this.j = (ImageView) viewGroup.findViewById(R.id.second_floor_effect_img);
        this.k = (ImageView) viewGroup.findViewById(R.id.second_floor_guide_img);
        this.l = (TextView) viewGroup.findViewById(R.id.stop_auto_open_second_floor_btn);
        this.d = (TextView) viewGroup.findViewById(R.id.tv_refresh_des);
        this.G = (RefreshHeaderPlaceHolder) viewGroup.findViewById(R.id.pull_refresh_header);
        this.E = (ImageView) viewGroup.findViewById(R.id.refresh_header_bg);
        this.e = (TextView) viewGroup.findViewById(R.id.second_floor_skip_count_down_tv);
        this.f = (RelativeLayout) viewGroup.findViewById(R.id.second_floor_skip_rl);
        this.q.i.a(this.s, new l<Pair<Boolean, Boolean>>() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.c.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Pair<Boolean, Boolean> pair) {
                Pair<Boolean, Boolean> pair2 = pair;
                boolean z = true;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23ff199a0a1a01c4903d5573cd365c8f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23ff199a0a1a01c4903d5573cd365c8f");
                } else if (pair2 != null) {
                    boolean booleanValue = pair2.first.booleanValue();
                    boolean booleanValue2 = pair2.second.booleanValue();
                    c.this.r = booleanValue;
                    c cVar = c.this;
                    if (!booleanValue2 && !booleanValue) {
                        z = false;
                    }
                    cVar.b = z;
                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "更新 新旧首页样式 , mIsRefreshHeaderNewStyle = " + c.this.b, new Object[0]);
                    c.this.n = c.this.q.c();
                    c.this.o = c.this.q.b();
                    if (c.this.p != null) {
                        if (c.this.m != null && c.this.m.e()) {
                            c.a(c.this, c.this.p.b);
                        } else {
                            c.this.t = new a(c.this.p.b);
                        }
                    }
                }
            }
        });
        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "SecondFloorBlock    添加二楼数据监听", new Object[0]);
        this.p.c.a(this.s, new l<HomeSecondFloorResponse>() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.c.4
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable HomeSecondFloorResponse homeSecondFloorResponse) {
                HomeSecondFloorResponse homeSecondFloorResponse2 = homeSecondFloorResponse;
                Object[] objArr2 = {homeSecondFloorResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e52da6a6fae4919ed86df1e77db2f18", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e52da6a6fae4919ed86df1e77db2f18");
                } else if (c.this.m != null && c.this.m.e()) {
                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "SecondFloorBlock    接收到数据： " + homeSecondFloorResponse2 + " 直接刷新UI", new Object[0]);
                    c.a(c.this, homeSecondFloorResponse2);
                } else {
                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "SecondFloorBlock    接收到数据： " + homeSecondFloorResponse2 + "非IDLE 延迟刷新UI", new Object[0]);
                    c.this.t = new a(homeSecondFloorResponse2);
                }
            }
        });
    }
}
