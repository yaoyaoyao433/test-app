package com.sankuai.waimai.store.router;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef1e686adf58450fdaa7d9c54260f42c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef1e686adf58450fdaa7d9c54260f42c");
        }
        if (t.a(str)) {
            return "";
        }
        if (t.a(str2)) {
            return str;
        }
        if (str.indexOf(CommonConstant.Symbol.QUESTION_MARK, str.indexOf(CommonConstant.Symbol.COLON)) > 0) {
            return str + "&" + str2;
        }
        return str + CommonConstant.Symbol.QUESTION_MARK + str2;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b46d7e18abdc6e0abb4dcd0485baf629", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b46d7e18abdc6e0abb4dcd0485baf629") : a(false, str, str);
    }

    public static String a(boolean z, String str, String str2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efef5b42f41735ca111084397b3f58d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efef5b42f41735ca111084397b3f58d4");
        }
        return a(z ? h.j : h.g, "supermarket", str, str2);
    }

    public static String a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1a2f70a13a3b8cc6893028b1ade43ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1a2f70a13a3b8cc6893028b1ade43ac");
        }
        String a2 = a(str2, str3, str4);
        if (t.a(a2)) {
            return str;
        }
        return str + CommonConstant.Symbol.QUESTION_MARK + a2;
    }

    @NonNull
    private static String a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6eedb999abfa710e1e0c3735c947005", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6eedb999abfa710e1e0c3735c947005");
        }
        if (t.a(str3)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            str = "supermarket";
        }
        sb.append("mrn_biz=");
        sb.append(str);
        sb.append("&mrn_component");
        sb.append("=");
        sb.append(str2);
        sb.append("&mrn_entry");
        sb.append("=");
        sb.append(str3);
        return sb.toString();
    }

    public static String a(HashMap<String, String> hashMap) {
        boolean z = true;
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ec90f82851fd64ff4661156b3843816", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ec90f82851fd64ff4661156b3843816");
        }
        if (hashMap == null || hashMap.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key) && entry.getValue() != null) {
                if (z) {
                    sb.append(key);
                    sb.append("=");
                    sb.append(entry.getValue());
                    z = false;
                } else {
                    sb.append("&");
                    sb.append(key);
                    sb.append("=");
                    sb.append(entry.getValue());
                }
            }
        }
        return sb.toString();
    }
}
