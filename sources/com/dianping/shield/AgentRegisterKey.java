package com.dianping.shield;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AgentRegisterKey {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String extraKey;
    public String key;
    public String namespace;

    public AgentRegisterKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6764ed3da52c77216c6bca571d6ea0f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6764ed3da52c77216c6bca571d6ea0f5");
        } else {
            this.key = str;
        }
    }

    public AgentRegisterKey(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5063bf9a9d014c1698015e3aa944e8df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5063bf9a9d014c1698015e3aa944e8df");
            return;
        }
        this.key = str;
        this.extraKey = str2;
    }

    public AgentRegisterKey(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0527e0599630286e9cab2bbaecd1a3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0527e0599630286e9cab2bbaecd1a3b");
            return;
        }
        this.key = str;
        this.extraKey = str2;
        this.namespace = str3;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b8b95d4c121649c8a28f7f5b1cce859", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b8b95d4c121649c8a28f7f5b1cce859")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentRegisterKey agentRegisterKey = (AgentRegisterKey) obj;
        if (this.key.equals(agentRegisterKey.key)) {
            if (this.extraKey == null ? agentRegisterKey.extraKey == null : this.extraKey.equals(agentRegisterKey.extraKey)) {
                return this.namespace != null ? this.namespace.equals(agentRegisterKey.namespace) : agentRegisterKey.namespace == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91a500b54dbcef90a1e3a708347c1677", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91a500b54dbcef90a1e3a708347c1677")).intValue();
        }
        if (this.key != null) {
            return (this.namespace != null ? this.namespace.hashCode() : 0) + (((this.key.hashCode() * 31) + (this.extraKey != null ? this.extraKey.hashCode() : 0)) * 31);
        }
        return 0;
    }
}
