package com.meituan.metrics.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NetUtils {
    private static final int HEADER_ROW_STOCK_SIZE = 4;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int getStringByteSize(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ae60f9b0eb67da33596f129f47c0344", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ae60f9b0eb67da33596f129f47c0344")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return str.length();
    }

    public static int getHeaderByteSize(Map<String, List<String>> map) {
        int i = 0;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d6bd4ee4be5fab5925cbeaf36e71cd93", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d6bd4ee4be5fab5925cbeaf36e71cd93")).intValue();
        }
        if (map != null) {
            for (String str : map.keySet()) {
                if (str == null || !str.startsWith("nt_")) {
                    int stringByteSize = getStringByteSize(str) + 4;
                    List<String> list = map.get(str);
                    if (list instanceof List) {
                        List<String> list2 = list;
                        if (list2 == null || list2.size() == 0) {
                            i += stringByteSize;
                        } else {
                            for (String str2 : list2) {
                                i += getStringByteSize(str2) + stringByteSize;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }
}
