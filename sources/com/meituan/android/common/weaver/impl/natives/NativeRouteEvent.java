package com.meituan.android.common.weaver.impl.natives;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.huawei.hms.opendevice.c;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.android.common.weaver.interfaces.WeaverParser;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.android.common.weaver.interfaces.ffp.WithActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NativeRouteEvent implements WeaverEvent, WithActivity {
    public static final String TYPE_BASE = "nr:";
    public static final String TYPE_CREATE = "nr:create";
    public static final String TYPE_DESTROY = "nr:destroy";
    public static final String TYPE_START = "nr:start";
    public static ChangeQuickRedirect changeQuickRedirect;
    public transient boolean isConsumed;
    private String mActivity;
    private long mCreateMs;
    private String mIntentAction;
    private String mIntentData;
    private String mTargetClass;
    private String mType;

    static {
        WeaverParser.register(new WeaverParser() { // from class: com.meituan.android.common.weaver.impl.natives.NativeRouteEvent.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.weaver.interfaces.WeaverParser
            public final WeaverEvent fromJson(@NonNull String str, JSONObject jSONObject, long j) throws JSONException {
                Object[] objArr = {str, jSONObject, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "558c880ba9d318f4d76e72b96657fbc2", RobustBitConfig.DEFAULT_VALUE)) {
                    return (WeaverEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "558c880ba9d318f4d76e72b96657fbc2");
                }
                if (str.startsWith(NativeRouteEvent.TYPE_BASE)) {
                    NativeRouteEvent nativeRouteEvent = new NativeRouteEvent();
                    nativeRouteEvent.fromJson(str, jSONObject, j);
                    return nativeRouteEvent;
                }
                return null;
            }
        });
    }

    public NativeRouteEvent() {
    }

    public static boolean isNativeRouteEvent(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "188108b3498d20e1aa35d70e67940758", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "188108b3498d20e1aa35d70e67940758")).booleanValue() : str.startsWith(TYPE_BASE);
    }

    @NonNull
    public static NativeRouteEvent of(@NonNull String str, @Nullable Activity activity, @Nullable Intent intent) {
        Object[] objArr = {str, activity, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9cd0126b2a4862695d83ee1010600454", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeRouteEvent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9cd0126b2a4862695d83ee1010600454");
        }
        NativeRouteEvent nativeRouteEvent = new NativeRouteEvent();
        nativeRouteEvent.mType = str;
        nativeRouteEvent.mCreateMs = FFPUtil.currentTimeMillis();
        if (activity != null) {
            nativeRouteEvent.mTargetClass = activity.getClass().getName();
            nativeRouteEvent.mActivity = FFPUtil.idOfObj(activity);
        }
        if (intent != null) {
            nativeRouteEvent.mIntentAction = intent.getAction();
            nativeRouteEvent.mIntentData = intent.getDataString();
            if (activity == null && intent.getComponent() != null) {
                nativeRouteEvent.mTargetClass = intent.getComponent().getClassName();
            }
        }
        return nativeRouteEvent;
    }

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    public void fromJson(@NonNull String str, @NonNull JSONObject jSONObject, long j) {
        Object[] objArr = {str, jSONObject, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6606906cf7f805c19bf0921993dbe00f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6606906cf7f805c19bf0921993dbe00f");
            return;
        }
        this.mType = str;
        this.mCreateMs = j;
        this.mIntentAction = jSONObject.optString("a");
        this.mIntentData = jSONObject.optString("d");
        this.mTargetClass = jSONObject.optString(c.a);
        this.mActivity = jSONObject.optString(Constants.GestureMoveEvent.KEY_Y);
    }

    @Override // com.meituan.android.common.weaver.interfaces.WeaverEvent
    @NonNull
    public JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14f01c46cded08ee7fbe2901adf4206a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14f01c46cded08ee7fbe2901adf4206a");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("a", this.mIntentAction);
            jSONObject.put("d", this.mIntentData);
            jSONObject.put(c.a, this.mTargetClass);
            jSONObject.put(Constants.GestureMoveEvent.KEY_Y, this.mActivity);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.WithActivity
    @NonNull
    public String activity() {
        return this.mActivity;
    }

    public boolean isStartEventOfActivity(@NonNull NativeRouteEvent nativeRouteEvent) {
        Object[] objArr = {nativeRouteEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c916ccacb7538222683c3c155dc0b8dd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c916ccacb7538222683c3c155dc0b8dd")).booleanValue() : TextUtils.equals(this.mIntentAction, nativeRouteEvent.mIntentAction) && TextUtils.equals(this.mIntentData, nativeRouteEvent.mIntentData) && (this.mTargetClass == null || TextUtils.equals(this.mTargetClass, nativeRouteEvent.mTargetClass)) && this.mCreateMs <= nativeRouteEvent.mCreateMs;
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
}
