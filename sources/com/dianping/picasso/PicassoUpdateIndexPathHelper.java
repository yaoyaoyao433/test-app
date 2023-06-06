package com.dianping.picasso;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.v;
import com.dianping.picasso.model.IndexPathModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class PicassoUpdateIndexPathHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String INSERT_ACTION;
    private final String RELOAD_ACTION;
    private final String REMOVE_ACTION;
    private RecyclerView recyclerView;
    private String updateAction;
    private IndexPathModel[] updateIndexPathModels;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface onUpdateListener {
        void onUpdate(boolean z);
    }

    private boolean isValidUpdateIndex(int i, int i2) {
        return i >= 0 && i < i2;
    }

    public abstract int getItemCount();

    public abstract int indexPathToPosition(int i, int i2);

    public PicassoUpdateIndexPathHelper(@NonNull RecyclerView recyclerView, String str, IndexPathModel[] indexPathModelArr) {
        Object[] objArr = {recyclerView, str, indexPathModelArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed88d28e56708bda0cc2802f99f6c736", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed88d28e56708bda0cc2802f99f6c736");
            return;
        }
        this.INSERT_ACTION = "insert";
        this.REMOVE_ACTION = "remove";
        this.RELOAD_ACTION = "reload";
        this.recyclerView = recyclerView;
        this.updateAction = str;
        this.updateIndexPathModels = indexPathModelArr;
    }

    public void postUpdateItems() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24a0c9a744d99cb405539cda94a44ef2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24a0c9a744d99cb405539cda94a44ef2");
        } else {
            postUpdateItems(null);
        }
    }

    public void postUpdateItems(final onUpdateListener onupdatelistener) {
        Object[] objArr = {onupdatelistener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90721a75eddde754323e9a3f024f8d6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90721a75eddde754323e9a3f024f8d6a");
        } else {
            this.recyclerView.post(new Runnable() { // from class: com.dianping.picasso.PicassoUpdateIndexPathHelper.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5f03dfc45e5f94ea4873bb98ac04a396", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5f03dfc45e5f94ea4873bb98ac04a396");
                        return;
                    }
                    boolean updateItems = PicassoUpdateIndexPathHelper.this.updateItems();
                    if (onupdatelistener != null) {
                        onupdatelistener.onUpdate(updateItems);
                    }
                }
            });
        }
    }

    public boolean updateItems() {
        IndexPathModel[] indexPathModelArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c31b247e5410a0486014c423c1d0ea3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c31b247e5410a0486014c423c1d0ea3")).booleanValue();
        }
        final RecyclerView.a adapter = this.recyclerView.getAdapter();
        if (adapter == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int itemCount = getItemCount();
        for (IndexPathModel indexPathModel : this.updateIndexPathModels) {
            if (indexPathModel != null) {
                indexPathModel.sectionIndex = Integer.valueOf(indexPathModel.sectionIndex == null ? 0 : indexPathModel.sectionIndex.intValue());
                indexPathModel.itemIndex = Integer.valueOf(indexPathModel.itemIndex == null ? 0 : indexPathModel.itemIndex.intValue());
                int indexPathToPosition = indexPathToPosition(indexPathModel.sectionIndex.intValue(), indexPathModel.itemIndex.intValue());
                if (!isValidUpdateIndex(indexPathToPosition, itemCount)) {
                    return false;
                }
                arrayList.add(Integer.valueOf(indexPathToPosition));
            }
        }
        this.recyclerView.setItemAnimator(new v() { // from class: com.dianping.picasso.PicassoUpdateIndexPathHelper.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.support.v7.widget.aq
            public void onChangeFinished(RecyclerView.s sVar, boolean z) {
                Object[] objArr2 = {sVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3c1c74a13861c10edbe356f0b92eb9ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3c1c74a13861c10edbe356f0b92eb9ca");
                    return;
                }
                super.onChangeFinished(sVar, z);
                adapter.notifyDataSetChanged();
            }
        });
        if ("insert".equals(this.updateAction) || "remove".equals(this.updateAction)) {
            Collections.sort(arrayList, Collections.reverseOrder());
            ((v) this.recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            int intValue = ((Integer) arrayList.get(i)).intValue();
            if ("insert".equals(this.updateAction)) {
                adapter.notifyItemInserted(intValue);
                adapter.notifyItemRangeChanged(intValue, adapter.getItemCount() - intValue);
            } else if ("reload".equals(this.updateAction)) {
                adapter.notifyItemChanged(intValue);
            } else if ("remove".equals(this.updateAction)) {
                adapter.notifyItemRemoved(intValue);
                adapter.notifyItemRangeChanged(intValue, adapter.getItemCount() - intValue);
            }
        }
        return true;
    }
}
