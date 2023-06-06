package com.meituan.android.customerservice.kit.floating;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FloatingDialogActivity extends AppCompatActivity {
    public static ChangeQuickRedirect a;
    private long b;

    public FloatingDialogActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c81d78b978ecae3173483e8747d96cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c81d78b978ecae3173483e8747d96cb");
        } else {
            this.b = 0L;
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c1058110db39e362e22557c89c87bac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c1058110db39e362e22557c89c87bac");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.cs_voip_dialog_floating);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        TextView textView = (TextView) findViewById(R.id.tv_message);
        String a2 = f.a(getIntent(), "message");
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        textView.setText(a2);
    }

    public void openFloatingPermission(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "409e7e4df6b73dfc02ec96451df945e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "409e7e4df6b73dfc02ec96451df945e7");
        } else if (System.currentTimeMillis() - this.b < 500) {
        } else {
            this.b = System.currentTimeMillis();
            Intent intent = new Intent(this, DrawOverPermissionActivity.class);
            intent.setFlags(y.a);
            if (getPackageManager().resolveActivity(intent, 65536) != null) {
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Class<?> cls = getClass();
                    com.meituan.android.customerservice.kit.utils.b.a(cls, "activity not found ,exc " + e.toString());
                }
            }
            finish();
        }
    }

    public void cancel(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cced5fdaf30211d6e759b89dd02e5aff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cced5fdaf30211d6e759b89dd02e5aff");
        } else {
            finish();
        }
    }
}
