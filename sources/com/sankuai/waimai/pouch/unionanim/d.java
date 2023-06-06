package com.sankuai.waimai.pouch.unionanim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.support.annotation.NonNull;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    ArrayList<a> b;
    private ArrayMap<View, f> c;
    private AnimatorSet d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(@NonNull d dVar);

        void b(@NonNull d dVar);

        void c(@NonNull d dVar);
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f81d1248f2fbc64d199ee26b4c88480", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f81d1248f2fbc64d199ee26b4c88480");
            return;
        }
        this.c = new ArrayMap<>();
        this.b = null;
        this.d = new AnimatorSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.animation.Animator] */
    public final void a() {
        ValueAnimator valueAnimator;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e9c339306a5e4bd587db865af4d69e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e9c339306a5e4bd587db865af4d69e0");
        } else if (this.d.isRunning()) {
        } else {
            int size = this.c.size();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < size) {
                final View keyAt = this.c.keyAt(i);
                final f valueAt = this.c.valueAt(i);
                if (keyAt != null && valueAt != null) {
                    Object[] objArr2 = new Object[2];
                    objArr2[c] = keyAt;
                    objArr2[1] = valueAt;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "989101a2581d9b46ae99a95320368cca", RobustBitConfig.DEFAULT_VALUE)) {
                        valueAnimator = (Animator) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "989101a2581d9b46ae99a95320368cca");
                    } else {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setDuration(valueAt.j);
                        long j = valueAt.k;
                        if (j != 0) {
                            ofFloat.setStartDelay(j);
                        }
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.pouch.unionanim.d.2
                            public static ChangeQuickRedirect a;
                            private float e;
                            private float f;
                            private float g;
                            private float h;
                            private float i;

                            {
                                int[] iArr = new int[2];
                                keyAt.getLocationOnScreen(iArr);
                                if (f.a(valueAt.e) && keyAt.getWidth() != 0) {
                                    this.e = valueAt.e / keyAt.getWidth();
                                }
                                if (f.a(valueAt.d) && keyAt.getHeight() != 0) {
                                    this.f = valueAt.d / keyAt.getHeight();
                                }
                                float width = f.a(valueAt.e) ? (valueAt.e - keyAt.getWidth()) / 2.0f : 0.0f;
                                if (f.a(valueAt.h)) {
                                    this.g = (valueAt.h - iArr[0]) + width;
                                }
                                if (f.a(valueAt.i)) {
                                    this.h = (valueAt.i - iArr[1]) + width;
                                }
                                this.i = valueAt.b;
                                if (f.a(this.i)) {
                                    return;
                                }
                                this.i = keyAt.getAlpha();
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                Object[] objArr3 = {valueAnimator2};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "08631c171b979f0461f6a85e9bd56635", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "08631c171b979f0461f6a85e9bd56635");
                                    return;
                                }
                                float f = valueAt.c;
                                if (f.a(f)) {
                                    keyAt.setAlpha((((Float) valueAnimator2.getAnimatedValue()).floatValue() * (f - this.i)) + this.i);
                                }
                                float[] fArr = valueAt.f;
                                float[] fArr2 = valueAt.g;
                                if (fArr2 != null && fArr != null && fArr.length == fArr2.length && !Arrays.equals(fArr2, fArr) && fArr != fArr2) {
                                    ViewGroup.LayoutParams layoutParams = keyAt.getLayoutParams();
                                    if (layoutParams instanceof com.sankuai.waimai.mach.widget.d) {
                                        com.sankuai.waimai.mach.widget.d dVar = (com.sankuai.waimai.mach.widget.d) layoutParams;
                                        float[] b = dVar.b();
                                        for (int i2 = 0; i2 < fArr.length; i2++) {
                                            float f2 = fArr[i2];
                                            b[i2] = (((Float) valueAnimator2.getAnimatedValue()).floatValue() * (fArr2[i2] - f2)) + f2;
                                        }
                                        dVar.width = keyAt.getWidth();
                                        dVar.height = keyAt.getHeight();
                                        keyAt.setLayoutParams(dVar);
                                    }
                                }
                                if (f.a(valueAt.e)) {
                                    keyAt.setScaleX((((Float) valueAnimator2.getAnimatedValue()).floatValue() * (this.e - 1.0f)) + 1.0f);
                                }
                                if (f.a(valueAt.d)) {
                                    keyAt.setScaleY((((Float) valueAnimator2.getAnimatedValue()).floatValue() * (this.f - 1.0f)) + 1.0f);
                                }
                                if (f.a(valueAt.h)) {
                                    keyAt.setTranslationX(((Float) valueAnimator2.getAnimatedValue()).floatValue() * this.g);
                                }
                                if (f.a(valueAt.i)) {
                                    keyAt.setTranslationY(((Float) valueAnimator2.getAnimatedValue()).floatValue() * this.h);
                                }
                            }
                        });
                        valueAnimator = ofFloat;
                    }
                    arrayList.add(valueAnimator);
                    float f = valueAt.l;
                    if (f.a(f)) {
                        keyAt.setAlpha(f);
                    }
                }
                i++;
                c = 0;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.d.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.pouch.unionanim.d.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    Object[] objArr3 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e3fcb49d8cf129d44a41ab5c677ec059", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e3fcb49d8cf129d44a41ab5c677ec059");
                    } else if (d.this.b != null && d.this.b.size() > 0) {
                        ArrayList arrayList2 = (ArrayList) d.this.b.clone();
                        int size2 = arrayList2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((a) arrayList2.get(i2)).a(d.this);
                        }
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr3 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b9198a5ba49f9ca33f1d16d1fbcc2eda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b9198a5ba49f9ca33f1d16d1fbcc2eda");
                    } else if (d.this.b != null && d.this.b.size() > 0) {
                        ArrayList arrayList2 = (ArrayList) d.this.b.clone();
                        int size2 = arrayList2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((a) arrayList2.get(i2)).b(d.this);
                        }
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    Object[] objArr3 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e3f3c22ea6ecae3cd1a29e1e0ea9c029", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e3f3c22ea6ecae3cd1a29e1e0ea9c029");
                    } else if (d.this.b != null && d.this.b.size() > 0) {
                        ArrayList arrayList2 = (ArrayList) d.this.b.clone();
                        int size2 = arrayList2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((a) arrayList2.get(i2)).c(d.this);
                        }
                    }
                }
            });
            this.d.playTogether(arrayList);
            this.d.start();
        }
    }

    public final void a(View view, f fVar) {
        boolean z = false;
        Object[] objArr = {view, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "972d96788f6e392205361a79c6925f8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "972d96788f6e392205361a79c6925f8e");
        } else if (view != null) {
            Object[] objArr2 = {fVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48b265718cf35c201909dddadef5db5c", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48b265718cf35c201909dddadef5db5c")).booleanValue();
            } else if (!f.a(fVar.d) || !f.a(fVar.e) ? f.a(fVar.c) : !(fVar.d == 0 || fVar.e == 0)) {
                z = true;
            }
            if (z) {
                this.c.put(view, fVar);
            }
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8da5a853de731a38f88ab843b26aa2f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8da5a853de731a38f88ab843b26aa2f")).booleanValue() : this.d != null && this.d.isRunning();
    }

    @NonNull
    public final d a(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b00d0424cb41bc9f816803173b2421a", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b00d0424cb41bc9f816803173b2421a");
        }
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        this.b.add(aVar);
        return this;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3c3a3dc1096ffc44d9e40707f2ef5fe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3c3a3dc1096ffc44d9e40707f2ef5fe")).booleanValue() : this.c.size() > 0;
    }
}
