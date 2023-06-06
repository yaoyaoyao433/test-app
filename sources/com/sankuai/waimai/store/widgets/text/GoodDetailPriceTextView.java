package com.sankuai.waimai.store.widgets.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class GoodDetailPriceTextView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private int b;

    public GoodDetailPriceTextView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41cc25cd5f50c1e7fdd961adef53d2a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41cc25cd5f50c1e7fdd961adef53d2a8");
        }
    }

    public GoodDetailPriceTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03b34e9cbaae85300727895f40a17991", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03b34e9cbaae85300727895f40a17991");
        }
    }

    public GoodDetailPriceTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f62d60394f7af70de6c041e9725c5fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f62d60394f7af70de6c041e9725c5fd");
            return;
        }
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "397114ff11b2da4d521929ff9b8e80ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "397114ff11b2da4d521929ff9b8e80ea");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.pointTextSize});
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public void setPrice(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56872f0c4cf1a8e0bd5e1c2a1ea59afa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56872f0c4cf1a8e0bd5e1c2a1ea59afa");
        } else if (str == null) {
        } else {
            int indexOf = str.indexOf(CommonConstant.Symbol.DOT);
            if (indexOf > 0 && this.b > 0) {
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new AbsoluteSizeSpan(this.b), indexOf, str.length(), 17);
                setText(spannableString);
                return;
            }
            setText(str);
        }
    }

    public void setPointPriceTextSize(int i) {
        this.b = i;
    }
}
