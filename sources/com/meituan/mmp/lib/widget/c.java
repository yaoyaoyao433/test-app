package com.meituan.mmp.lib.widget;

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
import com.meituan.mmp.lib.utils.p;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09ded5b5ffcac7e5a30c0dd40150fe97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09ded5b5ffcac7e5a30c0dd40150fe97");
            return;
        }
        this.b = new int[]{100, 100, 100};
        this.d = new Rect();
        this.e = p.d(10);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8377509d53a5f1c6f154f295f238c424", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8377509d53a5f1c6f154f295f238c424");
            return;
        }
        if (this.f == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90df7a483b3846df330bc956d81aaa74", RobustBitConfig.DEFAULT_VALUE)) {
                arrayList = (ArrayList) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90df7a483b3846df330bc956d81aaa74");
            } else {
                ArrayList<ValueAnimator> arrayList2 = new ArrayList<>();
                int[] iArr = {300, 600, 900};
                for (final int i = 0; i < 3; i++) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(100, 255, 100);
                    ofInt.setDuration(1000L);
                    ofInt.setRepeatCount(-1);
                    ofInt.setStartDelay(iArr[i]);
                    this.g.put(ofInt, new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.mmp.lib.widget.c.1
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Object[] objArr3 = {valueAnimator};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4e1ffdc656ee6bfbbc9f2b7934bdff1b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4e1ffdc656ee6bfbbc9f2b7934bdff1b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb176884324f1c820fbeef3ee3432aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb176884324f1c820fbeef3ee3432aa");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bffbd6ac988fa94cde59e33b23194665", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bffbd6ac988fa94cde59e33b23194665");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ec3afdfd061245de272586b23cc2d2e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ec3afdfd061245de272586b23cc2d2e")).booleanValue() : b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19488bbd1e79f419bc292402a43a061d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19488bbd1e79f419bc292402a43a061d");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        int intValue = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8075881e6792d78ce5e31c67d726af57", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8075881e6792d78ce5e31c67d726af57")).intValue() : this.d.width();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        int intValue2 = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1738b57c46d55251279dd21088b9dd75", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1738b57c46d55251279dd21088b9dd75")).intValue() : this.d.height();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df49216a97c1072077f15476e2f1bf71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df49216a97c1072077f15476e2f1bf71");
        } else {
            this.c.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdcd2995cbc878b7b9984df0733d111b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdcd2995cbc878b7b9984df0733d111b");
        } else {
            this.c.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65955aa10b8d7f50a7b6553e93c81eb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65955aa10b8d7f50a7b6553e93c81eb8");
            return;
        }
        super.onBoundsChange(rect);
        this.d = new Rect(rect);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d321f324700128c0f285bc7c7dfdc31b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d321f324700128c0f285bc7c7dfdc31b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b37d22f0bf03fd2160edde7e8befcb16", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b37d22f0bf03fd2160edde7e8befcb16")).booleanValue();
        }
        if (this.f != null) {
            return this.f.get(0).isRunning();
        }
        return false;
    }
}
