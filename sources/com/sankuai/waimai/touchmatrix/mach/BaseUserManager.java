package com.sankuai.waimai.touchmatrix.mach;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.touchmatrix.dialog.e;
import com.tencent.mapsdk.internal.y;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseUserManager {
    public static ChangeQuickRedirect b;
    public static AtomicBoolean d = new AtomicBoolean(false);
    private String a;
    protected ArrayList<com.sankuai.waimai.foundation.core.service.user.b> c;
    protected IntentFilter e;
    protected BindPhoneBroadcastReceiver f;

    public static /* synthetic */ void a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c096c096f74b4c8215c1803ce921cf13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c096c096f74b4c8215c1803ce921cf13");
            return;
        }
        if (AnonymousClass2.a[aVar.ordinal()] == 1) {
            com.dianping.mainboard.a.b().a(true);
        } else {
            com.dianping.mainboard.a.b().a(false);
        }
        User user = d().getUser();
        com.dianping.mainboard.a.b().a(user != null ? user.id : 0L);
    }

    public BaseUserManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be7898c55d38cb1665267d5fb568b974", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be7898c55d38cb1665267d5fb568b974");
            return;
        }
        this.a = "";
        this.c = new ArrayList<>();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0212002bbdd57f3117864a1deb5cbc22", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0212002bbdd57f3117864a1deb5cbc22")).booleanValue() : d().isLogin();
    }

    public final synchronized void a(com.sankuai.waimai.foundation.core.service.user.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cced4356ed71007c494648429456e135", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cced4356ed71007c494648429456e135");
        } else if (bVar == null) {
            throw new NullPointerException();
        } else {
            if (this.c == null) {
                this.c = new ArrayList<>();
            }
            if (!this.c.contains(bVar)) {
                this.c.add(bVar);
            }
        }
    }

    public final synchronized void b(com.sankuai.waimai.foundation.core.service.user.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab43ef87fe7071d24a7b6d3e1e239e5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab43ef87fe7071d24a7b6d3e1e239e5f");
            return;
        }
        if (this.c == null) {
            this.c = new ArrayList<>();
        }
        this.c.remove(bVar);
    }

    public final void a(b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9750fef4b5373f8d7a8922bb6c19212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9750fef4b5373f8d7a8922bb6c19212");
        } else if (this.c != null) {
            Object[] array = this.c.toArray();
            for (int length = array.length - 1; length >= 0; length--) {
                ((com.sankuai.waimai.foundation.core.service.user.b) array[length]).onAccountInfoUpdate(enumC0948b);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.touchmatrix.mach.BaseUserManager$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass2 {
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

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements com.sankuai.waimai.foundation.core.service.user.b {
        public static ChangeQuickRedirect e;

        @Override // com.sankuai.waimai.foundation.core.service.user.b
        public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        }

        @Override // com.sankuai.waimai.foundation.core.service.user.b
        public void onChanged(b.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b87e5e86e821c319cb41754969ba12d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b87e5e86e821c319cb41754969ba12d");
                return;
            }
            e.a().b(this);
            BaseUserManager.a(aVar);
        }
    }

    public static void a(@NonNull Context context) {
        Intent intent;
        Intent intent2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43fecdda1f7cad9607622a93c1f9add9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43fecdda1f7cad9607622a93c1f9add9");
        } else if (!(context instanceof Activity)) {
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "847ad594052ca07380663490a9bb4358", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "847ad594052ca07380663490a9bb4358");
                return;
            }
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "307a4e758cf48f7c52d368d4e6e80dcf", RobustBitConfig.DEFAULT_VALUE)) {
                intent = (Intent) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "307a4e758cf48f7c52d368d4e6e80dcf");
            } else {
                intent = new Intent("com.meituan.android.intent.action.login");
                if (context != null) {
                    intent.setPackage(context.getPackageName());
                    intent.putExtra("partner", 4);
                }
            }
            intent.addFlags(y.a);
            context.startActivity(intent);
        } else {
            Activity activity = (Activity) context;
            Object[] objArr4 = {activity};
            ChangeQuickRedirect changeQuickRedirect4 = b;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "7930b7cca4fcff9b96c0507d9b6bfd35", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "7930b7cca4fcff9b96c0507d9b6bfd35");
                return;
            }
            Object[] objArr5 = {activity};
            ChangeQuickRedirect changeQuickRedirect5 = b;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "5c9808e518acf06751e9efdf77206912", RobustBitConfig.DEFAULT_VALUE)) {
                intent2 = (Intent) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "5c9808e518acf06751e9efdf77206912");
            } else {
                intent2 = new Intent("com.meituan.android.intent.action.login");
                if (activity != null && !activity.isFinishing()) {
                    intent2.setPackage(activity.getPackageName());
                    intent2.putExtra("partner", 4);
                }
            }
            activity.startActivity(intent2);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.touchmatrix.mach.BaseUserManager$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Runnable b;
        public final /* synthetic */ Runnable c;
        public final /* synthetic */ Runnable d;

        @Override // com.sankuai.waimai.touchmatrix.mach.BaseUserManager.a, com.sankuai.waimai.foundation.core.service.user.b
        public final void onChanged(b.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c100617a13041584289376fa2aec347", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c100617a13041584289376fa2aec347");
                return;
            }
            super.onChanged(aVar);
            BaseUserManager.d.set(false);
            switch (AnonymousClass2.a[aVar.ordinal()]) {
                case 1:
                    if (this.b != null) {
                        this.b.run();
                        return;
                    }
                    return;
                case 2:
                    if (this.c != null) {
                        this.c.run();
                        return;
                    }
                    return;
                case 3:
                    if (this.d != null) {
                        this.d.run();
                        return;
                    }
                    return;
                default:
                    BaseUserManager.d.set(false);
                    return;
            }
        }
    }

    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fba4f337d678353ed8a5f48646476ad5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fba4f337d678353ed8a5f48646476ad5")).longValue();
        }
        User user = d().getUser();
        if (user != null) {
            return user.id;
        }
        return 0L;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class BindPhoneBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        private BindPhoneBroadcastReceiver() {
            Object[] objArr = {BaseUserManager.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eac74501642f30df5e383da4b31d0e7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eac74501642f30df5e383da4b31d0e7");
            }
        }

        public /* synthetic */ BindPhoneBroadcastReceiver(BaseUserManager baseUserManager, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d51e07e3e11827eae06307179cc9404", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d51e07e3e11827eae06307179cc9404");
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
                    e.a().a(b.EnumC0948b.PHONE);
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
            }
        }
    }

    public static UserCenter d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d211513d60bde50900eb934a274b503", RobustBitConfig.DEFAULT_VALUE) ? (UserCenter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d211513d60bde50900eb934a274b503") : UserCenter.getInstance(com.meituan.android.singleton.b.a);
    }
}
