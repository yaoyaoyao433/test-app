package com.sankuai.waimai.imbase;

import android.app.Activity;
import android.content.Context;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.network.setting.e;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements com.sankuai.waimai.imbase.a {
    public static ChangeQuickRedirect a;
    private static final a e = new a();
    public com.sankuai.waimai.imbase.a b;
    public int c;
    public boolean d;

    @Override // com.sankuai.waimai.imbase.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "674ae37f8db7d15fdc297e5d6a8af8a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "674ae37f8db7d15fdc297e5d6a8af8a7");
        } else {
            a("onAppToForeground").a();
        }
    }

    @Override // com.sankuai.waimai.imbase.a
    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0baf941f5abe1caaf265631f093a3d01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0baf941f5abe1caaf265631f093a3d01");
        } else {
            a("startMainActivity").a(activity);
        }
    }

    @Override // com.sankuai.waimai.imbase.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ace93b1ffb164b2ea75269b7f03df8c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ace93b1ffb164b2ea75269b7f03df8c2");
        } else {
            a("setUserDxId").a(j);
        }
    }

    @Override // com.sankuai.waimai.imbase.a
    public final boolean b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f9e83002c56154a09486b533efd64b8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f9e83002c56154a09486b533efd64b8")).booleanValue() : a("canPushShow").b(activity);
    }

    @Override // com.sankuai.waimai.imbase.a
    public final void a(Context context, String str, String str2, String str3, int i, JSONObject jSONObject) {
        Object[] objArr = {context, str, str2, str3, Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8d003153dbba29f341ec361c0ca2a97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8d003153dbba29f341ec361c0ca2a97");
        } else {
            a("sendOutPushNotification").a(context, str, str2, str3, i, jSONObject);
        }
    }

    @Override // com.sankuai.waimai.imbase.a
    public final void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15624f3a7507839407c7f0c71601b7a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15624f3a7507839407c7f0c71601b7a5");
        } else {
            a("readUploadPushClick").a(j, str);
        }
    }

    @Override // com.sankuai.waimai.imbase.a
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29810326ce3a0de9a51358fbc6e3bb2e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29810326ce3a0de9a51358fbc6e3bb2e") : a("getPushToken").b();
    }

    @Override // com.sankuai.waimai.imbase.a
    public final e c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5230baa61e42d872d7eabf4d750d1be", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5230baa61e42d872d7eabf4d750d1be") : a("getDxSdkHost").c();
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "458702c8c0a6c9d7ff6527218bfbd63c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "458702c8c0a6c9d7ff6527218bfbd63c");
            return;
        }
        this.c = 0;
        this.d = true;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.imbase.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0956b {
        private static final b a = new b();
    }

    public static b d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "067be676af96b07f47e14826c56ec2d5", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "067be676af96b07f47e14826c56ec2d5") : C0956b.a;
    }

    private com.sankuai.waimai.imbase.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b41506fab01a9e68889e7141f9e79f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.imbase.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b41506fab01a9e68889e7141f9e79f3");
        }
        if (this.b == null) {
            Metrics.storeCrash(new IllegalStateException("You must call IMHandlerManager#setWmImBizHandler before calling " + str + "!!(call count=" + this.c + " isNull=" + this.d + CommonConstant.Symbol.BRACKET_RIGHT), 1, MetricsActivityLifecycleManager.currentActivity, false);
            return e;
        }
        return this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements com.sankuai.waimai.imbase.a {
        @Override // com.sankuai.waimai.imbase.a
        public final void a() {
        }

        @Override // com.sankuai.waimai.imbase.a
        public final void a(long j) {
        }

        @Override // com.sankuai.waimai.imbase.a
        public final void a(long j, String str) {
        }

        @Override // com.sankuai.waimai.imbase.a
        public final void a(Activity activity) {
        }

        @Override // com.sankuai.waimai.imbase.a
        public final void a(Context context, String str, String str2, String str3, int i, JSONObject jSONObject) {
        }

        @Override // com.sankuai.waimai.imbase.a
        public final String b() {
            return "";
        }

        @Override // com.sankuai.waimai.imbase.a
        public final boolean b(Activity activity) {
            return false;
        }

        public a() {
        }

        @Override // com.sankuai.waimai.imbase.a
        public final e c() {
            return e.ENV_RELEASE;
        }
    }
}
