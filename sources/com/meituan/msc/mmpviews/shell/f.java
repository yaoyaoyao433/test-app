package com.meituan.msc.mmpviews.shell;

import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.uimanager.ar;
import com.meituan.msc.uimanager.t;
import com.meituan.msc.uimanager.v;
import com.meituan.msc.uimanager.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends e {
    public static ChangeQuickRedirect m;
    static final ViewGroup.LayoutParams n = new ViewGroup.LayoutParams(0, 0);
    @Nullable
    com.meituan.msc.mmpviews.csstypes.f A;
    ViewGroup B;
    ViewGroup C;
    final ViewGroup D;
    boolean o;
    @Nullable
    View[] p;
    int q;
    @Nullable
    Rect r;
    @Nullable
    Rect s;
    public t t;
    @Nullable
    a u;
    @Nullable
    com.meituan.msc.touch.b v;
    boolean w;
    final ar x;
    @Nullable
    Path y;
    @Nullable
    com.meituan.msc.mmpviews.csstypes.f z;

    public static /* synthetic */ void a(f fVar, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "cca6ba22309fcb48a62b137a4bba3283", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "cca6ba22309fcb48a62b137a4bba3283");
        } else if (fVar.o && fVar.D.getParent() != null) {
            com.facebook.infer.annotation.a.a(fVar.r);
            com.facebook.infer.annotation.a.a(fVar.p);
            Rect rect = new Rect();
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (fVar.r.intersects(rect.left, rect.top, rect.right, rect.bottom) != (view.getParent() != null)) {
                int i = 0;
                for (int i2 = 0; i2 < fVar.q; i2++) {
                    if (fVar.p[i2] == view) {
                        fVar.a(fVar.r, i2, i);
                        return;
                    }
                    if (fVar.p[i2].getParent() == null) {
                        i++;
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public static ChangeQuickRedirect a;
        private final f b;

        private a(f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7666272b3f5cfebb4c440d948c94247c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7666272b3f5cfebb4c440d948c94247c");
            } else {
                this.b = fVar;
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c928ee74d6d666c6ab3619541bf58661", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c928ee74d6d666c6ab3619541bf58661");
            } else if (this.b.o) {
                f.a(this.b, view);
            }
        }
    }

    public f(ViewGroup viewGroup) {
        super(viewGroup);
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52ad8ca85c5c1ef95f29fe0a6eef5446", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52ad8ca85c5c1ef95f29fe0a6eef5446");
            return;
        }
        this.o = false;
        this.p = null;
        this.t = t.AUTO;
        this.w = false;
        this.z = com.meituan.msc.mmpviews.csstypes.f.visible;
        this.A = com.meituan.msc.mmpviews.csstypes.f.visible;
        this.D = viewGroup;
        viewGroup.setClipChildren(false);
        this.x = new ar(viewGroup);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a612764d8667c21161301e25d7b0b71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a612764d8667c21161301e25d7b0b71");
        } else if (z != this.o) {
            this.o = z;
            if (z) {
                this.r = new Rect();
                w.a(this.D, this.r);
                this.q = this.D.getChildCount();
                this.p = new View[Math.max(12, this.q)];
                this.u = new a();
                for (int i = 0; i < this.q; i++) {
                    View childAt = this.D.getChildAt(i);
                    this.p[i] = childAt;
                    childAt.addOnLayoutChangeListener(this.u);
                }
                o();
                return;
            }
            com.facebook.infer.annotation.a.a(this.r);
            com.facebook.infer.annotation.a.a(this.p);
            com.facebook.infer.annotation.a.a(this.u);
            for (int i2 = 0; i2 < this.q; i2++) {
                this.p[i2].removeOnLayoutChangeListener(this.u);
            }
            this.D.getDrawingRect(this.r);
            a(this.r);
            this.p = null;
            this.r = null;
            this.q = 0;
            this.u = null;
        }
    }

    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0024351424c4e495d84cf5eb9fe0aa5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0024351424c4e495d84cf5eb9fe0aa5c");
        } else if (this.o) {
            com.facebook.infer.annotation.a.a(this.r);
            com.facebook.infer.annotation.a.a(this.p);
            w.a(this.b, this.r);
            a(this.r);
        }
    }

    private void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcbe5d823a06e60d1cfcf484034f7fff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcbe5d823a06e60d1cfcf484034f7fff");
            return;
        }
        com.facebook.infer.annotation.a.a(this.p);
        int i = 0;
        for (int i2 = 0; i2 < this.q; i2++) {
            a(rect, i2, i);
            if (this.p[i2].getParent() == null) {
                i++;
            }
        }
    }

    private void a(Rect rect, int i, int i2) {
        boolean z = true;
        Object[] objArr = {rect, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efc117f78cab9182600780cd46965c89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efc117f78cab9182600780cd46965c89");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        View view = ((View[]) com.facebook.infer.annotation.a.a(this.p))[i];
        Rect rect2 = new Rect();
        rect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        boolean intersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = view.getAnimation();
        boolean z2 = (animation == null || animation.hasEnded()) ? false : true;
        if (!intersects && view.getParent() != null && !z2) {
            this.D.removeViewsInLayout(i - i2, 1);
        } else if (intersects && view.getParent() == null) {
            ((c) this.D).addViewInLayout(view, i - i2, n, true);
            this.D.invalidate();
        } else if (!intersects) {
            z = false;
        }
        if (z && (view instanceof v)) {
            v vVar = (v) view;
            if (vVar.getRemoveClippedSubviews()) {
                vVar.a();
            }
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d46af3f750e791ec5306fbfc4cf2dc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d46af3f750e791ec5306fbfc4cf2dc7");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.x.b(this.b);
        ((c) this.D).setChildrenDrawingOrderEnabled(this.x.a());
    }

    public final void a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2df0579bfe5d2ef2b15ed85c32be3d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2df0579bfe5d2ef2b15ed85c32be3d4");
            return;
        }
        com.facebook.infer.annotation.a.a(this.o);
        com.facebook.infer.annotation.a.a(this.r);
        com.facebook.infer.annotation.a.a(this.p);
        if (i < 0) {
            i = this.q;
        }
        Object[] objArr2 = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = m;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08f90097528d6decfa1ea16a07aa862c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08f90097528d6decfa1ea16a07aa862c");
        } else {
            View[] viewArr = (View[]) com.facebook.infer.annotation.a.a(this.p);
            int i2 = this.q;
            int length = viewArr.length;
            if (i == i2) {
                if (length == i2) {
                    this.p = new View[length + 12];
                    System.arraycopy(viewArr, 0, this.p, 0, length);
                    viewArr = this.p;
                }
                int i3 = this.q;
                this.q = i3 + 1;
                viewArr[i3] = view;
            } else if (i < i2) {
                if (length == i2) {
                    this.p = new View[length + 12];
                    System.arraycopy(viewArr, 0, this.p, 0, i);
                    System.arraycopy(viewArr, i, this.p, i + 1, i2 - i);
                    viewArr = this.p;
                } else {
                    System.arraycopy(viewArr, i, viewArr, i + 1, i2 - i);
                }
                viewArr[i] = view;
                this.q++;
            } else {
                throw new IndexOutOfBoundsException("index=" + i + " count=" + i2);
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            if (this.p[i5].getParent() == null) {
                i4++;
            }
        }
        a(this.r, i, i4);
        view.addOnLayoutChangeListener(this.u);
    }

    public final void b(View view) {
        int i;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d4b7d02db24170d060bee0e6cd8a4c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d4b7d02db24170d060bee0e6cd8a4c5");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        com.facebook.infer.annotation.a.a(this.o);
        com.facebook.infer.annotation.a.a(this.r);
        com.facebook.infer.annotation.a.a(this.p);
        view.removeOnLayoutChangeListener(this.u);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = m;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "026f7fdab3fdd93f127ab1c50a0fb0e6", RobustBitConfig.DEFAULT_VALUE)) {
            int i2 = this.q;
            View[] viewArr = (View[]) com.facebook.infer.annotation.a.a(this.p);
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    i = -1;
                    break;
                } else if (viewArr[i3] == view) {
                    i = i3;
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "026f7fdab3fdd93f127ab1c50a0fb0e6")).intValue();
        }
        if (this.p[i].getParent() != null) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                if (this.p[i5].getParent() == null) {
                    i4++;
                }
            }
            this.D.removeViewsInLayout(i - i4, 1);
        }
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = m;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "81237c95e885a57f3b3449b100fe5469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "81237c95e885a57f3b3449b100fe5469");
            return;
        }
        View[] viewArr2 = (View[]) com.facebook.infer.annotation.a.a(this.p);
        int i6 = this.q;
        if (i == i6 - 1) {
            int i7 = this.q - 1;
            this.q = i7;
            viewArr2[i7] = null;
        } else if (i >= 0 && i < i6) {
            System.arraycopy(viewArr2, i + 1, viewArr2, i, (i6 - i) - 1);
            int i8 = this.q - 1;
            this.q = i8;
            viewArr2[i8] = null;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.z == com.meituan.msc.mmpviews.csstypes.f.scroll || this.z == com.meituan.msc.mmpviews.csstypes.f.auto;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return this.A == com.meituan.msc.mmpviews.csstypes.f.scroll || this.A == com.meituan.msc.mmpviews.csstypes.f.auto;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@NonNull ViewGroup viewGroup, @NonNull ViewGroup viewGroup2) {
        Object[] objArr = {viewGroup, viewGroup2};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a4419c1316b9731ea3260314b1e4b70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a4419c1316b9731ea3260314b1e4b70");
            return;
        }
        int childCount = viewGroup.getChildCount();
        View[] viewArr = new View[childCount];
        for (int i = 0; i < childCount; i++) {
            viewArr[i] = viewGroup.getChildAt(i);
        }
        viewGroup.removeAllViews();
        for (int i2 = 0; i2 < childCount; i2++) {
            viewGroup2.addView(viewArr[i2]);
        }
    }
}
