package com.sankuai.common.utils;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class IntentCreator {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Intent fromUri(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6156729568a352c9ac132867196c0fd4", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6156729568a352c9ac132867196c0fd4") : fromUri(uri, null);
    }

    public static Intent fromUri(Uri uri, Bundle bundle) {
        Object[] objArr = {uri, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0eb4881c8113f971f653f724a994f51", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0eb4881c8113f971f653f724a994f51");
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addCategory("android.intent.category.DEFAULT");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }
}
