package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.e;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f {
    public static float X = 0.5f;
    protected int T;
    protected int U;
    public int V;
    public int W;
    public Object aa;
    boolean ad;
    boolean ae;
    boolean ak;
    boolean al;
    n e;
    n f;
    public boolean p;
    public boolean q;
    public int c = -1;
    public int d = -1;
    public int g = 0;
    public int h = 0;
    int[] i = new int[2];
    public int j = 0;
    public int k = 0;
    public float l = 1.0f;
    public int m = 0;
    public int n = 0;
    public float o = 1.0f;
    int r = -1;
    float s = 1.0f;
    h t = null;
    public int[] u = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float v = 0.0f;
    e w = new e(this, e.c.LEFT);
    e x = new e(this, e.c.TOP);
    e y = new e(this, e.c.RIGHT);
    e z = new e(this, e.c.BOTTOM);
    e A = new e(this, e.c.BASELINE);
    e B = new e(this, e.c.CENTER_X);
    e C = new e(this, e.c.CENTER_Y);
    e D = new e(this, e.c.CENTER);
    protected e[] E = {this.w, this.y, this.x, this.z, this.A, this.D};
    protected ArrayList<e> F = new ArrayList<>();
    protected int[] G = {a.a, a.a};
    f H = null;
    int I = 0;
    int J = 0;
    protected float K = 0.0f;
    protected int L = -1;
    protected int M = 0;
    protected int N = 0;
    int O = 0;
    int P = 0;
    private int a = 0;
    private int b = 0;
    private int ar = 0;
    private int as = 0;
    protected int Q = 0;
    protected int R = 0;
    public int S = 0;
    public float Y = X;
    public float Z = X;
    private int at = 0;
    public int ab = 0;
    public String ac = null;
    private String au = null;
    boolean af = false;
    boolean ag = false;
    boolean ah = false;
    public int ai = 0;
    public int aj = 0;
    public float[] am = {-1.0f, -1.0f};
    protected f[] an = {null, null};
    protected f[] ao = {null, null};
    f ap = null;
    f aq = null;

    public void c() {
    }

    public final boolean d() {
        return this.g == 0 && this.K == 0.0f && this.j == 0 && this.k == 0 && this.G[0] == a.c;
    }

    public final boolean e() {
        return this.h == 0 && this.K == 0.0f && this.m == 0 && this.n == 0 && this.G[1] == a.c;
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {a, b, c, d};

        public static int[] a() {
            return (int[]) e.clone();
        }
    }

    public void f() {
        this.w.b();
        this.x.b();
        this.y.b();
        this.z.b();
        this.A.b();
        this.B.b();
        this.C.b();
        this.D.b();
        this.H = null;
        this.v = 0.0f;
        this.I = 0;
        this.J = 0;
        this.K = 0.0f;
        this.L = -1;
        this.M = 0;
        this.N = 0;
        this.a = 0;
        this.b = 0;
        this.ar = 0;
        this.as = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.Y = X;
        this.Z = X;
        this.G[0] = a.a;
        this.G[1] = a.a;
        this.aa = null;
        this.at = 0;
        this.ab = 0;
        this.au = null;
        this.ad = false;
        this.ae = false;
        this.ai = 0;
        this.aj = 0;
        this.ak = false;
        this.al = false;
        this.am[0] = -1.0f;
        this.am[1] = -1.0f;
        this.c = -1;
        this.d = -1;
        this.u[0] = Integer.MAX_VALUE;
        this.u[1] = Integer.MAX_VALUE;
        this.g = 0;
        this.h = 0;
        this.l = 1.0f;
        this.o = 1.0f;
        this.k = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.j = 0;
        this.m = 0;
        this.r = -1;
        this.s = 1.0f;
        if (this.e != null) {
            this.e.b();
        }
        if (this.f != null) {
            this.f.b();
        }
        this.t = null;
        this.af = false;
        this.ag = false;
        this.ah = false;
    }

    public void b() {
        for (int i = 0; i < 6; i++) {
            this.E[i].a.b();
        }
    }

    public final void g() {
        for (int i = 0; i < 6; i++) {
            m mVar = this.E[i].a;
            e eVar = mVar.a.d;
            if (eVar != null) {
                if (eVar.d == mVar.a) {
                    mVar.g = 4;
                    eVar.a.g = 4;
                }
                int a2 = mVar.a.a();
                if (mVar.a.c == e.c.RIGHT || mVar.a.c == e.c.BOTTOM) {
                    a2 = -a2;
                }
                mVar.a(eVar.a, a2);
            }
        }
    }

    public void a(int i) {
        k.a(i, this);
    }

    public final boolean h() {
        return this.w.a.i == 1 && this.y.a.i == 1 && this.x.a.i == 1 && this.z.a.i == 1;
    }

    public final n i() {
        if (this.e == null) {
            this.e = new n();
        }
        return this.e;
    }

    public final n j() {
        if (this.f == null) {
            this.f = new n();
        }
        return this.f;
    }

    public f() {
        this.F.add(this.w);
        this.F.add(this.x);
        this.F.add(this.y);
        this.F.add(this.z);
        this.F.add(this.B);
        this.F.add(this.C);
        this.F.add(this.D);
        this.F.add(this.A);
    }

    public void a(android.support.constraint.solver.c cVar) {
        this.w.a(cVar);
        this.x.a(cVar);
        this.y.a(cVar);
        this.z.a(cVar);
        this.A.a(cVar);
        this.D.a(cVar);
        this.B.a(cVar);
        this.C.a(cVar);
    }

    public final void b(android.support.constraint.solver.e eVar) {
        eVar.a(this.w);
        eVar.a(this.x);
        eVar.a(this.y);
        eVar.a(this.z);
        if (this.S > 0) {
            eVar.a(this.A);
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.au != null) {
            str = "type: " + this.au + StringUtil.SPACE;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.ac != null) {
            str2 = "id: " + this.ac + StringUtil.SPACE;
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(CommonConstant.Symbol.BRACKET_LEFT);
        sb.append(this.M);
        sb.append(", ");
        sb.append(this.N);
        sb.append(") - (");
        sb.append(this.I);
        sb.append(" x ");
        sb.append(this.J);
        sb.append(") wrap: (");
        sb.append(this.V);
        sb.append(" x ");
        sb.append(this.W);
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final int k() {
        return this.M;
    }

    public final int l() {
        return this.N;
    }

    public final int m() {
        if (this.ab == 8) {
            return 0;
        }
        return this.I;
    }

    public final int n() {
        if (this.ab == 8) {
            return 0;
        }
        return this.J;
    }

    public final int b(int i) {
        if (i == 0) {
            return m();
        }
        if (i == 1) {
            return n();
        }
        return 0;
    }

    public final int o() {
        return this.a + this.Q;
    }

    public final int p() {
        return this.b + this.R;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int q() {
        return this.M + this.Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int r() {
        return this.N + this.R;
    }

    public final boolean u() {
        return this.S > 0;
    }

    public ArrayList<e> v() {
        return this.F;
    }

    public final void c(int i) {
        this.M = i;
    }

    public final void d(int i) {
        this.N = i;
    }

    public final void a(int i, int i2) {
        this.M = i;
        this.N = i2;
    }

    public void b(int i, int i2) {
        this.Q = i;
        this.R = i2;
    }

    public void w() {
        int i = this.M;
        int i2 = this.N;
        int i3 = this.M + this.I;
        this.a = i;
        this.b = i2;
        this.ar = i3 - i;
        this.as = (this.N + this.J) - i2;
    }

    public final void e(int i) {
        this.I = i;
        if (this.I < this.T) {
            this.I = this.T;
        }
    }

    public final void f(int i) {
        this.J = i;
        if (this.J < this.U) {
            this.J = this.U;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please submit an issue!!! */
    public final void a(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.K = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i3 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (substring.equalsIgnoreCase(ErrorCode.ERROR_TYPE_H)) {
                i2 = 1;
            }
            i3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 >= 0 && indexOf2 < length - 1) {
            String substring2 = str.substring(i3, indexOf2);
            String substring3 = str.substring(indexOf2 + 1);
            if (substring2.length() > 0 && substring3.length() > 0) {
                float parseFloat = Float.parseFloat(substring2);
                float parseFloat2 = Float.parseFloat(substring3);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    if (i2 == 1) {
                        f = Math.abs(parseFloat2 / parseFloat);
                    } else {
                        f = Math.abs(parseFloat / parseFloat2);
                    }
                }
            }
            f = 0.0f;
        } else {
            String substring4 = str.substring(i3);
            if (substring4.length() > 0) {
                f = Float.parseFloat(substring4);
            }
            f = 0.0f;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.K = f;
            this.L = i2;
        }
    }

    public final void g(int i) {
        if (i < 0) {
            this.T = 0;
        } else {
            this.T = i;
        }
    }

    public final void h(int i) {
        if (i < 0) {
            this.U = 0;
        } else {
            this.U = i;
        }
    }

    public final void a(int i, int i2, int i3) {
        if (i3 == 0) {
            c(i, i2);
        } else if (i3 == 1) {
            d(i, i2);
        }
        this.ag = true;
    }

    public final void c(int i, int i2) {
        this.M = i;
        this.I = i2 - i;
        if (this.I < this.T) {
            this.I = this.T;
        }
    }

    public final void d(int i, int i2) {
        this.N = i;
        this.J = i2 - i;
        if (this.J < this.U) {
            this.J = this.U;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int i(int i) {
        if (i == 0) {
            return this.O;
        }
        if (i == 1) {
            return this.P;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2) {
        if (i2 == 0) {
            this.O = i;
        } else if (i2 == 1) {
            this.P = i;
        }
    }

    public boolean a() {
        return this.ab != 8;
    }

    public final void a(e.c cVar, f fVar, e.c cVar2, int i, int i2) {
        a(cVar).a(fVar.a(cVar2), i, i2, e.b.b, 0, true);
    }

    public final void x() {
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            this.F.get(i).b();
        }
    }

    public e a(e.c cVar) {
        switch (cVar) {
            case LEFT:
                return this.w;
            case TOP:
                return this.x;
            case RIGHT:
                return this.y;
            case BOTTOM:
                return this.z;
            case BASELINE:
                return this.A;
            case CENTER:
                return this.D;
            case CENTER_X:
                return this.B;
            case CENTER_Y:
                return this.C;
            case NONE:
                return null;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final int y() {
        return this.G[0];
    }

    public final int z() {
        return this.G[1];
    }

    public final void k(int i) {
        this.G[0] = i;
        if (i == a.b) {
            e(this.V);
        }
    }

    public final void l(int i) {
        this.G[1] = i;
        if (i == a.b) {
            f(this.W);
        }
    }

    private boolean m(int i) {
        int i2 = i * 2;
        if (this.E[i2].d == null || this.E[i2].d.d == this.E[i2]) {
            return false;
        }
        int i3 = i2 + 1;
        return this.E[i3].d != null && this.E[i3].d.d == this.E[i3];
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x02d9, code lost:
        if (r40.r != (-1)) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0377 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.support.constraint.solver.e r41) {
        /*
            Method dump skipped, instructions count: 1273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.f.a(android.support.constraint.solver.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x031a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.support.constraint.solver.e r32, boolean r33, android.support.constraint.solver.h r34, android.support.constraint.solver.h r35, int r36, boolean r37, android.support.constraint.solver.widgets.e r38, android.support.constraint.solver.widgets.e r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, int r47, int r48, int r49, float r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.f.a(android.support.constraint.solver.e, boolean, android.support.constraint.solver.h, android.support.constraint.solver.h, int, boolean, android.support.constraint.solver.widgets.e, android.support.constraint.solver.widgets.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* compiled from: ProGuard */
    /* renamed from: android.support.constraint.solver.widgets.f$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b = new int[a.a().length];

        static {
            try {
                b[a.a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[a.b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[a.d - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[a.c - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = new int[e.c.values().length];
            try {
                a[e.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.c.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.c.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[e.c.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[e.c.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[e.c.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[e.c.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[e.c.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[e.c.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public void c(android.support.constraint.solver.e eVar) {
        int b = android.support.constraint.solver.e.b(this.w);
        int b2 = android.support.constraint.solver.e.b(this.x);
        int b3 = android.support.constraint.solver.e.b(this.y);
        int b4 = android.support.constraint.solver.e.b(this.z);
        int i = b4 - b2;
        if (b3 - b < 0 || i < 0 || b == Integer.MIN_VALUE || b == Integer.MAX_VALUE || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE) {
            b = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
        }
        int i2 = b3 - b;
        int i3 = b4 - b2;
        this.M = b;
        this.N = b2;
        if (this.ab == 8) {
            this.I = 0;
            this.J = 0;
            return;
        }
        if (this.G[0] == a.a && i2 < this.I) {
            i2 = this.I;
        }
        if (this.G[1] == a.a && i3 < this.J) {
            i3 = this.J;
        }
        this.I = i2;
        this.J = i3;
        if (this.J < this.U) {
            this.J = this.U;
        }
        if (this.I < this.T) {
            this.I = this.T;
        }
        this.ag = true;
    }

    public final int s() {
        return this.M + this.I;
    }

    public final int t() {
        return this.N + this.J;
    }

    public final int j(int i) {
        if (i == 0) {
            return this.G[0];
        }
        if (i == 1) {
            return this.G[1];
        }
        return 0;
    }
}
