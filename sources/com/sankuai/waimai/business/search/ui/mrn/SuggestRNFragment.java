package com.sankuai.waimai.business.search.ui.mrn;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.engine.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.sankuai.waimai.business.search.common.util.e;
import com.sankuai.waimai.business.search.common.util.i;
import com.sankuai.waimai.business.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.business.search.ui.mrn.a;
import com.sankuai.waimai.platform.capacity.log.c;
import io.agora.rtc.internal.RtcEngineEvent;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SuggestRNFragment extends BaseSearchMrnFragment {
    public static ChangeQuickRedirect g;
    public String h;
    public String i;
    public String j;

    public SuggestRNFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81b397a2f81cf82ac8b45030db537ff6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81b397a2f81cf82ac8b45030db537ff6");
            return;
        }
        this.i = "";
        this.j = "";
    }

    @Override // com.sankuai.waimai.business.search.ui.mrn.BaseSearchMrnFragment, com.sankuai.waimai.business.search.ui.mrn.WMMrnBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "890a42eacaa51cd17f8e3a65b5d7ba4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "890a42eacaa51cd17f8e3a65b5d7ba4c");
            return;
        }
        super.onCreate(bundle);
        c.a().a(RtcEngineEvent.EvtType.EVT_AUDIO_VOLUME_INDICATION, "mrn/ab/wm-search-suggest", SystemClock.elapsedRealtime());
        com.meituan.android.bus.a.a().a(this);
    }

    @Override // com.sankuai.waimai.business.search.ui.mrn.WMMrnBaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033b4593d9607220b062723694b9f29a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033b4593d9607220b062723694b9f29a");
            return;
        }
        k o = o();
        if (o != null) {
            n.a(o, "didRecivePromotionWords", e.a());
        }
    }

    @Override // com.sankuai.waimai.business.search.ui.mrn.WMMrnBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bd9597bc509afe36d596e866282bf7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bd9597bc509afe36d596e866282bf7d");
            return;
        }
        com.meituan.android.bus.a.a().b(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void showSuggest(a.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "226480769f13679669056df7dc04ae75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "226480769f13679669056df7dc04ae75");
        } else if (jVar != null && this.c.W.equals(jVar.a) && this.i.equals(jVar.b)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = g;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4f87c1eaf84dfc2819ec4336b7c1b69", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4f87c1eaf84dfc2819ec4336b7c1b69");
            } else {
                FragmentActivity activity = getActivity();
                if (activity instanceof GlobalSearchActivity) {
                    GlobalSearchActivity globalSearchActivity = (GlobalSearchActivity) activity;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = GlobalSearchActivity.a;
                    if (PatchProxy.isSupport(objArr3, globalSearchActivity, changeQuickRedirect3, false, "06480ea1b8e4f566691002d15a0171e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, globalSearchActivity, changeQuickRedirect3, false, "06480ea1b8e4f566691002d15a0171e9");
                    } else if (TextUtils.isEmpty(globalSearchActivity.h.b)) {
                        globalSearchActivity.f();
                    } else {
                        if (globalSearchActivity.e != null && !globalSearchActivity.e.isVisible()) {
                            globalSearchActivity.k.x();
                            FragmentTransaction beginTransaction = globalSearchActivity.c.beginTransaction();
                            beginTransaction.hide(globalSearchActivity.d);
                            beginTransaction.hide(globalSearchActivity.f);
                            beginTransaction.show(globalSearchActivity.e);
                            beginTransaction.commitAllowingStateLoss();
                            globalSearchActivity.b = 2;
                        }
                        if (globalSearchActivity.k != null) {
                            globalSearchActivity.k.i();
                            globalSearchActivity.k.j();
                        }
                        if (GlobalSearchActivity.i != null) {
                            GlobalSearchActivity.i.removeAllViews();
                            GlobalSearchActivity.i.setVisibility(8);
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(jVar.c)) {
                return;
            }
            this.j = jVar.c;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void clickSugPoi(a.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07f9e24bee24d2855833ac33c48fb80d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07f9e24bee24d2855833ac33c48fb80d");
        } else if (hVar == null || !this.c.W.equals(hVar.a) || this.b == null || this.b.isFinishing()) {
        } else {
            i.a(this.b, hVar.b, hVar.c, hVar.d, 202, 0L, hVar.e);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void clickSugQuery(a.i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d70e55b6d498bc10944413bea723c25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d70e55b6d498bc10944413bea723c25");
        } else if (iVar == null || !this.c.W.equals(iVar.a)) {
        } else {
            if (TextUtils.isEmpty(iVar.e)) {
                a(iVar.b, iVar.c, 3, iVar.d);
                if (iVar.d == 11002) {
                    a("11002");
                } else if (iVar.d == 11001) {
                    a("11001");
                }
            } else if (this.b == null || this.b.isFinishing()) {
            } else {
                this.b.a(iVar.b, 0L, false, (String) null);
                com.sankuai.waimai.foundation.router.a.a(this.b, iVar.e);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void clickSugBottom(a.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a327fcb023a30af62e0a233c9cc4e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a327fcb023a30af62e0a233c9cc4e7");
        } else if (gVar == null || !this.c.W.equals(gVar.a)) {
        } else {
            if (TextUtils.isEmpty(gVar.b)) {
                a("11002");
                a(this.c.b, 3, XPlayerConstants.FFP_MSG_RECEIVE_SEI_FRAME);
            } else if (this.b == null || this.b.isFinishing()) {
            } else {
                this.b.a(this.c.b, 0L, false, (String) null);
                com.sankuai.waimai.foundation.router.a.a(this.b, gVar.b);
            }
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final Uri m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfdfd81d9dd4f341ce4e369fdd83239d", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfdfd81d9dd4f341ce4e369fdd83239d") : new Uri.Builder().appendQueryParameter("mrn_biz", "waimai").appendQueryParameter("mrn_entry", "wm-search-suggest").appendQueryParameter("mrn_component", "wm-search-suggest").appendQueryParameter("entrance_id", String.valueOf(this.c.v)).appendQueryParameter("category_type", String.valueOf(this.c.w)).appendQueryParameter("sub_category_type", String.valueOf(this.c.x)).appendQueryParameter("uuid", this.c.W).appendQueryParameter("gaoda_id", String.valueOf(this.c.M)).appendQueryParameter("weien_id", String.valueOf(this.c.L)).appendQueryParameter("gaoda_param", String.valueOf(this.c.N)).appendQueryParameter("search_source", String.valueOf(this.c.K)).build();
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00196441ddf2a720e5cc0432a9f3abf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00196441ddf2a720e5cc0432a9f3abf6");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.i = str;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("keyword", str);
            writableNativeMap.putString("globalId", this.h);
            writableNativeMap.putString("uuid", this.c.W);
            n.a(o(), "didReceiveNewKeyword", writableNativeMap);
        }
    }

    public static SuggestRNFragment p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc6428c5f9e63433d41ba24fe380a688", RobustBitConfig.DEFAULT_VALUE) ? (SuggestRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc6428c5f9e63433d41ba24fe380a688") : new SuggestRNFragment();
    }
}
