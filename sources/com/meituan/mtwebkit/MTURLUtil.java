package com.meituan.mtwebkit;

import android.net.Uri;
import com.dianping.titans.utils.Constants;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class MTURLUtil {
    public static final String ASSET_BASE = "file:///android_asset/";
    public static final String CONTENT_BASE = "content:";
    private static final Pattern CONTENT_DISPOSITION_PATTERN = Pattern.compile("attachment;\\s*filename\\s*=\\s*(\"?)([^\"]*)\\1\\s*$", 2);
    public static final String FILE_BASE = "file:";
    private static final String LOGTAG = "webkit";
    public static final String PROXY_BASE = "file:///cookieless_proxy/";
    public static final String RESOURCE_BASE = "file:///android_res/";
    private static final boolean TRACE = false;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String guessUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a78ac9600f27cb4dd76419a22d0736f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a78ac9600f27cb4dd76419a22d0736f");
        }
        if (str.length() == 0 || str.startsWith("about:") || str.startsWith("data:") || str.startsWith(FILE_BASE) || str.startsWith(TitansConstants.JAVASCRIPT_PREFIX)) {
            return str;
        }
        try {
            MTWebAddress mTWebAddress = new MTWebAddress(str.endsWith(CommonConstant.Symbol.DOT) ? str.substring(0, str.length() - 1) : str);
            if (mTWebAddress.getHost().indexOf(46) == -1) {
                mTWebAddress.setHost("www." + mTWebAddress.getHost() + ".com");
            }
            return mTWebAddress.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String composeSearchUrl(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dd995dda2b81b143fcf04177de3a1afa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dd995dda2b81b143fcf04177de3a1afa");
        }
        int indexOf = str2.indexOf(str3);
        if (indexOf < 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2.substring(0, indexOf));
        try {
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append(str2.substring(indexOf + str3.length()));
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static byte[] decode(byte[] bArr) throws IllegalArgumentException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83f82d5ad96c79a16d01550a73344421", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83f82d5ad96c79a16d01550a73344421");
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 37) {
                if (bArr.length - i > 2) {
                    i += 2;
                    b = (byte) ((parseHex(bArr[i + 1]) * 16) + parseHex(bArr[i]));
                } else {
                    throw new IllegalArgumentException("Invalid format");
                }
            }
            bArr2[i2] = b;
            i++;
            i2++;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr2, 0, bArr3, 0, i2);
        return bArr3;
    }

    private static int parseHex(byte b) {
        Object[] objArr = {Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc2e060de2ccc09f143af30ac16e9edb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc2e060de2ccc09f143af30ac16e9edb")).intValue();
        }
        if (b < 48 || b > 57) {
            if (b < 65 || b > 70) {
                if (b < 97 || b > 102) {
                    throw new IllegalArgumentException("Invalid hex char '" + ((int) b) + CommonConstant.Symbol.SINGLE_QUOTES);
                }
                return (b - 97) + 10;
            }
            return (b - 65) + 10;
        }
        return b - 48;
    }

    public static boolean isAssetUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a9c2703b5a3c08cb65727c9d47453d2a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a9c2703b5a3c08cb65727c9d47453d2a")).booleanValue() : str != null && str.startsWith(ASSET_BASE);
    }

    public static boolean isResourceUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "04a1d7a4aa79b9acba66e5ae7ebab32a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "04a1d7a4aa79b9acba66e5ae7ebab32a")).booleanValue() : str != null && str.startsWith(RESOURCE_BASE);
    }

    @Deprecated
    public static boolean isCookielessProxyUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "415e8340cc317c158283a3e813a6437c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "415e8340cc317c158283a3e813a6437c")).booleanValue() : str != null && str.startsWith(PROXY_BASE);
    }

    public static boolean isFileUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "824a44b5ce5b751a211b81c49ac55508", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "824a44b5ce5b751a211b81c49ac55508")).booleanValue() : (str == null || !str.startsWith(FILE_BASE) || str.startsWith(ASSET_BASE) || str.startsWith(PROXY_BASE)) ? false : true;
    }

    public static boolean isAboutUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b8520e873a66751cf91371b0fbba6b49", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b8520e873a66751cf91371b0fbba6b49")).booleanValue() : str != null && str.startsWith("about:");
    }

    public static boolean isDataUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1eb8cfa2fab453306815db8d300b807d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1eb8cfa2fab453306815db8d300b807d")).booleanValue() : str != null && str.startsWith("data:");
    }

    public static boolean isJavaScriptUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "88f7c27e47b8eb78da40d1f223b6b026", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "88f7c27e47b8eb78da40d1f223b6b026")).booleanValue() : str != null && str.startsWith(TitansConstants.JAVASCRIPT_PREFIX);
    }

    public static boolean isHttpUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86843544b7b88a77c8ad4c02f4c60aa1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86843544b7b88a77c8ad4c02f4c60aa1")).booleanValue() : str != null && str.length() > 6 && str.substring(0, 7).equalsIgnoreCase(AbsApiFactory.HTTP);
    }

    public static boolean isHttpsUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df02ead1363f5269510176fef2c877f9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df02ead1363f5269510176fef2c877f9")).booleanValue() : str != null && str.length() > 7 && str.substring(0, 8).equalsIgnoreCase(AbsApiFactory.HTTPS);
    }

    public static boolean isNetworkUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1fcee15435378b7f1f803a0d815358f7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1fcee15435378b7f1f803a0d815358f7")).booleanValue();
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        return isHttpUrl(str) || isHttpsUrl(str);
    }

    public static boolean isContentUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c621bc4e286991d69e56d573de0101ff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c621bc4e286991d69e56d573de0101ff")).booleanValue() : str != null && str.startsWith(CONTENT_BASE);
    }

    public static boolean isValidUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a66679682a30d5f4526ec5bf2520b3c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a66679682a30d5f4526ec5bf2520b3c")).booleanValue();
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        return isAssetUrl(str) || isResourceUrl(str) || isFileUrl(str) || isAboutUrl(str) || isHttpUrl(str) || isHttpsUrl(str) || isJavaScriptUrl(str) || isContentUrl(str);
    }

    public static String stripAnchor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b85cf71e1c7fdfec7e93cc8c9fbe3769", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b85cf71e1c7fdfec7e93cc8c9fbe3769");
        }
        int indexOf = str.indexOf(35);
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    public static final String guessFileName(String str, String str2, String str3) {
        String str4;
        String mimeTypeFromExtension;
        String decode;
        int lastIndexOf;
        int lastIndexOf2;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        String str5 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e014f795cf4b48ad72e331f62ab1904", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e014f795cf4b48ad72e331f62ab1904");
        }
        if (str2 != null) {
            str4 = parseContentDisposition(str2);
            if (str4 != null && (lastIndexOf2 = str4.lastIndexOf(47) + 1) > 0) {
                str4 = str4.substring(lastIndexOf2);
            }
        } else {
            str4 = null;
        }
        if (str4 == null && (decode = Uri.decode(str)) != null) {
            int indexOf = decode.indexOf(63);
            if (indexOf > 0) {
                decode = decode.substring(0, indexOf);
            }
            if (!decode.endsWith("/") && (lastIndexOf = decode.lastIndexOf(47) + 1) > 0) {
                str4 = decode.substring(lastIndexOf);
            }
        }
        if (str4 == null) {
            str4 = "downloadfile";
        }
        int indexOf2 = str4.indexOf(46);
        if (indexOf2 < 0) {
            if (str3 != null && (str5 = MTMimeTypeMap.getSingleton().getExtensionFromMimeType(str3)) != null) {
                str5 = CommonConstant.Symbol.DOT + str5;
            }
            if (str5 == null) {
                if (str3 == null || !str3.toLowerCase(Locale.ROOT).startsWith("text/")) {
                    str5 = ".bin";
                } else {
                    str5 = str3.equalsIgnoreCase(Constants.MIME_TYPE_HTML) ? ".html" : ".txt";
                }
            }
        } else {
            if (str3 != null && (mimeTypeFromExtension = MTMimeTypeMap.getSingleton().getMimeTypeFromExtension(str4.substring(str4.lastIndexOf(46) + 1))) != null && !mimeTypeFromExtension.equalsIgnoreCase(str3) && (str5 = MTMimeTypeMap.getSingleton().getExtensionFromMimeType(str3)) != null) {
                str5 = CommonConstant.Symbol.DOT + str5;
            }
            if (str5 == null) {
                str5 = str4.substring(indexOf2);
            }
            str4 = str4.substring(0, indexOf2);
        }
        return str4 + str5;
    }

    public static String parseContentDisposition(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "55fdb36dc6fbee86d4052bcaa885d8cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "55fdb36dc6fbee86d4052bcaa885d8cd");
        }
        try {
            Matcher matcher = CONTENT_DISPOSITION_PATTERN.matcher(str);
            if (matcher.find()) {
                return matcher.group(2);
            }
        } catch (IllegalStateException unused) {
        }
        return null;
    }
}
