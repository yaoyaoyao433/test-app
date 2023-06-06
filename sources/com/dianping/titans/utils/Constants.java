package com.dianping.titans.utils;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.URLEncoder;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class Constants {
    public static final String BASE_ERROR_URL = "https://static.meituan.net/bs/mbs-pages/master/error.html";
    public static final String BUNDLE_OVERSEA = "https://bundle.live-better.io/bundles";
    public static final String BUNDLE_STAGING = "https://bundle.meituan.com/bundles/v2";
    public static String BUNDLE_URL = "https://bundle.meituan.com/bundles/v2";
    public static final boolean DEBUG = false;
    public static final String DEBUG_BUNDLE_URL = "http://bundle-server.fe.test.sankuai.com/bundles/v2";
    public static final int DEFAULT_COLOR = -1;
    public static final String ENCODING_UTF = "UTF-8";
    public static final String ERROR_TYPE_HTTP_ERROR = "httpError";
    public static final String ERROR_TYPE_SSL_ERROR = "sslError";
    public static String FLAVOR = "knb_flavor";
    public static final String HTTP_HEADER_KEY_ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
    public static final String HTTP_HEADER_KEY_ACCESS_CONTROL_REQUEST_HEADERS = "Access-Control-Request-Headers";
    public static final String HTTP_HEADER_KEY_CONTENT_TYPE = "Content-Type";
    public static final String HTTP_HEADER_KEY_COOKIE = "Cookie";
    public static final String HTTP_HEADER_KEY_E_TAG = "etag";
    public static final String HTTP_HEADER_KEY_LAST_MODIFIED = "last-modified";
    public static final String HTTP_HEADER_KEY_SET_COOKIE = "Set-Cookie";
    public static final String HTTP_HEADER_KEY_X_TITANSX_BODY = "X-TitansX-Body";
    public static final String HTTP_HEADER_KEY_X_TITANSX_HASH = "x-titansx-hash";
    public static final String MIME_TYPE_HTML = "text/html";
    public static final String MIME_TYPE_PLAIN = "text/plain";
    public static String MONITOR_FOR_H5_BITMAP = "monitor_4_h5_bitmap";
    public static final String MULTI_PROCESS_ACTION = "knb.multiprocess";
    public static final String MULTI_PROCESS_PID = "pid";
    public static final String MULTI_PROCESS_PUBLISH_DATA = "publish";
    public static final String MULTI_PROCESS_STORE_KEY = "storeKey";
    public static final String MULTI_PROCESS_STORE_LEVEL = "storeLevel";
    public static final String MULTI_PROCESS_STORE_VALUE = "storeValue";
    public static final String MULTI_PROCESS_TYPE = "type";
    public static final int MULTI_PROCESS_TYPE_CLEAR_STORE = 4;
    public static final int MULTI_PROCESS_TYPE_GET_STORE = 0;
    public static final int MULTI_PROCESS_TYPE_SET_STORE = 1;
    public static final String QUERY_IS_KNB_DEBUG = "isKNBDebug";
    public static final int REQUEST_CODE_FOR_FILE_CHOOSE = 3;
    public static final int REQUEST_CODE_FOR_FILE_CHOOSE_NEW = 4;
    public static final int REQUEST_CODE_FOR_OPENPAGE = 110;
    public static final int REQ_PERMISSION_FOR_PERMISSION_REQUEST = 302;
    public static final String SET_RESULT_KEY = "resultData";
    public static final String TAG_PREFIX = "knb_";
    public static final String TITANS = "titans";
    public static final String TITANS_CHANNEL = "mtplatform_titans";
    public static final String TITANS_COOKIE_NETWORK_TOKEN = "pt-9099367dd7fbc289";
    public static final String TITANS_DOWNLOAD = "pt-1772329138bd898d";
    public static final String TITANS_LONG_CLICK_DOWNLOAD_TOKEN = "pt-e5d5124c14e96708";
    public static final String TITANS_NETWORK_CHANGE_TOKEN = "pt-e855f47ed9ccf2a5";
    public static final String TITANS_REQUEST_PERMISSION_TOKEN = "pt-572df3720da87bef";
    public static final String TITANS_RETRY_NETWORK_TOKEN = "pt-f80fb8336a87b895";
    public static final String TITANS_SHAKE_TOKEN = "";
    public static final String TITANS_SHOW_FILE_CHOOSER_TOKEN = "pt-ff6806d93a784560";
    public static final String URL_FOR_BLACK_LIST = "https://static.meituan.net/bs/mbs-pages/master/error-url.html";
    public static final String URL_MEITUAN_BASE = "http://i.meituan.com";
    public static final String URL_PARAM_IMG_TITLE_URL = "imagetitleurl";
    public static final String URL_PARAM_NEW_TASK = "_new_task";
    public static final String URL_PARAM_NO_RESULT = "noresult";
    public static final String URL_PARAM_OPEN_IN_APP = "_knbopeninapp";
    public static final String URL_PARAM_PROGRESS_COLOR = "progresscolor";
    public static final String WEBSAFE_BRIDGE_PATH = "/bridge";
    public static String WEBSAFE_HOST = "https://websafe.meituan.com";
    public static final String WEBSAFE_HOST_OVERSEA = "https://websafe.live-better.io";
    public static final String WEBSAFE_HOST_STAGING = "https://websafe.meituan.com";
    public static final String WEBSAFE_PATH = "/websafe";
    public static final String WEBVIEW = "webview";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getErrorUrl(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "db86517f544da6abc38758daa146ce19", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "db86517f544da6abc38758daa146ce19");
        }
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String script = Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "";
        String country = locale.getCountry();
        return String.format("%1$s&type=%2$s&summary=%3$s&info=%4$s&", "https://static.meituan.net/bs/mbs-pages/master/error.html?language=" + language + "&script=" + script + "&country=" + country, str, URLEncoder.encode(str2), URLEncoder.encode(str3));
    }
}
