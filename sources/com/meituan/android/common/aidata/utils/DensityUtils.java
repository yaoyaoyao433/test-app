package com.meituan.android.common.aidata.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DensityUtils {
    private static final String TAG = "DensityUtils";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int sScreenHeight;
    private static int sScreenWidth;

    public static int getScreenWidth(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1f692b451ab4efaba53aa18764548502", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1f692b451ab4efaba53aa18764548502")).intValue();
        }
        if (sScreenWidth <= 0) {
            try {
                sScreenWidth = context.getResources().getDisplayMetrics().widthPixels;
            } catch (Exception e) {
                new StringBuilder("get screen width failed: ").append(e);
            }
        }
        return sScreenWidth;
    }

    public static int getScreenHeight(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "15cb347c5772b882ef46a04472e43908", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "15cb347c5772b882ef46a04472e43908")).intValue();
        }
        if (sScreenHeight <= 0) {
            try {
                sScreenHeight = context.getResources().getDisplayMetrics().heightPixels;
            } catch (Exception e) {
                new StringBuilder("get screen height failed: ").append(e);
            }
        }
        return sScreenHeight;
    }
}
