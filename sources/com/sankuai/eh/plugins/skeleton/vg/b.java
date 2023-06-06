package com.sankuai.eh.plugins.skeleton.vg;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b extends RelativeLayout {
    public static ChangeQuickRedirect a;

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b854660cbcd94809e5e1b1de4035fe6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b854660cbcd94809e5e1b1de4035fe6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "942cd87a4c468dde4e48ef6725f641d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "942cd87a4c468dde4e48ef6725f641d0");
            return;
        }
        if (Build.VERSION.SDK_INT == 22) {
            setTransitionGroup(true);
        }
        if (Build.VERSION.SDK_INT == 21) {
            setTransitionGroup(true);
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }
}
