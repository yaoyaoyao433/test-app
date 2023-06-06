package com.sankuai.waimai.store.goods.list.viewblocks.newuser;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCRecyclableLottieAnimationView extends LottieAnimationView {
    public static ChangeQuickRedirect c;

    public SCRecyclableLottieAnimationView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "999ce72ff5ae395d75750e5ecc14009f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "999ce72ff5ae395d75750e5ecc14009f");
        }
    }

    public SCRecyclableLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db8fdde5bb4f288583b07dd612f07ae5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db8fdde5bb4f288583b07dd612f07ae5");
        }
    }

    public SCRecyclableLottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a919d8a7ba6fae0f81ebe0cf66b5737e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a919d8a7ba6fae0f81ebe0cf66b5737e");
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d3b801f4565541df6e37d806c9a770", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d3b801f4565541df6e37d806c9a770");
            return;
        }
        super.onDetachedFromWindow();
        try {
            e();
        } catch (Throwable unused) {
        }
    }
}
