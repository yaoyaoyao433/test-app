package com.meituan.android.ptcommonim.pageadapter.message.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.widget.MachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTIMMachViewGroup extends MachViewGroup {
    public static ChangeQuickRedirect a;
    public com.meituan.android.ptcommonim.pageadapter.message.item.b b;

    public PTIMMachViewGroup(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f7aa22e96bc2df262e037ae823e8d01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f7aa22e96bc2df262e037ae823e8d01");
        }
    }

    public PTIMMachViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fc8fb9b067b1ca189bd92b6e63bf8e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fc8fb9b067b1ca189bd92b6e63bf8e8");
        }
    }

    public PTIMMachViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfc65d8fb81671318aab16a34240ae1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfc65d8fb81671318aab16a34240ae1e");
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e07f5a5bfa6a50f9a80651ea86babb6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e07f5a5bfa6a50f9a80651ea86babb6d");
            return;
        }
        if (this.b != null) {
            if (this.b.o != null) {
                i = View.MeasureSpec.makeMeasureSpec(this.b.o.a, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(this.b.o.b, 1073741824);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        super.onMeasure(i, i2);
    }
}
