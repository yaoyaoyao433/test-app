package com.sankuai.meituan.mapsdk.core.gesture;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.gesture.b;
import com.sankuai.meituan.mapsdk.core.gesture.i;
import com.sankuai.meituan.mapsdk.core.gesture.m;
import com.sankuai.meituan.mapsdk.core.gesture.n;
import com.sankuai.meituan.mapsdk.core.gesture.o;
import com.sankuai.meituan.mapsdk.core.gesture.p;
import com.sankuai.meituan.mapsdk.core.gesture.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final double e = Math.log(40.0d);
    private static final List<Set<Integer>> f = new ArrayList();
    public final AndroidGesturesManager b;
    public final List<com.sankuai.meituan.mapsdk.core.gesture.c> c;
    public boolean d;
    private final float g;
    private final i.a h;
    private final p.a i;
    private final q.a j;
    private final n.a k;
    private final m.a l;
    private final o.a m;
    private final b.a n;
    private boolean o;
    private double p;
    private PointF q;

    public static /* synthetic */ void a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "7ba957d92f7e34475a42b7bc0c1ac205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "7ba957d92f7e34475a42b7bc0c1ac205");
            return;
        }
        for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : dVar.c) {
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(0);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(3);
        hashSet2.add(1);
        hashSet2.add(0);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(2);
        hashSet3.add(14);
        hashSet3.add(0);
        HashSet hashSet4 = new HashSet();
        hashSet4.add(14);
        hashSet4.add(1);
        hashSet4.add(0);
        f.add(hashSet);
        f.add(hashSet2);
        f.add(hashSet3);
        f.add(hashSet4);
    }

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "745a478f749894950e09ba57061d5385", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "745a478f749894950e09ba57061d5385");
            return;
        }
        this.h = new b();
        this.i = new g();
        this.j = new C0604d();
        this.k = new e();
        this.l = new c();
        this.m = new f();
        this.n = new a();
        this.c = new CopyOnWriteArrayList();
        this.o = true;
        this.d = true;
        this.g = com.sankuai.meituan.mapsdk.core.utils.d.a();
        this.b = new AndroidGesturesManager(context);
        AndroidGesturesManager androidGesturesManager = this.b;
        List<Set<Integer>> list = f;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = AndroidGesturesManager.a;
        if (PatchProxy.isSupport(objArr2, androidGesturesManager, changeQuickRedirect2, false, "a77f235d0bdb1ea53897ab44e0eb284b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, androidGesturesManager, changeQuickRedirect2, false, "a77f235d0bdb1ea53897ab44e0eb284b");
        } else {
            androidGesturesManager.b.clear();
            androidGesturesManager.b.addAll(list);
        }
        AndroidGesturesManager androidGesturesManager2 = this.b;
        i.a aVar = this.h;
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = AndroidGesturesManager.a;
        if (PatchProxy.isSupport(objArr3, androidGesturesManager2, changeQuickRedirect3, false, "0b989b8b4ed77a46296b96320493c52b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, androidGesturesManager2, changeQuickRedirect3, false, "0b989b8b4ed77a46296b96320493c52b");
        } else {
            androidGesturesManager2.h.a((i) aVar);
        }
        AndroidGesturesManager androidGesturesManager3 = this.b;
        q.a aVar2 = this.j;
        Object[] objArr4 = {aVar2};
        ChangeQuickRedirect changeQuickRedirect4 = AndroidGesturesManager.a;
        if (PatchProxy.isSupport(objArr4, androidGesturesManager3, changeQuickRedirect4, false, "0475325290265cb32d0fae02ae1c1527", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, androidGesturesManager3, changeQuickRedirect4, false, "0475325290265cb32d0fae02ae1c1527");
        } else {
            androidGesturesManager3.e.a((q) aVar2);
        }
        AndroidGesturesManager androidGesturesManager4 = this.b;
        n.a aVar3 = this.k;
        Object[] objArr5 = {aVar3};
        ChangeQuickRedirect changeQuickRedirect5 = AndroidGesturesManager.a;
        if (PatchProxy.isSupport(objArr5, androidGesturesManager4, changeQuickRedirect5, false, "1f9ea5b625f4b89a2a506515ca2ea3fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, androidGesturesManager4, changeQuickRedirect5, false, "1f9ea5b625f4b89a2a506515ca2ea3fa");
        } else {
            androidGesturesManager4.g.a((n) aVar3);
        }
        AndroidGesturesManager androidGesturesManager5 = this.b;
        o.a aVar4 = this.m;
        Object[] objArr6 = {aVar4};
        ChangeQuickRedirect changeQuickRedirect6 = AndroidGesturesManager.a;
        if (PatchProxy.isSupport(objArr6, androidGesturesManager5, changeQuickRedirect6, false, "5c734e879df65927b9cdf019faf631ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, androidGesturesManager5, changeQuickRedirect6, false, "5c734e879df65927b9cdf019faf631ad");
        } else {
            androidGesturesManager5.i.a((o) aVar4);
        }
        AndroidGesturesManager androidGesturesManager6 = this.b;
        m.a aVar5 = this.l;
        Object[] objArr7 = {aVar5};
        ChangeQuickRedirect changeQuickRedirect7 = AndroidGesturesManager.a;
        if (PatchProxy.isSupport(objArr7, androidGesturesManager6, changeQuickRedirect7, false, "999054c211b851d75334cbce472f2ba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, androidGesturesManager6, changeQuickRedirect7, false, "999054c211b851d75334cbce472f2ba7");
        } else {
            androidGesturesManager6.f.a((m) aVar5);
        }
        AndroidGesturesManager androidGesturesManager7 = this.b;
        p.a aVar6 = this.i;
        Object[] objArr8 = {aVar6};
        ChangeQuickRedirect changeQuickRedirect8 = AndroidGesturesManager.a;
        if (PatchProxy.isSupport(objArr8, androidGesturesManager7, changeQuickRedirect8, false, "fcd14df5f63fa6fd3c648a3636604e25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, androidGesturesManager7, changeQuickRedirect8, false, "fcd14df5f63fa6fd3c648a3636604e25");
        } else {
            androidGesturesManager7.d.a((p) aVar6);
        }
        AndroidGesturesManager androidGesturesManager8 = this.b;
        b.a aVar7 = this.n;
        Object[] objArr9 = {aVar7};
        ChangeQuickRedirect changeQuickRedirect9 = AndroidGesturesManager.a;
        if (PatchProxy.isSupport(objArr9, androidGesturesManager8, changeQuickRedirect9, false, "c93b2094d1348e435b27fc102572d32c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, androidGesturesManager8, changeQuickRedirect9, false, "c93b2094d1348e435b27fc102572d32c");
        } else {
            androidGesturesManager8.j.a((com.sankuai.meituan.mapsdk.core.gesture.b) aVar7);
        }
    }

    public final void a(com.sankuai.meituan.mapsdk.core.gesture.c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "655220531655ffb3445ae8519e6a9922", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "655220531655ffb3445ae8519e6a9922");
        } else if (cVar == null || this.c.contains(cVar)) {
        } else {
            if (z) {
                this.c.add(0, cVar);
            } else {
                this.c.add(cVar);
            }
        }
    }

    public final void a(com.sankuai.meituan.mapsdk.core.gesture.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55a513ad79b9bb819bdc4fc54b0ae33a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55a513ad79b9bb819bdc4fc54b0ae33a");
        } else {
            this.c.remove(cVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class b implements i.a {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b28f882828d5700e98ba6cd43f9dfed", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b28f882828d5700e98ba6cd43f9dfed");
            }
        }

        @Override // com.sankuai.meituan.mapsdk.core.gesture.i.a
        public final boolean a(i iVar, int i) {
            Object[] objArr = {iVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78bd88e647f42a465dcb5d4644587fb5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78bd88e647f42a465dcb5d4644587fb5")).booleanValue();
            }
            if (i == 2) {
                d.a(d.this);
                PointF i2 = iVar.i();
                for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : d.this.c) {
                    if (cVar != null && cVar.c(i2.x, i2.y)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mapsdk.core.gesture.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0604d implements q.a {
        public static ChangeQuickRedirect a;
        private boolean c;
        private float d;

        private C0604d() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "894928354dee211e700a14d22e93d493", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "894928354dee211e700a14d22e93d493");
                return;
            }
            this.c = false;
            this.d = 1.0f;
        }

        @Override // com.sankuai.meituan.mapsdk.core.gesture.q.a
        public final boolean a(q qVar) {
            Object[] objArr = {qVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ea7a6067c06c442488879dd904fc203", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ea7a6067c06c442488879dd904fc203")).booleanValue();
            }
            if (qVar.h() != 1) {
                d.this.o = true;
            } else {
                this.c = true;
                d.this.o = false;
                p.i = true;
            }
            d.this.p = 0.0d;
            d.a(d.this);
            return true;
        }

        @Override // com.sankuai.meituan.mapsdk.core.gesture.q.a
        public final boolean b(q qVar) {
            float f;
            Object[] objArr = {qVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c61472bb397425bdb145cebbef8f41f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c61472bb397425bdb145cebbef8f41f")).booleanValue();
            }
            this.d *= qVar.i;
            if (this.d > 1.05f || this.d < 0.95f) {
                if (this.c) {
                    f = 1.0f - (Math.max(0.65f, Math.min(1.35f, qVar.i)) - 1.0f);
                } else {
                    f = qVar.i;
                }
                d.this.q = qVar.i();
                d.this.p = (Math.log(f) / Math.log(1.5707963267948966d)) * 0.6499999761581421d;
                for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : d.this.c) {
                    if (cVar != null && cVar.a(d.this.p, d.this.q.x, d.this.q.y, 0, this.c)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        @Override // com.sankuai.meituan.mapsdk.core.gesture.q.a
        public final void a(q qVar, float f, float f2) {
            int i = 1;
            Object[] objArr = {qVar, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8ebcd761e39391a74e1c01b3fe29f34", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8ebcd761e39391a74e1c01b3fe29f34");
                return;
            }
            this.c = false;
            double min = Math.min(Math.hypot(f, f2), 15000.0d);
            if (d.this.p <= 0.0d) {
                if (d.this.p >= 0.0d) {
                    return;
                }
                i = -1;
            }
            if (d.this.d && d.this.o && min > 300.0d) {
                double log = (i * Math.log(min)) / d.e;
                if (d.this.q != null) {
                    for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : d.this.c) {
                        if (cVar != null && cVar.a(log, d.this.q.x, d.this.q.y, 400, false)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class e implements n.a {
        public static ChangeQuickRedirect a;

        private e() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5ee8e9f42bd1f77dfc6e1725789a878", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5ee8e9f42bd1f77dfc6e1725789a878");
            }
        }

        @Override // com.sankuai.meituan.mapsdk.core.gesture.n.a
        public final boolean a(n nVar) {
            Object[] objArr = {nVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bccde4e0c1f3e8d07de0bf5d921d6b5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bccde4e0c1f3e8d07de0bf5d921d6b5")).booleanValue();
            }
            d.a(d.this);
            return true;
        }

        @Override // com.sankuai.meituan.mapsdk.core.gesture.n.a
        public final boolean a(n nVar, float f, float f2) {
            Object[] objArr = {nVar, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef407f27e5dfdda0785c8453be636898", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef407f27e5dfdda0785c8453be636898")).booleanValue();
            }
            for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : d.this.c) {
                if (cVar != null && cVar.a(f)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class c implements m.a {
        public static ChangeQuickRedirect a;

        private c() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c22880700ff3af350f7b205021d694c2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c22880700ff3af350f7b205021d694c2");
            }
        }

        @Override // com.sankuai.meituan.mapsdk.core.gesture.m.a
        public final boolean a(m mVar, float f, float f2) {
            Object[] objArr = {mVar, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e17b772034753b7e42534792eaf1b7e5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e17b772034753b7e42534792eaf1b7e5")).booleanValue();
            }
            PointF i = mVar.i();
            for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : d.this.c) {
                if (cVar != null && cVar.a(f, i.x, i.y)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class f implements o.a {
        public static ChangeQuickRedirect a;

        private f() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d30ea043c7067844d05c0c2a0b1cf3c5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d30ea043c7067844d05c0c2a0b1cf3c5");
            }
        }

        @Override // com.sankuai.meituan.mapsdk.core.gesture.o.a
        public final boolean a(o oVar) {
            Object[] objArr = {oVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03cbec93712aff32f0bf86032bc8430a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03cbec93712aff32f0bf86032bc8430a")).booleanValue();
            }
            d.a(d.this);
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class g implements p.a {
        public static ChangeQuickRedirect a;

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
        }

        private g() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c02b8b3661fd3f7815458857cbd9c0e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c02b8b3661fd3f7815458857cbd9c0e");
            }
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f994561d3dc5a4a3d5c96deb3575a503", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f994561d3dc5a4a3d5c96deb3575a503")).booleanValue();
            }
            d.a(d.this);
            for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : d.this.c) {
                if (cVar != null && cVar.c(MotionEvent.obtain(motionEvent))) {
                    return true;
                }
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "799dcc9ee89dd13d14789be1d1f123c7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "799dcc9ee89dd13d14789be1d1f123c7")).booleanValue();
            }
            if (motionEvent.getAction() == 1) {
                d.a(d.this);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : d.this.c) {
                    if (cVar != null && cVar.a(x, y)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59352bdee39843067621a3373a30be7c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59352bdee39843067621a3373a30be7c")).booleanValue();
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : d.this.c) {
                if (cVar != null) {
                    cVar.b(x, y);
                }
            }
            return motionEvent.getPointerCount() == 1;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e215ef3ee813ad0518a03cc2c723a456", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e215ef3ee813ad0518a03cc2c723a456")).booleanValue();
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : d.this.c) {
                if (cVar != null) {
                    cVar.d(x, y);
                }
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Object[] objArr = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d8e50fa1408f5a753175c3a30c78fb3", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d8e50fa1408f5a753175c3a30c78fb3")).booleanValue();
            }
            d.a(d.this);
            if (motionEvent2.getPointerCount() == 1) {
                for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : d.this.c) {
                    if (cVar != null && cVar.a(f, f2)) {
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48b47be1b5d47d0529c52a696d0f9ee5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48b47be1b5d47d0529c52a696d0f9ee5");
                return;
            }
            d.a(d.this);
            for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : d.this.c) {
                if (cVar != null) {
                    cVar.a(MotionEvent.obtain(motionEvent));
                }
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Object[] objArr = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc54375a0cb0e263ea0367364e8d224f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc54375a0cb0e263ea0367364e8d224f")).booleanValue();
            }
            if (motionEvent == null || motionEvent2 == null || Math.hypot(f / d.this.g, f2 / d.this.g) < 300.0d) {
                return false;
            }
            d.a(d.this);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float x2 = motionEvent2.getX() - x;
            float y2 = motionEvent2.getY() - y;
            for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : d.this.c) {
                if (cVar != null && cVar.a(x2, y2, f, f2)) {
                    return true;
                }
            }
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a implements b.a {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b1391e96c152bee8221618491c303a3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b1391e96c152bee8221618491c303a3");
            }
        }

        @Override // com.sankuai.meituan.mapsdk.core.gesture.b.a
        public final boolean a(int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5def34ae72e310df1cd7ede23e1fcee", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5def34ae72e310df1cd7ede23e1fcee")).booleanValue();
            }
            for (com.sankuai.meituan.mapsdk.core.gesture.c cVar : d.this.c) {
                if (cVar != null && cVar.a(i, i2, i3)) {
                    return true;
                }
            }
            return false;
        }
    }
}
