package com.sankuai.waimai.business.address.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CompatiblePopupWindow extends PopupWindow {
    public static ChangeQuickRedirect a;
    protected Context b;

    public CompatiblePopupWindow() {
    }

    public CompatiblePopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50bcef8bf2d43ece28eddc6064857448", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50bcef8bf2d43ece28eddc6064857448");
        } else {
            this.b = context;
        }
    }

    public CompatiblePopupWindow(View view, int i, int i2) {
        super(view, -2, -2);
        Object[] objArr = {view, -2, -2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24bb09ba72aa82787fc1d49d8f5dd429", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24bb09ba72aa82787fc1d49d8f5dd429");
        } else {
            this.b = view.getContext();
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7486be7aeb5d36150e60fa6fd50c159", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7486be7aeb5d36150e60fa6fd50c159");
        } else if (Build.VERSION.SDK_INT < 24) {
            try {
                super.showAsDropDown(view);
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int height = iArr[1] + view.getHeight();
            if (Build.VERSION.SDK_INT >= 25 && this.b != null) {
                setHeight(this.b.getResources().getDisplayMetrics().heightPixels - height);
            }
            try {
                p.a(this, view, 0, 0, height);
            } catch (Exception e2) {
                com.dianping.judas.util.a.a(e2);
            }
        }
    }
}
