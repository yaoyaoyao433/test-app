package com.meituan.android.common.statistics.config;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.StatisticsDelegate;
import com.meituan.android.common.statistics.StatisticsHandler;
import com.meituan.android.common.statistics.cat.CatMonitorManager;
import com.meituan.android.common.statistics.channel.DefaultEnvironment;
import com.meituan.android.common.statistics.flowmanager.FlowManager;
import com.meituan.android.common.statistics.network.StatisticsApiRetrofit;
import com.meituan.android.common.statistics.pageinfo.PageInfoManager;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.android.common.statistics.utils.SharedPreferencesHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OceanBlackDownloadManager {
    private static final String BID = "b_techportal_stnufdm9_sc";
    private static final String PROD_BLACK_CONFIG_URL = "https://s3plus.meituan.net/ocean-blk-index/index/blk_conf_";
    private static final String TEST_BLACK_CONFIG_URL = "https://msstest.sankuai.com/ocean-blk-index/index/blk_conf_";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean requestS3 = true;
    private final File sourceFileDir;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class OceanBlackDownloadManagerHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static OceanBlackDownloadManager oceanBlackDownloadManager = new OceanBlackDownloadManager();
    }

    public OceanBlackDownloadManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77bcf3abd45a8047ab5012270b16b587", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77bcf3abd45a8047ab5012270b16b587");
        } else {
            this.sourceFileDir = q.a(Statistics.getContext(), SharedPreferencesHelper.getInstance(Statistics.getContext()).getLxFileChannel(), "");
        }
    }

    public static OceanBlackDownloadManager getInstance() {
        return OceanBlackDownloadManagerHolder.oceanBlackDownloadManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void accessCacheBlackConfig() {
        File[] listFiles;
        File file;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d27a3907a3baac373064b2a516ad5c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d27a3907a3baac373064b2a516ad5c7");
        } else if (this.sourceFileDir == null || !this.sourceFileDir.exists() || !this.sourceFileDir.isDirectory() || (listFiles = this.sourceFileDir.listFiles()) == null || listFiles.length <= 0 || (file = listFiles[0]) == null || !file.exists()) {
        } else {
            LogUtil.log("BLACK-CONFIG accessCacheBlackConfig, file=" + file.getAbsolutePath());
            FlowManager.getInstance(Statistics.getContext()).onServerFileUpdated(file.getAbsolutePath());
        }
    }

    public void pullServiceBlackConfig(final Context context, final String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2caff9dd37f3c82cfcb4af34bfc9e3d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2caff9dd37f3c82cfcb4af34bfc9e3d9");
        } else {
            StatisticsHandler.getInstance().getConfig(new Runnable() { // from class: com.meituan.android.common.statistics.config.OceanBlackDownloadManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    Response<ap> a;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "83db84861d74f08e2b42370a095985f6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "83db84861d74f08e2b42370a095985f6");
                        return;
                    }
                    try {
                        OceanBlackDownloadManager.this.accessCacheBlackConfig();
                        if (!ProcessUtils.isMainProcess(context)) {
                            LogUtil.log("BLACK-CONFIG subprocess don't request S3, use cache!");
                        } else if (ConfigManager.getInstance(context).isDownloadOceanBlack()) {
                            if (!OceanBlackDownloadManager.requestS3) {
                                LogUtil.log("BLACK-CONFIG don't request S3, has already requested");
                                return;
                            }
                            LogUtil.log("BLACK-CONFIG request S3");
                            String str3 = LogUtil.isLogEnabled() ? OceanBlackDownloadManager.TEST_BLACK_CONFIG_URL : OceanBlackDownloadManager.PROD_BLACK_CONFIG_URL;
                            if (TextUtils.isEmpty(str3)) {
                                return;
                            }
                            if (str.length() == 2 && OceanBlackDownloadManager.this.isNumber(str)) {
                                str2 = str3 + str + ".json";
                                LogUtil.log("BLACK-CONFIG index url = " + str2 + ", request!");
                                a = StatisticsApiRetrofit.getInstance().getOceanBlackConfig(str2).a();
                                CatMonitorManager.getInstance().sendOceanBlackListRequest(a);
                                boolean unused = OceanBlackDownloadManager.requestS3 = false;
                                if (a == null && a.b() == 200 && a.e() != null) {
                                    String string = a.e().string();
                                    LogUtil.log("BLACK-CONFIG configJsonStr= " + string);
                                    OceanBlackDownloadManager.this.downloadBlackFile(OceanBlackDownloadManager.this.getDownloadUrl(new JSONObject(string)));
                                    return;
                                }
                                LogUtil.log("BLACK-CONFIG response error!!!");
                                CatMonitorManager.getInstance().sendOceanBlackListFailedRequest(a);
                            }
                            str2 = str3 + "99.json";
                            LogUtil.log("BLACK-CONFIG index url = " + str2 + ", request!");
                            a = StatisticsApiRetrofit.getInstance().getOceanBlackConfig(str2).a();
                            CatMonitorManager.getInstance().sendOceanBlackListRequest(a);
                            boolean unused2 = OceanBlackDownloadManager.requestS3 = false;
                            if (a == null) {
                            }
                            LogUtil.log("BLACK-CONFIG response error!!!");
                            CatMonitorManager.getInstance().sendOceanBlackListFailedRequest(a);
                        } else {
                            LogUtil.log("BLACK-CONFIG don't request S3, horn config");
                        }
                    } catch (Exception e) {
                        LogUtil.log("BLACK-CONFIG " + e.getMessage());
                        HashMap hashMap = new HashMap();
                        hashMap.put("e", e.getMessage());
                        Statistics.getChannel("techportal").writeSystemCheck(PageInfoManager.getInstance().getCurrentPageInfoKey(), OceanBlackDownloadManager.BID, hashMap);
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isNumber(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c20699f4e07d431b69136c8950629c69", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c20699f4e07d431b69136c8950629c69")).booleanValue();
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getDownloadUrl(JSONObject jSONObject) {
        DefaultEnvironment defaultEnvironment;
        Map<String, String> environment;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7fc7ab6f19f4d42fa1146727fb4ea59", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7fc7ab6f19f4d42fa1146727fb4ea59");
        }
        if (jSONObject != null && (defaultEnvironment = StatisticsDelegate.getInstance().getDefaultEnvironment()) != null && (environment = defaultEnvironment.getEnvironment()) != null && environment.containsKey(Constants.Environment.KEY_APPNM)) {
            String str = environment.get(Constants.Environment.KEY_APPNM);
            if (!TextUtils.isEmpty(str)) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (str.equals(next)) {
                        return jSONObject.optString(next);
                    }
                }
            }
        }
        return null;
    }

    private boolean needDownload(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adc217e7a0cd3e201e68aecc2ac7957e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adc217e7a0cd3e201e68aecc2ac7957e")).booleanValue();
        }
        File[] listFiles = this.sourceFileDir.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return true;
        }
        for (File file : listFiles) {
            if (file != null && !TextUtils.isEmpty(file.getName()) && file.getName().equals(str)) {
                LogUtil.log("BLACK-CONFIG " + str + " exists!!!, don't download, use cache!");
                return false;
            }
        }
        return true;
    }

    private void deleteOldSourceFile(String str) {
        File[] listFiles;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c946f6399f4cdb978a9f294d61ff914", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c946f6399f4cdb978a9f294d61ff914");
        } else if (!TextUtils.isEmpty(str) && this.sourceFileDir != null && this.sourceFileDir.exists() && this.sourceFileDir.isDirectory() && (listFiles = this.sourceFileDir.listFiles()) != null && listFiles.length > 0) {
            for (File file : listFiles) {
                if (file != null && !file.getName().equals(str)) {
                    LogUtil.log("BLACK-CONFIG delete file :" + file.getName());
                    file.delete();
                }
            }
        }
    }

    private String getFileName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a57fd563ddc1805521f437e93461c3be", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a57fd563ddc1805521f437e93461c3be") : Uri.parse(str).getLastPathSegment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void downloadBlackFile(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.config.OceanBlackDownloadManager.downloadBlackFile(java.lang.String):void");
    }
}
