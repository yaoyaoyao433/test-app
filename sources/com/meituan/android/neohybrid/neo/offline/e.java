package com.meituan.android.neohybrid.neo.offline;

import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import com.dianping.titans.offline.OfflineCenter;
import com.dianping.titans.offline.entity.OfflineRuleItem;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    @Nullable
    public static OfflineRuleItem a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3ba4ca808c2884ab2ef57c9cfb0471d", RobustBitConfig.DEFAULT_VALUE)) {
            return (OfflineRuleItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3ba4ca808c2884ab2ef57c9cfb0471d");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        OfflineCenter offlineCenter = OfflineCenter.getInstance();
        String a2 = a(Uri.parse(str));
        if (offlineCenter != null) {
            return offlineCenter.getOfflineResouce(a2);
        }
        return null;
    }

    @Nullable
    public static byte[] a(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9af820e5c6456e0225db91fe327ed187", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9af820e5c6456e0225db91fe327ed187");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr, 0, 512);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Nullable
    public static String a(@Nullable Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8695ed43f3b4b1be223ad7801e765e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8695ed43f3b4b1be223ad7801e765e6");
        }
        if (uri == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        if (scheme != null) {
            sb.append(scheme);
            sb.append(CommonConstant.Symbol.COLON);
        }
        if (uri.isOpaque()) {
            sb.append(uri.getEncodedSchemeSpecificPart());
        } else {
            String encodedAuthority = uri.getEncodedAuthority();
            if (encodedAuthority != null) {
                sb.append("//");
                sb.append(encodedAuthority);
            }
            String encodedPath = uri.getEncodedPath();
            if (encodedPath != null) {
                sb.append(encodedPath);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @MTPaySuppressFBWarnings({"BC_IMPOSSIBLE_INSTANCEOF", "BC_VACUOUS_INSTANCEOF"})
    public static Pair<d, String> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cdb739bc23eed172e3d6120c943c3c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cdb739bc23eed172e3d6120c943c3c5");
        }
        try {
            OfflineRuleItem a2 = a(str);
            if (a2 == null) {
                return new Pair<>(d.NON_EXIST_DIO_PATH, null);
            }
            InputStream resourcePath = a2.getResourcePath();
            if (resourcePath instanceof InputStream) {
                Pair<d, String> pair = new Pair<>(d.EXIST, str);
                resourcePath.close();
                com.meituan.android.neohybrid.util.f.a("KNB离线化 url=" + str);
                return pair;
            }
            return new Pair<>(d.NON_EXIST_EXCEPTION, null);
        } catch (Exception unused) {
            return new Pair<>(d.NON_EXIST_EXCEPTION, null);
        }
    }
}
