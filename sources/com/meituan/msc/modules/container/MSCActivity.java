package com.meituan.msc.modules.container;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.weaver.interfaces.ffp.FFPTags;
import com.meituan.msc.util.perf.PerfEventRecorder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@SuppressLint({"GoogleAppIndexingApiWarning"})
/* loaded from: classes3.dex */
public class MSCActivity extends MSCBaseActivity implements FFPTags, r {
    public static ChangeQuickRedirect f;
    private final String[] a;
    private final List<com.meituan.msc.util.perf.g> b;
    private boolean c;
    protected b g;
    protected boolean h;
    protected String i;

    public boolean a() {
        return false;
    }

    @Override // com.meituan.msc.modules.container.r
    public final Activity c() {
        return this;
    }

    @Override // com.meituan.msc.modules.container.r
    public final boolean d() {
        return true;
    }

    @Override // com.meituan.msc.modules.container.r
    public final boolean e() {
        return true;
    }

    public MSCActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "083e53a88908db3ea09c56818c595a6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "083e53a88908db3ea09c56818c595a6c");
            return;
        }
        this.a = new String[]{"SCH-I959"};
        this.g = new b();
        this.b = new ArrayList();
        this.c = false;
    }

    private void a(PerfEventRecorder perfEventRecorder) {
        Object[] objArr = {perfEventRecorder};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b5d2646bcdce393ddec6900f9abe123", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b5d2646bcdce393ddec6900f9abe123");
        } else if (this.b.size() > 0) {
            for (com.meituan.msc.util.perf.g gVar : this.b) {
                perfEventRecorder.a(gVar);
            }
            this.b.clear();
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be913e8e7ddd72998c1a684feed5a68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be913e8e7ddd72998c1a684feed5a68");
            return;
        }
        com.meituan.msc.modules.engine.h a = this.g.a();
        if (a == null) {
            this.b.add(new com.meituan.msc.util.perf.g(str, ErrorCode.ERROR_TYPE_B));
            return;
        }
        PerfEventRecorder perfEventRecorder = a.o;
        a(perfEventRecorder);
        perfEventRecorder.a(str);
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc41a093ca3fe3d3b9dd5688eab2dd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc41a093ca3fe3d3b9dd5688eab2dd1");
            return;
        }
        com.meituan.msc.modules.engine.h a = this.g.a();
        if (a == null) {
            this.b.add(new com.meituan.msc.util.perf.g(str, "E"));
            return;
        }
        PerfEventRecorder perfEventRecorder = a.o;
        a(perfEventRecorder);
        perfEventRecorder.b(str);
    }

    public final b m() {
        return this.g;
    }

    @Override // com.meituan.msc.modules.container.r
    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7535beb8d2f8b33eb321236a544810c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7535beb8d2f8b33eb321236a544810c3");
        }
        b bVar = this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        return PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "eddddd1905d4a796fa1ba102365ea324", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "eddddd1905d4a796fa1ba102365ea324") : b.a(bVar.H());
    }

    @Override // com.meituan.msc.modules.container.r
    @Nullable
    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef96b91cd6e37fa4281447b60d32873e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef96b91cd6e37fa4281447b60d32873e") : this.g.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0136, code lost:
        if (com.sankuai.waimai.platform.utils.f.a(getIntent(), com.dianping.titans.utils.Constants.MULTI_PROCESS_PID, 0) != android.os.Process.myPid()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015b, code lost:
        if ((r0 - com.sankuai.waimai.platform.utils.f.a(getIntent(), "intentSendTime", r0)) > 10000) goto L87;
     */
    @Override // com.meituan.msc.modules.container.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    @android.annotation.SuppressLint({"ObsoleteSdkInt"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.container.MSCActivity.onCreate(android.os.Bundle):void");
    }

    private void a(boolean z) {
        com.meituan.msc.modules.engine.j jVar;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff3b8ff93cfadb63749d28cdd1e103d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff3b8ff93cfadb63749d28cdd1e103d6");
        } else if (!com.meituan.msc.common.utils.y.a(getIntent(), "reuseActivity", false) || this.g == null || this.g.f == null || (jVar = this.g.f.p) == null) {
        } else {
            jVar.a("msc.activity.start.reuse").a(z ? 1.0d : 0.0d).a("calledByMSCActivity", com.meituan.msc.common.utils.b.a(this)).b();
        }
    }

    @Override // com.meituan.msc.modules.container.r
    public final View g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a978a3e2e09840f320d321cc35e0d22", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a978a3e2e09840f320d321cc35e0d22") : findViewById(16908290);
    }

    @Override // com.meituan.msc.modules.container.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fc6d424f20d63b919fb33e0c5b6840d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fc6d424f20d63b919fb33e0c5b6840d");
            return;
        }
        if (!this.h) {
            this.g.r();
        }
        super.onDestroy();
    }

    @Override // com.meituan.msc.modules.container.LifecycleActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e5e1773ea838893f42cf4f5eb44d683", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e5e1773ea838893f42cf4f5eb44d683");
            return;
        }
        super.onWindowFocusChanged(z);
        this.g.a(z);
    }

    @Override // com.meituan.msc.modules.container.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff33086acf0a7a7e50443ef91bf68180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff33086acf0a7a7e50443ef91bf68180");
            return;
        }
        a("container_will_appear");
        super.onStart();
        this.g.f();
        b("container_will_appear");
    }

    @Override // com.meituan.msc.modules.container.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efe551f73d1990ffe319d72d7b48bbeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efe551f73d1990ffe319d72d7b48bbeb");
            return;
        }
        super.onStop();
        this.g.g();
    }

    @Override // com.meituan.msc.modules.container.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2460c8bad93e270ea1f274725b914032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2460c8bad93e270ea1f274725b914032");
            return;
        }
        a("container_did_appear");
        this.c = false;
        if (Build.VERSION.SDK_INT <= 23 || !com.meituan.msc.common.utils.b.b(this)) {
            super.onResume();
            this.g.n();
            b("container_did_appear");
        }
    }

    @Override // com.meituan.msc.modules.container.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93acf765c61b368b154cbac74061439e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93acf765c61b368b154cbac74061439e");
            return;
        }
        super.onPause();
        this.c = true;
        this.g.o();
    }

    @Override // com.meituan.msc.modules.container.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ed3120dcb856d033d803caab2bebf21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ed3120dcb856d033d803caab2bebf21");
            return;
        }
        this.g.f(bundle);
        super.onSaveInstanceState(bundle);
        if (com.meituan.msc.common.config.b.G() || Build.VERSION.SDK_INT < 24) {
            return;
        }
        bundle.remove("android:viewHierarchyState");
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a21804dee9ea211cd5f277544e4200ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a21804dee9ea211cd5f277544e4200ea");
        }
        return getClass().getSimpleName() + "{appId=" + this.i + ", activityId=" + this.g.K + '}';
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72577b06c3cd4c1cabe80d1f43407a62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72577b06c3cd4c1cabe80d1f43407a62");
            return;
        }
        super.onNewIntent(intent);
        com.meituan.msc.modules.reporter.g.d("MSCActivity", this, "onNewIntent");
        this.g.z = true;
        if (this.g.c(intent) && (intent.getFlags() & 67108864) != 0) {
            overridePendingTransition(0, 0);
        }
        a(true);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "985b97ce27c068d948524a459b907e2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "985b97ce27c068d948524a459b907e2f");
        } else if (this.g.p()) {
        } else {
            super.onBackPressed();
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b2a72d0bfbb3d6c57cf177c105f838e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b2a72d0bfbb3d6c57cf177c105f838e");
            return;
        }
        com.meituan.msc.extern.i.a().a(this.g.v(), getIntent());
        com.meituan.msc.modules.reporter.g.b("MSCActivity", "handleCloseApp");
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae2293b61b61db3d76c5527edc366dc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae2293b61b61db3d76c5527edc366dc1");
            return;
        }
        this.g.B = true;
        n();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c98ba8b566cbd19ffeb46757ad2f666", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c98ba8b566cbd19ffeb46757ad2f666");
        } else {
            this.g.x();
        }
    }

    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40b6722f2340ee7c42a171545fb448b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40b6722f2340ee7c42a171545fb448b9");
        } else {
            super.finish();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.BaseFragmentActivityApi16, android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle) {
        Object[] objArr = {intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d21e41a6731438dbcd7d4bdcb5d6c663", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d21e41a6731438dbcd7d4bdcb5d6c663");
        } else {
            super.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8c87862059d5fdac2fe25c9ccaebf93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8c87862059d5fdac2fe25c9ccaebf93");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        this.g.a(i, i2, intent);
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.meituan.msc.modules.container.r
    public final Intent a(@NonNull String str, @Nullable Bundle bundle) {
        Object[] objArr = {str, bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "857e17c7632bd5f67b8db1677e543fc7", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "857e17c7632bd5f67b8db1677e543fc7") : b.a(str, bundle);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a7797fb66bf0a0240f47bc81b355d4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a7797fb66bf0a0240f47bc81b355d4e");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            this.g.a(i, strArr, iArr);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        Object[] objArr = {broadcastReceiver};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09a4dbd10fb3c7700fac90649406099e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09a4dbd10fb3c7700fac90649406099e");
            return;
        }
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (Exception e) {
            com.meituan.msc.modules.reporter.g.e("MSCActivity", "unregisterReceiver ", e);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f26c7b5a1bd37e3e99c646aeebad8eef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f26c7b5a1bd37e3e99c646aeebad8eef");
            return;
        }
        super.onTrimMemory(i);
        this.g.a(i);
    }

    @Override // com.meituan.msc.modules.container.r
    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6d64ba30158fab76a766a585a3595b3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6d64ba30158fab76a766a585a3595b3") : this.g.d();
    }

    @Keep
    public static void launch(@NonNull Context context, @NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z, @Nullable String str7, @Nullable String str8) {
        Object[] objArr = {context, str, str2, str3, str4, str5, str6, Byte.valueOf(z ? (byte) 1 : (byte) 0), str7, str8};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79657abba4e541f6b3c2f02ea5373a2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79657abba4e541f6b3c2f02ea5373a2c");
        } else if (context == null || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("context, appId are not null");
        } else {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, MSCActivity.class));
            intent.putExtra("appId", str);
            intent.putExtra("appName", str3);
            intent.putExtra("appIcon", str4);
            intent.putExtra("reload", z);
            intent.putExtra("srcAppId", str7);
            intent.putExtra("extraData", str8);
            intent.putExtra("targetPath", str5);
            intent.putExtra("shareEnv", str6);
            intent.addFlags(com.tencent.mapsdk.internal.y.a);
            intent.putExtra("pushStyle", 1);
            context.startActivity(intent);
        }
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb8417ca6a72750ab56a8bb93ddc9d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Resources.Theme) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb8417ca6a72750ab56a8bb93ddc9d5");
        }
        for (String str : this.a) {
            if (Build.MODEL.equalsIgnoreCase(str)) {
                Resources.Theme theme = super.getTheme();
                theme.applyStyle(R.style.MSCThemeResetPadding, true);
                return theme;
            }
        }
        List<String> r = com.meituan.msc.common.config.b.r();
        if (r == null || r.isEmpty()) {
            return super.getTheme();
        }
        if (r.contains(Build.BRAND)) {
            Resources.Theme theme2 = super.getTheme();
            theme2.applyStyle(R.style.MSCThemeResetPadding, true);
            return theme2;
        }
        return super.getTheme();
    }

    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488494dec8616dd08a36880fc615ddc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488494dec8616dd08a36880fc615ddc2");
        } else {
            this.g.s();
        }
    }

    @Override // com.meituan.msc.modules.container.r
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08679a05224fb3a918181d1f28697384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08679a05224fb3a918181d1f28697384");
        } else {
            this.g.l();
        }
    }

    public final void a(String str, int i, Throwable th) {
        Object[] objArr = {str, Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46862da229e25713ff9e68d395fc8887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46862da229e25713ff9e68d395fc8887");
        } else {
            this.g.c(str, i, th);
        }
    }

    public final int p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0eb9f8e6e7aea449dc80ff70101684d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0eb9f8e6e7aea449dc80ff70101684d")).intValue();
        }
        if (this.g == null) {
            return hashCode();
        }
        return this.g.K;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPTags
    @NonNull
    @Deprecated
    public Map<String, Object> ffpTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c08a79ebb12c8d62d8499ec6a471fc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c08a79ebb12c8d62d8499ec6a471fc9");
        }
        if (com.meituan.msc.modules.page.view.d.b) {
            return Collections.emptyMap();
        }
        Map<String, Object> y = this.g != null ? this.g.y() : null;
        return y == null ? Collections.emptyMap() : y;
    }

    @Override // com.meituan.msc.modules.container.r
    @Nullable
    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f56e824e043ce23b50109090c0e9b0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f56e824e043ce23b50109090c0e9b0c");
        }
        if (this.g == null) {
            return null;
        }
        return this.g.i();
    }

    @Override // com.meituan.msc.modules.container.r
    public final Map<String, String> j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d44067cd8c04d903b29e903db7c54e98", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d44067cd8c04d903b29e903db7c54e98");
        }
        if (this.g == null) {
            return null;
        }
        return this.g.j();
    }
}
