package com.sankuai.eh.component.web.modal;

import android.graphics.Outline;
import android.os.Build;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.database.b;
import com.sankuai.eh.component.service.network.EHNetService;
import com.sankuai.eh.component.service.tools.EHCommonTypeAdapterFactory;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.proxy.util.Constants;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    boolean b;
    long c;
    String d;
    Map<String, String> e;
    FragmentActivity f;
    C0553a g;
    Button h;
    ViewGroup i;
    View j;
    View k;
    FrameLayout l;
    EHModalFragment m;
    com.sankuai.eh.component.web.module.d n;
    com.sankuai.eh.component.web.module.c o;
    c p;
    private boolean q;
    private int r;
    private String s;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface c {
        void a(String str);
    }

    public a(FragmentActivity fragmentActivity, ViewGroup viewGroup, String str, String str2, Map<String, String> map) {
        String str3;
        Object[] objArr = {fragmentActivity, viewGroup, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c30ac0e0b9ed405b42597beebc887ff6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c30ac0e0b9ed405b42597beebc887ff6");
            return;
        }
        this.f = fragmentActivity;
        this.i = viewGroup;
        this.d = com.sankuai.eh.component.service.utils.e.a(str, "ehcShowModal", "true");
        this.s = str2;
        this.e = map;
        this.p = new b();
        this.o = new com.sankuai.eh.component.web.module.c(this.d, this.f, null);
        this.o.a("use", UIConfig.MODAL);
        this.o.a("originalPattern", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.database.d.a(str), "pattern"), ""));
        this.r = R.layout.eh_component_layout_modal;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8905db9fcdc0dace4a7b5b3f6d971a38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8905db9fcdc0dace4a7b5b3f6d971a38");
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("User-Agent", com.sankuai.eh.component.web.module.e.a());
        hashMap.put(Constants.KEY_ORIGIN, "https://eh.sankuai.com");
        hashMap.put("Referrer", this.d);
        hashMap.put("Accept", "*/*");
        hashMap.put("Cookie", CookieManager.getInstance().getCookie(this.s == null ? "" : this.s));
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("bizId", this.e.get("bizId"));
        hashMap2.put("token", com.sankuai.eh.component.service.a.c().e());
        hashMap2.put("nb_app", com.sankuai.eh.component.service.a.c().j().get("nickname"));
        hashMap2.put("nb_appversion", com.sankuai.eh.component.service.a.c().i());
        hashMap2.put("nb_ci", com.sankuai.eh.component.service.a.c().a());
        hashMap2.put("nb_deviceid", com.sankuai.eh.component.service.a.c().f());
        hashMap2.put("nb_osversion", Build.VERSION.RELEASE);
        hashMap2.put("nb_platform", "android");
        hashMap2.put("nb_uuid", com.sankuai.eh.component.service.a.c().f());
        EHNetService a2 = com.sankuai.eh.component.service.network.a.a(false);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1c380ae440a00e12594d0d0da7416e21", RobustBitConfig.DEFAULT_VALUE)) {
            str3 = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1c380ae440a00e12594d0d0da7416e21");
        } else {
            if (com.sankuai.eh.component.service.utils.f.b()) {
                String lowerCase = com.sankuai.meituan.switchtestenv.a.a(com.sankuai.eh.component.service.a.b()).toLowerCase();
                if (lowerCase.contains("stage")) {
                    str3 = "http://stable.pay.st.sankuai.com/conch/wallet/floating-window-config";
                } else if (lowerCase.contains("test")) {
                    str3 = "http://stable.pay.test.sankuai.com/conch/wallet/floating-window-config";
                }
            }
            str3 = "https://npay.meituan.com/conch/wallet/floating-window-config";
        }
        a2.callDynamic(str3, hashMap, hashMap2).a(new b.a() { // from class: com.sankuai.eh.component.web.modal.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.eh.component.service.database.b.a
            public final void a(String str4) {
                Object[] objArr4 = {str4};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "81c42d391d6b8b0a438d9619b4968792", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "81c42d391d6b8b0a438d9619b4968792");
                    return;
                }
                com.sankuai.eh.component.service.tools.d.a("test_0519", str4);
                JsonElement a3 = com.sankuai.eh.component.service.utils.b.a(str4);
                if ("success".equals(com.sankuai.eh.component.service.utils.b.a(a3, "status"))) {
                    try {
                        C0553a c0553a = (C0553a) new GsonBuilder().registerTypeAdapterFactory(new EHCommonTypeAdapterFactory()).create().fromJson(new GsonBuilder().disableHtmlEscaping().create().toJson(com.sankuai.eh.component.service.utils.b.c(a3, "data")), (Class<Object>) C0553a.class);
                        if (c0553a != null) {
                            a aVar = a.this;
                            if (aVar.g == null) {
                                aVar.g = c0553a;
                            }
                        }
                    } catch (Exception e) {
                        com.sankuai.eh.component.service.tools.d.a(e);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0553a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b297a86ae9b89596fde91ead80ba3d8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0553a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b297a86ae9b89596fde91ead80ba3d8a");
        }
        if (this.g == null) {
            this.g = new C0553a();
        }
        return this.g;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b implements c {
        public static ChangeQuickRedirect a;

        public b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d54182819b5be27bfc22ec246f5de97e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d54182819b5be27bfc22ec246f5de97e");
            }
        }

        @Override // com.sankuai.eh.component.web.modal.a.c
        public final void a(final String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4614c19276c73f1a0135e26589da4ea7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4614c19276c73f1a0135e26589da4ea7");
                return;
            }
            com.sankuai.eh.component.web.module.d dVar = a.this.n;
            dVar.a(TitansConstants.JAVASCRIPT_PREFIX + ("ehcModalStateChange(" + new b.a().a("bizId", a.this.e.get("bizId")).a("state", str).a("animation", new b.a().a("animationStyle", a.this.a().c()).a("duration", Float.toString(a.this.a().b())).b).b.toString() + CommonConstant.Symbol.BRACKET_RIGHT), new ValueCallback<String>() { // from class: com.sankuai.eh.component.web.modal.a.b.1
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    String str3 = str2;
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "642e24f9877d1e6fa2a6b6a8d511eee3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "642e24f9877d1e6fa2a6b6a8d511eee3");
                    } else if (TextUtils.isEmpty(str3) || (com.sankuai.eh.component.service.utils.b.a(str3) instanceof JsonNull)) {
                    } else {
                        com.sankuai.eh.component.service.tools.d.a("modal_state_callback", str3);
                        JsonElement a2 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(str3).getAsString());
                        if (a2 instanceof JsonObject) {
                            a.this.a().k = (JsonObject) a2;
                        } else {
                            a.this.a().k = null;
                        }
                        if ("ehcWillCloseModal".equals(str) && a.this.b) {
                            a.this.e();
                        }
                    }
                }
            });
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fba63ccee8f3472a7c065b7a93764b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fba63ccee8f3472a7c065b7a93764b6");
        } else if (this.q) {
        } else {
            this.j = LayoutInflater.from(this.f).inflate(this.r, (ViewGroup) null);
            this.j.setClickable(true);
            this.j.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            ((ViewGroup) this.j).setClipChildren(false);
            this.i.addView(this.j);
            this.h = (Button) this.j.findViewById(R.id.btn_eh_component_modal_close);
            this.h.setOnClickListener(com.sankuai.eh.component.web.modal.b.a(this));
            this.l = (FrameLayout) this.j.findViewById(R.id.eh_component_modal_content);
            this.k = this.j.findViewById(R.id.eh_component_modal_fill);
            this.k.setOnClickListener(com.sankuai.eh.component.web.modal.c.a(this));
            this.q = true;
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddce487e9669786712b1ec74c2ad3ab6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddce487e9669786712b1ec74c2ad3ab6");
            return;
        }
        EHModalFragment eHModalFragment = (EHModalFragment) this.f.getSupportFragmentManager().findFragmentByTag("modal_fragment");
        if (eHModalFragment != null) {
            eHModalFragment.setUserVisibleHint(true);
            eHModalFragment.setMenuVisibility(true);
            this.f.getSupportFragmentManager().beginTransaction().show(eHModalFragment).commitAllowingStateLoss();
        } else {
            eHModalFragment = new EHModalFragment();
            this.f.getSupportFragmentManager().beginTransaction().add(R.id.eh_component_modal_content, eHModalFragment, "modal_fragment").commitAllowingStateLoss();
        }
        eHModalFragment.b = a();
        if (a().a() < 100) {
            ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: com.sankuai.eh.component.web.modal.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    Object[] objArr2 = {view, outline};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe5f9331b4cd83a3bcc73c17862d5ed5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe5f9331b4cd83a3bcc73c17862d5ed5");
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), com.sankuai.eh.component.service.utils.a.a(12.0f));
                    }
                }
            };
            Object[] objArr2 = {viewOutlineProvider};
            ChangeQuickRedirect changeQuickRedirect2 = EHModalFragment.a;
            if (PatchProxy.isSupport(objArr2, eHModalFragment, changeQuickRedirect2, false, "e095933446c268c8f1d54167686f1b46", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eHModalFragment, changeQuickRedirect2, false, "e095933446c268c8f1d54167686f1b46");
            } else if (eHModalFragment.getView() != null) {
                eHModalFragment.getView().setOutlineProvider(viewOutlineProvider);
                eHModalFragment.getView().setClipToOutline(true);
            }
        }
        eHModalFragment.c = new Animation.AnimationListener() { // from class: com.sankuai.eh.component.web.modal.a.3
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                Object[] objArr3 = {animation};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "67b232a771dca55162360c5b1f33df47", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "67b232a771dca55162360c5b1f33df47");
                } else {
                    a.this.p.a("ehcWillOpenModal");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr3 = {animation};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4b8fe7cc491adb2713646d1454a0d24d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4b8fe7cc491adb2713646d1454a0d24d");
                    return;
                }
                a.this.p.a("ehcDidOpenModal");
                if (a.this.a().g != 1 || a.this.a().a() > 95) {
                    return;
                }
                a.this.h.setVisibility(0);
            }
        };
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73f1fe17809fcf7cc06ed1170c72fa66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73f1fe17809fcf7cc06ed1170c72fa66");
        } else if (this.b) {
            this.p.a("ehcWillCloseModal");
            if (!"bottomtoupandscale".equals(a().c())) {
                e();
            } else {
                com.sankuai.eh.component.service.utils.thread.b.a().a(d.a(this), 200L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e0dcb564286bbffbd64bfbc734c1a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e0dcb564286bbffbd64bfbc734c1a8");
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        if ("fadein".equals(a().c())) {
            alphaAnimation.setDuration(a().b() * 1000.0f);
        }
        alphaAnimation.setFillAfter(true);
        this.k.startAnimation(alphaAnimation);
        this.m.c = new Animation.AnimationListener() { // from class: com.sankuai.eh.component.web.modal.a.5
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22e34f8a2c8a5c9a9aac84a0290ce199", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22e34f8a2c8a5c9a9aac84a0290ce199");
                    return;
                }
                a.this.p.a("ehcDidCloseModal");
                a.this.i.removeView(a.this.j);
            }
        };
        this.f.getSupportFragmentManager().beginTransaction().remove(this.m).commitAllowingStateLoss();
        this.b = false;
        a(true);
        new d.c().a("ehc_modal_plugin").a("type", "dismissSuccess").b();
        com.sankuai.eh.component.service.tools.d.b("ehc.modal", new d.b().a("timing", "dissmiss").b, Long.valueOf(com.sankuai.eh.component.service.utils.f.a(this.c)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3571a2b36d7dec47b0ef35f3070a2454", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3571a2b36d7dec47b0ef35f3070a2454");
            return;
        }
        Map map = (Map) com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(this.e), new TypeToken<Map<String, Object>>() { // from class: com.sankuai.eh.component.web.modal.a.6
        }.getType());
        int a2 = com.sankuai.eh.component.service.utils.f.a(this.e.get("bizId"), 99);
        if (a2 < 0) {
            a2 = 99;
        }
        map.put("biz_id", Integer.valueOf(a2));
        map.remove("bizId");
        if (z) {
            com.sankuai.eh.component.service.tools.d.b("fup", "b_fup_79d96hh5_mc", "c_fup_2jqug2n8", map);
        } else {
            com.sankuai.eh.component.service.tools.d.a("fup", "b_fup_79d96hh5_mv", "c_fup_2jqug2n8", map);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.component.web.modal.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0553a {
        public static ChangeQuickRedirect a;
        @SerializedName("bizId")
        public int b;
        @SerializedName("supportGesture")
        public int c;
        @SerializedName("heightPercentage")
        public int d;
        @SerializedName("transparencyPercentage")
        public int e;
        @SerializedName("durationBySecond")
        public float f;
        @SerializedName("showCloseButton")
        public int g;
        @SerializedName("animationStyle")
        public String h;
        @SerializedName("color")
        public String i;
        @SerializedName("buttonColor")
        public String j;
        JsonObject k;

        public C0553a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "271876d312a482c494e8939bf1ee2296", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "271876d312a482c494e8939bf1ee2296");
                return;
            }
            this.c = 1;
            this.d = 90;
            this.e = 70;
            this.f = 0.7f;
            this.g = 1;
            this.h = "bottomtoup";
            this.i = DiagnoseLog.COLOR_ERROR;
            this.j = "#ffffff";
        }

        public final int a() {
            if (this.d > 100 || this.d < 0) {
                return 90;
            }
            return this.d;
        }

        public final float b() {
            if (this.f <= 0.0f) {
                return 0.7f;
            }
            return this.f;
        }

        public final String c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34bb03174fa22cad4b9408b2608676f9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34bb03174fa22cad4b9408b2608676f9") : TextUtils.isEmpty(this.h) ? "bottomtoup" : this.h;
        }
    }
}
