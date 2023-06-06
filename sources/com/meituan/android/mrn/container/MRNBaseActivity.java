package com.meituan.android.mrn.container;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.MRNRootView;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.mrn.config.h;
import com.meituan.android.mrn.config.horn.m;
import com.meituan.android.mrn.config.z;
import com.meituan.android.mrn.containerplugin.stage.IContainerLifeCycleStage;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.engine.s;
import com.meituan.android.mrn.shell.MRNReactPackageInterface;
import com.meituan.android.mrn.utils.ae;
import com.meituan.android.mrn.utils.af;
import com.meituan.android.mrn.utils.am;
import com.meituan.android.mrn.utils.i;
import com.meituan.android.mrn.utils.p;
import com.meituan.metrics.MetricsNameProvider;
import com.meituan.metrics.MetricsTagsProvider;
import com.meituan.metrics.common.Constants;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.view.ToastView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@SuppressLint({"Registered"})
/* loaded from: classes2.dex */
public class MRNBaseActivity extends BaseActivity implements com.facebook.react.modules.core.b, com.facebook.react.modules.core.e, b, MetricsNameProvider, MetricsTagsProvider {
    public static ChangeQuickRedirect b = null;
    private static final String i = "MRNBaseActivity";
    public ToastView c;
    protected MRNRootView d;
    public g e;
    protected LinearLayout f;
    protected Toolbar g;
    public FrameLayout h;
    private com.meituan.android.mrn.component.skeleton.a j;
    private View k;
    private View l;
    private int m;
    private long n;
    private boolean o;
    private int p;
    private boolean q;
    private com.meituan.android.mrn.component.b r;
    private h s;

