package com.meituan.android.privacy.interfaces.def.permission;

import android.support.annotation.NonNull;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class i extends a {
    public static ChangeQuickRedirect j;
    @NonNull
    private final List<String> a;

    public i(@NonNull PermissionGuard permissionGuard, @NonNull String str, @NonNull String str2, @NonNull List<String> list) {
        super(permissionGuard, str, str2);
        Object[] objArr = {permissionGuard, str, str2, list};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32a24af23f12de4b518af42f7a786b4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32a24af23f12de4b518af42f7a786b4f");
        } else {
            this.a = list;
        }
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.a
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15101dae9036eeffd806dca3a05162cc", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15101dae9036eeffd806dca3a05162cc") : (String[]) this.a.toArray(new String[0]);
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.a
    public boolean a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d4075460665b9aa42de5b617e164f80", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d4075460665b9aa42de5b617e164f80")).booleanValue() : this.c.getSys().a(z, b());
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.a
    public boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af03ce94a46f4c2a2e0d6c21070e3a2f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af03ce94a46f4c2a2e0d6c21070e3a2f")).booleanValue();
        }
        for (String str : this.a) {
            if (this.c.getSys().a(str)) {
                return true;
            }
        }
        return false;
    }
}
