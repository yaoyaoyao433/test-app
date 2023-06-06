package com.sankuai.xm.base.util;

import com.dianping.titans.utils.Constants;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static final String[][] b = {new String[]{".3gp", "video/3gpp"}, new String[]{".apk", "application/vnd.android.package-archive"}, new String[]{".asf", "video/x-ms-asf"}, new String[]{".avi", "video/x-msvideo"}, new String[]{".bin", "application/octet-stream"}, new String[]{".bmp", "image/bmp"}, new String[]{".c", "text/plain"}, new String[]{".class", "application/octet-stream"}, new String[]{".conf", "text/plain"}, new String[]{".cpp", "text/plain"}, new String[]{".doc", "application/msword"}, new String[]{".exe", "application/octet-stream"}, new String[]{".gif", "image/gif"}, new String[]{".gtar", "application/x-gtar"}, new String[]{".gz", "application/x-gzip"}, new String[]{".h", "text/plain"}, new String[]{".htm", Constants.MIME_TYPE_HTML}, new String[]{".html", Constants.MIME_TYPE_HTML}, new String[]{".jar", "application/java-archive"}, new String[]{".java", "text/plain"}, new String[]{".jpeg", "image/jpeg"}, new String[]{".jpg", "image/jpeg"}, new String[]{".heic", "image/heic"}, new String[]{".heif", "image/heif"}, new String[]{".webp", "image/webp"}, new String[]{".js", "application/x-javascript"}, new String[]{".log", "text/plain"}, new String[]{".m3u", "audio/x-mpegurl"}, new String[]{".m4a", "audio/mp4a-latm"}, new String[]{".m4b", "audio/mp4a-latm"}, new String[]{".m4p", "audio/mp4a-latm"}, new String[]{".m4u", "video/vnd.mpegurl"}, new String[]{".m4v", "video/x-m4v"}, new String[]{".mov", "video/quicktime"}, new String[]{".mp2", "audio/x-mpeg"}, new String[]{".mp3", "audio/x-mpeg"}, new String[]{".mp4", "video/mp4"}, new String[]{".mpc", "application/vnd.mpohun.certificate"}, new String[]{".mpe", "video/mpeg"}, new String[]{".mpeg", "video/mpeg"}, new String[]{".mpg", "video/mpeg"}, new String[]{".mpg4", "video/mp4"}, new String[]{".mpga", "audio/mpeg"}, new String[]{".msg", "application/vnd.ms-outlook"}, new String[]{".ogg", "audio/ogg"}, new String[]{".pdf", "application/pdf"}, new String[]{".png", "image/png"}, new String[]{".pps", "application/vnd.ms-powerpoint"}, new String[]{".ppt", "application/vnd.ms-powerpoint"}, new String[]{".prop", "text/plain"}, new String[]{".rar", "application/x-rar-compressed"}, new String[]{".rc", "text/plain"}, new String[]{".rmvb", "audio/x-pn-realaudio"}, new String[]{".rtf", "application/rtf"}, new String[]{".sh", "text/plain"}, new String[]{".tar", "application/x-tar"}, new String[]{".tgz", "application/x-compressed"}, new String[]{".txt", "text/plain"}, new String[]{".wav", "audio/x-wav"}, new String[]{".wma", "audio/x-ms-wma"}, new String[]{".wmv", "audio/x-ms-wmv"}, new String[]{".wps", "application/vnd.ms-works"}, new String[]{".xml", "text/plain"}, new String[]{".z", "application/x-compress"}, new String[]{MRNBundleManager.MRN_BUNDLE_SUFFIX, "application/zip"}, new String[]{"", "*/*"}};

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e51eb1edd0e6ea4d3097f28f1245c78", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e51eb1edd0e6ea4d3097f28f1245c78");
        }
        int lastIndexOf = str.lastIndexOf(CommonConstant.Symbol.DOT);
        if (lastIndexOf < 0) {
            return "*/*";
        }
        String lowerCase = str.substring(lastIndexOf).toLowerCase();
        if (lowerCase.equals("")) {
            return "*/*";
        }
        String str2 = "*/*";
        for (int i = 0; i < b.length; i++) {
            if (lowerCase.equals(b[i][0])) {
                str2 = b[i][1];
            }
        }
        return str2;
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f60fb3be853447cf7dfe6f8cd3258ad5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f60fb3be853447cf7dfe6f8cd3258ad5");
        }
        if (ac.a(str)) {
            return null;
        }
        for (int i = 0; i < b.length; i++) {
            if (str.equals(b[i][0])) {
                return b[i][1];
            }
        }
        return null;
    }
}
