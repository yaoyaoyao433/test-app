package com.sankuai.waimai.store.drug.search.common.others;

import android.content.Context;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.store.search.ui.result.dynamictag.SGSearchTagInfo;
import com.sankuai.waimai.store.search.ui.result.dynamictag.b;
import com.sankuai.waimai.store.search.ui.result.dynamictag.d;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    protected Context b;
    private int c;
    private d d;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6133c7e2c7054b3702cff372f93980f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6133c7e2c7054b3702cff372f93980f");
            return;
        }
        this.c = 1;
        this.b = context;
    }

    public final void a(ViewGroup viewGroup, TagCanvasView tagCanvasView, List<SGSearchTagInfo> list) {
        Object[] objArr = {viewGroup, tagCanvasView, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88481464d33659b6462c60b9c2eb7666", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88481464d33659b6462c60b9c2eb7666");
        } else if (viewGroup == null || tagCanvasView == null) {
        } else {
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                viewGroup.setVisibility(8);
                return;
            }
            viewGroup.setVisibility(0);
            if (this.d == null) {
                this.d = new d(this.b, null);
                tagCanvasView.setAdapter(this.d);
            }
            tagCanvasView.setMaxLines(this.c);
            this.d.b(b.a(this.b, list));
            this.d.notifyChanged();
        }
    }
}
