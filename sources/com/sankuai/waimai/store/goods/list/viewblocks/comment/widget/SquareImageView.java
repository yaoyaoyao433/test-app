package com.sankuai.waimai.store.goods.list.viewblocks.comment.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SquareImageView extends UniversalImageView {
    public static ChangeQuickRedirect a;

    public SquareImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "455753cabb63e4b2515f3051cc5edd0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "455753cabb63e4b2515f3051cc5edd0e");
        }
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0453c7ceb26febb007d70e2ecb1228d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0453c7ceb26febb007d70e2ecb1228d0");
        }
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ec7289b7fb32c4f834cb2e217442c22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ec7289b7fb32c4f834cb2e217442c22");
        }
    }

    @Override // com.sankuai.waimai.store.view.banner.roundview.UniversalImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c152f5ca7bde6d2df55a0b0034a51130", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c152f5ca7bde6d2df55a0b0034a51130");
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, size);
    }
}
