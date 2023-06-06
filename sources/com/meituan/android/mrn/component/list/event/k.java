package com.meituan.android.mrn.component.list.event;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public Boolean d;
    public int e;

    public k(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68073cb07d0b3014ed49fe6778b7c0bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68073cb07d0b3014ed49fe6778b7c0bf");
            return;
        }
        this.d = null;
        this.e = -1;
        this.b = i;
        this.c = i2;
    }

    public static k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3c09895affb1a8bb21387fa107ce0f4", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3c09895affb1a8bb21387fa107ce0f4") : new k(-1, -1);
    }

    public final WritableMap b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0208696e67e083d2ddcfad5648faa77", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0208696e67e083d2ddcfad5648faa77");
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("sectionIndex", this.b);
        createMap.putInt("itemIndex", this.c);
        createMap.putBoolean("isViewable", this.d.booleanValue());
        return createMap;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fea8c619e55478cf282840babf50fb3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fea8c619e55478cf282840babf50fb3")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.b == kVar.b && this.c == kVar.c && this.e == kVar.e;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f745bba0c3cf49800727699978301e88", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f745bba0c3cf49800727699978301e88")).intValue() : Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.e));
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b53bdec33fba710fa05805b845b08e74", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b53bdec33fba710fa05805b845b08e74");
        }
        return "ViewToken{mSectionIndex=" + this.b + ", mItemIndex=" + this.c + ", mIsViewable=" + this.d + '}';
    }
}
