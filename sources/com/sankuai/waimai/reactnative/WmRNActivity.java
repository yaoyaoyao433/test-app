package com.sankuai.waimai.reactnative;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.mrn.container.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.c;
import com.sankuai.waimai.foundation.core.utils.e;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import com.sankuai.waimai.platform.widget.emptylayout.h;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WmRNActivity extends MRNBaseActivity implements c {
    public static ChangeQuickRedirect i;
    public boolean j;
    protected String k;
    private d l;
    private d m;
    private long n;

    public WmRNActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0863465d37fb9c7678843378e8ecebfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0863465d37fb9c7678843378e8ecebfc");
        } else {
            this.j = false;
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseActivity, com.meituan.android.mrn.container.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ccdbf0b951349d54d707474004c6c90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ccdbf0b951349d54d707474004c6c90");
            return;
        }
        getApplication();
        this.n = System.currentTimeMillis();
        this.l = new d(LayoutInflater.from(this), (ViewGroup) null);
        this.l.b(d.j, R.string.mrn_common_error, 0, R.string.wm_rn_page_close, new View.OnClickListener() { // from class: com.sankuai.waimai.reactnative.WmRNActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba2696548bd1ebd04a0c9ca09a838980", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba2696548bd1ebd04a0c9ca09a838980");
                } else {
                    WmRNActivity.this.finish();
                }
            }
        });
        this.m = new d(LayoutInflater.from(this), (ViewGroup) null);
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            a(extras);
            getIntent().putExtra("mrn_extra_data", extras);
        }
        try {
            if (com.sankuai.waimai.reactnative.utils.d.a(a())) {
                com.sankuai.waimai.foundation.core.utils.a.a();
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
        this.k = e.a(getIntent());
    }

    @Override // com.meituan.android.mrn.container.MRNBaseActivity, android.support.v7.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caaa798ca16b528758cf348c03618339", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caaa798ca16b528758cf348c03618339");
        } else {
            super.onPostCreate(bundle);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.BaseFragmentActivityApi16, android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void startActivityForResult(Intent intent, int i2, @Nullable Bundle bundle) {
        Object[] objArr = {intent, Integer.valueOf(i2), bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1737b94c5dadd272d4a9492813bc7bbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1737b94c5dadd272d4a9492813bc7bbf");
            return;
        }
        e.a(intent, this.k);
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseActivity, com.meituan.android.mrn.container.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a27e7857b4a2551e8e0fa8e7474e47db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a27e7857b4a2551e8e0fa8e7474e47db");
            return;
        }
        super.onNewIntent(intent);
        this.k = e.a(intent);
    }

    private void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bfa48aa670e91ab4de7d855056e8aad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bfa48aa670e91ab4de7d855056e8aad");
        } else if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof Long) {
                    com.sankuai.waimai.foundation.utils.log.a.c("WmRN", "替换Long型参数[%s]为String型", str);
                    bundle.putString(str, String.valueOf(bundle.getLong(str)));
                }
                if (!(obj instanceof Number) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                    if (obj instanceof Bundle) {
                        a((Bundle) obj);
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.d("WmRN", "移除extras中不支持的类型，key:[%s]", str);
                        bundle.remove(str);
                    }
                }
            }
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseActivity, com.meituan.android.mrn.container.b
    public final Bundle h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "197bde4757c56bec13b8984515340b9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "197bde4757c56bec13b8984515340b9a");
        }
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (intent.getExtras() != null) {
            for (String str : intent.getExtras().keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    Object obj = intent.getExtras().get(str);
                    if (obj instanceof Integer) {
                        bundle.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Double) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putDouble(str, ((Float) obj).floatValue());
                    } else if (obj instanceof Long) {
                        bundle.putString(str, obj.toString());
                    } else if (obj instanceof String) {
                        bundle.putString(str, (String) obj);
                    } else if (obj instanceof Short) {
                        bundle.putInt(str, ((Short) obj).shortValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str, (Bundle) obj);
                    }
                }
            }
        }
        if (intent.getData() != null) {
            Uri data = intent.getData();
            for (String str2 : data.getQueryParameterNames()) {
                bundle.putString(str2, data.getQueryParameter(str2));
            }
        }
        bundle.putLong("wm_rn_page_create_time", this.n);
        return bundle;
    }

    @Override // com.meituan.android.mrn.container.BaseActivity, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6bb976b38805d92a605843b94d55e00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6bb976b38805d92a605843b94d55e00");
            return;
        }
        try {
            super.onRestoreInstanceState(bundle);
        } catch (BadParcelableException e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseActivity
    public final View b(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be1a438da54046890fe6c2dddbd1d4b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be1a438da54046890fe6c2dddbd1d4b3");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "084b0c04ec3802b48f041374d3eb1e1d", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "084b0c04ec3802b48f041374d3eb1e1d");
        } else {
            g k = k();
            if (!p.a(com.meituan.android.singleton.b.a)) {
                str = "N_10000";
            } else if (k == null || k.d() == null) {
                str = "M_10011";
            } else {
                str = "M_" + k.d().a();
            }
        }
        String str2 = str;
        this.l.a(getResources().getString(R.string.mrn_common_error), new com.sankuai.waimai.platform.widget.emptylayout.b((Throwable) new com.sankuai.waimai.platform.widget.emptylayout.a(str2), false));
        Object[] objArr3 = {str2};
        ChangeQuickRedirect changeQuickRedirect3 = i;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "58b834b28b5d8d1db877d8073b0f8661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "58b834b28b5d8d1db877d8073b0f8661");
        } else {
            i.d(new com.sankuai.waimai.reactnative.log.a().a("WmRNActivity").b(str2).c("RN容器出错").d("").b());
        }
        String k2 = this.l.k();
        Object[] objArr4 = {k2};
        ChangeQuickRedirect changeQuickRedirect4 = i;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5e7f41ece81453416a1cff968b2c05eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5e7f41ece81453416a1cff968b2c05eb");
        } else if (!TextUtils.isEmpty(k2)) {
            h.a("WmRNActivity", h.c, k2);
        }
        com.sankuai.waimai.platform.bizdiagnosis.a.c(context);
        return a(this.l);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseActivity
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3323fcae4cfdcbb635a78c9dd4dcf2dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3323fcae4cfdcbb635a78c9dd4dcf2dc");
        }
        this.m.c(R.string.mrn_common_loading);
        return a(this.m);
    }

    private View a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bc1f6bf54c256844e03e3a04abb7b95", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bc1f6bf54c256844e03e3a04abb7b95");
        }
        View a = dVar.a();
        try {
            if (a.getParent() != null) {
                ((ViewGroup) a.getParent()).removeView(a);
            }
        } catch (Exception unused) {
        }
        return a;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55566da600ffdf670203a13d9fe540b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55566da600ffdf670203a13d9fe540b5");
            return;
        }
        try {
            super.onStop();
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4788d73b426f2c59902547e3e5ecde61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4788d73b426f2c59902547e3e5ecde61");
        } else {
            super.onDestroy();
        }
    }

    @Nullable
    public final String m() {
        com.meituan.android.mrn.router.d p;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de7fc64ac699a50600988a351dad669f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de7fc64ac699a50600988a351dad669f");
        }
        g k = k();
        if (k == null || (p = k.p()) == null) {
            return null;
        }
        return p.c();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.c
    public final Map<String, String> Z_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62bd0719524d948a38e5de98f0ef4853", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62bd0719524d948a38e5de98f0ef4853");
        }
        HashMap hashMap = new HashMap();
        String str = "";
        g k = k();
        if (k != null) {
            com.meituan.android.mrn.router.d p = k.p();
            if (!TextUtils.isEmpty(p.b())) {
                str = p.b();
            }
        }
        if (!TextUtils.isEmpty(m())) {
            hashMap.put("page_id", str + CommonConstant.Symbol.UNDERLINE + m());
        }
        return hashMap;
    }
}
