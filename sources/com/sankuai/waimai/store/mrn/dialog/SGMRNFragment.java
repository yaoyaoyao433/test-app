package com.sankuai.waimai.store.mrn.dialog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.WhiteLoadingRNFragment;
import com.sankuai.waimai.store.base.BaseMemberActivity;
import com.sankuai.waimai.store.base.SCBaseFragment;
import com.sankuai.waimai.store.mrn.dialog.a;
import com.sankuai.waimai.store.mrn.dialog.model.DialogActionResult;
import com.sankuai.waimai.store.mrn.dialog.model.DialogConfigResult;
import com.sankuai.waimai.store.mrn.dialog.model.MRNMessageResult;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMRNFragment extends SCBaseFragment implements com.sankuai.waimai.store.mrn.dialog.base.b, d {
    public static ChangeQuickRedirect a;
    private WhiteLoadingRNFragment c;
    private boolean d;
    private String e;
    private String f;
    private String g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private Bundle m;
    private IntentFilter n;
    private SGMRNDialogReceiver o;
    private boolean p;
    private MRNEventHandler q;

    private boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1af9bb3af769a384cd23eb71ff7e4b74", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1af9bb3af769a384cd23eb71ff7e4b74")).booleanValue() : i == 48 || i == 17 || i == 80 || i == 3 || i == 5;
    }

    public SGMRNFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1402a45135b88b26fb15bd6c7d5d55b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1402a45135b88b26fb15bd6c7d5d55b");
            return;
        }
        this.d = false;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = 1200;
        this.i = -1;
        this.j = 80;
        this.p = false;
    }

    @Override // com.sankuai.waimai.store.mrn.dialog.base.b
    public final void a(String str, String str2) {
        View findViewById;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e14d28cad9cb280bfb3e08e027c9f66c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e14d28cad9cb280bfb3e08e027c9f66c");
        } else if (t.a(str) || t.a(str2)) {
        } else {
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f6a7ad4a4a002c1ef7941677dcc4c9c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f6a7ad4a4a002c1ef7941677dcc4c9c");
                return;
            }
            try {
                if ("dialog_result_call_back".equals(str)) {
                    DialogActionResult dialogActionResult = (DialogActionResult) i.a(str2, DialogActionResult.class);
                    if (dialogActionResult == null || !dialogActionResult.isCloseDialog) {
                        return;
                    }
                    if (TextUtils.isEmpty(dialogActionResult.component) || TextUtils.isEmpty(dialogActionResult.entry) || (dialogActionResult.component.equals(this.g) && dialogActionResult.entry.equals(this.f))) {
                        a();
                    }
                } else if ("dialog_config".equals(str)) {
                    DialogConfigResult dialogConfigResult = (DialogConfigResult) i.a(str2, DialogConfigResult.class);
                    Object[] objArr3 = {dialogConfigResult};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "14eabbad3f0b22ba333835ab89abc360", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "14eabbad3f0b22ba333835ab89abc360");
                    } else if (dialogConfigResult != null) {
                        if (TextUtils.isEmpty(dialogConfigResult.component) || TextUtils.isEmpty(dialogConfigResult.entry) || (dialogConfigResult.component.equals(this.g) && dialogConfigResult.entry.equals(this.f))) {
                            if (dialogConfigResult.dialogWidth > 0.0f) {
                                this.i = h.a(com.sankuai.waimai.store.util.b.a(), dialogConfigResult.dialogWidth);
                            }
                            if (dialogConfigResult.dialogHeight > 0.0f) {
                                this.h = h.a(com.sankuai.waimai.store.util.b.a(), dialogConfigResult.dialogHeight);
                            }
                            int a2 = a(dialogConfigResult.dialogPosition);
                            if (a(a2)) {
                                this.j = a2;
                            }
                            FragmentActivity activity = getActivity();
                            if (activity != null && (findViewById = activity.findViewById(R.id.mrn_half_page_fragment_container)) != null) {
                                if (dialogConfigResult.closeWhenTouchMask) {
                                    findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.mrn.dialog.SGMRNFragment.1
                                        public static ChangeQuickRedirect a;

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Object[] objArr4 = {view};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a33fe00e72c00f4ab399070bb2486c7c", 4611686018427387906L)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a33fe00e72c00f4ab399070bb2486c7c");
                                            } else {
                                                SGMRNFragment.this.a();
                                            }
                                        }
                                    });
                                } else {
                                    findViewById.setOnClickListener(null);
                                }
                            }
                            View view = getView();
                            if (view != null) {
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                                layoutParams.width = this.i;
                                layoutParams.height = this.h;
                                layoutParams.gravity = this.j;
                                view.setLayoutParams(layoutParams);
                            }
                        }
                    }
                } else if ("dialog_gesture_close_on".equals(str)) {
                    this.l = true;
                } else if ("dialog_gesture_close_off".equals(str)) {
                    this.l = false;
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    private int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8867f34cde0b7539324838ee282d2ab0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8867f34cde0b7539324838ee282d2ab0")).intValue();
        }
        if ("top".equals(str)) {
            return 48;
        }
        return (!"center".equals(str) && "bottom".equals(str)) ? 80 : 17;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class SGMRNDialogReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        public com.sankuai.waimai.store.mrn.dialog.base.b b;

        public SGMRNDialogReceiver(com.sankuai.waimai.store.mrn.dialog.base.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d035292dd2431ad3a47aa4500ef6b1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d035292dd2431ad3a47aa4500ef6b1");
            } else {
                this.b = bVar;
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23d2d52da89b19fdfbc653dbf00a0995", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23d2d52da89b19fdfbc653dbf00a0995");
            } else if (intent == null || intent.getExtras() == null || this.b == null || !"sm_mrn_dialog_container_action".equals(intent.getAction())) {
            } else {
                String obj = intent.getExtras().get("data").toString();
                if (t.a(obj)) {
                    return;
                }
                try {
                    MRNMessageResult mRNMessageResult = (MRNMessageResult) i.a(obj, MRNMessageResult.class);
                    if (mRNMessageResult != null && !t.a(mRNMessageResult.messageType)) {
                        this.b.a(mRNMessageResult.messageType, i.a(mRNMessageResult.messageData));
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f8b1e37763e81fe30a8f041d1044153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f8b1e37763e81fe30a8f041d1044153");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        if (this.p && this.c != null) {
            this.c.onActivityResult(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad6e1713e59167057a739cbd48789378", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad6e1713e59167057a739cbd48789378");
            return;
        }
        super.onDestroy();
        if (this.q != null) {
            MRNEventHandler mRNEventHandler = this.q;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = MRNEventHandler.a;
            if (PatchProxy.isSupport(objArr2, mRNEventHandler, changeQuickRedirect2, false, "fe0cdd6a9ecb95ab1f0a6f19216664fb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mRNEventHandler, changeQuickRedirect2, false, "fe0cdd6a9ecb95ab1f0a6f19216664fb");
            } else {
                com.meituan.android.bus.a.a().b(mRNEventHandler);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.SCBaseFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "460c8e5c4294b55c2f38301941a610bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "460c8e5c4294b55c2f38301941a610bb");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b7c9b61934971eea7d7be09eb4e95d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b7c9b61934971eea7d7be09eb4e95d0");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "68dc36a789e56ddcfe41188e12b2d0b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "68dc36a789e56ddcfe41188e12b2d0b0");
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.e = arguments.getString("mrn_biz");
                this.f = arguments.getString("mrn_entry");
                this.g = arguments.getString("mrn_component");
                this.d = arguments.getBoolean("bundle_key_scheme_jump");
                this.p = arguments.getBoolean("need_activity_result");
                this.m = arguments.getBundle("key_mrn_param");
                this.k = "1".equals(this.m.getString("gesture_close"));
                float f = arguments.getFloat("page_height");
                Object[] objArr4 = {Float.valueOf(f)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6379841877dbc87ec2dc02e3b276c417", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6379841877dbc87ec2dc02e3b276c417");
                } else if (f > 1.0f) {
                    this.h = h.a(com.sankuai.waimai.store.util.b.a(), f);
                } else if (f > 0.0f) {
                    this.h = (int) (h.b(com.sankuai.waimai.store.util.b.a()) * f);
                }
                if (this.m != null) {
                    String string = this.m.getString("position");
                    if (!TextUtils.isEmpty(string)) {
                        int a2 = a(string);
                        if (a(a2)) {
                            this.j = a2;
                        }
                    }
                }
            }
        }
        this.o = new SGMRNDialogReceiver(this);
        this.n = new IntentFilter("sm_mrn_dialog_container_action");
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "013a68fbc7074ff4e78a4b1155324b73", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "013a68fbc7074ff4e78a4b1155324b73");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_sc_mrn_common_dialog, viewGroup, false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) inflate.getLayoutParams();
        layoutParams.height = this.h;
        layoutParams.gravity = this.j;
        inflate.setLayoutParams(layoutParams);
        if (this.k) {
            Object[] objArr2 = {inflate};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a6fa77f3f390da4302845773bff325a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a6fa77f3f390da4302845773bff325a") : com.sankuai.waimai.store.mrn.dialog.a.a(getContext(), inflate, new a.InterfaceC1233a() { // from class: com.sankuai.waimai.store.mrn.dialog.SGMRNFragment.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.mrn.dialog.a.InterfaceC1233a
                public final void a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4e029bc24be6807b3bb4d257127ed1ac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4e029bc24be6807b3bb4d257127ed1ac");
                    } else if (i == 0) {
                        SGMRNFragment.this.a();
                    }
                }

                @Override // com.sankuai.waimai.store.mrn.dialog.a.InterfaceC1233a
                public final boolean a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5b47a73e852b4ae9c18720c9b7955f67", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5b47a73e852b4ae9c18720c9b7955f67")).booleanValue() : SGMRNFragment.this.l;
                }
            });
        }
        return inflate;
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9385168ae073920d10cdd4226a392278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9385168ae073920d10cdd4226a392278");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c07a3936af78c46120470a367e55b466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c07a3936af78c46120470a367e55b466");
            return;
        }
        if (this.c == null) {
            this.c = WhiteLoadingRNFragment.a(this.e, this.f, this.g);
            this.c.a(this.m);
            this.c.b = new Runnable() { // from class: com.sankuai.waimai.store.mrn.dialog.SGMRNFragment.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dc2756581896c47838ae6a8878bcf946", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dc2756581896c47838ae6a8878bcf946");
                    } else {
                        SGMRNFragment.this.a();
                    }
                }
            };
            this.q = new MRNEventHandler(this.c);
        }
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        if (this.j == 80) {
            beginTransaction.setCustomAnimations(R.anim.wm_sc_base_dialog_bottom_in, R.anim.wm_sc_base_dialog_bottom_out);
        } else if (this.j == 48) {
            beginTransaction.setCustomAnimations(R.anim.wm_sc_base_dialog_top_in, R.anim.wm_sc_base_dialog_top_out);
        }
        beginTransaction.add(R.id.mrn_dialog_fragment_container, this.c).commitAllowingStateLoss();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40576349e5c70f53f3350a8688f21da0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40576349e5c70f53f3350a8688f21da0");
            return;
        }
        super.onResume();
        getActivity().registerReceiver(this.o, this.n);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2861bbdefff8e98d1688cb40238aaf01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2861bbdefff8e98d1688cb40238aaf01");
            return;
        }
        super.onPause();
        getActivity().unregisterReceiver(this.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c550258c25387a31febeaefa5cb831d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c550258c25387a31febeaefa5cb831d");
            return;
        }
        FragmentActivity activity = getActivity();
        if (this.d && (activity instanceof BaseMemberActivity)) {
            activity.setResult(-1);
            activity.finish();
            activity.overridePendingTransition(0, R.anim.wm_sc_common_dialog_alpha_out);
            return;
        }
        getChildFragmentManager().beginTransaction().remove(this.c).commitAllowingStateLoss();
    }

    @Override // com.sankuai.waimai.store.mrn.dialog.d
    public final void a(FragmentActivity fragmentActivity, String str) {
        Object[] objArr = {fragmentActivity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d059d718c633e1e36d20c6032b24ab99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d059d718c633e1e36d20c6032b24ab99");
        } else if (fragmentActivity == null) {
        } else {
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(R.id.mrn_half_page_fragment_container, this, str).commitAllowingStateLoss();
            View findViewById = fragmentActivity.findViewById(R.id.mrn_half_page_fragment_container);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.mrn.dialog.SGMRNFragment.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eac9a9838b31a7ed539edcc27b0715ff", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eac9a9838b31a7ed539edcc27b0715ff");
                        } else {
                            SGMRNFragment.this.a();
                        }
                    }
                });
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements b {
        public static ChangeQuickRedirect a;
        String b;
        String c;
        String d;
        float e;
        boolean f;
        boolean g;
        private Bundle h;

        @Override // com.sankuai.waimai.store.mrn.dialog.b
        public final /* synthetic */ b a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a570ab42cd4322baade28413c18a3a", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a570ab42cd4322baade28413c18a3a");
            }
            this.h.putString(str, str2);
            return this;
        }

        @Override // com.sankuai.waimai.store.mrn.dialog.b
        public final /* synthetic */ d a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81705d9f35ab8f771649a58235c94548", RobustBitConfig.DEFAULT_VALUE)) {
                return (SGMRNFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81705d9f35ab8f771649a58235c94548");
            }
            SGMRNFragment sGMRNFragment = new SGMRNFragment();
            Bundle bundle = new Bundle();
            bundle.putString("mrn_biz", this.b);
            bundle.putString("mrn_entry", this.c);
            bundle.putString("mrn_component", this.d);
            bundle.putFloat("page_height", this.e);
            bundle.putBoolean("need_activity_result", this.f);
            bundle.putBoolean("bundle_key_scheme_jump", this.g);
            bundle.putBundle("key_mrn_param", this.h);
            sGMRNFragment.setArguments(bundle);
            return sGMRNFragment;
        }

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeccd75955b99344636cebaa762dffe9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeccd75955b99344636cebaa762dffe9");
                return;
            }
            this.b = "supermarket";
            this.c = "";
            this.d = "";
            this.g = false;
            this.h = new Bundle();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class MRNEventHandler {
        public static ChangeQuickRedirect a;
        public WhiteLoadingRNFragment b;

        public MRNEventHandler(WhiteLoadingRNFragment whiteLoadingRNFragment) {
            Object[] objArr = {whiteLoadingRNFragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "071b5dcfb99d7c1a95e1b426e67a3583", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "071b5dcfb99d7c1a95e1b426e67a3583");
                return;
            }
            this.b = whiteLoadingRNFragment;
            com.meituan.android.bus.a.a().a(this);
        }

        @Subscribe
        public void onClickImButton(com.sankuai.waimai.store.event.b bVar) {
            com.sankuai.waimai.store.platform.domain.manager.poi.a l;
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcad7c49dc237d7c48b4fe1d18b9abee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcad7c49dc237d7c48b4fe1d18b9abee");
            } else if (bVar == null || bVar.d != this.b.b().getRootViewTag() || (l = com.sankuai.waimai.store.order.a.e().l(bVar.a)) == null) {
            } else {
                com.sankuai.waimai.store.shopping.cart.util.d.a(this.b.getActivity(), l, SCPageConfig.b, bVar.c);
            }
        }
    }
}
