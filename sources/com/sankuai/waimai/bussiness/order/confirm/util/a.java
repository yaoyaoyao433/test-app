package com.sankuai.waimai.bussiness.order.confirm.util;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public JSONObject a(String str, Activity activity) {
        Cursor cursor;
        Object[] objArr = {str, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ff554633ce38bf736bd094c92616731", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ff554633ce38bf736bd094c92616731");
        }
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        t createContentResolver = Privacy.createContentResolver(activity, "com.sankuai.waimai:order-mt");
        JSONObject jSONObject = new JSONObject();
        try {
            cursor = createContentResolver.a(parse, null, null, new String[]{str}, null);
            if (cursor != null) {
                try {
                    cursor.moveToFirst();
                    if (cursor.getColumnCount() > 4) {
                        String string = cursor.getString(1);
                        String string2 = cursor.getString(2);
                        String string3 = cursor.getString(4);
                        try {
                            if (!TextUtils.isEmpty(string)) {
                                jSONObject.put("onClickTime", string);
                            }
                            if (!TextUtils.isEmpty(string2)) {
                                jSONObject.put("installFinishTime", string2);
                            }
                            if (!TextUtils.isEmpty(string3)) {
                                jSONObject.put("trackId", string3);
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return jSONObject;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }
}
