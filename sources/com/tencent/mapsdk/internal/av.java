package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.mapsdk.internal.ap;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class av<D extends ap> implements er {
    public abstract D f_();

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: a */
    public Rect getScreenBound(eq eqVar) {
        return f_().getScreenBound(eqVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public boolean handleOnTap() {
        return f_().handleOnTap();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public Rect getBound(eq eqVar) {
        return f_().getBound(eqVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    public List<Boundable<eq>> getGroupBounds() {
        return f_().getGroupBounds();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public boolean isRemoved() {
        return f_().isRemoved();
    }

    @Override // com.tencent.mapsdk.internal.el
    public void a(GL10 gl10) {
        f_().a(gl10);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public boolean onTap(float f, float f2) {
        return f_().onTap(f, f2);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public void setSelected(boolean z) {
        f_().setSelected(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public boolean isSelected() {
        return f_().isSelected();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public <T> void setSelectedListener(Selectable.OnSelectedListener<T> onSelectedListener) {
        f_().setSelectedListener(onSelectedListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public void remove() {
        f_().remove();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public void releaseData() {
        f_().releaseData();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public boolean isVisible() {
        return f_().isVisible();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public void setVisible(boolean z) {
        f_().setVisible(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public String getId() {
        return f_().getId();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public int getLevel() {
        return f_().getLevel();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public void setLevel(int i) {
        f_().setLevel(i);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public void setZIndex(int i) {
        f_().setZIndex(i);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public void setZIndex(float f) {
        setZIndex((int) f);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public int getZIndex() {
        return f_().getZIndex();
    }
}
