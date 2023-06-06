package com.meituan.msc.uimanager;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.facebook.yoga.YogaNodeJNI;
import com.meituan.msc.uimanager.annotations.ReactPropertyHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactPropertyHolder
/* loaded from: classes3.dex */
public class ReactShadowNodeImpl implements aa<ReactShadowNodeImpl> {
    public static ChangeQuickRedirect Q;
    private static final com.meituan.android.msc.yoga.c a;
    private static final com.facebook.yoga.a b;
    private static volatile Handler c;
    public int R;
    public String S;
    protected final float[] T;
    protected final boolean[] U;
    protected com.meituan.android.msc.yoga.o V;
    public String W;
    public String X;
    public String Y;
    public JSONObject Z;
    @Nullable
    private String d;
    private int e;
    @Nullable
    private ThemedReactContext f;
    private boolean g;
    private boolean h;
    @Nullable
    private List<ReactShadowNodeImpl> i;
    @Nullable
    private ReactShadowNodeImpl j;
    @Nullable
    private ReactShadowNodeImpl k;
    private boolean l;
    private int m;
    @Nullable
    private ReactShadowNodeImpl n;
    @Nullable
    private ArrayList<ReactShadowNodeImpl> o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final ah t;
    private Integer u;
    private Integer v;
    private List<Integer> w;

    public void a(UIViewOperationQueue uIViewOperationQueue) {
    }

    @Override // com.meituan.msc.uimanager.aa
    public void a(n nVar) {
    }

    public boolean a() {
        return false;
    }

    @Override // com.meituan.msc.uimanager.aa
    public boolean b() {
        return false;
    }

    public boolean d() {
        return false;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final /* synthetic */ int a(ReactShadowNodeImpl reactShadowNodeImpl) {
        ReactShadowNodeImpl reactShadowNodeImpl2 = reactShadowNodeImpl;
        Object[] objArr = {reactShadowNodeImpl2};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6288194ab56617c24f02f392ad5e29ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6288194ab56617c24f02f392ad5e29ca")).intValue();
        }
        if (this.i == null) {
            return -1;
        }
        return this.i.indexOf(reactShadowNodeImpl2);
    }

