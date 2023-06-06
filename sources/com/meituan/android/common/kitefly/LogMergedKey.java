package com.meituan.android.common.kitefly;

import android.text.TextUtils;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LogMergedKey {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Boolean isGeneralChannel;
    public Boolean isLv4Local;
    public Boolean isNewLog;
    public String reportChannel;
    public String token;

    public LogMergedKey(String str, String str2, Log.InnerProperty innerProperty) {
        Object[] objArr = {str, str2, innerProperty};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "682917dd93560e954421c62f348cae25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "682917dd93560e954421c62f348cae25");
            return;
        }
        this.reportChannel = "";
        this.token = "";
        this.isLv4Local = Boolean.FALSE;
        this.isNewLog = Boolean.FALSE;
        this.isGeneralChannel = Boolean.FALSE;
        this.reportChannel = TextUtils.isEmpty(str) ? "" : str;
        this.token = TextUtils.isEmpty(str2) ? "" : str2;
        this.isLv4Local = innerProperty.isLv4Local;
        this.isNewLog = innerProperty.isNewLog;
        this.isGeneralChannel = Boolean.valueOf(innerProperty.isGeneralChannel);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14adac7c84f304c849c4a4036a3b4b3a", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14adac7c84f304c849c4a4036a3b4b3a")).intValue() : (((((((((((((this.reportChannel.hashCode() + 527) % 1313) * 31) + this.token.hashCode()) % 1313) * 31) + this.isLv4Local.hashCode()) % 1313) * 31) + this.isNewLog.hashCode()) % 1313) * 31) + this.isGeneralChannel.hashCode()) % 1313;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92267fd4e09efb71d859e14511f89f33", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92267fd4e09efb71d859e14511f89f33")).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof LogMergedKey) {
            LogMergedKey logMergedKey = (LogMergedKey) obj;
            return TextUtils.equals(logMergedKey.reportChannel, this.reportChannel) && TextUtils.equals(logMergedKey.token, this.token) && this.isLv4Local.compareTo(logMergedKey.isLv4Local) == 0 && this.isNewLog.compareTo(logMergedKey.isNewLog) == 0 && this.isGeneralChannel.compareTo(logMergedKey.isGeneralChannel) == 0;
        }
        return false;
    }
}
