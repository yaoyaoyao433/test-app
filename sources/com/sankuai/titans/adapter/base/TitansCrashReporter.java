package com.sankuai.titans.adapter.base;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.crashreporter.a;
import com.meituan.crashreporter.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansCrashReporter {
    private static final String TAG = "TitansCrashReporter";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String sKNBUrl;
    private static final Map<String, String> sKNBUrlMap = new HashMap();

    public static void registerCrashProvider(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9e4304094188cd348b083b893ad1acf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9e4304094188cd348b083b893ad1acf9");
        } else if (context == null) {
        } else {
            c.c().a(new a() { // from class: com.sankuai.titans.adapter.base.TitansCrashReporter.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.crashreporter.a
                public final Map<String, Object> getCrashInfo(String str, boolean z) {
                    Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a440549bf1faa5a351d23a4b73340b89", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a440549bf1faa5a351d23a4b73340b89");
                    }
                    HashMap hashMap = new HashMap();
                    if (TextUtils.isEmpty(TitansCrashReporter.sKNBUrl)) {
                        return hashMap;
                    }
                    hashMap.put("knbUrl", TitansCrashReporter.sKNBUrl);
                    return hashMap;
                }
            });
        }
    }

    public static void putUrlInMap(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "126b88d3b7b7a9fce26d772299fd7f74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "126b88d3b7b7a9fce26d772299fd7f74");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            Log.e(TAG, "putUrlInMap:[key=" + str + ",url=" + str2 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            sKNBUrlMap.put(str, str2);
            sKNBUrl = str2;
        }
    }

    public static void changeUrlFromMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "44a383141cadee07398fc6937f8faef8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "44a383141cadee07398fc6937f8faef8");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            String str2 = sKNBUrlMap.get(str);
            Log.e(TAG, "changeUrlFromMap:[key=" + str + ",url=" + str2 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            sKNBUrl = str2;
        }
    }

    public static void removeUrlFromMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06e4757bd19370f505c0223b0f378261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06e4757bd19370f505c0223b0f378261");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Log.e(TAG, "removeUrlFromMap:[key=" + str + ",url=" + sKNBUrlMap.remove(str) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            sKNBUrl = null;
        }
    }

    public static void clearKNBUrl() {
        sKNBUrl = null;
    }
}
