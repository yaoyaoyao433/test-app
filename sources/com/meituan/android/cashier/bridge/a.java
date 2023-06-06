package com.meituan.android.cashier.bridge;

import android.app.Activity;
import android.content.Intent;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.moduleinterface.payment.PayActionListener;
import com.meituan.android.paybase.moduleinterface.payment.PayFailInfo;
import com.meituan.android.paybase.moduleinterface.payment.Payer;
import com.meituan.android.paymentchannel.b;
import com.meituan.android.paymentchannel.webpay.MTCPayWebActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final List<String> b;

    static {
        ArrayList arrayList = new ArrayList();
        b = arrayList;
        arrayList.add("wxpay");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.cashier.bridge.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0186a {
        private static final a a = new a();
    }

    private static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "742525dc785fe222471864aa3fb6d37d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "742525dc785fe222471864aa3fb6d37d") : C0186a.a;
    }

    public a() {
    }

    public static void a(Activity activity, String str, String str2, String str3, PayActionListener payActionListener) {
        Object[] objArr = {activity, str, str2, str3, payActionListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4df4b014215444b580a115d1f7b49a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4df4b014215444b580a115d1f7b49a3");
            return;
        }
        b.a().a(activity, payActionListener);
        b.a().a(activity, str);
        if (!TextUtils.isEmpty(str)) {
            Payer a2 = com.meituan.android.paymentchannel.a.a(str);
            if (a2 == null) {
                e.a(activity, (Object) activity.getString(R.string.paymentchannel__pay_type_unusable));
                PayFailInfo payFailInfo = new PayFailInfo();
                payFailInfo.setMsg("不存在的payType");
                payActionListener.a(str, 12, payFailInfo);
                return;
            } else if ("biztpay".equals(str)) {
                Intent intent = new Intent(activity, MTCPayWebActivity.class);
                intent.putExtra("url", str2);
                activity.startActivityForResult(intent, TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_X5);
                return;
            } else {
                a2.a(activity, str2, str3);
                return;
            }
        }
        PayFailInfo payFailInfo2 = new PayFailInfo();
        payFailInfo2.setMsg("payType is null");
        payActionListener.a(str, 12, payFailInfo2);
    }

    public static boolean a(Activity activity, int i, int i2, Intent intent) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c82ca4a4597db42c8c73c3a80a842537", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c82ca4a4597db42c8c73c3a80a842537")).booleanValue();
        }
        if (i != 10) {
            if (i == 407) {
                a a2 = a();
                Object[] objArr2 = {activity, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9dafd89ac859baa39878b1bd923277cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9dafd89ac859baa39878b1bd923277cc");
                    return true;
                }
                PayActionListener a3 = b.a().a(activity);
                if (a3 != null) {
                    if (i2 == -1) {
                        a3.a("biztpay", 1, null);
                        return true;
                    }
                    a3.a("biztpay", 0, null);
                    return true;
                }
                return true;
            }
            return false;
        }
        a a4 = a();
        Object[] objArr3 = {activity, Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect3, false, "2f7ed093f889fce619e270cfe9885bc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect3, false, "2f7ed093f889fce619e270cfe9885bc2");
            return true;
        }
        com.meituan.android.paymentchannel.utils.b.a(i2, intent);
        PayActionListener a5 = b.a().a(activity);
        if (a5 != null) {
            if (intent == null) {
                a5.a("upmppay", 12, null);
                return true;
            }
            String a6 = f.a(intent, "pay_result");
            if (i2 == -1) {
                if ("success".equalsIgnoreCase(a6)) {
                    a5.a("upmppay", 1, null);
                    return true;
                } else if ("fail".equalsIgnoreCase(a6)) {
                    PayFailInfo payFailInfo = new PayFailInfo();
                    payFailInfo.setMsg("支付错误");
                    a5.a("upmppay", 0, payFailInfo);
                    return true;
                } else if (!"cancel".equalsIgnoreCase(a6)) {
                    return true;
                }
            }
            a5.a("upmppay", -1, null);
            return true;
        }
        return true;
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d55949acd7ffc474eb5cb9739c6fc85", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d55949acd7ffc474eb5cb9739c6fc85")).booleanValue() : (TextUtils.isEmpty(str) || b.contains(str)) ? false : true;
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "963933f4b60a4ea409ab889aa09be60b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "963933f4b60a4ea409ab889aa09be60b");
        } else {
            b.a().b(activity);
        }
    }
}
