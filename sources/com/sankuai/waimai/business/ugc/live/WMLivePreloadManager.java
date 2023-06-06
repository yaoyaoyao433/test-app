package com.sankuai.waimai.business.ugc.live;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.dianping.live.card.a;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.ugc.live.a;
import com.sankuai.waimai.business.ugc.live.utils.d;
import com.sankuai.waimai.platform.domain.manager.ugc.IWMLivePreloadManager;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMLivePreloadManager implements a.b, IWMLivePreloadManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a mLivePlayerCardView;

    @Override // com.sankuai.waimai.business.ugc.live.a.b
    public void onClicked() {
    }

    @Override // com.sankuai.waimai.business.ugc.live.a.b
    public void onGoodsChanged(int i, long j) {
    }

    @Override // com.sankuai.waimai.business.ugc.live.a.b
    public void onPlayException(int i, Bundle bundle) {
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IWMLivePreloadManager
    public void preload(Context context, Map<String, String> map) {
        Object[] objArr = {context, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6cf1b9319ba2f05b9eca9cad0ed805b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6cf1b9319ba2f05b9eca9cad0ed805b");
        } else if (context == null || map == null) {
        } else {
            String str = map.get(IWMLivePreloadManager.PARAM_BIZ);
            String str2 = map.get(IWMLivePreloadManager.PARAM_LIVE_ID);
            String str3 = map.get(IWMLivePreloadManager.PARAM_SRC);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            d.a(d.d + LaunchMode.LAUNCH_MODE_PRELOAD);
            this.mLivePlayerCardView = b.a().a(context, str3);
            this.mLivePlayerCardView.a(this);
            a.d dVar = new a.d();
            dVar.a = str;
            dVar.b = str2;
            dVar.c = str3;
            dVar.f = true;
            this.mLivePlayerCardView.a(dVar);
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.ugc.IWMLivePreloadManager
    public void cancelPreload(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d6ff4bc863950abd18b029e4ad7dfea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d6ff4bc863950abd18b029e4ad7dfea");
            return;
        }
        String str = map.get(IWMLivePreloadManager.PARAM_SRC);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d.a(d.d + "cancelPreload");
        a a = b.a().a(str);
        if (a != null) {
            a.d();
            a.f();
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.a.b
    public void onPlaySuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cf5fe3ea307b5caf97681886186aae2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cf5fe3ea307b5caf97681886186aae2");
            return;
        }
        d.a(d.d + "onPlaySuccess");
        if (this.mLivePlayerCardView != null) {
            this.mLivePlayerCardView.d();
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.a.b
    public void onPlayFail(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20db42950e04179316271e1f7d8b80f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20db42950e04179316271e1f7d8b80f9");
            return;
        }
        d.a(d.d + "onPlayFail");
    }

    @Override // com.sankuai.waimai.business.ugc.live.a.b
    public void onPlayEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "288971e40d36dc4998e4d028a64b396d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "288971e40d36dc4998e4d028a64b396d");
            return;
        }
        d.a(d.d + "onPlayEnd");
    }
}
