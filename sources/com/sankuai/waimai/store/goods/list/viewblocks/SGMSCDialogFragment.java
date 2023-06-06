package com.sankuai.waimai.store.goods.list.viewblocks;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.gson.reflect.TypeToken;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.goods.list.viewblocks.WidgetContentFragment;
import com.sankuai.waimai.store.mrn.dialog.a;
import com.sankuai.waimai.store.newwidgets.RoundedFrameLayout;
import com.sankuai.waimai.store.ui.common.SGBaseDialogFragment;
import com.sankuai.waimai.store.util.al;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SGMSCDialogFragment extends SGBaseDialogFragment {
    public static ChangeQuickRedirect a = null;
    private static final String b = "SGMSCDialogFragment";
    private static final List<String> d = Arrays.asList("dialog_config", "dialog_result_call_back", "dialog_show_dialog");
    private static int o = R.id.fragment;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private WidgetContentFragment l;
    private String m;
    private Map<String, Object> n;
    private boolean p;
    private String q;
    private com.sankuai.waimai.store.order.a r;
    private boolean s;
    private int t;
    private int u;
    private i v;
    private WidgetContentFragment.a w;

    public SGMSCDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "801bd38c5271dcfa93774bfc382b5f27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "801bd38c5271dcfa93774bfc382b5f27");
            return;
        }
        this.e = 1200;
        this.f = -1;
        this.g = 80;
        this.h = false;
        this.i = true;
        this.k = false;
        this.q = null;
        this.r = com.sankuai.waimai.store.order.a.e();
        this.w = new WidgetContentFragment.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.SGMSCDialogFragment.3
            public static ChangeQuickRedirect a;

            {
                SGMSCDialogFragment.this = this;
            }

            @Override // com.meituan.msc.modules.container.z
            public final void a(final String str, final Map<String, Object> map) {
                Object[] objArr2 = {str, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4f67d3fee1002b2915145811659e2fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4f67d3fee1002b2915145811659e2fb");
                } else {
                    al.b(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.SGMSCDialogFragment.3.1
                        public static ChangeQuickRedirect a;

                        {
                            AnonymousClass3.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "76ee959cce2fd8b69c3045f714cba5a3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "76ee959cce2fd8b69c3045f714cba5a3");
                            } else if (com.sankuai.waimai.store.util.b.a(SGMSCDialogFragment.this.getContext())) {
                            } else {
                                if ("dialog_config".equals(str)) {
                                    SGMSCDialogFragment.this.c();
                                } else if ("dialog_gesture_close_on".equals(str)) {
                                    SGMSCDialogFragment.this.j = true;
                                } else if ("dialog_gesture_close_off".equals(str)) {
                                    SGMSCDialogFragment.this.j = false;
                                } else if ("dialog_result_call_back".equals(str)) {
                                    SGMSCDialogFragment.b(SGMSCDialogFragment.this, true);
                                    if (SGMSCDialogFragment.this.l != null && !com.sankuai.shangou.stone.util.p.a(map)) {
                                        String unused = SGMSCDialogFragment.b;
                                        new StringBuilder("更新数据").append(com.sankuai.waimai.store.util.i.a(map));
                                        SGMSCDialogFragment.this.q = com.sankuai.waimai.store.util.i.a(map);
                                    }
                                    SGMSCDialogFragment.this.dismissAllowingStateLoss();
                                } else if ("dialog_show_dialog".equals(str)) {
                                    SGMSCDialogFragment sGMSCDialogFragment = SGMSCDialogFragment.this;
                                    Map map2 = map;
                                    Object[] objArr4 = {map2};
                                    ChangeQuickRedirect changeQuickRedirect4 = SGMSCDialogFragment.a;
                                    if (PatchProxy.isSupport(objArr4, sGMSCDialogFragment, changeQuickRedirect4, false, "b4cb2bb42991fe49f07adc8acc67570b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, sGMSCDialogFragment, changeQuickRedirect4, false, "b4cb2bb42991fe49f07adc8acc67570b");
                                        return;
                                    }
                                    String valueOf = String.valueOf(map2.get(NetLogConstants.Details.SCHEME));
                                    Object obj = map2.get("data");
                                    String valueOf2 = String.valueOf(map2.get("page_height"));
                                    try {
                                        StringBuilder sb = new StringBuilder(com.sankuai.waimai.store.router.h.y);
                                        sb.append("?uri=" + URLEncoder.encode(valueOf, "utf-8"));
                                        sb.append("&page_height=" + valueOf2);
                                        String sb2 = sb.toString();
                                        if (sGMSCDialogFragment.getDialog() == null || sGMSCDialogFragment.getActivity().isFinishing()) {
                                            return;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("extra", com.sankuai.waimai.store.util.i.a(obj));
                                        com.sankuai.waimai.store.router.d.b(sGMSCDialogFragment.getActivity(), sb2, bundle, 99);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                } else if ("dialog_close".equals(str)) {
                                    SGMSCDialogFragment.this.dismissAllowingStateLoss();
                                } else if ("shopCartEvent".equals(str)) {
                                    com.sankuai.waimai.store.goods.list.utils.f.a(map, SGMSCDialogFragment.this.getActivity(), SGMSCDialogFragment.this.r, SGMSCDialogFragment.this);
                                }
                            }
                        }
                    }, SGMSCDialogFragment.b);
                }
            }
        };
    }

    public static /* synthetic */ int a(SGMSCDialogFragment sGMSCDialogFragment, int i) {
        sGMSCDialogFragment.e = i;
        return i;
    }

    public static /* synthetic */ i a(SGMSCDialogFragment sGMSCDialogFragment, i iVar) {
        sGMSCDialogFragment.v = iVar;
        return iVar;
    }

    public static /* synthetic */ Map a(SGMSCDialogFragment sGMSCDialogFragment, Map map) {
        sGMSCDialogFragment.n = map;
        return map;
    }

    public static /* synthetic */ String b(SGMSCDialogFragment sGMSCDialogFragment, String str) {
        sGMSCDialogFragment.m = str;
        return str;
    }

    public static /* synthetic */ boolean b(SGMSCDialogFragment sGMSCDialogFragment, boolean z) {
        sGMSCDialogFragment.k = true;
        return true;
    }

    public static /* synthetic */ boolean c(SGMSCDialogFragment sGMSCDialogFragment, boolean z) {
        sGMSCDialogFragment.p = z;
        return z;
    }

    public static /* synthetic */ boolean d(SGMSCDialogFragment sGMSCDialogFragment, boolean z) {
        sGMSCDialogFragment.s = z;
        return z;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b5da3a457e30e3c622376576930ce6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b5da3a457e30e3c622376576930ce6");
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (this.s) {
            frameLayout = new RoundedFrameLayout(getContext(), com.sankuai.shangou.stone.util.h.a(getContext(), 12.0f));
        }
        frameLayout.setId(o);
        if (this.i) {
            Object[] objArr2 = {frameLayout};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb6ed95a4d8e3bbb748ad6b3a2777ee9", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb6ed95a4d8e3bbb748ad6b3a2777ee9") : com.sankuai.waimai.store.mrn.dialog.a.a(getContext(), frameLayout, new a.InterfaceC1233a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.SGMSCDialogFragment.2
                public static ChangeQuickRedirect a;

                {
                    SGMSCDialogFragment.this = this;
                }

                @Override // com.sankuai.waimai.store.mrn.dialog.a.InterfaceC1233a
                public final void a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "09e11bb9dec8fb40a14ea8ffcc1f3576", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "09e11bb9dec8fb40a14ea8ffcc1f3576");
                    } else if (i == 0) {
                        SGMSCDialogFragment.this.dismissAllowingStateLoss();
                    }
                }

                @Override // com.sankuai.waimai.store.mrn.dialog.a.InterfaceC1233a
                public final boolean a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ed286d1900adc72124f2fdc5bf8ec694", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ed286d1900adc72124f2fdc5bf8ec694")).booleanValue() : SGMSCDialogFragment.this.j;
                }
            });
        }
        return frameLayout;
    }

    @Override // android.support.v4.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0231645b45c9d49a28d3b72e4c2bf1aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0231645b45c9d49a28d3b72e4c2bf1aa");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (this.l != null) {
            this.l.onActivityResult(i, i2, intent);
        }
        if (i2 == -1 && intent != null) {
            String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "bigphoto_result");
            if (!t.a(a2)) {
                this.l.a((Map) com.sankuai.waimai.store.util.i.a(a2, new TypeToken<HashMap<String, Object>>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.SGMSCDialogFragment.1
                    {
                        SGMSCDialogFragment.this = this;
                    }
                }.getType()));
            }
        }
        com.meituan.android.privacy.aop.a.f();
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c4688d2e51a136b851eac65fce00e94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c4688d2e51a136b851eac65fce00e94");
        } else if (getDialog() == null || getDialog().getWindow() == null || getDialog().getWindow().getAttributes() == null) {
        } else {
            WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
            attributes.width = this.f;
            attributes.height = this.e;
            attributes.gravity = this.g;
            getDialog().getWindow().setAttributes(attributes);
        }
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e1616a3becb47cbbd7837989145e860", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e1616a3becb47cbbd7837989145e860");
            return;
        }
        super.onConfigurationChanged(configuration);
        if ((this.t == configuration.screenWidthDp && this.u == configuration.screenHeightDp) || this.v == null) {
            return;
        }
        this.t = configuration.screenWidthDp;
        this.u = configuration.screenHeightDp;
        this.v.a();
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f585cc09594d04c001c273bf03a5fb83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f585cc09594d04c001c273bf03a5fb83");
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.n != null) {
            this.l = WidgetContentFragment.a(this.m, this.n, this.p, (int) R.layout.wm_sc_msc_dialog_placeholder_container);
        } else {
            this.l = WidgetContentFragment.a(this.m);
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(d);
        this.l.a(hashSet, this.w);
        getChildFragmentManager().beginTransaction().add(o, this.l).commitAllowingStateLoss();
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b04a08632872f94e5744b202c369e0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b04a08632872f94e5744b202c369e0d");
            return;
        }
        super.onResume();
        if (this.h) {
            return;
        }
        c();
        this.h = true;
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0b31ff9f6c1f1af099b3fa24994905d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0b31ff9f6c1f1af099b3fa24994905d");
            return;
        }
        super.onDismiss(dialogInterface);
        Activity d2 = d();
        Intent intent = new Intent();
        if (!com.sankuai.shangou.stone.util.p.a(this.q)) {
            intent.putExtra("bigphoto_result", this.q);
        }
        if (this.k) {
            d2.setResult(-1, intent);
        }
        d2.finish();
        d2.overridePendingTransition(0, R.anim.wm_sc_common_dialog_alpha_out);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98b2eafb47e5589d77898734c7c82358", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98b2eafb47e5589d77898734c7c82358") : new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        Map<String, Object> b;
        String c;
        float d;
        Map<String, Object> e;
        boolean f;
        boolean g;
        i h;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2abb85390cd823128e0d446c416fcc83", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2abb85390cd823128e0d446c416fcc83");
            } else {
                this.b = new HashMap();
            }
        }
    }
}
