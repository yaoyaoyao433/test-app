package com.meituan.android.mrn.config.handler;

import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e implements com.meituan.android.mrn.utils.config.c<g> {
    public static ChangeQuickRedirect a;
    protected Map<String, f> b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b47090b80e146700da35d705001d162e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b47090b80e146700da35d705001d162e");
        } else {
            this.b = new ConcurrentHashMap();
        }
    }

    @Override // com.meituan.android.mrn.utils.config.c
    public final /* synthetic */ Object a(g gVar) {
        g gVar2 = gVar;
        Object[] objArr = {gVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f72b737aabbf68900720de8eabf02d", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f72b737aabbf68900720de8eabf02d") : this.b.get(gVar2.b).a(gVar2);
    }

    @Override // com.meituan.android.mrn.utils.config.c
    public final /* synthetic */ boolean b(g gVar) {
        g gVar2 = gVar;
        Object[] objArr = {gVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "219ad37b2d634d3dfe7151be173c0c2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "219ad37b2d634d3dfe7151be173c0c2c")).booleanValue();
        }
        f fVar = this.b.get(gVar2.b);
        return fVar != null && fVar.b(gVar2);
    }

    @Override // com.meituan.android.mrn.utils.config.c
    public final /* synthetic */ void c(g gVar) {
        g gVar2 = gVar;
        Object[] objArr = {gVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc3f39c422eebdad334a2ffb791e9088", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc3f39c422eebdad334a2ffb791e9088");
            return;
        }
        String str = gVar2.b;
        f fVar = this.b.get(str);
        if (fVar != null) {
            fVar.c(gVar2);
            if (fVar.a()) {
                this.b.remove(str);
            }
        }
    }

    @Override // com.meituan.android.mrn.utils.config.c
    public final /* synthetic */ void d(g gVar) {
        g gVar2 = gVar;
        Object[] objArr = {gVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f530b02034f6d0260a091426189ab81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f530b02034f6d0260a091426189ab81");
            return;
        }
        String str = gVar2.b;
        f fVar = this.b.get(str);
        if (fVar == null) {
            fVar = new f(str);
            this.b.put(str, fVar);
        }
        fVar.d(gVar2);
    }

    public final JsonObject a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75d6a244675d823987954ad3c0c935b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75d6a244675d823987954ad3c0c935b9");
        }
        f fVar = this.b.get(str);
        if (fVar != null) {
            return fVar.c;
        }
        return null;
    }
}
