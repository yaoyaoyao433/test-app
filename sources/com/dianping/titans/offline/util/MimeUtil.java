package com.dianping.titans.offline.util;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.proxy.util.Constants;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MimeUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Map<String, String> sMimeMap = (Map) new Gson().fromJson("{\n\t\"atom\": \"application/atom+xml\",\n\t\"json\": \"application/json\",\n\t\"map\": \"application/json\",\n\t\"topojson\": \"application/json\",\n\t\"jsonld\": \"application/ld+json\",\n\t\"rss\": \"application/rss+xml\",\n\t\"geojson\": \"application/vnd.geo+json\",\n\t\"rdf\": \"application/xml\",\n\t\"xml\": \"application/xml\",\n\t\"js\": \"application/javascript\",\n\t\"webmanifest\": \"application/manifest+json\",\n\t\"webapp\": \"application/x-web-app-manifest+json\",\n\t\"appcache\": \"text/cache-manifest\",\n\t\"mid\": \"audio/midi\",\n\t\"midi\": \"audio/midi\",\n\t\"kar\": \"audio/midi\",\n\t\"aac\": \"audio/mp4\",\n\t\"f4a\": \"audio/mp4\",\n\t\"f4b\": \"audio/mp4\",\n\t\"m4a\": \"audio/mp4\",\n\t\"mp3\": \"audio/mpeg\",\n\t\"oga\": \"audio/ogg\",\n\t\"ogg\": \"audio/ogg\",\n\t\"opus\": \"audio/ogg\",\n\t\"ra\": \"audio/x-realaudio\",\n\t\"wav\": \"audio/x-wav\",\n\t\"bmp\": \"image/bmp\",\n\t\"gif\": \"image/gif\",\n\t\"jpeg\": \"image/jpeg\",\n\t\"jpg\": \"image/jpeg\",\n\t\"png\": \"image/png\",\n\t\"svg\": \"image/svg+xml\",\n\t\"svgz\": \"image/svg+xml\",\n\t\"tif\": \"image/tiff\",\n\t\"tiff\": \"image/tiff\",\n\t\"wbmp\": \"image/vnd.wap.wbmp\",\n\t\"webp\": \"image/webp\",\n\t\"jng\": \"image/x-jng\",\n\t\"3gp\": \"video/3gpp\",\n\t\"3gpp\": \"video/3gpp\",\n\t\"f4p\": \"video/mp4\",\n\t\"f4v\": \"video/mp4\",\n\t\"m4v\": \"video/mp4\",\n\t\"mp4\": \"video/mp4\",\n\t\"mpeg\": \"video/mpeg\",\n\t\"mpg\": \"video/mpeg\",\n\t\"ogv\": \"video/ogg\",\n\t\"mov\": \"video/quicktime\",\n\t\"webm\": \"video/webm\",\n\t\"flv\": \"video/x-flv\",\n\t\"mng\": \"video/x-mng\",\n\t\"asf\": \"video/x-ms-asf\",\n\t\"asx\": \"video/x-ms-asf\",\n\t\"wmv\": \"video/x-ms-wmv\",\n\t\"avi\": \"video/x-msvideo\",\n\t\"cur\": \"image/x-icon\",\n\t\"ico\": \"image/x-icon\",\n\t\"doc\": \"application/msword\",\n\t\"xls\": \"application/vnd.ms-excel\",\n\t\"ppt\": \"application/vnd.ms-powerpoint\",\n\t\"docx\": \"application/vnd.openxmlformats-officedocument.wordprocessingml.document\",\n\t\"xlsx\": \"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet\",\n\t\"pptx\": \"application/vnd.openxmlformats-officedocument.presentationml.presentation\",\n\t\"woff\": \"application/font-woff\",\n\t\"woff2\": \"application/font-woff2\",\n\t\"eot\": \"application/vnd.ms-fontobject\",\n\t\"ttc\": \"application/x-font-ttf\",\n\t\"ttf\": \"application/x-font-ttf\",\n\t\"otf\": \"font/opentype\",\n\t\"ear\": \"application/java-archive\",\n\t\"jar\": \"application/java-archive\",\n\t\"war\": \"application/java-archive\",\n\t\"hqx\": \"application/mac-binhex40\",\n\t\"bin\": \"application/octet-stream\",\n\t\"deb\": \"application/octet-stream\",\n\t\"dll\": \"application/octet-stream\",\n\t\"dmg\": \"application/octet-stream\",\n\t\"exe\": \"application/octet-stream\",\n\t\"img\": \"application/octet-stream\",\n\t\"iso\": \"application/octet-stream\",\n\t\"msi\": \"application/octet-stream\",\n\t\"msm\": \"application/octet-stream\",\n\t\"msp\": \"application/octet-stream\",\n\t\"safariextz\": \"application/octet-stream\",\n\t\"pdf\": \"application/pdf\",\n\t\"ai\": \"application/postscript\",\n\t\"eps\": \"application/postscript\",\n\t\"ps\": \"application/postscript\",\n\t\"rtf\": \"application/rtf\",\n\t\"kml\": \"application/vnd.google-earth.kml+xml\",\n\t\"kmz\": \"application/vnd.google-earth.kmz\",\n\t\"wmlc\": \"application/vnd.wap.wmlc\",\n\t\"7z\": \"application/x-7z-compressed\",\n\t\"bbaw\": \"application/x-bb-appworld\",\n\t\"torrent\": \"application/x-bittorrent\",\n\t\"crx\": \"application/x-chrome-extension\",\n\t\"cco\": \"application/x-cocoa\",\n\t\"jardiff\": \"application/x-java-archive-diff\",\n\t\"jnlp\": \"application/x-java-jnlp-file\",\n\t\"run\": \"application/x-makeself\",\n\t\"oex\": \"application/x-opera-extension\",\n\t\"pl\": \"application/x-perl\",\n\t\"pm\": \"application/x-perl\",\n\t\"pdb\": \"application/x-pilot\",\n\t\"prc\": \"application/x-pilot\",\n\t\"rar\": \"application/x-rar-compressed\",\n\t\"rpm\": \"application/x-redhat-package-manager\",\n\t\"sea\": \"application/x-sea\",\n\t\"swf\": \"application/x-shockwave-flash\",\n\t\"sit\": \"application/x-stuffit\",\n\t\"tcl\": \"application/x-tcl\",\n\t\"tk\": \"application/x-tcl\",\n\t\"crt\": \"application/x-x509-ca-cert\",\n\t\"der\": \"application/x-x509-ca-cert\",\n\t\"pem\": \"application/x-x509-ca-cert\",\n\t\"xpi\": \"application/x-xpinstall\",\n\t\"xhtml\": \"application/xhtml+xml\",\n\t\"xsl\": \"application/xslt+xml\",\n\t\"zip\": \"application/zip\",\n\t\"css\": \"text/css\",\n\t\"htm\": \"text/html\",\n\t\"html\": \"text/html\",\n\t\"shtml\": \"text/html\",\n\t\"mml\": \"text/mathml\",\n\t\"txt\": \"text/plain\",\n\t\"vcard\": \"text/vcard\",\n\t\"vcf\": \"text/vcard\",\n\t\"xloc\": \"text/vnd.rim.location.xloc\",\n\t\"jad\": \"text/vnd.sun.j2me.app-descriptor\",\n\t\"wml\": \"text/vnd.wap.wml\",\n\t\"vtt\": \"text/vtt\",\n\t\"htc\": \"text/x-component\"\n}", new TypeToken<HashMap<String, String>>() { // from class: com.dianping.titans.offline.util.MimeUtil.1
        public static ChangeQuickRedirect changeQuickRedirect;
    }.getType());

    public static String getDefaultMime(String str, boolean z) {
        String str2;
        int lastIndexOf;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "123a5c089b3350a606018625162cecfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "123a5c089b3350a606018625162cecfe");
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
}
