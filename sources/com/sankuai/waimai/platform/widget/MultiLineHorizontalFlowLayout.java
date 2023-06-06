package com.sankuai.waimai.platform.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MultiLineHorizontalFlowLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    private final List<Integer> b;
    private final List<a> c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Drawable j;
    private List<b> k;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        int a;
    }

    public MultiLineHorizontalFlowLayout(Context context) {
        this(context, 25, 5, 5);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d619ba2992de481c6856460346dad8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d619ba2992de481c6856460346dad8b");
        }
    }

    public MultiLineHorizontalFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ba9b0a62ba7cec8b990e557e739515", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ba9b0a62ba7cec8b990e557e739515");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = -1;
        this.k = new ArrayList();
        a(context, attributeSet);
    }

    public MultiLineHorizontalFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ebbddbed708dccbcb6d804051e60d72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ebbddbed708dccbcb6d804051e60d72");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = -1;
        this.k = new ArrayList();
        a(context, attributeSet);
    }

    @TargetApi(21)
    public MultiLineHorizontalFlowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b8d80b6de00692f39be220701a0e35f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b8d80b6de00692f39be220701a0e35f");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = -1;
        this.k = new ArrayList();
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0ca49298fc217849b7804b40b311799", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0ca49298fc217849b7804b40b311799");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842927, 16843091, R.attr.childDivider, R.attr.childHeight, R.attr.childMarginHorizontal, R.attr.childMarginVertical, R.attr.childWidthWeight});
        this.d = (int) obtainStyledAttributes.getDimension(3, g.a(context, 25.0f));
        this.e = (int) obtainStyledAttributes.getDimension(4, g.a(context, 5.0f));
        this.f = (int) obtainStyledAttributes.getDimension(5, g.a(context, 5.0f));
        this.h = obtainStyledAttributes.getInt(0, this.h);
        this.g = obtainStyledAttributes.getInt(1, 0);
        this.j = obtainStyledAttributes.getDrawable(2);
        obtainStyledAttributes.recycle();
    }

    public MultiLineHorizontalFlowLayout(Context context, int i, int i2, int i3) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "314f7129c21819bd3bed9b474a512d09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "314f7129c21819bd3bed9b474a512d09");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = -1;
        this.k = new ArrayList();
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e31244abe5fe6e570aa9f18dfe0c089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e31244abe5fe6e570aa9f18dfe0c089");
            return;
        }
        this.d = g.a(getContext(), i);
        this.e = g.a(getContext(), i2);
        this.f = g.a(getContext(), i3);
    }

    public void setMaxLines(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5f55b4f58598a3294748fffcbd951ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5f55b4f58598a3294748fffcbd951ce");
        } else if (this.g != i) {
            this.g = i;
            requestLayout();
        }
    }

    public void setChildHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fee5d7842aafb6a347061eb27f9fe9d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fee5d7842aafb6a347061eb27f9fe9d0");
        } else if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f595df1e3b5767c8828b84519e4ce941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f595df1e3b5767c8828b84519e4ce941");
        } else if (this.h != i) {
            this.h = i;
            requestLayout();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        View b;
        int c;
        int d;
        int e;
        int f;

        private b(View view, int i, int i2, int i3, int i4) {
            Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0641235e4b3ee771fbcef4a2bcb8b359", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0641235e4b3ee771fbcef4a2bcb8b359");
                return;
            }
            this.b = view;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        b bVar;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "728445447413a11d5707ece5098da825", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "728445447413a11d5707ece5098da825");
            return;
        }
        this.k.clear();
        int defaultSize = (getDefaultSize(getSuggestedMinimumWidth(), i) - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount <= 0) {
            return;
        }
        View childAt = getChildAt(0);
        int i3 = defaultSize | 0;
        childAt.measure(i3, 0);
        int measuredWidth = childAt.getMeasuredWidth() + 0;
        int i4 = defaultSize - measuredWidth;
        b bVar2 = r15;
        b bVar3 = new b(null, 0, 0, 0, 0);
        bVar2.b = childAt;
        bVar2.c = 0;
        bVar2.d = 0;
        bVar2.e = measuredWidth;
        bVar2.f = childAt.getMeasuredHeight() + 0;
        this.k.add(bVar2);
        b bVar4 = null;
        for (int i5 = 1; i5 < childCount; i5++) {
            View childAt2 = getChildAt(i5);
            childAt2.measure(i3, 0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight = childAt2.getMeasuredHeight();
            if (this.e + measuredWidth2 <= i4) {
                StringBuilder sb = new StringBuilder("onMeasure() add: childWidth = [");
                sb.append(measuredWidth2);
                sb.append("], childHeight = [");
                sb.append(measuredHeight);
                sb.append("], remindingWidth = [");
                sb.append(i4);
                sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                int i6 = (defaultSize - i4) + this.e;
                int a2 = a(bVar4) + (bVar4 == null ? 0 : this.f);
                int i7 = measuredWidth2 + i6;
                bVar = new b(childAt2, i6, a2, i7, a2 + measuredHeight);
                this.k.add(bVar);
                i4 = defaultSize - i7;
            } else {
                StringBuilder sb2 = new StringBuilder("onMeasure() 换行: childWidth = [");
                sb2.append(measuredWidth2);
                sb2.append("], childHeight = [");
                sb2.append(measuredHeight);
                sb2.append("], remindingWidth = [");
                sb2.append(i4);
                sb2.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                int a3 = a(bVar2) + this.f;
                int i8 = measuredWidth2 + 0;
                bVar = new b(childAt2, 0, a3, i8, a3 + measuredHeight);
                this.k.add(bVar);
                i4 = defaultSize - i8;
                bVar4 = bVar2;
            }
            bVar2 = bVar;
        }
        int a4 = a(bVar2);
        StringBuilder sb3 = new StringBuilder("all onMeasure() called with: allChildHeight = [");
        sb3.append(a4);
        sb3.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        setMeasuredDimension(defaultSize, a(bVar2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a50ff4f99b02fcb71379b2653f81d1c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a50ff4f99b02fcb71379b2653f81d1c8");
            return;
        }
        for (int i5 = 0; i5 < this.k.size(); i5++) {
            b bVar = this.k.get(i5);
            bVar.b.layout(bVar.c, bVar.d, bVar.e, bVar.f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount;
        int i = 1;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "011303251a5c33fbb23231abf7c8d7ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "011303251a5c33fbb23231abf7c8d7ab");
            return;
        }
        super.dispatchDraw(canvas);
        if (this.j == null || (childCount = getChildCount()) <= 1) {
            return;
        }
        int intrinsicWidth = this.j.getIntrinsicWidth();
        int intrinsicHeight = this.j.getIntrinsicHeight();
        this.j.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        int i2 = intrinsicWidth / 2;
        int i3 = intrinsicHeight / 2;
        View childAt = getChildAt(0);
        while (i < childCount) {
            View childAt2 = getChildAt(i);
            if (childAt2.getBottom() == childAt.getBottom()) {
                canvas.save();
                canvas.translate(((childAt.getRight() + childAt2.getLeft()) / 2) - i2, ((childAt2.getTop() + childAt2.getBottom()) / 2) - i3);
                this.j.draw(canvas);
                canvas.restore();
            }
            i++;
            childAt = childAt2;
        }
    }

    public int getFirstLineShownItemCount() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e34b67b4d3bd3271e61d2e1f4a9d16e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e34b67b4d3bd3271e61d2e1f4a9d16e")).intValue();
        }
        Object[] objArr2 = {1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6efa8f46f40b88f3b66fece4d2407bb5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6efa8f46f40b88f3b66fece4d2407bb5")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        for (a aVar : this.c) {
            if (aVar != null && aVar.a == 1) {
                i++;
            }
        }
        return i;
    }

    public int getShownItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb489d9ef758f2b36ff06520ce7c244a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb489d9ef758f2b36ff06520ce7c244a")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return this.c.size();
    }

    public void setMaxChildrenNum(int i) {
        this.i = i;
    }

    private int a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "211126efdf3b9c3de303e7f145c709b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "211126efdf3b9c3de303e7f145c709b9")).intValue();
        }
        if (bVar == null) {
            return 0;
        }
        return bVar.f;
    }
}
