package com.sankuai.waimai.platform.capacity.ad;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.mach.utils.b;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.xm.im.message.bean.Message;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class WMADStrategyNativeModule implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "wmabtest";
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44d669ed8f04011e5ff641e8c9a94e71", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44d669ed8f04011e5ff641e8c9a94e71") : new String[]{"getStrategy"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, String str2, String str3, com.sankuai.waimai.mach.jsv8.a aVar) {
        ResultInfo resultInfo;
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e910fb63f4c0b63936c426add075d21c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e910fb63f4c0b63936c426add075d21c");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                String optString = new JSONObject(str2).optString(Message.GROUP_NAME);
                if (TextUtils.isEmpty(optString)) {
                    jSONObject2.put("msg", "groupName 不能为空");
                    jSONObject2.put("result", new JSONObject());
                    jSONObject.put("data", jSONObject2);
                    jSONObject.put("status", -1);
                    aVar.a(str3, jSONObject.toString());
                    return;
                }
                ABStrategy strategy = ABTestManager.getInstance().getStrategy(optString, null);
                if (strategy == null) {
                    jSONObject2.put("msg", "AB strategy key is empty!");
                    jSONObject2.put("result", new JSONObject());
                    jSONObject.put("data", jSONObject2);
                    jSONObject.put("status", -1);
                    aVar.a(str3, jSONObject.toString());
                    return;
                }
                CallbackInfo callbackInfo = new CallbackInfo();
                callbackInfo.status = 0;
                DataInfo dataInfo = new DataInfo();
                dataInfo.msg = "成功";
                Object[] objArr2 = {strategy};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a80db9e5d333dc5186a05b34f6aa645d", RobustBitConfig.DEFAULT_VALUE)) {
                    resultInfo = (ResultInfo) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a80db9e5d333dc5186a05b34f6aa645d");
                } else {
                    ResultInfo resultInfo2 = new ResultInfo();
                    resultInfo2.configInfo = strategy.configInfo;
                    resultInfo2.newtest = strategy.isLast ? "1" : "0";
                    resultInfo2.paramsInfo = strategy.paramsInfo;
                    resultInfo2.expName = strategy.expName;
                    resultInfo2.sceneName = strategy.sceneName;
                    resultInfo2.groupName = strategy.groupName;
                    resultInfo2.modelName = strategy.modelName;
                    resultInfo2.configName = strategy.configName;
                    resultInfo = resultInfo2;
                }
                dataInfo.result = resultInfo;
                callbackInfo.data = dataInfo;
                aVar.a(str3, b.a().toJson(callbackInfo));
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.e("WMADStrategyNativeModule", e.toString(), new Object[0]);
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    static final class CallbackInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("data")
        public DataInfo data;
        @SerializedName("status")
        public int status;

        public CallbackInfo() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    static final class DataInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("msg")
        public String msg;
        @SerializedName("result")
        public ResultInfo result;

        public DataInfo() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    static final class ResultInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("configInfo")
        public String configInfo;
        @SerializedName("configName")
        public String configName;
        @SerializedName("expName")
        public String expName;
        @SerializedName(Message.GROUP_NAME)
        public String groupName;
        @SerializedName("modelName")
        public String modelName;
        @SerializedName("newtest")
        public String newtest;
        @SerializedName("paramsInfo")
        public Map<String, String> paramsInfo;
        @SerializedName("sceneName")
        public String sceneName;

        public ResultInfo() {
        }
    }
}
