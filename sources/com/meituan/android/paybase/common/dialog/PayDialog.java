package com.meituan.android.paybase.common.dialog;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PayDialog extends BasePayDialog {
    public static ChangeQuickRedirect b;
    private HashMap<String, Object> a;
    public HashMap<String, Object> c;
    @MTPaySuppressFBWarnings({"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
    protected String d;
    public String e;

    public PayDialog(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52d416d895c62a3642df2df468628b70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52d416d895c62a3642df2df468628b70");
            return;
        }
        this.d = com.meituan.android.paybase.common.analyse.a.a(this);
        String str = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        com.meituan.android.paybase.common.analyse.a.b(str, PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2187810aaa89e076e1d1c449c0d2bcf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2187810aaa89e076e1d1c449c0d2bcf") : getClass().getSimpleName());
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog
    public final void a(Activity activity, String str, String str2, String str3, String str4, String str5, boolean z, BasePayDialog.c cVar, BasePayDialog.c cVar2, BasePayDialog.c cVar3, int i, int i2, boolean z2, boolean z3, BasePayDialog.a aVar, Map<String, BasePayDialog.e> map) {
        Object[] objArr = {activity, str, str2, str3, str4, str5, Byte.valueOf(z ? (byte) 1 : (byte) 0), cVar, cVar2, cVar3, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), aVar, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac0025e221d6335a4623f11b2975a095", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac0025e221d6335a4623f11b2975a095");
            return;
        }
        this.a = new HashMap<>();
        this.a.put("title", str);
        this.a.put("message", str2);
        this.a.put("sub_message", str3);
        this.a.put("left_button", str4);
        this.a.put("right_button", str5);
        this.a.put("POPTYPE", "normal");
        if (!i.a(this.c)) {
            this.a.putAll(this.c);
        }
        super.a(activity, str, str2, str3, str4, str5, z, cVar, cVar2, cVar3, i, i2, z2, z3, aVar, map);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e64b61e5410f1f2f4efceceeca31896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e64b61e5410f1f2f4efceceeca31896");
            return;
        }
        super.onAttachedToWindow();
        if (this.a != null) {
            com.meituan.android.paybase.common.analyse.a.a("b_9kc5bj0f", new a.c().a("title", this.a.get("title")).a("message", this.a.get("message")).b);
        }
        com.meituan.android.paybase.common.analyse.a.c("b_StKtu", "POP", this.a);
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a(this.d, this.e, this.a);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81483393562a499c50f271098b0d7677", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81483393562a499c50f271098b0d7677");
            return;
        }
        if (!TextUtils.isEmpty(this.e)) {
            com.meituan.android.paybase.common.analyse.a.b(this.d, this.e, this.a);
        }
        com.meituan.android.paybase.common.analyse.a.c("b_Vg30F", "CLOSE", this.a);
        super.onDetachedFromWindow();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends BasePayDialog.b {
        public static ChangeQuickRedirect c;
        private String a;
        private HashMap<String, Object> b;

        public a(Activity activity) {
            super(activity);
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f555031a995b2f935145339ff14212a8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f555031a995b2f935145339ff14212a8");
            }
        }

        public a a(String str) {
            this.a = str;
            return this;
        }

        public a a(HashMap<String, Object> hashMap) {
            this.b = hashMap;
            return this;
        }

        @Override // com.meituan.android.paybase.dialog.BasePayDialog.b
        public BasePayDialog a(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d75b9148968b93d2ee411c481ad17271", RobustBitConfig.DEFAULT_VALUE)) {
                return (BasePayDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d75b9148968b93d2ee411c481ad17271");
            }
            PayDialog payDialog = new PayDialog(activity);
            payDialog.e = this.a;
            payDialog.c = this.b;
            return payDialog;
        }
    }
}
