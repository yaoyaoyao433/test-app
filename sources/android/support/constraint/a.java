package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Constraints;
import android.support.constraint.R;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import com.meituan.robust.common.CommonConstant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private static final int[] b = {0, 4, 8};
    private static SparseIntArray c;
    HashMap<Integer, C0003a> a = new HashMap<>();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.append(R.styleable.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        c.append(R.styleable.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        c.append(R.styleable.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        c.append(R.styleable.ConstraintSet_layout_constraintRight_toRightOf, 30);
        c.append(R.styleable.ConstraintSet_layout_constraintTop_toTopOf, 36);
        c.append(R.styleable.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        c.append(R.styleable.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        c.append(R.styleable.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        c.append(R.styleable.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        c.append(R.styleable.ConstraintSet_layout_editor_absoluteX, 6);
        c.append(R.styleable.ConstraintSet_layout_editor_absoluteY, 7);
        c.append(R.styleable.ConstraintSet_layout_constraintGuide_begin, 17);
        c.append(R.styleable.ConstraintSet_layout_constraintGuide_end, 18);
        c.append(R.styleable.ConstraintSet_layout_constraintGuide_percent, 19);
        c.append(R.styleable.ConstraintSet_android_orientation, 27);
        c.append(R.styleable.ConstraintSet_layout_constraintStart_toEndOf, 32);
        c.append(R.styleable.ConstraintSet_layout_constraintStart_toStartOf, 33);
        c.append(R.styleable.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        c.append(R.styleable.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        c.append(R.styleable.ConstraintSet_layout_goneMarginLeft, 13);
        c.append(R.styleable.ConstraintSet_layout_goneMarginTop, 16);
        c.append(R.styleable.ConstraintSet_layout_goneMarginRight, 14);
        c.append(R.styleable.ConstraintSet_layout_goneMarginBottom, 11);
        c.append(R.styleable.ConstraintSet_layout_goneMarginStart, 15);
        c.append(R.styleable.ConstraintSet_layout_goneMarginEnd, 12);
        c.append(R.styleable.ConstraintSet_layout_constraintVertical_weight, 40);
        c.append(R.styleable.ConstraintSet_layout_constraintHorizontal_weight, 39);
        c.append(R.styleable.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        c.append(R.styleable.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        c.append(R.styleable.ConstraintSet_layout_constraintHorizontal_bias, 20);
        c.append(R.styleable.ConstraintSet_layout_constraintVertical_bias, 37);
        c.append(R.styleable.ConstraintSet_layout_constraintDimensionRatio, 5);
        c.append(R.styleable.ConstraintSet_layout_constraintLeft_creator, 75);
        c.append(R.styleable.ConstraintSet_layout_constraintTop_creator, 75);
        c.append(R.styleable.ConstraintSet_layout_constraintRight_creator, 75);
        c.append(R.styleable.ConstraintSet_layout_constraintBottom_creator, 75);
        c.append(R.styleable.ConstraintSet_layout_constraintBaseline_creator, 75);
        c.append(R.styleable.ConstraintSet_android_layout_marginLeft, 24);
        c.append(R.styleable.ConstraintSet_android_layout_marginRight, 28);
        c.append(R.styleable.ConstraintSet_android_layout_marginStart, 31);
        c.append(R.styleable.ConstraintSet_android_layout_marginEnd, 8);
        c.append(R.styleable.ConstraintSet_android_layout_marginTop, 34);
        c.append(R.styleable.ConstraintSet_android_layout_marginBottom, 2);
        c.append(R.styleable.ConstraintSet_android_layout_width, 23);
        c.append(R.styleable.ConstraintSet_android_layout_height, 21);
        c.append(R.styleable.ConstraintSet_android_visibility, 22);
        c.append(R.styleable.ConstraintSet_android_alpha, 43);
        c.append(R.styleable.ConstraintSet_android_elevation, 44);
        c.append(R.styleable.ConstraintSet_android_rotationX, 45);
        c.append(R.styleable.ConstraintSet_android_rotationY, 46);
        c.append(R.styleable.ConstraintSet_android_rotation, 60);
        c.append(R.styleable.ConstraintSet_android_scaleX, 47);
        c.append(R.styleable.ConstraintSet_android_scaleY, 48);
        c.append(R.styleable.ConstraintSet_android_transformPivotX, 49);
        c.append(R.styleable.ConstraintSet_android_transformPivotY, 50);
        c.append(R.styleable.ConstraintSet_android_translationX, 51);
        c.append(R.styleable.ConstraintSet_android_translationY, 52);
        c.append(R.styleable.ConstraintSet_android_translationZ, 53);
        c.append(R.styleable.ConstraintSet_layout_constraintWidth_default, 54);
        c.append(R.styleable.ConstraintSet_layout_constraintHeight_default, 55);
        c.append(R.styleable.ConstraintSet_layout_constraintWidth_max, 56);
        c.append(R.styleable.ConstraintSet_layout_constraintHeight_max, 57);
        c.append(R.styleable.ConstraintSet_layout_constraintWidth_min, 58);
        c.append(R.styleable.ConstraintSet_layout_constraintHeight_min, 59);
        c.append(R.styleable.ConstraintSet_layout_constraintCircle, 61);
        c.append(R.styleable.ConstraintSet_layout_constraintCircleRadius, 62);
        c.append(R.styleable.ConstraintSet_layout_constraintCircleAngle, 63);
        c.append(R.styleable.ConstraintSet_android_id, 38);
        c.append(R.styleable.ConstraintSet_layout_constraintWidth_percent, 69);
        c.append(R.styleable.ConstraintSet_layout_constraintHeight_percent, 70);
        c.append(R.styleable.ConstraintSet_chainUseRtl, 71);
        c.append(R.styleable.ConstraintSet_barrierDirection, 72);
        c.append(R.styleable.ConstraintSet_constraint_referenced_ids, 73);
        c.append(R.styleable.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* compiled from: ProGuard */
    /* renamed from: android.support.constraint.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0003a {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public float U;
        public boolean V;
        public float W;
        public float X;
        public float Y;
        public float Z;
        boolean a;
        public float aa;
        public float ab;
        public float ac;
        public float ad;
        public float ae;
        public float af;
        public float ag;
        public boolean ah;
        public boolean ai;
        public int aj;
        public int ak;
        public int al;
        public int am;
        public int an;
        public int ao;
        public float ap;
        public float aq;
        public boolean ar;
        public int as;
        public int at;
        public int[] au;
        public String av;
        public int b;
        public int c;
        int d;
        public int e;
        public int f;
        public float g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public float u;
        public float v;
        public String w;
        public int x;
        public int y;
        public float z;

        private C0003a() {
            this.a = false;
            this.e = -1;
            this.f = -1;
            this.g = -1.0f;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.w = null;
            this.x = -1;
            this.y = 0;
            this.z = 0.0f;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = false;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.aa = 1.0f;
            this.ab = 1.0f;
            this.ac = Float.NaN;
            this.ad = Float.NaN;
            this.ae = 0.0f;
            this.af = 0.0f;
            this.ag = 0.0f;
            this.ah = false;
            this.ai = false;
            this.aj = 0;
            this.ak = 0;
            this.al = -1;
            this.am = -1;
            this.an = -1;
            this.ao = -1;
            this.ap = 1.0f;
            this.aq = 1.0f;
            this.ar = false;
            this.as = -1;
            this.at = -1;
        }

        void a(int i, Constraints.a aVar) {
            a(i, (ConstraintLayout.a) aVar);
            this.U = aVar.an;
            this.X = aVar.aq;
            this.Y = aVar.ar;
            this.Z = aVar.as;
            this.aa = aVar.at;
            this.ab = aVar.au;
            this.ac = aVar.av;
            this.ad = aVar.aw;
            this.ae = aVar.ax;
            this.af = aVar.ay;
            this.ag = aVar.az;
            this.W = aVar.ap;
            this.V = aVar.ao;
        }

        private void a(int i, ConstraintLayout.a aVar) {
            this.d = i;
            this.h = aVar.d;
            this.i = aVar.e;
            this.j = aVar.f;
            this.k = aVar.g;
            this.l = aVar.h;
            this.m = aVar.i;
            this.n = aVar.j;
            this.o = aVar.k;
            this.p = aVar.l;
            this.q = aVar.p;
            this.r = aVar.q;
            this.s = aVar.r;
            this.t = aVar.s;
            this.u = aVar.z;
            this.v = aVar.A;
            this.w = aVar.B;
            this.x = aVar.m;
            this.y = aVar.n;
            this.z = aVar.o;
            this.A = aVar.Q;
            this.B = aVar.R;
            this.C = aVar.S;
            this.g = aVar.c;
            this.e = aVar.a;
            this.f = aVar.b;
            this.b = aVar.width;
            this.c = aVar.height;
            this.D = aVar.leftMargin;
            this.E = aVar.rightMargin;
            this.F = aVar.topMargin;
            this.G = aVar.bottomMargin;
            this.Q = aVar.F;
            this.R = aVar.E;
            this.T = aVar.H;
            this.S = aVar.G;
            this.ah = aVar.T;
            this.ai = aVar.U;
            this.aj = aVar.I;
            this.ak = aVar.J;
            this.ah = aVar.T;
            this.al = aVar.M;
            this.am = aVar.N;
            this.an = aVar.K;
            this.ao = aVar.L;
            this.ap = aVar.O;
            this.aq = aVar.P;
            if (Build.VERSION.SDK_INT >= 17) {
                this.H = aVar.getMarginEnd();
                this.I = aVar.getMarginStart();
            }
        }

        public final void a(ConstraintLayout.a aVar) {
            aVar.d = this.h;
            aVar.e = this.i;
            aVar.f = this.j;
            aVar.g = this.k;
            aVar.h = this.l;
            aVar.i = this.m;
            aVar.j = this.n;
            aVar.k = this.o;
            aVar.l = this.p;
            aVar.p = this.q;
            aVar.q = this.r;
            aVar.r = this.s;
            aVar.s = this.t;
            aVar.leftMargin = this.D;
            aVar.rightMargin = this.E;
            aVar.topMargin = this.F;
            aVar.bottomMargin = this.G;
            aVar.x = this.P;
            aVar.y = this.O;
            aVar.z = this.u;
            aVar.A = this.v;
            aVar.m = this.x;
            aVar.n = this.y;
            aVar.o = this.z;
            aVar.B = this.w;
            aVar.Q = this.A;
            aVar.R = this.B;
            aVar.F = this.Q;
            aVar.E = this.R;
            aVar.H = this.T;
            aVar.G = this.S;
            aVar.T = this.ah;
            aVar.U = this.ai;
            aVar.I = this.aj;
            aVar.J = this.ak;
            aVar.M = this.al;
            aVar.N = this.am;
            aVar.K = this.an;
            aVar.L = this.ao;
            aVar.O = this.ap;
            aVar.P = this.aq;
            aVar.S = this.C;
            aVar.c = this.g;
            aVar.a = this.e;
            aVar.b = this.f;
            aVar.width = this.b;
            aVar.height = this.c;
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.I);
                aVar.setMarginEnd(this.H);
            }
            aVar.a();
        }

        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            C0003a c0003a = new C0003a();
            c0003a.a = this.a;
            c0003a.b = this.b;
            c0003a.c = this.c;
            c0003a.e = this.e;
            c0003a.f = this.f;
            c0003a.g = this.g;
            c0003a.h = this.h;
            c0003a.i = this.i;
            c0003a.j = this.j;
            c0003a.k = this.k;
            c0003a.l = this.l;
            c0003a.m = this.m;
            c0003a.n = this.n;
            c0003a.o = this.o;
            c0003a.p = this.p;
            c0003a.q = this.q;
            c0003a.r = this.r;
            c0003a.s = this.s;
            c0003a.t = this.t;
            c0003a.u = this.u;
            c0003a.v = this.v;
            c0003a.w = this.w;
            c0003a.A = this.A;
            c0003a.B = this.B;
            c0003a.u = this.u;
            c0003a.u = this.u;
            c0003a.u = this.u;
            c0003a.u = this.u;
            c0003a.u = this.u;
            c0003a.C = this.C;
            c0003a.D = this.D;
            c0003a.E = this.E;
            c0003a.F = this.F;
            c0003a.G = this.G;
            c0003a.H = this.H;
            c0003a.I = this.I;
            c0003a.J = this.J;
            c0003a.K = this.K;
            c0003a.L = this.L;
            c0003a.M = this.M;
            c0003a.N = this.N;
            c0003a.O = this.O;
            c0003a.P = this.P;
            c0003a.Q = this.Q;
            c0003a.R = this.R;
            c0003a.S = this.S;
            c0003a.T = this.T;
            c0003a.U = this.U;
            c0003a.V = this.V;
            c0003a.W = this.W;
            c0003a.X = this.X;
            c0003a.Y = this.Y;
            c0003a.Z = this.Z;
            c0003a.aa = this.aa;
            c0003a.ab = this.ab;
            c0003a.ac = this.ac;
            c0003a.ad = this.ad;
            c0003a.ae = this.ae;
            c0003a.af = this.af;
            c0003a.ag = this.ag;
            c0003a.ah = this.ah;
            c0003a.ai = this.ai;
            c0003a.aj = this.aj;
            c0003a.ak = this.ak;
            c0003a.al = this.al;
            c0003a.am = this.am;
            c0003a.an = this.an;
            c0003a.ao = this.ao;
            c0003a.ap = this.ap;
            c0003a.aq = this.aq;
            c0003a.as = this.as;
            c0003a.at = this.at;
            if (this.au != null) {
                c0003a.au = Arrays.copyOf(this.au, this.au.length);
            }
            c0003a.x = this.x;
            c0003a.y = this.y;
            c0003a.z = this.z;
            c0003a.ar = this.ar;
            return c0003a;
        }
    }

    public final void a(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            Constraints.a aVar = (Constraints.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.a.containsKey(Integer.valueOf(id))) {
                this.a.put(Integer.valueOf(id), new C0003a());
            }
            C0003a c0003a = this.a.get(Integer.valueOf(id));
            if (childAt instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                c0003a.a(id, aVar);
                if (constraintHelper instanceof Barrier) {
                    c0003a.at = 1;
                    Barrier barrier = (Barrier) constraintHelper;
                    c0003a.as = barrier.getType();
                    c0003a.au = barrier.getReferencedIds();
                }
            }
            c0003a.a(id, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (this.a.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0003a c0003a = this.a.get(Integer.valueOf(id));
                if (childAt instanceof Barrier) {
                    c0003a.at = 1;
                }
                if (c0003a.at != -1 && c0003a.at == 1) {
                    Barrier barrier = (Barrier) childAt;
                    barrier.setId(id);
                    barrier.setType(c0003a.as);
                    barrier.setAllowsGoneWidget(c0003a.ar);
                    if (c0003a.au != null) {
                        barrier.setReferencedIds(c0003a.au);
                    } else if (c0003a.av != null) {
                        c0003a.au = a(barrier, c0003a.av);
                        barrier.setReferencedIds(c0003a.au);
                    }
                }
                ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
                c0003a.a(aVar);
                childAt.setLayoutParams(aVar);
                childAt.setVisibility(c0003a.J);
                if (Build.VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(c0003a.U);
                    childAt.setRotation(c0003a.X);
                    childAt.setRotationX(c0003a.Y);
                    childAt.setRotationY(c0003a.Z);
                    childAt.setScaleX(c0003a.aa);
                    childAt.setScaleY(c0003a.ab);
                    if (!Float.isNaN(c0003a.ac)) {
                        childAt.setPivotX(c0003a.ac);
                    }
                    if (!Float.isNaN(c0003a.ad)) {
                        childAt.setPivotY(c0003a.ad);
                    }
                    childAt.setTranslationX(c0003a.ae);
                    childAt.setTranslationY(c0003a.af);
                    if (Build.VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(c0003a.ag);
                        if (c0003a.V) {
                            childAt.setElevation(c0003a.W);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0003a c0003a2 = this.a.get(num);
            if (c0003a2.at != -1 && c0003a2.at == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                if (c0003a2.au != null) {
                    barrier2.setReferencedIds(c0003a2.au);
                } else if (c0003a2.av != null) {
                    c0003a2.au = a(barrier2, c0003a2.av);
                    barrier2.setReferencedIds(c0003a2.au);
                }
                barrier2.setType(c0003a2.as);
                ConstraintLayout.a a = ConstraintLayout.a();
                barrier2.a();
                c0003a2.a(a);
                constraintLayout.addView(barrier2, a);
            }
            if (c0003a2.a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.a a2 = ConstraintLayout.a();
                c0003a2.a(a2);
                constraintLayout.addView(guideline, a2);
            }
        }
    }

    private static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(C0003a c0003a, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = c.get(index);
            switch (i2) {
                case 1:
                    c0003a.p = a(typedArray, index, c0003a.p);
                    break;
                case 2:
                    c0003a.G = typedArray.getDimensionPixelSize(index, c0003a.G);
                    break;
                case 3:
                    c0003a.o = a(typedArray, index, c0003a.o);
                    break;
                case 4:
                    c0003a.n = a(typedArray, index, c0003a.n);
                    break;
                case 5:
                    c0003a.w = typedArray.getString(index);
                    break;
                case 6:
                    c0003a.A = typedArray.getDimensionPixelOffset(index, c0003a.A);
                    break;
                case 7:
                    c0003a.B = typedArray.getDimensionPixelOffset(index, c0003a.B);
                    break;
                case 8:
                    c0003a.H = typedArray.getDimensionPixelSize(index, c0003a.H);
                    break;
                case 9:
                    c0003a.t = a(typedArray, index, c0003a.t);
                    break;
                case 10:
                    c0003a.s = a(typedArray, index, c0003a.s);
                    break;
                case 11:
                    c0003a.N = typedArray.getDimensionPixelSize(index, c0003a.N);
                    break;
                case 12:
                    c0003a.O = typedArray.getDimensionPixelSize(index, c0003a.O);
                    break;
                case 13:
                    c0003a.K = typedArray.getDimensionPixelSize(index, c0003a.K);
                    break;
                case 14:
                    c0003a.M = typedArray.getDimensionPixelSize(index, c0003a.M);
                    break;
                case 15:
                    c0003a.P = typedArray.getDimensionPixelSize(index, c0003a.P);
                    break;
                case 16:
                    c0003a.L = typedArray.getDimensionPixelSize(index, c0003a.L);
                    break;
                case 17:
                    c0003a.e = typedArray.getDimensionPixelOffset(index, c0003a.e);
                    break;
                case 18:
                    c0003a.f = typedArray.getDimensionPixelOffset(index, c0003a.f);
                    break;
                case 19:
                    c0003a.g = typedArray.getFloat(index, c0003a.g);
                    break;
                case 20:
                    c0003a.u = typedArray.getFloat(index, c0003a.u);
                    break;
                case 21:
                    c0003a.c = typedArray.getLayoutDimension(index, c0003a.c);
                    break;
                case 22:
                    c0003a.J = typedArray.getInt(index, c0003a.J);
                    c0003a.J = b[c0003a.J];
                    break;
                case 23:
                    c0003a.b = typedArray.getLayoutDimension(index, c0003a.b);
                    break;
                case 24:
                    c0003a.D = typedArray.getDimensionPixelSize(index, c0003a.D);
                    break;
                case 25:
                    c0003a.h = a(typedArray, index, c0003a.h);
                    break;
                case 26:
                    c0003a.i = a(typedArray, index, c0003a.i);
                    break;
                case 27:
                    c0003a.C = typedArray.getInt(index, c0003a.C);
                    break;
                case 28:
                    c0003a.E = typedArray.getDimensionPixelSize(index, c0003a.E);
                    break;
                case 29:
                    c0003a.j = a(typedArray, index, c0003a.j);
                    break;
                case 30:
                    c0003a.k = a(typedArray, index, c0003a.k);
                    break;
                case 31:
                    c0003a.I = typedArray.getDimensionPixelSize(index, c0003a.I);
                    break;
                case 32:
                    c0003a.q = a(typedArray, index, c0003a.q);
                    break;
                case 33:
                    c0003a.r = a(typedArray, index, c0003a.r);
                    break;
                case 34:
                    c0003a.F = typedArray.getDimensionPixelSize(index, c0003a.F);
                    break;
                case 35:
                    c0003a.m = a(typedArray, index, c0003a.m);
                    break;
                case 36:
                    c0003a.l = a(typedArray, index, c0003a.l);
                    break;
                case 37:
                    c0003a.v = typedArray.getFloat(index, c0003a.v);
                    break;
                case 38:
                    c0003a.d = typedArray.getResourceId(index, c0003a.d);
                    break;
                case 39:
                    c0003a.R = typedArray.getFloat(index, c0003a.R);
                    break;
                case 40:
                    c0003a.Q = typedArray.getFloat(index, c0003a.Q);
                    break;
                case 41:
                    c0003a.S = typedArray.getInt(index, c0003a.S);
                    break;
                case 42:
                    c0003a.T = typedArray.getInt(index, c0003a.T);
                    break;
                case 43:
                    c0003a.U = typedArray.getFloat(index, c0003a.U);
                    break;
                case 44:
                    c0003a.V = true;
                    c0003a.W = typedArray.getDimension(index, c0003a.W);
                    break;
                case 45:
                    c0003a.Y = typedArray.getFloat(index, c0003a.Y);
                    break;
                case 46:
                    c0003a.Z = typedArray.getFloat(index, c0003a.Z);
                    break;
                case 47:
                    c0003a.aa = typedArray.getFloat(index, c0003a.aa);
                    break;
                case 48:
                    c0003a.ab = typedArray.getFloat(index, c0003a.ab);
                    break;
                case 49:
                    c0003a.ac = typedArray.getFloat(index, c0003a.ac);
                    break;
                case 50:
                    c0003a.ad = typedArray.getFloat(index, c0003a.ad);
                    break;
                case 51:
                    c0003a.ae = typedArray.getDimension(index, c0003a.ae);
                    break;
                case 52:
                    c0003a.af = typedArray.getDimension(index, c0003a.af);
                    break;
                case 53:
                    c0003a.ag = typedArray.getDimension(index, c0003a.ag);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            c0003a.X = typedArray.getFloat(index, c0003a.X);
                            continue;
                        case 61:
                            c0003a.x = a(typedArray, index, c0003a.x);
                            continue;
                        case 62:
                            c0003a.y = typedArray.getDimensionPixelSize(index, c0003a.y);
                            continue;
                        case 63:
                            c0003a.z = typedArray.getFloat(index, c0003a.z);
                            continue;
                        default:
                            switch (i2) {
                                case 69:
                                    c0003a.ap = typedArray.getFloat(index, 1.0f);
                                    continue;
                                case 70:
                                    c0003a.aq = typedArray.getFloat(index, 1.0f);
                                    continue;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    continue;
                                case 72:
                                    c0003a.as = typedArray.getInt(index, c0003a.as);
                                    continue;
                                case 73:
                                    c0003a.av = typedArray.getString(index);
                                    continue;
                                case 74:
                                    c0003a.ar = typedArray.getBoolean(index, c0003a.ar);
                                    continue;
                                case 75:
                                    StringBuilder sb = new StringBuilder("unused attribute 0x");
                                    sb.append(Integer.toHexString(index));
                                    sb.append("   ");
                                    sb.append(c.get(index));
                                    continue;
                                default:
                                    StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                                    sb2.append(Integer.toHexString(index));
                                    sb2.append("   ");
                                    sb2.append(c.get(index));
                                    continue;
                                    continue;
                            }
                    }
            }
        }
    }

    private static int[] a(View view, String str) {
        int i;
        Object a;
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = R.id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (a = ((ConstraintLayout) view.getParent()).a(0, trim)) != null && (a instanceof Integer)) {
                i = ((Integer) a).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }
}
