package com.meituan.android.neohybrid.util;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, String str2);
    }

    public static void a(Uri uri, Map<String, String> map) {
        Object[] objArr = {uri, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfaaabfe4650899aedb87022518cf4d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfaaabfe4650899aedb87022518cf4d0");
        } else {
            a(uri, map, true);
        }
    }

    private static void a(Uri uri, Map<String, String> map, boolean z) {
        Object[] objArr = {uri, map, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8dac99f551480832a4472ca4cb6d747f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8dac99f551480832a4472ca4cb6d747f");
        } else if (uri == null || map == null) {
        } else {
            a(uri, m.a((Map) map, true));
        }
    }

    private static void a(Uri uri, a aVar) {
        int i = 0;
        Object[] objArr = {uri, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1527d3d8308858cb20cc73ca3c92cda3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1527d3d8308858cb20cc73ca3c92cda3");
        } else if (uri == null || uri.isOpaque() || aVar == null) {
        } else {
            String encodedQuery = uri.getEncodedQuery();
            if (TextUtils.isEmpty(encodedQuery)) {
                return;
            }
            int length = encodedQuery.length();
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i);
                int i2 = indexOf != -1 ? indexOf : length;
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > i2 || indexOf2 == -1) {
                    indexOf2 = i2;
                }
                if (indexOf2 > i) {
                    String substring = encodedQuery.substring(i, indexOf2);
                    String substring2 = indexOf2 == i2 ? "" : encodedQuery.substring(indexOf2 + 1, i2);
                    if ("url".equalsIgnoreCase(substring) && substring2.contains(CommonConstant.Symbol.QUESTION_MARK)) {
                        substring2 = encodedQuery.substring(indexOf2 + 1);
                    }
                    aVar.a(Uri.decode(substring), Uri.decode(substring2));
                }
                if (indexOf == -1) {
                    return;
                }
                i = indexOf + 1;
            }
        }
    }
}
