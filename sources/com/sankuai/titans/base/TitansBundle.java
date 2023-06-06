package com.sankuai.titans.base;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.utils.UIKit;
import java.net.URLDecoder;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansBundle {
    private static final int FUTURE_TYPE_DYNAMIC_TITLE_BAR = 1;
    public static final int FUTURE_TYPE_HIDE_NAVIGATION = 4;
    public static final int FUTURE_TYPE_IMMERSIVE = 2;
    public static final String KEY_ORIGINAL_URI = "_k_k_o_u_";
    private static final String PARAM_FUTURE = "future";
    private static final String PARAM_NO_QUERY = "noquery";
    public static final String PARAM_NO_TITLE_BAR = "notitlebar";
    private static final String PARAM_OPEN_IN_APP = "openInApp";
    private static final String PARAM_OPEN_IN_APP_OLDER = "_knbopeninapp";
    private static final String PARAM_ORIGINAL_URI = "_k_k_o_u_";
    private static final String PARAM_PROGRESS_COLOR = "progresscolor";
    private static final String PARAM_REFERER_SOURCE = "referer_source";
    private static final String PARAM_REFERER_URL = "referer";
    public static final String PARAM_SHOW_LOADING = "showLoading";
    private static final String PARAM_THIRD_PARTY = "thirdparty";
    private static final String PARAM_TITLE_BAR_BG_COLOR = "titlebarBgColor";
    private static final String PARAM_WEB_BG_COLOR = "webColor";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Bundle extrasBundle;
    private int future;
    private boolean hasTitleBar;
    private boolean noQuery;
    private int openInApp;
    private String progressBarColor;
    private String refererSource;
    private String refererUrl;
    private int schemeWebBgColor;
    private boolean showLoading;
    private boolean thirdParty;
    private String titleBarBgColor;
    private String url;

    public TitansBundle(Context context, String str) {
        this(str, wrapBundle(context));
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "841c41af4262961e116dab9a5812a4d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "841c41af4262961e116dab9a5812a4d3");
        }
    }

    public TitansBundle(String str, Bundle bundle) {
        Object[] objArr = {str, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80a6936a507c2728d0533d914b19bde0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80a6936a507c2728d0533d914b19bde0");
            return;
        }
        this.thirdParty = false;
        this.hasTitleBar = true;
        this.showLoading = false;
        this.future = 0;
        this.noQuery = false;
        this.openInApp = 0;
        this.schemeWebBgColor = -1;
        this.extrasBundle = bundle;
        if (isArgsIn(this.extrasBundle, "notitlebar", new String[]{"1", "true"})) {
            this.hasTitleBar = false;
        }
        if (isArgsIn(this.extrasBundle, PARAM_THIRD_PARTY, new String[]{"1", "true"})) {
            this.thirdParty = true;
        }
        if (isArgsIn(this.extrasBundle, PARAM_NO_QUERY, new String[]{"1", "true"})) {
            this.noQuery = true;
        }
        this.future = getIntArgs(this.extrasBundle, PARAM_FUTURE, 0);
        if (getIntArgs(this.extrasBundle, PARAM_OPEN_IN_APP, 0) > 0) {
            this.openInApp = getIntArgs(this.extrasBundle, PARAM_OPEN_IN_APP, 0);
        }
        if (this.openInApp == 0 && getIntArgs(this.extrasBundle, "_knbopeninapp", 0) == 1) {
            this.openInApp = 1;
        }
        this.url = getUrlFromBundle(this.extrasBundle, str);
        this.refererUrl = this.extrasBundle.getString("referer", null);
        this.refererSource = this.extrasBundle.getString("referer_source", null);
        this.progressBarColor = this.extrasBundle.getString("progresscolor");
        this.titleBarBgColor = this.extrasBundle.getString(PARAM_TITLE_BAR_BG_COLOR);
        String string = this.extrasBundle.getString(PARAM_WEB_BG_COLOR, "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            this.schemeWebBgColor = UIKit.getRGBAColor(string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getIntArgs(Bundle bundle, String str, int i) {
        Object[] objArr = {bundle, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e0e6c16bd7d0f62956b48b8291f6509", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e0e6c16bd7d0f62956b48b8291f6509")).intValue();
        }
        String string = bundle.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            return i;
        }
        try {
            return Integer.parseInt(string);
        } catch (Throwable th) {
            Titans.serviceManager().getStatisticsService().reportClassError("TitansBundle", "getIntArgs", th);
            return i;
        }
    }

    private boolean isArgsIn(Bundle bundle, String str, String[] strArr) {
        Object[] objArr = {bundle, str, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "798aaa3c16b4f579743a29c64bf9bae6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "798aaa3c16b4f579743a29c64bf9bae6")).booleanValue();
        }
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        return Arrays.asList(strArr).contains(bundle.getString(str, null));
    }

    private String getUrlFromBundle(Bundle bundle, String str) {
        Object[] objArr = {bundle, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ad6104ed98499c970f74eaed944d2e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ad6104ed98499c970f74eaed944d2e5");
        }
        String string = bundle.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            string = bundle.getString("_k_k_o_u_");
        }
        if (TextUtils.isEmpty(string)) {
            return string;
        }
        if (!URLUtil.isHttpsUrl(string) && !URLUtil.isHttpUrl(string)) {
            try {
                string = URLDecoder.decode(string);
            } catch (Exception e) {
                Titans.serviceManager().getStatisticsService().reportClassError("TitansBundle", "getUrlFromBundle", e);
            }
        }
        if (string.startsWith("//")) {
            return "https:" + string;
        }
        return string;
    }

    @NonNull
    public Bundle getExtrasBundle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a62fdca4c4c18d3f2273baafba70d59", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a62fdca4c4c18d3f2273baafba70d59");
        }
        this.extrasBundle = this.extrasBundle != null ? this.extrasBundle : new Bundle();
        return this.extrasBundle;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isThirdParty() {
        return this.thirdParty;
    }

    public boolean hasTitleBar() {
        return this.hasTitleBar;
    }

    public boolean isShowLoading() {
        return this.showLoading;
    }

    public int getFuture() {
        return this.future;
    }

    public boolean isNoQuery() {
        return this.noQuery;
    }

    public String getProgressBarColor() {
        return this.progressBarColor;
    }

    public String getTitleBarBgColor() {
        return this.titleBarBgColor;
    }

    public int getOpenInApp() {
        return this.openInApp;
    }

    public boolean hasFuture(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8661db4a3e4578eea472a61ce427bd8d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8661db4a3e4578eea472a61ce427bd8d")).booleanValue() : (getFuture() & i) == i;
    }

    public boolean hasDynamicTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5a241af627875d801eb403e6bb7c441", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5a241af627875d801eb403e6bb7c441")).booleanValue() : hasFuture(1);
    }

    public String getRefererUrl() {
        return this.refererUrl;
    }

    public String getRefererSource() {
        return this.refererSource;
    }

    public int getSchemeWebBgColor() {
        return this.schemeWebBgColor;
    }

    private static Bundle wrapBundle(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7dfdf53454d468c2a529652bd2bdc414", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7dfdf53454d468c2a529652bd2bdc414");
        }
        Bundle bundle = new Bundle();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Bundle extras = activity.getIntent().getExtras();
            if (extras != null) {
                try {
                    bundle.putAll(extras);
                } catch (Exception e) {
                    Titans.serviceManager().getStatisticsService().reportClassError("TitansBundle", "wrapBundle", e);
                }
            }
            Uri data = activity.getIntent().getData();
            if (data != null) {
                fillQueryParameterInBundle(data, bundle, false);
            }
            return bundle;
        }
        return bundle;
    }

    private static void fillQueryParameterInBundle(Uri uri, Bundle bundle, boolean z) {
        int i = 0;
        Object[] objArr = {uri, bundle, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc3afa90f2f44d6696bd22096fc87504", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc3afa90f2f44d6696bd22096fc87504");
        } else if (uri == null || uri.isOpaque() || bundle == null) {
        } else {
            bundle.putString("_k_k_o_u_", uri.toString());
            String encodedQuery = uri.getEncodedQuery();
            if (TextUtils.isEmpty(encodedQuery)) {
                return;
            }
            int length = encodedQuery.length();
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i);
                int i2 = indexOf != -1 ? indexOf : length;
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > i2 || indexOf2 == -1) {
                    indexOf2 = i2;
                }
                if (indexOf2 > i) {
                    String substring = encodedQuery.substring(i, indexOf2);
                    String substring2 = indexOf2 == i2 ? "" : encodedQuery.substring(indexOf2 + 1, i2);
                    if (z && "url".equalsIgnoreCase(substring) && substring2.contains(CommonConstant.Symbol.QUESTION_MARK)) {
                        substring2 = encodedQuery.substring(indexOf2 + 1);
                    }
                    String decode = Uri.decode(substring);
                    if (!bundle.containsKey(decode)) {
                        bundle.putString(decode, Uri.decode(substring2));
                    }
                }
                if (indexOf == -1) {
                    return;
                }
                i = indexOf + 1;
            }
        }
    }
}
