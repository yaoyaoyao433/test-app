package com.sankuai.waimai.store.manager.collection;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b c;
    public List<a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(long j, boolean z);
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c24d1c4fed9f11571f1913f9ad2aa698", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c24d1c4fed9f11571f1913f9ad2aa698");
        }
        if (c == null) {
            c = new b();
        }
        return c;
    }

    public final void a(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "306dda526d6624c077fb99eda01edfac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "306dda526d6624c077fb99eda01edfac");
        } else if (!com.sankuai.shangou.stone.util.a.b(this.b)) {
            for (a aVar : this.b) {
                aVar.a(j, z);
            }
        }
    }

    public final void a(com.sankuai.waimai.store.i.collection.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fe55340bc40dbcaa697f1f627602387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fe55340bc40dbcaa697f1f627602387");
        } else {
            com.sankuai.waimai.foundation.core.service.collect.b.a().setCollectPoiListener(new com.sankuai.waimai.store.manager.collection.a(aVar));
        }
    }

    public final void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4befa9274e2e022a54184e357ebd8bc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4befa9274e2e022a54184e357ebd8bc6");
        } else {
            com.sankuai.waimai.foundation.core.service.collect.b.a().collectPoi(activity, str, str2);
        }
    }

    public final void b(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed1de61def6562c6da7688cbc37a4df5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed1de61def6562c6da7688cbc37a4df5");
        } else {
            com.sankuai.waimai.foundation.core.service.collect.b.a().cancelCollectPoi(activity, str, str2);
        }
    }
}
