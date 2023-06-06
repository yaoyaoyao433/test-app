package com.sankuai.waimai.store.feedback.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.whiteboard.e;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.b;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.feedback.logic.FeedbackLogic;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import com.sankuai.waimai.store.repository.model.ExposeSpuInfo;
import com.sankuai.waimai.store.repository.model.FeedbackData;
import com.sankuai.waimai.store.repository.model.FeedbackInfo;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    volatile boolean b;
    FeedbackData c;
    private List<Integer> d;
    private UserFeedbackView e;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76093c25ce598e0c18be865eb71c3382", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76093c25ce598e0c18be865eb71c3382");
        } else {
            this.b = false;
        }
    }

    private String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa0054d3ff3b3cefdd45a76e6346d20e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa0054d3ff3b3cefdd45a76e6346d20e") : getContext() instanceof SCBaseActivity ? ((SCBaseActivity) getContext()).w() : "";
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c64b866676a268f252cc7c7b0aa9b422", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c64b866676a268f252cc7c7b0aa9b422");
            return;
        }
        super.onViewCreated();
        this.e = (UserFeedbackView) findView(R.id.shop_content_feedback);
    }

    public final void a(@Nullable IMarketResponse iMarketResponse) {
        boolean z;
        Object[] objArr = {iMarketResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "840a0e975f42fbcc314fb49890fa863b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "840a0e975f42fbcc314fb49890fa863b");
        } else if (iMarketResponse != null) {
            Object[] objArr2 = {iMarketResponse};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6868d3696923cf4647512f9c46e35a72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6868d3696923cf4647512f9c46e35a72");
            } else {
                this.d = iMarketResponse.questionTypes();
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6c4425296102b1f2a11b7e46e710768c", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6c4425296102b1f2a11b7e46e710768c")).booleanValue();
            } else {
                z = com.sankuai.shangou.stone.util.a.a((Collection<?>) this.d) && this.d.contains(1);
            }
            if (z) {
                a(String.valueOf(iMarketResponse.getPoiId()), iMarketResponse.getStringPoiId(), true);
            }
        }
    }

    private FeedbackInfo a(List<FeedbackInfo> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7369fab878d9ee24d8822c9f71a6e93f", RobustBitConfig.DEFAULT_VALUE)) {
            return (FeedbackInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7369fab878d9ee24d8822c9f71a6e93f");
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

    void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ff21d92e4e3f7615ef2d2cf4cbc39c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ff21d92e4e3f7615ef2d2cf4cbc39c5");
        } else if (this.c == null || this.e == null) {
        } else {
            FeedbackInfo a2 = a(this.c.mFeedbackInfos, z ? 1 : 2);
            if (a2 != null) {
                this.e.a(a2);
                this.e.a(str, (String) null);
            }
        }
    }

    private void a(final String str, final String str2, final boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e06e2e198713943afe553379ddb0bb2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e06e2e198713943afe553379ddb0bb2c");
        } else if ((z || FeedbackLogic.a(this.mContext)) && !this.b) {
            if (this.c == null) {
                this.b = true;
                com.sankuai.waimai.store.base.net.sg.a.a((Object) a()).b(str, str2, "1", new j<FeedbackData>() { // from class: com.sankuai.waimai.store.feedback.view.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f8e7f14848bf1ef783fc5b55a5775ae", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f8e7f14848bf1ef783fc5b55a5775ae");
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(FeedbackData feedbackData) {
                        FeedbackData feedbackData2 = feedbackData;
                        Object[] objArr2 = {feedbackData2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86bade7604e6d950fb834b6d6cabcfa6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86bade7604e6d950fb834b6d6cabcfa6");
                            return;
                        }
                        a.this.c = feedbackData2;
                        String str3 = str2;
                        if (com.sankuai.waimai.store.platform.domain.manager.poi.a.e()) {
                            str3 = str;
                        }
                        a.this.a(str3, z);
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8204cf1b57f3ccf089a6dd06c43b91b4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8204cf1b57f3ccf089a6dd06c43b91b4");
                        } else {
                            a.this.b = false;
                        }
                    }
                });
                return;
            }
            a(str, z);
        }
    }

    public final void a(@NonNull e eVar, long j, String str, String str2) {
        Object[] objArr = {eVar, new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f5396878710e1e28fba4e6e54aebf47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f5396878710e1e28fba4e6e54aebf47");
            return;
        }
        ExposeSpuInfo exposeSpuInfo = (ExposeSpuInfo) eVar.a("expose_num", (Class<Object>) ExposeSpuInfo.class);
        if (exposeSpuInfo != null) {
            Set<Object> set = exposeSpuInfo.getSet();
            if (set.size() < 40) {
                set.add(Long.valueOf(j));
            } else if (!exposeSpuInfo.isShowFeed() && !exposeSpuInfo.isPurchased()) {
                boolean z = true;
                exposeSpuInfo.setShowFeed(true);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3d6ddba868f2d84914b8904cf068e72", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3d6ddba868f2d84914b8904cf068e72")).booleanValue();
                } else if (!com.sankuai.shangou.stone.util.a.a((Collection<?>) this.d) || !this.d.contains(2)) {
                    z = false;
                }
                if (z) {
                    a(str, str2, false);
                }
            }
            eVar.b("expose_num", (String) exposeSpuInfo);
            return;
        }
        eVar.b("expose_num", (String) new ExposeSpuInfo());
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a11ea69d30ed74554224ff039194d6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a11ea69d30ed74554224ff039194d6d");
        } else {
            super.onDestroy();
        }
    }
}
