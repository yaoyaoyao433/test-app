package com.meituan.android.common.aidata.cache.result;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.utils.NumberUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ResultColumnValue {
    public static final int VALUE_TYPE_DOUBLE = 11;
    public static final int VALUE_TYPE_INT = 1;
    public static final int VALUE_TYPE_LONG = 2;
    public static final int VALUE_TYPE_NULL = 0;
    public static final int VALUE_TYPE_STRING = 21;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Object objectValue;

    public ResultColumnValue(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adcc401cbb34e3738ec9d7772f60137b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adcc401cbb34e3738ec9d7772f60137b");
        } else {
            this.objectValue = obj;
        }
    }

    @Nullable
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64014cada43937c5bb147eaf556cb224", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64014cada43937c5bb147eaf556cb224");
        }
        if (this.objectValue == null) {
            return null;
        }
        return this.objectValue.toString();
    }

    public int toInt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35bc59fc45885e155f360d60fcd718dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35bc59fc45885e155f360d60fcd718dd")).intValue();
        }
        if (this.objectValue == null) {
            return 0;
        }
        if (this.objectValue instanceof Number) {
            return ((Number) this.objectValue).intValue();
        }
        return NumberUtils.parseInt(this.objectValue.toString(), 0);
    }

    public long toLong() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69f6dd308ec6ad0adf4386c1baee3b82", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69f6dd308ec6ad0adf4386c1baee3b82")).longValue();
        }
        if (this.objectValue == null) {
            return 0L;
        }
        if (this.objectValue instanceof Number) {
            return ((Number) this.objectValue).longValue();
        }
        return Long.parseLong(this.objectValue.toString());
    }

    public float toFloat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e132947b1951239d4ec658e238eab587", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e132947b1951239d4ec658e238eab587")).floatValue();
        }
        if (this.objectValue == null) {
            return 0.0f;
        }
        if (this.objectValue instanceof Number) {
            return ((Number) this.objectValue).floatValue();
        }
        return Float.parseFloat(this.objectValue.toString());
    }

    public double toDouble() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18887c4c39949b1e0e4c5162a86f60a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18887c4c39949b1e0e4c5162a86f60a6")).doubleValue();
        }
        if (this.objectValue == null) {
            return 0.0d;
        }
        if (this.objectValue instanceof Number) {
            return ((Number) this.objectValue).doubleValue();
        }
        return Double.parseDouble(this.objectValue.toString());
    }
}
