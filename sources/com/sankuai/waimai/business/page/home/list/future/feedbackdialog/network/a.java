package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.QuestionnaireBeanResponse;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.SubmitQuestionBean;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.platform.b;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public String j;
    public int k;
    public String l;
    public com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a m;
    private boolean n;

    public a(String str, com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb6bf6b688111b3bbb677aee31a9a685", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb6bf6b688111b3bbb677aee31a9a685");
            return;
        }
        this.n = false;
        this.l = str;
        this.m = aVar;
    }

    public void a() {
        List list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "211d8abadf1ff6232c1343b3125fddbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "211d8abadf1ff6232c1343b3125fddbe");
            return;
        }
        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a2 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "146df8e73cdd58677a9374c2749c64b7", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "146df8e73cdd58677a9374c2749c64b7");
        } else if (a2.c == null || a2.c.isEmpty()) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str : a2.c.keySet()) {
                SubmitQuestionBean submitQuestionBean = a2.c.get(str);
                if (submitQuestionBean != null && !TextUtils.isEmpty(submitQuestionBean.answer)) {
                    submitQuestionBean.handleAnswerOtherValue(submitQuestionBean.poi_id, submitQuestionBean.spu_id);
                    submitQuestionBean.handleAnswerValue(submitQuestionBean, submitQuestionBean.answerToMap());
                    arrayList.add(submitQuestionBean);
                }
            }
            list = arrayList;
        }
        if (!d.a(list)) {
            this.c = new Gson().toJson(list);
        }
        if (this.n) {
            return;
        }
        WMLocation p = g.a().p();
        if (p != null) {
            try {
                this.h = String.valueOf((long) (p.getLatitude() * 1000000.0d));
                this.g = String.valueOf((long) (p.getLongitude() * 1000000.0d));
            } catch (NullPointerException unused) {
            }
        }
        this.i = 1;
        this.j = b.A().i();
        this.k = b.A().j();
        this.n = true;
    }

    public final void a(int i, long j, b.AbstractC1042b<QuestionnaireBeanResponse> abstractC1042b) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), abstractC1042b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "542d05358e20b7b0fd0c86073aa3d4cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "542d05358e20b7b0fd0c86073aa3d4cc");
            return;
        }
        QuestionnaireBeanResponse a2 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().a(j, i);
        if (a2 != null) {
            this.m.K.a((com.meituan.android.cube.pga.common.b<Void>) null);
            com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().b = true;
            abstractC1042b.onNext(a2);
            return;
        }
        this.m.J.a((com.meituan.android.cube.pga.common.b<Void>) null);
        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().b = false;
        String c = com.sankuai.waimai.platform.b.A().c();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((FeedBackApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FeedBackApi.class)).questionnaire(c, j, c), abstractC1042b, this.l);
    }
}
