package com.sankuai.waimai.irmo.canvas.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray;
import com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap;
import com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d implements IJSCallbackMap, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected b mProperties;
    protected Map<String, Object> mPropertiesMap;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72b6845bc60a7d19729eeaf092181b97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72b6845bc60a7d19729eeaf092181b97");
            return;
        }
        this.mPropertiesMap = new HashMap();
        this.mProperties = new b();
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public boolean hasKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f93189c5af890451dc2e802507f913d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f93189c5af890451dc2e802507f913d")).booleanValue() : this.mPropertiesMap.containsKey(str);
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public boolean isNull(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92026341cfdaec63561794168f8ec439", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92026341cfdaec63561794168f8ec439")).booleanValue() : get(str) == null;
    }

    public Object get(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95ab223def20836717f44346387575eb", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95ab223def20836717f44346387575eb") : this.mPropertiesMap.get(str);
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public boolean getBoolean(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bc30bce7c409297c088b7d9e8952c8b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bc30bce7c409297c088b7d9e8952c8b")).booleanValue();
        }
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        com.sankuai.waimai.irmo.canvas.util.a.a(5, "INFEMap getBoolean failed, type error.", new Object[0]);
        return false;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public double getDouble(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c19660d4ad49440c621e8dce7bb13b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c19660d4ad49440c621e8dce7bb13b1")).doubleValue();
        }
        Object obj = get(str);
        if ((obj instanceof Double) || (obj instanceof Float)) {
            return ((Double) obj).doubleValue();
        }
        com.sankuai.waimai.irmo.canvas.util.a.a(5, "INFEMap getDouble failed, type error.", new Object[0]);
        return 0.0d;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public int getInt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa0741b150ec5bd600f27d49b5a49be8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa0741b150ec5bd600f27d49b5a49be8")).intValue();
        }
        Object obj = get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        com.sankuai.waimai.irmo.canvas.util.a.a(5, "INFEMap getInt failed, type error.", new Object[0]);
        return 0;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public String getString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68152bb9ca7dd338021721138ea74b4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68152bb9ca7dd338021721138ea74b4b");
        }
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        com.sankuai.waimai.irmo.canvas.util.a.a(5, "INFEMap getString failed, type error.", new Object[0]);
        return null;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public IJSCallbackArray getArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e67d8b0d344ae64e89a1d26ee33086d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (IJSCallbackArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e67d8b0d344ae64e89a1d26ee33086d0");
        }
        Object obj = get(str);
        if (obj instanceof IJSCallbackArray) {
            return (IJSCallbackArray) obj;
        }
        com.sankuai.waimai.irmo.canvas.util.a.a(5, "INFEMap getArray failed, type error.", new Object[0]);
        return null;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public IJSCallbackMap getMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab92c0732e09ec29fbe778c8ce6f61fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (IJSCallbackMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab92c0732e09ec29fbe778c8ce6f61fc");
        }
        Object obj = get(str);
        if (obj instanceof IJSCallbackMap) {
            return (IJSCallbackMap) obj;
        }
        com.sankuai.waimai.irmo.canvas.util.a.a(5, "INFEMap getMap failed, type error.", new Object[0]);
        return null;
    }

    public Map<String, Object> getJavaMap() {
        return this.mPropertiesMap;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public IJSCallbackType getType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "157c714fcc608b5737220a3bf710d9c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (IJSCallbackType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "157c714fcc608b5737220a3bf710d9c8");
        }
        Object obj = get(str);
        if (obj == null) {
            return IJSCallbackType.Null;
        }
        if (obj instanceof Number) {
            return IJSCallbackType.Number;
        }
        if (obj instanceof String) {
            return IJSCallbackType.String;
        }
        if (obj instanceof Boolean) {
            return IJSCallbackType.Boolean;
        }
        if (obj instanceof IJSCallbackMap) {
            return IJSCallbackType.Map;
        }
        if (obj instanceof IJSCallbackArray) {
            return IJSCallbackType.Array;
        }
        throw new IllegalArgumentException("Invalid value " + obj.toString() + " for key " + str + "contained in JavaOnlyMap");
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public IJSCallbackMap.IJSCallbackMapKeySetIterator keySetIterator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83bd0146bfe2da6b00b1155649164de4", RobustBitConfig.DEFAULT_VALUE) ? (IJSCallbackMap.IJSCallbackMapKeySetIterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83bd0146bfe2da6b00b1155649164de4") : new IJSCallbackMap.IJSCallbackMapKeySetIterator() { // from class: com.sankuai.waimai.irmo.canvas.data.d.1
            public static ChangeQuickRedirect a;
            public Iterator<String> b;

            {
                this.b = d.this.getJavaMap().keySet().iterator();
            }

            @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap.IJSCallbackMapKeySetIterator
            public final boolean hasNextKey() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "006d96f2a6485edf4c3ea0a474d5290b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "006d96f2a6485edf4c3ea0a474d5290b")).booleanValue() : this.b.hasNext();
            }

            @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap.IJSCallbackMapKeySetIterator
            public final String nextKey() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b85d5c54b1909ca34fa0db9bc6b6594c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b85d5c54b1909ca34fa0db9bc6b6594c") : this.b.next();
            }
        };
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public void putNull(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67d7cbd8f6e4ad6f2fba14e372bd742f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67d7cbd8f6e4ad6f2fba14e372bd742f");
        } else {
            put(str, null);
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public void putBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f893b33689fb4638abfeeb365b5d6d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f893b33689fb4638abfeeb365b5d6d2");
        } else {
            put(str, Boolean.valueOf(z));
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public void putDouble(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "122dc7c160e8607fa0e4893ce31ad285", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "122dc7c160e8607fa0e4893ce31ad285");
        } else {
            put(str, Double.valueOf(d));
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public void putInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e03d611747199ea227cb8d54466b575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e03d611747199ea227cb8d54466b575");
        } else {
            put(str, Integer.valueOf(i));
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public void putString(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6364b345fd10b545178defaca7c8555", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6364b345fd10b545178defaca7c8555");
        } else {
            put(str, str2);
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public void putArray(String str, IJSCallbackArray iJSCallbackArray) {
        Object[] objArr = {str, iJSCallbackArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16232dc06f0dc4b897e2762ddb92d71b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16232dc06f0dc4b897e2762ddb92d71b");
        } else {
            put(str, iJSCallbackArray);
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public void putMap(String str, IJSCallbackMap iJSCallbackMap) {
        Object[] objArr = {str, iJSCallbackMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fbc58b41dd6aba3144268ee65885c83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fbc58b41dd6aba3144268ee65885c83");
        } else {
            put(str, iJSCallbackMap);
        }
    }

    public void put(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "621fdbe91f69a61956241f69e5e613d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "621fdbe91f69a61956241f69e5e613d7");
        } else if (str == null) {
            com.sankuai.waimai.irmo.canvas.util.a.a(5, "INFEMap put exception-->key is null", new Object[0]);
        } else {
            this.mPropertiesMap.put(str, obj);
            this.mProperties.pushString(str);
            this.mProperties.pushObject(obj);
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap
    public void merge(IJSCallbackMap iJSCallbackMap) {
        Object[] objArr = {iJSCallbackMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fcc2efefaab8cfd0b3b80bf7bf5b540", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fcc2efefaab8cfd0b3b80bf7bf5b540");
        } else if (iJSCallbackMap instanceof d) {
            getJavaMap().putAll(((d) iJSCallbackMap).getJavaMap());
        }
    }

    public int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "747f1ca444a378330d718fa2281bda2d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "747f1ca444a378330d718fa2281bda2d")).intValue() : this.mPropertiesMap.size();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0caeed7f0926009f0c456b21a3c85336", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0caeed7f0926009f0c456b21a3c85336") : this.mPropertiesMap.toString();
    }
}
