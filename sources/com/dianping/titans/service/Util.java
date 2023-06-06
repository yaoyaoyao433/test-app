package com.dianping.titans.service;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.proxy.util.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class Util {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Map<String, String> sHeaderMap;
    private static final char[] sHexChar;
    private static Map<String, String> sMimeMap = (Map) new Gson().fromJson("{\n\t\"atom\": \"application/atom+xml\",\n\t\"json\": \"application/json\",\n\t\"map\": \"application/json\",\n\t\"topojson\": \"application/json\",\n\t\"jsonld\": \"application/ld+json\",\n\t\"rss\": \"application/rss+xml\",\n\t\"geojson\": \"application/vnd.geo+json\",\n\t\"rdf\": \"application/xml\",\n\t\"xml\": \"application/xml\",\n\t\"js\": \"application/javascript\",\n\t\"webmanifest\": \"application/manifest+json\",\n\t\"webapp\": \"application/x-web-app-manifest+json\",\n\t\"appcache\": \"text/cache-manifest\",\n\t\"mid\": \"audio/midi\",\n\t\"midi\": \"audio/midi\",\n\t\"kar\": \"audio/midi\",\n\t\"aac\": \"audio/mp4\",\n\t\"f4a\": \"audio/mp4\",\n\t\"f4b\": \"audio/mp4\",\n\t\"m4a\": \"audio/mp4\",\n\t\"mp3\": \"audio/mpeg\",\n\t\"oga\": \"audio/ogg\",\n\t\"ogg\": \"audio/ogg\",\n\t\"opus\": \"audio/ogg\",\n\t\"ra\": \"audio/x-realaudio\",\n\t\"wav\": \"audio/x-wav\",\n\t\"bmp\": \"image/bmp\",\n\t\"gif\": \"image/gif\",\n\t\"jpeg\": \"image/jpeg\",\n\t\"jpg\": \"image/jpeg\",\n\t\"png\": \"image/png\",\n\t\"svg\": \"image/svg+xml\",\n\t\"svgz\": \"image/svg+xml\",\n\t\"tif\": \"image/tiff\",\n\t\"tiff\": \"image/tiff\",\n\t\"wbmp\": \"image/vnd.wap.wbmp\",\n\t\"webp\": \"image/webp\",\n\t\"jng\": \"image/x-jng\",\n\t\"3gp\": \"video/3gpp\",\n\t\"3gpp\": \"video/3gpp\",\n\t\"f4p\": \"video/mp4\",\n\t\"f4v\": \"video/mp4\",\n\t\"m4v\": \"video/mp4\",\n\t\"mp4\": \"video/mp4\",\n\t\"mpeg\": \"video/mpeg\",\n\t\"mpg\": \"video/mpeg\",\n\t\"ogv\": \"video/ogg\",\n\t\"mov\": \"video/quicktime\",\n\t\"webm\": \"video/webm\",\n\t\"flv\": \"video/x-flv\",\n\t\"mng\": \"video/x-mng\",\n\t\"asf\": \"video/x-ms-asf\",\n\t\"asx\": \"video/x-ms-asf\",\n\t\"wmv\": \"video/x-ms-wmv\",\n\t\"avi\": \"video/x-msvideo\",\n\t\"cur\": \"image/x-icon\",\n\t\"ico\": \"image/x-icon\",\n\t\"doc\": \"application/msword\",\n\t\"xls\": \"application/vnd.ms-excel\",\n\t\"ppt\": \"application/vnd.ms-powerpoint\",\n\t\"docx\": \"application/vnd.openxmlformats-officedocument.wordprocessingml.document\",\n\t\"xlsx\": \"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet\",\n\t\"pptx\": \"application/vnd.openxmlformats-officedocument.presentationml.presentation\",\n\t\"woff\": \"application/font-woff\",\n\t\"woff2\": \"application/font-woff2\",\n\t\"eot\": \"application/vnd.ms-fontobject\",\n\t\"ttc\": \"application/x-font-ttf\",\n\t\"ttf\": \"application/x-font-ttf\",\n\t\"otf\": \"font/opentype\",\n\t\"ear\": \"application/java-archive\",\n\t\"jar\": \"application/java-archive\",\n\t\"war\": \"application/java-archive\",\n\t\"hqx\": \"application/mac-binhex40\",\n\t\"bin\": \"application/octet-stream\",\n\t\"deb\": \"application/octet-stream\",\n\t\"dll\": \"application/octet-stream\",\n\t\"dmg\": \"application/octet-stream\",\n\t\"exe\": \"application/octet-stream\",\n\t\"img\": \"application/octet-stream\",\n\t\"iso\": \"application/octet-stream\",\n\t\"msi\": \"application/octet-stream\",\n\t\"msm\": \"application/octet-stream\",\n\t\"msp\": \"application/octet-stream\",\n\t\"safariextz\": \"application/octet-stream\",\n\t\"pdf\": \"application/pdf\",\n\t\"ai\": \"application/postscript\",\n\t\"eps\": \"application/postscript\",\n\t\"ps\": \"application/postscript\",\n\t\"rtf\": \"application/rtf\",\n\t\"kml\": \"application/vnd.google-earth.kml+xml\",\n\t\"kmz\": \"application/vnd.google-earth.kmz\",\n\t\"wmlc\": \"application/vnd.wap.wmlc\",\n\t\"7z\": \"application/x-7z-compressed\",\n\t\"bbaw\": \"application/x-bb-appworld\",\n\t\"torrent\": \"application/x-bittorrent\",\n\t\"crx\": \"application/x-chrome-extension\",\n\t\"cco\": \"application/x-cocoa\",\n\t\"jardiff\": \"application/x-java-archive-diff\",\n\t\"jnlp\": \"application/x-java-jnlp-file\",\n\t\"run\": \"application/x-makeself\",\n\t\"oex\": \"application/x-opera-extension\",\n\t\"pl\": \"application/x-perl\",\n\t\"pm\": \"application/x-perl\",\n\t\"pdb\": \"application/x-pilot\",\n\t\"prc\": \"application/x-pilot\",\n\t\"rar\": \"application/x-rar-compressed\",\n\t\"rpm\": \"application/x-redhat-package-manager\",\n\t\"sea\": \"application/x-sea\",\n\t\"swf\": \"application/x-shockwave-flash\",\n\t\"sit\": \"application/x-stuffit\",\n\t\"tcl\": \"application/x-tcl\",\n\t\"tk\": \"application/x-tcl\",\n\t\"crt\": \"application/x-x509-ca-cert\",\n\t\"der\": \"application/x-x509-ca-cert\",\n\t\"pem\": \"application/x-x509-ca-cert\",\n\t\"xpi\": \"application/x-xpinstall\",\n\t\"xhtml\": \"application/xhtml+xml\",\n\t\"xsl\": \"application/xslt+xml\",\n\t\"zip\": \"application/zip\",\n\t\"css\": \"text/css\",\n\t\"htm\": \"text/html\",\n\t\"html\": \"text/html\",\n\t\"shtml\": \"text/html\",\n\t\"mml\": \"text/mathml\",\n\t\"txt\": \"text/plain\",\n\t\"vcard\": \"text/vcard\",\n\t\"vcf\": \"text/vcard\",\n\t\"xloc\": \"text/vnd.rim.location.xloc\",\n\t\"jad\": \"text/vnd.sun.j2me.app-descriptor\",\n\t\"wml\": \"text/vnd.wap.wml\",\n\t\"vtt\": \"text/vtt\",\n\t\"htc\": \"text/x-component\"\n}", new TypeToken<HashMap<String, String>>() { // from class: com.dianping.titans.service.Util.1
        public static ChangeQuickRedirect changeQuickRedirect;
    }.getType());

    static {
        HashMap hashMap = new HashMap();
        sHeaderMap = hashMap;
        hashMap.put("Access-Control-Allow-Origin", "*");
        sHeaderMap.put("Timing-Allow-Origin", "*");
        sHeaderMap.put("Cache-Control", "no-cache");
        sHeaderMap.put("Pragma", "no-cache");
        sHexChar = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static String getDefaultMime(String str, boolean z) {
        String str2;
        int lastIndexOf;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4b521c4f555d1a7099cb5952a19fac22", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4b521c4f555d1a7099cb5952a19fac22");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (z) {
            return sMimeMap.get(Constants.KEY_CONTENT_TYPE_HTML);
        }
        try {
            str2 = Uri.parse(str).getLastPathSegment();
        } catch (Exception unused) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) || (lastIndexOf = str2.lastIndexOf(CommonConstant.Symbol.DOT)) < 0) {
            return null;
        }
        return sMimeMap.get(str2.substring(lastIndexOf + 1));
    }

    public static Map<String, String> getDefaultHeaders(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9afbf96dfc735e1c64737f086411888c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9afbf96dfc735e1c64737f086411888c");
        }
        HashMap hashMap = new HashMap(sHeaderMap);
        hashMap.put("Content-Type", getDefaultMime(str, false));
        return hashMap;
    }

    public static void closeCloseable(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "80ae731402395c82b5a2d35fde5c4350", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "80ae731402395c82b5a2d35fde5c4350");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void copyFile(File file, File file2) throws IOException {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        Object[] objArr = {file, file2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        FileOutputStream fileOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0035b48a6d10006e76a58c599ac21310", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0035b48a6d10006e76a58c599ac21310");
            return;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    closeCloseable(fileOutputStream);
                    closeCloseable(fileInputStream);
                    return;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            closeCloseable(fileOutputStream2);
            closeCloseable(fileInputStream);
            throw th;
        }
    }

    public static String getMD5(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "085f1310b465dc3da9af0fe7f7e00a46", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "085f1310b465dc3da9af0fe7f7e00a46");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(), 0, str.getBytes().length);
            return toHexString(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    public static String toHexString(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0a4292b18fc8cd55bc118d1589ef202f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0a4292b18fc8cd55bc118d1589ef202f");
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(sHexChar[(b & 240) >>> 4]);
            sb.append(sHexChar[b & 15]);
        }
        return sb.toString();
    }

    public static String getUrlMD5Safe(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9c564e44c40126a1b43c5630efa1ea5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9c564e44c40126a1b43c5630efa1ea5b");
        }
        String md5 = getMD5(str);
        return !TextUtils.isEmpty(md5) ? md5 : Base64.encodeToString(str.getBytes(), 8);
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb4aa8d40cb6b11d4fda3969bd44ac48", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb4aa8d40cb6b11d4fda3969bd44ac48");
        }
        try {
            return (T) GsonProvider.getGson().fromJson(str, (Class<Object>) cls);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T fromJson(String str, Type type) {
        Object[] objArr = {str, type};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8bb0f9f628330db73132d669ed480971", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8bb0f9f628330db73132d669ed480971");
        }
        try {
            return (T) GsonProvider.getGson().fromJson(str, type);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> String toJsonString(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1ae021d45456bf4d6129abdcec5106d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1ae021d45456bf4d6129abdcec5106d7");
        }
        try {
            return GsonProvider.getGson().toJson(t);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int trans2BEInt(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7e7b2d3af68cda4ef51acbb9dd03fc17", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7e7b2d3af68cda4ef51acbb9dd03fc17")).intValue();
        }
        if (bArr == null || i + 4 > bArr.length) {
            throw new IllegalArgumentException();
        }
        return (bArr[i] << 24) | (bArr[i + 3] & 255) | (bArr[i + 2] << 8) | (bArr[i + 1] << 16);
    }
}
