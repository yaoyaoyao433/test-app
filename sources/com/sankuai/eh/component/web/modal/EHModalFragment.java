package com.sankuai.eh.component.web.modal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import com.google.gson.JsonElement;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.web.modal.a;
import com.sankuai.eh.component.web.module.j;
import com.sankuai.meituan.android.knb.KNBWebCompactFactory;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.meituan.android.knb.listener.OnAnalyzeParamsListener;
import com.sankuai.meituan.takeoutnew.util.aop.h;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHModalFragment extends Fragment implements com.sankuai.eh.component.service.spi.a {
    public static ChangeQuickRedirect a;
    a.C0553a b;
    Animation.AnimationListener c;
    private j d;
    private com.sankuai.eh.component.web.module.c e;
    private MetricsSpeedMeterTask f;

    @Override // com.sankuai.eh.component.service.spi.a
    public final void b() {
    }

    public static EHModalFragment a(com.sankuai.eh.component.web.module.c cVar, Bundle bundle) {
        Object[] objArr = {cVar, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2874b6f60ad57f00091cfe7d986c1e56", RobustBitConfig.DEFAULT_VALUE)) {
            return (EHModalFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2874b6f60ad57f00091cfe7d986c1e56");
        }
        EHModalFragment eHModalFragment = new EHModalFragment();
        eHModalFragment.setArguments(bundle);
        eHModalFragment.e = cVar;
        return eHModalFragment;
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e979a4c14cc63cf0a681df8508a3aeb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e979a4c14cc63cf0a681df8508a3aeb8");
        } else {
            super.onHiddenChanged(z);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f02abd30d60492a01871496c2ae0e570", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f02abd30d60492a01871496c2ae0e570");
            return;
        }
        this.f = MetricsSpeedMeterTask.createCustomSpeedMeterTask("ehc_router");
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7712cbb74dff0e7ea0bb8097e17ee513", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7712cbb74dff0e7ea0bb8097e17ee513");
        } else {
            this.d = new a(KNBWebCompactFactory.getKNBCompact(1, getActivity()), this.e);
        }
        this.d.a(getContext(), getArguments());
        this.f.recordStep("onCreate");
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdfac65a5758e82d8bfd21a76e676891", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdfac65a5758e82d8bfd21a76e676891");
        }
        View a2 = this.d.a(layoutInflater, viewGroup);
        if (this.f != null) {
            this.f.recordStep("onCreateView");
        }
        return a2;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46433f824469835028b46f12577c25a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46433f824469835028b46f12577c25a3");
            return;
        }
        super.onViewCreated(view, bundle);
        this.d.a(view, bundle);
        a aVar = (a) this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.component.web.module.f.c;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9b20a4bd527511be0ad4a685bd6fa729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9b20a4bd527511be0ad4a685bd6fa729");
        } else {
            aVar.d.getWebSettings().invisibleTitleBar();
        }
        if (isHidden() && c() != null) {
            WebView c = c();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.eh.component.service.utils.a.a;
            c.layout(0, 0, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6fd79420e8d3a46f5b54593f82d5ed48", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6fd79420e8d3a46f5b54593f82d5ed48")).intValue() : com.sankuai.eh.component.service.a.b().getResources().getDisplayMetrics().widthPixels, com.sankuai.eh.component.service.utils.a.b());
        }
        if (this.f != null) {
            this.f.recordStep("onViewCreated");
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b75347d5ebb648309afa16480a19835", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b75347d5ebb648309afa16480a19835");
            return;
        }
        super.onActivityCreated(bundle);
        if (getArguments() != null && getArguments().getBundle("saveState") != null) {
            this.d.a(getArguments().getBundle("saveState"));
        } else {
            this.d.a(bundle);
        }
        if (this.f != null) {
            h.a(this.f.recordStep("onActivityCreated"));
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f35a645ee8e24402dec7ba13f34f01b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f35a645ee8e24402dec7ba13f34f01b");
            return;
        }
        super.onStart();
        this.d.b();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f78b2b09448daa94d5e72c9194974f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f78b2b09448daa94d5e72c9194974f2");
            return;
        }
        super.onResume();
        this.d.c();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6ef1d0b8adf4cb2a93811e0215f22d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6ef1d0b8adf4cb2a93811e0215f22d1");
            return;
        }
        super.onPause();
        this.d.d();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "693f1d5847a120e0d0dcb901fbc8b4f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "693f1d5847a120e0d0dcb901fbc8b4f4");
            return;
        }
        super.onStop();
        this.d.e();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c61f0bc8797cd9fadc40bd0f4ced9f5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c61f0bc8797cd9fadc40bd0f4ced9f5f");
            return;
        }
        this.d.j();
        super.onDestroyView();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3324a71a595b5967f6a7546bbea638ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3324a71a595b5967f6a7546bbea638ab");
            return;
        }
        super.onDestroy();
        this.d.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "460e8a33222727adc0465f676a97cf7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "460e8a33222727adc0465f676a97cf7c");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        this.d.a(i, i2, intent);
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "067bcb73ad25977cdf50f19ec8d3515c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "067bcb73ad25977cdf50f19ec8d3515c");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            this.d.a(i, strArr, iArr);
        }
    }

    @Override // android.support.v4.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation translateAnimation;
        int i3;
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40024ff85bb9579e1ad672596be5bdb5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40024ff85bb9579e1ad672596be5bdb5");
        }
        if (this.b != null) {
            Animation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
            String c = this.b.c();
            char c2 = 65535;
            int hashCode = c.hashCode();
            if (hashCode != -1681590527) {
                if (hashCode != -1282132831) {
                    if (hashCode == -74873900 && c.equals("bottomtoupandscale")) {
                        c2 = 2;
                    }
                } else if (c.equals("fadein")) {
                    c2 = 0;
                }
            } else if (c.equals("bottomtoup")) {
                c2 = 1;
            }
            AnimationSet animationSet = translateAnimation2;
            switch (c2) {
                case 0:
                    if (z) {
                        animationSet = new AlphaAnimation(0.0f, 1.0f);
                        break;
                    } else {
                        animationSet = new AlphaAnimation(1.0f, 0.0f);
                        break;
                    }
                case 1:
                    float b = com.sankuai.eh.component.service.utils.a.b() * 0.8f;
                    if (z) {
                        translateAnimation = new TranslateAnimation(0.0f, 0.0f, b, 0.0f);
                    } else {
                        translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, b);
                    }
                    animationSet = translateAnimation;
                    break;
                case 2:
                    if (!z) {
                        AnimationSet animationSet2 = new AnimationSet(false);
                        JsonElement a2 = com.sankuai.eh.component.service.utils.b.a(this.b.k, "finishAnimation", "position");
                        float a3 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(a2, "centerX"), com.sankuai.eh.component.service.utils.a.a() / 2.0f);
                        JsonElement c3 = com.sankuai.eh.component.service.utils.b.c(a2, "centerY");
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.component.service.utils.a.a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2f1e27bde37bbb22e606626599145446", RobustBitConfig.DEFAULT_VALUE)) {
                            i3 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2f1e27bde37bbb22e606626599145446")).intValue();
                        } else {
                            DisplayMetrics displayMetrics = com.sankuai.eh.component.service.a.b().getResources().getDisplayMetrics();
                            i3 = (int) (displayMetrics.heightPixels / displayMetrics.density);
                        }
                        float a4 = com.sankuai.eh.component.service.utils.b.a(c3, i3 / 2.0f);
                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(a2, "width"), 100.0f) / com.sankuai.eh.component.service.utils.a.b(getView().getWidth()), 1.0f, com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(a2, "height"), 100.0f) / com.sankuai.eh.component.service.utils.a.b(getView().getHeight()), 1, 0.5f, 1, 0.5f);
                        scaleAnimation.setInterpolator(new AccelerateInterpolator());
                        TranslateAnimation translateAnimation3 = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                        translateAnimation3.setInterpolator(new AccelerateInterpolator());
                        if (getView() != null) {
                            int[] iArr = new int[2];
                            getView().getLocationInWindow(iArr);
                            translateAnimation3 = new TranslateAnimation(0.0f, com.sankuai.eh.component.service.utils.a.a(a3) - (iArr[0] + (getView().getWidth() / 2.0f)), 0.0f, com.sankuai.eh.component.service.utils.a.a(a4) - ((iArr[1] - com.sankuai.eh.component.service.utils.a.d()) + (getView().getHeight() / 2.0f)));
                        }
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setInterpolator(new AccelerateInterpolator());
                        animationSet2.addAnimation(scaleAnimation);
                        animationSet2.addAnimation(translateAnimation3);
                        animationSet2.addAnimation(alphaAnimation);
                        animationSet2.setFillAfter(false);
                        animationSet = animationSet2;
                        break;
                    } else {
                        translateAnimation = new TranslateAnimation(0.0f, 0.0f, com.sankuai.eh.component.service.utils.a.b() * 0.8f, 0.0f);
                        animationSet = translateAnimation;
                        break;
                    }
            }
            animationSet.setDuration(this.b.b() * 1000.0f);
            if (this.c != null) {
                animationSet.setAnimationListener(this.c);
            }
            return animationSet;
        }
        return super.onCreateAnimation(i, z, i2);
    }

    public final WebView c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83e3fbc1dc1d68d0a8243d59a0485b98", RobustBitConfig.DEFAULT_VALUE) ? (WebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83e3fbc1dc1d68d0a8243d59a0485b98") : ((a) this.d).h();
    }

    @Override // com.sankuai.eh.component.service.spi.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "916fbebfbc99a7e158da4e4b4b56ec6e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "916fbebfbc99a7e158da4e4b4b56ec6e")).booleanValue();
        }
        if (this.d != null) {
            this.d.g();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends com.sankuai.eh.component.web.module.f {
        public static ChangeQuickRedirect a;

        public a(KNBWebCompat kNBWebCompat, com.sankuai.eh.component.web.module.c cVar) {
            super(kNBWebCompat, cVar);
            Object[] objArr = {EHModalFragment.this, kNBWebCompat, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8796d326e094be38c5a25535788674aa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8796d326e094be38c5a25535788674aa");
            }
        }

        @Override // com.sankuai.eh.component.web.module.f
        public final OnAnalyzeParamsListener a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "975ae07d35d73abd0c8a5cddf0038d21", RobustBitConfig.DEFAULT_VALUE) ? (OnAnalyzeParamsListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "975ae07d35d73abd0c8a5cddf0038d21") : new OnAnalyzeParamsListener() { // from class: com.sankuai.eh.component.web.modal.EHModalFragment.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.android.knb.listener.OnAnalyzeParamsListener
                public final String appendAnalyzeParams(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d645bdcbf60be756bf1b07ba8374e42", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d645bdcbf60be756bf1b07ba8374e42") : com.sankuai.eh.component.service.a.c().k() != null ? com.sankuai.eh.component.service.a.c().k().a(str) : str;
                }
            };
        }
    }
}
