package com.meituan.android.hybridcashier;

import android.support.annotation.Keep;
import android.support.v4.app.Fragment;
import com.meituan.android.neohybrid.container.NeoBaseFragmentImpl;
import com.meituan.android.neohybrid.container.NeoCommonActivity;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HybridCashierActivity extends NeoCommonActivity {
    public static ChangeQuickRedirect a;
    private static Object e;

    @Override // com.meituan.android.neohybrid.container.NeoCommonActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05dba73c883065b058bbc93e5d915b70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05dba73c883065b058bbc93e5d915b70");
            return;
        }
        if (isFinishing()) {
            e = null;
        }
        super.onDestroy();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3266dba0be1fa48672b08a832d9abab0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3266dba0be1fa48672b08a832d9abab0");
        } else {
            NeoBaseFragmentImpl.f();
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca90fb5f4ae51f61c0798badda52500e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca90fb5f4ae51f61c0798badda52500e")).booleanValue() : this.d.e();
    }

    @Keep
    public Object getConfirmCallBack() {
        return e;
    }

    @Keep
    public void setConfirmCallBack(Object obj) {
        e = obj;
    }

    @Override // com.meituan.android.neohybrid.container.NeoCommonActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cf4bbeb1f3e21961887a9fa7abfa010", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cf4bbeb1f3e21961887a9fa7abfa010");
            return;
        }
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (i.a((Collection) fragments)) {
            return;
        }
        if (fragments.size() == 1 && fragments.get(0) == this.d) {
            super.onBackPressed();
            return;
        }
        ListIterator<Fragment> listIterator = fragments.listIterator(fragments.size());
        while (listIterator.hasPrevious()) {
            Fragment previous = listIterator.previous();
            if ((previous instanceof com.meituan.android.neohybrid.core.listener.b) && ((com.meituan.android.neohybrid.core.listener.b) previous).h()) {
                return;
            }
        }
    }
}
