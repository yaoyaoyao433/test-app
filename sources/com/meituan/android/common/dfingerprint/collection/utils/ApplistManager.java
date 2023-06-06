package com.meituan.android.common.dfingerprint.collection.utils;

import android.text.TextUtils;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.DFPManager;
import com.meituan.android.common.dfingerprint.MTGlibInterface;
import com.meituan.android.common.dfingerprint.impl.DFPReporter;
import com.meituan.android.common.dfingerprint.interfaces.IDFPManager;
import com.meituan.android.common.dfingerprint.network.ContentType;
import com.meituan.android.common.dfingerprint.network.IResponseParser;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ApplistManager {
    private static final String APPLIST_RAPTOR_ERROR_KEY = "v1_scfg_error";
    private static final String APPLIST_RAPTOR_KEY = "v1_scfg";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ApplistManager sInstance;
    private IDFPManager idfpManager;

    public ApplistManager(DFPManager dFPManager) {
        Object[] objArr = {dFPManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a7f299577f1b89b3fd69f1181dc888f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a7f299577f1b89b3fd69f1181dc888f");
        } else {
            this.idfpManager = dFPManager;
        }
    }

    public static ApplistManager getInstance(DFPManager dFPManager) {
        Object[] objArr = {dFPManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cec9eda59e2a7eecf1a4b756c6a094b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApplistManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cec9eda59e2a7eecf1a4b756c6a094b0");
        }
        if (sInstance == null) {
            synchronized (ApplistManager.class) {
                if (sInstance == null) {
                    sInstance = new ApplistManager(dFPManager);
                }
            }
        }
        return sInstance;
    }

    private String makeRequestBody() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8476f9cff264e0d62f9f1fad9b95f71f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8476f9cff264e0d62f9f1fad9b95f71f");
        }
        String main1 = NBridge.main1(55, new Object[0]);
        if (TextUtils.isEmpty(main1)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mtg_version", "5.17.4");
            jSONObject.put("data", main1);
            jSONObject.put("os", "Android");
        } catch (JSONException e) {
            MTGuardLog.setErrorLogan(e);
        }
        return jSONObject.toString();
    }

    private void postSync(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a6c59b035994476f5f9c7e78d3b60cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a6c59b035994476f5f9c7e78d3b60cc");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            MTGuardLog.setLogan("/v1/scfg request_body: ".concat(String.valueOf(str)));
            IResponseParser iResponseParser = new IResponseParser() { // from class: com.meituan.android.common.dfingerprint.collection.utils.ApplistManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
                public boolean onError(int i, String str2) {
                    Object[] objArr2 = {Integer.valueOf(i), str2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b1fdbab66f4ba84087750909ea20ea8e", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b1fdbab66f4ba84087750909ea20ea8e")).booleanValue();
                    }
                    MTGuardLog.setLogan("/v1/scfg error: ".concat(String.valueOf(str2)));
                    return false;
                }

                @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
                public boolean onResponse(int i, byte[] bArr, long j, int i2) {
                    Object[] objArr2 = {Integer.valueOf(i), bArr, new Long(j), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "59af21ec05cbb1f13572f37d706d48c1", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "59af21ec05cbb1f13572f37d706d48c1")).booleanValue();
                    }
                    StringBuilder sb = new StringBuilder("/v1/scfg onResponse response_code: ");
                    sb.append(i);
                    sb.append(" response_body:");
                    sb.append((bArr == null || bArr.length == 0) ? StringUtil.NULL : new String(bArr));
                    MTGuardLog.setLogan(sb.toString());
                    if (i != 200) {
                        MTGlibInterface.raptorAPI(ApplistManager.APPLIST_RAPTOR_KEY, i, i2, 0, System.currentTimeMillis() - j);
                        return false;
                    } else if (bArr == null || bArr.length == 0) {
                        MTGlibInterface.raptorAPI(ApplistManager.APPLIST_RAPTOR_KEY, 9401, i2, 0, System.currentTimeMillis() - j);
                        return false;
                    } else {
                        String str2 = new String(bArr);
                        try {
                            int length = str2.length();
                            MTGlibInterface.raptorAPI(ApplistManager.APPLIST_RAPTOR_KEY, 200, i2, length, System.currentTimeMillis() - j);
                            JSONObject jSONObject = new JSONObject(str2);
                            int i3 = jSONObject.getInt("code");
                            if (i3 != 0) {
                                MTGlibInterface.raptorAPI(ApplistManager.APPLIST_RAPTOR_KEY, 9402, i2, length, System.currentTimeMillis() - j);
                                MTGlibInterface.raptorAPI(ApplistManager.APPLIST_RAPTOR_ERROR_KEY, i3, i2, length, System.currentTimeMillis() - j);
                                return false;
                            }
                            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                            if (jSONObject2 == null) {
                                return false;
                            }
                            String string = jSONObject2.getString("resStr");
                            if (!TextUtils.isEmpty(string)) {
                                NBridge.main3(56, new Object[]{string});
                            }
                            return true;
                        } catch (Exception e) {
                            MTGlibInterface.raptorAPI(ApplistManager.APPLIST_RAPTOR_KEY, 9405, i2, 0, System.currentTimeMillis() - j);
                            MTGuardLog.setErrorLogan(e);
                            return false;
                        }
                    }
                }
            };
            try {
                new DFPReporter.Builder().addInterceptor(this.idfpManager.getInterceptor()).addResponseParser(iResponseParser).build().postSync(DFPConfigs.getHost(), DFPConfigs.getPort(), DFPConfigs.getScheme(), DFPConfigs.getApplistConfigPath(), ContentType.application_json, str, iResponseParser, false);
            } catch (IOException e) {
                MTGuardLog.setErrorLogan(e);
            }
        }
    }

    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e78063c1e3d78fbcb335cc07ef740e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e78063c1e3d78fbcb335cc07ef740e8");
        } else if (this.idfpManager == null) {
        } else {
            try {
                postSync(makeRequestBody());
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
            }
        }
    }
}
