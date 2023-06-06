package com.sankuai.titans.widget.media.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.media.entity.Photo;
import com.sankuai.titans.widget.media.entity.PhotoDirectory;
import com.sankuai.titans.widget.media.event.Selectable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class SelectableAdapter<VH extends RecyclerView.s> extends RecyclerView.a<VH> implements Selectable {
    private static final String TAG = "SelectableAdapter";
    public static ChangeQuickRedirect changeQuickRedirect;
    public int currentDirectoryIndex;
    protected List<PhotoDirectory> photoDirectories;
    protected List<String> selectedPhotos;

    public SelectableAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbc1eac3928ffae738d78f1e23cec8a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbc1eac3928ffae738d78f1e23cec8a4");
            return;
        }
        this.currentDirectoryIndex = 0;
        this.photoDirectories = new ArrayList();
        this.selectedPhotos = new ArrayList();
    }

    public boolean isSelected(Photo photo) {
        Object[] objArr = {photo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d13c49e9fbf0aaa03f12507542976ddb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d13c49e9fbf0aaa03f12507542976ddb")).booleanValue() : getSelectedPhotos().contains(photo.getPath());
    }

    @Override // com.sankuai.titans.widget.media.event.Selectable
    public void toggleSelection(Photo photo) {
        Object[] objArr = {photo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5f09cb3d0e27971881b347a84324906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5f09cb3d0e27971881b347a84324906");
        } else if (this.selectedPhotos.contains(photo.getPath())) {
            this.selectedPhotos.remove(photo.getPath());
        } else {
            this.selectedPhotos.add(photo.getPath());
        }
    }

    @Override // com.sankuai.titans.widget.media.event.Selectable
    public int getSelectedItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2934f78dd7972b81549661ff4c40a351", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2934f78dd7972b81549661ff4c40a351")).intValue() : this.selectedPhotos.size();
    }

    public void setCurrentDirectoryIndex(int i) {
        this.currentDirectoryIndex = i;
    }

    public List<Photo> getCurrentPhotos() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b7bbab46421ddf18edc0f2907f9a0b3", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b7bbab46421ddf18edc0f2907f9a0b3") : this.photoDirectories.get(this.currentDirectoryIndex).getPhotos();
    }

    public List<String> getCurrentPhotoPaths() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ac10962a196c80ecfec7e6163559819", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ac10962a196c80ecfec7e6163559819");
        }
        ArrayList arrayList = new ArrayList(getCurrentPhotos().size());
        for (Photo photo : getCurrentPhotos()) {
            arrayList.add(photo.getPath());
        }
        return arrayList;
    }

    public List<String> getSelectedPhotos() {
        return this.selectedPhotos;
    }
}
