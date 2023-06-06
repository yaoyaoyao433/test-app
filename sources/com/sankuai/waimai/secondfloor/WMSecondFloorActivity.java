package com.sankuai.waimai.secondfloor;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.util.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMSecondFloorActivity extends BaseActivity {
    public static ChangeQuickRedirect a;
    private Fragment b;

    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.secondfloor.WMSecondFloorActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40112d8076af3b03748c166aa1b8e99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40112d8076af3b03748c166aa1b8e99");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (this.b != null) {
            this.b.onActivityResult(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be47bf440974ae56a4fc06d20a0b1d34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be47bf440974ae56a4fc06d20a0b1d34");
        } else if (f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (this.b != null) {
                this.b.onRequestPermissionsResult(i, strArr, iArr);
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cc84e399864592032d37a9962bdd25b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cc84e399864592032d37a9962bdd25b");
            return;
        }
        if (this.b instanceof SecondFloorMachProFragment) {
            SecondFloorMachProFragment secondFloorMachProFragment = (SecondFloorMachProFragment) this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = SecondFloorMachProFragment.a;
            if (PatchProxy.isSupport(objArr2, secondFloorMachProFragment, changeQuickRedirect2, false, "f830c3dfd41bf6e595268359e0a43d7a", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, secondFloorMachProFragment, changeQuickRedirect2, false, "f830c3dfd41bf6e595268359e0a43d7a")).booleanValue();
            } else {
                if (secondFloorMachProFragment.b) {
                    Object[] objArr3 = {"onBackPressed", null};
                    ChangeQuickRedirect changeQuickRedirect3 = SecondFloorMachProFragment.a;
                    if (PatchProxy.isSupport(objArr3, secondFloorMachProFragment, changeQuickRedirect3, false, "01e0c350a50b22eda267ed6bd1ba6ce0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, secondFloorMachProFragment, changeQuickRedirect3, false, "01e0c350a50b22eda267ed6bd1ba6ce0");
                    } else {
                        com.sankuai.waimai.machpro.container.a aVar = secondFloorMachProFragment.g;
                        if (aVar != null) {
                            aVar.a("onBackPressed", null);
                        }
                    }
                }
                z = secondFloorMachProFragment.b;
            }
            if (z) {
                return;
            }
        }
        super.onBackPressed();
    }

    private String a(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26603d388c856792a3687c682e203fd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26603d388c856792a3687c682e203fd7");
        }
        try {
            return af.b(uri, str, "");
        } catch (Exception unused) {
            return null;
        }
    }

    private MachMap a(Context context, String str) {
        MachMap a2;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fa4551761672a69d43dfc3b56b8ea40", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fa4551761672a69d43dfc3b56b8ea40");
        }
        MachMap machMap = null;
        try {
            if (TextUtils.isEmpty(str)) {
                a2 = new MachMap();
            } else {
                a2 = b.a(new JSONObject(str));
            }
            machMap = a2;
            return a.a(context, machMap);
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a("WMSecondFloorActivity", e.getMessage());
            return machMap;
        }
    }
}
