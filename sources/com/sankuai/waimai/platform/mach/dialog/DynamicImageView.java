package com.sankuai.waimai.platform.mach.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DynamicImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;

    public DynamicImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceae2c1a9fbb65a3b4d3ed3077dc2f0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceae2c1a9fbb65a3b4d3ed3077dc2f0d");
        }
    }

    public DynamicImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49e9c150c46fa4281d60c82137ec514d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49e9c150c46fa4281d60c82137ec514d");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d589676310fe072542fd4319e41e0a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d589676310fe072542fd4319e41e0a5");
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) Math.ceil((View.MeasureSpec.getSize(i) * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth()), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
