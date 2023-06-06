package com.meituan.metrics;

import android.text.TextUtils;
import android.util.Pair;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.kitefly.Log;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsImageMonitor {
    private static final String KEY_BITMAP_FORMAT = "bitmap_format";
    private static final String KEY_BITMAP_HEIGHT = "bitmap_height";
    private static final String KEY_BITMAP_WIDTH = "bitmap_width";
    private static final String KEY_IS_BIG = "is_big";
    private static final String KEY_NET_BYTES = "net_bytes";
    private static final String KEY_NET_FORMAT = "net_format";
    private static final String KEY_NET_HEIGHT = "net_height";
    private static final String KEY_NET_WIDTH = "net_width";
    private static final String KEY_PAGE_NAME = "page_name";
    private static final String KEY_PIXEL = "isBigPixel";
    private static final String KEY_SIZE = "isBigSize";
    private static final String KEY_SOURCE = "source";
    private static final String KEY_URL = "url";
    private static final String KEY_VIEW_HEIGHT = "view_height";
    private static final String KEY_VIEW_WIDTH = "view_width";
    private static final String REPORT_CHANNEL_IMAGE = "metrics-picture";
    private static final String TAG_IMAGE_BIG = "metrics_image_big_v2";
    private static final String TAG_IMAGE_NORMAL = "metrics_image_normal_v2";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile MetricsImageMonitor instance;
    private final ExecutorService executorService;
    private volatile boolean isConfig;
    private static final List<String> necessaryKeyToStringValueList = new ArrayList();
    private static final List<String> necessaryKeyToIntegerValueList = new ArrayList();
    private static volatile double rate_sample_big = 0.0d;
    private static volatile double rate_sample_normal = 0.0d;
    private static int threshold_picture_big_size = 3145728;
    private static int threshold_picture_big_pixel = 3000000;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ImageBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long bitmapPixel;
        public boolean isBigImage;
        public boolean isBigPixel;
        public boolean isBigSize;
    }

    public MetricsImageMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b081e619aea04d9259b77449e3c6f401", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b081e619aea04d9259b77449e3c6f401");
            return;
        }
        this.isConfig = false;
        this.executorService = c.a("metrics_image_monitor");
        necessaryKeyToStringValueList.clear();
        necessaryKeyToStringValueList.add("url");
        necessaryKeyToStringValueList.add(KEY_NET_FORMAT);
        necessaryKeyToStringValueList.add(KEY_BITMAP_FORMAT);
        necessaryKeyToIntegerValueList.clear();
        necessaryKeyToIntegerValueList.add(KEY_NET_BYTES);
        necessaryKeyToIntegerValueList.add(KEY_NET_WIDTH);
        necessaryKeyToIntegerValueList.add(KEY_NET_HEIGHT);
        necessaryKeyToIntegerValueList.add(KEY_BITMAP_WIDTH);
        necessaryKeyToIntegerValueList.add(KEY_BITMAP_HEIGHT);
        necessaryKeyToIntegerValueList.add(KEY_VIEW_WIDTH);
        necessaryKeyToIntegerValueList.add(KEY_VIEW_HEIGHT);
        Horn.register("metrics_picture", new HornCallback() { // from class: com.meituan.metrics.MetricsImageMonitor.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d094e5fc7b70be636f46f00701778790", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d094e5fc7b70be636f46f00701778790");
                } else if (z) {
                    MetricsImageMonitor.this.setHornConfig(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHornConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "748e4eb58db39a4dc3a09e03f810a9a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "748e4eb58db39a4dc3a09e03f810a9a0");
            return;
        }
        this.isConfig = true;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            rate_sample_big = jSONObject.optDouble("big_sample_v2", 0.0d);
            rate_sample_normal = jSONObject.optDouble("detail_sample_v2", 0.0d);
            threshold_picture_big_size = jSONObject.optInt("threshold_picture_size_big", 3145728);
            threshold_picture_big_pixel = jSONObject.optInt("threshold_picture_pixel_big", 3000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MetricsImageMonitor getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e455d5b00f7048062fb8bd98d20887fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsImageMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e455d5b00f7048062fb8bd98d20887fd");
        }
        if (instance == null) {
            synchronized (MetricsImageMonitor.class) {
                if (instance == null) {
                    instance = new MetricsImageMonitor();
                }
            }
        }
        return instance;
    }

    public void reportImageMap(final Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6efa4a7ab53049a4dc472ceb884cdfbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6efa4a7ab53049a4dc472ceb884cdfbe");
        } else if (map == null || map.isEmpty()) {
        } else {
            if (this.isConfig && rate_sample_big == 0.0d && rate_sample_normal == 0.0d) {
                return;
            }
            this.executorService.execute(new Runnable() { // from class: com.meituan.metrics.MetricsImageMonitor.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2025c5c68484275410b9e7f665827dcf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2025c5c68484275410b9e7f665827dcf");
                        return;
                    }
                    if (!MetricsImageMonitor.this.isConfig) {
                        MetricsImageMonitor.this.setHornConfig(Horn.accessCache("metrics_picture"));
                    }
                    if (MetricsImageMonitor.rate_sample_big == 0.0d && MetricsImageMonitor.rate_sample_normal == 0.0d) {
                        return;
                    }
                    MetricsImageMonitor.this.reportImageJsonInner(map);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportImageJsonInner(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cc8c96bad29fb181e394d4e144cea30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cc8c96bad29fb181e394d4e144cea30");
        } else if (judgeMapLegal(map)) {
            ImageBean judgeBigPicture = judgeBigPicture(map);
            Pair<Boolean, Boolean> judgeNeedReport = judgeNeedReport(judgeBigPicture.isBigImage);
            if (((Boolean) judgeNeedReport.first).booleanValue() || ((Boolean) judgeNeedReport.second).booleanValue()) {
                map.put("source", "native");
                map.put(KEY_SIZE, Boolean.valueOf(judgeBigPicture.isBigSize));
                map.put(KEY_PIXEL, Boolean.valueOf(judgeBigPicture.isBigPixel));
                map.put(KEY_IS_BIG, Boolean.valueOf(judgeBigPicture.isBigImage));
                if (!map.containsKey(KEY_PAGE_NAME) || TextUtils.isEmpty((String) map.get(KEY_PAGE_NAME))) {
                    map.put(KEY_PAGE_NAME, MetricsActivityLifecycleManager.currentActivity);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, map.get(KEY_NET_BYTES));
                    jSONObject.put("pixel", judgeBigPicture.bitmapPixel);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Log.Builder reportChannel = new Log.Builder("picture").optional(map).lv4LocalStatus(true).details(jSONObject.toString()).reportChannel(REPORT_CHANNEL_IMAGE);
                if (((Boolean) judgeNeedReport.first).booleanValue()) {
                    reportChannel.tag(TAG_IMAGE_BIG);
                    Babel.log(reportChannel.build());
                }
                if (((Boolean) judgeNeedReport.second).booleanValue()) {
                    reportChannel.tag(TAG_IMAGE_NORMAL);
                    Babel.log(reportChannel.build());
                }
            }
        }
    }

    private static Pair<Boolean, Boolean> judgeNeedReport(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b45787fbc8299d361bdbf1d0e2468d33", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b45787fbc8299d361bdbf1d0e2468d33");
        }
        double random = Math.random();
        return new Pair<>(Boolean.valueOf(z && rate_sample_big >= random), Boolean.valueOf(rate_sample_normal >= random));
    }

    private static ImageBean judgeBigPicture(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9386289df6b8274e3c6870da72eeebba", RobustBitConfig.DEFAULT_VALUE)) {
            return (ImageBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9386289df6b8274e3c6870da72eeebba");
        }
        ImageBean imageBean = new ImageBean();
        int intValue = ((Integer) map.get(KEY_NET_BYTES)).intValue();
        imageBean.bitmapPixel = ((Integer) map.get(KEY_BITMAP_HEIGHT)).intValue() * ((Integer) map.get(KEY_BITMAP_WIDTH)).intValue();
        if (imageBean.bitmapPixel >= threshold_picture_big_pixel) {
            imageBean.isBigImage = true;
            imageBean.isBigPixel = true;
        }
        if (intValue >= threshold_picture_big_size) {
            imageBean.isBigImage = true;
            imageBean.isBigSize = true;
        }
        return imageBean;
    }

    private static boolean judgeMapLegal(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "231b5109d2138e9dca4b935ee9058970", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "231b5109d2138e9dca4b935ee9058970")).booleanValue();
        }
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (int i = 0; i < necessaryKeyToStringValueList.size(); i++) {
            String str = necessaryKeyToStringValueList.get(i);
            if (!(map.get(str) instanceof String)) {
                if (Metrics.debug) {
                    throw new RuntimeException("Metrics Image Report lack of " + str);
                }
                return false;
            }
        }
        for (int i2 = 0; i2 < necessaryKeyToIntegerValueList.size(); i2++) {
            String str2 = necessaryKeyToIntegerValueList.get(i2);
            if (!(map.get(str2) instanceof Integer)) {
                if (Metrics.debug) {
                    throw new RuntimeException("Metrics Image Report lack of " + str2);
                }
                return false;
            }
        }
        return true;
    }
}
