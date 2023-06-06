package com.meituan.passport.pojo;

import android.support.annotation.RestrictTo;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class LoggedInAppsResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<AppInfo> data;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class AppInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String appName;
        public String appShowName;
        public String hasClickedSinkIcon;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String iconUrl;
        public int index;
        public String mobile;
        public String nickName;
        public String ticket;
        public String unClickedSinkIcon;

        public AppInfo() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55699ff420ed78c2efeb2689f7b45f09", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55699ff420ed78c2efeb2689f7b45f09");
            } else {
                this.index = 0;
            }
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c17bf6b66db3171d5b444705b83731be", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c17bf6b66db3171d5b444705b83731be");
            }
            return "AppInfo{iconUrl='" + this.iconUrl + "', mobile='" + this.mobile + "', ticket='" + this.ticket + "', nickName='" + this.nickName + "', appName='" + this.appName + "', appShowName='" + this.appShowName + "', hasClickedSinkIcon='" + this.hasClickedSinkIcon + "', unClickedSinkIcon='" + this.unClickedSinkIcon + "'}";
        }
    }

    private String getData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32c8b2cbc8219721cbf6abc4cf8eaef6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32c8b2cbc8219721cbf6abc4cf8eaef6");
        }
        if (this.data == null || this.data.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<AppInfo> it = this.data.iterator();
        while (it.hasNext()) {
            AppInfo next = it.next();
            sb.append(next != null ? next.toString() : "");
            sb.append('\'');
        }
        return sb.toString();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "628e3ff89e6ca7a26dec04338232021e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "628e3ff89e6ca7a26dec04338232021e");
        }
        return "LoggedInAppsResult{data='" + getData() + "'}";
    }
}
