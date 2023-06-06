package com.meituan.android.paybase.widgets.label;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.l;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LabelView extends LinearLayout {
    public static ChangeQuickRedirect a;

    public LabelView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8dbca387054980d893ebff6c1f3ca90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8dbca387054980d893ebff6c1f3ca90");
        }
    }

    public LabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6c752294ce14d33b0b190627286ae18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6c752294ce14d33b0b190627286ae18");
        }
    }

    public void setLabel(Label label) {
        View view;
        String str;
        GradientDrawable gradientDrawable;
        View view2;
        Object[] objArr = {label};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "661e91f11e282f9a1e4550c6532c4adc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "661e91f11e282f9a1e4550c6532c4adc");
            return;
        }
        Object[] objArr2 = {label};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cc4e648fced29b193acd7bbfcc75b8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cc4e648fced29b193acd7bbfcc75b8e");
        } else if (label == null || TextUtils.isEmpty(label.getContent())) {
        } else {
            switch (label.getStyle()) {
                case 0:
                    Object[] objArr3 = {label};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "851185a8d6da82ba291e471b30125551", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "851185a8d6da82ba291e471b30125551");
                        return;
                    }
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b1d41fc365ec25f4332afa988931b255", RobustBitConfig.DEFAULT_VALUE)) {
                        view = (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b1d41fc365ec25f4332afa988931b255");
                    } else {
                        LinearLayout linearLayout = new LinearLayout(getContext());
                        linearLayout.setId(R.id.recommend_label);
                        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, getResources().getDimensionPixelOffset(R.dimen.paybase__recommend_label_layout_height)));
                        linearLayout.setGravity(16);
                        linearLayout.setOrientation(0);
                        ImageView imageView = new ImageView(getContext());
                        imageView.setId(R.id.img);
                        linearLayout.addView(imageView);
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.paybase__recommend_label_layout_image_width);
                        layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.paybase__recommend_label_layout_image_height);
                        imageView.setLayoutParams(layoutParams);
                        com.meituan.android.paybase.config.a.d().r().a("https://p0.meituan.net/scarlett/2ca940ba002905ac00e10541b3ad8921268.png").a(imageView);
                        TextView textView = new TextView(getContext());
                        textView.setId(R.id.content);
                        linearLayout.addView(textView);
                        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                        layoutParams2.width = -2;
                        layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.paybase__recommend_label_layout_text_height);
                        textView.setLayoutParams(layoutParams2);
                        textView.setGravity(16);
                        textView.setPadding(getResources().getDimensionPixelOffset(R.dimen.paybase__recommend_label_layout_text_padding_left), 0, getResources().getDimensionPixelOffset(R.dimen.paybase__recommend_label_layout_text_padding_right), 0);
                        textView.setSingleLine(true);
                        textView.setTextColor(getResources().getColor(R.color.paybase__label_content_color));
                        textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.paybase__recommend_label_layout_text_size));
                        view = linearLayout;
                    }
                    addView(view);
                    if (label.isUseWhitePraiseIcon()) {
                        com.meituan.android.paybase.config.a.d().r().a("https://p0.meituan.net/scarlett/dfd24f1feda4d1e9aa1e28e4b1cb0db6282.png").a((ImageView) findViewById(R.id.img));
                    }
                    float dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.paybase__label_bg_recommend_radius);
                    float[] fArr = {dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f, 0.0f, 0.0f, dimensionPixelOffset, dimensionPixelOffset};
                    String color = label.getColor();
                    int color2 = getResources().getColor(17170445);
                    Object[] objArr5 = {fArr, Integer.valueOf(color2)};
                    ChangeQuickRedirect changeQuickRedirect5 = l.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "558e2efa69c3ade108533c99749fbfb3", RobustBitConfig.DEFAULT_VALUE)) {
                        gradientDrawable = (GradientDrawable) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "558e2efa69c3ade108533c99749fbfb3");
                        str = null;
                    } else {
                        Object[] objArr6 = {fArr, Integer.valueOf(color2), -1, 0};
                        ChangeQuickRedirect changeQuickRedirect6 = l.a;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "fea2cc0dd29cb4d833c3c3aea428e6eb", RobustBitConfig.DEFAULT_VALUE)) {
                            str = null;
                            gradientDrawable = (GradientDrawable) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "fea2cc0dd29cb4d833c3c3aea428e6eb");
                        } else {
                            str = null;
                            GradientDrawable gradientDrawable2 = new GradientDrawable();
                            gradientDrawable2.setShape(0);
                            gradientDrawable2.setCornerRadii(fArr);
                            gradientDrawable2.setColor(color2);
                            gradientDrawable = gradientDrawable2;
                        }
                    }
                    findViewById(R.id.img).setBackgroundDrawable(a(str, color, gradientDrawable));
                    a(label, (TextView) findViewById(R.id.content));
                    GradientDrawable a2 = a(label.getColor(), str, R.drawable.paybase__label_bg);
                    if (a2 != null) {
                        findViewById(R.id.recommend_label).setBackgroundDrawable(a2);
                    }
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams3.setMargins(0, 0, getContext().getResources().getDimensionPixelSize(R.dimen.paybase__payment_label_margin_left_right), 0);
                    setLayoutParams(layoutParams3);
                    return;
                case 1:
                    a(label);
                    return;
                case 2:
                    Object[] objArr7 = {label};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b1acfe9470f75b12919534e410c80c3c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b1acfe9470f75b12919534e410c80c3c");
                        return;
                    }
                    inflate(getContext(), R.layout.paybase__label_with_head, this);
                    GradientDrawable a3 = a((String) null, label.getColor(), R.drawable.paybase__label_bg_head_info);
                    if (a3 != null) {
                        findViewById(R.id.head).setBackgroundDrawable(a3);
                    }
                    GradientDrawable a4 = a((String) null, label.getBackground(), R.drawable.paybase__label_bg_right);
                    if (a4 != null) {
                        findViewById(R.id.content).setBackgroundDrawable(a4);
                    }
                    TextView textView2 = (TextView) findViewById(R.id.head);
                    Object[] objArr8 = {label, textView2};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "2ef7d66f4404b9fb3143e5e0dc37e6a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "2ef7d66f4404b9fb3143e5e0dc37e6a8");
                    } else {
                        if (!TextUtils.isEmpty(label.getLabelHead())) {
                            textView2.setText(label.getLabelHead());
                        }
                        textView2.setTextColor(getContext().getResources().getColor(R.color.paybase__white));
                    }
                    a(label, (TextView) findViewById(R.id.content));
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams4.setMargins(0, 0, getContext().getResources().getDimensionPixelSize(R.dimen.paybase__payment_label_margin_left_right), 0);
                    setLayoutParams(layoutParams4);
                    return;
                case 3:
                    Object[] objArr9 = {label};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "53bdfbdbb7088eed1137354ef210746f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "53bdfbdbb7088eed1137354ef210746f");
                        return;
                    }
                    inflate(getContext(), R.layout.paybase__bubble_label_layout, this);
                    a(label, (TextView) findViewById(R.id.bubble_content));
                    GradientDrawable a5 = a((String) null, label.getBackground(), R.drawable.paybase__label_bg_bubble);
                    if (a5 != null) {
                        findViewById(R.id.bubble_label).setBackgroundDrawable(a5);
                    }
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams5.setMargins(0, 0, getContext().getResources().getDimensionPixelSize(R.dimen.paybase__payment_label_margin_left_right), 0);
                    setLayoutParams(layoutParams5);
                    return;
                case 4:
                    Object[] objArr10 = {label};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "111c13a82543be2f0cd6627ceca183cf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "111c13a82543be2f0cd6627ceca183cf");
                        return;
                    }
                    Object[] objArr11 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "83a6db06b27ceda0a0295e6c129ca1c2", RobustBitConfig.DEFAULT_VALUE)) {
                        view2 = (View) PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "83a6db06b27ceda0a0295e6c129ca1c2");
                    } else {
                        LinearLayout linearLayout2 = new LinearLayout(getContext());
                        linearLayout2.setId(R.id.paybase__gif_layout);
                        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, getResources().getDimensionPixelOffset(R.dimen.paybase__label_image_view_height)));
                        linearLayout2.setOrientation(0);
                        ImageView imageView2 = new ImageView(getContext());
                        linearLayout2.addView(imageView2);
                        imageView2.setId(R.id.paybase__gif_icon);
                        ViewGroup.LayoutParams layoutParams6 = imageView2.getLayoutParams();
                        layoutParams6.width = getResources().getDimensionPixelOffset(R.dimen.paybase__label_image_view_image_width);
                        layoutParams6.height = getResources().getDimensionPixelOffset(R.dimen.paybase__label_image_view_image_height);
                        imageView2.setLayoutParams(layoutParams6);
                        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        view2 = linearLayout2;
                    }
                    addView(view2);
                    com.meituan.android.paybase.config.a.d().r().a(label.getContent()).a((ImageView) findViewById(R.id.paybase__gif_icon));
                    LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams7.setMargins(0, 0, getContext().getResources().getDimensionPixelSize(R.dimen.paybase__payment_label_margin_left_right), 0);
                    setLayoutParams(layoutParams7);
                    return;
                default:
                    a(label);
                    return;
            }
        }
    }

    @SuppressLint({"InflateParams"})
    private void a(Label label) {
        Object[] objArr = {label};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ea92bc8d12eb94a1eff78f3792b28bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ea92bc8d12eb94a1eff78f3792b28bc");
            return;
        }
        inflate(getContext(), R.layout.paybase__common_label_layout, this);
        TextView textView = (TextView) findViewById(R.id.content);
        GradientDrawable a2 = a(label.getColor(), label.getBackground(), R.drawable.paybase__label_bg);
        if (a2 != null) {
            findViewById(R.id.common_label).setBackgroundDrawable(a2);
        }
        a(label, textView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, getContext().getResources().getDimensionPixelSize(R.dimen.paybase__payment_label_margin_left_right), 0);
        setLayoutParams(layoutParams);
    }

    private GradientDrawable a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53f87e00392430b583f44cda039b74be", RobustBitConfig.DEFAULT_VALUE) ? (GradientDrawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53f87e00392430b583f44cda039b74be") : a(str, str2, (GradientDrawable) getContext().getResources().getDrawable(i).mutate());
    }

    private GradientDrawable a(String str, String str2, GradientDrawable gradientDrawable) {
        Object[] objArr = {str, str2, gradientDrawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "966e5f7250816ad59befb53529bb4136", RobustBitConfig.DEFAULT_VALUE)) {
            return (GradientDrawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "966e5f7250816ad59befb53529bb4136");
        }
        if (!TextUtils.isEmpty(str)) {
            gradientDrawable.setStroke(1, a(str));
        }
        if (!TextUtils.isEmpty(str2)) {
            gradientDrawable.setColor(a(str2));
        }
        return gradientDrawable;
    }

    private void a(Label label, TextView textView) {
        Object[] objArr = {label, textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9e7ad3c2cb494a5a5da9cf072316fd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9e7ad3c2cb494a5a5da9cf072316fd4");
            return;
        }
        if (!TextUtils.isEmpty(label.getContent())) {
            textView.setText(label.getContent());
        }
        if (!TextUtils.isEmpty(label.getTextColor())) {
            textView.setTextColor(a(label.getTextColor()));
        } else if (TextUtils.isEmpty(label.getColor())) {
        } else {
            textView.setTextColor(a(label.getColor()));
        }
    }

    private int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bbe6e72a3891d8cc6641cb0f5b56429", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bbe6e72a3891d8cc6641cb0f5b56429")).intValue();
        }
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "LabelView_parseColor").a("message", e.getMessage()).b);
            return 0;
        }
    }
}
