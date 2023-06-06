package com.meituan.msc.jse.bridge;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.content.res.ResourcesCompat;
import android.util.TypedValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ColorPropConverter {
    private static final String ATTR = "attr";
    private static final String ATTR_SEGMENT = "attr/";
    private static final String JSON_KEY = "resource_paths";
    private static final String PACKAGE_DELIMITER = ":";
    private static final String PATH_DELIMITER = "/";
    private static final String PREFIX_ATTR = "?";
    private static final String PREFIX_RESOURCE = "@";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Integer getColor(Object obj, Context context) {
        Object[] objArr = {obj, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2b3cf49bbe8c4075f75b3efc667d4aca", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2b3cf49bbe8c4075f75b3efc667d4aca");
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (context == null) {
            throw new RuntimeException("Context may not be null.");
        }
        if (obj instanceof ReadableMap) {
            ReadableArray array = ((ReadableMap) obj).getArray(JSON_KEY);
            if (array == null) {
                throw new JSApplicationCausedNativeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
            }
            for (int i = 0; i < array.size(); i++) {
                String string = array.getString(i);
                if (string != null && !string.isEmpty()) {
                    boolean startsWith = string.startsWith("@");
                    boolean startsWith2 = string.startsWith("?");
                    String substring = string.substring(1);
                    try {
                        if (startsWith) {
                            return Integer.valueOf(resolveResource(context, substring));
                        }
                        if (startsWith2) {
                            return Integer.valueOf(resolveThemeAttribute(context, substring));
                        }
                    } catch (Resources.NotFoundException unused) {
                        continue;
                    }
                }
            }
            throw new JSApplicationCausedNativeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
        }
        throw new JSApplicationCausedNativeException("ColorValue: the value must be a number or Object.");
    }

    private static int resolveResource(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc3e2342fd34471df20556b82a1ad11b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc3e2342fd34471df20556b82a1ad11b")).intValue();
        }
        String[] split = str.split(":");
        String packageName = context.getPackageName();
        if (split.length > 1) {
            packageName = split[0];
            str = split[1];
        }
        String[] split2 = str.split("/");
        return ResourcesCompat.getColor(context.getResources(), context.getResources().getIdentifier(split2[1], split2[0], packageName), context.getTheme());
    }

    private static int resolveThemeAttribute(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5013e31d87d6651ee8571c8e040ad4af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5013e31d87d6651ee8571c8e040ad4af")).intValue();
        }
        String replaceAll = str.replaceAll(ATTR_SEGMENT, "");
        String[] split = replaceAll.split(":");
        String packageName = context.getPackageName();
        if (split.length > 1) {
            packageName = split[0];
            replaceAll = split[1];
        }
        int identifier = context.getResources().getIdentifier(replaceAll, ATTR, packageName);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(identifier, typedValue, true)) {
            return typedValue.data;
        }
        throw new Resources.NotFoundException();
    }
}
