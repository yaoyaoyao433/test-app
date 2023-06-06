package com.sankuai.meituan.takeoutnew.ui.page.boot;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.paybase.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.takeoutnew.base.WmBaseActivity;
import com.sankuai.meituan.takeoutnew.controller.e;
import com.sankuai.meituan.takeoutnew.model.WelcomeAd;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.meituan.takeoutnew.util.tool.a;
import com.sankuai.waimai.business.page.home.utils.j;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.router.method.Func0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SplashAdActivity extends WmBaseActivity {
    public static ChangeQuickRedirect b;
    private Runnable D;
    private Runnable E;
    protected View c;
    protected TextView d;
    protected ImageView e;
    private View f;
    private MTVideoPlayerView g;
    private ImageView h;
    private com.sankuai.meituan.takeoutnew.util.a i;
    private com.sankuai.meituan.takeoutnew.util.a j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private Runnable v;

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
    }

    public SplashAdActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d26620e189392afb9ca01415ea4b474", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d26620e189392afb9ca01415ea4b474");
            return;
        }
        this.k = 7;
        this.o = false;
        this.q = false;
        this.r = -999;
        this.s = -999;
        this.t = -999;
        this.u = -999;
        this.v = new Runnable() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "134f64a6d89e7c7363ae8accedeb4b18", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "134f64a6d89e7c7363ae8accedeb4b18");
                } else if (SplashAdActivity.this.q) {
                } else {
                    com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a("splash-ignoreLimit");
                    e.a("SplashAdActivity", "主线程处理其他事项超过1s时候的时间");
                    SplashAdActivity.a(SplashAdActivity.this, (com.sankuai.waimai.business.page.homepage.model.b) null);
                    SplashAdActivity.b(SplashAdActivity.this, true);
                    com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17014, 0, "waimai_splash_all");
                }
            }
        };
        this.D = new Runnable() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity.8
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "702ec1b6773d376b1f479c5d617ea3f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "702ec1b6773d376b1f479c5d617ea3f3");
                } else {
                    SplashAdActivity.d(SplashAdActivity.this);
                }
            }
        };
        this.E = new Runnable() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity.9
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d556c7007b21dde3f4068df3307cecd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d556c7007b21dde3f4068df3307cecd");
                } else {
                    SplashAdActivity.e(SplashAdActivity.this);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity r15, final com.sankuai.waimai.business.page.homepage.model.b r16) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity.a(com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity, com.sankuai.waimai.business.page.homepage.model.b):void");
    }

    public static /* synthetic */ boolean a(SplashAdActivity splashAdActivity, boolean z) {
        splashAdActivity.m = true;
        return true;
    }

    public static /* synthetic */ void b(SplashAdActivity splashAdActivity, com.sankuai.waimai.business.page.homepage.model.b bVar) {
        String replace;
        Uri b2;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, splashAdActivity, changeQuickRedirect, false, "ffb3f52e1da348d4aee5d95347440d57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, splashAdActivity, changeQuickRedirect, false, "ffb3f52e1da348d4aee5d95347440d57");
        } else if (bVar == null || TextUtils.isEmpty(bVar.landingPageUrl)) {
        } else {
            if (bVar.isAd()) {
                splashAdActivity.c(com.sankuai.meituan.takeoutnew.ui.page.boot.report.a.b);
            }
            if (splashAdActivity.l) {
                return;
            }
            splashAdActivity.l = true;
            String str = bVar.landingPageUrl;
            if (!TextUtils.isEmpty(str)) {
                try {
                    replace = str.replace("__WIDTH__", String.valueOf(com.sankuai.waimai.platform.b.A().l())).replace("__HEIGHT__", String.valueOf(com.sankuai.waimai.platform.b.A().m())).replace("__DOWN_X__", String.valueOf(splashAdActivity.r)).replace("__DOWN_Y__", String.valueOf(splashAdActivity.s)).replace("__UP_X__", String.valueOf(splashAdActivity.t)).replace("__UP_Y__", String.valueOf(splashAdActivity.u));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                b2 = splashAdActivity.b(replace);
                if (b2 != null || b2.equals(Uri.EMPTY) || splashAdActivity.m) {
                    return;
                }
                splashAdActivity.m = true;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, splashAdActivity, changeQuickRedirect2, false, "656b579ba543cb27cb019b6f6eb2d3a5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, splashAdActivity, changeQuickRedirect2, false, "656b579ba543cb27cb019b6f6eb2d3a5");
                } else if (splashAdActivity.i != null) {
                    splashAdActivity.i.cancel();
                }
                j.cancel("redirect_splash_landing_page");
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, splashAdActivity, changeQuickRedirect3, false, "69da8dac879c333fc5ea2346b47d532d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, splashAdActivity, changeQuickRedirect3, false, "69da8dac879c333fc5ea2346b47d532d");
                } else {
                    if (bVar.isAd == 2) {
                        int c2 = splashAdActivity.c(bVar);
                        JudasManualManager.a("b_waimai_if6su0q7_mc").a("c_w10r5g3").a(splashAdActivity).a(splashAdActivity.b(bVar)).a();
                        com.sankuai.waimai.ad.monitor.b.a("b_waimai_if6su0q7_mc", "LX", c2, "startup_ad_splash_screen", com.sankuai.waimai.foundation.core.common.a.a().e());
                        com.sankuai.waimai.ad.mads.a.a(1, new b.a("b_waimai_if6su0q7_mc", splashAdActivity.d(bVar), 2));
                        com.sankuai.waimai.ad.monitor.b.a("b_waimai_if6su0q7_mc", "SH", c2, "startup_ad_splash_screen", com.sankuai.waimai.foundation.core.common.a.a().e());
                        if (bVar instanceof WelcomeAd) {
                            com.sankuai.waimai.ad.mads.a.a(((WelcomeAd) bVar).thirdClickLogUrl);
                        }
                    }
                    if (!bVar.isAd()) {
                        JudasManualManager.a("b_waimai_if6su0q7_mc").a("c_w10r5g3").a(splashAdActivity).a("entry_item_id", bVar.id).a("activity_id", bVar.activityId).a("activity_type", bVar.isAd).a("yy_activity_type", bVar.yyActivityType).a("template_id", splashAdActivity.a(bVar)).a();
                    }
                }
                Object[] objArr4 = {b2};
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, splashAdActivity, changeQuickRedirect4, false, "42edb7b16aee773f4cb06663df9a7efa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, splashAdActivity, changeQuickRedirect4, false, "42edb7b16aee773f4cb06663df9a7efa");
                    return;
                }
                Intent intent = new Intent();
                intent.setData(b2);
                intent.putExtra("com.sankuai.waimai.router.from", 2);
                splashAdActivity.f();
                Object[] objArr5 = {intent};
                ChangeQuickRedirect changeQuickRedirect5 = b;
                if (PatchProxy.isSupport(objArr5, splashAdActivity, changeQuickRedirect5, false, "6b26869a4a29a136955c8efd9afadecb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, splashAdActivity, changeQuickRedirect5, false, "6b26869a4a29a136955c8efd9afadecb");
                    return;
                }
                try {
                    Uri data = intent.getData();
                    if (data == null) {
                        return;
                    }
                    splashAdActivity.bB_().startActivity(SchemeDispatchActivityDelegate.a(splashAdActivity, data, f.a(intent, "com.sankuai.waimai.router.from", 1)));
                    splashAdActivity.finish();
                    splashAdActivity.overridePendingTransition(R.anim.wm_common_stay_still, R.anim.wm_common_stay_still);
                    return;
                } catch (Exception e2) {
                    com.sankuai.waimai.foundation.utils.log.a.b("WelcomeSchemeJump", e2);
                    return;
                }
            }
            replace = str;
            b2 = splashAdActivity.b(replace);
            if (b2 != null) {
            }
        }
    }

    public static /* synthetic */ boolean b(SplashAdActivity splashAdActivity, boolean z) {
        splashAdActivity.q = true;
        return true;
    }

    public static /* synthetic */ void d(SplashAdActivity splashAdActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, splashAdActivity, changeQuickRedirect, false, "229df8dd54cabefefa657b0071e5bed2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, splashAdActivity, changeQuickRedirect, false, "229df8dd54cabefefa657b0071e5bed2");
            return;
        }
        splashAdActivity.j = new com.sankuai.meituan.takeoutnew.util.a(splashAdActivity.k, 1000L) { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.takeoutnew.util.a
            public final void a(int i) {
            }

            @Override // com.sankuai.meituan.takeoutnew.util.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c11329e5c5d2661bb9644d6622ffddef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c11329e5c5d2661bb9644d6622ffddef");
                    return;
                }
                com.sankuai.waimai.platform.capacity.log.c.a().a(17902, 0, "waimai_startup_play_video");
                i.d(new com.sankuai.meituan.takeoutnew.log.a().a("waimai_startup_play_video").b("timeout").c("video play timeout").b());
                SplashAdActivity.h(SplashAdActivity.this);
            }
        };
        splashAdActivity.j.b();
    }

    public static /* synthetic */ void e(SplashAdActivity splashAdActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, splashAdActivity, changeQuickRedirect, false, "e08b1264a504fba368318240409cb555", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, splashAdActivity, changeQuickRedirect, false, "e08b1264a504fba368318240409cb555");
            return;
        }
        splashAdActivity.c.setVisibility(0);
        splashAdActivity.i = new com.sankuai.meituan.takeoutnew.util.a(3, 900L) { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity.2
            public static ChangeQuickRedirect a;

            {
                super(3, 900L);
            }

            @Override // com.sankuai.meituan.takeoutnew.util.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d20ca31fb3043bcfb41480dd642757e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d20ca31fb3043bcfb41480dd642757e");
                } else {
                    SplashAdActivity.this.d.setText(String.valueOf(i));
                }
            }

            @Override // com.sankuai.meituan.takeoutnew.util.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15903fd53d617a06f2b50e849b5ea13d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15903fd53d617a06f2b50e849b5ea13d");
                } else {
                    SplashAdActivity.h(SplashAdActivity.this);
                }
            }
        };
        splashAdActivity.i.b();
    }

    public static /* synthetic */ void g(SplashAdActivity splashAdActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, splashAdActivity, changeQuickRedirect, false, "99692aba52c8b4e7451698bf391f2384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, splashAdActivity, changeQuickRedirect, false, "99692aba52c8b4e7451698bf391f2384");
        } else if (splashAdActivity.n) {
        } else {
            int duration = splashAdActivity.g.getDuration();
            if (duration > 0) {
                splashAdActivity.k = (duration / 1000) + 2;
                com.sankuai.waimai.platform.capacity.log.c.a().a(17900, 0, "waimai_startup_video_length");
            } else {
                com.sankuai.waimai.platform.capacity.log.c.a().a(17901, 0, "waimai_startup_video_length");
            }
            ad.a(splashAdActivity.D, 200L);
            splashAdActivity.n = true;
        }
    }

    public static /* synthetic */ void h(SplashAdActivity splashAdActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, splashAdActivity, changeQuickRedirect, false, "271b4dd9d9bad7a9324dc7bed16070ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, splashAdActivity, changeQuickRedirect, false, "271b4dd9d9bad7a9324dc7bed16070ee");
        } else if (splashAdActivity.m) {
        } else {
            splashAdActivity.m = true;
            splashAdActivity.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53b9acd8200872dfdcfc8b50f587f43a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53b9acd8200872dfdcfc8b50f587f43a");
            return;
        }
        finish();
        if (this.o) {
            j.a("ad<--end");
        }
        overridePendingTransition(0, 0);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a10001c599428e07bb374d30a51851ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a10001c599428e07bb374d30a51851ec");
            return;
        }
        Trace.beginSection("SplashAd.Open");
        Trace.beginSection("SplashAd.CreateAndStart");
        super.onCreate(bundle);
        getWindow().setStatusBarColor(0);
        a(true, false);
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39047e9ffae1e9a97d49dd19ac7e87b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39047e9ffae1e9a97d49dd19ac7e87b1");
        } else if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        try {
            setContentView(R.layout.takeout_activity_welcome);
        } catch (Resources.NotFoundException e) {
            try {
                setContentView(R.layout.takeout_activity_welcome);
            } catch (Exception unused) {
                com.sankuai.waimai.foundation.utils.log.a.e(getClass().getSimpleName(), e.getMessage(), new Object[0]);
                finish();
                return;
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fcf78cfd7884d18cd27c6b7a6cca5136", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fcf78cfd7884d18cd27c6b7a6cca5136");
        } else {
            this.f = findViewById(16908290);
            this.c = findViewById(R.id.ll_skip);
            this.d = (TextView) findViewById(R.id.tv_remain_time);
            this.e = (ImageView) findViewById(R.id.img_ad_icon);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a28b58aa44696ecfb15772cbe0469190", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a28b58aa44696ecfb15772cbe0469190");
                    } else if (SplashAdActivity.this.m) {
                    } else {
                        SplashAdActivity.a(SplashAdActivity.this, true);
                        SplashAdActivity.this.b();
                    }
                }
            });
            this.f.setSystemUiVisibility(1);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin += com.sankuai.waimai.platform.capacity.immersed.a.a((Context) this);
                this.c.setLayoutParams(marginLayoutParams);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e1bfa7431068ab549ffd2fd2c3e57cff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e1bfa7431068ab549ffd2fd2c3e57cff");
            return;
        }
        com.sankuai.meituan.takeoutnew.ui.page.boot.report.c a2 = com.sankuai.meituan.takeoutnew.ui.page.boot.report.c.a();
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.takeoutnew.ui.page.boot.report.c.a;
        if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "ff6d97d1dee959410b821ad97613db3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "ff6d97d1dee959410b821ad97613db3d");
        } else {
            a2.c = 1;
            a2.e.set(false);
            a2.b = System.currentTimeMillis();
            a2.h = true;
        }
        com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a("1s_count_down_begin");
        ad.a(this.v, 1000L);
        a(false, (com.sankuai.waimai.business.page.homepage.model.b) null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = com.sankuai.meituan.takeoutnew.ui.page.boot.a.a().d;
        if (j != 0 && elapsedRealtime > j) {
            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(0, (int) (elapsedRealtime - j), "waimai_splash_gap_between_request_and_countdown");
        }
        com.sankuai.meituan.takeoutnew.ui.page.boot.a a3 = com.sankuai.meituan.takeoutnew.ui.page.boot.a.a();
        c cVar = new c(elapsedRealtime);
        Object[] objArr6 = {cVar};
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.meituan.takeoutnew.util.tool.a.e;
        if (PatchProxy.isSupport(objArr6, a3, changeQuickRedirect6, false, "bfd695f97e9a994e7cc11799f16bc96a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, a3, changeQuickRedirect6, false, "bfd695f97e9a994e7cc11799f16bc96a");
            return;
        }
        l.a("ObservableData.observe");
        a3.a("observe: %s", cVar);
        if (a3.f()) {
            a3.a("notify observer: %s", cVar);
            if (a3.a(a3.i)) {
                com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17018, 0, "waimai_splash_all");
            }
            cVar.a(a3.i);
            return;
        }
        a3.h.add(cVar);
        a3.e();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void onPostCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e780af99a088b70271abaa688a7f6d69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e780af99a088b70271abaa688a7f6d69");
            return;
        }
        super.onPostCreate(bundle);
        Trace.endSection();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "895c12525cff496c91cf865b060f082f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "895c12525cff496c91cf865b060f082f");
            return;
        }
        Trace.beginSection("SplashAd.onResume");
        super.onResume();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f25067e30c5c6b28609484984471841", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f25067e30c5c6b28609484984471841");
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "51763e6bb3442685f8556bae0a0e9f1a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "51763e6bb3442685f8556bae0a0e9f1a");
            } else if (this.j != null) {
                this.j.b();
            }
            if (this.g != null) {
                this.g.c();
            }
        }
        Trace.endSection();
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71caf4be2500187205ebc45968a86054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71caf4be2500187205ebc45968a86054");
            return;
        }
        super.finish();
        com.sankuai.meituan.takeoutnew.ui.page.boot.report.c.a().b();
        Func0 func0 = (Func0) com.sankuai.waimai.router.a.a(Func0.class, "clear_main_splash_cover");
        if (func0 != null) {
            func0.call();
        }
        Trace.endSection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, com.sankuai.waimai.business.page.homepage.model.b bVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0174fbd75d4af1e685c446b3f1c435d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0174fbd75d4af1e685c446b3f1c435d5");
        } else if (bVar != null) {
            if (z && (bVar instanceof WelcomeAd)) {
                String str = ((WelcomeAd) bVar).adType == 21 ? bVar.dspLogo : null;
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this;
                a2.c = str;
                a2.a(new b.a() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity.6
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr2 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44072b9cc6877103b42cb2c1ff96a816", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44072b9cc6877103b42cb2c1ff96a816");
                        } else {
                            SplashAdActivity.this.e.setImageBitmap(bitmap);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de6ec5d392261687b3055bb8780b983f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de6ec5d392261687b3055bb8780b983f");
                        } else {
                            SplashAdActivity.this.e.setImageResource(R.drawable.wm_splash_ic_ad);
                        }
                    }
                });
                this.e.setVisibility(0);
                return;
            }
            this.e.setVisibility(8);
        }
    }

    @Nullable
    private Uri b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d52908a57f2aa334c39f41d42f683b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d52908a57f2aa334c39f41d42f683b7");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return null;
            }
            if (af.a(parse)) {
                return Uri.parse((com.sankuai.waimai.foundation.router.interfaces.b.c + "/browser?inner_url=") + URLEncoder.encode(str, "UTF-8"));
            }
            return parse;
        } catch (Exception unused) {
            return null;
        }
    }

    private int a(@Nonnull com.sankuai.waimai.business.page.homepage.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fc07b6a986704139f42c46261d2e536", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fc07b6a986704139f42c46261d2e536")).intValue();
        }
        if (bVar.isVideoSource()) {
            return 3;
        }
        return bVar.isHalfScreenType() ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, @NonNull final com.sankuai.waimai.business.page.homepage.model.b bVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a72dd6c38178e2164436d29b9287e595", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a72dd6c38178e2164436d29b9287e595");
        } else if (TextUtils.isEmpty(bVar.landingPageUrl)) {
        } else {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            final View inflate = getLayoutInflater().inflate(R.layout.takeout_activity_welcome_goto_btn_container, viewGroup, false);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) inflate.getLayoutParams();
            int b2 = ab.b(com.meituan.android.singleton.b.a);
            int l = com.sankuai.waimai.platform.b.A().l();
            int i = (int) (l * 0.0555f);
            int i2 = (int) ((l - (i * 2)) * 0.2906f);
            marginLayoutParams.height = i2;
            marginLayoutParams.bottomMargin = (int) (b2 * 0.08f);
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
            inflate.setVisibility(8);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.welcome_goto_image);
            TextView textView = (TextView) inflate.findViewById(R.id.welcome_goto_text);
            a aVar = new a(this, bVar);
            if (aVar.a()) {
                inflate.setBackground(b.a(this, aVar.b, aVar.c, i2));
                a(imageView, aVar.f);
                textView.setTextColor(aVar.d);
                textView.setText(aVar.e);
            } else {
                inflate.setBackground(b.a(this, Color.parseColor("#A5000000"), Color.parseColor("#A5000000"), i2));
                a(imageView, R.drawable.splash_btn);
                textView.setTextColor(-1);
                textView.setText(R.string.wm_splash_ad_goto_text);
            }
            viewGroup.addView(inflate, marginLayoutParams);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity.12
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "786407e254d258a6705e8222fb7c308f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "786407e254d258a6705e8222fb7c308f");
                    } else {
                        SplashAdActivity.b(SplashAdActivity.this, bVar);
                    }
                }
            });
            if (z) {
                inflate.post(new Runnable() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity.13
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2673638e2efbbf6a8dc3ec9b19a1adeb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2673638e2efbbf6a8dc3ec9b19a1adeb");
                        } else if (SplashAdActivity.this.bB_() == null || SplashAdActivity.this.bB_().isFinishing()) {
                        } else {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) inflate.getLayoutParams();
                            View findViewById = SplashAdActivity.this.findViewById(R.id.splash_ad_logo_container);
                            View findViewById2 = SplashAdActivity.this.findViewById(R.id.half_pic);
                            if (findViewById == null || findViewById2 == null) {
                                return;
                            }
                            layoutParams.bottomMargin = findViewById.getHeight() + ((int) (findViewById2.getHeight() * 0.03f));
                            inflate.setLayoutParams(layoutParams);
                            inflate.setVisibility(0);
                        }
                    }
                });
            } else {
                inflate.setVisibility(0);
            }
        }
    }

    private TransitionDrawable a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d49ef5e849741333a5eaf6e3e4f0dc87", RobustBitConfig.DEFAULT_VALUE)) {
            return (TransitionDrawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d49ef5e849741333a5eaf6e3e4f0dc87");
        }
        try {
            Drawable background = getWindow().getDecorView().getBackground();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
            if (background == null) {
                return new TransitionDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable});
            }
            return new TransitionDrawable(new Drawable[]{background, bitmapDrawable});
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d8ecba4175a79cf6d2c4f80e378219b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d8ecba4175a79cf6d2c4f80e378219b");
        } else if (this.j != null) {
            this.j.cancel();
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5674d47f0acd14747f855d19da6997d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5674d47f0acd14747f855d19da6997d9");
            return;
        }
        d();
        if (this.g != null) {
            this.g.d();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87378dae0865829cf8b185539da165eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87378dae0865829cf8b185539da165eb");
            return;
        }
        super.onPause();
        f();
    }

    @Override // com.sankuai.meituan.takeoutnew.base.WmBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc022b549c6ab440efb04c0d3769096d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc022b549c6ab440efb04c0d3769096d");
            return;
        }
        super.onDestroy();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66d9b73fe73fc578a63fec60f6bb2189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66d9b73fe73fc578a63fec60f6bb2189");
        } else if (this.g != null) {
            this.g.g();
        }
        this.p = true;
        getWindow().getDecorView().setBackgroundDrawable(null);
        com.sankuai.meituan.takeoutnew.ui.page.boot.a.a().b();
        ad.b(this.v);
        ad.b(this.D);
        ad.b(this.E);
        com.sankuai.meituan.takeoutnew.ui.page.boot.report.b a2 = com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "b11e444f2d516b932a3d1d08e24ba6ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "b11e444f2d516b932a3d1d08e24ba6ed");
        } else if (a2.e || !a2.d) {
        } else {
            h.a(a2.c);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7988a68d3c089d48c4cab33ef6fbe8a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7988a68d3c089d48c4cab33ef6fbe8a9");
            return;
        }
        super.onPostResume();
        if (isFinishing() || this.p) {
            finish();
        }
    }

    private Map<String, Object> b(com.sankuai.waimai.business.page.homepage.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c9216d3d9cb6f93d4bdf1e8f086ede8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c9216d3d9cb6f93d4bdf1e8f086ede8");
        }
        if (bVar == null) {
            return null;
        }
        WelcomeAd welcomeAd = bVar instanceof WelcomeAd ? (WelcomeAd) bVar : null;
        if (welcomeAd != null && welcomeAd.isAd == 2) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("adType", welcomeAd.adType);
                jSONObject.put("adChargeInfo", com.sankuai.waimai.business.page.common.util.c.a(welcomeAd.chargeInfo));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            hashMap.put("ad", jSONObject.toString());
            return hashMap;
        }
        return null;
    }

    private int c(com.sankuai.waimai.business.page.homepage.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d80ab114d74a31a600072e5abdc27664", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d80ab114d74a31a600072e5abdc27664")).intValue();
        }
        if (bVar == null) {
            return 0;
        }
        WelcomeAd welcomeAd = bVar instanceof WelcomeAd ? (WelcomeAd) bVar : null;
        if (welcomeAd != null && welcomeAd.isAd == 2) {
            return welcomeAd.adType;
        }
        return 0;
    }

    private String d(com.sankuai.waimai.business.page.homepage.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e0c9ea695f7edfae255793baafcd5d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e0c9ea695f7edfae255793baafcd5d6");
        }
        if (bVar == null) {
            return null;
        }
        WelcomeAd welcomeAd = bVar instanceof WelcomeAd ? (WelcomeAd) bVar : null;
        if (welcomeAd != null && welcomeAd.isAd == 2) {
            StringBuilder sb = new StringBuilder();
            com.sankuai.waimai.platform.b A = com.sankuai.waimai.platform.b.A();
            g.j();
            sb.append(welcomeAd.chargeInfo);
            sb.append("&wm_dtype=");
            sb.append(A.o());
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(A.h());
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(A.g());
            sb.append("&wm_ctype=");
            sb.append(A.o());
            sb.append("&wm_did=");
            sb.append(A.b());
            return sb.toString();
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class c implements a.InterfaceC0655a<com.sankuai.waimai.business.page.homepage.model.b> {
        public static ChangeQuickRedirect a;
        public long b;

        @Override // com.sankuai.meituan.takeoutnew.util.tool.a.InterfaceC0655a
        public final /* synthetic */ void a(com.sankuai.waimai.business.page.homepage.model.b bVar) {
            com.sankuai.waimai.business.page.homepage.model.b bVar2 = bVar;
            Object[] objArr = {bVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d96a5a83a44471c21e61971c77601b57", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d96a5a83a44471c21e61971c77601b57");
            } else if (SplashAdActivity.this.q) {
            } else {
                SplashAdActivity.b(SplashAdActivity.this, true);
                ad.b(SplashAdActivity.this.v);
                if (bVar2 != null && SplashAdActivity.this.f != null && !bVar2.isHalfScreenType()) {
                    SplashAdActivity.this.r = -999;
                    SplashAdActivity.this.s = -999;
                    SplashAdActivity.this.t = -999;
                    SplashAdActivity.this.u = -999;
                    SplashAdActivity.this.f.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity.c.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnTouchListener
                        @SuppressLint({"ClickableViewAccessibility"})
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            Object[] objArr2 = {view, motionEvent};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06bf619518f6ab7f4e19bbc9dd2d1863", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06bf619518f6ab7f4e19bbc9dd2d1863")).booleanValue();
                            }
                            switch (motionEvent.getAction()) {
                                case 0:
                                    SplashAdActivity.this.r = (int) motionEvent.getX();
                                    SplashAdActivity.this.s = (int) motionEvent.getY();
                                    break;
                                case 1:
                                    SplashAdActivity.this.t = (int) motionEvent.getX();
                                    SplashAdActivity.this.u = (int) motionEvent.getY();
                                    break;
                            }
                            return false;
                        }
                    });
                }
                SplashAdActivity.a(SplashAdActivity.this, bVar2);
            }
        }

        public c(long j) {
            Object[] objArr = {SplashAdActivity.this, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5062ddb94b0bfda8754c85189206d8a9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5062ddb94b0bfda8754c85189206d8a9");
            } else {
                this.b = j;
            }
        }
    }

    private void a(ImageView imageView, String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "345629c80cb31663e6b88c3764df1e76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "345629c80cb31663e6b88c3764df1e76");
        } else if (str == null) {
        } else {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = com.meituan.android.singleton.b.a;
            b.C0608b b2 = a2.b(str);
            b2.f = ImageQualityUtil.a(0);
            b2.a(new b.d() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eff9cbd90dc2b28e7769973a2554f63d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eff9cbd90dc2b28e7769973a2554f63d");
                        return;
                    }
                    e.a("SplashAdActivity", "showGif fail");
                    SplashAdActivity.this.b();
                }
            }).a(imageView);
        }
    }

    private void a(ImageView imageView, int i) {
        Object[] objArr = {imageView, Integer.valueOf((int) R.drawable.splash_btn)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a5194b327251e23c6398ef3c5bd2c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a5194b327251e23c6398ef3c5bd2c2");
            return;
        }
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = com.meituan.android.singleton.b.a;
        a2.d = R.drawable.splash_btn;
        a2.f = ImageQualityUtil.a(0);
        a2.a(new b.d() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.d
            public final void a() {
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.d
            public final void a(int i2, Exception exc) {
                Object[] objArr2 = {Integer.valueOf(i2), exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a7153b7e5ddf70e84d037b18b363574", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a7153b7e5ddf70e84d037b18b363574");
                    return;
                }
                e.a("SplashAdActivity", "showGif fail");
                SplashAdActivity.this.b();
            }
        }).a(imageView);
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e85d36ea273011d04d1064062a143c0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e85d36ea273011d04d1064062a143c0c");
        } else if (TextUtils.isEmpty(str) || com.sankuai.meituan.takeoutnew.ui.page.boot.a.b) {
        } else {
            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;

        public static Drawable a(Context context, int i, int i2, int i3) {
            Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c85a1a8ed9718c7633054e523c13eb4", RobustBitConfig.DEFAULT_VALUE)) {
                return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c85a1a8ed9718c7633054e523c13eb4");
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor("#3fFFFFFF"));
            float f = i3 / 2.0f;
            gradientDrawable.setCornerRadius(f);
            gradientDrawable.setStroke(a(context, 1.5f), Color.parseColor("#7FFFFFFF"));
            int l = (int) (com.sankuai.waimai.platform.b.A().l() * 0.025d);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(f - l);
            gradientDrawable2.setColors(new int[]{i, i2});
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
            layerDrawable.setLayerInset(1, l, l, l, l);
            return layerDrawable;
        }

        private static int a(Context context, float f) {
            Object[] objArr = {context, Float.valueOf(1.5f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f1ebfc03db5a816eb285094092fee41", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f1ebfc03db5a816eb285094092fee41")).intValue() : (int) ((context.getResources().getDisplayMetrics().density * 1.5f) + 0.5f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        int b;
        int c;
        int d;
        String e;
        String f;

        public a(Context context, com.sankuai.waimai.business.page.homepage.model.b bVar) {
            Object[] objArr = {context, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "752c8646f7947ef51cb7c18dff6b324f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "752c8646f7947ef51cb7c18dff6b324f");
            } else if (bVar != null) {
                try {
                    int i = (int) (bVar.opacity * 255.0d);
                    i = (i > 255 || i <= 0) ? 255 : 255;
                    int parseColor = Color.parseColor(bVar.topColor);
                    this.b = Color.argb(i, Color.red(parseColor), Color.green(parseColor), Color.blue(parseColor));
                    int parseColor2 = Color.parseColor(bVar.bottomColor);
                    this.c = Color.argb(i, Color.red(parseColor2), Color.green(parseColor2), Color.blue(parseColor2));
                    this.d = Color.parseColor(bVar.textColor);
                    com.sankuai.meituan.takeoutnew.ui.page.boot.ad.a aVar = new com.sankuai.meituan.takeoutnew.ui.page.boot.ad.a(context);
                    aVar.a(bVar.clickImageUrl);
                    this.f = aVar.b();
                    this.e = bVar.btnText;
                } catch (Exception unused) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            int i;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca57a899e098b2b9ad52496fac50afd", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca57a899e098b2b9ad52496fac50afd")).booleanValue();
            }
            if (!TextUtils.isEmpty(this.f) && !TextUtils.isEmpty(this.e)) {
                String str = this.e;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "87c0966c38e97ee9c97ae1e84a278212", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "87c0966c38e97ee9c97ae1e84a278212")).intValue();
                } else {
                    int i2 = 0;
                    for (int i3 = 0; i3 < str.length(); i3++) {
                        int codePointAt = Character.codePointAt(str, i3);
                        i2 = (codePointAt < 0 || codePointAt > 255) ? i2 + 2 : i2 + 1;
                    }
                    i = i2;
                }
                if (i <= 24) {
                    return true;
                }
            }
            return false;
        }
    }
}
