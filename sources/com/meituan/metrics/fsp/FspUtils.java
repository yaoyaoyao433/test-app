package com.meituan.metrics.fsp;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.util.AppUtils;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.map.geolocation.internal.TencentExtraKeys;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FspUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean isNeedDetect(Activity activity, FspConfig fspConfig) {
        Object[] objArr = {activity, fspConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "350903717ab42c98d5336621918fc5ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "350903717ab42c98d5336621918fc5ee")).booleanValue();
        }
        if (fspConfig.isOpen()) {
            String pageName = AppUtils.getPageName(activity);
            if (fspConfig.inWhiteList(pageName)) {
                return true;
            }
            if (TextUtils.isEmpty(pageName) || pageName.contains(ContainerInfo.ENV_MMP) || pageName.contains("mgc") || pageName.toLowerCase().contains("webview") || pageName.contains(DiagnoseLog.H5) || pageName.toLowerCase().contains("knb") || pageName.contains("wxapi") || pageName.contains(UserCenter.OAUTH_TYPE_QQ) || pageName.contains("sina") || pageName.toLowerCase().contains("bridge") || pageName.toLowerCase().contains(TencentExtraKeys.LOCATION_KEY_ROUTE) || pageName.toLowerCase().contains("trans") || pageName.contains("Dialog") || pageName.contains("DspActivity")) {
                return false;
            }
            return (Metrics.debug || !(pageName.toLowerCase().contains("mrn") || pageName.contains("reactnative"))) && !fspConfig.inBlackList(pageName);
        }
        return false;
    }

    public static boolean isValidAreaView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b3ce7a559c935bab8741e71bfd50efc9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b3ce7a559c935bab8741e71bfd50efc9")).booleanValue();
        }
        if (view == null) {
            return false;
        }
        if ((Build.VERSION.SDK_INT < 19 || view.isAttachedToWindow()) && !view.getClass().equals(View.class)) {
            return FspIniter.getFspIgnoreViewList() == null || !FspIniter.getFspIgnoreViewList().contains(view.getClass());
        }
        return false;
    }

    public static boolean isValidView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fdc516afc203357a18180255716c757e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fdc516afc203357a18180255716c757e")).booleanValue();
        }
        if ((view instanceof ImageView) && ((ImageView) view).getDrawable() == null) {
            return false;
        }
        return ((view instanceof ViewGroup) && view.getBackground() == null) ? false : true;
    }
}
