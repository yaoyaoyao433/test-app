package com.sankuai.waimai.alita.core.tasklistener;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.tasklistener.b;
import java.lang.Exception;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c<K, V, E extends Exception> extends b<K, V, E> {
    public static ChangeQuickRedirect a;
    private b<K, V, E> b;

    public c(b<K, V, E> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a11890cfd3a02cf40d21d0b12dd5179c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a11890cfd3a02cf40d21d0b12dd5179c");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.sankuai.waimai.alita.core.tasklistener.b
    public final void b(@NonNull Map<K, b.d<V>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "950221a5746305304cc0dd96481a448b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "950221a5746305304cc0dd96481a448b");
        } else if (this.b != null) {
            this.b.b(map);
        }
    }

    @Override // com.sankuai.waimai.alita.core.tasklistener.b
    public final void c(@NonNull Map<K, b.d<V>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dad70ec6542b8f6f2d536f682776f026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dad70ec6542b8f6f2d536f682776f026");
        } else if (this.b != null) {
            this.b.c(map);
        }
    }

    @Override // com.sankuai.waimai.alita.core.tasklistener.b
    public final void d(@NonNull Map<K, b.d<V>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aea4e55b0c685ead38e14ecd7c3d43d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aea4e55b0c685ead38e14ecd7c3d43d3");
        } else if (this.b != null) {
            this.b.d(map);
        }
    }

    @Override // com.sankuai.waimai.alita.core.tasklistener.b
    public final void e(@NonNull Map<K, b.d<V>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1dc210b2f2ed27f99fa3c8298b2b093", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1dc210b2f2ed27f99fa3c8298b2b093");
        } else if (this.b != null) {
            this.b.e(map);
        }
    }

    @Override // com.sankuai.waimai.alita.core.tasklistener.b
    public final void a(@NonNull Map<K, b.d<V>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47d3742194b674411e5ac12c690b598c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47d3742194b674411e5ac12c690b598c");
        } else if (this.b != null) {
            this.b.a((Map) map);
        }
    }
}
