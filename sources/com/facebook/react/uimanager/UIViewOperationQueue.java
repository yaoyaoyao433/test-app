package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.view.View;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.as;
import com.meituan.android.mrn.utils.y;
import com.meituan.metrics.laggy.respond.RespondLaggyManager;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class UIViewOperationQueue {
    private static final String a = "UIViewOperationQueue";
    private long A;
    private long B;
    private long C;
    private long D;
    private final NativeViewHierarchyManager e;
    private final h h;
    private final ReactApplicationContext i;
    private final boolean j;
    @Nullable
    private com.facebook.react.uimanager.debug.a o;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private long x;
    private long y;
    private long z;
    private final int[] b = new int[4];
    private LinkedHashSet<Integer> c = new LinkedHashSet<>();
    private int d = -1;
    private final Object f = new Object();
    private final Object g = new Object();
    private ArrayList<f> k = new ArrayList<>();
    private ArrayList<s> l = new ArrayList<>();
    @GuardedBy("mDispatchRunnablesLock")
    private ArrayList<Runnable> m = new ArrayList<>();
    @GuardedBy("mNonBatchedOperationsLock")
    private ArrayDeque<s> n = new ArrayDeque<>();
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    interface f {
        void b();

        void c();

        int d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface s {
        void a();
    }

    static /* synthetic */ boolean a(UIViewOperationQueue uIViewOperationQueue, boolean z) {
        uIViewOperationQueue.q = true;
        return true;
    }

    public final int i() {
        int i2 = this.d;
        this.d = -1;
        return i2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    abstract class w implements s {
        public int b;

        public w(int i) {
            this.b = i;
            UIViewOperationQueue.this.d = i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class n extends w {
        public n(int i) {
            super(i);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            UIViewOperationQueue.this.e.c(this.b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class u extends w {
        private final ag d;

        private u(int i, ag agVar) {
            super(i);
            this.d = agVar;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            UIViewOperationQueue.this.e.a(this.b, this.d);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class t extends w {
        private final int d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;
        private final int i;

        public t(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            super(i3);
            this.i = i;
            this.d = i2;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            UIViewOperationQueue.this.e.a(this.d, this.b, this.e, this.f, this.g, this.h);
            UIViewOperationQueue.this.c.add(Integer.valueOf(this.i));
            View d = UIViewOperationQueue.this.e.d(this.i);
            if (d == null || !(d instanceof ReactRootView)) {
                return;
            }
            ReactRootView reactRootView = (ReactRootView) d;
            com.facebook.react.log.c fsTimeLogger = reactRootView.getFsTimeLogger();
            if (fsTimeLogger != null) {
                fsTimeLogger.a(this.b, UIViewOperationQueue.this.e);
            }
            com.facebook.react.log.a fmpListener = reactRootView.getFmpListener();
            if (fmpListener != null) {
                fmpListener.a(this.b);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class c extends w {
        private final ao d;
        private final String e;
        @Nullable
        private final ag f;

        public c(ao aoVar, int i, String str, @Nullable ag agVar) {
            super(i);
            this.d = aoVar;
            this.e = str;
            this.f = agVar;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            UIViewOperationQueue.this.e.a(this.d, this.b, this.e, this.f);
            com.meituan.android.mrn.utils.y.a().a(this.d, y.a.ExecuteCreateView, this.b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class k extends w {
        @Nullable
        private final int[] d;
        @Nullable
        private final ay[] e;
        @Nullable
        private final int[] f;

        public k(int i, @Nullable int[] iArr, @Nullable ay[] ayVarArr, @Nullable int[] iArr2) {
            super(i);
            this.d = iArr;
            this.e = ayVarArr;
            this.f = iArr2;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            UIViewOperationQueue.this.e.a(this.b, this.d, this.e, this.f);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class v extends w {
        private final Object d;

        public v(int i, Object obj) {
            super(i);
            this.d = obj;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            UIViewOperationQueue.this.e.a(this.b, this.d);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class a extends w {
        private final int d;
        private final boolean e;
        private final boolean f;

        public a(int i, int i2, boolean z, boolean z2) {
            super(i);
            this.d = i2;
            this.f = z;
            this.e = z2;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            if (!this.f) {
                UIViewOperationQueue.this.e.a(this.b, this.d, this.e);
            } else {
                UIViewOperationQueue.this.e.a();
            }
        }
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes.dex */
    final class e extends w implements f {
        private final int d;
        @Nullable
        private final ReadableArray e;
        private int f;

        public e(int i, int i2, @Nullable ReadableArray readableArray) {
            super(i);
            this.f = 0;
            this.d = i2;
            this.e = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            try {
                UIViewOperationQueue.this.e.a(this.b, this.d, this.e);
            } catch (Throwable th) {
                ReactSoftException.logSoftException(UIViewOperationQueue.a, new RuntimeException("Error dispatching View Command", th));
            }
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.f
        public final void b() {
            UIViewOperationQueue.this.e.a(this.b, this.d, this.e);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.f
        @UiThread
        public final void c() {
            this.f++;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.f
        @UiThread
        public final int d() {
            return this.f;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class g extends w implements f {
        private final String d;
        @Nullable
        private final ReadableArray e;
        private int f;

        public g(int i, String str, @Nullable ReadableArray readableArray) {
            super(i);
            this.f = 0;
            this.d = str;
            this.e = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            try {
                UIViewOperationQueue.this.e.a(this.b, this.d, this.e);
            } catch (Throwable th) {
                ReactSoftException.logSoftException(UIViewOperationQueue.a, new RuntimeException("Error dispatching View Command", th));
            }
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.f
        @UiThread
        public final void b() {
            UIViewOperationQueue.this.e.a(this.b, this.d, this.e);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.f
        @UiThread
        public final void c() {
            this.f++;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.f
        public final int d() {
            return this.f;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class q extends w {
        private final ReadableArray d;
        private final Callback e;
        private final Callback f;

        public q(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
            super(i);
            this.d = readableArray;
            this.e = callback;
            this.f = callback2;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            UIViewOperationQueue.this.e.a(this.b, this.d, this.f, this.e);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class d implements s {
        private d() {
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            UIViewOperationQueue.this.e.c();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class p implements s {
        private final boolean b;

        private p(boolean z) {
            this.b = z;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            UIViewOperationQueue.this.e.a(this.b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b implements s {
        private final ReadableMap b;
        private final Callback c;

        private b(ReadableMap readableMap, Callback callback) {
            this.b = readableMap;
            this.c = callback;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            UIViewOperationQueue.this.e.a(this.b, this.c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class m implements s {
        private final int b;
        private final Callback c;

        private m(int i, Callback callback) {
            this.b = i;
            this.c = callback;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            try {
                UIViewOperationQueue.this.e.a(this.b, UIViewOperationQueue.this.b);
                float c = com.facebook.react.uimanager.w.c(UIViewOperationQueue.this.b[0]);
                float c2 = com.facebook.react.uimanager.w.c(UIViewOperationQueue.this.b[1]);
                this.c.invoke(0, 0, Float.valueOf(com.facebook.react.uimanager.w.c(UIViewOperationQueue.this.b[2])), Float.valueOf(com.facebook.react.uimanager.w.c(UIViewOperationQueue.this.b[3])), Float.valueOf(c), Float.valueOf(c2));
            } catch (com.facebook.react.uimanager.u unused) {
                this.c.invoke(new Object[0]);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class l implements s {
        private final int b;
        private final Callback c;

        private l(int i, Callback callback) {
            this.b = i;
            this.c = callback;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            try {
                UIViewOperationQueue.this.e.b(this.b, UIViewOperationQueue.this.b);
                this.c.invoke(Float.valueOf(com.facebook.react.uimanager.w.c(UIViewOperationQueue.this.b[0])), Float.valueOf(com.facebook.react.uimanager.w.c(UIViewOperationQueue.this.b[1])), Float.valueOf(com.facebook.react.uimanager.w.c(UIViewOperationQueue.this.b[2])), Float.valueOf(com.facebook.react.uimanager.w.c(UIViewOperationQueue.this.b[3])));
            } catch (com.facebook.react.uimanager.u unused) {
                this.c.invoke(new Object[0]);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class i implements s {
        private final int b;
        private final float c;
        private final float d;
        private final Callback e;

        private i(int i, float f, float f2, Callback callback) {
            this.b = i;
            this.c = f;
            this.d = f2;
            this.e = callback;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            try {
                UIViewOperationQueue.this.e.a(this.b, UIViewOperationQueue.this.b);
                float f = UIViewOperationQueue.this.b[0];
                float f2 = UIViewOperationQueue.this.b[1];
                int a = UIViewOperationQueue.this.e.a(this.b, this.c, this.d);
                try {
                    UIViewOperationQueue.this.e.a(a, UIViewOperationQueue.this.b);
                    this.e.invoke(Integer.valueOf(a), Float.valueOf(com.facebook.react.uimanager.w.c(UIViewOperationQueue.this.b[0] - f)), Float.valueOf(com.facebook.react.uimanager.w.c(UIViewOperationQueue.this.b[1] - f2)), Float.valueOf(com.facebook.react.uimanager.w.c(UIViewOperationQueue.this.b[2])), Float.valueOf(com.facebook.react.uimanager.w.c(UIViewOperationQueue.this.b[3])));
                } catch (com.facebook.react.uimanager.i unused) {
                    this.e.invoke(new Object[0]);
                }
            } catch (com.facebook.react.uimanager.i unused2) {
                this.e.invoke(new Object[0]);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class j implements s {
        private final af b;
        private final as.a c;

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
        }

        private j(af afVar, as.a aVar) {
            this.b = afVar;
            this.c = aVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class r implements s {
        private final ar b;

        public r(ar arVar) {
            this.b = arVar;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            this.b.execute(UIViewOperationQueue.this.e);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class o extends w {
        private final int d;

        private o(int i, int i2) {
            super(i);
            this.d = i2;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.s
        public final void a() {
            UIViewOperationQueue.this.e.a(this.b, this.d);
        }
    }

    public UIViewOperationQueue(ReactApplicationContext reactApplicationContext, NativeViewHierarchyManager nativeViewHierarchyManager, int i2) {
        this.e = nativeViewHierarchyManager;
        this.h = new h(reactApplicationContext, i2 == -1 ? 8 : i2);
        this.i = reactApplicationContext;
        this.j = com.facebook.react.config.a.f;
    }

    public NativeViewHierarchyManager a() {
        return this.e;
    }

    public void a(@Nullable com.facebook.react.uimanager.debug.a aVar) {
        this.o = aVar;
    }

    public void b() {
        this.r = true;
        this.t = 0L;
        this.C = 0L;
        this.D = 0L;
    }

    public Map<String, Long> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.t));
        hashMap.put("CommitEndTime", Long.valueOf(this.u));
        hashMap.put("LayoutTime", Long.valueOf(this.v));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.w));
        hashMap.put("RunStartTime", Long.valueOf(this.x));
        hashMap.put("RunEndTime", Long.valueOf(this.y));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.z));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.A));
        hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(this.B));
        hashMap.put("CreateViewCount", Long.valueOf(this.C));
        hashMap.put("UpdatePropsCount", Long.valueOf(this.D));
        return hashMap;
    }

    public boolean d() {
        return this.l.isEmpty() && this.k.isEmpty();
    }

    public void a(int i2, View view) {
        this.e.a(i2, view);
    }

    public void a(int i2) {
        this.l.add(new n(i2));
    }

    public void a(int i2, int i3, boolean z) {
        this.l.add(new a(i2, i3, false, z));
    }

    public void e() {
        this.l.add(new a(0, 0, true, false));
    }

    @Deprecated
    public void a(int i2, int i3, @Nullable ReadableArray readableArray) {
        e eVar = new e(i2, i3, readableArray);
        if (this.j) {
            this.k.add(eVar);
        } else {
            this.l.add(eVar);
        }
    }

    public void a(int i2, String str, @Nullable ReadableArray readableArray) {
        g gVar = new g(i2, str, readableArray);
        if (this.j) {
            this.k.add(gVar);
        } else {
            this.l.add(gVar);
        }
    }

    public void a(int i2, Object obj) {
        this.l.add(new v(i2, obj));
    }

    public void a(int i2, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.l.add(new q(i2, readableArray, callback, callback2));
    }

    public void f() {
        this.l.add(new d());
    }

    public void a(ao aoVar, int i2, String str, @Nullable ag agVar) {
        synchronized (this.g) {
            this.C++;
            this.n.addLast(new c(aoVar, i2, str, agVar));
            com.meituan.android.mrn.utils.y.a().a(aoVar, y.a.EnqueueCreateView, i2);
        }
    }

    public void a(int i2, String str, ag agVar) {
        this.D++;
        this.l.add(new u(i2, agVar));
    }

    public void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.l.add(new t(i2, i3, i4, i5, i6, i7, i8));
    }

    public void a(int i2, @Nullable int[] iArr, @Nullable ay[] ayVarArr, @Nullable int[] iArr2) {
        this.l.add(new k(i2, iArr, ayVarArr, iArr2));
    }

    public void a(boolean z) {
        this.l.add(new p(z));
    }

    public void a(ReadableMap readableMap, Callback callback) {
        this.l.add(new b(readableMap, callback));
    }

    public void a(int i2, Callback callback) {
        this.l.add(new m(i2, callback));
    }

    public void b(int i2, Callback callback) {
        this.l.add(new l(i2, callback));
    }

    public void a(int i2, float f2, float f3, Callback callback) {
        this.l.add(new i(i2, f2, f3, callback));
    }

    public void a(int i2, int i3) {
        this.l.add(new o(i2, i3));
    }

    public void a(af afVar, as.a aVar) {
        this.l.add(new j(afVar, aVar));
    }

    public void a(ar arVar) {
        this.l.add(new r(arVar));
    }

    public void b(ar arVar) {
        this.l.add(0, new r(arVar));
    }

    public final void a(final int i2, final long j2, final long j3, final long j4, final int i3) {
        long j5;
        final ArrayList<f> arrayList;
        final ArrayList<s> arrayList2;
        final ArrayDeque<s> arrayDeque;
        com.facebook.systrace.b.a(0L, "UIViewOperationQueue.dispatchViewUpdates");
        try {
            final long uptimeMillis = SystemClock.uptimeMillis();
            final long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            if (this.k.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList<f> arrayList3 = this.k;
                this.k = new ArrayList<>();
                arrayList = arrayList3;
            }
            if (this.l.isEmpty()) {
                arrayList2 = null;
            } else {
                ArrayList<s> arrayList4 = this.l;
                this.l = new ArrayList<>();
                arrayList2 = arrayList4;
            }
            synchronized (this.g) {
                try {
                    if (this.n.isEmpty()) {
                        arrayDeque = null;
                    } else {
                        ArrayDeque<s> arrayDeque2 = this.n;
                        this.n = new ArrayDeque<>();
                        arrayDeque = arrayDeque2;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
            if (this.o != null) {
                this.o.onViewHierarchyUpdateEnqueued();
            }
            try {
                Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.UIViewOperationQueue.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.react.log.b jsTouchProcessedListener;
                        com.facebook.systrace.b.a(0L, "DispatchUI");
                        try {
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            if (arrayList != null) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    f fVar = (f) it.next();
                                    try {
                                        fVar.b();
                                    } catch (RetryableMountingLayerException e2) {
                                        if (fVar.d() != 0) {
                                            ReactSoftException.logSoftException(UIViewOperationQueue.a, new ReactNoCrashSoftException(e2));
                                        } else {
                                            fVar.c();
                                            UIViewOperationQueue.this.k.add(fVar);
                                        }
                                    } catch (Throwable th2) {
                                        ReactSoftException.logSoftException(UIViewOperationQueue.a, th2);
                                    }
                                }
                            }
                            if (arrayDeque != null) {
                                Iterator it2 = arrayDeque.iterator();
                                while (it2.hasNext()) {
                                    s sVar = (s) it2.next();
                                    if (sVar != null) {
                                        sVar.a();
                                    } else {
                                        com.facebook.common.logging.a.d(UIViewOperationQueue.a, "op is null nonBatchedOperations");
                                    }
                                }
                            }
                            if (arrayList2 != null) {
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    s sVar2 = (s) it3.next();
                                    if (sVar2 != null) {
                                        sVar2.a();
                                    } else {
                                        com.facebook.common.logging.a.d(UIViewOperationQueue.a, "op is null batchedOperations");
                                    }
                                }
                            }
                            if (UIViewOperationQueue.this.c != null && UIViewOperationQueue.this.c.size() > 0) {
                                Iterator it4 = UIViewOperationQueue.this.c.iterator();
                                while (it4.hasNext()) {
                                    View d2 = UIViewOperationQueue.this.e.d(((Integer) it4.next()).intValue());
                                    if (d2 != null && (d2 instanceof ReactRootView)) {
                                        com.facebook.react.log.c fsTimeLogger = ((ReactRootView) d2).getFsTimeLogger();
                                        if (fsTimeLogger != null) {
                                            fsTimeLogger.a(d2, UIViewOperationQueue.this.e);
                                        }
                                        com.facebook.react.log.a fmpListener = ((ReactRootView) d2).getFmpListener();
                                        if (fmpListener != null) {
                                            fmpListener.a(d2);
                                        }
                                    }
                                }
                                UIViewOperationQueue.this.c.clear();
                            }
                            if (j4 > 0) {
                                if (i3 > 0) {
                                    View d3 = UIViewOperationQueue.this.e.d(i3);
                                    if ((d3 instanceof ReactRootView) && (jsTouchProcessedListener = ((ReactRootView) d3).getJsTouchProcessedListener()) != null) {
                                        jsTouchProcessedListener.a((ReactRootView) d3, j4);
                                    }
                                } else {
                                    RespondLaggyManager.getInstance().cancelJSDelayRunnable(-1, j4);
                                }
                            }
                            if (UIViewOperationQueue.this.r && UIViewOperationQueue.this.t == 0) {
                                UIViewOperationQueue.this.t = j2;
                                UIViewOperationQueue.this.u = SystemClock.uptimeMillis();
                                UIViewOperationQueue.this.v = j3;
                                UIViewOperationQueue.this.w = uptimeMillis;
                                UIViewOperationQueue.this.x = uptimeMillis2;
                                UIViewOperationQueue.this.y = UIViewOperationQueue.this.u;
                                UIViewOperationQueue.this.B = currentThreadTimeMillis;
                                long unused = UIViewOperationQueue.this.t;
                                long unused2 = UIViewOperationQueue.this.w;
                                long unused3 = UIViewOperationQueue.this.w;
                                long unused4 = UIViewOperationQueue.this.x;
                            }
                            UIViewOperationQueue.this.e.b();
                            if (UIViewOperationQueue.this.o != null) {
                                UIViewOperationQueue.this.o.onViewHierarchyUpdateFinished();
                            }
                        } catch (Exception e3) {
                            if (UIViewOperationQueue.this.i != null && (e3 instanceof JSApplicationIllegalArgumentException)) {
                                UIViewOperationQueue.this.i.handleException(e3);
                            } else {
                                UIViewOperationQueue.a(UIViewOperationQueue.this, true);
                                throw new com.meituan.android.mrn.exception.c(e3);
                            }
                        } finally {
                            com.facebook.systrace.a.a(0L);
                        }
                    }
                };
                j5 = 0;
                try {
                    com.facebook.systrace.b.a(0L, "acquiring mDispatchRunnablesLock");
                    synchronized (this.f) {
                        com.facebook.systrace.a.a(0L);
                        this.m.add(runnable);
                    }
                    if (!this.p) {
                        UiThreadUtil.runOnUiThread(new GuardedRunnable(this.i) { // from class: com.facebook.react.uimanager.UIViewOperationQueue.2
                            @Override // com.facebook.react.bridge.GuardedRunnable
                            public final void runGuarded() {
                                UIViewOperationQueue.this.k();
                            }
                        });
                    }
                    com.facebook.systrace.a.a(0L);
                } catch (Throwable th2) {
                    th = th2;
                    com.facebook.systrace.a.a(j5);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j5 = 0;
            }
        } catch (Throwable th4) {
            th = th4;
            j5 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        this.p = true;
        com.facebook.react.modules.core.g.b().a(g.a.DISPATCH_UI, this.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.p = false;
        com.facebook.react.modules.core.g.b().b(g.a.DISPATCH_UI, this.h);
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.q) {
            com.facebook.common.logging.a.c("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.f) {
            if (this.m.isEmpty()) {
                return;
            }
            ArrayList<Runnable> arrayList = this.m;
            this.m = new ArrayList<>();
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            if (this.r) {
                this.z = SystemClock.uptimeMillis() - uptimeMillis;
                this.A = this.s;
                this.r = false;
            }
            this.s = 0L;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class h extends com.facebook.react.uimanager.g {
        private final int b;

        private h(ReactContext reactContext, int i) {
            super(reactContext);
            this.b = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
            r4 = android.os.SystemClock.uptimeMillis();
            r3.a();
            r10.a.s += android.os.SystemClock.uptimeMillis() - r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
            if (r10.a.i == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
            r10.a.i.handleException(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
            com.facebook.react.uimanager.UIViewOperationQueue.a(r10.a, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
            throw new com.meituan.android.mrn.exception.c(r0);
         */
        @Override // com.facebook.react.uimanager.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(long r11) {
            /*
                r10 = this;
                com.facebook.react.uimanager.UIViewOperationQueue r0 = com.facebook.react.uimanager.UIViewOperationQueue.this
                boolean r0 = com.facebook.react.uimanager.UIViewOperationQueue.m(r0)
                if (r0 == 0) goto L10
                java.lang.String r11 = "ReactNative"
                java.lang.String r12 = "Not flushing pending UI operations because of previously thrown Exception"
                com.facebook.common.logging.a.c(r11, r12)
                return
            L10:
                java.lang.String r0 = "dispatchNonBatchedUIOperations"
                r1 = 0
                com.facebook.systrace.a.a(r1, r0)
            L17:
                r3 = 16
                long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> La0
                r0 = 0
                long r5 = r5 - r11
                r7 = 1000000(0xf4240, double:4.940656E-318)
                long r5 = r5 / r7
                r0 = 0
                long r3 = r3 - r5
                int r0 = r10.b     // Catch: java.lang.Throwable -> La0
                long r5 = (long) r0     // Catch: java.lang.Throwable -> La0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 < 0) goto L8e
                com.facebook.react.uimanager.UIViewOperationQueue r0 = com.facebook.react.uimanager.UIViewOperationQueue.this     // Catch: java.lang.Throwable -> La0
                java.lang.Object r0 = com.facebook.react.uimanager.UIViewOperationQueue.n(r0)     // Catch: java.lang.Throwable -> La0
                monitor-enter(r0)     // Catch: java.lang.Throwable -> La0
                com.facebook.react.uimanager.UIViewOperationQueue r3 = com.facebook.react.uimanager.UIViewOperationQueue.this     // Catch: java.lang.Throwable -> L8b
                java.util.ArrayDeque r3 = com.facebook.react.uimanager.UIViewOperationQueue.o(r3)     // Catch: java.lang.Throwable -> L8b
                boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L8b
                if (r3 == 0) goto L41
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
                goto L8e
            L41:
                com.facebook.react.uimanager.UIViewOperationQueue r3 = com.facebook.react.uimanager.UIViewOperationQueue.this     // Catch: java.lang.Throwable -> L8b
                java.util.ArrayDeque r3 = com.facebook.react.uimanager.UIViewOperationQueue.o(r3)     // Catch: java.lang.Throwable -> L8b
                java.lang.Object r3 = r3.pollFirst()     // Catch: java.lang.Throwable -> L8b
                com.facebook.react.uimanager.UIViewOperationQueue$s r3 = (com.facebook.react.uimanager.UIViewOperationQueue.s) r3     // Catch: java.lang.Throwable -> L8b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
                long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La0
                r3.a()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La0
                com.facebook.react.uimanager.UIViewOperationQueue r0 = com.facebook.react.uimanager.UIViewOperationQueue.this     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La0
                com.facebook.react.uimanager.UIViewOperationQueue r3 = com.facebook.react.uimanager.UIViewOperationQueue.this     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La0
                long r6 = com.facebook.react.uimanager.UIViewOperationQueue.p(r3)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La0
                long r8 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La0
                r3 = 0
                long r8 = r8 - r4
                long r6 = r6 + r8
                com.facebook.react.uimanager.UIViewOperationQueue.h(r0, r6)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La0
                goto L17
            L68:
                r0 = move-exception
                com.facebook.react.uimanager.UIViewOperationQueue r3 = com.facebook.react.uimanager.UIViewOperationQueue.this     // Catch: java.lang.Throwable -> La0
                com.facebook.react.bridge.ReactApplicationContext r3 = com.facebook.react.uimanager.UIViewOperationQueue.b(r3)     // Catch: java.lang.Throwable -> La0
                if (r3 == 0) goto L7f
                boolean r3 = r0 instanceof com.facebook.react.bridge.JSApplicationIllegalArgumentException     // Catch: java.lang.Throwable -> La0
                if (r3 == 0) goto L7f
                com.facebook.react.uimanager.UIViewOperationQueue r3 = com.facebook.react.uimanager.UIViewOperationQueue.this     // Catch: java.lang.Throwable -> La0
                com.facebook.react.bridge.ReactApplicationContext r3 = com.facebook.react.uimanager.UIViewOperationQueue.b(r3)     // Catch: java.lang.Throwable -> La0
                r3.handleException(r0)     // Catch: java.lang.Throwable -> La0
                goto L17
            L7f:
                com.facebook.react.uimanager.UIViewOperationQueue r11 = com.facebook.react.uimanager.UIViewOperationQueue.this     // Catch: java.lang.Throwable -> La0
                r12 = 1
                com.facebook.react.uimanager.UIViewOperationQueue.a(r11, r12)     // Catch: java.lang.Throwable -> La0
                com.meituan.android.mrn.exception.c r11 = new com.meituan.android.mrn.exception.c     // Catch: java.lang.Throwable -> La0
                r11.<init>(r0)     // Catch: java.lang.Throwable -> La0
                throw r11     // Catch: java.lang.Throwable -> La0
            L8b:
                r11 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
                throw r11     // Catch: java.lang.Throwable -> La0
            L8e:
                com.facebook.systrace.a.a(r1)
                com.facebook.react.uimanager.UIViewOperationQueue r11 = com.facebook.react.uimanager.UIViewOperationQueue.this
                com.facebook.react.uimanager.UIViewOperationQueue.l(r11)
                com.facebook.react.modules.core.g r11 = com.facebook.react.modules.core.g.b()
                com.facebook.react.modules.core.g$a r12 = com.facebook.react.modules.core.g.a.DISPATCH_UI
                r11.a(r12, r10)
                return
            La0:
                r11 = move-exception
                com.facebook.systrace.a.a(r1)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIViewOperationQueue.h.a(long):void");
        }
    }
}
