package com.meituan.android.paybase.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static final Boolean b = Boolean.FALSE;
    private static List<g> c;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Drawable drawable);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.paybase.utils.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0337f {
        void a(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface g {
        void a(Bitmap bitmap);
    }

    private static String b(Context context, String str) {
        String str2;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ee2ac461dd903bdf858e21cec8730be", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ee2ac461dd903bdf858e21cec8730be");
        }
        try {
            str2 = com.meituan.android.cipstorage.q.a(context, "finance_pay_cashier_router_channel", str + "_cashier.png").getAbsolutePath();
        } catch (Exception e2) {
            e = e2;
            str2 = null;
        }
        try {
        } catch (Exception e3) {
            e = e3;
            com.meituan.android.paybase.common.analyse.a.a(e, "CashierScreenSnapShotUtil_getPicFilePath", (Map<String, Object>) null);
            ae.a("cashier_screensnapshot_getpicfilepath_error", (Map<String, Object>) null, (List<Float>) null);
            HashMap hashMap = new HashMap();
            hashMap.put(KnbConstants.PARAMS_SCENE, "cashier_screensnapshot_getpicfilepath_error");
            ae.a(null, "b_pay_5l3pq2aw_sc", hashMap, "c_pay_dmfidr05", "com.meituan.android.paybase.utils.StatisticsUtils", true);
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        File file = new File(str2);
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            boolean mkdirs = file.getParentFile().mkdirs();
            if (b.booleanValue()) {
                Log.e("getPicFilePath", "mkdirs success " + mkdirs);
            }
        }
        return str2;
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c17f81825d54bca4eaf93a096cb7848c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c17f81825d54bca4eaf93a096cb7848c");
            return;
        }
        try {
            String b2 = b(context, str);
            if (TextUtils.isEmpty(b2)) {
                return;
            }
            File file = new File(b2);
            if (file.exists()) {
                boolean delete = file.delete();
                if (b.booleanValue()) {
                    Log.e("deleteCashierPic", "success " + delete);
                }
            }
        } catch (Exception e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, "CashierScreenSnapShotUtil_deleteCashierPic", (Map<String, Object>) null);
            ae.a("cashier_screensnapshot_deletecashierpic_error", (Map<String, Object>) null, (List<Float>) null);
            HashMap hashMap = new HashMap();
            hashMap.put(KnbConstants.PARAMS_SCENE, "cashier_screensnapshot_deletecashierpic_error");
            ae.a(null, "b_pay_5l3pq2aw_sc", hashMap, "c_pay_dmfidr05", "com.meituan.android.paybase.utils.StatisticsUtils", true);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class e extends rx.j<Boolean> {
        public static ChangeQuickRedirect a;

        @Override // rx.e
        public final void onCompleted() {
        }

        @Override // rx.e
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }

        public e() {
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d5888ec236825044924bccd3d37f85", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d5888ec236825044924bccd3d37f85");
                return;
            }
            com.meituan.android.paybase.common.analyse.a.a(th, "CashierScreenSnapShotUtil_CaptureSaveSubscriber_onError", (Map<String, Object>) null);
            ae.a("cashier_screensnapshot_capturesavesubscriber_error", (Map<String, Object>) null, (List<Float>) null);
            HashMap hashMap = new HashMap();
            hashMap.put(KnbConstants.PARAMS_SCENE, "cashier_screensnapshot_capturesavesubscriber_error");
            ae.a(null, "b_pay_5l3pq2aw_sc", hashMap, "c_pay_dmfidr05", "com.meituan.android.paybase.utils.StatisticsUtils", true);
        }
    }

    public static rx.k a(Activity activity, Bitmap bitmap, String str) {
        Object[] objArr = {activity, bitmap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d27efbc0bbaf9c767639ec9b1a18a271", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d27efbc0bbaf9c767639ec9b1a18a271");
        }
        if (activity.isFinishing()) {
            return null;
        }
        try {
            return rx.d.a(new e(), rx.d.a((d.a) new d(b(activity, str), bitmap)).b(rx.schedulers.a.e()));
        } catch (Exception e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, "CashierScreenSnapShotUtil_saveToDisk", (Map<String, Object>) null);
            ae.a("cashier_screensnapshot_savetodisk_error", (Map<String, Object>) null, (List<Float>) null);
            HashMap hashMap = new HashMap();
            hashMap.put(KnbConstants.PARAMS_SCENE, "cashier_screensnapshot_savetodisk_error");
            ae.a(null, "b_pay_5l3pq2aw_sc", hashMap, "c_pay_dmfidr05", "com.meituan.android.paybase.utils.StatisticsUtils", true);
            return null;
        }
    }

    public static rx.k a(Activity activity, String str, a aVar) {
        Object[] objArr = {activity, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a231b2d7dda67104bc317461fb68ae5", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a231b2d7dda67104bc317461fb68ae5");
        }
        if (aVar == null) {
            return null;
        }
        if (activity.isFinishing()) {
            aVar.a(null);
            return null;
        }
        try {
            return rx.d.a(new c(aVar), rx.d.a((d.a) new b(b(activity, str))).b(rx.schedulers.a.e()).a(1000L, TimeUnit.MILLISECONDS, (rx.d) null, rx.schedulers.a.d()).a(rx.android.schedulers.a.a()));
        } catch (Exception e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, "CashierScreenSnapShotUtil_getCashierSnapShotDrawable", (Map<String, Object>) null);
            ae.a("cashier_screensnapshot_get_snapshot_error", (Map<String, Object>) null, (List<Float>) null);
            HashMap hashMap = new HashMap();
            hashMap.put(KnbConstants.PARAMS_SCENE, "cashier_screensnapshot_get_snapshot_error");
            ae.a(null, "b_pay_5l3pq2aw_sc", hashMap, "c_pay_dmfidr05", "com.meituan.android.paybase.utils.StatisticsUtils", true);
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c extends rx.j<Drawable> {
        public static ChangeQuickRedirect a;
        private final a b;

        @Override // rx.e
        public final void onCompleted() {
        }

        @Override // rx.e
        public final /* synthetic */ void onNext(Object obj) {
            Drawable drawable = (Drawable) obj;
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f06689ef912fe5b7e2a1cda7f5a71fc9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f06689ef912fe5b7e2a1cda7f5a71fc9");
                return;
            }
            try {
                if (this.b != null) {
                    this.b.a(drawable);
                }
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "CashierScreenSnapShotUtil_CaptureReadSubscriber_onNext", (Map<String, Object>) null);
            }
        }

        public c(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "551c70b953a8c6211f779ab1836cddee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "551c70b953a8c6211f779ab1836cddee");
            } else {
                this.b = aVar;
            }
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbf685abc9fcbc64b7b02da0f36acb69", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbf685abc9fcbc64b7b02da0f36acb69");
                return;
            }
            com.meituan.android.paybase.common.analyse.a.a(th, "CashierScreenSnapShotUtil_CaptureReadSubscriber_onError", (Map<String, Object>) null);
            ae.a("cashier_screensnapshot_read_subscriber_error", (Map<String, Object>) null, (List<Float>) null);
            HashMap hashMap = new HashMap();
            hashMap.put(KnbConstants.PARAMS_SCENE, "cashier_screensnapshot_read_subscriber_error");
            ae.a(null, "b_pay_5l3pq2aw_sc", hashMap, "c_pay_dmfidr05", "com.meituan.android.paybase.utils.StatisticsUtils", true);
            try {
                if (this.b != null) {
                    this.b.a(null);
                }
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "CashierScreenSnapShotUtil_CaptureReadSubscriber_error", (Map<String, Object>) null);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b implements d.a<Drawable> {
        public static ChangeQuickRedirect a;
        private final String b;

        @Override // rx.functions.b
        public final /* synthetic */ void call(Object obj) {
            rx.j jVar = (rx.j) obj;
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4326a61091b562c641bec907a8dd4da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4326a61091b562c641bec907a8dd4da");
                return;
            }
            try {
                jVar.onStart();
                if (TextUtils.isEmpty(this.b)) {
                    jVar.onNext(null);
                    jVar.onCompleted();
                    return;
                }
                jVar.onNext(new BitmapDrawable(com.meituan.android.paybase.config.a.d().a().getResources(), com.sankuai.waimai.launcher.util.image.a.a(this.b, new BitmapFactory.Options())));
                jVar.onCompleted();
            } catch (Throwable th) {
                com.meituan.android.paybase.common.analyse.a.a(th, "CashierScreenSnapShotUtil_CaptureReadObservable", (Map<String, Object>) null);
                jVar.onError(th);
            }
        }

        public b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aa1aa796ab49dcce18f9fa5dc537ced", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aa1aa796ab49dcce18f9fa5dc537ced");
            } else {
                this.b = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class d implements d.a<Boolean> {
        public static ChangeQuickRedirect a;
        private final String b;
        private final Bitmap c;

        @Override // rx.functions.b
        public final /* synthetic */ void call(Object obj) {
            rx.j jVar = (rx.j) obj;
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2b05ccc9ef1101f0839e7d2ef543265", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2b05ccc9ef1101f0839e7d2ef543265");
                return;
            }
            try {
                jVar.onStart();
                if (this.c != null && !this.c.isRecycled() && !TextUtils.isEmpty(this.b)) {
                    this.c.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(new File(this.b)));
                    jVar.onNext(Boolean.TRUE);
                    jVar.onCompleted();
                    return;
                }
                jVar.onNext(Boolean.FALSE);
                jVar.onCompleted();
            } catch (Throwable th) {
                jVar.onError(th);
                com.meituan.android.paybase.common.analyse.a.a(th, "CashierScreenSnapShotUtil_CaptureReadObservable", (Map<String, Object>) null);
            }
        }

        public d(String str, Bitmap bitmap) {
            Object[] objArr = {str, bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "134f9c7a432f22999c270537487d457a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "134f9c7a432f22999c270537487d457a");
                return;
            }
            this.b = str;
            this.c = bitmap;
        }
    }

    public static void a(Activity activity, InterfaceC0337f interfaceC0337f) {
        Object[] objArr = {activity, interfaceC0337f};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4102c76c6fce9dae268a1841e3d969c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4102c76c6fce9dae268a1841e3d969c2");
        } else if (interfaceC0337f != null) {
            if (com.meituan.android.paybase.utils.e.a()) {
                interfaceC0337f.a(true);
            } else if (activity == null || activity.isFinishing()) {
                interfaceC0337f.a(false);
            } else {
                Window window = activity.getWindow();
                if (window == null) {
                    interfaceC0337f.a(false);
                } else if (window.getDecorView() == null) {
                    interfaceC0337f.a(false);
                } else {
                    try {
                        View decorView = activity.getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_4444);
                        createBitmap.setHasAlpha(true);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.drawColor(Color.parseColor("#99000000"));
                        decorView.draw(canvas);
                        if (i.a((Collection) c)) {
                            ae.a("cashier_screensnapshot_capturesnapshot_onbitmapreadylisteners", (Map<String, Object>) null, (List<Float>) null);
                            HashMap hashMap = new HashMap();
                            hashMap.put(KnbConstants.PARAMS_SCENE, "onbitmapreadylisteners_empty");
                            ae.a(null, "b_pay_5l3pq2aw_sc", hashMap, "c_pay_dmfidr05", "com.meituan.android.paybase.utils.StatisticsUtils", true);
                        } else {
                            for (g gVar : new ArrayList(c)) {
                                if (gVar != null) {
                                    gVar.a(createBitmap);
                                }
                            }
                        }
                        new Handler(Looper.getMainLooper()).postDelayed(com.meituan.android.paybase.utils.g.a(interfaceC0337f), 100L);
                    } catch (Throwable th) {
                        com.meituan.android.paybase.common.analyse.a.a(th, "CashierScreenSnapShotUtil_captureSnapShot", (Map<String, Object>) null);
                        interfaceC0337f.a(false);
                        ae.a("cashier_screensnapshot_capturesnapshot_error", (Map<String, Object>) null, (List<Float>) null);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(KnbConstants.PARAMS_SCENE, "cashier_screensnapshot_capturesnapshot_error");
                        ae.a(null, "b_pay_5l3pq2aw_sc", hashMap2, "c_pay_dmfidr05", "com.meituan.android.paybase.utils.StatisticsUtils", true);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(InterfaceC0337f interfaceC0337f) {
        Object[] objArr = {interfaceC0337f};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e0ec0ec267b6a693946a46bbd70c489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e0ec0ec267b6a693946a46bbd70c489");
        } else {
            interfaceC0337f.a(true);
        }
    }

    public static void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "181e51f97610e9fb3ea05e004f82c573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "181e51f97610e9fb3ea05e004f82c573");
            return;
        }
        if (c == null) {
            c = new ArrayList();
        }
        c.add(gVar);
    }

    public static void b(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "553a9497029bc9c564705899a9c4a7b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "553a9497029bc9c564705899a9c4a7b9");
        } else if (c == null) {
        } else {
            c.remove(gVar);
        }
    }
}
