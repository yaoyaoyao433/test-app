package com.sankuai.waimai.store.coupon;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.bridge.Promise;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.coupon.a;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.d;
import com.sankuai.waimai.store.util.m;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements a.InterfaceC1143a {
    public static ChangeQuickRedirect a;
    private final WeakReference<Context> b;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c420c09c60deef8e6c44950f67c24f56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c420c09c60deef8e6c44950f67c24f56");
        } else {
            this.b = new WeakReference<>(context);
        }
    }

    private Context c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1637414819d21602519a7fdf64adde3", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1637414819d21602519a7fdf64adde3") : this.b.get();
    }

    @Override // com.sankuai.waimai.store.coupon.a.InterfaceC1143a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed4fb6eaa5eb21456a00ec912aecc528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed4fb6eaa5eb21456a00ec912aecc528");
            return;
        }
        Context c = c();
        if (c instanceof SCBaseActivity) {
            ((SCBaseActivity) c).u();
        }
    }

    @Override // com.sankuai.waimai.store.coupon.a.InterfaceC1143a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f1cbfdacbc0b09cb9a5ed89a9e03ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f1cbfdacbc0b09cb9a5ed89a9e03ae");
            return;
        }
        Context c = c();
        if (c instanceof SCBaseActivity) {
            ((SCBaseActivity) c).v();
        }
    }

    @Override // com.sankuai.waimai.store.coupon.a.InterfaceC1143a
    public final void a(String str, Dialog dialog) {
        Object[] objArr = {str, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075623cc23ca8d5e4324e8da975c029f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075623cc23ca8d5e4324e8da975c029f");
        } else if (dialog == null || dialog.getWindow() == null || !dialog.isShowing()) {
            Context c = c();
            if (com.sankuai.waimai.store.util.b.a(c) || !(c instanceof SCBaseActivity)) {
                return;
            }
            am.a((Activity) ((SCBaseActivity) c), str);
        } else {
            View decorView = dialog.getWindow().getDecorView();
            if (decorView == null) {
                return;
            }
            am.a(decorView, str);
        }
    }

    @Override // com.sankuai.waimai.store.coupon.a.InterfaceC1143a
    public final void a(final String str, String str2, String str3, String str4, String str5, final String str6, final Promise promise) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, promise};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a32b10ee84a9ff0d3019761cf63b3979", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a32b10ee84a9ff0d3019761cf63b3979");
            return;
        }
        final Context c = c();
        if (com.sankuai.waimai.store.util.b.a(c)) {
            return;
        }
        View inflate = LayoutInflater.from(c).inflate(R.layout.wm_sc_dialog_member_coupon_entry, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.tv_member_coupon_entry_title)).setText(str2);
        ((TextView) inflate.findViewById(R.id.tv_member_coupon_entry_content)).setText(str3);
        b.C0608b a2 = m.a(str4);
        a2.i = R.drawable.wm_sc_member_icon_default;
        a2.j = R.drawable.wm_sc_member_icon_default;
        a2.a((ImageView) inflate.findViewById(R.id.iv_member_coupon_entry_poi_icon));
        ((TextView) inflate.findViewById(R.id.tv_member_coupon_entry_poi_name)).setText(str5);
        final CustomDialog a3 = new CustomDialog.a(c).a();
        inflate.findViewById(R.id.tv_member_coupon_entry_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.coupon.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9e72e8fb6bc66a8bf813afcbcb4a8ac", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9e72e8fb6bc66a8bf813afcbcb4a8ac");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(c, "b_5aqgv4qr").a("poi_id", str).a();
                d.a(a3);
            }
        });
        inflate.findViewById(R.id.tv_member_coupon_entry_to_bind).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.coupon.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0184326f07b3195d7d2b6858daed749", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0184326f07b3195d7d2b6858daed749");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(c, "b_mcqjxh7u").a("poi_id", str).a();
                d.a(a3);
                if (!com.sankuai.waimai.store.util.b.a(c)) {
                    com.sankuai.waimai.store.router.d.a(c, str6);
                }
                if (promise != null) {
                    promise.resolve("");
                }
            }
        });
        a3.setContentView(inflate);
        d.b(a3);
    }
}
