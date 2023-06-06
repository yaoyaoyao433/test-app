package com.sankuai.waimai.store.newwidgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HorizontalFlowLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    private final List<Integer> b;
    private final List<b> c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private List<View> j;
    private List<View> k;
    private List<View> l;
    private int m;
    private Drawable n;
    private a o;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public HorizontalFlowLayout(Context context) {
        this(context, 25, 5, 5);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a839d3849af9a3ae4e044cd22f37a2a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a839d3849af9a3ae4e044cd22f37a2a0");
        }
    }

    public HorizontalFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc904b08d6825180b7e81a45557e2f0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc904b08d6825180b7e81a45557e2f0b");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = 0;
        a(context, attributeSet);
    }

    public HorizontalFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "266c4cc3e185252dc7cb8a53a4613ec3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "266c4cc3e185252dc7cb8a53a4613ec3");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = 0;
        a(context, attributeSet);
    }

    @TargetApi(21)
    public HorizontalFlowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4e2766f5beae2c2e7d9458f30602542", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4e2766f5beae2c2e7d9458f30602542");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = 0;
        a(context, attributeSet);
    }

    public HorizontalFlowLayout(Context context, int i, int i2, int i3) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40cf9a8784200a328069e08053e277d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40cf9a8784200a328069e08053e277d5");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = 0;
        a(i, i2, i3, false);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3147f0b276bafff359612cac49fb3a63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3147f0b276bafff359612cac49fb3a63");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842927, 16843091, R.attr.childDivider, R.attr.childHeight, R.attr.childMarginHorizontal, R.attr.childMarginVertical});
        this.d = (int) obtainStyledAttributes.getDimension(3, h.a(context, 25.0f));
        this.e = (int) obtainStyledAttributes.getDimension(4, h.a(context, 5.0f));
        this.f = (int) obtainStyledAttributes.getDimension(5, h.a(context, 5.0f));
        this.h = obtainStyledAttributes.getInt(0, this.h);
        this.g = obtainStyledAttributes.getInt(1, 0);
        this.n = obtainStyledAttributes.getDrawable(2);
        obtainStyledAttributes.recycle();
    }

    @UiThread
    private void setMultiLine(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560f48678bd8c21843451ba73e34238c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560f48678bd8c21843451ba73e34238c");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            setMaxLines(0);
            arrayList.addAll(this.l);
        } else {
            setMaxLines(1);
            arrayList.addAll(this.j);
            arrayList.addAll(this.k);
        }
        Object[] objArr2 = {arrayList, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "454a810f2fd33349d0f88cd1ee0e1c84", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "454a810f2fd33349d0f88cd1ee0e1c84")).booleanValue();
            return;
        }
        removeAllViewsInLayout();
        b(arrayList, true);
    }

    public final void a(int i, int i2, int i3, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "634262033124ec63b8602ef396585802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "634262033124ec63b8602ef396585802");
            return;
        }
        this.d = h.a(getContext(), i);
        this.e = h.a(getContext(), i2);
        this.f = h.a(getContext(), i3);
        if (z) {
            requestLayout();
        }
    }

    public void setMaxLines(int i) {
        if (this.g != i) {
            this.g = i;
        }
    }

    public void setGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89b588de889e3269560de55edf91e4d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89b588de889e3269560de55edf91e4d4");
        } else if (this.h != i) {
            this.h = i;
            requestLayout();
        }
    }

    private <T extends View> boolean b(List<T> list, boolean z) {
        ViewParent parent;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ffc5216de7d953e5cc23e416079eef3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ffc5216de7d953e5cc23e416079eef3")).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (T t : list) {
            if (z && (parent = t.getParent()) != null) {
                ((ViewGroup) parent).removeView(t);
            }
            addView(t);
        }
        return true;
    }

    public final boolean a(List<c> list, boolean z) {
        View view;
        Object[] objArr = {list, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454a3d65799f228185bb085e043f4133", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454a3d65799f228185bb085e043f4133")).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        this.l.clear();
        this.j.clear();
        this.k.clear();
        boolean z2 = false;
        for (c cVar : list) {
            if (cVar != null && (view = cVar.a) != null) {
                int i = cVar.b;
                this.l.add(view);
                if (i == 1) {
                    this.j.add(view);
                } else if (i == 0) {
                    this.k.add(view);
                }
                z2 = true;
            }
        }
        setMultiLine(false);
        return z2;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.newwidgets.HorizontalFlowLayout$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ HorizontalFlowLayout d;

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39c534c6781189038134e6257c317cd0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39c534c6781189038134e6257c317cd0");
            } else {
                this.d.measure(this.b, this.c);
            }
        }
    }

    public int getFirstLineCount() {
        return this.m;
    }

    public List<View> getFirstLineView() {
        int size;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "982c79ede0af3488673dba0caa1330b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "982c79ede0af3488673dba0caa1330b2");
        }
        if (this.m > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.j);
            if (this.m <= arrayList.size()) {
                return (this.m >= arrayList.size() || (size = arrayList.size() - this.m) >= arrayList.size()) ? arrayList : new ArrayList(arrayList.subList(0, arrayList.size() - size));
            }
            int size2 = this.m - arrayList.size();
            if (size2 <= this.k.size()) {
                arrayList.addAll(0, this.k.subList(0, size2));
                return arrayList;
            }
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int size;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ee5eb5b07882e7f859e2f90f6f80432", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ee5eb5b07882e7f859e2f90f6f80432");
            return;
        }
        this.i = false;
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        int a2 = a(defaultSize);
        Object[] objArr2 = {Integer.valueOf(a2), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a966513596318000af26764e7318f6b7", RobustBitConfig.DEFAULT_VALUE)) {
            size = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a966513596318000af26764e7318f6b7")).intValue();
        } else {
            Object[] objArr3 = {Integer.valueOf(a2)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5ee49a0714d23dbae4e140b22c76ca95", RobustBitConfig.DEFAULT_VALUE)) {
                paddingTop = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5ee49a0714d23dbae4e140b22c76ca95")).intValue();
            } else {
                paddingTop = getPaddingTop() + getPaddingBottom();
                if (a2 > 0) {
                    paddingTop += (this.d * a2) + (this.f * (a2 - 1));
                }
            }
            int mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(paddingTop, size);
            } else if (mode != 1073741824) {
                size = paddingTop;
            }
        }
        setMeasuredDimension(defaultSize, size);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount;
        int i = 1;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26c8c0fb44ef1f24a457258270874bb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26c8c0fb44ef1f24a457258270874bb3");
            return;
        }
        super.dispatchDraw(canvas);
        if (this.n == null || (childCount = getChildCount()) <= 1) {
            return;
        }
        int intrinsicWidth = this.n.getIntrinsicWidth();
        int intrinsicHeight = this.n.getIntrinsicHeight();
        this.n.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        int i2 = intrinsicWidth / 2;
        int i3 = intrinsicHeight / 2;
        View childAt = getChildAt(0);
        while (i < childCount) {
            View childAt2 = getChildAt(i);
            if (childAt2.getBottom() == childAt.getBottom()) {
                canvas.save();
                canvas.translate(((childAt.getRight() + childAt2.getLeft()) / 2) - i2, ((childAt2.getTop() + childAt2.getBottom()) / 2) - i3);
                this.n.draw(canvas);
                canvas.restore();
            }
            i++;
            childAt = childAt2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.newwidgets.HorizontalFlowLayout.onLayout(boolean, int, int, int, int):void");
    }

    private int a(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d9e516827f5a21ca220b37034a3705", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d9e516827f5a21ca220b37034a3705")).intValue();
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        this.b.clear();
        this.c.clear();
        this.m = 0;
        int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft <= 0) {
            return 0;
        }
        b bVar = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            childAt.measure((paddingLeft + 1) | Integer.MIN_VALUE, this.d | 1073741824);
            int measuredWidth = childAt.getMeasuredWidth();
            int i5 = i3 + measuredWidth;
            if (i5 > paddingLeft) {
                this.i = z;
                if (this.g > 0 && i4 + 1 >= this.g) {
                    if ("show_ellipsis".equals(childAt.getTag())) {
                        this.b.add(0);
                        bVar = new b(i3, paddingLeft, i4, null);
                        this.c.add(bVar);
                        childAt.measure((paddingLeft - i3) | Integer.MIN_VALUE, this.d | 1073741824);
                    }
                } else {
                    if (bVar != null) {
                        this.b.add(Integer.valueOf(paddingLeft - bVar.d));
                    }
                    i4++;
                    b bVar2 = new b(0, measuredWidth, i4, null);
                    this.c.add(bVar2);
                    bVar = bVar2;
                    i3 = measuredWidth + this.e;
                }
            } else {
                bVar = new b(i3, i5, i4, null);
                this.c.add(bVar);
                i3 = i5 + this.e;
            }
            if (i4 == 0) {
                this.m++;
            }
            i2++;
            z = true;
        }
        if (bVar != null) {
            this.b.add(Integer.valueOf(paddingLeft - bVar.d));
        }
        int size = this.c.size();
        for (int i6 = 0; i6 < size; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2 != null) {
                childAt2.setVisibility(0);
            }
        }
        for (int i7 = size; i7 < childCount; i7++) {
            View childAt3 = getChildAt(i7);
            if (childAt3 != null) {
                childAt3.setVisibility(8);
            }
        }
        int min = Math.min(this.j.size(), size);
        if (min < size) {
            if (!(this.g != 1)) {
                b bVar3 = this.c.get(0);
                b bVar4 = this.c.get(min);
                int i8 = bVar4.c - bVar3.c;
                int i9 = (this.c.get(size - 1).d - bVar4.c) + this.e;
                int i10 = bVar4.c - i8;
                int i11 = bVar3.d + i9;
                if (i10 >= getPaddingLeft() && i11 <= i - getPaddingRight()) {
                    for (int i12 = 0; i12 < min; i12++) {
                        b bVar5 = this.c.get(i12);
                        bVar5.c += i9;
                        bVar5.d += i9;
                    }
                    while (min < size) {
                        b bVar6 = this.c.get(min);
                        bVar6.c -= i8;
                        bVar6.d -= i8;
                        min++;
                    }
                }
            }
        }
        return i4 + 1;
    }

    public int getShowCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c74f9fc5b321b0c86fbb271af650b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c74f9fc5b321b0c86fbb271af650b1")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return this.c.size();
    }

    private Integer b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "851daea6607fbed9c3787846ca2cde8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "851daea6607fbed9c3787846ca2cde8a");
        }
        if (i < 0 || i >= this.b.size()) {
            return 0;
        }
        return this.b.get(i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        int b;
        int c;
        int d;

        public /* synthetic */ b(int i, int i2, int i3, AnonymousClass1 anonymousClass1) {
            this(i, i2, i3);
        }

        private b(int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "038eacd215a264a69ebc7b17116778b8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "038eacd215a264a69ebc7b17116778b8");
                return;
            }
            this.c = i;
            this.d = i2;
            this.b = i3;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        public View a;
        public int b;

        public c(View view, int i) {
            this.a = view;
            this.b = i;
        }
    }

    public void setOnChildLayoutListener(a aVar) {
        this.o = aVar;
    }
}