    @Override // com.meituan.msc.uimanager.aa
    public final /* bridge */ /* synthetic */ void b(@Nullable ReactShadowNodeImpl reactShadowNodeImpl) {
        this.k = reactShadowNodeImpl;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final /* synthetic */ void b(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        ReactShadowNodeImpl reactShadowNodeImpl2 = reactShadowNodeImpl;
        Object[] objArr = {reactShadowNodeImpl2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbfedba0adfb221e871aa52c0f987a95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbfedba0adfb221e871aa52c0f987a95");
            return;
        }
        com.facebook.infer.annotation.a.a(A() == m.PARENT);
        com.facebook.infer.annotation.a.a(reactShadowNodeImpl2.A() != m.NONE);
        if (this.o == null) {
            this.o = new ArrayList<>(4);
        }
        this.o.add(i, reactShadowNodeImpl2);
        reactShadowNodeImpl2.n = this;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final /* synthetic */ int c(ReactShadowNodeImpl reactShadowNodeImpl) {
        ReactShadowNodeImpl reactShadowNodeImpl2 = reactShadowNodeImpl;
        Object[] objArr = {reactShadowNodeImpl2};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "745417305974a14297eec4f20253ce0e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "745417305974a14297eec4f20253ce0e")).intValue();
        }
        com.facebook.infer.annotation.a.a(this.o);
        return this.o.indexOf(reactShadowNodeImpl2);
    }

    @Override // com.meituan.msc.uimanager.aa
    public final /* synthetic */ ReactShadowNodeImpl c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2861b8e332e41526c097bd708c7e200a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactShadowNodeImpl) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2861b8e332e41526c097bd708c7e200a");
        }
        if (this.i == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
        }
        ReactShadowNodeImpl remove = this.i.remove(i);
        remove.j = null;
        if (a()) {
            if (this.V != null && !c()) {
                this.V.c(i);
            }
        } else {
            this.V.c(i);
        }
        e();
        int W = remove.W();
        this.m -= W;
        b(-W);
        return remove;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final /* synthetic */ ReactShadowNodeImpl d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7f7dd2c335def23e492f12917a75f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactShadowNodeImpl) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7f7dd2c335def23e492f12917a75f9");
        }
        if (this.i == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
        }
        ReactShadowNodeImpl remove = this.i.remove(i);
        remove.j = null;
        if (a()) {
            if (this.V != null && !c()) {
                this.V.c(i);
            }
        } else {
            this.V.d(i);
        }
        e();
        int W = remove.W();
        this.m -= W;
        b(-W);
        return remove;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final /* synthetic */ boolean d(ReactShadowNodeImpl reactShadowNodeImpl) {
        ReactShadowNodeImpl reactShadowNodeImpl2 = reactShadowNodeImpl;
        Object[] objArr = {reactShadowNodeImpl2};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94c19ba736500f0789ab2cde5f1e150b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94c19ba736500f0789ab2cde5f1e150b")).booleanValue();
        }
        for (ReactShadowNodeImpl reactShadowNodeImpl3 = this.j; reactShadowNodeImpl3 != null; reactShadowNodeImpl3 = reactShadowNodeImpl3.j) {
            if (reactShadowNodeImpl3 == reactShadowNodeImpl2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final /* synthetic */ int e(ReactShadowNodeImpl reactShadowNodeImpl) {
        ReactShadowNodeImpl reactShadowNodeImpl2 = reactShadowNodeImpl;
        boolean z = true;
        Object[] objArr = {reactShadowNodeImpl2};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcbaff4a50e183da340d6a68b7d7d95c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcbaff4a50e183da340d6a68b7d7d95c")).intValue();
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= m()) {
                z = false;
                break;
            }
            ReactShadowNodeImpl e = e(i);
            if (reactShadowNodeImpl2 == e) {
                break;
            }
            i2 += e.W();
            i++;
        }
        if (z) {
            return i2;
        }
        throw new RuntimeException("Child " + reactShadowNodeImpl2.R + " was not a child of " + this.R);
    }

    @Override // com.meituan.msc.uimanager.aa
    public final /* synthetic */ ReactShadowNodeImpl h(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7708ff0e27bd0c0990334419dc46c80b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactShadowNodeImpl) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7708ff0e27bd0c0990334419dc46c80b");
        }
        com.facebook.infer.annotation.a.a(this.o);
        ReactShadowNodeImpl remove = this.o.remove(i);
        remove.n = null;
        return remove;
    }

    @Override // com.meituan.msc.uimanager.aa
    @Nullable
    public final /* synthetic */ ReactShadowNodeImpl s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e5a8c32070ec84811c25cf8c0e32490", RobustBitConfig.DEFAULT_VALUE) ? (ReactShadowNodeImpl) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e5a8c32070ec84811c25cf8c0e32490") : this.k != null ? this.k : this.n;
    }

    static {
        com.meituan.android.msc.yoga.e eVar = new com.meituan.android.msc.yoga.e();
        a = eVar;
        eVar.a(0.0f);
        a.a(true);
        com.facebook.yoga.a aVar = new com.facebook.yoga.a();
        b = aVar;
        aVar.a(0.0f);
        b.b(true);
        b.a(false);
    }

    public ReactShadowNodeImpl() {
        com.meituan.android.msc.yoga.o oVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7470b6f15519fb49d8c7a66f3ebb9f7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7470b6f15519fb49d8c7a66f3ebb9f7a");
            return;
        }
        this.h = true;
        this.m = 0;
        this.T = new float[9];
        this.U = new boolean[9];
        com.meituan.android.msc.yoga.o oVar2 = null;
        this.w = null;
        this.t = new ah(0.0f);
        Arrays.fill(this.T, Float.NaN);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = Q;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db6d92624a0cdaebd747f33941f6844f", RobustBitConfig.DEFAULT_VALUE)) {
            oVar = (com.meituan.android.msc.yoga.o) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db6d92624a0cdaebd747f33941f6844f");
        } else {
            if (a()) {
                if (!b()) {
                    oVar2 = new com.meituan.msc.uimanager.rn.a(new YogaNodeJNI(b));
                    oVar2.a(this);
                }
            } else {
                if (c == null) {
                    c = new Handler(Looper.myLooper());
                }
                oVar2 = new com.meituan.android.msc.yoga.p(a, c);
                oVar2.a(this);
                oVar2.a(b());
            }
            oVar = oVar2;
        }
        this.V = oVar;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcdd9c98ae9b5422cfde58932d8c7d17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcdd9c98ae9b5422cfde58932d8c7d17");
            return;
        }
        this.Y = str;
        this.V.c(str);
    }

    @Override // com.meituan.msc.uimanager.aa
    public final JSONObject f() {
        return this.Z;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final String g() {
        return this.W;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final String h() {
        return this.X;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd0ebb050b8e39e87c05b60f76cdbaf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd0ebb050b8e39e87c05b60f76cdbaf") : (String) com.facebook.infer.annotation.a.a(this.d);
    }

    @Override // com.meituan.msc.uimanager.aa
    public final String j() {
        return this.S;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final boolean k() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "511f1fed3ed42c6b30aa34acc59b48db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "511f1fed3ed42c6b30aa34acc59b48db")).booleanValue();
        }
        if (!this.h && !U()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = Q;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc7fa8c7a9df4e2c04790678462b73ab", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc7fa8c7a9df4e2c04790678462b73ab")).booleanValue();
            } else {
                z = this.V != null && this.V.h();
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61f5edf56b395dbe23112e63e2ddf6b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61f5edf56b395dbe23112e63e2ddf6b4");
            return;
        }
        this.h = false;
        if (U()) {
            V();
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d6dc0c70d3dad0e81cd171abd60a42b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d6dc0c70d3dad0e81cd171abd60a42b");
        } else if (this.h) {
        } else {
            this.h = true;
            ReactShadowNodeImpl reactShadowNodeImpl = this.j;
            if (reactShadowNodeImpl != null) {
                reactShadowNodeImpl.e();
            }
        }
    }

    public final void R() {
        ReactShadowNodeImpl reactShadowNodeImpl = this;
        while (true) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = Q;
            if (PatchProxy.isSupport(objArr, reactShadowNodeImpl, changeQuickRedirect, false, "fbb3969da52f4d76bc0abd7bdb25f991", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, reactShadowNodeImpl, changeQuickRedirect, false, "fbb3969da52f4d76bc0abd7bdb25f991");
                return;
            } else if (!reactShadowNodeImpl.b()) {
                reactShadowNodeImpl.V.g();
                return;
            } else if (reactShadowNodeImpl.j == null) {
                return;
            } else {
                reactShadowNodeImpl = reactShadowNodeImpl.j;
            }
        }
    }

    @Override // com.meituan.msc.uimanager.aa
    public void a(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        Object[] objArr = {reactShadowNodeImpl, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fcb66b117bd17344255e98d0e4d5a6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fcb66b117bd17344255e98d0e4d5a6b");
            return;
        }
        if (this.i == null) {
            this.i = new ArrayList(4);
        }
        if (i > this.i.size() || i < 0) {
            com.meituan.msc.modules.reporter.g.b("[ReactShadowNodeImpl@addChildAt]", null, "child index out of bound, i:", Integer.valueOf(i), ", childToAdd: ", Integer.valueOf(reactShadowNodeImpl.R), ",mChildren size:", Integer.valueOf(this.i.size()), ", parent: ", Integer.valueOf(this.R));
            return;
        }
        this.i.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.j = this;
        com.meituan.android.msc.yoga.o oVar = reactShadowNodeImpl.V;
        if (oVar == null && !c()) {
            throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + reactShadowNodeImpl.toString() + "' to a '" + toString() + "')");
        }
        this.V.a(oVar, i);
        e();
        int W = reactShadowNodeImpl.W();
        this.m += W;
        b(W);
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1934adeb144dd9f169e0220c1be8853", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1934adeb144dd9f169e0220c1be8853")).booleanValue() : X();
    }

    @Override // com.meituan.msc.uimanager.aa
    public final int m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "191edbf6ac941e55b608a4f2bcd85c9f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "191edbf6ac941e55b608a4f2bcd85c9f")).intValue();
        }
        if (this.i == null) {
            return 0;
        }
        return this.i.size();
    }

    public void i(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "118217faeed300b8580be003c5fd1c88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "118217faeed300b8580be003c5fd1c88");
        } else {
            this.V.b(i);
        }
    }

    @Override // com.meituan.msc.uimanager.aa
    public final List<aa> b(ag agVar) {
        Object[] objArr = {agVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c88dbdc3bd34b40ffb827eea767174", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c88dbdc3bd34b40ffb827eea767174");
        }
        ArrayList arrayList = new ArrayList();
        List<Integer> b2 = this.V.b();
        if (b2 != null) {
            for (Integer num : b2) {
                aa c2 = agVar.c(num.intValue());
                if (c2 != null) {
                    arrayList.add(c2);
                }
            }
        }
        return arrayList;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final List<Integer> n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a2c3cd7924a00078477f1d1f95ca8cd", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a2c3cd7924a00078477f1d1f95ca8cd") : this.V.b();
    }

    @Override // com.meituan.msc.uimanager.aa
    /* renamed from: j */
    public final ReactShadowNodeImpl e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c1f3e56d531058470c2d4abb3af8a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactShadowNodeImpl) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c1f3e56d531058470c2d4abb3af8a6");
        }
        if (this.i == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
        }
        return this.i.get(i);
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void o() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0475e47d504970650c918c4a1c69dbd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0475e47d504970650c918c4a1c69dbd4");
        } else if (m() != 0) {
            for (int m = m() - 1; m >= 0; m--) {
                if (a()) {
                    if (this.V != null && !c()) {
                        this.V.c(m);
                    }
                } else {
                    this.V.c(m);
                }
                ReactShadowNodeImpl e = e(m);
                e.j = null;
                i += e.W();
            }
            ((List) com.facebook.infer.annotation.a.a(this.i)).clear();
            e();
            this.m -= i;
            b(-i);
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc283963678e6c3138634da9c14fee11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc283963678e6c3138634da9c14fee11");
        } else if (A() != m.PARENT) {
            for (ReactShadowNodeImpl reactShadowNodeImpl = this.j; reactShadowNodeImpl != null; reactShadowNodeImpl = reactShadowNodeImpl.j) {
                reactShadowNodeImpl.m += i;
                if (reactShadowNodeImpl.A() == m.PARENT) {
                    return;
                }
            }
        }
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void a(ab abVar) {
        Object[] objArr = {abVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eb37201a36ecaae8f8235ce29005b05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eb37201a36ecaae8f8235ce29005b05");
        } else {
            au.a(this, abVar);
        }
    }

    @Override // com.meituan.msc.uimanager.aa
    public final boolean a(float f, float f2, UIViewOperationQueue uIViewOperationQueue, @Nullable n nVar) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), uIViewOperationQueue, nVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6e5fb4ba80e10e6fed5e290a2c85b32", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6e5fb4ba80e10e6fed5e290a2c85b32")).booleanValue();
        }
        if (this.h) {
            a(uIViewOperationQueue);
        }
        if (U()) {
            float B = B();
            float C = C();
            float f3 = f + B;
            int round = Math.round(f3);
            float f4 = f2 + C;
            int round2 = Math.round(f4);
            int round3 = Math.round(f3 + D());
            int round4 = Math.round(f4 + E());
            int round5 = Math.round(B);
            int round6 = Math.round(C);
            int i = round3 - round;
            int i2 = round4 - round2;
            boolean z = (round5 == this.p && round6 == this.q && i == this.r && i2 == this.s) ? false : true;
            this.p = round5;
            this.q = round6;
            this.r = i;
            this.s = i2;
            if (z) {
                if (nVar != null) {
                    nVar.b(this);
                } else {
                    uIViewOperationQueue.a(q(), this.j.R, this.R, this.p, this.q, this.r, this.s, this.d);
                }
            }
            return z;
        }
        return false;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final int p() {
        return this.R;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2759da463174a4e5d95e9c15339d5666", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2759da463174a4e5d95e9c15339d5666");
            return;
        }
        this.R = i;
        if (this.V != null) {
            this.V.a(this.R);
        }
    }

    @Override // com.meituan.msc.uimanager.aa
    public final int q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de973e540434e7e907a8d70b7699b200", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de973e540434e7e907a8d70b7699b200")).intValue();
        }
        com.facebook.infer.annotation.a.a(this.e != 0);
        return this.e;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void g(int i) {
        this.e = i;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void b(String str) {
        this.d = str;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f952774833bfb075d2e11f7fdc32fa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f952774833bfb075d2e11f7fdc32fa3");
            return;
        }
        this.S = str;
        if (this.V != null) {
            this.V.d(this.S);
        }
    }

    @Override // com.meituan.msc.uimanager.aa
    public final ThemedReactContext t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b6f29fb050efbb2660b6e612c6f4a86", RobustBitConfig.DEFAULT_VALUE) ? (ThemedReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b6f29fb050efbb2660b6e612c6f4a86") : (ThemedReactContext) com.facebook.infer.annotation.a.a(this.f);
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void a(ThemedReactContext themedReactContext) {
        this.f = themedReactContext;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final boolean u() {
        return this.g;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baa31d8aeed22c2b90e77dfba7b85bb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baa31d8aeed22c2b90e77dfba7b85bb3");
        } else {
            a(Float.NaN, Float.NaN);
        }
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "014e1bec04c09403d7453be6994872b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "014e1bec04c09403d7453be6994872b4");
        } else {
            this.V.a(f, f2);
        }
    }

    private boolean U() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98835f3582d0929d54496e533e562ddf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98835f3582d0929d54496e533e562ddf")).booleanValue() : this.V != null && this.V.d();
    }

    private void V() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed69b43d5421782da42f28e1f8674c90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed69b43d5421782da42f28e1f8674c90");
        } else if (this.V != null) {
            this.V.i();
        }
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36ec8d1f3dd3c6beb2a9a42cd696d54a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36ec8d1f3dd3c6beb2a9a42cd696d54a");
        } else if (this.o != null) {
            for (int size = this.o.size() - 1; size >= 0; size--) {
                this.o.get(size).n = null;
            }
            this.o.clear();
        }
    }

    @Override // com.meituan.msc.uimanager.aa
    public final int x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a224afffab5407fe26cc071f0c84bb77", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a224afffab5407fe26cc071f0c84bb77")).intValue();
        }
        if (this.o == null) {
            return 0;
        }
        return this.o.size();
    }

    @Override // com.meituan.msc.uimanager.aa
    public final boolean z() {
        return this.l;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final m A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e5292c2927ff88a881abdc95fe3cfcc", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e5292c2927ff88a881abdc95fe3cfcc");
        }
        if (b() || this.l) {
            return m.NONE;
        }
        return d() ? m.LEAF : m.PARENT;
    }

    private int W() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c48cdb4cd82490255ec9c69d82de3398", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c48cdb4cd82490255ec9c69d82de3398")).intValue();
        }
        m A = A();
        if (A == m.NONE) {
            return this.m;
        }
        if (A == m.LEAF) {
            return this.m + 1;
        }
        return 1;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddae4c645271af540f1f5a042490336f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddae4c645271af540f1f5a042490336f");
        }
        return "[" + this.d + StringUtil.SPACE + this.R + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final float B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ba960fea3798fd88d6aa5070af98127", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ba960fea3798fd88d6aa5070af98127")).floatValue() : this.V.q();
    }

    @Override // com.meituan.msc.uimanager.aa
    public final float C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0f3f18d8b81ea7ab78846a09cc9d563", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0f3f18d8b81ea7ab78846a09cc9d563")).floatValue() : this.V.r();
    }

    @Override // com.meituan.msc.uimanager.aa
    public final float D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49aac59c629dd2e6b0e9e7b5e8f8fe9c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49aac59c629dd2e6b0e9e7b5e8f8fe9c")).floatValue() : this.V.s();
    }

    @Override // com.meituan.msc.uimanager.aa
    public final float E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31a468239f8dfe003a2a7abc13783156", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31a468239f8dfe003a2a7abc13783156")).floatValue() : this.V.t();
    }

    @Override // com.meituan.msc.uimanager.aa
    public final int F() {
        return this.p;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final int G() {
        return this.q;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final int H() {
        return this.r;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final int I() {
        return this.s;
    }

    public final com.meituan.android.msc.yoga.g S() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "751437c275f86853aec3676706d6cad6", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.msc.yoga.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "751437c275f86853aec3676706d6cad6") : this.V.u();
    }

    @Override // com.meituan.msc.uimanager.aa
    public final com.meituan.android.msc.yoga.t J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f59444889d59a89703c30d92bb1dbf", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.msc.yoga.t) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f59444889d59a89703c30d92bb1dbf") : this.V.m();
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb087007a575d25037b9c633afacdad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb087007a575d25037b9c633afacdad9");
        } else {
            this.V.f(f);
        }
    }

    @Override // com.meituan.msc.uimanager.aa
    public final com.meituan.android.msc.yoga.t K() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e69358b5ac34a5eb88ebe19610e2eea7", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.msc.yoga.t) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e69358b5ac34a5eb88ebe19610e2eea7") : this.V.o();
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94c1bc259016e1afb8d3d73713fa3744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94c1bc259016e1afb8d3d73713fa3744");
        } else {
            this.V.h(f);
        }
    }

    public void setFlex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6952d9d0d370674cc34c7bbf0117e0a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6952d9d0d370674cc34c7bbf0117e0a1");
        } else {
            this.V.a(f);
        }
    }

    public void setFlexGrow(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dbaa33c57d895ef0bf9cde3de2d9ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dbaa33c57d895ef0bf9cde3de2d9ddf");
        } else {
            this.V.b(f);
        }
    }

    public void setFlexShrink(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8afdc23c781c4881faa9be04c7a95595", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8afdc23c781c4881faa9be04c7a95595");
        } else {
            this.V.c(f);
        }
    }

    public final void a(com.meituan.android.msc.yoga.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f0d9c95e51e11e95b681abd6f4f318a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f0d9c95e51e11e95b681abd6f4f318a");
        } else {
            this.V.a(jVar);
        }
    }

    public final void a(com.meituan.android.msc.yoga.u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5000f939fa071ea9cab694a3679d74f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5000f939fa071ea9cab694a3679d74f5");
        } else {
            this.V.a(uVar);
        }
    }

    public final void a(com.meituan.android.msc.yoga.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81c75316cb52c93cf3d3ab85d5439fed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81c75316cb52c93cf3d3ab85d5439fed");
        } else {
            this.V.b(aVar);
        }
    }

    public final void b(com.meituan.android.msc.yoga.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72fb61abbb8d2caacc393742fe3d228b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72fb61abbb8d2caacc393742fe3d228b");
        } else {
            this.V.a(aVar);
        }
    }

    public final void c(com.meituan.android.msc.yoga.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a3c223d2169434bf52d21614e82629d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a3c223d2169434bf52d21614e82629d");
        } else {
            this.V.c(aVar);
        }
    }

    public final void a(com.meituan.android.msc.yoga.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "980ca45af3d0fa0b9b68cb4bc5b48d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "980ca45af3d0fa0b9b68cb4bc5b48d64");
        } else {
            this.V.a(kVar);
        }
    }

    public final void a(com.meituan.android.msc.yoga.q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56ab9de5aab2210a4328386401a7d3cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56ab9de5aab2210a4328386401a7d3cc");
        } else {
            this.V.a(qVar);
        }
    }

    public final void a(com.meituan.android.msc.yoga.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a87e91f6f730a5eb5ce13fc51ad2efd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a87e91f6f730a5eb5ce13fc51ad2efd4");
        } else {
            this.V.a(hVar);
        }
    }

    public void a(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9790e3e22b4fe96da6e832e6b8d23633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9790e3e22b4fe96da6e832e6b8d23633");
        } else {
            this.V.b(com.meituan.android.msc.yoga.i.a(i), f);
        }
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "730be556ca23a7a9bf6602870ceb27cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "730be556ca23a7a9bf6602870ceb27cb");
        } else {
            this.V.a(com.meituan.android.msc.yoga.i.a(i));
        }
    }

    public final float k(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9286587780b5d2b73631ccffb70d0860", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9286587780b5d2b73631ccffb70d0860")).floatValue() : this.V.c(com.meituan.android.msc.yoga.i.a(i));
    }

    public final float l(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb2530a97441d6fa265c9b295c26420b", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb2530a97441d6fa265c9b295c26420b")).floatValue() : this.V.b(com.meituan.android.msc.yoga.i.a(i));
    }

    public void b(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed4d93ac05b9dc9fd0d473c39884cb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed4d93ac05b9dc9fd0d473c39884cb0");
            return;
        }
        this.T[i] = f;
        this.U[i] = !com.meituan.android.msc.yoga.f.a(f);
        T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void T() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.msc.uimanager.ReactShadowNodeImpl.Q
            java.lang.String r10 = "f70661fee2a2fb943abbc1af6e9b7e51"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            return
        L18:
            r1 = 8
            if (r0 > r1) goto Lcd
            if (r0 == 0) goto L79
            r2 = 2
            if (r0 == r2) goto L79
            r2 = 4
            if (r0 == r2) goto L79
            r2 = 5
            if (r0 != r2) goto L28
            goto L79
        L28:
            r2 = 1
            if (r0 == r2) goto L4a
            r2 = 3
            if (r0 != r2) goto L2f
            goto L4a
        L2f:
            float[] r1 = r11.T
            r1 = r1[r0]
            boolean r1 = com.meituan.android.msc.yoga.f.a(r1)
            if (r1 == 0) goto La8
            com.meituan.android.msc.yoga.o r1 = r11.V
            com.meituan.android.msc.yoga.i r2 = com.meituan.android.msc.yoga.i.a(r0)
            com.meituan.msc.uimanager.ah r3 = r11.t
            float[] r3 = r3.b
            r3 = r3[r0]
            r1.c(r2, r3)
            goto Lc9
        L4a:
            float[] r2 = r11.T
            r2 = r2[r0]
            boolean r2 = com.meituan.android.msc.yoga.f.a(r2)
            if (r2 == 0) goto La8
            float[] r2 = r11.T
            r3 = 7
            r2 = r2[r3]
            boolean r2 = com.meituan.android.msc.yoga.f.a(r2)
            if (r2 == 0) goto La8
            float[] r2 = r11.T
            r1 = r2[r1]
            boolean r1 = com.meituan.android.msc.yoga.f.a(r1)
            if (r1 == 0) goto La8
            com.meituan.android.msc.yoga.o r1 = r11.V
            com.meituan.android.msc.yoga.i r2 = com.meituan.android.msc.yoga.i.a(r0)
            com.meituan.msc.uimanager.ah r3 = r11.t
            float[] r3 = r3.b
            r3 = r3[r0]
            r1.c(r2, r3)
            goto Lc9
        L79:
            float[] r2 = r11.T
            r2 = r2[r0]
            boolean r2 = com.meituan.android.msc.yoga.f.a(r2)
            if (r2 == 0) goto La8
            float[] r2 = r11.T
            r3 = 6
            r2 = r2[r3]
            boolean r2 = com.meituan.android.msc.yoga.f.a(r2)
            if (r2 == 0) goto La8
            float[] r2 = r11.T
            r1 = r2[r1]
            boolean r1 = com.meituan.android.msc.yoga.f.a(r1)
            if (r1 == 0) goto La8
            com.meituan.android.msc.yoga.o r1 = r11.V
            com.meituan.android.msc.yoga.i r2 = com.meituan.android.msc.yoga.i.a(r0)
            com.meituan.msc.uimanager.ah r3 = r11.t
            float[] r3 = r3.b
            r3 = r3[r0]
            r1.c(r2, r3)
            goto Lc9
        La8:
            boolean[] r1 = r11.U
            boolean r1 = r1[r0]
            if (r1 == 0) goto Lbc
            com.meituan.android.msc.yoga.o r1 = r11.V
            com.meituan.android.msc.yoga.i r2 = com.meituan.android.msc.yoga.i.a(r0)
            float[] r3 = r11.T
            r3 = r3[r0]
            r1.d(r2, r3)
            goto Lc9
        Lbc:
            com.meituan.android.msc.yoga.o r1 = r11.V
            com.meituan.android.msc.yoga.i r2 = com.meituan.android.msc.yoga.i.a(r0)
            float[] r3 = r11.T
            r3 = r3[r0]
            r1.c(r2, r3)
        Lc9:
            int r0 = r0 + 1
            goto L18
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.ReactShadowNodeImpl.T():void");
    }

    public final void c(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c580800556fe9c381760fe5b3db6675", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c580800556fe9c381760fe5b3db6675");
        } else {
            this.V.e(com.meituan.android.msc.yoga.i.a(i), f);
        }
    }

    public final void a(com.meituan.android.msc.yoga.r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab1a29237334b9ef7bf2fde0883c2a0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab1a29237334b9ef7bf2fde0883c2a0a");
        } else {
            this.V.a(rVar);
        }
    }

    public void setShouldNotifyOnLayout(boolean z) {
        this.g = z;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void b(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b50cfed67cb8f2cf3eca431beb3dd6ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b50cfed67cb8f2cf3eca431beb3dd6ae");
        } else {
            this.V.b(true);
        }
    }

    public final void a(com.meituan.android.msc.yoga.l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48ab394126011042095a3ac930ccb3f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48ab394126011042095a3ac930ccb3f1");
        } else if (this.V != null) {
            this.V.a(lVar);
        }
    }

    private boolean X() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6648a5bbc615220b230d066c618c15eb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6648a5bbc615220b230d066c618c15eb")).booleanValue() : this.V != null && this.V.v();
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17cc9543375cc30916b90ffcbc4b7ae1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17cc9543375cc30916b90ffcbc4b7ae1");
            return;
        }
        this.u = Integer.valueOf(i);
        this.v = Integer.valueOf(i2);
    }

    @Override // com.meituan.msc.uimanager.aa
    public final Integer L() {
        return this.u;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final Integer M() {
        return this.v;
    }

    @Override // com.meituan.msc.uimanager.aa
    public List<aa> a(ag agVar) {
        Object[] objArr = {agVar};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8233f6caa4e04261b81df3566b4cf486", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8233f6caa4e04261b81df3566b4cf486");
        }
        if (!a()) {
            return b(agVar);
        }
        if (this.i != null) {
            return new ArrayList(this.i);
        }
        return null;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void a(List<Integer> list) {
        this.w = list;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final List<Integer> N() {
        return this.w;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final long O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0c8accc5a58eb7b73690ba4a3053ef3", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0c8accc5a58eb7b73690ba4a3053ef3")).longValue() : this.V.a();
    }

    @Override // com.meituan.msc.uimanager.aa
    public final boolean P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = Q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "988f6662b8065d90f67a51a77344b32e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "988f6662b8065d90f67a51a77344b32e")).booleanValue() : this.V.k();
    }

    @Override // com.meituan.msc.uimanager.aa
    public final com.meituan.android.msc.yoga.o Q() {
        return this.V;
    }

    @Override // com.meituan.msc.uimanager.aa
    public final void a(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = Q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "441a79ac89d074d9b4b76586bc8140e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "441a79ac89d074d9b4b76586bc8140e1");
            return;
        }
        com.facebook.infer.annotation.a.a(this.j == null, "Must remove from no opt parent first");
        com.facebook.infer.annotation.a.a(this.n == null, "Must remove from native parent first");
        com.facebook.infer.annotation.a.a(x() == 0, "Must remove all native children first");
        this.l = false;
    }

    @Override // com.meituan.msc.uimanager.aa
    @Nullable
    public final /* bridge */ /* synthetic */ ReactShadowNodeImpl y() {
        return this.n;
    }

    @Override // com.meituan.msc.uimanager.aa
    @Nullable
    public final /* bridge */ /* synthetic */ ReactShadowNodeImpl r() {
        return this.j;
    }
}
