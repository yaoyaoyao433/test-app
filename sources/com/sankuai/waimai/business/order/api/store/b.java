package com.sankuai.waimai.business.order.api.store;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface b {
    Dialog showCouponListDialog(Activity activity, String str, DialogInterface.OnDismissListener onDismissListener);

    Dialog showDialog(Context context, Map<String, Object> map, String str);

    Dialog showNewCustomImageDialog(Activity activity, String str);

    void showSGMrnDialog(Context context, HashMap<String, String> hashMap, int i, String str, String str2, String str3);
}
