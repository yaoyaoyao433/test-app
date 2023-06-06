package com.sankuai.waimai.ai.uat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements Serializable {
    public static ChangeQuickRedirect a;

    public abstract boolean a(a aVar);

    public static boolean a(@Nullable a aVar, @Nullable a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea2f9f4c7af2a3e7c9df7c22410f279a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea2f9f4c7af2a3e7c9df7c22410f279a")).booleanValue();
        }
        if (aVar == aVar2) {
            return true;
        }
        if (aVar == null || aVar2 == null) {
            return false;
        }
        return aVar.a(aVar2);
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc20c64fa4b8fd5a1a4aee366d4aeec8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc20c64fa4b8fd5a1a4aee366d4aeec8")).booleanValue();
        }
        if (obj instanceof a) {
            return a((a) obj);
        }
        return false;
    }
}
