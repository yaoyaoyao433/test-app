package com.sankuai.waimai.business.page.common.arch;

import android.arch.lifecycle.ReportFragment;
import android.arch.lifecycle.d;
import android.arch.lifecycle.f;
import android.arch.lifecycle.g;
import android.arch.lifecycle.r;
import android.arch.lifecycle.s;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.PageFragmentUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PageActivity extends BaseActivity implements f, s {
    public static ChangeQuickRedirect a;
    protected String b;
    private r c;
    private g d;

    public void av_() {
    }

    public void aw_() {
    }

    public PageActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93605c25703e8963e07ffc4bd184d911", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93605c25703e8963e07ffc4bd184d911");
        } else {
            this.d = new g(this);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f1a97356c1ca798db42f79275d50feb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f1a97356c1ca798db42f79275d50feb");
            return;
        }
        super.onCreate(bundle);
        ReportFragment.a(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c77c26ef7b595f8157ba8e41684186a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c77c26ef7b595f8157ba8e41684186a");
            return;
        }
        Intent intent = getIntent();
        if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                this.b = data.getScheme() + "://" + data.getHost() + data.getPath();
                return;
            }
            this.b = f();
            return;
        }
        this.b = f();
    }

    private String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88cdcb476659383e4f35dfb48d95bd45", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88cdcb476659383e4f35dfb48d95bd45") : getClass().getName();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c30ca34870e017331cb25831b1ffc1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c30ca34870e017331cb25831b1ffc1f");
            return;
        }
        this.d.a(d.a.ON_CREATE);
        g();
        super.onSaveInstanceState(bundle);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5add1ae3800f1f8a636a55555ea4016", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5add1ae3800f1f8a636a55555ea4016");
            return;
        }
        g();
        super.onStop();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60ccc51e55b10b463828f6a4aec43094", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60ccc51e55b10b463828f6a4aec43094");
            return;
        }
        super.onDestroy();
        if (this.c != null) {
            this.c.a();
        }
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "914a80a6ceb85adac91c6f405692e0a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "914a80a6ceb85adac91c6f405692e0a6");
            return;
        }
        if (z) {
            com.sankuai.waimai.platform.capacity.immersed.a.b(this, z2);
        }
        com.sankuai.waimai.platform.capacity.immersed.a.a(this, z);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1df7bd4925a7a8d27dd76bf2c342809", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1df7bd4925a7a8d27dd76bf2c342809");
        } else {
            do {
            } while (a(getSupportFragmentManager(), d.b.CREATED));
        }
    }

    private static boolean a(FragmentManager fragmentManager, d.b bVar) {
        FragmentManager childFragmentManager;
        boolean z = false;
        Object[] objArr = {fragmentManager, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69df970d52f67d886316dcc643f3b934", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69df970d52f67d886316dcc643f3b934")).booleanValue();
        }
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment instanceof PageFragment) {
                PageFragment pageFragment = (PageFragment) fragment;
                if (pageFragment.getLifecycle().a().a(d.b.STARTED)) {
                    pageFragment.c.a(bVar);
                    z = true;
                }
                if (PageFragmentUtil.haveChildFragmentManager(pageFragment) && (childFragmentManager = pageFragment.getChildFragmentManager()) != null) {
                    z = a(childFragmentManager, bVar) | z;
                }
            }
        }
        return z;
    }

    @Override // android.arch.lifecycle.f
    @NonNull
    public d getLifecycle() {
        return this.d;
    }

    @Override // android.arch.lifecycle.s
    @NonNull
    public final r ax_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d05cc135a752d0d112de4e38d6766ad4", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d05cc135a752d0d112de4e38d6766ad4");
        }
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.c == null) {
            this.c = new r();
        }
        return this.c;
    }
}
