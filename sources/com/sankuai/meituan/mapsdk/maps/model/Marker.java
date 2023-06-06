package com.sankuai.meituan.mapsdk.maps.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.utils.c;
import com.sankuai.meituan.mapsdk.maps.interfaces.l;
import com.sankuai.meituan.mapsdk.maps.interfaces.n;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class Marker implements n {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final n a;

    public Marker(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07ef7eaeacde5730532bc700fe00c32e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07ef7eaeacde5730532bc700fe00c32e");
        } else {
            this.a = nVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6df138efeb5f02503d2d43ee965b33f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6df138efeb5f02503d2d43ee965b33f9");
            return;
        }
        this.a.remove();
        c.f("MTMap#removeMarker: markerID: " + this.a.getId() + " markerPosition: " + this.a.getPosition());
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final Object getObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28b24a5f3a166540a5a0fcf441502b4f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28b24a5f3a166540a5a0fcf441502b4f") : this.a.getObject();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setObject(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12d1310058a115d23797a8aae38b4529", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12d1310058a115d23797a8aae38b4529");
        } else {
            this.a.setObject(obj);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1b51f30c901fae21cd30f1afccbb3f2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1b51f30c901fae21cd30f1afccbb3f2") : this.a.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final LatLng getPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b15e4451edee480e8fe9b59fac91294c", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b15e4451edee480e8fe9b59fac91294c") : this.a.getPosition();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setPosition(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fc9daa33a6a43e0b36e0e0d60fc700d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fc9daa33a6a43e0b36e0e0d60fc700d");
        } else {
            this.a.setPosition(latLng);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final String getTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5475eeafbf470e2cf23ce72578d98bef", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5475eeafbf470e2cf23ce72578d98bef") : this.a.getTitle();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setTitle(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6997c8d58a0e56b6253a52b5ae6f0566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6997c8d58a0e56b6253a52b5ae6f0566");
        } else {
            this.a.setTitle(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final String getSnippet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a88595376e493e73d98cce4d23015ae", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a88595376e493e73d98cce4d23015ae") : this.a.getSnippet();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setSnippet(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0afd0549e712c2ea4863296248b9a52d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0afd0549e712c2ea4863296248b9a52d");
        } else {
            this.a.setSnippet(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.p
    public final void setIcon(@NonNull BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "045d4ad569841f6a39e9b2fdc7354222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "045d4ad569841f6a39e9b2fdc7354222");
        } else {
            this.a.setIcon(bitmapDescriptor);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setAnchor(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fda39a46609c9b77ad758bd7712579e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fda39a46609c9b77ad758bd7712579e");
        } else {
            this.a.setAnchor(f, f2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b6bae587d92eeb6dbdd7ca940becf9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b6bae587d92eeb6dbdd7ca940becf9b");
        } else {
            this.a.setOffset(i, i2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isDraggable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79cc8889a40b7c8c92961b5e92fa3f10", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79cc8889a40b7c8c92961b5e92fa3f10")).booleanValue() : this.a.isDraggable();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setDraggable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "288e69c863e3cfc895b53ec2b0bf4bf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "288e69c863e3cfc895b53ec2b0bf4bf1");
        } else {
            this.a.setDraggable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void showInfoWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "219ca40495eb97873108d2979e5cf665", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "219ca40495eb97873108d2979e5cf665");
        } else {
            this.a.showInfoWindow();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void hideInfoWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34c8a5edaa94af36540472ef11047f78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34c8a5edaa94af36540472ef11047f78");
        } else {
            this.a.hideInfoWindow();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isInfoWindowShown() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45604a6fd3589a3b6d10f6a2de879dce", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45604a6fd3589a3b6d10f6a2de879dce")).booleanValue() : this.a.isInfoWindowShown();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7dbd8e32e2b3f0927c265fcca8f50f93", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7dbd8e32e2b3f0927c265fcca8f50f93")).booleanValue() : this.a.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcf4ff9b565bdc5589898164f8cb0ac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcf4ff9b565bdc5589898164f8cb0ac0");
        } else {
            this.a.setVisible(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setRotateAngle(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9cc92a3e8cf9f15708bc20e8db120f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9cc92a3e8cf9f15708bc20e8db120f6");
        } else {
            this.a.setRotateAngle(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getRotateAngle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e64358ec6c0c3e9efa9dcd530b18a03", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e64358ec6c0c3e9efa9dcd530b18a03")).floatValue() : this.a.getRotateAngle();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    @Deprecated
    public final void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff016860cbc8e325d4fd842d99360e59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff016860cbc8e325d4fd842d99360e59");
        } else {
            this.a.destroy();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void startAnimation(Animation animation) {
        Object[] objArr = {animation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eb4970c10763a1215ee659224b0c0c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eb4970c10763a1215ee659224b0c0c3");
        } else {
            this.a.startAnimation(animation);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getScale() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98eed52e6aee8f184d360d2254523f0c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98eed52e6aee8f184d360d2254523f0c")).floatValue() : this.a.getScale();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setScale(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b2865ce9f625078f34cfd690f24cd22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b2865ce9f625078f34cfd690f24cd22");
        } else {
            this.a.setScale(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e248e92c23797b9835c0c2f095ecdbcd", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e248e92c23797b9835c0c2f095ecdbcd")).floatValue() : this.a.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ac7fe42bca534875c02aa482bca15e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ac7fe42bca534875c02aa482bca15e9");
        } else {
            this.a.setZIndex(f);
        }
    }

    @Deprecated
    public final void setInfowindowZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b71e519db9472351e1e33516d872943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b71e519db9472351e1e33516d872943");
        } else {
            this.a.setInfoWindowZIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e530bd2257ecf8d6a090540fef392e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e530bd2257ecf8d6a090540fef392e0");
        } else {
            this.a.setInfoWindowZIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getInfoWindowZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8c1d51d98054bc5fb5240a45b1635ab", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8c1d51d98054bc5fb5240a45b1635ab")).floatValue() : this.a.getInfoWindowZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getInfoWindowLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04cbb537993231cc7b59cc83a7f98be1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04cbb537993231cc7b59cc83a7f98be1")).intValue() : this.a.getInfoWindowLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setPositionByPixels(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be20dc70ce52ce765154b4b2dddcc1eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be20dc70ce52ce765154b4b2dddcc1eb");
        } else {
            this.a.setPositionByPixels(i, i2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20f6ad11238e20363469a5e3ae4b2170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20f6ad11238e20363469a5e3ae4b2170");
        } else {
            this.a.setClickable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void refreshInfoWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cd70d77e6d23243a28d9c24e50fcbbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cd70d77e6d23243a28d9c24e50fcbbd");
        } else {
            this.a.refreshInfoWindow();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isInfoWindowEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32f4cd92dcf9155c7b6851d211609918", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32f4cd92dcf9155c7b6851d211609918")).booleanValue() : this.a.isInfoWindowEnable();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbbf7a7310c9f8e8dda95ee108847905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbbf7a7310c9f8e8dda95ee108847905");
        } else {
            this.a.setInfoWindowEnable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setOptions(MarkerOptions markerOptions) {
        Object[] objArr = {markerOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7d072844261218611d11dd797fac232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7d072844261218611d11dd797fac232");
        } else {
            this.a.setOptions(markerOptions);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final MarkerOptions getOptions(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "651105387423c780d2e1959c571ec38f", RobustBitConfig.DEFAULT_VALUE) ? (MarkerOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "651105387423c780d2e1959c571ec38f") : this.a.getOptions(context);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final Object getPlatformMarker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d9a6627e5d2010a31b0a4a202cc4ce2", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d9a6627e5d2010a31b0a4a202cc4ce2") : this.a.getPlatformMarker();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setToTop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baa826daafbb43381eb8b2b299923856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baa826daafbb43381eb8b2b299923856");
        } else {
            this.a.setToTop();
        }
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "252a48b9b409455c27d1d05dc4e81e20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "252a48b9b409455c27d1d05dc4e81e20")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(((Marker) obj).a.getId(), this.a.getId());
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e601ba9dfa26c4829d0c298c31094108", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e601ba9dfa26c4829d0c298c31094108")).intValue() : this.a.hashCode();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setRotateIconInterceptor(n.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfe2922888127ae984868ad70e9a9f00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfe2922888127ae984868ad70e9a9f00");
        } else {
            this.a.setRotateIconInterceptor(aVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void removeRotateIconInterceptor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac608e0dce54da02ca5552721e60f9d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac608e0dce54da02ca5552721e60f9d6");
        } else {
            this.a.removeRotateIconInterceptor();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setSelect(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "708b388e4d7256b7ef1b6bf8fefbbe77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "708b388e4d7256b7ef1b6bf8fefbbe77");
        } else {
            this.a.setSelect(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isSelect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d08d6266e1527a439b0821562bbf7ce", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d08d6266e1527a439b0821562bbf7ce")).booleanValue() : this.a.isSelect();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.p
    @Nullable
    public final BitmapDescriptor getIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33ce84c3c1a9ab4120f2e6b7cf0fdeed", RobustBitConfig.DEFAULT_VALUE) ? (BitmapDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33ce84c3c1a9ab4120f2e6b7cf0fdeed") : this.a.getIcon();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getAnchorU() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a173e86cd5ecce253096f7f46c7b9307", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a173e86cd5ecce253096f7f46c7b9307")).floatValue() : this.a.getAnchorU();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getAnchorV() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e8703d1bced9bbdeba67c41d76cb629", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e8703d1bced9bbdeba67c41d76cb629")).floatValue() : this.a.getAnchorV();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getOffsetX() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05b740e8413eeca3761d937fb20a8459", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05b740e8413eeca3761d937fb20a8459")).intValue() : this.a.getOffsetX();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getOffsetY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f356d31a71e8b51b85b4bfd824fb76cc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f356d31a71e8b51b85b4bfd824fb76cc")).intValue() : this.a.getOffsetY();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getInfoWindowOffsetY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d5c85aeaaf86e142352d83dc74c5442", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d5c85aeaaf86e142352d83dc74c5442")).intValue() : this.a.getInfoWindowOffsetY();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getInfoWindowOffsetX() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4ef8eb62cc89af605faf6f60daab334", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4ef8eb62cc89af605faf6f60daab334")).intValue() : this.a.getInfoWindowOffsetX();
    }

    public final l getMapElement() {
        return this.a;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setAllowOverlap(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bca0933b53f738021b9ff44d90c3a17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bca0933b53f738021b9ff44d90c3a17");
        } else {
            this.a.setAllowOverlap(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setIgnorePlacement(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb19c25e0deea0611ffd262d7e731770", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb19c25e0deea0611ffd262d7e731770");
        } else {
            this.a.setIgnorePlacement(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final MarkerOptions.MarkerName getMarkerName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b864b3bbdd1edea96d9a6f4718d31f54", RobustBitConfig.DEFAULT_VALUE) ? (MarkerOptions.MarkerName) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b864b3bbdd1edea96d9a6f4718d31f54") : this.a.getMarkerName();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setMarkerName(MarkerOptions.MarkerName markerName) {
        Object[] objArr = {markerName};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72445e72dc81646849a2a6f478568d1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72445e72dc81646849a2a6f478568d1f");
        } else {
            this.a.setMarkerName(markerName);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    @Deprecated
    public final void setMarkerName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03c5e8c28bb432f73971c8b152fcedb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03c5e8c28bb432f73971c8b152fcedb2");
        } else {
            this.a.setMarkerName(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setNameAroundIcon(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d955cd92786f0c2eb60c0e07735a76c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d955cd92786f0c2eb60c0e07735a76c8");
        } else {
            this.a.setNameAroundIcon(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    @Deprecated
    public final void setMarkerNameSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01d8a9c2cae5d1c794511199710347c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01d8a9c2cae5d1c794511199710347c3");
        } else {
            this.a.setMarkerNameSize(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    @Deprecated
    public final void setMarkerNameColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b831692357528aaa9d651bcb414c18c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b831692357528aaa9d651bcb414c18c3");
        } else {
            this.a.setMarkerNameColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "770dd5fa422b49d3ab049514cd3bc903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "770dd5fa422b49d3ab049514cd3bc903");
            return;
        }
        if (f > 1.0d) {
            f = 1.0f;
        }
        this.a.setAlpha(f);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final Object getTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c65a3cd8583e3a5ee2135b60cf8616cb", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c65a3cd8583e3a5ee2135b60cf8616cb") : this.a.getTag();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setTag(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e72237bb49a76025a1658b2fc4182f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e72237bb49a76025a1658b2fc4182f0f");
        } else {
            this.a.setTag(obj);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "487e124747586aa98b5cdea5fd456e67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "487e124747586aa98b5cdea5fd456e67");
        } else {
            this.a.setInfoWindowOffset(i, i2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowOffset(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31bbcc975d7bb35495c17c3747db9cb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31bbcc975d7bb35495c17c3747db9cb6");
        } else {
            this.a.setInfoWindowOffset(i, i2, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowAllowOverlap(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92749971c9f9b631e527078ca558e44e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92749971c9f9b631e527078ca558e44e");
        } else {
            this.a.setInfoWindowAllowOverlap(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isInfoWindowAllowOverlap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "262cd4265c60aa626d2df168e39faf51", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "262cd4265c60aa626d2df168e39faf51")).booleanValue() : this.a.isInfoWindowAllowOverlap();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isInfoWindowIgnorePlacement() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbd5aacaee12cb14cdb14a94f1bc86f6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbd5aacaee12cb14cdb14a94f1bc86f6")).booleanValue() : this.a.isInfoWindowIgnorePlacement();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowIgnorePlacement(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a94b6987045c889ae96397e07d7bbf9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a94b6987045c889ae96397e07d7bbf9d");
        } else {
            this.a.setInfoWindowIgnorePlacement(z);
        }
    }
}
