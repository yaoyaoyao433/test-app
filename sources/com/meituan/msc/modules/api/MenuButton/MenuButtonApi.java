package com.meituan.msc.modules.api.MenuButton;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.constraint.R;
import com.meituan.msc.common.utils.n;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.page.e;
import com.meituan.msc.modules.page.f;
import com.meituan.msc.modules.page.view.CustomNavigationBar;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class MenuButtonApi extends MSCApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "getMenuButtonBoundingClientRect")
    public void getMenuButtonBoundingClientRect(MsiContext msiContext) {
        int dimension;
        int fixedHeight;
        int i;
        int a2;
        int i2;
        int i3 = 0;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "963af545598f3a7caa313c5544e95e4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "963af545598f3a7caa313c5544e95e4d");
            return;
        }
        e c = c(msiContext);
        if (c == null) {
            msiContext.onError("pageModule is null!");
            return;
        }
        f k = c.k();
        if (k == null) {
            msiContext.onError("pageNavigationBarMethods is null!");
            return;
        }
        if (k.a()) {
            Rect d = k.d();
            if (d != null) {
                i3 = d.width();
                dimension = d.height();
                fixedHeight = d.top;
                i = d.bottom;
                a2 = d.left;
                i2 = d.right;
            } else {
                msiContext.onError("getMenuRect is null");
                return;
            }
        } else {
            Activity activity = msiContext.getActivity();
            dimension = (int) activity.getResources().getDimension(R.dimen.msc_capsule_height);
            fixedHeight = ((CustomNavigationBar.getFixedHeight() - dimension) / 2) + n.c();
            i = fixedHeight + dimension;
            a2 = n.a((Context) activity) - n.b(15);
            i2 = a2;
        }
        MenuButtonResponse menuButtonResponse = new MenuButtonResponse();
        menuButtonResponse.width = n.a(i3);
        menuButtonResponse.height = n.a(dimension);
        menuButtonResponse.top = n.a(fixedHeight);
        menuButtonResponse.bottom = n.a(i);
        menuButtonResponse.left = n.a(a2);
        menuButtonResponse.right = n.a(i2);
        msiContext.onSuccess(menuButtonResponse);
    }
}
