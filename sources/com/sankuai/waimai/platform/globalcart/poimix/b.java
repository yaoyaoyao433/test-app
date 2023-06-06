package com.sankuai.waimai.platform.globalcart.poimix;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b<K extends Serializable> implements Serializable {
    public static ChangeQuickRedirect a;
    @SuppressLint({" SerializableCheck"})
    public List<ArrayList<K>> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90164d41262cf874360b96f75190014e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90164d41262cf874360b96f75190014e");
        } else {
            this.b = new CopyOnWriteArrayList();
        }
    }

    public final boolean a(@NonNull K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b23e04b76c7f6ce38cafc086f41d87e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b23e04b76c7f6ce38cafc086f41d87e")).booleanValue();
        }
        if (this.b != null && !this.b.isEmpty()) {
            for (ArrayList<K> arrayList : this.b) {
                if (arrayList != null && !arrayList.isEmpty() && arrayList.contains(k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(@NonNull K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2705e88f8d4c41f6d335e18ad58c49a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2705e88f8d4c41f6d335e18ad58c49a2");
            return;
        }
        if (this.b == null) {
            this.b = new CopyOnWriteArrayList();
        }
        if (a(k)) {
            return;
        }
        ArrayList<K> arrayList = new ArrayList<>();
        arrayList.add(0, k);
        this.b.add(0, arrayList);
    }

    public final boolean a(@NonNull K k, @NonNull K k2) {
        Object[] objArr = {k, k2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba2bddc44685cb2a79cd961ba9a3fd60", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba2bddc44685cb2a79cd961ba9a3fd60")).booleanValue();
        }
        if (k.equals(k2)) {
            return true;
        }
        if (this.b != null && !this.b.isEmpty()) {
            for (ArrayList<K> arrayList : this.b) {
                if (arrayList != null && !arrayList.isEmpty() && arrayList.contains(k) && arrayList.contains(k2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public final K c(@NonNull K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcaeb53039e33c97bcbdec64bd4044f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (K) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcaeb53039e33c97bcbdec64bd4044f3");
        }
        if (this.b == null || this.b.isEmpty()) {
            return null;
        }
        for (ArrayList<K> arrayList : this.b) {
            if (arrayList != null && !arrayList.isEmpty() && arrayList.contains(k)) {
                return arrayList.get(0);
            }
        }
        return null;
    }
}
