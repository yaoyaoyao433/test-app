package com.sankuai.meituan.android.knb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.networklog.c;
import com.dianping.titans.widget.BaseTitleBar;
import com.dianping.titans.widget.DefaultTitleBar;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.meituan.android.knb.listener.OnLoginListener;
import com.sankuai.meituan.android.knb.util.PushRestoreUrlV100;
import com.sankuai.meituan.android.knb.util.WebUtil;
import com.sankuai.titans.result.privacy.PrivacyTitansManager;
import java.net.URLDecoder;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBWebCompatDelegateV2Impl extends KNBWebCompatDelegateImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mIsFromPush;

    public KNBWebCompatDelegateV2Impl(Context context, IKnbActivityHandler iKnbActivityHandler) {
        super(context, iKnbActivityHandler);
        Object[] objArr = {context, iKnbActivityHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "789d4cccd8372d17176271aca99df585", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "789d4cccd8372d17176271aca99df585");
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl, com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void handleUri(final Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e70f0bd1af40490afef8562c5a5c88cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e70f0bd1af40490afef8562c5a5c88cf");
        } else if ("/signin".equals(uri.getPath()) || "/signin/".equals(uri.getPath())) {
            if (this.mLoginListener == null) {
                return;
            }
            this.mLoginListener.onSuccess(new OnLoginListener.CallBack() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateV2Impl.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.meituan.android.knb.listener.OnLoginListener.CallBack
                public void onCall() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "adfebf56504d3b4bee73b6c0680eee03", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "adfebf56504d3b4bee73b6c0680eee03");
                    } else if (uri.isHierarchical()) {
                        String queryParameter = uri.getQueryParameter("redirectURL");
                        if (TextUtils.isEmpty(queryParameter)) {
                            return;
                        }
                        KNBWebCompatDelegateV2Impl.this.loadUrl(queryParameter);
                    }
                }
            });
        } else {
            super.handleUri(uri);
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl, com.dianping.titans.js.JsHost
    public void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9f2d8d7c54fc5f19464328870b586b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9f2d8d7c54fc5f19464328870b586b5");
        } else if (getDynamicTitleBar() != null) {
            super.setTitle(str);
        } else if (getTitleBarHost() instanceof BaseTitleBar) {
            getTitleBarHost().setWebTitle(str);
        } else {
            DefaultTitleBar defaultTitleBar = new DefaultTitleBar(this.mContext);
            defaultTitleBar.setWebTitle(str);
            replaceTitleBar(defaultTitleBar);
        }
    }

    public void setTitle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90048d7b5e6c4a162d818e0eccd436a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90048d7b5e6c4a162d818e0eccd436a6");
        } else {
            setTitle(this.mContext.getString(i));
        }
    }

    public void onLoginCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6f293897f8b6a1d5e976bbd07814efd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6f293897f8b6a1d5e976bbd07814efd");
        } else if (this.mActivityHandler != null) {
            this.mActivityHandler.handleFinish();
        }
    }

    public boolean isLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f67f0b95ed3d349c33c03dd161d2d0b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f67f0b95ed3d349c33c03dd161d2d0b")).booleanValue() : (TextUtils.isEmpty(getUserId()) || TextUtils.isEmpty(getUserToken())) ? false : true;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl, com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23a0fd0e08fc4f56ba54b8b9ae0f3069", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23a0fd0e08fc4f56ba54b8b9ae0f3069");
            return;
        }
        super.onCreate();
        if (TextUtils.isEmpty(this.mUrl)) {
            return;
        }
        try {
            this.mUrl = buildQueryUrl(Uri.parse(this.mUrl));
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl, com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public boolean onViewCreated(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ddfe4632eb4192725b3e9dcb4e49deb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ddfe4632eb4192725b3e9dcb4e49deb")).booleanValue();
        }
        if (super.onViewCreated(view)) {
            if (this.autoInflateTitleBar) {
                initTitleBarColor();
            }
            return true;
        }
        return false;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl
    public void initUIManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c279c250acf92190273ca2d52e85637", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c279c250acf92190273ca2d52e85637");
            return;
        }
        this.mDefaultTitansUIManager.setBackIconId(R.drawable.knb_web_ic_home_as_up_indicator);
        this.mDefaultTitansUIManager.setCloseIconId(R.drawable.knb_web_close_black);
        this.mDefaultTitansUIManager.setCustomBackIconId(R.drawable.knb_web_ic_home_as_up_indicator);
        this.mDefaultTitansUIManager.setProgressDrawableResId(R.drawable.titans_horizontal_progress);
        this.mDefaultTitansUIManager.setSearchIconId(R.drawable.knb_web_ic_action_search);
        this.mDefaultTitansUIManager.setSearchBarIconId(R.drawable.search_box_icon);
        this.mDefaultTitansUIManager.setShareIconId(R.drawable.knb_web_ic_action_share);
        this.mDefaultTitansUIManager.setMaskLayoutResId(R.layout.knb_network_error);
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl
    public void initMask(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d296ce2ccb6f78ee527a608ea15da88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d296ce2ccb6f78ee527a608ea15da88");
            return;
        }
        this.mLayMask = (FrameLayout) view.findViewById(R.id.mask);
        if (this.mLayMask == null) {
            return;
        }
        this.mLayMask.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(getUIManager().getMaskLayoutResId(), (ViewGroup) this.mLayMask, true).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateV2Impl.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0ee88f2e5db14f3984f418aa938e146a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0ee88f2e5db14f3984f418aa938e146a");
                    return;
                }
                if (KNBWebCompatDelegateV2Impl.this.mWebView != null) {
                    KNBWebCompatDelegateV2Impl.this.mWebView.reload();
                }
                KNBWebCompatDelegateV2Impl.this.hideMask();
            }
        });
        this.mLayMask.setVisibility(8);
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl
    public String processUrl(String str) {
        Intent handleGetIntent;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "957b6ad49007821cf60e08829218e64d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "957b6ad49007821cf60e08829218e64d");
        }
        if (this.mArguments != null) {
            this.mIsFromPush = this.mArguments.getBoolean("isFromPush", false);
            if (this.mIsFromPush) {
                str = PushRestoreUrlV100.restoreUrl(str);
            }
        }
        if (str.startsWith("http") || str.startsWith("https")) {
            String utm = utm();
            if (!str.contains("utm=") && !TextUtils.isEmpty(utm)) {
                str = Uri.parse(str).buildUpon().appendQueryParameter(Constants.Environment.KEY_UTM, utm).build().toString();
            }
            if (WebUtil.isFromDP(str) && this.mIsFromPush) {
                str = addDefaultParams(str);
            }
            Uri parse = Uri.parse(str);
            if (parse.isHierarchical()) {
                this.mTitle = parse.getQueryParameter("title");
            }
            Uri uri = null;
            if (this.mActivityHandler != null && (handleGetIntent = this.mActivityHandler.handleGetIntent()) != null) {
                uri = handleGetIntent.getData();
            }
            if (TextUtils.isEmpty(this.mTitle) && uri != null && uri.isHierarchical()) {
                this.mTitle = uri.getQueryParameter("title");
            }
            if (uri == null || !"modifyphone".equals(uri.getHost())) {
                return str;
            }
            String string = this.mArguments == null ? "" : this.mArguments.getString("goto");
            return (parse.isHierarchical() && TextUtils.isEmpty(parse.getQueryParameter("goto")) && !TextUtils.isEmpty(string)) ? parse.buildUpon().appendQueryParameter("goto", URLDecoder.decode(string)).build().toString() : str;
        }
        return str;
    }

    @Deprecated
    public String getWebViewUri() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8787c83fdc149058eb5584a327dc269", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8787c83fdc149058eb5584a327dc269") : (KNBWebManager.getEnvironment() == null || TextUtils.isEmpty(KNBWebManager.getEnvironment().getWebviewUri())) ? KNBWebManager.IEnvironment.WEBVIEW_URI : KNBWebManager.getEnvironment().getWebviewUri();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl, com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public String wrapUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21d333b8857bab112eafb806cfba6736", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21d333b8857bab112eafb806cfba6736");
        }
        if (this.noQuery) {
            return str;
        }
        Uri parse = Uri.parse(str);
        boolean isHierarchical = parse.isHierarchical();
        String host = parse.getHost();
        String path = parse.getPath();
        String queryParameter = isHierarchical ? parse.getQueryParameter("_mtcq") : "";
        if ((TextUtils.isEmpty(queryParameter) || !queryParameter.equals("0")) && !TextUtils.equals(host, "t.meituan.com")) {
            if (!TextUtils.equals(host + path, "m.dianping.com/synthesis/shortlink") && KNBWebManager.needWrapUrl(str)) {
                Uri.Builder buildUpon = parse.buildUpon();
                if (parse.getScheme() != null && KNBWebManager.isInSchemeWhite(parse.getScheme().toLowerCase())) {
                    if (isHierarchical && !"android".equals(parse.getQueryParameter("f"))) {
                        buildUpon.appendQueryParameter("f", "android");
                    }
                    String userToken = getUserToken();
                    String userId = getUserId();
                    if (!TextUtils.isEmpty(userToken) && isHierarchical && TextUtils.isEmpty(parse.getQueryParameter("token"))) {
                        buildUpon.appendQueryParameter("token", userToken);
                    }
                    if (!TextUtils.isEmpty(userId) && isHierarchical && TextUtils.isEmpty(parse.getQueryParameter("userid"))) {
                        buildUpon.appendQueryParameter("userid", userId);
                    }
                    boolean isQueryPrivacySwitch = PrivacyTitansManager.getInstance().isQueryPrivacySwitch();
                    c.a("KNBWebCompatDelegateV2Impl.wrapUrl---queryPrivacySwitch=" + isQueryPrivacySwitch + " ;---url is " + str, 35, new String[]{"privacy_query"});
                    if (!isQueryPrivacySwitch || PrivacyTitansManager.getInstance().privacyRegisteredLocation(str)) {
                        String lat = getLat();
                        String lng = getLng();
                        if (!TextUtils.isEmpty(lat) && isHierarchical && TextUtils.isEmpty(parse.getQueryParameter("lat"))) {
                            buildUpon.appendQueryParameter("lat", lat);
                        }
                        if (!TextUtils.isEmpty(lng) && isHierarchical && TextUtils.isEmpty(parse.getQueryParameter("lng"))) {
                            buildUpon.appendQueryParameter("lng", String.valueOf(lng));
                        }
                        StringBuilder sb = new StringBuilder("KNBWebCompatDelegateV2Impl.wrapUrl---queryPrivacySwitch=");
                        sb.append(isQueryPrivacySwitch);
                        sb.append(" ;hasLatValue=");
                        sb.append(!TextUtils.isEmpty(lat));
                        sb.append(" ;hasLngValue=");
                        sb.append(true ^ TextUtils.isEmpty(lng));
                        sb.append(" ;---url is ");
                        sb.append(str);
                        c.a(sb.toString(), 35, new String[]{"privacy_query"});
                    }
                    if (this.mAnalyzeParamsListener != null) {
                        return this.mAnalyzeParamsListener.appendAnalyzeParams(buildUpon.toString());
                    }
                    return buildUpon.toString();
                }
                return buildUpon.toString();
            }
            return str;
        }
        return str;
    }

    public void removeAllOptionsMenus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86d8f60667b124ced7d5dfaaf4668bbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86d8f60667b124ced7d5dfaaf4668bbb");
            return;
        }
        BaseTitleBar titleBarHost = getTitleBarHost();
        if (titleBarHost != null) {
            titleBarHost.setRLButton((String) null, (String) null, true, (View.OnClickListener) null);
            titleBarHost.setRRButton((String) null, (String) null, true, (View.OnClickListener) null);
        }
    }

    public void onBackClicked() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec73821c6ecc6465ce46e35410528d1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec73821c6ecc6465ce46e35410528d1e");
        } else if (handleBackClick()) {
        } else {
            finish();
        }
    }

    public String addDefaultParams(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48ade495f8073df6b3a428b61f1ba308", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48ade495f8073df6b3a428b61f1ba308");
        }
        if (WebUtil.isFromDP(str)) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            if (!str.contains("token=")) {
                buildUpon.appendQueryParameter("token", getUserToken());
            }
            if (!str.contains("cityid=")) {
                buildUpon.appendQueryParameter(Constants.Environment.KEY_CITYID, String.valueOf(getCityId()));
            }
            return buildUpon.build().toString();
        }
        return str;
    }

    public boolean handleBackClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2da054417b89541d27a6eb351826eab3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2da054417b89541d27a6eb351826eab3")).booleanValue();
        }
        if (this.mWebView == null || !this.mWebView.canGoBack()) {
            return false;
        }
        this.mWebView.goBack();
        return true;
    }

    private String utm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b886166a7f4d9384ee5e7f08bcdb04ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b886166a7f4d9384ee5e7f08bcdb04ab");
        }
        String str = "";
        try {
            if (this.mActivityHandler == null) {
                return "";
            }
            Uri data = this.mActivityHandler.handleGetIntent().getData();
            if (data != null && data.isHierarchical()) {
                str = data.getQueryParameter("_utm");
            }
            if (TextUtils.isEmpty(str) && data.isHierarchical()) {
                str = data.getQueryParameter("utm_");
            }
            if (str == null) {
                str = this.mArguments == null ? "" : this.mArguments.getString(Constants.Environment.KEY_UTM);
            }
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    private void initTitleBarColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29aa76d9a4433c42974a84b9023e3ebd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29aa76d9a4433c42974a84b9023e3ebd");
            return;
        }
        BaseTitleBar titleBarHost = getTitleBarHost();
        if (titleBarHost != null) {
            titleBarHost.mButtonRR.setTextColor(this.mContext.getResources().getColor(R.color.black));
            titleBarHost.mButtonRL.setTextColor(this.mContext.getResources().getColor(R.color.black));
            titleBarHost.mButtonLL.setTextColor(this.mContext.getResources().getColor(R.color.black));
            titleBarHost.mButtonLR.setTextColor(this.mContext.getResources().getColor(R.color.black));
        }
    }

    private String buildQueryUrl(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bada80907fee38803e6c7867b2333e7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bada80907fee38803e6c7867b2333e7a");
        }
        if (uri == null) {
            return "";
        }
        if (!TextUtils.equals("imeituan", uri.getScheme().toLowerCase())) {
            return uri.buildUpon().toString();
        }
        if (!(uri.isHierarchical() && TextUtils.isEmpty(uri.getQueryParameter("url"))) && uri.isHierarchical()) {
            Uri.Builder buildUpon = Uri.parse(uri.getQueryParameter("url")).buildUpon();
            if (!TextUtils.isEmpty(uri.getQueryParameter("ieic"))) {
                buildUpon.appendQueryParameter("ieic", uri.getQueryParameter("ieic"));
            }
            if (!TextUtils.isEmpty(uri.getQueryParameter("msid"))) {
                buildUpon.appendQueryParameter("msid", uri.getQueryParameter("msid"));
            }
            return buildUpon.toString();
        }
        return "";
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl, com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onActivityHandlerSettled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d03ab9700f3968ec852984034477db3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d03ab9700f3968ec852984034477db3");
            return;
        }
        super.onActivityHandlerSettled();
        if (this.autoInflateTitleBar) {
            return;
        }
        initTitleBarColor();
    }
}
