package com.sankuai.waimai.irmo.canvas.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray;
import com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap;
import com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackType;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b implements IJSCallbackArray {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected List<Object> mObjects;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee136876268bf07442c534c3883ccc17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee136876268bf07442c534c3883ccc17");
        } else {
            this.mObjects = new ArrayList();
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ccfd7c430e7682afde49437928e7031", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ccfd7c430e7682afde49437928e7031")).intValue() : this.mObjects.size();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39da4b0c5a0ee075bf55e327991e6a0c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39da4b0c5a0ee075bf55e327991e6a0c") : this.mObjects.toString();
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public boolean isNull(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a537ec8f1cb969225b2c3a719b3f129e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a537ec8f1cb969225b2c3a719b3f129e")).booleanValue() : this.mObjects.get(i) == null;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public boolean getBoolean(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23df58e10c07dee8a8a0e34cbfcdde2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23df58e10c07dee8a8a0e34cbfcdde2c")).booleanValue();
        }
        Object obj = this.mObjects.get(i);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        com.sankuai.waimai.irmo.canvas.util.a.a(5, "INFEArray getBoolean failed, type error.", new Object[0]);
        return false;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public double getDouble(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c6cc5593d28d69f89e4dbfe58f34e05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c6cc5593d28d69f89e4dbfe58f34e05")).doubleValue();
        }
        Object obj = this.mObjects.get(i);
        if ((obj instanceof Double) || (obj instanceof Float)) {
            return ((Double) obj).doubleValue();
        }
        com.sankuai.waimai.irmo.canvas.util.a.a(5, "INFEArray getDouble failed, type error.", new Object[0]);
        return 0.0d;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public int getInt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5044b2c764a924848d90c4e893f161e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5044b2c764a924848d90c4e893f161e3")).intValue();
        }
        Object obj = this.mObjects.get(i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        com.sankuai.waimai.irmo.canvas.util.a.a(5, "INFEArray getInt failed, type error.", new Object[0]);
        return 0;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public String getString(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5617363435e49062ef550e366d71e9bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5617363435e49062ef550e366d71e9bb");
        }
        Object obj = this.mObjects.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        com.sankuai.waimai.irmo.canvas.util.a.a(5, "INFEArray getString failed, type error.", new Object[0]);
        return null;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public IJSCallbackArray getArray(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fd23bc9bcd029afb8317d1ef4a6872a", RobustBitConfig.DEFAULT_VALUE)) {
            return (IJSCallbackArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fd23bc9bcd029afb8317d1ef4a6872a");
        }
        Object obj = this.mObjects.get(i);
        if (obj instanceof IJSCallbackArray) {
            return (IJSCallbackArray) obj;
        }
        com.sankuai.waimai.irmo.canvas.util.a.a(5, "INFEArray getArray failed, type error.", new Object[0]);
        return null;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public IJSCallbackMap getMap(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "643be830492fa954f590589d7f7bb6a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (IJSCallbackMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "643be830492fa954f590589d7f7bb6a8");
        }
        Object obj = this.mObjects.get(i);
        if (obj instanceof IJSCallbackMap) {
            return (IJSCallbackMap) obj;
        }
        com.sankuai.waimai.irmo.canvas.util.a.a(5, "INFEArray getMap failed, type error.", new Object[0]);
        return null;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public IJSCallbackType getType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9cc445939c0d51c7102f893e96f6046", RobustBitConfig.DEFAULT_VALUE)) {
            return (IJSCallbackType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9cc445939c0d51c7102f893e96f6046");
        }
        Object obj = this.mObjects.get(i);
        if (obj == null) {
            return IJSCallbackType.Null;
        }
        if (obj instanceof Boolean) {
            return IJSCallbackType.Boolean;
        }
        if (!(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer)) {
            if (obj instanceof String) {
                return IJSCallbackType.String;
            }
            if (obj instanceof IJSCallbackArray) {
                return IJSCallbackType.Array;
            }
            if (obj instanceof IJSCallbackMap) {
                return IJSCallbackType.Map;
            }
            return null;
        }
        return IJSCallbackType.Number;
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public void pushNull() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d72710ffadf7a4657c4d97b27217fb40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d72710ffadf7a4657c4d97b27217fb40");
        } else {
            this.mObjects.add(null);
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public void pushBoolean(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3c549624e024a2bf6b013bea7f6fe5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3c549624e024a2bf6b013bea7f6fe5e");
        } else {
            this.mObjects.add(Boolean.valueOf(z));
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public void pushDouble(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e9d3351def01dc7c7f936de07012155", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e9d3351def01dc7c7f936de07012155");
        } else {
            this.mObjects.add(Double.valueOf(d));
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public void pushInt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46c8b5876c2df1edb14b57f4dd40be39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46c8b5876c2df1edb14b57f4dd40be39");
        } else {
            this.mObjects.add(Integer.valueOf(i));
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public void pushString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fae6ce84718801cb932e2f2fe2c6e9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fae6ce84718801cb932e2f2fe2c6e9a");
        } else {
            this.mObjects.add(str);
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public void pushArray(IJSCallbackArray iJSCallbackArray) {
        Object[] objArr = {iJSCallbackArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89943ad2c0036c9355a33894bcfd7900", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89943ad2c0036c9355a33894bcfd7900");
        } else {
            this.mObjects.add(iJSCallbackArray);
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray
    public void pushMap(IJSCallbackMap iJSCallbackMap) {
        Object[] objArr = {iJSCallbackMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a34b6fb03151765945d76ef467d9161", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a34b6fb03151765945d76ef467d9161");
        } else {
            this.mObjects.add(iJSCallbackMap);
        }
    }

    public void pushObject(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d5e89cf8c3fb635e7a8dae76761f987", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d5e89cf8c3fb635e7a8dae76761f987");
        } else {
            this.mObjects.add(obj);
        }
    }

    public Object get(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ffb508c13733c2b75c352e51b4b09b1", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ffb508c13733c2b75c352e51b4b09b1") : this.mObjects.get(i);
    }
}
