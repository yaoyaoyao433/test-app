package com.sankuai.waimai.store.util;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OnScrollTopManager implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final List<String> SCROLL_TOP_SINGLETON = new ArrayList();
    private static boolean isFirstScrollToTop = true;

    public static void onScrollTop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "410d1dae745118408fa30bd7d345797d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "410d1dae745118408fa30bd7d345797d");
        } else if (isFirstScrollToTop) {
            notifyScrollTop();
        } else {
            onDestroy();
        }
    }

    private static void notifyScrollTop() {
        isFirstScrollToTop = false;
    }

    private static void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba865390d4c46ff2f112271aa2bcc86b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba865390d4c46ff2f112271aa2bcc86b");
        } else {
            SCROLL_TOP_SINGLETON.clear();
        }
    }
}
