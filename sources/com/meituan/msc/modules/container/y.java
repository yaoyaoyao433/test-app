package com.meituan.msc.modules.container;

import android.content.Intent;
import android.support.annotation.Nullable;
import com.meituan.msc.modules.container.s;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msi.bean.NavActivityInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@ModuleName(name = "startActivity")
/* loaded from: classes3.dex */
public class y extends com.meituan.msc.modules.manager.k implements s {
    public static ChangeQuickRedirect a;
    public ConcurrentHashMap<Integer, a> b;

    public y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb677277962156c4b4401976b9477520", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb677277962156c4b4401976b9477520");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        int b;
        s.a c;

        public a(int i, @Nullable s.a aVar) {
            Object[] objArr = {Integer.valueOf(i), aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d872d6ee77f8ba28a873fdbca2430ca2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d872d6ee77f8ba28a873fdbca2430ca2");
                return;
            }
            this.b = i;
            this.c = aVar;
        }
    }

    @Override // com.meituan.msc.modules.container.s
    public final void a(Intent intent, int i, NavActivityInfo navActivityInfo, @Nullable s.a aVar) {
        Object[] objArr = {intent, Integer.valueOf(i), navActivityInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a32344712d0dd454e5115a4ac812ce8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a32344712d0dd454e5115a4ac812ce8f");
            return;
        }
        int i2 = navActivityInfo != null ? navActivityInfo.pageId : 0;
        p f = U_().b().f(i2);
        if (f == null) {
            if (aVar == null) {
                com.meituan.msc.modules.reporter.g.d("StartActivityModule", "startActivityForResult callback is null");
                return;
            }
            aVar.a(2, "can't getContainerDelegateByPageIdOrTopPage by pageId" + i2);
            return;
        }
        a remove = this.b.remove(Integer.valueOf(f.F()));
        if (remove != null && remove.c != null) {
            remove.c.a(0, new Intent());
        }
        if (aVar != null) {
            this.b.put(Integer.valueOf(f.F()), new a(i, aVar));
        }
        f.a(intent, i, navActivityInfo);
    }

    @Override // com.meituan.msc.modules.container.s
    public final void a(Intent intent, int i, @Nullable s.a aVar) {
        Object[] objArr = {intent, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc21b125530521ea4d4f53749ff87471", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc21b125530521ea4d4f53749ff87471");
        } else {
            a(intent, i, (NavActivityInfo) null, aVar);
        }
    }

    @Override // com.meituan.msc.modules.container.s
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "453e043b37cd7a70ab237485274dc924", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "453e043b37cd7a70ab237485274dc924");
        } else {
            a(intent, -1, (s.a) null);
        }
    }

    @Override // com.meituan.msc.modules.container.s
    public final void a(p pVar, int i, int i2, Intent intent) {
        Object[] objArr = {pVar, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd3af66d0c8032739fd47d010b21e19c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd3af66d0c8032739fd47d010b21e19c");
            return;
        }
        a aVar = this.b.get(Integer.valueOf(pVar.F()));
        if (aVar == null || aVar.c == null || i != aVar.b) {
            return;
        }
        this.b.remove(Integer.valueOf(pVar.F()));
        aVar.c.a(i2, intent);
    }
}
