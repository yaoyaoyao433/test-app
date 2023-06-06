package com.meituan.mmp.lib;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
@SuppressLint({"GoogleAppIndexingApiWarning"})
/* loaded from: classes3.dex */
public class HeraActivity extends MMPBaseActivity implements o {
    public static ChangeQuickRedirect e;
    private final String[] a;
    protected a f;
    protected boolean g;
    protected String h;
    protected int i;
    protected String j;
    protected Intent k;

    public boolean b() {
        return false;
    }

    @Override // com.meituan.mmp.lib.o
    public final Activity e() {
        return this;
    }

    @Override // com.meituan.mmp.lib.o
    public final boolean f() {
        return true;
    }

    public HeraActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c296243b50187fcc924455d09fba994", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c296243b50187fcc924455d09fba994");
            return;
        }
        this.a = new String[]{"SCH-I959"};
        this.f = new a();
    }

    public final a d() {
        return this.f;
    }

    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d619232f8fa563fc1db53cd5ac31b9c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d619232f8fa563fc1db53cd5ac31b9c") : this.f.i();
    }

    @Nullable
    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce1f1bc9ff7bb5b458274f3d7a96e15e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce1f1bc9ff7bb5b458274f3d7a96e15e") : this.f.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
        if (com.sankuai.waimai.platform.utils.f.a(getIntent(), com.dianping.titans.utils.Constants.MULTI_PROCESS_PID, 0) != android.os.Process.myPid()) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d3, code lost:
        if ((r0 - com.sankuai.waimai.platform.utils.f.a(getIntent(), "intentSendTime", r0)) > 10000) goto L51;
     */
    @Override // com.meituan.mmp.lib.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    @android.annotation.SuppressLint({"ObsoleteSdkInt"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.HeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f375c5289f3f02fe09bc7020de9535fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f375c5289f3f02fe09bc7020de9535fd");
            return;
        }
        super.onConfigurationChanged(configuration);
        if (this.f != null) {
            this.f.a(configuration);
        }
    }

    @Override // com.meituan.mmp.lib.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8da9072c35e0ee1adb2918c3e0efa41b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8da9072c35e0ee1adb2918c3e0efa41b");
            return;
        }
        if (!this.g) {
            this.f.q();
        }
        this.f.E();
        super.onDestroy();
    }

    @Override // com.meituan.mmp.lib.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9d53cf1434f38739c3c20d4a7fc5a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9d53cf1434f38739c3c20d4a7fc5a9");
        } else if (Build.VERSION.SDK_INT <= 23 || !com.meituan.mmp.lib.utils.b.b(this)) {
            super.onResume();
            this.f.l();
        }
    }

    @Override // com.meituan.mmp.lib.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f790da23439f4cc43f5c19887fd6bc6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f790da23439f4cc43f5c19887fd6bc6f");
            return;
        }
        super.onPause();
        this.f.m();
    }

    @Override // com.meituan.mmp.lib.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00919ac781bea1d87c7e32a60e83125d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00919ac781bea1d87c7e32a60e83125d");
            return;
        }
        this.f.c(bundle);
        bundle.putInt("activityId", this.i);
        com.meituan.mmp.lib.trace.b.b("HeraActivity", "activityId saved: " + this.i);
        super.onSaveInstanceState(bundle);
    }

    public final int i() {
        return this.i;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06a5b31118d9e92eaa3bf7f0b6923abb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06a5b31118d9e92eaa3bf7f0b6923abb");
        }
        return getClass().getSimpleName() + "{appId=" + this.h + ", activityId=" + this.i + '}';
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        boolean b;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64f21587cb46c58d99cf10d22244d8a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64f21587cb46c58d99cf10d22244d8a0");
            return;
        }
        super.onNewIntent(intent);
        this.f.N = true;
        a aVar = this.f;
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2072ef32fe2f1d9b56b6eab40c022d74", RobustBitConfig.DEFAULT_VALUE)) {
            b = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2072ef32fe2f1d9b56b6eab40c022d74")).booleanValue();
        } else if (aVar.e.f()) {
            HeraActivity heraActivity = (HeraActivity) aVar.e;
            Object[] objArr3 = {intent};
            ChangeQuickRedirect changeQuickRedirect3 = e;
            b = PatchProxy.isSupport(objArr3, heraActivity, changeQuickRedirect3, false, "453167152e2712754348f30126e11320", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, heraActivity, changeQuickRedirect3, false, "453167152e2712754348f30126e11320")).booleanValue() : heraActivity.f.b(intent);
        } else {
            b = aVar.b(intent);
        }
        if (!b || (intent.getFlags() & 67108864) == 0) {
            return;
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0dfa7579ea21ee45dffb2ef343e426c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0dfa7579ea21ee45dffb2ef343e426c");
        } else if (this.f.n()) {
        } else {
            super.onBackPressed();
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a95d09fa292f66604954d7dadecdbf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a95d09fa292f66604954d7dadecdbf9");
            return;
        }
        com.meituan.mmp.main.y.a().a(this.f.A(), getIntent());
        com.meituan.mmp.lib.trace.b.b("HeraActivity", "handleCloseApp");
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0860000160e77ec84beb5656821b7d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0860000160e77ec84beb5656821b7d26");
            return;
        }
        n();
        this.f.O = true;
        j();
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "977bbfd27d1aa2d9fb53ed2084b036eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "977bbfd27d1aa2d9fb53ed2084b036eb");
        } else {
            super.finish();
        }
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae94ac24a345732f1ebce564d97fde3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae94ac24a345732f1ebce564d97fde3a");
            return;
        }
        Intent intent = this.k;
        if (intent == null) {
            intent = new Intent();
        }
        if (this.j != null) {
            intent.putExtra("extraData", this.j);
        }
        intent.putExtra("srcAppId", this.h);
        setResult(-1, intent);
    }

    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2ed7f6e578f8ccbfa3975a598f1f4af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2ed7f6e578f8ccbfa3975a598f1f4af");
            return;
        }
        this.k = intent;
        n();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13dfa1b7b94471741a8ca5631c4b6f32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13dfa1b7b94471741a8ca5631c4b6f32");
            return;
        }
        this.j = str;
        n();
    }

    public final String k() {
        return this.j;
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.BaseFragmentActivityApi16, android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle) {
        Object[] objArr = {intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "674ff98fd2016c07cc031178687bc3e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "674ff98fd2016c07cc031178687bc3e9");
        } else {
            super.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae0b7455a4e0fb0e8a19a61481168384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae0b7455a4e0fb0e8a19a61481168384");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        this.f.a(i, i2, intent);
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.meituan.mmp.lib.o
    public final Intent a(@NonNull String str, @Nullable Bundle bundle) {
        Object[] objArr = {str, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6be1db22e46cba1cebeec5d9a82dc7d5", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6be1db22e46cba1cebeec5d9a82dc7d5") : a.a(str, bundle);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aefc70ebf74a842e781e239923a30997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aefc70ebf74a842e781e239923a30997");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            this.f.a(i, strArr, iArr);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        Object[] objArr = {broadcastReceiver};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6abc103a0400040045bc8f83fd5ef187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6abc103a0400040045bc8f83fd5ef187");
            return;
        }
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (Exception e2) {
            com.meituan.mmp.lib.trace.b.c("HeraActivity", "unregisterReceiver " + e2.toString());
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30ff1467cf1594768630111ef11186a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30ff1467cf1594768630111ef11186a0");
            return;
        }
        super.onTrimMemory(i);
        this.f.a(i);
    }

    @Override // com.meituan.mmp.lib.o
    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3c3d354a1b5c0211ebb40ae9735b1e8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3c3d354a1b5c0211ebb40ae9735b1e8") : this.f.j();
    }

    @Keep
    public static void launch(@NonNull Context context, @NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z, @Nullable String str7, @Nullable String str8) {
        Object[] objArr = {context, str, str2, str3, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : (byte) 0), str7, str8};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "590870b7f63bfbacbf2070742adc6587", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "590870b7f63bfbacbf2070742adc6587");
        } else if (context == null || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("context, appId are not null");
        } else {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, RouterCenterActivity.class));
            intent.putExtra("appId", str);
            intent.putExtra("appName", str3);
            intent.putExtra("appIcon", str4);
            intent.putExtra("localAppPath", str2);
            intent.putExtra("reload", z);
            intent.putExtra("srcAppId", str7);
            intent.putExtra("extraData", str8);
            intent.putExtra("targetPath", str5);
            intent.putExtra("shareEnv", str6);
            intent.addFlags(com.tencent.mapsdk.internal.y.a);
            context.startActivity(intent);
        }
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "629370d2712bc8277ef2c799ed29a6ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (Resources.Theme) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "629370d2712bc8277ef2c799ed29a6ad");
        }
        for (String str : this.a) {
            if (Build.MODEL.equalsIgnoreCase(str)) {
                Resources.Theme theme = super.getTheme();
                theme.applyStyle(R.style.MMPThemeResetPadding, true);
                return theme;
            }
        }
        List<String> F = com.meituan.mmp.lib.config.b.F();
        if (F == null || F.isEmpty()) {
            return super.getTheme();
        }
        if (F.contains(Build.BRAND)) {
            Resources.Theme theme2 = super.getTheme();
            theme2.applyStyle(R.style.MMPThemeResetPadding, true);
            return theme2;
        }
        return super.getTheme();
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d840df49b877b8d79395327d078297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d840df49b877b8d79395327d078297");
        } else {
            this.f.s();
        }
    }

    public final void a(MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64ce11b76cf00dccbdf67ebcf26093ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64ce11b76cf00dccbdf67ebcf26093ac");
        } else {
            this.f.b(mMPAppProp);
        }
    }

    public final void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "207186b356262d4e0c6512539a22c079", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "207186b356262d4e0c6512539a22c079");
        } else {
            this.f.a(str, th);
        }
    }
}
