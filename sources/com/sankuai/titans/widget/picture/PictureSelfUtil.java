package com.sankuai.titans.widget.picture;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PictureSelfUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void getPictureSelf(Activity activity, int i, Bundle bundle) {
        Object[] objArr = {activity, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d432b5ffe1700451debf8d5974de5ceb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d432b5ffe1700451debf8d5974de5ceb");
        } else if (activity instanceof FragmentActivity) {
            new PictureSelfV4((FragmentActivity) activity).getPicture(i, bundle);
        } else {
            new PictureSelf(activity).getPicture(i, bundle);
        }
    }
}
