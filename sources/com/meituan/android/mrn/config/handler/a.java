package com.meituan.android.mrn.config.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements com.meituan.android.mrn.utils.config.c<b> {
    public static ChangeQuickRedirect a;
    protected Map<String, b> b;
    private final Map<String, Object> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2473e6ef41655bf4787162ddba0ebea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2473e6ef41655bf4787162ddba0ebea");
            return;
        }
        this.c = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
    }

    @Override // com.meituan.android.mrn.utils.config.c
    public final /* synthetic */ Object a(b bVar) {
        b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e3cb1a73128372ed3c2612cc513f6a9", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e3cb1a73128372ed3c2612cc513f6a9") : this.c.get(bVar2.b);
    }

    @Override // com.meituan.android.mrn.utils.config.c
    public final /* synthetic */ boolean b(b bVar) {
        b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c7b1dc1e9ad7475ae300a31bbf07269", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c7b1dc1e9ad7475ae300a31bbf07269")).booleanValue();
        }
        String str = bVar2.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6aae71c642bd9f560a98698ff04fe81d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6aae71c642bd9f560a98698ff04fe81d")).booleanValue() : this.b.containsKey(str)) && this.c.containsKey(str);
    }

    @Override // com.meituan.android.mrn.utils.config.c
    public final /* synthetic */ void c(b bVar) {
        b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "266d91dacb575faeb95ac8e37385c2d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "266d91dacb575faeb95ac8e37385c2d7");
        } else {
            this.b.remove(bVar2.b);
        }
    }

    @Override // com.meituan.android.mrn.utils.config.c
    public final /* synthetic */ void d(b bVar) {
        b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7876060a292872748409663e5c0963c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7876060a292872748409663e5c0963c2");
        } else {
            this.b.put(bVar2.b, bVar2);
        }
    }
}
