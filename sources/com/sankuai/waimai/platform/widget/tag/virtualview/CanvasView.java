package com.sankuai.waimai.platform.widget.tag.virtualview;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.CallSuper;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.a;
import com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.d;
import com.sankuai.waimai.platform.widget.tag.virtualview.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class CanvasView<T extends d, A extends a<T>> extends View {
    public static ChangeQuickRedirect c;
    private T a;
    private b b;
    private e d;
    private A e;
    private Paint f;
    private List<com.sankuai.waimai.platform.widget.tag.virtualview.render.d> g;
    private List<f<?>> h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private com.sankuai.waimai.platform.widget.tag.virtualview.render.d m;
    private DataSetObserver n;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a<Options extends d> extends DataSetObservable {
        public static ChangeQuickRedirect g;
        public InterfaceC1104a h;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public interface InterfaceC1104a {
            boolean a(com.sankuai.waimai.platform.widget.tag.api.c cVar, Map<String, String> map);

            void b(com.sankuai.waimai.platform.widget.tag.api.c cVar, Map<String, String> map);
        }

        public abstract List<com.sankuai.waimai.platform.widget.tag.virtualview.render.d> a(Options options);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        Drawable a(@DrawableRes int i, int i2, int i3);

        void a();

        void a(String str, int i, int i2, b.a aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class d {
        public int e;
        public int f;
    }

    public void a() {
    }

    @CallSuper
    public void a(T t) {
    }

    public abstract T b();

    public static /* synthetic */ boolean a(CanvasView canvasView, boolean z) {
        canvasView.i = true;
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class c implements b {
        public static ChangeQuickRedirect a;

        public c() {
            Object[] objArr = {CanvasView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c28cfd1a9681c76fb782e2410661bd8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c28cfd1a9681c76fb782e2410661bd8");
            }
        }

        @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.b
        public final void a(String str, int i, int i2, b.a aVar) {
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f910f712e4810b7d48aa09e1dc68b8b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f910f712e4810b7d48aa09e1dc68b8b");
            } else if (CanvasView.this.d == null || CanvasView.this.d.b == null) {
            } else {
                CanvasView.this.d.b.a(str, i, i2, aVar);
            }
        }

        @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.b
        public final Drawable a(@DrawableRes int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa97a69fbf0f12df7228256c87606c8b", RobustBitConfig.DEFAULT_VALUE)) {
                return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa97a69fbf0f12df7228256c87606c8b");
            }
            if (CanvasView.this.d == null || CanvasView.this.d.b == null) {
                return null;
            }
            return CanvasView.this.d.b.a(i, i2, i3);
        }

        @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.b
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e3518e26daa5cce324e4759cd6563a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e3518e26daa5cce324e4759cd6563a7");
            } else {
                CanvasView.this.invalidate();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class e {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.platform.widget.tag.virtualview.b b;

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public static class a {
            public static ChangeQuickRedirect a;
            public com.sankuai.waimai.platform.widget.tag.virtualview.b b;
        }

        private e(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fad60e0f18c2aee9f15e64fadda7af4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fad60e0f18c2aee9f15e64fadda7af4");
            } else {
                this.b = aVar.b;
            }
        }
    }

    public CanvasView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af8a3302554899d0e81fb2a021721925", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af8a3302554899d0e81fb2a021721925");
        }
    }

    public CanvasView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdc693d849721fefe74c3d8ba760ee37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdc693d849721fefe74c3d8ba760ee37");
        }
    }

    public CanvasView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba2f4fa96b0bab68d15156f9a4c6f236", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba2f4fa96b0bab68d15156f9a4c6f236");
            return;
        }
        this.a = null;
        this.b = new c();
        this.f = new Paint(1);
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = true;
        this.j = false;
        this.n = new DataSetObserver() { // from class: com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.1
            public static ChangeQuickRedirect a;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca91c8fd8337616727265f7a17a8a299", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca91c8fd8337616727265f7a17a8a299");
                    return;
                }
                CanvasView.a(CanvasView.this, true);
                CanvasView.this.requestLayout();
                CanvasView.this.invalidate();
            }
        };
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe81632f3df0952f3158190494876ba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe81632f3df0952f3158190494876ba1");
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (mode == Integer.MIN_VALUE || mode == 1073741824) ? (size - getPaddingLeft()) - getPaddingRight() : Integer.MAX_VALUE;
        int paddingTop = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? (size2 - getPaddingTop()) - getPaddingBottom() : Integer.MAX_VALUE;
        if (this.a == null) {
            this.a = b();
        }
        T t = this.a;
        Object[] objArr2 = {t, Integer.valueOf(paddingLeft), Integer.valueOf(paddingTop)};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        int i5 = paddingLeft;
        int i6 = paddingTop;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f748106737a4d248805bea320cfad86a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f748106737a4d248805bea320cfad86a");
            i3 = i5;
            i4 = i6;
        } else {
            i3 = i5;
            t.e = i3;
            i4 = i6;
            t.f = i4;
            a((CanvasView<T, A>) t);
        }
        if (this.e != null) {
            if (this.i || mode == Integer.MIN_VALUE || mode2 == Integer.MIN_VALUE || i3 != this.k || i4 != this.l) {
                List<com.sankuai.waimai.platform.widget.tag.virtualview.render.d> a2 = this.e.a(this.a);
                this.j = true;
                this.g.clear();
                if (a2 != null) {
                    this.g.addAll(a2);
                }
                this.i = false;
            }
        } else {
            this.j = true;
            this.g.clear();
        }
        this.k = i3;
        this.l = i4;
        setMeasuredDimension((int) (a(mode, size) + 0.5f), (int) (b(mode2, size2) + 0.5f));
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3df68de5813b54e6b3931ff8485b191", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3df68de5813b54e6b3931ff8485b191");
            return;
        }
        this.i = z;
        super.requestLayout();
    }

    @Override // android.view.View
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bd8832af13888ee86454c189bbf7b29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bd8832af13888ee86454c189bbf7b29");
            return;
        }
        this.i = true;
        super.requestLayout();
    }

    private int a(int i, int i2) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7201e96b23121e01381f1f6fe2cb37e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7201e96b23121e01381f1f6fe2cb37e")).intValue();
        }
        if (i == 1073741824) {
            return i2;
        }
        if (this.g == null || this.g.isEmpty()) {
            return 0;
        }
        for (com.sankuai.waimai.platform.widget.tag.virtualview.render.d dVar : this.g) {
            if (dVar.d.e + dVar.e.e > i3) {
                i3 = dVar.d.e + dVar.e.e;
            }
        }
        if (i == Integer.MIN_VALUE) {
            return Math.min(i3 + getPaddingLeft() + getPaddingRight(), i2);
        }
        return i3 + getPaddingStart() + getPaddingEnd();
    }

    private int b(int i, int i2) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3028e2ebd01784a3596cd7ac951fd5c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3028e2ebd01784a3596cd7ac951fd5c4")).intValue();
        }
        if (i == 1073741824) {
            return i2;
        }
        if (this.g == null || this.g.isEmpty()) {
            return 0;
        }
        for (com.sankuai.waimai.platform.widget.tag.virtualview.render.d dVar : this.g) {
            if (dVar.d.f + dVar.e.f > i3) {
                i3 = dVar.d.f + dVar.e.f;
            }
        }
        if (i == Integer.MIN_VALUE) {
            return Math.min(i3 + getPaddingBottom() + getPaddingTop(), i2);
        }
        return i3 + getPaddingBottom() + getPaddingTop();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        List arrayList;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db6f5d38d82a3b00e24a27a4023bf3f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db6f5d38d82a3b00e24a27a4023bf3f5");
            return;
        }
        if (this.j) {
            this.j = false;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b104a15032fd16fea523403c994af48e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b104a15032fd16fea523403c994af48e");
            } else {
                for (f<?> fVar : this.h) {
                    fVar.c();
                }
                this.h.clear();
            }
            if (!this.g.isEmpty()) {
                List<f<?>> list = this.h;
                List<com.sankuai.waimai.platform.widget.tag.virtualview.render.d> list2 = this.g;
                Object[] objArr3 = {list2};
                ChangeQuickRedirect changeQuickRedirect3 = c;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3b5bff8172cf6d4cb660909608d22c19", RobustBitConfig.DEFAULT_VALUE)) {
                    arrayList = (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3b5bff8172cf6d4cb660909608d22c19");
                } else {
                    arrayList = new ArrayList();
                    for (com.sankuai.waimai.platform.widget.tag.virtualview.render.d dVar : list2) {
                        f<?> c2 = f.c(this.b, dVar);
                        if (c2 != null) {
                            arrayList.add(c2);
                        }
                    }
                }
                list.addAll(arrayList);
            }
        }
        int save = canvas.save();
        canvas.clipRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.translate(getPaddingLeft(), getPaddingTop());
        a(canvas, this.f);
        canvas.restoreToCount(save);
        a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.sankuai.waimai.platform.widget.tag.virtualview.render.d dVar;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc3471f62ab02e5a17a97a558091e844", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc3471f62ab02e5a17a97a558091e844")).booleanValue();
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    Object[] objArr2 = {Float.valueOf(x), Float.valueOf(y)};
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4762955a9e2866f2f912e0324e499c22", RobustBitConfig.DEFAULT_VALUE)) {
                        dVar = (com.sankuai.waimai.platform.widget.tag.virtualview.render.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4762955a9e2866f2f912e0324e499c22");
                    } else {
                        Iterator<com.sankuai.waimai.platform.widget.tag.virtualview.render.d> it = this.g.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                dVar = it.next();
                                com.sankuai.waimai.platform.widget.tag.virtualview.render.b bVar = dVar.d;
                                com.sankuai.waimai.platform.widget.tag.virtualview.render.f fVar = dVar.e;
                                if (x < bVar.e || x > bVar.e + fVar.e || y < bVar.f || y > bVar.f + fVar.f) {
                                }
                            } else {
                                dVar = null;
                            }
                        }
                    }
                    this.m = dVar;
                    if (this.m == null || this.e == null) {
                        return false;
                    }
                    A a2 = this.e;
                    com.sankuai.waimai.platform.widget.tag.api.c cVar = this.m.i;
                    Map<String, String> map = this.m.j;
                    Object[] objArr3 = {cVar, map};
                    ChangeQuickRedirect changeQuickRedirect3 = a.g;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "8877008b908d58e1eb2dd9e6a3e8747d", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "8877008b908d58e1eb2dd9e6a3e8747d")).booleanValue();
                    }
                    if (a2.h != null) {
                        return a2.h.a(cVar, map);
                    }
                    return false;
                case 1:
                    if (this.m != null) {
                        com.sankuai.waimai.platform.widget.tag.api.c cVar2 = this.m.i;
                        Map<String, String> map2 = this.m.j;
                        Object[] objArr4 = {cVar2, map2};
                        ChangeQuickRedirect changeQuickRedirect4 = c;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6d3b00afe9f3f1112419908b183badcb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6d3b00afe9f3f1112419908b183badcb");
                        } else if (cVar2 != null) {
                            try {
                                A a3 = this.e;
                                Object[] objArr5 = {cVar2, map2};
                                ChangeQuickRedirect changeQuickRedirect5 = a.g;
                                if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "ca7cfe5c389082d2b047ec8919ad4ab3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "ca7cfe5c389082d2b047ec8919ad4ab3");
                                } else if (a3.h != null) {
                                    a3.h.b(cVar2, map2);
                                }
                            } catch (Exception e2) {
                                com.sankuai.waimai.foundation.utils.log.a.b(e2);
                            }
                        }
                        this.m = null;
                        break;
                    }
                    break;
            }
        } else {
            this.m = null;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24d3c8d9cb870bb4b5a07fd6e0cb1502", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24d3c8d9cb870bb4b5a07fd6e0cb1502");
            return;
        }
        super.setPadding(i, i2, i3, i4);
        requestLayout();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0290c45112dd02b200e8b00341a9c2d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0290c45112dd02b200e8b00341a9c2d2");
            return;
        }
        super.setPaddingRelative(i, i2, i3, i4);
        requestLayout();
    }

    private void a(Canvas canvas, Paint paint) {
        Object[] objArr = {canvas, paint};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65f689c5c14da5ac0228ff3c7e1fdcd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65f689c5c14da5ac0228ff3c7e1fdcd4");
            return;
        }
        com.sankuai.waimai.report.c.a(com.sankuai.waimai.report.b.i);
        if (!this.h.isEmpty()) {
            for (f<?> fVar : this.h) {
                fVar.a(canvas, paint, null);
            }
        }
        com.sankuai.waimai.report.c.a(com.sankuai.waimai.report.b.j);
    }

    public void setAdapter(A a2) {
        Object[] objArr = {a2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae0a36c02a5ab2369262fb06c1502a74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae0a36c02a5ab2369262fb06c1502a74");
            return;
        }
        if (this.e != null) {
            this.e.unregisterObserver(this.n);
        }
        if (a2 != null) {
            a2.registerObserver(this.n);
        }
        this.e = a2;
        this.i = true;
        requestLayout();
        invalidate();
    }

    public void setSettings(e eVar) {
        this.d = eVar;
    }

    public A getAdapter() {
        return this.e;
    }
}
