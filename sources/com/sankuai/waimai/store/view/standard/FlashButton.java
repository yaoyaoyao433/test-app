package com.sankuai.waimai.store.view.standard;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class FlashButton extends LinearLayout {
    public static ChangeQuickRedirect a;
    public ImageView b;
    private int c;
    private int d;
    private TextView e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private Drawable l;
    private int m;
    private int n;

    public FlashButton(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34bbfa70c4d776b7a98ba89819f8f49e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34bbfa70c4d776b7a98ba89819f8f49e");
        }
    }

    public FlashButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a03d2c322bd654722651548b3b28db61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a03d2c322bd654722651548b3b28db61");
        }
    }

    public FlashButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bc975b53f565bb00b98841117e866f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bc975b53f565bb00b98841117e866f8");
            return;
        }
        this.c = 0;
        this.d = 2;
        this.k = false;
        Object[] objArr2 = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8c305a81aca135dd7b8607da843b300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8c305a81aca135dd7b8607da843b300");
            return;
        }
        inflate(context, R.layout.wm_sc_ui_float_button, this);
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3aa4c1255b919f92dfeaf14538097d4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3aa4c1255b919f92dfeaf14538097d4a");
        } else {
            setOrientation(0);
            setGravity(17);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_6);
            setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        this.e = (TextView) findViewById(R.id.tv);
        this.b = (ImageView) findViewById(R.id.iv);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842754, 16842766, 16843087, R.attr.flashType, R.attr.flashSize}, i, 0);
        this.c = obtainStyledAttributes.getInt(3, 0);
        this.d = obtainStyledAttributes.getInt(4, 2);
        String string = obtainStyledAttributes.getString(2);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        boolean z = obtainStyledAttributes.getBoolean(1, true);
        setText(string);
        setImageDrawable(drawable);
        a();
        c();
        b();
        setEnabled(z);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1ab1418db17c54485b138473c7bcb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1ab1418db17c54485b138473c7bcb8");
        } else {
            super.setEnabled(z);
        }
    }

    public final void setButtonType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f0be3385606f188f57b657493f5a03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f0be3385606f188f57b657493f5a03");
        } else if (this.c != i) {
            this.c = i;
            b();
        }
    }

    public final void setButtonSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4ba5c5cff676e851ea3dc0cfa61b8a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4ba5c5cff676e851ea3dc0cfa61b8a5");
        } else if (this.d != i) {
            this.d = i;
            a();
            c();
            b();
        }
    }

    public final void setText(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6719b72366fd33939e43b64546aff219", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6719b72366fd33939e43b64546aff219");
        } else {
            u.a(this.e, charSequence);
        }
    }

    public final void setText(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71abd79bb2bd0adb92f2098da2580944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71abd79bb2bd0adb92f2098da2580944");
        } else {
            u.a(this.e, i);
        }
    }

    public final CharSequence getText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d928d78ad69a7645745f32e70d2c594f", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d928d78ad69a7645745f32e70d2c594f") : this.e.getText();
    }

    public final void setImageDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0216be8f730cf7b9ee2f7f5fc35fbc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0216be8f730cf7b9ee2f7f5fc35fbc6");
        } else if (drawable == null) {
            u.c(this.b);
        } else {
            this.b.setImageDrawable(drawable);
            u.a(this.b);
        }
    }

    public final void setImageRes(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00b700af932501d4a19fcec1a4451bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00b700af932501d4a19fcec1a4451bef");
        } else {
            u.a(this.b, i);
        }
    }

    public final void setImageUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23cc63a0c588bc03c7e7199e88a1d822", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23cc63a0c588bc03c7e7199e88a1d822");
        } else if (TextUtils.isEmpty(str)) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            m.b(str).a(new b.d() { // from class: com.sankuai.waimai.store.view.standard.FlashButton.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c558f5566d79d81e2a78d296bc2dd1b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c558f5566d79d81e2a78d296bc2dd1b");
                    } else {
                        FlashButton.this.b.setVisibility(0);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7e1ed9b12b998519b13db6d1ec03de3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7e1ed9b12b998519b13db6d1ec03de3");
                    } else {
                        FlashButton.this.b.setVisibility(8);
                    }
                }
            }).a(this.b);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a370a56f04060b1662364b0cb7d5917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a370a56f04060b1662364b0cb7d5917");
            return;
        }
        int i = this.d;
        if (i == 1) {
            this.f = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_textsize_11);
            this.j = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_20);
            this.i = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4);
            this.g = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_11);
            this.h = this.g;
            return;
        }
        switch (i) {
            case 3:
                this.f = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_textsize_12);
                this.j = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_28);
                this.i = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6);
                this.g = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12);
                this.h = this.g;
                return;
            case 4:
                this.f = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_textsize_14);
                this.j = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_32);
                this.i = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6);
                this.g = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_14);
                this.h = this.g;
                return;
            case 5:
                this.f = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_textsize_14);
                this.j = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_36);
                this.i = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6);
                this.g = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_14);
                this.h = this.g;
                return;
            case 6:
                this.f = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_textsize_16);
                this.j = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_40);
                this.i = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6);
                this.g = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_16);
                this.h = this.g;
                return;
            default:
                this.f = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_textsize_11);
                this.j = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_24);
                this.i = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4);
                this.g = getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_11);
                this.h = this.g;
                return;
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb604b0fe70d24b05e2ded13e063f56c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb604b0fe70d24b05e2ded13e063f56c");
        } else if (this.k) {
            setBackground(this.l);
            this.e.setTextColor(this.m);
            setPadding(this.n, 0, this.n, 0);
        } else {
            switch (this.c) {
                case 1:
                    d();
                    return;
                case 2:
                    e();
                    return;
                default:
                    f();
                    return;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "269f5b44ec4f55404f50c4677cede9cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "269f5b44ec4f55404f50c4677cede9cb");
            return;
        }
        super.onMeasure(i, i2);
        if (this.j > 0) {
            setMeasuredDimension(getMeasuredWidth(), this.j);
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b284904f112d5c5987e7923bca51483", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b284904f112d5c5987e7923bca51483");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.g;
            layoutParams.height = this.h;
            this.b.setLayoutParams(layoutParams);
        }
        this.e.setTextSize(0, this.f);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "739f153ffc1bd2f41b9e9fcbd44f240b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "739f153ffc1bd2f41b9e9fcbd44f240b");
            return;
        }
        setBackground(e.a().a(new int[]{-16842910}, new e.a().c(ContextCompat.getColor(getContext(), R.color.wm_sg_color_BCBCBD)).a(this.i).a()).a(new int[]{16842919}, new e.a().c(ContextCompat.getColor(getContext(), R.color.wm_sg_color_9AF5F5F6)).a(this.i).a()).a(new e.a().c(ContextCompat.getColor(getContext(), R.color.wm_sg_color_F5F5F6)).a(this.i).a()).b);
        this.e.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842919}, new int[0]}, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFFFFF), ContextCompat.getColor(getContext(), R.color.wm_sg_color_9A222426), ContextCompat.getColor(getContext(), R.color.wm_sg_color_222426)}));
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075ccaa2391cf077a438cc1762ab104a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075ccaa2391cf077a438cc1762ab104a");
            return;
        }
        setBackground(e.a().a(new int[]{-16842910}, new e.a().a(ContextCompat.getColor(getContext(), R.color.wm_sg_color_BCBCBD)).b(getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_half)).a(this.i).a()).a(new int[]{16842919}, new e.a().a(ContextCompat.getColor(getContext(), R.color.wm_sg_color_9AD3D3D3)).b(getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_half)).a(this.i).a()).a(new e.a().a(ContextCompat.getColor(getContext(), R.color.wm_sg_color_D3D3D3)).b(getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_half)).a(this.i).a()).b);
        this.e.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842919}, new int[0]}, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_BCBCBD), ContextCompat.getColor(getContext(), R.color.wm_sg_color_9A222426), ContextCompat.getColor(getContext(), R.color.wm_sg_color_222426)}));
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5088dcfe6eb883faf8021153b38346a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5088dcfe6eb883faf8021153b38346a");
            return;
        }
        setBackground(e.a().a(new int[]{-16842910}, new e.a().c(ContextCompat.getColor(getContext(), R.color.wm_sg_color_BCBCBD)).a(this.i).a()).a(new int[]{16842919}, new e.a().a(GradientDrawable.Orientation.TL_BR, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_9AFFE14D), ContextCompat.getColor(getContext(), R.color.wm_sg_color_9AFFC34D)}).a(this.i).a()).a(new e.a().a(GradientDrawable.Orientation.TL_BR, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFE14D), ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFC34D)}).a(this.i).a()).b);
        this.e.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842919}, new int[0]}, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFFFFF), ContextCompat.getColor(getContext(), R.color.wm_sg_color_9A222426), ContextCompat.getColor(getContext(), R.color.wm_sg_color_222426)}));
    }

    public final void a(Drawable drawable, @ColorRes int i, @DimenRes int i2) {
        Object[] objArr = {drawable, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aef7562ff62ef8a579a497a584cc14c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aef7562ff62ef8a579a497a584cc14c9");
            return;
        }
        this.k = true;
        this.l = drawable;
        this.m = getResources().getColor(i);
        this.n = getResources().getDimensionPixelSize(i2);
        b();
    }

    public final void setMidMargin(int i) {
        LinearLayout.LayoutParams layoutParams;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c01bd20104d6a19066f27633f470769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c01bd20104d6a19066f27633f470769");
        } else if (this.e == null || (layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams()) == null) {
        } else {
            layoutParams.leftMargin = i;
            this.e.setLayoutParams(layoutParams);
        }
    }
}
