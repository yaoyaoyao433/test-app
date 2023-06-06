package com.sankuai.waimai.store.exceptions;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends Exception {
    public static ChangeQuickRedirect a;
    public final int b;
    @Nullable
    public a c;
    public boolean d;

    private a(int i, String str, a aVar) {
        super(str);
        Object[] objArr = {Integer.valueOf(i), str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3950839daa76f50cae3de315591fbc9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3950839daa76f50cae3de315591fbc9c");
            return;
        }
        this.b = i;
        this.c = aVar;
    }

    public a(String str) {
        this(0, str, null);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0013ab116ebef06021f954380dc9a301", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0013ab116ebef06021f954380dc9a301");
        }
    }

    public a(String str, boolean z) {
        this(0, str, null);
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "157db70f9e9b8062d65877fa9e9c665b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "157db70f9e9b8062d65877fa9e9c665b");
        } else {
            this.d = true;
        }
    }

    public a(int i, String str) {
        this(i, str, null);
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbf84386b1df09fea3c667c0ac2def7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbf84386b1df09fea3c667c0ac2def7f");
        }
    }

    public a(String str, a aVar) {
        this(0, str, aVar);
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb1766e4bbfa4c43d2e7cc568eff7de3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb1766e4bbfa4c43d2e7cc568eff7de3");
        }
    }

    public static a a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eae60388f885c0350707776865aa2f52", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eae60388f885c0350707776865aa2f52") : new a(i, str);
    }
}
