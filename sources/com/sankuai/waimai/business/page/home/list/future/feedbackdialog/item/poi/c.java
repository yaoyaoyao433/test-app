package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.QuestionBean;
import com.sankuai.waimai.rocks.model.RocksServerModel;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c extends com.meituan.android.cube.pga.viewmodel.a<QuestionBean> {
    public static ChangeQuickRedirect o;
    public boolean p;
    public RocksServerModel q;
    public int r;

    public c(QuestionBean questionBean) {
        super(questionBean);
        Object[] objArr = {questionBean};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aa25a7bc7350c3a81d895e1ac415211", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aa25a7bc7350c3a81d895e1ac415211");
        }
    }
}
