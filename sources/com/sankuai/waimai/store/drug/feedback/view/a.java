package com.sankuai.waimai.store.drug.feedback.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.whiteboard.e;
import com.sankuai.waimai.store.base.b;
import com.sankuai.waimai.store.drug.feedback.logic.FeedbackLogic;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import com.sankuai.waimai.store.repository.model.ExposeSpuInfo;
import com.sankuai.waimai.store.repository.model.FeedbackInfo;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    private UserFeedbackView b;
    private FeedbackInfo c;
    private FeedbackInfo d;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6db397c891e5442d4cd786b82b5d8c28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6db397c891e5442d4cd786b82b5d8c28");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "162e574bc1a95bf59730eff648d12e67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "162e574bc1a95bf59730eff648d12e67");
            return;
        }
        super.onViewCreated();
        this.b = (UserFeedbackView) findView(R.id.shop_content_feedback);
    }

    public final void a(IMarketResponse iMarketResponse) {
        Object[] objArr = {iMarketResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b130ee97c1173d5aa2d3312821b924a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b130ee97c1173d5aa2d3312821b924a");
        } else if (iMarketResponse == null || !(iMarketResponse instanceof RestMenuResponse)) {
        } else {
            List<FeedbackInfo> list = ((RestMenuResponse) iMarketResponse).mFeedbackInfos;
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                return;
            }
            this.c = a(list, 2);
            this.d = a(list, 1);
            a(iMarketResponse.getOfficialPoiId(), true);
        }
    }

    private FeedbackInfo a(List<FeedbackInfo> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aadac315ea5ee453b9d79ef9a4d6f01", RobustBitConfig.DEFAULT_VALUE)) {
            return (FeedbackInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aadac315ea5ee453b9d79ef9a4d6f01");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        for (FeedbackInfo feedbackInfo : list) {
            if (feedbackInfo != null && feedbackInfo.type == i) {
                return feedbackInfo;
            }
        }
        return null;
    }

    private void a(String str, boolean z) {
        FeedbackInfo feedbackInfo;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c4943c9ec9626330c3d4f66b49bdb49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c4943c9ec9626330c3d4f66b49bdb49");
            return;
        }
        if (z) {
            feedbackInfo = this.d;
        } else if (this.c != null && FeedbackLogic.a(this.mContext)) {
            feedbackInfo = this.c;
        } else {
            feedbackInfo = this.d != null ? this.d : null;
        }
        if (feedbackInfo != null) {
            this.b.a(feedbackInfo);
            this.b.a(str, (String) null);
        }
    }

    public final void a(@NonNull e eVar, long j, String str) {
        Object[] objArr = {eVar, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29c91f39056fbb97aa9c7b08b7c9713e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29c91f39056fbb97aa9c7b08b7c9713e");
        } else if (this.c == null) {
        } else {
            ExposeSpuInfo exposeSpuInfo = (ExposeSpuInfo) eVar.a("expose_num", (Class<Object>) ExposeSpuInfo.class);
            if (exposeSpuInfo != null) {
                Set<Object> set = exposeSpuInfo.getSet();
                if (set.size() < 40) {
                    set.add(Long.valueOf(j));
                } else if (!exposeSpuInfo.isShowFeed() && !exposeSpuInfo.isPurchased()) {
                    a(str, false);
                    exposeSpuInfo.setShowFeed(true);
                }
                eVar.b("expose_num", (String) exposeSpuInfo);
                return;
            }
            eVar.b("expose_num", (String) new ExposeSpuInfo());
        }
    }
}
