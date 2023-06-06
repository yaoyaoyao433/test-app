package com.sankuai.waimai.store.drug.mrn;

import android.support.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.hhmedic.android.sdk.HHDoctor;
import com.hhmedic.android.sdk.listener.HHCallListener;
import com.hhmedic.android.sdk.listener.HHLoginListener;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.store.config.d;
import com.sankuai.waimai.store.drug.HHDoctorInit;
import com.sankuai.waimai.store.drug.TxEngine;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugMRNHHModule extends ReactContextBaseJavaModule {
    private static final TxEngine TX_ENGINE = new TxEngine();
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MEDVideoCallModule";
    }

    public DrugMRNHHModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0b951ee95f2e4f383ba2f3e581a2511", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0b951ee95f2e4f383ba2f3e581a2511");
        }
    }

    private void checkEngineBeforeUse(@NonNull final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbc74ecf3e94fb2320d8ef006a1490b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbc74ecf3e94fb2320d8ef006a1490b7");
        } else if (!isNewPlan()) {
            aVar.a();
        } else {
            TX_ENGINE.checkEngine(new TxEngine.a() { // from class: com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.drug.TxEngine.a
                public final void a(int i) {
                    Object[] objArr2 = {202};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3fa80730acb57afa407af2f8265ea010", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3fa80730acb57afa407af2f8265ea010");
                    }
                }

                @Override // com.sankuai.waimai.store.drug.TxEngine.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c62d9c242f750f35ac951b812d866265", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c62d9c242f750f35ac951b812d866265");
                        return;
                    }
                    HHDoctorInit.a(DrugMRNHHModule.this.getReactApplicationContext(), false);
                    aVar.a();
                }
            });
        }
    }

    private static boolean isNewPlan() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bee87945cbb23e5473ea47798e12a459", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bee87945cbb23e5473ea47798e12a459")).booleanValue() : d.h().a("hh/newPlay", true);
    }

    @ReactMethod
    public void loginHHDoctor(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6f212c4d7440a26d337ff28306962d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6f212c4d7440a26d337ff28306962d4");
        } else {
            checkEngineBeforeUse(new a() { // from class: com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.2
                public static ChangeQuickRedirect a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "998d32dcbf5b6ab045045d6db274b054", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "998d32dcbf5b6ab045045d6db274b054");
                    } else {
                        DrugMRNHHModule.this.loginHHDoctorAfterCheckEngine(str, promise);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loginHHDoctorAfterCheckEngine(String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a80c7aefdcefcae3f404018bad386d0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a80c7aefdcefcae3f404018bad386d0b");
            return;
        }
        try {
            HHDoctor.login(getReactApplicationContext(), str, new HHLoginListener() { // from class: com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.3
                public static ChangeQuickRedirect a;

                @Override // com.hhmedic.android.sdk.listener.HHLoginListener
                public final void onSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4564bcb2447ea55ebc8d23b637f47cd6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4564bcb2447ea55ebc8d23b637f47cd6");
                    } else {
                        promise.resolve("登录成功");
                    }
                }

                @Override // com.hhmedic.android.sdk.listener.HHLoginListener
                public final void onError(String str2) {
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f0b73120bd29645ad42f920193aef44f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f0b73120bd29645ad42f920193aef44f");
                    } else {
                        promise.reject("1", str2);
                    }
                }
            });
        } catch (Exception e) {
            com.sankuai.waimai.store.mrn.d.a(promise, e);
        }
    }

    @ReactMethod
    public void logOutHHDoctor(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4162073731d026718a9d21ee30ab11a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4162073731d026718a9d21ee30ab11a");
        } else {
            checkEngineBeforeUse(new a() { // from class: com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.4
                public static ChangeQuickRedirect a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bda4eb0a37c82cc86eb700ae911d54f7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bda4eb0a37c82cc86eb700ae911d54f7");
                    } else {
                        DrugMRNHHModule.this.logOutHHDoctorAfterCheckEngine(promise);
                    }
                }
            });
        }
    }

    public void logOutHHDoctorAfterCheckEngine(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "436fd1d413f834d152123b23d8f814f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "436fd1d413f834d152123b23d8f814f2");
            return;
        }
        try {
            HHDoctor.logOut(getReactApplicationContext());
            promise.resolve("退出成功");
        } catch (Exception e) {
            com.sankuai.waimai.store.mrn.d.a(promise, e);
        }
    }

    @ReactMethod
    public void setVideoCallExtension(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2fd54ce2ad11c3db00332856c47ef02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2fd54ce2ad11c3db00332856c47ef02");
        } else {
            checkEngineBeforeUse(new a() { // from class: com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.5
                public static ChangeQuickRedirect a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e8f235667c907fd37bc1d00403ac2188", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e8f235667c907fd37bc1d00403ac2188");
                    } else {
                        DrugMRNHHModule.this.setVideoCallExtensionAfterCheckEngine(str, promise);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoCallExtensionAfterCheckEngine(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dffae9136fc6f1500abb9ccecabd78b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dffae9136fc6f1500abb9ccecabd78b");
            return;
        }
        try {
            HHDoctor.setCallExtension(str);
        } catch (Exception e) {
            com.sankuai.waimai.store.mrn.d.a(promise, e);
        }
    }

    @ReactMethod
    public void getMedicDetailUrl(final String str, final String str2, final String str3, final Promise promise) {
        Object[] objArr = {str, str2, str3, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c7bc4accc0a720a9c83f65b1bb8d339", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c7bc4accc0a720a9c83f65b1bb8d339");
        } else {
            checkEngineBeforeUse(new a() { // from class: com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.6
                public static ChangeQuickRedirect a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e027c8fe9324960452b23d267dca135a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e027c8fe9324960452b23d267dca135a");
                    } else {
                        DrugMRNHHModule.this.getMedicDetailUrlAfterCheckEngine(str, str2, str3, promise);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getMedicDetailUrlAfterCheckEngine(String str, String str2, String str3, Promise promise) {
        Object[] objArr = {str, str2, str3, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51ad1f9c0181332064de1ca5e99c0033", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51ad1f9c0181332064de1ca5e99c0033");
        } else {
            promise.resolve(HHDoctor.getMedicDetailUrl(str, str2, str3));
        }
    }

    @ReactMethod
    public void videoCallHHDoctor(final String str, final String str2, final String str3, final String str4, final Promise promise) {
        Object[] objArr = {str, str2, str3, str4, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdb2b38f2aa6de7e76fadaa38383e792", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdb2b38f2aa6de7e76fadaa38383e792");
        } else {
            checkEngineBeforeUse(new a() { // from class: com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.7
                public static ChangeQuickRedirect a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cbe88cd616cee5ff4c9ee18cb956f34d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cbe88cd616cee5ff4c9ee18cb956f34d");
                    } else {
                        DrugMRNHHModule.this.videoCallHHDoctorAfterCheckEngine(str, str2, str3, str4, promise);
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule$8  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass8 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ Promise f;

        public AnonymousClass8(String str, String str2, String str3, String str4, Promise promise) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = promise;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "678c2adfbed6d96d3db758fbdba77dd7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "678c2adfbed6d96d3db758fbdba77dd7");
                return;
            }
            try {
                HHDoctor.login(DrugMRNHHModule.this.getReactApplicationContext(), this.b, new HHLoginListener() { // from class: com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.8.1
                    public static ChangeQuickRedirect a;

                    @Override // com.hhmedic.android.sdk.listener.HHLoginListener
                    public final void onSuccess() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f1bf6f6025cda762ebce3271a14163c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f1bf6f6025cda762ebce3271a14163c");
                            return;
                        }
                        HHDoctor.setCallExtension(AnonymousClass8.this.c);
                        HHDoctor.call(DrugMRNHHModule.this.getCurrentActivity(), AnonymousClass8.this.d, new HHCallListener() { // from class: com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule.8.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.hhmedic.android.sdk.listener.HHCallListener
                            public final void onStart(String str) {
                                Object[] objArr3 = {str};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7e68ee3fd161f44ef5c457cf2a198792", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7e68ee3fd161f44ef5c457cf2a198792");
                                    return;
                                }
                                WritableMap createMap = Arguments.createMap();
                                createMap.putString(Constants.EventConstants.KEY_ORDER_ID, str);
                                createMap.putString("drug_extension", AnonymousClass8.this.e);
                                com.sankuai.waimai.reactnative.utils.a.a(DrugMRNHHModule.this.getReactApplicationContext(), "videoCallStart", createMap);
                                AnonymousClass8.this.f.resolve("videoCallStart");
                            }

                            @Override // com.hhmedic.android.sdk.listener.HHCallListener
                            public final void onFinish(long j) {
                                Object[] objArr3 = {new Long(j)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6a4305c29f8caebfa4fbb263fe548a35", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6a4305c29f8caebfa4fbb263fe548a35");
                                    return;
                                }
                                WritableMap createMap = Arguments.createMap();
                                createMap.putDouble("time", j);
                                createMap.putString("drug_extension", AnonymousClass8.this.e);
                                com.sankuai.waimai.reactnative.utils.a.a(DrugMRNHHModule.this.getReactApplicationContext(), "videoCallFinish", createMap);
                            }

                            @Override // com.hhmedic.android.sdk.listener.HHCallListener
                            public final void onCallSuccess() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3749028248c913d8f76470338fb50f39", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3749028248c913d8f76470338fb50f39");
                                    return;
                                }
                                WritableMap createMap = Arguments.createMap();
                                createMap.putString("drug_extension", AnonymousClass8.this.e);
                                com.sankuai.waimai.reactnative.utils.a.a(DrugMRNHHModule.this.getReactApplicationContext(), "videoCallSuccess", createMap);
                            }

                            @Override // com.hhmedic.android.sdk.listener.HHCallListener
                            public final void onFail(int i) {
                                Object[] objArr3 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b1f63d298be5f73fca25f64fa375ac65", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b1f63d298be5f73fca25f64fa375ac65");
                                    return;
                                }
                                WritableMap createMap = Arguments.createMap();
                                createMap.putInt("code", i);
                                createMap.putString("drug_extension", AnonymousClass8.this.e);
                                com.sankuai.waimai.reactnative.utils.a.a(DrugMRNHHModule.this.getReactApplicationContext(), "videoCallFail", createMap);
                            }

                            @Override // com.hhmedic.android.sdk.listener.HHCallListener
                            public final void onCancel() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "06bdb34692ee5a02cb3195d7614cc6a1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "06bdb34692ee5a02cb3195d7614cc6a1");
                                    return;
                                }
                                WritableMap createMap = Arguments.createMap();
                                createMap.putString("drug_extension", AnonymousClass8.this.e);
                                com.sankuai.waimai.reactnative.utils.a.a(DrugMRNHHModule.this.getReactApplicationContext(), "videoCallCancel", createMap);
                            }
                        });
                    }

                    @Override // com.hhmedic.android.sdk.listener.HHLoginListener
                    public final void onError(String str) {
                        Object[] objArr2 = {str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34e75ae7107f66d22826e6bc386b7c70", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34e75ae7107f66d22826e6bc386b7c70");
                        } else {
                            AnonymousClass8.this.f.reject("1", str);
                        }
                    }
                });
            } catch (Exception e) {
                try {
                    com.sankuai.waimai.store.mrn.d.a(this.f, e);
                } catch (Exception e2) {
                    com.sankuai.waimai.store.mrn.d.a(this.f, e2);
                }
            }
        }
    }

    public void videoCallHHDoctorAfterCheckEngine(String str, String str2, String str3, String str4, Promise promise) {
        Object[] objArr = {str, str2, str3, str4, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29dab6563757df14fc861bdd94385d8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29dab6563757df14fc861bdd94385d8e");
        } else {
            ad.a(new AnonymousClass8(str, str3, str2, str4, promise));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public void a() {
        }

        public a() {
        }
    }
}
