package com.meituan.android.mrn.component.list;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.n;
import com.facebook.react.views.scroll.j;
import com.meituan.android.mrn.component.Touchable.MTouchableOpacityManager;
import com.meituan.android.mrn.component.list.event.h;
import com.meituan.android.mrn.component.list.event.k;
import com.meituan.android.mrn.component.list.node.ListItemNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MListView extends BaseListView implements LifecycleEventListener, com.meituan.android.mrn.component.list.a<c>, b {
    public static ChangeQuickRedirect k;
    public f A;
    boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private int G;
    private int H;
    private Object I;
    private ArrayList<View> J;
    private boolean K;
    private e L;
    private com.meituan.android.mrn.component.list.event.c M;
    private boolean N;
    j l;
    ao m;
    RecyclerView.LayoutManager n;
    d o;
    volatile SparseArray<ListItemNode> p;
    ArrayList<k> q;
    n r;
    com.meituan.android.mrn.component.list.event.b s;
    volatile HashMap<String, com.meituan.android.mrn.component.list.node.b> t;
    @GuardedBy("mSectionOperationLock")
    volatile ArrayList<com.meituan.android.mrn.component.list.node.c> u;
    com.meituan.android.mrn.component.list.node.c v;
    com.meituan.android.mrn.component.list.node.c w;
    ArrayList<View> x;
    com.meituan.android.mrn.component.list.event.f y;
    com.facebook.react.uimanager.events.c z;

    @Override // com.meituan.android.mrn.component.list.a
    public final /* bridge */ /* synthetic */ boolean a(c cVar) {
        return false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public static /* synthetic */ boolean a(MListView mListView, boolean z) {
        mListView.E = false;
        return false;
    }

    public static /* synthetic */ boolean b(MListView mListView, boolean z) {
        mListView.D = true;
        return true;
    }

    public static /* synthetic */ boolean c(MListView mListView, boolean z) {
        mListView.N = false;
        return false;
    }

    @Override // com.meituan.android.mrn.component.list.a
    public final /* synthetic */ void b(c cVar) {
        ViewOverlay overlay;
        c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fedb71ba2235c005b0a4dec9d8df0910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fedb71ba2235c005b0a4dec9d8df0910");
        } else if (cVar2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar2, changeQuickRedirect2, false, "1a0c70fad2e5f75ca11df4b9179251b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect2, false, "1a0c70fad2e5f75ca11df4b9179251b6");
            } else if (cVar2.itemView == null || Build.VERSION.SDK_INT < 18 || (overlay = cVar2.itemView.getOverlay()) == null) {
            } else {
                overlay.clear();
            }
        }
    }

    public MListView(ao aoVar) {
        this(aoVar, null);
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8ef78b2a5d0f5a31d33c229fcc945a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8ef78b2a5d0f5a31d33c229fcc945a1");
        }
    }

    private MListView(ao aoVar, @Nullable AttributeSet attributeSet) {
        this(aoVar, null, 0);
        Object[] objArr = {aoVar, null};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2133ee96ea237d09847b5201a844f2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2133ee96ea237d09847b5201a844f2e");
        }
    }

    private MListView(ao aoVar, @Nullable AttributeSet attributeSet, int i) {
        super(aoVar, attributeSet, 0);
        Object[] objArr = {aoVar, attributeSet, 0};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b96a337aec8ec16fae73f2efa7797bc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b96a337aec8ec16fae73f2efa7797bc4");
            return;
        }
        this.l = new j();
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = new SparseArray<>();
        this.q = new ArrayList<>();
        this.s = new com.meituan.android.mrn.component.list.event.b();
        this.F = false;
        this.G = -1;
        this.H = -1;
        this.t = new HashMap<>();
        this.I = new Object();
        this.u = new ArrayList<>();
        this.v = new com.meituan.android.mrn.component.list.node.c();
        this.w = new com.meituan.android.mrn.component.list.node.c();
        this.x = new ArrayList<>();
        this.J = new ArrayList<>();
        this.K = false;
        this.A = new f();
        this.B = false;
        this.M = new com.meituan.android.mrn.component.list.event.c() { // from class: com.meituan.android.mrn.component.list.MListView.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.component.list.event.c
            public final void a(View view, boolean z, int i2, int i3, int i4, int i5) {
                Object[] objArr2 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52a797e6e4c5af89a342175b5d2384aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52a797e6e4c5af89a342175b5d2384aa");
                } else {
                    MListView.this.post(new Runnable() { // from class: com.meituan.android.mrn.component.list.MListView.3.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "213fb3bdcecdf926133e60a3631b643b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "213fb3bdcecdf926133e60a3631b643b");
                            } else if (MListView.this.o != null) {
                                MListView.this.o.b();
                            }
                        }
                    });
                }
            }
        };
        this.N = false;
        this.m = aoVar;
        this.r = new n(((UIManagerModule) this.m.getNativeModule(UIManagerModule.class)).getUIImplementation());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2672d7c10c5b7613a489491cc8b0df4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2672d7c10c5b7613a489491cc8b0df4");
            return;
        }
        setHasFixedSize(true);
        setOverScrollMode(2);
        this.o = new d(this.m, this);
        setAdapter(this.o);
        this.z = ((UIManagerModule) this.m.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.v.e = "ListHeader";
        this.w.e = "ListFooter";
        setItemAnimator(null);
    }

    @Override // com.meituan.android.mrn.component.list.BaseListView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80bb5bd8ecde7493f9b060b637aaea41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80bb5bd8ecde7493f9b060b637aaea41");
            return;
        }
        if (TextUtils.equals(this.b, "grid")) {
            this.n = new GridLayoutManager(this.m, this.c, this.d, this.e);
        } else if (TextUtils.equals(this.b, "stagger")) {
            this.n = new StaggeredGridLayoutManager(this.c, this.d);
            this.L = new e(this.j, this.x.size(), this.J.size());
            addItemDecoration(this.L);
        } else {
            this.n = new MLinearLayoutManager(this.m, this.d, this.e);
            ((MLinearLayoutManager) this.n).setRecycleChildrenOnDetach(true);
            addItemDecoration(new a());
        }
        setLayoutManager(this.n);
        this.n.setAutoMeasureEnabled(true);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bbf48631222865c7d983da752e8c5ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bbf48631222865c7d983da752e8c5ba");
            return;
        }
        super.onAttachedToWindow();
        ViewGroup viewGroup = this;
        while (!(viewGroup instanceof ReactRootView) && (viewGroup = (ViewGroup) viewGroup.getParent()) != null) {
        }
        this.y = new com.meituan.android.mrn.component.list.event.f(viewGroup, this.z);
        if (viewGroup != null) {
            try {
                ReactRootView reactRootView = (ReactRootView) viewGroup;
                Field declaredField = ReactRootView.class.getDeclaredField("mJSTouchDispatcher");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(reactRootView);
                if (obj instanceof com.meituan.android.mrn.component.list.event.f) {
                    ((com.meituan.android.mrn.component.list.event.f) obj).a(this, this);
                    return;
                }
                this.y.a(this, this);
                declaredField.set(reactRootView, this.y);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cb1a016ba5c65cb2bcaca3164ef8af9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cb1a016ba5c65cb2bcaca3164ef8af9");
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            if (this.r != null) {
                this.r.b();
            }
        } catch (Throwable th) {
            com.facebook.common.logging.a.d("[MListView@onLayout]", null, th);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    @SuppressLint({"LongLogTag"})
    public void onScrollStateChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f09c612b8b2ea3a13fbb9d0e4db2ba0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f09c612b8b2ea3a13fbb9d0e4db2ba0f");
            return;
        }
        super.onScrollStateChanged(i);
        if (this.K || Build.VERSION.SDK_INT < 18) {
            return;
        }
        setClipBounds(new Rect(0, 0, getWidth(), getHeight()));
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec6ba56a5e6ada3d3ab2fac3f5de72d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec6ba56a5e6ada3d3ab2fac3f5de72d0")).booleanValue();
        }
        if (this.f) {
            this.l.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.C) {
                this.s.b(this, this.l.a(), this.l.b());
                this.C = false;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aae0bb2581d509f5c5f1c9a7cc2d9039", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aae0bb2581d509f5c5f1c9a7cc2d9039")).booleanValue();
        }
        if (this.f) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    com.facebook.react.uimanager.events.e.a(this, motionEvent);
                    this.s.a(this);
                    this.F = false;
                    this.C = true;
                    return true;
                }
            } catch (IllegalArgumentException e) {
                com.facebook.common.logging.a.d("[MListView@onInterceptTouchEvent]", "Error intercepting touch event:" + e);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fb199b48997b9b8e72cbef0e206fa0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fb199b48997b9b8e72cbef0e206fa0d")).booleanValue();
        }
        boolean fling = super.fling(i, i2);
        if (this.h) {
            this.s.c(this, i, i2);
            ViewCompat.postOnAnimationDelayed(this, new Runnable() { // from class: com.meituan.android.mrn.component.list.MListView.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58ff08c02c737bcb452529644569ed6a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58ff08c02c737bcb452529644569ed6a");
                    } else if (MListView.this.D) {
                        MListView.a(MListView.this, false);
                        MListView.this.s.b(MListView.this);
                    } else {
                        MListView.b(MListView.this, true);
                        ViewCompat.postOnAnimationDelayed(MListView.this, this, 20L);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac7bce115e319d8026176413cc84eb53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac7bce115e319d8026176413cc84eb53");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.E) {
            this.D = false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        k e;
        View childAt;
        int i3 = 1;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e71a347cc12620fe3a41464cef82d442", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e71a347cc12620fe3a41464cef82d442");
            return;
        }
        super.onScrolled(i, i2);
        if (this.s.a(i, i2)) {
            int computeVerticalScrollOffset = this.d == 1 ? computeVerticalScrollOffset() : computeHorizontalScrollOffset();
            this.s.a(this, this.s.b, this.s.c);
            if (getLayoutManager() instanceof LinearLayoutManager) {
                this.G = ((LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition();
                this.H = ((LinearLayoutManager) getLayoutManager()).findLastVisibleItemPosition();
            } else {
                int[] iArr = new int[((StaggeredGridLayoutManager) getLayoutManager()).getSpanCount()];
                ((StaggeredGridLayoutManager) getLayoutManager()).findFirstVisibleItemPositions(iArr);
                this.G = iArr[0];
                ((StaggeredGridLayoutManager) getLayoutManager()).findLastVisibleItemPositions(iArr);
                this.H = iArr[((StaggeredGridLayoutManager) getLayoutManager()).getSpanCount() - 1];
            }
            if (!this.F && (getItemCount() - 1) - this.H <= this.g * ((this.H - this.G) + 1) && (childAt = getChildAt(getChildCount() - 1)) != null) {
                this.s.a(this, (childAt.getBottom() - getHeight()) + (((computeVerticalScrollOffset + childAt.getBottom()) / (this.H + 1)) * ((getItemCount() - 1) - this.H)));
                this.F = true;
            }
            WritableArray createArray = Arguments.createArray();
            WritableArray createArray2 = Arguments.createArray();
            ArrayList<k> arrayList = this.q;
            this.q = new ArrayList<>();
            int i4 = this.G;
            while (i4 <= this.H) {
                Object[] objArr2 = new Object[i3];
                objArr2[0] = Integer.valueOf(i4);
                ChangeQuickRedirect changeQuickRedirect2 = k;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f9e646bb647d60563c8fc116d6b707b", RobustBitConfig.DEFAULT_VALUE)) {
                    e = (k) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f9e646bb647d60563c8fc116d6b707b");
                } else {
                    e = e(i4);
                    if (e == null) {
                        e = null;
                    } else {
                        int i5 = e.b;
                        int i6 = e.c;
                        e.b = i5 - 1;
                        e.c = i6 - (this.u.get(i5).b == null ? 0 : 1);
                    }
                }
                if (e != null && e.b >= 0 && e.c >= 0) {
                    e.d = Boolean.TRUE;
                    this.q.add(e);
                    createArray.pushMap(e.b());
                    if (arrayList.contains(e)) {
                        arrayList.remove(e);
                    } else {
                        createArray2.pushMap(e.b());
                    }
                }
                i4++;
                i3 = 1;
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
            this.s.a(this, createArray, createArray2);
        }
    }

    private void a(ListItemNode listItemNode, com.facebook.react.uimanager.c cVar, String str) {
        float f;
        Object[] objArr = {listItemNode, cVar, str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d85afd991505620a58c24896bdf3a3d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d85afd991505620a58c24896bdf3a3d9");
            return;
        }
        listItemNode.g = getId();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = ListItemNode.l;
        if (PatchProxy.isSupport(objArr2, listItemNode, changeQuickRedirect2, false, "fcfd202986a648f10c50d99e6ea2f361", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, listItemNode, changeQuickRedirect2, false, "fcfd202986a648f10c50d99e6ea2f361");
        } else {
            listItemNode.n.clear();
            Object[] objArr3 = {listItemNode};
            ChangeQuickRedirect changeQuickRedirect3 = ListItemNode.l;
            if (PatchProxy.isSupport(objArr3, listItemNode, changeQuickRedirect3, false, "230467987a014481fd4918fb12b2afcf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, listItemNode, changeQuickRedirect3, false, "230467987a014481fd4918fb12b2afcf");
            } else {
                listItemNode.a(listItemNode, 2);
            }
        }
        int b = listItemNode.b();
        if (this.p.get(b) == null) {
            this.p.put(b, listItemNode);
        }
        b(listItemNode);
        Object[] objArr4 = {listItemNode, cVar, str};
        ChangeQuickRedirect changeQuickRedirect4 = k;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "007626f5c332cc45dbe60ffc6a2eebc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "007626f5c332cc45dbe60ffc6a2eebc9");
        } else if (listItemNode != null) {
            try {
                float f2 = Float.NaN;
                if (this.d == 1) {
                    f = getWidth() / this.c;
                } else {
                    f2 = getHeight() / this.c;
                    f = Float.NaN;
                }
                this.r.a(listItemNode.d, f, f2, cVar);
            } catch (Throwable th) {
                com.facebook.common.logging.a.d("[MListView@run] ", str + " : " + listItemNode + StringUtil.CRLF_STRING + Log.getStackTraceString(th));
            }
        }
    }

    @Override // com.meituan.android.mrn.component.list.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94a66198f58b1f2748502bd362f09fe9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94a66198f58b1f2748502bd362f09fe9")).intValue();
        }
        ListItemNode d = d(i);
        if (d == null) {
            return -1;
        }
        int b = d.b();
        if (b == -1) {
            Log.e("ViewHolder", "[MListView@getItemViewType] viewType: " + b);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListItemNode d(final int i) {
        ReadableMap map;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "338cd370ad328975aa71321caae02d24", RobustBitConfig.DEFAULT_VALUE)) {
            return (ListItemNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "338cd370ad328975aa71321caae02d24");
        }
        k e = e(i);
        if (e == null) {
            return null;
        }
        com.meituan.android.mrn.component.list.node.c cVar = this.u.get(e.b);
        synchronized (cVar) {
            final ListItemNode listItemNode = cVar.d().get(e.c);
            if (listItemNode == null) {
                int i2 = e.c - (cVar.b == null ? 0 : 1);
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.component.list.node.c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "e0f46ee1597937ac772fd49f04994b0d", RobustBitConfig.DEFAULT_VALUE)) {
                    map = (ReadableMap) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "e0f46ee1597937ac772fd49f04994b0d");
                } else if (cVar.f == null) {
                    com.facebook.common.logging.a.d("[Section@getItemData]", "mData is null while getItemData");
                    map = null;
                } else {
                    map = cVar.f.getMap(i2);
                }
                if (map == null) {
                    return null;
                }
                f fVar = this.A;
                ao aoVar = this.m;
                if (!fVar.b && !fVar.c) {
                    fVar.b = true;
                }
                String string = map.getString("tplId");
                long elapsedRealtime = SystemClock.elapsedRealtime();
                listItemNode = (ListItemNode) ListItemNode.a(this.t.get(string).c, map.toHashMap(), ListItemNode.class);
                long a2 = a("ListItemNode.fromDSL", elapsedRealtime);
                listItemNode.a(cVar);
                listItemNode.o = string;
                a(listItemNode, new com.facebook.react.uimanager.c() { // from class: com.meituan.android.mrn.component.list.MListView.2
                    public static ChangeQuickRedirect a;

                    @Override // com.facebook.react.uimanager.c
                    public final void a(float f, float f2) {
                        Object[] objArr3 = {Float.valueOf(f), Float.valueOf(f2)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "41d208f8d67f74dd438ecbf483406b91", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "41d208f8d67f74dd438ecbf483406b91");
                            return;
                        }
                        listItemNode.r = f;
                        listItemNode.q = f2;
                        if (f == 0.0f || f2 == 0.0f) {
                            com.facebook.common.logging.a.d("[MListView@onFinishCalculation]", "calculateItem: " + i + ", " + f + " x " + f2);
                        }
                    }
                }, "calculate item " + i);
                cVar.a(i2, listItemNode);
                a("handleItem", a2);
            }
            return listItemNode;
        }
    }

    @Override // com.meituan.android.mrn.component.list.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8b15d943a84ac8060bbf8cb79ef93b3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8b15d943a84ac8060bbf8cb79ef93b3")).intValue() : b(0, this.u.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(int i, int i2) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d132f492904089df4888f280deb957d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d132f492904089df4888f280deb957d")).intValue();
        }
        synchronized (this.I) {
            for (int i4 = i; i4 < this.u.size() && i4 < i + i2; i4++) {
                i3 += this.u.get(i4).c();
            }
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c52b61b761bcbd90ee086fffa67c9f39", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c52b61b761bcbd90ee086fffa67c9f39")).intValue();
        }
        int i3 = i + 1;
        int b = b(0, i3);
        if (i3 < this.u.size() && this.u.get(i3).b != null) {
            b++;
        }
        return b + i2;
    }

    @Override // com.meituan.android.mrn.component.list.a
    public final long b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc70a79d9218d1c016533f0488790624", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc70a79d9218d1c016533f0488790624")).longValue();
        }
        if (d(i) == null) {
            return -1L;
        }
        return d(i).d;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b32a0567868b553e14bdfbff1ef13a31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b32a0567868b553e14bdfbff1ef13a31");
            return;
        }
        synchronized (this.I) {
            if ((view instanceof com.meituan.android.mrn.component.list.item.d) && !this.x.contains(view)) {
                this.x.add(i, view);
                if (this.L != null) {
                    this.L.b = this.x.size();
                }
                WritableArray createArray = Arguments.createArray();
                createArray.pushNull();
                this.v.a(i, createArray);
                ListItemNode listItemNode = new ListItemNode();
                listItemNode.m = view.hashCode();
                listItemNode.a(this.v);
                listItemNode.r = view.getWidth();
                listItemNode.q = view.getHeight();
                this.v.a(i, listItemNode);
                ((com.meituan.android.mrn.component.list.item.d) view).setListHeaderFooterChangedListener(this.M);
            } else if ((view instanceof com.meituan.android.mrn.component.list.item.c) && !this.J.contains(view)) {
                int size = this.J.size();
                this.J.add(size, view);
                if (this.L != null) {
                    this.L.c = this.J.size();
                }
                WritableArray createArray2 = Arguments.createArray();
                createArray2.pushNull();
                this.w.a(size, createArray2);
                ListItemNode listItemNode2 = new ListItemNode();
                listItemNode2.m = view.hashCode();
                listItemNode2.a(this.w);
                listItemNode2.r = view.getWidth();
                listItemNode2.q = view.getHeight();
                ((com.meituan.android.mrn.component.list.item.c) view).setListHeaderFooterChangedListener(this.M);
                this.w.a(size, listItemNode2);
            } else if (this.u.size() > 2) {
                super.addView(view, i);
            }
        }
    }

    public final void a(int i, int i2, int i3, double d) {
        int i4 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd194550714ff52ae8645dce9d29e8a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd194550714ff52ae8645dce9d29e8a1");
        } else if (i3 <= 0) {
        } else {
            int a2 = a(i, i2);
            int i5 = i + 1;
            if (i2 == 0 && i3 >= this.u.get(i5).b()) {
                a2--;
            }
            while (i3 > 0) {
                int i6 = i5 + 1;
                com.meituan.android.mrn.component.list.node.c cVar = this.u.get(i5);
                int size = cVar.d().size() - i2;
                if (i3 <= size) {
                    size = i3;
                }
                cVar.a(i2, size);
                i3 -= size;
                i4 += size;
                if (cVar.b() == 0) {
                    this.u.remove(cVar);
                    i4++;
                }
                i5 = i6;
            }
            this.o.b(a2, i4);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.view.ViewParent
    @SuppressLint({"WrongCall"})
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "822f957acb7c09cb65c9ba9121871ac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "822f957acb7c09cb65c9ba9121871ac2");
            return;
        }
        super.requestLayout();
        if (this.N) {
            return;
        }
        this.N = true;
        post(new Runnable() { // from class: com.meituan.android.mrn.component.list.MListView.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a35f0fae0b9a10ce4997f9afc2f2923", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a35f0fae0b9a10ce4997f9afc2f2923");
                    return;
                }
                MListView.c(MListView.this, false);
                MListView.this.layout(MListView.this.getLeft(), MListView.this.getTop(), MListView.this.getRight(), MListView.this.getBottom());
                MListView.this.onLayout(false, MListView.this.getLeft(), MListView.this.getTop(), MListView.this.getRight(), MListView.this.getBottom());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(ReadableArray readableArray, int i, int i2, double d) {
        com.meituan.android.mrn.component.list.node.c cVar;
        boolean z;
        WritableMap writableMap;
        Object[] objArr = {readableArray, Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96e72080942a99b0591aa1216210cdec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96e72080942a99b0591aa1216210cdec")).intValue();
        }
        int i3 = i + 1;
        a(i, i2);
        int i4 = 0;
        for (int i5 = 0; i5 < readableArray.size(); i5++) {
            ReadableMap map = readableArray.getMap(i5);
            if (map != null) {
                final String a2 = com.meituan.android.mrn.component.list.common.a.a(map, "title", "");
                String a3 = com.meituan.android.mrn.component.list.common.a.a(map, "tplId", (String) null);
                if (i5 == 0 && i3 < this.u.size() - 1 && TextUtils.equals(a2, this.u.get(i3).e)) {
                    cVar = this.u.get(i3);
                    z = true;
                } else {
                    cVar = new com.meituan.android.mrn.component.list.node.c();
                    cVar.e = a2;
                    i4 += !TextUtils.isEmpty(a3) ? 1 : 0;
                    z = false;
                }
                cVar.e = a2;
                ReadableArray a4 = com.meituan.android.mrn.component.list.common.a.a(map, "data", Arguments.createArray());
                i4 += a4.size();
                cVar.a(z ? i2 : cVar.a(), a4);
                if (!TextUtils.isEmpty(a3)) {
                    try {
                        writableMap = map.getMap("title");
                    } catch (Throwable unused) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("title", a2);
                        writableMap = createMap;
                    }
                    final ListItemNode listItemNode = (ListItemNode) ListItemNode.a(this.t.get(a3).c, writableMap.toHashMap(), ListItemNode.class);
                    listItemNode.o = a3;
                    listItemNode.a(cVar);
                    cVar.b = listItemNode;
                    com.facebook.react.uimanager.c cVar2 = new com.facebook.react.uimanager.c() { // from class: com.meituan.android.mrn.component.list.MListView.5
                        public static ChangeQuickRedirect a;

                        @Override // com.facebook.react.uimanager.c
                        public final void a(float f, float f2) {
                            Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8169f8a55adc08a4772847f13e30736f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8169f8a55adc08a4772847f13e30736f");
                                return;
                            }
                            listItemNode.r = f;
                            listItemNode.q = f2;
                            if (f == 0.0f || f2 == 0.0f) {
                                com.facebook.common.logging.a.d("[MListView@onFinishCalculation]", "calculateHeader: " + a2 + ", " + f + " x " + f2);
                            }
                        }
                    };
                    a(listItemNode, cVar2, "calculate header:" + a2);
                } else {
                    cVar.b = null;
                }
                if (z) {
                    continue;
                } else {
                    synchronized (this.I) {
                        this.u.add(i3 + i5, cVar);
                    }
                }
            }
        }
        return i4;
    }

    @Override // com.meituan.android.mrn.component.list.a
    /* renamed from: b */
    public final c a(ViewGroup viewGroup, int i) {
        View view;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db0f8de300c3662c4e340729dce3242d", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db0f8de300c3662c4e340729dce3242d");
        }
        for (int i2 = 0; i2 < this.v.b(); i2++) {
            ListItemNode listItemNode = this.v.c.get(i2);
            if (listItemNode.b() == i) {
                return new c(this.x.get(i2), listItemNode);
            }
        }
        for (int i3 = 0; i3 < this.w.b(); i3++) {
            ListItemNode listItemNode2 = this.w.c.get(i3);
            if (listItemNode2.b() == i) {
                return new c(this.J.get(i3), listItemNode2);
            }
        }
        ListItemNode listItemNode3 = this.p.get(i);
        if (listItemNode3 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            view = c(listItemNode3);
            a("createShadowView", elapsedRealtime);
        } else {
            view = new View(this.m);
        }
        if (view == null) {
            view = new View(this.m);
            Log.e("MListView", "[MListView@onCreateViewHolder] createShadowView null: " + listItemNode3);
        }
        return new c(view, listItemNode3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0178, code lost:
        if (r1 != null) goto L40;
     */
    @Override // com.meituan.android.mrn.component.list.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.meituan.android.mrn.component.list.c r23, int r24) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.component.list.MListView.a(com.meituan.android.mrn.component.list.c, int):void");
    }

    private void b(com.meituan.android.mrn.component.list.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d89473496da3755c276c797af735ae8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d89473496da3755c276c797af735ae8d");
            return;
        }
        WritableArray createArray = Arguments.createArray();
        Iterator<com.meituan.android.mrn.component.list.node.a> it = aVar.i.iterator();
        while (it.hasNext()) {
            com.meituan.android.mrn.component.list.node.a next = it.next();
            createArray.pushInt(next.d);
            b(next);
        }
        try {
            this.r.a(aVar.d, aVar.e, aVar.f, aVar.j);
            if (createArray.size() > 0) {
                this.r.a(aVar.d, (ReadableArray) createArray);
            }
        } catch (Throwable th) {
            com.facebook.common.logging.a.d("[MListView@createNodeTree]", null, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.meituan.android.mrn.component.list.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e7629f84b67fe37cb97c9f1d4e3e04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e7629f84b67fe37cb97c9f1d4e3e04");
            return;
        }
        WritableArray createArray = Arguments.createArray();
        Iterator<com.meituan.android.mrn.component.list.node.a> it = aVar.i.iterator();
        while (it.hasNext()) {
            com.meituan.android.mrn.component.list.node.a next = it.next();
            createArray.pushInt(next.d);
            a(next);
        }
        try {
            this.r.b(aVar.d, createArray);
        } catch (Throwable th) {
            com.facebook.common.logging.a.b("[MListView@destroyNodeTree]", (String) null, th);
        }
    }

    private View c(com.meituan.android.mrn.component.list.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f91196cd947cbfbf15945c8270bd1f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f91196cd947cbfbf15945c8270bd1f3");
        }
        ArrayList<View> arrayList = new ArrayList<>();
        Iterator<com.meituan.android.mrn.component.list.node.a> it = aVar.i.iterator();
        while (it.hasNext()) {
            View c = c(it.next());
            if (c != null) {
                arrayList.add(c);
            }
        }
        View a2 = this.r.a(this.m, aVar.d, aVar.e);
        if (a2 instanceof com.meituan.android.mrn.component.Touchable.b) {
            com.meituan.android.mrn.component.Touchable.b bVar = (com.meituan.android.mrn.component.Touchable.b) a2;
            this.y.a((h) bVar);
            bVar.setEventId(aVar.k);
        }
        if (a2 != null && arrayList.size() > 0) {
            this.r.a(aVar.e, a2, arrayList);
        }
        return a2;
    }

    public final void a(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "951d5d1d8c150a6641d08174142185a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "951d5d1d8c150a6641d08174142185a3");
            return;
        }
        int b = b(0, i + 1) + i2;
        if (z) {
            smoothScrollToPosition(b);
        } else {
            scrollToPosition(b);
            this.o.notifyDataSetChanged();
            scrollBy(0, 0);
        }
        int i3 = b - this.G;
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

    @Override // com.meituan.android.mrn.component.list.b
    public final k c(int i) {
        k e;
        int i2 = 1;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93ad3e443893482dff5b0aec83b4a3a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93ad3e443893482dff5b0aec83b4a3a6");
        }
        k a2 = k.a();
        if (this.B || i < com.meituan.android.mrn.component.list.common.b.b() || (e = e(this.G)) == null) {
            return a2;
        }
        int i3 = e.b;
        int i4 = 0;
        while (i3 < this.u.size()) {
            com.meituan.android.mrn.component.list.node.c cVar = this.u.get(i3);
            for (int i5 = i4 == 0 ? e.c : 0; i5 < cVar.b(); i5++) {
                ListItemNode listItemNode = cVar.c.get(i5);
                if (listItemNode != null) {
                    Object[] objArr2 = new Object[i2];
                    objArr2[0] = Integer.valueOf(i);
                    ChangeQuickRedirect changeQuickRedirect2 = ListItemNode.l;
                    com.meituan.android.mrn.component.list.node.a aVar = PatchProxy.isSupport(objArr2, listItemNode, changeQuickRedirect2, false, "f0ac288c4aafbd0bf4e84ca4b0d1dc05", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.mrn.component.list.node.a) PatchProxy.accessDispatch(objArr2, listItemNode, changeQuickRedirect2, false, "f0ac288c4aafbd0bf4e84ca4b0d1dc05") : listItemNode.n.get(i);
                    if (aVar != null) {
                        k kVar = new k(i3 - 1, i5);
                        kVar.e = aVar.k;
                        while (aVar.h != null) {
                            if (MTouchableOpacityManager.REACT_CLASS.equals(aVar.e)) {
                                kVar.e = aVar.k;
                                return kVar;
                            }
                            aVar = aVar.h;
                        }
                        return kVar;
                    }
                    i2 = 1;
                }
            }
            i3++;
            i4++;
        }
        return a2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class a extends RecyclerView.f {
        public static ChangeQuickRedirect a;
        private Paint c;

        public a() {
            Object[] objArr = {MListView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eb6c470228c6912773e4d6201732514", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eb6c470228c6912773e4d6201732514");
                return;
            }
            this.c = new Paint();
            this.c.setAntiAlias(true);
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Object[] objArr = {rect, view, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c4e05732a5bd80e34cdd251d797e914", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c4e05732a5bd80e34cdd251d797e914");
            } else {
                super.getItemOffsets(rect, view, recyclerView, state);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            Object[] objArr = {canvas, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69bdc2925150eb0a57478570cccae1d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69bdc2925150eb0a57478570cccae1d8");
            } else {
                super.onDraw(canvas, recyclerView, state);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int screenHeight;
            int i = 1;
            Object[] objArr = {canvas, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84f8158854bb5e917d71f8012973b0a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84f8158854bb5e917d71f8012973b0a0");
                return;
            }
            super.onDrawOver(canvas, recyclerView, state);
            int c = state.c();
            int childCount = recyclerView.getChildCount();
            com.meituan.android.mrn.component.list.node.c cVar = null;
            int i2 = 0;
            while (i2 < childCount) {
                try {
                    View childAt = recyclerView.getChildAt(i2);
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                    if (childAdapterPosition >= 0) {
                        ListItemNode d = MListView.this.d(childAdapterPosition);
                        com.meituan.android.mrn.component.list.node.c a2 = d.a();
                        try {
                            if (!com.meituan.android.mrn.component.list.common.b.a(cVar, a2) && a2 != null && a2.b != null) {
                                MListView mListView = MListView.this;
                                Object[] objArr2 = new Object[i];
                                objArr2[0] = Integer.valueOf(childAdapterPosition);
                                ChangeQuickRedirect changeQuickRedirect2 = MListView.k;
                                if (PatchProxy.isSupport(objArr2, mListView, changeQuickRedirect2, false, "d036e9bdf0ef97554673d4c9daeae46c", RobustBitConfig.DEFAULT_VALUE)) {
                                    screenHeight = ((Integer) PatchProxy.accessDispatch(objArr2, mListView, changeQuickRedirect2, false, "d036e9bdf0ef97554673d4c9daeae46c")).intValue();
                                } else {
                                    ListItemNode d2 = mListView.d(childAdapterPosition);
                                    if (d2 != null) {
                                        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) mListView.r.a(d2.d);
                                        if (reactShadowNodeImpl == null) {
                                            Log.e("Raphael", "[MListView@getYogaHeight] node is null, tag: " + d2);
                                        } else {
                                            screenHeight = reactShadowNodeImpl.getScreenHeight();
                                        }
                                    }
                                    screenHeight = 0;
                                }
                                int left = childAt.getLeft();
                                childAt.getWidth();
                                int max = Math.max(0, childAt.getTop());
                                int bottom = childAt.getBottom();
                                int i3 = childAdapterPosition + 1;
                                if (i3 < c) {
                                    com.meituan.android.mrn.component.list.node.c a3 = MListView.this.d(i3).a();
                                    View childAt2 = recyclerView.getChildAt(i2 + 1);
                                    if (childAt2 != null) {
                                        if (!com.meituan.android.mrn.component.list.common.b.a(a3, a2) && childAt2.getTop() < screenHeight) {
                                            max = bottom - screenHeight;
                                        }
                                    }
                                }
                                com.meituan.android.mrn.component.list.node.c a4 = d.a();
                                Bitmap bitmap = a4.d;
                                if (bitmap == null) {
                                    int b = MListView.this.b(0, MListView.this.u.indexOf(a4));
                                    MListView.this.a(MListView.this.a(MListView.this, MListView.this.d(b).b()), b);
                                    bitmap = a4.d;
                                }
                                if (bitmap != null) {
                                    canvas.drawBitmap(bitmap, left, max, this.c);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        cVar = a2;
                    }
                } catch (Throwable unused2) {
                }
                i2++;
                i = 1;
            }
        }
    }

    private static long a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73c254c007c683bcc3f41e3694dd6741", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73c254c007c683bcc3f41e3694dd6741")).longValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(",time cost=");
        sb.append(elapsedRealtime - j);
        return elapsedRealtime;
    }

    private k e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fce3a1a6f251cab03cb39d99362969", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fce3a1a6f251cab03cb39d99362969");
        }
        if (this.B) {
            return k.a();
        }
        synchronized (this.I) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.u.size(); i3++) {
                int c = this.u.get(i3).c();
                if (i >= i2 && i < i2 + c) {
                    return new k(i3, i - i2);
                }
                i2 += c;
            }
            Log.e("MListView", "[MListView@getSectionItemIndex] position: " + i + StringUtil.CRLF_STRING + this.u + StringUtil.CRLF_STRING + Log.getStackTraceString(new Throwable()));
            return null;
        }
    }

    private void a(com.meituan.android.mrn.component.list.node.a aVar, com.meituan.android.mrn.component.list.node.a aVar2, View view, int i) {
        Object[] objArr = {aVar, aVar2, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77e22f1c9a31554ded8514319883a1ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77e22f1c9a31554ded8514319883a1ec");
            return;
        }
        View findViewById = view.findViewById(aVar2.d);
        if (findViewById != null) {
            for (int i2 = 0; i2 < aVar.i.size() && i2 < aVar2.i.size(); i2++) {
                a(aVar.i.get(i2), aVar2.i.get(i2), findViewById, i);
            }
            this.r.a(aVar.d, aVar.e, aVar.j, findViewById);
        }
    }
}
