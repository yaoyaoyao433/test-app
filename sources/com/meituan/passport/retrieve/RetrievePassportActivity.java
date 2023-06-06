package com.meituan.passport.retrieve;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.passport.BaseActivity;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.b;
import com.meituan.passport.view.PassportToolbar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.navigation.a;
import com.sankuai.meituan.navigation.common.c;
import com.sankuai.meituan.navigation.d;
import com.sankuai.waimai.platform.utils.f;
import com.unionpay.tsmservice.data.Constant;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RetrievePassportActivity extends BaseActivity {
    public static ChangeQuickRedirect a;
    private String c;
    private String d;
    private PassportToolbar e;
    private a.InterfaceC0622a f;

    public RetrievePassportActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "967f6b4f7c724b054196e9fa3927735b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "967f6b4f7c724b054196e9fa3927735b");
        } else {
            this.f = new AnonymousClass1();
        }
    }

    public static void a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59dd0a83e48990049946ea66662209af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59dd0a83e48990049946ea66662209af");
            return;
        }
        Intent intent = new Intent(context, RetrievePassportActivity.class);
        intent.putExtra("phoneNumber", str);
        intent.putExtra(Constant.KEY_COUNTRY_CODE, str2);
        context.startActivity(intent);
    }

    @Override // com.meituan.passport.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49ee700f4ab50434ffe28f8b910e225a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49ee700f4ab50434ffe28f8b910e225a");
            return;
        }
        super.onCreate(bundle);
        setTheme(R.style.LoginTheme);
    }

    @Override // com.meituan.passport.BaseActivity
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1f310dae68ea3e76f1cecf157c30c11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1f310dae68ea3e76f1cecf157c30c11");
            return;
        }
        if (getIntent() != null) {
            this.c = f.a(getIntent(), "phoneNumber");
            this.d = f.a(getIntent(), Constant.KEY_COUNTRY_CODE);
        }
        Uri uri = null;
        if (getIntent() != null && getIntent().getData() != null) {
            uri = getIntent().getData();
        }
        if (uri != null) {
            if (!TextUtils.isEmpty(uri.getQueryParameter("phoneNumber"))) {
                this.c = uri.getQueryParameter("phoneNumber");
            }
            if (TextUtils.isEmpty(uri.getQueryParameter(Constant.KEY_COUNTRY_CODE))) {
                return;
            }
            this.d = uri.getQueryParameter(Constant.KEY_COUNTRY_CODE);
        }
    }

    @Override // com.meituan.passport.BaseActivity
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fed150d7f244579076851c088b7b9cab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fed150d7f244579076851c088b7b9cab");
            return;
        }
        setContentView(R.layout.passport_activity_retrieve);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7416f379b1e2ab80fe1967d9c3777f14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7416f379b1e2ab80fe1967d9c3777f14");
        } else {
            this.e = (PassportToolbar) findViewById(R.id.toolbar);
            setSupportActionBar(this.e);
            getSupportActionBar().b(false);
        }
        d.a(findViewById(R.id.fragment_container)).a(this.f);
        if (bundle == null) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bde86ced9ac9d941998725c596cc0e27", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bde86ced9ac9d941998725c596cc0e27");
                return;
            }
            b.a aVar = new b.a();
            aVar.b = this.c;
            aVar.c = this.d;
            d.a(findViewById(R.id.fragment_container)).a(a.InputAccount.e, aVar.a());
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.retrieve.RetrievePassportActivity$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements a.InterfaceC0622a {
        public static ChangeQuickRedirect a;

        public AnonymousClass1() {
        }

        @Override // com.sankuai.meituan.navigation.a.InterfaceC0622a
        public final void a(@NonNull com.sankuai.meituan.navigation.a aVar, @NonNull c cVar) {
            Object[] objArr = {aVar, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "743f7a84375bfd7ad2c3b7df714ba6c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "743f7a84375bfd7ad2c3b7df714ba6c1");
                return;
            }
            switch (AnonymousClass2.a[a.a(cVar.a().toString()).ordinal()]) {
                case 1:
                case 2:
                    RetrievePassportActivity.this.e.setTitle(R.string.passport_retrieve_login_password);
                    break;
                case 3:
                    RetrievePassportActivity.this.e.setTitle(R.string.passport_retrieve_checksecurity_toreset);
                    break;
            }
            RetrievePassportActivity.this.e.a(R.drawable.passport_actionbar_back, b.a(this));
            RetrievePassportActivity.this.e.setBackImageColor(Utils.a(RetrievePassportActivity.this));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.retrieve.RetrievePassportActivity$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a = new int[a.valuesCustom().length];

        static {
            try {
                a[a.InputAccount.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.CheckSecurity.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.InputNewPassword.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
