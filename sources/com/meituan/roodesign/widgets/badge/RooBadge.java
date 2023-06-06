package com.meituan.roodesign.widgets.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.PluralsRes;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.internal.c;
import com.meituan.roodesign.widgets.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class RooBadge extends Drawable {
    public static ChangeQuickRedirect a = null;
    @StyleRes
    private static final int b = 2131559091;
    @AttrRes
    private static final int c = 2130772144;
    @NonNull
    private final WeakReference<Context> d;
    @NonNull
    private final MaterialShapeDrawable e;
    @NonNull
    private final c f;
    @NonNull
    private final Rect g;
    @NonNull
    private final SavedState h;
    private float i;
    private float j;
    private int k;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface BadgeGravity {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.meituan.roodesign.widgets.badge.RooBadge.SavedState.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final /* synthetic */ SavedState createFromParcel(@NonNull Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "119b09173865de3d75d9c611c24903f7", RobustBitConfig.DEFAULT_VALUE) ? (SavedState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "119b09173865de3d75d9c611c24903f7") : new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public static ChangeQuickRedirect a;
        @ColorInt
        private int b;
        @ColorInt
        private int c;
        private int d;
        private int e;
        private int f;
        @Nullable
        private CharSequence g;
        @PluralsRes
        private int h;
        private int i;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState(@NonNull Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "751513d86b69d08ddbd454634b2d396b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "751513d86b69d08ddbd454634b2d396b");
                return;
            }
            this.d = 255;
            this.e = -1;
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readString();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d50c6b9c3f5691bfc64fdecaf65dd6e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d50c6b9c3f5691bfc64fdecaf65dd6e2");
                return;
            }
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeString(this.g.toString());
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
        }
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "631d1b2387dff46f0666dc1a89deab4d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "631d1b2387dff46f0666dc1a89deab4d")).booleanValue() : this.h.e != -1;
    }

    private int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efdb6bce0bfcf5a61e1923b5c889de6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efdb6bce0bfcf5a61e1923b5c889de6b")).intValue();
        }
        if (a()) {
            return this.h.e;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8c80273f2b3c12583031c55c9d047d1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8c80273f2b3c12583031c55c9d047d1")).intValue() : this.h.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2b166af43004f4a137ce25112a1a45e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2b166af43004f4a137ce25112a1a45e");
            return;
        }
        this.h.d = i;
        this.f.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6354f6f2e067b4c1163adb0869e083c0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6354f6f2e067b4c1163adb0869e083c0")).intValue() : this.g.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d217c165eb33f752cf7f03ad94b5c2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d217c165eb33f752cf7f03ad94b5c2")).intValue() : this.g.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        String string;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b5d9f766ec64785e1b48a6389fc3092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b5d9f766ec64785e1b48a6389fc3092");
        } else if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
        } else {
            this.e.draw(canvas);
            if (a()) {
                Object[] objArr2 = {canvas};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00ac63e4e05ce51cd43738c8aef379d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00ac63e4e05ce51cd43738c8aef379d0");
                    return;
                }
                Rect rect = new Rect();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2621b3f54d064810ed1ed1b371d7ebe6", RobustBitConfig.DEFAULT_VALUE)) {
                    string = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2621b3f54d064810ed1ed1b371d7ebe6");
                } else if (b() <= this.k) {
                    string = Integer.toString(b());
                } else {
                    Context context = this.d.get();
                    string = context == null ? "" : context.getString(R.string.roo_exceed_max_badge_number_suffix, Integer.valueOf(this.k), "+");
                }
                this.f.a.getTextBounds(string, 0, string.length(), rect);
                canvas.drawText(string, this.i, this.j + (rect.height() / 2), this.f.a);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2479b31033c152c7597e7fde3e5c15be", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2479b31033c152c7597e7fde3e5c15be")).booleanValue() : super.onStateChange(iArr);
    }
}
