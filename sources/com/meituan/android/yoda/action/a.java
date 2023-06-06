package com.meituan.android.yoda.action;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.android.recce.props.gens.Editable;
import com.meituan.android.recce.props.gens.Opacity;
import com.meituan.android.yoda.fragment.BaseDialogFragment;
import com.meituan.android.yoda.fragment.BaseFragment;
import com.meituan.android.yoda.fragment.ConfirmListFragment;
import com.meituan.android.yoda.fragment.CustomerServicesFragment;
import com.meituan.android.yoda.fragment.FaceDetectionFragment;
import com.meituan.android.yoda.fragment.InfoErrorFragment;
import com.meituan.android.yoda.fragment.ThirdPartyVerifyFragment;
import com.meituan.android.yoda.fragment.VoicePrintVerifyFragment;
import com.meituan.android.yoda.fragment.YodaKNBDialogFragment;
import com.meituan.android.yoda.fragment.YodaKNBFragment;
import com.meituan.android.yoda.fragment.YodaWebViewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static d a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9064c05adc658806dca480890439e8c", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9064c05adc658806dca480890439e8c") : a(i, null);
    }

    public static d a(final int i, @Nullable Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4775dcfbc19bcd19b08bcd0473e8572", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4775dcfbc19bcd19b08bcd0473e8572");
        }
        switch (i) {
            case 1:
            case 71:
            case 103:
            case 130:
            case TbsListener.ErrorCode.STARTDOWNLOAD_4 /* 163 */:
                return new b(new com.meituan.android.yoda.interfaces.d<BaseDialogFragment>() { // from class: com.meituan.android.yoda.action.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final /* synthetic */ BaseDialogFragment c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e023602915b8f09d6d521a282d693ea7", RobustBitConfig.DEFAULT_VALUE) ? (BaseDialogFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e023602915b8f09d6d521a282d693ea7") : new YodaKNBDialogFragment();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final String a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05aa7c45438aa151e74e69c4508d1773", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05aa7c45438aa151e74e69c4508d1773") : YodaKNBDialogFragment.c();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final int b() {
                        return i;
                    }
                }, bundle);
            case 4:
            case 18:
            case 40:
            case 69:
            case 79:
            case Opacity.INDEX_ID /* 87 */:
            case 89:
            case Editable.INDEX_ID /* 97 */:
            case 100:
            case 110:
            case 111:
            case 9999:
                return new c(new com.meituan.android.yoda.interfaces.d<BaseFragment>() { // from class: com.meituan.android.yoda.action.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final /* synthetic */ BaseFragment c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "156b523073c83c4edcf8d323a572cb04", RobustBitConfig.DEFAULT_VALUE) ? (BaseFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "156b523073c83c4edcf8d323a572cb04") : new YodaKNBFragment();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final String a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "498b18a5ef74fac2a8ceae25ac69653c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "498b18a5ef74fac2a8ceae25ac69653c") : YodaKNBFragment.k();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final int b() {
                        return i;
                    }
                }, bundle);
            case 106:
                return new c(new com.meituan.android.yoda.interfaces.d<BaseFragment>() { // from class: com.meituan.android.yoda.action.a.6
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final int b() {
                        return 106;
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final /* synthetic */ BaseFragment c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3923fc4665d41aa107be9dd84749a9d7", RobustBitConfig.DEFAULT_VALUE) ? (BaseFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3923fc4665d41aa107be9dd84749a9d7") : new VoicePrintVerifyFragment();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final String a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f49e224cf5decf347ea0e457237938a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f49e224cf5decf347ea0e457237938a") : VoicePrintVerifyFragment.class.getSimpleName();
                    }
                });
            case 108:
            case 109:
                return new c(new com.meituan.android.yoda.interfaces.d<BaseFragment>() { // from class: com.meituan.android.yoda.action.a.5
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final /* synthetic */ BaseFragment c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7dd31c4a8f66bc7b88b034cd1d2c481", RobustBitConfig.DEFAULT_VALUE) ? (BaseFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7dd31c4a8f66bc7b88b034cd1d2c481") : new FaceDetectionFragment();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final String a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0dbaef17d01875cd80be5a2583b45dad", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0dbaef17d01875cd80be5a2583b45dad") : FaceDetectionFragment.class.getSimpleName();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final int b() {
                        return i;
                    }
                });
            case 122:
                return new c(new com.meituan.android.yoda.interfaces.d<BaseFragment>() { // from class: com.meituan.android.yoda.action.a.7
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final int b() {
                        return 122;
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final /* synthetic */ BaseFragment c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7599231f7e6cbcb0b2c126fa015844b0", RobustBitConfig.DEFAULT_VALUE) ? (BaseFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7599231f7e6cbcb0b2c126fa015844b0") : new ThirdPartyVerifyFragment();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final String a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d07a5a31d9deeb2a328b45ba5ab56da4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d07a5a31d9deeb2a328b45ba5ab56da4") : ThirdPartyVerifyFragment.class.getSimpleName();
                    }
                });
            case 143:
            case 144:
            case 145:
            case 146:
                return new c(new com.meituan.android.yoda.interfaces.d<BaseFragment>() { // from class: com.meituan.android.yoda.action.a.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final /* synthetic */ BaseFragment c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "801583cf550aa7ccc3c03f64e87ddd03", RobustBitConfig.DEFAULT_VALUE) ? (BaseFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "801583cf550aa7ccc3c03f64e87ddd03") : new YodaWebViewFragment();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final String a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c31053d6a1ac0125b77ad15f64079bd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c31053d6a1ac0125b77ad15f64079bd") : YodaWebViewFragment.class.getSimpleName();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final int b() {
                        return i;
                    }
                }, bundle);
            case 2147483642:
                return new c(new com.meituan.android.yoda.interfaces.d<BaseFragment>() { // from class: com.meituan.android.yoda.action.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final int b() {
                        return 2147483642;
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final /* synthetic */ BaseFragment c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1bc027003e5743d23e302c37bccc724", RobustBitConfig.DEFAULT_VALUE) ? (BaseFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1bc027003e5743d23e302c37bccc724") : new InfoErrorFragment();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final String a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1f386072d61ba2a4626f9ba2effa633", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1f386072d61ba2a4626f9ba2effa633") : InfoErrorFragment.class.getSimpleName();
                    }
                });
            case 2147483644:
                return new c(new com.meituan.android.yoda.interfaces.d<BaseFragment>() { // from class: com.meituan.android.yoda.action.a.8
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final int b() {
                        return 2147483644;
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final /* synthetic */ BaseFragment c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af1e28f566ab04359aee669181fe53c7", RobustBitConfig.DEFAULT_VALUE) ? (BaseFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af1e28f566ab04359aee669181fe53c7") : new YodaKNBFragment();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final String a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da908d76353bb5801cf674d9b85c39df", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da908d76353bb5801cf674d9b85c39df") : YodaKNBFragment.l();
                    }
                }, bundle);
            case 2147483646:
                return new c(new com.meituan.android.yoda.interfaces.d<BaseFragment>() { // from class: com.meituan.android.yoda.action.a.9
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final int b() {
                        return 2147483646;
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final /* synthetic */ BaseFragment c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "099519612bace111a6efa990335fd088", RobustBitConfig.DEFAULT_VALUE) ? (BaseFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "099519612bace111a6efa990335fd088") : new CustomerServicesFragment();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final String a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72fd12f57e727e11c188460a8df228df", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72fd12f57e727e11c188460a8df228df") : CustomerServicesFragment.class.getSimpleName();
                    }
                });
            case Integer.MAX_VALUE:
                return new c(new com.meituan.android.yoda.interfaces.d<BaseFragment>() { // from class: com.meituan.android.yoda.action.a.10
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final int b() {
                        return Integer.MAX_VALUE;
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final /* synthetic */ BaseFragment c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4c2e3ce55a21a0acc276e9f3a9260c0", RobustBitConfig.DEFAULT_VALUE) ? (BaseFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4c2e3ce55a21a0acc276e9f3a9260c0") : new ConfirmListFragment();
                    }

                    @Override // com.meituan.android.yoda.interfaces.d
                    public final String a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10f2e90d40c4b588ee41d3d91167648d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10f2e90d40c4b588ee41d3d91167648d") : ConfirmListFragment.class.getSimpleName();
                    }
                });
            default:
                com.meituan.android.yoda.monitor.log.a.a("ConfirmFactory", "getConfirmByType, exception: no match type.", true);
                return null;
        }
    }
}
