package com.dianping.picasso;

import android.util.SparseArray;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.picasso.model.ChildVCPicassoModel;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.model.PicassoUnarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoModelHelper {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static SparseArray<PicassoModel> getChildVCPModelMap(Value value) {
        ChildVCPicassoModel[] childVCPicassoModelArr;
        Object[] objArr = {value};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d9478d94716b4197c8f0439dae4e05ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (SparseArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d9478d94716b4197c8f0439dae4e05ac");
        }
        try {
            childVCPicassoModelArr = (ChildVCPicassoModel[]) new PicassoUnarchived(value.getUnarchived().rawData()).readArray(ChildVCPicassoModel.PICASSO_DECODER);
        } catch (ArchiveException e) {
            e.printStackTrace();
            childVCPicassoModelArr = null;
        }
        SparseArray<PicassoModel> sparseArray = new SparseArray<>();
        if (childVCPicassoModelArr != null) {
            for (ChildVCPicassoModel childVCPicassoModel : childVCPicassoModelArr) {
                sparseArray.put(childVCPicassoModel.vcId, childVCPicassoModel.info);
            }
        }
        return sparseArray;
    }
}
