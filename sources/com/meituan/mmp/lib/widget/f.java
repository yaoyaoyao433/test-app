package com.meituan.mmp.lib.widget;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.support.constraint.R;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.mmp.lib.ae;
import com.meituan.mmp.lib.page.coverview.CoverViewRootContainer;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.lib.web.i;
import com.meituan.mmp.main.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends LinearLayout {
    public static ChangeQuickRedirect a;
    private static final int g = p.d(65);
    private static final int h = p.d(21);
    private static final int i = p.d(18);
    private static final int j = p.d(3);
    private final List<com.meituan.mmp.lib.widget.a> A;
    private int B;
    private int C;
    private int D;
    public boolean b;
    public com.meituan.mmp.lib.web.b c;
    public FrameLayout d;
    public volatile ConcurrentHashMap<String, List<String>> e;
    public View f;
    private boolean k;
    private b l;
    private boolean m;
    private ImageView n;
    private float o;
    private float p;
    private float q;
    private c r;
    private int s;
    private int t;
    private Handler u;
    private CoverViewRootContainer v;
    private CoverViewRootContainer w;
    private a x;
    private i y;
    private volatile ConcurrentHashMap<String, CoverViewRootContainer> z;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    public f(Context context, a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f83ad9bb53618670e64ba81c6171a7ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f83ad9bb53618670e64ba81c6171a7ec");
            return;
        }
        this.k = false;
        this.b = false;
        this.m = true;
        this.s = R.drawable.mmp_page_refresh_loading_1;
        this.t = R.drawable.mmp_page_refresh_loading_0;
        this.u = new Handler();
        this.v = null;
        this.w = null;
        this.z = new ConcurrentHashMap<>();
        this.e = new ConcurrentHashMap<>();
        this.A = new CopyOnWriteArrayList();
        this.B = 0;
        this.C = 0;
        this.D = 0;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25584698cfa6def49c94a9541ef06946", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25584698cfa6def49c94a9541ef06946");
        } else {
            setOrientation(1);
            setGravity(1);
            this.n = new ImageView(getContext());
            this.n.setImageDrawable(getResources().getDrawable(this.t));
            int i2 = g;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, ((i2 - j) - i) - h);
            layoutParams.topMargin = h;
            layoutParams.bottomMargin = j + i;
            addView(this.n, layoutParams);
            setPadding(0, -g, 0, 0);
        }
        this.x = aVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25d5b2ceb358432e3703a491b5dd0254", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25d5b2ceb358432e3703a491b5dd0254")).booleanValue();
        }
        if (this.m && !this.x.a()) {
            switch (motionEvent.getAction()) {
                case 0:
                    float y = motionEvent.getY();
                    this.q = y;
                    this.p = y;
                    this.o = motionEvent.getX();
                case 1:
                case 3:
                    this.k = false;
                    break;
                case 2:
                    float y2 = motionEvent.getY();
                    float f = y2 - this.p;
                    float abs = Math.abs(f);
                    float abs2 = Math.abs(motionEvent.getX() - this.o);
                    if (abs > j && f >= 1.0f) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bcad9c659106980cd794b3959a407d23", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bcad9c659106980cd794b3959a407d23")).booleanValue();
                        } else {
                            z = this.v.getCoverViewScrollY() != 0;
                        }
                        if (!z && abs > abs2) {
                            if (!this.k) {
                                this.q = y2;
                            }
                            this.p = y2;
                            this.k = true;
                            break;
                        }
                    }
                    break;
            }
            return this.k || this.b;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe03395593ca4c75462a74cc3c21ac96", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe03395593ca4c75462a74cc3c21ac96")).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                float y = motionEvent.getY();
                this.q = y;
                this.p = y;
                return true;
            case 1:
            case 3:
                this.k = false;
                float scrollY = getScrollY();
                if (g + scrollY < 0.0f) {
                    b(Math.round(-g));
                    if (!this.b) {
                        a();
                    }
                    this.b = true;
                } else if (scrollY < 0.0f) {
                    b(0);
                    if (this.b) {
                        b();
                    }
                    this.b = false;
                } else {
                    if (this.b) {
                        b();
                    }
                    this.b = false;
                }
                return true;
            case 2:
                if (this.k || this.b) {
                    this.p = motionEvent.getY();
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26d7fd242b8741022ed90a970342eb96", RobustBitConfig.DEFAULT_VALUE)) {
                        ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26d7fd242b8741022ed90a970342eb96")).booleanValue();
                    } else {
                        getScrollY();
                        int round = Math.round((this.q - this.p) / 2.0f);
                        if (this.b) {
                            round -= g;
                        }
                        if (round <= 0) {
                            scrollTo(0, round);
                        } else {
                            scrollTo(0, 0);
                        }
                    }
                    return true;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    private void b(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a611eb24bb3320033fc9a34ef5b1c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a611eb24bb3320033fc9a34ef5b1c63");
            return;
        }
        if (this.r != null) {
            this.r.a();
        }
        if (getScrollY() != i2) {
            this.r = new c(getScrollY(), i2);
            post(this.r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public final class c implements Runnable {
        public static ChangeQuickRedirect a;
        private final Interpolator c;
        private final int d;
        private final int e;
        private boolean f;
        private long g;
        private int h;

        public c(int i, int i2) {
            Object[] objArr = {f.this, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ccd6f119fede2417e52c8a92505b122", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ccd6f119fede2417e52c8a92505b122");
                return;
            }
            this.f = true;
            this.g = -1L;
            this.h = -1;
            this.e = i;
            this.d = i2;
            this.c = new OvershootInterpolator(2.0f);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee41c1c0da387484cff981f22fab3e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee41c1c0da387484cff981f22fab3e0");
                return;
            }
            if (this.g == -1) {
                this.g = System.currentTimeMillis();
            } else {
                this.h = this.e - Math.round((this.e - this.d) * this.c.getInterpolation(((float) Math.max(Math.min(((System.currentTimeMillis() - this.g) * 1000) / 300, 1000L), 0L)) / 1000.0f));
                f.this.scrollTo(0, this.h);
            }
            if (!this.f || this.d == this.h) {
                return;
            }
            f.this.postDelayed(this, 10L);
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0eb4021c5d1ffa6d09d0da8472358b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0eb4021c5d1ffa6d09d0da8472358b9");
                return;
            }
            this.f = false;
            f.this.removeCallbacks(this);
        }
    }

    public final void setOnRefreshListener(b bVar) {
        this.l = bVar;
    }

    public final void setRefreshing(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "444a2766a6bd54fd82f4a4933ac1252d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "444a2766a6bd54fd82f4a4933ac1252d");
        } else if (z) {
            b(Math.round(-g));
            if (!this.b) {
                a();
            }
            this.b = true;
        } else {
            b(0);
            if (this.b) {
                b();
            }
            this.b = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bab8c4c0e22602b6f176e2ac9463a7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bab8c4c0e22602b6f176e2ac9463a7a");
            return;
        }
        super.onDetachedFromWindow();
        this.x = null;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6928333501ccc082efbea94b28358a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6928333501ccc082efbea94b28358a6");
            return;
        }
        this.m = z;
        if (!this.m) {
            setRefreshing(false);
        }
        super.setEnabled(z);
    }

    public final void setContentView(com.meituan.mmp.lib.web.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86cdcda05a21ee01785c70d7fe18f6c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86cdcda05a21ee01785c70d7fe18f6c4");
            return;
        }
        if (this.d != null) {
            removeView(this.d);
        }
        ab.b("X5SwipeRefreshLayout.setContentView");
        this.c = bVar;
        this.d = new FrameLayout(getContext());
        this.w = new CoverViewRootContainer(getContext());
        this.d.addView(this.w, new FrameLayout.LayoutParams(-1, -1));
        this.d.addView(this.c, new FrameLayout.LayoutParams(-1, -1));
        this.v = new CoverViewRootContainer(getContext());
        this.y = new i() { // from class: com.meituan.mmp.lib.widget.f.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.web.i
            public final void a(int i2, int i3, int i4, int i5) {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d1a1a67811050814bf3f7e97e0e6c8c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d1a1a67811050814bf3f7e97e0e6c8c");
                    return;
                }
                if (f.this.v != null) {
                    f.this.v.a(i2, i3, i4, i5);
                }
                if (f.this.w != null) {
                    f.this.w.a(i2, i3, i4, i5);
                }
                f.this.B = i2;
                f.this.C = i3;
            }
        };
        this.c.setOnWebScrollChangeListener(this.y);
        this.d.addView(this.v, new FrameLayout.LayoutParams(-1, -1));
        addView(this.d, new LinearLayout.LayoutParams(-1, -1));
        ab.b();
    }

    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7bf70af09305f2b31a60cb021063625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7bf70af09305f2b31a60cb021063625");
        } else {
            this.c.getIWebView().getWebView().setBackgroundColor(0);
        }
    }

    public final CoverViewRootContainer getUnderCoverViewContainer() {
        return this.w;
    }

    public final CoverViewRootContainer getCoverViewContainer() {
        return this.v;
    }

    public final com.meituan.mmp.lib.web.b getContentView() {
        return this.c;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f494235c770ccb74a5ac6da43a0615bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f494235c770ccb74a5ac6da43a0615bf");
            return;
        }
        if (this.l != null) {
            this.l.a();
        }
        this.n.setImageDrawable(getResources().getDrawable(this.s));
        this.u.postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.widget.f.2
            public static ChangeQuickRedirect a;
            public int b = 1;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bea9a2e77ed78865d1a8d2cdba550fd9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bea9a2e77ed78865d1a8d2cdba550fd9");
                    return;
                }
                f.this.n.setRotation(this.b * 30);
                this.b++;
                f.this.u.postDelayed(this, 60L);
            }
        }, 60L);
        this.D = g;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11ab1d8170d405c9271c90cb1d207e98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11ab1d8170d405c9271c90cb1d207e98");
            return;
        }
        this.u.removeCallbacksAndMessages(null);
        this.n.setImageDrawable(getResources().getDrawable(this.t));
        this.D = 0;
    }

    public final void setBackgroundTextStyle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ce6676e9ada7b5cd23a0344191083c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ce6676e9ada7b5cd23a0344191083c2");
            return;
        }
        int i2 = this.s;
        int i3 = this.t;
        this.s = z ? R.drawable.mmp_page_refresh_loading_1 : R.drawable.mmp_page_refresh_loading_1_white;
        this.t = z ? R.drawable.mmp_page_refresh_loading_0 : R.drawable.mmp_page_refresh_loading_0_white;
        if (this.b && i2 != this.s) {
            this.n.setImageDrawable(getResources().getDrawable(this.s));
        }
        if (this.b || i3 == this.t) {
            return;
        }
        this.n.setImageDrawable(getResources().getDrawable(this.t));
    }

    @WorkerThread
    public final void setRegionData(@NonNull String str) {
        JSONArray a2;
        com.meituan.mmp.lib.widget.a a3;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea8f9fae231ed81b94871356e2726f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea8f9fae231ed81b94871356e2726f8");
            return;
        }
        List<com.meituan.mmp.lib.widget.a> list = this.A;
        Object[] objArr2 = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.widget.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "63ea0527429ae24aed39eccc17a6cea3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "63ea0527429ae24aed39eccc17a6cea3");
        } else if (str != null && list != null && (a2 = com.meituan.mmp.lib.widget.b.a(str)) != null) {
            list.clear();
            for (int i2 = 0; i2 < a2.length(); i2++) {
                JSONObject optJSONObject = a2.optJSONObject(i2);
                if (optJSONObject != null && (a3 = com.meituan.mmp.lib.widget.b.a(optJSONObject)) != null) {
                    list.add(a3);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ec, code lost:
        if (r6 < (r1.d + r1.f)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ee, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0115, code lost:
        if (r6 < r13) goto L56;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(@android.support.annotation.NonNull android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.widget.f.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final CoverViewRootContainer a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad43ff47844f870ac94b3255c887a9b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewRootContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad43ff47844f870ac94b3255c887a9b4");
        }
        if (this.z.containsKey(str)) {
            return this.z.get(str);
        }
        com.meituan.mmp.lib.page.coverview.c cVar = new com.meituan.mmp.lib.page.coverview.c(getContext());
        cVar.setInterceptTouchEvent(true);
        cVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.z.put(str, cVar);
        return cVar;
    }

    public final ConcurrentHashMap<String, CoverViewRootContainer> getMarkerInfoWindowRootContainerMap() {
        return this.z;
    }

    public final CoverViewWrapper a(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f3a47e2b6a5ba9a389cfcbb753536f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f3a47e2b6a5ba9a389cfcbb753536f2");
        }
        CoverViewWrapper coverViewWrapper = null;
        String b2 = b(String.valueOf(i3));
        if (i3 != -1) {
            CoverViewRootContainer a2 = a(String.valueOf(b2));
            if (a2 != null) {
                return ae.a(a2, i2);
            }
            return null;
        }
        for (Map.Entry<String, CoverViewRootContainer> entry : getMarkerInfoWindowRootContainerMap().entrySet()) {
            coverViewWrapper = ae.a(entry.getValue(), i2);
            if (coverViewWrapper != null) {
                return coverViewWrapper;
            }
        }
        return coverViewWrapper;
    }

    public final CoverViewRootContainer a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4b5980b46bf60db1f6ba0e8bd070682", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewRootContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4b5980b46bf60db1f6ba0e8bd070682");
        }
        for (Map.Entry<String, CoverViewRootContainer> entry : getMarkerInfoWindowRootContainerMap().entrySet()) {
            if (ae.a(entry.getValue(), i2) != null) {
                return entry.getValue();
            }
        }
        return null;
    }

    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22ddfec3c463d6efec765f9ebf7fcedc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22ddfec3c463d6efec765f9ebf7fcedc");
        }
        for (Map.Entry<String, List<String>> entry : getMarkerViewIdsMap().entrySet()) {
            List<String> value = entry.getValue();
            if (value != null && value.contains(str)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public final ConcurrentHashMap<String, List<String>> getMarkerViewIdsMap() {
        return this.e;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30f1249ef0b16e0da50f4c36b13b579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30f1249ef0b16e0da50f4c36b13b579");
        } else if (this.c != null) {
            this.c.setWidgetBackgroundColor(i2);
        }
    }
}
