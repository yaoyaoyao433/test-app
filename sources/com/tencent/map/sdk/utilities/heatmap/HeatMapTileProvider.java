package com.tencent.map.sdk.utilities.heatmap;

import android.graphics.Color;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.TileProvider;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class HeatMapTileProvider implements TileProvider {
    public static final double DEFAULT_OPACITY = 0.6d;
    public static final int DEFAULT_RADIUS = 40;
    private static final int MAX_RADIUS = 50;
    private static final int MIN_RADIUS = 10;
    static final double WORLD_WIDTH = 1.0d;
    private static final int[] DEFAULT_GRADIENT_COLORS = {Color.argb(0, 25, 0, 255), Color.argb((int) TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE, 30, 0, 255), Color.rgb(0, 191, 255), Color.rgb(0, 255, 0), Color.rgb(255, 255, 0), Color.rgb(255, 0, 0)};
    private static final float[] DEFAULT_GRADIENT_START_POINTS = {0.0f, 0.4f, 0.6f, 0.75f, 0.8f, 1.0f};
    public static final Gradient DEFAULT_GRADIENT = new Gradient(DEFAULT_GRADIENT_COLORS, DEFAULT_GRADIENT_START_POINTS);

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface HeatTileGenerator {
        int[] generateColorMap(double d);

        double[] generateKernel(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnHeatMapReadyListener {
        void onHeatMapReady();
    }

    public abstract void setData(Collection<LatLng> collection);

    public abstract void setGradient(Gradient gradient);

    public abstract void setHeatTileGenerator(HeatTileGenerator heatTileGenerator);

    public abstract void setOpacity(double d);

    public abstract void setRadius(int i);

    public abstract <T extends com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> void setWeightedData(Collection<T> collection);

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class Builder {
        private Collection<WeightedLatLng> data;
        private HeatTileGenerator heatTileGenerator;
        private OnHeatMapReadyListener readyListener;
        private int radius = 40;
        private Gradient gradient = HeatMapTileProvider.DEFAULT_GRADIENT;
        private double opacity = 0.6d;

        public Builder data(Collection<LatLng> collection) {
            return weightedData(HeatMapTileProvider.wrapData(collection));
        }

        public <T extends com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> Builder weightedData(Collection<T> collection) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("No input points.");
            }
            ArrayList arrayList = new ArrayList();
            for (T t : collection) {
                arrayList.add(new WeightedLatLng(t.getPoint(), t.getIntensity()));
            }
            this.data = arrayList;
            return this;
        }

        public Builder gradient(Gradient gradient) {
            this.gradient = gradient;
            return this;
        }

        public Builder opacity(double d) {
            if (d < 0.0d || d > 1.0d) {
                throw new IllegalArgumentException("Opacity must be in range [0, 1]");
            }
            this.opacity = d;
            return this;
        }

        public Builder radius(int i) {
            if (i < 10 || i > 50) {
                throw new IllegalArgumentException("Radius not within bounds.");
            }
            this.radius = i;
            return this;
        }

        public Builder tileGenerator(HeatTileGenerator heatTileGenerator) {
            this.heatTileGenerator = heatTileGenerator;
            return this;
        }

        public Builder readyListener(OnHeatMapReadyListener onHeatMapReadyListener) {
            this.readyListener = onHeatMapReadyListener;
            return this;
        }

        public Collection<WeightedLatLng> getData() {
            return this.data;
        }

        public int getRadius() {
            return this.radius;
        }

        public Gradient getGradient() {
            return this.gradient;
        }

        public double getOpacity() {
            return this.opacity;
        }

        public HeatTileGenerator getHeatTileGenerator() {
            return this.heatTileGenerator;
        }

        public OnHeatMapReadyListener getReadyListener() {
            return this.readyListener;
        }

        public HeatMapTileProvider build(TencentMap tencentMap) {
            if (tencentMap != null) {
                return tencentMap.getMapContext().createHeatMapTileProvider(this);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection<WeightedLatLng> wrapData(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : collection) {
            arrayList.add(new WeightedLatLng(latLng));
        }
        return arrayList;
    }
}
