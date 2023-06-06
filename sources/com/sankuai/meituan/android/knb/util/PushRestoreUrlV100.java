package com.sankuai.meituan.android.knb.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PushRestoreUrlV100 {
    public static final String TAG = "PushRestoreUrlV100";
    private static final String URL_REGEX = "\\(\\d{1,3}\\)";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Map<String, String> sUrlMap;

    static {
        HashMap hashMap = new HashMap();
        sUrlMap = hashMap;
        hashMap.put("(1)", "http://m.dianping.com/");
        sUrlMap.put("(2)", "http://t.dianping.com/activity/");
        sUrlMap.put("(3)", "http://t.dianping.com/events/");
        sUrlMap.put("(4)", "http://tgapp.dianping.com/");
        sUrlMap.put("(5)", "http://evt.dianping.com/");
        sUrlMap.put("(6)", "http://event.dianping.com/market/");
    }

    public static String restoreUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2bcaa165d7fc162b335b647c4255bd04", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2bcaa165d7fc162b335b647c4255bd04");
        }
        if (TextUtils.isEmpty(str) || str.startsWith("http")) {
            return str;
        }
        Matcher matcher = Pattern.compile(URL_REGEX).matcher(str);
        if (matcher.find()) {
            if (matcher.start() != 0) {
                return "";
            }
            String str2 = sUrlMap.get(matcher.group());
            return TextUtils.isEmpty(str2) ? "" : matcher.replaceFirst(str2);
        }
        return str;
    }
}
