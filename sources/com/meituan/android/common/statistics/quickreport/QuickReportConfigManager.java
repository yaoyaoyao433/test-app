package com.meituan.android.common.statistics.quickreport;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.config.ConfigCallback;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.utils.DESHelper;
import com.meituan.android.common.statistics.utils.FileUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class QuickReportConfigManager {
    private static final int CONFIG_LOAD_FROM_FILE_CACHE = 1000;
    private static final int CONFIG_LOAD_FROM_HORN_CACHE = 1001;
    private static final int CONFIG_LOAD_FROM_HORN_NETWORK = 1002;
    private static final int CONFIG_LOAD_FROM_NONE = 0;
    private static final String QUICK_REPORT_CONFIG = "delivery_config";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile QuickReportConfigManager singleton;
    private ConfigInfo mConfigInfo;
    private Context mContext;
    private int mLoadFlags;

    public static QuickReportConfigManager getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b81c68565cc444cf03db682fbb4efe39", 6917529027641081856L)) {
            return (QuickReportConfigManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b81c68565cc444cf03db682fbb4efe39");
        }
        if (singleton == null) {
            synchronized (QuickReportConfigManager.class) {
                if (singleton == null) {
                    singleton = new QuickReportConfigManager(context);
                }
            }
        }
        return singleton;
    }

    public QuickReportConfigManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ee99b309b812a45d3f7982e30b91a50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ee99b309b812a45d3f7982e30b91a50");
            return;
        }
        this.mLoadFlags = 0;
        this.mContext = context;
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8016c70ce63b414f2daac5178f4812c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8016c70ce63b414f2daac5178f4812c");
            return;
        }
        ConfigManager.getInstance(this.mContext).readConfigFromCache("delivery_config", new ConfigCallback() { // from class: com.meituan.android.common.statistics.quickreport.QuickReportConfigManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.statistics.config.ConfigCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6b20a3a7b1d6654614f7c68c73883628", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6b20a3a7b1d6654614f7c68c73883628");
                    return;
                }
                LogUtil.log("ConfigManager read quickreport accessCache callback enable:" + z + " result:" + str + " tm:" + System.currentTimeMillis());
                if (!z || TextUtils.isEmpty(str)) {
                    if (QuickReportConfigManager.this.hasConfigFromFile(QuickReportConfigManager.this.mContext)) {
                        try {
                            QuickReportConfigManager.this.parseConfig(new JSONObject(QuickReportConfigManager.this.readConfigFromFile(QuickReportConfigManager.this.mContext)), 1000);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                try {
                    QuickReportConfigManager.this.parseConfig(new JSONObject(str).optJSONObject("delivery_config"), 1001);
                } catch (Exception unused2) {
                }
            }
        });
        ConfigManager.getInstance(this.mContext).readConfigFromNetwork("delivery_config", new ConfigCallback() { // from class: com.meituan.android.common.statistics.quickreport.QuickReportConfigManager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.statistics.config.ConfigCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5ef5aad3297dbc034b1f5bd1830da6b8", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5ef5aad3297dbc034b1f5bd1830da6b8");
                    return;
                }
                LogUtil.log("ConfigManager read quickreport register callback enable:" + z + " result:" + str + " tm:" + System.currentTimeMillis());
                if (!z || TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    QuickReportConfigManager.this.parseConfig(new JSONObject(str).optJSONObject("delivery_config"), 1002);
                    QuickReportConfigManager.this.removeConfigFile();
                } catch (Exception unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasConfigFromFile(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9eae4870a2ac584c693136de252541e0", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9eae4870a2ac584c693136de252541e0")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return FileUtil.hasFile(context, FileUtil.QR_CONFIG_FILE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String readConfigFromFile(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55d289df47fa4a1b052226d0d1e4ac3b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55d289df47fa4a1b052226d0d1e4ac3b");
        }
        if (context == null) {
            return null;
        }
        return DESHelper.decrypt(FileUtil.readFile(context, FileUtil.QR_CONFIG_FILE_NAME));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseConfig(JSONObject jSONObject, int i) {
        Object[] objArr = {jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3ceb26bd4b23a1f32009d5168a495ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3ceb26bd4b23a1f32009d5168a495ea");
            return;
        }
        synchronized (this) {
            if (jSONObject != null) {
                try {
                    if (i >= this.mLoadFlags) {
                        ConfigInfo configInfoFromJSON = ConfigInfo.getConfigInfoFromJSON(jSONObject);
                        if (this.mConfigInfo == null || (this.mConfigInfo != null && configInfoFromJSON != null && configInfoFromJSON.getCnfver() > this.mConfigInfo.getCnfver())) {
                            this.mConfigInfo = configInfoFromJSON;
                        }
                        this.mLoadFlags = i;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConfigFile() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "686a999a8f7176c7a234a04d6b1861f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "686a999a8f7176c7a234a04d6b1861f2");
        } else {
            FileUtil.removeFile(this.mContext, FileUtil.QR_CONFIG_FILE_NAME);
        }
    }

    public synchronized ConfigInfo getConfigInfo() {
        return this.mConfigInfo;
    }

    public boolean shouldQuickReport(JSONObject jSONObject, Map<String, String> map, String str) {
        Object[] objArr = {jSONObject, map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5858ec099ce6996f6f96989e58794cbb", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5858ec099ce6996f6f96989e58794cbb")).booleanValue();
        }
        int optInt = jSONObject.optInt("nt");
        if (optInt == 2 || optInt == 8) {
            boolean optBoolean = jSONObject.optBoolean(Constants.JSNative.IS_QUICK_REPORT, false);
            if (jSONObject.has(Constants.JSNative.IS_QUICK_REPORT)) {
                jSONObject.remove(Constants.JSNative.IS_QUICK_REPORT);
            }
            return optBoolean;
        }
        String optString = jSONObject.optString("nm");
        if (TextUtils.isEmpty(optString)) {
            return false;
        }
        ConfigInfo configInfo = getConfigInfo();
        if (configInfo == null) {
            map.put("cnfver", "-1");
            return false;
        }
        map.put("cnfver", String.valueOf(configInfo.getCnfver()));
        if ("AS".equalsIgnoreCase(optString)) {
            return configInfo.getAS();
        }
        if ("AQ".equalsIgnoreCase(optString)) {
            return configInfo.getAQ();
        }
        if (QuickReportConstants.PV_CONFIG.equalsIgnoreCase(optString) || "PD".equalsIgnoreCase(optString)) {
            return configInfo.containsConfig(configInfo.getPV(), jSONObject.optString("val_cid"));
        }
        String optString2 = jSONObject.optString("val_bid");
        if (TextUtils.isEmpty(optString2)) {
            return false;
        }
        if ("MC".equalsIgnoreCase(optString)) {
            return configInfo.containsConfig(configInfo.getMC(), optString2);
        }
        if (QuickReportConstants.ME_CONFIG.equalsIgnoreCase(optString)) {
            return configInfo.containsConfig(configInfo.getME(), optString2);
        }
        if (QuickReportConstants.BO_CONFIG.equalsIgnoreCase(optString)) {
            return configInfo.containsConfig(configInfo.getBO(), optString2);
        }
        if (QuickReportConstants.BP_CONFIG.equalsIgnoreCase(optString)) {
            return configInfo.containsConfig(configInfo.getBP(), optString2);
        }
        return false;
    }
}
