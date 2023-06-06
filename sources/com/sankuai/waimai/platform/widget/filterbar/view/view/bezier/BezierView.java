package com.sankuai.waimai.platform.widget.filterbar.view.view.bezier;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.platform.widget.filterbar.view.view.bezier.BezierUtil;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BezierView extends View {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private float d;
    private float e;
    private ArrayList<PointF> f;
    private float g;
    private float h;
    private float i;
    private float j;
    private boolean k;
    private boolean l;
    private List<BezierUtil.BezierPoint> m;
    private Path n;
    private Paint o;
    private Region p;
    private Paint q;
    private Point r;
    private Point s;
    private Point t;
    private Point u;
    private PointF v;
    private Rect w;
    private Region x;

    public BezierView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffe6702396067a8bdea6b799a702430c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffe6702396067a8bdea6b799a702430c");
        }
    }

    public BezierView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01efd86cab9424d974c3eb8efc0be4d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01efd86cab9424d974c3eb8efc0be4d1");
        }
    }

    public BezierView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caf426d4143e964d75852106dcdd65f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caf426d4143e964d75852106dcdd65f2");
            return;
        }
        this.f = new ArrayList<>();
        this.m = new ArrayList();
        this.n = new Path();
        this.o = new Paint(1);
        this.p = new Region();
        this.q = new Paint(1);
        this.r = new Point();
        this.s = new Point();
        this.t = new Point();
        this.u = new Point();
        this.v = new PointF();
        this.w = new Rect();
        this.x = new Region();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d49d1a8711840d59039c9ed0adc99bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d49d1a8711840d59039c9ed0adc99bc");
            return;
        }
        a(0);
        b(0);
        a(0.0f);
        b(0.0f);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f2aecb7d099b1ade638e4fab24a931", RobustBitConfig.DEFAULT_VALUE)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f2aecb7d099b1ade638e4fab24a931");
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = this.b;
        savedState.c = this.c;
        savedState.d = this.d;
        savedState.e = this.e;
        savedState.f = this.f;
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2040c270838218232712956f6433586a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2040c270838218232712956f6433586a");
        } else if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            a(savedState.b);
            b(savedState.c);
            a(savedState.d);
            b(savedState.e);
            setDataPoints(savedState.f);
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aecf2bc186eb4de683a2ed446bfbce2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aecf2bc186eb4de683a2ed446bfbce2d");
            return;
        }
        super.onDraw(canvas);
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (!this.k || !this.l || this.m == null || this.m.isEmpty()) {
            return;
        }
        this.n.reset();
        this.n.setFillType(Path.FillType.EVEN_ODD);
        this.v.x = this.m.get(0).b.x;
        this.v.y = this.h;
        a(this.v, paddingTop, height, paddingLeft, width, this.s);
        this.n.moveTo(this.s.x, this.s.y);
        for (BezierUtil.BezierPoint bezierPoint : this.m) {
            PointF pointF = bezierPoint.b;
            PointF pointF2 = bezierPoint.c;
            PointF pointF3 = bezierPoint.d;
            PointF pointF4 = bezierPoint.e;
            a(pointF, paddingTop, height, paddingLeft, width, this.r);
            a(pointF2, paddingTop, height, paddingLeft, width, this.s);
            a(pointF3, paddingTop, height, paddingLeft, width, this.t);
            a(pointF4, paddingTop, height, paddingLeft, width, this.u);
            this.n.lineTo(this.r.x, this.r.y);
            this.n.cubicTo(this.s.x, this.s.y, this.t.x, this.t.y, this.u.x, this.u.y);
        }
        this.v.x = this.m.get(this.m.size() - 1).e.x;
        this.v.y = this.h;
        a(this.v, paddingTop, height, paddingLeft, width, this.r);
        this.n.lineTo(this.r.x, this.r.y);
        this.n.close();
        canvas.drawPath(this.n, this.o);
        this.v.x = this.d < this.g ? this.g : this.d;
        this.v.y = this.h + this.j;
        a(this.v, paddingTop, height, paddingLeft, width, this.r);
        this.v.x = this.e > this.g + this.i ? this.g + this.i : this.e;
        this.v.y = this.h;
        a(this.v, paddingTop, height, paddingLeft, width, this.s);
        this.x.set(this.r.x, this.r.y, this.s.x, this.s.y);
        this.p.setPath(this.n, this.x);
        RegionIterator regionIterator = new RegionIterator(this.p);
        while (regionIterator.next(this.w)) {
            canvas.drawRect(this.w, this.q);
        }
    }

    public void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a69d4d683c33928100fb270c5b67bf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a69d4d683c33928100fb270c5b67bf0");
        } else if (a(i)) {
            invalidate();
        }
    }

    public void setSelectColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "145cb750e446334fc045906d57db9973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "145cb750e446334fc045906d57db9973");
        } else if (b(i)) {
            invalidate();
        }
    }

    public void setSelectMin(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7973273822ef1ef778d71b8de2028815", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7973273822ef1ef778d71b8de2028815");
        } else if (a(f)) {
            invalidate();
        }
    }

    public void setSelectMax(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5368906a00aec5ab8be74ba13fbef73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5368906a00aec5ab8be74ba13fbef73");
        } else if (b(f)) {
            invalidate();
        }
    }

    public void setPoints(ArrayList<PointF> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "007dc0c9effe47a278455dac29bedb1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "007dc0c9effe47a278455dac29bedb1b");
            return;
        }
        setDataPoints(arrayList);
        invalidate();
    }

    public float getDataWidth() {
        return this.i;
    }

    private boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ae630d134f0b1271fd36381d3164f91", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ae630d134f0b1271fd36381d3164f91")).booleanValue();
        }
        if (i == 0 || this.b != i) {
            this.b = i;
            this.o.setColor(this.b);
            this.o.setStrokeWidth(1.0f);
            this.o.setStyle(Paint.Style.FILL);
            return true;
        }
        return false;
    }

    private boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3437f893caacc4c3533cbad8ba4749b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3437f893caacc4c3533cbad8ba4749b8")).booleanValue();
        }
        if (i == 0 || this.c != i) {
            this.c = i;
            this.q.setColor(this.c);
            this.q.setStrokeWidth(1.0f);
            this.q.setStyle(Paint.Style.FILL);
            return true;
        }
        return false;
    }

    private boolean a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21909b481cec09c0ef0a574c4876396f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21909b481cec09c0ef0a574c4876396f")).booleanValue();
        }
        double d = f;
        if (h.a(Double.valueOf(d), Double.valueOf(0.0d)) || !h.a(Double.valueOf(this.d), Double.valueOf(d))) {
            this.d = f;
            return true;
        }
        return false;
    }

    private boolean b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a797404fa969f87a33a49a065714884", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a797404fa969f87a33a49a065714884")).booleanValue();
        }
        double d = f;
        if (h.a(Double.valueOf(d), Double.valueOf(0.0d)) || !h.a(Double.valueOf(this.e), Double.valueOf(d))) {
            this.e = f;
            return true;
        }
        return false;
    }

    private void setDataPoints(ArrayList<PointF> arrayList) {
        List<BezierUtil.BezierPoint> arrayList2;
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e84c93fa1dc5bf7f7bddfa98a69dd70d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e84c93fa1dc5bf7f7bddfa98a69dd70d");
            return;
        }
        if (this.f == null) {
            this.f = new ArrayList<>();
        }
        if (arrayList == null) {
            this.f.clear();
        } else {
            this.f = arrayList;
        }
        a(this.f);
        ArrayList<PointF> arrayList3 = this.f;
        Object[] objArr2 = {arrayList3};
        ChangeQuickRedirect changeQuickRedirect2 = BezierUtil.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "adafbe0074ca98f89ea34ab9d2825ddd", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList2 = (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "adafbe0074ca98f89ea34ab9d2825ddd");
        } else {
            Object[] objArr3 = {arrayList3, Double.valueOf(0.25d), Double.valueOf(0.25d)};
            ChangeQuickRedirect changeQuickRedirect3 = BezierUtil.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "74ba508b36a4f0dbd001f04c719af9b4", RobustBitConfig.DEFAULT_VALUE)) {
                arrayList2 = (List) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "74ba508b36a4f0dbd001f04c719af9b4");
            } else {
                Object[] objArr4 = {arrayList3, Double.valueOf(0.25d), Double.valueOf(0.25d), Double.valueOf(0.0d), Double.valueOf(180.0d)};
                ChangeQuickRedirect changeQuickRedirect4 = BezierUtil.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "2a2d93bcc2d75793fdb28f60b0ee68de", RobustBitConfig.DEFAULT_VALUE)) {
                    arrayList2 = (List) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "2a2d93bcc2d75793fdb28f60b0ee68de");
                } else {
                    int a2 = BezierUtil.a(arrayList3);
                    if (a2 > 2) {
                        arrayList2 = BezierUtil.a(arrayList3, 0.25d, 0.25d, 0.0d, 180.0d);
                    } else if (a2 == 2) {
                        ArrayList arrayList4 = new ArrayList();
                        PointF pointF = new PointF();
                        PointF pointF2 = new PointF();
                        if (BezierUtil.a(arrayList3, 0.25d, 0.25d, 0.0d, 180.0d, pointF, pointF2)) {
                            arrayList4.add(new BezierUtil.BezierPoint(arrayList3.get(0), pointF, pointF2, arrayList3.get(1)));
                        }
                        arrayList2 = arrayList4;
                    } else {
                        arrayList2 = new ArrayList<>();
                    }
                }
            }
        }
        this.m = arrayList2;
    }

    private void a(List<PointF> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b54b4d39d256b88b41f6bff71082ce41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b54b4d39d256b88b41f6bff71082ce41");
            return;
        }
        this.k = false;
        this.l = false;
        if (list == null || list.isEmpty()) {
            return;
        }
        PointF pointF = list.get(0);
        float f = pointF.x;
        float f2 = pointF.x;
        float f3 = pointF.y;
        float f4 = pointF.y;
        for (PointF pointF2 : list) {
            if (pointF2.x < f) {
                f = pointF2.x;
            }
            if (pointF2.x > f2) {
                f2 = pointF2.x;
            }
            if (pointF2.y < f3) {
                f3 = pointF2.y;
            }
            if (pointF2.y > f4) {
                f4 = pointF2.y;
            }
        }
        this.g = f;
        this.h = f3;
        this.i = f2 - this.g;
        this.j = f4 - this.h;
        this.k = Math.abs(this.i) > 1.0E-4f;
        this.l = Math.abs(this.j) > 1.0E-4f;
    }

    private void a(@NonNull PointF pointF, int i, int i2, int i3, int i4, @NonNull Point point) {
        Object[] objArr = {pointF, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), point};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a65b45b4b8de6df7a33f71b5f180fc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a65b45b4b8de6df7a33f71b5f180fc2");
            return;
        }
        point.x = i3 + ((int) (((pointF.x - this.g) * (i4 - i3)) / this.i));
        point.y = i2 - ((int) (((pointF.y - this.h) * (i2 - i)) / this.j));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.bezier.BezierView.SavedState.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e62d501adea2157ee9a1b284be6d8f6b", RobustBitConfig.DEFAULT_VALUE) ? (SavedState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e62d501adea2157ee9a1b284be6d8f6b") : new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public float d;
        public float e;
        public ArrayList<PointF> f;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            Object[] objArr = {parcelable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "383c0118419a7b6b6fab1eff7543e4bb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "383c0118419a7b6b6fab1eff7543e4bb");
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b31c78b941e248d1ee4e8c876f8b92f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b31c78b941e248d1ee4e8c876f8b92f");
                return;
            }
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readFloat();
            this.e = parcel.readFloat();
            this.f = parcel.createTypedArrayList(PointF.CREATOR);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35487b777d2dba71a195b6ab2e71ec05", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35487b777d2dba71a195b6ab2e71ec05");
                return;
            }
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeFloat(this.d);
            parcel.writeFloat(this.e);
            parcel.writeTypedList(this.f);
        }
    }
}
