package com.sankuai.waimai.machpro.base;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.util.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MachMap implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MachArray mProperties;
    private final Map<String, Object> mPropertiesMap;

    public MachMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ebcc206d4030beb8de69955f5bd42bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ebcc206d4030beb8de69955f5bd42bc");
            return;
        }
        this.mPropertiesMap = new HashMap();
        this.mProperties = new MachArray();
    }

    public MachMap(MachArray machArray) {
        this();
        Object[] objArr = {machArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16d1b6aa2583569665237b5e70b98312", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16d1b6aa2583569665237b5e70b98312");
            return;
        }
        this.mProperties = machArray;
        for (int i = 0; i < this.mProperties.size(); i += 2) {
            this.mPropertiesMap.put(this.mProperties.get(i).toString(), this.mProperties.get(i + 1));
        }
    }

    private MachArray getProperties() {
        return this.mProperties;
    }

    public void put(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5625fe4f3f68ffe6772712778cf91a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5625fe4f3f68ffe6772712778cf91a1");
        } else if (str == null) {
            a.a("MachMap.put exception-->key is null");
        } else {
            this.mPropertiesMap.put(str, obj);
            this.mProperties.add(str);
            this.mProperties.add(obj);
        }
    }

    public void putAll(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6af104303c7bf99e8dbadf72e18c4ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6af104303c7bf99e8dbadf72e18c4ca");
        } else if (machMap == null) {
            a.a("MachMap.putAll exception-->map is null");
        } else {
            for (Map.Entry<String, Object> entry : machMap.getJavaMap().entrySet()) {
                this.mProperties.add(entry.getKey());
                this.mProperties.add(entry.getValue());
            }
            this.mPropertiesMap.putAll(machMap.getJavaMap());
        }
    }

    public Object get(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd1c9a5f5dd408a96f908f9639a5d80e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd1c9a5f5dd408a96f908f9639a5d80e") : this.mPropertiesMap.get(str);
    }

    public int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff12b31488c0df34b9a315ae33839c48", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff12b31488c0df34b9a315ae33839c48")).intValue() : this.mPropertiesMap.size();
    }

    public Map<String, Object> getJavaMap() {
        return this.mPropertiesMap;
    }

    public boolean containsKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "717e856f5638c5f5eefc7f84fc9d738b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "717e856f5638c5f5eefc7f84fc9d738b")).booleanValue() : this.mPropertiesMap.containsKey(str);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3384fb77ed661c6854e4a7a738a9726e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3384fb77ed661c6854e4a7a738a9726e") : this.mPropertiesMap.toString();
    }
}
