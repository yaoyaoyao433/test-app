package com.meituan.msc.modules.page.widget;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.msc.common.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends Drawable implements Animatable {
    public static ChangeQuickRedirect a;
    private int[] b;
    private Paint c;
    private Rect d;
    private int e;
    private ArrayList<ValueAnimator> f;
    private Map<ValueAnimator, ValueAnimator.AnimatorUpdateListener> g;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f01578d08acaa321d1687aa08e79377d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f01578d08acaa321d1687aa08e79377d");
            return;
        }
        this.b = new int[]{100, 100, 100};
        this.d = new Rect();
        this.e = n.b(10);
        this.g = new HashMap();
        this.c = new Paint(1);
        this.c.setColor(-7829368);
        this.c.setStyle(Paint.Style.FILL);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ArrayList<ValueAnimator> arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5fe22ba9250377806691bfb945c5dd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5fe22ba9250377806691bfb945c5dd9");
            return;
        }
        if (this.f == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bde9fd795988a204366e7dbac9348032", RobustBitConfig.DEFAULT_VALUE)) {
                arrayList = (ArrayList) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bde9fd795988a204366e7dbac9348032");
            } else {
                ArrayList<ValueAnimator> arrayList2 = new ArrayList<>();
                int[] iArr = {300, 600, 900};
                for (final int i = 0; i < 3; i++) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(100, 255, 100);
                    ofInt.setDuration(1000L);
                    ofInt.setRepeatCount(-1);
                    ofInt.setStartDelay(iArr[i]);
                    this.g.put(ofInt, new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.msc.modules.page.widget.c.1
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Object[] objArr3 = {valueAnimator};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b035ba4274924a62249d286fd858a89a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b035ba4274924a62249d286fd858a89a");
                                return;
                            }
                            c.this.b[i] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            c.this.invalidateSelf();
                        }
                    });
                    arrayList2.add(ofInt);
                }
                arrayList = arrayList2;
            }
            this.f = arrayList;
        }
        if (b()) {
            return;
        }
        a();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a16f7c91139756d2efab8d3a555ad00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a16f7c91139756d2efab8d3a555ad00");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87577c1900dac8788fe1f6ebd632cf41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87577c1900dac8788fe1f6ebd632cf41");
        } else if (this.f != null) {
            Iterator<ValueAnimator> it = this.f.iterator();
            while (it.hasNext()) {
                ValueAnimator next = it.next();
                if (next != null && next.isStarted()) {
                    next.removeAllUpdateListeners();
                    next.cancel();
                }
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5faaef2c323c2df24e0d48e5e8b1478e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5faaef2c323c2df24e0d48e5e8b1478e")).booleanValue() : b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e937b2ee8b3c226c81411972b8b2510c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e937b2ee8b3c226c81411972b8b2510c");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        int intValue = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c7702e297e0f1e4531410600785fefb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c7702e297e0f1e4531410600785fefb")).intValue() : this.d.width();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        int intValue2 = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "00b4e8d468ec8dbd626bf8f7d2819a8c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "00b4e8d468ec8dbd626bf8f7d2819a8c")).intValue() : this.d.height();
        float f = this.e;
        float min = (Math.min(intValue, intValue2) - (f * 2.0f)) / 5.0f;
        float f2 = 2.0f * min;
        float f3 = ((intValue / 2) - f2) - f;
        float f4 = intValue2 / 2;
        for (int i = 0; i < 3; i++) {
            canvas.save();
            float f5 = i;
            canvas.translate((f2 * f5) + f3 + (f5 * f), f4);
            this.c.setAlpha(this.b[i]);
            canvas.drawCircle(0.0f, 0.0f, min, this.c);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@IntRange(from = 0, to = 255) int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f78d28982c5b081051b76bf20946803b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f78d28982c5b081051b76bf20946803b");
        } else {
            this.c.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99bd35f110df6db4424d4252d5b65428", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99bd35f110df6db4424d4252d5b65428");
        } else {
            this.c.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d022387c71aa99d47471eea1d3abb0be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d022387c71aa99d47471eea1d3abb0be");
            return;
        }
        super.onBoundsChange(rect);
        this.d = new Rect(rect);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46608da173d1a026bf6f4d3d67d5b881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46608da173d1a026bf6f4d3d67d5b881");
            return;
        }
        for (int i = 0; i < this.f.size(); i++) {
            ValueAnimator valueAnimator = this.f.get(i);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.g.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f228e84f577acfab5b7ffee09fcd0f04", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f228e84f577acfab5b7ffee09fcd0f04")).booleanValue();
        }
        if (this.f != null) {
            return this.f.get(0).isRunning();
        }
        return false;
    }
}
