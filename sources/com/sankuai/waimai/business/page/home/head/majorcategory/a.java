package com.sankuai.waimai.business.page.home.head.majorcategory;

import android.arch.lifecycle.q;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.actionbar.HomeActionBarViewModel;
import com.sankuai.waimai.business.page.home.head.majorcategory.d;
import com.sankuai.waimai.business.page.home.helper.f;
import com.sankuai.waimai.business.page.home.model.NavigateItem;
import com.sankuai.waimai.business.page.home.preload.bean.RcmdNetBean;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.lottie.e;
import com.sankuai.waimai.platform.encrypt.Env;
import com.sankuai.waimai.platform.utils.k;
import com.sankuai.waimai.router.core.j;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends RecyclerView.a<d> {
    public static ChangeQuickRedirect a;
    List<NavigateItem> b;
    Context c;
    PageFragment d;
    int e;
    String f;
    boolean g;
    int h;
    int i;
    String j;
    int k;
    boolean l;
    private int m;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NotNull d dVar, int i) {
        String defaultName;
        final d dVar2 = dVar;
        Object[] objArr = {dVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e6b78fedf5867214f1249118016813", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e6b78fedf5867214f1249118016813");
            return;
        }
        boolean a2 = f.a(this.b, i);
        NavigateItem navigateItem = this.b.get(i);
        Object[] objArr2 = {navigateItem, Byte.valueOf(a2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar2, changeQuickRedirect2, false, "3adfdf9d3f8777de9a0eb26183c02db3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar2, changeQuickRedirect2, false, "3adfdf9d3f8777de9a0eb26183c02db3");
        } else if (navigateItem != null) {
            dVar2.a(navigateItem);
            Object[] objArr3 = {navigateItem};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "1e45536951105173ee884e7d9af0ef38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "1e45536951105173ee884e7d9af0ef38");
            } else {
                e.a().a(dVar2.g, String.valueOf(navigateItem.getCode()), null, "horn-lottie", new com.sankuai.waimai.lottie.c() { // from class: com.sankuai.waimai.business.page.home.head.majorcategory.d.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.lottie.c
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "04120530b03ccc21e2906bf51adc71ea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "04120530b03ccc21e2906bf51adc71ea");
                            return;
                        }
                        d.this.h.setVisibility(0);
                        d.this.g.setVisibility(8);
                    }

                    @Override // com.sankuai.waimai.lottie.c
                    public final void a(com.airbnb.lottie.e eVar) {
                        Object[] objArr4 = {eVar};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "488c9bb4c1fe039aa4c7c688e62bd263", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "488c9bb4c1fe039aa4c7c688e62bd263");
                            return;
                        }
                        d.this.h.setVisibility(8);
                        d.this.g.setVisibility(0);
                    }

                    @Override // com.sankuai.waimai.lottie.c
                    public final void b() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "543c59bac7b1d427e2bfc6e179163450", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "543c59bac7b1d427e2bfc6e179163450");
                            return;
                        }
                        d.this.h.setVisibility(0);
                        d.this.g.setVisibility(8);
                    }
                });
            }
            dVar2.a(navigateItem, a2);
            Object[] objArr4 = {navigateItem, Byte.valueOf(a2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect4 = d.a;
            if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "ff0f81f2ecef3c4b8395a9ab1895ab4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "ff0f81f2ecef3c4b8395a9ab1895ab4c");
            } else {
                if (!TextUtils.isEmpty(navigateItem.getName())) {
                    defaultName = navigateItem.getName();
                } else {
                    defaultName = navigateItem.getDefaultName();
                }
                dVar2.d.setText(defaultName);
                dVar2.d.setTextColor(dVar2.j);
                if (a2 && navigateItem.mBubble != null && !TextUtils.isEmpty(navigateItem.mBubble.e)) {
                    defaultName = defaultName + CommonConstant.Symbol.COMMA + navigateItem.mBubble.e;
                }
                dVar2.d.measure(0, 0);
                dVar2.k.setContentDescription(defaultName);
            }
        }
        dVar2.a(this.b.get(i), new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.head.majorcategory.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                Object[] objArr5 = {view};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "079db6d22c85bd29fdba90d61737334f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "079db6d22c85bd29fdba90d61737334f");
                    return;
                }
                int adapterPosition = dVar2.getAdapterPosition();
                if (adapterPosition == -1 || adapterPosition > a.this.b.size() - 1) {
                    return;
                }
                final NavigateItem navigateItem2 = a.this.b.get(adapterPosition);
                JudasManualManager.a a3 = JudasManualManager.a("b_DbEN0").a("c_m84bv26");
                a3.b = AppUtil.generatePageInfoKey(a.this.d);
                a3.a(RaptorConstants.JS_BATCH_NUM, String.valueOf(a.this.i)).a("cat_id", String.valueOf(navigateItem2.getCode())).a("switch_gray", String.valueOf(navigateItem2.getSwitchGray())).a("resource_id", String.valueOf(navigateItem2.getResourceId())).a("stid", a.this.f).a("index", adapterPosition + (a.this.h * a.this.k)).a(RaptorUploaderImpl.IS_CACHE, a.this.l ? 1 : 0).a();
                com.sankuai.waimai.business.page.home.preload.e.b("WaimaiHomePage", "Category", RcmdNetBean.SOURCE_FROM_MT_HOMEPAGE_PRE_REQUEST.equals(((HomePageViewModel) q.a(a.this.d).a(HomePageViewModel.class)).Q) ? 2 : 0, null);
                if (navigateItem2.getSwitchGray() > 0) {
                    ae.a(a.this.c, (int) R.string.wm_page_home_no_poi);
                    return;
                }
                final RecommendedSearchKeyword a4 = ((HomeActionBarViewModel) q.a(a.this.d).a(HomeActionBarViewModel.class)).h.a();
                if (a4 == null) {
                    a4 = new RecommendedSearchKeyword();
                    a4.type = -999;
                    a4.sceneType = "";
                    a4.searchKeyword = "";
                    a4.tgt_stids = "";
                    a4.viewKeyword = "";
                }
                int intValue = (dVar2.k.getTag() == null || !(dVar2.k.getTag() instanceof Integer)) ? 0 : ((Integer) dVar2.k.getTag()).intValue();
                String str2 = a.this.j;
                final Context context = a.this.c;
                Object[] objArr6 = {str2, context, navigateItem2, a4, Integer.valueOf(intValue)};
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.common.util.a.a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "2d3c13d2a9de5d8f5704607092af20e0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "2d3c13d2a9de5d8f5704607092af20e0");
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putInt("_wm_preload_page_id_overridable_", intValue);
                    if (navigateItem2 != null && navigateItem2.getCode() == 910) {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.page.home.preload.a.a;
                        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "31d6d95ec3fb83fa6b26e69f6007c851", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "31d6d95ec3fb83fa6b26e69f6007c851");
                        } else {
                            com.sankuai.waimai.platform.capacity.log.c.a().a(5000, "waimai_kingkong_ftr", SystemClock.elapsedRealtime());
                        }
                    }
                    if (TextUtils.isEmpty(navigateItem2.getSkipProtocol())) {
                        k.a("/poi/homepage", Statistics.getChannel().getSeq());
                        if (!TextUtils.isEmpty(navigateItem2.getDefaultUrlPrefix())) {
                            Uri.Builder buildUpon = Uri.parse(navigateItem2.getDefaultUrlPrefix()).buildUpon();
                            buildUpon.appendQueryParameter("categorytype", String.valueOf(navigateItem2.getCode()));
                            buildUpon.appendQueryParameter("navigate_type", String.valueOf(navigateItem2.getCode()));
                            buildUpon.appendQueryParameter("resource_id", String.valueOf(navigateItem2.getResourceId()));
                            if (!TextUtils.isEmpty(navigateItem2.getName())) {
                                buildUpon.appendQueryParameter("categorytext", navigateItem2.getName());
                            } else if (!TextUtils.isEmpty(navigateItem2.getDefaultName())) {
                                buildUpon.appendQueryParameter("categorytext", navigateItem2.getDefaultName());
                            }
                            com.sankuai.waimai.foundation.router.a.a(context, buildUpon.build().toString(), bundle);
                        } else {
                            ae.a(context, (int) R.string.wm_page_home_exception_need_refresh);
                        }
                    } else {
                        final String skipProtocol = navigateItem2.getSkipProtocol();
                        if (com.sankuai.waimai.foundation.router.a.a(skipProtocol)) {
                            if (!TextUtils.isEmpty(str2) && (skipProtocol.contains("/allCategory") || skipProtocol.contains("all-subcategory"))) {
                                switch (Env.a()) {
                                    case TEST:
                                        str = "http://i.c.waimai.test.sankuai.com";
                                        break;
                                    case STAGE:
                                        str = "https://i.waimai.st.meituan.com";
                                        break;
                                    default:
                                        str = "https://i.waimai.meituan.com";
                                        break;
                                }
                                com.sankuai.waimai.foundation.router.a.a(context, Uri.parse(str + "/c/all_category/index.html?el_biz=waimai&el_page=waimai_cfe_custom.all_category/index&notitlebar=1").toString(), "全部品类");
                            } else {
                                if (skipProtocol.contains("poifilter")) {
                                    k.a("/poi/homepage", Statistics.getChannel().getSeq());
                                }
                                com.sankuai.waimai.foundation.router.a.a().a(bundle).a(new com.sankuai.waimai.router.activity.d() { // from class: com.sankuai.waimai.business.page.common.util.a.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.router.activity.d
                                    public final boolean a(@NonNull j jVar, @NonNull Intent intent) throws ActivityNotFoundException, SecurityException {
                                        Object[] objArr8 = {jVar, intent};
                                        ChangeQuickRedirect changeQuickRedirect8 = a;
                                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "23e3f70d4fbf03d6f4cba0bdd431b59e", RobustBitConfig.DEFAULT_VALUE)) {
                                            return ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "23e3f70d4fbf03d6f4cba0bdd431b59e")).booleanValue();
                                        }
                                        intent.putExtra("navigatetext", navigateItem2.getName());
                                        if (skipProtocol.endsWith("/allCategory") || skipProtocol.contains("all-subcategory")) {
                                            intent.putExtra("recommended_search_keyword", com.sankuai.waimai.foundation.utils.k.a().toJson(a4));
                                        }
                                        context.startActivity(intent);
                                        return true;
                                    }
                                }).a(context, skipProtocol);
                            }
                        } else {
                            com.sankuai.waimai.foundation.router.a.a(context, Uri.parse(skipProtocol).toString(), context.getString(R.string.wm_page_home_activity_detail));
                        }
                    }
                }
                NavigateItem.a aVar = navigateItem2.mBubble;
                Object[] objArr8 = {aVar};
                ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.business.page.home.helper.a.a;
                if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "975df23fcff2c976e289615ebda39334", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "975df23fcff2c976e289615ebda39334");
                } else {
                    Map a5 = com.sankuai.waimai.business.page.home.helper.a.a();
                    if (a5 != null && aVar != null) {
                        aVar.m = com.meituan.android.time.c.b();
                        NavigateItem.a aVar2 = (NavigateItem.a) a5.get(aVar.d);
                        if (aVar2 != null) {
                            aVar2.m = com.meituan.android.time.c.b();
                            aVar2.l = false;
                        } else {
                            a5.put(aVar.d, aVar);
                        }
                        com.sankuai.waimai.business.page.home.helper.a.a(a5);
                    }
                }
                if (com.sankuai.waimai.foundation.utils.d.a(a.this.b)) {
                    return;
                }
                a.this.notifyItemRangeChanged(0, a.this.b.size());
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ d onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f96c56afa03b15bf391a7ad82aca71c", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f96c56afa03b15bf391a7ad82aca71c") : new d.a(LayoutInflater.from(this.c).inflate(R.layout.wm_page_main_home_head_major_category_item_new, viewGroup, false), this.c, this.e, i, this.m);
    }

    public a(boolean z, List<NavigateItem> list, Context context, int i, PageFragment pageFragment, int i2, String str, int i3, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list, context, Integer.valueOf(i), pageFragment, Integer.valueOf(i2), str, Integer.valueOf(i3), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44ef3163ffec8d6452e41414ed6217bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44ef3163ffec8d6452e41414ed6217bb");
            return;
        }
        this.b = list;
        this.c = context;
        this.e = i;
        this.d = pageFragment;
        this.f = str;
        this.m = i3;
        this.k = i2;
        this.g = z2;
        this.l = z;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44f6a27613c23b880236a6f14b1ff8bb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44f6a27613c23b880236a6f14b1ff8bb")).intValue() : (i > 4 || this.h > 0) ? this.g ? 4 : 2 : this.g ? 3 : 1;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0402776f0b51339c2d869d95af6899bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0402776f0b51339c2d869d95af6899bb")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.size();
    }
}
