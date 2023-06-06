package com.meituan.android.common.statistics.flowmanager;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.cat.CatMonitorManager;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FlowManager {
    public static final int STRATEGY_MODE_SDK = 101;
    public static final int STRATEGY_MODE_SERVER = 100;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile FlowManager instance;
    private static Context mContext;
    private SdkInteceptStrategy mSdkInteceptStrategy;
    private ServerInteceptStrategy mServerInteceptStrategy;
    private Stat mStat;

    public FlowManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fe720bc1ee7c5b7bf36d293add57bfa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fe720bc1ee7c5b7bf36d293add57bfa");
            return;
        }
        this.mServerInteceptStrategy = null;
        this.mSdkInteceptStrategy = null;
        this.mStat = null;
        mContext = context;
        this.mServerInteceptStrategy = new ServerInteceptStrategy();
        this.mSdkInteceptStrategy = new SdkInteceptStrategy();
        this.mStat = new Stat(this.mServerInteceptStrategy);
        this.mServerInteceptStrategy.injectStat(this.mStat);
    }

    public static FlowManager getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f2d8b2e614c754530a583548057c27b", 6917529027641081856L)) {
            return (FlowManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f2d8b2e614c754530a583548057c27b");
        }
        if (instance == null) {
            synchronized (FlowManager.class) {
                if (instance == null) {
                    instance = new FlowManager(context);
                }
            }
        }
        return instance;
    }

    public boolean intercept(JSONObject jSONObject, int i) {
        Object[] objArr = {jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63730cb17f735636d0528cadcaa20ec1", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63730cb17f735636d0528cadcaa20ec1")).booleanValue();
        }
        if (jSONObject != null) {
            String optString = jSONObject.optString("nm");
            String optString2 = jSONObject.optString("category");
            String optString3 = jSONObject.optString("nt");
            return interceptInner(i, optString2, optString, jSONObject.optString("val_cid"), (TextUtils.isEmpty(optString3) || Integer.parseInt(optString3) != 2) ? "" : jSONObject.optString(Constants.Web.KEY_WEB_CID), jSONObject.optString("val_bid"), optString3);
        }
        return false;
    }

    private boolean interceptInner(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3539b0276e34c36cb7bed5d5e61f3067", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3539b0276e34c36cb7bed5d5e61f3067")).booleanValue();
        }
        if (100 == i) {
            if (this.mServerInteceptStrategy == null || !ConfigManager.getInstance(mContext).interceptReport()) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean intercept = this.mServerInteceptStrategy.intercept(str2, str3, str4, str5);
            CatMonitorManager.getInstance().reportHornFlowMatchDuration(SystemClock.elapsedRealtime() - elapsedRealtime);
            LogUtil.log("horn flow server interceptor eventName:" + str2 + " cid:" + str3 + " bid:" + str5 + " result:" + intercept);
            return intercept;
        } else if (101 == i && ConfigManager.getInstance(mContext).sdkInterceptReport() && this.mSdkInteceptStrategy != null) {
            boolean intercept2 = this.mSdkInteceptStrategy.intercept(str, str2, str3, str5, str6);
            LogUtil.log("horn flow sdk interceptor eventName:" + str2 + " cid:" + str3 + " bid:" + str5 + " result:" + intercept2);
            return intercept2;
        } else {
            return false;
        }
    }

    public void onSDKConfigUpdated(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc7e21739bc57166247f7e2ff7192248", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc7e21739bc57166247f7e2ff7192248");
            return;
        }
        synchronized (this) {
            this.mSdkInteceptStrategy.ruleParse(mContext, jSONArray);
        }
    }

    public void onServerFileUpdated(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "deadd21669e65fe374c8a90a2641afe0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "deadd21669e65fe374c8a90a2641afe0");
            return;
        }
        synchronized (this) {
            if (this.mServerInteceptStrategy.checkFileModified(mContext, str)) {
                if (this.mServerInteceptStrategy.checkFileMd5(mContext, str)) {
                    CatMonitorManager.getInstance().reportHornConfigUpdate(ConfigManager.KEY_REPORT_FLOW_CONTROL_CONFIG_VER, this.mServerInteceptStrategy.getFileMd5());
                    String unzip = unzip(str);
                    LogUtil.log("flow control unzip file ret:" + unzip);
                    if (!TextUtils.isEmpty(str)) {
                        CatMonitorManager.getInstance().reportHornFileUpdateNum(str, new File(str).length());
                    }
                    this.mServerInteceptStrategy.ruleParse(mContext, unzip);
                }
            }
        }
    }

    public String unzip(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "975d861fe618234e2c56c3e967828382", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "975d861fe618234e2c56c3e967828382");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File file = new File(str);
        String unzipFile = AppUtil.unzipFile(new File(str));
        CatMonitorManager.getInstance().reportReadHornFileDuration(str, file.length(), SystemClock.elapsedRealtime() - elapsedRealtime);
        return unzipFile;
    }

    public String getFileMd5() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5f47324b1debbb3a6a4407b3f024753", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5f47324b1debbb3a6a4407b3f024753") : this.mServerInteceptStrategy.getFileMd5();
    }

    public JSONObject getStatInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3444cc9eb6ae40640b685273b27cb626", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3444cc9eb6ae40640b685273b27cb626");
        }
        JSONObject json = this.mStat.toJson();
        if (json != null) {
            LogUtil.log("horn flow interceptor report stats:" + json.toString());
        }
        this.mStat.reset();
        return json;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class Stat {
        public static ChangeQuickRedirect changeQuickRedirect;
        public HashMap<String, Long> bidHit;
        public HashMap<String, Long> cidHit;
        public ServerInteceptStrategy mServerInteceptStrategy;
        public long nullBidHits;
        public long totalHits;

        public Stat(ServerInteceptStrategy serverInteceptStrategy) {
            Object[] objArr = {FlowManager.this, serverInteceptStrategy};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04bc08e9e6d56e8e47e5852bd3fa6c5a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04bc08e9e6d56e8e47e5852bd3fa6c5a");
                return;
            }
            this.mServerInteceptStrategy = null;
            this.totalHits = 0L;
            this.nullBidHits = 0L;
            this.cidHit = new HashMap<>();
            this.bidHit = new HashMap<>();
            this.mServerInteceptStrategy = serverInteceptStrategy;
        }

        public synchronized void hitNullBid() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb38c33d9d31a3bd77b9af1edeac2000", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb38c33d9d31a3bd77b9af1edeac2000");
                return;
            }
            synchronized (Stat.class) {
                this.nullBidHits++;
                this.totalHits++;
            }
        }

        public synchronized void hitByBid(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44357248851dc37258538d2c94e6660c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44357248851dc37258538d2c94e6660c");
                return;
            }
            synchronized (Stat.class) {
                this.bidHit.put(str, Long.valueOf((this.bidHit.get(str) == null ? 0L : this.bidHit.get(str).longValue()) + 1));
                this.totalHits++;
            }
        }

        public synchronized void hitByCid(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1897e338c1248f2af32dd833f8346431", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1897e338c1248f2af32dd833f8346431");
                return;
            }
            synchronized (Stat.class) {
                this.cidHit.put(str, Long.valueOf((this.cidHit.get(str) == null ? 0L : this.cidHit.get(str).longValue()) + 1));
                this.totalHits++;
            }
        }

        public synchronized void reset() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bbc87db55d474f7dd7a24eabf5dad7e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bbc87db55d474f7dd7a24eabf5dad7e");
                return;
            }
            this.totalHits = 0L;
            this.nullBidHits = 0L;
            this.cidHit.clear();
            this.bidHit.clear();
        }

        public synchronized JSONObject toJson() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b200bf249a7d23926a97a207f904a52", 6917529027641081856L)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b200bf249a7d23926a97a207f904a52");
            }
            synchronized (Stat.class) {
                try {
                    if (this.totalHits >= 1) {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        if (this.bidHit.size() > 0) {
                            for (Map.Entry<String, Long> entry : this.bidHit.entrySet()) {
                                if (entry != null) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("id", entry.getKey());
                                    jSONObject2.put("cnt", entry.getValue());
                                    jSONArray.put(jSONObject2);
                                }
                            }
                        }
                        jSONObject.put("bid", jSONArray);
                        JSONArray jSONArray2 = new JSONArray();
                        if (this.cidHit.size() > 0) {
                            for (Map.Entry<String, Long> entry2 : this.cidHit.entrySet()) {
                                if (entry2 != null) {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("id", entry2.getKey());
                                    jSONObject3.put("M*", entry2.getValue());
                                    jSONArray2.put(jSONObject3);
                                }
                            }
                        }
                        jSONObject.put("cid", jSONArray2);
                        if (this.nullBidHits >= 0) {
                            jSONObject.put("bid_null", this.nullBidHits);
                        }
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("cnt", this.totalHits);
                        jSONObject4.put(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, jSONObject);
                        jSONObject4.put(Constant.TAG_TM, this.mServerInteceptStrategy.mLastUpdateTm);
                        return jSONObject4;
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
    }
}
