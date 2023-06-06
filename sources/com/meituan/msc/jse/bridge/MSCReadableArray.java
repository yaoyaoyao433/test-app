package com.meituan.msc.jse.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class MSCReadableArray implements ReadableArray {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected JSONArray array;
    @Nullable
    private Object[] mLocalArray;
    @Nullable
    private ReadableType[] mLocalTypeArray;

    public MSCReadableArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a7374325f1b769c987dafc8c3ee12bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a7374325f1b769c987dafc8c3ee12bb");
        } else {
            this.array = new JSONArray();
        }
    }

    public MSCReadableArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39d863050a59f842e1a0eabf49eb8f14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39d863050a59f842e1a0eabf49eb8f14");
        } else if (jSONArray == null) {
            throw new RuntimeException("array should not be null");
        } else {
            this.array = jSONArray;
        }
    }

    private Object[] getLocalArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f03dbdad9e67db914d9bc62373074df", RobustBitConfig.DEFAULT_VALUE)) {
            return (Object[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f03dbdad9e67db914d9bc62373074df");
        }
        if (this.mLocalArray != null) {
            return this.mLocalArray;
        }
        synchronized (this) {
            if (this.mLocalArray == null) {
                this.mLocalArray = new Object[this.array.length()];
                this.mLocalTypeArray = new ReadableType[this.array.length()];
                for (int i = 0; i < this.array.length(); i++) {
                    Object opt = this.array.opt(i);
                    if (opt != null && !this.array.isNull(i)) {
                        if (opt instanceof String) {
                            this.mLocalArray[i] = (String) opt;
                            this.mLocalTypeArray[i] = ReadableType.String;
                        } else if (opt instanceof Boolean) {
                            this.mLocalArray[i] = (Boolean) opt;
                            this.mLocalTypeArray[i] = ReadableType.Boolean;
                        } else if (opt instanceof Number) {
                            this.mLocalArray[i] = Double.valueOf(((Number) opt).doubleValue());
                            this.mLocalTypeArray[i] = ReadableType.Number;
                        } else if (opt instanceof JSONObject) {
                            this.mLocalArray[i] = new MSCReadableMap((JSONObject) opt);
                            this.mLocalTypeArray[i] = ReadableType.Map;
                        } else if (opt instanceof JSONArray) {
                            this.mLocalArray[i] = new MSCReadableArray((JSONArray) opt);
                            this.mLocalTypeArray[i] = ReadableType.Array;
                        } else {
                            throw new IllegalArgumentException("Could not convert object at index " + i);
                        }
                    }
                    this.mLocalArray[i] = null;
                    this.mLocalTypeArray[i] = ReadableType.Null;
                }
            }
        }
        return this.mLocalArray;
    }

    @NonNull
    private ReadableType[] getLocalTypeArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de12098e81a5d5015b7955d9355f0bf8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableType[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de12098e81a5d5015b7955d9355f0bf8");
        }
        if (this.mLocalTypeArray != null) {
            return this.mLocalTypeArray;
        }
        synchronized (this) {
            getLocalArray();
        }
        return this.mLocalTypeArray;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dfc763ee6db35471202833394ace20b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dfc763ee6db35471202833394ace20b")).intValue() : getLocalArray().length;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public boolean isNull(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e332488cd14f32e08000f1ac71bf8b1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e332488cd14f32e08000f1ac71bf8b1")).booleanValue() : getLocalArray()[i] == null;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public boolean getBoolean(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c54dd376582c627d600449d503e4e2cf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c54dd376582c627d600449d503e4e2cf")).booleanValue() : ((Boolean) getLocalArray()[i]).booleanValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public double getDouble(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cde3542d91eb9748e124c6602a8f2cad", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cde3542d91eb9748e124c6602a8f2cad")).doubleValue() : ((Double) getLocalArray()[i]).doubleValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public int getInt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "425b8e3eb5b388a83113378bb024fccf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "425b8e3eb5b388a83113378bb024fccf")).intValue() : ((Double) getLocalArray()[i]).intValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @Nullable
    public String getString(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d4a954e2901e1fbf911a456dc1e6e2a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d4a954e2901e1fbf911a456dc1e6e2a") : (String) getLocalArray()[i];
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @Nullable
    public MSCReadableArray getArray(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31a53ac2a673b00c8d39d1bc36337dd6", RobustBitConfig.DEFAULT_VALUE) ? (MSCReadableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31a53ac2a673b00c8d39d1bc36337dd6") : (MSCReadableArray) getLocalArray()[i];
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @Nullable
    public MSCReadableMap getMap(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bad05567a3fdc6c9b9f5a4092a85f1e7", RobustBitConfig.DEFAULT_VALUE) ? (MSCReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bad05567a3fdc6c9b9f5a4092a85f1e7") : (MSCReadableMap) getLocalArray()[i];
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @NonNull
    public ReadableType getType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04bd262cdee249d616a1401c075ec944", RobustBitConfig.DEFAULT_VALUE) ? (ReadableType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04bd262cdee249d616a1401c075ec944") : getLocalTypeArray()[i];
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @NonNull
    public Dynamic getDynamic(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "073521e338cfcf6be3ff920c2b2e0c2e", RobustBitConfig.DEFAULT_VALUE) ? (Dynamic) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "073521e338cfcf6be3ff920c2b2e0c2e") : DynamicFromArray.create(this, i);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e178a101c9646669b77a9a5ae2b0fbdd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e178a101c9646669b77a9a5ae2b0fbdd")).intValue() : getLocalArray().hashCode();
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "723feca522206c3b9f72d3ed38bc2e39", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "723feca522206c3b9f72d3ed38bc2e39")).booleanValue();
        }
        if (obj instanceof MSCReadableArray) {
            return Arrays.deepEquals(getLocalArray(), ((MSCReadableArray) obj).getLocalArray());
        }
        return false;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @NonNull
    public ArrayList<Object> toArrayList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75970eca084700498451ba04889fdce1", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75970eca084700498451ba04889fdce1");
        }
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            switch (getType(i)) {
                case Null:
                    arrayList.add(null);
                    break;
                case Boolean:
                    arrayList.add(Boolean.valueOf(getBoolean(i)));
                    break;
                case Number:
                    arrayList.add(Double.valueOf(getDouble(i)));
                    break;
                case String:
                    arrayList.add(getString(i));
                    break;
                case Map:
                    arrayList.add(getMap(i).toHashMap());
                    break;
                case Array:
                    arrayList.add(getArray(i).toArrayList());
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object at index: " + i + CommonConstant.Symbol.DOT);
            }
        }
        return arrayList;
    }

    public JSONArray getRealData() {
        return this.array;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "892f6a61cfe6c608a5805f16cc48114f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "892f6a61cfe6c608a5805f16cc48114f") : this.array == null ? "" : this.array.toString();
    }
}
