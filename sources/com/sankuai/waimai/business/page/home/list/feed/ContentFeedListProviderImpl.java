package com.sankuai.waimai.business.page.home.list.feed;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.mtplayer.video.h;
import com.meituan.android.mtplayer.video.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.a;
import com.sankuai.waimai.business.page.homepage.bubble.b;
import com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ContentFeedListProviderImpl implements IContentFeedListProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public h getMediaPlayerManager(Fragment fragment) {
        return null;
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public l getPlayerType(Fragment fragment) {
        return null;
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public void onDestroy(Activity activity, Fragment fragment) {
        Object[] objArr = {activity, fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa22a00c5bee30b6705ba946fbe5be8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa22a00c5bee30b6705ba946fbe5be8b");
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public void onTabExpose(Activity activity, String str) {
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public Class getContentFeedListFragmentClass() {
        return ContentFeedRNFragment.class;
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public void onContentFeedFragmentCreate(Fragment fragment, int i) {
        Object[] objArr = {fragment, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e133e0cec932a3d6b43c48edaac1d75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e133e0cec932a3d6b43c48edaac1d75");
        } else {
            fragment.setArguments(createArguments("", "", "", i));
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public void reloadData(Fragment fragment, boolean z) {
        Object[] objArr = {fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8875abbb50c11c918626a65b678fe770", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8875abbb50c11c918626a65b678fe770");
        } else if (!(fragment instanceof ContentFeedRNFragment) || z) {
        } else {
            ((ContentFeedRNFragment) fragment).p();
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public void onTabClick(Fragment fragment, boolean z, Activity activity) {
        Object[] objArr = {fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0), activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d3984424f804fe58ce0b1239fe7078b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d3984424f804fe58ce0b1239fe7078b");
        } else if (fragment instanceof ContentFeedRNFragment) {
            ContentFeedRNFragment contentFeedRNFragment = (ContentFeedRNFragment) fragment;
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = ContentFeedRNFragment.a;
            if (PatchProxy.isSupport(objArr2, contentFeedRNFragment, changeQuickRedirect3, false, "7f33d205ab06fad28a10d18153d65a0e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, contentFeedRNFragment, changeQuickRedirect3, false, "7f33d205ab06fad28a10d18153d65a0e");
                return;
            }
            WritableMap createMap = Arguments.createMap();
            a aVar = b.a().c;
            if (aVar != null) {
                createMap.putString("content_param", aVar.g);
            }
            createMap.putBoolean("isCurrentTab", z);
            contentFeedRNFragment.a("onContentTabClickEvent", createMap);
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider
    public void onBubbleClicked(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "352d368cf0662f501ca96c00ae5ff03d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "352d368cf0662f501ca96c00ae5ff03d");
        } else if (fragment instanceof ContentFeedRNFragment) {
            ContentFeedRNFragment contentFeedRNFragment = (ContentFeedRNFragment) fragment;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = ContentFeedRNFragment.a;
            if (PatchProxy.isSupport(objArr2, contentFeedRNFragment, changeQuickRedirect3, false, "71248919519d46f51ebef503c55d89f6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, contentFeedRNFragment, changeQuickRedirect3, false, "71248919519d46f51ebef503c55d89f6");
                return;
            }
            WritableMap createMap = Arguments.createMap();
            a aVar = b.a().c;
            if (aVar != null) {
                createMap.putString("content_param", aVar.g);
            }
            contentFeedRNFragment.a("onBubbleClicked", createMap);
        }
    }

    private Bundle createArguments(String str, String str2, String str3, int i) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ff8ec27d469290b03540d34be711b43", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ff8ec27d469290b03540d34be711b43");
        }
        Bundle bundle = new Bundle();
        bundle.putString("ref_list_id", str);
        bundle.putString("preview_item_str", str2);
        bundle.putString("click_id", str3);
        bundle.putInt("page_scene", i);
        return bundle;
    }
}
