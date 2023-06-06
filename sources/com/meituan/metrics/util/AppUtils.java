package com.meituan.metrics.util;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.crashreporter.f;
import com.meituan.metrics.MetricsNameProvider;
import com.meituan.metrics.MetricsPageNameProvider;
import com.meituan.metrics.MetricsTagsProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AppUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getPageName(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "814ca5a1ca0a3abb8f37ef5c90a56605", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "814ca5a1ca0a3abb8f37ef5c90a56605") : getPageName(activity, "");
    }

    public static String getPageName(Activity activity, String str) {
        Class a;
        Class pageClass;
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ff53bcfc4f6e44e5a3c66245827cc654", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ff53bcfc4f6e44e5a3c66245827cc654");
        }
        if (activity == null) {
            return str;
        }
        if ((activity instanceof MetricsPageNameProvider) && (pageClass = ((MetricsPageNameProvider) activity).getPageClass()) != null) {
            return pageClass.getName();
        }
        if (activity instanceof MetricsNameProvider) {
            return ((MetricsNameProvider) activity).getName();
        }
        if ((activity instanceof f) && (a = ((f) activity).a()) != null) {
            return a.getName();
        }
        return activity.getClass().getName();
    }

    public static String tryToGetFragmentNameFromActivity(Activity activity) {
        List<Fragment> fragments;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c972ccea217526c12c8967ac67ceea48", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c972ccea217526c12c8967ac67ceea48");
        }
        if ((activity instanceof FragmentActivity) && (fragments = ((FragmentActivity) activity).getSupportFragmentManager().getFragments()) != null) {
            for (Fragment fragment : fragments) {
                if (fragment instanceof MetricsNameProvider) {
                    return ((MetricsNameProvider) fragment).getName();
                }
            }
        }
        return null;
    }

    public static Map<String, Object> getCustomTags(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "930bab109c8d63a2ca1cb4049300513a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "930bab109c8d63a2ca1cb4049300513a");
        }
        if (activity == null || TextUtils.isEmpty(str) || !(activity instanceof MetricsTagsProvider)) {
            return null;
        }
        return ((MetricsTagsProvider) activity).getTags(str);
    }

    public static Map<String, Object> tryToGetFragmentTagsFromActivity(Activity activity, String str) {
        List<Fragment> fragments;
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7f6161c46bf27989065b006fe2d7367", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7f6161c46bf27989065b006fe2d7367");
        }
        if ((activity instanceof FragmentActivity) && (fragments = ((FragmentActivity) activity).getSupportFragmentManager().getFragments()) != null) {
            for (Fragment fragment : fragments) {
                if (fragment instanceof MetricsTagsProvider) {
                    return ((MetricsTagsProvider) fragment).getTags(str);
                }
            }
        }
        return null;
    }

    public static Map<String, Object> getCustomTags(Activity activity, Object obj, String str) {
        String name;
        Object[] objArr = {activity, obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d8b29d863de8e752faef788fe88de7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d8b29d863de8e752faef788fe88de7c");
        }
        Map<String, Object> customTags = getCustomTags(activity, str);
        if (obj != null) {
            if (customTags == null) {
                customTags = new HashMap<>();
            }
            if (obj instanceof MetricsNameProvider) {
                name = ((MetricsNameProvider) obj).getName();
            } else {
                name = obj.getClass().getName();
            }
            customTags.put("fragment", name);
        }
        return customTags;
    }
}
