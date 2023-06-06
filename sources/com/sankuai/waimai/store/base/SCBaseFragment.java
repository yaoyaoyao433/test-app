package com.sankuai.waimai.store.base;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.fragment.BaseFragment;
import com.sankuai.waimai.store.util.al;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCBaseFragment extends BaseFragment implements com.sankuai.waimai.store.expose.v2.a {
    public static ChangeQuickRedirect b;
    private String a;

    public String b() {
        return "";
    }

    @Override // com.sankuai.waimai.store.expose.v2.a
    @Nullable
    public final /* synthetic */ Activity bB_() {
        return super.getActivity();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6f6e91dc06b18d3004d1c2f5f3cf9f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6f6e91dc06b18d3004d1c2f5f3cf9f8");
            return;
        }
        super.onDestroyView();
        al.cancel(q());
        com.sankuai.waimai.store.base.net.c.a(q());
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4475b6caaa498811259f53551553377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4475b6caaa498811259f53551553377");
            return;
        }
        com.sankuai.waimai.store.base.monitor.time.a a = com.sankuai.waimai.store.base.monitor.time.a.a();
        FragmentActivity activity = getActivity();
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.base.monitor.time.a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "dda2d5165dc44aa06384fcecf01f5063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "dda2d5165dc44aa06384fcecf01f5063");
        } else {
            Map<String, Long> b2 = a.b(a.c(activity));
            if (b2 != null && !b2.containsKey("onFragmentCreated")) {
                b2.put("onFragmentCreated", Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment
    public String q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5cfc6a07a9de5116d701e7d2d203d8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5cfc6a07a9de5116d701e7d2d203d8c");
        }
        if (!TextUtils.isEmpty(this.a)) {
            return this.a;
        }
        String q = super.q();
        if (!TextUtils.isEmpty(q)) {
            this.a = q;
            return this.a;
        }
        this.a = getClass().getSimpleName() + System.currentTimeMillis();
        return this.a;
    }

    @Override // com.sankuai.waimai.store.expose.v2.a
    public View f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6245a078f3ec8aea3ca22bc85a5d2f8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6245a078f3ec8aea3ca22bc85a5d2f8") : getView();
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "424770fa65bd594f2b1f1ba6f558bfcb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "424770fa65bd594f2b1f1ba6f558bfcb") : com.sankuai.waimai.store.manager.judas.b.a(this);
    }
}
