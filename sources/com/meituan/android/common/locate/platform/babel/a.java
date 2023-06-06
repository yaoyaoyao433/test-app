package com.meituan.android.common.locate.platform.babel;

import android.content.Context;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.locate.provider.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class a {
    private static volatile a a;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b4f121b777b5c0a7336d21ecadf54e2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b4f121b777b5c0a7336d21ecadf54e2d");
        }
        if (a == null) {
            a(g.a());
        }
        return a;
    }

    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5d9af943fe130cf19d09a42bb10c4921", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5d9af943fe130cf19d09a42bb10c4921");
        }
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    public void a(String str, ConcurrentHashMap concurrentHashMap) {
        Object[] objArr = {str, concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74061fc3652fae6bebad3f9bd58b8343", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74061fc3652fae6bebad3f9bd58b8343");
        } else {
            Babel.logRT(new Log.Builder(str).tag(str).optional(concurrentHashMap).reportChannel(str).lv4LocalStatus(true).token("60af91bf1c9d4405a95144b2").build());
        }
    }
}
