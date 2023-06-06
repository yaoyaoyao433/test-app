package com.meituan.android.neohybrid.v2.neo.bridge;

import android.content.Intent;
import com.meituan.android.neohybrid.util.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.neohybrid.v2.neo.a {
    public static ChangeQuickRedirect d;
    public List<InterfaceC0312a> e;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.v2.neo.bridge.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0312a {
        void a();

        void a(int i, int i2, Intent intent);
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final String h() {
        return "neobridge_plugin";
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99388078732fe05ca152d20044c6708d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99388078732fe05ca152d20044c6708d");
        } else {
            this.e = new ArrayList();
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e7ed21cd625a47fc4a99c138923116f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e7ed21cd625a47fc4a99c138923116f");
            return;
        }
        super.a(i, i2, intent);
        for (InterfaceC0312a interfaceC0312a : this.e) {
            if (interfaceC0312a != null) {
                try {
                    interfaceC0312a.a(i, i2, intent);
                } catch (Exception e) {
                    f.a("NeoBridgePlugin_onNeoActivityResult_e:" + e.toString());
                }
            }
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a88ec7810be9e192a55e2fb4ec41750", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a88ec7810be9e192a55e2fb4ec41750");
            return;
        }
        super.g();
        for (InterfaceC0312a interfaceC0312a : this.e) {
            if (interfaceC0312a != null) {
                try {
                    interfaceC0312a.a();
                } catch (Exception e) {
                    f.a("NeoBridgePlugin_onNeoDestroy_e:" + e.toString());
                }
            }
        }
        this.e.clear();
    }
}
