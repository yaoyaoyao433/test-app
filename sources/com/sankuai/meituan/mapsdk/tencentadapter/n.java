package com.sankuai.meituan.mapsdk.tencentadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.PolylineOptions;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.AnimationListener;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class n implements com.sankuai.meituan.mapsdk.maps.interfaces.r {
    public static ChangeQuickRedirect a;
    private i b;
    private Polyline c;
    private PolylineOptions d;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    @Deprecated
    public final PolylineOptions getOptions() {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setCustomTextureIndex(List<Integer> list) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setCustomTextureList(List<BitmapDescriptor> list) {
    }

    public n(Polyline polyline, PolylineOptions polylineOptions, i iVar) {
        Object[] objArr = {polyline, polylineOptions, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1159447244e1d2dfcbd6d090d2de9675", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1159447244e1d2dfcbd6d090d2de9675");
            return;
        }
        this.c = polyline;
        this.d = polylineOptions;
        this.b = iVar;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b08721b53d9e24bfa4445e4af5c38837", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b08721b53d9e24bfa4445e4af5c38837");
            return;
        }
        if (this.b.getOverlayKeeper() != null) {
            this.b.getOverlayKeeper().b(this);
        }
        this.c.remove();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aac7708f4fb76b22413e3b5426d10d3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aac7708f4fb76b22413e3b5426d10d3") : this.c.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final List<LatLng> getPoints() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1efb2252eed46824490fe4b78302409", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1efb2252eed46824490fe4b78302409");
        }
        List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> points = this.c.getPoints();
        if (points == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng : points) {
            arrayList.add(b.a(latLng));
        }
        return arrayList;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setPoints(@NonNull List<LatLng> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c97b889980dda40052f3d236102181", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c97b889980dda40052f3d236102181");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return;
        }
        for (LatLng latLng : list) {
            arrayList.add(b.a(latLng));
        }
        if (this.c != null) {
            this.c.setPoints(arrayList);
            if (this.d != null) {
                this.d.setPoints(list);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final boolean isDottedLine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76aac02069cc18054eaf8729ef245383", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76aac02069cc18054eaf8729ef245383")).booleanValue() : this.c.getPattern() != null && this.c.getPattern().size() > 0;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setDashPattern(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "072869a1b0b89009ba98d9ff5c864c21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "072869a1b0b89009ba98d9ff5c864c21");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        this.c.pattern(arrayList);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final float getWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ec7a3be43ec59e12fc46766f8d5a98d", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ec7a3be43ec59e12fc46766f8d5a98d")).floatValue() : this.c.getWidth();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "882bbb983e7ea8c7c1d31d519ae4c4e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "882bbb983e7ea8c7c1d31d519ae4c4e5");
            return;
        }
        this.c.setWidth(f);
        if (this.d != null) {
            this.d.width(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final int getColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed9d415d8a345d6778de719b11fc1cf1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed9d415d8a345d6778de719b11fc1cf1")).intValue() : this.c.getColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6476b38455aa9be230305197cfe25d7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6476b38455aa9be230305197cfe25d7f");
        } else {
            this.c.setColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6de2afbf6d5358e3c1521bcf93d67a2f", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6de2afbf6d5358e3c1521bcf93d67a2f")).floatValue() : this.c.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32317c520ab6cccdd380229e92039ea0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32317c520ab6cccdd380229e92039ea0");
            return;
        }
        this.c.setZIndex((int) f);
        if (this.d != null) {
            this.d.zIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce808fc611dd966f4ad2892b06d81fdb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce808fc611dd966f4ad2892b06d81fdb")).booleanValue() : this.c.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f581b6ab12b9a3ecaec1fc08ff0a73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f581b6ab12b9a3ecaec1fc08ff0a73");
            return;
        }
        this.c.setVisible(z);
        if (this.d != null) {
            this.d.visible(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setColors(int[] iArr, int[] iArr2) {
        Object[] objArr = {iArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "223792150e7de3930389bd7da5c6066c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "223792150e7de3930389bd7da5c6066c");
            return;
        }
        try {
            this.c.setColors(iArr, iArr2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void insertPoint(int i, LatLng latLng) {
        Object[] objArr = {Integer.valueOf(i), latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e30f49beda09136df6f1ac570006d2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e30f49beda09136df6f1ac570006d2f");
            return;
        }
        try {
            this.c.setEraseable(true);
            this.c.eraseTo(i, b.a(latLng));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setEraseable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b3bedbf0fb7a53cce0659071594be83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b3bedbf0fb7a53cce0659071594be83");
        } else {
            this.c.setEraseable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void eraseTo(int i, LatLng latLng) {
        Object[] objArr = {Integer.valueOf(i), latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b12daf59bf27019fc3ab9cf0f8cafc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b12daf59bf27019fc3ab9cf0f8cafc5");
        } else {
            eraseTo(i, latLng, false);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void eraseTo(int i, LatLng latLng, boolean z) {
        Object[] objArr = {Integer.valueOf(i), latLng, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d81a2788d45019d57c9ca454d96e4733", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d81a2788d45019d57c9ca454d96e4733");
            return;
        }
        this.c.setEraseable(true);
        if (i != 0) {
            i--;
        }
        this.c.eraseTo(i, b.a(latLng));
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf87be028de0f5fcfb743d8df480baff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf87be028de0f5fcfb743d8df480baff");
            return;
        }
        this.c.setClickable(z);
        if (this.d != null) {
            this.d.clickable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final boolean isClickable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2f2624609da18a626eeac0005a592ab", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2f2624609da18a626eeac0005a592ab")).booleanValue() : this.c.isClickable();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setColorTexture(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "529ef0ce61d9411921c6ff6e75c28edb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "529ef0ce61d9411921c6ff6e75c28edb");
        } else {
            this.c.setColorTexture(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setOptions(PolylineOptions polylineOptions) {
        Object[] objArr = {polylineOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e2bcad5441ad142ab6ab32811099f99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e2bcad5441ad142ab6ab32811099f99");
        } else {
            this.c.setPolylineOptions(b.a(polylineOptions));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final PolylineOptions getOptions(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "231e44e989a0f7b0e228742e7afc0dfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolylineOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "231e44e989a0f7b0e228742e7afc0dfe");
        }
        if (this.d == null || this.d.getVersion() == 1) {
            return b.a(context, this.c.getPolylineOptions());
        }
        return this.d;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setText(PolylineOptions.Text text) {
        Object[] objArr = {text};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5b3575efb6b3510193c7c4e362e47a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5b3575efb6b3510193c7c4e362e47a4");
            return;
        }
        this.c.setText(b.a(text));
        if (this.d != null) {
            this.d.setText(text);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final PolylineOptions.Text getText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c77a475f12b522dc6b8e8b7f2141c5d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolylineOptions.Text) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c77a475f12b522dc6b8e8b7f2141c5d3");
        }
        if (this.d != null) {
            return this.d.getText();
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setAvoidable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c86c583d949d3c8795b0ba657166dfa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c86c583d949d3c8795b0ba657166dfa4");
        } else if (this.d != null) {
            this.d.avoidable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final boolean isAvoidable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a29cebb0b564f03be871cc6ce3631da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a29cebb0b564f03be871cc6ce3631da")).booleanValue();
        }
        if (this.d != null) {
            return this.d.isAvoidable();
        }
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void startAnimation(Animation animation, LatLng latLng) {
        Object[] objArr = {animation, latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca00b26e50219771a0db77bf84685146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca00b26e50219771a0db77bf84685146");
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.Animation a2 = b.a(animation, latLng);
        if (a2 != null) {
            final Animation.AnimationListener animationListener = animation.getAnimationListener();
            if (animationListener != null) {
                a2.setAnimationListener(new AnimationListener() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.n.1
                    public static ChangeQuickRedirect a;

                    @Override // com.tencent.tencentmap.mapsdk.maps.model.AnimationListener
                    public final void onAnimationStart() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3465e1d0f8c13ad717e838505a95b49b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3465e1d0f8c13ad717e838505a95b49b");
                        } else {
                            animationListener.onAnimationStart();
                        }
                    }

                    @Override // com.tencent.tencentmap.mapsdk.maps.model.AnimationListener
                    public final void onAnimationEnd() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b569bbd9569786b6694070c0b84ceac4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b569bbd9569786b6694070c0b84ceac4");
                        } else {
                            animationListener.onAnimationEnd();
                        }
                    }
                });
            }
            this.c.startAnimation(a2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final PolylineOptions.PatternItem getPattern() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "213572d9702d5a472c8bdc472089c78d", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolylineOptions.PatternItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "213572d9702d5a472c8bdc472089c78d");
        }
        if (this.d == null) {
            return null;
        }
        return this.d.getPattern();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setPattern(PolylineOptions.PatternItem patternItem) {
        Object[] objArr = {patternItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6be9b169b068ae0ff504688c1f2498b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6be9b169b068ae0ff504688c1f2498b1");
        } else if (patternItem == null || this.d == null) {
        } else {
            this.d.pattern(patternItem);
            setOptions(this.d);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final float getAlpha() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79e291261cbfcd61227b4d9a8f318fa2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79e291261cbfcd61227b4d9a8f318fa2")).floatValue();
        }
        if (this.d == null) {
            return 1.0f;
        }
        return this.d.getAlpha();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6047bde4393aec589bb5176e4a6a50bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6047bde4393aec589bb5176e4a6a50bc");
        } else if (this.d == null) {
        } else {
            this.d.alpha(f);
            setOptions(this.d);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final Object getTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd65cfde9b0ba84c17c3bb493939d97c", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd65cfde9b0ba84c17c3bb493939d97c") : this.c.getTag();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setTag(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8956906eb3b9951f30d11c7d7583d4c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8956906eb3b9951f30d11c7d7583d4c1");
        } else {
            this.c.setTag(obj);
        }
    }
}
