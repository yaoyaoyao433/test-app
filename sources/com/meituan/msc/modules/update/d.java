package com.meituan.msc.modules.update;

import android.text.TextUtils;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cec91170523d7521e14ef775460e1e93", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cec91170523d7521e14ef775460e1e93");
        }
        if (strArr == null) {
            return "unknown";
        }
        if (strArr.length > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("/");
            for (String str : strArr) {
                sb.append(a(str));
                sb.append(CommonConstant.Symbol.COMMA);
            }
            return sb.substring(0, sb.length() - 1);
        }
        String str2 = strArr[0];
        return "/" + a(str2);
    }

    public static String a(String str) {
        int indexOf;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe7856b9be59e95acd26122d10a246b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe7856b9be59e95acd26122d10a246b6");
        }
        if (str.startsWith(MMPAppProp.PREFIX_FRAMEWORK)) {
            return str.replace(MMPAppProp.PREFIX_FRAMEWORK, "mscsdk_base.dio/");
        }
        if (str.startsWith("/__app/main_app/")) {
            return str.replace("/__app/main_app/", "main_app.dio/");
        }
        if (!str.startsWith("/__app/") || (indexOf = str.indexOf(File.separatorChar, f.d)) <= f.d) {
            return "unknown";
        }
        String substring = str.substring(f.d, indexOf);
        return str.replace("/__app/" + substring, substring + MRNBundleManager.DIO_BUNDLE_SUFFIX);
    }

    public static String a(PackageInfoWrapper packageInfoWrapper) {
        Object[] objArr = {packageInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50bddcb276a2266b9fc2cb007e1f08a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50bddcb276a2266b9fc2cb007e1f08a1");
        }
        if (TextUtils.isEmpty(packageInfoWrapper.getLocalPath())) {
            return "unknown";
        }
        if (packageInfoWrapper.packageType == 1) {
            return "/" + packageInfoWrapper.getDDResourceName() + ".dio/service.js";
        } else if (packageInfoWrapper.packageType == 2) {
            return "/main_app.dio/app-service.js";
        } else {
            if (packageInfoWrapper.packageType == 3) {
                return "/" + packageInfoWrapper.getDDResourceName() + ".dio/app-service.js";
            }
            return "unknown";
        }
    }
}
