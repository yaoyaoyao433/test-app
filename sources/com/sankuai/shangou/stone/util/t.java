package com.sankuai.shangou.stone.util;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class t {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a<T> {
        String a(T t);
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a19f28cbc3f2eb2572d7c1c24573a50", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a19f28cbc3f2eb2572d7c1c24573a50")).booleanValue() : TextUtils.isEmpty(str) || StringUtil.NULL.equals(str);
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f2b2829480196118fce155c26c9ae74", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f2b2829480196118fce155c26c9ae74");
        }
        Object[] objArr2 = {str, ""};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d32a02426f5e3c898a9823e204fd320f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d32a02426f5e3c898a9823e204fd320f") : TextUtils.isEmpty(str) ? "" : str;
    }

    @NonNull
    public static String a(List<String> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd9c3ae4dc831eb7e4b7bd160e2a945a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd9c3ae4dc831eb7e4b7bd160e2a945a");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.isEmpty(list.get(i))) {
                sb.append(list.get(i));
                if (i < list.size() - 1) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    @NonNull
    public static <T> String a(List<T> list, a<? super T> aVar, String str) {
        Object[] objArr = {list, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af944f7ba133a6ac1f06a75daa12a142", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af944f7ba133a6ac1f06a75daa12a142");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.isEmpty(aVar.a(list.get(i)))) {
                sb.append(aVar.a(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    @NonNull
    public static <T> String b(List<T> list, a<? super T> aVar, String str) {
        Object[] objArr = {list, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe14d4330af7fcff9ffcee5e2784c789", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe14d4330af7fcff9ffcee5e2784c789");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.isEmpty(aVar.a(list.get(i)))) {
                if (sb.length() > 0) {
                    sb.append(str);
                }
                sb.append(aVar.a(list.get(i)));
            }
        }
        return sb.toString();
    }
}
