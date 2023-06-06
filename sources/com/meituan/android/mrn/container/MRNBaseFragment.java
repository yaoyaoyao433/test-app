package com.meituan.android.mrn.container;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.MRNRootView;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.UiThreadUtil;
import com.meituan.android.mrn.config.h;
import com.meituan.android.mrn.config.z;
import com.meituan.android.mrn.containerplugin.stage.IContainerLifeCycleStage;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.shell.MRNReactPackageInterface;
import com.meituan.android.mrn.utils.ae;
import com.meituan.android.mrn.utils.i;
import com.meituan.android.mrn.utils.p;
import com.meituan.metrics.MetricsNameProvider;
import com.meituan.metrics.MetricsTagsProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@SuppressLint({"Registered"})
/* loaded from: classes2.dex */
public class MRNBaseFragment extends Fragment implements com.facebook.react.modules.core.b, com.facebook.react.modules.core.e, b, MetricsNameProvider, MetricsTagsProvider {
    private static final String a = "MRNBaseFragment";
    public static ChangeQuickRedirect d;
    private View b;
    private com.meituan.android.mrn.component.skeleton.a c;
    protected MRNRootView e;
    public g f;
    private View g;
    private FrameLayout h;
    private long i;
    private int j;
    private com.meituan.android.mrn.component.b k;
    private h l;

    @Override // com.meituan.android.mrn.container.b
    public final com.facebook.react.modules.core.b j() {
        return this;
    }

