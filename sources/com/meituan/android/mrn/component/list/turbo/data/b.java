package com.meituan.android.mrn.component.list.turbo.data;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReadableArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements c<a> {
    public static ChangeQuickRedirect a;
    final String b;
    public final boolean c;
    public ReadableArray d;
    public volatile Bitmap e;
    public int f;
    private final Dynamic g;
    private final String h;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public Dynamic a;
        public String b;

        public a(Dynamic dynamic, String str) {
            this.a = dynamic;
            this.b = str;
        }
    }

    public b(String str, Dynamic dynamic, boolean z, String str2, ReadableArray readableArray) {
        Object[] objArr = {str, dynamic, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67fdce1572b38d26d49edddde0335fc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67fdce1572b38d26d49edddde0335fc7");
            return;
        }
        this.f = -1;
        this.b = str;
        this.g = dynamic;
        this.c = z;
        this.h = str2;
        this.d = readableArray;
    }

    @Override // com.meituan.android.mrn.component.list.turbo.data.c
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba6359da79923b1cd3c825a1679a5c5f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba6359da79923b1cd3c825a1679a5c5f")).intValue();
        }
        int size = this.d != null ? this.d.size() : 0;
        return this.c ? size + 1 : size;
    }

    public final a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "332183cd0eb0f91bc6762f8b26a67ea5", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "332183cd0eb0f91bc6762f8b26a67ea5");
        }
        if (this.c) {
            if (i == 0) {
                return new a(this.g, this.h);
            }
            i--;
        }
        Dynamic dynamic = this.d.getDynamic(i);
        return new a(dynamic, dynamic.asMap().getString("tplId"));
    }

    public final void a(int i, ReadableArray readableArray) {
        JavaOnlyArray deepClone;
        Object[] objArr = {Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2653b8bb5903110eaa23ce83e73e7619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2653b8bb5903110eaa23ce83e73e7619");
        } else if (readableArray != null) {
            if (this.d == null) {
                this.d = JavaOnlyArray.deepClone(readableArray);
                return;
            }
            if (!(this.d instanceof JavaOnlyArray)) {
                this.d = JavaOnlyArray.deepClone(this.d);
            }
            ArrayList<Object> arrayList = this.d.toArrayList();
            if (i > arrayList.size()) {
                throw new IndexOutOfBoundsException("try to add item to pos " + i + ", but size of array is " + arrayList.size());
            }
            if (readableArray instanceof JavaOnlyArray) {
                deepClone = (JavaOnlyArray) readableArray;
            } else {
                deepClone = JavaOnlyArray.deepClone(readableArray);
            }
            ArrayList<Object> arrayList2 = deepClone.toArrayList();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                arrayList.add(i + i2, arrayList2.get(i2));
            }
            this.d = JavaOnlyArray.from(arrayList);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d6e541094c210038b06a0844d595bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d6e541094c210038b06a0844d595bb");
        } else if (this.d == null) {
            com.facebook.common.logging.a.d("[DataSection@removeItems]", "items is null while removeItems");
        } else if (this.d.size() >= i + i2) {
            ArrayList<Object> arrayList = this.d.toArrayList();
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                arrayList.remove(i + i3);
            }
            this.d = JavaOnlyArray.from(arrayList);
        }
    }
}
