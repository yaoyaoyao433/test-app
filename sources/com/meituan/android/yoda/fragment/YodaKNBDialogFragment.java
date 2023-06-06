package com.meituan.android.yoda.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Point;
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
import android.widget.ImageView;
import com.meituan.android.yoda.util.j;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.util.z;
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
import com.tencent.mapsdk.internal.jw;
import com.tencent.smtt.sdk.TbsListener;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class YodaKNBDialogFragment extends BaseDialogFragment implements com.meituan.android.yoda.interfaces.b, IContainerProvider {
    public static ChangeQuickRedirect p;
    private TitansFragment A;
    private com.meituan.android.yoda.knb.plugin.a B;
    private BroadcastReceiver C;
    public WebView q;
    private j r;
    private com.meituan.android.yoda.callbacks.c s;
    private com.meituan.android.yoda.interfaces.c t;
    private FrameLayout u;
    private ViewGroup v;
    private Bundle w;
    private int x;
    private ImageView y;
    private final KNBWebCompat z;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class CallbackCancel {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String requestCode;
        public int status;
    }

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

    public static String c() {
        return "YodaKNBDialogFragment";
    }

    @Override // com.meituan.android.yoda.fragment.BaseDialogFragment
    public final String a() {
        return "";
    }

    @Override // com.meituan.android.yoda.interfaces.b
    public final boolean j() {
        return false;
    }

    public YodaKNBDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58cce7219fd62b1f7c92cffd236dc5c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58cce7219fd62b1f7c92cffd236dc5c0");
        } else {
            this.z = KNBWebCompactFactory.getKNBCompact(0);
        }
    }

    public static /* synthetic */ void a(YodaKNBDialogFragment yodaKNBDialogFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, yodaKNBDialogFragment, changeQuickRedirect, false, "5e8ddc0c7635dd689adf368a54d8d302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, yodaKNBDialogFragment, changeQuickRedirect, false, "5e8ddc0c7635dd689adf368a54d8d302");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("action")) {
                    if ("yodaWebCallback".equalsIgnoreCase(String.valueOf(jSONObject.get("action")))) {
                        yodaKNBDialogFragment.a(jSONObject);
                        return;
                    }
                    return;
                }
                String str2 = yodaKNBDialogFragment.b;
                com.meituan.android.yoda.monitor.log.a.a(str2, "handleH5Publish, js message have no action data, requestCode = " + yodaKNBDialogFragment.c, true);
            } catch (Exception e) {
                String str3 = yodaKNBDialogFragment.b;
                com.meituan.android.yoda.monitor.log.a.a(str3, "handleH5Publish, exception = " + e.getMessage() + ", requestCode = " + yodaKNBDialogFragment.c, true);
            }
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "425393a6fc291d3eb09489ca98278042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "425393a6fc291d3eb09489ca98278042");
            return;
        }
        super.onCreate(bundle);
        this.w = bundle;
        this.x = getResources().getColor(R.color.yoda_knb_web_view_bg_color);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = p;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9ea0b50b9fe4f76273e76e7133607a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9ea0b50b9fe4f76273e76e7133607a2");
            return;
        }
        this.C = new BroadcastReceiver() { // from class: com.meituan.android.yoda.fragment.YodaKNBDialogFragment.7
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr3 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bd6417ec1f2e119fd96673ac45e55233", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bd6417ec1f2e119fd96673ac45e55233");
                } else if (intent == null || intent.getExtras() == null) {
                    String str = YodaKNBDialogFragment.this.b;
                    com.meituan.android.yoda.monitor.log.a.a(str, "registerKNBBridge.onReceive, js param error. requestCode = " + YodaKNBDialogFragment.this.c, true);
                } else {
                    Bundle extras = intent.getExtras();
                    String string = extras != null ? extras.getString("data") : "";
                    String str2 = YodaKNBDialogFragment.this.b;
                    com.meituan.android.yoda.monitor.log.a.a(str2, "registerKNBBridge.onReceive, requestCode = " + YodaKNBDialogFragment.this.c + ", jsPublishParam = " + string, true);
                    YodaKNBDialogFragment.a(YodaKNBDialogFragment.this, string);
                }
            }
        };
        try {
            getActivity().registerReceiver(this.C, new IntentFilter("yodaWebCallback"));
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf12644d7348889edbea889e80c67ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf12644d7348889edbea889e80c67ca");
            return;
        }
        String str = this.b;
        com.meituan.android.yoda.monitor.log.a.a(str, "onAttach, requestCode = " + this.c, true);
        super.onAttach(context);
        if (context instanceof com.meituan.android.yoda.callbacks.c) {
            this.s = (com.meituan.android.yoda.callbacks.c) context;
            this.s.a(this);
        }
        if (context instanceof com.meituan.android.yoda.interfaces.c) {
            this.t = (com.meituan.android.yoda.interfaces.c) context;
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseDialogFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee0d20d3498892ede55a0a9b6f71218", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee0d20d3498892ede55a0a9b6f71218");
        }
        String str = this.b;
        com.meituan.android.yoda.monitor.log.a.a(str, "onCreateView, requestCode = " + this.c, true);
        View inflate = layoutInflater.inflate(R.layout.yoda_knb_dialog_fragment_layout, viewGroup, false);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = p;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "834fe44989709a953f3828fc4cbf0d24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "834fe44989709a953f3828fc4cbf0d24");
        } else {
            this.v = (ViewGroup) inflate.findViewById(R.id.pop_window);
            this.u = (FrameLayout) inflate.findViewById(R.id.h5_container);
            this.y = (ImageView) inflate.findViewById(R.id.btn_close_verify);
            this.y.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.yoda.fragment.YodaKNBDialogFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b235d0eeb9477e7178f4cc97173dee2", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b235d0eeb9477e7178f4cc97173dee2");
                    } else {
                        YodaKNBDialogFragment.this.a(YodaKNBDialogFragment.this.c);
                    }
                }
            });
            this.r = new j(getChildFragmentManager(), R.id.h5_container);
            try {
                if (!Titans.hasInit()) {
                    Bundle bundle2 = this.w;
                    Object[] objArr3 = {bundle2};
                    ChangeQuickRedirect changeQuickRedirect3 = p;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5c84313ad703152f3e8a1140abd3670c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5c84313ad703152f3e8a1140abd3670c");
                    } else {
                        Bundle arguments = getArguments();
                        arguments.putString("url", arguments.getString("wenview_url", ""));
                        String str2 = this.b;
                        com.meituan.android.yoda.monitor.log.a.a(str2, "initializeOldKNB, arguments = " + arguments.toString(), true);
                        this.z.onCreate(getContext(), arguments);
                        View onCreateView = this.z.onCreateView(getLayoutInflater(), null);
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = p;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dea5e839c09289dc1ba9b928ac1663e2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dea5e839c09289dc1ba9b928ac1663e2");
                        } else {
                            this.l.postDelayed(new Runnable() { // from class: com.meituan.android.yoda.fragment.YodaKNBDialogFragment.4
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d208d7d63c5b175691380bd2037d7f35", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d208d7d63c5b175691380bd2037d7f35");
                                    } else if (YodaKNBDialogFragment.this.z != null) {
                                        YodaKNBDialogFragment.this.z.getTitleBarHost().showTitleBar(false);
                                    }
                                }
                            }, 150L);
                            this.l.postDelayed(new Runnable() { // from class: com.meituan.android.yoda.fragment.YodaKNBDialogFragment.5
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7bd60beb4bc644238daaf1976f04a2af", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7bd60beb4bc644238daaf1976f04a2af");
                                    } else if (YodaKNBDialogFragment.this.z != null) {
                                        YodaKNBDialogFragment.this.z.getTitleBarHost().showTitleBar(false);
                                    }
                                }
                            }, 200L);
                            this.l.postDelayed(new Runnable() { // from class: com.meituan.android.yoda.fragment.YodaKNBDialogFragment.6
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "50117a44b57e844292143cfa8edd42aa", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "50117a44b57e844292143cfa8edd42aa");
                                    } else if (YodaKNBDialogFragment.this.z != null) {
                                        YodaKNBDialogFragment.this.z.getTitleBarHost().showTitleBar(false);
                                    }
                                }
                            }, 300L);
                        }
                        this.u.addView(onCreateView, new ViewGroup.LayoutParams(-1, -1));
                        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00000000"));
                        onCreateView.setBackground(colorDrawable);
                        this.q = this.z.getWebView();
                        this.q.setBackground(colorDrawable);
                        this.z.onActivityCreated(bundle2);
                        this.z.setLLButtonClickListener(new View.OnClickListener() { // from class: com.meituan.android.yoda.fragment.YodaKNBDialogFragment.3
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr5 = {view};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5ed0f4d74da1100d517aab7ed45e5a69", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5ed0f4d74da1100d517aab7ed45e5a69");
                                    return;
                                }
                                com.meituan.android.yoda.monitor.log.a.a(YodaKNBDialogFragment.this.b, "initializeOldKNB, LLButtonClick.", true);
                                YodaKNBDialogFragment.this.getActivity().onBackPressed();
                            }
                        });
                    }
                } else {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = p;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4620b525feb6786eff908c18120d7b2f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4620b525feb6786eff908c18120d7b2f");
                    } else {
                        Bundle arguments2 = getArguments();
                        String str3 = this.b;
                        com.meituan.android.yoda.monitor.log.a.a(str3, "initializeNewKNB, arguments = " + arguments2.toString(), true);
                        this.B = new com.meituan.android.yoda.knb.plugin.a("yoda_knb_pop_launch", "yoda_knb_pop_launch_status", getRequestCode(), this.o);
                        Fragment b = this.r.b("titans_fragment_dialog");
                        if (b instanceof TitansFragment) {
                            this.A = (TitansFragment) b;
                        } else {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = p;
                            this.A = TitansFragment.newInstance(PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "448c13a4bf4bf6bfff3745f9327ed984", RobustBitConfig.DEFAULT_VALUE) ? (Bundle) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "448c13a4bf4bf6bfff3745f9327ed984") : new Bundle(getArguments()), getIContainerAdapter());
                        }
                        this.r.a(this.A, "titans_fragment_dialog");
                    }
                }
            } catch (Exception e) {
                String str4 = this.b;
                com.meituan.android.yoda.monitor.log.a.a(str4, "init, exception = " + e.getMessage(), true);
            }
            getActivity().getWindow().setFormat(-3);
        }
        return inflate;
    }

    @Override // com.meituan.android.yoda.fragment.BaseDialogFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Point point;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb41a411c639d7b25ab13adc7847e3bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb41a411c639d7b25ab13adc7847e3bb");
            return;
        }
        super.onViewCreated(view, bundle);
        int i = this.n;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = p;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60a595ca81ad5ef226e3d8754ac1d79e", RobustBitConfig.DEFAULT_VALUE)) {
            point = (Point) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60a595ca81ad5ef226e3d8754ac1d79e");
        } else {
            Point point2 = new Point();
            if (i == 1) {
                point2.x = TbsListener.ErrorCode.TBS_LOAD_TIME_REPORT;
                point2.y = TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL;
            } else if (i == 71) {
                point2.x = 360;
                point2.y = TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE;
            } else if (i == 103) {
                point2.x = 288;
                point2.y = 388;
            } else if (i == 130) {
                point2.x = 284;
                point2.y = jw.e;
            } else if (i == 163) {
                point2.x = TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_RET_TYPE_NOT_BUNDLE;
                point2.y = 405;
            } else {
                point2.x = 2;
                point2.y = 2;
            }
            point = point2;
        }
        a(point);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e1fcc483bb4a3361dc1e15d2b6aea0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e1fcc483bb4a3361dc1e15d2b6aea0c");
            return;
        }
        super.onStart();
        if (Titans.hasInit()) {
            return;
        }
        this.z.onStart();
    }

    @Override // com.meituan.android.yoda.fragment.BaseDialogFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff9db22da18aa2f9fa549d58e7002bda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff9db22da18aa2f9fa549d58e7002bda");
            return;
        }
        super.onResume();
        if (Titans.hasInit()) {
            return;
        }
        this.z.onResume();
    }

    @Override // com.meituan.android.yoda.fragment.BaseDialogFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c158a0b962a9149e2eb3fe46c00e29c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c158a0b962a9149e2eb3fe46c00e29c");
            return;
        }
        super.onPause();
        if (Titans.hasInit()) {
            return;
        }
        this.z.onPause();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5135c9bc900e2760bb829067148d204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5135c9bc900e2760bb829067148d204");
            return;
        }
        super.onStop();
        if (Titans.hasInit()) {
            return;
        }
        this.z.onStop();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca0d232833d3bbc0b8de67c73f58ff56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca0d232833d3bbc0b8de67c73f58ff56");
            return;
        }
        String str = this.b;
        com.meituan.android.yoda.monitor.log.a.a(str, "onDetach, requestCode = " + this.c, true);
        super.onDetach();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a735948bf3e772bdcf267ec32b46235c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a735948bf3e772bdcf267ec32b46235c");
            return;
        }
        super.onDestroy();
        if (!Titans.hasInit()) {
            this.z.onDestroy();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = p;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd5ca3e16ea076954fff02518fabece2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd5ca3e16ea076954fff02518fabece2");
        } else if (getActivity() == null || this.C == null) {
        } else {
            try {
                getActivity().unregisterReceiver(this.C);
            } catch (Exception e) {
                String str = this.b;
                com.meituan.android.yoda.monitor.log.a.a(str, "unregisterKNBBridge, exception = " + e.getMessage(), true);
            }
            this.C = null;
        }
    }

    @Override // com.meituan.android.yoda.interfaces.b
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2803b8ddb9c90eca072f30e869c70bc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2803b8ddb9c90eca072f30e869c70bc0");
            return;
        }
        String str = this.b;
        com.meituan.android.yoda.monitor.log.a.a(str, "onActivityResulted, requestCode = " + this.c, true);
        if (!Titans.hasInit()) {
            this.z.onActivityResult(i, i2, intent);
        } else {
            this.A.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.sankuai.titans.protocol.services.IContainerProvider
    @NonNull
    public IContainerAdapter getIContainerAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "318bcce13b5b73534d27300b7e1f9a16", RobustBitConfig.DEFAULT_VALUE) ? (IContainerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "318bcce13b5b73534d27300b7e1f9a16") : new IContainerAdapter() { // from class: com.meituan.android.yoda.fragment.YodaKNBDialogFragment.1
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
            public final boolean showDebugBar() {
                return false;
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
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4f54361904c5b945987be6176b5a313", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4f54361904c5b945987be6176b5a313")).intValue() : YodaKNBDialogFragment.this.x;
            }

            @Override // com.sankuai.titans.protocol.services.IContainerAdapter
            public final ITitansPlugin getBusinessPlugin() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccc2b2acb0d9fe97f97f47bbdc29f356", RobustBitConfig.DEFAULT_VALUE) ? (ITitansPlugin) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccc2b2acb0d9fe97f97f47bbdc29f356") : YodaKNBDialogFragment.this.B;
            }
        };
    }

    public final void a(Point point) {
        Object[] objArr = {point};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c1ca6ea3a7f770fce4d07cd7f722f5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c1ca6ea3a7f770fce4d07cd7f722f5f");
        } else if (point == null || this.u == null) {
        } else {
            if (!x.k()) {
                com.meituan.android.yoda.monitor.log.a.a(this.b, "KNB js bridge not run in main thread.", true);
            } else if (point.x <= 0 || point.y <= 0) {
            } else {
                int a = (int) x.a(point.x);
                int a2 = (int) x.a(point.y);
                com.meituan.android.yoda.monitor.log.a.a("YodaKNBDialogFragment", ", resizeH5PopWindow, wantWidth = " + a + ", wantHeight = " + a2, true);
                Point a3 = z.a(getActivity());
                StringBuilder sb = new StringBuilder(", resizeH5PopWindow, windowSize  =");
                sb.append(a3.toString());
                com.meituan.android.yoda.monitor.log.a.a("YodaKNBDialogFragment", sb.toString(), true);
                if (a > a3.x) {
                    a = a3.x;
                }
                if (a2 > a3.y) {
                    a2 = a3.y;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.u.getLayoutParams();
                layoutParams.width = a;
                layoutParams.height = a2;
                this.u.setLayoutParams(layoutParams);
                this.v.requestLayout();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[Catch: Exception -> 0x01e0, TryCatch #0 {Exception -> 0x01e0, blocks: (B:6:0x0022, B:8:0x003b, B:10:0x0052, B:11:0x0059, B:47:0x01c9, B:13:0x005e, B:15:0x006d, B:17:0x0077, B:18:0x0079, B:20:0x0093, B:22:0x00a2, B:25:0x00b2, B:27:0x00ba, B:28:0x00d7, B:30:0x00df, B:31:0x00fe, B:33:0x015a, B:35:0x0169, B:37:0x0173, B:38:0x0175, B:40:0x0196, B:42:0x01a5, B:44:0x01af, B:45:0x01b1), top: B:52:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0169 A[Catch: Exception -> 0x01e0, TryCatch #0 {Exception -> 0x01e0, blocks: (B:6:0x0022, B:8:0x003b, B:10:0x0052, B:11:0x0059, B:47:0x01c9, B:13:0x005e, B:15:0x006d, B:17:0x0077, B:18:0x0079, B:20:0x0093, B:22:0x00a2, B:25:0x00b2, B:27:0x00ba, B:28:0x00d7, B:30:0x00df, B:31:0x00fe, B:33:0x015a, B:35:0x0169, B:37:0x0173, B:38:0x0175, B:40:0x0196, B:42:0x01a5, B:44:0x01af, B:45:0x01b1), top: B:52:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a5 A[Catch: Exception -> 0x01e0, TryCatch #0 {Exception -> 0x01e0, blocks: (B:6:0x0022, B:8:0x003b, B:10:0x0052, B:11:0x0059, B:47:0x01c9, B:13:0x005e, B:15:0x006d, B:17:0x0077, B:18:0x0079, B:20:0x0093, B:22:0x00a2, B:25:0x00b2, B:27:0x00ba, B:28:0x00d7, B:30:0x00df, B:31:0x00fe, B:33:0x015a, B:35:0x0169, B:37:0x0173, B:38:0x0175, B:40:0x0196, B:42:0x01a5, B:44:0x01af, B:45:0x01b1), top: B:52:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.fragment.YodaKNBDialogFragment.a(org.json.JSONObject):boolean");
    }
}
