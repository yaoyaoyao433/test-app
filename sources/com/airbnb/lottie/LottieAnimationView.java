package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.FloatRange;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import android.support.annotation.VisibleForTesting;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.view.View;
import com.tencent.mapsdk.internal.bw;
import java.io.StringReader;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final a a = a.Weak;
    private static final String c = LottieAnimationView.class.getSimpleName();
    public final LottieDrawable b;
    private final h<e> d;
    private final h<Throwable> e;
    private a f;
    private String g;
    @RawRes
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    @Nullable
    private k l;
    @Nullable
    private e m;

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes.dex */
    public enum a {
        None,
        Weak,
        Strong
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.d = new h<e>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // com.airbnb.lottie.h
            public final /* synthetic */ void a(e eVar) {
                LottieAnimationView.this.setComposition(eVar);
            }
        };
        this.e = new h<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.2
            @Override // com.airbnb.lottie.h
            public final /* synthetic */ void a(Throwable th) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
        };
        this.b = new LottieDrawable();
        this.i = false;
        this.j = false;
        this.k = false;
        a((AttributeSet) null);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new h<e>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // com.airbnb.lottie.h
            public final /* synthetic */ void a(e eVar) {
                LottieAnimationView.this.setComposition(eVar);
            }
        };
        this.e = new h<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.2
            @Override // com.airbnb.lottie.h
            public final /* synthetic */ void a(Throwable th) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
        };
        this.b = new LottieDrawable();
        this.i = false;
        this.j = false;
        this.k = false;
        a(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new h<e>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // com.airbnb.lottie.h
            public final /* synthetic */ void a(e eVar) {
                LottieAnimationView.this.setComposition(eVar);
            }
        };
        this.e = new h<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.2
            @Override // com.airbnb.lottie.h
            public final /* synthetic */ void a(Throwable th) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
        };
        this.b = new LottieDrawable();
        this.i = false;
        this.j = false;
        this.k = false;
        a(attributeSet);
    }

    private void a(@Nullable AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.lottie_fileName, R.attr.lottie_rawRes, R.attr.lottie_url, R.attr.lottie_autoPlay, R.attr.lottie_loop, R.attr.lottie_repeatMode, R.attr.lottie_repeatCount, R.attr.lottie_imageAssetsFolder, R.attr.lottie_progress, R.attr.lottie_enableMergePathsForKitKatAndAbove, R.attr.lottie_cacheStrategy, R.attr.lottie_colorFilter, R.attr.lottie_scale});
        this.f = a.values()[obtainStyledAttributes.getInt(10, a.ordinal())];
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(1);
            boolean hasValue2 = obtainStyledAttributes.hasValue(0);
            boolean hasValue3 = obtainStyledAttributes.hasValue(2);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use use only one at once.");
            }
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(0);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(2)) != null) {
                setAnimationFromUrl(string);
            }
        }
        if (obtainStyledAttributes.getBoolean(3, false)) {
            this.i = true;
            this.j = true;
        }
        if (obtainStyledAttributes.getBoolean(4, false)) {
            this.b.d(-1);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setRepeatMode(obtainStyledAttributes.getInt(5, 1));
        }
        if (obtainStyledAttributes.hasValue(6)) {
            setRepeatCount(obtainStyledAttributes.getInt(6, -1));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(7));
        setProgress(obtainStyledAttributes.getFloat(8, 0.0f));
        a(obtainStyledAttributes.getBoolean(9, false));
        if (obtainStyledAttributes.hasValue(11)) {
            a(new com.airbnb.lottie.model.e("**"), i.x, new com.airbnb.lottie.value.c(new n(obtainStyledAttributes.getColor(11, 0))));
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.b.d(obtainStyledAttributes.getFloat(12, 1.0f));
        }
        obtainStyledAttributes.recycle();
        j();
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        g();
        h();
        super.setImageResource(i);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        a(drawable, true);
    }

    private void a(Drawable drawable, boolean z) {
        if (z && drawable != this.b) {
            g();
        }
        h();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        g();
        h();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        if (getDrawable() == this.b) {
            super.invalidateDrawable(this.b);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.g;
        savedState.b = this.h;
        savedState.c = this.b.b.b();
        savedState.d = this.b.b.isRunning();
        savedState.e = this.b.f;
        savedState.f = this.b.b.getRepeatMode();
        savedState.g = this.b.b.getRepeatCount();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.g = savedState.a;
        if (!TextUtils.isEmpty(this.g)) {
            setAnimation(this.g);
        }
        this.h = savedState.b;
        if (this.h != 0) {
            setAnimation(this.h);
        }
        setProgress(savedState.c);
        if (savedState.d) {
            a();
        }
        this.b.f = savedState.e;
        setRepeatMode(savedState.f);
        setRepeatCount(savedState.g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j && this.i) {
            a();
        }
    }

    @VisibleForTesting
    private void g() {
        if (this.b != null) {
            this.b.a();
        }
    }

    public final void a(boolean z) {
        this.b.a(z);
    }

    public final void b(boolean z) {
        if (this.k == z) {
            return;
        }
        this.k = z;
        j();
    }

    public boolean getUseHardwareAcceleration() {
        return this.k;
    }

    public void setAnimation(@RawRes final int i) {
        this.h = i;
        this.g = null;
        e a2 = com.airbnb.lottie.model.g.a().a(Integer.toString(i));
        if (a2 != null) {
            setComposition(a2);
            return;
        }
        i();
        h();
        this.l = f.a(getContext(), i).a(new h<e>() { // from class: com.airbnb.lottie.LottieAnimationView.3
            @Override // com.airbnb.lottie.h
            public final /* synthetic */ void a(e eVar) {
                com.airbnb.lottie.model.g.a().a(Integer.toString(i), eVar);
            }
        }).a(this.d).c(this.e);
    }

    public void setAnimation(final String str) {
        this.g = str;
        this.h = 0;
        e a2 = com.airbnb.lottie.model.g.a().a(str);
        if (a2 != null) {
            setComposition(a2);
            return;
        }
        i();
        h();
        this.l = f.b(getContext(), str).a(new h<e>() { // from class: com.airbnb.lottie.LottieAnimationView.4
            @Override // com.airbnb.lottie.h
            public final /* bridge */ /* synthetic */ void a(e eVar) {
                com.airbnb.lottie.model.g.a().a(str, eVar);
            }
        }).a(this.d).c(this.e);
    }

    @Deprecated
    public void setAnimation(JSONObject jSONObject) {
        setAnimation(new JsonReader(new StringReader(jSONObject.toString())));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        a(str, (String) null);
    }

    public final void a(String str, @Nullable String str2) {
        a(new JsonReader(new StringReader(str)), str2);
    }

    @Deprecated
    public void setAnimation(JsonReader jsonReader) {
        a(jsonReader, (String) null);
    }

    private void a(JsonReader jsonReader, @Nullable String str) {
        i();
        h();
        this.l = f.a(jsonReader, str).a(this.d).c(this.e);
    }

    public void setAnimationFromUrl(String str) {
        i();
        h();
        this.l = f.a(getContext(), str).a(this.d).c(this.e);
    }

    private void h() {
        if (this.l != null) {
            this.l.b(this.d);
            this.l.d(this.e);
        }
    }

    public void setComposition(@NonNull e eVar) {
        if (d.a) {
            new StringBuilder("Set Composition \n").append(eVar);
        }
        this.b.setCallback(this);
        this.m = eVar;
        boolean a2 = this.b.a(eVar);
        j();
        if (getDrawable() != this.b || a2) {
            setImageDrawable(null);
            setImageDrawable(this.b);
            requestLayout();
        }
    }

    @Nullable
    public e getComposition() {
        return this.m;
    }

    @MainThread
    public final void a() {
        this.b.c();
        j();
    }

    @MainThread
    public final void b() {
        this.b.d();
        j();
    }

    public void setMinFrame(int i) {
        this.b.a(i);
    }

    public float getMinFrame() {
        return this.b.b.i();
    }

    public void setMinProgress(float f) {
        this.b.a(f);
    }

    public void setMaxFrame(int i) {
        this.b.b(i);
    }

    public float getMaxFrame() {
        return this.b.b.j();
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.b.b(f);
    }

    public final void a(int i, int i2) {
        this.b.a(i, i2);
    }

    public void setSpeed(float f) {
        this.b.b.b = f;
    }

    public float getSpeed() {
        return this.b.b.b;
    }

    public final void a(Animator.AnimatorListener animatorListener) {
        this.b.b.addListener(animatorListener);
    }

    public final void b(Animator.AnimatorListener animatorListener) {
        this.b.b.removeListener(animatorListener);
    }

    public final void c() {
        this.b.b.removeAllListeners();
    }

    @Deprecated
    public final void c(boolean z) {
        this.b.d(z ? -1 : 0);
    }

    public void setRepeatMode(int i) {
        this.b.b.setRepeatMode(i);
    }

    public int getRepeatMode() {
        return this.b.b.getRepeatMode();
    }

    public void setRepeatCount(int i) {
        this.b.d(i);
    }

    public int getRepeatCount() {
        return this.b.b.getRepeatCount();
    }

    public final boolean d() {
        return this.b.b.isRunning();
    }

    public void setImageAssetsFolder(String str) {
        this.b.f = str;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.b.f;
    }

    public void setImageAssetDelegate(c cVar) {
        LottieDrawable lottieDrawable = this.b;
        lottieDrawable.g = cVar;
        if (lottieDrawable.e != null) {
            lottieDrawable.e.b = cVar;
        }
    }

    public void setFontAssetDelegate(b bVar) {
        LottieDrawable lottieDrawable = this.b;
        lottieDrawable.i = bVar;
        if (lottieDrawable.h != null) {
            lottieDrawable.h.e = bVar;
        }
    }

    public void setTextDelegate(o oVar) {
        this.b.j = oVar;
    }

    public final <T> void a(com.airbnb.lottie.model.e eVar, T t, com.airbnb.lottie.value.c<T> cVar) {
        this.b.a(eVar, t, cVar);
    }

    public void setScale(float f) {
        this.b.d(f);
        if (getDrawable() == this.b) {
            a((Drawable) null, false);
            a((Drawable) this.b, false);
        }
    }

    public float getScale() {
        return this.b.c;
    }

    @MainThread
    public final void e() {
        this.b.f();
        j();
    }

    @MainThread
    public final void f() {
        LottieDrawable lottieDrawable = this.b;
        lottieDrawable.d.clear();
        lottieDrawable.b.g();
        j();
    }

    public void setFrame(int i) {
        this.b.c(i);
    }

    public int getFrame() {
        return (int) this.b.b.d;
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.b.c(f);
    }

    @FloatRange(from = 0.0d, to = bw.a)
    public float getProgress() {
        return this.b.b.b();
    }

    public long getDuration() {
        if (this.m != null) {
            return this.m.a();
        }
        return 0L;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        LottieDrawable lottieDrawable = this.b;
        lottieDrawable.l = z;
        if (lottieDrawable.a != null) {
            lottieDrawable.a.a(z);
        }
    }

    @Nullable
    public m getPerformanceTracker() {
        LottieDrawable lottieDrawable = this.b;
        if (lottieDrawable.a != null) {
            return lottieDrawable.a.a;
        }
        return null;
    }

    private void i() {
        this.m = null;
        this.b.b();
    }

    private void j() {
        setLayerType(this.k && this.b.b.isRunning() ? 2 : 1, null);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.airbnb.lottie.LottieAnimationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        String a;
        int b;
        float c;
        boolean d;
        String e;
        int f;
        int g;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
            this.c = parcel.readFloat();
            this.d = parcel.readInt() == 1;
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        if (this.b.b.isRunning()) {
            e();
            this.i = true;
        }
        g();
        super.onDetachedFromWindow();
    }
}
