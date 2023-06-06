package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.constraint.a;
import android.support.constraint.solver.widgets.f;
import android.support.constraint.solver.widgets.g;
import android.support.constraint.solver.widgets.i;
import android.support.v4.internal.view.SupportMenu;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    SparseArray<View> a;
    g b;
    int c;
    int d;
    int e;
    int f;
    private ArrayList<ConstraintHelper> g;
    private final ArrayList<f> h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private android.support.constraint.a o;
    private int p;
    private HashMap<String, Integer> q;
    private int r;
    private int s;
    private android.support.constraint.solver.f t;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    private void a(int i, Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.q == null) {
                this.q = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.q.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public final Object a(int i, Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (this.q == null || !this.q.containsKey(str)) {
                return null;
            }
            return this.q.get(str);
        }
        return null;
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray<>();
        this.g = new ArrayList<>(4);
        this.h = new ArrayList<>(100);
        this.b = new g();
        this.i = 0;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.m = true;
        this.n = 7;
        this.o = null;
        this.p = -1;
        this.q = new HashMap<>();
        this.r = -1;
        this.s = -1;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = 0;
        a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray<>();
        this.g = new ArrayList<>(4);
        this.h = new ArrayList<>(100);
        this.b = new g();
        this.i = 0;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.m = true;
        this.n = 7;
        this.o = null;
        this.p = -1;
        this.q = new HashMap<>();
        this.r = -1;
        this.s = -1;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = 0;
        a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray<>();
        this.g = new ArrayList<>(4);
        this.h = new ArrayList<>(100);
        this.b = new g();
        this.i = 0;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.m = true;
        this.n = 7;
        this.o = null;
        this.p = -1;
        this.q = new HashMap<>();
        this.r = -1;
        this.s = -1;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = 0;
        a(attributeSet);
    }

    @Override // android.view.View
    public void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    private void a(AttributeSet attributeSet) {
        this.b.aa = this;
        this.a.put(getId(), this);
        this.o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.j = obtainStyledAttributes.getDimensionPixelOffset(index, this.j);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.k = obtainStyledAttributes.getDimensionPixelOffset(index, this.k);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.l = obtainStyledAttributes.getDimensionPixelOffset(index, this.l);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.n = obtainStyledAttributes.getInt(index, this.n);
                } else if (index == R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.o = new android.support.constraint.a();
                        android.support.constraint.a aVar = this.o;
                        Context context = getContext();
                        XmlResourceParser xml = context.getResources().getXml(resourceId);
                        try {
                            try {
                                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                    if (eventType == 0) {
                                        xml.getName();
                                    } else if (eventType == 2) {
                                        String name = xml.getName();
                                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                        a.C0003a c0003a = new a.C0003a();
                                        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(asAttributeSet, R.styleable.ConstraintSet);
                                        android.support.constraint.a.a(c0003a, obtainStyledAttributes2);
                                        obtainStyledAttributes2.recycle();
                                        if (name.equalsIgnoreCase("Guideline")) {
                                            c0003a.a = true;
                                        }
                                        aVar.a.put(Integer.valueOf(c0003a.d), c0003a);
                                    }
                                }
                            } catch (XmlPullParserException e) {
                                e.printStackTrace();
                            }
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Resources.NotFoundException unused) {
                        this.o = null;
                    }
                    this.p = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.b.aF = this.n;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        f a2 = a(view);
        if ((view instanceof Guideline) && !(a2 instanceof i)) {
            a aVar = (a) view.getLayoutParams();
            aVar.al = new i();
            aVar.Y = true;
            ((i) aVar.al).m(aVar.S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.a();
            ((a) view.getLayoutParams()).Z = true;
            if (!this.g.contains(constraintHelper)) {
                this.g.add(constraintHelper);
            }
        }
        this.a.put(view.getId(), view);
        this.m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.a.remove(view.getId());
        f a2 = a(view);
        this.b.b(a2);
        this.g.remove(view);
        this.h.remove(a2);
        this.m = true;
    }

    public void setMinWidth(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.j) {
            return;
        }
        this.j = i;
        requestLayout();
    }

    public int getMinWidth() {
        return this.i;
    }

    public int getMinHeight() {
        return this.j;
    }

    public void setMaxWidth(int i) {
        if (i == this.k) {
            return;
        }
        this.k = i;
        requestLayout();
    }

    public void setMaxHeight(int i) {
        if (i == this.l) {
            return;
        }
        this.l = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.k;
    }

    public int getMaxHeight() {
        return this.l;
    }

    private final f b(int i) {
        if (i == 0) {
            return this.b;
        }
        View view = this.a.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).al;
    }

    public final f a(View view) {
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).al;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0965, code lost:
        if (r7.I != 1) goto L698;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0a83 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0b52  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0b5a  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0d72  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x0d87  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x0dbe  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r65, int r66) {
        /*
            Method dump skipped, instructions count: 3526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    private void a(String str) {
        this.b.A();
        if (this.t != null) {
            this.t.c++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            a aVar = (a) childAt.getLayoutParams();
            f fVar = aVar.al;
            if ((childAt.getVisibility() != 8 || aVar.Y || aVar.Z || isInEditMode) && !aVar.aa) {
                int o = fVar.o();
                int p = fVar.p();
                int m = fVar.m() + o;
                int n = fVar.n() + p;
                childAt.layout(o, p, m, n);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(o, p, m, n);
                }
            }
        }
        int size = this.g.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.g.get(i6).b(this);
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.b.aF = i;
    }

    public int getOptimizationLevel() {
        return this.b.aF;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static a a() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void setConstraintSet(android.support.constraint.a aVar) {
        this.o = aVar;
    }

    public final View a(int i) {
        return this.a.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(CommonConstant.Symbol.COMMA);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i2 = (int) ((parseInt / 1080.0f) * width);
                        int i3 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(SupportMenu.CATEGORY_MASK);
                        float f = i2;
                        float f2 = i3;
                        float f3 = i2 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i3 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        float C;
        int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        boolean V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;
        public int a;
        boolean aa;
        int ab;
        int ac;
        int ad;
        int ae;
        int af;
        int ag;
        float ah;
        int ai;
        int aj;
        float ak;
        f al;
        public boolean am;
        public int b;
        public float c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        /* compiled from: ProGuard */
        /* renamed from: android.support.constraint.ConstraintLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C0002a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                a.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                a.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                a.append(R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                a.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                a.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                a.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                a.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                a.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                a.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                a.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.aa = false;
            this.ab = -1;
            this.ac = -1;
            this.ad = -1;
            this.ae = -1;
            this.af = -1;
            this.ag = -1;
            this.ah = 0.5f;
            this.al = new f();
            this.am = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0002a.a.get(index);
                switch (i3) {
                    case 0:
                        break;
                    case 1:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        break;
                    case 2:
                        this.m = obtainStyledAttributes.getResourceId(index, this.m);
                        if (this.m == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        break;
                    case 4:
                        this.o = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        if (this.o < 0.0f) {
                            this.o = (360.0f - this.o) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        this.d = obtainStyledAttributes.getResourceId(index, this.d);
                        if (this.d == -1) {
                            this.d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        this.e = obtainStyledAttributes.getResourceId(index, this.e);
                        if (this.e == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        this.f = obtainStyledAttributes.getResourceId(index, this.f);
                        if (this.f == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        this.g = obtainStyledAttributes.getResourceId(index, this.g);
                        if (this.g == -1) {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        this.h = obtainStyledAttributes.getResourceId(index, this.h);
                        if (this.h == -1) {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        this.i = obtainStyledAttributes.getResourceId(index, this.i);
                        if (this.i == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        this.j = obtainStyledAttributes.getResourceId(index, this.j);
                        if (this.j == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        this.k = obtainStyledAttributes.getResourceId(index, this.k);
                        if (this.k == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        this.l = obtainStyledAttributes.getResourceId(index, this.l);
                        if (this.l == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        this.p = obtainStyledAttributes.getResourceId(index, this.p);
                        if (this.p == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        this.q = obtainStyledAttributes.getResourceId(index, this.q);
                        if (this.q == -1) {
                            this.q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        this.r = obtainStyledAttributes.getResourceId(index, this.r);
                        if (this.r == -1) {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        this.s = obtainStyledAttributes.getResourceId(index, this.s);
                        if (this.s == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        break;
                    case 22:
                        this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        break;
                    case 23:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 27:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 28:
                        this.U = obtainStyledAttributes.getBoolean(index, this.U);
                        break;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        this.I = obtainStyledAttributes.getInt(index, 0);
                        if (this.I == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        this.J = obtainStyledAttributes.getInt(index, 0);
                        if (this.J == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        break;
                    case 36:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.P));
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                this.B = obtainStyledAttributes.getString(index);
                                this.C = Float.NaN;
                                this.D = -1;
                                if (this.B != null) {
                                    int length = this.B.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (substring.equalsIgnoreCase(ErrorCode.ERROR_TYPE_H)) {
                                            this.D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.D == 1) {
                                                        this.C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i);
                                        if (substring4.length() > 0) {
                                            this.C = Float.parseFloat(substring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                continue;
                            case 46:
                                this.F = obtainStyledAttributes.getFloat(index, this.F);
                                continue;
                            case 47:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                continue;
                            case 50:
                                this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            if (this.width == -2 && this.T) {
                this.V = false;
                this.I = 1;
            }
            if (this.height == -2 && this.U) {
                this.W = false;
                this.J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.V = false;
                if (this.width == 0 && this.I == 1) {
                    this.width = -2;
                    this.T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.W = false;
                if (this.height == 0 && this.J == 1) {
                    this.height = -2;
                    this.U = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.Y = true;
            this.V = true;
            this.W = true;
            if (!(this.al instanceof i)) {
                this.al = new i();
            }
            ((i) this.al).m(this.S);
        }

        public a(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.aa = false;
            this.ab = -1;
            this.ac = -1;
            this.ad = -1;
            this.ae = -1;
            this.af = -1;
            this.ag = -1;
            this.ah = 0.5f;
            this.al = new f();
            this.am = false;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.aa = false;
            this.ab = -1;
            this.ac = -1;
            this.ad = -1;
            this.ae = -1;
            this.af = -1;
            this.ag = -1;
            this.ah = 0.5f;
            this.al = new f();
            this.am = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r6) {
            /*
                Method dump skipped, instructions count: 303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.m = true;
        this.r = -1;
        this.s = -1;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = 0;
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}
