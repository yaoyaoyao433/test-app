package com.sankuai.waimai.business.page.mine;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.util.LongSparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.mrn.engine.n;
import com.meituan.android.recce.props.gens.IsShow;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.mine.module.RN_MineLogicModule;
import com.sankuai.waimai.business.page.mine.module.WMRNBaseFragment;
import com.sankuai.waimai.business.page.mine.module.a;
import com.sankuai.waimai.business.page.mine.module.b;
import com.sankuai.waimai.business.page.mine.module.c;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.utils.LocationUtils;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.imbase.d;
import com.sankuai.waimai.imbase.manager.e;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.domain.manager.home.TabLoadManager;
import io.agora.rtc.internal.RtcEngineEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MineRNFagment extends WMRNBaseFragment implements b, com.sankuai.waimai.foundation.core.service.user.b, d {
    public static ChangeQuickRedirect a;
    private boolean k;
    private final a l;
    private long m;

    public MineRNFagment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abd812652e8a811e4edc4b59a665b8fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abd812652e8a811e4edc4b59a665b8fc");
            return;
        }
        this.k = true;
        this.l = new a();
    }

    public static MineRNFagment a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a52e0c7068684cf9eaef6bff8f559837", RobustBitConfig.DEFAULT_VALUE)) {
            return (MineRNFagment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a52e0c7068684cf9eaef6bff8f559837");
        }
        Bundle bundle = new Bundle();
        MineRNFagment mineRNFagment = new MineRNFagment();
        bundle.putString("mrn_biz", str);
        bundle.putString("mrn_entry", str2);
        bundle.putString("mrn_component", str3);
        mineRNFagment.setArguments(bundle);
        return mineRNFagment;
    }

    @Override // com.sankuai.waimai.business.page.mine.module.WMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6440624eb7fc0c45be0e7e3244a2b937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6440624eb7fc0c45be0e7e3244a2b937");
            return;
        }
        this.m = System.currentTimeMillis();
        super.onCreate(bundle);
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(this);
        e.a().a(this);
        c a2 = c.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "54ffb6a0d0dfe7310aa23160780dc8f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "54ffb6a0d0dfe7310aa23160780dc8f7");
        } else {
            if (a2.b == null) {
                a2.b = new HashSet();
            }
            a2.b.add(this);
        }
        com.sankuai.waimai.platform.capacity.log.c.a().a(RtcEngineEvent.EvtType.EVT_AUDIO_VOLUME_INDICATION, "mrn/ab/wmminepage", SystemClock.elapsedRealtime());
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4d2aeac0039040defbd4d821225884e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4d2aeac0039040defbd4d821225884e");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (com.sankuai.waimai.platform.capacity.immersed.a.a(((WMRNBaseFragment) this).c)) {
            onCreateView.setPadding(0, g.e(com.meituan.android.singleton.b.a), 0, 0);
            onCreateView.setBackgroundColor(Color.parseColor("#ffffff"));
        }
        return onCreateView;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void e() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd2788f1e435664971da215f65e1683f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd2788f1e435664971da215f65e1683f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "839942a2a895274d12398f999d01ff27", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "839942a2a895274d12398f999d01ff27");
        } else {
            str = !p.a(com.meituan.android.singleton.b.a) ? "(N_10000)" : "(M_10011)";
        }
        this.i = str;
        if (this.j != null) {
            this.j.setText(this.i);
        }
        i.d(new com.sankuai.waimai.business.page.home.log.a().a("mine Fragment").b(this.i).c("我的页面加载失败").d(this.i).b(true).b());
        super.e();
    }

    @Override // com.sankuai.waimai.business.page.mine.module.b
    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72e1879c6027c663acadb15e4e2ae0fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72e1879c6027c663acadb15e4e2ae0fd");
            return;
        }
        TabLoadManager.a().a(4, false);
        b(-1);
    }

    @Override // com.sankuai.waimai.business.page.mine.module.WMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb9541bf594c5fa65871bf46a7259d69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb9541bf594c5fa65871bf46a7259d69");
            return;
        }
        super.onResume();
        if (((WMRNBaseFragment) this).h) {
            q();
        }
    }

    @Override // com.sankuai.waimai.business.page.mine.module.WMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c634632df85cf0324d7ac033ca7ac0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c634632df85cf0324d7ac033ca7ac0a");
            return;
        }
        super.onPause();
        if (((WMRNBaseFragment) this).h) {
            r();
        }
    }

    @Override // com.sankuai.waimai.business.page.mine.module.WMRNBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ac33c470a65011072125b7289eb41a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ac33c470a65011072125b7289eb41a");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().b(this);
        e.a().b(this);
        c a2 = c.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "195bd117a1270c5f879d609bc859e295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "195bd117a1270c5f879d609bc859e295");
        } else if (a2.b != null) {
            a2.b.remove(this);
        }
        super.onDestroy();
        p();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final List<com.facebook.react.i> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df8e78f1a7f121520636de428775fd82", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df8e78f1a7f121520636de428775fd82");
        }
        List<com.facebook.react.i> d = super.d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.facebook.react.i() { // from class: com.sankuai.waimai.business.page.mine.MineRNFagment.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.i
            public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6726f6e0af1a6afdb490f35a9027fa2", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6726f6e0af1a6afdb490f35a9027fa2");
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new RN_MineLogicModule(reactApplicationContext, MineRNFagment.this.m));
                return arrayList2;
            }

            @Override // com.facebook.react.i
            public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8dac88729a75da693043e0d3ed281209", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8dac88729a75da693043e0d3ed281209") : Collections.emptyList();
            }
        });
        if (d != null) {
            arrayList.addAll(d);
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.business.page.mine.module.WMRNBaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aa5f2a53d799bd07c192e6e7a53c730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aa5f2a53d799bd07c192e6e7a53c730");
            return;
        }
        super.a(z);
        if (z) {
            double[] e = com.sankuai.waimai.foundation.location.g.e();
            LocationUtils.TransformData a2 = e != null ? LocationUtils.a(Double.valueOf(e[1]).doubleValue(), Double.valueOf(e[0]).doubleValue()) : null;
            if (a2 == null) {
                a2 = LocationUtils.a(0.0d, 0.0d);
            }
            JudasManualManager.b("c_ul2elkn", this).a("ji", a2.ji).a("jf", a2.jf).a("wi", a2.wi).a("wf", a2.wf).a(Constants.Environment.KEY_PUSHID, com.sankuai.waimai.platform.b.A().t()).b();
            if (this.k) {
                this.k = false;
                return;
            } else {
                a(1);
                return;
            }
        }
        p();
    }

    @Override // com.sankuai.waimai.business.page.mine.module.WMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d671c2ab969d1ccfb8bc7202176d9315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d671c2ab969d1ccfb8bc7202176d9315");
            return;
        }
        super.onHiddenChanged(z);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab098082089ae9a4a7a4fcc9f28c4482", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab098082089ae9a4a7a4fcc9f28c4482");
        } else if (getContext().getResources().getBoolean(R.bool.wm_is_mt_flavor)) {
        } else {
            if (!z) {
                q();
            } else {
                r();
            }
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final Uri m() {
        String str;
        String str2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaf215ee222aa61d19b89f87d837b377", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaf215ee222aa61d19b89f87d837b377");
        }
        String str3 = null;
        if (getArguments() != null) {
            str3 = getArguments().getString("mrn_biz");
            str = getArguments().getString("mrn_entry");
            str2 = getArguments().getString("mrn_component");
        } else {
            str = null;
            str2 = null;
        }
        return new Uri.Builder().appendQueryParameter("mrn_biz", str3).appendQueryParameter("mrn_entry", str).appendQueryParameter("mrn_component", str2).build();
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eac6493ef86099bf766df026b7ebf2de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eac6493ef86099bf766df026b7ebf2de");
            return;
        }
        b(aVar == b.a.LOGIN ? 0 : 1);
        if (aVar != b.a.CANCEL) {
            a(2);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2233d17c25839228d43cd0a89ca1108d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2233d17c25839228d43cd0a89ca1108d");
            return;
        }
        b(-1);
        a(2);
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3817cde13c4d3950db67e9a85d9a1374", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3817cde13c4d3950db67e9a85d9a1374");
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("intent", i);
        n.a(o(), "setNeedsRequestData", writableNativeMap);
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19ccb969376dc0b16c8610699bab1133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19ccb969376dc0b16c8610699bab1133");
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        User b = com.sankuai.waimai.platform.domain.manager.user.a.i().b();
        if (b != null) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString("avatarurl", b.avatarurl);
            writableNativeMap2.putString("username", b.username);
            writableNativeMap.putMap("user", (WritableMap) writableNativeMap2);
        }
        writableNativeMap.putInt("status", i);
        n.a(o(), "onUserInfoUpdate", writableNativeMap);
    }

    @Override // com.sankuai.waimai.imbase.d
    public void updateUnReadCount(@NonNull LongSparseArray<Integer> longSparseArray) {
        Object[] objArr = {longSparseArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bbd00f9d85da4d1571c9cd72a804021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bbd00f9d85da4d1571c9cd72a804021");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        com.sankuai.waimai.business.page.mine.module.d.a((ReactContext) null, o(), activity, com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "message_center_switch", true), this.l.c().d);
    }

    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4797a9ad2f94e0bf9050d8477b191a5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4797a9ad2f94e0bf9050d8477b191a5f");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cs_floating_status_action");
        intent.putExtra(IsShow.LOWER_CASE_NAME, true);
        intent.putExtra("type", "im");
        LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3262a82ed68fd1b46b011dc33c1b1e96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3262a82ed68fd1b46b011dc33c1b1e96");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cs_floating_status_action");
        intent.putExtra(IsShow.LOWER_CASE_NAME, false);
        intent.putExtra("type", "im");
        LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
    }
}
