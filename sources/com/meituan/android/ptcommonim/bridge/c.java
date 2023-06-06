package com.meituan.android.ptcommonim.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.ptcommonim.protocol.message.PTIMMessageBeanEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements Mach.d {
    public static ChangeQuickRedirect a;
    private com.meituan.android.ptcommonim.pageadapter.message.item.b b;

    public c(com.meituan.android.ptcommonim.pageadapter.message.item.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ec1373f715097f86d8ce7b9cad67849", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ec1373f715097f86d8ce7b9cad67849");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.sankuai.waimai.mach.Mach.d
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7315f661cd20197be859f37656be75f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7315f661cd20197be859f37656be75f");
        } else if ("clickExpand".equals(str)) {
            try {
                ((Map) ((Map) ((Map) this.b.c().get("data")).get("platformData")).get(PTIMMessageBeanEntity.DATA_KEY_CARD)).put("expanded", Boolean.valueOf(((Boolean) map.get("expanded")).booleanValue()));
                this.b.a(this.b.n);
            } catch (Throwable unused) {
            }
        }
    }
}
