package com.sankuai.waimai.alita.core.mlmodel.predictor.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e8f278b4845a2977b3a484a61de629b1", RobustBitConfig.DEFAULT_VALUE) ? (DataType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e8f278b4845a2977b3a484a61de629b1") : (DataType) Enum.valueOf(DataType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DataType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb1fdf5fae4fff6898f77a76fbbcbe7d", RobustBitConfig.DEFAULT_VALUE) ? (DataType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb1fdf5fae4fff6898f77a76fbbcbe7d") : (DataType[]) values().clone();
    }

    DataType(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5b034da9d1d4cbd93e2d89e2f7b3090", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5b034da9d1d4cbd93e2d89e2f7b3090");
        } else {
            this.value = i;
        }
    }

    public final int byteSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf55d7ecec18d2f68398920106f5c38f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf55d7ecec18d2f68398920106f5c38f")).intValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a44ef38274c7efebc64645bd8c9d68f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (DataType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a44ef38274c7efebc64645bd8c9d68f2");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7134a1a2e37516326857ac05b34bf234", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7134a1a2e37516326857ac05b34bf234");
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
