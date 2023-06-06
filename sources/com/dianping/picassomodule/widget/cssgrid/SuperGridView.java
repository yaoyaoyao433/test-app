package com.dianping.picassomodule.widget.cssgrid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.adapter.AttachStatusCollection;
import com.dianping.shield.node.adapter.ViewLocationChangeProcessor;
import com.dianping.shield.node.adapter.status.IElementContainerExpose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SuperGridView<T> extends ViewGroup implements IElementContainerExpose {
    public static ChangeQuickRedirect a;
    private d b;
    private Paint c;
    private View d;
    private AttachStatusCollection e;
    private com.dianping.picassomodule.widget.cssgrid.a<T> f;
    private a g;
    private b h;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void onItemClick(int i, View view);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        void onItemLongClickListener(int i, View view);
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getContainerSpanCount() {
        return 1;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getElementChildLayoutPosition(@NotNull View view) {
        return -1;
    }

    public SuperGridView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a5b43eeba959abf136d14c2ea2193c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a5b43eeba959abf136d14c2ea2193c0");
        }
    }

    private SuperGridView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f57a2a673ac4d638a2d991467e853cc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f57a2a673ac4d638a2d991467e853cc9");
        }
    }

    public SuperGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "862ba10d58a932f439f1ead63c61fc52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "862ba10d58a932f439f1ead63c61fc52");
            return;
        }
        this.c = new Paint();
        this.e = new AttachStatusCollection();
        this.e.setElementContainerCommonFeature(this);
    }

    public void setGridDrawInfo(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f71413248cde41f8bb68e79e9808a39a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f71413248cde41f8bb68e79e9808a39a");
            return;
        }
        this.b = dVar;
        if (this.b == null || this.b.b == null || this.b.b.o == null) {
            return;
        }
        int a2 = com.dianping.picassomodule.utils.b.a(this.b.b.o.a);
        if (a2 == Integer.MAX_VALUE) {
            a2 = Color.parseColor("#FFd7d7d7");
        }
        this.c.setColor(a2);
        this.c.setStrokeWidth(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb080a57e8409bc867dc93edffc7261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb080a57e8409bc867dc93edffc7261");
            return;
        }
        super.dispatchDraw(canvas);
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7fe0363f6b8caacd703fb81cd0e0e4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7fe0363f6b8caacd703fb81cd0e0e4a");
        } else if (this.b != null && this.b.f != null) {
            for (int i = 0; i < this.b.f.length; i++) {
                for (int i2 = 0; i2 < this.b.f[i].length; i2++) {
                    com.dianping.picassomodule.widget.cssgrid.b bVar = this.b.f[i][i2];
                    if (bVar.c) {
                        canvas.drawLine(bVar.e.b, bVar.e.c, bVar.e.d, bVar.e.e, this.c);
                    }
                    if (bVar.d) {
                        canvas.drawLine(bVar.f.b, bVar.f.c, bVar.f.d, bVar.f.e, this.c);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.picassomodule.widget.cssgrid.SuperGridView.a
            java.lang.String r11 = "4de05ee458f3d782410c9211f16a4353"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            return
        L26:
            int r0 = android.view.View.MeasureSpec.getSize(r13)
            int r1 = android.view.View.MeasureSpec.getSize(r14)
            int r13 = android.view.View.MeasureSpec.getMode(r13)
            int r14 = android.view.View.MeasureSpec.getMode(r14)
            com.dianping.picassomodule.widget.cssgrid.d r2 = r12.b
            if (r2 == 0) goto L42
            com.dianping.picassomodule.widget.cssgrid.d r2 = r12.b
            float r2 = r2.a()
            int r2 = (int) r2
            goto L43
        L42:
            r2 = 0
        L43:
            if (r2 <= 0) goto L4f
            com.dianping.picassomodule.widget.cssgrid.d r3 = r12.b
            boolean r3 = r3.b()
            if (r3 == 0) goto L4e
            goto L4f
        L4e:
            r9 = 0
        L4f:
            com.dianping.picassomodule.widget.cssgrid.d r3 = r12.b
            if (r3 == 0) goto Lbb
            com.dianping.picassomodule.widget.cssgrid.d r3 = r12.b
            com.dianping.picassomodule.widget.cssgrid.f[] r3 = r3.i
            if (r3 == 0) goto Lbb
            com.dianping.picassomodule.widget.cssgrid.d r3 = r12.b
            com.dianping.picassomodule.widget.cssgrid.f[] r3 = r3.i
            int r3 = r3.length
            if (r3 <= 0) goto Lbb
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == 0) goto L6f
            android.content.Context r3 = r12.getContext()
            int r3 = com.dianping.agentsdk.framework.aq.b(r3)
            int r3 = r3 * 5
        L6f:
            com.dianping.picassomodule.widget.cssgrid.d r4 = r12.b
            com.dianping.picassomodule.widget.cssgrid.f[] r4 = r4.i
            int r4 = r4.length
            if (r8 >= r4) goto Lb1
            com.dianping.picassomodule.widget.cssgrid.d r4 = r12.b
            com.dianping.picassomodule.widget.cssgrid.f[] r4 = r4.i
            r4 = r4[r8]
            android.view.View r5 = r12.getChildAt(r8)
            if (r5 == 0) goto Lae
            int r6 = r5.getVisibility()
            r7 = 8
            if (r6 == r7) goto Lae
            boolean r6 = r4.b
            if (r6 == 0) goto Lae
            float r6 = r4.i
            int r6 = (int) r6
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r13)
            float r4 = r4.j
            int r4 = (int) r4
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r14)
            r12.measureChild(r5, r6, r4)
            int r4 = r5.getMeasuredHeight()
            if (r9 == 0) goto Lae
            if (r4 <= r3) goto La8
            r4 = r3
        La8:
            com.dianping.picassomodule.widget.cssgrid.d r5 = r12.b
            float r4 = (float) r4
            r5.a(r8, r4)
        Lae:
            int r8 = r8 + 1
            goto L6f
        Lb1:
            if (r9 == 0) goto Lbb
            com.dianping.picassomodule.widget.cssgrid.d r13 = r12.b
            float r13 = r13.a()
            int r13 = (int) r13
            goto Lbc
        Lbb:
            r13 = r2
        Lbc:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r14 != r2) goto Lc1
            r13 = r1
        Lc1:
            r12.setMeasuredDimension(r0, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.picassomodule.widget.cssgrid.SuperGridView.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        char c = 1;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd387cd1655a000716f2ac1e395edced", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd387cd1655a000716f2ac1e395edced");
        } else if (this.b == null || this.b.i == null || this.b.i.length <= 0) {
        } else {
            final int i5 = 0;
            while (i5 < this.b.i.length) {
                f fVar = this.b.i[i5];
                this.b.b.l.get(i5);
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8 && fVar.b) {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = childAt;
                    objArr2[c] = Integer.valueOf(i5);
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9c54ad6bffbe3dd3fc07048e1250003", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9c54ad6bffbe3dd3fc07048e1250003");
                    } else {
                        childAt.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picassomodule.widget.cssgrid.SuperGridView.2
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr3 = {view};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cb7ed9a365b13ba00b866648af9e2b06", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cb7ed9a365b13ba00b866648af9e2b06");
                                    return;
                                }
                                if (!view.isSelected()) {
                                    if (SuperGridView.this.d != null) {
                                        SuperGridView.this.d.setSelected(false);
                                    }
                                    view.setSelected(true);
                                    SuperGridView.this.d = view;
                                } else {
                                    view.setSelected(false);
                                    SuperGridView.this.d = null;
                                }
                                if (SuperGridView.this.g != null) {
                                    SuperGridView.this.g.onItemClick(i5, view);
                                }
                            }
                        });
                        childAt.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.dianping.picassomodule.widget.cssgrid.SuperGridView.3
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                Object[] objArr3 = {view};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "32e97da7461956ff959a3dde8784bdb0", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "32e97da7461956ff959a3dde8784bdb0")).booleanValue();
                                }
                                if (SuperGridView.this.h != null) {
                                    SuperGridView.this.h.onItemLongClickListener(i5, view);
                                    return true;
                                }
                                return false;
                            }
                        });
                    }
                    int i6 = (int) fVar.g;
                    int i7 = (int) fVar.h;
                    childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
                }
                i5++;
                c = 1;
            }
        }
    }

    public void setAdapter(com.dianping.picassomodule.widget.cssgrid.a<T> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39074e16a44af36b208c20870d5eeeec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39074e16a44af36b208c20870d5eeeec");
            return;
        }
        removeAllViews();
        this.f = aVar;
        if (this.f == null || this.f.getCount() == 0) {
            return;
        }
        for (int i = 0; i < this.f.getCount(); i++) {
            View view = this.f.getView(i);
            view.setMinimumHeight((int) this.b.i[i].j);
            view.setMinimumWidth((int) this.b.i[i].i);
            addView(view);
        }
        requestLayout();
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getElementChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69f63c7b8b7524a2e52be83556fe7aac", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69f63c7b8b7524a2e52be83556fe7aac")).intValue() : getChildCount();
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    @NotNull
    public View getElementChildView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4125725fea8e5e2be5795af649a2bce0", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4125725fea8e5e2be5795af649a2bce0") : getChildAt(i);
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    @NotNull
    public Rect getContainerEdgeRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "341575fbe88f5b3d9e93c9405afbb8ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "341575fbe88f5b3d9e93c9405afbb8ff");
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = iArr[0] + getWidth();
        rect.bottom = iArr[1] + getHeight();
        return rect;
    }

    @Override // com.dianping.shield.node.adapter.status.IElementContainerExpose
    public void setViewLocationProcessors(@NonNull ArrayList<ViewLocationChangeProcessor<?>> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16c033b6448d4c07fded5b980dd63dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16c033b6448d4c07fded5b980dd63dd5");
        } else if (this.e != null) {
            this.e.removeAllViewLocationProcessors();
            Iterator<ViewLocationChangeProcessor<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                this.e.addAttStatusManager(it.next());
            }
        }
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerStatusInterface
    public void onAppear(@NotNull final ScrollDirection scrollDirection, @Nullable Object obj) {
        Object[] objArr = {scrollDirection, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e91723356083192d64c0f3a162d06886", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e91723356083192d64c0f3a162d06886");
        } else {
            post(new Runnable() { // from class: com.dianping.picassomodule.widget.cssgrid.SuperGridView.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fa8394786faaac80f32a21b6dc60029", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fa8394786faaac80f32a21b6dc60029");
                    } else {
                        com.dianping.picassomodule.utils.a.a(SuperGridView.this.e, scrollDirection, true);
                    }
                }
            });
        }
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerStatusInterface
    public void onDisappear(@NotNull ScrollDirection scrollDirection, @Nullable Object obj) {
        Object[] objArr = {scrollDirection, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55ab29798e6485d7b3eea14cf64e7bc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55ab29798e6485d7b3eea14cf64e7bc1");
        } else {
            com.dianping.picassomodule.utils.a.c(this.e, scrollDirection);
        }
    }

    public void setOnItemClickListener(a aVar) {
        this.g = aVar;
    }

    public void setOnItemLongClickListener(b bVar) {
        this.h = bVar;
    }

    public View getSelectedView() {
        return this.d;
    }
}
