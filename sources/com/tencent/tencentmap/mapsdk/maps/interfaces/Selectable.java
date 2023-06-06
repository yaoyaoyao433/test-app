package com.tencent.tencentmap.mapsdk.maps.interfaces;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface Selectable {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnSelectedListener<T> {
        void onSelected(T t);
    }

    boolean isSelected();

    void setSelected(boolean z);

    <T> void setSelectedListener(OnSelectedListener<T> onSelectedListener);
}
