package com.dianping.picasso.model.params;

import com.dianping.picasso.model.ListModel;
import com.dianping.picasso.model.PicassoModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ListViewParams extends PicassoModelParams<ListModel> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int itemCount;

    @Override // com.dianping.picasso.model.params.PicassoModelParams
    public void switchModel(ListModel listModel) {
        Object[] objArr = {listModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e45faefc187c0f9ec457909f061036e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e45faefc187c0f9ec457909f061036e5");
            return;
        }
        super.switchModel((ListViewParams) listModel);
        if (listModel.sectionHeaders != null) {
            for (PicassoModel picassoModel : listModel.sectionHeaders) {
                if (!picassoModel.isNull()) {
                    this.itemCount++;
                }
            }
        }
        if (listModel.items != null) {
            Iterator<ArrayList<PicassoModel>> it = listModel.items.iterator();
            while (it.hasNext()) {
                ArrayList<PicassoModel> next = it.next();
                if (next != null) {
                    Iterator<PicassoModel> it2 = next.iterator();
                    while (it2.hasNext()) {
                        if (!it2.next().isNull()) {
                            this.itemCount++;
                        }
                    }
                }
            }
        }
    }
}
