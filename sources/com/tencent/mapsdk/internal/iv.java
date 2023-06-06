package com.tencent.mapsdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.mapsdk.internal.ig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class iv extends ig {
    static final int c = 0;
    static final int d = 1;
    static final int e = 0;
    static final int f = 1;
    static final int g = 2;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = -1;
    private long B;
    long h;
    ir[] k;
    HashMap<Integer, ir> l;
    protected id m;
    private static ThreadLocal<a> q = new ThreadLocal<>();
    private static final ThreadLocal<ArrayList<iv>> r = new ThreadLocal<ArrayList<iv>>() { // from class: com.tencent.mapsdk.internal.iv.1
        private static ArrayList<iv> a() {
            return new ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ ArrayList<iv> initialValue() {
            return new ArrayList<>();
        }
    };
    private static final ThreadLocal<ArrayList<iv>> s = new ThreadLocal<ArrayList<iv>>() { // from class: com.tencent.mapsdk.internal.iv.2
        private static ArrayList<iv> a() {
            return new ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ ArrayList<iv> initialValue() {
            return new ArrayList<>();
        }
    };
    private static final ThreadLocal<ArrayList<iv>> t = new ThreadLocal<ArrayList<iv>>() { // from class: com.tencent.mapsdk.internal.iv.3
        private static ArrayList<iv> a() {
            return new ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ ArrayList<iv> initialValue() {
            return new ArrayList<>();
        }
    };
    private static final ThreadLocal<ArrayList<iv>> u = new ThreadLocal<ArrayList<iv>>() { // from class: com.tencent.mapsdk.internal.iv.4
        private static ArrayList<iv> a() {
            return new ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ ArrayList<iv> initialValue() {
            return new ArrayList<>();
        }
    };
    private static final ThreadLocal<ArrayList<iv>> v = new ThreadLocal<ArrayList<iv>>() { // from class: com.tencent.mapsdk.internal.iv.5
        private static ArrayList<iv> a() {
            return new ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ ArrayList<iv> initialValue() {
            return new ArrayList<>();
        }
    };
    private static final Interpolator w = new LinearInterpolator();
    private static final long b = 10;
    private static long G = b;
    long i = -1;
    private boolean x = false;
    private int y = 0;
    private float z = 0.0f;
    private boolean A = false;
    int j = 0;
    private boolean C = false;
    private boolean D = false;
    private long E = 300;
    private long F = 0;
    private int H = 0;
    private int I = 1;
    private Interpolator J = w;
    private ArrayList<b> K = null;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    private static void C() {
    }

    static /* synthetic */ boolean c(iv ivVar) {
        ivVar.C = true;
        return true;
    }

    public iv(id idVar) {
        this.m = idVar;
    }

    private static iv a(id idVar, int... iArr) {
        iv ivVar = new iv(idVar);
        ivVar.a(iArr);
        return ivVar;
    }

    public static iv b(double... dArr) {
        iv ivVar = new iv(null);
        ivVar.a(dArr);
        return ivVar;
    }

    private static iv a(id idVar, ir... irVarArr) {
        iv ivVar = new iv(idVar);
        ivVar.a(irVarArr);
        return ivVar;
    }

    private static iv a(id idVar, iu<?> iuVar, Object[] objArr) {
        iv ivVar = new iv(idVar);
        ivVar.a(objArr);
        ivVar.a(iuVar);
        return ivVar;
    }

    public void a(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        if (this.k == null || this.k.length == 0) {
            a(ir.a(0, iArr));
        } else {
            this.k[0].a(iArr);
        }
    }

    public void a(double... dArr) {
        if (dArr == null || dArr.length == 0) {
            return;
        }
        if (this.k == null || this.k.length == 0) {
            a(ir.a(0, dArr));
        } else {
            this.k[0].a(dArr);
        }
    }

    public void a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        if (this.k == null || this.k.length == 0) {
            a(ir.a(0, objArr));
        } else {
            this.k[0].a(objArr);
        }
    }

    public final void a(ir... irVarArr) {
        int length = irVarArr.length;
        this.k = irVarArr;
        this.l = new HashMap<>(length);
        for (ir irVar : irVarArr) {
            this.l.put(Integer.valueOf(irVar.a), irVar);
        }
    }

    private ir[] o() {
        return this.k;
    }

    @Override // com.tencent.mapsdk.internal.ig
    public ig b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: ".concat(String.valueOf(j)));
        }
        this.E = j;
        return this;
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final long e() {
        return this.E;
    }

    private void e(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.j != 1) {
            this.i = j;
            this.j = 2;
        }
        this.h = uptimeMillis - j;
        c(uptimeMillis);
    }

    private long p() {
        if (this.j == 0) {
            return 0L;
        }
        return SystemClock.uptimeMillis() - this.h;
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final long d() {
        return this.F;
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final void a(long j) {
        this.F = j;
    }

    private static long q() {
        return G;
    }

    public static void d(long j) {
        G = j;
    }

    private Object r() {
        if (this.k == null || this.k.length <= 0) {
            return null;
        }
        return this.k[0].b();
    }

    private Object a(int i) {
        ir irVar = this.l.get(Integer.valueOf(i));
        if (irVar != null) {
            return irVar.b();
        }
        return null;
    }

    private void b(int i) {
        this.H = i;
    }

    private int s() {
        return this.H;
    }

    private void c(int i) {
        this.I = i;
    }

    private int t() {
        return this.I;
    }

    private void a(b bVar) {
        if (this.K == null) {
            this.K = new ArrayList<>();
        }
        this.K.add(bVar);
    }

    private void u() {
        if (this.K == null) {
            return;
        }
        this.K.clear();
        this.K = null;
    }

    private void b(b bVar) {
        if (this.K == null) {
            return;
        }
        this.K.remove(bVar);
        if (this.K.size() == 0) {
            this.K = null;
        }
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final void a(Interpolator interpolator) {
        if (interpolator != null) {
            this.J = interpolator;
        } else {
            this.J = new LinearInterpolator();
        }
    }

    private Interpolator v() {
        return this.J;
    }

    public final void a(iu<?> iuVar) {
        if (iuVar == null || this.k == null || this.k.length <= 0) {
            return;
        }
        this.k[0].a(iuVar);
    }

    private void a(boolean z) {
        this.x = z;
        this.y = 0;
        this.j = 0;
        this.D = true;
        this.A = false;
        s.get().add(this);
        if (this.F == 0) {
            long uptimeMillis = this.j != 0 ? SystemClock.uptimeMillis() - this.h : 0L;
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (this.j != 1) {
                this.i = uptimeMillis;
                this.j = 2;
            }
            this.h = uptimeMillis2 - uptimeMillis;
            c(uptimeMillis2);
            this.j = 0;
            this.C = true;
            if (this.a != null) {
                ArrayList arrayList = (ArrayList) this.a.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ig.a) arrayList.get(i)).a(this);
                }
            }
        }
        a aVar = q.get();
        if (aVar == null) {
            aVar = new a(Looper.getMainLooper());
            q.set(aVar);
        } else {
            aVar.removeMessages(0);
            aVar.removeMessages(1);
        }
        aVar.sendEmptyMessage(0);
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final void a() {
        a(false);
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final void b() {
        if (this.j != 0 || s.get().contains(this) || t.get().contains(this)) {
            if (this.C && this.a != null) {
                Iterator it = ((ArrayList) this.a.clone()).iterator();
                while (it.hasNext()) {
                    ((ig.a) it.next()).a();
                }
            }
            x();
        }
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final void c() {
        if (!r.get().contains(this) && !s.get().contains(this)) {
            this.A = false;
            y();
        }
        if (this.H > 0 && (this.H & 1) == 1) {
            a(0.0f);
        } else {
            a(1.0f);
        }
        x();
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final boolean f() {
        return this.j == 1 || this.C;
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final boolean g() {
        return this.D;
    }

    private void w() {
        this.x = !this.x;
        if (this.j == 1) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.h = uptimeMillis - (this.E - (uptimeMillis - this.h));
            return;
        }
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        r.get().remove(this);
        s.get().remove(this);
        t.get().remove(this);
        this.j = 0;
        if (this.C && this.a != null) {
            ArrayList arrayList = (ArrayList) this.a.clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ig.a) arrayList.get(i)).b(this);
            }
        }
        this.C = false;
        this.D = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        r.get().add(this);
        if (this.F <= 0 || this.a == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.a.clone();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ig.a) arrayList.get(i)).a(this);
        }
    }

    private boolean f(long j) {
        if (!this.A) {
            this.A = true;
            this.B = j;
            return false;
        }
        long j2 = j - this.B;
        if (j2 > this.F) {
            this.h = j - (j2 - this.F);
            this.j = 1;
            return true;
        }
        return false;
    }

    protected boolean c(long j) {
        if (this.j == 0) {
            this.j = 1;
            if (this.i < 0) {
                this.h = j;
            } else {
                this.h = j - this.i;
                this.i = -1L;
            }
        }
        boolean z = false;
        switch (this.j) {
            case 1:
            case 2:
                float f2 = this.E > 0 ? ((float) (j - this.h)) / ((float) this.E) : 1.0f;
                if (f2 >= 1.0f) {
                    if (this.y < this.H || this.H == -1) {
                        if (this.a != null) {
                            int size = this.a.size();
                            for (int i = 0; i < size; i++) {
                                this.a.get(i);
                            }
                        }
                        if (this.I == 2) {
                            this.x = !this.x;
                        }
                        this.y += (int) f2;
                        f2 %= 1.0f;
                        this.h += this.E;
                    } else {
                        f2 = Math.min(f2, 1.0f);
                        z = true;
                    }
                }
                if (this.x) {
                    f2 = 1.0f - f2;
                }
                a(f2);
                break;
        }
        return z;
    }

    private float z() {
        return this.z;
    }

    protected void a(float f2) {
        float interpolation = this.J.getInterpolation(f2);
        this.z = interpolation;
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            this.k[i].a(interpolation);
            if (this.m != null) {
                this.m.a(this.k[i].a, this.k[i].b());
            }
        }
        if (this.K != null) {
            int size = this.K.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.K.get(i2);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.ig
    /* renamed from: h */
    public ig clone() {
        iv ivVar = (iv) super.clone();
        if (this.K != null) {
            ArrayList<b> arrayList = this.K;
            ivVar.K = new ArrayList<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ivVar.K.add(arrayList.get(i));
            }
        }
        ivVar.i = -1L;
        ivVar.x = false;
        ivVar.y = 0;
        ivVar.j = 0;
        ivVar.A = false;
        ir[] irVarArr = this.k;
        if (irVarArr != null) {
            int length = irVarArr.length;
            ivVar.k = new ir[length];
            ivVar.l = new HashMap<>(length);
            for (int i2 = 0; i2 < length; i2++) {
                ir clone = irVarArr[i2].clone();
                ivVar.k[i2] = clone;
                ivVar.l.put(Integer.valueOf(clone.a), clone);
            }
        }
        return ivVar;
    }

    private static int A() {
        return r.get().size();
    }

    private static void B() {
        r.get().clear();
        s.get().clear();
        t.get().clear();
    }

    public String toString() {
        String str = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.k != null) {
            for (int i = 0; i < this.k.length; i++) {
                str = str + "\n    " + this.k[i].toString();
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            boolean z;
            ArrayList arrayList = (ArrayList) iv.r.get();
            ArrayList arrayList2 = (ArrayList) iv.t.get();
            switch (message.what) {
                case 0:
                    ArrayList arrayList3 = (ArrayList) iv.s.get();
                    z = arrayList.size() <= 0 && arrayList2.size() <= 0;
                    while (arrayList3.size() > 0) {
                        ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                        arrayList3.clear();
                        int size = arrayList4.size();
                        for (int i = 0; i < size; i++) {
                            iv ivVar = (iv) arrayList4.get(i);
                            if (ivVar.F == 0) {
                                ivVar.y();
                            } else {
                                arrayList2.add(ivVar);
                            }
                        }
                    }
                    break;
                case 1:
                    z = true;
                    break;
                default:
                    return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            ArrayList arrayList5 = (ArrayList) iv.v.get();
            ArrayList arrayList6 = (ArrayList) iv.u.get();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                iv ivVar2 = (iv) arrayList2.get(i2);
                if (iv.a(ivVar2, uptimeMillis)) {
                    arrayList5.add(ivVar2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i3 = 0; i3 < size3; i3++) {
                    iv ivVar3 = (iv) arrayList5.get(i3);
                    ivVar3.y();
                    iv.c(ivVar3);
                    arrayList2.remove(ivVar3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i4 = 0;
            while (i4 < size4) {
                iv ivVar4 = (iv) arrayList.get(i4);
                if (ivVar4.c(uptimeMillis)) {
                    arrayList6.add(ivVar4);
                }
                if (arrayList.size() == size4) {
                    i4++;
                } else {
                    size4--;
                    arrayList6.remove(ivVar4);
                }
            }
            if (arrayList6.size() > 0) {
                for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                    ((iv) arrayList6.get(i5)).x();
                }
                arrayList6.clear();
            }
            if (z) {
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    return;
                }
                sendEmptyMessageDelayed(1, Math.max(0L, iv.G - (SystemClock.uptimeMillis() - uptimeMillis)));
            }
        }
    }

    static /* synthetic */ boolean a(iv ivVar, long j) {
        if (!ivVar.A) {
            ivVar.A = true;
            ivVar.B = j;
            return false;
        }
        long j2 = j - ivVar.B;
        if (j2 > ivVar.F) {
            ivVar.h = j - (j2 - ivVar.F);
            ivVar.j = 1;
            return true;
        }
        return false;
    }
}
