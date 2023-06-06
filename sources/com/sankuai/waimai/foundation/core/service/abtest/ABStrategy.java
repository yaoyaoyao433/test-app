package com.sankuai.waimai.foundation.core.service.abtest;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.turbo.annotations.JsonField;
import com.meituan.android.turbo.annotations.JsonType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
@JsonType
/* loaded from: classes4.dex */
public class ABStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JsonField("exp_config_info")
    public String configInfo;
    @JsonField("exp_config_name")
    public String configName;
    @JsonField("exp_name")
    public String expName;
    @JsonField("exp_group_name")
    public String groupName;
    @JsonField("is_last")
    public boolean isLast;
    @JsonField("model_name")
    public String modelName;
    @JsonField("params_info")
    public Map<String, String> paramsInfo;
    @JsonField("scene_name")
    public String sceneName;

    public ABStrategy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efafd1194e329c01f0d2b0067cdd8638", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efafd1194e329c01f0d2b0067cdd8638");
        } else {
            this.isLast = false;
        }
    }

    public ABStrategy(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa09c35ccc3153f0761d214d805ecdfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa09c35ccc3153f0761d214d805ecdfd");
            return;
        }
        this.isLast = false;
        this.sceneName = str;
        this.modelName = str2;
        this.groupName = str3;
        this.expName = str4;
        this.configName = str5;
    }

    public ABStrategy(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Object[] objArr = {str, str2, str3, str4, str5, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50f554faaeb073fef63e5ca1ee81625f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50f554faaeb073fef63e5ca1ee81625f");
            return;
        }
        this.isLast = false;
        this.sceneName = str;
        this.modelName = str2;
        this.groupName = str3;
        this.expName = str4;
        this.configName = str5;
        this.paramsInfo = map;
    }

    @NonNull
    public String getStid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9d11d3544cc317915176e5b329384a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9d11d3544cc317915176e5b329384a3");
        }
        if (this.isLast) {
            return this.sceneName + ',' + this.modelName + ',' + this.groupName + ',' + this.expName + ',' + this.configName + ',' + this.paramsInfo;
        }
        return "";
    }

    public static ABStrategy fromJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f3df521b67f84137f8920a8fb0725c46", RobustBitConfig.DEFAULT_VALUE)) {
            return (ABStrategy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f3df521b67f84137f8920a8fb0725c46");
        }
        try {
            return (ABStrategy) com.meituan.android.turbo.a.a(ABStrategy.class, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "892b5e01f2a7e9e9ec1521bd1f3386b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "892b5e01f2a7e9e9ec1521bd1f3386b5");
        }
        try {
            return com.meituan.android.turbo.a.a(this);
        } catch (Exception unused) {
            return "";
        }
    }

    @Nullable
    public Map<String, String> getParams() {
        return this.paramsInfo;
    }

    @Nullable
    public String getParamWithKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "878f52beeef484220fbbc204ff26aeab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "878f52beeef484220fbbc204ff26aeab");
        }
        if (this.paramsInfo == null) {
            return null;
        }
        return this.paramsInfo.get(str);
    }
}
