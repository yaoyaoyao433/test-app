package com.meituan.roodesign.widgets.tips;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.button.RooButton;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooTips extends FrameLayout {
    public static ChangeQuickRedirect a;
    private int b;
    private Drawable c;
    private Drawable d;
    private TextView e;
    private FrameLayout f;
    private ViewGroup g;
    private ImageView h;
    private ImageView i;
    private String j;
    private boolean k;
    private boolean l;
    private a m;
    private b n;
    private String o;
    private int p;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
    }

    public RooTips(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bbe90842d038be391eb2f93649b0d66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bbe90842d038be391eb2f93649b0d66");
        }
    }

    private RooTips(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, R.attr.rooTipsStyle);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13adf4c8e05521065094f8872d2adf43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13adf4c8e05521065094f8872d2adf43");
        }
    }

    public RooTips(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2131559124);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12a906131fe3f027023820f8fca456ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12a906131fe3f027023820f8fca456ac");
        }
    }

    private RooTips(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 2131559124);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), 2131559124};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23de9cd26df9f8bc7df75eec25c6daf0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23de9cd26df9f8bc7df75eec25c6daf0");
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842904, 16843087, 16843091, R.attr.needMiddleButton, R.attr.needOutlinedStyle, R.attr.tipsLeftIcon, R.attr.tipsRightIcon, R.attr.tipsButtonText}, i, 2131559124);
        this.c = obtainStyledAttributes.getDrawable(5);
        this.d = obtainStyledAttributes.getDrawable(6);
        this.k = obtainStyledAttributes.getBoolean(3, false);
        this.l = obtainStyledAttributes.getBoolean(4, false);
        this.b = obtainStyledAttributes.getColor(0, context.getResources().getColor(R.color.tips_text_color));
        this.j = obtainStyledAttributes.getString(1);
        this.p = obtainStyledAttributes.getInt(2, 2);
        this.o = obtainStyledAttributes.getString(7);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8461e31a9ccd8ebb9fbd515cbfae9f3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8461e31a9ccd8ebb9fbd515cbfae9f3f");
            return;
        }
        super.onFinishInflate();
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.roo_tips_layout, (ViewGroup) this, false);
        addView(linearLayout);
        Object[] objArr2 = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f553b071a9620e6f279d90589400f3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f553b071a9620e6f279d90589400f3c");
        } else {
            this.g = (ViewGroup) linearLayout.findViewById(R.id.tips_panel);
            this.i = (ImageView) linearLayout.findViewById(R.id.tips_left_view);
            this.e = (TextView) linearLayout.findViewById(R.id.tips_content);
            this.f = (FrameLayout) linearLayout.findViewById(R.id.buttonContainer);
            this.h = (ImageView) linearLayout.findViewById(R.id.tips_right_view);
            this.f.setVisibility(this.k ? 0 : 8);
            RooButton button = getButton();
            if (button != null) {
                CharSequence charSequence = this.o;
                Object[] objArr3 = {button, charSequence};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.roodesign.widgets.tips.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2acfca883353424c251161a24174cc6f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2acfca883353424c251161a24174cc6f");
                } else if (!TextUtils.isEmpty(charSequence)) {
                    button.setText(charSequence);
                }
            }
            com.meituan.roodesign.widgets.tips.a.a(this.i, this.c);
            com.meituan.roodesign.widgets.tips.a.a(this.h, this.d);
            this.e.setTextColor(this.b);
            this.e.setMaxLines(this.p);
            if (!TextUtils.isEmpty(this.j)) {
                this.e.setText(this.j);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7742e4f6cd8114088bb97460dc91f424", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7742e4f6cd8114088bb97460dc91f424");
            return;
        }
        RooButton button2 = getButton();
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.roodesign.widgets.tips.RooTips.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ad5b21a1db9faeca2a8703690f88f1aa", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ad5b21a1db9faeca2a8703690f88f1aa");
                    } else if (RooTips.this.m != null) {
                        a unused = RooTips.this.m;
                    }
                }
            });
        }
        if (this.h != null) {
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.roodesign.widgets.tips.RooTips.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a395086f098e2b7b13f242acf5f1ae2c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a395086f098e2b7b13f242acf5f1ae2c");
                    } else if (RooTips.this.n != null) {
                        b unused = RooTips.this.n;
                    }
                }
            });
        }
    }

    public void setTextColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d3c8e797d9c67b0fef06877df8730f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d3c8e797d9c67b0fef06877df8730f3");
            return;
        }
        this.b = i;
        if (this.e != null) {
            this.e.setTextColor(i);
        }
    }

    public void setText(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a0939b3c6fd14f5e58fc12d7e6d0821", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a0939b3c6fd14f5e58fc12d7e6d0821");
            return;
        }
        this.j = (String) charSequence;
        if (this.e != null) {
            this.e.setText(charSequence);
        }
    }

    public final void setText(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4d72f24a9c12eddaa88a35ebe251e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4d72f24a9c12eddaa88a35ebe251e9f");
        } else if (this.e != null) {
            this.e.setText(i);
        }
    }

    @Nullable
    public ImageView getLeftView() {
        return this.i;
    }

    @Nullable
    public ImageView getRightView() {
        return this.h;
    }

    public void setLeftDrawable(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b5b454b4ecb12783097cc4cf367d6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b5b454b4ecb12783097cc4cf367d6f");
        } else if (this.i != null) {
            this.i.setImageDrawable(drawable);
        }
    }

    public void setLeftResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef76b160d16ae5d7102a83cc108b3f6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef76b160d16ae5d7102a83cc108b3f6f");
        } else if (this.i != null) {
            this.i.setImageResource(i);
        }
    }

    public void setLeftBitmap(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f72b75d8adbb1dabc3dd34159a7147a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f72b75d8adbb1dabc3dd34159a7147a4");
        } else if (this.i != null) {
            this.i.setImageBitmap(bitmap);
        }
    }

    public void setRightDrawable(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e9022b3c99801c131ead05a18eb6f93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e9022b3c99801c131ead05a18eb6f93");
        } else if (this.h != null) {
            this.h.setImageDrawable(drawable);
        }
    }

    public void setRightResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebfa60c83b98221f102256ac8de2ae14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebfa60c83b98221f102256ac8de2ae14");
        } else if (this.h != null) {
            this.h.setImageResource(i);
        }
    }

    public void setRightBitmap(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2106e548004e7315b8fdc79098872f7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2106e548004e7315b8fdc79098872f7c");
        } else if (this.h != null) {
            this.h.setImageBitmap(bitmap);
        }
    }

    @Nullable
    public RooButton getButton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6ee5a53b9bb695db9283a93e0beb0e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (RooButton) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6ee5a53b9bb695db9283a93e0beb0e8");
        }
        if (this.f == null || this.f.getChildCount() <= 0) {
            return null;
        }
        View childAt = this.f.getChildAt(0);
        if (childAt instanceof RooButton) {
            return (RooButton) childAt;
        }
        return null;
    }

    private void setButton(RooButton rooButton) {
        Object[] objArr = {rooButton};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63aa607d0dda1a56ac9156e447d7b8dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63aa607d0dda1a56ac9156e447d7b8dd");
        } else if (rooButton == null || this.f == null) {
        } else {
            this.f.removeAllViews();
            this.f.addView(rooButton);
        }
    }

    public void setOnButtonClickListener(a aVar) {
        this.m = aVar;
    }

    public void setOnRightViewClickListener(b bVar) {
        this.n = bVar;
    }
}
