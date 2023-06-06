package com.meituan.msi.api.toast;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ToastApiParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int duration;
    @MsiParamChecker(in = {"success", "loading", "none"})
    public String icon;
    public String image;
    public boolean mask;
    public boolean relativeToScreen;
    public String title;

    public ToastApiParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79d8ad454145b842e97d52e30d5de78c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79d8ad454145b842e97d52e30d5de78c");
            return;
        }
        this.icon = "success";
        this.duration = 1500;
        this.relativeToScreen = false;
    }

    public static final ToastApiParam parse(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37dd6f24692f71e6f71c0a3513cf27bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (ToastApiParam) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37dd6f24692f71e6f71c0a3513cf27bb");
        }
        ToastApiParam toastApiParam = new ToastApiParam();
        toastApiParam.title = jSONObject.optString("title");
        toastApiParam.icon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
        toastApiParam.image = jSONObject.optString("image");
        toastApiParam.duration = jSONObject.optInt("duration", 1500);
        toastApiParam.mask = jSONObject.optBoolean("mask", false);
        return toastApiParam;
    }
}
