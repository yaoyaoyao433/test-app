package com.meituan.android.neohybrid.v2.container;

import android.support.annotation.Keep;
import android.support.v4.app.Fragment;
import com.meituan.android.neohybrid.core.listener.b;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NeoActivity extends NeoCommonActivity {
    public static ChangeQuickRedirect a;
    private static Object e;

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab966c9acd5c745a913e133459f7a638", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab966c9acd5c745a913e133459f7a638")).booleanValue();
        }
        return false;
    }

    @Override // com.meituan.android.neohybrid.v2.container.NeoCommonActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "626374b9e25460fcef0116b0dc8eaf52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "626374b9e25460fcef0116b0dc8eaf52");
            return;
        }
        if (isFinishing()) {
            e = null;
        }
        super.onDestroy();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9ecad8a31e3db93ba6aef20f19207f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9ecad8a31e3db93ba6aef20f19207f1");
        } else {
            com.meituan.android.neohybrid.container.NeoBaseFragmentImpl.f();
        }
    }

    @Keep
    public Object getConfirmCallBack() {
        return e;
    }

    @Keep
    public void setConfirmCallBack(Object obj) {
        e = obj;
    }

    @Override // com.meituan.android.neohybrid.v2.container.NeoCommonActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5f32d662742166eb67bbf77fda10ed0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5f32d662742166eb67bbf77fda10ed0");
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
            if ((previous instanceof b) && ((b) previous).h()) {
                return;
            }
        }
    }
}
