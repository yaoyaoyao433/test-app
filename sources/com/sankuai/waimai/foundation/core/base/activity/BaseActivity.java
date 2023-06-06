package com.sankuai.waimai.foundation.core.base.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.waimai.foundation.core.utils.e;
import com.sankuai.waimai.foundation.core.widget.ActionBarView;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.utils.LocationUtils;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.l;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseActivity extends FragmentActivity implements c, com.sankuai.waimai.foundation.core.base.net.a {
    public static ChangeQuickRedirect w;
    public String A;
    public String B;
    protected String C;
    private Activity a;
    private String b;
    private boolean c;
    private Dialog d;
    private boolean e;
    private boolean f;
    private boolean g;
    protected ActionBarView x;
    protected d y;
    protected final MetricsSpeedMeterTask z;

    public Uri a(Uri uri) {
        return null;
    }

    public void a(Exception exc, int i) {
    }

    public boolean ao_() {
        return false;
    }

    public BaseActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e60b1708b291960b492b6a2f4df8af6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e60b1708b291960b492b6a2f4df8af6e");
            return;
        }
        this.y = d.a();
        this.d = null;
        this.z = h.a(this);
        this.A = "waimai";
        this.B = "native";
    }

    public final MetricsSpeedMeterTask s() {
        return this.z;
    }

    public String t() {
        return this.A;
    }

    public String e() {
        return this.B;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Uri data;
        LocationUtils.TransformData a2;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54a61a17c31cf43d68c9cd46f97bf52b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54a61a17c31cf43d68c9cd46f97bf52b");
            return;
        }
        com.sankuai.waimai.foundation.core.utils.c.a(this, "onEnterCreate");
        b.a();
        this.z.recordStep("activity_create");
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(null);
        this.a = this;
        this.b = getClass().getSimpleName() + System.currentTimeMillis();
        this.C = e.a(getIntent());
        Intent intent = getIntent();
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = w;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e0d9c3cb106c0778ed4bde80fe7d1bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e0d9c3cb106c0778ed4bde80fe7d1bc");
        } else if (intent != null && ((data = intent.getData()) == null || !data.isHierarchical() || TextUtils.isEmpty(data.getQueryParameter(Constants.PRIVACY.KEY_LATITUDE)) || TextUtils.isEmpty(data.getQueryParameter(Constants.PRIVACY.KEY_LONGITUDE)))) {
            Uri.Builder builder = data == null ? new Uri.Builder() : data.buildUpon();
            WMLocation i = g.a().i();
            double latitude = i != null ? i.getLatitude() : 0.0d;
            double longitude = i != null ? i.getLongitude() : 0.0d;
            if (!a(Double.valueOf(latitude), Double.valueOf(0.0d)) && !a(Double.valueOf(longitude), Double.valueOf(0.0d)) && (a2 = LocationUtils.a(longitude, latitude)) != null) {
                builder.appendQueryParameter("ji", String.valueOf(a2.ji)).appendQueryParameter("jf", a2.jf).appendQueryParameter("wi", String.valueOf(a2.wi)).appendQueryParameter("wf", a2.wf);
                intent.setData(builder.build());
            }
        }
        b.a().a(this, bundle);
        a(this);
        a(getApplicationContext());
        if (com.sankuai.waimai.foundation.core.utils.a.a(this)) {
            com.sankuai.waimai.foundation.core.utils.a.a(t(), e());
        }
        com.sankuai.waimai.foundation.core.utils.c.a(this, "onExitCreate");
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.BaseFragmentActivityApi16, android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle) {
        Object[] objArr = {intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74869dec1c7876f49000e44aff01bb4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74869dec1c7876f49000e44aff01bb4d");
            return;
        }
        try {
            e.a(intent, this.C);
            super.startActivityForResult(intent, i, bundle);
        } catch (Exception e) {
            if ("LENOVO".equalsIgnoreCase(Build.MANUFACTURER)) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
                return;
            }
            throw e;
        }
    }

    @Override // android.app.Activity
    public void onPostCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eac4c9719bdbf954a385e1984173ff46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eac4c9719bdbf954a385e1984173ff46");
            return;
        }
        super.onPostCreate(bundle);
        com.sankuai.waimai.foundation.core.utils.c.a(this, "onPostCreate");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0348bef1a09ecf54ee7a4eff44d2a0c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0348bef1a09ecf54ee7a4eff44d2a0c0");
            return;
        }
        super.onPostResume();
        com.sankuai.waimai.foundation.core.utils.c.a(this, "onPostResume");
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "641c45ea3acda45b33fb109e56e87257", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "641c45ea3acda45b33fb109e56e87257");
            return;
        }
        try {
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.fontScale = 1.0f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        } catch (Throwable unused) {
        }
    }

    private static boolean a(Double d, Double d2) {
        Object[] objArr = {d, d2};
        ChangeQuickRedirect changeQuickRedirect = w;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a7c23ffe4af92cd3642064965d7a096", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a7c23ffe4af92cd3642064965d7a096")).booleanValue() : Math.abs(d.doubleValue() - d2.doubleValue()) <= 1.0E-6d;
    }

    public Map<String, String> Z_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2186523e63ab2b2dc80939911ea3383e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2186523e63ab2b2dc80939911ea3383e");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", getClass().getName());
        return hashMap;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fb1289bbd4c3c5173de1f225343ecdc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fb1289bbd4c3c5173de1f225343ecdc")).booleanValue();
        }
        if (i == 82) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60af48cd463eeb14395ce3ff571792ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60af48cd463eeb14395ce3ff571792ef");
            return;
        }
        com.sankuai.waimai.foundation.core.utils.c.a(this, "onStart");
        b.a().a(this);
        if (!this.e) {
            this.z.recordStep("activity_start");
            this.e = true;
        }
        super.onStart();
        this.c = true;
        b.a().b(this);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cd4e36b1fa157974b9c33fcc86acffc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cd4e36b1fa157974b9c33fcc86acffc");
            return;
        }
        super.onStop();
        this.c = false;
        b.a().c(this);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5217f8ed95f2afc861e417227ba7098e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5217f8ed95f2afc861e417227ba7098e");
        } else {
            super.onPause();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3511283e12f4a7db03ad46671e7e1eff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3511283e12f4a7db03ad46671e7e1eff");
            return;
        }
        if (!this.f) {
            this.z.recordStep("activity_resume");
            this.f = true;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            if (com.sankuai.waimai.foundation.core.utils.c.a(this, "onResume")) {
                throw e;
            }
        }
        com.sankuai.waimai.foundation.core.utils.c.a(this, "onResume2");
    }

    @Override // android.app.Activity
    public void onRestart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1384b85cc6c112e28a9fd0b66e0b0f4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1384b85cc6c112e28a9fd0b66e0b0f4a");
            return;
        }
        super.onRestart();
        com.sankuai.waimai.foundation.core.utils.c.a(this, "onRestart");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "509ea6b646c04d18a425e6ebc813f214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "509ea6b646c04d18a425e6ebc813f214");
            return;
        }
        if (z && !this.g) {
            this.z.recordStep("activity_interactive");
            this.g = true;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00e2e4b49ab4d4eb4fa8ea62fa47232d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00e2e4b49ab4d4eb4fa8ea62fa47232d");
            return;
        }
        b.a().d(this);
        Activity activity = this.a;
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = l.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c3d89ded61fd69a766829a95562366fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c3d89ded61fd69a766829a95562366fb");
        } else if (activity != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("mCurRootView");
            arrayList.add("mServedView");
            arrayList.add("mNextServedView");
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            if (inputMethodManager != null) {
                if (Build.BRAND.equalsIgnoreCase("HUAWEI") || Build.BRAND.equalsIgnoreCase("HONOR")) {
                    arrayList.add("mLastSrvView");
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    try {
                        Field declaredField = inputMethodManager.getClass().getDeclaredField((String) arrayList.get(i));
                        if (declaredField != null) {
                            if (!declaredField.isAccessible()) {
                                declaredField.setAccessible(true);
                            }
                            Object obj = declaredField.get(inputMethodManager);
                            if (obj != null && (obj instanceof View)) {
                                if (((View) obj).getContext() != activity) {
                                    break;
                                }
                                declaredField.set(inputMethodManager, null);
                            }
                        } else {
                            continue;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        super.onDestroy();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = w;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "76bb769423b88607ac519c0f97c7e638", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "76bb769423b88607ac519c0f97c7e638");
        } else {
            this.y.c();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "323e20e57aba77a7a54380a252dfd236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "323e20e57aba77a7a54380a252dfd236");
            return;
        }
        super.onSaveInstanceState(bundle);
        b.a().a(bundle);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8385871a252bd13d16645815eab78a2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8385871a252bd13d16645815eab78a2a");
            return;
        }
        try {
            super.onRestoreInstanceState(bundle);
        } catch (BadParcelableException e) {
            e.printStackTrace();
        }
        b.a().a(bundle);
    }

    public final TextView c(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "519267149e3fdf60b06752122d55f46b", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "519267149e3fdf60b06752122d55f46b");
        }
        if (this.x != null) {
            return this.x.a(i);
        }
        return null;
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33590c80a7402708c6abe406235864f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33590c80a7402708c6abe406235864f");
        } else if (ao_()) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            this.x = new ActionBarView(this);
            this.x.setClickListener(new a());
            linearLayout.addView(this.x);
            linearLayout.addView(view, new LinearLayout.LayoutParams(-1, -1, 1.0f));
            super.setContentView(linearLayout);
        } else {
            super.setContentView(view);
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ace9cabba4d6e17cc8bd81cdb1a157e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ace9cabba4d6e17cc8bd81cdb1a157e8");
        } else if (ao_()) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(layoutParams);
            this.x = new ActionBarView(this);
            this.x.setClickListener(new a());
            linearLayout.addView(this.x);
            linearLayout.addView(view, new LinearLayout.LayoutParams(-1, -1, 1.0f));
            super.setContentView(linearLayout);
        } else {
            super.setContentView(view, layoutParams);
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fdf62c1f4b430039c18457120fce86e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fdf62c1f4b430039c18457120fce86e");
        } else if (ao_()) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            this.x = new ActionBarView(this);
            this.x.setClickListener(new a());
            linearLayout.addView(this.x);
            linearLayout.addView(getLayoutInflater().inflate(i, (ViewGroup) null), new LinearLayout.LayoutParams(-1, -1, 1.0f));
            try {
                super.setContentView(linearLayout);
            } catch (Exception e) {
                try {
                    a(e, 1);
                    super.setContentView(i);
                } catch (Exception e2) {
                    a(e2, 2);
                    finish();
                    com.sankuai.waimai.foundation.core.exception.a.b(e2);
                }
            }
        } else {
            try {
                super.setContentView(getLayoutInflater().inflate(i, (ViewGroup) null));
            } catch (Exception e3) {
                try {
                    a(e3, 1);
                    super.setContentView(i);
                } catch (Exception e4) {
                    a(e4, 2);
                    finish();
                    com.sankuai.waimai.foundation.core.exception.a.b(e4);
                }
            }
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dce93d1e43cba01b4ec834ad6becd33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dce93d1e43cba01b4ec834ad6becd33");
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        this.C = e.a(intent);
    }

    public final boolean u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d503c0acb9c53e14a9e876164a7e4196", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d503c0acb9c53e14a9e876164a7e4196")).booleanValue();
        }
        if (isFinishing()) {
            return false;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.d);
        this.d = com.sankuai.waimai.foundation.core.utils.d.a((Activity) this);
        return true;
    }

    public void b_(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "607a862ad7f8332011bbff884a447974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "607a862ad7f8332011bbff884a447974");
        } else {
            ae.a(this.a, str);
        }
    }

    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a8f41ae763b2559c683841287cd6c87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a8f41ae763b2559c683841287cd6c87");
        } else {
            ae.a(this.a, i);
        }
    }

    public final boolean v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03313a6c6a8b80fe1dd5886f7ff2399c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03313a6c6a8b80fe1dd5886f7ff2399c")).booleanValue();
        }
        if (isFinishing()) {
            return false;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.d);
        this.d = null;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements ActionBarView.a {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {BaseActivity.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "618c79c7974d8ddf0f88d86519c1651a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "618c79c7974d8ddf0f88d86519c1651a");
            }
        }

        @Override // com.sankuai.waimai.foundation.core.widget.ActionBarView.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de299d29044b0a62b793abdd16cc0221", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de299d29044b0a62b793abdd16cc0221");
            } else {
                BaseActivity.this.onBackPressed();
            }
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07f773b99b9a6a6e1a5df0f2cfc55dac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07f773b99b9a6a6e1a5df0f2cfc55dac");
            return;
        }
        try {
            super.onBackPressed();
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(getClass().getSimpleName(), e.getMessage(), e);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "062aca92438dcd0dbf05bc7be1e9c509", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "062aca92438dcd0dbf05bc7be1e9c509");
        } else if (f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            b.a().a(this, i, strArr, iArr);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.net.a
    public void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28bc9586f15c99141bb8695e3633a874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28bc9586f15c99141bb8695e3633a874");
        } else {
            b.a().a(this, i, str);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.net.a
    public void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "935573b2bac36fae7d3ef9d102c859e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "935573b2bac36fae7d3ef9d102c859e4");
        } else {
            b.a().a(this, jSONObject);
        }
    }

    public String w() {
        return this.b;
    }

    public final Activity bB_() {
        return this.a;
    }

    public boolean x() {
        return this.c;
    }
}
