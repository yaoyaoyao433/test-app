package com.sankuai.waimai.store.im.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.poi.block.e;
import com.sankuai.waimai.store.im.poi.model.SGIMRobotReplyData;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class i extends h {
    public static ChangeQuickRedirect g;
    protected com.sankuai.waimai.store.im.poi.block.e h;
    private boolean i;

    public i(@NonNull Context context, String str, @NonNull com.sankuai.waimai.store.expose.v2.a aVar) {
        super(context, aVar);
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "455b549ed8c36a1acae2faaa51afeebf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "455b549ed8c36a1acae2faaa51afeebf");
            return;
        }
        this.b = aVar;
        this.h = new com.sankuai.waimai.store.im.poi.block.e(context, aVar);
        this.h.f = str;
    }

    public final void a(e.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd476b54fb881a42f518ef2188ffe286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd476b54fb881a42f518ef2188ffe286");
            return;
        }
        this.i = true;
        this.h.h = aVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "077c6fac9420fd1fac47704dab5c495e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "077c6fac9420fd1fac47704dab5c495e");
        } else {
            super.onViewCreated();
        }
    }

    public final void a(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "346b81ee955a93ddde84cd198bbb802f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "346b81ee955a93ddde84cd198bbb802f");
        } else if (this.h != null) {
            SGIMRobotReplyData sGIMRobotReplyData = new SGIMRobotReplyData();
            sGIMRobotReplyData.msgId = j2;
            sGIMRobotReplyData.mPoiId = j;
            sGIMRobotReplyData.robotPraiseOperation = i;
            this.h.a(sGIMRobotReplyData);
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe8857f67d37557a7431727bfbdb6cf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe8857f67d37557a7431727bfbdb6cf0");
        } else if (this.h != null) {
            this.h.bindView(view);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa184987b2ad01f449d97bc32582045b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa184987b2ad01f449d97bc32582045b");
        } else if (this.h != null) {
            this.h.setVisible(false);
        }
    }
}
