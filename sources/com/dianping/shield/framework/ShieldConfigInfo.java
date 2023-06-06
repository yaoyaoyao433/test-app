package com.dianping.shield.framework;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ShieldConfigInfo implements Serializable, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5306273139801061667L;
    public Class agentClass;
    public String agentPath;
    public HashMap<String, Serializable> arguments;
    public String hostName;
    public int priority;

    public ShieldConfigInfo(String str, Class cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ee1d57b8cc77a143f633ea015e2e869", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ee1d57b8cc77a143f633ea015e2e869");
            return;
        }
        this.priority = ConfigPriority.MAIN;
        this.hostName = str;
        this.agentClass = cls;
    }

    public ShieldConfigInfo(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc7ce928565cea7817166cc56a5d37c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc7ce928565cea7817166cc56a5d37c4");
            return;
        }
        this.priority = ConfigPriority.MAIN;
        this.hostName = str;
        this.agentPath = str2;
    }

    public ShieldConfigInfo(String str, Class cls, int i) {
        Object[] objArr = {str, cls, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9bee541bd72d56d609845174548a6cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9bee541bd72d56d609845174548a6cc");
            return;
        }
        this.priority = ConfigPriority.MAIN;
        this.hostName = str;
        this.agentClass = cls;
        this.priority = i;
    }

    public ShieldConfigInfo(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d67b23480f448bb52f92f08772ea58aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d67b23480f448bb52f92f08772ea58aa");
            return;
        }
        this.priority = ConfigPriority.MAIN;
        this.hostName = str;
        this.agentPath = str2;
        this.priority = i;
    }

    public ShieldConfigInfo setShieldArguments(HashMap<String, Serializable> hashMap) {
        this.arguments = hashMap;
        return this;
    }

    public Object clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c233ec5481efcf088c8defdb5457b02b", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c233ec5481efcf088c8defdb5457b02b");
        }
        try {
            return (ShieldConfigInfo) super.clone();
        } catch (CloneNotSupportedException unused) {
            ShieldConfigInfo shieldConfigInfo = new ShieldConfigInfo(this.hostName, this.agentClass, this.priority);
            shieldConfigInfo.agentPath = this.agentPath;
            shieldConfigInfo.arguments = this.arguments;
            return shieldConfigInfo;
        }
    }
}
