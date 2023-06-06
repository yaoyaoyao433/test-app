package com.meituan.android.quickpass.qpdev.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.meituan.android.quickpass.qpdev.QuickPassDevManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OnlineLogActivity extends AppCompatActivity {
    public static ChangeQuickRedirect a;
    private TextView b;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02684525bf04b258c3dd045a3fe6653e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02684525bf04b258c3dd045a3fe6653e");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_online_log);
        this.b = (TextView) findViewById(R.id.tv_log);
        this.b.setText(QuickPassDevManager.a().b.getOnlineLogBuilder());
    }
}
