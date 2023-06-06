package com.meituan.passport.pojo;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LoginConfigResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("entries")
    public ArrayList<EntryData> list;
    @SerializedName("switches")
    public SwitchData switchData;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class EntryData {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String name;

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84fc07135c6538408799250a6d265c74", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84fc07135c6538408799250a6d265c74");
            }
            return "EntryData{name='" + this.name + '}';
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SwitchData {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("china_mobile_oneKey_login")
        public boolean mobileOperatoeOpen;
        @SerializedName("password_login")
        public boolean passwordLogin;
        @SerializedName("china_telecom_oneKey_login")
        public boolean telecomOperatorOpen;
        @SerializedName("china_unicom_oneKey_login")
        public boolean unicomOperatorOpen;

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8aee98e3f28841759387f79564ed8d3c", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8aee98e3f28841759387f79564ed8d3c");
            }
            return "SwitchData{china_mobile='" + this.mobileOperatoeOpen + "', china_telecom='" + this.telecomOperatorOpen + "', china_unicom='" + this.unicomOperatorOpen + "', password_login='" + this.passwordLogin + "'}";
        }
    }

    private String getEntries() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0bb3cd921a7ea4467245a7e6da0f7d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0bb3cd921a7ea4467245a7e6da0f7d7");
        }
        if (this.list == null || this.list.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.list.size(); i++) {
            EntryData entryData = this.list.get(i);
            sb.append(entryData != null ? entryData.toString() : "");
            sb.append('\'');
        }
        return sb.toString();
    }

    private String getSwitches() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dd846690fcc57dcb92a4f09ded0189a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dd846690fcc57dcb92a4f09ded0189a") : this.switchData == null ? "" : this.switchData.toString();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fc273ec2ef3e1afa0122bc90d79dae6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fc273ec2ef3e1afa0122bc90d79dae6");
        }
        return "LoginConfigResult{entries='" + getEntries() + "', switches='" + getSwitches() + "'}";
    }
}
