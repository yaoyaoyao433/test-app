package com.dianping.gcmrnmodule.playground;

import android.content.Context;
import android.os.Bundle;
import com.dianping.shield.dynamic.playground.DMPlaygroundFragment;
import com.facebook.react.common.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/dianping/gcmrnmodule/playground/MRNPlaygroundFragment;", "Lcom/dianping/shield/dynamic/playground/DMPlaygroundFragment;", "()V", "defaultKey", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNPlaygroundFragment extends DMPlaygroundFragment {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.shield.dynamic.playground.DMPlaygroundFragment
    @NotNull
    public final String defaultKey() {
        return "gc/mrn-module-demo/mrn_module_demo_welcome";
    }

    @Override // com.dianping.shield.dynamic.playground.DMPlaygroundFragment, com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        boolean z = true;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c39bd8d367ac6d6ba953a6128bc89fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c39bd8d367ac6d6ba953a6128bc89fa");
            return;
        }
        super.onCreate(bundle);
        String stringParam = getStringParam("serverip");
        String stringParam2 = getStringParam("serverport");
        String str = stringParam;
        if (str == null || g.a((CharSequence) str)) {
            return;
        }
        String str2 = stringParam2;
        if (str2 != null && !g.a((CharSequence) str2)) {
            z = false;
        }
        if (z) {
            return;
        }
        Context context = getContext();
        d.a(context, "debug_http_host", stringParam + ':' + stringParam2);
    }

    @Override // com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, com.dianping.portal.fragment.HoloFragment, android.support.v4.app.Fragment
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1771376fbf7919b6142bfa3ee5428439", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1771376fbf7919b6142bfa3ee5428439");
        } else {
            super.onDestroy();
        }
    }
}
