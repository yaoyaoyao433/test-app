package com.meituan.android.paybase.widgets.password;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SafePasswordView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private static final float[] i = {-14.0f, 28.0f, -19.0f, 10.0f, -8.0f, 6.0f, -3.0f};
    private static final float[] j = {0.0f, -0.25f, 0.25f, -0.08928572f, 0.08928572f, -0.05357143f, 0.05357143f};
    private b b;
    private LinkedList<String> c;
    private ImageView[] d;
    private ImageView[] e;
    private ValueAnimator[] f;
    private AnimatorSet g;
    private a h;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void l();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a(String str, boolean z);
    }

    public SafePasswordView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "409715f0eff0af8c261057458204b976", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "409715f0eff0af8c261057458204b976");
        } else {
            e();
        }
    }

    public SafePasswordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fe07d18f54941273cbd60e2dd65c61d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fe07d18f54941273cbd60e2dd65c61d");
        } else {
            e();
        }
    }

    public SafePasswordView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a737dffa184f81e52e739c3fb0598ebb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a737dffa184f81e52e739c3fb0598ebb");
        } else {
            e();
        }
    }

    @MTPaySuppressFBWarnings({"SF_SWITCH_NO_DEFAULT"})
    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0b47214636c47474de0bbbed56322d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0b47214636c47474de0bbbed56322d3");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.paybase__safe_password, this);
        this.c = new LinkedList<>();
        this.d = new ImageView[6];
        this.d[0] = (ImageView) findViewById(R.id.password0);
        this.d[1] = (ImageView) findViewById(R.id.password1);
        this.d[2] = (ImageView) findViewById(R.id.password2);
        this.d[3] = (ImageView) findViewById(R.id.password3);
        this.d[4] = (ImageView) findViewById(R.id.password4);
        this.d[5] = (ImageView) findViewById(R.id.password5);
        this.e = new ImageView[6];
        this.e[0] = (ImageView) findViewById(R.id.password0_dot);
        this.e[1] = (ImageView) findViewById(R.id.password1_dot);
        this.e[2] = (ImageView) findViewById(R.id.password2_dot);
        this.e[3] = (ImageView) findViewById(R.id.password3_dot);
        this.e[4] = (ImageView) findViewById(R.id.password4_dot);
        this.e[5] = (ImageView) findViewById(R.id.password5_dot);
        this.f = new ValueAnimator[7];
        for (int i2 = 0; i2 < 7; i2++) {
            this.f[i2] = ValueAnimator.ofFloat(0.0f, 1.0f);
            switch (i2) {
                case 0:
                case 1:
                    this.f[i2].setDuration(100L);
                    break;
                case 2:
                case 3:
                    this.f[i2].setDuration(60L);
                    break;
                case 4:
                case 5:
                    this.f[i2].setDuration(40L);
                    break;
                case 6:
                    this.f[i2].setDuration(20L);
                    break;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    @MTPaySuppressFBWarnings
    public void onMeasure(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05bcae36bf6e4932a15b804a86014406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05bcae36bf6e4932a15b804a86014406");
            return;
        }
        int size = (int) ((((View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight()) * 0.15d) + 0.5d);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).getLayoutParams().height = size;
        }
        super.onMeasure(i2, makeMeasureSpec);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e79f90692c151d5b7851af965171ee7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e79f90692c151d5b7851af965171ee7");
            return;
        }
        super.onLayout(z, i2, i3, i4, i5);
        for (int i6 = 0; i6 < 7; i6++) {
            this.f[i6].addUpdateListener(com.meituan.android.paybase.widgets.password.a.a(this, i6));
        }
    }

    public static /* synthetic */ void a(SafePasswordView safePasswordView, int i2, ValueAnimator valueAnimator) {
        float f;
        Object[] objArr = {safePasswordView, Integer.valueOf(i2), valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6570e53eb689eee93be947a23b1d6dc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6570e53eb689eee93be947a23b1d6dc8");
            return;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float width = safePasswordView.d[0].getWidth();
        if (i2 == 0) {
            f = ((width * floatValue) * i[i2]) / 56.0f;
        } else {
            f = (width * j[i2]) + (((floatValue * width) * i[i2]) / 56.0f);
        }
        for (int i3 = 0; i3 < 6; i3++) {
            safePasswordView.e[i3].setTranslationX(f);
        }
    }

    public b getListener() {
        return this.b;
    }

    public void setListener(b bVar) {
        this.b = bVar;
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab99b3c436c9378265c6745b3f1ea2a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab99b3c436c9378265c6745b3f1ea2a8")).booleanValue();
        }
        if (this.c.size() >= 6) {
            return false;
        }
        this.c.addLast(str);
        f();
        return true;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "988d3f15464456d597c401bf94b8bf03", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "988d3f15464456d597c401bf94b8bf03")).booleanValue();
        }
        if (this.c.size() <= 0) {
            return false;
        }
        this.c.removeLast();
        f();
        return true;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9955662708481ea7e264a10bce9386b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9955662708481ea7e264a10bce9386b");
            return;
        }
        this.c.clear();
        f();
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd695a5268b2aa6b8f9ccc6332ef0ae3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd695a5268b2aa6b8f9ccc6332ef0ae3");
            return;
        }
        g();
        h();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6465c2dd4cd18fb2c5fca2a2669d5f7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6465c2dd4cd18fb2c5fca2a2669d5f7e");
            return;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            if (i2 < this.c.size()) {
                this.e[i2].setVisibility(0);
            } else {
                this.e[i2].setVisibility(8);
            }
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9afe102655e1912a79c39b2e22d73c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9afe102655e1912a79c39b2e22d73c2");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            stringBuffer.append(this.c.get(i2));
        }
        if (this.b != null) {
            postDelayed(com.meituan.android.paybase.widgets.password.b.a(this, stringBuffer), 1L);
        }
    }

    public static /* synthetic */ void a(SafePasswordView safePasswordView, StringBuffer stringBuffer) {
        Object[] objArr = {safePasswordView, stringBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92f3724f1b42d938e3d9ace54e67cdab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92f3724f1b42d938e3d9ace54e67cdab");
        } else {
            safePasswordView.b.a(stringBuffer.toString(), stringBuffer.length() >= 6);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa62d3b56bf5b6005e28690430ba89c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa62d3b56bf5b6005e28690430ba89c");
        } else if (this.c.size() == 6) {
            this.g = new AnimatorSet();
            this.g.playSequentially(this.f);
            this.g.addListener(new Animator.AnimatorListener() { // from class: com.meituan.android.paybase.widgets.password.SafePasswordView.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf554bbacbf6cc3945caf35afe88b141", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf554bbacbf6cc3945caf35afe88b141");
                    } else if (SafePasswordView.this.h != null) {
                        SafePasswordView.this.h.l();
                    }
                }
            });
            this.g.start();
        }
    }

    public void setOnAnimationFinish(a aVar) {
        this.h = aVar;
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd628496b74cdd7299ea79b88287b29", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd628496b74cdd7299ea79b88287b29")).booleanValue() : this.g != null && this.g.isRunning();
    }
}
