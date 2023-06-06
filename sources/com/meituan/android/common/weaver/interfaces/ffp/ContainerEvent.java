package com.meituan.android.common.weaver.interfaces.ffp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.huawei.hms.opendevice.c;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.android.common.weaver.interfaces.WeaverParser;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ContainerEvent implements WeaverEvent, WithActivity {
    public static String CONTAINER_NAME_FRAGMENT = "fragment";
    public static String CONTAINER_NAME_KNB = "knb";
    public static String CONTAINER_NAME_MMP = "mmp";
    public static String CONTAINER_NAME_MSC = "msc";
    public static String EXTRA_CREATE_MS = "createMs";
    public static String EXTRA_TYPE = "eType";
    public static String TYPE_BASE = "c:";
    private static String TYPE_INTERACT = "interact";
    public static final String TYPE_ROUTE_LOAD_URL = "routeLoadUrl";
    public static final String TYPE_ROUTE_OVERLOAD_URL = "routeOverrideUrl";
    private static String TYPE_SUCCESS = "success";
    private static String TYPE_TIMEOUT = "timeout";
    public static ChangeQuickRedirect changeQuickRedirect;
    public transient boolean isConsumed;
    private String mActivity;
    private String mContainerId;
    private String mContainerName;
    private long mCreateMs;
    private String mEType;
    private Map<String, Object> mMap;
    private String mType;

    static {
        WeaverParser.register(new WeaverParser() { // from class: com.meituan.android.common.weaver.interfaces.ffp.ContainerEvent.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.weaver.interfaces.WeaverParser
            public final WeaverEvent fromJson(@NonNull String str, JSONObject jSONObject, long j) throws JSONException {
                Object[] objArr = {str, jSONObject, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6058388d5b314fd5fb4f64f07b22f068", RobustBitConfig.DEFAULT_VALUE)) {
                    return (WeaverEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6058388d5b314fd5fb4f64f07b22f068");
                }
                if (str.startsWith(ContainerEvent.TYPE_BASE)) {
                    ContainerEvent containerEvent = new ContainerEvent();
                    containerEvent.fromJson(str, jSONObject, j);
                    return containerEvent;
                }
                return null;
            }
        });
    }

    public ContainerEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e8ea6383871180da3d825408d8b37fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e8ea6383871180da3d825408d8b37fa");
            return;
        }
        this.mActivity = str2;
        this.mContainerId = str3;
        this.mMap = map;
        this.mContainerName = str;
        this.mEType = (String) map.get(EXTRA_TYPE);
        if (isEnd()) {
            map.put("fType", this.mEType);
        }
        this.mType = TYPE_BASE + str + CommonConstant.Symbol.COLON + this.mEType;
    }

    public ContainerEvent() {
    }

    @NonNull
    public static ContainerEvent of(@NonNull String str, @NonNull Activity activity, @NonNull Object obj, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, activity, obj, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "386c5e2eb57968e8476a57a57d89ac14", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContainerEvent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "386c5e2eb57968e8476a57a57d89ac14");
        }
        if (map == null) {
            map = new HashMap<>();
        }
        ContainerEvent containerEvent = new ContainerEvent(str, FFPUtil.idOfObj(activity), FFPUtil.idOfObj(obj), map);
        containerEvent.initFromExtra(activity, map);
        return containerEvent;
    }

    public static ContainerEvent msc(@NonNull Activity activity, @NonNull String str, @NonNull Map<String, Object> map) {
        Object[] objArr = {activity, str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7647a5679e2b2a2f2cfa9c643775e5f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContainerEvent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7647a5679e2b2a2f2cfa9c643775e5f8");
        }
        ContainerEvent containerEvent = new ContainerEvent(ContainerInfo.ENV_MSC, FFPUtil.idOfObj(activity), str, map);
        containerEvent.initFromExtra(activity, map);
        return containerEvent;
    }

    @NonNull
    public static ContainerEvent fromNative(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "85b94753818d15d464e6b188ecc6f0b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContainerEvent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "85b94753818d15d464e6b188ecc6f0b5");
        }
        ContainerEvent containerEvent = new ContainerEvent(str, str2, str3, map);
        containerEvent.mCreateMs = ((Long) map.get(EXTRA_CREATE_MS)).longValue();
        return containerEvent;
    }

    private void initFromExtra(@NonNull Activity activity, @NonNull Map<String, Object> map) {
        Object[] objArr = {activity, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e90f8c0bec01aa7d2b0e0360bd28d516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e90f8c0bec01aa7d2b0e0360bd28d516");
            return;
        }
        if (isEnd()) {
            map.put("nPage", activity.getClass().getName());
        }
        if (map.containsKey(EXTRA_CREATE_MS)) {
            this.mCreateMs = ((Long) map.get(EXTRA_CREATE_MS)).longValue();
        } else {
            this.mCreateMs = FFPUtil.currentTimeMillis();
        }
    }

    public static ContainerEvent fake() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d19680c5178b929d8be6505032e57d09", RobustBitConfig.DEFAULT_VALUE) ? (ContainerEvent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d19680c5178b929d8be6505032e57d09") : new ContainerEvent();
    }

    public boolean isSamePage(@NonNull ContainerEvent containerEvent) {
        Object[] objArr = {containerEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27ca4fce8691ea7c978c4b416526adf2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27ca4fce8691ea7c978c4b416526adf2")).booleanValue();
        }
        if (TextUtils.equals(this.mActivity, containerEvent.activity()) && TextUtils.equals(this.mContainerId, containerEvent.getContainerId())) {
            if (CONTAINER_NAME_KNB.equals(this.mContainerName) || CONTAINER_NAME_FRAGMENT.equals(this.mContainerName)) {
                return true;
            }
            Object obj = this.mMap.get("pagePath");
            Object obj2 = containerEvent.mMap.get("pagePath");
            return (obj == null && obj2 == null) || (obj != null && obj.equals(obj2));
        }
        return false;
    }

    public boolean isCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "949cf0ae82d49fa14b4fa0dba90c44b7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "949cf0ae82d49fa14b4fa0dba90c44b7")).booleanValue() : TYPE_ROUTE_LOAD_URL.equals(this.mEType) || TYPE_ROUTE_OVERLOAD_URL.equals(this.mEType) || "start".equals(this.mEType);
    }

    public boolean isEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc39327900c344ee00540105acc7443c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc39327900c344ee00540105acc7443c")).booleanValue() : TYPE_TIMEOUT.equals(this.mEType) || TYPE_SUCCESS.equals(this.mEType) || TYPE_INTERACT.equals(this.mEType);
    }

    public boolean shouldIgnoreNativeCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2f14be7cf00d19fcfa3b603bec912be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2f14be7cf00d19fcfa3b603bec912be")).booleanValue();
        }
        Object obj = this.mMap.get("isWidget");
        return (obj instanceof Boolean) && ((Boolean) obj).booleanValue();
    }

    @NonNull
    public String getContainerId() {
        return this.mContainerId;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.WithActivity
    @NonNull
    public String activity() {
        return this.mActivity;
    }

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    public void fromJson(@NonNull String str, @NonNull JSONObject jSONObject, long j) {
        Object[] objArr = {str, jSONObject, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f914cb27d87e80d25af5ce5d90239e07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f914cb27d87e80d25af5ce5d90239e07");
            return;
        }
        this.mType = str;
        this.mCreateMs = j;
        this.mActivity = jSONObject.optString("a");
        this.mContainerId = jSONObject.optString("i");
        this.mContainerName = jSONObject.optString(c.a);
        JSONObject optJSONObject = jSONObject.optJSONObject("e");
        this.mEType = jSONObject.optString("et");
        this.mMap = FFPUtil.json2Map(optJSONObject);
    }

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    @NonNull
    public JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f4d8f0e879347332330d26901b9cdd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f4d8f0e879347332330d26901b9cdd7");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("a", this.mActivity);
            jSONObject.put("i", this.mContainerId);
            jSONObject.put(c.a, this.mContainerName);
            jSONObject.put("e", FFPUtil.map2Json(this.mMap));
            jSONObject.put("et", this.mEType);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    @NonNull
    public String getType() {
        return this.mType;
    }

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    public long createMs() {
        return this.mCreateMs;
    }

    @Nullable
    public Map<String, Object> getMap() {
        return this.mMap;
    }

    public void fillBabelArgs(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a97f6a487c8384d96abfbde57adc8f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a97f6a487c8384d96abfbde57adc8f7");
        } else {
            map.putAll(this.mMap);
        }
    }
}
