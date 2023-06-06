package com.sankuai.waimai.store.goods.detail.widget;

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
public class SGPriceTextView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private int b;

    public SGPriceTextView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3c062922946f0c8a7ffa79c32e399a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3c062922946f0c8a7ffa79c32e399a9");
        }
    }

    public SGPriceTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52c4cc035d2e34d91e779f529706705b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52c4cc035d2e34d91e779f529706705b");
        }
    }

    public SGPriceTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "712809f2a3e232e3f49fd3e96b3f209e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "712809f2a3e232e3f49fd3e96b3f209e");
            return;
        }
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a94a0cf8c93e78e734899e9dbdcfd480", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a94a0cf8c93e78e734899e9dbdcfd480");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.pointTextSize});
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public void setPrice(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8e6ad4669b999c21d3aaea4ac166964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8e6ad4669b999c21d3aaea4ac166964");
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
