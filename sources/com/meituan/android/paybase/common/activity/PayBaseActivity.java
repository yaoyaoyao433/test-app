package com.meituan.android.paybase.common.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.common.utils.c;
import com.meituan.android.paybase.common.utils.d;
import com.meituan.android.paybase.config.b;
import com.meituan.android.paybase.dialog.progressdialog.MTProgressDialog;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
@SuppressLint({"Registered"})
/* loaded from: classes2.dex */
public class PayBaseActivity extends BaseActivity {
    public static ChangeQuickRedirect l;
    @MTPaySuppressFBWarnings({"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
    public static volatile int n;
    protected MTProgressDialog m;
    protected String o;
    public String p;

    public boolean c() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public String l() {
        return "";
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0218b5e2f071a059598865adbb8fb988", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0218b5e2f071a059598865adbb8fb988");
            return;
        }
        if (bundle != null) {
            this.p = bundle.getString("uniqueKey");
        }
        com.meituan.android.paybase.config.a.c().a();
        b();
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().setBackgroundDrawableResource(R.color.paybase__background_color);
        this.o = com.meituan.android.paybase.common.analyse.a.a(this);
        com.meituan.android.paybase.common.analyse.a.b(this.o, e());
        if (com.meituan.android.paybase.downgrading.a.a().b) {
            return;
        }
        com.meituan.android.paybase.downgrading.a.a().a(this);
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "230435622df97075fd1bc1c2a6df968e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "230435622df97075fd1bc1c2a6df968e");
            return;
        }
        int a2 = d.a(b.a.THEME);
        if (a2 < 0) {
            a2 = R.style.paybase__PaymentTheme;
        }
        setTheme(a2);
        try {
            if (getTheme() != null) {
                getTheme().applyStyle(R.style.paybase__textColor, false);
            }
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e);
        }
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5f5f08110622ac67125a3bd57cf79ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5f5f08110622ac67125a3bd57cf79ed");
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putString("uniqueKey", this.p);
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28f03b3367c97876b4cb22185f147e30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28f03b3367c97876b4cb22185f147e30");
            return;
        }
        super.onStart();
        String str = this.o;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.paybase.common.analyse.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9b20845ffd35891d3eff4dbb27025f00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9b20845ffd35891d3eff4dbb27025f00");
        } else {
            Statistics.disableAutoPVPD(str);
        }
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53659a1c0eee0101507e1fa86b462ba6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53659a1c0eee0101507e1fa86b462ba6");
            return;
        }
        super.onResume();
        if (c()) {
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a(this.o, e(), f());
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc4b212e54b63e1d728f59a2abe2253f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc4b212e54b63e1d728f59a2abe2253f");
            return;
        }
        super.onPause();
        if (c()) {
            return;
        }
        com.meituan.android.paybase.common.analyse.a.b(this.o, e(), f());
    }

    public final void a(boolean z, String str) {
        TextView textView;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60fa4d30711d8301a79d2ee02520caf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60fa4d30711d8301a79d2ee02520caf3");
            return;
        }
        b(z, str);
        if (isFinishing() || this.k || this.m == null || (textView = (TextView) this.m.findViewById(R.id.progress_text)) == null || TextUtils.isEmpty(str)) {
            return;
        }
        textView.setText(str);
    }

    public final void a(boolean z, String str, int i) {
        TextView textView;
        Object[] objArr = {(byte) 1, str, 12};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbe32a2993b206811b6fe07540f8803d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbe32a2993b206811b6fe07540f8803d");
            return;
        }
        b(true, str);
        if (isFinishing() || this.k || this.m == null || (textView = (TextView) this.m.findViewById(R.id.progress_text)) == null) {
            return;
        }
        textView.setTextSize(12.0f);
    }

    public void showProgress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aff706bb476560840370518f9603d214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aff706bb476560840370518f9603d214");
        } else {
            a(true, a.DEFAULT, (String) null);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cbf356881b2f19b78f7fbb07f4ee2cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cbf356881b2f19b78f7fbb07f4ee2cf");
        } else if (z) {
            a(true, a.HELLO_PAY, (String) null);
        } else {
            a(true, a.COMMON_PAY, (String) null);
        }
    }

    public final void b(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c90dc10398b7ea41960cceb9556a4efd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c90dc10398b7ea41960cceb9556a4efd");
        } else if (z) {
            a(true, a.HELLO_PAY, str);
        } else {
            a(true, a.COMMON_PAY, str);
        }
    }

    public final void a(boolean z, a aVar, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc31227b0fbd6b3bd5b655ef2eb217c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc31227b0fbd6b3bd5b655ef2eb217c2");
        } else if (isFinishing() || this.k) {
        } else {
            if (this.m == null || !this.m.isShowing()) {
                this.m = a(aVar, str);
                this.m.setCanceledOnTouchOutside(false);
                this.m.setCancelable(z);
                this.m.show();
            }
        }
    }

    public void hideProgress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a263396ef9ef8135508cdc78e86f3048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a263396ef9ef8135508cdc78e86f3048");
        } else if (isFinishing() || this.k || this.m == null || !this.m.isShowing()) {
        } else {
            this.m.dismiss();
            this.m = null;
        }
    }

    private MTProgressDialog a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b9ee1b98dfb3d718aa5938e56219499", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTProgressDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b9ee1b98dfb3d718aa5938e56219499");
        }
        switch (aVar) {
            case HELLO_PAY:
                if (TextUtils.isEmpty(str)) {
                    str = getString(R.string.paybase__progress_dialog_text_1);
                }
                return new MTProgressDialog(this, R.drawable.paybase__mtwallet_logo, str);
            case COMMON_PAY:
                if (TextUtils.isEmpty(str)) {
                    str = getString(R.string.paybase__progress_dialog_text_2);
                }
                return new MTProgressDialog(this, R.drawable.paybase__progress_dialog_logo, str);
            case CASHIER:
                if (TextUtils.isEmpty(str)) {
                    str = getString(R.string.paybase__progress_dialog_text_3);
                }
                return new MTProgressDialog(this, R.drawable.paybase__progress_dialog_logo, str);
            default:
                return new MTProgressDialog(this);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bec5eedc6902ea3622df833101612c89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bec5eedc6902ea3622df833101612c89");
            return;
        }
        hideProgress();
        super.finish();
        d();
    }

    public final boolean a(BaseActivity baseActivity) {
        Object[] objArr = {baseActivity};
        ChangeQuickRedirect changeQuickRedirect = l;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20d49bc81d21b78e4a56d727fb2f3040", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20d49bc81d21b78e4a56d727fb2f3040")).booleanValue() : b(baseActivity) && h();
    }

    private boolean b(BaseActivity baseActivity) {
        Object[] objArr = {baseActivity};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82915dc4c7e8bfcc3341fd1d0d4d50c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82915dc4c7e8bfcc3341fd1d0d4d50c7")).booleanValue();
        }
        Fragment findFragmentById = baseActivity.getSupportFragmentManager().findFragmentById(R.id.content);
        if (findFragmentById != null) {
            if (findFragmentById instanceof c) {
                return ((c) findFragmentById).b();
            }
            return b(findFragmentById.getView());
        }
        return true;
    }

    private boolean b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = l;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2972a7c33a6c9fdcc4ac43ebd7f84c6f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2972a7c33a6c9fdcc4ac43ebd7f84c6f")).booleanValue() : view == null || view.getVisibility() == 4;
    }

    public final MTProgressDialog n() {
        return this.m;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7cfd12b0ca053e6bc9d69f77af5d598", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7cfd12b0ca053e6bc9d69f77af5d598");
        } else {
            super.startActivityForResult(intent, i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        HELLO_PAY,
        COMMON_PAY,
        DEFAULT,
        CASHIER;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c317d337369aa6999a10a951d219a32", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c317d337369aa6999a10a951d219a32");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aeb302dd9ca22687a67a7a2e612cdd84", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aeb302dd9ca22687a67a7a2e612cdd84") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01615e71134d3707660b97a2a12c65f6", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01615e71134d3707660b97a2a12c65f6") : (a[]) values().clone();
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fed1344ab1ab64325746b69798ef4cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fed1344ab1ab64325746b69798ef4cf");
        } else {
            overridePendingTransition(0, 0);
        }
    }

    public String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d02506fa5b14e17ea5dac6953bc79bab", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d02506fa5b14e17ea5dac6953bc79bab") : getClass().getSimpleName();
    }

    public HashMap<String, Object> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbf528bee993cac0578ff80dbaef63da", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbf528bee993cac0578ff80dbaef63da");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        com.meituan.android.paybase.common.analyse.b.a(hashMap);
        return hashMap;
    }

    public static void o() {
        n = 0;
    }

    public final String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad17144d10057458cd91f2a75ea6376a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad17144d10057458cd91f2a75ea6376a");
        }
        if (TextUtils.isEmpty(this.p)) {
            com.meituan.android.paybase.common.analyse.cat.a.a("uniqueId_is_empty", null, null, "");
        }
        return this.p;
    }

    public static void q() {
        n++;
    }
}
