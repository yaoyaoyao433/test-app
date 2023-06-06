package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.passport.UserCenter;
import com.meituan.robust.common.StringUtil;
import com.tencent.map.lib.models.AccessibleTouchItem;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.internal.em;
import com.tencent.mapsdk.internal.jy;
import com.tencent.mapsdk.internal.jz;
import com.tencent.mapsdk.internal.pw;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class rg extends ek {
    private static final int ab = 6;
    private static final float ae = 0.7f;
    private static final float af = 1.3f;
    public static final int[] e = {1, 2, 5};
    private Context A;
    private Bitmap B;
    private Bitmap C;
    private ViewGroup F;
    private TextView T;
    private float Z;
    public ImageView a;
    private e aa;
    private LinearLayout ac;
    private Animation ag;
    private jz.a aj;
    public int h;
    public double i;
    public LinearLayout l;
    public int n;
    public pw r;
    private Bitmap u;
    private Rect v;
    private boolean w;
    private volatile boolean x;
    private ft y;
    private boolean z;
    private final int s = 500;
    private final int t = 1000;
    private em.b D = em.b.RIGHT_BOTTOM;
    private em.b E = em.b.LEFT_BOTTOM;
    public boolean b = true;
    public float[] c = {-1.0f, -1.0f, -1.0f, -1.0f};
    private int[] G = {-1, -1, -1, -1};
    private int[] H = {-1, -1, -1, -1};
    private int[] I = new int[em.a.values().length];
    private int[] J = new int[em.a.values().length];
    private float[] K = {0.02f, 0.02f, 0.012f, 0.012f};
    private float[] L = {0.022f, 0.022f, 0.0125f, 0.0125f};
    private float[] M = {0.0185f, 0.0185f, 0.0104f, 0.0104f};
    private int N = 0;
    private int O = 0;
    private int P = 0;
    private int Q = 0;
    private int R = 0;
    private int S = 0;
    private final List<rk> U = new CopyOnWriteArrayList();
    private final ConcurrentHashMap<String, Bitmap> V = new ConcurrentHashMap<>();
    private final List<String> W = new CopyOnWriteArrayList();
    private String X = null;
    public int d = 0;
    public String f = "50米";
    private int Y = 11;
    public int g = 109;
    public boolean j = true;
    public boolean k = false;
    private final int ad = 18;
    public float m = Float.MIN_VALUE;
    public List<c> o = new ArrayList();
    private int ah = -1;
    private int ai = -1;
    public int p = -1;
    public int q = -1;
    private boolean ak = true;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface c {
        void a(View view, Rect rect, boolean z);

        void a(rg rgVar);

        void b(View view, Rect rect, boolean z);

        void c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class d extends Enum<d> {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {a, b};

        private d(String str, int i) {
            super(str, i);
        }

        private static int[] a() {
            return (int[]) c.clone();
        }
    }

    public rg(Context context, final so soVar) {
        this.Z = 1.0f;
        this.A = context;
        this.Z = context.getResources().getDisplayMetrics().density;
        this.n = (int) ((this.Z * 35.0f) + 0.5d);
        this.a = new ImageView(context);
        this.aa = new e(this.A);
        this.T = new mk(this.A, soVar.d_);
        this.T.setText(this.f);
        this.T.setContentDescription(AccessibleTouchItem.MAP_DEFAULT_CONTENT_DESCRIPTION);
        this.T.setTextSize(12.0f);
        this.T.setTextColor(-16777216);
        this.T.setGravity(1);
        if (this.Z <= 0.0f) {
            this.Z = 1.0f;
        }
        this.ac = new LinearLayout(this.A);
        this.ac.setOrientation(1);
        this.ac.setGravity(16);
        this.ac.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.mapsdk.internal.rg.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (rg.this.aj == null) {
                    rg.this.aj = jz.a(rg.this.A, null, StringUtil.SPACE, 0);
                }
                kj.a(rg.this.A, rg.this.aj);
            }
        });
        this.ac.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.tencent.mapsdk.internal.rg.2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return gd.a(soVar.d_);
            }
        });
        this.l = new LinearLayout(this.A);
        this.l.setOrientation(1);
        this.l.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        this.l.addView(this.T, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 3;
        this.l.addView(this.aa, layoutParams2);
        this.l.setVisibility(8);
        this.ag = new AlphaAnimation(1.0f, 0.0f);
        this.ag.setDuration(1000L);
        this.ag.setStartOffset(500L);
        this.ag.setAnimationListener(new AnonymousClass3());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 3;
        this.ac.addView(this.a, layoutParams3);
        rl rlVar = soVar.k.b;
        if (rlVar != null) {
            a(rlVar.c());
        }
    }

    private void n() {
        this.ag = new AlphaAnimation(1.0f, 0.0f);
        this.ag.setDuration(1000L);
        this.ag.setStartOffset(500L);
        this.ag.setAnimationListener(new AnonymousClass3());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.rg$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass3 implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        AnonymousClass3() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            rg.this.d(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            rg.this.d(false);
        }
    }

    @Override // com.tencent.mapsdk.internal.em
    public final boolean a(ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup == null) {
            return false;
        }
        this.F = viewGroup;
        if (this.x) {
            kd.a(this.C);
            this.C = gx.a(this.B, this.A, this.R, this.S);
            this.a.setImageBitmap(this.C);
        }
        int i = this.R;
        int i2 = this.S;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (i != 0 && i2 != 0) {
            switch (this.D) {
                case LEFT_BOTTOM:
                    layoutParams.gravity = 83;
                    layoutParams.bottomMargin = this.I[em.a.BOTTOM.e];
                    layoutParams.leftMargin = this.I[em.a.LEFT.e];
                    this.ai = (this.O - layoutParams.bottomMargin) - i2;
                    this.ah = layoutParams.leftMargin;
                    break;
                case CENTER_BOTTOM:
                    layoutParams.gravity = 81;
                    layoutParams.bottomMargin = this.I[em.a.BOTTOM.e];
                    this.ai = (this.O - layoutParams.bottomMargin) - i2;
                    this.ah = (this.N - i) / 2;
                    break;
                case RIGHT_BOTTOM:
                    layoutParams.gravity = 85;
                    layoutParams.bottomMargin = this.I[em.a.BOTTOM.e];
                    layoutParams.rightMargin = this.I[em.a.RIGHT.e];
                    if (sd.c.equals(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE) && this.r != null) {
                        pw pwVar = this.r;
                        int i3 = layoutParams.bottomMargin + (i2 * 2);
                        pwVar.g = i3;
                        if (pwVar.a != null) {
                            pwVar.a.post(new pw.AnonymousClass1());
                        }
                        if (pwVar.b != null) {
                            pwVar.h = pwVar.b.getMeasuredHeight();
                        }
                        if (pwVar.f != null && pwVar.f.e_ != 0 && ((VectorMap) pwVar.f.e_).o.t != null && ((VectorMap) pwVar.f.e_).o.t.q != null) {
                            pwVar.h = (((int) ((VectorMap) pwVar.f.e_).o.t.q.b) - i3) * 2;
                            pwVar.f();
                        }
                    }
                    this.ai = (this.O - layoutParams.bottomMargin) - i2;
                    this.ah = (this.N - layoutParams.rightMargin) - i;
                    break;
                case LEFT_TOP:
                    layoutParams.gravity = 51;
                    layoutParams.topMargin = this.I[em.a.TOP.e];
                    layoutParams.leftMargin = this.I[em.a.LEFT.e];
                    this.ai = layoutParams.topMargin;
                    this.ah = layoutParams.leftMargin;
                    break;
                case CENTER_TOP:
                    layoutParams.gravity = 49;
                    layoutParams.topMargin = this.I[em.a.TOP.e];
                    this.ai = layoutParams.topMargin;
                    this.ah = (this.N - i) / 2;
                    break;
                case RIGHT_TOP:
                    layoutParams.gravity = 53;
                    layoutParams.topMargin = this.I[em.a.TOP.e];
                    layoutParams.rightMargin = this.I[em.a.RIGHT.e];
                    this.ai = layoutParams.topMargin;
                    this.ah = (this.N - layoutParams.rightMargin) - i;
                    break;
                default:
                    kj.c("Unknown position:" + this.D);
                    break;
            }
        }
        if (viewGroup.indexOfChild(this.ac) < 0) {
            viewGroup.addView(this.ac, layoutParams);
        } else {
            viewGroup.updateViewLayout(this.ac, layoutParams);
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        if (this.l != null) {
            int measuredWidth = this.l.getMeasuredWidth();
            int measuredHeight = this.l.getMeasuredHeight();
            switch (this.E) {
                case LEFT_BOTTOM:
                    layoutParams2.gravity = 83;
                    layoutParams2.bottomMargin = this.J[em.a.BOTTOM.e];
                    layoutParams2.leftMargin = this.J[em.a.LEFT.e];
                    this.q = (this.O - layoutParams2.bottomMargin) - measuredHeight;
                    this.p = layoutParams2.leftMargin;
                    break;
                case CENTER_BOTTOM:
                    layoutParams2.gravity = 81;
                    layoutParams2.bottomMargin = this.J[em.a.BOTTOM.e];
                    this.q = (this.O - layoutParams2.bottomMargin) - measuredHeight;
                    this.p = (this.N - measuredWidth) / 2;
                    break;
                case RIGHT_BOTTOM:
                    layoutParams2.gravity = 85;
                    layoutParams2.bottomMargin = this.J[em.a.BOTTOM.e];
                    layoutParams2.rightMargin = this.J[em.a.RIGHT.e];
                    this.q = (this.O - layoutParams2.bottomMargin) - measuredHeight;
                    this.p = (this.N - layoutParams2.rightMargin) - measuredWidth;
                    break;
                case LEFT_TOP:
                    layoutParams2.gravity = 51;
                    layoutParams2.topMargin = this.J[em.a.TOP.e];
                    layoutParams2.leftMargin = this.J[em.a.LEFT.e];
                    this.q = layoutParams2.topMargin;
                    this.p = layoutParams2.leftMargin;
                    break;
                case CENTER_TOP:
                    layoutParams2.gravity = 49;
                    layoutParams2.topMargin = this.J[em.a.TOP.e];
                    this.q = layoutParams2.topMargin;
                    this.p = (this.N - measuredWidth) / 2;
                    break;
                case RIGHT_TOP:
                    layoutParams2.gravity = 53;
                    layoutParams2.topMargin = this.J[em.a.TOP.e];
                    layoutParams2.rightMargin = this.J[em.a.RIGHT.e];
                    this.q = layoutParams2.topMargin;
                    this.p = (this.N - layoutParams2.rightMargin) - measuredWidth;
                    break;
                default:
                    kj.c("Unknown positionScale:" + this.E);
                    break;
            }
        }
        if (viewGroup.indexOfChild(this.l) < 0) {
            viewGroup.addView(this.l, layoutParams2);
        } else {
            viewGroup.updateViewLayout(this.l, layoutParams2);
        }
        if (this.T != null && this.aa != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.T.getLayoutParams();
            int width = this.T.getWidth();
            if (width == 0) {
                width = (int) this.T.getPaint().measureText(this.T.getText().toString());
            }
            layoutParams3.leftMargin = (int) ((this.Z * 6.0f) + ((this.g - width) / 2));
            this.l.updateViewLayout(this.T, layoutParams3);
            this.l.updateViewLayout(this.aa, this.aa.getLayoutParams());
            e();
        }
        this.a.setVisibility(this.b ? 0 : 4);
        if (this.o != null) {
            this.ac.requestLayout();
            this.l.requestLayout();
            for (c cVar : this.o) {
                if (this.v == null || this.x || this.w != this.b || this.v.left != this.ah || this.v.right != this.ai || this.v.top != this.ah + this.ac.getMeasuredWidth() || this.v.bottom != this.ai + this.ac.getMeasuredHeight()) {
                    this.w = this.b;
                    this.v = new Rect(this.ah, this.ai, this.ah + this.ac.getMeasuredWidth(), this.ai + this.ac.getMeasuredHeight());
                    cVar.a(this.ac, this.v, this.b);
                }
                cVar.b(this.l, new Rect(this.p, this.q, 0, 0), this.j);
            }
        }
        this.x = false;
        viewGroup.requestLayout();
        return true;
    }

    public final void e() {
        if (!this.j) {
            d(false);
        } else if (this.k) {
            d(true);
            x();
        } else {
            d(true);
            w();
        }
    }

    public final void f() {
        jy.a(new f(this));
    }

    public final void a(final boolean z) {
        jy.a(new Runnable() { // from class: com.tencent.mapsdk.internal.rg.4
            @Override // java.lang.Runnable
            public final void run() {
                if (rg.this.aa == null) {
                    return;
                }
                e.a(rg.this.aa, z);
            }
        });
    }

    public final void a(ft ftVar, boolean z) {
        if (this.B == null || ftVar.a(this.y) || this.z != z) {
            this.y = ftVar.clone();
            this.z = z;
            int i = (int) ftVar.c;
            if (i > 18) {
                i = 18;
            }
            rk rkVar = null;
            for (rk rkVar2 : this.U) {
                if (i >= rkVar2.a && i <= rkVar2.b) {
                    Object[] a2 = rkVar2.a(ftVar, z);
                    if (a2 != null) {
                        String str = (String) a2[0];
                        String str2 = (String) a2[1];
                        Bitmap bitmap = (Bitmap) a2[2];
                        if (bitmap != null) {
                            a(bitmap);
                            this.X = str;
                        } else if (!hb.a(str, this.X)) {
                            kj.c(ki.v, "Logo[" + str + "] changed! old=" + this.X + "|dark=" + z + "|level=" + i);
                            Bitmap bitmap2 = this.V.get(str);
                            if (bitmap2 != null) {
                                if (!bitmap2.isRecycled()) {
                                    a(bitmap2);
                                    this.X = str;
                                    kj.c(ki.v, "Logo[" + str + "] set from mem cache");
                                    return;
                                }
                                this.V.remove(str);
                            }
                            Bitmap c2 = c(str);
                            if (c2 != null) {
                                this.X = str;
                                this.V.put(this.X, c2);
                                a(c2);
                                kj.c(ki.v, "Logo[" + str + "] set from file cache");
                                return;
                            }
                            this.X = null;
                            a(str2, str);
                        }
                        rkVar = rkVar2;
                        break;
                    }
                    rkVar = rkVar2;
                }
            }
            if (rkVar == null) {
                if (this.u == null || this.u.isRecycled()) {
                    this.u = gx.b(this.A, "default_tencent_map_logo.png");
                }
                if (this.u != null) {
                    a(this.u);
                }
            }
        }
    }

    private void a(String str, String str2) {
        if (this.W.contains(str2)) {
            kj.c(ki.v, "Logo[" + str2 + "] is downloading.");
            return;
        }
        this.W.add(str2);
        kj.c(ki.v, "Logo[" + str2 + "] start download..");
        jy.a((jy.g) new a(this, str, str2)).a((jy.b.a) null, (jy.a<jy.b.a>) new b(this, str2));
    }

    private String o() {
        return this.A.getFilesDir().getAbsolutePath() + "/tencentMapSdk/logos";
    }

    private String p() {
        return this.A.getFilesDir().getAbsolutePath() + "/tencentMapSdk/oldLogos";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        String o = o();
        kd.a(o);
        return o + "/" + str;
    }

    private String b(String str) {
        return a(str) + ".tmp";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private android.graphics.Bitmap c(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r4 = r3.a(r4)     // Catch: java.lang.Throwable -> L2b
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r1.exists()     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L14
            com.tencent.mapsdk.internal.kd.a(r0)
            return r0
        L14:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2b
            android.graphics.Bitmap r1 = com.sankuai.waimai.launcher.util.image.a.a(r4)     // Catch: java.lang.Throwable -> L2c
            com.tencent.mapsdk.internal.kd.a(r4)
            return r1
        L21:
            r0 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
            goto L27
        L26:
            r4 = move-exception
        L27:
            com.tencent.mapsdk.internal.kd.a(r0)
            throw r4
        L2b:
            r4 = r0
        L2c:
            com.tencent.mapsdk.internal.kd.a(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.rg.c(java.lang.String):android.graphics.Bitmap");
    }

    public final void a(List<rp> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.U.clear();
        for (int i = 0; i < list.size(); i++) {
            rp rpVar = list.get(i);
            int[] iArr = rpVar.a;
            this.U.add(new rk(iArr[0], iArr[1], rpVar.b));
        }
    }

    public final void g() {
        kj.c(ki.v, "clearLogoCache..");
        this.V.clear();
        this.W.clear();
        try {
            File file = new File(o());
            if (file.exists()) {
                File file2 = new File(p());
                if (file.renameTo(file2)) {
                    kd.c(file2.getAbsolutePath());
                } else {
                    kd.c(file.getAbsolutePath());
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap) {
        try {
            this.B = bitmap;
            if (this.B != null) {
                this.P = this.B.getWidth();
                this.Q = this.B.getHeight();
                this.x = true;
            }
            h();
            i();
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.mapsdk.internal.ff
    public final void b(int i, int i2) {
        this.N = i;
        this.O = i2;
        h();
        i();
    }

    @Override // com.tencent.mapsdk.internal.em
    public final void c() {
        Iterator<Map.Entry<String, Bitmap>> it = this.V.entrySet().iterator();
        while (it.hasNext()) {
            kd.a(it.next().getValue());
        }
        kd.a(this.B);
        kd.a(this.C);
    }

    private void q() {
        this.V.clear();
    }

    @Override // com.tencent.mapsdk.internal.em
    public final void a(em.b bVar) {
        if (this.D != bVar) {
            f();
        }
        this.D = bVar;
    }

    public final void b(em.b bVar) {
        if (this.E != bVar) {
            f();
        }
        this.E = bVar;
    }

    private void a(pw pwVar) {
        this.r = pwVar;
    }

    private FrameLayout.LayoutParams a(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (i == 0 || i2 == 0) {
            return layoutParams;
        }
        switch (this.D) {
            case LEFT_BOTTOM:
                layoutParams.gravity = 83;
                layoutParams.bottomMargin = this.I[em.a.BOTTOM.e];
                layoutParams.leftMargin = this.I[em.a.LEFT.e];
                this.ai = (this.O - layoutParams.bottomMargin) - i2;
                this.ah = layoutParams.leftMargin;
                break;
            case CENTER_BOTTOM:
                layoutParams.gravity = 81;
                layoutParams.bottomMargin = this.I[em.a.BOTTOM.e];
                this.ai = (this.O - layoutParams.bottomMargin) - i2;
                this.ah = (this.N - i) / 2;
                break;
            case RIGHT_BOTTOM:
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = this.I[em.a.BOTTOM.e];
                layoutParams.rightMargin = this.I[em.a.RIGHT.e];
                if (sd.c.equals(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE) && this.r != null) {
                    pw pwVar = this.r;
                    int i3 = layoutParams.bottomMargin + (i2 * 2);
                    pwVar.g = i3;
                    if (pwVar.a != null) {
                        pwVar.a.post(new pw.AnonymousClass1());
                    }
                    if (pwVar.b != null) {
                        pwVar.h = pwVar.b.getMeasuredHeight();
                    }
                    if (pwVar.f != null && pwVar.f.e_ != 0 && ((VectorMap) pwVar.f.e_).o.t != null && ((VectorMap) pwVar.f.e_).o.t.q != null) {
                        pwVar.h = (((int) ((VectorMap) pwVar.f.e_).o.t.q.b) - i3) * 2;
                        pwVar.f();
                    }
                }
                this.ai = (this.O - layoutParams.bottomMargin) - i2;
                this.ah = (this.N - layoutParams.rightMargin) - i;
                break;
            case LEFT_TOP:
                layoutParams.gravity = 51;
                layoutParams.topMargin = this.I[em.a.TOP.e];
                layoutParams.leftMargin = this.I[em.a.LEFT.e];
                this.ai = layoutParams.topMargin;
                this.ah = layoutParams.leftMargin;
                break;
            case CENTER_TOP:
                layoutParams.gravity = 49;
                layoutParams.topMargin = this.I[em.a.TOP.e];
                this.ai = layoutParams.topMargin;
                this.ah = (this.N - i) / 2;
                break;
            case RIGHT_TOP:
                layoutParams.gravity = 53;
                layoutParams.topMargin = this.I[em.a.TOP.e];
                layoutParams.rightMargin = this.I[em.a.RIGHT.e];
                this.ai = layoutParams.topMargin;
                this.ah = (this.N - layoutParams.rightMargin) - i;
                break;
            default:
                kj.c("Unknown position:" + this.D);
                break;
        }
        return layoutParams;
    }

    private FrameLayout.LayoutParams r() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.l == null) {
            return layoutParams;
        }
        int measuredWidth = this.l.getMeasuredWidth();
        int measuredHeight = this.l.getMeasuredHeight();
        switch (this.E) {
            case LEFT_BOTTOM:
                layoutParams.gravity = 83;
                layoutParams.bottomMargin = this.J[em.a.BOTTOM.e];
                layoutParams.leftMargin = this.J[em.a.LEFT.e];
                this.q = (this.O - layoutParams.bottomMargin) - measuredHeight;
                this.p = layoutParams.leftMargin;
                break;
            case CENTER_BOTTOM:
                layoutParams.gravity = 81;
                layoutParams.bottomMargin = this.J[em.a.BOTTOM.e];
                this.q = (this.O - layoutParams.bottomMargin) - measuredHeight;
                this.p = (this.N - measuredWidth) / 2;
                break;
            case RIGHT_BOTTOM:
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = this.J[em.a.BOTTOM.e];
                layoutParams.rightMargin = this.J[em.a.RIGHT.e];
                this.q = (this.O - layoutParams.bottomMargin) - measuredHeight;
                this.p = (this.N - layoutParams.rightMargin) - measuredWidth;
                break;
            case LEFT_TOP:
                layoutParams.gravity = 51;
                layoutParams.topMargin = this.J[em.a.TOP.e];
                layoutParams.leftMargin = this.J[em.a.LEFT.e];
                this.q = layoutParams.topMargin;
                this.p = layoutParams.leftMargin;
                break;
            case CENTER_TOP:
                layoutParams.gravity = 49;
                layoutParams.topMargin = this.J[em.a.TOP.e];
                this.q = layoutParams.topMargin;
                this.p = (this.N - measuredWidth) / 2;
                break;
            case RIGHT_TOP:
                layoutParams.gravity = 53;
                layoutParams.topMargin = this.J[em.a.TOP.e];
                layoutParams.rightMargin = this.J[em.a.RIGHT.e];
                this.q = layoutParams.topMargin;
                this.p = (this.N - layoutParams.rightMargin) - measuredWidth;
                break;
            default:
                kj.c("Unknown positionScale:" + this.E);
                break;
        }
        return layoutParams;
    }

    @Override // com.tencent.mapsdk.internal.em
    public final em.b d() {
        return this.D;
    }

    private em.b s() {
        return this.E;
    }

    @Override // com.tencent.mapsdk.internal.ek, com.tencent.mapsdk.internal.em
    public final Rect a() {
        Rect rect = new Rect();
        if (this.ac != null) {
            rect.left = this.ac.getLeft();
            rect.bottom = this.ac.getBottom();
            rect.right = this.ac.getRight();
            rect.top = this.ac.getTop();
        }
        return rect;
    }

    @Override // com.tencent.mapsdk.internal.ek
    public final View[] b() {
        return new View[]{this.ac, this.l};
    }

    private void a(em.a aVar, float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.c[aVar.e] = f2;
        h();
    }

    private float a(em.a aVar) {
        return this.c[aVar.e];
    }

    public final void a(em.a aVar, int i) {
        this.G[aVar.e] = i;
    }

    private int b(em.a aVar) {
        return this.G[aVar.e];
    }

    private int c(em.a aVar) {
        return this.I[aVar.e];
    }

    private void b(boolean z) {
        this.b = z;
        if (this.a != null) {
            this.a.setVisibility(z ? 0 : 4);
        }
    }

    public final void b(em.a aVar, int i) {
        if (this.ak) {
            this.ak = false;
        }
        this.H[aVar.e] = i;
        i();
    }

    private int d(em.a aVar) {
        return this.H[aVar.e];
    }

    private void t() {
        h();
    }

    private void u() {
        i();
    }

    public final void h() {
        if (this.N == 0 || this.O == 0) {
            return;
        }
        int i = (int) ((this.P * this.Z) / 3.0f);
        int i2 = (int) ((this.Q * this.Z) / 3.0f);
        int[] c2 = c(i, i2);
        if (this.R != c2[0] || this.S != c2[1]) {
            this.R = c2[0];
            this.S = c2[1];
            this.x = true;
        }
        float[] fArr = this.K;
        if (this.N >= 1080) {
            fArr = this.M;
        } else if (this.N >= 720) {
            fArr = this.L;
        }
        int i3 = em.a.LEFT.e;
        float f2 = fArr[i3];
        if (this.c[i3] >= 0.0f) {
            f2 = this.c[i3];
        }
        this.I[i3] = (int) (this.N * f2);
        if (this.ak) {
            this.H[em.a.BOTTOM.e] = i2;
        }
        if (this.G[i3] >= 0 && this.G[i3] < this.N - i) {
            this.I[i3] = this.G[i3];
        }
        int i4 = em.a.RIGHT.e;
        float f3 = fArr[i4];
        if (this.c[i4] >= 0.0f) {
            f3 = this.c[i4];
        }
        this.I[i4] = (int) (this.N * f3);
        if (this.G[i4] >= 0 && this.G[i4] < this.N - i) {
            this.I[i4] = this.G[i4];
        }
        int i5 = em.a.BOTTOM.e;
        float f4 = fArr[i5];
        if (this.c[i5] >= 0.0f) {
            f4 = this.c[i5];
        }
        this.I[i5] = (int) (this.O * f4);
        if (this.G[i5] >= 0 && this.G[i5] < this.O - i2) {
            this.I[i5] = this.G[i5];
        }
        int i6 = em.a.TOP.e;
        float f5 = fArr[i6];
        if (this.c[i6] >= 0.0f) {
            f5 = this.c[i6];
        }
        this.I[i6] = (int) (this.O * f5);
        if (this.G[i6] >= 0 && this.G[i6] < this.O - i2) {
            this.I[i6] = this.G[i6];
        }
        f();
    }

    public final void i() {
        if (this.N == 0 || this.O == 0) {
            return;
        }
        int measuredHeight = this.l.getMeasuredHeight();
        int measuredWidth = this.l.getMeasuredWidth();
        float[] fArr = this.K;
        if (this.N >= 1080) {
            fArr = this.M;
        } else if (this.N >= 720) {
            fArr = this.L;
        }
        int i = em.a.LEFT.e;
        float f2 = fArr[i];
        if (this.c[i] >= 0.0f) {
            f2 = this.c[i];
        }
        this.J[i] = (int) (this.N * f2);
        if (this.H[i] >= 0 && this.H[i] < this.N - measuredWidth) {
            this.J[i] = this.H[i];
        }
        int i2 = em.a.RIGHT.e;
        float f3 = fArr[i2];
        if (this.c[i2] >= 0.0f) {
            f3 = this.c[i2];
        }
        this.J[i2] = (int) (this.N * f3);
        if (this.H[i2] >= 0 && this.H[i2] < this.N - measuredWidth) {
            this.J[i2] = this.H[i2];
        }
        int i3 = em.a.BOTTOM.e;
        float f4 = fArr[i3];
        if (this.c[i3] >= 0.0f) {
            f4 = this.c[i3];
        }
        this.J[i3] = (int) (this.O * f4);
        if (this.H[i3] >= 0 && this.H[i3] < this.O - measuredHeight) {
            this.J[i3] = this.H[i3];
        }
        int i4 = em.a.TOP.e;
        float f5 = fArr[i4];
        if (this.c[i4] >= 0.0f) {
            f5 = this.c[i4];
        }
        this.J[i4] = (int) (this.O * f5);
        if (this.H[i4] >= 0 && this.H[i4] < this.O - measuredHeight) {
            this.J[i4] = this.H[i4];
        }
        f();
    }

    private void c(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (this.o != null) {
                for (c cVar : this.o) {
                    cVar.b(this.l, new Rect(this.p, this.q, 0, 0), this.j);
                }
            }
        }
        e();
    }

    private boolean v() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (this.l != null) {
            this.l.setVisibility(z ? 0 : 8);
            this.l.requestLayout();
            this.l.invalidate();
        }
        if (this.aa != null) {
            this.aa.invalidate();
        }
    }

    private void w() {
        x();
        this.l.startAnimation(this.ag);
    }

    private void x() {
        if (this.l == null || this.ag == null) {
            return;
        }
        this.l.clearAnimation();
        this.ag.reset();
    }

    private void a(int i, double d2) {
        this.h = i;
        this.i = d2;
        int log10 = (int) Math.log10(this.n * this.i);
        int i2 = 0;
        int pow = (int) (e[0] * Math.pow(10.0d, log10));
        int i3 = (int) (pow / this.i);
        if (i3 > 0 && !Double.isNaN(this.i)) {
            while (i3 < this.n) {
                i2++;
                pow = (int) (e[i2 % e.length] * Math.pow(10.0d, (i2 / e.length) + log10));
                i3 = (int) (pow / this.i);
            }
            String str = "米";
            if (pow >= 1000) {
                pow /= 1000;
                str = "公里";
            }
            this.f = pow + str;
            this.g = i3;
            jy.a(new AnonymousClass5());
        }
        f();
    }

    private void y() {
        int log10 = (int) Math.log10(this.n * this.i);
        int i = 0;
        int pow = (int) (e[0] * Math.pow(10.0d, log10));
        int i2 = (int) (pow / this.i);
        if (i2 <= 0 || Double.isNaN(this.i)) {
            return;
        }
        while (i2 < this.n) {
            i++;
            pow = (int) (e[i % e.length] * Math.pow(10.0d, (i / e.length) + log10));
            i2 = (int) (pow / this.i);
        }
        String str = "米";
        if (pow >= 1000) {
            pow /= 1000;
            str = "公里";
        }
        this.f = pow + str;
        this.g = i2;
        jy.a(new AnonymousClass5());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.rg$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            rg.this.T.setText(rg.this.f);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class e extends View {
        private static final int b = -16777216;
        private static final int c = -7368817;
        private static final int d = 35;
        private Paint e;
        private Paint f;
        private int g;

        public e(Context context) {
            super(context);
            this.g = -16777216;
            this.e = new Paint();
            this.e.setAntiAlias(true);
            this.e.setStrokeWidth(rg.this.Z * 1.0f);
            this.e.setStyle(Paint.Style.STROKE);
            this.f = new Paint(65);
            this.f.setStyle(Paint.Style.FILL);
            this.f.setColor(0);
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            super.draw(canvas);
            this.e.setColor(this.g);
            int height = getHeight();
            int i = (int) (rg.this.Z * 6.0f);
            int i2 = height / 2;
            canvas.drawPaint(this.f);
            float f = i;
            float f2 = i2;
            canvas.drawLine(f, f2, rg.this.g + i, f2, this.e);
            float f3 = i2 + 1;
            canvas.drawLine(f, f2 - (rg.this.Z * 3.0f), f, f3, this.e);
            canvas.drawLine(rg.this.g + i, f2 - (rg.this.Z * 3.0f), i + rg.this.g, f3, this.e);
        }

        @Override // android.view.View
        protected final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setMeasuredDimension(Math.min(Math.round(rg.this.g + (rg.this.Z * 12.0f)), rg.this.N / 2), Math.round(rg.this.Y * rg.this.Z));
        }

        private void a(Canvas canvas, int i) {
            int i2 = (int) (rg.this.Z * 6.0f);
            int i3 = i / 2;
            canvas.drawPaint(this.f);
            float f = i2;
            float f2 = i3;
            canvas.drawLine(f, f2, rg.this.g + i2, f2, this.e);
            float f3 = i3 + 1;
            canvas.drawLine(f, f2 - (rg.this.Z * 3.0f), f, f3, this.e);
            canvas.drawLine(rg.this.g + i2, f2 - (rg.this.Z * 3.0f), i2 + rg.this.g, f3, this.e);
        }

        private void a(boolean z) {
            int i = z ? c : -16777216;
            if (i != this.g) {
                this.g = i;
                if (rg.this.T != null) {
                    rg.this.T.setTextColor(i);
                }
            }
        }

        static /* synthetic */ void a(e eVar, boolean z) {
            int i = z ? c : -16777216;
            if (i != eVar.g) {
                eVar.g = i;
                if (rg.this.T != null) {
                    rg.this.T.setTextColor(i);
                }
            }
        }
    }

    @Deprecated
    private void a(int i) {
        this.d = i;
        this.m = Float.MIN_VALUE;
        h();
    }

    private void a(float f2) {
        if (f2 > af) {
            f2 = af;
        }
        if (f2 < ae) {
            f2 = ae;
        }
        this.d = 0;
        this.m = f2;
        h();
    }

    private void e(boolean z) {
        this.k = !z;
        e();
    }

    private int[] c(int i, int i2) {
        float f2;
        int[] iArr = new int[2];
        if (this.m == Float.MIN_VALUE) {
            switch (this.d) {
                case -3:
                    f2 = ae;
                    break;
                case -2:
                    f2 = 0.8f;
                    break;
                case -1:
                    f2 = 0.8333333f;
                    break;
                case 0:
                default:
                    f2 = 1.0f;
                    break;
                case 1:
                    f2 = 1.2f;
                    break;
            }
        } else {
            f2 = this.m;
        }
        iArr[0] = (int) (i * f2);
        iArr[1] = (int) (i2 * f2);
        return iArr;
    }

    public final Bitmap j() {
        Drawable drawable;
        if (this.a == null || (drawable = this.a.getDrawable()) == null) {
            return null;
        }
        return ((BitmapDrawable) drawable).getBitmap();
    }

    public final boolean k() {
        return hb.a(this.X) || this.X.contains(UserCenter.OAUTH_TYPE_QQ) || this.X.contains(rj.h);
    }

    private void a(c cVar) {
        if (this.o == null || cVar == null) {
            return;
        }
        this.o.add(cVar);
    }

    public final void l() {
        if (this.o != null) {
            for (c cVar : this.o) {
                cVar.a(this);
            }
        }
    }

    public final void m() {
        if (this.o != null) {
            for (c cVar : this.o) {
                cVar.c();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class f implements Runnable {
        private WeakReference<rg> a;

        public f(rg rgVar) {
            this.a = new WeakReference<>(rgVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            rg rgVar;
            if (this.a == null || (rgVar = this.a.get()) == null) {
                return;
            }
            rgVar.a(rgVar.F, (Bundle) null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends jy.g<Bitmap> {
        private WeakReference<rg> a;
        private String b;
        private String c;

        public a(rg rgVar, String str, String str2) {
            this.a = new WeakReference<>(rgVar);
            this.b = str;
            this.c = str2;
        }

        private Bitmap a() throws Exception {
            rg rgVar;
            Bitmap bitmap = null;
            if (this.a == null || (rgVar = this.a.get()) == null) {
                return null;
            }
            File file = new File(rg.a(rgVar, this.c));
            kj.c(ki.v, "Logo[" + this.c + "] request url[" + this.b + "]...");
            kj.c(ki.v, "Logo[" + this.c + "] save to[" + file + "]...");
            NetResponse downloadTo = NetManager.getInstance().builder().url(this.b).downloadTo(file);
            if (downloadTo != null && downloadTo.available()) {
                byte[] bArr = downloadTo.data;
                int length = bArr.length;
                kj.c(ki.v, "Logo[" + this.c + "] request url ok! bitmap size[" + length + "]...");
                bitmap = com.sankuai.waimai.launcher.util.image.a.a(bArr, 0, length);
                if (bitmap != null) {
                    rgVar.V.put(this.c, bitmap);
                }
            }
            return bitmap;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() throws Exception {
            rg rgVar;
            Bitmap bitmap = null;
            if (this.a == null || (rgVar = this.a.get()) == null) {
                return null;
            }
            File file = new File(rg.a(rgVar, this.c));
            kj.c(ki.v, "Logo[" + this.c + "] request url[" + this.b + "]...");
            kj.c(ki.v, "Logo[" + this.c + "] save to[" + file + "]...");
            NetResponse downloadTo = NetManager.getInstance().builder().url(this.b).downloadTo(file);
            if (downloadTo != null && downloadTo.available()) {
                byte[] bArr = downloadTo.data;
                int length = bArr.length;
                kj.c(ki.v, "Logo[" + this.c + "] request url ok! bitmap size[" + length + "]...");
                bitmap = com.sankuai.waimai.launcher.util.image.a.a(bArr, 0, length);
                if (bitmap != null) {
                    rgVar.V.put(this.c, bitmap);
                }
            }
            return bitmap;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b extends jy.a<Bitmap> {
        private WeakReference<rg> a;
        private String b;

        @Override // com.tencent.mapsdk.internal.jy.a, com.tencent.map.tools.Callback
        public final /* synthetic */ void callback(Object obj) {
            rg rgVar;
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap == null || this.a == null || (rgVar = this.a.get()) == null) {
                return;
            }
            kc.a(new File(rg.a(rgVar, this.b)), new File(rgVar.a(this.b)));
            if (this.b.equals(rgVar.X)) {
                kj.c(ki.v, "Logo[" + this.b + "] set from net");
                rgVar.a(bitmap);
            }
            rgVar.W.remove(this.b);
        }

        public b(rg rgVar, String str) {
            this.a = new WeakReference<>(rgVar);
            this.b = str;
        }

        private void a(Bitmap bitmap) {
            rg rgVar;
            if (bitmap == null || this.a == null || (rgVar = this.a.get()) == null) {
                return;
            }
            kc.a(new File(rg.a(rgVar, this.b)), new File(rgVar.a(this.b)));
            if (this.b.equals(rgVar.X)) {
                kj.c(ki.v, "Logo[" + this.b + "] set from net");
                rgVar.a(bitmap);
            }
            rgVar.W.remove(this.b);
        }
    }

    static /* synthetic */ String a(rg rgVar, String str) {
        return rgVar.a(str) + ".tmp";
    }
}
