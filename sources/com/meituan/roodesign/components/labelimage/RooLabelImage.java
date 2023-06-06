package com.meituan.roodesign.components.labelimage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Rect;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.label.RooLabel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.security.InvalidParameterException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooLabelImage extends FrameLayout {
    public static ChangeQuickRedirect a = null;
    @StyleRes
    private static final int e = 2131558905;
    public int b;
    public int c;
    public int d;
    private RooLabel f;
    private RooLabel g;
    private RooLabel h;
    private RooLabel i;
    private ImageView j;
    private View k;
    @ColorInt
    private int l;
    private int m;
    private Rect n;
    private Rect o;
    private Rect p;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface LabelType {
    }

    public RooLabelImage(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd5372146e7e61bf98babde8b89e244b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd5372146e7e61bf98babde8b89e244b");
        }
    }

    public RooLabelImage(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.rooLabelImageStyle);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c2bd5f32ece0133b229809e09b94c8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c2bd5f32ece0133b229809e09b94c8c");
        }
    }

    public RooLabelImage(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2131559116);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c8ba5643088c2cbce30a85d4f64933e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c8ba5643088c2cbce30a85d4f64933e");
        }
    }

    public RooLabelImage(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a85039462c7adc886f5329cfd82c083", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a85039462c7adc886f5329cfd82c083");
            return;
        }
        Context context2 = getContext();
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.roo_li_label_corner_radius);
        this.n = new Rect(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.o = new Rect(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.p = new Rect(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, new int[]{16842804, 16843033, R.attr.cornerRadius, R.attr.topLeftLabelText, R.attr.topRightLabelText, R.attr.bottomLeftLabelText, R.attr.descriptionLabelText, R.attr.maskColor, R.attr.topLeftLabelType, R.attr.topRightLabelType, R.attr.bottomLeftLabelType}, i, i2);
        this.m = obtainStyledAttributes.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(R.dimen.roo_li_corner_radius));
        this.l = obtainStyledAttributes.getColor(7, getResources().getColor(R.color.roo_li_mask_view_background));
        int resourceId = obtainStyledAttributes.getResourceId(0, e);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        int i3 = this.l;
        Object[] objArr2 = {Integer.valueOf(resourceId), Integer.valueOf(resourceId2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddad9777e0564209bf7e800aaa94d66f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddad9777e0564209bf7e800aaa94d66f");
        } else {
            Context context3 = getContext();
            this.j = new ImageView(context3);
            if (resourceId2 > 0) {
                this.j.setImageResource(resourceId2);
            }
            this.j.setClipToOutline(true);
            this.j.setOutlineProvider(new ViewOutlineProvider() { // from class: com.meituan.roodesign.components.labelimage.RooLabelImage.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    Object[] objArr3 = {view, outline};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dbb458d5df9dddcecd77a4100adfe56d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dbb458d5df9dddcecd77a4100adfe56d");
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), RooLabelImage.this.m);
                    }
                }
            });
            addView(this.j, new FrameLayout.LayoutParams(-1, -1));
            this.k = new View(context3);
            this.k.setBackgroundColor(i3);
            this.k.setClipToOutline(true);
            this.k.setOutlineProvider(new ViewOutlineProvider() { // from class: com.meituan.roodesign.components.labelimage.RooLabelImage.2
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    Object[] objArr3 = {view, outline};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e399edeb663c49c8fa72358345fa82df", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e399edeb663c49c8fa72358345fa82df");
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), RooLabelImage.this.m);
                    }
                }
            });
            addView(this.k, new FrameLayout.LayoutParams(-1, -1));
            this.i = new RooLabel(context3);
            this.i.setBackgroundColor(context3.getResources().getColor(R.color.roo_li_description_view_background));
            this.i.setTextAlignment(4);
            this.i.setTextAppearance(context3, resourceId);
            this.i.a(0, 0, this.m, this.m);
            addView(this.i, new FrameLayout.LayoutParams(-1, -2, 81));
            this.f = new RooLabel(context3);
            this.f.a(this.m, 0, 0, this.n.bottom);
            this.f.setTextAppearance(context3, resourceId);
            addView(this.f, new FrameLayout.LayoutParams(-2, -2, 51));
            this.g = new RooLabel(context3);
            this.g.a(0, this.m, this.o.right, 0);
            this.g.setTextAppearance(context3, resourceId);
            addView(this.g, new FrameLayout.LayoutParams(-2, -2, 53));
            this.h = new RooLabel(context3);
            this.h.setTextAppearance(context3, resourceId);
            this.h.a(0, this.p.top, this.m, 0);
            addView(this.h, new FrameLayout.LayoutParams(-2, -2, 83));
        }
        setTopLeftLabelText(obtainStyledAttributes.getText(3));
        setTopRightLabelText(obtainStyledAttributes.getText(4));
        setBottomLeftLabelText(obtainStyledAttributes.getText(5));
        setDescriptionLabelText(obtainStyledAttributes.getText(6));
        setTopLeftLabelType(obtainStyledAttributes.getInt(8, 0));
        setTopRightLabelType(obtainStyledAttributes.getInt(9, 0));
        setBottomLeftLabelType(obtainStyledAttributes.getInt(10, 0));
        obtainStyledAttributes.recycle();
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6d457714712bee623afba95738e8eab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6d457714712bee623afba95738e8eab");
            return;
        }
        b();
        c();
        d();
        e();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d08ab9b1cf920029401824b1444a42ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d08ab9b1cf920029401824b1444a42ba");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        switch (this.b) {
            case 0:
                this.f.a(this.m, 0, 0, this.n.bottom);
                layoutParams.setMargins(0, 0, 0, 0);
                this.f.setLayoutParams(layoutParams);
                return;
            case 1:
                this.f.a(this.n.left, this.n.top, this.n.right, this.n.bottom);
                int i = -getResources().getDimensionPixelSize(R.dimen.roo_li_label_corner_margin);
                layoutParams.setMargins(i, i, 0, 0);
                this.f.setLayoutParams(layoutParams);
                return;
            default:
                throw new InvalidParameterException("setTopLeftLabelType() param 'labelType' MUST be in @LabelType");
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c2d5a2b6b0cd12068afe3bfb176c27c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c2d5a2b6b0cd12068afe3bfb176c27c");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
        switch (this.c) {
            case 0:
                this.g.a(0, this.m, this.o.right, 0);
                layoutParams.setMargins(0, 0, 0, 0);
                this.g.setLayoutParams(layoutParams);
                return;
            case 1:
                this.g.a(this.o.left, this.o.top, this.o.right, this.o.bottom);
                int i = -getResources().getDimensionPixelSize(R.dimen.roo_li_label_corner_margin);
                layoutParams.setMargins(0, i, i, 0);
                this.g.setLayoutParams(layoutParams);
                return;
            default:
                throw new InvalidParameterException("setTopRightLabelType() param 'labelType' MUST be in @LabelType");
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7973c185b86c9fa097216da7a2cd91b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7973c185b86c9fa097216da7a2cd91b8");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        switch (this.d) {
            case 0:
                this.h.a(0, this.p.top, this.m, 0);
                layoutParams.setMargins(0, 0, 0, 0);
                this.h.setLayoutParams(layoutParams);
                return;
            case 1:
                this.h.a(this.p.left, this.p.top, this.p.right, this.p.bottom);
                layoutParams.setMargins(getResources().getDimensionPixelSize(R.dimen.roo_li_label_horizontal_margin), 0, 0, -getResources().getDimensionPixelSize(R.dimen.roo_li_label_vertical_margin));
                this.h.setLayoutParams(layoutParams);
                return;
            default:
                throw new InvalidParameterException("setTopRightLabelType() param 'labelType' MUST be in @LabelType");
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7edf00f6df6d7c51330588e408d5a07c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7edf00f6df6d7c51330588e408d5a07c");
        } else {
            this.i.a(0, 0, this.m, this.m);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a196d97886826c8795d7fed19dab83c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a196d97886826c8795d7fed19dab83c6");
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @NonNull
    public final RooLabel getTopLeftLabel() {
        return this.f;
    }

    @NonNull
    public final RooLabel getTopRightLabel() {
        return this.g;
    }

    @NonNull
    public final RooLabel getBottomLeftLabel() {
        return this.h;
    }

    @NonNull
    public final RooLabel getDescriptionLabel() {
        return this.i;
    }

    @NonNull
    public final ImageView getImageView() {
        return this.j;
    }

    @Nullable
    public CharSequence getTopLeftLabelText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c284b9e60e8fdbda0d14c939e1b8be", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c284b9e60e8fdbda0d14c939e1b8be") : this.f.getText();
    }

    public void setTopLeftLabelText(@Nullable CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "965a7c18ca2eab8d1a079889d1cc4945", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "965a7c18ca2eab8d1a079889d1cc4945");
            return;
        }
        this.f.setText(charSequence);
        this.f.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setTopLeftLabelText(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d86f6e9e510f1a2785eccb159525fe33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d86f6e9e510f1a2785eccb159525fe33");
        } else {
            setTopLeftLabelText(getResources().getText(i));
        }
    }

    @Nullable
    public CharSequence getTopRightLabelText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0261a6918cf6cf7fe9a0adae2d271f31", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0261a6918cf6cf7fe9a0adae2d271f31") : this.g.getText();
    }

    public void setTopRightLabelText(@Nullable CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d317a4caba6661a6abaddefbfef8c40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d317a4caba6661a6abaddefbfef8c40");
            return;
        }
        this.g.setText(charSequence);
        this.g.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setTopRightLabelText(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a327fb912d5cf30d79ad5a9401abb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a327fb912d5cf30d79ad5a9401abb6");
        } else {
            setTopRightLabelText(getResources().getText(i));
        }
    }

    @Nullable
    public CharSequence getBottomLeftLabelText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fc931f49646870ad80923b3a18665aa", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fc931f49646870ad80923b3a18665aa") : this.h.getText();
    }

    public void setBottomLeftLabelText(@Nullable CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73fdf1d2e61af3cd2f14e4859e5e879d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73fdf1d2e61af3cd2f14e4859e5e879d");
            return;
        }
        this.h.setText(charSequence);
        this.h.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setBottomLeftLabelText(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e159f7954ca3b24275e2ef483432e8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e159f7954ca3b24275e2ef483432e8b");
        } else {
            setBottomLeftLabelText(getResources().getText(i));
        }
    }

    @Nullable
    public CharSequence getDescriptionLabelText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "435f59a84d9ccf4d8a90bdbf0fd2b551", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "435f59a84d9ccf4d8a90bdbf0fd2b551") : this.i.getText();
    }

    public void setDescriptionLabelText(@Nullable CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c4c03fc198c52831ae0a20a643926a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c4c03fc198c52831ae0a20a643926a0");
            return;
        }
        this.i.setText(charSequence);
        this.i.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setDescriptionLabelText(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa89f99999c44eb50c492b62a919b050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa89f99999c44eb50c492b62a919b050");
        } else {
            setDescriptionLabelText(getResources().getText(i));
        }
    }

    public int getTopLeftLabelType() {
        return this.b;
    }

    public void setTopLeftLabelType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "807223578bc8e042cca672adf25bf496", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "807223578bc8e042cca672adf25bf496");
        } else if (this.b != i) {
            this.b = i;
            b();
        }
    }

    public int getTopRightLabelType() {
        return this.c;
    }

    public void setTopRightLabelType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "302406fa96adba207ea8a66b4b40efed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "302406fa96adba207ea8a66b4b40efed");
        } else if (this.c != i) {
            this.c = i;
            c();
        }
    }

    public int getBottomLeftLabelType() {
        return this.d;
    }

    public void setBottomLeftLabelType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7067baad40154e504874ed6f22de9fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7067baad40154e504874ed6f22de9fc");
        } else if (this.d != i) {
            this.d = i;
            d();
        }
    }

    public int getCornerRadius() {
        return this.m;
    }

    public void setCornerRadius(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb9eee69e41f7f51a47fca332cbc0f1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb9eee69e41f7f51a47fca332cbc0f1b");
        } else if (this.m != i) {
            this.m = i;
            a();
        }
    }

    @ColorInt
    public int getMaskColor() {
        return this.l;
    }

    public void setMaskColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c6363806ce25015ff5dc67fd5d8b014", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c6363806ce25015ff5dc67fd5d8b014");
        } else if (this.l != i) {
            this.l = i;
            this.k.setBackgroundColor(i);
            this.k.invalidate();
        }
    }
}
