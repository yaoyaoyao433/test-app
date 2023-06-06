package com.sankuai.meituan.mapsdk.tencentadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.HoneyCombOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.IndoorBuilding;
import com.sankuai.meituan.mapsdk.maps.model.IndoorInfo;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.PolylineOptions;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.tencent.map.sdk.utilities.heatmap.Gradient;
import com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider;
import com.tencent.map.sdk.utilities.heatmap.WeightedLatLng;
import com.tencent.map.sdk.utilities.visualization.aggregation.HoneyCombVectorOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.EmergeAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import com.tencent.tencentmap.mapsdk.maps.model.RestrictBoundsFitMode;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static Animation a(@NonNull com.sankuai.meituan.mapsdk.maps.model.animation.Animation animation, LatLng latLng) {
        Object[] objArr = {animation, latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79ae22212b6c3b60d225d2135c483e61", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79ae22212b6c3b60d225d2135c483e61");
        }
        if (a(animation) || a(latLng)) {
            return null;
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (AnonymousClass2.a[animation.getType().ordinal()] != 1) {
            return null;
        }
        EmergeAnimation emergeAnimation = new EmergeAnimation(a(latLng));
        emergeAnimation.setDuration(animation.getDuration());
        emergeAnimation.setInterpolator(animation.getInterpolator());
        return emergeAnimation;
    }

    public static RestrictBoundsFitMode a(@NonNull com.sankuai.meituan.mapsdk.maps.model.RestrictBoundsFitMode restrictBoundsFitMode) {
        Object[] objArr = {restrictBoundsFitMode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84d4255cec41011d58674ecfd601183d", RobustBitConfig.DEFAULT_VALUE)) {
            return (RestrictBoundsFitMode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84d4255cec41011d58674ecfd601183d");
        }
        if (a(restrictBoundsFitMode)) {
            return null;
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        switch (restrictBoundsFitMode) {
            case FIT_HEIGHT:
                return RestrictBoundsFitMode.FIT_HEIGHT;
            case FIT_WIDTH:
                return RestrictBoundsFitMode.FIT_WIDTH;
            default:
                return null;
        }
    }

    public static PolylineOptions.Text a(@NonNull PolylineOptions.Text text) {
        PolylineOptions.Text text2;
        Object[] objArr = {text};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f80b6eadfd7f5343390b7a9228d46e55", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolylineOptions.Text) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f80b6eadfd7f5343390b7a9228d46e55");
        }
        if (a(text)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (text.getSegmentTexts() != null) {
                for (PolylineOptions.SegmentText segmentText : text.getSegmentTexts()) {
                    if (segmentText != null) {
                        arrayList.add(new PolylineOptions.SegmentText(segmentText.getStartIndex(), segmentText.getEndIndex(), segmentText.getText()));
                    }
                }
                text2 = new PolylineOptions.Text.Builder(arrayList).build();
            } else {
                text2 = null;
            }
            if (text2 != null) {
                text2.setPriority(a(text.getPriority()));
                text2.setStrokeColor(text.getStrokeColor());
                text2.setTextColor(text.getTextColor());
                text2.setTextSize(text.getTextSize());
            }
            return text2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static PolylineOptions.TextPriority a(@NonNull PolylineOptions.TextPriority textPriority) {
        Object[] objArr = {textPriority};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2742e51e79ef1e2aaa8968c254e7325", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolylineOptions.TextPriority) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2742e51e79ef1e2aaa8968c254e7325");
        }
        if (a(textPriority)) {
            return null;
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        switch (textPriority) {
            case HIGH:
                return PolylineOptions.TextPriority.HIGH;
            case NORMAL:
                return PolylineOptions.TextPriority.NORMAL;
            default:
                return null;
        }
    }

    private static Collection<com.tencent.tencentmap.mapsdk.maps.model.LatLng> a(@NonNull Collection<LatLng> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b215907408cf1a8c330153f55a50b1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b215907408cf1a8c330153f55a50b1c");
        }
        if (a(collection)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (LatLng latLng : collection) {
                arrayList.add(a(latLng));
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static WeightedLatLng a(@NonNull com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng weightedLatLng) {
        Object[] objArr = {weightedLatLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa775ae08fbd88acb3ce9e96bd410f7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (WeightedLatLng) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa775ae08fbd88acb3ce9e96bd410f7f");
        }
        if (weightedLatLng == null) {
            return null;
        }
        try {
            return new WeightedLatLng(a(weightedLatLng.latLng), weightedLatLng.intensity);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Collection<WeightedLatLng> b(@NonNull Collection<com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ad708c52caaeec1d161c9a68a6fcdba", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ad708c52caaeec1d161c9a68a6fcdba");
        }
        if (collection == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng weightedLatLng : collection) {
                arrayList.add(a(weightedLatLng));
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static LatLngBounds a(com.sankuai.meituan.mapsdk.maps.model.LatLngBounds latLngBounds) {
        Object[] objArr = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "721971df79a075480274ac9c7633b37c", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLngBounds) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "721971df79a075480274ac9c7633b37c");
        }
        if (latLngBounds == null || latLngBounds.northeast == null || latLngBounds.southwest == null) {
            return new LatLngBounds(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d), new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d));
        }
        return new LatLngBounds(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLngBounds.northeast.latitude, latLngBounds.northeast.longitude), new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLngBounds.southwest.latitude, latLngBounds.southwest.longitude));
    }

    public static CameraPosition a(@NonNull com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d8d8bc1b127b7a2130ae6197c904346", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d8d8bc1b127b7a2130ae6197c904346");
        }
        if (a(cameraPosition)) {
            return null;
        }
        try {
            return new CameraPosition(new LatLng(cameraPosition.target.latitude, cameraPosition.target.longitude), cameraPosition.zoom, cameraPosition.tilt, a(cameraPosition.bearing));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff66af47895d2107277212bd0602cd27", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff66af47895d2107277212bd0602cd27")).floatValue() : ((double) Math.abs(f - 0.0f)) < 1.0E-6d ? f : 360.0f - f;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLng a(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afc4b7bdc052a058f53271b9c0a54887", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.tencent.tencentmap.mapsdk.maps.model.LatLng) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afc4b7bdc052a058f53271b9c0a54887");
        }
        if (latLng == null) {
            return null;
        }
        try {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLng.latitude, latLng.longitude);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static MarkerOptions a(@NonNull com.sankuai.meituan.mapsdk.maps.model.MarkerOptions markerOptions) {
        Object[] objArr = {markerOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "473968ab0d4bf848681c0c523f43d28d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MarkerOptions) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "473968ab0d4bf848681c0c523f43d28d");
        }
        if (a(markerOptions)) {
            return null;
        }
        try {
            MarkerOptions markerOptions2 = new MarkerOptions();
            if (markerOptions.getIcon() != null) {
                markerOptions2.icon(BitmapDescriptorFactory.fromBitmap(markerOptions.getIcon().getBitmap()));
            }
            if (markerOptions.getPosition() != null) {
                markerOptions2.position(a(markerOptions.getPosition()));
            }
            if (markerOptions.getAnchorU() != -1.0f && markerOptions.getAnchorV() != -1.0f) {
                markerOptions2.anchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
            }
            markerOptions2.alpha(markerOptions.getAlpha());
            if (markerOptions.getIndoorInfo() != null) {
                IndoorInfo indoorInfo = markerOptions.getIndoorInfo();
                markerOptions2.indoorInfo(new com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo(indoorInfo.getBuildingId(), indoorInfo.getFloorName()));
            }
            markerOptions2.draggable(markerOptions.isDraggable());
            markerOptions2.visible(markerOptions.isVisible());
            markerOptions2.level(markerOptions.getLevel());
            markerOptions2.zIndex(markerOptions.getZIndex());
            markerOptions2.infoWindowEnable(markerOptions.isInfoWindowEnable());
            markerOptions2.infoWindowOffset(markerOptions.getInfoWindowOffsetX(), markerOptions.getInfoWindowOffsetY());
            if (markerOptions.isViewInfoWindow()) {
                markerOptions2.viewInfoWindow(markerOptions.isViewInfoWindow());
            }
            markerOptions2.fastLoad(markerOptions.isFastLoad());
            markerOptions2.rotation(markerOptions.getRotateAngle());
            markerOptions2.tag(markerOptions.getTag());
            String contentDescription = markerOptions.getContentDescription();
            if (!TextUtils.isEmpty(contentDescription)) {
                markerOptions2.contentDescription(contentDescription);
            }
            return markerOptions2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static CircleOptions a(com.sankuai.meituan.mapsdk.maps.model.CircleOptions circleOptions) {
        Object[] objArr = {circleOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ece16e13a309b240883955f59118437e", RobustBitConfig.DEFAULT_VALUE)) {
            return (CircleOptions) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ece16e13a309b240883955f59118437e");
        }
        if (a(circleOptions)) {
            return null;
        }
        try {
            CircleOptions circleOptions2 = new CircleOptions();
            if (circleOptions.getCenter() != null) {
                circleOptions2.center(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(circleOptions.getCenter().latitude, circleOptions.getCenter().longitude));
            }
            circleOptions2.radius(circleOptions.getRadius());
            circleOptions2.strokeWidth(circleOptions.getStrokeWidth());
            circleOptions2.strokeColor(circleOptions.getStrokeColor());
            circleOptions2.level(circleOptions.getLevel());
            circleOptions2.zIndex((int) circleOptions.getZIndex());
            circleOptions2.fillColor(circleOptions.getFillColor());
            circleOptions2.visible(circleOptions.isVisible());
            return circleOptions2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions a(com.sankuai.meituan.mapsdk.maps.model.PolylineOptions polylineOptions) {
        List<Integer> a2;
        Object[] objArr = {polylineOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbe9c826e91f615805d547c902398245", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbe9c826e91f615805d547c902398245");
        }
        if (a(polylineOptions)) {
            return null;
        }
        if (polylineOptions.getVersion() == 1) {
            return b(polylineOptions);
        }
        Object[] objArr2 = {polylineOptions};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f0d51928f79df22a7d3aa06852cfa32d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f0d51928f79df22a7d3aa06852cfa32d");
        }
        if (a(polylineOptions)) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions2 = new com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions();
        PolylineOptions.PatternItem pattern = polylineOptions.getPattern();
        if (pattern == null) {
            pattern = new PolylineOptions.SingleColorPattern();
        }
        if (polylineOptions.getPoints() == null) {
            return polylineOptions2;
        }
        if (pattern instanceof PolylineOptions.MultiColorPattern) {
            PolylineOptions.MultiColorPattern multiColorPattern = (PolylineOptions.MultiColorPattern) pattern;
            if (multiColorPattern.getBorderWidth() == 0.0f && multiColorPattern.getArrowTexture() == null) {
                int[] colors = multiColorPattern.getColors();
                int[] indexes = multiColorPattern.getIndexes();
                if (colors == null || colors.length <= 0) {
                    colors = new int[]{com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.DEFAULT_BODY_COLOR};
                }
                if (indexes == null || indexes.length <= 0) {
                    indexes = new int[]{0};
                }
                polylineOptions2.colorType(PolylineOptions.ColorType.LINE_COLOR_ARGB);
                polylineOptions2.lineType(0);
                List<Integer> a3 = a(indexes, colors, polylineOptions.getPoints());
                if (a3 != null && a3.size() > 0) {
                    int[] iArr = new int[a3.size()];
                    int i = 0;
                    for (Integer num : a3) {
                        iArr[i] = num.intValue();
                        i++;
                    }
                    int[] iArr2 = new int[iArr.length];
                    for (int i2 = 0; i2 < iArr.length; i2++) {
                        iArr2[i2] = i2;
                    }
                    polylineOptions2.colors(iArr, iArr2);
                }
            } else {
                polylineOptions2.colorType(PolylineOptions.ColorType.LINE_COLOR_ARGB);
                polylineOptions2.lineType(0);
                int[] colors2 = multiColorPattern.getColors();
                int[] indexes2 = multiColorPattern.getIndexes();
                int[] borderColors = multiColorPattern.getBorderColors();
                if (colors2 == null || colors2.length <= 0) {
                    colors2 = new int[]{com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.DEFAULT_BODY_COLOR};
                }
                if (indexes2 == null || indexes2.length <= 0) {
                    indexes2 = new int[]{0};
                }
                if (borderColors == null || borderColors.length <= 0) {
                    borderColors = new int[]{com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.DEFAULT_BORDER_COLOR};
                }
                List<Integer> a4 = a(indexes2, colors2, polylineOptions.getPoints());
                if (a4 != null && a4.size() > 0) {
                    int[] iArr3 = new int[a4.size()];
                    int i3 = 0;
                    for (Integer num2 : a4) {
                        iArr3[i3] = num2.intValue();
                        i3++;
                    }
                    int[] iArr4 = new int[iArr3.length];
                    for (int i4 = 0; i4 < iArr3.length; i4++) {
                        iArr4[i4] = i4;
                    }
                    polylineOptions2.colors(iArr3, iArr4);
                }
                if (multiColorPattern.getBorderWidth() > 0.0f && (a2 = a(indexes2, borderColors, polylineOptions.getPoints())) != null && a2.size() > 0) {
                    int[] iArr5 = new int[a2.size()];
                    int i5 = 0;
                    for (Integer num3 : a2) {
                        iArr5[i5] = num3.intValue();
                        i5++;
                    }
                    polylineOptions2.borderColors(iArr5);
                    polylineOptions2.borderWidth(multiColorPattern.getBorderWidth());
                }
                if (multiColorPattern.getArrowTexture() != null) {
                    polylineOptions2.arrow(true);
                    polylineOptions2.arrowTexture(BitmapDescriptorFactory.fromBitmap(multiColorPattern.getArrowTexture().getBitmap()));
                    polylineOptions2.arrowSpacing(multiColorPattern.getArrowSpacing() + 8);
                }
            }
        } else if (pattern instanceof PolylineOptions.DotLinePattern) {
            PolylineOptions.DotLinePattern dotLinePattern = (PolylineOptions.DotLinePattern) pattern;
            polylineOptions2.colorType(PolylineOptions.ColorType.LINE_COLOR_ARGB);
            polylineOptions2.lineType(0);
            polylineOptions2.color(0);
            if (dotLinePattern.getTexture() != null) {
                polylineOptions2.arrow(true);
                polylineOptions2.arrowTexture(BitmapDescriptorFactory.fromBitmap(dotLinePattern.getTexture().getBitmap()));
                polylineOptions2.arrowSpacing(dotLinePattern.getSpacing() + 32);
            }
        } else if (pattern instanceof PolylineOptions.DotColorLinePattern) {
            PolylineOptions.DotColorLinePattern dotColorLinePattern = (PolylineOptions.DotColorLinePattern) pattern;
            polylineOptions2.color(dotColorLinePattern.getColor());
            int[] dashPattern = dotColorLinePattern.getDashPattern();
            ArrayList arrayList = new ArrayList(4);
            for (int i6 : dashPattern) {
                arrayList.add(Integer.valueOf(i6));
            }
            polylineOptions2.pattern(arrayList);
        } else {
            if (!(pattern instanceof PolylineOptions.SingleColorPattern)) {
                pattern = new PolylineOptions.SingleColorPattern();
            }
            PolylineOptions.SingleColorPattern singleColorPattern = (PolylineOptions.SingleColorPattern) pattern;
            if (singleColorPattern.getBorderWidth() == 0 && singleColorPattern.getArrowTexture() == null) {
                polylineOptions2.colorType(PolylineOptions.ColorType.LINE_COLOR_ARGB);
                polylineOptions2.lineType(0);
                polylineOptions2.color(singleColorPattern.getColor());
            } else {
                polylineOptions2.colorType(PolylineOptions.ColorType.LINE_COLOR_ARGB);
                polylineOptions2.lineType(0);
                polylineOptions2.color(singleColorPattern.getColor());
                if (singleColorPattern.getBorderWidth() > 0) {
                    polylineOptions2.borderColors(new int[]{singleColorPattern.getBorderColor()});
                    polylineOptions2.borderWidth(singleColorPattern.getBorderWidth());
                }
                if (singleColorPattern.getArrowTexture() != null) {
                    polylineOptions2.arrow(true);
                    polylineOptions2.arrowTexture(BitmapDescriptorFactory.fromBitmap(singleColorPattern.getArrowTexture().getBitmap()));
                    polylineOptions2.arrowSpacing(singleColorPattern.getArrowSpacing() + 8);
                }
            }
        }
        List<LatLng> points = polylineOptions.getPoints();
        if (points != null && points.size() > 0) {
            int size = points.size();
            com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngArr = new com.tencent.tencentmap.mapsdk.maps.model.LatLng[size];
            for (int i7 = 0; i7 < size; i7++) {
                latLngArr[i7] = a(points.get(i7));
            }
            polylineOptions2.add(latLngArr);
        }
        polylineOptions2.alpha(polylineOptions.getAlpha());
        polylineOptions2.width(polylineOptions.getWidth());
        polylineOptions2.zIndex((int) polylineOptions.getZIndex());
        polylineOptions2.visible(polylineOptions.isVisible());
        polylineOptions2.clickable(polylineOptions.isClickable());
        polylineOptions2.lineCap(polylineOptions.getLineCap());
        if (polylineOptions.getText() != null) {
            polylineOptions2.text(a(polylineOptions.getText()));
        }
        polylineOptions2.level(polylineOptions.getLevel());
        return polylineOptions2;
    }

    private static com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions b(com.sankuai.meituan.mapsdk.maps.model.PolylineOptions polylineOptions) {
        PolylineOptions.ColorType colorType;
        Object[] objArr = {polylineOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d2735b005be4a67cffd66ee058dd2d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d2735b005be4a67cffd66ee058dd2d1");
        }
        if (a(polylineOptions)) {
            return null;
        }
        try {
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions2 = new com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions();
            polylineOptions2.zIndex((int) polylineOptions.getZIndex());
            polylineOptions2.visible(polylineOptions.isVisible());
            if (polylineOptions.getPoints() != null) {
                for (LatLng latLng : polylineOptions.getPoints()) {
                    polylineOptions2.add(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLng.latitude, latLng.longitude), new com.tencent.tencentmap.mapsdk.maps.model.LatLng[0]);
                }
            }
            if (polylineOptions.isUseTexture() && polylineOptions.getCustomTexture() != null) {
                polylineOptions2.arrow(true);
                polylineOptions2.arrowTexture(BitmapDescriptorFactory.fromBitmap(polylineOptions.getCustomTexture().getBitmap()));
                polylineOptions2.arrowSpacing(polylineOptions.getArrowSpacing());
            } else if (polylineOptions.getLineType() == 1 || polylineOptions.isDottedLine()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(30);
                arrayList.add(15);
                polylineOptions2.pattern(arrayList);
            }
            polylineOptions2.lineCap(polylineOptions.getLineCap());
            polylineOptions2.lineType(polylineOptions.getLineType());
            polylineOptions2.width(polylineOptions.getWidth());
            polylineOptions2.color(polylineOptions.getColor());
            polylineOptions2.borderColor(polylineOptions.getBorderColor());
            polylineOptions2.borderWidth(polylineOptions.getBorderWidth());
            if (polylineOptions.getColorValues() != null) {
                Integer[] numArr = (Integer[]) polylineOptions.getColorValues().toArray(new Integer[polylineOptions.getColorValues().size()]);
                int[] iArr = new int[numArr.length];
                for (int i = 0; i < numArr.length; i++) {
                    iArr[i] = i;
                }
                int[] iArr2 = new int[numArr.length];
                for (int i2 = 0; i2 < numArr.length; i2++) {
                    iArr2[i2] = numArr[i2].intValue();
                }
                polylineOptions2.colors(iArr2, iArr);
                if (polylineOptions.getBorderColors() != null && polylineOptions.getBorderColors().size() == polylineOptions.getColorValues().size()) {
                    Integer[] numArr2 = (Integer[]) polylineOptions.getBorderColors().toArray(new Integer[polylineOptions.getBorderColors().size()]);
                    int[] iArr3 = new int[numArr2.length];
                    for (int i3 = 0; i3 < numArr2.length; i3++) {
                        iArr3[i3] = numArr2[i3].intValue();
                    }
                    polylineOptions2.borderColors(iArr3);
                }
            }
            if (polylineOptions.getText() != null) {
                polylineOptions2.text(a(polylineOptions.getText()));
            }
            polylineOptions2.level(polylineOptions.getLevel());
            polylineOptions2.alpha(polylineOptions.getAlpha());
            polylineOptions2.clickable(polylineOptions.isClickable());
            polylineOptions2.arrowSpacing(polylineOptions.getArrowSpacing());
            PolylineOptions.ColorType colorType2 = polylineOptions.getColorType();
            Object[] objArr2 = {colorType2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ae6709cd2d2c0364e07258fe32ed1008", RobustBitConfig.DEFAULT_VALUE)) {
                colorType = PolylineOptions.ColorType.LINE_COLOR_NONE;
                switch (colorType2) {
                    case LINE_COLOR_NONE:
                        colorType = PolylineOptions.ColorType.LINE_COLOR_NONE;
                        break;
                    case LINE_COLOR_ARGB:
                        colorType = PolylineOptions.ColorType.LINE_COLOR_ARGB;
                        break;
                    case LINE_COLOR_TEXTURE:
                        colorType = PolylineOptions.ColorType.LINE_COLOR_TEXTURE;
                        break;
                }
            } else {
                colorType = (PolylineOptions.ColorType) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ae6709cd2d2c0364e07258fe32ed1008");
            }
            polylineOptions2.colorType(colorType);
            String strColorTextureName = polylineOptions.getStrColorTextureName();
            if (!TextUtils.isEmpty(strColorTextureName)) {
                polylineOptions2.setColorTexture(strColorTextureName);
            }
            if (polylineOptions.getColorTexture() != null) {
                polylineOptions2.colorTexture(BitmapDescriptorFactory.fromBitmap(polylineOptions.getColorTexture().getBitmap()));
            }
            return polylineOptions2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static List<Integer> a(int[] iArr, int[] iArr2, List<LatLng> list) {
        int[] iArr3;
        Object[] objArr = {iArr, iArr2, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "641973eae911a2e28ab9bea28c6bae3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "641973eae911a2e28ab9bea28c6bae3e");
        }
        ArrayList arrayList = new ArrayList();
        if (iArr != null && iArr.length > 0 && iArr2 != null && iArr2.length > 0 && list.size() > 0) {
            if (iArr2.length < iArr.length) {
                iArr3 = new int[iArr.length];
                int length = iArr2.length - 1;
                for (int i = 0; i < iArr.length; i++) {
                    if (i >= length) {
                        iArr3[i] = iArr2[length];
                    } else {
                        iArr3[i] = iArr2[i];
                    }
                }
            } else {
                iArr3 = iArr2;
            }
            int size = list.size();
            int i2 = iArr2[0];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                if (i3 < iArr.length && iArr[i3] == i4) {
                    i2 = iArr3[i3];
                    i3++;
                }
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return arrayList;
    }

    public static com.sankuai.meituan.mapsdk.maps.model.PolylineOptions a(Context context, com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions) {
        PolylineOptions.ColorType colorType;
        Object[] objArr = {context, polylineOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2adfca1c69e884c777a42852476bdb5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.maps.model.PolylineOptions) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2adfca1c69e884c777a42852476bdb5a");
        }
        if (a(polylineOptions)) {
            return null;
        }
        com.sankuai.meituan.mapsdk.maps.model.PolylineOptions polylineOptions2 = new com.sankuai.meituan.mapsdk.maps.model.PolylineOptions();
        try {
            polylineOptions2.setLevel(polylineOptions.getLevel());
            polylineOptions2.zIndex(polylineOptions.getZIndex());
            polylineOptions2.visible(polylineOptions.isVisible());
            if (polylineOptions.getPoints() != null) {
                for (com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng : polylineOptions.getPoints()) {
                    polylineOptions2.add(new LatLng(latLng.latitude, latLng.longitude));
                }
            }
            if (polylineOptions.isArrow() && polylineOptions.getArrowTexture() != null) {
                polylineOptions2.setUseTexture(true);
                polylineOptions2.setCustomTexture(com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(polylineOptions.getArrowTexture().getBitmap(context)));
            } else if (polylineOptions.getLineType() == 1 || (polylineOptions.getPattern() != null && polylineOptions.getPattern().size() > 1)) {
                polylineOptions2.setDottedLine(true);
            }
            polylineOptions2.setLineType(polylineOptions.getLineType());
            polylineOptions2.width(polylineOptions.getWidth());
            polylineOptions2.color(polylineOptions.getColor());
            if (polylineOptions.getBorderColors() != null && polylineOptions.getBorderColors().length == 1) {
                polylineOptions2.borderColor(polylineOptions.getBorderColors()[0]);
            }
            polylineOptions2.lineCap(polylineOptions.getLineCap());
            polylineOptions2.borderWidth(polylineOptions.getBorderWidth());
            if (polylineOptions.getColors() != null) {
                int[][] colors = polylineOptions.getColors();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < colors[0].length; i++) {
                    arrayList.add(Integer.valueOf(colors[0][i]));
                }
                polylineOptions2.colorValues(arrayList);
                if (polylineOptions.getBorderColors() != null && polylineOptions.getBorderColors().length == polylineOptions.getColors().length) {
                    int[] borderColors = polylineOptions.getBorderColors();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 : borderColors) {
                        arrayList2.add(Integer.valueOf(i2));
                    }
                    polylineOptions2.borderColors(arrayList2);
                }
            }
            polylineOptions2.alpha(polylineOptions.getAlpha());
            polylineOptions2.clickable(polylineOptions.isClickable());
            polylineOptions2.arrowSpacing(polylineOptions.getArrowSpacing());
            PolylineOptions.ColorType colorType2 = polylineOptions.getColorType();
            Object[] objArr2 = {colorType2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "17f9fe0e879e162dc03579211602b4c2", RobustBitConfig.DEFAULT_VALUE)) {
                PolylineOptions.ColorType colorType3 = PolylineOptions.ColorType.LINE_COLOR_NONE;
                switch (colorType2) {
                    case LINE_COLOR_NONE:
                        colorType = PolylineOptions.ColorType.LINE_COLOR_NONE;
                        break;
                    case LINE_COLOR_ARGB:
                        colorType = PolylineOptions.ColorType.LINE_COLOR_ARGB;
                        break;
                    case LINE_COLOR_TEXTURE:
                        colorType = PolylineOptions.ColorType.LINE_COLOR_TEXTURE;
                        break;
                    default:
                        colorType = colorType3;
                        break;
                }
            } else {
                colorType = (PolylineOptions.ColorType) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "17f9fe0e879e162dc03579211602b4c2");
            }
            polylineOptions2.colorType(colorType);
            return polylineOptions2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mapsdk.tencentadapter.b$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a;

        static {
            try {
                e[PolylineOptions.ColorType.LINE_COLOR_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[PolylineOptions.ColorType.LINE_COLOR_ARGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[PolylineOptions.ColorType.LINE_COLOR_TEXTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = new int[PolylineOptions.ColorType.valuesCustom().length];
            try {
                d[PolylineOptions.ColorType.LINE_COLOR_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[PolylineOptions.ColorType.LINE_COLOR_ARGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[PolylineOptions.ColorType.LINE_COLOR_TEXTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            c = new int[PolylineOptions.TextPriority.valuesCustom().length];
            try {
                c[PolylineOptions.TextPriority.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[PolylineOptions.TextPriority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            b = new int[com.sankuai.meituan.mapsdk.maps.model.RestrictBoundsFitMode.valuesCustom().length];
            try {
                b[com.sankuai.meituan.mapsdk.maps.model.RestrictBoundsFitMode.FIT_HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[com.sankuai.meituan.mapsdk.maps.model.RestrictBoundsFitMode.FIT_WIDTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            a = new int[Animation.AnimationType.valuesCustom().length];
            try {
                a[Animation.AnimationType.EMERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static PolygonOptions a(com.sankuai.meituan.mapsdk.maps.model.PolygonOptions polygonOptions) {
        Object[] objArr = {polygonOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9293a692fdb4805454390326a371b8ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolygonOptions) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9293a692fdb4805454390326a371b8ef");
        }
        if (a(polygonOptions)) {
            return null;
        }
        try {
            PolygonOptions polygonOptions2 = new PolygonOptions();
            if (polygonOptions.getPoints() != null) {
                for (LatLng latLng : polygonOptions.getPoints()) {
                    polygonOptions2.add(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLng.latitude, latLng.longitude));
                }
            }
            polygonOptions2.strokeWidth(polygonOptions.getStrokeWidth());
            polygonOptions2.visible(polygonOptions.isVisible());
            polygonOptions2.zIndex((int) polygonOptions.getZIndex());
            polygonOptions2.fillColor(polygonOptions.getFillColor());
            polygonOptions2.strokeColor(polygonOptions.getStrokeColor());
            polygonOptions2.level(polygonOptions.getLevel());
            ArrayList arrayList = new ArrayList();
            int[] dashArray = polygonOptions.getDashArray();
            if (dashArray != null && dashArray.length >= 2) {
                int i = dashArray[0];
                int i2 = dashArray[1];
                if (i != 0 || i2 != 0) {
                    arrayList.add(Integer.valueOf(i));
                    arrayList.add(Integer.valueOf(i2));
                    polygonOptions2.pattern(arrayList);
                }
            }
            return polygonOptions2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static com.sankuai.meituan.mapsdk.maps.model.LatLngBounds a(LatLngBounds latLngBounds) {
        Object[] objArr = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44ac6bd8ac228f398a1e3dd206ee3aab", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.maps.model.LatLngBounds) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44ac6bd8ac228f398a1e3dd206ee3aab");
        }
        if (a(latLngBounds, latLngBounds.northeast, latLngBounds.southwest)) {
            return null;
        }
        try {
            return new com.sankuai.meituan.mapsdk.maps.model.LatLngBounds(new LatLng(latLngBounds.southwest.latitude, latLngBounds.southwest.longitude), new LatLng(latLngBounds.northeast.latitude, latLngBounds.northeast.longitude));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static LatLng a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5eefbc331748a8bc797923a4dd36d73", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5eefbc331748a8bc797923a4dd36d73");
        }
        if (latLng == null) {
            return null;
        }
        return new LatLng(latLng.latitude, latLng.longitude);
    }

    public static List<LatLng> a(@NonNull List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de2316385eda6d9565abe538131ae5b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de2316385eda6d9565abe538131ae5b8");
        }
        if (a(list)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng : list) {
                arrayList.add(a(latLng));
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static IndoorBuilding a(com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding) {
        Object[] objArr = {indoorBuilding};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1e20a172d5efc8d6474b8a1b498b413", RobustBitConfig.DEFAULT_VALUE)) {
            return (IndoorBuilding) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1e20a172d5efc8d6474b8a1b498b413");
        }
        if (a(indoorBuilding)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (indoorBuilding.getLevels() != null) {
                for (IndoorLevel indoorLevel : indoorBuilding.getLevels()) {
                    arrayList.add(indoorLevel.getName());
                }
            }
            return new IndoorBuilding(indoorBuilding.getBuidlingId(), "", indoorBuilding.getBuildingName(), new LatLng(indoorBuilding.getBuildingLatLng().latitude, indoorBuilding.getBuildingLatLng().longitude), arrayList, indoorBuilding.getActiveLevelIndex());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "9cc376c00d7059faf38a1d5d1a42470a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "9cc376c00d7059faf38a1d5d1a42470a")).booleanValue();
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static GroundOverlayOptions a(com.sankuai.meituan.mapsdk.maps.model.GroundOverlayOptions groundOverlayOptions) {
        Object[] objArr = {groundOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e24b8a7429b5a431634adc3d1ae288f", RobustBitConfig.DEFAULT_VALUE)) {
            return (GroundOverlayOptions) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e24b8a7429b5a431634adc3d1ae288f");
        }
        if (groundOverlayOptions == null) {
            return null;
        }
        try {
            GroundOverlayOptions groundOverlayOptions2 = new GroundOverlayOptions();
            if (groundOverlayOptions.getImage() != null) {
                groundOverlayOptions2.bitmap(BitmapDescriptorFactory.fromBitmap(groundOverlayOptions.getImage().getBitmap()));
            }
            groundOverlayOptions2.anchor(groundOverlayOptions.getAnchorX(), groundOverlayOptions.getAnchorY());
            if (groundOverlayOptions.getPosition() != null) {
                groundOverlayOptions2.position(a(groundOverlayOptions.getPosition()));
            } else if (groundOverlayOptions.getBounds() != null) {
                groundOverlayOptions2.latLngBounds(a(groundOverlayOptions.getBounds()));
            }
            groundOverlayOptions2.alpha(1.0f - groundOverlayOptions.getTransparency());
            groundOverlayOptions2.zIndex((int) groundOverlayOptions.getZIndex());
            groundOverlayOptions2.level(groundOverlayOptions.getLevel());
            groundOverlayOptions2.visible(groundOverlayOptions.isVisible());
            return groundOverlayOptions2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static GradientVectorOverlayProvider a(HeatOverlayOptions heatOverlayOptions) {
        Object[] objArr = {heatOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5dc2d935859f47ff00c7fe6163dff2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (GradientVectorOverlayProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5dc2d935859f47ff00c7fe6163dff2f");
        }
        if (heatOverlayOptions == null) {
            return null;
        }
        try {
            GradientVectorOverlayProvider gradientVectorOverlayProvider = new GradientVectorOverlayProvider();
            gradientVectorOverlayProvider.setIntensityRange(0.0f, 1.0f);
            if (heatOverlayOptions.getData() != null) {
                gradientVectorOverlayProvider.data((List) a(heatOverlayOptions.getData()));
            }
            if (heatOverlayOptions.getWeightedData() != null) {
                gradientVectorOverlayProvider.weightedData(a(heatOverlayOptions.getWeightedData(), gradientVectorOverlayProvider));
            }
            gradientVectorOverlayProvider.opacity(Math.min(1.0f, Math.max(heatOverlayOptions.getAlpha(), 0.0f)));
            gradientVectorOverlayProvider.visibility(heatOverlayOptions.isVisible());
            gradientVectorOverlayProvider.radius(heatOverlayOptions.getRadius());
            gradientVectorOverlayProvider.zIndex((int) heatOverlayOptions.getZIndex());
            gradientVectorOverlayProvider.displayLevel(heatOverlayOptions.getLevel());
            gradientVectorOverlayProvider.gradient(heatOverlayOptions.getColors(), heatOverlayOptions.getStartPoints());
            gradientVectorOverlayProvider.zoomRange(heatOverlayOptions.getMinZoom(), heatOverlayOptions.getMaxZoom());
            return gradientVectorOverlayProvider;
        } catch (Exception e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a(e);
            return null;
        }
    }

    private static List<com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> a(@NonNull List<com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng> list, @NonNull GradientVectorOverlayProvider gradientVectorOverlayProvider) {
        Object[] objArr = {list, gradientVectorOverlayProvider};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de61f1e3519c6cabc659f808c979466b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de61f1e3519c6cabc659f808c979466b");
        }
        if (a(list)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            float f = 0.0f;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (list.get(i2).intensity > 0.0d) {
                    f = (float) (f + list.get(i2).intensity);
                    i++;
                }
            }
            float f2 = f / i;
            float f3 = 0.5f;
            if (f2 >= 0.5f) {
                f3 = f2;
            }
            float f4 = f3 * 2.0f;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3).intensity /= f4;
                arrayList.add(b(list.get(i3)));
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static TileOverlayOptions a(HeatOverlayOptions heatOverlayOptions, TencentMap tencentMap) {
        Object[] objArr = {heatOverlayOptions, tencentMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da72730e5cab60cd85279a19ba050682", RobustBitConfig.DEFAULT_VALUE)) {
            return (TileOverlayOptions) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da72730e5cab60cd85279a19ba050682");
        }
        if (heatOverlayOptions == null) {
            return null;
        }
        try {
            Gradient gradient = new Gradient(heatOverlayOptions.getColors(), heatOverlayOptions.getStartPoints());
            TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
            HeatMapTileProvider.Builder builder = new HeatMapTileProvider.Builder();
            if (heatOverlayOptions.getData() != null) {
                builder.data(a(heatOverlayOptions.getData()));
            }
            if (heatOverlayOptions.getWeightedData() != null) {
                builder.weightedData(b((Collection<com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng>) heatOverlayOptions.getWeightedData()));
            }
            builder.radius(heatOverlayOptions.getRadius()).gradient(gradient);
            builder.opacity(Math.min(1.0f, Math.max(heatOverlayOptions.getAlpha(), 0.0f)));
            tileOverlayOptions.tileProvider(builder.build(tencentMap));
            return tileOverlayOptions;
        } catch (Exception e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a(e);
            return null;
        }
    }

    public static HoneyCombVectorOverlayProvider a(HoneyCombOverlayOptions honeyCombOverlayOptions) {
        Object[] objArr = {honeyCombOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "218e965108a3f5c84a1300fa3825a5b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombVectorOverlayProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "218e965108a3f5c84a1300fa3825a5b3");
        }
        if (honeyCombOverlayOptions == null) {
            return null;
        }
        try {
            HoneyCombVectorOverlayProvider honeyCombVectorOverlayProvider = new HoneyCombVectorOverlayProvider();
            if (honeyCombOverlayOptions.getNodes() != null) {
                honeyCombVectorOverlayProvider.nodes((com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[]) b((List<com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng>) Arrays.asList(honeyCombOverlayOptions.getNodes())).toArray(new com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[honeyCombOverlayOptions.getNodes().length]));
            }
            honeyCombVectorOverlayProvider.opacity(Math.min(1.0f, Math.max(honeyCombOverlayOptions.getAlpha(), 0.0f)));
            honeyCombVectorOverlayProvider.visibility(honeyCombOverlayOptions.isVisibility());
            honeyCombVectorOverlayProvider.zIndex(honeyCombOverlayOptions.getZIndex());
            honeyCombVectorOverlayProvider.displayLevel(honeyCombOverlayOptions.getDisplayLevel());
            honeyCombVectorOverlayProvider.zoomRange(honeyCombOverlayOptions.getMinZoom(), honeyCombOverlayOptions.getMaxZoom());
            honeyCombVectorOverlayProvider.colors(honeyCombOverlayOptions.getColors(), honeyCombOverlayOptions.getStartPoints());
            honeyCombVectorOverlayProvider.size(honeyCombOverlayOptions.getSize());
            honeyCombVectorOverlayProvider.gap(honeyCombOverlayOptions.getGap());
            honeyCombVectorOverlayProvider.setIntensityRange(honeyCombOverlayOptions.getMinIntensity(), honeyCombOverlayOptions.getMaxIntensity());
            return honeyCombVectorOverlayProvider;
        } catch (Exception e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a(e);
            return null;
        }
    }

    private static List<com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> b(@NonNull List<com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf0fb793c3d29e208edbdd2699b61d07", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf0fb793c3d29e208edbdd2699b61d07");
        }
        if (a(list)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng weightedLatLng : list) {
                arrayList.add(b(weightedLatLng));
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng b(@NonNull com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng weightedLatLng) {
        Object[] objArr = {weightedLatLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "418ceff808205609f5bd994e0463b78a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "418ceff808205609f5bd994e0463b78a");
        }
        if (weightedLatLng == null) {
            return null;
        }
        try {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng(a(weightedLatLng.latLng), weightedLatLng.intensity);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
