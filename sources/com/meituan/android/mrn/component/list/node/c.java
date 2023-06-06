package com.meituan.android.mrn.component.list.node;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public ListItemNode b;
    public ArrayList<ListItemNode> c;
    public Bitmap d;
    public String e;
    public ReadableArray f;
    private ListItemNode g;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e836ef2f49194bafefc5616ca447dd3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e836ef2f49194bafefc5616ca447dd3a");
            return;
        }
        this.c = new ArrayList<>();
        this.f = null;
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a1bb72cbbb91e597f3f291e8527f9cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a1bb72cbbb91e597f3f291e8527f9cd")).intValue();
        }
        if (this.f == null) {
            return 0;
        }
        return this.f.size();
    }

    public final void a(int i, ListItemNode listItemNode) {
        Object[] objArr = {Integer.valueOf(i), listItemNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "809eb7ec1102880b180aff43974072f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "809eb7ec1102880b180aff43974072f0");
        } else {
            this.c.set(i, listItemNode);
        }
    }

    public final void a(int i, ReadableArray readableArray) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "643ccfe5ee9ae6f82fccc9e23a12fbdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "643ccfe5ee9ae6f82fccc9e23a12fbdd");
        } else if (this.f == null) {
            this.f = readableArray;
            while (i2 < readableArray.size()) {
                this.c.add(null);
                i2++;
            }
        } else {
            ArrayList<Object> arrayList = this.f.toArrayList();
            arrayList.addAll(i, readableArray.toArrayList());
            while (i2 < readableArray.size()) {
                this.c.add(i + i2, null);
                i2++;
            }
            this.f = Arguments.makeNativeArray((List) arrayList);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "514a674a0b3da2d859ee23abb985c678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "514a674a0b3da2d859ee23abb985c678");
        } else if (this.f == null) {
            com.facebook.common.logging.a.d("[Section@removeItems]", "mData is null while removeItems");
        } else if (this.f.size() >= i + i2) {
            ArrayList<Object> arrayList = this.f.toArrayList();
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                int i4 = i + i3;
                arrayList.remove(i4);
                this.c.remove(i4);
            }
            this.f = Arguments.makeNativeArray((List) arrayList);
        }
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8f0497151e02d2f68828a8fac1a2263", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8f0497151e02d2f68828a8fac1a2263")).intValue() : this.c.size();
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "910520c437753c723b269e3b85efd5e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "910520c437753c723b269e3b85efd5e2")).intValue();
        }
        return (this.b == null ? 0 : 1) + a() + (this.g != null ? 1 : 0);
    }

    public final ArrayList<ListItemNode> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d489f1a3df61e7d6b3e19121481c638b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d489f1a3df61e7d6b3e19121481c638b");
        }
        ArrayList<ListItemNode> arrayList = new ArrayList<>();
        if (this.b != null) {
            arrayList.add(this.b);
        }
        arrayList.addAll(this.c);
        if (this.g != null) {
            arrayList.add(this.g);
        }
        return arrayList;
    }
}
