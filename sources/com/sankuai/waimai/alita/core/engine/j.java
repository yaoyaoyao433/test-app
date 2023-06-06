package com.sankuai.waimai.alita.core.engine;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class j {
    public static ChangeQuickRedirect a;
    private static volatile j c;
    public Map<String, com.sankuai.waimai.alita.core.jsexecutor.task.d> b;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "163dbe0db78955fe9d7cc233b996de70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "163dbe0db78955fe9d7cc233b996de70");
        } else {
            this.b = new HashMap();
        }
    }

    public static j a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8c6bbbb3c047ae3e170b19d77d9ff26", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8c6bbbb3c047ae3e170b19d77d9ff26");
        }
        if (c == null) {
            synchronized (j.class) {
                if (c == null) {
                    c = new j();
                }
            }
        }
        return c;
    }

    @Nullable
    public final com.sankuai.waimai.alita.core.jsexecutor.task.d a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5399f85a103a4297c984dac207520591", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.alita.core.jsexecutor.task.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5399f85a103a4297c984dac207520591") : this.b.get(str);
    }

    @Nullable
    public final com.sankuai.waimai.alita.core.jsexecutor.task.d b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "849eef53173fbc05a1fde2a2cda747e5", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.alita.core.jsexecutor.task.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "849eef53173fbc05a1fde2a2cda747e5") : this.b.remove(str);
    }
}
