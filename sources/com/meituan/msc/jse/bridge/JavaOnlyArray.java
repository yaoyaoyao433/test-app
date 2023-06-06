package com.meituan.msc.jse.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class JavaOnlyArray implements ReadableArray, WritableArray {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List mBackingList;

    public static JavaOnlyArray from(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "31a705e79debf1360340f02cbc1b9e2b", RobustBitConfig.DEFAULT_VALUE) ? (JavaOnlyArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "31a705e79debf1360340f02cbc1b9e2b") : new JavaOnlyArray(list);
    }

    public static JavaOnlyArray of(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "536dd5e78baa4ccca61af12aa72485c2", RobustBitConfig.DEFAULT_VALUE) ? (JavaOnlyArray) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "536dd5e78baa4ccca61af12aa72485c2") : new JavaOnlyArray(objArr);
    }

    public static JavaOnlyArray deepClone(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4641e56223ad3a4ebb9d15334f46c1a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (JavaOnlyArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4641e56223ad3a4ebb9d15334f46c1a2");
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (readableArray.getType(i)) {
                case Null:
                    javaOnlyArray.pushNull();
                    break;
                case Boolean:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i));
                    break;
                case Number:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i));
                    break;
                case String:
                    javaOnlyArray.pushString(readableArray.getString(i));
                    break;
                case Map:
                    javaOnlyArray.pushMap((WritableMap) JavaOnlyMap.deepClone(readableArray.getMap(i)));
                    break;
                case Array:
                    javaOnlyArray.pushArray((WritableArray) deepClone(readableArray.getArray(i)));
                    break;
            }
        }
        return javaOnlyArray;
    }

    public JavaOnlyArray(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff28a5cd2fa5a2917e47a2b877f211cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff28a5cd2fa5a2917e47a2b877f211cb");
        } else {
            this.mBackingList = Arrays.asList(objArr);
        }
    }

    public JavaOnlyArray(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1839e58dae7edc181033d5a6fb98b264", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1839e58dae7edc181033d5a6fb98b264");
        } else {
            this.mBackingList = new ArrayList(list);
        }
    }

    public JavaOnlyArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9e6e7f59b8e78f63a8993c4e5f189e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9e6e7f59b8e78f63a8993c4e5f189e4");
        } else {
            this.mBackingList = new ArrayList();
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e59306718369a12e5ab85f6a30b7fbc8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e59306718369a12e5ab85f6a30b7fbc8")).intValue() : this.mBackingList.size();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public boolean isNull(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ac90bf231a4eda6003026f6ee6ab87f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ac90bf231a4eda6003026f6ee6ab87f")).booleanValue() : this.mBackingList.get(i) == null;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public double getDouble(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03d41b38a904728e6eb4425c55c706c6", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03d41b38a904728e6eb4425c55c706c6")).doubleValue() : ((Number) this.mBackingList.get(i)).doubleValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public int getInt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "377c9124e883a1559e132d6736fad73d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "377c9124e883a1559e132d6736fad73d")).intValue() : ((Number) this.mBackingList.get(i)).intValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @Nullable
    public String getString(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e10bce0bcc1eb845e304e9d6f1ee49a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e10bce0bcc1eb845e304e9d6f1ee49a") : (String) this.mBackingList.get(i);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public ReadableArray getArray(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cc01e8bbe2a67256f566231216aadaf", RobustBitConfig.DEFAULT_VALUE) ? (ReadableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cc01e8bbe2a67256f566231216aadaf") : (ReadableArray) this.mBackingList.get(i);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public boolean getBoolean(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef1ccef4080a3afb0b922559fee95aae", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef1ccef4080a3afb0b922559fee95aae")).booleanValue() : ((Boolean) this.mBackingList.get(i)).booleanValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public ReadableMap getMap(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10d9c993a41f02a4f7aa273aba58766a", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10d9c993a41f02a4f7aa273aba58766a") : (ReadableMap) this.mBackingList.get(i);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @NonNull
    public Dynamic getDynamic(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95d5752d448e05e61a9b103ab15ce6e4", RobustBitConfig.DEFAULT_VALUE) ? (Dynamic) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95d5752d448e05e61a9b103ab15ce6e4") : DynamicFromArray.create(this, i);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @NonNull
    public ReadableType getType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2542c8880288e8b5cdbe7458eb922f71", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2542c8880288e8b5cdbe7458eb922f71");
        }
        Object obj = this.mBackingList.get(i);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        return null;
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushBoolean(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b4575ffa3e1c262601d5d45e44c50db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b4575ffa3e1c262601d5d45e44c50db");
        } else {
            this.mBackingList.add(Boolean.valueOf(z));
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushDouble(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ea02cdad8ec965b5ab184be10c0d368", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ea02cdad8ec965b5ab184be10c0d368");
        } else {
            this.mBackingList.add(Double.valueOf(d));
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushInt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b26b85f15772d938d874a39e284224f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b26b85f15772d938d874a39e284224f8");
        } else {
            this.mBackingList.add(new Double(i));
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushString(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c145034e72ad5cb0eb7bd1e1e194fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c145034e72ad5cb0eb7bd1e1e194fc8");
        } else {
            this.mBackingList.add(str);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushArray(@Nullable ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8105c2584b6c10f6e7fadf242725a86c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8105c2584b6c10f6e7fadf242725a86c");
        } else {
            this.mBackingList.add(readableArray);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushMap(@Nullable ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a16f3ab5fdbf9059fa7afdf5280071a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a16f3ab5fdbf9059fa7afdf5280071a");
        } else {
            this.mBackingList.add(readableMap);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushArray(@Nullable WritableArray writableArray) {
        Object[] objArr = {writableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3d425605f75257a6e050204a8b42186", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3d425605f75257a6e050204a8b42186");
        } else {
            pushArray((ReadableArray) writableArray);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushMap(@Nullable WritableMap writableMap) {
        Object[] objArr = {writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a5691f2d5447741e984da2e8b963e6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a5691f2d5447741e984da2e8b963e6e");
        } else {
            pushMap((ReadableMap) writableMap);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableArray
    public void pushNull() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54a1db5f50a775a0712cab61bbb97a2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54a1db5f50a775a0712cab61bbb97a2b");
        } else {
            this.mBackingList.add(null);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @NonNull
    public ArrayList<Object> toArrayList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78ccd0eeb7f4ecd4cd70d8290f906fcb", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78ccd0eeb7f4ecd4cd70d8290f906fcb") : new ArrayList<>(this.mBackingList);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76aca056a06957e63bd583665d192115", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76aca056a06957e63bd583665d192115") : this.mBackingList.toString();
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44636d89e8948769258735d8077a7025", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44636d89e8948769258735d8077a7025")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JavaOnlyArray javaOnlyArray = (JavaOnlyArray) obj;
        return this.mBackingList == null ? javaOnlyArray.mBackingList == null : this.mBackingList.equals(javaOnlyArray.mBackingList);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ef1ca9599af699673279051bcf04e15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ef1ca9599af699673279051bcf04e15")).intValue();
        }
        if (this.mBackingList != null) {
            return this.mBackingList.hashCode();
        }
        return 0;
    }
}
