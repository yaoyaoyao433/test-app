package com.sankuai.xm.imui.common.view.pulltorefresh.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.view.pulltorefresh.e;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public abstract class c extends FrameLayout implements com.sankuai.xm.imui.common.view.pulltorefresh.a {
    public static ChangeQuickRedirect a;
    public static final Interpolator b = new LinearInterpolator();
    protected final ImageView c;
    protected final ProgressBar d;
    protected final e.c e;
    protected final e.i f;
    private final TextView g;
    private final TextView h;
    private LinearLayout i;
    private boolean j;
    private CharSequence k;
    private CharSequence l;
    private CharSequence m;

    public abstract void a(Drawable drawable);

    public abstract void b(float f);

    public abstract void g();

    public abstract int getDefaultDrawableResId();

    public abstract void h();

    public c(Context context, e.c cVar, e.i iVar, TypedArray typedArray) {
        super(context);
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable;
        Object[] objArr = {context, cVar, iVar, typedArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0ff1ca0ba33f862667a91ca41812a6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0ff1ca0ba33f862667a91ca41812a6c");
            return;
        }
        this.e = cVar;
        this.f = iVar;
        int[] iArr = AnonymousClass1.a;
        iVar.ordinal();
        LayoutInflater.from(context).inflate(R.layout.xm_sdk_pull_to_refresh_header_vertical, this);
        this.i = (LinearLayout) findViewById(R.id.fl_inner);
        this.g = (TextView) this.i.findViewById(R.id.pull_to_refresh_text);
        this.d = (ProgressBar) this.i.findViewById(R.id.pull_to_refresh_progress);
        this.h = (TextView) this.i.findViewById(R.id.pull_to_refresh_sub_text);
        this.c = (ImageView) this.i.findViewById(R.id.pull_to_refresh_image);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i.getLayoutParams();
        if (AnonymousClass1.b[cVar.ordinal()] == 1) {
            layoutParams.gravity = iVar == e.i.VERTICAL ? 48 : 3;
        } else {
            layoutParams.gravity = iVar == e.i.VERTICAL ? 80 : 5;
        }
        if (typedArray.hasValue(1) && (drawable = typedArray.getDrawable(1)) != null) {
            Object[] objArr2 = {this, drawable};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c63715f111a6fee5b9160eefee01c066", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c63715f111a6fee5b9160eefee01c066");
            } else {
                setBackgroundDrawable(drawable);
            }
        }
        if (typedArray.hasValue(10)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(10, typedValue);
            setTextAppearance(typedValue.data);
        }
        if (typedArray.hasValue(11)) {
            TypedValue typedValue2 = new TypedValue();
            typedArray.getValue(11, typedValue2);
            setSubTextAppearance(typedValue2.data);
        }
        if (typedArray.hasValue(2) && (colorStateList2 = typedArray.getColorStateList(2)) != null) {
            setTextColor(colorStateList2);
        }
        if (typedArray.hasValue(3) && (colorStateList = typedArray.getColorStateList(3)) != null) {
            setSubTextColor(colorStateList);
        }
        Drawable drawable2 = typedArray.hasValue(6) ? typedArray.getDrawable(6) : null;
        if (AnonymousClass1.b[cVar.ordinal()] != 1) {
            if (typedArray.hasValue(7)) {
                drawable2 = typedArray.getDrawable(7);
            } else if (typedArray.hasValue(17)) {
                com.sankuai.xm.imui.common.util.d.c("PullToRefresh-LoadingLayout.warnDeprecation,You're using the deprecated ptrDrawableTop attr, please switch over to ptrDrawableStart", new Object[0]);
                drawable2 = typedArray.getDrawable(17);
            }
        } else if (typedArray.hasValue(8)) {
            drawable2 = typedArray.getDrawable(8);
        } else if (typedArray.hasValue(18)) {
            com.sankuai.xm.imui.common.util.d.c("PullToRefresh-LoadingLayout.warnDeprecation,You're using the deprecated ptrDrawableBottom attr, please switch over to ptrDrawableEnd", new Object[0]);
            drawable2 = typedArray.getDrawable(18);
        }
        if (drawable2 == null) {
            context.getResources().getDrawable(getDefaultDrawableResId());
        }
        setLoadingDrawable(null);
        e();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.imui.common.view.pulltorefresh.internal.c$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b = new int[e.c.valuesCustom().length];

        static {
            try {
                b[e.c.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[e.c.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = new int[e.i.valuesCustom().length];
            try {
                a[e.i.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final void setHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a0defd1fec8f500bc4a6408d61a04c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a0defd1fec8f500bc4a6408d61a04c");
            return;
        }
        getLayoutParams().height = i;
        requestLayout();
    }

    public final void setWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2195c7b7ee4a15a347d182e1e676e33d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2195c7b7ee4a15a347d182e1e676e33d");
            return;
        }
        getLayoutParams().width = i;
        requestLayout();
    }

    public final int getContentSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70c7433c29cb48916c402d0580df40ae", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70c7433c29cb48916c402d0580df40ae")).intValue();
        }
        int[] iArr = AnonymousClass1.a;
        this.f.ordinal();
        return this.i.getHeight();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "685f7c5460e44aa3abbf558c4d953093", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "685f7c5460e44aa3abbf558c4d953093");
            return;
        }
        if (this.g.getVisibility() == 0) {
            this.g.setVisibility(4);
        }
        if (this.d.getVisibility() == 0) {
            this.d.setVisibility(4);
        }
        if (this.c.getVisibility() == 0) {
            this.c.setVisibility(4);
        }
        if (this.h.getVisibility() == 0) {
            this.h.setVisibility(4);
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5f8b4a3b1ed6f0e656fe3628c8afcad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5f8b4a3b1ed6f0e656fe3628c8afcad");
        } else if (this.j) {
        } else {
            b(f);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37b0da0c9ff8b76c892a392f0c3c56a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37b0da0c9ff8b76c892a392f0c3c56a7");
        } else if (this.g != null) {
            this.g.setText(this.k);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cd0bb741c58d22e6abd8c740495664f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cd0bb741c58d22e6abd8c740495664f");
            return;
        }
        if (this.g != null) {
            this.g.setText(this.l);
        }
        if (this.j) {
            ((AnimationDrawable) this.c.getDrawable()).start();
        } else {
            g();
        }
        if (this.h != null) {
            this.h.setVisibility(8);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06a37d5c382d15e0f7e42b40bd6bb5cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06a37d5c382d15e0f7e42b40bd6bb5cb");
        } else if (this.g != null) {
            this.g.setText(this.m);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f28ccf9d88a8beafebf4bcd45da46563", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f28ccf9d88a8beafebf4bcd45da46563");
            return;
        }
        if (this.g != null) {
            this.g.setText(this.k);
        }
        this.c.setVisibility(0);
        if (this.j) {
            ((AnimationDrawable) this.c.getDrawable()).stop();
        } else {
            h();
        }
        if (this.h != null) {
            if (TextUtils.isEmpty(this.h.getText())) {
                this.h.setVisibility(8);
            } else {
                this.h.setVisibility(0);
            }
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.a
    public void setLastUpdatedLabel(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3555324ba37674659484458746a8e18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3555324ba37674659484458746a8e18");
        } else {
            setSubHeaderText(charSequence);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.a
    public final void setLoadingDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a62fd37b38b823d7f29374f286b4741", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a62fd37b38b823d7f29374f286b4741");
            return;
        }
        this.c.setImageDrawable(drawable);
        this.c.setVisibility(4);
        this.j = drawable instanceof AnimationDrawable;
        a(drawable);
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.a
    public void setPullLabel(CharSequence charSequence) {
        this.k = charSequence;
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.a
    public void setRefreshingLabel(CharSequence charSequence) {
        this.l = charSequence;
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.a
    public void setReleaseLabel(CharSequence charSequence) {
        this.m = charSequence;
    }

    public void setTextTypeface(Typeface typeface) {
        Object[] objArr = {typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50124ed0cca97ce37ad273df5116d4d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50124ed0cca97ce37ad273df5116d4d7");
        } else {
            this.g.setTypeface(typeface);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35c5d279187f7e8ef85eabbc9b4ec55d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35c5d279187f7e8ef85eabbc9b4ec55d");
            return;
        }
        if (4 == this.g.getVisibility()) {
            this.g.setVisibility(0);
        }
        if (4 == this.d.getVisibility()) {
            this.d.setVisibility(0);
        }
        if (4 == this.c.getVisibility()) {
            this.c.setVisibility(0);
        }
        if (4 == this.h.getVisibility()) {
            this.h.setVisibility(0);
        }
    }

    private void setSubHeaderText(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4ba4542fd72dbe6ab7902e280c7a701", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4ba4542fd72dbe6ab7902e280c7a701");
        } else if (this.h != null) {
            if (TextUtils.isEmpty(charSequence)) {
                this.h.setVisibility(8);
                return;
            }
            this.h.setText(charSequence);
            this.h.setVisibility(0);
        }
    }

    private void setSubTextAppearance(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5115275a2d772770ef650952e9d5fa4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5115275a2d772770ef650952e9d5fa4f");
        } else if (this.h != null) {
            this.h.setTextAppearance(getContext(), i);
        }
    }

    private void setSubTextColor(ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "365c0eb21c4e58136467d02d8bb70267", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "365c0eb21c4e58136467d02d8bb70267");
        } else if (this.h != null) {
            this.h.setTextColor(colorStateList);
        }
    }

    private void setTextAppearance(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dafabe2cee5a9abab818af39ed93e096", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dafabe2cee5a9abab818af39ed93e096");
            return;
        }
        if (this.g != null) {
            this.g.setTextAppearance(getContext(), i);
        }
        if (this.h != null) {
            this.h.setTextAppearance(getContext(), i);
        }
    }

    private void setTextColor(ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c5314cef8c9845fd68915f66e7821df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c5314cef8c9845fd68915f66e7821df");
            return;
        }
        if (this.g != null) {
            this.g.setTextColor(colorStateList);
        }
        if (this.h != null) {
            this.h.setTextColor(colorStateList);
        }
    }
}
