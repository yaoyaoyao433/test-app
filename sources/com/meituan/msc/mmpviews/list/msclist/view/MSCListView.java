package com.meituan.msc.mmpviews.list.msclist.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.common.utils.aq;
import com.meituan.msc.jse.bridge.LifecycleEventListener;
import com.meituan.msc.jse.bridge.MSCReadableArray;
import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.bridge.queue.MessageQueueThreadSpec;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfiguration;
import com.meituan.msc.mmpviews.list.BaseListView;
import com.meituan.msc.mmpviews.list.MSCLinearLayoutManager;
import com.meituan.msc.mmpviews.list.c;
import com.meituan.msc.mmpviews.list.common.MSCListConstant;
import com.meituan.msc.mmpviews.list.d;
import com.meituan.msc.mmpviews.list.event.d;
import com.meituan.msc.mmpviews.list.msclist.MSCListNode;
import com.meituan.msc.mmpviews.list.msclist.data.b;
import com.meituan.msc.mmpviews.list.msclist.e;
import com.meituan.msc.mmpviews.list.msclist.i;
import com.meituan.msc.mmpviews.list.msclist.view.b;
import com.meituan.msc.mmpviews.list.sticky.StickyLinearLayoutManager;
import com.meituan.msc.mmpviews.shell.f;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.list.MSCListEventEmitter;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.msc.views.ReactRootView;
import com.meituan.msc.views.scroll.VelocityHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class MSCListView extends BaseListView implements com.meituan.msc.mmpviews.list.b<a>, c, com.meituan.msc.mmpviews.shell.b, com.meituan.msc.uimanager.list.b {
    public static ChangeQuickRedirect j;
    private com.meituan.msc.mmpviews.list.event.c A;
    private VelocityHelper B;
    private boolean C;
    private boolean D;
    private com.meituan.msc.mmpviews.list.msclist.data.c E;
    private boolean F;
    private String G;
    private ArrayList<com.meituan.msc.uimanager.list.c> H;
    private TemplateInfo I;
    private ReadableArray J;
    private com.meituan.msc.mmpviews.list.msclist.b K;
    private int L;
    private int M;
    private int N;
    private int O;
    private UIImplementation P;
    private boolean Q;
    private ReactQueueConfiguration R;
    private com.meituan.msc.devsupport.perf.a S;
    private boolean T;
    private final Map<Integer, com.meituan.msc.mmpviews.list.sticky.c> U;
    private int V;
    private long W;
    private int aa;
    private long ab;
    private boolean ac;
    private final Runnable ad;
    private int ae;
    private final f af;
    private LifecycleEventListener ag;
    com.meituan.msc.mmpviews.list.msclist.data.b k;
    d<a> l;
    boolean m;
    public boolean n;
    boolean o;
    final String p;
    private i q;
    private HashMap<String, com.meituan.msc.mmpviews.list.msclist.f> r;
    private com.meituan.msc.mmpviews.list.event.f s;
    private SparseIntArray t;
    private ThemedReactContext u;
    private RecyclerView.LayoutManager v;
    private boolean w;
    private boolean x;
    private boolean y;
    private volatile boolean z;

    @Override // com.meituan.msc.mmpviews.list.b
    public final /* synthetic */ a a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32c50dd99397d24949781024f0cd799b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32c50dd99397d24949781024f0cd799b");
        }
        PerfTrace.online().a("list_create_cell");
        int i2 = this.t.get(i, -1);
        if (i2 == -1) {
            throw new IllegalStateException("viewType: " + i + ", position is not in cache");
        }
        b.a a2 = this.k.a(i2);
        if (a2 == null) {
            throw new IllegalStateException("viewType: " + i + ", position: " + i2 + ", info is null");
        }
        PerfTrace.online().a("list_load_virtual_dom");
        com.meituan.msc.mmpviews.list.msclist.a aVar = new com.meituan.msc.mmpviews.list.msclist.a(null, this.q, this.K);
        MSCListNode c = ((e) this.r.get(a2.b)).c(null, aVar);
        c.rawData = a2;
        com.meituan.msc.uimanager.list.d dVar = new com.meituan.msc.uimanager.list.d(this.u.a());
        c.uiImplementation = com.meituan.msc.uimanager.list.c.a(dVar, this.P, i2, this);
        dVar.setUIManagerModule(new com.meituan.msc.uimanager.list.e(dVar, c.uiImplementation, new MSCListEventEmitter(dVar, c.uiImplementation, this.u.getUIManagerModule().a().c), this.u.getUIManagerModule()));
        dVar.initializeMessageQueueThreads(this.R);
        ThemedReactContext themedReactContext = new ThemedReactContext(dVar, this.R, this.u);
        MSCListNode.createTree(c, aVar);
        PerfTrace.online().b("list_load_virtual_dom");
        c.uiImplementation.a(themedReactContext, c, i2);
        this.H.add(c.uiImplementation);
        a aVar2 = new a(c.uiImplementation.r());
        PerfTrace.online().b("list_create_cell");
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0285  */
    @Override // com.meituan.msc.mmpviews.list.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(com.meituan.msc.mmpviews.list.msclist.view.MSCListView.a r19, int r20) {
        /*
            Method dump skipped, instructions count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.list.msclist.view.MSCListView.a(android.support.v7.widget.RecyclerView$s, int):void");
    }

    public static /* synthetic */ boolean a(MSCListView mSCListView, boolean z) {
        mSCListView.C = false;
        return false;
    }

    public static /* synthetic */ boolean b(MSCListView mSCListView, boolean z) {
        mSCListView.D = false;
        return false;
    }

    public static /* synthetic */ boolean c(MSCListView mSCListView, boolean z) {
        mSCListView.ac = false;
        return false;
    }

    public static /* synthetic */ boolean d(MSCListView mSCListView, boolean z) {
        mSCListView.y = false;
        return false;
    }

    public static /* synthetic */ boolean e(MSCListView mSCListView, boolean z) {
        mSCListView.x = true;
        return true;
    }

    public MSCListView(ThemedReactContext themedReactContext, boolean z, String str, boolean z2, Bundle bundle) {
        super(themedReactContext);
        RecyclerView.LayoutManager mSCLinearLayoutManager;
        Object[] objArr = {themedReactContext, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3111bbd0e3d42f0b394947fac18843df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3111bbd0e3d42f0b394947fac18843df");
            return;
        }
        this.k = new com.meituan.msc.mmpviews.list.msclist.data.b();
        this.q = new i();
        this.r = new HashMap<>();
        this.t = new SparseIntArray();
        this.z = false;
        this.A = new com.meituan.msc.mmpviews.list.event.c();
        this.B = new VelocityHelper(getContext());
        this.C = false;
        this.D = false;
        this.E = new com.meituan.msc.mmpviews.list.msclist.data.c();
        this.F = false;
        this.m = false;
        this.G = null;
        this.H = new ArrayList<>();
        this.I = null;
        this.J = null;
        this.n = false;
        this.N = 0;
        this.O = 0;
        this.o = false;
        this.Q = false;
        this.T = false;
        this.p = "MSCListView@" + Integer.toHexString(hashCode());
        this.U = new TreeMap();
        this.V = 0;
        this.W = 0L;
        this.aa = 0;
        this.ab = 0L;
        this.ac = false;
        this.ad = new Runnable() { // from class: com.meituan.msc.mmpviews.list.msclist.view.MSCListView.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65d32579fff4daf18161621f60c56221", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65d32579fff4daf18161621f60c56221");
                    return;
                }
                MSCListView.a(MSCListView.this, false);
                MSCListView.b(MSCListView.this, false);
                MSCListView.c(MSCListView.this, false);
                MSCListView.this.measure(View.MeasureSpec.makeMeasureSpec(MSCListView.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(MSCListView.this.getHeight(), 1073741824));
                MSCListView.this.layout(MSCListView.this.getLeft(), MSCListView.this.getTop(), MSCListView.this.getRight(), MSCListView.this.getBottom());
            }
        };
        this.ae = -1;
        this.af = new f(this);
        this.ag = new LifecycleEventListener() { // from class: com.meituan.msc.mmpviews.list.msclist.view.MSCListView.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
            public final void onHostPause() {
            }

            @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
            public final void onHostResume() {
            }

            @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
            public final void onHostDestroy() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81e4b412d3f2615db43306576eff55a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81e4b412d3f2615db43306576eff55a2");
                    return;
                }
                g.d(MSCListView.this.p, "[onDestroy] onHostDestroy");
                MSCListView.this.d();
            }
        };
        this.b = str;
        this.S = new com.meituan.msc.devsupport.perf.a(themedReactContext);
        g.d(this.p, "[MSCListView]", this);
        this.u = themedReactContext;
        this.u.addLifecycleEventListener(this.ag);
        setScrollEnabled(z2);
        this.R = themedReactContext.a().generateConfiguration(MessageQueueThreadSpec.newBackgroundThreadSpec("js"), MessageQueueThreadSpec.mainThreadSpec());
        this.l = new d<>(themedReactContext, this);
        setAdapter(this.l);
        setOnFlingListener(new RecyclerView.i() { // from class: com.meituan.msc.mmpviews.list.msclist.view.MSCListView.1
            @Override // android.support.v7.widget.RecyclerView.i
            public final boolean onFling(int i, int i2) {
                return false;
            }
        });
        this.K = new com.meituan.msc.mmpviews.list.msclist.b();
        this.P = themedReactContext.getUIManagerModule().b();
        this.d = z ? 1 : 0;
        themedReactContext.getRuntimeDelegate().addScrollVelocityHelper(this.B);
        this.c = bundle.getInt("columnCount", 1);
        this.N = bundle.getInt("columnGap", 0);
        this.O = bundle.getInt("rowGap", 0);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = j;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3f601af369034e4db5a0d3ae0759a5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3f601af369034e4db5a0d3ae0759a5c");
            return;
        }
        if (TextUtils.equals(this.b, "grid")) {
            this.v = new GridLayoutManager(this.u, this.c, this.d, this.e);
            ((GridLayoutManager) this.v).a(new GridLayoutManager.c() { // from class: com.meituan.msc.mmpviews.list.msclist.view.MSCListView.2
                public static ChangeQuickRedirect b;

                @Override // android.support.v7.widget.GridLayoutManager.c
                public final int a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c567ca7c494e1f5ca77c6f86496f4c95", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c567ca7c494e1f5ca77c6f86496f4c95")).intValue();
                    }
                    if (MSCListView.this.b(i)) {
                        return MSCListView.this.c;
                    }
                    return 1;
                }
            });
            addItemDecoration(new b(this.N, this.O, new b.a() { // from class: com.meituan.msc.mmpviews.list.msclist.view.MSCListView.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.mmpviews.list.msclist.view.b.a
                public final boolean a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f72ac160ad5f315ab53bdfdd9515e096", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f72ac160ad5f315ab53bdfdd9515e096")).booleanValue() : MSCListView.this.b(i);
                }
            }));
        } else if (TextUtils.equals(this.b, "masonry")) {
            this.v = new StaggeredGridLayoutManager(this.c, this.d);
            addItemDecoration(new com.meituan.msc.mmpviews.list.msclist.view.a(this.N, this.O));
        } else {
            if (this.d == 1) {
                mSCLinearLayoutManager = new StickyLinearLayoutManager(this.u, this.d, this.e, new com.meituan.msc.mmpviews.list.sticky.a() { // from class: com.meituan.msc.mmpviews.list.msclist.view.MSCListView.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.mmpviews.list.sticky.a
                    public final Map<Integer, com.meituan.msc.mmpviews.list.sticky.c> a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6011feced20114dd8f0bc135b1ce60ae", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6011feced20114dd8f0bc135b1ce60ae") : MSCListView.this.U == null ? new TreeMap() : MSCListView.this.U;
                    }
                });
            } else {
                mSCLinearLayoutManager = new MSCLinearLayoutManager(this.u, this.d, this.e);
            }
            mSCLinearLayoutManager.setItemPrefetchEnabled(false);
            this.v = mSCLinearLayoutManager;
        }
        setLayoutManager(this.v);
        this.v.setAutoMeasureEnabled(true);
        setItemAnimator(null);
        com.meituan.msc.mmpviews.list.debug.a.a();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb10505212582b33d0672d7042bdf902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb10505212582b33d0672d7042bdf902");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (!this.o || this.Q) {
            return;
        }
        this.Q = true;
    }

    @Override // com.meituan.msc.mmpviews.list.BaseListView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eeec0c6f247e7aa59f1eb3e20af1e5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eeec0c6f247e7aa59f1eb3e20af1e5c");
            return;
        }
        int c = (int) s.c(50.0f);
        this.M = c;
        this.L = c;
    }

    @Override // com.meituan.msc.mmpviews.list.b
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5643d75e8da6194f7b9f4a1fdbacfc4a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5643d75e8da6194f7b9f4a1fdbacfc4a")).intValue();
        }
        int hashCode = this.k.a(i).b.hashCode();
        this.t.put(hashCode, i);
        getRecycledViewPool().a(hashCode, 10);
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74d0289a25c3276a0ad479dd34a89903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74d0289a25c3276a0ad479dd34a89903");
        } else if (UiThreadUtil.isOnUiThread()) {
            this.ad.run();
        } else if (this.ac) {
        } else {
            this.ac = true;
            post(this.ad);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ReactRootView reactRootView;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64fe66caaecadec123363d1554925bcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64fe66caaecadec123363d1554925bcd");
            return;
        }
        super.onAttachedToWindow();
        ViewGroup viewGroup = this;
        while (true) {
            if (!b(viewGroup) && (viewGroup = (ViewGroup) viewGroup.getParent()) != null) {
                if (viewGroup.getClass().getSimpleName().equals("ViewRootImpl")) {
                    viewGroup = null;
                    break;
                }
            } else {
                break;
            }
        }
        if (viewGroup != null) {
            try {
                if (viewGroup instanceof ReactRootView) {
                    reactRootView = (ReactRootView) viewGroup;
                } else {
                    Object[] objArr2 = {viewGroup};
                    ChangeQuickRedirect changeQuickRedirect2 = j;
                    reactRootView = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c696ffbd70e28f31416380c33163fdd6", RobustBitConfig.DEFAULT_VALUE) ? (ReactRootView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c696ffbd70e28f31416380c33163fdd6") : (ReactRootView) com.meituan.msc.utils.c.a(viewGroup, "mReactRootView");
                }
                this.s = new com.meituan.msc.mmpviews.list.event.f(viewGroup, getId());
                Field declaredField = ReactRootView.class.getDeclaredField("mJSTouchDispatcher");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(reactRootView);
                if (obj instanceof com.meituan.msc.mmpviews.list.event.f) {
                    ((com.meituan.msc.mmpviews.list.event.f) obj).a(this, this);
                    return;
                }
                this.s.a(this, this);
                declaredField.set(reactRootView, this.s);
            } catch (Throwable th) {
                g.b(this.p, th, "[onAttachedToWindow]");
            }
        }
    }

    private boolean b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64c984b56da3b60213782989c5353ed5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64c984b56da3b60213782989c5353ed5")).booleanValue() : view != null && (view.getClass().getSimpleName().equals("MSCRNView") || (view instanceof ReactRootView));
    }

    @Override // android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd22b85b00444fe646873c64d77189e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd22b85b00444fe646873c64d77189e")).booleanValue();
        }
        boolean fling = super.fling(i, i2);
        if (this.m) {
            return false;
        }
        if (this.g) {
            com.meituan.msc.mmpviews.list.event.c cVar = this.A;
            float f = i;
            float f2 = i2;
            Object[] objArr2 = {this, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.list.event.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "f8bbe833d36e2cb7610a60a4e0ecec98", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "f8bbe833d36e2cb7610a60a4e0ecec98");
            } else {
                cVar.a(this, d.a.MOMENTUM_BEGIN, f, f2);
            }
            ViewCompat.postOnAnimationDelayed(this, new Runnable() { // from class: com.meituan.msc.mmpviews.list.msclist.view.MSCListView.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca6897618ca973356eb81ab5544b7bf5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca6897618ca973356eb81ab5544b7bf5");
                    } else if (MSCListView.this.x) {
                        MSCListView.d(MSCListView.this, false);
                        com.meituan.msc.mmpviews.list.event.c cVar2 = MSCListView.this.A;
                        MSCListView mSCListView = MSCListView.this;
                        Object[] objArr4 = {mSCListView};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.mmpviews.list.event.c.a;
                        if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "5f89d87dedb46af018fdd826ddb559ac", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "5f89d87dedb46af018fdd826ddb559ac");
                        } else {
                            cVar2.a(mSCListView, d.a.MOMENTUM_END);
                        }
                    } else {
                        MSCListView.e(MSCListView.this, true);
                        ViewCompat.postOnAnimationDelayed(MSCListView.this, this, 20L);
                    }
                }
            }, 20L);
        }
        return fling;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2487d5ce3710bc70d4860c324f622e78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2487d5ce3710bc70d4860c324f622e78");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.y) {
            this.x = false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        boolean z;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2d47c410c0f52d18f93e077aacda40d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2d47c410c0f52d18f93e077aacda40d");
            return;
        }
        super.onScrolled(i, i2);
        if (this.m) {
            return;
        }
        if (!this.F && Build.VERSION.SDK_INT >= 18) {
            Rect rect = new Rect();
            getDrawingRect(rect);
            setClipBounds(rect);
            this.F = true;
        }
        if (this.ae > 0) {
            com.meituan.msc.mmpviews.list.event.c cVar = this.A;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.list.event.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "a9224d8ff53b665bb986f807c0ce9bd4", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "a9224d8ff53b665bb986f807c0ce9bd4")).booleanValue();
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z2 = (uptimeMillis - cVar.d <= 10 && i == 0 && i2 == 0) ? false : true;
                if (uptimeMillis - cVar.d != 0) {
                    cVar.b = i / ((float) (uptimeMillis - cVar.d));
                    cVar.c = i2 / ((float) (uptimeMillis - cVar.d));
                }
                cVar.d = uptimeMillis;
                z = z2;
            }
            if (z) {
                e();
                this.S.a(this.w, this.A.b, this.A.c);
                com.meituan.msc.mmpviews.list.event.c cVar2 = this.A;
                float f = this.A.b;
                float f2 = this.A.c;
                com.meituan.msc.mmpviews.list.msclist.data.c cVar3 = this.E;
                Object[] objArr3 = {this, Float.valueOf(f), Float.valueOf(f2), cVar3};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.mmpviews.list.event.c.a;
                if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "34f12be2162eac13d347775c91c3e12d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "34f12be2162eac13d347775c91c3e12d");
                } else {
                    cVar2.a(this, d.a.ON_SCROLL, f, f2, cVar3);
                }
                if (!this.T) {
                    this.u.getUIManagerModule().c.a(8, "triggered by ListView scroll");
                    this.T = true;
                }
                RecyclerView.LayoutManager layoutManager = getLayoutManager();
                int itemCount = layoutManager.getItemCount();
                if (layoutManager.getChildCount() > 0) {
                    if (this.E.b == itemCount - 1 && !this.C) {
                        com.meituan.msc.mmpviews.list.event.c cVar4 = this.A;
                        Object[] objArr4 = {this};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.mmpviews.list.event.c.a;
                        if (PatchProxy.isSupport(objArr4, cVar4, changeQuickRedirect4, false, "2ff57b86030de88f61d77eddb58f7f77", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, cVar4, changeQuickRedirect4, false, "2ff57b86030de88f61d77eddb58f7f77");
                        } else {
                            cVar4.a(this, d.a.SCROLL_TO_LOWER);
                        }
                        this.C = true;
                    }
                    if (this.E.a != 0 || this.D) {
                        return;
                    }
                    com.meituan.msc.mmpviews.list.event.c cVar5 = this.A;
                    Object[] objArr5 = {this};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.mmpviews.list.event.c.a;
                    if (PatchProxy.isSupport(objArr5, cVar5, changeQuickRedirect5, false, "f473f810f446305190534e10f5a6c074", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, cVar5, changeQuickRedirect5, false, "f473f810f446305190534e10f5a6c074");
                    } else {
                        cVar5.a(this, d.a.SCROLL_TO_UPPER);
                    }
                    this.D = true;
                }
            }
        }
    }

    private int a(int[] iArr, boolean z) {
        Object[] objArr = {iArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac17de822ee5b088b88bb55f85bf9426", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac17de822ee5b088b88bb55f85bf9426")).intValue();
        }
        if (iArr.length == 0) {
            return -1;
        }
        if (iArr.length == 1) {
            return iArr[0];
        }
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (z) {
                if (iArr[i2] > i) {
                    i = iArr[i2];
                }
            } else if (iArr[i2] < i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60d4053d788f70a2de1733def74ebd8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60d4053d788f70a2de1733def74ebd8c");
            return;
        }
        super.onScrollStateChanged(i);
        if (this.m) {
            return;
        }
        if (i == 1) {
            this.z = true;
        } else if (i == 2) {
            this.z = true;
        } else if (i == 0) {
            this.z = false;
        }
        this.ae = i;
        int childCount = getLayoutManager().getChildCount();
        if (i != 0 || childCount <= 0) {
            return;
        }
        this.S.d();
        e();
    }

    private MSCListView c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "677e04144bd34a9fa5d4233462ce4bca", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "677e04144bd34a9fa5d4233462ce4bca");
        }
        if (view instanceof MSCListView) {
            return (MSCListView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    MSCListView c = c(viewGroup.getChildAt(i));
                    if (c != null) {
                        return c;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // com.meituan.msc.uimanager.list.b
    public final com.meituan.msc.mmpviews.list.event.g a(int i, View view) {
        MSCListNode d;
        int a2;
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "721d9cc6e86b61b903f1a3ff62b45e2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.mmpviews.list.event.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "721d9cc6e86b61b903f1a3ff62b45e2e");
        }
        Object[] objArr2 = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect2 = j;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eaa33d7ef62fbd5789432a698acb2bf7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.mmpviews.list.event.g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eaa33d7ef62fbd5789432a698acb2bf7");
        }
        if (this.m || (d = d(view)) == null || d.rawData == null || (a2 = this.k.a(d.rawData)) < 0) {
            return null;
        }
        com.meituan.msc.mmpviews.list.event.g gVar = new com.meituan.msc.mmpviews.list.event.g(a2);
        gVar.e = d.templateNode.f;
        MSCListNode a3 = a(i, d);
        if (a3 == null) {
            return null;
        }
        a(a3, gVar, a2, MSCListConstant.a);
        return gVar;
    }

    @Override // com.meituan.msc.uimanager.list.b
    public final void a(View view) {
        int a2;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba7e44d3951ea03d3284d09c9bc13a4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba7e44d3951ea03d3284d09c9bc13a4d");
        } else if (view == null) {
        } else {
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = j;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90c45c6d2241f0604f0890de775b2585", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90c45c6d2241f0604f0890de775b2585")).intValue();
            } else {
                MSCListNode d = d(view);
                a2 = (d == null || d.rawData == null) ? -1 : this.k.a(d.rawData);
            }
            if (this.m) {
                g.b("[MSCListView@notifyListItemChanged] list destroyed", null, Integer.valueOf(a2));
            } else if (a2 < 0) {
            } else {
                this.l.a(a2);
                b();
            }
        }
    }

    private MSCListNode d(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "233b47a956ca4d0964b2a68e2163ec13", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCListNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "233b47a956ca4d0964b2a68e2163ec13");
        }
        while (view != null && view.getTag(R.id.native_component_turbo_node_tag) == null) {
            if (b(view)) {
                return null;
            }
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(R.id.native_component_turbo_node_tag);
        if ((tag instanceof MSCListNode) && (view instanceof com.meituan.msc.mmpviews.list.item.a)) {
            return (MSCListNode) tag;
        }
        return null;
    }

    private MSCListNode a(int i, MSCListNode mSCListNode) {
        Object[] objArr = {Integer.valueOf(i), mSCListNode};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddef6117860a55762b42cab01b39c7c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCListNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddef6117860a55762b42cab01b39c7c5");
        }
        if (mSCListNode == null) {
            return null;
        }
        if (mSCListNode.mReactTag == i) {
            return mSCListNode;
        }
        if (mSCListNode.mChildren == null || mSCListNode.mChildren.size() == 0) {
            return null;
        }
        for (int i2 = 0; i2 < mSCListNode.mChildren.size(); i2++) {
            MSCListNode a2 = a(i, mSCListNode.mChildren.get(i2));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // com.meituan.msc.mmpviews.shell.b
    public f getDelegate() {
        return this.af;
    }

    public void setLowerThreshold(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cad3b585328339e093d82b64be81aba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cad3b585328339e093d82b64be81aba");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.M = i;
    }

    public void setUpperThreshold(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f08d23edcefb38fb2042fd510767a26b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f08d23edcefb38fb2042fd510767a26b");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.L = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e9, code lost:
        if (r16.d == 1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r17, com.meituan.msc.jse.bridge.ReadableMap r18) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.list.msclist.view.MSCListView.a(int, com.meituan.msc.jse.bridge.ReadableMap):void");
    }

    public final JSONObject c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11c0992eb73159b776165887696fd46a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11c0992eb73159b776165887696fd46a");
        }
        e();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("firstVisibleIndex", this.E.a);
            jSONObject.put("lastVisibleIndex", this.E.b);
            jSONObject.put("firstVisibleOffset", this.E.c);
            jSONObject.put("lastVisibleOffset", this.E.d);
        } catch (JSONException e) {
            g.b(this.p, e, "[queryItemVisibility]");
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.s {
        public a(View view) {
            super(view);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f22eea2f143552a87235cfd4215613", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f22eea2f143552a87235cfd4215613");
            return;
        }
        g.d(this.p, "[onDestroy] onDestroy");
        this.m = true;
        if (this.k != null) {
            com.meituan.msc.mmpviews.list.msclist.data.b bVar = this.k;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.list.msclist.data.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "130ae08a25bd3a413fdeca83b883c4d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "130ae08a25bd3a413fdeca83b883c4d9");
            } else {
                bVar.b.clear();
            }
            this.k = null;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = j;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "187dd662c21f9e58bdf490c0a4f53b95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "187dd662c21f9e58bdf490c0a4f53b95");
        } else if (this.H != null && !this.H.isEmpty()) {
            String str = this.p;
            g.d(str, "[clearMSCListNodes] cachedUIImplementation size: " + this.H.size());
            Iterator<com.meituan.msc.uimanager.list.c> it = this.H.iterator();
            while (it.hasNext()) {
                com.meituan.msc.uimanager.list.c next = it.next();
                aa q = next.q();
                if (q == null) {
                    g.a(this.p, "[clearMSCListNodes] rootNode null");
                } else {
                    next.c(q.p());
                    next.u();
                }
            }
            this.H.clear();
            this.H = null;
        }
        if (this.ag != null) {
            this.u.removeLifecycleEventListener(this.ag);
            this.ag = null;
        }
        if (this.u != null) {
            this.u = null;
        }
        if (this.l != null) {
            com.meituan.msc.mmpviews.list.d<a> dVar = this.l;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.mmpviews.list.d.a;
            if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "e767c8088e013c1636e7080ec99068eb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "e767c8088e013c1636e7080ec99068eb");
            } else {
                dVar.b = null;
                dVar.c = null;
            }
            this.l = null;
        }
        if (this.v != null) {
            this.v = null;
        }
        if (this.A != null) {
            this.A = null;
        }
        if (this.s != null) {
            this.s.a();
            this.s = null;
        }
        if (this.B != null) {
            this.B = null;
        }
        if (this.t != null) {
            this.t.clear();
            this.t = null;
        }
    }

    public com.meituan.msc.devsupport.perf.a getMSCListPerfHelper() {
        return this.S;
    }

    public int getOrientation() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61e5108c4743bc4d0d70556ffa4eba49", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61e5108c4743bc4d0d70556ffa4eba49")).booleanValue() : this.k.a(i) != null && this.k.a(i).c;
    }

    private void a(MSCListNode mSCListNode, JSONObject jSONObject) {
        Object[] objArr = {mSCListNode, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e60d87289507bcbdeeb2ff1e32edd8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e60d87289507bcbdeeb2ff1e32edd8c");
        } else if (mSCListNode != null) {
            if ("MSCScrollView".equals(mSCListNode.mViewClass)) {
                JSONObject jSONObject2 = null;
                if (jSONObject != null && jSONObject.has(String.valueOf(mSCListNode.mReactTag)) && jSONObject.opt(String.valueOf(mSCListNode.mReactTag)) != null) {
                    jSONObject2 = jSONObject.optJSONObject(String.valueOf(mSCListNode.mReactTag));
                }
                if (jSONObject2 == null || jSONObject2.length() == 0) {
                    jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("scrollLeft", 0);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                mSCListNode.uiImplementation.a(mSCListNode.mReactTag, mSCListNode.mViewClass, new MSCReadableMap(jSONObject2));
            }
            for (int i = 0; i < mSCListNode.mChildren.size(); i++) {
                a(mSCListNode.mChildren.get(i), jSONObject);
            }
        }
    }

    @Override // com.meituan.msc.mmpviews.list.b
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a1221048af7870409137c987b6b80d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a1221048af7870409137c987b6b80d4")).intValue();
        }
        if (this.m) {
            g.a(this.p, "[getItemCount] list already destroyed");
            return 0;
        }
        return this.k.a();
    }

    public final void a(ReadableArray readableArray) {
        com.meituan.msc.mmpviews.list.msclist.data.a aVar;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f155e15088bedab1becf070d43a489a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f155e15088bedab1becf070d43a489a2");
        } else if (this.m || readableArray == null || readableArray.size() == 0) {
        } else {
            try {
                aVar = this.k.a(getItemCount(), ((MSCReadableArray) readableArray).getRealData());
            } catch (JSONException e) {
                g.b(this.p, e, "[append]");
                aVar = null;
            }
            if (aVar != null) {
                g();
                f();
                this.l.a(aVar.b, aVar.c);
            }
            b();
        }
    }

    public final void b(ReadableArray readableArray) {
        int[] iArr;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd6b217bd406eab01572f70d0809e091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd6b217bd406eab01572f70d0809e091");
        } else if (!this.m && readableArray != null) {
            com.meituan.msc.mmpviews.list.msclist.data.b bVar = this.k;
            JSONArray realData = ((MSCReadableArray) readableArray).getRealData();
            Object[] objArr2 = {realData};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.list.msclist.data.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "8cf5d17799206de83d4e9855ddfb260a", RobustBitConfig.DEFAULT_VALUE)) {
                iArr = (int[]) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "8cf5d17799206de83d4e9855ddfb260a");
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < realData.length(); i++) {
                    JSONArray optJSONArray = realData.optJSONArray(i);
                    if (optJSONArray == null || optJSONArray.length() < 2) {
                        g.d("[DataManager@updates] item to update is not formatted with index and data");
                    } else if (optJSONArray.opt(0) instanceof Integer) {
                        int optInt = optJSONArray.optInt(0);
                        if (optJSONArray.optJSONObject(1) == null) {
                            g.d("[DataManager@updates] item data of " + optInt + " is not an ReadableMap");
                        } else if (bVar.a(optInt, optJSONArray.optJSONObject(1)) && !arrayList.contains(Integer.valueOf(optInt))) {
                            arrayList.add(Integer.valueOf(optInt));
                        }
                    } else {
                        g.d("[DataManager@updates] item data index is not a integer: " + optJSONArray.opt(0));
                    }
                }
                if (arrayList.isEmpty()) {
                    iArr = null;
                } else {
                    iArr = new int[arrayList.size()];
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                    }
                    Arrays.sort(iArr);
                }
            }
            if (iArr == null || iArr.length == 0) {
                return;
            }
            if (iArr.length == 1) {
                this.l.a(iArr[0]);
            } else if (com.meituan.msc.mmpviews.list.common.a.a(iArr)) {
                final com.meituan.msc.mmpviews.list.d<a> dVar = this.l;
                final int i3 = iArr[0];
                final int length = iArr.length;
                Object[] objArr3 = {Integer.valueOf(i3), Integer.valueOf(length)};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.mmpviews.list.d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "ff2543900a78715ef1e70e652cbd420c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "ff2543900a78715ef1e70e652cbd420c");
                } else if (dVar.c()) {
                    dVar.notifyItemRangeChanged(i3, length);
                    dVar.b();
                } else {
                    dVar.a(dVar.b, new Runnable() { // from class: com.meituan.msc.mmpviews.list.d.5
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "89f33f9190e6250d3a98aea7b885be54", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "89f33f9190e6250d3a98aea7b885be54");
                                return;
                            }
                            dVar.notifyItemRangeChanged(i3, length);
                            dVar.b();
                        }
                    });
                }
            } else {
                this.l.a();
            }
            b();
        }
    }

    public final void a(int i, int i2, ReadableArray readableArray) {
        com.meituan.msc.mmpviews.list.msclist.data.a aVar;
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), readableArray};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eb4b004e09cd091409fa4e1dffd9214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eb4b004e09cd091409fa4e1dffd9214");
        } else if (this.m) {
        } else {
            try {
                com.meituan.msc.mmpviews.list.msclist.data.b bVar = this.k;
                JSONArray realData = readableArray == null ? null : ((MSCReadableArray) readableArray).getRealData();
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), realData};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.list.msclist.data.b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "1e3233467d38c540d015b03139239a59", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (com.meituan.msc.mmpviews.list.msclist.data.a) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "1e3233467d38c540d015b03139239a59");
                } else {
                    com.meituan.msc.mmpviews.list.msclist.data.a aVar2 = new com.meituan.msc.mmpviews.list.msclist.data.a();
                    int i4 = i < 0 ? 0 : i;
                    int a2 = bVar.a();
                    if (i4 > a2) {
                        i4 = a2;
                    }
                    aVar2.b = i4;
                    if (realData != null) {
                        i3 = realData.length();
                    }
                    aVar2.c = i3;
                    bVar.a(i4, i2);
                    bVar.a(i4, realData);
                    aVar = aVar2;
                }
                if (aVar != null) {
                    g();
                    f();
                    if (i2 > 0) {
                        this.l.b(i, i2);
                    }
                    if (aVar.c > 0) {
                        this.l.a(aVar.b, aVar.c);
                    }
                }
                b();
            } catch (JSONException e) {
                throw new com.meituan.msc.common.b(e);
            }
        }
    }

    public final void c(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7b961b9aa5e78dec05a5b1500aa896c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7b961b9aa5e78dec05a5b1500aa896c");
        } else if (!this.m && readableArray != null && readableArray.size() != 0) {
            this.k.a();
            final com.meituan.msc.mmpviews.list.msclist.data.b bVar = this.k;
            JSONArray realData = ((MSCReadableArray) readableArray).getRealData();
            Object[] objArr2 = {realData};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.list.msclist.data.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "fb510b44d667b80a145a3962e1413b8d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "fb510b44d667b80a145a3962e1413b8d");
            } else if (bVar.b == null || bVar.b.size() == 0) {
                g.a("[DataSection@removeItems]", "items is null while removeItems");
            } else {
                int a2 = bVar.a();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < realData.length(); i++) {
                    int optInt = realData.optInt(i);
                    if (optInt >= 0 && optInt < a2 && !arrayList.contains(Integer.valueOf(optInt))) {
                        arrayList.add(Integer.valueOf(optInt));
                    }
                }
                Collections.sort(arrayList, new Comparator<Integer>() { // from class: com.meituan.msc.mmpviews.list.msclist.data.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(Integer num, Integer num2) {
                        Integer num3 = num;
                        Integer num4 = num2;
                        Object[] objArr3 = {num3, num4};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "832283efe22d809656d04ecb31e6678e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "832283efe22d809656d04ecb31e6678e")).intValue() : num3.intValue() - num4.intValue();
                    }
                });
                if (arrayList.size() != 0) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        if (intValue >= 0 && intValue < bVar.b.size()) {
                            arrayList2.add(bVar.b.get(intValue));
                        }
                    }
                    bVar.b.removeAll(arrayList2);
                }
            }
            int size = readableArray.size();
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = readableArray.getInt(i2);
            }
            g();
            f();
            if (com.meituan.msc.mmpviews.list.common.a.a(iArr)) {
                this.l.b(iArr[0], size);
            } else {
                this.l.a();
            }
            b();
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52ac659982e4e0fc8d4dd14d7e447a22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52ac659982e4e0fc8d4dd14d7e447a22")).booleanValue();
        }
        if (!this.m && this.f) {
            this.B.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.w) {
                int a2 = (int) (aq.a(this.u, this.B.c * 1000.0f) * (-1.0d));
                g.b(this.p, "[ScrollVelocity]", Integer.valueOf(a2));
                this.S.l.add(Integer.valueOf(a2));
                this.B.a();
                com.meituan.msc.mmpviews.list.event.c cVar = this.A;
                float f = this.B.b;
                float f2 = this.B.c;
                Object[] objArr2 = {this, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.list.event.c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "47b3fcb6c7d8cb92729fd06fd7a53caa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "47b3fcb6c7d8cb92729fd06fd7a53caa");
                } else {
                    cVar.a(this, d.a.END_DRAG, f, f2);
                }
                this.T = false;
                this.w = false;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59eda466930f5627c4e9da7ad80de494", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59eda466930f5627c4e9da7ad80de494")).booleanValue();
        }
        if (!this.m && this.f) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    com.meituan.msc.mmpviews.list.event.c cVar = this.A;
                    Object[] objArr2 = {this};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.list.event.c.a;
                    if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "6d549ee222d27b5967089309c79bd2b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "6d549ee222d27b5967089309c79bd2b1");
                    } else {
                        cVar.a(this, d.a.BEGIN_DRAG);
                    }
                    this.T = false;
                    this.C = false;
                    this.D = false;
                    this.w = true;
                    return true;
                }
            } catch (Throwable th) {
                g.b(this.p, th, "[onInterceptTouchEvent] notify native gesture error");
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    private void e() {
        View view;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3193e177c4fc67cce6effe02e48036b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3193e177c4fc67cce6effe02e48036b9");
        } else if (this.m) {
        } else {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            View view2 = null;
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                this.E.a = linearLayoutManager.findFirstVisibleItemPosition();
                this.E.b = linearLayoutManager.findLastVisibleItemPosition();
                view2 = linearLayoutManager.findViewByPosition(this.E.a);
                view = linearLayoutManager.findViewByPosition(this.E.b);
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
                staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
                this.E.a = a(iArr, false);
                staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
                this.E.b = a(iArr, true);
                view2 = staggeredGridLayoutManager.findViewByPosition(this.E.a);
                view = staggeredGridLayoutManager.findViewByPosition(this.E.b);
            } else {
                view = null;
            }
            this.E.c = view2 == null ? 0 : this.d == 1 ? view2.getTop() : view2.getLeft();
            this.E.d = view == null ? 0 : this.d == 1 ? view.getTop() : view.getLeft();
            this.E.f = view2 == null ? 0 : view2.getWidth();
            this.E.e = view2 == null ? 0 : view2.getHeight();
            this.E.h = view == null ? 0 : view.getWidth();
            this.E.g = view != null ? view.getHeight() : 0;
        }
    }

    @Override // com.meituan.msc.mmpviews.list.c
    public final boolean a(String str, View view) {
        MSCListView c;
        Object[] objArr = {str, view};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a336a5df90ffafe79aa16b965194ef8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a336a5df90ffafe79aa16b965194ef8")).booleanValue();
        }
        if (this.m) {
            return false;
        }
        View view2 = null;
        while (view.getParent() != null && (view.getParent() instanceof View)) {
            if (view instanceof MSCListView) {
                return str.equals(String.valueOf(view.getId()));
            }
            if (b(view)) {
                break;
            }
            if (view instanceof com.meituan.msc.mmpviews.list.item.a) {
                view2 = view;
            }
            view = (View) view.getParent();
        }
        return view2 != null && (view2.getParent() instanceof ViewGroup) && (c = c((ViewGroup) view2.getParent())) != null && str.equals(String.valueOf(c.getId()));
    }

    @Override // com.meituan.msc.mmpviews.list.c
    public final void a(com.meituan.msc.mmpviews.list.event.g gVar) {
        int id;
        boolean z = true;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b787dd53251079d41aa7a85433da3c9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b787dd53251079d41aa7a85433da3c9b");
        } else if (this.m || gVar == null || gVar.i == null) {
        } else {
            if (this.z) {
                gVar.l = true;
                return;
            }
            View view = gVar.i;
            View view2 = null;
            boolean z2 = gVar.c != view.getId();
            while (view.getParent() != null && (view.getParent() instanceof View)) {
                if (view.getTag(R.id.msc_list_view_bind_event_id) != null && !z2 && view2 == null) {
                    view2 = view;
                }
                if (view.getTag(R.id.native_component_turbo_node_tag) != null) {
                    break;
                } else if (b(view)) {
                    return;
                } else {
                    view = (View) view.getParent();
                }
            }
            if (view == null || view.getParent() == null) {
                return;
            }
            Object tag = view.getTag(R.id.native_component_turbo_node_tag);
            if ((tag instanceof MSCListNode) && (view instanceof com.meituan.msc.mmpviews.list.item.a)) {
                MSCListNode mSCListNode = (MSCListNode) tag;
                int a2 = this.k.a(mSCListNode.rawData);
                if (a2 < 0) {
                    return;
                }
                gVar.e = mSCListNode.templateNode.f;
                z = (view2 == null || view2.getTag(R.id.msc_list_view_bind_event_id) == null) ? false : false;
                if (!z2) {
                    id = z ? view2.getId() : mSCListNode.mReactTag;
                } else {
                    id = gVar.c;
                }
                a(a(id, mSCListNode), gVar, a2, "bindtap", "catchtap");
            }
        }
    }

    private void a(MSCListNode mSCListNode, com.meituan.msc.mmpviews.list.event.g gVar, int i, String... strArr) {
        Object[] objArr = {mSCListNode, gVar, Integer.valueOf(i), strArr};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10692d67081a817593efbd23e498c3e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10692d67081a817593efbd23e498c3e9");
        } else if (mSCListNode != null) {
            gVar.g = mSCListNode;
            gVar.b = i;
            gVar.h = getId();
            JSONObject jSONObject = mSCListNode.mProps;
            if (jSONObject != null) {
                for (String str : strArr) {
                    if (jSONObject.has(str)) {
                        gVar.a(str, jSONObject.optString(str));
                    }
                }
                gVar.f = com.meituan.msc.mmpviews.list.common.a.a(mSCListNode.mProps, i);
            }
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d4f9961670102c0d7e47b44a122d4e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d4f9961670102c0d7e47b44a122d4e2");
        } else if (!this.m && TextUtils.equals(this.b, "grid")) {
            for (int i = 0; i < this.k.a(); i++) {
                b.a a2 = this.k.a(i);
                String str = a2.b;
                e eVar = (e) this.r.get(str);
                if (eVar != null) {
                    a2.c = eVar.b(this.u, str, a2.a, this.q);
                }
            }
        }
    }

    private void g() {
        com.meituan.msc.mmpviews.list.sticky.c a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69fc423c37142baaaad5d8bced3b8a3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69fc423c37142baaaad5d8bced3b8a3a");
        } else if (!this.m && this.d != 0) {
            this.U.clear();
            for (int i = 0; i < this.k.a(); i++) {
                b.a a3 = this.k.a(i);
                String str = a3.b;
                e eVar = (e) this.r.get(str);
                if (eVar != null && (a2 = eVar.a(this.u, str, a3.a, this.q)) != null) {
                    a2.a = i;
                    this.U.put(Integer.valueOf(i), a2);
                }
            }
        }
    }

    public void setClassPrefix(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aabc1a7e5764b111d72740d7d2ee4d44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aabc1a7e5764b111d72740d7d2ee4d44");
        } else if (this.m || this.G != null || str == null) {
        } else {
            this.G = str;
            this.K.b = this.G;
        }
    }

    public void setTemplatePath(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2de9a5978e5ab4e20b5820e2a8a99ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2de9a5978e5ab4e20b5820e2a8a99ec");
        } else if (this.m || this.I != null || str == null) {
        } else {
            this.I = this.u.getRuntimeDelegate().tryGetTemplateInfo(str);
            this.q = this.I.a;
            this.r = this.I.c;
        }
    }

    public void setData(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2d6492c67f9e023755d1dadf6c8c242", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2d6492c67f9e023755d1dadf6c8c242");
        } else if (this.m || this.J != null || readableArray == null) {
        } else {
            this.J = readableArray;
        }
    }
}
