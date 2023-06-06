package com.meituan.android.mrn.monitor.fsp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.as;
import com.facebook.react.uimanager.events.d;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.mrn.component.list.turbo.l;
import com.meituan.android.mrn.component.list.turbo.view.TurboListView;
import com.meituan.android.mrn.config.horn.h;
import com.meituan.android.mrn.config.n;
import com.meituan.android.mrn.config.t;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.monitor.fsp.a;
import com.meituan.android.mrn.monitor.g;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements com.facebook.react.log.a {
    public static ChangeQuickRedirect a;
    private String A;
    private ReactContext B;
    private long C;
    private a D;
    private final Set<Integer> E;
    private final Set<Integer> F;
    private final Set<Integer> G;
    private volatile boolean H;
    private final Set<Integer> I;
    private final Set<Integer> J;
    private d K;
    private WeakReference<TurboListView> L;
    private Set<Integer> M;
    private Set<Integer> N;
    private volatile boolean O;
    private Runnable P;
    Handler b;
    WeakReference<ReactRootView> c;
    public k d;
    public String e;
    public String f;
    com.meituan.android.mrn.monitor.fsp.a g;
    long h;
    final LinkedHashMap<Long, Set<Integer>> i;
    final LinkedHashMap<Long, Long> j;
    final Set<Integer> k;
    final Set<Integer> l;
    volatile boolean m;
    final Set<Integer> n;
    public Map<String, Object> o;
    boolean p;
    RecyclerView.h q;
    final Runnable r;
    private final int s;
    private final float t;
    private final float u;
    private boolean v;
    private boolean w;
    private NativeViewHierarchyManager x;
    private as y;
    private String z;

    public b() {
        int i;
        float f;
        float f2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a33d21b536bec59f29140efd9eb42b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a33d21b536bec59f29140efd9eb42b");
            return;
        }
        h hVar = h.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "bbf5ad81ff39495f959443dc2d7265a2", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "bbf5ad81ff39495f959443dc2d7265a2")).intValue();
        } else {
            int intValue = ((Integer) t.b.a("fspReportDelay")).intValue();
            intValue = intValue <= 0 ? 3 : intValue;
            Context a2 = com.meituan.android.mrn.common.a.a();
            if (a2 != null) {
                DeviceUtil.LEVEL deviceLevel = DeviceUtil.getDeviceLevel(a2);
                if (deviceLevel == DeviceUtil.LEVEL.MIDDLE) {
                    int intValue2 = ((Integer) t.b.a("middleDeviceTime")).intValue();
                    i = (intValue2 <= 0 ? 5 : intValue2) * 1000;
                } else if (deviceLevel == DeviceUtil.LEVEL.LOW) {
                    int intValue3 = ((Integer) t.b.a("lowDeviceTime")).intValue();
                    i = (intValue3 <= 0 ? 8 : intValue3) * 1000;
                }
            }
            i = intValue * 1000;
        }
        this.s = i;
        h hVar2 = h.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = h.a;
        if (PatchProxy.isSupport(objArr3, hVar2, changeQuickRedirect3, false, "edbed41a17e8b117998da1870600ca97", RobustBitConfig.DEFAULT_VALUE)) {
            f = ((Float) PatchProxy.accessDispatch(objArr3, hVar2, changeQuickRedirect3, false, "edbed41a17e8b117998da1870600ca97")).floatValue();
        } else {
            int intValue4 = ((Integer) t.b.a("fspEffectivePercent")).intValue();
            f = (intValue4 <= 0 ? 5 : intValue4) / 100.0f;
        }
        this.t = f;
        h hVar3 = h.b;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = h.a;
        if (PatchProxy.isSupport(objArr4, hVar3, changeQuickRedirect4, false, "d270c2eded5d2a084915d4f906323b11", RobustBitConfig.DEFAULT_VALUE)) {
            f2 = ((Float) PatchProxy.accessDispatch(objArr4, hVar3, changeQuickRedirect4, false, "d270c2eded5d2a084915d4f906323b11")).floatValue();
        } else {
            int intValue5 = ((Integer) t.b.a("rootEffectivePercent")).intValue();
            f2 = (intValue5 < 50 ? 70 : intValue5) / 100.0f;
        }
        this.u = f2;
        this.v = false;
        this.w = true;
        this.C = -1L;
        this.D = null;
        this.E = new HashSet();
        this.F = new HashSet();
        this.i = new LinkedHashMap<>();
        this.j = new LinkedHashMap<>();
        this.k = new HashSet();
        this.l = new HashSet();
        this.G = new HashSet();
        this.m = false;
        this.H = false;
        this.I = new HashSet();
        this.J = new HashSet();
        this.n = new HashSet();
        this.o = new ConcurrentHashMap();
        this.K = new d() { // from class: com.meituan.android.mrn.monitor.fsp.b.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.uimanager.events.d
            public final void a(com.facebook.react.uimanager.events.b bVar) {
                a.C0291a c0291a;
                Object[] objArr5 = {bVar};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "936b5c9be36ed5c7074c3768a6d398fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "936b5c9be36ed5c7074c3768a6d398fc");
                    return;
                }
                String a3 = bVar.a();
                if (!"topLoadEnd".equals(a3)) {
                    if ("topScroll".equals(a3)) {
                        if (b.this.k.contains(Integer.valueOf(bVar.e))) {
                            b.this.l.add(Integer.valueOf(bVar.e));
                            return;
                        }
                        return;
                    } else if ("topPageSelected".equals(a3)) {
                        b.this.l.add(Integer.valueOf(bVar.e));
                        return;
                    } else {
                        return;
                    }
                }
                int i2 = bVar.e;
                for (Map.Entry<Long, Set<Integer>> entry : b.this.i.entrySet()) {
                    if (entry.getValue() != null && entry.getValue().contains(Integer.valueOf(i2))) {
                        b.this.j.put(entry.getKey(), Long.valueOf(System.currentTimeMillis()));
                        com.meituan.android.mrn.monitor.fsp.a aVar = b.this.g;
                        long currentTimeMillis = System.currentTimeMillis() - b.this.h;
                        Object[] objArr6 = {Integer.valueOf(i2), new Long(currentTimeMillis)};
                        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.mrn.monitor.fsp.a.a;
                        if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "d51ebf8368521b32863fb547b91a694d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "d51ebf8368521b32863fb547b91a694d");
                        } else if (aVar.a() && (c0291a = aVar.d.get(Integer.valueOf(i2))) != null) {
                            c0291a.e = currentTimeMillis;
                        }
                    }
                }
            }
        };
        this.p = false;
        this.L = null;
        this.q = new RecyclerView.h() { // from class: com.meituan.android.mrn.monitor.fsp.b.3
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.h
            public final void onChildViewDetachedFromWindow(View view) {
            }

            @Override // android.support.v7.widget.RecyclerView.h
            public final void onChildViewAttachedToWindow(View view) {
                Object[] objArr5 = {view};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a40a1df7c845c82e655b58f6366dad38", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a40a1df7c845c82e655b58f6366dad38");
                } else if (b.this.m) {
                } else {
                    if (b.this.p) {
                        com.facebook.common.logging.a.b("[MRNFspImpl@onChildViewAttachedToWindow] ", "TurboList 列表添加 view: " + view);
                        b.this.n.add(Integer.valueOf(view.getId()));
                    }
                    b.this.b.removeCallbacks(b.this.r);
                    b.this.b.post(b.this.r);
                }
            }
        };
        this.r = new Runnable() { // from class: com.meituan.android.mrn.monitor.fsp.b.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b939ab6d8c23daeafc95de26e5ea02a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b939ab6d8c23daeafc95de26e5ea02a7");
                    return;
                }
                com.facebook.common.logging.a.b("[MRNFspImpl@onChildViewAttachedToWindow]", "开始检测MRNModule节点，新增节点" + b.this.n.size());
                if (b.this.n == null || b.this.n.size() <= 0 || b.this.c == null || b.this.c.get() == null) {
                    return;
                }
                HashSet hashSet = new HashSet();
                for (Integer num : b.this.n) {
                    int intValue6 = num.intValue();
                    View b = b.this.b(intValue6);
                    if (b != null && b.this.a(b.this.c.get(), b) && !b.this.c(intValue6)) {
                        hashSet.add(Integer.valueOf(intValue6));
                    }
                }
                com.facebook.common.logging.a.b("[MRNFspImpl@onChildViewAttachedToWindow]", "MRNModule 新增屏幕内节点 " + hashSet.size());
                b.this.a(b.this.c.get(), hashSet);
                b.this.n.removeAll(hashSet);
            }
        };
        this.M = new CopyOnWriteArraySet();
        this.N = new CopyOnWriteArraySet();
        this.P = new Runnable() { // from class: com.meituan.android.mrn.monitor.fsp.b.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "83034ba275aa2ec7da8aff4b505292f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "83034ba275aa2ec7da8aff4b505292f2");
                } else {
                    b.this.e(0);
                }
            }
        };
        this.b = new Handler(Looper.getMainLooper());
    }

    public final void a(ReactRootView reactRootView, String str, String str2) {
        Object[] objArr = {reactRootView, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2299dbb2d65bb44a9bb3d7ac49aadc5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2299dbb2d65bb44a9bb3d7ac49aadc5e");
            return;
        }
        com.facebook.common.logging.a.b("[MRNFspImpl@init]", "------------------- init ----------------- " + str);
        this.h = System.currentTimeMillis();
        this.c = new WeakReference<>(reactRootView);
        this.g = new com.meituan.android.mrn.monitor.fsp.a(reactRootView);
        this.z = str;
        this.A = str2;
        this.v = h.b.a(str);
        if (this.v) {
            c();
        }
    }

    public final void a(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "556771f8e56b7ad9f8aa3e85600954af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "556771f8e56b7ad9f8aa3e85600954af");
        } else if (reactContext == null) {
        } else {
            this.B = reactContext;
            this.y = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getUIImplementation();
            this.x = this.y.a().a();
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(this.K);
        }
    }

    @Override // com.facebook.react.log.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d12251cdb835b034c109a13fbe9b4aa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d12251cdb835b034c109a13fbe9b4aa5");
        } else if (this.v && this.w && !this.m) {
            this.E.add(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027a  */
    @Override // com.facebook.react.log.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r24) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.monitor.fsp.b.a(android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.view.View r24, java.util.Set<java.lang.Integer> r25) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.monitor.fsp.b.a(android.view.View, java.util.Set):void");
    }

    RecyclerView a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bad413a7019e08a7606cda1c794104b", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bad413a7019e08a7606cda1c794104b");
        }
        if (viewGroup == null || this.B == null) {
            return null;
        }
        View findViewById = viewGroup.findViewById(this.B.getResources().getIdentifier("pagecontainer_recyclerview", "id", this.B.getApplicationContext().getPackageName()));
        if (findViewById instanceof RecyclerView) {
            return (RecyclerView) findViewById;
        }
        return null;
    }

    View b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5877a8cf9d967022e1e2d0318c23e274", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5877a8cf9d967022e1e2d0318c23e274");
        }
        View d = this.x.d(i);
        return d != null ? d : f(i);
    }

    private View f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "085dddbe7fd8056c5d97379ee7815a54", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "085dddbe7fd8056c5d97379ee7815a54");
        }
        if (this.L == null) {
            com.facebook.common.logging.a.d("[MRNFspImpl@resolveTurboListChildView] ", "turbo list null");
            return null;
        }
        TurboListView turboListView = this.L.get();
        if (turboListView == null) {
            com.facebook.common.logging.a.d("[MRNFspImpl@resolveTurboListChildView]", "current turbo list recycled!");
            return null;
        }
        l uiOperator = turboListView.getUiOperator();
        if (uiOperator == null) {
            com.facebook.common.logging.a.d("[MRNFspImpl@resolveTurboListChildView]", "uiOperator null!");
            return null;
        }
        return uiOperator.b(i);
    }

    private boolean g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ae46fd24395dcce9097279112366331", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ae46fd24395dcce9097279112366331")).booleanValue();
        }
        if (this.I.size() == 0) {
            return false;
        }
        this.J.addAll(this.I);
        if (this.J.contains(Integer.valueOf(i))) {
            return true;
        }
        View d = this.x.d(i);
        if (d == null || !(d.getParent() instanceof View)) {
            return false;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(i));
        for (View view = (View) d.getParent(); view != null; view = (View) view.getParent()) {
            if (this.J.contains(Integer.valueOf(view.getId()))) {
                this.J.addAll(hashSet);
                return true;
            }
            hashSet.add(Integer.valueOf(view.getId()));
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        return false;
    }

    @Override // com.facebook.react.log.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f2963b75505654535ee97ea2f11012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f2963b75505654535ee97ea2f11012");
        } else if (this.v && this.w) {
            d(0);
        }
    }

    boolean c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "230212b4129821e0bab4d3f87973fcae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "230212b4129821e0bab4d3f87973fcae")).booleanValue();
        }
        if (this.M.contains(Integer.valueOf(i))) {
            com.facebook.common.logging.a.b("[MRNFspImpl@isCarouselView]", "发现可忽略节点：" + i);
            return true;
        } else if (this.N.contains(Integer.valueOf(i))) {
            return false;
        } else {
            b();
            if (this.M.contains(Integer.valueOf(i))) {
                com.facebook.common.logging.a.b("[MRNFspImpl@isCarouselView]", "发现可忽略节点：" + i);
                return true;
            }
            this.N.add(Integer.valueOf(i));
            return false;
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa1dd9d7f2ba2ec9cf45bebbfa3c703b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa1dd9d7f2ba2ec9cf45bebbfa3c703b");
        } else if (this.y != null && this.y.l() != null && !this.O) {
            for (Map.Entry<Integer, af> entry : this.y.l().entrySet()) {
                this.M.add(entry.getKey());
                a(entry.getValue(), this.M);
            }
            this.O = true;
        }
    }

    private void a(af afVar, Set<Integer> set) {
        Object[] objArr = {afVar, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a69837a2c2598085ec58c252bf63797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a69837a2c2598085ec58c252bf63797");
        } else if (afVar.getChildCount() != 0) {
            for (int i = 0; i < afVar.getChildCount(); i++) {
                try {
                    set.add(Integer.valueOf(afVar.getChildAt(i).getReactTag()));
                    a(afVar.getChildAt(i), set);
                } catch (Throwable th) {
                    com.facebook.common.logging.a.d("fsptraverse", "", th);
                }
            }
        }
    }

    boolean a(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce12c43b281285329781a78d2ec2a619", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce12c43b281285329781a78d2ec2a619")).booleanValue();
        }
        if (view2.isShown()) {
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            return iArr[0] < iArr2[0] + view.getWidth() && iArr[0] + view2.getWidth() > iArr2[0] && iArr[1] < iArr2[1] + view.getHeight() && iArr[1] + view2.getHeight() > iArr2[1];
        }
        return false;
    }

    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85d760fac9e09fe063e0a521337d5ac8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85d760fac9e09fe063e0a521337d5ac8");
        } else if (this.v && this.w && !this.m) {
            this.b.removeCallbacks(this.P);
            if (i == 0) {
                com.facebook.common.logging.a.b("[MRNFspImpl@interruptStableFmpDelay]", "有交互，等待被打断");
                e(1);
                return;
            }
            com.facebook.common.logging.a.b("[MRNFspImpl@interruptStableFmpDelay]", "等待被打断");
            h(i);
        }
    }

    void e(int i) {
        long j;
        long j2;
        boolean contains;
        long longValue;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d31b5bedc1067a4f12c2833a97addd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d31b5bedc1067a4f12c2833a97addd9");
            return;
        }
        this.m = true;
        if (this.c == null || this.c.get() == null || this.x == null) {
            return;
        }
        if (this.i.size() == 0) {
            com.facebook.common.logging.a.b("[MRNFspImpl@calculateStableFmp]", "没有需要计算的节点");
            h(3);
            return;
        }
        ReactRootView reactRootView = this.c.get();
        if (reactRootView == null) {
            com.facebook.common.logging.a.d("[MRNFspImpl@calculateStableFmp]", "ReactRootView is recycled.");
            return;
        }
        int width = reactRootView.getWidth() * reactRootView.getHeight();
        ListIterator listIterator = new ArrayList(this.i.entrySet()).listIterator(this.i.size());
        while (true) {
            j = -1;
            if (!listIterator.hasPrevious()) {
                j2 = -1;
                break;
            }
            Map.Entry entry = (Map.Entry) listIterator.previous();
            if (a(reactRootView, width, (Set) entry.getValue())) {
                j2 = ((Long) entry.getKey()).longValue();
                break;
            }
            this.j.remove(entry.getKey());
            com.facebook.common.logging.a.b("[MRNFspImpl@calculateStableFmp]", "本次面积不足5%，舍弃：" + (((Long) entry.getKey()).longValue() - this.h));
        }
        if (j2 < 0) {
            com.facebook.common.logging.a.b("[MRNFspImpl@calculateStableFmp]", "每次面积不足5%，本地FSP时间检测无效，上报异常");
            h(3);
            return;
        }
        Iterator<Map.Entry<Long, Long>> it = this.j.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().longValue() <= j2) {
                it.remove();
            }
        }
        if (this.j.size() > 0) {
            com.facebook.common.logging.a.b("[MRNFspImpl@calculateStableFmp]", "有图片加载时间超过节点完成时间 " + this.j);
            long j3 = -1L;
            for (Map.Entry<Long, Long> entry2 : this.j.entrySet()) {
                if (entry2.getValue().longValue() > j3) {
                    long longValue2 = entry2.getKey().longValue();
                    if (longValue2 == j2) {
                        longValue = entry2.getValue().longValue();
                    } else {
                        longValue = a(reactRootView, width, this.i.get(Long.valueOf(longValue2))) ? entry2.getValue().longValue() : -1L;
                    }
                    if (longValue > j3) {
                        com.facebook.common.logging.a.b("[MRNFspImpl@calculateStableFmp]", "图片时间更新 " + longValue + StringUtil.SPACE + entry2.getKey());
                        j3 = longValue;
                    }
                }
            }
            j = j3;
        }
        long max = Math.max(j, j2);
        if (this.g.a()) {
            com.meituan.android.mrn.monitor.fsp.a aVar = this.g;
            long j4 = j2 - this.h;
            Object[] objArr2 = {new Long(j4)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.monitor.fsp.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e0a64855724f3c78979545996b81e098", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e0a64855724f3c78979545996b81e098");
            } else {
                aVar.e = j4;
            }
            reactRootView.invalidate();
        }
        Object[] objArr3 = {new Long(max), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9b10ec1547ff1abcfd27bb27a75705c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9b10ec1547ff1abcfd27bb27a75705c1");
            return;
        }
        com.facebook.common.logging.a.b("[MRNFspImpl@reportStableFmp]", "检测结束： " + (max - this.h));
        String str = (this.d == null || this.d.i == null) ? "0" : this.d.i.f;
        Map<String, Object> d = g.d();
        d.put("bundle_name", this.z);
        if (!TextUtils.isEmpty(str)) {
            d.put("bundle_version", str);
        }
        d.put("component_name", this.A);
        d.put("fetch_bridge_type", String.valueOf(this.d == null ? -1 : this.d.d));
        d.put("source", this.e);
        d.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, this.f);
        d.put("triggerType", String.valueOf(i));
        if (this.o != null) {
            d.putAll(this.o);
        }
        Babel.logRT(new Log.Builder("").tag(Constants.FSP).optional(d).reportChannel("prism-report-mrn").value(max - this.h).lv4LocalStatus(true).build());
        if (n.a().d()) {
            n a2 = n.a();
            String str2 = this.z;
            Object[] objArr4 = {str2};
            ChangeQuickRedirect changeQuickRedirect4 = n.a;
            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "f6e4a1c032f6cccf6576b159f11ddd5d", RobustBitConfig.DEFAULT_VALUE)) {
                contains = ((Boolean) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "f6e4a1c032f6cccf6576b159f11ddd5d")).booleanValue();
            } else {
                List list = (List) t.b.a("MRNCommon.mrnListFSPBundles");
                contains = (list == null || list.isEmpty()) ? false : list.contains(str2);
            }
            if (contains) {
                g.a().a(this.d.i).c(this.z).d(str).a("source", this.e).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, this.f).a("triggerType", String.valueOf(i)).a("fetch_bridge_type", String.valueOf(this.d != null ? this.d.d : -1)).a("component_name", this.A).b("MRNLFSP", (float) (max - this.h));
                Babel.logRT(new Log.Builder("").tag("MRNLFSP").optional(d).reportChannel("prism-report-mrn").value(max - this.h).lv4LocalStatus(true).build());
                com.facebook.common.logging.a.b("[MRNFspImpl@reportStableFmp]", "MRNLFSP: " + (max - this.h) + StringUtil.SPACE + d);
            }
        }
        com.facebook.common.logging.a.b("[MRNFspImpl@reportStableFmp]", "FSP: " + (max - this.h) + StringUtil.SPACE + d);
        if (this.g.a() && this.c.get() != null) {
            com.sankuai.meituan.android.ui.widget.a.a(this.c.get(), "首屏时间：" + (max - this.h), 0).a();
        }
        d();
    }

    private boolean a(View view, int i, Set<Integer> set) {
        Object[] objArr = {view, Integer.valueOf(i), set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0445bb911a4757cb18481ba6f8065e81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0445bb911a4757cb18481ba6f8065e81")).booleanValue();
        }
        if (set == null) {
            com.facebook.common.logging.a.d("[MRNFspImpl@isOverThreshold]", "tagList null");
            return false;
        }
        int i2 = -1;
        for (Integer num : set) {
            View b = b(num.intValue());
            if (b != null && a(view, b)) {
                i2 += b.getWidth() * b.getHeight();
            }
        }
        return ((float) i2) > ((float) i) * this.t;
    }

    private void h(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2dfd41d16897c70f426a21e45d0b524", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2dfd41d16897c70f426a21e45d0b524");
            return;
        }
        String str = (this.d == null || this.d.i == null) ? "0" : this.d.i.f;
        Map<String, Object> d = g.d();
        d.put("bundle_name", this.z);
        if (!TextUtils.isEmpty(str)) {
            d.put("bundle_version", str);
        }
        d.put("component_name", this.A);
        d.put("fetch_bridge_type", String.valueOf(this.d == null ? -1 : this.d.d));
        d.put("source", this.e);
        d.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, this.f);
        d.put("triggerType", String.valueOf(i));
        if (this.o != null) {
            d.putAll(this.o);
        }
        Babel.logRT(new Log.Builder("").tag("FSPException").optional(d).reportChannel("prism-report-mrn").value(1L).lv4LocalStatus(true).build());
        com.facebook.common.logging.a.b("[MRNFspImpl@reportStableFmp]", "FSPException: " + d);
        d();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1e0001b8666ee6f912cb703736bb7d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1e0001b8666ee6f912cb703736bb7d5");
            return;
        }
        com.facebook.common.logging.a.b("[MRNFspImpl@reportFSPStart]", "页面打开");
        Map<String, Object> d = g.d();
        d.put("bundle_name", this.z);
        d.put("component_name", this.A);
        if (this.o != null) {
            d.putAll(this.o);
        }
        Babel.logRT(new Log.Builder("").tag("FSP_Start").optional(d).reportChannel("prism-report-mrn").value(1L).lv4LocalStatus(true).build());
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83cc3f6e853f6270277c0fe494f19857", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83cc3f6e853f6270277c0fe494f19857");
            return;
        }
        if (this.B != null) {
            ((UIManagerModule) this.B.getNativeModule(UIManagerModule.class)).getEventDispatcher().b(this.K);
        }
        this.F.clear();
        this.i.clear();
        this.G.clear();
        this.l.clear();
        this.k.clear();
        this.j.clear();
        this.I.clear();
        this.J.clear();
        this.n.clear();
    }

    @Override // com.facebook.react.log.a
    public final void a(Canvas canvas) {
        int descent;
        String sb;
        Paint paint;
        int i;
        boolean z = true;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd78b3b79a974cdb6835aa277ed7997a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd78b3b79a974cdb6835aa277ed7997a");
        } else if (this.v) {
            com.meituan.android.mrn.monitor.fsp.a aVar = this.g;
            Object[] objArr2 = {canvas};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.monitor.fsp.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "742c57b53596ada429b9d1a670b7825d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "742c57b53596ada429b9d1a670b7825d");
            } else if (!aVar.a() || aVar.c.size() <= 0) {
            } else {
                Iterator<Map.Entry<Long, List<a.C0291a>>> it = aVar.c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Long, List<a.C0291a>> next = it.next();
                    List<a.C0291a> value = next.getValue();
                    if (value != null) {
                        Paint paint2 = new Paint(z ? 1 : 0);
                        paint2.setStyle(Paint.Style.STROKE);
                        paint2.setStrokeWidth(6.0f);
                        Paint paint3 = new Paint(z ? 1 : 0);
                        paint3.setTextSize(30.0f);
                        paint3.setStrokeWidth(6.0f);
                        paint3.setFakeBoldText(z);
                        Paint paint4 = new Paint(z ? 1 : 0);
                        paint4.setColor(Color.parseColor(DiagnoseLog.COLOR_ERROR));
                        paint4.setStyle(Paint.Style.FILL);
                        paint4.setAlpha(100);
                        int i2 = 0;
                        while (i2 < value.size()) {
                            a.C0291a c0291a = value.get(i2);
                            Rect rect = c0291a.b;
                            Iterator<Map.Entry<Long, List<a.C0291a>>> it2 = it;
                            if (next.getKey().longValue() == aVar.e) {
                                paint2.setColor(Color.parseColor("#FF0000"));
                                paint3.setColor(Color.parseColor("#FF0000"));
                            } else {
                                paint2.setColor(Color.parseColor(DiagnoseLog.LIME));
                                paint3.setColor(Color.parseColor(DiagnoseLog.LIME));
                            }
                            if (c0291a.e > 0) {
                                paint3.setColor(Color.parseColor("#663366"));
                            }
                            canvas.drawRect(rect, paint2);
                            int descent2 = (rect.top + ((rect.bottom - rect.top) / 2)) - (((int) (paint3.descent() + paint3.ascent())) / 2);
                            if (c0291a.e > 0) {
                                sb = c0291a.e + "/" + c0291a.c;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(c0291a.c);
                                sb = sb2.toString();
                            }
                            String str = sb;
                            int measureText = (int) paint3.measureText(str);
                            int i3 = i2;
                            int i4 = (rect.left + ((rect.right - rect.left) / 2)) - (measureText / 2);
                            if (measureText > rect.right - rect.left) {
                                int i5 = (measureText - (rect.right - rect.left)) / 2;
                                i = i3;
                                paint = paint4;
                                canvas.drawRect(rect.left - i5, descent2 + 5, rect.right + i5, (descent + descent2) - 5, paint4);
                            } else {
                                paint = paint4;
                                i = i3;
                                canvas.drawRect(rect.left, descent2 + 5, rect.right, (descent + descent2) - 5, paint);
                            }
                            canvas.drawText(str, i4, descent2, paint3);
                            i2 = i + 1;
                            paint4 = paint;
                            it = it2;
                            z = true;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public long b;
        public Set<Integer> c;
        public int d;

        public a(long j, Set<Integer> set, int i) {
            Object[] objArr = {new Long(j), set, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c39b22acefc2668008e89274d47a2e0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c39b22acefc2668008e89274d47a2e0");
                return;
            }
            this.b = j;
            this.c = set;
            this.d = i;
        }

        @NonNull
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "867c2fb4fe165cc12bfa8ec24263c6ba", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "867c2fb4fe165cc12bfa8ec24263c6ba");
            }
            return this.d + StringUtil.SPACE + this.c;
        }
    }
}
