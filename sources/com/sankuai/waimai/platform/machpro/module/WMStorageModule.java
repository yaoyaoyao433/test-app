package com.sankuai.waimai.platform.machpro.module;

import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.machpro.util.b;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMStorageModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public WMStorageModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bad11ef5bf2dffdcfee2b11f15d2f93d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bad11ef5bf2dffdcfee2b11f15d2f93d");
        }
    }

    @JSMethod(methodName = "setNumber")
    public boolean setNumber(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "476d0d3eff01e045ed8ba8a862198bed", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "476d0d3eff01e045ed8ba8a862198bed")).booleanValue() : setValue(machMap);
    }

    @JSMethod(methodName = "getNumber")
    public Object getNumber(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e273287ccd6ae8744a9508236b168b7", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e273287ccd6ae8744a9508236b168b7") : getValue(machMap);
    }

    @JSMethod(methodName = "setBool")
    public boolean setBool(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5b481cc3b4468280cd95330055716c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5b481cc3b4468280cd95330055716c9")).booleanValue() : setValue(machMap);
    }

    @JSMethod(methodName = "getBool")
    public Object getBool(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89e5e744ace851a2ea8642800a4a6274", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89e5e744ace851a2ea8642800a4a6274") : getValue(machMap);
    }

    private boolean setValue(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02a2226c48072db38c127eaa4ba519bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02a2226c48072db38c127eaa4ba519bb")).booleanValue();
        }
        if (machMap == null) {
            return false;
        }
        Double.valueOf(0.0d);
        try {
            String a = b.a(machMap.get("channel"), "");
            String a2 = b.a(machMap.get("key"), "");
            Object obj = machMap.get("value");
            q a3 = q.a(com.meituan.android.singleton.b.a, a, 1);
            if (obj instanceof Integer) {
                return a3.a(a2, ((Integer) obj).intValue());
            }
            if (obj instanceof Double) {
                return a3.a(a2, ((Double) obj).doubleValue());
            }
            if (obj instanceof Boolean) {
                return a3.a(a2, ((Boolean) obj).booleanValue());
            }
            if (obj instanceof String) {
                return a3.a(a2, (String) obj);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private Object getValue(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24555c64f6865427ece7b180213b0707", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24555c64f6865427ece7b180213b0707");
        }
        if (machMap == null) {
            return null;
        }
        try {
            String a = b.a(machMap.get("channel"), "");
            String a2 = b.a(machMap.get("key"), "");
            Map<String, ?> b = q.a(com.meituan.android.singleton.b.a, a, 1).b();
            if (b == null) {
                return null;
            }
            for (Map.Entry<String, ?> entry : b.entrySet()) {
                if (entry != null && TextUtils.equals(entry.getKey(), a2)) {
                    return entry.getValue();
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @JSMethod(methodName = "setString")
    public boolean setString(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17b2756b8b9b46d09bbe6da1195a2276", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17b2756b8b9b46d09bbe6da1195a2276")).booleanValue() : setValue(machMap);
    }

    @JSMethod(methodName = "getString")
    public Object getString(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0e4412769554499977fc31d01f11704", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0e4412769554499977fc31d01f11704") : getValue(machMap);
    }

    @JSMethod(methodName = "setArray")
    public boolean setArray(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bd9887ec846c9da818d72718541c0e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bd9887ec846c9da818d72718541c0e2")).booleanValue();
        }
        if (machMap == null) {
            return false;
        }
        try {
            return q.a(com.meituan.android.singleton.b.a, b.a(machMap.get("channel"), ""), 1).a(b.a(machMap.get("key"), ""), machMap.get("value") instanceof MachArray ? ((MachArray) machMap.get("value")).toString() : "");
        } catch (Exception unused) {
            return false;
        }
    }

    @JSMethod(methodName = "getArray")
    public MachArray getArray(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eab10072648a937013380a76b54677fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eab10072648a937013380a76b54677fa");
        }
        Object value = getValue(machMap);
        if (value instanceof String) {
            try {
                return b.a(new JSONArray((String) value));
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @JSMethod(methodName = "setDictionary")
    public boolean setDictionary(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6403e0738c04f7dcf7ac3ade0e51ede8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6403e0738c04f7dcf7ac3ade0e51ede8")).booleanValue();
        }
        if (machMap == null) {
            return false;
        }
        try {
            return q.a(com.meituan.android.singleton.b.a, b.a(machMap.get("channel"), ""), 1).a(b.a(machMap.get("key"), ""), machMap.get("value") instanceof MachMap ? b.c((MachMap) machMap.get("value")).toString() : "");
        } catch (Exception unused) {
            return false;
        }
    }

    @JSMethod(methodName = "getDictionary")
    public MachMap getDictionary(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "960955c53d97b692438e7879004026d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "960955c53d97b692438e7879004026d1");
        }
        Object value = getValue(machMap);
        if (value instanceof String) {
            try {
                return b.a(new JSONObject((String) value));
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @JSMethod(methodName = "remove")
    public void remove(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "989c3ce5f3b5ff764c7f8cd7741ccc62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "989c3ce5f3b5ff764c7f8cd7741ccc62");
        } else if (machMap == null) {
        } else {
            try {
                q.a(com.meituan.android.singleton.b.a, b.a(machMap.get("channel"), ""), 1).b(b.a(machMap.get("key"), ""));
            } catch (Exception unused) {
            }
        }
    }
}
