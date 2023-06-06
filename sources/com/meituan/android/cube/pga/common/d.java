package com.meituan.android.cube.pga.common;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d<ValueType> {
    public static ChangeQuickRedirect a;
    public ValueType b;

    public d(@Nullable ValueType valuetype) {
        Object[] objArr = {valuetype};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09314aeb705083aee634603aef15e0a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09314aeb705083aee634603aef15e0a1");
            return;
        }
        this.b = null;
        this.b = valuetype;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0278a33e6c4697b1328519030a23733c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0278a33e6c4697b1328519030a23733c");
        }
        Object[] objArr2 = {""};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ba937ee3e75ffd0961f503ae1159c95", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ba937ee3e75ffd0961f503ae1159c95") : (this.b == null || !(this.b instanceof String)) ? "" : (String) this.b;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67fde72ea4c05b0cfdf40dc0b0a01dfb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67fde72ea4c05b0cfdf40dc0b0a01dfb")).booleanValue();
        }
        Object[] objArr2 = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e137e5a131367d98e473de3f15922e97", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e137e5a131367d98e473de3f15922e97")).booleanValue();
        }
        if (this.b == null || !(this.b instanceof Boolean)) {
            return false;
        }
        return ((Boolean) this.b).booleanValue();
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c52d147d4cce9ef46aa81a56bd87d3f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c52d147d4cce9ef46aa81a56bd87d3f")).intValue() : a(0);
    }

    public final double d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c25fdfbe3ab4e5115b60066d9d3c563a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c25fdfbe3ab4e5115b60066d9d3c563a")).doubleValue();
        }
        Object[] objArr2 = {Double.valueOf(0.0d)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be67f56f6399e19d9c75ba1661d19b43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be67f56f6399e19d9c75ba1661d19b43")).doubleValue();
        }
        if (this.b == null || !(this.b instanceof Double)) {
            return 0.0d;
        }
        return ((Double) this.b).doubleValue();
    }

    public final int a(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4972a05b7337a8967d7ad86dcc6ddce5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4972a05b7337a8967d7ad86dcc6ddce5")).intValue();
        }
        if (this.b != null && (this.b instanceof Integer)) {
            return ((Integer) this.b).intValue();
        }
        return 0;
    }
}
