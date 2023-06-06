package com.sankuai.waimai.store.order.detail.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogCallback;
import com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogController;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.b;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.mach.dialog.e;
import com.sankuai.waimai.store.router.d;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements IDynamicDialogController {
    public static ChangeQuickRedirect a;
    private boolean b;
    private DynamicDialog c;
    private Activity d;
    private AlertInfo e;
    private Map<String, Object> f;
    private IDynamicDialogCallback g;

    public a(Activity activity, AlertInfo alertInfo, @NonNull Map<String, Object> map, boolean z, IDynamicDialogCallback iDynamicDialogCallback) {
        Object[] objArr = {activity, alertInfo, map, Byte.valueOf(z ? (byte) 1 : (byte) 0), iDynamicDialogCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f311c78e08d559a7cd96132d65559db7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f311c78e08d559a7cd96132d65559db7");
            return;
        }
        this.d = activity;
        this.e = alertInfo;
        this.f = map;
        this.b = z;
        this.g = iDynamicDialogCallback;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogController
    public final void showDialog() {
        AlertInfo.Module module;
        Map<String, Object> map;
        boolean z;
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "585207deb16308e2a7b8914f21cadfae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "585207deb16308e2a7b8914f21cadfae");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "258bf8e1ede9b8bec55cfe13b796c6e7", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "258bf8e1ede9b8bec55cfe13b796c6e7")).booleanValue();
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d00d007381e27606806427ce1e15a7ad", RobustBitConfig.DEFAULT_VALUE)) {
                map = (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d00d007381e27606806427ce1e15a7ad");
            } else {
                map = (this.e == null || (module = (AlertInfo.Module) b.a(this.e.modules, 0)) == null) ? null : module.extraData;
            }
            if (map != null && (obj = map.get("isPopup")) != null && NumberUtils.parseFloat(obj.toString(), -1.0f) == 1.0f && this.f != null) {
                Object obj2 = this.f.get("isFirstShow");
                if ((obj2 instanceof Boolean) && ((Boolean) obj2).booleanValue()) {
                    z = true;
                }
            }
            z = this.b;
        }
        if (z) {
            DynamicDialog.a aVar = new DynamicDialog.a(this.d);
            aVar.c = new DynamicDialog.f() { // from class: com.sankuai.waimai.store.order.detail.dynamic.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.f
                public final void a(String str, Map<String, Object> map2) {
                    Object[] objArr4 = {str, map2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9b61811e0eaaecbfeebda8bf629fd9e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9b61811e0eaaecbfeebda8bf629fd9e5");
                    } else if (str.equals("jump_with_close")) {
                        d.a(a.this.d, map2.get("url").toString());
                        if (a.this.c.isShowing()) {
                            a.this.c.dismiss();
                        }
                    }
                }
            };
            DynamicDialog.a a2 = aVar.a("c_hgowsqb").a(this.f);
            a2.n = new DynamicDialog.h() { // from class: com.sankuai.waimai.store.order.detail.dynamic.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.h
                public final e a(Activity activity, AlertInfo.Module module2) {
                    Object[] objArr4 = {activity, module2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fe5b11e64e3fa6a17918c6f491235fff", RobustBitConfig.DEFAULT_VALUE)) {
                        return (e) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fe5b11e64e3fa6a17918c6f491235fff");
                    }
                    e eVar = new e(activity, activity instanceof BaseActivity ? ((BaseActivity) activity).w() : "");
                    eVar.a(new Rect(0, 0, h.a((Context) activity), h.b(activity)));
                    return eVar;
                }
            };
            a2.b = 2131559186;
            a2.i = this.e;
            this.c = a2.a();
            this.c.show();
            if (this.g != null) {
                this.g.successWithParam(null, null);
            }
            this.c.getDialog().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.store.order.detail.dynamic.a.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr4 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5e2c0ccf50f47cde71397e0ce1d3f5b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5e2c0ccf50f47cde71397e0ce1d3f5b2");
                    } else if (a.this.g != null) {
                        a.this.g.onDismiss(null);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogController
    public final DynamicDialog getDialog() {
        return this.c;
    }
}