    @Override // com.meituan.android.mrn.container.b
    public final com.facebook.react.modules.core.b j() {
        return this;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    @Deprecated
    public void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i2), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aa4de2bc9c54c66acb63f8968227c30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aa4de2bc9c54c66acb63f8968227c30");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i2, strArr, iArr).b) {
        }
    }

    public MRNBaseActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee43076be6c473f433fd36fc6becfcee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee43076be6c473f433fd36fc6becfcee");
            return;
        }
        this.m = 0;
        this.n = System.currentTimeMillis();
        this.o = false;
        this.q = false;
    }

    public static /* synthetic */ void b(MRNBaseActivity mRNBaseActivity, int i2) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, mRNBaseActivity, changeQuickRedirect, false, "be235bbb5eca040be23cfe6caab3b592", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mRNBaseActivity, changeQuickRedirect, false, "be235bbb5eca040be23cfe6caab3b592");
        } else if (mRNBaseActivity.j == null || mRNBaseActivity.j.b) {
        } else {
            if (i2 == 0) {
                mRNBaseActivity.j.setVisibility(0);
                return;
            }
            if (mRNBaseActivity.k != null) {
                mRNBaseActivity.k.setVisibility(8);
            }
            mRNBaseActivity.j.setAlpha(1.0f);
            if (System.currentTimeMillis() - mRNBaseActivity.n > 220) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, mRNBaseActivity, changeQuickRedirect2, false, "3319ff5267b9d8176955ab42b696a37e", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, mRNBaseActivity, changeQuickRedirect2, false, "3319ff5267b9d8176955ab42b696a37e")).booleanValue();
                } else if (mRNBaseActivity.e == null || mRNBaseActivity.e.p() == null || !mRNBaseActivity.e.p().n) {
                    z = false;
                }
                if (!z) {
                    ObjectAnimator duration = ObjectAnimator.ofFloat(mRNBaseActivity.j, "alpha", 1.0f, 0.0f).setDuration(200L);
                    duration.addListener(new AnimatorListenerAdapter() { // from class: com.meituan.android.mrn.container.MRNBaseActivity.4
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            Object[] objArr3 = {animator};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9da91517856add385bc654da240d5c81", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9da91517856add385bc654da240d5c81");
                                return;
                            }
                            super.onAnimationEnd(animator);
                            if (MRNBaseActivity.this.j != null) {
                                MRNBaseActivity.this.j.setVisibility(8);
                            }
                        }
                    });
                    duration.start();
                    return;
                }
            }
            mRNBaseActivity.j.setVisibility(8);
        }
    }

    public static /* synthetic */ void g(MRNBaseActivity mRNBaseActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, mRNBaseActivity, changeQuickRedirect, false, "44c0734ad479addae59c0be06974e072", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mRNBaseActivity, changeQuickRedirect, false, "44c0734ad479addae59c0be06974e072");
        } else if (mRNBaseActivity.l != null) {
            TextView textView = (TextView) mRNBaseActivity.l.findViewById(R.id.error_message);
            if (textView != null && mRNBaseActivity.e != null) {
                textView.setText(String.format("(%s)", mRNBaseActivity.e.x()));
            }
            TextView textView2 = (TextView) mRNBaseActivity.l.findViewById(R.id.indistinct_error_message);
            if (textView2 != null) {
                textView2.setText(mRNBaseActivity.n());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.android.mrn.container.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        View view;
        byte b2;
        boolean z;
        String str;
        JsonObject asJsonObject;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b298a40336263744b645b92aa5bf9759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b298a40336263744b645b92aa5bf9759");
            return;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6345570f619757810ad3ecbdc0d99609", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6345570f619757810ad3ecbdc0d99609");
            } else if (getIntent() != null && getIntent().getData() != null) {
                Uri data = getIntent().getData();
                String queryParameter = data.getQueryParameter("mrn_biz");
                String queryParameter2 = data.getQueryParameter("mrn_entry");
                if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2) && m.b.a()) {
                    JsonObject a = m.b.a("rn_" + queryParameter + CommonConstant.Symbol.UNDERLINE + queryParameter2);
                    if (a != null) {
                        Uri.Builder builder = new Uri.Builder();
                        builder.scheme("imeituan");
                        builder.authority("www.meituan.com");
                        builder.appendEncodedPath(ContainerInfo.ENV_MSC);
                        Iterator<String> it = a.keySet().iterator();
                        loop0: while (true) {
                            if (it.hasNext()) {
                                String next = it.next();
                                if (TextUtils.equals("ignore", next)) {
                                    if (a.get("ignore").isJsonObject() && (asJsonObject = a.get("ignore").getAsJsonObject()) != null) {
                                        for (String str2 : asJsonObject.keySet()) {
                                            String asString = asJsonObject.getAsJsonPrimitive(str2).getAsString();
                                            String queryParameter3 = data.getQueryParameter(str2);
                                            if (!TextUtils.isEmpty(asString) && !TextUtils.isEmpty(queryParameter3) && TextUtils.equals(asString, queryParameter3)) {
                                                break loop0;
                                            }
                                        }
                                        continue;
                                    }
                                } else if (TextUtils.equals("targetPath", next)) {
                                    String asString2 = a.getAsJsonPrimitive(next).getAsString();
                                    if (TextUtils.isEmpty(asString2)) {
                                        asString2 = "/pages/index/index";
                                    }
                                    Uri.Builder buildUpon = Uri.parse(asString2).buildUpon();
                                    for (String str3 : data.getQueryParameterNames()) {
                                        if (!TextUtils.equals(str3, "mrn_biz") && !TextUtils.equals(str3, "mrn_entry") && !TextUtils.equals(str3, "mrn_component")) {
                                            buildUpon.appendQueryParameter(str3, data.getQueryParameter(str3));
                                        }
                                    }
                                    builder.appendQueryParameter(next, buildUpon.build().toString());
                                } else {
                                    builder.appendQueryParameter(next, a.getAsJsonPrimitive(next).getAsString());
                                }
                            } else {
                                Intent intent = new Intent();
                                intent.addCategory("android.intent.category.DEFAULT");
                                intent.setAction("android.intent.action.VIEW");
                                intent.setData(builder.build());
                                if (getIntent().getExtras() != null) {
                                    intent.putExtras(getIntent().getExtras());
                                }
                                intent.setPackage(getPackageName());
                                startActivity(intent);
                                finish();
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.common.logging.a.d(i, "msc_router", th);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8acd25709e3cf72c797230c14f8b29ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8acd25709e3cf72c797230c14f8b29ea");
        } else {
            Bundle h = h();
            if (h != null) {
                Object obj = h.get("isTransparent");
                if (obj instanceof Boolean) {
                    this.o = ((Boolean) obj).booleanValue();
                } else if (obj instanceof String) {
                    this.o = Boolean.parseBoolean((String) obj);
                }
                Object obj2 = h.get("hideLoading");
                if (obj2 instanceof Boolean) {
                    this.q = ((Boolean) obj2).booleanValue();
                } else if (obj2 instanceof String) {
                    this.q = Boolean.parseBoolean((String) obj2);
                }
                this.p = h.containsKey("exitAnim") ? h.getInt("exitAnim") : -1;
            }
        }
        if (m() > 0) {
            setTheme(m());
        }
        super.onCreate(bundle);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1965623eb8727e1078885e86fe3882f3", RobustBitConfig.DEFAULT_VALUE)) {
            view = (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1965623eb8727e1078885e86fe3882f3");
        } else {
            this.f = new LinearLayout(this);
            this.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f.setOrientation(1);
            view = this.f;
        }
        setContentView(view);
        if (this.r == null) {
            this.r = com.meituan.android.mrn.component.c.a().b();
        }
        this.r.a();
        this.h = new FrameLayout(this);
        this.h.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f.addView(this.h);
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = b;
        this.d = PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "85773336970dbed8f9b9571b60d68396", RobustBitConfig.DEFAULT_VALUE) ? (MRNRootView) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "85773336970dbed8f9b9571b60d68396") : new MRNRootView(this);
        this.d.setMRNScene(this);
        if (this.d == null) {
            throw new RuntimeException("reactRootView should not be null");
        }
        this.k = a((Context) this);
        if (this.o && this.q) {
            this.k = new View(this);
        }
        if (this.k == null) {
            throw new RuntimeException("progressView should not be null");
        }
        this.k.setVisibility(0);
        this.h.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
        this.h.addView(this.k, new FrameLayout.LayoutParams(-1, -1));
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = b;
        this.e = PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "1e6b5cc4891504bf18c29e40c4ed43c3", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "1e6b5cc4891504bf18c29e40c4ed43c3") : new g(this, this);
        this.e.o.a(a());
        IContainerLifeCycleStage.IContainerCreateStage.a aVar = (IContainerLifeCycleStage.IContainerCreateStage.a) this.e.a((g) new IContainerLifeCycleStage.IContainerCreateStage.a());
        aVar.e = getIntent().getExtras();
        this.e.o.a(new IContainerLifeCycleStage.IContainerCreateStage.b(), aVar);
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = b;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "853ea7ba0eab2a5ab4ab44b6321177ca", RobustBitConfig.DEFAULT_VALUE)) {
            b2 = ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "853ea7ba0eab2a5ab4ab44b6321177ca")).booleanValue();
        } else {
            b2 = this.e.p() == null ? 1 : this.e.p().g;
        }
        Object[] objArr8 = {Byte.valueOf(b2)};
        ChangeQuickRedirect changeQuickRedirect8 = b;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "b651a5e9b8e3ad5bc6b068c5bef36c4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "b651a5e9b8e3ad5bc6b068c5bef36c4a");
        } else {
            if (b2 == 0) {
                View inflate = View.inflate(this, R.layout.mrn_common_base_toolbar, null);
                this.g = (Toolbar) inflate.findViewById(R.id.toolbar);
                this.g.setTitle(StringUtil.SPACE);
                z.a();
                View.inflate(this, R.layout.mrn_common_default_toolbar, this.g);
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = b;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "de0d3aaad94dc7c6ab5a5adc54d8ae1f", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "de0d3aaad94dc7c6ab5a5adc54d8ae1f");
                } else {
                    str = this.e.p() == null ? "" : this.e.p().f;
                }
                setTitle(str);
                this.f.addView(inflate, 0);
                setSupportActionBar(this.g);
                Object[] objArr10 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect10 = b;
                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "5239a75e736b9084b6959ecc931e2e9f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "5239a75e736b9084b6959ecc931e2e9f");
                } else {
                    Object[] objArr11 = {0};
                    ChangeQuickRedirect changeQuickRedirect11 = b;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "18147d7d2aa70109c61a7c449396b510", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "18147d7d2aa70109c61a7c449396b510");
                    } else {
                        ActionBar supportActionBar = getSupportActionBar();
                        if (supportActionBar != null) {
                            supportActionBar.d(true);
                            supportActionBar.a(true);
                            this.g.setNavigationIcon(R.drawable.mrn_ic_back_arrow);
                        }
                    }
                }
            }
            Object[] objArr12 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect12 = b;
            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "0c9f1049d27d1174dea83a72f76796d0", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "0c9f1049d27d1174dea83a72f76796d0")).booleanValue();
            } else {
                z = this.e.p() != null && this.e.p().h;
            }
            if (z) {
                af.a(this, true);
            }
        }
        Object[] objArr13 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect13 = b;
        if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "adf7c5218a854e7cd1e51faced8a477d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "adf7c5218a854e7cd1e51faced8a477d");
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f.getChildAt(0);
            this.j = ae.a(this, this.e.p());
            if (this.j != null) {
                viewGroup.addView(this.j);
            }
        }
        Object[] objArr14 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect14 = b;
        if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "025496cf74e9a9a71b792fd663a065be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "025496cf74e9a9a71b792fd663a065be");
        } else if (this.o) {
            Object[] objArr15 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect15 = b;
            if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "de76b35890f9b5b89ee6b733eb7abf0b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "de76b35890f9b5b89ee6b733eb7abf0b");
            } else {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
                getWindow().getDecorView().setBackgroundColor(0);
                getWindow().setFormat(-3);
                am.a(this);
                Object[] objArr16 = {this};
                ChangeQuickRedirect changeQuickRedirect16 = am.a;
                if (PatchProxy.isSupport(objArr16, null, changeQuickRedirect16, true, "5a525878c6fd06c9f58a170b5b068ba0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr16, null, changeQuickRedirect16, true, "5a525878c6fd06c9f58a170b5b068ba0");
                } else if (Build.VERSION.SDK_INT >= 21) {
                    getWindow().clearFlags(67108864);
                    getWindow().getDecorView().setSystemUiVisibility(9472);
                    getWindow().addFlags(Integer.MIN_VALUE);
                    getWindow().setStatusBarColor(0);
                }
            }
            Object[] objArr17 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect17 = b;
            if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "7ce9cbdd58eba12822cf7f4022f38e6a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "7ce9cbdd58eba12822cf7f4022f38e6a");
            } else {
                this.f.setBackgroundColor(0);
            }
            this.k.setBackgroundColor(0);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d06a0cea7dce0bc08f6a7066d0fb09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d06a0cea7dce0bc08f6a7066d0fb09");
            return;
        }
        super.finish();
        if (this.o) {
            overridePendingTransition(0, this.p);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e4030c2cab1a4889555e37804dc9f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e4030c2cab1a4889555e37804dc9f9");
            return;
        }
        super.onPostCreate(bundle);
        this.e.a(this.r);
        this.e.a(bundle);
    }

    @Override // com.meituan.android.mrn.container.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        boolean z = true;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "310c48935c85bcc0de55056c5c5e0833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "310c48935c85bcc0de55056c5c5e0833");
            return;
        }
        g gVar = this.e;
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = g.c;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "1b30fd6ea698353e89aba4c7b81f5f25", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "1b30fd6ea698353e89aba4c7b81f5f25")).booleanValue();
        } else {
            if (gVar.k != null) {
                s sVar = gVar.k;
                Object[] objArr3 = {intent};
                ChangeQuickRedirect changeQuickRedirect3 = s.a;
                if (PatchProxy.isSupport(objArr3, sVar, changeQuickRedirect3, false, "bab2b551938a96f74f92027ee4ba72fa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, sVar, changeQuickRedirect3, false, "bab2b551938a96f74f92027ee4ba72fa");
                } else {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("lifecycle", "ON_HOST_NEW_INTENT");
                    createMap.putString("action", intent != null ? intent.getAction() : "");
                    createMap.putString(Constants.TRAFFIC_URI, (intent == null || intent.getData() == null) ? "" : intent.getData().toString());
                    sVar.a(createMap);
                }
            }
            if (gVar.g != null) {
                gVar.g.onNewIntent(intent);
            } else {
                z = false;
            }
        }
        if (z) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // com.meituan.android.mrn.container.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7d7d1676b3249c511c351e476baa2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7d7d1676b3249c511c351e476baa2d");
            return;
        }
        try {
            g gVar = this.e;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = g.c;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "9a0f43bd6b1d6ca10a9326f033bc4660", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "9a0f43bd6b1d6ca10a9326f033bc4660");
            } else {
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.module.utils.d.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e8f87b30915f6175aebc9c7b91a255b3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e8f87b30915f6175aebc9c7b91a255b3");
                } else {
                    Statistics.disableAutoPVPD(AppUtil.generatePageInfoKey(this));
                }
            }
        } catch (Exception e) {
            com.meituan.android.mrn.utils.c.a("[MRNBaseActivity@onResume]", e);
        }
        super.onResume();
        i.a(this.e.o());
        this.e.f();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8751efdea1969fd1508ed9649b9f68cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8751efdea1969fd1508ed9649b9f68cd");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i2, i3, intent);
        this.e.b(i2, i3, intent);
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "857334ad8c033b1bdac1836d29138263", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "857334ad8c033b1bdac1836d29138263");
            return;
        }
        i.a();
        super.onPause();
        this.e.g();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca21e38e836785840cd54b2adb4334f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca21e38e836785840cd54b2adb4334f5");
            return;
        }
        super.onStop();
        this.e.h();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a48a0c357fffa3896a9459a036546c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a48a0c357fffa3896a9459a036546c5");
            return;
        }
        super.onDestroy();
        this.e.j();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3ef366872e47b00d04ef7059da050b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3ef366872e47b00d04ef7059da050b5");
            return;
        }
        this.j = null;
        this.k = null;
        this.l = null;
        this.d = null;
        this.e = null;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0042bf1cc564bd02593c9aadc931ffb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0042bf1cc564bd02593c9aadc931ffb8");
        } else if (this.e.k()) {
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.facebook.react.modules.core.b
    public final void r_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6c71eafa86fe8daa3fa835e4d7f0594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6c71eafa86fe8daa3fa835e4d7f0594");
        } else {
            finish();
        }
    }

    @Override // com.meituan.android.mrn.container.b
    public final ReactRootView b() {
        return this.d;
    }

    @Override // com.meituan.android.mrn.container.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9124b4e7fcb76d4197dda6685cba801e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9124b4e7fcb76d4197dda6685cba801e") : (this.e == null || this.e.p() == null) ? "" : this.e.p().i;
    }

    @Override // com.meituan.android.mrn.container.b
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "231a009b7091220350be5b30fdaa930d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "231a009b7091220350be5b30fdaa930d") : (this.e == null || this.e.p() == null) ? "" : this.e.p().e;
    }

    @Override // com.meituan.android.mrn.container.b
    public Bundle h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98c0aa4e8915c66c92fcfab94b322857", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98c0aa4e8915c66c92fcfab94b322857");
        }
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (intent.getExtras() != null) {
            for (String str : intent.getExtras().keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    Object obj = intent.getExtras().get(str);
                    if (obj instanceof Integer) {
                        bundle.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Double) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putDouble(str, ((Float) obj).floatValue());
                    } else if (obj instanceof Long) {
                        bundle.putDouble(str, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str, (String) obj);
                    } else if (obj instanceof Short) {
                        bundle.putInt(str, ((Short) obj).shortValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    }
                }
            }
        }
        if (intent.getData() != null) {
            Uri data = intent.getData();
            for (String str2 : data.getQueryParameterNames()) {
                bundle.putString(str2, data.getQueryParameter(str2));
            }
        }
        return bundle;
    }

    @Override // com.meituan.android.mrn.container.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28ca95ff7ae562fa89c744229611453a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28ca95ff7ae562fa89c744229611453a");
        } else {
            a(0);
        }
    }

    @Override // com.meituan.android.mrn.container.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d802241255557055b7e5d84ae59c91c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d802241255557055b7e5d84ae59c91c4");
        } else {
            a(1);
        }
    }

    @Override // com.meituan.android.mrn.container.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e851525c41f268911ee29253480202a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e851525c41f268911ee29253480202a9");
        } else {
            a(2);
        }
    }

    @Override // com.meituan.android.mrn.container.b
    public final List<com.facebook.react.i> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dffb319c773a50ea1fbd76a20939b34", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dffb319c773a50ea1fbd76a20939b34");
        }
        ArrayList arrayList = new ArrayList();
        Uri uri = null;
        String str = (this.e == null || this.e.p() == null) ? null : this.e.p().c;
        String str2 = (this.e == null || this.e.p() == null) ? null : this.e.p().d;
        if (this.e != null && this.e.p() != null) {
            uri = this.e.p().b;
        }
        if (uri != null) {
            String.format("mrnurl=%s", uri.toString());
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (com.sankuai.meituan.serviceloader.b.a()) {
                    p.a("[MRNBaseActivity@getRegistPackages]", i + ".getRegistPackages: ServiceLoader初始化成功,entryName: " + str2);
                    List a = com.sankuai.meituan.serviceloader.b.a(MRNReactPackageInterface.class, str2);
                    if (a != null && !a.isEmpty() && a.get(0) != null) {
                        arrayList.addAll(((MRNReactPackageInterface) a.get(0)).a());
                    }
                } else {
                    com.meituan.android.mrn.utils.c.a("[MRNBaseActivity@getRegistPackages]", "ServiceLoader尚未初始化, entryName: " + str2);
                    com.facebook.common.logging.a.b("[MRNBaseActivity@getRegistPackages]", i + ".getRegistPackages: ServiceLoader尚未初始化, entryName: " + str2);
                }
                List<com.facebook.react.i> a2 = com.meituan.android.mrn.config.p.a(str, str2);
                if (a2 != null) {
                    arrayList.addAll(a2);
                }
            } else {
                String str3 = i + ".getRegistPackages: entryName为空, mDelegate:" + (this.e != null ? "不为空" : "为空");
                com.meituan.android.mrn.utils.c.a("[MRNBaseActivity@getRegistPackages]", str3);
                com.facebook.common.logging.a.b("[MRNBaseActivity@getRegistPackages]", str3);
            }
        } catch (Exception e) {
            com.meituan.android.mrn.utils.c.a("mrn_get_packages", e);
            com.facebook.common.logging.a.b("[MRNBaseActivity@getRegistPackages]", "mrn_get_packages", e);
        }
        return arrayList;
    }

    @Override // com.meituan.android.mrn.container.b
    @Deprecated
    public final View g() {
        return this.l;
    }

    public View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98051272ac5575a757571a5a598f1f88", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98051272ac5575a757571a5a598f1f88");
        }
        this.s = z.a().a();
        return this.s.a(context, getIntent().getData(), this);
    }

    public View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63e8eb0c66ea8c0c681fe2383f9a65a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63e8eb0c66ea8c0c681fe2383f9a65a2");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.mrn_common_error_layout, (ViewGroup) null);
        z.a();
        inflate.findViewById(R.id.customNavigationBar).setVisibility(0);
        inflate.findViewById(R.id.mrn_retry).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.mrn.container.MRNBaseActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "027a6b813909f2bb578311822ddd6da8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "027a6b813909f2bb578311822ddd6da8");
                } else if (MRNBaseActivity.this.m <= 1) {
                    MRNBaseActivity.this.e.w();
                    MRNBaseActivity.this.m++;
                    if (MRNBaseActivity.this.m >= 2) {
                        ((TextView) view).setText("关闭页面");
                    }
                } else {
                    MRNBaseActivity.this.finish();
                }
            }
        });
        inflate.findViewById(R.id.btnClose).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.mrn.container.MRNBaseActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b619016371882397691b35b9198751a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b619016371882397691b35b9198751a");
                } else {
                    MRNBaseActivity.this.r_();
                }
            }
        });
        return inflate;
    }

    private int m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c02942cefe62d8c410dec6273ec8422", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c02942cefe62d8c410dec6273ec8422")).intValue();
        }
        z.a();
        return R.style.Mrn_CommonToolBarStyle;
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eddf95554dfc8f115a99f8e5726db45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eddf95554dfc8f115a99f8e5726db45");
        } else if (this.g != null) {
            ((TextView) this.g.findViewById(R.id.title)).setText(charSequence);
        }
    }

    @Override // android.app.Activity
    public void setTitleColor(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "857c4c6ae8995eb14ab905eabe40ae1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "857c4c6ae8995eb14ab905eabe40ae1e");
        } else if (this.g != null) {
            ((TextView) this.g.findViewById(R.id.title)).setTextColor(getResources().getColor(i2));
        }
    }

    @Override // android.app.Activity
    public void setTitle(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a307be6e16384e44ba8cee2e91db22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a307be6e16384e44ba8cee2e91db22");
        } else {
            setTitle(getResources().getString(i2));
        }
    }

    public final g k() {
        return this.e;
    }

    public final k l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cbb66314bfcb3ab782a13c1ca865ad7", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cbb66314bfcb3ab782a13c1ca865ad7");
        }
        if (this.e != null) {
            return this.e.f;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyUp(int r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9 = 0
            r8[r9] = r1
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.mrn.container.MRNBaseActivity.b
            java.lang.String r12 = "20e6d4e169abe44927fcd02719bf5c44"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L29
            java.lang.Object r14 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            return r14
        L29:
            com.meituan.android.mrn.container.g r7 = r13.e
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r8[r9] = r0
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.mrn.container.g.c
            java.lang.String r12 = "5a0f153983be59097ee1397f11a2452a"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r8
            r1 = r7
            r2 = r11
            r4 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L51
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r7, r11, r9, r12)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto La9
        L51:
            boolean r0 = com.meituan.android.mrn.debug.a.a()
            if (r0 == 0) goto La8
            com.facebook.react.ReactInstanceManager r0 = r7.g
            if (r0 == 0) goto La8
            com.facebook.react.ReactInstanceManager r0 = r7.g
            com.facebook.react.devsupport.interfaces.b r0 = r0.getDevSupportManager()
            if (r0 == 0) goto La8
            r0 = 82
            if (r14 != r0) goto L6e
            com.facebook.react.ReactInstanceManager r0 = r7.g
            r0.getDevSupportManager()
        L6c:
            r0 = 1
            goto La9
        L6e:
            com.facebook.react.devsupport.c r0 = r7.d
            java.lang.Object r0 = com.facebook.infer.annotation.a.a(r0)
            com.facebook.react.devsupport.c r0 = (com.facebook.react.devsupport.c) r0
            android.app.Activity r1 = r7.m()
            android.view.View r1 = r1.getCurrentFocus()
            r2 = 46
            if (r14 != r2) goto L9f
            boolean r1 = r1 instanceof android.widget.EditText
            if (r1 != 0) goto L9f
            boolean r1 = r0.a
            if (r1 == 0) goto L8e
            r0.a = r9
            r0 = 1
            goto La0
        L8e:
            r0.a = r10
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            com.facebook.react.devsupport.c$1 r2 = new com.facebook.react.devsupport.c$1
            r2.<init>()
            r3 = 200(0xc8, double:9.9E-322)
            r1.postDelayed(r2, r3)
        L9f:
            r0 = 0
        La0:
            if (r0 == 0) goto La8
            com.facebook.react.ReactInstanceManager r0 = r7.g
            r0.getDevSupportManager()
            goto L6c
        La8:
            r0 = 0
        La9:
            if (r0 != 0) goto Lb3
            boolean r14 = super.onKeyUp(r14, r15)
            if (r14 == 0) goto Lb2
            goto Lb3
        Lb2:
            return r9
        Lb3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.container.MRNBaseActivity.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    @Override // com.meituan.android.mrn.container.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49612ed560ce2be28da44dc508c57915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49612ed560ce2be28da44dc508c57915");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            bundle.remove("android:viewHierarchyState");
        }
    }

    private void a(final int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e93c2cc331d8319a6f309cdc0a3b969", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e93c2cc331d8319a6f309cdc0a3b969");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.container.MRNBaseActivity.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88247536c96e16d27b282655855b2dcd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88247536c96e16d27b282655855b2dcd");
                        return;
                    }
                    MRNBaseActivity.b(MRNBaseActivity.this, i2);
                    if (MRNBaseActivity.this.k != null) {
                        MRNBaseActivity.this.k.setVisibility(i2 == 0 ? 0 : 8);
                        if (i2 != 0) {
                            com.meituan.android.mrn.component.b unused = MRNBaseActivity.this.r;
                        }
                    }
                    if (i2 == 1 && MRNBaseActivity.this.l == null) {
                        MRNBaseActivity.this.l = MRNBaseActivity.this.b((Context) MRNBaseActivity.this);
                        if (MRNBaseActivity.this.l != null) {
                            if (MRNBaseActivity.this.h != null) {
                                MRNBaseActivity.this.h.addView(MRNBaseActivity.this.l, new FrameLayout.LayoutParams(-1, -1));
                            }
                        } else {
                            throw new RuntimeException("errorView should not be null");
                        }
                    }
                    if (MRNBaseActivity.this.l == null || i2 != 1) {
                        return;
                    }
                    MRNBaseActivity.this.l.setVisibility(0);
                    MRNBaseActivity.g(MRNBaseActivity.this);
                }
            });
        }
    }

    private String n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56247f506efda1134297573839fdd028", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56247f506efda1134297573839fdd028");
        }
        try {
            return String.format("App Name: %s\nApp Version: %s", getResources().getString(getApplicationInfo().labelRes), Integer.valueOf(com.meituan.android.mrn.config.c.a().m()));
        } catch (Throwable th) {
            com.facebook.common.logging.a.d("MRNBaseActivity@getIndistinctErrorMessage", null, th);
            return "";
        }
    }

    @Override // com.meituan.metrics.MetricsNameProvider
    public String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7297833a231d22da160474fb40e8f580", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7297833a231d22da160474fb40e8f580");
        }
        if (this.e != null) {
            return this.e.y();
        }
        return null;
    }

    @Override // com.meituan.metrics.MetricsTagsProvider
    public Map<String, Object> getTags(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff99af8adefaaace93001c67028f5673", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff99af8adefaaace93001c67028f5673");
        }
        if (this.e != null) {
            return this.e.z();
        }
        return null;
    }
}
