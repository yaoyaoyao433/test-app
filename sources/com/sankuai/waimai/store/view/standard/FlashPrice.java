package com.sankuai.waimai.store.view.standard;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FlashPrice extends LinearLayout {
    public static ChangeQuickRedirect a;
    private ViewGroup b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private int g;
    private int h;
    private int i;
    private int j;
    private float k;
    private int l;

    public FlashPrice(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77d8fd865c45402c7033ef004dfb634d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77d8fd865c45402c7033ef004dfb634d");
        }
    }

    public FlashPrice(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ff3e331189d4d9482f4629acb47ebc6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ff3e331189d4d9482f4629acb47ebc6");
        }
    }

    public FlashPrice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76fd64d6f0770404fa9ab6d97a17aca7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76fd64d6f0770404fa9ab6d97a17aca7");
            return;
        }
        Object[] objArr2 = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6577f02d702da38db8701c204e12569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6577f02d702da38db8701c204e12569");
            return;
        }
        inflate(context, R.layout.wm_sc_ui_price, this);
        this.b = (ViewGroup) findViewById(R.id.flash_price_container);
        this.c = (TextView) findViewById(R.id.flash_price_symbol);
        this.d = (TextView) findViewById(R.id.flash_price_price);
        this.e = (TextView) findViewById(R.id.flash_price_unit);
        this.f = (TextView) findViewById(R.id.flash_price_origin_price);
        this.f.getPaint().setStrikeThruText(true);
        this.l = getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.priceSize, R.attr.priceDirection, R.attr.priceAlignment, R.attr.priceTheme}, i, 0);
        this.g = obtainStyledAttributes.getInt(0, 4);
        this.h = obtainStyledAttributes.getInt(1, 2);
        this.i = obtainStyledAttributes.getInt(2, 1);
        this.j = obtainStyledAttributes.getInt(3, 0);
        obtainStyledAttributes.recycle();
        setPriceSize(this.g);
        setPriceDirection(this.h);
        setPriceAlignment(this.i);
        setPriceTheme(this.j);
    }

    public void setPrice(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af4ba76710bb7c6ca6efc002cc15dd78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af4ba76710bb7c6ca6efc002cc15dd78");
            return;
        }
        this.d.setText(str);
        this.c.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setOriginPriceVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "121b69f94eb6808be6ea9f23b82573a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "121b69f94eb6808be6ea9f23b82573a6");
        } else {
            this.f.setVisibility(i);
        }
    }

    public int getOriginPriceVisibility() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae5f7b7581f2b28ce41f756e4f29f45e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae5f7b7581f2b28ce41f756e4f29f45e")).intValue();
        }
        if (this.f != null) {
            return this.f.getVisibility();
        }
        return 8;
    }

    public void setOriginPrice(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14a2eae0e5997ebb23202c72e6e572e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14a2eae0e5997ebb23202c72e6e572e9");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.f.setVisibility(0);
            this.f.setText(str);
        }
    }

    public void setUnitVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "837c512d46eee803b0914aca4ca98026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "837c512d46eee803b0914aca4ca98026");
        } else {
            this.e.setVisibility(i);
        }
    }

    public void setUnit(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73cf104312599f17def0faaecea62b84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73cf104312599f17def0faaecea62b84");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.e.setVisibility(0);
            this.e.setText(str);
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42dcb3ad34a051403ba15676256273be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42dcb3ad34a051403ba15676256273be");
        } else if (TextUtils.isEmpty(str2)) {
            setPrice(str);
        } else {
            this.e.setVisibility(8);
            this.f.setVisibility(0);
            this.d.setText(str);
            this.c.setVisibility(0);
            this.f.setText(getResources().getString(R.string.wm_sg_common_origin_price, str2));
        }
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3b80e9c4dd63e0d997d4b1da87159ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3b80e9c4dd63e0d997d4b1da87159ed");
            return;
        }
        this.d.setText(str);
        this.c.setVisibility(0);
        if (TextUtils.isEmpty(str2)) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.e.setText(str2);
        }
        if (TextUtils.isEmpty(str3)) {
            this.f.setVisibility(8);
            return;
        }
        this.f.setVisibility(0);
        this.f.setText(getResources().getString(R.string.wm_sg_common_origin_price, str3));
    }

    public void setPriceSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13d78c22fd09934e663d40f842b5b10d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13d78c22fd09934e663d40f842b5b10d");
            return;
        }
        this.g = i;
        int i2 = 12;
        int i3 = 11;
        switch (this.g) {
            case 0:
                this.k = 0.0f;
                i2 = 11;
                break;
            case 1:
                this.k = 0.5f;
                break;
            case 2:
                this.k = 1.0f;
                i2 = 14;
                break;
            case 3:
                i2 = 16;
                this.k = 1.5f;
                break;
            case 4:
            default:
                this.k = 2.0f;
                i2 = 18;
                i3 = 12;
                break;
            case 5:
                i2 = 20;
                this.k = 2.5f;
                i3 = 14;
                break;
            case 6:
                i2 = 22;
                this.k = 3.0f;
                i3 = 14;
                break;
            case 7:
                i2 = 24;
                this.k = 3.0f;
                i3 = 14;
                break;
        }
        float f = i3;
        this.c.setTextSize(2, f);
        this.d.setTextSize(2, i2);
        this.e.setTextSize(2, i3 - 1);
        this.f.setTextSize(2, f);
        this.f.setPadding(0, 0, 0, 0);
        if (this.h == 2) {
            this.c.setPadding(0, 0, 0, h.a(getContext(), this.k));
            this.f.setPadding(this.l, 0, 0, h.a(getContext(), this.k));
        }
        if (this.h == 3) {
            this.c.setPadding(0, 0, 0, h.a(getContext(), this.k));
            this.f.setPadding(0, 0, this.l, h.a(getContext(), this.k));
        }
    }

    public void setPriceDirection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62ccd2201391d3b773d55a8b3ec20514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62ccd2201391d3b773d55a8b3ec20514");
            return;
        }
        this.h = i;
        removeAllViews();
        int i2 = this.h;
        if (i2 != 3) {
            switch (i2) {
                case 0:
                    setOrientation(1);
                    addView(this.b);
                    addView(this.f);
                    return;
                case 1:
                    setOrientation(1);
                    addView(this.f);
                    addView(this.b);
                    return;
                default:
                    setOrientation(0);
                    setGravity(80);
                    addView(this.b);
                    addView(this.f);
                    return;
            }
        }
        setOrientation(0);
        setGravity(80);
        addView(this.f);
        addView(this.b);
    }

    public void setPriceAlignment(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d86ccf0bd949a2b96a9f2f03820de791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d86ccf0bd949a2b96a9f2f03820de791");
            return;
        }
        this.i = i;
        if (this.h == 1 || this.h == 0) {
            switch (this.i) {
                case 0:
                    setGravity(3);
                    return;
                case 1:
                    setGravity(5);
                    return;
                default:
                    return;
            }
        }
    }

    public void setPriceTheme(int i) {
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de18227aacd31dfede57646b2d989fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de18227aacd31dfede57646b2d989fd5");
            return;
        }
        this.j = i;
        switch (this.j) {
            case 1:
                i2 = R.color.wm_sg_color_222426;
                break;
            case 2:
                i2 = R.color.wm_sg_color_999999;
                break;
            default:
                i2 = R.color.wm_sg_color_FF4A26;
                break;
        }
        this.c.setTextColor(getResources().getColor(i2));
        this.d.setTextColor(getResources().getColor(i2));
    }

    public int getPriceSize() {
        return this.g;
    }

    public int getPriceDirection() {
        return this.h;
    }

    public int getPriceAlignment() {
        return this.i;
    }

    public int getPriceTheme() {
        return this.j;
    }
}
