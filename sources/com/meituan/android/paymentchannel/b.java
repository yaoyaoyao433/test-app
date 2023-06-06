package com.meituan.android.paymentchannel;

import android.app.Activity;
import android.content.Intent;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.moduleinterface.payment.PayActionListener;
import com.meituan.android.paybase.moduleinterface.payment.PayFailInfo;
import com.meituan.android.paybase.moduleinterface.payment.Payer;
import com.meituan.android.paybase.utils.am;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private final am<Activity, PayActionListener> c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14f2db7d5f56a9339a902f32656e0b24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14f2db7d5f56a9339a902f32656e0b24");
        } else {
            this.c = new am<>();
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85e57eb6c3f7b6be0f907ffe32474dc6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85e57eb6c3f7b6be0f907ffe32474dc6");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final void a(Activity activity, String str, String str2, String str3, PayActionListener payActionListener) {
        Object[] objArr = {activity, str, str2, str3, payActionListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e943dd726b0d8da51a24e1b9dd1e75eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e943dd726b0d8da51a24e1b9dd1e75eb");
            return;
        }
        this.c.a(activity, payActionListener);
        a(activity, str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Payer a2 = a.a(str);
        if (a2 != null) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_ne8xl6lk_mv", new a.c().a("type", str).b);
            a2.a(activity, str2, str3);
            return;
        }
        e.a(activity, (Object) activity.getString(R.string.paymentchannel__pay_type_unusable));
    }

    public final PayActionListener a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5708f2743cfdf328a3d255d7ff53b25", RobustBitConfig.DEFAULT_VALUE) ? (PayActionListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5708f2743cfdf328a3d255d7ff53b25") : this.c.b(activity);
    }

    public final void a(Activity activity, PayActionListener payActionListener) {
        Object[] objArr = {activity, payActionListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6b908a193a79826aae6de43093af06a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6b908a193a79826aae6de43093af06a");
        } else {
            this.c.a(activity, payActionListener);
        }
    }

    public final void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "177a01337779f1a8cd7c9b299b338314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "177a01337779f1a8cd7c9b299b338314");
        } else {
            this.c.a(activity);
        }
    }

    public final boolean a(Activity activity, int i, int i2, Intent intent) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "442a9bf714b3ad63cb61f5c3bffbc186", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "442a9bf714b3ad63cb61f5c3bffbc186")).booleanValue();
        }
        if (i == 10) {
            a(activity, i2, intent);
        } else if (i == 1313) {
            b(activity, i2, intent);
        } else if (i != 2323) {
            return false;
        } else {
            a(activity, i2);
        }
        return true;
    }

    private void a(Activity activity, int i, Intent intent) {
        Object[] objArr = {activity, Integer.valueOf(i), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b406cfd76282b70f719ce6d8919fc25e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b406cfd76282b70f719ce6d8919fc25e");
            return;
        }
        com.meituan.android.paymentchannel.utils.b.a(i, intent);
        if (i != -1) {
            a(activity, "upmppay", -1, (PayFailInfo) null);
        } else if (intent == null) {
        } else {
            String a2 = f.a(intent, "pay_result");
            if ("success".equalsIgnoreCase(a2)) {
                a(activity, "upmppay", 1, (PayFailInfo) null);
            } else if ("fail".equalsIgnoreCase(a2)) {
                PayFailInfo payFailInfo = new PayFailInfo();
                payFailInfo.setMsg("支付错误");
                a(activity, "upmppay", 0, payFailInfo);
            } else if ("cancel".equalsIgnoreCase(a2)) {
                a(activity, "upmppay", -1, (PayFailInfo) null);
            }
        }
    }

    private void b(Activity activity, int i, Intent intent) {
        Object[] objArr = {activity, Integer.valueOf(i), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdc86dffa812b6debcac8c340e69ac7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdc86dffa812b6debcac8c340e69ac7e");
        } else if (i != -1 || intent == null) {
            if (i == 0) {
                a(activity, "quickbank", -1, (PayFailInfo) null);
            }
        } else {
            int a2 = f.a(intent, "pay_result", -1);
            if (a2 == 1) {
                a(activity, "quickbank", 1, a(intent));
            } else if (a2 == 3) {
                a(activity, "quickbank", 0, a(intent));
            } else if (a2 == 4) {
                a(activity, "quickbank", 10, a(intent));
            } else if (a2 == 5) {
                a(activity, "quickbank", 11, a(intent));
            } else if (a2 == 6) {
                a(activity, "quickbank", 12, a(intent));
            }
        }
    }

    private void a(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bb202bae931ae2ed5dce925158ea6ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bb202bae931ae2ed5dce925158ea6ed");
        } else if (i == -1) {
            a(activity, "alipaywap", 1, (PayFailInfo) null);
        } else {
            a(activity, "alipaywap", -1, (PayFailInfo) null);
        }
    }

    public static void a(BaseResp baseResp) {
        Object obj;
        Object[] objArr = {baseResp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c72cfa5195bf11d6b5a96d503f4d0946", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c72cfa5195bf11d6b5a96d503f4d0946");
            return;
        }
        b a2 = a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "397e79ce37799e7f26c42dc13d9890be", RobustBitConfig.DEFAULT_VALUE)) {
            obj = PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "397e79ce37799e7f26c42dc13d9890be");
        } else {
            am<Activity, PayActionListener> amVar = a2.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = am.a;
            if (PatchProxy.isSupport(objArr3, amVar, changeQuickRedirect3, false, "759ce1f43b5aa8bdcc17f27649404555", RobustBitConfig.DEFAULT_VALUE)) {
                obj = PatchProxy.accessDispatch(objArr3, amVar, changeQuickRedirect3, false, "759ce1f43b5aa8bdcc17f27649404555");
            } else {
                amVar.a();
                Iterator<WeakReference<Activity>> it = amVar.b.keySet().iterator();
                WeakReference<Activity> weakReference = null;
                while (it.hasNext()) {
                    weakReference = it.next();
                }
                obj = weakReference == null ? null : weakReference.get();
            }
        }
        Activity activity = (Activity) obj;
        if (baseResp != null) {
            if (baseResp.errCode == 0) {
                com.meituan.android.paybase.common.analyse.a.a("b_69uDV", new a.b().a().b);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_weixin", 200);
                a().a(activity, "wxpay", 1, (PayFailInfo) null);
            } else if (baseResp.errCode == -2) {
                com.meituan.android.paybase.common.analyse.a.a("b_Pg4Ct", new a.b().a().a("code", String.valueOf(baseResp.errCode)).a("message", baseResp.errStr).b);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_weixin", -9854);
                a().a(activity, "wxpay", -1, (PayFailInfo) null);
            } else {
                com.meituan.android.paybase.common.analyse.a.a("b_cS8F1", new a.b().a().a("code", String.valueOf(baseResp.errCode)).a("message", baseResp.errStr).b);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_weixin", baseResp.errCode);
                PayFailInfo payFailInfo = new PayFailInfo();
                payFailInfo.setMsg("支付失败");
                payFailInfo.setErrorCode(baseResp.errCode);
                a().a(activity, "wxpay", 0, payFailInfo);
            }
        }
    }

    private boolean c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ecf2b4f11374e5d4cc4a786ae240444", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ecf2b4f11374e5d4cc4a786ae240444")).booleanValue();
        }
        PayActionListener b2 = this.c.b(activity);
        boolean z = b2 != null;
        return b2 instanceof Activity ? z && !((Activity) b2).isFinishing() : z;
    }

    public final void a(Activity activity, String str, int i, PayFailInfo payFailInfo) {
        PayActionListener b2;
        Object[] objArr = {activity, str, Integer.valueOf(i), payFailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a71c5f0ff0862f1c7825f7ec56007a57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a71c5f0ff0862f1c7825f7ec56007a57");
        } else if (!c(activity) || (b2 = this.c.b(activity)) == null) {
        } else {
            b2.a(str, i, payFailInfo);
        }
    }

    public final void a(Activity activity, String str) {
        PayActionListener b2;
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0525ee857d7001b4b22b91f30f7cb36b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0525ee857d7001b4b22b91f30f7cb36b");
        } else if (!c(activity) || (b2 = this.c.b(activity)) == null) {
        } else {
            b2.b(str);
        }
    }

    private PayFailInfo a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2922b1d6bcf2da35a39f7f4dc4ef6679", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayFailInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2922b1d6bcf2da35a39f7f4dc4ef6679");
        }
        if (intent == null) {
            return null;
        }
        String a2 = f.a(intent, "pay_msg");
        int a3 = f.a(intent, "pay_error_code", -1);
        String a4 = f.a(intent, "pay_failed_extra");
        PayFailInfo payFailInfo = new PayFailInfo();
        payFailInfo.setErrorCode(a3);
        payFailInfo.setExtra(a4);
        payFailInfo.setMsg(a2);
        return payFailInfo;
    }
}
