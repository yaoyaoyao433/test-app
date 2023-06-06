package com.sankuai.titans.widget.media.event;

import com.sankuai.titans.widget.media.entity.Photo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface Selectable {
    int getSelectedItemCount();

    boolean isSelected(Photo photo);

    void toggleSelection(Photo photo);
}
