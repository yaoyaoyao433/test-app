package com.meituan.android.mrn.component.list.turbo.view;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.scroll.j;
import com.meituan.android.mrn.component.list.BaseListView;
import com.meituan.android.mrn.component.list.MLinearLayoutManager;
import com.meituan.android.mrn.component.list.d;
import com.meituan.android.mrn.component.list.event.c;
import com.meituan.android.mrn.component.list.event.f;
import com.meituan.android.mrn.component.list.event.k;
import com.meituan.android.mrn.component.list.turbo.TurboNode;
import com.meituan.android.mrn.component.list.turbo.data.b;
import com.meituan.android.mrn.component.list.turbo.data.e;
import com.meituan.android.mrn.component.list.turbo.h;
import com.meituan.android.mrn.component.list.turbo.i;
import com.meituan.android.mrn.component.list.turbo.l;
import com.meituan.android.mrn.component.list.turbo.m;
import com.meituan.android.mrn.component.list.turbo.n;
import com.meituan.android.mrn.component.list.turbo.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class TurboListView extends BaseListView implements com.meituan.android.mrn.component.list.a<b>, com.meituan.android.mrn.component.list.b {
    public static ChangeQuickRedirect k;
    ArrayList<TurboNode> A;
    public boolean B;
    final c C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private boolean K;
    private final Runnable L;
    private boolean M;
    private final Runnable N;
    o l;
    e m;
    d<b> n;
    HashMap<String, TurboNode> o;
    n p;
    i q;
    f r;
    l s;
    SparseIntArray t;
    ao u;
    RecyclerView.LayoutManager v;
    ArrayList<k> w;
    com.meituan.android.mrn.component.list.event.b x;
    j y;
    boolean z;

    @Override // com.meituan.android.mrn.component.list.a
    public final /* bridge */ /* synthetic */ boolean a(b bVar) {
        return false;
    }

    @Override // com.meituan.android.mrn.component.list.a
    public final long b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b0dde00a794c9c95eee78040cac5f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b0dde00a794c9c95eee78040cac5f6")).longValue();
        }
        return 0L;
    }

    @Override // com.meituan.android.mrn.component.list.a
    public final /* synthetic */ b a(ViewGroup viewGroup, int i) {
        boolean z;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9919a49c6b63c0102834bc5f7a0bcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9919a49c6b63c0102834bc5f7a0bcf");
        }
        e eVar = this.m;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "2b5da56b22e727170398362e7b417202", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "2b5da56b22e727170398362e7b417202")).booleanValue();
        } else {
            z = eVar.e.indexOfKey(i) >= 0;
        }
        if (z) {
            e eVar2 = this.m;
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            return new b(PatchProxy.isSupport(objArr3, eVar2, changeQuickRedirect3, false, "17b66c2d09391e912c1e04bcf55db235", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr3, eVar2, changeQuickRedirect3, false, "17b66c2d09391e912c1e04bcf55db235") : eVar2.e.get(i, null));
        }
        int i2 = this.t.get(i, -1);
        if (i2 == -1) {
            throw new IllegalStateException("viewType: " + i + ", position is not in cache");
        }
        b.a a2 = this.m.a(i2);
        if (a2 == null) {
            throw new IllegalStateException("viewType: " + i + ", position: " + i2 + ", info is null");
        }
        HashMap hashMap = new HashMap();
        ReadableMap asMap = a2.a.asMap();
        ReadableMapKeySetIterator keySetIterator = asMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, asMap.getDynamic(nextKey));
        }
        TurboNode a3 = com.meituan.android.mrn.component.list.turbo.d.a(com.meituan.android.mrn.component.list.turbo.a.a(hashMap, this.p, this.s, this.u, this.o, this.q, this.r, this.l), this.o.get(a2.b), (TurboNode) null);
        if (a3 == null) {
            throw new NullPointerException("viewType: " + i + ", position: " + i2 + ", createNode result null");
        }
        a3.viewType = i;
        a3.helper = new com.meituan.android.mrn.component.list.turbo.k(this.u, this.s, this.r);
        a3.helper.a(a3, true);
        View a4 = a3.helper.a();
        this.A.add(a3);
        return new b(a4);
    }

    @Override // com.meituan.android.mrn.component.list.a
    public final /* synthetic */ void a(b bVar, int i) {
        int a2;
        boolean z;
        com.meituan.android.mrn.component.list.turbo.data.b b2;
        b bVar2 = bVar;
        boolean z2 = false;
        Object[] objArr = {bVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f16c10f2ad0c2f8a447d4659b00ed59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f16c10f2ad0c2f8a447d4659b00ed59");
            return;
        }
        e eVar = this.m;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "68dc5eb657f96a8f7f66cf423104c70c", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "68dc5eb657f96a8f7f66cf423104c70c")).booleanValue();
        } else {
            int a3 = eVar.b.a();
            z = i < a3 || (i >= (a2 = a3 + eVar.a()) && i < a2 + eVar.c.a());
        }
        if (z) {
            return;
        }
        TurboNode turboNode = (TurboNode) bVar2.itemView.getTag(R.id.native_component_turbo_node_tag);
        com.meituan.android.mrn.component.list.turbo.j jVar = turboNode.helper;
        b.a a4 = this.m.a(i);
        if (a4 == null) {
            throw new IllegalStateException("position: " + i + ", info is null");
        }
        HashMap hashMap = new HashMap();
        ReadableMap asMap = a4.a.asMap();
        ReadableMapKeySetIterator keySetIterator = asMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, asMap.getDynamic(nextKey));
        }
        com.meituan.android.mrn.component.list.turbo.a a5 = com.meituan.android.mrn.component.list.turbo.a.a(hashMap, this.p, this.s, this.u, this.o, this.q, this.r, this.l);
        com.meituan.android.mrn.component.list.turbo.d.a(a5, turboNode, jVar);
        com.meituan.android.mrn.component.list.turbo.d.a(a5, turboNode);
        jVar.a(turboNode, getWidth(), Float.NaN);
        if (!this.i || (b2 = this.m.b(i)) == null) {
            return;
        }
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = k;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c2d79c926bdf708393a51f3a8bfe43d3", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c2d79c926bdf708393a51f3a8bfe43d3")).booleanValue();
        } else if (i != 0) {
            com.meituan.android.mrn.component.list.turbo.data.b b3 = this.m.b(i - 1);
            com.meituan.android.mrn.component.list.turbo.data.b b4 = this.m.b(i);
            if (b3 != b4 && b3 != null && b4 != null) {
                z2 = true;
            }
        } else {
            z2 = this.m.b(i).c;
        }
        if (z2) {
            b2.f = i;
        }
    }

    @Override // com.meituan.android.mrn.component.list.a
    public final /* synthetic */ void b(b bVar) {
        b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4ea756d9178b71ac8d47681c23251c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4ea756d9178b71ac8d47681c23251c0");
            return;
        }
        TurboNode turboNode = (TurboNode) bVar2.itemView.getTag(R.id.native_component_turbo_node_tag);
        if (turboNode != null) {
            com.meituan.android.mrn.component.list.turbo.d.a(turboNode, this.q);
        }
    }

    public static /* synthetic */ boolean a(TurboListView turboListView, boolean z) {
        turboListView.K = false;
        return false;
    }

    public static /* synthetic */ boolean b(TurboListView turboListView, boolean z) {
        turboListView.F = false;
        return false;
    }

    public static /* synthetic */ boolean c(TurboListView turboListView, boolean z) {
        turboListView.E = true;
        return true;
    }

    public TurboListView(ao aoVar) {
        super(aoVar);
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d76e8071cffc3b5509407dd8594a703", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d76e8071cffc3b5509407dd8594a703");
            return;
        }
        this.l = new o();
        this.m = new e();
        this.o = new HashMap<>();
        this.p = new n();
        this.q = new i(100);
        this.t = new SparseIntArray();
        this.w = new ArrayList<>();
        this.x = new com.meituan.android.mrn.component.list.event.b();
        this.y = new j();
        this.G = false;
        this.H = -1;
        this.I = -1;
        this.J = false;
        this.z = false;
        this.A = new ArrayList<>();
        this.K = false;
        this.L = new Runnable() { // from class: com.meituan.android.mrn.component.list.turbo.view.TurboListView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29bcf1c3c5c7e59b5782f0e5cf5d8d54", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29bcf1c3c5c7e59b5782f0e5cf5d8d54");
                    return;
                }
                TurboListView.a(TurboListView.this, false);
                TurboListView.this.measure(View.MeasureSpec.makeMeasureSpec(TurboListView.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(TurboListView.this.getHeight(), 1073741824));
                TurboListView.this.layout(TurboListView.this.getLeft(), TurboListView.this.getTop(), TurboListView.this.getRight(), TurboListView.this.getBottom());
            }
        };
        this.M = false;
        this.B = false;
        this.N = new Runnable() { // from class: com.meituan.android.mrn.component.list.turbo.view.TurboListView.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f22a49040e7b03056c7d8dc5f31c8fb5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f22a49040e7b03056c7d8dc5f31c8fb5");
                    return;
                }
                TurboListView.this.B = false;
                if (TurboListView.this.n != null) {
                    TurboListView.this.n.b();
                }
            }
        };
        this.C = new c() { // from class: com.meituan.android.mrn.component.list.turbo.view.TurboListView.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.component.list.event.c
            public final void a(View view, boolean z, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cbd7181d26b4762a9c943f3fa52da84e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cbd7181d26b4762a9c943f3fa52da84e");
                } else if (TurboListView.this.B) {
                } else {
                    TurboListView.this.B = true;
                    TurboListView.this.post(TurboListView.this.N);
                }
            }
        };
        this.u = aoVar;
        this.n = new d<>(aoVar, this);
        setAdapter(this.n);
        this.s = new m(new com.facebook.react.uimanager.n(((UIManagerModule) aoVar.getNativeModule(UIManagerModule.class)).getUIImplementation()));
    }

    @Override // com.meituan.android.mrn.component.list.BaseListView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798bd44ada90e390e990bbf6b8db69d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798bd44ada90e390e990bbf6b8db69d8");
            return;
        }
        if (TextUtils.equals(this.b, "grid")) {
            this.v = new GridLayoutManager(this.u, this.c, this.d, this.e);
        } else if (TextUtils.equals(this.b, "stagger")) {
            this.v = new StaggeredGridLayoutManager(this.c, this.d);
        } else {
            MLinearLayoutManager mLinearLayoutManager = new MLinearLayoutManager(this.u, this.d, this.e);
            mLinearLayoutManager.setItemPrefetchEnabled(false);
            addItemDecoration(new a());
            this.v = mLinearLayoutManager;
        }
        setLayoutManager(this.v);
        setItemViewCacheSize(0);
        this.v.setAutoMeasureEnabled(true);
        setItemAnimator(null);
    }

    @Override // com.meituan.android.mrn.component.list.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce1134fcef3998b82e5d749763cb099d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce1134fcef3998b82e5d749763cb099d")).intValue();
        }
        int a2 = this.m.a(i, this.p, this.s, this.u, this.o, this.q, this.l, this.r);
        this.t.put(a2, i);
        getRecycledViewPool().a(a2, 10);
        return a2;
    }

    @Override // com.meituan.android.mrn.component.list.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37949a12e9af6d49bbd897af569f451a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37949a12e9af6d49bbd897af569f451a")).intValue();
        }
        e eVar = this.m;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        return PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "7fb08a849b95b7fb793a4c90e9bbb638", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "7fb08a849b95b7fb793a4c90e9bbb638")).intValue() : eVar.b.a() + eVar.a() + eVar.c.a();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa88fa4e0cd1d4a14f7473988223e1ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa88fa4e0cd1d4a14f7473988223e1ef");
            return;
        }
        super.requestLayout();
        if (this.K) {
            return;
        }
        this.K = true;
        post(this.L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08534a7b5f8b4e3a5e2bd9f33f2aa02e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08534a7b5f8b4e3a5e2bd9f33f2aa02e");
            return;
        }
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            if (map != null) {
                String string = map.getString("tplId");
                ReadableMap map2 = map.getMap("dsl");
                Object[] objArr2 = {string};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.component.list.turbo.b.a;
                com.meituan.android.mrn.component.list.turbo.b bVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "23eb57d21fad56a69a4241267536393b", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.mrn.component.list.turbo.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "23eb57d21fad56a69a4241267536393b") : new com.meituan.android.mrn.component.list.turbo.b(new h(), new HashMap(), string);
                com.meituan.android.mrn.component.list.turbo.e.a(bVar, map2, null);
                this.o.putAll(bVar.b);
            }
        }
    }

    public final void a(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "551b6925846e8d92a7ac8a890ff7d383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "551b6925846e8d92a7ac8a890ff7d383");
            return;
        }
        int b2 = this.m.b(i, i2);
        if (z) {
            smoothScrollToPosition(b2);
        } else {
            scrollToPosition(b2);
            this.n.b();
            scrollBy(0, 0);
        }
        int i3 = b2 - this.H;
        if (i3 < 0 || i3 >= getChildCount()) {
            return;
        }
        int top = getChildAt(i3).getTop();
        int left = getChildAt(i3).getLeft();
        if (z) {
            if (this.d == 1) {
                left = 0;
            }
            if (this.d != 1) {
                top = 0;
            }
            smoothScrollBy(left, top);
            return;
        }
        if (this.d == 1) {
            left = 0;
        }
        if (this.d != 1) {
            top = 0;
        }
        scrollBy(left, top);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d427f139dc2c80396538a2173d127b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d427f139dc2c80396538a2173d127b5");
            return;
        }
        super.onAttachedToWindow();
        ViewGroup viewGroup = this;
        while (!(viewGroup instanceof ReactRootView) && (viewGroup = (ViewGroup) viewGroup.getParent()) != null) {
        }
        this.r = new f(viewGroup, ((UIManagerModule) this.u.getNativeModule(UIManagerModule.class)).getEventDispatcher());
        if (viewGroup != null) {
            try {
                ReactRootView reactRootView = (ReactRootView) viewGroup;
                Field declaredField = ReactRootView.class.getDeclaredField("mJSTouchDispatcher");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(reactRootView);
                if (obj instanceof f) {
                    ((f) obj).a(this, this);
                    return;
                }
                this.r.a(this, this);
                declaredField.set(reactRootView, this.r);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ec7f209c27bb70b2c51922bebdf98d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ec7f209c27bb70b2c51922bebdf98d9");
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            com.facebook.react.uimanager.n a2 = this.s != null ? this.s.a() : null;
            if (a2 != null) {
                a2.b();
            }
        } catch (Throwable th) {
            com.facebook.common.logging.a.d("[TurboListView@onLayout]", null, th);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    @SuppressLint({"LongLogTag"})
    public void onScrollStateChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f172d3f4b39aa99c7a240543715928e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f172d3f4b39aa99c7a240543715928e6");
            return;
        }
        super.onScrollStateChanged(i);
        if (this.J || Build.VERSION.SDK_INT < 18) {
            return;
        }
        setClipBounds(new Rect(0, 0, getWidth(), getHeight()));
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e749691908aa8359e6d8869a8446ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e749691908aa8359e6d8869a8446ac")).booleanValue();
        }
        if (this.f) {
            this.y.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.D) {
                this.x.b(this, this.y.a(), this.y.b());
                this.D = false;
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
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab3f13fbc87e9d1e3a302e8c3bfe7871", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab3f13fbc87e9d1e3a302e8c3bfe7871")).booleanValue();
        }
        if (this.f) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    com.facebook.react.uimanager.events.e.a(this, motionEvent);
                    this.x.a(this);
                    this.G = false;
                    this.D = true;
                    return true;
                }
            } catch (Throwable th) {
                com.facebook.common.logging.a.d("[TurboListView@onInterceptTouchEvent]", "notify native gesture error: ", th);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a5b9afbef93d5ad6139b67861dddaa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a5b9afbef93d5ad6139b67861dddaa")).booleanValue();
        }
        boolean fling = super.fling(i, i2);
        if (this.h) {
            this.x.c(this, i, i2);
            ViewCompat.postOnAnimationDelayed(this, new Runnable() { // from class: com.meituan.android.mrn.component.list.turbo.view.TurboListView.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75d3fa24cfb973d7d9c85204457c94ac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75d3fa24cfb973d7d9c85204457c94ac");
                    } else if (TurboListView.this.E) {
                        TurboListView.b(TurboListView.this, false);
                        TurboListView.this.x.b(TurboListView.this);
                    } else {
                        TurboListView.c(TurboListView.this, true);
                        ViewCompat.postOnAnimationDelayed(TurboListView.this, this, 20L);
                    }
                }
            }, 20L);
        }
        return fling;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90868e9e35fdfef72a748699ab39b39e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90868e9e35fdfef72a748699ab39b39e");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.F) {
            this.E = false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        View childAt;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6bc39845f5c2275758d05e49501561b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6bc39845f5c2275758d05e49501561b");
            return;
        }
        super.onScrolled(i, i2);
        if (!this.M && i2 != 0) {
            this.M = true;
        }
        if (this.x.a(i, i2)) {
            int computeVerticalScrollOffset = this.d == 1 ? computeVerticalScrollOffset() : computeHorizontalScrollOffset();
            this.x.a(this, this.x.b, this.x.c);
            if (getLayoutManager() instanceof LinearLayoutManager) {
                this.H = ((LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition();
                this.I = ((LinearLayoutManager) getLayoutManager()).findLastVisibleItemPosition();
            } else {
                int[] iArr = new int[((StaggeredGridLayoutManager) getLayoutManager()).getSpanCount()];
                ((StaggeredGridLayoutManager) getLayoutManager()).findFirstVisibleItemPositions(iArr);
                this.H = iArr[0];
                ((StaggeredGridLayoutManager) getLayoutManager()).findLastVisibleItemPositions(iArr);
                this.I = iArr[((StaggeredGridLayoutManager) getLayoutManager()).getSpanCount() - 1];
            }
            if (this.m.a() > 0 && !this.G && (getItemCount() - 1) - this.I <= this.g * ((this.I - this.H) + 1) && (childAt = getChildAt(getChildCount() - 1)) != null) {
                this.x.a(this, (childAt.getBottom() - getHeight()) + (((computeVerticalScrollOffset + childAt.getBottom()) / (this.I + 1)) * ((getItemCount() - 1) - this.I)));
                this.G = true;
            }
            WritableArray createArray = Arguments.createArray();
            WritableArray createArray2 = Arguments.createArray();
            ArrayList<k> arrayList = this.w;
            this.w = new ArrayList<>();
            for (int i3 = this.H; i3 <= this.I; i3++) {
                int[] c = this.m.c(i3);
                if (c == null) {
                    c = new int[]{-1, -1};
                }
                k kVar = new k(c.length > 0 ? c[0] : -1, c.length > 1 ? c[1] : -1);
                if (kVar.b >= 0 && kVar.c >= 0) {
                    kVar.d = Boolean.TRUE;
                    this.w.add(kVar);
                    createArray.pushMap(kVar.b());
                    if (arrayList.contains(kVar)) {
                        arrayList.remove(kVar);
                    } else {
                        createArray2.pushMap(kVar.b());
                    }
                }
            }
            Iterator<k> it = arrayList.iterator();
            while (it.hasNext()) {
                k next = it.next();
                next.d = Boolean.FALSE;
                createArray2.pushMap(next.b());
            }
            if (createArray.size() <= 0 || createArray.size() <= 0) {
                return;
            }
            this.x.a(this, createArray, createArray2);
        }
    }

    @Override // com.meituan.android.mrn.component.list.b
    public final k c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02304b9e5a1fada53799b141e38eff0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02304b9e5a1fada53799b141e38eff0f");
        }
        k a2 = k.a();
        if (this.z) {
            return a2;
        }
        View findViewById = findViewById(i);
        com.meituan.android.mrn.component.Touchable.b bVar = null;
        if (findViewById == null) {
            return a2;
        }
        while (findViewById.getParent() != null && (findViewById.getParent() instanceof View)) {
            if ((findViewById instanceof com.meituan.android.mrn.component.Touchable.b) && bVar == null) {
                bVar = (com.meituan.android.mrn.component.Touchable.b) findViewById;
                bVar.b = true;
            }
            if (findViewById.getTag(R.id.native_component_turbo_node_tag) != null) {
                break;
            } else if (findViewById.getClass().getSimpleName().equals("MRNRootView")) {
                return a2;
            } else {
                findViewById = (View) findViewById.getParent();
            }
        }
        if (findViewById == null || findViewById.getParent() == null) {
            return a2;
        }
        Object tag = findViewById.getTag(R.id.native_component_turbo_node_tag);
        if ((tag instanceof TurboNode) && (findViewById instanceof com.meituan.android.mrn.component.list.item.e)) {
            TurboNode turboNode = (TurboNode) tag;
            int[] c = this.m.c(getChildViewHolder(findViewById).getAdapterPosition());
            if (c != null && c.length > 1) {
                a2 = new k(c[0], c[1]);
            }
            if (bVar != null && bVar.getTag(R.id.native_component_turbo_event_id) != null) {
                a2.e = ((Integer) bVar.getTag(R.id.native_component_turbo_event_id)).intValue();
            } else {
                a2.e = turboNode.mEventId;
            }
            return a2;
        }
        return a2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.s {
        public b(View view) {
            super(view);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.f {
        public static ChangeQuickRedirect a;
        private Paint c;

        public a() {
            Object[] objArr = {TurboListView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33e7084ec65f763a7d522b4c17f4cf09", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33e7084ec65f763a7d522b4c17f4cf09");
                return;
            }
            this.c = new Paint();
            this.c.setAntiAlias(true);
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Object[] objArr = {rect, view, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeaa32095f2f74dd1bdad2a6af583e47", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeaa32095f2f74dd1bdad2a6af583e47");
            } else {
                super.getItemOffsets(rect, view, recyclerView, state);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            Object[] objArr = {canvas, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34d72e1c152b8653d9c71d8f3a243e92", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34d72e1c152b8653d9c71d8f3a243e92");
            } else {
                super.onDraw(canvas, recyclerView, state);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            com.meituan.android.mrn.component.list.turbo.data.b bVar;
            View childAt;
            int childAdapterPosition;
            int screenHeight;
            int i = 1;
            Object[] objArr = {canvas, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "144a17306333c996c934f5922bd3c162", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "144a17306333c996c934f5922bd3c162");
                return;
            }
            super.onDrawOver(canvas, recyclerView, state);
            if (TurboListView.this.i && TurboListView.this.M) {
                int c = state.c();
                int childCount = recyclerView.getChildCount();
                com.meituan.android.mrn.component.list.turbo.data.b bVar2 = null;
                int i2 = 0;
                while (i2 < childCount) {
                    try {
                        childAt = recyclerView.getChildAt(i2);
                        childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                    } catch (Throwable th) {
                        th = th;
                        bVar = bVar2;
                    }
                    if (childAdapterPosition < 0) {
                        i2++;
                        i = 1;
                    } else {
                        bVar = TurboListView.this.m.b(childAdapterPosition);
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (!com.meituan.android.mrn.component.list.common.b.a(bVar2, bVar) && bVar != null && bVar.c) {
                            Bitmap bitmap = bVar.e;
                            if (bitmap != null) {
                                screenHeight = bitmap.getHeight();
                            } else {
                                TurboListView turboListView = TurboListView.this;
                                Object[] objArr2 = new Object[i];
                                objArr2[0] = Integer.valueOf(childAdapterPosition);
                                ChangeQuickRedirect changeQuickRedirect2 = TurboListView.k;
                                if (PatchProxy.isSupport(objArr2, turboListView, changeQuickRedirect2, false, "dcf115492bac52471a42d96e29f3de47", RobustBitConfig.DEFAULT_VALUE)) {
                                    screenHeight = ((Integer) PatchProxy.accessDispatch(objArr2, turboListView, changeQuickRedirect2, false, "dcf115492bac52471a42d96e29f3de47")).intValue();
                                } else {
                                    View findViewByPosition = turboListView.getLayoutManager().findViewByPosition(childAdapterPosition);
                                    if (findViewByPosition != null) {
                                        TurboNode turboNode = (TurboNode) findViewByPosition.getTag(R.id.native_component_turbo_node_tag);
                                        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) turboListView.s.a(turboNode.mReactTag);
                                        if (reactShadowNodeImpl == null) {
                                            Log.e("Raphael", "[MListView@getYogaHeight] node is null, tag: " + turboNode);
                                        } else {
                                            screenHeight = reactShadowNodeImpl.getScreenHeight();
                                        }
                                    }
                                    screenHeight = 0;
                                }
                            }
                            int left = childAt.getLeft();
                            childAt.getWidth();
                            int max = Math.max(0, childAt.getTop());
                            int bottom = childAt.getBottom();
                            int i3 = childAdapterPosition + 1;
                            if (i3 < c) {
                                com.meituan.android.mrn.component.list.turbo.data.b b = TurboListView.this.m.b(i3);
                                View childAt2 = recyclerView.getChildAt(i2 + 1);
                                if (childAt2 != null) {
                                    if (!com.meituan.android.mrn.component.list.common.b.a(b, bVar) && childAt2.getTop() < screenHeight) {
                                        max = bottom - screenHeight;
                                    }
                                }
                            }
                            View findViewByPosition2 = TurboListView.this.v.findViewByPosition(bVar.f);
                            if (findViewByPosition2 != null) {
                                try {
                                    findViewByPosition2.setDrawingCacheEnabled(true);
                                    bitmap = findViewByPosition2.getDrawingCache();
                                    bVar.e = Bitmap.createBitmap(bitmap);
                                } catch (Throwable th3) {
                                    th = th3;
                                    com.facebook.common.logging.a.d("[TurboListStickyItemDecoration@onDrawOver]", "t: ", th);
                                    bVar2 = bVar;
                                    i2++;
                                    i = 1;
                                }
                            }
                            if (bitmap != null) {
                                canvas.drawBitmap(bitmap, left, max, this.c);
                            }
                            bVar2 = bVar;
                            i2++;
                            i = 1;
                        }
                        bVar2 = bVar;
                        i2++;
                        i = 1;
                    }
                }
            }
        }
    }

    public l getUiOperator() {
        return this.s;
    }
}
