package com.sankuai.waimai.store.manager.marketing.parser.inner.mach;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseFragment;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.SGMarketingDialog;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class MachContainerFragment extends SCBaseFragment {
    public static ChangeQuickRedirect a;
    public ViewGroup c;
    public String d;
    public com.sankuai.waimai.store.manager.sequence.a e;
    public e f;
    public String g;
    private com.sankuai.waimai.store.platform.marketing.a h;
    private int i;
    private d j;

    public MachContainerFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37116e552ffb48eceff21893dd904b64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37116e552ffb48eceff21893dd904b64");
        } else {
            this.i = 0;
        }
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb4296f939ac8ad57e952753bc393a44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb4296f939ac8ad57e952753bc393a44");
        } else if (this.j == null || this.j.f == null) {
        } else {
            this.j.f.b(str, map);
        }
    }

    public final void a(com.sankuai.waimai.store.platform.marketing.a aVar) {
        this.i = 1;
        this.h = aVar;
    }

    @Override // com.sankuai.waimai.store.base.SCBaseFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f90d232455e6be118adb104e9cdec48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f90d232455e6be118adb104e9cdec48");
            return;
        }
        super.onCreate(bundle);
        com.sankuai.waimai.store.expose.v2.b.a().a(this);
        if (this.h == null) {
            try {
                StoreException storeException = StoreException.SetContentViewStepException;
                com.sankuai.waimai.store.util.monitor.c.a(storeException, "templateError", "fragment datastatus " + this.i);
            } catch (Throwable unused) {
            }
        }
        this.j = new d(this, this.g, this.c, this.f, this.h) { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.mach.MachContainerFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.d
            public final void a(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7faad93cc91011be14f0b7903dd7530", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7faad93cc91011be14f0b7903dd7530");
                } else if (MachContainerFragment.this.e == null || MachContainerFragment.this.h == null) {
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put(LogMonitor.EXCEPTION_TAG, Log.getStackTraceString(exc));
                    hashMap.put("templateID", MachContainerFragment.this.h.b);
                    hashMap.put("templateData", MachContainerFragment.this.h.c);
                    MachContainerFragment.this.e.a(MachContainerFragment.this.h.b, SGMarketingDialog.MachRenderError, i.a(hashMap));
                }
            }

            @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27c0e4647e10ebdd190f3eb7d5412367", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27c0e4647e10ebdd190f3eb7d5412367");
                    return;
                }
                if (MachContainerFragment.this.c != null) {
                    MachContainerFragment.this.c.setVisibility(0);
                }
                MachContainerFragment.this.j.d();
                if (MachContainerFragment.this.e != null) {
                    MachContainerFragment.this.e.b(MachContainerFragment.this.j.c(), MachContainerFragment.this.d);
                }
            }
        };
        this.j.e();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51e83961509e57a62d8891e62addf8bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51e83961509e57a62d8891e62addf8bc");
        } else {
            super.onViewCreated(view, bundle);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "815764d7ab5577041fe6c92af2f828ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "815764d7ab5577041fe6c92af2f828ba");
        } else {
            super.onViewAttachedToWindow(view);
        }
    }

    @Override // com.sankuai.waimai.store.base.SCBaseFragment, com.sankuai.waimai.store.expose.v2.a
    public final View f() {
        return this.c;
    }

    @Override // com.sankuai.waimai.store.base.SCBaseFragment
    public final String b() {
        return this.g;
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a93ea5b721e5b889ef4e85ba9b70fbfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a93ea5b721e5b889ef4e85ba9b70fbfd");
            return;
        }
        super.onResume();
        com.sankuai.waimai.store.expose.v2.b.a().c(this);
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dd34a1f54c12125edd9b61cfd1fe0a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dd34a1f54c12125edd9b61cfd1fe0a1");
            return;
        }
        super.onPause();
        com.sankuai.waimai.store.expose.v2.b.a().e(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public final void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92172d45cbedd5e3caf372b9549ba4df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92172d45cbedd5e3caf372b9549ba4df");
            return;
        }
        super.onStop();
        com.sankuai.waimai.store.expose.v2.b.a().f(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "771ea66ffee2526e66f8a227e8f01ccb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "771ea66ffee2526e66f8a227e8f01ccb");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.expose.v2.b.a().b(this);
    }
}
