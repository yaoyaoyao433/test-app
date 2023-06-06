package com.sankuai.titans.adapter.base.observers;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.config.Access;
import com.sankuai.titans.config.Scheme;
import com.sankuai.titans.protocol.utils.UrlUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SankuaiUrlUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean isUrlInAccessBlack(String str, Access access) {
        List<String> black;
        Object[] objArr = {str, access};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6403c6558cc3bebeeb196ffa044809e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6403c6558cc3bebeeb196ffa044809e")).booleanValue();
        }
        if (access == null || (black = access.getBlack()) == null || black.size() == 0) {
            return false;
        }
        return equalsWithHostAndPath(str, new HashSet(black));
    }

    public static boolean isUrlInAccessWhite(String str, Access access) {
        List<String> white;
        Object[] objArr = {str, access};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "027ef0d0b9cd10ca17a24c467262f30b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "027ef0d0b9cd10ca17a24c467262f30b")).booleanValue();
        }
        if (access == null || (white = access.getWhite()) == null || white.size() == 0) {
            return false;
        }
        return UrlUtils.hostEndWith(str, new HashSet(white));
    }

    public static boolean isSchemeInWhite(String str, Set<String> set, Scheme scheme) {
        Object[] objArr = {str, set, scheme};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "58613c4c484b2fe1b32c6ad3ffbe40f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "58613c4c484b2fe1b32c6ad3ffbe40f1")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (set == null || !set.contains(str)) {
            List<String> white = scheme.getWhite();
            if (white == null || white.size() == 0) {
                return false;
            }
            return white.contains(str.toLowerCase());
        }
        return true;
    }

    public static boolean equalsWithHostAndPath(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5215445ec2c3f228fb7a1d27402dc1bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5215445ec2c3f228fb7a1d27402dc1bc")).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str) && set != null && set.size() != 0) {
                Uri parse = Uri.parse(str);
                String host = parse.getHost();
                if (TextUtils.isEmpty(host)) {
                    return false;
                }
                StringBuilder sb = new StringBuilder(host);
                String path = parse.getPath();
                if (!TextUtils.isEmpty(path)) {
                    sb.append(path);
                }
                return set.contains(sb.toString());
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isScheme(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f506c7067059132c67f0145ab928988", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f506c7067059132c67f0145ab928988")).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if (str == null || scheme == null) {
            return false;
        }
        return str.toLowerCase().equals(scheme.toLowerCase());
    }

    public static boolean isSchemeHTTPOrHTTPS(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6574c6834584e0743e4dacbd568de1a0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6574c6834584e0743e4dacbd568de1a0")).booleanValue() : isScheme(uri, "http") || isScheme(uri, "https");
    }
}
