package com.meituan.android.paybase.widgets.bankcard;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RoundImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private Path b;
    private RectF c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float[] h;

    public RoundImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a4ab4988d1b8cf74c5d59c369f3c822", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a4ab4988d1b8cf74c5d59c369f3c822");
            return;
        }
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = new float[8];
        a();
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0214d0773112ad22eb4092e0953302e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0214d0773112ad22eb4092e0953302e7");
            return;
        }
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = new float[8];
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.riv_topLeft, R.attr.riv_topRight, R.attr.riv_bottomRight, R.attr.riv_bottomLeft});
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.g = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            obtainStyledAttributes.recycle();
        }
        a();
    }

    public RoundImageView(Context context, float f, float f2, float f3, float f4) {
        super(context);
        Object[] objArr = {context, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4052a564c8c4a0ca60bfaeb61020035d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4052a564c8c4a0ca60bfaeb61020035d");
            return;
        }
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = new float[8];
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7c7526e9fbb14a195c1fcd0d94d6c00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7c7526e9fbb14a195c1fcd0d94d6c00");
            return;
        }
        this.c = new RectF();
        this.b = new Path();
        this.h[0] = this.d;
        this.h[1] = this.d;
        this.h[2] = this.e;
        this.h[3] = this.e;
        this.h[4] = this.f;
        this.h[5] = this.f;
        this.h[6] = this.g;
        this.h[7] = this.g;
    }

    public final void a(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f324145fff8d352169b6d1b438efa48f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f324145fff8d352169b6d1b438efa48f");
            return;
        }
        boolean a2 = a(f);
        boolean b = b(f2);
        boolean c = c(f3);
        boolean d = d(f4);
        if (a2 || b || c || d) {
            invalidate();
        }
    }

    public void setRadiusTopLeft(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cac6050914394709ca9849ef646f4a43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cac6050914394709ca9849ef646f4a43");
        } else if (a(f)) {
            invalidate();
        }
    }

    public void setRadiusTopRight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1108928da514a9a05ff90391b9e1d1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1108928da514a9a05ff90391b9e1d1c");
        } else if (b(f)) {
            invalidate();
        }
    }

    public void setRadiusBottomRight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1782f97de7bdb2255224d0bd9b095cb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1782f97de7bdb2255224d0bd9b095cb5");
        } else if (c(f)) {
            invalidate();
        }
    }

    public void setRadiusBottomLeft(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cea064fe434f58e52df6543d8e7ce1b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cea064fe434f58e52df6543d8e7ce1b0");
        } else if (d(f)) {
            invalidate();
        }
    }

    private boolean a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "619165d16a97adfc6cfa3d29d6ebff1f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "619165d16a97adfc6cfa3d29d6ebff1f")).booleanValue();
        }
        if (Math.abs(this.d - f) > 1.0E-4d) {
            this.d = f;
            this.h[0] = f;
            this.h[1] = f;
            return true;
        }
        return false;
    }

    private boolean b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96b3491008e5d0a47e8427b787aa87bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96b3491008e5d0a47e8427b787aa87bb")).booleanValue();
        }
        if (Math.abs(this.e - f) > 1.0E-4d) {
            this.e = f;
            this.h[2] = f;
            this.h[3] = f;
            return true;
        }
        return false;
    }

    private boolean c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "521f43488964a7f142fd5137cd329a25", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "521f43488964a7f142fd5137cd329a25")).booleanValue();
        }
        if (Math.abs(this.f - f) > 1.0E-4d) {
            this.f = f;
            this.h[4] = f;
            this.h[5] = f;
            return true;
        }
        return false;
    }

    private boolean d(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6271bad5e00bf3ba85f1a1da595df2fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6271bad5e00bf3ba85f1a1da595df2fa")).booleanValue();
        }
        if (Math.abs(this.g - f) > 1.0E-4d) {
            this.g = f;
            this.h[6] = f;
            this.h[7] = f;
            return true;
        }
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a78743c0eec8e7066c7693a3b86846e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a78743c0eec8e7066c7693a3b86846e");
            return;
        }
        this.c.set(0.0f, 0.0f, getWidth(), getHeight());
        this.b.addRoundRect(this.c, this.h, Path.Direction.CCW);
        canvas.clipPath(this.b);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5230902ffe23e8caad2039406d943971", RobustBitConfig.DEFAULT_VALUE)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5230902ffe23e8caad2039406d943971");
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.d;
        savedState.d = this.e;
        savedState.e = this.f;
        savedState.f = this.g;
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec3d2de0028853dac8cd628bf360af0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec3d2de0028853dac8cd628bf360af0f");
        } else if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.b);
            this.d = savedState.c;
            this.e = savedState.d;
            this.f = savedState.e;
            this.g = savedState.f;
            this.h[0] = this.d;
            this.h[1] = this.d;
            this.h[2] = this.e;
            this.h[3] = this.e;
            this.h[4] = this.f;
            this.h[5] = this.f;
            this.h[6] = this.g;
            this.h[7] = this.g;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.meituan.android.paybase.widgets.bankcard.RoundImageView.SavedState.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfb8309649998d9d309617a0fb4c6f57", RobustBitConfig.DEFAULT_VALUE) ? (SavedState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfb8309649998d9d309617a0fb4c6f57") : new SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                Object[] objArr = {parcel, classLoader};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c8e83acaf431dc55ecc6012a9e309e8", RobustBitConfig.DEFAULT_VALUE) ? (SavedState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c8e83acaf431dc55ecc6012a9e309e8") : new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public static ChangeQuickRedirect a;
        private final Parcelable b;
        private float c;
        private float d;
        private float e;
        private float f;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState(Parcelable parcelable) {
            Object[] objArr = {parcelable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e5d5c5b68ef198077106bdf005c8ad", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e5d5c5b68ef198077106bdf005c8ad");
                return;
            }
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 0.0f;
            this.b = parcelable;
        }

        private SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73b84a10329dc48329a036b0a9b9dff3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73b84a10329dc48329a036b0a9b9dff3");
            }
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            Object[] objArr = {parcel, classLoader};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20007bd71edcf00a7f2c917aac3ffd83", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20007bd71edcf00a7f2c917aac3ffd83");
                return;
            }
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 0.0f;
            this.b = parcel.readParcelable(classLoader);
            this.c = parcel.readFloat();
            this.d = parcel.readFloat();
            this.e = parcel.readFloat();
            this.f = parcel.readFloat();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e01f00875da3197b9b31b81062b61977", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e01f00875da3197b9b31b81062b61977");
                return;
            }
            parcel.writeParcelable(this.b, i);
            parcel.writeFloat(this.c);
            parcel.writeFloat(this.d);
            parcel.writeFloat(this.e);
            parcel.writeFloat(this.f);
        }
    }
}
