package com.sankuai.meituan.android.knb.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.dianping.networklog.c;
import com.dianping.titans.utils.PerformanceAnalysis;
import com.meituan.android.privacy.aop.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import com.sankuai.meituan.takeoutnew.util.aop.k;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseKNBWebViewActivity extends AppCompatActivity {
    private static final String TAG = "BaseKNBWebViewActivity";
    public static ChangeQuickRedirect changeQuickRedirect;
    private AbsActivityDelegate delegate;
    private IKNBWebCompat iknbWebCompat;
    protected KNBWebCompat mKnbWebCompat;

    public AbsActivityDelegate getActivityDelegate(Activity activity, ActionBar actionBar) {
        return null;
    }

    public void onWebCompatActivityCreated() {
    }

    public void onWebCompatCreated() {
    }

    public View onWebCompatViewCreated(View view) {
        return null;
    }

    public BaseKNBWebViewActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dc2489240ae8788db70b04e7164f38c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dc2489240ae8788db70b04e7164f38c");
            return;
        }
        this.mKnbWebCompat = null;
        this.iknbWebCompat = new IKNBWebCompat() { // from class: com.sankuai.meituan.android.knb.base.BaseKNBWebViewActivity.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.meituan.android.knb.base.IKNBWebCompat
            public void onWebCompatCreated() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "92f394d71a6dd286f5357d1bf796912b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "92f394d71a6dd286f5357d1bf796912b");
                    return;
                }
                BaseKNBWebViewActivity.this.mKnbWebCompat = BaseKNBWebViewActivity.this.delegate.mKnbWebCompat;
                BaseKNBWebViewActivity.this.onWebCompatCreated();
            }

            @Override // com.sankuai.meituan.android.knb.base.IKNBWebCompat
            public View onWebCompatViewCreated(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "51ce56b8a66f875862e202d4f4fac5e6", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "51ce56b8a66f875862e202d4f4fac5e6") : BaseKNBWebViewActivity.this.onWebCompatViewCreated(view);
            }

            @Override // com.sankuai.meituan.android.knb.base.IKNBWebCompat
            public void onWebCompatActivityCreated() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5f031dc33374d6925a95195e756a057f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5f031dc33374d6925a95195e756a057f");
                } else {
                    BaseKNBWebViewActivity.this.onWebCompatActivityCreated();
                }
            }
        };
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d9a76a3591f62058d73e1ea7e88c902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d9a76a3591f62058d73e1ea7e88c902");
        } else if (!isTaskAvailable(this, "onCreate")) {
            c.a("KNBWebViewActivity.onCreate异常，taskId == -1", 35, new String[]{TAG});
        } else {
            super.onCreate(bundle);
            PerformanceAnalysis.getInstance().onActivityCreate();
            ActionBar supportActionBar = getSupportActionBar();
            this.delegate = getActivityDelegate(this, supportActionBar);
            if (this.delegate == null) {
                this.delegate = new BaseActivityDelegate(this, supportActionBar, this.iknbWebCompat);
            }
            this.delegate.onCreate(bundle);
            if (isTaskAvailable(this, "onCreate")) {
                return;
            }
            c.a("KNBWebViewActivity.onCreate异常，taskId == -1", 35, new String[]{TAG});
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d84f9157987baa234ad17de648471e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d84f9157987baa234ad17de648471e9");
        } else if (!isTaskAvailable(this, "onPostCreate")) {
            c.a("KNBWebViewActivity.onPostCreate异常，taskId == -1", 35, new String[]{TAG});
        } else {
            super.onPostCreate(bundle);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61497f0771f13b5238ebb7a1fac9b6dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61497f0771f13b5238ebb7a1fac9b6dd");
            return;
        }
        super.onStart();
        this.delegate.onStart();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f653f4accad4ee2487431e040a664bf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f653f4accad4ee2487431e040a664bf5");
        } else if (!isTaskAvailable(this, "onResume")) {
            c.a("KNBWebViewActivity.onResume异常，taskId == -1", 35, new String[]{TAG});
        } else {
            try {
                super.onResume();
            } catch (Throwable th) {
                c.a("onResume: " + Log.getStackTraceString(th), 35, new String[]{TAG});
                if (Build.VERSION.SDK_INT > 23 && Build.VERSION.SDK_INT <= 28) {
                    handleOnResumeException();
                    th.printStackTrace();
                }
            }
            this.delegate.onResume();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23109043385b614c5a86202ab9b29fb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23109043385b614c5a86202ab9b29fb3");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.delegate.onSaveInstanceState(bundle);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6f1b08adb6b1d55426f020a51ff0834", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6f1b08adb6b1d55426f020a51ff0834");
            return;
        }
        super.onPause();
        this.delegate.onPause();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ccd58c83246a24324513f6b6922b2c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ccd58c83246a24324513f6b6922b2c4");
            return;
        }
        super.onStop();
        this.delegate.onStop();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32b25f534ee93b233f27b58719c27304", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32b25f534ee93b233f27b58719c27304");
            return;
        }
        super.onDestroy();
        this.delegate.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "477b89609ee9a437db328eb2b2c5a8b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "477b89609ee9a437db328eb2b2c5a8b0");
            return;
        }
        a.a();
        super.onActivityResult(i, i2, intent);
        this.delegate.onActivityResult(i, i2, intent);
        a.b();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1935f645e45911f4b1f788177cc5c697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1935f645e45911f4b1f788177cc5c697");
        } else if (f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            this.delegate.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "159d6c4bc832df52a1e1e4e26a89fc1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "159d6c4bc832df52a1e1e4e26a89fc1e");
        } else {
            this.delegate.onBackPressed();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff89becfe8ac59d7ae23710a6f0493d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff89becfe8ac59d7ae23710a6f0493d2");
            return;
        }
        super.onPostResume();
        this.delegate.onPostResume();
    }

    public static boolean isTaskAvailable(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "957cf4a848d2b8618b02636232dd5bc9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "957cf4a848d2b8618b02636232dd5bc9")).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        if (activity.getTaskId() == -1) {
            if (Build.VERSION.SDK_INT > 23) {
                c.a(activity.getClass().getName() + "#" + str + " ： 系统 > 6.0时，若栈id无效，则直接关闭", 35, new String[]{TAG});
                k.b(Process.myPid());
            } else {
                c.a(activity.getClass().getName() + "#" + str + " ： 系统 <= 6.0时，若栈id无效，则直接关闭", 35, new String[]{TAG});
                activity.finish();
            }
            return false;
        }
        return true;
    }

    private void handleOnResumeException() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df18b2a005c651f07f210ccba2c81c5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df18b2a005c651f07f210ccba2c81c5d");
            return;
        }
        try {
            Field declaredField = Activity.class.getDeclaredField("mCalled");
            declaredField.setAccessible(true);
            declaredField.setBoolean(this, true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
