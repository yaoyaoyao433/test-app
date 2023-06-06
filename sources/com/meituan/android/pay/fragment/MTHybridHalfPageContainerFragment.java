package com.meituan.android.pay.fragment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.android.neohybrid.core.config.DowngradeConfig;
import com.meituan.android.neohybrid.core.config.LoadingConfig;
import com.meituan.android.neohybrid.core.config.NSFConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MTHybridHalfPageContainerFragment extends HalfPageFragment {
    public static ChangeQuickRedirect a;
    private HalfPageWebViewContainerConfig f;
    private boolean g;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i, boolean z, String str);
    }

    @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment, com.meituan.android.neohybrid.container.NeoBaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cd0d9512b518e14067c1d1f002aa88f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cd0d9512b518e14067c1d1f002aa88f");
            return;
        }
        super.onCreate(bundle);
        this.g = bundle != null;
        this.f = n();
    }

    @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment, com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final boolean a(NeoConfig neoConfig) {
        Object[] objArr = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9faffa747e43bdc7869bd965440b5ce1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9faffa747e43bdc7869bd965440b5ce1")).booleanValue();
        }
        neoConfig.setNeoBridge(true);
        return super.a(neoConfig);
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1127c593e14b58d7b652e771c079209d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1127c593e14b58d7b652e771c079209d");
            return;
        }
        super.a(view);
        if (view != null) {
            view.setVisibility(4);
        }
    }

    private static Bundle b(HalfPageWebViewContainerConfig halfPageWebViewContainerConfig) {
        Object[] objArr = {halfPageWebViewContainerConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8c992fb86652143ef9a2169394a937d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8c992fb86652143ef9a2169394a937d");
        }
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(halfPageWebViewContainerConfig.e);
            jSONObject.put("stat_time", String.format("%d,%d,0", Long.valueOf(com.meituan.android.pay.utils.l.a()), Long.valueOf(System.currentTimeMillis())));
            a(bundle, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        bundle.putString(NeoConfig.NEO_SCENE, halfPageWebViewContainerConfig.c);
        bundle.putString(LoadingConfig.LOADING_DURATION, "12000");
        bundle.putString(LoadingConfig.LOADING_ENABLED, "1");
        bundle.putString(DowngradeConfig.LOADING_CANCEL_DOWNGRADE, halfPageWebViewContainerConfig.h ? "0" : "1");
        bundle.putString(DowngradeConfig.LOADING_TIMEOUT_DOWNGRADE, halfPageWebViewContainerConfig.h ? "0" : "1");
        if (com.meituan.android.paybase.utils.e.a()) {
            bundle.putString(UIConfig.BACKGROUND_COLOR, "#99000000");
        } else {
            bundle.putString(UIConfig.BACKGROUND_COLOR, "#00000000");
        }
        bundle.putString(UIConfig.MODAL, "1");
        bundle.putString("url", halfPageWebViewContainerConfig.d);
        bundle.putString("arg_target_scene", halfPageWebViewContainerConfig.c);
        bundle.putParcelable("arg_half_page_config", halfPageWebViewContainerConfig);
        return bundle;
    }

    @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment
    public final void b(NeoConfig neoConfig) {
        NSFConfig nSFConfig;
        Object[] objArr = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da63cf371ac002f7288c7f01dd038543", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da63cf371ac002f7288c7f01dd038543");
            return;
        }
        this.f = n();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94391eef0d21e223c0b77d092add8b62", RobustBitConfig.DEFAULT_VALUE)) {
            nSFConfig = (NSFConfig) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94391eef0d21e223c0b77d092add8b62");
        } else {
            nSFConfig = this.f != null ? this.f.f : null;
        }
        if (nSFConfig != null) {
            neoConfig.nsfConfig().setNsfParams(nSFConfig.getNsfParams());
            neoConfig.nsfConfig().setNsf(nSFConfig.getNsf());
        }
    }

    @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment, com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final boolean a(String str) {
        a o;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c05d89f59f108699d75224dba65ba29", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c05d89f59f108699d75224dba65ba29")).booleanValue();
        }
        super.d(str);
        com.meituan.android.paybase.utils.r.a(getActivity(), "com.meituan.android.pay.activity.MTProcessDialog.close.action");
        if (this.f != null && this.f.b > 0 && (o = o()) != null) {
            o.a(this.f.b, false, str);
        }
        return true;
    }

    private static void a(Bundle bundle, JSONObject jSONObject) {
        Object[] objArr = {bundle, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e486c7a9018aaf3b1662be4d22d5e6de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e486c7a9018aaf3b1662be4d22d5e6de");
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            String str = opt instanceof JSONObject ? "neo_json_data" : "neo_string_data";
            Bundle bundle2 = bundle.getBundle(str);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString(next, opt.toString());
            bundle.putBundle(str, bundle2);
        }
    }

    private HalfPageWebViewContainerConfig n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dae7f84d7021bee7c6d0277094c3656", RobustBitConfig.DEFAULT_VALUE)) {
            return (HalfPageWebViewContainerConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dae7f84d7021bee7c6d0277094c3656");
        }
        if (getArguments() != null) {
            return (HalfPageWebViewContainerConfig) getArguments().getParcelable("arg_half_page_config");
        }
        return null;
    }

    public static MTHybridHalfPageContainerFragment a(HalfPageWebViewContainerConfig halfPageWebViewContainerConfig) {
        Object[] objArr = {halfPageWebViewContainerConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00d088db8be61991ad850a5ba9fdd520", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTHybridHalfPageContainerFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00d088db8be61991ad850a5ba9fdd520");
        }
        MTHybridHalfPageContainerFragment mTHybridHalfPageContainerFragment = new MTHybridHalfPageContainerFragment();
        mTHybridHalfPageContainerFragment.setArguments(b(halfPageWebViewContainerConfig));
        return mTHybridHalfPageContainerFragment;
    }

    @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment, com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final void y_() {
        a o;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e9beff11aeab2f97adfd9a9d5557103", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e9beff11aeab2f97adfd9a9d5557103");
            return;
        }
        super.y_();
        if (!this.g) {
            com.meituan.android.paybase.utils.r.a(getActivity(), "com.meituan.android.cashier.mtpay.loadState.success");
        }
        com.meituan.android.paybase.utils.r.a(getActivity(), "com.meituan.android.pay.activity.MTProcessDialog.close.action");
        if (this.f == null || this.f.b <= 0 || (o = o()) == null) {
            return;
        }
        o.a(this.f.b, true, "");
    }

    @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment
    public final Map<String, Object> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6d86de9637f0309c2bac2540da13abd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6d86de9637f0309c2bac2540da13abd");
        }
        HashMap hashMap = new HashMap();
        if (this.f == null) {
            this.f = n();
        }
        if (this.f != null) {
            hashMap.put(HybridSignPayJSHandler.ARG_TRADE_NO, this.f.g);
        }
        return hashMap;
    }

    private a o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a7dbc04c62bfb9f51e4bfedab07a0fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a7dbc04c62bfb9f51e4bfedab07a0fb");
        }
        if (getTargetFragment() instanceof a) {
            return (a) getTargetFragment();
        }
        if (getParentFragment() instanceof a) {
            return (a) getParentFragment();
        }
        if (getActivity() instanceof a) {
            return (a) getActivity();
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class HalfPageWebViewContainerConfig implements Parcelable {
        public static final Parcelable.Creator<HalfPageWebViewContainerConfig> CREATOR = new Parcelable.Creator<HalfPageWebViewContainerConfig>() { // from class: com.meituan.android.pay.fragment.MTHybridHalfPageContainerFragment.HalfPageWebViewContainerConfig.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ HalfPageWebViewContainerConfig createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcb5a36b4a462beab2d21a247d75c7e5", RobustBitConfig.DEFAULT_VALUE) ? (HalfPageWebViewContainerConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcb5a36b4a462beab2d21a247d75c7e5") : new HalfPageWebViewContainerConfig(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ HalfPageWebViewContainerConfig[] newArray(int i) {
                return new HalfPageWebViewContainerConfig[i];
            }
        };
        public static ChangeQuickRedirect a;
        public int b;
        public String c;
        public String d;
        public String e;
        public NSFConfig f;
        public String g;
        public boolean h;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public HalfPageWebViewContainerConfig() {
        }

        public HalfPageWebViewContainerConfig(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93e2004720fb7ad4658b98c800f04789", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93e2004720fb7ad4658b98c800f04789");
                return;
            }
            this.b = parcel.readInt();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = (NSFConfig) parcel.readParcelable(NSFConfig.class.getClassLoader());
            this.g = parcel.readString();
            this.h = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b47bf859a79c72a81e39a09ac08ac5c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b47bf859a79c72a81e39a09ac08ac5c");
                return;
            }
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeParcelable(this.f, i);
            parcel.writeString(this.g);
            parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        }
    }

    public static boolean a(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "913d72928ca01804b6981fbae41dc469", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "913d72928ca01804b6981fbae41dc469")).booleanValue();
        }
        if (fragmentActivity == null) {
            return false;
        }
        return fragmentActivity.getSupportFragmentManager().findFragmentById(R.id.content) instanceof MTHybridHalfPageContainerFragment;
    }
}
