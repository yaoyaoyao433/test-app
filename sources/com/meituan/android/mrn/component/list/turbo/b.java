package com.meituan.android.mrn.component.list.turbo;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final HashMap<String, TurboNode> b;
    private final h c;
    private final String d;

    public b(h hVar, HashMap<String, TurboNode> hashMap, String str) {
        Object[] objArr = {hVar, hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23d5c04ec5c4e3647b027b53ceeada9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23d5c04ec5c4e3647b027b53ceeada9a");
            return;
        }
        this.c = hVar;
        this.b = hashMap;
        this.d = str;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ecf54ebee661ef7847aaf64fb2556d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ecf54ebee661ef7847aaf64fb2556d2");
        }
        List<String> list = this.c.b;
        if (list.isEmpty()) {
            return this.d;
        }
        return this.d + CommonConstant.Symbol.MINUS + TextUtils.join(CommonConstant.Symbol.DOT, list);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b21eb3fa0e3275d5750b3dde85b54e53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b21eb3fa0e3275d5750b3dde85b54e53");
            return;
        }
        h hVar = this.c;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "f67b4991ca0dd496bd8ff86a5580148d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "f67b4991ca0dd496bd8ff86a5580148d");
        } else {
            hVar.b.add(String.valueOf(i));
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "159e4bc3192caca8964ecfd310f8b626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "159e4bc3192caca8964ecfd310f8b626");
            return;
        }
        h hVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "67b2d0e65aeb00d26b8a82bee5f41474", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "67b2d0e65aeb00d26b8a82bee5f41474");
        } else {
            hVar.b.remove(hVar.b.size() - 1);
        }
    }
}
