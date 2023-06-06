package com.sankuai.waimai.mmp.modules.router;

import android.content.Context;
import android.content.Intent;
import com.meituan.mmp.main.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends i {
    public static ChangeQuickRedirect c;
    public List<i> d;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "752a847400b1cecb378e3c1ca9aaff70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "752a847400b1cecb378e3c1ca9aaff70");
            return;
        }
        this.d = new ArrayList();
        this.d.add(new b(context));
        this.d.add(new com.meituan.mmp.main.fusion.d(context));
    }

    @Override // com.meituan.mmp.main.i
    public final boolean a(Context context, Intent intent, boolean z) {
        Object[] objArr = {context, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79cf35e4b3d1da20ff3a797355e250d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79cf35e4b3d1da20ff3a797355e250d7")).booleanValue();
        }
        for (i iVar : this.d) {
            if (iVar.a(context, intent, z)) {
                return true;
            }
        }
        return false;
    }
}
