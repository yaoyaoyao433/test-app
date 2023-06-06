package com.sankuai.waimai.store.drug.manager.collection;

import android.app.Activity;
import com.meituan.mmp.main.ICustomEventDispatch;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b c;
    public List<a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(long j, boolean z, boolean z2);
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb1da92838b78460f47cb32b3e6dddd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb1da92838b78460f47cb32b3e6dddd2");
        }
        if (c == null) {
            c = new b();
        }
        return c;
    }

    public final void a(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a2af3c23873b6619fe48347677ade37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a2af3c23873b6619fe48347677ade37");
        } else {
            a(j, z, false);
        }
    }

    public final void a(long j, boolean z, boolean z2) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9b7cdb357607f843cacd82613b072c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9b7cdb357607f843cacd82613b072c");
            return;
        }
        if (!z2) {
            ICustomEventDispatch registerPrivateEvent = MMPEnvHelper.registerPrivateEvent("onCollectPoiStateChange");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("poi_id", j);
                jSONObject.put("is_collected", z);
                registerPrivateEvent.onCustomEventDispatch(jSONObject);
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
            }
        }
        if (com.sankuai.shangou.stone.util.a.b(this.b)) {
            return;
        }
        for (a aVar : this.b) {
            aVar.a(j, z, z2);
        }
    }

    public final void a(com.sankuai.waimai.store.i.collection.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9180c6093703e47da063c6b8fab44dae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9180c6093703e47da063c6b8fab44dae");
        } else {
            com.sankuai.waimai.foundation.core.service.collect.b.a().setCollectPoiListener(new com.sankuai.waimai.store.drug.manager.collection.a(aVar));
        }
    }

    public final void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac992f2a41eb4e09d761dd0c974b8e32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac992f2a41eb4e09d761dd0c974b8e32");
        } else {
            com.sankuai.waimai.foundation.core.service.collect.b.a().collectPoi(activity, str, str2);
        }
    }

    public final void b(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "917a040cd64f7d004a769eab055ed4b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "917a040cd64f7d004a769eab055ed4b2");
        } else {
            com.sankuai.waimai.foundation.core.service.collect.b.a().cancelCollectPoi(activity, str, str2);
        }
    }
}
