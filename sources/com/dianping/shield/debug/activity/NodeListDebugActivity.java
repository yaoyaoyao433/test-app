package com.dianping.shield.debug.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.shield.debug.node.NodeListDebugFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NodeListDebugActivity extends FragmentActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Fragment mFragment;

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2c10d159dee7e8fda0b5d9903ae50b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2c10d159dee7e8fda0b5d9903ae50b1");
            return;
        }
        super.onCreate(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.mFragment = supportFragmentManager.findFragmentByTag("NodeListDebugFragment");
        if (this.mFragment == null) {
            this.mFragment = new NodeListDebugFragment();
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(16908300);
        super.setContentView(frameLayout);
        if (this.mFragment.isAdded()) {
            return;
        }
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        beginTransaction.add(16908300, this.mFragment, "NodeListDebugFragment");
        beginTransaction.commit();
    }
}
