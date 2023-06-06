package com.meituan.android.common.weaver.impl.natives;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.android.common.weaver.interfaces.WeaverParser;
import com.meituan.android.common.weaver.interfaces.ffp.ContainerEvent;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.android.common.weaver.interfaces.ffp.WithActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NativeFFPEvent implements WeaverEvent, WithActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int failType;
    public transient boolean isConsumed;
    private String mActivity;
    private long mCreateMs;
    @NonNull
    private Map<String, Object> mExtra;
    private int successType;

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    @NonNull
    public String getType() {
        return "n:";
    }

    public boolean isEnd() {
        return true;
    }

    public boolean isGiveUp() {
        return true;
    }

    static {
        WeaverParser.register(new WeaverParser() { // from class: com.meituan.android.common.weaver.impl.natives.NativeFFPEvent.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.weaver.interfaces.WeaverParser
            public final WeaverEvent fromJson(@NonNull String str, JSONObject jSONObject, long j) throws JSONException {
                Object[] objArr = {str, jSONObject, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a59e0695ab767dd7507385aadeae31a3", RobustBitConfig.DEFAULT_VALUE)) {
                    return (WeaverEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a59e0695ab767dd7507385aadeae31a3");
                }
                if (str.startsWith("n:")) {
                    NativeFFPEvent nativeFFPEvent = new NativeFFPEvent();
                    nativeFFPEvent.fromJson(str, jSONObject, j);
                    return nativeFFPEvent;
                }
                return null;
            }
        });
    }

    public NativeFFPEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4d3d30fd54fb2088fa373ea168f63fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4d3d30fd54fb2088fa373ea168f63fd");
            return;
        }
        this.mExtra = new HashMap();
        this.failType = 0;
        this.successType = 0;
    }

    public static NativeFFPEvent of(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2976e924e8b68add54b252dd75747d10", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeFFPEvent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2976e924e8b68add54b252dd75747d10");
        }
        NativeFFPEvent nativeFFPEvent = new NativeFFPEvent();
        nativeFFPEvent.mActivity = FFPUtil.idOfObj(activity);
        nativeFFPEvent.mExtra.put("nPage", activity.getClass().getName());
        nativeFFPEvent.mExtra.put("tType", "native");
        return nativeFFPEvent;
    }

    public NativeFFPEvent withDefaultCreateMs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77f158248d3adb81655e94e90712bc5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeFFPEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77f158248d3adb81655e94e90712bc5b");
        }
        this.mCreateMs = FFPUtil.currentTimeMillis();
        return this;
    }

    public NativeFFPEvent withCreateMs(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3de18df37dbafbea5fac587c5d51f644", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeFFPEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3de18df37dbafbea5fac587c5d51f644");
        }
        this.mCreateMs = j;
        return this;
    }

    public NativeFFPEvent withErrType(int i) {
        this.failType = i;
        return this;
    }

    public NativeFFPEvent withRenderRate(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "792dbc126751f0621cef0508b66cc743", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeFFPEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "792dbc126751f0621cef0508b66cc743");
        }
        this.mExtra.put("renderRate", Float.valueOf(f));
        return this;
    }

    public NativeFFPEvent withReachBottom(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bbb523f4e00e55183b344373e58a761", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeFFPEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bbb523f4e00e55183b344373e58a761");
        }
        this.mExtra.put("reachBottom", z ? "reached" : "notReached");
        return this;
    }

    public NativeFFPEvent withCostMs(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71a9e91f3f04b6438c162602395dece5", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeFFPEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71a9e91f3f04b6438c162602395dece5");
        }
        this.mExtra.put("costMs", Long.valueOf(j));
        return this;
    }

    public NativeFFPEvent withPagePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8940ae9aef329ee72db5adc9d13767e", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeFFPEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8940ae9aef329ee72db5adc9d13767e");
        }
        this.mExtra.put("pagePath", str);
        return this;
    }

    public NativeFFPEvent withPageUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c4e1e098ae06a48ceb70d7697d851f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeFFPEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c4e1e098ae06a48ceb70d7697d851f8");
        }
        this.mExtra.put("pageUrl", str);
        return this;
    }

    public NativeFFPEvent withFinishType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d1c536e07c086d73eb5347fc84eab9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeFFPEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d1c536e07c086d73eb5347fc84eab9f");
        }
        this.mExtra.put("fType", str);
        return this;
    }

    public NativeFFPEvent with(@NonNull String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b2270ed5faa2abc53f90f44da4d5738", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeFFPEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b2270ed5faa2abc53f90f44da4d5738");
        }
        this.mExtra.put(str, obj);
        return this;
    }

    @NonNull
    public Map<String, Object> getExtra() {
        return this.mExtra;
    }

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    public void fromJson(@NonNull String str, @NonNull JSONObject jSONObject, long j) {
        Object[] objArr = {str, jSONObject, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a4e626f9393d85cfd3d20a73bc96b8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a4e626f9393d85cfd3d20a73bc96b8c");
            return;
        }
        this.mCreateMs = j;
        this.mActivity = jSONObject.optString("a");
        this.mExtra = FFPUtil.json2Map(jSONObject.optJSONObject("e"));
    }

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    @NonNull
    public JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaa5d124eb14da8489f7e3cb8a14721f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaa5d124eb14da8489f7e3cb8a14721f");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("a", this.mActivity);
            jSONObject.put("e", FFPUtil.map2Json(this.mExtra));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    public long createMs() {
        return this.mCreateMs;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.WithActivity
    @NonNull
    public String activity() {
        return this.mActivity;
    }

    public void fillBabelArgs(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b23dd06bc270f018c5464eca05f830a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b23dd06bc270f018c5464eca05f830a");
        } else {
            map.putAll(this.mExtra);
        }
    }

    @NonNull
    public ContainerEvent toContainerEvent() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3300485eeee7ead1aa6d4c6fd0be57b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContainerEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3300485eeee7ead1aa6d4c6fd0be57b");
        }
        String str2 = (String) this.mExtra.get("containerId");
        this.mExtra.remove("containerId");
        this.mExtra.put("eType", this.mExtra.get("fType"));
        this.mExtra.put(ContainerEvent.EXTRA_CREATE_MS, Long.valueOf(createMs()));
        if (this.mExtra.containsKey("$containerName")) {
            str = (String) this.mExtra.get("$containerName");
            this.mExtra.remove("$containerName");
        } else {
            str = (String) this.mExtra.get("tType");
        }
        return ContainerEvent.fromNative(str, activity(), str2, this.mExtra);
    }
}
