package com.sankuai.waimai.foundation.core.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static String[] b = {"KingKongActivity", "LocateManuallyActivity", "WMRestaurantActivity", "MainActivity", "GoodDetailActivity", "FriendCommentActivity", "OrderConfirmActivity", "MyCommentActivity", "TransferActivity", "TakeoutActivity", "GlobalCartActivity", "SelfDeliveryRestaurantActivity", "CrossOrderConfirmActivity"};

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e8d6ae705d18c866f9013d70faedfaf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e8d6ae705d18c866f9013d70faedfaf")).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : b) {
                if (str.endsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
