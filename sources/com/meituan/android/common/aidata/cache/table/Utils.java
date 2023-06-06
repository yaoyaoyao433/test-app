package com.meituan.android.common.aidata.cache.table;

import android.database.Cursor;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Utils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Object get(Cursor cursor, int i, String str) {
        Object[] objArr = {cursor, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a2220519ddc1d824f3f16c6e6a749086", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a2220519ddc1d824f3f16c6e6a749086");
        }
        int type = cursor.getType(i);
        if (type != 4) {
            switch (type) {
                case 0:
                    return null;
                case 1:
                    if (DataConstants.IS_AUTO.equals(str) || "nt".equals(str) || "is_local".equals(str)) {
                        return Integer.valueOf(cursor.getInt(i));
                    }
                    return Long.valueOf(cursor.getLong(i));
                case 2:
                    return Double.valueOf(cursor.getDouble(i));
                default:
                    return cursor.getString(i);
            }
        }
        return cursor.getBlob(i);
    }
}
