package com.sankuai.waimai.irmo.render.engine;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.a;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import com.sankuai.waimai.irmo.render.i;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class c implements a {
    public static ChangeQuickRedirect i;
    protected com.sankuai.waimai.irmo.render.a j;
    protected i k;
    protected com.sankuai.waimai.irmo.render.f l;
    protected int m;
    protected IrmoLayerInfo n;

    public abstract void a(g gVar);

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public boolean f() {
        return false;
    }

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public c(final com.sankuai.waimai.irmo.render.a aVar, i iVar, com.sankuai.waimai.irmo.render.f fVar) {
        Object[] objArr = {aVar, iVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3930dc84caa1b9cb9725702cb4f9787d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3930dc84caa1b9cb9725702cb4f9787d");
            return;
        }
        if (aVar != null) {
            this.j = new com.sankuai.waimai.irmo.render.a() { // from class: com.sankuai.waimai.irmo.render.engine.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.irmo.render.a
                public final void a(@NonNull a.EnumC0973a enumC0973a, @Nullable Map<String, Object> map) {
                    Object[] objArr2 = {enumC0973a, map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8827f95c0bfba8d706ebc1c25927cfa1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8827f95c0bfba8d706ebc1c25927cfa1");
                        return;
                    }
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    map.put("effect_type", Integer.valueOf(c.this.m));
                    aVar.a(enumC0973a, map);
                }
            };
        }
        this.k = iVar;
        this.l = fVar;
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public void a(@NonNull IrmoLayerInfo irmoLayerInfo, View view) {
        this.n = irmoLayerInfo;
        if (irmoLayerInfo != null) {
            this.m = irmoLayerInfo.type;
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void a(int i2, g gVar) {
        Object[] objArr = {Integer.valueOf(i2), gVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200094554ef341a34398bc2c57c35ed2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200094554ef341a34398bc2c57c35ed2");
            return;
        }
        switch (i2) {
            case 0:
                g();
                return;
            case 1:
                a(gVar);
                return;
            case 2:
                h();
                return;
            case 3:
                i();
                return;
            default:
                return;
        }
    }
}
