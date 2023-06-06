package com.meituan.android.customerservice.kit.call;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import com.meituan.android.customerservice.kit.utils.e;
import com.meituan.android.customerservice.kit.utils.g;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.ui.widget.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallBaseFragmentActivity extends FragmentActivity {
    public static ChangeQuickRedirect b;
    private g a;
    protected int[] c;
    private a d;

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d11fbe2e1efa687632e723ab3fb7f64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d11fbe2e1efa687632e723ab3fb7f64");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2ac584ae0d18c8660612bcb90d6fe70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2ac584ae0d18c8660612bcb90d6fe70");
        } else {
            this.a = new g(this);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a4fbde5c147435a55befd7489b19b66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a4fbde5c147435a55befd7489b19b66");
            return;
        }
        super.onStart();
        if (Privacy.createPermissionGuard().a(this, PermissionGuard.PERMISSION_MICROPHONE, "pt-07e05fed3b674cf2") > 0) {
            a();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9a0fd8cca355ba2d97dbaa4c6a0c4c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9a0fd8cca355ba2d97dbaa4c6a0c4c4");
        } else {
            if (this.d == null) {
                if (this.c != null) {
                    this.d = new a(this, getString(R.string.cs_voip_call_no_permission_tip), -2).a(this.c[0], this.c[1], this.c[2], this.c[3]);
                } else {
                    this.d = new a(this, getString(R.string.cs_voip_call_no_permission_tip), -2);
                }
            }
            this.d.a();
        }
        Privacy.createPermissionGuard().a((Activity) this, PermissionGuard.PERMISSION_MICROPHONE, "pt-07e05fed3b674cf2", new d() { // from class: com.meituan.android.customerservice.kit.call.CallBaseFragmentActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.interfaces.d
            public final void onResult(String str, int i) {
                Object[] objArr3 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d411bda5d33b0e52ce2404c39dd08c98", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d411bda5d33b0e52ce2404c39dd08c98");
                } else if (i > 0) {
                    CallBaseFragmentActivity.this.a();
                } else {
                    e.a(CallBaseFragmentActivity.this, null);
                }
            }
        });
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77bca68919a4fd0aa91dcb169aeeabc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77bca68919a4fd0aa91dcb169aeeabc7");
            return;
        }
        super.onResume();
        g gVar = this.a;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "51006ef5da7cc67f730f3fba02c6354d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "51006ef5da7cc67f730f3fba02c6354d");
        } else if (gVar.d == null) {
            gVar.d = new g.a();
            gVar.b.registerListener(gVar.d, gVar.b.getDefaultSensor(8), 2);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba245eadae686d6b0a65687a13f68e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba245eadae686d6b0a65687a13f68e0");
            return;
        }
        super.onPause();
        g gVar = this.a;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "ecd40597a3e90baed121d73bdde23f94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "ecd40597a3e90baed121d73bdde23f94");
        } else if (gVar.d != null) {
            gVar.b.unregisterListener(gVar.d);
            gVar.d = null;
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84a720d792a45111b8767f9d61a2c7dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84a720d792a45111b8767f9d61a2c7dd");
            return;
        }
        super.onDestroy();
        g gVar = this.a;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "e94541fc79b3bceace40087366e872b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "e94541fc79b3bceace40087366e872b1");
        } else {
            gVar.a();
        }
        a();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f17653f874bf50ffc47cbb60ace3523", RobustBitConfig.DEFAULT_VALUE)) {
            return (Resources) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f17653f874bf50ffc47cbb60ace3523");
        }
        Resources resources = super.getResources();
        Configuration configuration = new Configuration();
        configuration.setToDefaults();
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return resources;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40a20d58089c391fbd2557d262820cbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40a20d58089c391fbd2557d262820cbc");
        } else if (this.d != null) {
            this.d.b();
        }
    }
}
