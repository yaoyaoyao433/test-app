package com.sankuai.waimai.business.ugc.pickme;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.android.mtplayer.video.h;
import com.meituan.android.mtplayer.video.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider;
import com.sankuai.waimai.platform.preload.e;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ContentPageProviderImpl implements IContentFeedListProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isCurPickMeTab;
    private boolean isPreloaded;
    private String scheme;
    private boolean shouldLoadData;

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public h getMediaPlayerManager(Fragment fragment) {
        return null;
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public void onBubbleClicked(Fragment fragment) {
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public void onDestroy(Activity activity, Fragment fragment) {
        Object[] objArr = {activity, fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a51614283f3b83aef1dbf5c80313c962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a51614283f3b83aef1dbf5c80313c962");
        }
    }

    public ContentPageProviderImpl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9a3a8399c1d2ca1807831f8d4b94758", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9a3a8399c1d2ca1807831f8d4b94758");
            return;
        }
        this.shouldLoadData = false;
        this.isPreloaded = false;
        this.isCurPickMeTab = false;
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public Class getContentFeedListFragmentClass() {
        return PickMeMPFragment.class;
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public void onContentFeedFragmentCreate(Fragment fragment, int i) {
        Object[] objArr = {fragment, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3df752ce9c1d38ee0c9e8eb4d0dcbda1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3df752ce9c1d38ee0c9e8eb4d0dcbda1");
            return;
        }
        this.shouldLoadData = false;
        this.isPreloaded = false;
        if (fragment instanceof PickMeMPFragment) {
            ((PickMeMPFragment) fragment).b("EatWhat");
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public void reloadData(Fragment fragment, boolean z) {
        Object[] objArr = {fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "138d6aa8018de872a9cf9395bf5497aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "138d6aa8018de872a9cf9395bf5497aa");
        } else if (!(fragment instanceof PickMeMPFragment) || z) {
        } else {
            this.shouldLoadData = true;
            if (this.isCurPickMeTab) {
                this.shouldLoadData = false;
                ((PickMeMPFragment) fragment).k();
            }
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public void onTabClick(Fragment fragment, boolean z, Activity activity) {
        Object[] objArr = {fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0), activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f67241ba320e664d34856bd5bcbaea98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f67241ba320e664d34856bd5bcbaea98");
            return;
        }
        this.isCurPickMeTab = z;
        if (!this.isPreloaded) {
            this.isPreloaded = true;
            preloadData(activity, this.scheme);
        }
        if (fragment instanceof PickMeMPFragment) {
            PickMeMPFragment pickMeMPFragment = (PickMeMPFragment) fragment;
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = PickMeMPFragment.a;
            if (PatchProxy.isSupport(objArr2, pickMeMPFragment, changeQuickRedirect3, false, "0a6828d26f04f1cb99bbaa0f4ab4c208", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, pickMeMPFragment, changeQuickRedirect3, false, "0a6828d26f04f1cb99bbaa0f4ab4c208");
            } else {
                MachMap machMap = new MachMap();
                machMap.put("isPickMeTab", Boolean.valueOf(z));
                pickMeMPFragment.a("on_tab_click", machMap);
            }
            if (z) {
                if (this.shouldLoadData) {
                    this.shouldLoadData = false;
                    pickMeMPFragment.k();
                    return;
                }
                fragment.onResume();
                return;
            }
            fragment.onStop();
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public void onTabExpose(Activity activity, String str) {
        this.scheme = str;
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public l getPlayerType(Fragment fragment) {
        return l.TYPE_XPLAYER;
    }

    private void preloadData(Activity activity, String str) {
        Uri build;
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9fd5bb9b6e23c59b6213b353d9bbbcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9fd5bb9b6e23c59b6213b353d9bbbcd");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = com.sankuai.waimai.foundation.core.a.d() ? "meituanwaimai://waimai.meituan.com/pickme?source_id=EatWhat" : "imeituan://www.meituan.com/takeout/pickme?source_id=EatWhat";
        }
        j jVar = new j(activity, str);
        Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra", null);
        if (bundle == null) {
            bundle = new Bundle();
            jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle);
        }
        String b = f.b(activity.getIntent(), "source_id", "source_id");
        if (TextUtils.isEmpty(b)) {
            b = jVar.d.getQueryParameter("source_id");
        }
        if (TextUtils.isEmpty(b)) {
            b = "EatWhat";
        }
        bundle.putString("source_id", b);
        bundle.putLong("routerStartTime", System.currentTimeMillis());
        if (str.contains("source_id")) {
            build = Uri.parse(str.replaceAll("&?source_id=[^&]*", "source_id=" + b));
        } else {
            build = jVar.d.buildUpon().appendQueryParameter("source_id", b).build();
        }
        jVar.a(build);
        e.a().a(jVar);
        if (activity != null) {
            activity.getIntent().putExtras(bundle);
        }
    }
}
