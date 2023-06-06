package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi.c;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.QuestionBean;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.viewmodel.b {
    public static ChangeQuickRedirect p;
    List<com.meituan.android.cube.pga.viewmodel.a> q;
    long r;
    private boolean s;

    public b(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5b109af0738e755eee89b010419666d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5b109af0738e755eee89b010419666d");
        } else {
            this.s = true;
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.b
    public final RecyclerView.LayoutManager o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc56f4784b60efae365e95480286d049", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.LayoutManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc56f4784b60efae365e95480286d049") : new LinearLayoutManager(this.d);
    }

    @Override // com.meituan.android.cube.pga.viewmodel.b
    public final int n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9440e1301da05bf74b3c8cd73d51aa8e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9440e1301da05bf74b3c8cd73d51aa8e")).intValue();
        }
        if (this.q == null) {
            return 0;
        }
        return this.q.size();
    }

    @Override // com.meituan.android.cube.pga.viewmodel.b
    public final com.meituan.android.cube.pga.viewmodel.a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5283f2cb2f18d08563f0245aaf2f634e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5283f2cb2f18d08563f0245aaf2f634e");
        }
        if (d.a(this.q)) {
            return null;
        }
        return this.q.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<QuestionBean> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9e4bfeaa73eee6a07e9ea22c68d726c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9e4bfeaa73eee6a07e9ea22c68d726c");
            return;
        }
        this.q = new ArrayList();
        for (QuestionBean questionBean : list) {
            if (questionBean != null) {
                switch (questionBean.questionType) {
                    case 1:
                    case 2:
                        this.q.add(new com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.checkbox.b(questionBean));
                        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(questionBean.questionId);
                        a.a(questionBean, sb.toString());
                        continue;
                    case 4:
                        this.q.add(new com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.edit.a(questionBean));
                        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a2 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(questionBean.questionId);
                        a2.a(questionBean, sb2.toString());
                        continue;
                    case 5:
                        List<RocksServerModel> list2 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().d;
                        String str = questionBean.question_extra_poi_num;
                        if (!d.a(list2)) {
                            int i = 0;
                            for (int i2 = 0; i2 < list2.size(); i2++) {
                                RocksServerModel rocksServerModel = list2.get(i2);
                                if (rocksServerModel != null && (TextUtils.equals(rocksServerModel.templateId, "waimai_mach_usercenter_homepage_future_spu") || TextUtils.equals(rocksServerModel.templateId, "waimai_mach_usercenter_homepage_future_poi_style_1") || TextUtils.equals(rocksServerModel.moduleId, "poilist_poi_module") || TextUtils.equals(rocksServerModel.moduleId, "productlist_sku_module"))) {
                                    questionBean.poi_id = e(rocksServerModel.stringData);
                                    questionBean.spu_id = f(rocksServerModel.stringData);
                                    c cVar = new c(questionBean);
                                    cVar.q = rocksServerModel;
                                    if (this.s) {
                                        this.s = false;
                                        cVar.p = true;
                                    } else {
                                        cVar.p = false;
                                    }
                                    cVar.r = i;
                                    questionBean.index = i;
                                    this.q.add(cVar);
                                    com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a3 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(questionBean.questionId);
                                    sb3.append(i);
                                    a3.a(questionBean, sb3.toString());
                                    i++;
                                    try {
                                        if (i >= Integer.valueOf(str).intValue()) {
                                            break;
                                        }
                                    } catch (Exception unused) {
                                        continue;
                                    }
                                }
                            }
                            break;
                        } else {
                            continue;
                        }
                        break;
                }
            }
        }
    }

    private long e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e48ee79ae573f96f37a688008ff0e75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e48ee79ae573f96f37a688008ff0e75")).longValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                long optLong = jSONObject.optLong("wm_poi_id");
                if (optLong != 0) {
                    return optLong;
                }
                if (jSONObject.has("poi_info")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("poi_info");
                    if (optJSONObject.has("wm_poi_id")) {
                        return optJSONObject.optLong("wm_poi_id");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0L;
    }

    private long f(String str) {
        JSONObject optJSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3618c4f803485624cd769aef026012bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3618c4f803485624cd769aef026012bc")).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("product_info") && (optJSONObject = jSONObject.optJSONObject("product_info")) != null && optJSONObject.has("spu_id")) {
                return optJSONObject.optLong("spu_id");
            }
            return 0L;
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }
}
