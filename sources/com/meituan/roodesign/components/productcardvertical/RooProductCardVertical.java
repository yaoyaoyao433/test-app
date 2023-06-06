package com.meituan.roodesign.components.productcardvertical;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.components.labelimage.RooLabelImage;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooProductCardVertical extends LinearLayout {
    public static ChangeQuickRedirect a = null;
    private static final int b = 2131558679;
    @StyleRes
    private static final int c = 2131558913;
    @StyleRes
    private static final int d = 2131558905;
    private RooLabelImage e;
    private TextView f;
    private TextView g;
    private TextView h;
    private LinearLayout i;
    private GradientDrawable j;

    public RooProductCardVertical(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce7c342789243625c9700c3ef9c52268", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce7c342789243625c9700c3ef9c52268");
        }
    }

    private RooProductCardVertical(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, R.attr.rooProductCardVerticalStyle);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5877cde059b886e0647d7de532d1c10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5877cde059b886e0647d7de532d1c10");
        }
    }

    public RooProductCardVertical(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0be001b149c54fe49a52b9b451f9fae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0be001b149c54fe49a52b9b451f9fae");
            return;
        }
        Context context2 = getContext();
        setOrientation(1);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, new int[]{16843033, R.attr.titleTextAppearance, R.attr.captionTextAppearance, R.attr.hasOffset, R.attr.titlePaddingTop, R.attr.captionPaddingTop, R.attr.pricePaddingTop, R.attr.productTitleText, R.attr.captionText, R.attr.priceText}, i, b);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34b7f8bd65aaa148b5d9b3758f2ffc46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34b7f8bd65aaa148b5d9b3758f2ffc46");
        } else {
            Context context3 = getContext();
            this.e = new RooLabelImage(context3);
            addView(this.e, new LinearLayout.LayoutParams(-1, -2));
            this.i = new LinearLayout(context3);
            this.i.setOrientation(1);
            this.i.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f = new TextView(context3);
            this.i.addView(this.f);
            this.g = new TextView(context3);
            this.i.addView(this.g);
            this.h = new TextView(context3);
            this.i.addView(this.h);
            addView(this.i);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c949da2b67eedf75237a023fdc362921", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c949da2b67eedf75237a023fdc362921");
            } else {
                final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.roo_product_card_vertical_corner_radius);
                setOutlineProvider(new ViewOutlineProvider() { // from class: com.meituan.roodesign.components.productcardvertical.RooProductCardVertical.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        Object[] objArr4 = {view, outline};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b55468d5021cbc5e3a7d1a4d8475ca90", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b55468d5021cbc5e3a7d1a4d8475ca90");
                            return;
                        }
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), dimensionPixelSize);
                        view.setClipToOutline(true);
                    }
                });
            }
        }
        Object[] objArr4 = {obtainStyledAttributes};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "339e45e55f971757204f508e38cfbb1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "339e45e55f971757204f508e38cfbb1c");
        } else {
            setProductImageResource(obtainStyledAttributes.getResourceId(0, 0));
            setTitle(obtainStyledAttributes.getString(7));
            this.f.setTextAppearance(getContext(), obtainStyledAttributes.getResourceId(1, c));
            setTitlePaddingTop(obtainStyledAttributes.getDimensionPixelSize(4, getResources().getDimensionPixelSize(R.dimen.roo_product_card_vertical_title_padding_top)));
            setCaption(obtainStyledAttributes.getString(8));
            this.g.setTextAppearance(getContext(), obtainStyledAttributes.getResourceId(2, d));
            setCaptionPaddingTop(obtainStyledAttributes.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.roo_product_card_vertical_caption_padding_top)));
            setPriceWidgetText(obtainStyledAttributes.getString(9));
            setPriceWidgetPaddingTop(obtainStyledAttributes.getDimensionPixelSize(6, getResources().getDimensionPixelSize(R.dimen.roo_product_card_vertical_price_padding_top)));
            setHasOffset(obtainStyledAttributes.getBoolean(3, false));
        }
        obtainStyledAttributes.recycle();
    }

    private void setHasOffset(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca49a7c8cd87cf7e8934fd226e562695", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca49a7c8cd87cf7e8934fd226e562695");
        } else if (z) {
            this.i.setPadding(getResources().getDimensionPixelSize(R.dimen.roo_product_card_vertical_content_offset), 0, getResources().getDimensionPixelSize(R.dimen.roo_product_card_vertical_content_offset), getResources().getDimensionPixelSize(R.dimen.roo_product_card_vertical_content_padding_bottom));
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf8f0caf4bf12d2c30105f6dff73f2e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf8f0caf4bf12d2c30105f6dff73f2e8");
                return;
            }
            if (this.j == null) {
                this.j = new GradientDrawable();
            }
            this.j.setColor(-1);
            this.i.setBackground(this.j);
        } else {
            this.i.setPadding(0, 0, 0, 0);
        }
    }

    private void setProductImageResource(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffbea1e45f18f7e620e1ba8fa0b09417", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffbea1e45f18f7e620e1ba8fa0b09417");
            return;
        }
        this.e.getImageView().setImageResource(i);
        this.e.setCornerRadius(0);
        this.e.getImageView().setAdjustViewBounds(true);
        this.e.getImageView().setScaleType(ImageView.ScaleType.FIT_XY);
    }

    private void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5218425cc18df067fe85f1c6caca01e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5218425cc18df067fe85f1c6caca01e0");
            return;
        }
        this.f.setText(str);
        this.f.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    private void setTitlePaddingTop(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13d6ddd83e7ad6e90d3af9b4395d53e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13d6ddd83e7ad6e90d3af9b4395d53e5");
        } else {
            this.f.setPadding(0, i, 0, 0);
        }
    }

    private void setCaption(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6e92697bcd9ca0c02cd16e1d574998e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6e92697bcd9ca0c02cd16e1d574998e");
            return;
        }
        this.g.setText(str);
        this.g.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    private void setCaptionPaddingTop(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4399f568bceebe00c687a6e4564eab28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4399f568bceebe00c687a6e4564eab28");
        } else {
            this.g.setPadding(0, i, 0, 0);
        }
    }

    private void setPriceWidgetText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67207b2255753be1df8a7e3441ebf5e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67207b2255753be1df8a7e3441ebf5e9");
            return;
        }
        this.h.setText(str);
        this.h.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    private void setPriceWidgetPaddingTop(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d251212529651aebda878c27cc0e423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d251212529651aebda878c27cc0e423");
        } else {
            this.h.setPadding(0, i, 0, 0);
        }
    }

    public RooLabelImage getProductImage() {
        return this.e;
    }

    public TextView getTitleView() {
        return this.f;
    }

    public TextView getCaptionView() {
        return this.g;
    }

    public TextView getPriceView() {
        return this.h;
    }

    public LinearLayout getTextContainer() {
        return this.i;
    }
}
