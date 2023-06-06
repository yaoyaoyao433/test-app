package com.meituan.android.yoda.activity;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.yoda.YodaResponseListener;
import com.meituan.android.yoda.plugins.c;
import com.meituan.android.yoda.plugins.d;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.aa;
import com.meituan.android.yoda.util.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class YodaRouterTransparentActivity extends AppCompatActivity {
    public static ChangeQuickRedirect a;
    private final long b;
    private final long c;
    private final Handler d;
    private boolean e;
    private String f;
    private Runnable g;

    public YodaRouterTransparentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d59f556a13cf013aa11a1868e8c1f30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d59f556a13cf013aa11a1868e8c1f30");
            return;
        }
        this.b = 500L;
        this.c = 1000L;
        this.d = new Handler(Looper.getMainLooper());
        this.e = false;
        this.f = null;
        this.g = new Runnable() { // from class: com.meituan.android.yoda.activity.YodaRouterTransparentActivity.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                String str;
                List<ActivityManager.AppTask> appTasks;
                ComponentName componentName;
                boolean z2 = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "933fc32e4249fa35deff033baa84e249", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "933fc32e4249fa35deff033baa84e249");
                    return;
                }
                Context applicationContext = YodaRouterTransparentActivity.this.getApplicationContext();
                Object[] objArr3 = {applicationContext};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                String str2 = null;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8fb41b384f8cbcc649421fb9e6d30767", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8fb41b384f8cbcc649421fb9e6d30767")).booleanValue();
                } else {
                    Object[] objArr4 = {applicationContext};
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "3a601fda48e55f0c4d7328098cb72cd7", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "3a601fda48e55f0c4d7328098cb72cd7")).booleanValue();
                    } else {
                        if (applicationContext != null) {
                            Object[] objArr5 = {applicationContext};
                            ChangeQuickRedirect changeQuickRedirect5 = b.a;
                            String packageName = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "849ceff427f80a509826e8727b44fa21", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "849ceff427f80a509826e8727b44fa21") : applicationContext.getPackageName();
                            List<ActivityManager.AppTask> appTasks2 = ((ActivityManager) applicationContext.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getAppTasks();
                            String packageName2 = (appTasks2 == null || appTasks2.size() <= 0) ? null : appTasks2.get(0).getTaskInfo().baseIntent.getComponent().getPackageName();
                            if (packageName2 == null) {
                                packageName2 = "";
                            }
                            if (packageName == null) {
                                packageName = "";
                            }
                            com.meituan.android.yoda.monitor.log.a.a("AppUtils", "isRunningForegroundNewVersion, runningAppName = " + packageName2 + ", appName = " + packageName, true);
                            if (!TextUtils.isEmpty(packageName) && !TextUtils.isEmpty(packageName2) && packageName.equalsIgnoreCase(packageName2)) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        Object[] objArr6 = {applicationContext};
                        ChangeQuickRedirect changeQuickRedirect6 = b.a;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "b0421ab07b75d81a79fc4d6ff10d5067", RobustBitConfig.DEFAULT_VALUE)) {
                            str = (String) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "b0421ab07b75d81a79fc4d6ff10d5067");
                        } else if (applicationContext == null) {
                            str = "";
                        } else {
                            ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
                            List<ActivityManager.RunningTaskInfo> a2 = Privacy.createActivityManager(applicationContext, "jcyf-379eb4d25a873259").a(1);
                            if (a2 != null && a2.size() > 0 && (componentName = a2.get(0).topActivity) != null) {
                                str2 = componentName.getClassName();
                                String packageName3 = componentName.getPackageName();
                                com.meituan.android.yoda.monitor.log.a.a("AppUtils", "getTopActivityName, runningTasks.get(0).topActivity = " + str2 + ", topActivityPackageName = " + packageName3, true);
                            }
                            if (TextUtils.isEmpty(str2) && (appTasks = activityManager.getAppTasks()) != null && appTasks.size() > 0 && appTasks.get(0) != null) {
                                ActivityManager.RecentTaskInfo taskInfo = appTasks.get(0).getTaskInfo();
                                if (Build.VERSION.SDK_INT >= 23 && taskInfo != null && taskInfo.topActivity != null) {
                                    str2 = taskInfo.topActivity.getClassName();
                                }
                                com.meituan.android.yoda.monitor.log.a.a("AppUtils", "getTopActivityName, taskInfo.topActivity = " + str2, true);
                            }
                            if (TextUtils.isEmpty(str2)) {
                                com.meituan.android.yoda.monitor.log.a.a("AppUtils", "getTopActivityName, 获取栈顶页面信息失败 !", true);
                                str = "";
                            } else {
                                str = str2;
                            }
                        }
                        com.meituan.android.yoda.monitor.log.a.a("AppUtils", "isYodaBeCovered, topActivity = " + str, true);
                        if (!TextUtils.isEmpty(str)) {
                            String name = YodaConfirmActivity.class.getName();
                            String name2 = YodaRouterTransparentActivity.class.getName();
                            if (!str.equalsIgnoreCase(name) && !str.equalsIgnoreCase(name2) && !str.contains("permission.ui.GrantPermissionsActivity")) {
                                com.meituan.android.yoda.monitor.log.a.a("AppUtils", "isYodaBeCovered, Yoda be covered !", true);
                                z2 = true;
                            }
                        }
                    }
                }
                if (z2) {
                    aa.a(YodaRouterTransparentActivity.this.getApplicationContext(), YodaRouterTransparentActivity.this.f, d.a().b().getNetEnv(), -1, new YodaResponseListener() { // from class: com.meituan.android.yoda.activity.YodaRouterTransparentActivity.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.yoda.YodaResponseListener
                        public final void onYodaResponse(String str3, String str4) {
                            Object[] objArr7 = {str3, str4};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "6b1d80477ad54ab1229712277a18b380", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "6b1d80477ad54ab1229712277a18b380");
                                return;
                            }
                            com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onStop, onYodaResponse, requestCode = " + str3 + ", responseCode = " + str4, true);
                        }

                        @Override // com.meituan.android.yoda.YodaResponseListener
                        public final void onCancel(String str3) {
                            Object[] objArr7 = {str3};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "627f366e913b47c513d97f3f1a88afb6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "627f366e913b47c513d97f3f1a88afb6");
                                return;
                            }
                            com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onStop, onCancel, requestCode = " + str3, true);
                        }

                        @Override // com.meituan.android.yoda.YodaResponseListener
                        public final void onError(String str3, Error error) {
                            Object[] objArr7 = {str3, error};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ddee5318c27c19564502fe9d264e8fd0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ddee5318c27c19564502fe9d264e8fd0");
                                return;
                            }
                            com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onStop, onError, requestCode = " + str3 + ", error = " + error.toString(), true);
                        }
                    });
                    com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onStop, Yoda has been covered !", true);
                    return;
                }
                com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onStop, Yoda hasn't been covered !", true);
            }
        };
    }

    public static /* synthetic */ void a(YodaRouterTransparentActivity yodaRouterTransparentActivity, int i, String str, String str2, Error error) {
        Object[] objArr = {Integer.valueOf(i), str, str2, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, yodaRouterTransparentActivity, changeQuickRedirect, false, "d9ad5d6f7a5d13850aeddee8a4e08d68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, yodaRouterTransparentActivity, changeQuickRedirect, false, "d9ad5d6f7a5d13850aeddee8a4e08d68");
            return;
        }
        Intent intent = new Intent("com.meituan.android.yoda.result");
        intent.putExtra("errorCode", i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra(OtherVerifyTypeConstants.RESPONSE_CODE_IDENTITY, str2);
        }
        intent.putExtra("error", error);
        yodaRouterTransparentActivity.sendBroadcast(intent);
    }

    public static /* synthetic */ void b(YodaRouterTransparentActivity yodaRouterTransparentActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, yodaRouterTransparentActivity, changeQuickRedirect, false, "983e4de469d379fbbcb8aa9ad77e6e9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, yodaRouterTransparentActivity, changeQuickRedirect, false, "983e4de469d379fbbcb8aa9ad77e6e9d");
        } else {
            yodaRouterTransparentActivity.d.postDelayed(new Runnable() { // from class: com.meituan.android.yoda.activity.YodaRouterTransparentActivity.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0545f1c7f8a4a2e3b3c8e17dbe3988ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0545f1c7f8a4a2e3b3c8e17dbe3988ea");
                    } else {
                        YodaRouterTransparentActivity.this.finish();
                    }
                }
            }, 500L);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1431c039749f9a0fa9ed8af7a08aa18a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1431c039749f9a0fa9ed8af7a08aa18a");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onCreate", true);
        try {
            getWindow().addFlags(67108864);
        } catch (Exception unused) {
        }
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT == 26) {
            com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onCreate, setRequestedOrientation SCREEN_ORIENTATION_UNSPECIFIED", true);
            setRequestedOrientation(-1);
        } else {
            com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onCreate, setRequestedOrientation SCREEN_ORIENTATION_PORTRAIT", true);
            setRequestedOrientation(1);
        }
        if (a()) {
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6d2179d08a2808964eb388d6c975c01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6d2179d08a2808964eb388d6c975c01");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onResume", true);
        super.onResume();
        if (this.e) {
            a();
            this.e = false;
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f2cb637c66696a0c188ba1202d7838f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f2cb637c66696a0c188ba1202d7838f");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onPause", true);
        overridePendingTransition(0, 0);
        super.onPause();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "891fab129355e13de1dc17145e0bd348", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "891fab129355e13de1dc17145e0bd348");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onStop", true);
        super.onStop();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7401242db44e70f947fa65bfab23ad66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7401242db44e70f947fa65bfab23ad66");
        } else if (this.g != null) {
            this.d.postDelayed(this.g, 1000L);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbc2b5955bd4f2b91c5c3957ccadc763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbc2b5955bd4f2b91c5c3957ccadc763");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onDestroy", true);
        super.onDestroy();
        b();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed6e09efa940ad3580d130bfde6245ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed6e09efa940ad3580d130bfde6245ee");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onSaveInstanceState", true);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        Object[] objArr = {bundle, persistableBundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a3d0f2b2c53028b423ec1588a8070bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a3d0f2b2c53028b423ec1588a8070bc");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onRestoreInstanceState", true);
        super.onRestoreInstanceState(bundle, persistableBundle);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5feb74ced3056e96c67ce9400aa46e3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5feb74ced3056e96c67ce9400aa46e3a");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "onNewIntent", true);
        this.e = true;
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public void overridePendingTransition(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99f7e5116f517fad845e0d2e4605d061", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99f7e5116f517fad845e0d2e4605d061");
        } else {
            super.overridePendingTransition(0, 0);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1edbe11c79c18565ecf000e0f394256b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1edbe11c79c18565ecf000e0f394256b");
        } else if (f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            if (fragments == null) {
                return;
            }
            for (Fragment fragment : fragments) {
                if (fragment != null) {
                    fragment.onRequestPermissionsResult(i, strArr, iArr);
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(74:10|(3:11|12|13)|14|15|16|17|18|19|20|21|22|(3:23|24|25)|26|27|(1:29)|30|31|32|(1:34)|35|36|(1:38)|39|(2:40|41)|42|43|44|45|46|47|48|49|50|51|(2:52|53)|54|(2:55|56)|57|58|59|60|61|62|63|(2:64|65)|66|(2:67|68)|69|70|71|72|73|74|75|(2:76|77)|78|(3:79|80|81)|82|83|(15:85|86|87|88|89|90|91|92|(1:94)|95|(1:97)|98|99|100|(69:102|103|104|105|(1:107)|108|(1:110)|111|(1:113)|114|(1:116)|117|(1:119)|120|(1:122)|123|(1:125)|126|(1:128)|129|(1:131)|132|(1:134)|135|(1:137)|138|(1:140)|141|(1:143)|144|(4:146|147|148|149)(1:210)|150|(1:152)|153|(1:155)|156|(1:158)|159|(1:161)|162|(1:164)|165|(1:167)|168|(1:170)|171|(1:173)|174|(1:176)|177|(1:179)|180|(1:182)|(1:184)|185|(1:187)|188|(1:190)|191|(1:193)|194|(1:196)|197|(1:199)|200|(1:202)|203|204|205)(1:222))|233|87|88|89|90|91|92|(0)|95|(0)|98|99|100|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(75:10|(3:11|12|13)|14|15|16|17|18|19|20|21|22|(3:23|24|25)|26|27|(1:29)|30|31|32|(1:34)|35|36|(1:38)|39|(2:40|41)|42|43|44|45|46|47|48|49|50|51|(2:52|53)|54|55|56|57|58|59|60|61|62|63|(2:64|65)|66|(2:67|68)|69|70|71|72|73|74|75|(2:76|77)|78|(3:79|80|81)|82|83|(15:85|86|87|88|89|90|91|92|(1:94)|95|(1:97)|98|99|100|(69:102|103|104|105|(1:107)|108|(1:110)|111|(1:113)|114|(1:116)|117|(1:119)|120|(1:122)|123|(1:125)|126|(1:128)|129|(1:131)|132|(1:134)|135|(1:137)|138|(1:140)|141|(1:143)|144|(4:146|147|148|149)(1:210)|150|(1:152)|153|(1:155)|156|(1:158)|159|(1:161)|162|(1:164)|165|(1:167)|168|(1:170)|171|(1:173)|174|(1:176)|177|(1:179)|180|(1:182)|(1:184)|185|(1:187)|188|(1:190)|191|(1:193)|194|(1:196)|197|(1:199)|200|(1:202)|203|204|205)(1:222))|233|87|88|89|90|91|92|(0)|95|(0)|98|99|100|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(83:10|11|12|13|14|15|16|17|18|19|20|21|22|(3:23|24|25)|26|27|(1:29)|30|31|32|(1:34)|35|36|(1:38)|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|(2:64|65)|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|(15:85|86|87|88|89|90|91|92|(1:94)|95|(1:97)|98|99|100|(69:102|103|104|105|(1:107)|108|(1:110)|111|(1:113)|114|(1:116)|117|(1:119)|120|(1:122)|123|(1:125)|126|(1:128)|129|(1:131)|132|(1:134)|135|(1:137)|138|(1:140)|141|(1:143)|144|(4:146|147|148|149)(1:210)|150|(1:152)|153|(1:155)|156|(1:158)|159|(1:161)|162|(1:164)|165|(1:167)|168|(1:170)|171|(1:173)|174|(1:176)|177|(1:179)|180|(1:182)|(1:184)|185|(1:187)|188|(1:190)|191|(1:193)|194|(1:196)|197|(1:199)|200|(1:202)|203|204|205)(1:222))|233|87|88|89|90|91|92|(0)|95|(0)|98|99|100|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x028e, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0290, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0291, code lost:
        r55 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0293, code lost:
        r0.printStackTrace();
        com.meituan.android.yoda.monitor.log.a.a("YodaRouterTransparentActivity", "handleWebCall, parse env error.", true);
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02bb, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a() {
        /*
            Method dump skipped, instructions count: 1292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.activity.YodaRouterTransparentActivity.a():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends c {
        public static ChangeQuickRedirect a;
        public int b;

        public a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "666aa300083e19e2db9634498b329239", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "666aa300083e19e2db9634498b329239");
            } else {
                this.b = i;
            }
        }

        @Override // com.meituan.android.yoda.plugins.c
        public final int getNetEnv() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8789ee9a98372718a1e1b595aaa4453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8789ee9a98372718a1e1b595aaa4453");
        } else if (this.g != null) {
            this.d.removeCallbacks(this.g);
            this.g = null;
        }
    }
}
