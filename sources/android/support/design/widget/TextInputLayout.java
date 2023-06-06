package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.annotation.VisibleForTesting;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.Space;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.aw;
import android.support.v7.widget.x;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    private boolean A;
    private Drawable B;
    private Drawable C;
    private ColorStateList D;
    private boolean E;
    private PorterDuff.Mode F;
    private boolean G;
    private ColorStateList H;
    private ColorStateList I;
    private boolean J;
    private boolean K;
    private ValueAnimator L;
    private boolean M;
    private boolean N;
    private boolean O;
    EditText a;
    TextView b;
    boolean c;
    final d d;
    private final FrameLayout e;
    private CharSequence f;
    private boolean g;
    private CharSequence h;
    private Paint i;
    private final Rect j;
    private LinearLayout k;
    private int l;
    private Typeface m;
    private boolean n;
    private int o;
    private boolean p;
    private CharSequence q;
    private TextView r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private Drawable x;
    private CharSequence y;
    private CheckableImageButton z;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.j = new Rect();
        this.d = new d(this);
        n.a(context);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.e = new FrameLayout(context);
        this.e.setAddStatesFromChildren(true);
        addView(this.e);
        this.d.a(a.b);
        d dVar = this.d;
        dVar.j = new AccelerateInterpolator();
        dVar.b();
        this.d.b(8388659);
        aw a = aw.a(context, attributeSet, new int[]{16842906, 16843088, R.attr.hintTextAppearance, R.attr.hintEnabled, R.attr.errorEnabled, R.attr.errorTextAppearance, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterTextAppearance, R.attr.counterOverflowTextAppearance, R.attr.hintAnimationEnabled, R.attr.passwordToggleEnabled, R.attr.passwordToggleDrawable, R.attr.passwordToggleContentDescription, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode}, i, 2131559089);
        this.g = a.a(3, true);
        setHint(a.c(1));
        this.K = a.a(10, true);
        if (a.f(0)) {
            ColorStateList e = a.e(0);
            this.I = e;
            this.H = e;
        }
        if (a.g(2, -1) != -1) {
            setHintTextAppearance(a.g(2, 0));
        }
        this.o = a.g(5, 0);
        boolean a2 = a.a(4, false);
        boolean a3 = a.a(6, false);
        setCounterMaxLength(a.a(7, -1));
        this.t = a.g(8, 0);
        this.u = a.g(9, 0);
        this.w = a.a(11, false);
        this.x = a.a(12);
        this.y = a.c(13);
        if (a.f(14)) {
            this.E = true;
            this.D = a.e(14);
        }
        if (a.f(15)) {
            this.G = true;
            this.F = q.a(a.a(15, -1), null);
        }
        a.a.recycle();
        setErrorEnabled(a2);
        setCounterEnabled(a3);
        h();
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setAccessibilityDelegate(this, new TextInputAccessibilityDelegate());
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.e.addView(view, layoutParams2);
            this.e.setLayoutParams(layoutParams);
            a();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if ((this.m == null || this.m.equals(typeface)) && (this.m != null || typeface == null)) {
            return;
        }
        this.m = typeface;
        this.d.a(typeface);
        if (this.r != null) {
            this.r.setTypeface(typeface);
        }
        if (this.b != null) {
            this.b.setTypeface(typeface);
        }
    }

    @NonNull
    public Typeface getTypeface() {
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f == null || this.a == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        CharSequence hint = this.a.getHint();
        this.a.setHint(this.f);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.a.setHint(hint);
        }
    }

    private void setEditText(EditText editText) {
        if (this.a != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        this.a = editText;
        if (!f()) {
            this.d.a(this.a.getTypeface());
        }
        d dVar = this.d;
        float textSize = this.a.getTextSize();
        if (dVar.d != textSize) {
            dVar.d = textSize;
            dVar.b();
        }
        int gravity = this.a.getGravity();
        this.d.b((gravity & (-113)) | 48);
        this.d.a(gravity);
        this.a.addTextChangedListener(new TextWatcher() { // from class: android.support.design.widget.TextInputLayout.1
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                TextInputLayout.this.a(!TextInputLayout.this.O, false);
                if (TextInputLayout.this.c) {
                    TextInputLayout.this.a(editable.length());
                }
            }
        });
        if (this.H == null) {
            this.H = this.a.getHintTextColors();
        }
        if (this.g && TextUtils.isEmpty(this.h)) {
            this.f = this.a.getHint();
            setHint(this.f);
            this.a.setHint((CharSequence) null);
        }
        if (this.r != null) {
            a(this.a.getText().length());
        }
        if (this.k != null) {
            b();
        }
        e();
        a(false, true);
    }

    private void a() {
        int i;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
        if (this.g) {
            if (this.i == null) {
                this.i = new Paint();
            }
            this.i.setTypeface(this.d.a());
            this.i.setTextSize(this.d.e);
            i = (int) (-this.i.ascent());
        } else {
            i = 0;
        }
        if (i != layoutParams.topMargin) {
            layoutParams.topMargin = i;
            this.e.requestLayout();
        }
    }

    final void a(boolean z, boolean z2) {
        boolean isEnabled = isEnabled();
        boolean z3 = (this.a == null || TextUtils.isEmpty(this.a.getText())) ? false : true;
        boolean a = a(getDrawableState(), 16842908);
        boolean isEmpty = true ^ TextUtils.isEmpty(getError());
        if (this.H != null) {
            this.d.b(this.H);
        }
        if (isEnabled && this.v && this.r != null) {
            this.d.a(this.r.getTextColors());
        } else if (isEnabled && a && this.I != null) {
            this.d.a(this.I);
        } else if (this.H != null) {
            this.d.a(this.H);
        }
        if (z3 || (isEnabled() && (a || isEmpty))) {
            if (z2 || this.J) {
                b(z);
            }
        } else if (z2 || !this.J) {
            c(z);
        }
    }

    @Nullable
    public EditText getEditText() {
        return this.a;
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.g) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        this.h = charSequence;
        this.d.a(charSequence);
    }

    @Nullable
    public CharSequence getHint() {
        if (this.g) {
            return this.h;
        }
        return null;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.g) {
            this.g = z;
            CharSequence hint = this.a.getHint();
            if (!this.g) {
                if (!TextUtils.isEmpty(this.h) && TextUtils.isEmpty(hint)) {
                    this.a.setHint(this.h);
                }
                setHintInternal(null);
            } else if (!TextUtils.isEmpty(hint)) {
                if (TextUtils.isEmpty(this.h)) {
                    setHint(hint);
                }
                this.a.setHint((CharSequence) null);
            }
            if (this.a != null) {
                a();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i) {
        this.d.c(i);
        this.I = this.d.f;
        if (this.a != null) {
            a(false, false);
            a();
        }
    }

    private void a(TextView textView, int i) {
        if (this.k == null) {
            this.k = new LinearLayout(getContext());
            this.k.setOrientation(0);
            addView(this.k, -1, -2);
            this.k.addView(new Space(getContext()), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.a != null) {
                b();
            }
        }
        this.k.setVisibility(0);
        this.k.addView(textView, i);
        this.l++;
    }

    private void b() {
        ViewCompat.setPaddingRelative(this.k, ViewCompat.getPaddingStart(this.a), 0, ViewCompat.getPaddingEnd(this.a), this.a.getPaddingBottom());
    }

    private void a(TextView textView) {
        if (this.k != null) {
            this.k.removeView(textView);
            int i = this.l - 1;
            this.l = i;
            if (i == 0) {
                this.k.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r5.b.getTextColors().getDefaultColor() == (-65281)) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setErrorEnabled(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.n
            if (r0 == r6) goto L8d
            android.widget.TextView r0 = r5.b
            if (r0 == 0) goto L11
            android.widget.TextView r0 = r5.b
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L11:
            r0 = 0
            if (r6 == 0) goto L7e
            android.support.v7.widget.AppCompatTextView r1 = new android.support.v7.widget.AppCompatTextView
            android.content.Context r2 = r5.getContext()
            r1.<init>(r2)
            r5.b = r1
            android.widget.TextView r1 = r5.b
            r2 = 2131689632(0x7f0f00a0, float:1.9008285E38)
            r1.setId(r2)
            android.graphics.Typeface r1 = r5.m
            if (r1 == 0) goto L32
            android.widget.TextView r1 = r5.b
            android.graphics.Typeface r2 = r5.m
            r1.setTypeface(r2)
        L32:
            r1 = 1
            android.widget.TextView r2 = r5.b     // Catch: java.lang.Exception -> L52
            int r3 = r5.o     // Catch: java.lang.Exception -> L52
            android.support.v4.widget.TextViewCompat.setTextAppearance(r2, r3)     // Catch: java.lang.Exception -> L52
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L52
            r3 = 23
            if (r2 < r3) goto L50
            android.widget.TextView r2 = r5.b     // Catch: java.lang.Exception -> L52
            android.content.res.ColorStateList r2 = r2.getTextColors()     // Catch: java.lang.Exception -> L52
            int r2 = r2.getDefaultColor()     // Catch: java.lang.Exception -> L52
            r3 = -65281(0xffffffffffff00ff, float:NaN)
            if (r2 != r3) goto L50
            goto L52
        L50:
            r2 = 0
            goto L53
        L52:
            r2 = 1
        L53:
            if (r2 == 0) goto L6d
            android.widget.TextView r2 = r5.b
            r3 = 2131558844(0x7f0d01bc, float:1.8743015E38)
            android.support.v4.widget.TextViewCompat.setTextAppearance(r2, r3)
            android.widget.TextView r2 = r5.b
            android.content.Context r3 = r5.getContext()
            r4 = 2131427642(0x7f0b013a, float:1.8476906E38)
            int r3 = android.support.v4.content.ContextCompat.getColor(r3, r4)
            r2.setTextColor(r3)
        L6d:
            android.widget.TextView r2 = r5.b
            r3 = 4
            r2.setVisibility(r3)
            android.widget.TextView r2 = r5.b
            android.support.v4.view.ViewCompat.setAccessibilityLiveRegion(r2, r1)
            android.widget.TextView r1 = r5.b
            r5.a(r1, r0)
            goto L8b
        L7e:
            r5.p = r0
            r5.c()
            android.widget.TextView r0 = r5.b
            r5.a(r0)
            r0 = 0
            r5.b = r0
        L8b:
            r5.n = r6
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setErrorEnabled(boolean):void");
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        this.o = i;
        if (this.b != null) {
            TextViewCompat.setTextAppearance(this.b, i);
        }
    }

    public void setError(@Nullable final CharSequence charSequence) {
        boolean z = ViewCompat.isLaidOut(this) && isEnabled() && (this.b == null || !TextUtils.equals(this.b.getText(), charSequence));
        this.q = charSequence;
        if (!this.n) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        this.p = true ^ TextUtils.isEmpty(charSequence);
        this.b.animate().cancel();
        if (this.p) {
            this.b.setText(charSequence);
            this.b.setVisibility(0);
            if (z) {
                if (this.b.getAlpha() == 1.0f) {
                    this.b.setAlpha(0.0f);
                }
                this.b.animate().alpha(1.0f).setDuration(200L).setInterpolator(a.d).setListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.TextInputLayout.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        TextInputLayout.this.b.setVisibility(0);
                    }
                }).start();
            } else {
                this.b.setAlpha(1.0f);
            }
        } else if (this.b.getVisibility() == 0) {
            if (z) {
                this.b.animate().alpha(0.0f).setDuration(200L).setInterpolator(a.c).setListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.TextInputLayout.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        TextInputLayout.this.b.setText(charSequence);
                        TextInputLayout.this.b.setVisibility(4);
                    }
                }).start();
            } else {
                this.b.setText(charSequence);
                this.b.setVisibility(4);
            }
        }
        c();
        a(z, false);
    }

    public void setCounterEnabled(boolean z) {
        if (this.c != z) {
            if (z) {
                this.r = new AppCompatTextView(getContext());
                this.r.setId(R.id.textinput_counter);
                if (this.m != null) {
                    this.r.setTypeface(this.m);
                }
                this.r.setMaxLines(1);
                try {
                    TextViewCompat.setTextAppearance(this.r, this.t);
                } catch (Exception unused) {
                    TextViewCompat.setTextAppearance(this.r, 2131558844);
                    this.r.setTextColor(ContextCompat.getColor(getContext(), R.color.error_color_material));
                }
                a(this.r, -1);
                if (this.a == null) {
                    a(0);
                } else {
                    a(this.a.getText().length());
                }
            } else {
                a(this.r);
                this.r = null;
            }
            this.c = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.s != i) {
            if (i > 0) {
                this.s = i;
            } else {
                this.s = -1;
            }
            if (this.c) {
                a(this.a == null ? 0 : this.a.getText().length());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    private static void a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z);
            }
        }
    }

    public int getCounterMaxLength() {
        return this.s;
    }

    final void a(int i) {
        boolean z = this.v;
        if (this.s == -1) {
            this.r.setText(String.valueOf(i));
            this.v = false;
        } else {
            this.v = i > this.s;
            if (z != this.v) {
                TextViewCompat.setTextAppearance(this.r, this.v ? this.u : this.t);
            }
            this.r.setText(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.s)));
        }
        if (this.a == null || z == this.v) {
            return;
        }
        a(false, false);
        c();
    }

    private void c() {
        Drawable background;
        if (this.a == null || (background = this.a.getBackground()) == null) {
            return;
        }
        d();
        if (x.c(background)) {
            background = background.mutate();
        }
        if (this.p && this.b != null) {
            background.setColorFilter(android.support.v7.widget.g.a(this.b.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else if (this.v && this.r != null) {
            background.setColorFilter(android.support.v7.widget.g.a(this.r.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            DrawableCompat.clearColorFilter(background);
            this.a.refreshDrawableState();
        }
    }

    private void d() {
        Drawable background;
        int i = Build.VERSION.SDK_INT;
        if ((i != 21 && i != 22) || (background = this.a.getBackground()) == null || this.M) {
            return;
        }
        Drawable newDrawable = background.getConstantState().newDrawable();
        if (background instanceof DrawableContainer) {
            this.M = f.a((DrawableContainer) background, newDrawable.getConstantState());
        }
        if (this.M) {
            return;
        }
        ViewCompat.setBackground(this.a, newDrawable);
        this.M = true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.design.widget.TextInputLayout.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        CharSequence a;
        boolean b;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.b = parcel.readInt() == 1;
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.a, parcel, i);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.a) + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.p) {
            savedState.a = getError();
        }
        savedState.b = this.A;
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
        setError(savedState.a);
        if (savedState.b) {
            a(true);
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.O = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.O = false;
    }

    @Nullable
    public CharSequence getError() {
        if (this.n) {
            return this.q;
        }
        return null;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.K = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.g) {
            this.d.a(canvas);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        e();
        super.onMeasure(i, i2);
    }

    private void e() {
        if (this.a == null) {
            return;
        }
        if (g()) {
            if (this.z == null) {
                this.z = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_password_icon, (ViewGroup) this.e, false);
                this.z.setImageDrawable(this.x);
                this.z.setContentDescription(this.y);
                this.e.addView(this.z);
                this.z.setOnClickListener(new View.OnClickListener() { // from class: android.support.design.widget.TextInputLayout.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TextInputLayout.this.a(false);
                    }
                });
            }
            if (this.a != null && ViewCompat.getMinimumHeight(this.a) <= 0) {
                this.a.setMinimumHeight(ViewCompat.getMinimumHeight(this.z));
            }
            this.z.setVisibility(0);
            this.z.setChecked(this.A);
            if (this.B == null) {
                this.B = new ColorDrawable();
            }
            this.B.setBounds(0, 0, this.z.getMeasuredWidth(), 1);
            Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this.a);
            if (compoundDrawablesRelative[2] != this.B) {
                this.C = compoundDrawablesRelative[2];
            }
            TextViewCompat.setCompoundDrawablesRelative(this.a, compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.B, compoundDrawablesRelative[3]);
            this.z.setPadding(this.a.getPaddingLeft(), this.a.getPaddingTop(), this.a.getPaddingRight(), this.a.getPaddingBottom());
            return;
        }
        if (this.z != null && this.z.getVisibility() == 0) {
            this.z.setVisibility(8);
        }
        if (this.B != null) {
            Drawable[] compoundDrawablesRelative2 = TextViewCompat.getCompoundDrawablesRelative(this.a);
            if (compoundDrawablesRelative2[2] == this.B) {
                TextViewCompat.setCompoundDrawablesRelative(this.a, compoundDrawablesRelative2[0], compoundDrawablesRelative2[1], this.C, compoundDrawablesRelative2[3]);
                this.B = null;
            }
        }
    }

    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? android.support.v7.content.res.b.b(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.x = drawable;
        if (this.z != null) {
            this.z.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(@StringRes int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.y = charSequence;
        if (this.z != null) {
            this.z.setContentDescription(charSequence);
        }
    }

    @Nullable
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.x;
    }

    @Nullable
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.y;
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (this.w != z) {
            this.w = z;
            if (!z && this.A && this.a != null) {
                this.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.A = false;
            e();
        }
    }

    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.D = colorStateList;
        this.E = true;
        h();
    }

    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.F = mode;
        this.G = true;
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.w) {
            int selectionEnd = this.a.getSelectionEnd();
            if (f()) {
                this.a.setTransformationMethod(null);
                this.A = true;
            } else {
                this.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.A = false;
            }
            this.z.setChecked(this.A);
            if (z) {
                this.z.jumpDrawablesToCurrentState();
            }
            this.a.setSelection(selectionEnd);
        }
    }

    private boolean f() {
        return this.a != null && (this.a.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private boolean g() {
        if (this.w) {
            return f() || this.A;
        }
        return false;
    }

    private void h() {
        if (this.x != null) {
            if (this.E || this.G) {
                this.x = DrawableCompat.wrap(this.x).mutate();
                if (this.E) {
                    DrawableCompat.setTintList(this.x, this.D);
                }
                if (this.G) {
                    DrawableCompat.setTintMode(this.x, this.F);
                }
                if (this.z == null || this.z.getDrawable() == this.x) {
                    return;
                }
                this.z.setImageDrawable(this.x);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.g || this.a == null) {
            return;
        }
        Rect rect = this.j;
        o.a(this, this.a, rect);
        int compoundPaddingLeft = rect.left + this.a.getCompoundPaddingLeft();
        int compoundPaddingRight = rect.right - this.a.getCompoundPaddingRight();
        this.d.a(compoundPaddingLeft, rect.top + this.a.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.a.getCompoundPaddingBottom());
        this.d.b(compoundPaddingLeft, getPaddingTop(), compoundPaddingRight, (i4 - i2) - getPaddingBottom());
        this.d.b();
    }

    private void b(boolean z) {
        if (this.L != null && this.L.isRunning()) {
            this.L.cancel();
        }
        if (z && this.K) {
            a(1.0f);
        } else {
            this.d.a(1.0f);
        }
        this.J = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.N) {
            return;
        }
        boolean z = true;
        this.N = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        a((ViewCompat.isLaidOut(this) && isEnabled()) ? false : false, false);
        c();
        if (this.d != null ? this.d.a(drawableState) | false : false) {
            invalidate();
        }
        this.N = false;
    }

    private void c(boolean z) {
        if (this.L != null && this.L.isRunning()) {
            this.L.cancel();
        }
        if (z && this.K) {
            a(0.0f);
        } else {
            this.d.a(0.0f);
        }
        this.J = true;
    }

    @VisibleForTesting
    private void a(float f) {
        if (this.d.a == f) {
            return;
        }
        if (this.L == null) {
            this.L = new ValueAnimator();
            this.L.setInterpolator(a.a);
            this.L.setDuration(200L);
            this.L.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.widget.TextInputLayout.5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TextInputLayout.this.d.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
        }
        this.L.setFloatValues(this.d.a, f);
        this.L.start();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class TextInputAccessibilityDelegate extends AccessibilityDelegateCompat {
        TextInputAccessibilityDelegate() {
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(TextInputLayout.class.getSimpleName());
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            CharSequence charSequence = TextInputLayout.this.d.i;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            accessibilityEvent.getText().add(charSequence);
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(TextInputLayout.class.getSimpleName());
            CharSequence charSequence = TextInputLayout.this.d.i;
            if (!TextUtils.isEmpty(charSequence)) {
                accessibilityNodeInfoCompat.setText(charSequence);
            }
            if (TextInputLayout.this.a != null) {
                accessibilityNodeInfoCompat.setLabelFor(TextInputLayout.this.a);
            }
            CharSequence text = TextInputLayout.this.b != null ? TextInputLayout.this.b.getText() : null;
            if (TextUtils.isEmpty(text)) {
                return;
            }
            accessibilityNodeInfoCompat.setContentInvalid(true);
            accessibilityNodeInfoCompat.setError(text);
        }
    }

    private static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == 16842908) {
                return true;
            }
        }
        return false;
    }
}
