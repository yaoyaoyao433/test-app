package com.sankuai.waimai.business.page.common.arch;

import android.arch.lifecycle.d;
import android.arch.lifecycle.f;
import android.arch.lifecycle.g;
import android.arch.lifecycle.r;
import android.arch.lifecycle.s;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.fragment.BaseFragment;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PageFragment extends BaseFragment implements f, s {
    public static ChangeQuickRedirect a;
    public r b;
    public g c;

    public PageFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfae01287adc11476b50f0b6ed34c871", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfae01287adc11476b50f0b6ed34c871");
        } else {
            this.c = new g(this);
        }
    }

    @Override // android.arch.lifecycle.f
    @NonNull
    public d getLifecycle() {
        return this.c;
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b5546f6d44fbe32457f6f40bcd4f919", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b5546f6d44fbe32457f6f40bcd4f919");
            return;
        }
        this.c.a(d.a.ON_CREATE);
        super.onCreate(bundle);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b76c8276399801d6649a95f236004d7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b76c8276399801d6649a95f236004d7e");
            return;
        }
        this.c.a(d.a.ON_START);
        super.onStart();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9618b019a87b00e92ae03bfe3aa1eb47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9618b019a87b00e92ae03bfe3aa1eb47");
            return;
        }
        this.c.a(d.a.ON_RESUME);
        super.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ea19e6e0127c29bac3b3c2bc355952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ea19e6e0127c29bac3b3c2bc355952");
            return;
        }
        this.c.a(d.a.ON_PAUSE);
        super.onPause();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a6aae9d1e057c8351c416af7b7a0c3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a6aae9d1e057c8351c416af7b7a0c3f");
            return;
        }
        this.c.a(d.a.ON_STOP);
        super.onStop();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7c9d20069fd50291a486d41d5dadb25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7c9d20069fd50291a486d41d5dadb25");
            return;
        }
        this.c.a(d.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.arch.lifecycle.s
    @NonNull
    public final r ax_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "492c36952c708eee154e69e0e93987bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "492c36952c708eee154e69e0e93987bd");
        }
        if (getContext() == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.b == null) {
            this.b = new r();
        }
        return this.b;
    }
}
