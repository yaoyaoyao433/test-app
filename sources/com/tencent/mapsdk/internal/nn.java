package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.map.lib.models.ScatterPlotInfo;
import com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class nn extends ScatterPlotInfo implements mr {
    ScatterPlotOverlayProvider a;

    public nn(Context context, ScatterPlotOverlayProvider scatterPlotOverlayProvider) {
        this.a = scatterPlotOverlayProvider;
        ArrayList arrayList = new ArrayList();
        arrayList.add(scatterPlotOverlayProvider.getData());
        setDataList(arrayList);
        this.visible = scatterPlotOverlayProvider.isVisibility();
        this.opacity = scatterPlotOverlayProvider.getOpacity();
        this.maxZoom = scatterPlotOverlayProvider.getMaxZoom();
        this.minZoom = scatterPlotOverlayProvider.getMinZoom();
        this.draw3D = scatterPlotOverlayProvider.isEnable3D();
        this.level = scatterPlotOverlayProvider.getDisplayLevel();
        this.mType = scatterPlotOverlayProvider.getType();
        this.zIndex = scatterPlotOverlayProvider.getZIndex();
        if (scatterPlotOverlayProvider instanceof DotScatterPlotOverlayProvider) {
            DotScatterPlotOverlayProvider dotScatterPlotOverlayProvider = (DotScatterPlotOverlayProvider) scatterPlotOverlayProvider;
            this.radius = dotScatterPlotOverlayProvider.getRadius();
            this.colors = dotScatterPlotOverlayProvider.getColors();
            this.mAnimate = dotScatterPlotOverlayProvider.isAnimate();
        } else if (scatterPlotOverlayProvider instanceof BitmapScatterPlotOverlayProvider) {
            BitmapScatterPlotOverlayProvider bitmapScatterPlotOverlayProvider = (BitmapScatterPlotOverlayProvider) scatterPlotOverlayProvider;
            this.mBitmapWidth = bitmapScatterPlotOverlayProvider.getWidth();
            this.mBitmapHeight = bitmapScatterPlotOverlayProvider.getHeight();
            if (bitmapScatterPlotOverlayProvider.getBitmaps() == null || bitmapScatterPlotOverlayProvider.getBitmaps().length <= 0) {
                return;
            }
            this.mBitmaps = new Bitmap[bitmapScatterPlotOverlayProvider.getBitmaps().length];
            for (int i = 0; i < bitmapScatterPlotOverlayProvider.getBitmaps().length; i++) {
                BitmapDescriptor bitmapDescriptor = bitmapScatterPlotOverlayProvider.getBitmaps()[i];
                if (bitmapDescriptor != null) {
                    Bitmap bitmap = bitmapDescriptor.getBitmap(context);
                    if (bitmap != null && (this.mBitmapWidth != bitmap.getWidth() || this.mBitmapHeight != bitmap.getHeight())) {
                        int i2 = this.mBitmapWidth;
                        int i3 = this.mBitmapHeight;
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        Matrix matrix = new Matrix();
                        matrix.postScale(i2 / width, i3 / height);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    }
                    this.mBitmaps[i] = bitmap;
                } else {
                    this.mBitmaps[i] = null;
                }
            }
        }
    }

    private static Bitmap a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    private ScatterPlotOverlayProvider a() {
        return this.a;
    }
}
