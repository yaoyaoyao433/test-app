package com.meituan.android.yoda.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.j;
import com.meituan.android.yoda.util.o;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompactFactory;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.base.TitansFragment;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.services.IContainerAdapter;
import com.sankuai.titans.protocol.services.IContainerProvider;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class YodaKNBFragment extends BaseFragment implements com.meituan.android.yoda.interfaces.b, IContainerProvider {
    public static ChangeQuickRedirect o;
    public WebView p;
    private j q;
    private com.meituan.android.yoda.callbacks.c r;
    private com.meituan.android.yoda.interfaces.c s;
    private FrameLayout t;
    private Bundle u;
    private int v;
    private final KNBWebCompat w;
    private TitansFragment x;
    private com.meituan.android.yoda.knb.plugin.a y;
    private BroadcastReceiver z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class CallbackError {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int code;
        public String msg;
        public String requestCode;
        public int status;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class CallbackNextVerify {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int listIndex;
        public int next;
        public String requestCode;
        public int status;
        public String yodaAction;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class CallbackSuccess {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String requestCode;
        public String responseCode;
        public int status;
    }

    public static String k() {
        return "YodaKNBFragment_verify";
    }

    public static String l() {
        return "YodaKNBFragment_web";
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(boolean z) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, Error error) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, String str2) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void c(String str, int i, @Nullable Bundle bundle) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void d(String str, int i, @Nullable Bundle bundle) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final String e() {
        return null;
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void f() {
    }

    @Override // com.meituan.android.yoda.interfaces.b
    public final boolean j() {
        return false;
    }

    public YodaKNBFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dd89e59d83fa95bc92b688bea94020e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dd89e59d83fa95bc92b688bea94020e");
        } else {
            this.w = KNBWebCompactFactory.getKNBCompact(0);
        }
    }

    public static /* synthetic */ void a(YodaKNBFragment yodaKNBFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, yodaKNBFragment, changeQuickRedirect, false, "b2ef32b05b62e1f106687796bf29d7a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, yodaKNBFragment, changeQuickRedirect, false, "b2ef32b05b62e1f106687796bf29d7a9");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("action")) {
                    String valueOf = String.valueOf(jSONObject.get("action"));
                    if (!"regionalChoice".equals(valueOf)) {
                        if ("yodaWebCallback".equalsIgnoreCase(valueOf)) {
                            yodaKNBFragment.a(jSONObject);
                            return;
                        }
                        return;
                    }
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = o;
                    if (PatchProxy.isSupport(objArr2, yodaKNBFragment, changeQuickRedirect2, false, "6e3ebeb9cde113ebb2bcbfe0695c9ed6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, yodaKNBFragment, changeQuickRedirect2, false, "6e3ebeb9cde113ebb2bcbfe0695c9ed6");
                        return;
                    }
                    try {
                        String str2 = yodaKNBFragment.c;
                        com.meituan.android.yoda.monitor.log.a.a(str2, "handleChangeRegional, requestCode = " + yodaKNBFragment.d, true);
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (jSONObject2.has("name") && jSONObject2.has("code")) {
                            Object[] objArr3 = {jSONObject2};
                            ChangeQuickRedirect changeQuickRedirect3 = o;
                            if (PatchProxy.isSupport(objArr3, yodaKNBFragment, changeQuickRedirect3, false, "44f322928fa96dc8e0bfb42a6980764e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, yodaKNBFragment, changeQuickRedirect3, false, "44f322928fa96dc8e0bfb42a6980764e");
                            } else if (yodaKNBFragment.getActivity() instanceof com.meituan.android.yoda.callbacks.c) {
                                yodaKNBFragment.getActivity();
                            }
                        }
                        o.a().a(yodaKNBFragment.getActivity());
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                String str3 = yodaKNBFragment.c;
                com.meituan.android.yoda.monitor.log.a.a(str3, "handleH5Publish, js message have no action data, requestCode = " + yodaKNBFragment.d, true);
            } catch (Exception e) {
                String str4 = yodaKNBFragment.c;
                com.meituan.android.yoda.monitor.log.a.a(str4, "handleH5Publish, exception = " + e.getMessage() + ", requestCode = " + yodaKNBFragment.d, true);
            }
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91a4b5068ea00d8f68a5fc6e3595695f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91a4b5068ea00d8f68a5fc6e3595695f");
            return;
        }
        super.onCreate(bundle);
        this.u = bundle;
        this.v = getResources().getColor(R.color.yoda_knb_web_view_bg_color);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d8b4e700574535bf1fd4dc9706cda76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d8b4e700574535bf1fd4dc9706cda76");
            return;
        }
        this.z = new BroadcastReceiver() { // from class: com.meituan.android.yoda.fragment.YodaKNBFragment.6
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr3 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "56a829e94518fc37672a3ce55f13cfe2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "56a829e94518fc37672a3ce55f13cfe2");
                } else if (intent == null || intent.getExtras() == null) {
                    String str = YodaKNBFragment.this.c;
                    com.meituan.android.yoda.monitor.log.a.a(str, "registerKNBBridge.onReceive, js param error. requestCode = " + YodaKNBFragment.this.d, true);
                } else {
                    Bundle extras = intent.getExtras();
                    String string = extras != null ? extras.getString("data") : "";
                    String str2 = YodaKNBFragment.this.c;
                    com.meituan.android.yoda.monitor.log.a.a(str2, "registerKNBBridge.onReceive, requestCode = " + YodaKNBFragment.this.d + ", jsPublishParam = " + string, true);
                    YodaKNBFragment.a(YodaKNBFragment.this, string);
                }
            }
        };
        try {
            getActivity().registerReceiver(this.z, new IntentFilter("yodaWebCallback"));
        } catch (Exception e) {
            String str = this.c;
            com.meituan.android.yoda.monitor.log.a.a(str, "registerKNBBridge, exception = " + e.getMessage(), true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d066a6d9629b653901e528295c99746", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d066a6d9629b653901e528295c99746");
            return;
        }
        String str = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str, "onAttach, requestCode = " + this.d, true);
        super.onAttach(context);
        if (context instanceof com.meituan.android.yoda.callbacks.c) {
            this.r = (com.meituan.android.yoda.callbacks.c) context;
            this.r.a(this);
        }
        if (context instanceof com.meituan.android.yoda.interfaces.c) {
            this.s = (com.meituan.android.yoda.interfaces.c) context;
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        boolean z;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a385a0ec8616739f719f9f2d565f3d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a385a0ec8616739f719f9f2d565f3d3");
        }
        String str = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str, "onCreateView, requestCode = " + this.d, true);
        View inflate = layoutInflater.inflate(R.layout.yoda_knb_activity_layout, viewGroup, false);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0846b4f237f58cf2d3e6633abcd151d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0846b4f237f58cf2d3e6633abcd151d");
        } else {
            this.t = (FrameLayout) inflate.findViewById(R.id.fragment_container);
            this.q = new j(getChildFragmentManager(), R.id.fragment_container);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = o;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c138361edefc5d6985499edd2a22fdbf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c138361edefc5d6985499edd2a22fdbf");
            } else if (this.s != null) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = o;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b01e88479ebad58305221a9fa2a03c6d", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b01e88479ebad58305221a9fa2a03c6d")).booleanValue();
                } else {
                    if (getArguments() != null) {
                        String string = getArguments().getString("next", "");
                        if (!TextUtils.isEmpty(string) && com.meituan.android.yoda.data.d.b(x.a(string, -2147483647))) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z) {
                    this.s.c(0);
                } else {
                    this.s.c(8);
                }
            }
            try {
                if (!Titans.hasInit()) {
                    Bundle bundle2 = this.u;
                    Object[] objArr5 = {bundle2};
                    ChangeQuickRedirect changeQuickRedirect5 = o;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "80f794b7f8eb64974ce915657076ff3b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "80f794b7f8eb64974ce915657076ff3b");
                    } else {
                        Bundle arguments = getArguments();
                        arguments.putString("url", arguments.getString("wenview_url", ""));
                        String str2 = this.c;
                        com.meituan.android.yoda.monitor.log.a.a(str2, "initializeOldKNB, arguments = " + arguments.toString(), true);
                        this.w.onCreate(getContext(), arguments);
                        View onCreateView = this.w.onCreateView(getLayoutInflater(), null);
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = o;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3ad61d4c75914255954b85a73c23b8f2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3ad61d4c75914255954b85a73c23b8f2");
                        } else {
                            a(new Runnable() { // from class: com.meituan.android.yoda.fragment.YodaKNBFragment.3
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "969d0c079e6308d0e78db6fad3d9ab6d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "969d0c079e6308d0e78db6fad3d9ab6d");
                                    } else if (YodaKNBFragment.this.w != null) {
                                        YodaKNBFragment.this.w.getTitleBarHost().showTitleBar(false);
                                    }
                                }
                            }, 150L);
                            a(new Runnable() { // from class: com.meituan.android.yoda.fragment.YodaKNBFragment.4
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e5ace500ad8971d92bb426c48f00a73f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e5ace500ad8971d92bb426c48f00a73f");
                                    } else if (YodaKNBFragment.this.w != null) {
                                        YodaKNBFragment.this.w.getTitleBarHost().showTitleBar(false);
                                    }
                                }
                            }, 200L);
                            a(new Runnable() { // from class: com.meituan.android.yoda.fragment.YodaKNBFragment.5
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "08f38112fecb466b14abe1c5745c9070", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "08f38112fecb466b14abe1c5745c9070");
                                    } else if (YodaKNBFragment.this.w != null) {
                                        YodaKNBFragment.this.w.getTitleBarHost().showTitleBar(false);
                                    }
                                }
                            }, 300L);
                        }
                        this.t.addView(onCreateView, new ViewGroup.LayoutParams(-1, -1));
                        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00000000"));
                        onCreateView.setBackground(colorDrawable);
                        this.p = this.w.getWebView();
                        this.p.setBackground(colorDrawable);
                        this.w.onActivityCreated(bundle2);
                        this.w.setLLButtonClickListener(new View.OnClickListener() { // from class: com.meituan.android.yoda.fragment.YodaKNBFragment.2
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr7 = {view};
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "88818770134672fa1079107e56c51250", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "88818770134672fa1079107e56c51250");
                                    return;
                                }
                                com.meituan.android.yoda.monitor.log.a.a(YodaKNBFragment.this.c, "initializeOldKNB, LLButtonClick.", true);
                                YodaKNBFragment.this.getActivity().onBackPressed();
                            }
                        });
                    }
                } else {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = o;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "bcb976b8bd81753849c6057b549594e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "bcb976b8bd81753849c6057b549594e4");
                    } else {
                        Bundle arguments2 = getArguments();
                        String str3 = this.c;
                        com.meituan.android.yoda.monitor.log.a.a(str3, "initializeNewKNB, arguments = " + arguments2.toString(), true);
                        this.y = new com.meituan.android.yoda.knb.plugin.a("yoda_knb_page_launch", "yoda_knb_page_launch_status", getRequestCode(), this.n);
                        Fragment b = this.q.b("titans_fragment");
                        if (b instanceof TitansFragment) {
                            this.x = (TitansFragment) b;
                        } else {
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = o;
                            this.x = TitansFragment.newInstance(PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "371b312a5e7c6735c3153549267d7365", RobustBitConfig.DEFAULT_VALUE) ? (Bundle) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "371b312a5e7c6735c3153549267d7365") : new Bundle(getArguments()), getIContainerAdapter());
                        }
                        this.q.a(this.x, "titans_fragment");
                    }
                }
            } catch (Exception e) {
                String str4 = this.c;
                com.meituan.android.yoda.monitor.log.a.a(str4, "init, exception = " + e.getMessage(), true);
            }
            getActivity().getWindow().setFormat(-3);
        }
        return inflate;
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25c248a1adb7678cae21e427e4bd3c07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25c248a1adb7678cae21e427e4bd3c07");
        } else {
            super.onViewCreated(view, bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4fefe8a3b6f8e120f4b5285be18c607", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4fefe8a3b6f8e120f4b5285be18c607");
            return;
        }
        super.onStart();
        if (Titans.hasInit()) {
            return;
        }
        this.w.onStart();
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9f8a378ddf5b89001324c841d734103", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9f8a378ddf5b89001324c841d734103");
            return;
        }
        super.onResume();
        if (Titans.hasInit()) {
            return;
        }
        this.w.onResume();
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81c7a5bf34630833a71c96e15150728d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81c7a5bf34630833a71c96e15150728d");
            return;
        }
        super.onPause();
        if (Titans.hasInit()) {
            return;
        }
        this.w.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83fd28e73a7eb07ff7de82bc91632b26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83fd28e73a7eb07ff7de82bc91632b26");
            return;
        }
        super.onStop();
        if (Titans.hasInit()) {
            return;
        }
        this.w.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e04c1af0fb72d040a98c3a86400fb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e04c1af0fb72d040a98c3a86400fb4");
            return;
        }
        String str = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str, "onDetach, requestCode = " + this.d, true);
        super.onDetach();
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9bebbce462436b1f0edbc039041c021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9bebbce462436b1f0edbc039041c021");
            return;
        }
        super.onDestroy();
        if (!Titans.hasInit()) {
            this.w.onDestroy();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1abc2a6a9d368a7abacb1294741a8b84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1abc2a6a9d368a7abacb1294741a8b84");
        } else if (getActivity() == null || this.z == null) {
        } else {
            try {
                getActivity().unregisterReceiver(this.z);
            } catch (Exception e) {
                String str = this.c;
                com.meituan.android.yoda.monitor.log.a.a(str, "unregisterKNBBridge, exception = " + e.getMessage(), true);
            }
            this.z = null;
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final View a(@NonNull View view, int i, String str, com.meituan.android.yoda.interfaces.e eVar) {
        Object[] objArr = {view, Integer.valueOf(i), str, eVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a38a7420b1b7e40b010eca9ef03353", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a38a7420b1b7e40b010eca9ef03353");
        }
        String str2 = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str2, "processChooseOtherTypeView, requestCode = " + this.d, true);
        return super.a(view, i, str, eVar);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a55a87dedcaa1115f3e4863bc739790d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a55a87dedcaa1115f3e4863bc739790d")).intValue();
        }
        String str = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str, "getBackground, TRANSPARENT, requestCode = " + this.d, true);
        return 2;
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(HashMap<String, String> hashMap, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f91c4249ef1d0fa5ed9b79df2fa3d501", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f91c4249ef1d0fa5ed9b79df2fa3d501");
        } else {
            super.a(hashMap, hVar);
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(HashMap<String, String> hashMap, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a3396b84cda1c9cfcd67c2951a1b535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a3396b84cda1c9cfcd67c2951a1b535");
        } else {
            super.b(hashMap, hVar);
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(HashMap<String, String> hashMap, File file, String str, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {hashMap, file, str, hVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4393c04021af64aa24ec4143d7f66fd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4393c04021af64aa24ec4143d7f66fd0");
        } else {
            super.a(hashMap, file, str, hVar);
        }
    }

    @Override // com.meituan.android.yoda.interfaces.b
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c590b3481589d236670c4179485f2c7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c590b3481589d236670c4179485f2c7f");
            return;
        }
        String str = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str, "onActivityResulted, requestCode = " + this.d, true);
        if (!Titans.hasInit()) {
            this.w.onActivityResult(i, i2, intent);
        } else if (this.x != null) {
            this.x.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.sankuai.titans.protocol.services.IContainerProvider
    @NonNull
    public IContainerAdapter getIContainerAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d89dcc36d27e69f2d5ed55fbac9ee25", RobustBitConfig.DEFAULT_VALUE) ? (IContainerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d89dcc36d27e69f2d5ed55fbac9ee25") : new IContainerAdapter() { // from class: com.meituan.android.yoda.fragment.YodaKNBFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.titans.protocol.services.IContainerAdapter
            public final String h5UrlParameterName() {
                return "wenview_url";
            }

            @Override // com.sankuai.titans.protocol.services.IContainerAdapter
            public final String scheme() {
                return "";
            }

            @Override // com.sankuai.titans.protocol.services.IContainerAdapter
            public final boolean showTitleBar() {
                return false;
            }

            @Override // com.sankuai.titans.protocol.services.IContainerAdapter
            @ColorInt
            public final int getWebViewBackgroundColor(Context context) {
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37b77680959c38a1c63e1eb36322a7cd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37b77680959c38a1c63e1eb36322a7cd")).intValue() : YodaKNBFragment.this.v;
            }

            @Override // com.sankuai.titans.protocol.services.IContainerAdapter
            public final ITitansPlugin getBusinessPlugin() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9202d598773aa3edb9bd9ad97f024f4f", RobustBitConfig.DEFAULT_VALUE) ? (ITitansPlugin) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9202d598773aa3edb9bd9ad97f024f4f") : YodaKNBFragment.this.y;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[Catch: Exception -> 0x01bf, TryCatch #0 {Exception -> 0x01bf, blocks: (B:6:0x0022, B:8:0x003b, B:10:0x0052, B:11:0x0059, B:46:0x01a8, B:13:0x005e, B:15:0x006d, B:17:0x0071, B:19:0x007b, B:20:0x007d, B:22:0x0099, B:24:0x00a8, B:27:0x00b8, B:29:0x00c0, B:30:0x00dd, B:32:0x00e5, B:33:0x0104, B:35:0x015a, B:37:0x0166, B:39:0x0175, B:41:0x0179, B:43:0x0183, B:44:0x0185), top: B:51:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0175 A[Catch: Exception -> 0x01bf, TryCatch #0 {Exception -> 0x01bf, blocks: (B:6:0x0022, B:8:0x003b, B:10:0x0052, B:11:0x0059, B:46:0x01a8, B:13:0x005e, B:15:0x006d, B:17:0x0071, B:19:0x007b, B:20:0x007d, B:22:0x0099, B:24:0x00a8, B:27:0x00b8, B:29:0x00c0, B:30:0x00dd, B:32:0x00e5, B:33:0x0104, B:35:0x015a, B:37:0x0166, B:39:0x0175, B:41:0x0179, B:43:0x0183, B:44:0x0185), top: B:51:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.fragment.YodaKNBFragment.a(org.json.JSONObject):boolean");
    }
}
