package com.meituan.android.common.weaver.impl.ffp;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
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
public class CustomTagsEvent implements WeaverEvent {
    private static String TYPE_BASE = "ct:nc";
    public static ChangeQuickRedirect changeQuickRedirect;
    @VisibleForTesting
    public long createMs;
    @VisibleForTesting
    public Map<String, Object> extras;
    public transient boolean isConsumed;
    @VisibleForTesting
    public String pagePath;

    static {
        WeaverParser.register(new WeaverParser() { // from class: com.meituan.android.common.weaver.impl.ffp.CustomTagsEvent.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.weaver.interfaces.WeaverParser
            public final WeaverEvent fromJson(@NonNull String str, JSONObject jSONObject, long j) throws JSONException {
                Object[] objArr = {str, jSONObject, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b3964ff19e272ad96939302c80f5eed", RobustBitConfig.DEFAULT_VALUE)) {
                    return (WeaverEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b3964ff19e272ad96939302c80f5eed");
                }
                if (str.startsWith(CustomTagsEvent.TYPE_BASE)) {
                    CustomTagsEvent customTagsEvent = new CustomTagsEvent();
                    customTagsEvent.fromJson(str, jSONObject, j);
                    return customTagsEvent;
                }
                return null;
            }
        });
    }

    public CustomTagsEvent(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfb06096398a053e5cec8c491ad9f7ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfb06096398a053e5cec8c491ad9f7ea");
            return;
        }
        this.pagePath = str;
        this.createMs = FFPUtil.currentTimeMillis();
        this.extras = new HashMap();
    }

    public CustomTagsEvent withExtra(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ef32f35b63d2da512e9e6a6b1b94040", RobustBitConfig.DEFAULT_VALUE)) {
            return (CustomTagsEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ef32f35b63d2da512e9e6a6b1b94040");
        }
        if (map.containsKey(ContainerEvent.EXTRA_CREATE_MS)) {
            Object remove = map.remove(ContainerEvent.EXTRA_CREATE_MS);
            if (remove instanceof Number) {
                this.createMs = ((Number) remove).longValue();
            }
        }
        this.extras.putAll(map);
        return this;
    }

    public CustomTagsEvent() {
    }

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    public void fromJson(@NonNull String str, @NonNull JSONObject jSONObject, long j) {
        Object[] objArr = {str, jSONObject, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6bc42ae9e9c44716141761073cdc996", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6bc42ae9e9c44716141761073cdc996");
            return;
        }
        this.createMs = j;
        try {
            this.pagePath = jSONObject.getString("pp");
            this.extras = FFPUtil.json2Map(jSONObject.getJSONObject("e"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    @NonNull
    public JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "470f88fee22e8a3c9c9fa72e2db70a2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "470f88fee22e8a3c9c9fa72e2db70a2a");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pp", this.pagePath);
            jSONObject.put("e", FFPUtil.map2Json(this.extras));
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    @NonNull
    public String getType() {
        return TYPE_BASE;
    }

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    public long createMs() {
        return this.createMs;
    }

    public void patchCustomTag(@NonNull WeaverEvent weaverEvent, @NonNull WeaverEvent weaverEvent2, @NonNull Map<String, Object> map) {
        Object[] objArr = {weaverEvent, weaverEvent2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c6a9d67784767badef2b73a47a2bc4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c6a9d67784767badef2b73a47a2bc4c");
        } else if (!this.isConsumed && weaverEvent.createMs() <= this.createMs && weaverEvent2.createMs() >= this.createMs && (weaverEvent2 instanceof WithActivity)) {
            if (!(this instanceof WithActivity) || TextUtils.equals(((WithActivity) this).activity(), ((WithActivity) weaverEvent2).activity())) {
                if (TextUtils.isEmpty(this.pagePath) || this.pagePath.equals(map.get("pagePath"))) {
                    this.isConsumed = true;
                    for (String str : this.extras.keySet()) {
                        if (!map.containsKey(str)) {
                            map.put(str, this.extras.get(str));
                        }
                    }
                }
            }
        }
    }
}
