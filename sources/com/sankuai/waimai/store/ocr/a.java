package com.sankuai.waimai.store.ocr;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.meituan.android.edfu.mvex.detectors.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.SoftReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    SoftReference<b> b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.ocr.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1250a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87cf29e3564334f6ceb606142857139c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87cf29e3564334f6ceb606142857139c") : C1250a.a;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0352717475796c2705656081efee3f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0352717475796c2705656081efee3f5");
            return;
        }
        c a2 = c.a();
        c.a aVar = new c.a() { // from class: com.sankuai.waimai.store.ocr.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.mvex.detectors.c.a
            public final void a(String str) {
                b bVar;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "844649ccc10d213949075238016b4baa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "844649ccc10d213949075238016b4baa");
                } else if (a.this.b == null || (bVar = a.this.b.get()) == null) {
                } else {
                    bVar.c(str);
                }
            }
        };
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "8835d90f63483e98315581c7019cc7bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "8835d90f63483e98315581c7019cc7bb");
        } else {
            a2.b.add(aVar);
        }
    }

    public final void a(Activity activity, b bVar) {
        Object[] objArr = {activity, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b1b9650f3d04bef6c64477b8b546af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b1b9650f3d04bef6c64477b8b546af");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            activity.startActivity(a(activity));
            b(bVar);
        }
    }

    private static Intent a(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddc7bb310042ebd4e6bf8cf76cbf34d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddc7bb310042ebd4e6bf8cf76cbf34d8");
        }
        Intent intent = new Intent("com.meituan.android.intent.action.edfu_mlens");
        intent.setPackage(activity.getPackageName());
        intent.putExtra("searchtype", 1);
        return intent;
    }

    private void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5dcefd1e4cdd2476e2e0c66d070cc7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5dcefd1e4cdd2476e2e0c66d070cc7b");
        } else if (bVar == null) {
        } else {
            if (this.b != null) {
                this.b.clear();
            }
            this.b = new SoftReference<>(bVar);
        }
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "976cdef20e16f3751e6c4322bfed76fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "976cdef20e16f3751e6c4322bfed76fd");
        } else if (this.b != null && bVar == this.b.get()) {
            this.b.clear();
            this.b = null;
        }
    }
}
