package com.dianping.titans.offline.entity;

import android.text.TextUtils;
import android.util.Log;
import com.dianping.titans.offline.util.Reporter;
import com.google.gson.annotations.Expose;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.offline.BuildConfig;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class OfflineRuleItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Expose
    public String bundleName;
    @Expose
    public String bundleVersion;
    @Expose
    private String childPath;
    @Expose
    private String contentType;
    @Expose
    private String dioPath;
    @Expose
    private Map<String, String> headers;
    @Expose
    public boolean isPreset;
    @Expose
    private String mime;
    @Expose
    private boolean noQuery;
    @Expose
    public String packageHash;
    @Expose
    private String project;
    @Expose
    private String url;

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Deprecated
    public InputStream getResourcePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ef1cc37253671284aff6cbecb621bf2", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ef1cc37253671284aff6cbecb621bf2");
        }
        try {
            if (TextUtils.isEmpty(this.dioPath)) {
                throw new NullPointerException("dioPath is null");
            }
            if (TextUtils.isEmpty(this.childPath)) {
                throw new NullPointerException("childPath is null");
            }
            return new DioFile(this.dioPath, this.childPath).b();
        } catch (Exception e) {
            babelOfflineRuleItem(e);
            return null;
        }
    }

    public InputStream getResourceStream() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67ea75074f4b1a434eaf98508a445ed9", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67ea75074f4b1a434eaf98508a445ed9");
        }
        try {
            if (TextUtils.isEmpty(this.dioPath)) {
                throw new NullPointerException("dioPath is null");
            }
            if (TextUtils.isEmpty(this.childPath)) {
                throw new NullPointerException("childPath is null");
            }
            return new DioFile(this.dioPath, this.childPath).b();
        } catch (Exception e) {
            babelOfflineRuleItem(e);
            return null;
        }
    }

    private void babelOfflineRuleItem(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f49d4cdafed708e2954920baa73bda5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f49d4cdafed708e2954920baa73bda5e");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.ModelBeanConstants.KEY_BUNDLE_NAME, this.bundleName);
        hashMap.put("sourceUrl", this.url);
        if (exc != null) {
            hashMap.put("error", Log.getStackTraceString(exc));
        }
        hashMap.put("titansVersion", BuildConfig.VERSION_NAME);
        Reporter.getInstance().reportRT("knb_offline_rule_item", hashMap, 1L);
    }

    public boolean isNoQuery() {
        return this.noQuery;
    }

    public void setNoQuery(boolean z) {
        this.noQuery = z;
    }

    public String getMime() {
        return this.mime;
    }

    public void setMime(String str) {
        this.mime = str;
    }

    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public String getProject() {
        return this.project;
    }

    public void setProject(String str) {
        this.project = str;
    }

    public void setDioPath(String str) {
        this.dioPath = str;
    }

    public void setChildPath(String str) {
        this.childPath = str;
    }
}
