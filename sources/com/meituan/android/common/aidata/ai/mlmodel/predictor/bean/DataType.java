package com.meituan.android.common.aidata.ai.mlmodel.predictor.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum DataType {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final DataType[] values = valuesCustom();
    private final int value;

    public static DataType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "15503d85567eafec50504f62ecb5a603", RobustBitConfig.DEFAULT_VALUE) ? (DataType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "15503d85567eafec50504f62ecb5a603") : (DataType) Enum.valueOf(DataType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DataType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4886abf93ea5b803eb356b31720b6b23", RobustBitConfig.DEFAULT_VALUE) ? (DataType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4886abf93ea5b803eb356b31720b6b23") : (DataType[]) values().clone();
    }

    DataType(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3eb91b5207e6e7ad088fc22f0945a75b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3eb91b5207e6e7ad088fc22f0945a75b");
        } else {
            this.value = i;
        }
    }

    public final int byteSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "264dba913cf5efec3203639f352b3f1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "264dba913cf5efec3203639f352b3f1d")).intValue();
        }
        switch (this) {
            case FLOAT32:
                return 4;
            case INT32:
                return 4;
            case UINT8:
                return 1;
            case INT64:
                return 8;
            case STRING:
                return -1;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }

    public static DataType fromValue(int i) {
        DataType[] dataTypeArr;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba35ea1b3285f8fa3797b5e2678cef22", RobustBitConfig.DEFAULT_VALUE)) {
            return (DataType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba35ea1b3285f8fa3797b5e2678cef22");
        }
        for (DataType dataType : values) {
            if (dataType.value == i) {
                return dataType;
            }
        }
        throw new IllegalArgumentException("DataType error: DataType " + i + " is not recognized in Java");
    }

    public final String toStringName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d39fa38108fb126c98573f3959559aca", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d39fa38108fb126c98573f3959559aca");
        }
        switch (this) {
            case FLOAT32:
                return "float";
            case INT32:
                return "int";
            case UINT8:
                return Constants.BYTE;
            case INT64:
                return Constants.LONG;
            case STRING:
                return "string";
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }
}
