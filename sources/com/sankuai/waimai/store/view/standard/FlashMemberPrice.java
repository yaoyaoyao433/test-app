package com.sankuai.waimai.store.view.standard;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FlashMemberPrice extends LinearLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;
    private ImageView d;
    private int e;

    public FlashMemberPrice(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff17363ecd4779ed3b04a73c0c2fbc81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff17363ecd4779ed3b04a73c0c2fbc81");
        }
    }

    private FlashMemberPrice(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc582c35e52956c71ec4ff13eca99375", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc582c35e52956c71ec4ff13eca99375");
        }
    }

    public FlashMemberPrice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88063cbc2b1582221b0fb66105b7175f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88063cbc2b1582221b0fb66105b7175f");
            return;
        }
        Object[] objArr2 = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7315e67c9e77d782f694da6c5eb29221", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7315e67c9e77d782f694da6c5eb29221");
            return;
        }
        inflate(context, R.layout.wm_sc_ui_member_price, this);
        this.b = (TextView) findViewById(R.id.flash_price_symbol);
        this.c = (TextView) findViewById(R.id.flash_price);
        this.d = (ImageView) findViewById(R.id.flash_price_icon);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.memberPriceStyle}, i, 0);
        this.e = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        setPriceStyle(this.e);
    }

    public void setPrice(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "699eb28e39fd7e333a948eb085813cf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "699eb28e39fd7e333a948eb085813cf1");
        } else {
            this.c.setText(str);
        }
    }

    public void setPriceStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48979d48b4200bcefee52e2b0a3a5c4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48979d48b4200bcefee52e2b0a3a5c4c");
            return;
        }
        this.e = i;
        if (this.e == 0) {
            this.d.setImageResource(R.drawable.wm_sc_memer_price_long);
        } else {
            this.d.setImageResource(R.drawable.wm_sc_memer_price_short);
        }
    }
}
