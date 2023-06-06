package com.sankuai.titans.protocol.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocalIdUtils {
    public static final String FROM_CLIENT = "client";
    public static final String KEY_TOKEN_QUERY = "sceneToken";
    public static final String SCHEMA = "knb-media";
    public static final String URL = "url";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean isValid(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "99fa2d89f1ea7f107f576a55b5eed97e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "99fa2d89f1ea7f107f576a55b5eed97e")).booleanValue() : TextUtils.equals(uri.getScheme(), "knb-media");
    }

    public static boolean isContentResource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d0c75aad622ab1a6b4f259f990500380", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d0c75aad622ab1a6b4f259f990500380")).booleanValue() : URLUtil.isContentUrl(str);
    }

    public static InputStream getInputStream(Context context, String str) {
        InputStream fileInputStream;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c69d2d2f093e1b8dae037bd3bae29fd4", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c69d2d2f093e1b8dae037bd3bae29fd4");
        }
        Uri parse = Uri.parse(str);
        if (isValid(parse)) {
            String host = parse.getHost();
            if (parse.isHierarchical() && "client".equals(host)) {
                try {
                    String queryParameter = parse.getQueryParameter("url");
                    String queryParameter2 = parse.getQueryParameter("sceneToken");
                    if (TextUtils.isEmpty(queryParameter)) {
                        return null;
                    }
                    if (isContentResource(queryParameter)) {
                        fileInputStream = ContentResolverProvider.getContentResolver(context, queryParameter2).b(Uri.parse(queryParameter));
                    } else {
                        fileInputStream = new FileInputStream(new File(queryParameter));
                    }
                    return fileInputStream;
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
