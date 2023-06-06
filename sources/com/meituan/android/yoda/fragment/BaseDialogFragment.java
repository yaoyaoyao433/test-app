package com.meituan.android.yoda.fragment;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.IYodaVerifyListener;
import com.meituan.android.yoda.activity.YodaConfirmActivity;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.model.b;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class BaseDialogFragment extends DialogFragment implements b.InterfaceC0379b {
    public static ChangeQuickRedirect a;
    protected String b;
    protected String c;
    protected String d;
    protected String e;
    protected com.meituan.android.yoda.data.a f;
    public com.meituan.android.yoda.interfaces.f<Integer> g;
    protected IYodaVerifyListener h;
    protected List<WeakReference<IYodaVerifyListener>> i;
    protected com.meituan.android.yoda.interfaces.i j;
    protected com.meituan.android.yoda.interfaces.h<YodaResult> k;
    protected Handler l;
    public boolean m;
    int n;
    com.meituan.android.yoda.monitor.a o;
    private b.c p;
    private String q;
    private long r;
    private final int s;

    public abstract String a();

    public BaseDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf327ccb1ed825d22bab3623e89f0c89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf327ccb1ed825d22bab3623e89f0c89");
            return;
        }
        this.p = new b.c();
        this.i = new CopyOnWriteArrayList();
        this.r = 0L;
        this.s = 500;
        this.l = new Handler();
        this.m = false;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        AccessibilityManager accessibilityManager;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1768369f394e1722b5539c07bf37a5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1768369f394e1722b5539c07bf37a5c");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "218e3174fe5bde45003dbeca2650863c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "218e3174fe5bde45003dbeca2650863c")).booleanValue() : y.a((Activity) getActivity())) {
            b();
        } else if (this.h == null) {
            b();
        } else {
            this.b = getClass().getSimpleName();
            String str = this.b;
            com.meituan.android.yoda.monitor.log.a.a(str, "onCreate, requestCode = " + this.c, true);
            this.c = getArguments().getString(OtherVerifyTypeConstants.REQUEST_CODE);
            this.d = getArguments().getString("pre_request_code");
            this.f = com.meituan.android.yoda.data.b.a(this.c);
            this.e = this.f != null ? String.valueOf(this.f.c.data.get("action")) : null;
            this.o = new com.meituan.android.yoda.monitor.b(getRequestCode(), com.meituan.android.yoda.util.b.a(getActivity()));
            this.q = AppUtil.generatePageInfoKey(this);
            Statistics.addPageInfo(this.q, a());
            d(this.c);
            e(this.e);
            a(this.n);
            f(a());
            g(this.q);
            if (getParentFragment() == null) {
                setRetainInstance(true);
            }
            FragmentActivity activity = getActivity();
            if (activity == null || (accessibilityManager = (AccessibilityManager) activity.getSystemService("accessibility")) == null) {
                return;
            }
            this.m = accessibilityManager.isTouchExplorationEnabled();
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed2a3b195929d6f16c5180579ceb10b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed2a3b195929d6f16c5180579ceb10b9");
        }
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0dd1fe5521247fd685386254c77fb7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0dd1fe5521247fd685386254c77fb7c");
            return;
        }
        String str = this.b;
        com.meituan.android.yoda.monitor.log.a.a(str, "onViewCreated, requestCode = " + this.c, true);
        super.onViewCreated(view, bundle);
        if (getDialog() != null) {
            if (getDialog().getWindow() != null) {
                getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            getDialog().setCancelable(false);
            getDialog().setCanceledOnTouchOutside(false);
            getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.meituan.android.yoda.fragment.BaseDialogFragment.1
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return i == 4;
                }
            });
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6abb3c112627e00b8b51fc8a4dec63b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6abb3c112627e00b8b51fc8a4dec63b2");
            return;
        }
        super.onCancel(dialogInterface);
        for (WeakReference<IYodaVerifyListener> weakReference : this.i) {
            if (this.i.size() > 0 && weakReference.get() != null) {
                weakReference.get().onCancel(this.c);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ebab51486de4c1a3941d571b4955e94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ebab51486de4c1a3941d571b4955e94");
            return;
        }
        this.r = System.currentTimeMillis();
        super.onResume();
        String str = this.b;
        com.meituan.android.yoda.monitor.log.a.a(str, "onResume, requestCode = " + this.c, true);
        com.meituan.android.yoda.model.b.a(this).a(this.q, a());
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b884fb64452aad2c57d44ec610454a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b884fb64452aad2c57d44ec610454a83");
            return;
        }
        super.onPause();
        String str = this.b;
        com.meituan.android.yoda.monitor.log.a.a(str, "onPause, requestCode = " + this.c, true);
        long currentTimeMillis = System.currentTimeMillis() - this.r;
        Object[] objArr2 = {new Long(currentTimeMillis)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "962933305004813f3942a4018758979d", RobustBitConfig.DEFAULT_VALUE)) {
            b.InterfaceC0379b interfaceC0379b = (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "962933305004813f3942a4018758979d");
        } else {
            this.p.a(currentTimeMillis);
        }
        com.meituan.android.yoda.model.b.a(this).b(this.q, a());
    }

    public final void a(Bundle bundle, IYodaVerifyListener iYodaVerifyListener, com.meituan.android.yoda.interfaces.f<Integer> fVar, int i) {
        Object[] objArr = {bundle, iYodaVerifyListener, fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c25fa89ed5dded3fe4af57c68c1b6c8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c25fa89ed5dded3fe4af57c68c1b6c8b");
            return;
        }
        setArguments(bundle);
        a(iYodaVerifyListener);
        this.g = fVar;
        this.n = i;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.j = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2594f2aff9ee07aa4919751b6a6f0395", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.yoda.interfaces.i) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2594f2aff9ee07aa4919751b6a6f0395") : new com.meituan.android.yoda.interfaces.i() { // from class: com.meituan.android.yoda.fragment.BaseDialogFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.yoda.interfaces.i
            public final void a(String str, int i2, @Nullable Bundle bundle2) {
            }

            @Override // com.meituan.android.yoda.interfaces.i
            public final void b(String str, int i2, @Nullable Bundle bundle2) {
                Object[] objArr3 = {str, Integer.valueOf(i2), null};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ab8c3f99712ebcef3b6039b5595fc1de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ab8c3f99712ebcef3b6039b5595fc1de");
                } else {
                    BaseDialogFragment.this.a(str, i2, null);
                }
            }

            @Override // com.meituan.android.yoda.interfaces.i
            public final void a(String str, String str2) {
                Object[] objArr3 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0f7759242aca2c3b9b055678f474cdd1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0f7759242aca2c3b9b055678f474cdd1");
                } else {
                    BaseDialogFragment.this.a(str, str2);
                }
            }

            @Override // com.meituan.android.yoda.interfaces.i
            public final void a(String str, Error error) {
                Object[] objArr3 = {str, error};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "27ee3ff4c3c79dbab8d6e178245fae09", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "27ee3ff4c3c79dbab8d6e178245fae09");
                } else {
                    BaseDialogFragment.this.a(str, error);
                }
            }
        };
        this.k = new com.meituan.android.yoda.callbacks.f(iYodaVerifyListener, this.j, true);
    }

    public final void a(IYodaVerifyListener iYodaVerifyListener) {
        Object[] objArr = {iYodaVerifyListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "184a0a9233fd146ae30095f995bfcd9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "184a0a9233fd146ae30095f995bfcd9e");
        } else if (iYodaVerifyListener == null) {
        } else {
            if (this.h == null) {
                this.h = iYodaVerifyListener;
            }
            this.i.add(new WeakReference<>(iYodaVerifyListener));
        }
    }

    public final void a(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ace43ac34da0dcc12410ae687d3519ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ace43ac34da0dcc12410ae687d3519ae");
        } else {
            this.l.postDelayed(new Runnable() { // from class: com.meituan.android.yoda.fragment.BaseDialogFragment.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8b4065e3f0625c4576c7f281f95414d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8b4065e3f0625c4576c7f281f95414d");
                        return;
                    }
                    BaseDialogFragment.this.b();
                    for (WeakReference<IYodaVerifyListener> weakReference : BaseDialogFragment.this.i) {
                        if (BaseDialogFragment.this.i.size() > 0 && weakReference.get() != null) {
                            weakReference.get().onSuccess(str, str2);
                        }
                    }
                }
            }, 500L);
        }
    }

    public final void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25042b2fbfd966e7b902a2a6374c3c59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25042b2fbfd966e7b902a2a6374c3c59");
        } else {
            this.l.postDelayed(new Runnable() { // from class: com.meituan.android.yoda.fragment.BaseDialogFragment.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37f020077213195d21befd352b5da83d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37f020077213195d21befd352b5da83d");
                        return;
                    }
                    BaseDialogFragment.this.b();
                    if (BaseDialogFragment.this.i == null || BaseDialogFragment.this.i.isEmpty()) {
                        return;
                    }
                    for (WeakReference<IYodaVerifyListener> weakReference : BaseDialogFragment.this.i) {
                        if (BaseDialogFragment.this.i.size() > 0 && weakReference.get() != null) {
                            weakReference.get().onCancel(str);
                        }
                    }
                }
            }, 500L);
        }
    }

    public final void a(final String str, final Error error) {
        Object[] objArr = {str, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33258566484ff319cb9085cc17cc178a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33258566484ff319cb9085cc17cc178a");
        } else {
            this.l.postDelayed(new Runnable() { // from class: com.meituan.android.yoda.fragment.BaseDialogFragment.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9d88bfb64bc2a5dc0cf553660609825", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9d88bfb64bc2a5dc0cf553660609825");
                        return;
                    }
                    BaseDialogFragment.this.b();
                    for (WeakReference<IYodaVerifyListener> weakReference : BaseDialogFragment.this.i) {
                        if (BaseDialogFragment.this.i.size() > 0 && weakReference.get() != null) {
                            weakReference.get().onError(str, error);
                        }
                    }
                }
            }, 500L);
        }
    }

    public final void a(String str, int i, @Nullable Bundle bundle) {
        Object[] objArr = {str, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ad412632670086a5164efcd7c3c6bb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ad412632670086a5164efcd7c3c6bb7");
            return;
        }
        b();
        FragmentActivity activity = getActivity();
        if (activity instanceof YodaConfirmActivity) {
            ((YodaConfirmActivity) activity).b(str, i, bundle);
        } else if (com.meituan.android.yoda.data.d.b(i)) {
            com.meituan.android.yoda.monitor.log.a.a(this.b, "handleNextVerify, CommonReport.YODA_PAGE_LAUNCH", true);
            com.meituan.android.yoda.monitor.report.b.a("yoda_page_launch", 0L, i, str);
            com.meituan.android.yoda.action.a.a(i).a(com.meituan.android.yoda.config.launch.b.a().a(), str, getActivity(), com.meituan.android.yoda.config.launch.b.a().c(), this.h, this.g, (com.meituan.android.yoda.config.verify.a) null);
        } else {
            YodaConfirmActivity.a(getActivity(), str, i);
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cec652418e3c0aec9d10e6f49ecc69a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cec652418e3c0aec9d10e6f49ecc69a");
            return;
        }
        com.meituan.android.yoda.data.a a2 = com.meituan.android.yoda.data.b.a(this.c);
        com.meituan.android.yoda.callbacks.d.a(a2.b.a(), a2.b).a(str);
        b();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62a9954c1de5f5323d93154e5a2c4595", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62a9954c1de5f5323d93154e5a2c4595");
            return;
        }
        try {
            dismissAllowingStateLoss();
        } catch (Exception e) {
            String str = this.b;
            com.meituan.android.yoda.monitor.log.a.a(str, "dismissOnFinish exception " + e.getMessage(), true);
        }
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57c612320f627a0f657a9687c97b885a", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57c612320f627a0f657a9687c97b885a");
        }
        b.c cVar = this.p;
        cVar.b = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getBid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a05ca177d77b9533159aeca75ec28d3e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a05ca177d77b9533159aeca75ec28d3e") : this.p.getBid();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "301044edcf0e12c1eb9945ee8b1692c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "301044edcf0e12c1eb9945ee8b1692c2");
        }
        b.c cVar = this.p;
        cVar.c = i;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public int getConfirmType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7de51943ff5e503862a14c71a245d94", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7de51943ff5e503862a14c71a245d94")).intValue() : this.p.getConfirmType();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a22a50d0f27ddfc4cdf97ecff41304c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a22a50d0f27ddfc4cdf97ecff41304c5");
        }
        b.c cVar = this.p;
        cVar.d = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getRequestCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c08b346de8da9a35e2529618c46563c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c08b346de8da9a35e2529618c46563c") : this.p.getRequestCode();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public long getPageDuration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf6c9d5e6c82338e0d79b300607d31b3", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf6c9d5e6c82338e0d79b300607d31b3")).longValue() : this.p.getPageDuration();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e054446f7c66a93c4f9cbd787e88799", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e054446f7c66a93c4f9cbd787e88799");
        }
        b.c cVar = this.p;
        cVar.e = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getAction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99269bfc8e1e3f7dce28b344e1100e37", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99269bfc8e1e3f7dce28b344e1100e37") : this.p.getAction();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54f0003bd54266ae5f975d5d73d1f65e", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54f0003bd54266ae5f975d5d73d1f65e");
        }
        b.c cVar = this.p;
        cVar.f = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getPageCid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ea01afac7847ab77ff9f20081ad9d76", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ea01afac7847ab77ff9f20081ad9d76") : this.p.getPageCid();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb6c480db80f573014fcee4c365232a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb6c480db80f573014fcee4c365232a6");
        }
        b.c cVar = this.p;
        cVar.g = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getPageInfoKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac56e5173559c8dae0b97561c9938cb1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac56e5173559c8dae0b97561c9938cb1") : this.p.getPageInfoKey();
    }
}
