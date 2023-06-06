package com.dianping.judas.util;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.dianping.judas.interfaces.c;
import com.dianping.widget.view.d;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static int a(View view) {
        d gAUserInfo;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "399fe5474a093f70af889cc664118012", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "399fe5474a093f70af889cc664118012")).intValue();
        }
        if (!(view instanceof com.dianping.judas.interfaces.c) || (gAUserInfo = ((com.dianping.judas.interfaces.c) view).getGAUserInfo()) == null || gAUserInfo.r == null) {
            return Integer.MAX_VALUE;
        }
        return gAUserInfo.r.intValue();
    }

    @Nullable
    public static d b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcaefcc570998ef42f5dac8651b22a0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcaefcc570998ef42f5dac8651b22a0e");
        }
        if (view != null && (view instanceof com.dianping.judas.interfaces.c)) {
            return (d) ((com.dianping.judas.interfaces.c) view).getGAUserInfo().clone();
        }
        return null;
    }

    public static String c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79c2daea159631eeb669ae081b95baae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79c2daea159631eeb669ae081b95baae");
        }
        if (view == null) {
            return "";
        }
        String gAString = view instanceof com.dianping.judas.interfaces.c ? ((com.dianping.judas.interfaces.c) view).getGAString() : "";
        if (TextUtils.isEmpty(gAString)) {
            try {
                String resourceName = view.getResources().getResourceName(view.getId());
                return resourceName.substring(resourceName.lastIndexOf("/") + 1);
            } catch (Exception unused) {
                a.a("get elementId failed, no view.getId()", new Object[0]);
            }
        }
        return gAString;
    }

    public static EventInfo a(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efbdc7a904c7c78f5908ef2e3ce4a167", RobustBitConfig.DEFAULT_VALUE)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efbdc7a904c7c78f5908ef2e3ce4a167");
        }
        if (view != null && (view instanceof com.dianping.judas.interfaces.c)) {
            if (str.equals("click")) {
                return ((com.dianping.judas.interfaces.c) view).b(c.a.CLICK);
            }
            if (str.equals(Constants.EventType.VIEW)) {
                return ((com.dianping.judas.interfaces.c) view).b(c.a.VIEW);
            }
            return null;
        }
        return null;
    }

    public static String d(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba5875a5ed50e85ef34ff0f9bb5750bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba5875a5ed50e85ef34ff0f9bb5750bd");
        }
        d b = b(view);
        if (b != null) {
            return b.H;
        }
        return null;
    }
}
