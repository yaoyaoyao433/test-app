package com.sankuai.waimai.platform.machpro.container;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener;
import com.meituan.android.common.weaver.interfaces.ffp.FFPTags;
import com.meituan.metrics.MetricsNameProvider;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProActivityDelegate;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.container.g;
import com.sankuai.waimai.machpro.f;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.machpro.module.builtin.MPBackPressModule;
import com.unionpay.tsmservice.data.Constant;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMMPActivity extends BaseActivity implements FFPTags, MetricsNameProvider {
    public static ChangeQuickRedirect a;
    private IMPActivityDelegate b;
    private String c;
    private com.sankuai.waimai.machpro.container.c d;

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3141685ba6ce38d129101ca7efff1b07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3141685ba6ce38d129101ca7efff1b07");
            return;
        }
        if (getIntent() != null && getIntent().getData() != null) {
            if (TextUtils.isEmpty(getIntent().getData().getQueryParameter(WMMachProActivityDelegate.MP_ENTRY))) {
                this.d = new com.sankuai.waimai.machpro.container.c(this);
                com.sankuai.waimai.machpro.container.c cVar = this.d;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.container.c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "e61095f8df33a96f65d88d6789eed2e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "e61095f8df33a96f65d88d6789eed2e8");
                } else {
                    if (cVar.e() == null || cVar.e().getData() == null) {
                        com.sankuai.waimai.machpro.util.a.a("Uri参数为空 | Mach Pro页面启动失败！");
                        cVar.b.finish();
                    }
                    Uri data = cVar.e().getData();
                    cVar.c = data.getQueryParameter("mach_bundle_name");
                    if (TextUtils.isEmpty(cVar.c)) {
                        com.sankuai.waimai.machpro.util.a.a("BundleName参数为空 | Mach Pro页面启动失败！");
                        cVar.b.finish();
                    }
                    Object[] objArr3 = {data};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.container.c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "490ae3f45dbfdb027ce23f0e78e33581", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "490ae3f45dbfdb027ce23f0e78e33581");
                    } else {
                        Set<String> queryParameterNames = data.getQueryParameterNames();
                        if (queryParameterNames != null && queryParameterNames.size() > 0) {
                            cVar.i = new MachMap();
                            for (String str : queryParameterNames) {
                                cVar.i.put(str, data.getQueryParameter(str));
                            }
                        }
                        if (cVar.e() != null) {
                            cVar.j = com.sankuai.waimai.machpro.util.b.a(cVar.e().getExtras());
                        }
                    }
                }
            } else {
                this.b = (IMPActivityDelegate) com.sankuai.waimai.router.a.a(IMPActivityDelegate.class, "WMMachProActivityDelegate");
            }
        } else {
            com.sankuai.waimai.machpro.util.a.a("Uri参数为空 | Mach Pro页面启动失败！");
            finish();
        }
        super.onCreate(bundle);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6fa0e251790fdd8291f7ad1a6a1239ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6fa0e251790fdd8291f7ad1a6a1239ab");
        } else if (getIntent() != null && getIntent().getData() != null) {
            Uri data2 = getIntent().getData();
            if (TextUtils.isEmpty(data2.getQueryParameter(WMMachProActivityDelegate.MP_ENTRY))) {
                this.c = data2.getQueryParameter("mach_bundle_name");
            } else {
                this.c = data2.getQueryParameter(WMMachProActivityDelegate.MP_ENTRY);
            }
        }
        com.sankuai.waimai.platform.capacity.immersed.a.b(bB_(), false);
        com.sankuai.waimai.platform.capacity.immersed.a.a(bB_(), true);
        if (this.b != null) {
            if ("mach_pro_waimai_restaurant_combo_page".equals(this.c) || "mach_pro_waimai_restaurant_combo_page_general".equals(this.c)) {
                a((Activity) this);
            }
            this.b.setActivity(this);
            this.b.onCreate(this, bundle);
        } else if (this.d != null) {
            if (getIntent() != null && getIntent().getData() != null && "1".equals(getIntent().getData().getQueryParameter("mach_translucent"))) {
                a((Activity) this);
            }
            com.sankuai.waimai.machpro.container.c cVar2 = this.d;
            Object[] objArr5 = {bundle};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.machpro.container.c.a;
            if (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "80cb6b7bff40c201fd7f9884785f78dd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "80cb6b7bff40c201fd7f9884785f78dd");
            } else if (cVar2.e() != null && cVar2.e().getData() != null) {
                Weaver.getWeaver().registerListener(cVar2.k, FFPReportListener.class);
                Uri data3 = cVar2.e().getData();
                cVar2.h = f.a().c(data3.toString());
                if (cVar2.h == null) {
                    cVar2.h = new com.sankuai.waimai.machpro.container.f();
                }
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.machpro.container.c.a;
                if (PatchProxy.isSupport(objArr6, cVar2, changeQuickRedirect6, false, "c9283fb8c9b093bb87c9b026f41d040e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, cVar2, changeQuickRedirect6, false, "c9283fb8c9b093bb87c9b026f41d040e");
                } else {
                    if (f.a().i.i) {
                        cVar2.d = com.sankuai.waimai.machpro.debug.a.a(cVar2);
                        if (cVar2.d == null) {
                            cVar2.d = new g(cVar2);
                        }
                    } else {
                        cVar2.d = new g(cVar2);
                    }
                    MachMap machMap = new MachMap();
                    Uri data4 = cVar2.e().getData();
                    machMap.put(NetLogConstants.Details.SCHEME, data4 == null ? null : data4.toString());
                    if (cVar2.i != null) {
                        machMap.put("schemeParams", cVar2.i);
                    }
                    cVar2.d.c(machMap);
                }
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.machpro.container.c.a;
                if (PatchProxy.isSupport(objArr7, cVar2, changeQuickRedirect7, false, "2107c40c3130961453c700d29efd57ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, cVar2, changeQuickRedirect7, false, "2107c40c3130961453c700d29efd57ca");
                } else {
                    cVar2.e = new FrameLayout(cVar2.b);
                    if (f.a().i.j) {
                        cVar2.f = new FrameLayout(cVar2.b);
                        cVar2.e.addView(cVar2.f, new FrameLayout.LayoutParams(-1, -1));
                        com.sankuai.waimai.machpro.debug.a.a(cVar2.b, cVar2.e, cVar2.c);
                    } else {
                        cVar2.f = cVar2.e;
                    }
                }
                cVar2.b.setContentView(cVar2.e);
                String queryParameter = data3.getQueryParameter("mach_min_version");
                if (cVar2.d != null) {
                    cVar2.d.a(queryParameter);
                    cVar2.d.a();
                }
            }
        } else {
            com.sankuai.waimai.machpro.util.a.a("WMMPActivity | 创建Delegate失败！！！");
        }
    }

    private void a(Activity activity) {
        Class<?>[] declaredClasses;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b92de29187f720ecf802b37cf36adbc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b92de29187f720ecf802b37cf36adbc2");
            return;
        }
        try {
            activity.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            activity.getWindow().getDecorView().setBackground(null);
            Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(activity, new Object[0]);
            Class<?> cls = null;
            for (Class<?> cls2 : Activity.class.getDeclaredClasses()) {
                if (cls2.getSimpleName().contains("TranslucentConversionListener")) {
                    cls = cls2;
                }
            }
            Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(activity, null, invoke);
        } catch (Throwable th) {
            com.sankuai.waimai.machpro.util.a.a("WMMPActivity | " + th.getMessage());
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0efc215b3892443fae49b096388ebc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0efc215b3892443fae49b096388ebc1");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (this.d != null) {
            com.sankuai.waimai.machpro.container.c cVar = this.d;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.container.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "00c9d3edf5468c44dc8c85c76520df45", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "00c9d3edf5468c44dc8c85c76520df45");
            } else {
                try {
                    cVar.g = new JSONObject();
                    if (intent != null) {
                        cVar.g.put(Constant.KEY_RESULT_CODE, com.sankuai.waimai.platform.utils.f.a(intent, Constant.KEY_RESULT_CODE, 0));
                        cVar.g.put("resultData", com.sankuai.waimai.platform.utils.f.a(intent, "resultData"));
                        Class.forName("com.sankuai.waimai.platform.machpro.module.WMRouterModule").getDeclaredMethod("onActivityResult", Intent.class).invoke(cVar.d.b("WMRouter"), intent);
                    }
                } catch (Exception unused) {
                    com.sankuai.waimai.machpro.util.a.a("onActivityResult数据异常！");
                }
                if (cVar.d != null) {
                    cVar.d.a(i, i2, intent);
                }
            }
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a269c794f07af4027cd97b4d005caf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a269c794f07af4027cd97b4d005caf0");
        } else if (this.b != null) {
            this.b.onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45beed6d38a6c14b8b1f1d8adb857b1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45beed6d38a6c14b8b1f1d8adb857b1d");
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa391266059621f7f376c6ca4f04b47", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa391266059621f7f376c6ca4f04b47")).booleanValue();
        }
        if (this.d != null) {
            com.sankuai.waimai.machpro.container.c cVar = this.d;
            Object[] objArr2 = {Integer.valueOf(i), keyEvent};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.container.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "63bea3c90e4d03636d65bfb826bd69f7", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "63bea3c90e4d03636d65bfb826bd69f7")).booleanValue();
            } else if (i == 4 && cVar.d != null) {
                MPModule b = cVar.d.b("BackPressModule");
                if (b instanceof MPBackPressModule) {
                    z = ((MPBackPressModule) b).onBackPress();
                }
            }
            if (z) {
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efa355cf85fd4a66ef8b45034461ba80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efa355cf85fd4a66ef8b45034461ba80");
            return;
        }
        super.onStart();
        if (this.d != null) {
            com.sankuai.waimai.machpro.container.c cVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.container.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "3cf1db094074d1b259ab85061a2990fa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "3cf1db094074d1b259ab85061a2990fa");
            } else if (cVar.d != null) {
                cVar.d.c();
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2118fce8b390c0bde4e97dd5869b7ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2118fce8b390c0bde4e97dd5869b7ed");
            return;
        }
        super.onResume();
        if (this.d != null) {
            com.sankuai.waimai.machpro.container.c cVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.container.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "b6b417af0152dd4bd6fd7a82138b156a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "b6b417af0152dd4bd6fd7a82138b156a");
            } else if (cVar.d != null) {
                cVar.d.d();
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f3d85a539afe650fdf721cda6972e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f3d85a539afe650fdf721cda6972e54");
            return;
        }
        super.onPause();
        if (this.d != null) {
            com.sankuai.waimai.machpro.container.c cVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.container.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "d014f32263032399449598bf0f9ba26f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "d014f32263032399449598bf0f9ba26f");
            } else if (cVar.d != null) {
                cVar.d.e();
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a58063838a6657d7bdd67c05f76f85df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a58063838a6657d7bdd67c05f76f85df");
            return;
        }
        super.onStop();
        if (this.d != null) {
            com.sankuai.waimai.machpro.container.c cVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.container.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "b46c936060d8fe30beeab33a138042d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "b46c936060d8fe30beeab33a138042d4");
            } else if (cVar.d != null) {
                cVar.d.f();
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2ee8b3fb59bdd6d3b7ee46154d029df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2ee8b3fb59bdd6d3b7ee46154d029df");
            return;
        }
        super.onDestroy();
        if (this.d != null) {
            final com.sankuai.waimai.machpro.container.c cVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.container.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "6c4229211c0f9f0ea732648082ce4417", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "6c4229211c0f9f0ea732648082ce4417");
            } else {
                com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.container.c.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a93862e4f3bf8c6cf3fbf5bd5ff88359", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a93862e4f3bf8c6cf3fbf5bd5ff88359");
                        } else if (c.this.d != null) {
                            c.this.d.g();
                            c.a(c.this, null);
                        }
                    }
                });
                Weaver.getWeaver().unregisterListener(cVar.k, FFPReportListener.class);
            }
        }
        if (this.b != null) {
            this.b.onDestroy(this);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58da3bef2e910085eda29d79b19af82a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58da3bef2e910085eda29d79b19af82a");
            return;
        }
        super.finish();
        if ("mach_pro_waimai_restaurant_combo_page".equals(this.c) || "mach_pro_waimai_restaurant_combo_page_general".equals(this.c)) {
            overridePendingTransition(0, 0);
        }
    }

    @Override // com.meituan.metrics.MetricsNameProvider
    public String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aa601596786ff76177112804ebaa1f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aa601596786ff76177112804ebaa1f5");
        }
        if (this.b instanceof MetricsNameProvider) {
            return ((MetricsNameProvider) this.b).getName();
        }
        return this.c;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPTags
    @NonNull
    public Map<String, Object> ffpTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d76315785e0d84b4080e1483030ccca", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d76315785e0d84b4080e1483030ccca");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("__ffpbundle", this.c);
        return hashMap;
    }
}
