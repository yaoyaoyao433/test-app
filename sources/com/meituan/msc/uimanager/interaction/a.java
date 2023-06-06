package com.meituan.msc.uimanager.interaction;

import android.os.Handler;
import android.text.TextUtils;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallUris;
import com.meituan.msc.jse.bridge.IRuntimeDelegate;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.modules.api.msi.api.PageBeforeUnloadParam;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.TitansBundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final List<String> i = Arrays.asList("redirectTo", "reLaunch", "navigateTo", "switchTab", "navigateBack", "navigateBackMiniProgram", "navigateToMiniProgram", PageBeforeUnloadParam.NAVIGATION_TYPE_EXITMINIPROGRAM, "navigateBackNative", "showShareMenu", "setNavigationBarTitle", "showNavigationBarLoading", "hideNavigationBarLoading", "setNavigationBarColor", "hideHomeButton", "setBackgroundColor", "setBackgroundTextStyle", "setTabBarBadge", "removeTabBarBadge", "showTabBarRedDot", "hideTabBarRedDot", "showTabBar", "hideTabBar", "setTabBarStyle", "setTabBarItem", "pageScrollTo", "hideKeyboard", "mtLogin", "mtLogout", "openSystemBluetoothSetting", "openAppAuthorizeSetting", "mtShare", "bindWXAccount", "mtRequestPayment", "openPaymentCommissionContract", "getRiskControlFingerprint", "yodaVerify", "openLink", "openPOILocation", "chooseInvoiceTitle", "showToast", "hideToast", TitansBundle.PARAM_SHOW_LOADING, "hideLoading", "showModal", "showActionSheet", "openLocation", "chooseLocation", "scanCode", "authorize", "openSetting", "makePhoneCall", "chooseAddress", "chooseImage", "previewImage", "chooseMedia", "chooseVideo", "previewMedia", "setScreenBrightness", "jumpToLink");
    public final ReactApplicationContext b;
    public final b c;
    public final int[] d;
    public final boolean e;
    public boolean f;
    public Set<String> g;
    public Set<String> h;
    private final int j;
    private final Handler k;
    private final Runnable l;

    public a(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edbec32ab78eaf1905365d970a65443f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edbec32ab78eaf1905365d970a65443f");
            return;
        }
        this.c = new b();
        this.d = new int[32];
        this.f = false;
        this.k = new Handler();
        this.g = new HashSet();
        this.h = new HashSet();
        this.l = new Runnable() { // from class: com.meituan.msc.uimanager.interaction.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "809b3644345c57b7a52665d884cb6067", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "809b3644345c57b7a52665d884cb6067");
                    return;
                }
                a.this.k.removeCallbacks(a.this.l);
                if (!a.this.d() || a.this.b.getRuntimeDelegate().isProdEnv()) {
                    return;
                }
                IRuntimeDelegate runtimeDelegate = a.this.b.getRuntimeDelegate();
                runtimeDelegate.toast("检测到无响应! Flag: " + a.this.c.c);
                g.b("[InteractionMonitor@run]", null, "检测到无响应! Flag: " + a.this.c.c);
            }
        };
        this.b = reactApplicationContext;
        this.j = reactApplicationContext.getRuntimeDelegate().getInteractionMonitorTimeWindow();
        int interactionMonitorSamplingRate = reactApplicationContext.getRuntimeDelegate().getInteractionMonitorSamplingRate();
        this.e = interactionMonitorSamplingRate != 0 && ((int) (Math.random() * 100.0d)) <= interactionMonitorSamplingRate;
        g.d("[InteractionMonitor@InteractionMonitor]", "rate:", Integer.valueOf(interactionMonitorSamplingRate), "shouldMonitorInteraction:", Boolean.valueOf(this.e));
    }

    public final void a(int i2, boolean z, String str) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac18ba3757e5850c026650ff057df220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac18ba3757e5850c026650ff057df220");
        } else if (b()) {
            if (z && !TextUtils.isEmpty(str)) {
                if (this.b.getRuntimeDelegate().interactionCallbackBlackListContains(str)) {
                    i3 = 1;
                } else {
                    i2 |= 4;
                    b(str);
                }
            }
            a(i2, "hasAttachedCallback: " + (z ? 1 : 0) + ", callbacks: " + str + ", blackListed: " + i3);
        }
    }

    public final void a(int i2, String str) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a0e83c843f63314a2dc81f26f90f2fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a0e83c843f63314a2dc81f26f90f2fe");
        } else if (b()) {
            boolean z2 = this.c.a != 0;
            boolean z3 = z2 && i2 != 16;
            boolean c = z3 ? c() : false;
            if (!z2 || (z3 && c)) {
                z = true;
            }
            if (z) {
                if (i2 == 8 || i2 == 16) {
                    return;
                }
                e();
            }
            int i3 = i2 & 31;
            if ((i3 & 4) == 0 && (this.c.c & i3) == i3) {
                return;
            }
            this.c.c |= i3;
            a("WINDOW_EVENT", a(i3), str);
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c62ea1031eab7f854e39df0c8042f35d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c62ea1031eab7f854e39df0c8042f35d")).booleanValue();
        }
        if (System.currentTimeMillis() - this.c.a > this.j) {
            a();
            return true;
        }
        return false;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c62c11a44f23ec37e69cc47c5f1bdbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c62c11a44f23ec37e69cc47c5f1bdbf");
            return;
        }
        boolean d = d();
        StringBuilder sb = new StringBuilder("FAILED:");
        sb.append(d ? this.g.toString() : StringUtil.NULL);
        a("WINDOW_CLOSE", sb.toString());
        int[] iArr = this.d;
        int i2 = this.c.c;
        iArr[i2] = iArr[i2] + 1;
        this.c.a = 0L;
        this.c.c = 0;
        if (d && this.h.size() < 20) {
            this.h.addAll(this.g);
        }
        this.g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        return this.c.c == 16 || this.c.c == 1 || this.c.c == 6 || this.c.c == 7;
    }

    public void b(int i2, String str) {
        Object[] objArr = {Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd5213c496759325c8b58f6e0f6602b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd5213c496759325c8b58f6e0f6602b8");
        } else {
            a(i2, str);
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d660cb1be2cee7c783b74006c99a446", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d660cb1be2cee7c783b74006c99a446");
            return;
        }
        this.c.a = System.currentTimeMillis();
        this.c.c = 0;
        this.c.b++;
        this.g.clear();
        a("WINDOW_OPEN");
        this.k.postDelayed(this.l, this.j);
    }

    public final boolean b() {
        return this.e && this.f;
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7560ae97c1ec3690144618b6a95a19d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7560ae97c1ec3690144618b6a95a19d0");
        } else {
            a(str, (String) null, (String) null);
        }
    }

    public void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac4e53585c2f0d3998680f655bb3c48c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac4e53585c2f0d3998680f655bb3c48c");
        } else {
            a(str, (String) null, str2);
        }
    }

    private void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a33a74aed0d44fd55f7bf37e78f2b7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a33a74aed0d44fd55f7bf37e78f2b7b");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        sb.append("PAGE_ID: ");
        sb.append(this.b.getRuntimeDelegate().getPageId());
        sb.append(" SEQ: ");
        sb.append(this.c.b);
        sb.append(" FLAG: ");
        sb.append(this.c.c);
        sb.append(" TIMESTAMP: ");
        sb.append(this.c.a);
        if (str2 != null) {
            sb.append(" INCOMING: ");
            sb.append(str2);
        }
        if (str3 != null) {
            sb.append(" INFO: ");
            sb.append(str3);
        }
        g.d("[INTERACTION]", sb);
    }

    private String a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "014ca2db1eb315c5953d508a4c43fe70", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "014ca2db1eb315c5953d508a4c43fe70");
        }
        if (i2 == 4 || i2 == 6) {
            return "BEGIN";
        }
        if (i2 != 8) {
            if (i2 != 16) {
                switch (i2) {
                    case 1:
                        return "SENT";
                    case 2:
                        return CSCallUris.SVID_CALL_ACK;
                    default:
                        return "UNKNOWN:" + i2;
                }
            }
            return "FAIL";
        }
        return "END";
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32244d01b54f0cd3bf9e4a659341b56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32244d01b54f0cd3bf9e4a659341b56");
        } else if (!b() || TextUtils.isEmpty(str)) {
        } else {
            this.g.add(str);
        }
    }
}
