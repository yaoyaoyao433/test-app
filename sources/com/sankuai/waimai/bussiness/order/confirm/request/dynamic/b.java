package com.sankuai.waimai.bussiness.order.confirm.request.dynamic;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    DynamicDialog.a b;
    private Activity c;
    private AlertInfo d;
    private DynamicDialog e;
    private a f;

    private b(Activity activity) {
        AlertInfo alertInfo;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27b26b0dc438c5665f65cd9ad88a68b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27b26b0dc438c5665f65cd9ad88a68b9");
            return;
        }
        this.c = activity;
        this.b = new DynamicDialog.a(activity);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf8d4dcf708100517b8e12ec73f641b0", RobustBitConfig.DEFAULT_VALUE)) {
            alertInfo = (AlertInfo) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf8d4dcf708100517b8e12ec73f641b0");
        } else {
            this.d = new AlertInfo();
            this.d.alertName = "wm_order";
            this.d.alertType = 0;
            this.d.modules = new ArrayList();
            this.d.modules.add(new AlertInfo.Module() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.1
                {
                    this.moduleId = "waimai_order";
                    this.dataType = 0;
                }
            });
            alertInfo = this.d;
        }
        this.d = alertInfo;
    }

    public static b a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9219725db7998f92de6638f5d894275", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9219725db7998f92de6638f5d894275") : new b(activity);
    }

    public final b a(String str) {
        AlertInfo.Module module;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1fb1dc467cd088f2f05d673d40b58f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1fb1dc467cd088f2f05d673d40b58f9");
        }
        if (this.d != null && (module = this.d.modules.get(0)) != null) {
            module.defaultTemplateId = str;
            module.templateId = str;
        }
        return this;
    }

    public final b a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d90bbbb3fcee7a0b1f3df82476c97cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d90bbbb3fcee7a0b1f3df82476c97cf");
        }
        if (this.b != null) {
            this.f = aVar;
            this.b.c = aVar;
        }
        return this;
    }

    public final b a(DialogInterface.OnDismissListener onDismissListener) {
        Object[] objArr = {onDismissListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4546eeb412e3a75269b6e0fa7577eaaf", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4546eeb412e3a75269b6e0fa7577eaaf");
        }
        if (this.b != null) {
            this.b.g = onDismissListener;
        }
        return this;
    }

    public final b a(JsonObject jsonObject) {
        AlertInfo.Module module;
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f43144544c446b5d8900e18d490cfca", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f43144544c446b5d8900e18d490cfca");
        }
        if (this.d != null && (module = this.d.modules.get(0)) != null) {
            module.jsonData = jsonObject;
        }
        return this;
    }

    public final b b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "221bacf1e7717eae492c5fe94e766407", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "221bacf1e7717eae492c5fe94e766407");
        }
        if (this.b != null) {
            this.b.a(str);
        }
        return this;
    }

    public final DynamicDialog a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da4553dfe5274793672b4c6e8b14947", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da4553dfe5274793672b4c6e8b14947");
        }
        if (this.c == null || this.c.isFinishing()) {
            return null;
        }
        if (this.b != null && this.d != null) {
            DynamicDialog.a aVar = this.b;
            aVar.i = this.d;
            aVar.f = 17;
            this.e = aVar.a();
            this.f.i = this.e;
            this.e.show();
        }
        return this.e;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2cf90f5fbd1f54fd398242d45b92ad5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2cf90f5fbd1f54fd398242d45b92ad5");
        } else if (this.e != null) {
            this.e.dismiss();
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b15e8f20daedc49cf4979f48b792e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b15e8f20daedc49cf4979f48b792e2")).booleanValue();
        }
        if (this.e != null) {
            return this.e.isShowing();
        }
        return false;
    }
}
