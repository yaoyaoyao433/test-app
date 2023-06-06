package com.meituan.android.pay.desk.pack;

import android.app.Activity;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.pay.desk.component.view.c;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public a b;
    boolean c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d449f8a188310b2d98f67fd27a7dd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d449f8a188310b2d98f67fd27a7dd2");
        } else {
            this.c = false;
        }
    }

    public LinearLayout a(Fragment fragment, Object obj) {
        Object[] objArr = {fragment, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a95f8cd56bf7671c9ee8cc589b8a6fc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a95f8cd56bf7671c9ee8cc589b8a6fc4");
        }
        if (fragment == null || fragment.getContext() == null || fragment.getView() == null) {
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) fragment.getView().findViewWithTag(obj);
        if (linearLayout == null) {
            LinearLayout linearLayout2 = new LinearLayout(fragment.getContext());
            linearLayout2.setOrientation(1);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.setTag(obj);
            return linearLayout2;
        }
        return linearLayout;
    }

    public final LinearLayout a(Fragment fragment, DeskData deskData, HashMap<String, String> hashMap) {
        char c;
        char c2;
        char c3;
        Object[] objArr = {fragment, deskData, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cafb510a958f100e81e4dc62ce23ae0", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cafb510a958f100e81e4dc62ce23ae0");
        }
        if (fragment.getView() == null) {
            return null;
        }
        LinearLayout a2 = a(fragment, Integer.valueOf((int) R.id.mpay__desk_payment_core_view));
        Object[] objArr2 = {a2, deskData};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca5db60962ec306c43cf9684043af3fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca5db60962ec306c43cf9684043af3fc");
        } else {
            com.meituan.android.pay.desk.component.view.m.a(new com.meituan.android.pay.desk.component.view.p(a2, deskData));
        }
        a(a2, deskData);
        b(fragment.getActivity(), a2, deskData, hashMap);
        Object[] objArr3 = {fragment, a2, deskData, hashMap};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c50bc443c3d255ce21cab62beec83b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c50bc443c3d255ce21cab62beec83b6c");
        } else if (deskData != null) {
            com.meituan.android.pay.common.payment.data.c desk = deskData.getDesk();
            if (com.meituan.android.pay.desk.component.data.a.f(desk) != null) {
                Object[] objArr4 = {fragment, a2, deskData};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dd3a30f99e8f23d7bbf4adaf8a57b3d8", RobustBitConfig.DEFAULT_VALUE)) {
                    c = 0;
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dd3a30f99e8f23d7bbf4adaf8a57b3d8");
                } else {
                    c = 0;
                    com.meituan.android.pay.desk.component.view.q qVar = new com.meituan.android.pay.desk.component.view.q(fragment, a2, deskData);
                    com.meituan.android.pay.desk.component.view.m.a(qVar);
                    qVar.d = this.b;
                }
            } else {
                c = 0;
            }
            Object[] objArr5 = new Object[2];
            objArr5[c] = a2;
            objArr5[1] = desk;
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3e8aaeb9e19ccd400e78c3d6f0dcef69", RobustBitConfig.DEFAULT_VALUE)) {
                c2 = 0;
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3e8aaeb9e19ccd400e78c3d6f0dcef69");
            } else {
                c2 = 0;
                com.meituan.android.pay.desk.component.view.m.a(new com.meituan.android.pay.desk.component.view.n(a2, desk));
            }
            Object[] objArr6 = new Object[2];
            objArr6[c2] = a2;
            objArr6[1] = desk;
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "740d6914280aca05e671da5de21a553d", RobustBitConfig.DEFAULT_VALUE)) {
                c3 = 0;
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "740d6914280aca05e671da5de21a553d");
            } else {
                c3 = 0;
                com.meituan.android.pay.desk.component.view.m.a(new com.meituan.android.pay.desk.component.view.t(a2, desk));
            }
            FragmentActivity activity = fragment.getActivity();
            Object[] objArr7 = new Object[4];
            objArr7[c3] = activity;
            objArr7[1] = a2;
            objArr7[2] = desk;
            objArr7[3] = hashMap;
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "300cfa980df13186b1e19dc4007e9241", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "300cfa980df13186b1e19dc4007e9241");
            } else {
                com.meituan.android.pay.desk.component.view.b bVar = new com.meituan.android.pay.desk.component.view.b(a2, desk);
                com.meituan.android.pay.desk.component.view.m.a(bVar);
                DeskData deskData2 = new DeskData.a().a(desk).a(com.meituan.android.pay.desk.component.discount.a.a(desk)).b;
                bVar.b = d.a(this, activity, a2, deskData2, hashMap);
                if (bVar.a()) {
                    a(activity, a2, deskData2, hashMap);
                }
            }
        }
        FragmentActivity activity2 = fragment.getActivity();
        Object[] objArr8 = {activity2, a2, deskData};
        ChangeQuickRedirect changeQuickRedirect8 = a;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "962650b218431b1f82cdb05c93fe852f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "962650b218431b1f82cdb05c93fe852f");
        } else {
            com.meituan.android.pay.desk.component.view.m.a(new com.meituan.android.pay.desk.component.view.j(activity2, a2, deskData));
        }
        return a2;
    }

    private void a(LinearLayout linearLayout, DeskData deskData) {
        Object[] objArr = {linearLayout, deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a0f207d889458c3ed2e9455048ddf47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a0f207d889458c3ed2e9455048ddf47");
        } else {
            com.meituan.android.pay.desk.component.view.m.a(new com.meituan.android.pay.desk.component.view.o(linearLayout, deskData));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Activity activity, LinearLayout linearLayout, DeskData deskData, HashMap<String, String> hashMap) {
        Object[] objArr = {activity, linearLayout, deskData, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18f9639318163759fae43e7753e41b8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18f9639318163759fae43e7753e41b8e");
        } else if (deskData == null) {
        } else {
            a(linearLayout, deskData);
            b(activity, linearLayout, deskData, hashMap);
            if (com.meituan.android.paybase.utils.i.a((Collection) com.meituan.android.pay.desk.component.data.a.c(deskData.getDesk()))) {
                return;
            }
            com.meituan.android.pay.desk.component.view.b.a(linearLayout, deskData.getDesk());
        }
    }

    private void b(final Activity activity, LinearLayout linearLayout, DeskData deskData, final HashMap<String, String> hashMap) {
        Object[] objArr = {activity, linearLayout, deskData, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2e5b486b94b810331c944f2482d211f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2e5b486b94b810331c944f2482d211f");
            return;
        }
        com.meituan.android.pay.desk.component.view.c cVar = new com.meituan.android.pay.desk.component.view.c(linearLayout, deskData, hashMap);
        com.meituan.android.pay.desk.component.view.m.a(cVar);
        cVar.e = new c.b() { // from class: com.meituan.android.pay.desk.pack.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.pay.desk.component.view.c.b
            public final void a(LinearLayout linearLayout2, DeskData deskData2, boolean z) {
                Object[] objArr2 = {linearLayout2, deskData2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "114523211881c60929dc5c01a1271461", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "114523211881c60929dc5c01a1271461");
                    return;
                }
                c.this.c = z;
                c.this.a(activity, linearLayout2, deskData2, hashMap);
            }
        };
        cVar.d = new c.a() { // from class: com.meituan.android.pay.desk.pack.c.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.pay.desk.component.view.c.a
            public final void a(LinearLayout linearLayout2, DeskData deskData2) {
                Object[] objArr2 = {linearLayout2, deskData2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bd535d85f066efb724114794b4049cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bd535d85f066efb724114794b4049cf");
                    return;
                }
                c.this.a(activity, linearLayout2, deskData2, hashMap);
                com.meituan.android.paybase.common.analyse.a.a(com.meituan.android.pay.desk.component.analyse.a.a(linearLayout2.getContext(), deskData2.getDesk()), "b_pay_mwcvzjrt_mc", "支付弹窗组件-查看规则明细", new a.c().a("transid", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b) ? com.meituan.android.paybase.common.analyse.b.b : "-999").a("pay_type", !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(activity, "pay_type")) ? com.meituan.android.pay.common.payment.utils.b.b(activity, "pay_type") : "-999").b, a.EnumC0329a.CLICK, -1);
            }
        };
    }
}
