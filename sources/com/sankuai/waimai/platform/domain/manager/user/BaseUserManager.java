package com.sankuai.waimai.platform.domain.manager.user;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.utils.l;
import com.tencent.mapsdk.internal.y;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class BaseUserManager {
    public static ChangeQuickRedirect a;
    public static AtomicBoolean c = new AtomicBoolean(false);
    private static long g;
    protected ArrayList<com.sankuai.waimai.foundation.core.service.user.b> b;
    public String d;
    IntentFilter e;
    BindPhoneBroadcastReceiver f;

    public BaseUserManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07dbd705465e7b5807eda39deb34e9fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07dbd705465e7b5807eda39deb34e9fc");
            return;
        }
        this.d = "";
        this.b = new ArrayList<>();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c2a7f333c96bc2cbee3a1175fda5039", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c2a7f333c96bc2cbee3a1175fda5039");
        } else if (h().getUserId() != -1) {
            g = h().getUserId();
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "151248b9830638ab0d1684f01c230f9c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "151248b9830638ab0d1684f01c230f9c")).booleanValue() : h().isLogin();
    }

    public final User b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e355fdc0b103478a8bf2f932df750189", RobustBitConfig.DEFAULT_VALUE) ? (User) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e355fdc0b103478a8bf2f932df750189") : h().getUser();
    }

    public static long c() {
        return g;
    }

    public final synchronized void a(com.sankuai.waimai.foundation.core.service.user.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff203662cce29828ce0eacdf00ad709a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff203662cce29828ce0eacdf00ad709a");
        } else if (bVar == null) {
            throw new NullPointerException();
        } else {
            if (this.b == null) {
                this.b = new ArrayList<>();
            }
            if (!this.b.contains(bVar)) {
                this.b.add(bVar);
            }
        }
    }

    public final synchronized void b(com.sankuai.waimai.foundation.core.service.user.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c1739465c3a41f4f3ce7cd6b1405647", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c1739465c3a41f4f3ce7cd6b1405647");
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        this.b.remove(bVar);
    }

    public final void a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adfeb3271748b0866aef36dbe15bc3a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adfeb3271748b0866aef36dbe15bc3a3");
        } else if (this.b != null) {
            Object[] array = this.b.toArray();
            for (int length = array.length - 1; length >= 0; length--) {
                ((com.sankuai.waimai.foundation.core.service.user.b) array[length]).onChanged(aVar);
            }
            c(aVar);
        }
    }

    public final void a(b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9557e5865b0bf6f36f5937d6b45e7710", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9557e5865b0bf6f36f5937d6b45e7710");
        } else if (this.b != null) {
            Object[] array = this.b.toArray();
            for (int length = array.length - 1; length >= 0; length--) {
                ((com.sankuai.waimai.foundation.core.service.user.b) array[length]).onAccountInfoUpdate(enumC0948b);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.domain.manager.user.BaseUserManager$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] a = new int[b.a.valuesCustom().length];

        static {
            try {
                a[b.a.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.a.BIND_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.a.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.a.LOGOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41f231fc2772ae388c9dabbbf96d2e6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41f231fc2772ae388c9dabbbf96d2e6d");
            return;
        }
        if (AnonymousClass4.a[aVar.ordinal()] == 1) {
            com.dianping.mainboard.a.b().a(true);
        } else {
            com.dianping.mainboard.a.b().a(false);
        }
        User user = h().getUser();
        com.dianping.mainboard.a.b().a(user != null ? user.id : 0L);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements com.sankuai.waimai.foundation.core.service.user.b {
        public static ChangeQuickRedirect e;

        @Override // com.sankuai.waimai.foundation.core.service.user.b
        public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        }

        @Override // com.sankuai.waimai.foundation.core.service.user.b
        public void onChanged(b.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94503ff8acf783be015aff0c7c7dfec5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94503ff8acf783be015aff0c7c7dfec5");
                return;
            }
            com.sankuai.waimai.platform.domain.manager.user.a.i().b(this);
            BaseUserManager.c(aVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements com.sankuai.waimai.foundation.core.service.user.b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.foundation.core.service.user.b
        public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        }

        @Override // com.sankuai.waimai.foundation.core.service.user.b
        public final void onChanged(b.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3588cb3be606e5f664932baff180d4a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3588cb3be606e5f664932baff180d4a7");
            } else if (aVar == b.a.LOGIN) {
                long unused = BaseUserManager.g = BaseUserManager.h().getUserId();
            }
        }
    }

    public static void a(@NonNull Context context, long j, String str) {
        Object[] objArr = {context, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f7393c7ecc87b48f7158836885513c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f7393c7ecc87b48f7158836885513c2");
        } else if (c(context)) {
        } else {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Object[] objArr2 = {activity, new Long(j), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "560a09acf5154d62c9b1e9447e6736f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "560a09acf5154d62c9b1e9447e6736f6");
                    return;
                }
                Intent a2 = a(activity);
                a2.putExtra("poiid", String.valueOf(j));
                a2.putExtra(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
                a2.putExtra("needrisk", true);
                activity.startActivity(a2);
                return;
            }
            Object[] objArr3 = {context, new Long(j), str};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b3d55afef2a7b0b35f4f477da6bc98ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b3d55afef2a7b0b35f4f477da6bc98ab");
                return;
            }
            Intent b2 = b(context);
            b2.putExtra("poiid", String.valueOf(j));
            b2.putExtra(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
            b2.putExtra("needrisk", true);
            b2.addFlags(y.a);
            context.startActivity(b2);
        }
    }

    public static void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1694aca4749707a82a1b4a98755f22e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1694aca4749707a82a1b4a98755f22e");
        } else if (c(context)) {
        } else {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "517f710caf7dc3c88767dd18f6002029", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "517f710caf7dc3c88767dd18f6002029");
                    return;
                } else {
                    activity.startActivity(a(activity));
                    return;
                }
            }
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e7fd762944d42a3ae3f20e458df58caf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e7fd762944d42a3ae3f20e458df58caf");
                return;
            }
            Intent b2 = b(context);
            b2.addFlags(y.a);
            context.startActivity(b2);
        }
    }

    public static void a(@NonNull Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8abc8afd083f746272195457c3731424", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8abc8afd083f746272195457c3731424");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(bVar);
        a(context);
    }

    private static Intent a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd5bc0001088c47d374bde58614baeb4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd5bc0001088c47d374bde58614baeb4");
        }
        Intent intent = new Intent("com.meituan.android.intent.action.login");
        if (activity != null && !activity.isFinishing()) {
            intent.setPackage(activity.getPackageName());
            intent.putExtra("partner", 4);
        }
        return intent;
    }

    private static Intent b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c6341dc4800da11a6168c3aebde2c71", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c6341dc4800da11a6168c3aebde2c71");
        }
        Intent intent = new Intent("com.meituan.android.intent.action.login");
        if (context != null) {
            intent.setPackage(context.getPackageName());
            intent.putExtra("partner", 4);
        }
        return intent;
    }

    public static boolean a(Context context, @NonNull Runnable runnable) {
        Object[] objArr = {context, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75ba5d3a79b58a73aeea01d801f4bc76", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75ba5d3a79b58a73aeea01d801f4bc76")).booleanValue() : a(context, runnable, (Runnable) null);
    }

    public static boolean a(Context context, @NonNull Runnable runnable, @Nullable Runnable runnable2) {
        Object[] objArr = {context, runnable, runnable2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1eb7785504753583d0eaf1a5a525374e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1eb7785504753583d0eaf1a5a525374e")).booleanValue() : b(context, runnable, runnable2, null);
    }

    public static boolean a(Context context, @NonNull final Runnable runnable, @Nullable final Runnable runnable2, final Runnable runnable3) {
        Object[] objArr = {context, runnable, runnable2, runnable3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c6ffcbe84d65b7950926264dab103aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c6ffcbe84d65b7950926264dab103aa")).booleanValue();
        }
        if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            runnable.run();
            return true;
        }
        if (c.compareAndSet(false, true)) {
            a(context, new b() { // from class: com.sankuai.waimai.platform.domain.manager.user.BaseUserManager.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @Override // com.sankuai.waimai.platform.domain.manager.user.BaseUserManager.b, com.sankuai.waimai.foundation.core.service.user.b
                public final void onChanged(b.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef9cfb8b865cbd069fbb07e22b654cdf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef9cfb8b865cbd069fbb07e22b654cdf");
                        return;
                    }
                    super.onChanged(aVar);
                    BaseUserManager.c.set(false);
                    switch (AnonymousClass4.a[aVar.ordinal()]) {
                        case 1:
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        case 2:
                            if (runnable3 != null) {
                                runnable3.run();
                                return;
                            }
                            break;
                        case 3:
                            break;
                        default:
                            BaseUserManager.c.set(false);
                            return;
                    }
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            });
        }
        return false;
    }

    public static boolean b(Context context, @NonNull final Runnable runnable, @Nullable final Runnable runnable2, final Runnable runnable3) {
        Object[] objArr = {context, runnable, runnable2, runnable3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc9a4cb709f95b2ff3ad84bd13b339fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc9a4cb709f95b2ff3ad84bd13b339fb")).booleanValue();
        }
        if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            runnable.run();
            return true;
        }
        a(context, new b() { // from class: com.sankuai.waimai.platform.domain.manager.user.BaseUserManager.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.sankuai.waimai.platform.domain.manager.user.BaseUserManager.b, com.sankuai.waimai.foundation.core.service.user.b
            public final void onChanged(b.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca057246f761ae4b74e5fb6200c8b29c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca057246f761ae4b74e5fb6200c8b29c");
                    return;
                }
                super.onChanged(aVar);
                switch (AnonymousClass4.a[aVar.ordinal()]) {
                    case 1:
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    case 2:
                        if (runnable3 != null) {
                            runnable3.run();
                            return;
                        }
                        break;
                    case 3:
                        break;
                    default:
                        return;
                }
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        return false;
    }

    public final long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef4f00dd5305d1b17cf73073d97309a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef4f00dd5305d1b17cf73073d97309a6")).longValue();
        }
        User user = h().getUser();
        if (user != null) {
            return user.id;
        }
        return 0L;
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f35ba41c21969c8475ebe9e30f6d473", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f35ba41c21969c8475ebe9e30f6d473");
        }
        User user = h().getUser();
        return user != null ? user.token : this.d;
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a29c3e8f3f29f8638040cc3853b136d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a29c3e8f3f29f8638040cc3853b136d7");
        }
        User user = h().getUser();
        return user != null ? user.mobile : "";
    }

    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b1b466c9d6eef96bdf3000874d30f11", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b1b466c9d6eef96bdf3000874d30f11");
        }
        User user = h().getUser();
        return user != null ? user.username : "";
    }

    private static boolean c(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54038c94c3976fcf689921ac7085d54c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54038c94c3976fcf689921ac7085d54c")).booleanValue();
        }
        if (com.sankuai.waimai.platform.privacy.a.a().b()) {
            com.sankuai.waimai.platform.domain.manager.user.a.i().a(b.a.CANCEL);
            l.a(new Runnable() { // from class: com.sankuai.waimai.platform.domain.manager.user.BaseUserManager.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90e392d3d39a78ed5f463dc5e49fa4d7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90e392d3d39a78ed5f463dc5e49fa4d7");
                    } else {
                        com.sankuai.waimai.platform.privacy.a.a().a(context);
                    }
                }
            }, 500, "showPrivacyDialog");
            return true;
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class BindPhoneBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        private BindPhoneBroadcastReceiver() {
            Object[] objArr = {BaseUserManager.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6f500a2f1978217e8240a7c986e4fca", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6f500a2f1978217e8240a7c986e4fca");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "428783cdcd47a3e300ca8f91aebf7902", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "428783cdcd47a3e300ca8f91aebf7902");
            } else if (intent == null) {
            } else {
                String a2 = f.a(intent, "data");
                if (TextUtils.isEmpty(a2)) {
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(a2).getString("phone"))) {
                        return;
                    }
                    com.sankuai.waimai.platform.domain.manager.user.a.i().a(b.EnumC0948b.PHONE);
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
            }
        }
    }

    public static UserCenter h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "606cad16ad8bc19a0894805c86ddeb90", RobustBitConfig.DEFAULT_VALUE) ? (UserCenter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "606cad16ad8bc19a0894805c86ddeb90") : UserCenter.getInstance(com.meituan.android.singleton.b.a);
    }
}