    @Override // android.support.v4.app.Fragment
    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa4dccc7b89eae73d4948282bcb44e86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa4dccc7b89eae73d4948282bcb44e86");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
        }
    }

    public void r_() {
    }

    public MRNBaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f5d0e2644333f0c617c1b0c5ed840db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f5d0e2644333f0c617c1b0c5ed840db");
            return;
        }
        this.i = System.currentTimeMillis();
        this.j = 0;
    }

    public static /* synthetic */ void b(MRNBaseFragment mRNBaseFragment, int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, mRNBaseFragment, changeQuickRedirect, false, "5efa2ff23016d67e2397fe9fc4a114b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mRNBaseFragment, changeQuickRedirect, false, "5efa2ff23016d67e2397fe9fc4a114b1");
        } else if (mRNBaseFragment.c == null || mRNBaseFragment.c.b) {
        } else {
            if (i == 0) {
                mRNBaseFragment.c.setVisibility(0);
                return;
            }
            if (mRNBaseFragment.b != null) {
                mRNBaseFragment.b.setVisibility(8);
            }
            mRNBaseFragment.c.setAlpha(1.0f);
            if (System.currentTimeMillis() - mRNBaseFragment.i > 220) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, mRNBaseFragment, changeQuickRedirect2, false, "3237ca7a30dfb7c0884de5b62d195bac", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, mRNBaseFragment, changeQuickRedirect2, false, "3237ca7a30dfb7c0884de5b62d195bac")).booleanValue();
                } else if (mRNBaseFragment.f == null || mRNBaseFragment.f.p() == null || !mRNBaseFragment.f.p().n) {
                    z = false;
                }
                if (!z) {
                    ObjectAnimator duration = ObjectAnimator.ofFloat(mRNBaseFragment.c, "alpha", 1.0f, 0.0f).setDuration(200L);
                    duration.addListener(new AnimatorListenerAdapter() { // from class: com.meituan.android.mrn.container.MRNBaseFragment.5
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            Object[] objArr3 = {animator};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4d30ec262ade645e4bd69a20329fdd40", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4d30ec262ade645e4bd69a20329fdd40");
                                return;
                            }
                            super.onAnimationEnd(animator);
                            if (MRNBaseFragment.this.c != null) {
                                MRNBaseFragment.this.c.setVisibility(8);
                            }
                        }
                    });
                    duration.start();
                    return;
                }
            }
            mRNBaseFragment.c.setVisibility(8);
        }
    }

    public static /* synthetic */ void g(MRNBaseFragment mRNBaseFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, mRNBaseFragment, changeQuickRedirect, false, "49d639af76c74e0a07e712da1e4ded9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mRNBaseFragment, changeQuickRedirect, false, "49d639af76c74e0a07e712da1e4ded9c");
        } else if (mRNBaseFragment.g != null) {
            TextView textView = (TextView) mRNBaseFragment.g.findViewById(R.id.error_message);
            if (textView != null && mRNBaseFragment.f != null) {
                textView.setText(String.format("(%s)", mRNBaseFragment.f.x()));
            }
            TextView textView2 = (TextView) mRNBaseFragment.g.findViewById(R.id.indistinct_error_message);
            if (textView2 != null) {
                textView2.setText(mRNBaseFragment.p());
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2590cb825dd6f8a05a00014bc998661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2590cb825dd6f8a05a00014bc998661");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81c50bad52398057e502d068617b8627", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81c50bad52398057e502d068617b8627");
        }
        if (this.k == null) {
            this.k = com.meituan.android.mrn.component.c.a().b();
        }
        this.k.a();
        FragmentActivity activity = getActivity();
        this.h = new FrameLayout(activity);
        this.h.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.e = b(activity);
        this.e.setMRNScene(this);
        this.b = a(activity);
        if (this.b == null) {
            throw new RuntimeException("progressView should not be null");
        }
        this.b.setVisibility(0);
        this.h.addView(this.e, new FrameLayout.LayoutParams(-1, -1));
        this.h.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        this.f = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e246d770f68adfd340d819b8070a42cb", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e246d770f68adfd340d819b8070a42cb") : new g(getActivity(), this);
        this.f.a(m());
        this.f.o.a(a());
        this.f.o.a(new IContainerLifeCycleStage.IContainerCreateStage.b(), (IContainerLifeCycleStage.IContainerCreateStage.a) this.f.a((g) new IContainerLifeCycleStage.IContainerCreateStage.a()));
        this.c = ae.a(getContext(), this.f.p());
        if (this.c != null) {
            this.h.addView(this.c);
        }
        return this.h;
    }

    @Override // android.support.v4.app.Fragment
    @CallSuper
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c35df0b97e0734c87d99f874c38a514d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c35df0b97e0734c87d99f874c38a514d");
            return;
        }
        super.onActivityCreated(bundle);
        this.f.a(this.k);
        this.f.a(bundle);
    }

    @Override // android.support.v4.app.Fragment
    @CallSuper
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "693cb7a10cc6dfe073abf24f22cd74fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "693cb7a10cc6dfe073abf24f22cd74fe");
            return;
        }
        super.onResume();
        i.a(this.f.o());
        this.f.f();
    }

    @Override // android.support.v4.app.Fragment
    @CallSuper
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5542a52152a04195923ccd6dba91d600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5542a52152a04195923ccd6dba91d600");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (this.f != null) {
            this.f.b(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.app.Fragment
    @CallSuper
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3451b9aee4059c31d2990b2a4e15f9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3451b9aee4059c31d2990b2a4e15f9d");
            return;
        }
        super.onHiddenChanged(z);
        if (this.f != null) {
            g gVar = this.f;
            boolean isResumed = isResumed();
            Object[] objArr2 = {Byte.valueOf(isResumed ? (byte) 1 : (byte) 0), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = g.c;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "a30e142bd737ed42b16862e4e341abbe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "a30e142bd737ed42b16862e4e341abbe");
                return;
            }
            p.a("[MRNSceneCompatDelegate@onFragmentHiddenChanged]", "isResumed:" + isResumed + ",isHidden:" + z);
            gVar.j = isResumed;
            gVar.i = z;
            b i = gVar.i();
            if (!z) {
                if (i != null && gVar.h) {
                    p.a("[MRNSceneCompatDelegate@onFragmentHiddenChanged]", "mrnScene hidden: false,mHasUnmountReactApplication: " + gVar.h);
                    gVar.a(gVar.q(), false);
                } else {
                    com.facebook.common.logging.a.d("[MRNSceneCompatDelegate@onFragmentHiddenChanged]", "mrnScene: " + i + ",mHasUnmountReactApplication: " + gVar.h);
                }
                if (isResumed) {
                    gVar.u();
                }
                if (gVar.l != null) {
                    f fVar = gVar.l;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                    if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "d32159802909f37d89d019e8b5ec7dfd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "d32159802909f37d89d019e8b5ec7dfd");
                        return;
                    } else {
                        fVar.b = System.currentTimeMillis();
                        return;
                    }
                }
                return;
            }
            if (isResumed) {
                gVar.v();
            }
            if (gVar.l != null) {
                f fVar2 = gVar.l;
                byte b = (gVar.e == null || gVar.e.getChildCount() != 0) ? (byte) 0 : (byte) 1;
                Object[] objArr4 = {Byte.valueOf(b)};
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr4, fVar2, changeQuickRedirect4, false, "4a7f6c66407f12854a9f05ff37879730", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, fVar2, changeQuickRedirect4, false, "4a7f6c66407f12854a9f05ff37879730");
                    return;
                }
                fVar2.b = 0L;
                if (fVar2.l != null) {
                    fVar2.l.a(fVar2.p);
                }
                p.a("[MRNPageMonitor@onFragmentHidden]", String.format("onFragmentHidden&bundlename=%s&component=%s&isPageLoadSuccess=%b&errorCode=%d&step=%d", fVar2.n, fVar2.o, Boolean.valueOf(b ^ 1), Integer.valueOf(fVar2.r), Integer.valueOf(fVar2.j)));
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    @CallSuper
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560ee81155572e1020e74934c2da2736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560ee81155572e1020e74934c2da2736");
            return;
        }
        i.a();
        super.onPause();
        this.f.g();
    }

    @Override // android.support.v4.app.Fragment
    @CallSuper
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7748603902d56b1a48061d9aee0a00bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7748603902d56b1a48061d9aee0a00bf");
            return;
        }
        super.onStop();
        this.f.h();
    }

    @Override // android.support.v4.app.Fragment
    @CallSuper
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beeabb5b0c68b8ef8383145957b67e9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beeabb5b0c68b8ef8383145957b67e9b");
            return;
        }
        super.onDestroyView();
        this.f.j();
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    @CallSuper
    public void onLowMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdfbac2c3822d2aa400e4f4efff3e57c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdfbac2c3822d2aa400e4f4efff3e57c");
            return;
        }
        super.onLowMemory();
        g gVar = this.f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.c;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "a5f5f39d7ec68951941adce7d1bae6a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "a5f5f39d7ec68951941adce7d1bae6a8");
        } else if (gVar.i) {
            com.facebook.common.logging.a.b("[MRNSceneCompatDelegate@onLowMemory]", "unmountReactApplication");
            gVar.l();
        }
    }

    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2557cfd8e8e93557e29f62a381b0117e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2557cfd8e8e93557e29f62a381b0117e")).booleanValue();
        }
        if (this.f != null) {
            return this.f.k();
        }
        return false;
    }

    public MRNRootView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fc5be914d9cfd30245f8d72340ce751", RobustBitConfig.DEFAULT_VALUE) ? (MRNRootView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fc5be914d9cfd30245f8d72340ce751") : new MRNRootView(context);
    }

    public final ReactInstanceManager l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8a24913352358fa3ea02652eee1b878", RobustBitConfig.DEFAULT_VALUE) ? (ReactInstanceManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8a24913352358fa3ea02652eee1b878") : this.f.g;
    }

    @Override // com.meituan.android.mrn.container.b
    public final ReactRootView b() {
        return this.e;
    }

    @Override // com.meituan.android.mrn.container.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e139bc33aee0c449f7ab705ae06e9d94", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e139bc33aee0c449f7ab705ae06e9d94") : (this.f == null || this.f.p() == null) ? "" : this.f.p().i;
    }

    @Override // com.meituan.android.mrn.container.b
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb10dd6ee77e0970e004e34f5522d727", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb10dd6ee77e0970e004e34f5522d727") : (this.f == null || this.f.p() == null) ? "" : this.f.p().e;
    }

    @Override // com.meituan.android.mrn.container.b
    public final Bundle h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "785b018deb3734929cc00f507a3a6f9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "785b018deb3734929cc00f507a3a6f9a");
        }
        if (getArguments() == null && m() == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (getArguments() != null) {
            for (String str : getArguments().keySet()) {
                Object obj = getArguments().get(str);
                if (obj != null) {
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
        Uri m = m();
        if (m != null && m.getQueryParameterNames() != null) {
            for (String str2 : m.getQueryParameterNames()) {
                bundle.putString(str2, m.getQueryParameter(str2));
            }
        }
        return bundle;
    }

    public Uri m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "166fc484ba91c974f4ed8ecc3f210381", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "166fc484ba91c974f4ed8ecc3f210381");
        }
        if (getArguments() == null || getArguments().getParcelable("mrn_arg") == null) {
            return null;
        }
        return (Uri) getArguments().getParcelable("mrn_arg");
    }

    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ea47b8df379fc8b033659f3c4dbca7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ea47b8df379fc8b033659f3c4dbca7");
        } else {
            a(0);
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28f39e07937fb35eab335a8f7c85ab17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28f39e07937fb35eab335a8f7c85ab17");
        } else {
            a(1);
        }
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8e032f9306c7862ab712e54cf709a3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8e032f9306c7862ab712e54cf709a3f");
        } else {
            a(2);
        }
    }

    public final g n() {
        return this.f;
    }

    @Override // com.meituan.android.mrn.container.b
    public List<com.facebook.react.i> d() {
        List<com.facebook.react.i> a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58aeaaae1da5d2ff3317c995d557b101", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58aeaaae1da5d2ff3317c995d557b101");
        }
        ArrayList arrayList = new ArrayList();
        Uri uri = null;
        String str = (this.f == null || this.f.p() == null) ? null : this.f.p().c;
        String str2 = (this.f == null || this.f.p() == null) ? null : this.f.p().d;
        if (this.f != null && this.f.p() != null) {
            uri = this.f.p().b;
        }
        if (uri != null) {
            String.format("mrnurl=%s", uri.toString());
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                if (com.sankuai.meituan.serviceloader.b.a()) {
                    p.a("[MRNBaseFragment@getRegistPackages]", "ServiceLoader初始化成功,entryName: " + str2);
                    List a3 = com.sankuai.meituan.serviceloader.b.a(MRNReactPackageInterface.class, str2);
                    if (a3 != null && !a3.isEmpty() && a3.get(0) != null) {
                        arrayList.addAll(((MRNReactPackageInterface) a3.get(0)).a());
                    }
                } else {
                    com.facebook.common.logging.a.b("[MRNBaseFragment@getRegistPackages]", a + ".getRegistPackages: ServiceLoader尚未初始化, entryName: " + str2);
                }
            } else {
                String str3 = this.f != null ? "不为空" : "为空";
                com.facebook.common.logging.a.b("[MRNBaseFragment@getRegistPackages]", a + ".getRegistPackages: entryName为空, mDelegate:" + str3);
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (a2 = com.meituan.android.mrn.config.p.a(str, str2)) != null) {
                arrayList.addAll(a2);
            }
        } catch (Exception e) {
            com.facebook.common.logging.a.d("[MRNBaseFragment@getRegistPackages]", "mrn_get_packages", e);
        }
        return arrayList;
    }

    @Override // com.meituan.android.mrn.container.b
    @Deprecated
    public final View g() {
        return this.g;
    }

    public View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb6663446f3a0dda2f7925d8151c487", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb6663446f3a0dda2f7925d8151c487");
        }
        this.l = z.a().a();
        return this.l.a(context, m(), getActivity());
    }

    public View c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7a64c4d3e4a4733c8e2340bec33848e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7a64c4d3e4a4733c8e2340bec33848e");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.mrn_common_error_layout, (ViewGroup) null);
        z.a();
        inflate.findViewById(R.id.mrn_retry).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.mrn.container.MRNBaseFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "422b2024a47024c8b9545339f62b0b68", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "422b2024a47024c8b9545339f62b0b68");
                } else if (MRNBaseFragment.this.j <= 1) {
                    MRNBaseFragment.this.f.w();
                    MRNBaseFragment.this.j++;
                    if (MRNBaseFragment.this.j >= 2) {
                        ((TextView) view).setText("关闭页面");
                    }
                } else {
                    MRNBaseFragment.this.r_();
                }
            }
        });
        inflate.findViewById(R.id.btnClose).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.mrn.container.MRNBaseFragment.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7403de73db95dcfba0252967f1933512", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7403de73db95dcfba0252967f1933512");
                } else {
                    MRNBaseFragment.this.r_();
                }
            }
        });
        return inflate;
    }

    private void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d82b1264b5b7426b57b414953781d35e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d82b1264b5b7426b57b414953781d35e");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.container.MRNBaseFragment.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae4998e09b7d78644ca19dfbfa0ece15", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae4998e09b7d78644ca19dfbfa0ece15");
                        return;
                    }
                    MRNBaseFragment.b(MRNBaseFragment.this, i);
                    if (MRNBaseFragment.this.b != null) {
                        MRNBaseFragment.this.b.setVisibility(i == 0 ? 0 : 8);
                        if (i != 0) {
                            com.meituan.android.mrn.component.b unused = MRNBaseFragment.this.k;
                        }
                    }
                    if (i == 1 && MRNBaseFragment.this.g == null && MRNBaseFragment.this.getContext() != null) {
                        MRNBaseFragment.this.g = MRNBaseFragment.this.c(MRNBaseFragment.this.getContext());
                        if (MRNBaseFragment.this.g != null) {
                            if (MRNBaseFragment.this.h != null) {
                                MRNBaseFragment.this.h.addView(MRNBaseFragment.this.g, new FrameLayout.LayoutParams(-1, -1));
                            }
                        } else {
                            throw new RuntimeException("errorView should not be null");
                        }
                    }
                    if (MRNBaseFragment.this.g == null || i != 1) {
                        return;
                    }
                    MRNBaseFragment.this.g.setVisibility(0);
                    MRNBaseFragment.g(MRNBaseFragment.this);
                }
            });
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(@NonNull final Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f5767c7828a345b401b3e44f6c8c3de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f5767c7828a345b401b3e44f6c8c3de");
            return;
        }
        bundle.putString("state", "");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.android.mrn.container.MRNBaseFragment.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48ee34a48d629ea763bc313b7be5100c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48ee34a48d629ea763bc313b7be5100c");
                } else if (bundle == null || Build.VERSION.SDK_INT < 24) {
                } else {
                    bundle.remove("android:view_state");
                    bundle.remove("state");
                }
            }
        });
        super.onSaveInstanceState(bundle);
    }

    private String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f47708839a6275cd1ac2d3d29d28c4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f47708839a6275cd1ac2d3d29d28c4a");
        }
        try {
            return String.format("App Name: %s\nApp Version: %s", getContext().getResources().getString(getContext().getApplicationInfo().labelRes), Integer.valueOf(com.meituan.android.mrn.config.c.a().m()));
        } catch (Throwable th) {
            com.facebook.common.logging.a.d("MRNBaseFragment@getIndistinctErrorMessage", null, th);
            return "";
        }
    }

    @Override // com.meituan.metrics.MetricsNameProvider
    public String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acdc9b7fb5d3687ba4e37176c3418699", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acdc9b7fb5d3687ba4e37176c3418699");
        }
        if (this.f != null) {
            return this.f.y();
        }
        return null;
    }

    @Override // com.meituan.metrics.MetricsTagsProvider
    public Map<String, Object> getTags(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2d6ad8856f6093d32c4b8f80f31112a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2d6ad8856f6093d32c4b8f80f31112a");
        }
        if (this.f != null) {
            return this.f.z();
        }
        return null;
    }

    public final k o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1cc2656e0dbd20a7b4c41787d8b4ece", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1cc2656e0dbd20a7b4c41787d8b4ece") : this.f.f;
    }
}
