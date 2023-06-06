package com.sankuai.waimai.platform.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FlowTextTagsView extends View {
    public static ChangeQuickRedirect a;
    private e A;
    private a B;
    private int C;
    private int D;
    private TextPaint E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J;
    private int K;
    private int L;
    private int M;
    private c N;
    public float b;
    public float c;
    private LinkedList<d> d;
    private List<d> e;
    private List<d> f;
    private LinkedList<d> g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private String l;
    private float m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private boolean z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class e {
        public static ChangeQuickRedirect a;
        final DataSetObservable b;

        public abstract int a();
    }

    public static /* synthetic */ void a(FlowTextTagsView flowTextTagsView) {
        d removeFirst;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, flowTextTagsView, changeQuickRedirect, false, "f48085ae6e4368085cda498fd9e74003", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, flowTextTagsView, changeQuickRedirect, false, "f48085ae6e4368085cda498fd9e74003");
            return;
        }
        flowTextTagsView.d.addAll(flowTextTagsView.e);
        flowTextTagsView.e.clear();
        flowTextTagsView.f.clear();
        flowTextTagsView.g.clear();
        if (flowTextTagsView.A != null && flowTextTagsView.A.a() > 0) {
            int a2 = flowTextTagsView.A.a();
            for (int i = 0; i < a2; i++) {
                if (flowTextTagsView.d.isEmpty()) {
                    removeFirst = new d();
                } else {
                    removeFirst = flowTextTagsView.d.removeFirst();
                }
                d.j(removeFirst);
                if (TextUtils.isEmpty(removeFirst.g)) {
                    flowTextTagsView.d.add(removeFirst);
                } else {
                    flowTextTagsView.e.add(removeFirst);
                }
            }
        }
        flowTextTagsView.requestLayout();
        flowTextTagsView.invalidate();
    }

    public FlowTextTagsView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd958b15d8f5e690bed78b6c05a085e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd958b15d8f5e690bed78b6c05a085e4");
            return;
        }
        this.d = new LinkedList<>();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new LinkedList<>();
        this.h = 0;
        this.i = false;
        this.j = false;
        this.k = true;
        this.l = "...";
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 30;
        this.D = 0;
        this.F = 0.0f;
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = 0.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.b = -1.0f;
        this.c = -1.0f;
        a(context, null);
    }

    public FlowTextTagsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50c1920692e26209fd740dec0017d20f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50c1920692e26209fd740dec0017d20f");
            return;
        }
        this.d = new LinkedList<>();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new LinkedList<>();
        this.h = 0;
        this.i = false;
        this.j = false;
        this.k = true;
        this.l = "...";
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 30;
        this.D = 0;
        this.F = 0.0f;
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = 0.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.b = -1.0f;
        this.c = -1.0f;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "457739c06f3158af80814069f75f8a09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "457739c06f3158af80814069f75f8a09");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.tag_maxLines, R.attr.showByPriority, R.attr.tagMarginHorizontal, R.attr.tagMarginVertical, R.attr.tag_iconWidth, R.attr.tag_iconLeftWidth, R.attr.tag_iconRightWidth, R.attr.tag_textSize, R.attr.tag_textPadding, R.attr.tag_textPaddingLeft, R.attr.tag_textPaddingTop, R.attr.tag_textPaddingRight, R.attr.tag_textPaddingBottom, R.attr.tag_preTextPadding, R.attr.tag_preTextPaddingLeft, R.attr.tag_preTextPaddingTop, R.attr.tag_preTextPaddingRight, R.attr.tag_preTextPaddingBottom, R.attr.withEllipsize, R.attr.showOverLengthTag});
        this.y = (int) obtainStyledAttributes.getDimension(7, 30.0f);
        this.p = (int) obtainStyledAttributes.getDimension(2, 0.0f);
        this.q = (int) obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension = (int) obtainStyledAttributes.getDimension(4, 10.0f);
        this.r = (int) obtainStyledAttributes.getDimension(5, dimension);
        this.s = (int) obtainStyledAttributes.getDimension(6, dimension);
        float dimension2 = (int) obtainStyledAttributes.getDimension(9, 0.0f);
        this.u = (int) obtainStyledAttributes.getDimension(9, dimension2);
        this.w = (int) obtainStyledAttributes.getDimension(10, dimension2);
        this.v = (int) obtainStyledAttributes.getDimension(11, dimension2);
        this.x = (int) obtainStyledAttributes.getDimension(12, dimension2);
        float dimension3 = (int) obtainStyledAttributes.getDimension(13, 0.0f);
        this.J = (int) obtainStyledAttributes.getDimension(14, dimension3);
        this.L = (int) obtainStyledAttributes.getDimension(15, dimension3);
        this.K = (int) obtainStyledAttributes.getDimension(16, dimension3);
        this.M = (int) obtainStyledAttributes.getDimension(17, dimension3);
        this.j = obtainStyledAttributes.getBoolean(18, false);
        this.k = obtainStyledAttributes.getBoolean(19, true);
        int i = obtainStyledAttributes.getInt(0, 0);
        if (i < 0) {
            i = 0;
        }
        this.h = i;
        this.i = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        a(this.y);
    }

    private boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a86a9fb59bf0b5d29d60463f0003ac21", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a86a9fb59bf0b5d29d60463f0003ac21")).booleanValue();
        }
        if (this.E == null) {
            this.y = i;
            this.E = new TextPaint();
            this.E.setAntiAlias(true);
            a();
            return true;
        } else if (i != this.y) {
            this.y = i;
            a();
            return true;
        } else {
            return false;
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adcb38ec6e27b8799e73c048288e82fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adcb38ec6e27b8799e73c048288e82fd");
            return;
        }
        this.E.setTextSize(this.y);
        this.E.setTypeface(Typeface.defaultFromStyle(this.z ? 1 : 0));
        Paint.FontMetrics fontMetrics = this.E.getFontMetrics();
        this.F = Math.abs(fontMetrics.descent);
        this.G = Math.abs(fontMetrics.ascent);
        this.H = Math.abs(fontMetrics.top);
        this.I = Math.abs(fontMetrics.bottom);
        this.m = this.E.measureText(this.l);
        this.C = ((int) (this.G + this.F + 0.5f)) + this.w + this.x;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int b2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a02d8046fbf8f2e440a2127f9dc43a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a02d8046fbf8f2e440a2127f9dc43a2");
            return;
        }
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        if (this.e != null && this.e.size() > 0 && this.h == 1) {
            b2 = this.C + this.n + this.o;
        } else {
            b2 = b(defaultSize) + this.n + this.o;
        }
        setMeasuredDimension(defaultSize, b2);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11871e4a6c51a654022624a6d5bb1b44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11871e4a6c51a654022624a6d5bb1b44");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.h == 1) {
            b(getWidth());
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9d472c1f7a97db7fe2cec06542e3c48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9d472c1f7a97db7fe2cec06542e3c48");
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        LinkedList<d> linkedList = this.g;
        Object[] objArr2 = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b3d0d4c36fbb392dd98d4490f87f647", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b3d0d4c36fbb392dd98d4490f87f647");
        } else if (this.D == 1 && this.i && linkedList != null && linkedList.size() > 0) {
            Object[] objArr3 = {linkedList};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5e321377a2c4ea1b6c7978dd0aaeeaa9", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5e321377a2c4ea1b6c7978dd0aaeeaa9")).booleanValue();
            } else {
                e eVar = this.A;
                z = false;
            }
            if (z) {
                Iterator<d> it = linkedList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    d next = it.next();
                    next.x.b = i;
                    next.x.d = next.D + i;
                    a(next);
                    if (!TextUtils.isEmpty(next.r)) {
                        next.B.b = next.x.b;
                        next.B.d = next.x.b + next.w + this.u + this.v;
                    } else {
                        b bVar = next.B;
                        b bVar2 = next.B;
                        int i2 = next.x.b;
                        bVar2.d = i2;
                        bVar.b = i2;
                    }
                    if (!TextUtils.isEmpty(next.r)) {
                        next.C.b = next.B.b + this.u;
                        next.C.d = next.B.d - this.v;
                        next.C.f = (((next.C.d - next.C.b) - next.w) / 2) + next.C.b;
                        next.C.g = next.C.c + ((int) (this.G + 0.5f));
                    } else {
                        next.C.b = 0;
                        next.C.c = 0;
                        next.C.d = 0;
                        next.C.e = 0;
                        next.C.f = 0;
                        next.C.g = 0;
                    }
                    if (!TextUtils.isEmpty(next.t)) {
                        next.y.b = next.B.d + this.u;
                        next.y.d = next.x.d - this.v;
                        next.y.f = (((next.y.d - next.y.b) - next.v) / 2) + next.y.b;
                        next.y.g = next.y.c + ((int) (this.G + 0.5f));
                    } else {
                        next.y.b = 0;
                        next.y.c = 0;
                        next.y.d = 0;
                        next.y.e = 0;
                        next.y.f = 0;
                        next.y.g = 0;
                    }
                    i += next.D + this.p;
                }
            }
        }
        if (getAdapter() != null) {
            getAdapter();
        }
        Iterator<d> it2 = this.g.iterator();
        while (it2.hasNext()) {
            d next2 = it2.next();
            if (next2.F > this.D) {
                return;
            }
            if (next2.c != null && next2.x != null && next2.x.d > next2.x.b && next2.x.e > next2.x.c) {
                next2.c.setBounds(next2.x.b, next2.x.c, next2.x.d, next2.x.e);
                next2.c.draw(canvas);
            }
            if (next2.e != null && next2.z != null && next2.z.d > next2.z.b && next2.z.e > next2.z.c) {
                next2.e.setBounds(next2.z.b, next2.z.c, next2.z.d, next2.z.e);
                next2.e.draw(canvas);
            }
            if (next2.f != null && next2.A != null && next2.A.d > next2.A.b && next2.A.e > next2.A.c) {
                next2.f.setBounds(next2.A.b, next2.A.c, next2.A.d, next2.A.e);
                next2.f.draw(canvas);
            }
            if (next2.d != null && next2.B != null && next2.B.d > next2.B.b && next2.B.e > next2.B.c) {
                next2.d.setBounds(next2.B.b + 1, next2.B.c + 1, next2.B.d, next2.B.e - 1);
                next2.d.draw(canvas);
            }
            if (!TextUtils.isEmpty(next2.r) && next2.C != null) {
                this.E.setColor(next2.k);
                canvas.translate(next2.C.f, next2.C.g);
                canvas.drawText(next2.r, 0.0f, 0.0f, this.E);
                canvas.translate(-next2.C.f, -next2.C.g);
            }
            if (!TextUtils.isEmpty(next2.t) && next2.y != null) {
                this.E.setColor(next2.j);
                canvas.translate(next2.y.f, next2.y.g);
                canvas.drawText(next2.t, 0.0f, 0.0f, this.E);
                canvas.translate(-next2.y.f, -next2.y.g);
            }
        }
    }

    private int b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        String str;
        float f2;
        int breakText;
        int i7 = 1;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0716f77e67239ddacb0562dd5f73827", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0716f77e67239ddacb0562dd5f73827")).intValue();
        }
        this.g.clear();
        List<d> list = this.e;
        if (this.i) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "387219331175493ec6cf20a7608ffbe5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "387219331175493ec6cf20a7608ffbe5");
            } else if (this.f.size() <= 0) {
                this.f.addAll(this.e);
                Collections.sort(this.f);
            }
            list = this.f;
        }
        int i8 = this.n;
        int i9 = i8;
        int i10 = 1;
        int i11 = 0;
        for (d dVar : list) {
            d.j(dVar);
            int i12 = ((int) (this.G + this.F + 0.5f)) + this.w + this.x;
            if (i12 > this.C) {
                int i13 = (i12 - this.C) / 2;
                this.w = i13;
                this.x = i13;
                i12 = this.C;
            }
            int i14 = (TextUtils.isEmpty(dVar.h) ? 1 : 0) ^ i7;
            if (this.u + this.v >= i || (i14 != 0 && this.u + this.v + this.J + this.K >= i)) {
                if (this.k) {
                    dVar.v = 0;
                    dVar.w = 0;
                    dVar.t = "";
                    dVar.r = "";
                    i2 = i;
                } else {
                    i7 = 1;
                }
            } else if (TextUtils.isEmpty(dVar.g)) {
                dVar.g = "";
                dVar.h = "";
                dVar.u = dVar.g;
                dVar.s = dVar.h;
                dVar.p = 0;
                dVar.q = 0;
                dVar.v = 0;
                dVar.w = 0;
                dVar.m = 0;
                dVar.n = 0;
                i2 = dVar.v + dVar.w + dVar.m + dVar.n + this.u + this.v;
                dVar.t = dVar.g;
                dVar.r = dVar.h;
            } else {
                if (!dVar.g.equals(dVar.u)) {
                    dVar.p = (int) (this.E.measureText(dVar.g) + 0.5f);
                    dVar.u = dVar.g;
                }
                if (i14 != 0) {
                    dVar.q = (int) (this.E.measureText(dVar.h) + 0.5f);
                    dVar.s = dVar.h;
                } else {
                    dVar.q = 0;
                    dVar.w = 0;
                }
                if (dVar.e != null) {
                    dVar.m = this.r;
                } else {
                    dVar.m = 0;
                }
                if (dVar.f != null) {
                    dVar.n = this.s;
                    dVar.o = this.t;
                } else {
                    dVar.n = 0;
                }
                dVar.w = dVar.q;
                dVar.v = dVar.p;
                int i15 = dVar.v + dVar.w + dVar.m + dVar.n;
                if (i14 != 0) {
                    i3 = this.u + this.v + this.J + this.K + dVar.m;
                    i4 = dVar.n;
                } else {
                    i3 = this.v;
                    i4 = this.u;
                }
                int i16 = i15 + i3 + i4;
                dVar.t = dVar.g;
                dVar.r = dVar.h;
                if (i16 <= i) {
                    i2 = i16;
                } else if (this.k) {
                    float[] fArr = new float[i7];
                    fArr[0] = 0.0f;
                    if (i14 != 0) {
                        i5 = this.u + this.v + dVar.w + this.J;
                        i6 = this.K;
                    } else {
                        i5 = this.u;
                        i6 = this.v;
                    }
                    float f3 = i - (((i5 + i6) + dVar.m) + dVar.n);
                    if (this.j) {
                        String str2 = this.l;
                        float f4 = this.m;
                        f = f3 - f4;
                        f2 = f4;
                        str = str2;
                    } else {
                        f = f3;
                        str = "";
                        f2 = 0.0f;
                    }
                    String str3 = str;
                    if (this.E.breakText(dVar.g, 0, dVar.g.length(), true, f > 0.0f ? f : 0.0f, fArr) >= 0) {
                        dVar.v = (int) (fArr[0] + f2 + 0.5f);
                        dVar.t = dVar.g.substring(0, breakText) + str3;
                    } else if (f3 >= f2) {
                        dVar.v = (int) (f2 + 0.5f);
                        dVar.t = str3;
                    } else {
                        dVar.v = 0;
                        dVar.t = "";
                    }
                    i2 = i;
                } else {
                    i7 = 1;
                }
            }
            dVar.D = i2;
            dVar.E = i12;
            if (dVar.D + i11 > i) {
                i9 = ((this.C + this.q) * i10) + this.n;
                i10++;
                i11 = 0;
            }
            dVar.F = i10;
            if (dVar.x == null) {
                dVar.x = new b();
            }
            dVar.x.b = i11;
            dVar.x.c = ((this.C - dVar.E) / 2) + i9;
            dVar.x.d = dVar.D + i11;
            dVar.x.e = dVar.x.c + dVar.E;
            a(dVar);
            if (dVar.B == null) {
                dVar.B = new b();
            }
            if (!TextUtils.isEmpty(dVar.r)) {
                dVar.B.b = dVar.x.b;
                dVar.B.d = dVar.x.b + dVar.w + this.u + this.v;
                dVar.B.c = dVar.x.c + ((this.C - dVar.E) / 2);
                dVar.B.e = dVar.x.c + dVar.E;
            } else {
                b bVar = dVar.B;
                b bVar2 = dVar.B;
                int i17 = dVar.x.b;
                bVar2.d = i17;
                bVar.b = i17;
            }
            if (dVar.C == null) {
                dVar.C = new b();
            }
            if (!TextUtils.isEmpty(dVar.r)) {
                dVar.C.b = dVar.B.b + this.u;
                dVar.C.c = dVar.B.c + this.w;
                dVar.C.d = dVar.B.d - this.v;
                dVar.C.e = dVar.B.e - this.x;
                dVar.C.f = (((dVar.C.d - dVar.C.b) - dVar.w) / 2) + dVar.C.b;
                dVar.C.g = dVar.C.c + ((int) (this.G + 0.5f));
            } else {
                dVar.C.b = 0;
                dVar.C.c = 0;
                dVar.C.d = 0;
                dVar.C.e = 0;
                dVar.C.f = 0;
                dVar.C.g = 0;
            }
            if (dVar.y == null) {
                dVar.y = new b();
            }
            if (!TextUtils.isEmpty(dVar.t)) {
                dVar.y.b = dVar.m + dVar.B.d + this.u;
                dVar.y.c = dVar.x.c + this.w;
                dVar.y.d = (dVar.x.d - this.v) - dVar.n;
                dVar.y.e = dVar.x.e - this.x;
                dVar.y.f = (((dVar.y.d - dVar.y.b) - dVar.v) / 2) + dVar.y.b;
                dVar.y.g = dVar.y.c + ((int) (this.G + 0.5f));
            } else {
                dVar.y.b = 0;
                dVar.y.c = 0;
                dVar.y.d = 0;
                dVar.y.e = 0;
                dVar.y.f = 0;
                dVar.y.g = 0;
            }
            if (this.h == 0 || dVar.F <= this.h) {
                this.g.addLast(dVar);
            }
            i11 += dVar.D + this.p;
            i7 = 1;
        }
        if (this.h < i10 && this.h != 0) {
            i10 = this.h;
        }
        this.D = i10;
        return (this.D * this.C) + ((this.D - 1 > 0 ? this.D - 1 : 0) * this.q);
    }

    private void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "383029a4b6c10be3b68da15d64c5d7da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "383029a4b6c10be3b68da15d64c5d7da");
            return;
        }
        if (dVar.z == null) {
            dVar.z = new b();
        }
        if (dVar.A == null) {
            dVar.A = new b();
        }
        if (dVar.i != 1) {
            if (dVar.e != null) {
                dVar.z.b = dVar.x.b + 8;
                dVar.z.d = dVar.z.b + dVar.m;
                dVar.z.c = dVar.x.c + ((this.C - dVar.m) / 2);
                dVar.z.e = dVar.z.c + dVar.m;
            } else {
                b bVar = dVar.z;
                b bVar2 = dVar.z;
                int i = dVar.x.b;
                bVar2.d = i;
                bVar.b = i;
            }
            if (dVar.f != null) {
                dVar.A.d = dVar.x.d - 8;
                dVar.A.b = dVar.A.d - dVar.n;
                dVar.A.c = dVar.x.c + ((this.C - dVar.o) / 2);
                dVar.A.e = dVar.z.c + dVar.n;
                return;
            }
            b bVar3 = dVar.A;
            b bVar4 = dVar.A;
            int i2 = dVar.x.d;
            bVar4.d = i2;
            bVar3.b = i2;
            return;
        }
        if (dVar.e != null) {
            dVar.z.b = dVar.x.b + 8;
            dVar.z.d = dVar.z.b + dVar.m;
            dVar.z.c = dVar.x.c + ((this.C - dVar.m) / 2);
            dVar.z.e = dVar.z.c + dVar.m;
        } else {
            b bVar5 = dVar.z;
            b bVar6 = dVar.z;
            int i3 = dVar.x.b;
            bVar6.d = i3;
            bVar5.b = i3;
        }
        if (dVar.f != null) {
            dVar.A.d = dVar.x.d - 8;
            dVar.A.b = dVar.A.d - dVar.n;
            dVar.A.c = dVar.x.c + ((this.C - dVar.o) / 2);
            dVar.A.e = dVar.A.c + dVar.o;
            return;
        }
        b bVar7 = dVar.A;
        b bVar8 = dVar.A;
        int i4 = dVar.x.d;
        bVar8.d = i4;
        bVar7.b = i4;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends DataSetObserver {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {FlowTextTagsView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89ec40fa4a79bc9bb8a0894799605304", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89ec40fa4a79bc9bb8a0894799605304");
            }
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95dd60bbf1db3b8ee94994aad6e562f6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95dd60bbf1db3b8ee94994aad6e562f6");
                return;
            }
            super.onChanged();
            FlowTextTagsView.a(FlowTextTagsView.this);
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7afaac8ec13c6629d46619e3366fc0f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7afaac8ec13c6629d46619e3366fc0f3");
            } else {
                super.onInvalidated();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class d implements Comparable {
        public static ChangeQuickRedirect a;
        private b A;
        private b B;
        private b C;
        private int D;
        private int E;
        private int F;
        public Object b;
        public Drawable c;
        public Drawable d;
        public Drawable e;
        public Drawable f;
        public String g;
        public String h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        private int p;
        private int q;
        private String r;
        private String s;
        private String t;
        private String u;
        private int v;
        private int w;
        private b x;
        private b y;
        private b z;

        public static /* synthetic */ void j(d dVar) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "fc446d4a25e9a0cd38aa2ffb744ea890", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "fc446d4a25e9a0cd38aa2ffb744ea890");
                return;
            }
            dVar.p = 0;
            dVar.u = "";
            dVar.t = "";
            dVar.v = 0;
            if (dVar.x != null) {
                b.a(dVar.x);
            }
            if (dVar.y != null) {
                b.a(dVar.y);
            }
            dVar.D = 0;
            dVar.E = 0;
            dVar.F = 0;
        }

        public d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d8843091ec3f4d5267c87f914ebd42b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d8843091ec3f4d5267c87f914ebd42b");
            } else {
                this.i = 0;
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(@NonNull Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abe15cc3233db1ffa40d80f954b6d3f0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abe15cc3233db1ffa40d80f954b6d3f0")).intValue();
            }
            if (obj == null || !(obj instanceof d)) {
                return 1;
            }
            return ((d) obj).l - this.l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        private b() {
            Object[] objArr = {FlowTextTagsView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "443dc0cb5131801739bc5430907b6cfc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "443dc0cb5131801739bc5430907b6cfc");
            }
        }

        public static /* synthetic */ void a(b bVar) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "39ee7c9c07dd0550287fe951f3fb29f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "39ee7c9c07dd0550287fe951f3fb29f3");
                return;
            }
            bVar.b = 0;
            bVar.c = 0;
            bVar.d = 0;
            bVar.e = 0;
            bVar.f = 0;
            bVar.g = 0;
        }
    }

    public void setAdapter(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d69e28f75712c43f2aa9f1fb7b87c7e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d69e28f75712c43f2aa9f1fb7b87c7e8");
            return;
        }
        if (this.A != null && this.B != null) {
            e eVar2 = this.A;
            a aVar = this.B;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar2, changeQuickRedirect2, false, "d3e1b9d4f8ff89221a4658b3f8a43c71", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar2, changeQuickRedirect2, false, "d3e1b9d4f8ff89221a4658b3f8a43c71");
            } else {
                eVar2.b.unregisterObserver(aVar);
            }
        }
        this.A = eVar;
        if (this.A != null) {
            if (this.B == null) {
                this.B = new a();
            }
            e eVar3 = this.A;
            a aVar2 = this.B;
            Object[] objArr3 = {aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr3, eVar3, changeQuickRedirect3, false, "9e2db1d7903e2a3716aaa838bce8f177", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar3, changeQuickRedirect3, false, "9e2db1d7903e2a3716aaa838bce8f177");
            } else {
                eVar3.b.registerObserver(aVar2);
            }
            e eVar4 = this.A;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = e.a;
            if (PatchProxy.isSupport(objArr4, eVar4, changeQuickRedirect4, false, "bfc3a7cc5ab490ad1f3738102bf2c8a1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, eVar4, changeQuickRedirect4, false, "bfc3a7cc5ab490ad1f3738102bf2c8a1");
            } else {
                eVar4.b.notifyChanged();
            }
        }
    }

    public int getTagMarginHorizontal() {
        return this.p;
    }

    public int getTagMarginVertical() {
        return this.q;
    }

    public e getAdapter() {
        return this.A;
    }

    public void setTagPadding(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "137bed04f4846f87662ec95300aac551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "137bed04f4846f87662ec95300aac551");
            return;
        }
        if (i <= 0) {
            i = 0;
        }
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1829d1a616aa2d8433e7b3a824d8856c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1829d1a616aa2d8433e7b3a824d8856c");
            return;
        }
        this.u = i > 0 ? i : 0;
        this.w = i > 0 ? i : 0;
        this.v = i > 0 ? i : 0;
        if (i <= 0) {
            i = 0;
        }
        this.x = i;
        this.C = ((int) (this.G + this.F + 0.5f)) + this.w + this.x;
    }

    public void setTagLeftIconWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9182d62952ee71f801cbd200b012bfbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9182d62952ee71f801cbd200b012bfbf");
            return;
        }
        if (i <= 0) {
            i = 0;
        }
        this.r = i;
    }

    public void setTagRightIconWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a465d690ba42e7df6fbb0ff1ca08e38a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a465d690ba42e7df6fbb0ff1ca08e38a");
            return;
        }
        if (i <= 0) {
            i = 0;
        }
        this.s = i;
    }

    public void setTagRightIconHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b021f8ba0a4f50caa048b927cdf971d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b021f8ba0a4f50caa048b927cdf971d0");
        } else {
            this.t = Math.max(i, 0);
        }
    }

    public void setTagPaddingWithRefresh(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "627588525f7d4fd0419a15e1d2ee9b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "627588525f7d4fd0419a15e1d2ee9b0c");
            return;
        }
        setTagPadding(i);
        requestLayout();
        invalidate();
    }

    public void setTextSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2215e52db08dc8620880b25288aff423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2215e52db08dc8620880b25288aff423");
        } else if (i <= 0) {
        } else {
            a(i);
        }
    }

    public void setTextBold(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47dcc6b6f20b85fa5e175dc063c71daa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47dcc6b6f20b85fa5e175dc063c71daa");
            return;
        }
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f834dfe76a188ee10412fbe46e827b7e", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f834dfe76a188ee10412fbe46e827b7e")).booleanValue();
        } else if (this.E == null) {
            this.z = z;
            this.E = new TextPaint();
            this.E.setAntiAlias(true);
            a();
        } else if (z != this.z) {
            this.z = z;
            a();
        }
    }

    public void setTextSizeWithRefresh(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a603ac7ef3fd8c08a900348d45388491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a603ac7ef3fd8c08a900348d45388491");
        } else if (i > 0 && a(i)) {
            requestLayout();
            invalidate();
        }
    }

    public void setMaxLineWithRefresh(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf006c0df716612b52b8c139aef2ee78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf006c0df716612b52b8c139aef2ee78");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.h = i;
        requestLayout();
        invalidate();
    }

    public void setMaxLine(int i) {
        this.h = i;
    }

    public void setShowByPriorityWithRefresh(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ef98845cd30c3bdab0225f695c03786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ef98845cd30c3bdab0225f695c03786");
            return;
        }
        this.i = z;
        requestLayout();
        invalidate();
    }

    public void setShowByPriority(boolean z) {
        this.i = z;
    }

    public void setWithEllipsizeWithRefresh(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8bb8a91639e4f7f753052890ed8a0dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8bb8a91639e4f7f753052890ed8a0dd");
            return;
        }
        this.j = z;
        requestLayout();
        invalidate();
    }

    public void setWithEllipsize(boolean z) {
        this.j = z;
    }

    public void setSingleLineWithRefresh(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3b4f7b7c55a873e8972a4cdfca37045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3b4f7b7c55a873e8972a4cdfca37045");
            return;
        }
        this.h = z ? 1 : 0;
        requestLayout();
        invalidate();
    }

    public void setSingleLine(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78bbe99e8e13bc58f9f682d5096ba32d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78bbe99e8e13bc58f9f682d5096ba32d");
        } else {
            this.h = z ? 1 : 0;
        }
    }

    public List<Object> getShownViewInfoList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e0af8feb4cfedc933a89883978a0a6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e0af8feb4cfedc933a89883978a0a6c");
        }
        if (this.g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = this.g.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b);
        }
        return arrayList;
    }

    public List<d> getShownTagList() {
        return this.g;
    }

    public TextPaint getTextPaint() {
        return this.E;
    }

    public void setTagClickListener(c cVar) {
        this.N = cVar;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f87cb6ac7d1963e18f01e5e85aa84800", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f87cb6ac7d1963e18f01e5e85aa84800")).booleanValue();
        }
        if (this.N == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            this.b = motionEvent.getX();
            this.c = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (this.b != -1.0f && this.c != -1.0f) {
                float f = this.b;
                float f2 = this.c;
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e14949d0a87892ff80ad896d64f9d78", RobustBitConfig.DEFAULT_VALUE)) {
                    d dVar = (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e14949d0a87892ff80ad896d64f9d78");
                } else if (this.g != null) {
                    Iterator<d> it = this.g.iterator();
                    while (it.hasNext()) {
                        d next = it.next();
                        boolean z = this.D == 1 && f2 > 0.0f && f2 < ((float) next.x.e);
                        boolean z2 = this.D > 1 && f2 > ((float) next.x.c) && f2 < ((float) next.x.e);
                        if (f > next.x.b && f < next.x.d && (z || z2)) {
                            break;
                        }
                    }
                }
                return true;
            }
            this.b = -1.0f;
            this.c = -1.0f;
        } else {
            this.b = -1.0f;
            this.c = -1.0f;
        }
        return super.onTouchEvent(motionEvent);
    }
}
